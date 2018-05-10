package com.philspelman.springlearningplatformexercise.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
    @RequestMapping("/")
    public String index() {
        System.out.println("reached the index route...trying to send back index.jsp /");

        return "index";
    }

    @RequestMapping("/{part1}/dp/{productId}")
    public String showProduct(@PathVariable String part1, @PathVariable String productId){
        System.out.println("Part 1 was: " + part1);
        System.out.println("Part 2 was: " + productId);

        return "index";
    }


    @RequestMapping("/index")
    public String index(@ModelAttribute("errors") String errors) {
        System.out.println("errors string: " + errors);
        return "index";

    }

    @RequestMapping("/errors")
    public String errors(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("errors", "A test error has been added!!!");
        return "redirect:/index";
    }
}


