package com.DiegoG.JobApp.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.DiegoG.JobApp.models.Vaga;
import com.DiegoG.JobApp.repositories.VagaRepository;

import jakarta.validation.Valid;

@Controller
public class VagaController {

	@Autowired
	VagaRepository vr;

	@GetMapping("/cadastroVaga")
	public String cadastroVaga() {
		return "/cadastroVaga";
	}

	@PostMapping("/cadastroVaga")
	public String formVaga(@Valid Vaga vaga) {
		vr.save(vaga);
		return "redirect:/cadastroVaga";
		
	}
}
