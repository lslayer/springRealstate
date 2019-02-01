package ua.foxmind.retail.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;
import ua.foxmind.retail.model.Customer;
import ua.foxmind.retail.repositories.CustomerRepository;


import java.util.List;
import java.util.Map;


@Controller
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @RequestMapping("/customer")
    public String itemsList(Map<String, Object> model) {
        List<Customer> allItems = customerRepository.findAll();
        model.put("customers", allItems);
        return "customer";
    }

    @RequestMapping("/addCustomer")
    public String getAdd(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer-add";
    }

    @PostMapping("/addCustomer")
    public RedirectView greetingSubmit(@ModelAttribute Customer customer) {
        customerRepository.save(customer);
        return new RedirectView("/customer");
    }


}
