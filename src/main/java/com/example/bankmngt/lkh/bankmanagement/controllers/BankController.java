package com.example.bankmngt.lkh.bankmanagement.controllers;

import com.example.bankmngt.lkh.bankmanagement.dao.model.Bank;
import com.example.bankmngt.lkh.bankmanagement.dto.BankDTO;
import com.example.bankmngt.lkh.bankmanagement.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpSession;
@Controller
public class BankController {
    @Autowired
    private BankService bankService;

    @GetMapping(value = "/")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
       // mav.setViewName("redirect:/"); //Redirect to home
        return mav;
    }
    @GetMapping(value = "/add")
    public ModelAndView add() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("add");
        mav.addObject("bank",new Bank());//object user binding data
        return mav;
    }
    @PostMapping(value = "/add-process")
    public ModelAndView addprocess(BankDTO bankDTO, HttpSession session){
        bankService.add(bankDTO);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("redirect:/add"); //Redirect to home
        return mav;
    }
}
