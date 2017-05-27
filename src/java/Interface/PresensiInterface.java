/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entity.Presensi;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Computer
 */
public interface PresensiInterface {

    public Presensi getByID(int id);

    public List<Presensi> getByTgl(Date tgl);

    public List<Presensi> getAll();

    public List<Presensi> getPresensiToday();
}
