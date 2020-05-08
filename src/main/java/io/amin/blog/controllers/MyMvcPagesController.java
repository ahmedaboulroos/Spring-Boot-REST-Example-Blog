package io.amin.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyMvcPagesController {

    @GetMapping("/")
    public String getHomePage() {
        return "HomePage";
    }

    @GetMapping("/products")
    public String getProductsPage() {
        return "ProductsPage";
    }

    @GetMapping("/error")
    public String getErrorPage() {
        return "ErrorPage";
    }

    @GetMapping("/signup")
    public String getSignupPage() {
        return "SignupPage";
    }


    @GetMapping("/user/profile")
    public String getProfilePage() {
        return "ProfilePage";
    }

    @GetMapping("/admin/dashboard")
    public String getDashboardPage() {
        return "DashboardPage";
    }

}