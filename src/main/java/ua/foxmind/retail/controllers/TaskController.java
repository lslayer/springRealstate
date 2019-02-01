package ua.foxmind.retail.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;
import ua.foxmind.retail.model.Item;
import ua.foxmind.retail.model.Task;
import ua.foxmind.retail.repositories.ItemRepository;
import ua.foxmind.retail.repositories.TaskRepository;

import java.util.List;
import java.util.Map;


@Controller
public class TaskController {

    @Autowired
    TaskRepository taskRepository;

    @RequestMapping("/task")
    public String tasklist(Map<String, Object> model) {
        List<Task> allTasks = taskRepository.findAll();
        model.put("tasks", allTasks);
        return "task";
    }

    @RequestMapping("/addTask")
    public String getAdd(Model model) {
        model.addAttribute("task", new Task());
        return "task-add";
    }

    @PostMapping("/addTask")
    public RedirectView greetingSubmit(@ModelAttribute Task task) {
        taskRepository.save(task);
        return new RedirectView("/task");
    }



}
