package com.example.bookkidwebsite.Controller;

import com.example.bookkidwebsite.Entity.Customer;
import com.example.bookkidwebsite.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class Login_RegisterController {
    @Autowired
    private CustomerRepository customerRepository;


    @GetMapping("/registration_page")
    public String viewRegistrationPage(Model model) {
        model.addAttribute("customer", new Customer());
        return "Login_RegisterPage/registration";
    }

    @GetMapping("/login_page")
    public String viewLoginPage(Model model) {
        model.addAttribute("customer", new Customer());
        return "Login_RegisterPage/login";
    }

    @PostMapping("/registration_page")
    public String processRegister(Customer customer) {
        if (customer.getCustomerPassword().equals(customer.getCustomerConfirmPassword())) {
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            String encodePassword = encoder.encode(customer.getCustomerPassword());
            customer.setCustomerPassword(encodePassword);
            customerRepository.save(customer);
            return "Login_RegisterPage/login";
        }
        return "Login_RegisterPage/registration";

    }

    @PostMapping("/login_page")
    public String loginPage(Customer customer, Model model) {
        Customer checkCustomer = customerRepository.findByEmail(customer.getCustomerEmail());
        if (checkCustomer != null) {
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            if (encoder.matches(customer.getCustomerPassword(), checkCustomer.getCustomerPassword()))
                return "/HomePage/index-customer";
            model.addAttribute("validate", "success");
        }
        return "Login_RegisterPage/login";
    }


}
