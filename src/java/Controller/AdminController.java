/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Admin;
import Implement.AdminImplement;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Feryprass
 */
@Controller
public class AdminController {

    @RequestMapping(value = "TampilAllAdmin.htm")
    public String getAllAdmin(ModelMap modelMap) {
        AdminImplement ai = new AdminImplement();
        List<Admin> la = ai.getAll();
        modelMap.put("list", la);
        return "Admin";
    }

    @RequestMapping(value = "FrmTambahAdmin.htm")
    public String FrmTambahAdmin(ModelMap modelMap) {
        return "FrmTambahAdmin";
    }

    @RequestMapping(value = "ProsesTambahAdmin.htm")
    public void ProsesTambahAdmin(HttpServletResponse response, @ModelAttribute("Admin") Admin j) throws IOException {
        AdminImplement ai = new AdminImplement();
        ai.insert(j);
        response.sendRedirect("TampilAllAdmin.htm");
    }

    @RequestMapping(value = "FrmUpdateAdmin.htm", method = RequestMethod.GET)
    public String UpdateFormAdmin(ModelMap modelMap, @RequestParam(value = "id", required = false) int id) {
        AdminImplement ai = new AdminImplement();
        Admin a = ai.getByID(id);
        modelMap.put("a", a);
        return "FrmUpdateAdmin";
    }
    
    @RequestMapping(value = "ProsesUpdateAdmin.htm")
    public void ProsesUpdateAdmin(HttpServletResponse response, @ModelAttribute("Admin") Admin j) throws IOException {
        AdminImplement ai = new AdminImplement();
        ai.update(j);
        response.sendRedirect("TampilAllAdmin.htm");
    }
    
    @RequestMapping(value = "ProsesHapusAdmin.htm", method = RequestMethod.GET)
    public void ProsesHapusAdmin(HttpServletResponse response,@RequestParam(value = "id", required = false) int id) throws IOException {
        AdminImplement ai = new AdminImplement();
        Admin a = ai.getByID(id);
        ai.delete(a);
        response.sendRedirect("TampilAllAdmin.htm");
    }
}
