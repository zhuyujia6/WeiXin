package com.yc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Htmlcontroller {
	
	@RequestMapping(value={"","/","index"})
    public String index() {
        return "index";
    }
}
