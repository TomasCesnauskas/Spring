package com.springdemo.controller;

import com.springdemo.dao.CustomerDAO;
import com.springdemo.entity.Customer;
import com.springdemo.service.CustomerService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {


    //    need inject our customerService
    @Autowired
    private CustomerService customerService;

    @GetMapping("/list")
    public String listCustomers(Model model) {

//        get customers from servise
        List<Customer> customers = customerService.getCustomers();

//  add customers
        model.addAttribute("customers", customers);


        return "list-customers";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {

//        create model attribute to bind for data
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "customer-form";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {

//        save customer using service
        customerService.saveCustomer(customer);

        return "redirect:/customer/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam ("customerId")int id, Model model){

//        get customer from database
        Customer customer = customerService.getCustomer(id);

//        set customer as model attribute to prepopulate form
        model.addAttribute("customer", customer);

//        send over to our form
        return "customer-form";
    }
    @GetMapping("/deleteCustomer")
    public String delete(@RequestParam ("customerId")int id){

         customerService.deleteCustomer(id);
        return "redirect:/customer/list";
    }
}
