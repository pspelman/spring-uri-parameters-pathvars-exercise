package com.philspelman.springlearningplatformexercise.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AssignmentController {

    @RequestMapping("/assignment/{chapter}/0483/{assignmentNumber}")
    public String assignments(@PathVariable String chapter, @PathVariable String assignmentNumber, Model model) {
        System.out.println("reached assignment controller");

        model.addAttribute("chapter", chapter);
        model.addAttribute("assignmentNumber", assignmentNumber);
        Boolean checked = false;
        model.addAttribute("checked", checked);

        return "assignment";
    }
}
