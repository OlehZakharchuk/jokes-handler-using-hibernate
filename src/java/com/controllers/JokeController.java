/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controllers;

import com.dao.Joke;
import com.service.JokesServiseInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author zakhar
 */
@Controller
public class JokeController {
    @Autowired
    JokesServiseInter js;
    
    @RequestMapping("/showjoke")
    public String addJokesAsParam(Model model){
        Joke joke = js.getRandJoke();
        model.addAttribute("jokecontent", joke.getContent());
       // model.addAttribute("author", joke.getPerson().getLastname());
        return "jokes_page";
    }
}
