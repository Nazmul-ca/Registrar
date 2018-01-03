/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Name_Model;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author nazmul
 */
public class Htm_controller {
    /* Both of the following methods are necessary on any form contained page
    http://www.codejava.net/frameworks/spring/spring-mvc-form-handling-tutorial-and-example
    https://www.tutorialspoint.com/spring/spring_mvc_form_handling_example.htm
    explanation https://www.javacodebook.com/2013/08/20/post-redirect-get-pattern-in-spring-mvc/
    */
    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String viewHome_2(Map<String, Object> obj){
        Name_Model user = new Name_Model();
        obj.put("userForm", user);
        
        List<String> professionList = new ArrayList<>();
        professionList.add("J. Petersen");
        professionList.add("D. Devid");
        professionList.add("I. Nazmul");
        obj.put("userList", professionList);
        
        return "login";
    }
    @RequestMapping(value="/display", method = RequestMethod.POST)
    public String processRegistration(@ModelAttribute("userForm") Name_Model user,
            ModelMap model) {
        model.addAttribute("name", user.getUsername());
        model.addAttribute("prof", user.getPassword());
     
        return "display";
    }
    
    
    @RequestMapping(value="/index3", method = RequestMethod.GET)
    public String viewHome_3(){
        return "index3";
    }
}
