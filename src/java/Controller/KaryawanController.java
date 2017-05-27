/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Admin;
import Entity.Karyawan;
import Implement.AdminImplement;
import Implement.KaryawanImplement;
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
public class KaryawanController {

    @RequestMapping(value = "TampilAllKaryawan.htm")
    public String getAllKaryawan(ModelMap modelMap) {
        KaryawanImplement ki = new KaryawanImplement();
        List<Karyawan> la = ki.getAll();
        modelMap.put("list", la);
        return "Karyawan";
    }

    @RequestMapping(value = "FrmTambahKaryawan.htm")
    public String FrmTambahKaryawan(ModelMap modelMap) {
        return "FrmTambahKaryawan";
    }

    @RequestMapping(value = "ProsesTambahKaryawan.htm")
    public void ProsesTambahKaryawan(HttpServletResponse response, @ModelAttribute("Karyawan") Karyawan j) throws IOException {
        KaryawanImplement ai = new KaryawanImplement();
        ai.insert(j);
        response.sendRedirect("TampilAllKaryawan.htm");
    }

    @RequestMapping(value = "FrmUpdateKaryawan.htm", method = RequestMethod.GET)
    public String UpdateFormKaryawan(ModelMap modelMap, @RequestParam(value = "id", required = false) int id) {
        KaryawanImplement ai = new KaryawanImplement();
        Karyawan a = ai.getByID(id);
        modelMap.put("a", a);
        return "FrmUpdateKaryawan";
    }
    
    @RequestMapping(value = "ProsesUpdateKaryawan.htm")
    public void ProsesUpdateKaryawan(HttpServletResponse response, @ModelAttribute("Karyawan") Karyawan j) throws IOException {
        KaryawanImplement ai = new KaryawanImplement();
        ai.update(j);
        response.sendRedirect("TampilAllKaryawan.htm");
    }
    
    @RequestMapping(value = "ProsesHapusKaryawan.htm", method = RequestMethod.GET)
    public void ProsesHapusAdmin(HttpServletResponse response,@RequestParam(value = "id", required = false) int id) throws IOException {
        KaryawanImplement ai = new KaryawanImplement();
        Karyawan a = ai.getByID(id);
        ai.delete(a);
        response.sendRedirect("TampilAllKaryawan.htm");
    }
}
