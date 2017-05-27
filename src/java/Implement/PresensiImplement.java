/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implement;

import Entity.Karyawan;
import Entity.Presensi;
import Interface.PresensiInterface;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Computer
 */
public class PresensiImplement extends GeneralImplement implements PresensiInterface {

    public PresensiImplement() {
        super();
    }

    @Override
    public Presensi getByID(int id) {
        Presensi p = em.find(Presensi.class, id);
        return p;
    }

    @Override
    public List<Presensi> getByTgl(Date tgl) {
        List<Presensi> list = em.createNamedQuery("Presensi.findByTgl", Presensi.class)
                .setParameter("tgl", tgl)
                .getResultList();
        return list;
    }

    @Override
    public List<Presensi> getAll() {
        List<Presensi> list = em.createNamedQuery("Presensi.findAll", Presensi.class).getResultList();
        return list;
    }

    @Override
    public List<Presensi> getPresensiToday() {
        List<Presensi> list = em.createNativeQuery("select * from presensi p join karyawan k on k.id=p.id where p.tgl = curdate()", Presensi.class)
                .getResultList();
        return list;
    }
}
