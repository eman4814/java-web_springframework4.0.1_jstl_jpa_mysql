/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entity.Karyawan;
import java.util.List;

/**
 *
 * @author Computer
 */
public interface KaryawanInterface {

    public Karyawan getByID(int id);

    public Karyawan getByNIK(String nik);

    public List<Karyawan> getByNama(String nama);

    public List<Karyawan> getAll();
}
