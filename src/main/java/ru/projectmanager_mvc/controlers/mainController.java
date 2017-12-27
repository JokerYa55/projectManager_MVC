/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.projectmanager_mvc.controlers;

import static javax.swing.text.StyleConstants.ModelAttribute;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.projectmanager_mvc.beans.User;

/**
 *
 * @author vasiliy.andricov
 */
public class mainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userJSP", new User(new Long(1), "Test"));
        modelAndView.setViewName("index");

        return modelAndView;
    }

    @RequestMapping(value = "/check-user")
    public ModelAndView checkUser(@ModelAttribute("userJSP") User user) {
        ModelAndView modelAndView = new ModelAndView();
        // имя представления, куда нужно будет перейти
        modelAndView.setViewName("secondPage");
        // записываем в атрибут userJSP (используется на странице *.jsp объект user
        modelAndView.addObject("userJSP", user);
        // после уйдем на представление, указанное чуть выше, если оно будет найдено.
        return modelAndView;
    }
}
