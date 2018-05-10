package com.philspelman.springlearningplatformexercise.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LessonController {
    @RequestMapping("/lesson/{chapter}/0553/{lessonNumber}")
    public String lessons(Model model, @PathVariable String chapter, @PathVariable String lessonNumber) {
        System.out.printf("Req for:%n Chapter: %s %nLesson: %s", chapter, lessonNumber);

        model.addAttribute("chapter", chapter);
        model.addAttribute("lesson", lessonNumber);

        return "lesson";
    }
}