package ua.foxmind.retail.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;
import ua.foxmind.retail.model.Item;
import ua.foxmind.retail.repositories.ItemRepository;

import java.util.List;
import java.util.Map;


@Controller
public class ItemController {

    @Autowired
    private
    ItemRepository itemRepository;

    @RequestMapping("/items")
    public String itemsList(Map<String, Object> model) {
        List<Item> allItems = itemRepository.findAll();
        model.put("items", allItems);
        return "items";
    }

    @RequestMapping("/addItem")
    public String getAdd(Model model) {
        model.addAttribute("item", new Item());
        return "items-add";
    }

    @PostMapping("/addItem")
    public RedirectView greetingSubmit(@ModelAttribute Item item) {
        itemRepository.save(item);
        return new RedirectView("/items");
    }


}
