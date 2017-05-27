/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entity.Admin;
import Entity.Presensi;
import Implement.AdminImplement;
import Implement.PresensiImplement;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Computer
 */
public class Main {
    public static void main(String[] args) {
        //tampil presensi
        PresensiImplement pi = new PresensiImplement();
        List<Presensi> list = pi.getPresensiToday();
        for (Presensi p : list) {
            System.out.println("ID              "+p.getId());
            System.out.println("Nama Karyawan   "+p.getIdKaryawan().getNama());
            System.out.println("Tanggal         "+p.getTgl());
            System.out.println("Jam Masuk       "+p.getJamMasuk());
            System.out.println("Jam Keluar      "+p.getJamKaluar());
        }
        //tampil presensi
        AdminImplement ai = new AdminImplement();
        List<Admin> la = ai.getAll();
        for (Admin p : la) {
            System.out.println("ID              "+p.getId());
            System.out.println("Nama Karyawan   "+p.getUsername());
            System.out.println("Tanggal         "+p.getLevel());
        }
    }
}
