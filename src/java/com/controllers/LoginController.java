package com.controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.service.LoginServInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author zakhar
 */
@Controller
public class LoginController {

    @Autowired
    LoginServInter ls;

    @RequestMapping("/jokes")
    public String showJokes() {
        
        return "jokes_page";
    }

    
    @RequestMapping("/")
    public String homasde() {
        System.out.println("SDAAAAAAAAAAAAAAA");

        return "index";
    }

    @RequestMapping("/login")
    public String logIn(@RequestParam("inname") String name, @RequestParam("inpass") String pass, Model model) {

        String hibVer = org.hibernate.Version.getVersionString();
        String springVer = SpringVersion.getVersion();
        model.addAttribute("hibVer", hibVer);
        model.addAttribute("springVer", springVer);
        if (ls.checkIfLoged(name, pass)) {
            return "postlog";
        }
        return "index";
    }

}
