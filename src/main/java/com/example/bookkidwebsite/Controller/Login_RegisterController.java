package com.example.bookkidwebsite.Controller;

import com.example.bookkidwebsite.Entity.Customer;
import com.example.bookkidwebsite.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class Login_RegisterController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/login_register")
    public String viewLoginPage(Model model) {
        model.addAttribute("cutomer", new Customer());
        return "Login_RegisterPage/login_register";
    }

    @PostMapping("/process_register")
    public String processRegister(@Valid  Customer customer, Errors errors, Model model) {
        if(null!= errors && errors.getErrorCount()>0){
            return "Login_RegisterPage/test";
        }
        else {
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            String encodePassword = encoder.encode(customer.getCustomerPassword());
            customer.setCustomerPassword(encodePassword);
            customerRepository.save(customer);
            model.addAttribute("successMsg", "Sign up successfully!!");
            return "Login_RegisterPage/test";
        }
    }

    @PostMapping("/loginpage")
    public String loginPage(Customer customer) {
        Customer checkCustomer = customerRepository.findByEmail(customer.getCustomerEmail());
        if (checkCustomer != null) {
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            if (encoder.matches(customer.getCustomerPassword(), checkCustomer.getCustomerPassword()))
                return "/HomePage/index";
        }
        return "Login_RegisterPage/test";
    }
}
