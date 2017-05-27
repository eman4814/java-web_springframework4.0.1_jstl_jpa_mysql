/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Feryprass
 */
@Entity
@Table(name = "karyawan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Karyawan.findAll", query = "SELECT k FROM Karyawan k"),
    @NamedQuery(name = "Karyawan.findById", query = "SELECT k FROM Karyawan k WHERE k.id = :id"),
    @NamedQuery(name = "Karyawan.findByFoto", query = "SELECT k FROM Karyawan k WHERE k.foto = :foto"),
    @NamedQuery(name = "Karyawan.findByJabatan", query = "SELECT k FROM Karyawan k WHERE k.jabatan = :jabatan"),
    @NamedQuery(name = "Karyawan.findByNama", query = "SELECT k FROM Karyawan k WHERE k.nama = :nama"),
    @NamedQuery(name = "Karyawan.findByNik", query = "SELECT k FROM Karyawan k WHERE k.nik = :nik"),
    @NamedQuery(name = "Karyawan.findByTelp", query = "SELECT k FROM Karyawan k WHERE k.telp = :telp")})
public class Karyawan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "alamat")
    private String alamat;
    @Size(max = 255)
    @Column(name = "foto")
    private String foto;
    @Size(max = 255)
    @Column(name = "jabatan")
    private String jabatan;
    @Size(max = 255)
    @Column(name = "nama")
    private String nama;
    @Size(max = 255)
    @Column(name = "nik")
    private String nik;
    @Size(max = 255)
    @Column(name = "telp")
    private String telp;
    @OneToMany(mappedBy = "idKaryawan")
    private List<Presensi> presensiList;

    public Karyawan() {
    }

    public Karyawan(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    @XmlTransient
    public List<Presensi> getPresensiList() {
        return presensiList;
    }

    public void setPresensiList(List<Presensi> presensiList) {
        this.presensiList = presensiList;
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
        if (!(object instanceof Karyawan)) {
            return false;
        }
        Karyawan other = (Karyawan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Karyawan[ id=" + id + " ]";
    }
    
}
