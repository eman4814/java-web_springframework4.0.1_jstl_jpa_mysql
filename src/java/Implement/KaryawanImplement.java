/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implement;

import Entity.Karyawan;
import Interface.KaryawanInterface;
import java.util.List;

/**
 *
 * @author Computer
 */
public class KaryawanImplement extends GeneralImplement implements KaryawanInterface {

    public KaryawanImplement() {
        super();
    }

    @Override
    public Karyawan getByID(int id) {
        Karyawan k = em.find(Karyawan.class, id);
        return k;
    }

    @Override
    public Karyawan getByNIK(String nik) {
        Karyawan k = (Karyawan) em.createNamedQuery("Karyawan.findByNik")
                .setParameter("nik", nik)
                .getSingleResult();
        return k;
    }

    @Override
    public List<Karyawan> getByNama(String nama) {
        List<Karyawan> list = em.createNamedQuery("Karyawan.findByNama")
                .setParameter("nama", "%" + nama + "%")
                .getResultList();
        return list;
    }

    @Override
    public List<Karyawan> getAll() {
        List<Karyawan> list = em.createNamedQuery("Karyawan.findAll").getResultList();
        return list;
    }

}
