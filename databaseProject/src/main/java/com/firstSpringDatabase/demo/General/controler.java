package com.firstSpringDatabase.demo.General;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controler {

    @Autowired
    private repoMysql repoMysqltru;

    @RequestMapping("/complain")
    public String userRegistrationPage(@ModelAttribute Submission submission ){

        repoMysqltru.save(submission);
        return "addComplaint";
    }

    @GetMapping("/open")
    public String open(Model model){
        System.out.println("hello");
        model.addAttribute("submissions", repoMysqltru.findAll());

        return "addComplaint";
    }

}
