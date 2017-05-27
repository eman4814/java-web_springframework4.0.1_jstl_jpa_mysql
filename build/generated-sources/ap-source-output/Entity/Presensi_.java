package Entity;

import Entity.Karyawan;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-27T23:31:32")
@StaticMetamodel(Presensi.class)
public class Presensi_ { 

    public static volatile SingularAttribute<Presensi, Date> jamKaluar;
    public static volatile SingularAttribute<Presensi, Karyawan> idKaryawan;
    public static volatile SingularAttribute<Presensi, Date> tgl;
    public static volatile SingularAttribute<Presensi, Integer> id;
    public static volatile SingularAttribute<Presensi, Date> jamMasuk;

}