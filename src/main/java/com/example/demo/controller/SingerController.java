package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.entity.Singer;
import com.example.demo.repository.SingerRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.stereotype.Controller;

@Controller
public class SingerController {

    @Autowired
    private SingerRepository sRepo;

    @GetMapping("/sign_up")
    public String showSignUpForm(Singer singer) {
        return "add-singer";
    }

    @GetMapping("/index")
    public String showUserList(Model model) {
        model.addAttribute("singers", sRepo.findAll());
        return "index";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Singer singer = sRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));

        model.addAttribute("singer", singer);
        return "update-singer";
    }

    @PostMapping("/add_singer")
    public String addUser(Singer singer, Model model) {
        sRepo.save(singer);
        return "redirect:/index";
    }

    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable("id") long id, Singer singer) {
        sRepo.save(singer);
        return "redirect:/index";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id) {
        Singer singer = sRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        sRepo.delete(singer);
        return "redirect:/index";
    }
}
