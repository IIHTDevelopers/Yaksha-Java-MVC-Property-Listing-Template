package com.yaksha.training.property.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yaksha.training.property.entity.Property;

import jakarta.validation.Valid;

@Controller
@RequestMapping(value = { "/property", "/" })
public class PropertyController {

	@RequestMapping(value = { "/list", "/" })
	public String listProperties(@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "max", required = false) Double max, @PageableDefault(size = 5) Pageable pageable,
			Model theModel) {
		// write your logic here
		return "";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		// write your logic here
		return "";
	}

	@PostMapping("/saveProperty")
	public String saveProperty(@Valid @ModelAttribute("property") Property theProperty, BindingResult bindingResult,
			Model theModel) {
		// write your logic here
		return "";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("propertyId") Long propertyId, Model theModel) {
		// write your logic here
		return "";

	}

	@GetMapping("/showFormForDelete")
	public String showFormForDelete(@RequestParam("propertyId") Long propertyId, Model theModel) {
		// write your logic here
		return "";
	}

	@RequestMapping("/search")
	public String searchProperty(@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "max", required = false) Double max, Model theModel, Pageable pageable) {
		// write your logic here
		return "";
	}

}
