/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Feryprass
 */
@Entity
@Table(name = "presensi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Presensi.findAll", query = "SELECT p FROM Presensi p"),
    @NamedQuery(name = "Presensi.findById", query = "SELECT p FROM Presensi p WHERE p.id = :id"),
    @NamedQuery(name = "Presensi.findByJamKaluar", query = "SELECT p FROM Presensi p WHERE p.jamKaluar = :jamKaluar"),
    @NamedQuery(name = "Presensi.findByJamMasuk", query = "SELECT p FROM Presensi p WHERE p.jamMasuk = :jamMasuk"),
    @NamedQuery(name = "Presensi.findByTgl", query = "SELECT p FROM Presensi p WHERE p.tgl = :tgl")})
public class Presensi implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "jam_kaluar")
    @Temporal(TemporalType.TIME)
    private Date jamKaluar;
    @Column(name = "jam_masuk")
    @Temporal(TemporalType.TIME)
    private Date jamMasuk;
    @Column(name = "tgl")
    @Temporal(TemporalType.DATE)
    private Date tgl;
    @JoinColumn(name = "id_karyawan", referencedColumnName = "id")
    @ManyToOne
    private Karyawan idKaryawan;
    
    
    public Presensi() {
    }

    public Presensi(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getJamKaluar() {
        return jamKaluar;
    }

    public void setJamKaluar(Date jamKaluar) {
        this.jamKaluar = jamKaluar;
    }

    public Date getJamMasuk() {
        return jamMasuk;
    }

    public void setJamMasuk(Date jamMasuk) {
        this.jamMasuk = jamMasuk;
    }

    public Date getTgl() {
        return tgl;
    }

    public void setTgl(Date tgl) {
        this.tgl = tgl;
    }

    public Karyawan getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(Karyawan idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Presensi)) {
            return false;
        }
        Presensi other = (Presensi) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Presensi[ id=" + id + " ]";
    }
    
}
