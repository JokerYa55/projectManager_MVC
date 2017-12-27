/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.projectmanager_mvc.controlers;

import org.springframework.web.servlet.ModelAndView;
import ru.projectmanager_mvc.beans.User;

/**
 *
 * @author vasiliy.andricov
 */
public class mainController {

    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userJSP", new User(new Long(1), "Test"));
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
