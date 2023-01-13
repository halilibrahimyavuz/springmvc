package com.tpe.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller                     //Bu clas bır controller clası oldugunu bıldııryoruz
@RequestMapping("/students")    // http;//127.0.0.1;8080/students/ yanı bununla gelenlerın hepsını bu controller ılgılensın
public class StudentController {

    @GetMapping ("/hi")   //students//hi ile GET Http methoduyla gelıyorsa bu methoda gırer
    public ModelAndView sayHİ(){
        ModelAndView mav=new ModelAndView();
        mav.addObject("message","Merhaba");
        mav.addObject("messagebody","Ben bir Ögrenci Yönetim Paneliyim");

        mav.setViewName("hi");    //hi.jsp   view kısmının hangı sayfa olduugnu belırtıyoruz
        return mav;
    }




}
