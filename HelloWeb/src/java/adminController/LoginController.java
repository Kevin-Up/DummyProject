/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminController;

import jdbc.Admin;
import jdbc.AdminJDBC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Kevin
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login() {
        return "/admin/login";
    }

    @RequestMapping(value = "/tologin", method = RequestMethod.POST)
    public String tologin(@ModelAttribute("student") Admin ad, ModelMap model) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("Beans.xml");

        AdminJDBC adminJDBC = (AdminJDBC) context.getBean("adminJDBC");
        Admin admin = adminJDBC.getAdmin(ad.getAccount());
        if (admin != null) {
            if (ad.getPassword().equals(admin.getPassword())) {
                return "index";
            } else {
                return "redirect:callPwdError";
            }
        } else {
            return "redirect:callAcError";
        }
    }

    @ResponseBody
    @RequestMapping(value = "/callPwdError", produces = "text/html; charset=UTF-8")
    public String callPwdError() throws Exception {
        return "<script>"
                + "parent.alert('The password is incorrect! Please try again');"
                + "history.back();"
                + "</script>";

    }
    
    @ResponseBody
    @RequestMapping(value = "/callAcError", produces = "text/html; charset=UTF-8")
    public String callAcError() throws Exception {
        return "<script>"
                + "parent.alert('The account is incorrect! Please try again');"
                + "history.back();"
                + "</script>";

    }

}
