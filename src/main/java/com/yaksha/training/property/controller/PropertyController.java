package com.yaksha.training.property.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yaksha.training.property.entity.Property;

@Controller
@RequestMapping(value = { "/property", "/" })
public class PropertyController {

	@RequestMapping(value = { "/list", "/" })
	public String listProperties(Model theModel) {
		return "";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		return "";
	}

	@PostMapping("/saveProperty")
	public String saveProperty(@Valid @ModelAttribute("property") Property theProperty, BindingResult bindingResult,
			Model theModel) {
		return "";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("propertyId") Long propertyId, Model theModel) {
		return "";
	}

	@GetMapping("/showFormForDelete")
	public String showFormForDelete(@RequestParam("propertyId") Long propertyId, Model theModel) {
		return "";
	}
}
