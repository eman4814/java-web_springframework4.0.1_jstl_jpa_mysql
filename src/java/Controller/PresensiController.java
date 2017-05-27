/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Karyawan;
import Entity.Presensi;
import Implement.KaryawanImplement;
import Implement.PresensiImplement;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Feryprass
 */
@Controller
public class PresensiController {

    @RequestMapping(value = "PresensiToday.htm")
    public String getPresensiToday(ModelMap modelMap) {
        PresensiImplement pi = new PresensiImplement();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        Date tgl = Date.valueOf(sdf.format(cal.getTime()));
        List<Presensi> lp = pi.getByTgl(tgl);
        modelMap.put("listPresensiToday", lp);
        return "Presensi";
    }

    @RequestMapping(value = "ProsesTambahPresensi.htm")
    public void prosesInsertPresensi(HttpServletResponse response, @RequestParam(value = "nik", required = false) String nik) throws IOException {
        KaryawanImplement ki = new KaryawanImplement();
        PresensiImplement pi = new PresensiImplement();
        //get id Karyawan
        Karyawan k = ki.getByNIK(nik);
        //cek apakah sudah presensi masuk

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdt = new SimpleDateFormat("hh:mm:ss");
        Presensi p = new Presensi();
        Calendar cal = Calendar.getInstance();
        p.setIdKaryawan(k);
        p.setTgl(cal.getTime());
        p.setJamMasuk(cal.getTime());
        pi.insert(p);
        response.sendRedirect("PresensiToday.htm");
    }
}
