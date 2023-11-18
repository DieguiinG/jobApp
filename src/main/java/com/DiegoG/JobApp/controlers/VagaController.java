package com.DiegoG.JobApp.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.DiegoG.JobApp.repositories.VagaRepository;

@Controller
public class VagaController {

	@Autowired
	VagaRepository vagaRepository;
	
	@GetMapping("/")
    public String index() {
        return "index";
    }
}
