package com.example.studentcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.studentcrud.model.Employee;
import com.example.studentcrud.service.DyamavvaEmployeeService;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/dyamavva")
public class DyamavvaEmployeeController {

    @Autowired
    private DyamavvaEmployeeService empService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("employee",empService.listAll() );
        return "employee/index"; 
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("employee", new Employee());
        return "employee/create";
    }

    @PostMapping("/save")
    public String saveemployee(@ModelAttribute Employee emp) {
        empService.saveemployee(emp);
        return "redirect:/dyamavva/list";
    }

    
    @GetMapping("/delete/{id}")
    public String deleteemployee(@PathVariable Long id) {
        empService.deleteemployee(id);
        return "redirect:/dyamavva/list";
    }
    @GetMapping("/edit/{id}")
    public String editemployee(@PathVariable Long id,Model model) {
        model .addAttribute("employee",empService.getemployee(id));
        return "employee/edit";
    }
   
    @PostMapping("/update/{id}")
    public String saveEmployee(@Pathvariable Long id, @ModelAttribute Employee emp) {
           emp.setId(id);
           empService.saveemployee(emp);
           return "redirect:/dyamavva/list"; 
        }
    }