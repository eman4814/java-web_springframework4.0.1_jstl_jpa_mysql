package Entity;

import Entity.Presensi;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-27T23:31:32")
@StaticMetamodel(Karyawan.class)
public class Karyawan_ { 

    public static volatile SingularAttribute<Karyawan, String> nik;
    public static volatile SingularAttribute<Karyawan, String> telp;
    public static volatile SingularAttribute<Karyawan, String> foto;
    public static volatile SingularAttribute<Karyawan, String> nama;
    public static volatile SingularAttribute<Karyawan, String> jabatan;
    public static volatile ListAttribute<Karyawan, Presensi> presensiList;
    public static volatile SingularAttribute<Karyawan, Integer> id;
    public static volatile SingularAttribute<Karyawan, String> alamat;

}