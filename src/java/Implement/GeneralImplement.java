/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implement;

import Interface.GeneralInterface;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Computer
 */
public class GeneralImplement implements GeneralInterface {

    protected EntityManager em;

    public GeneralImplement() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Bootcamp_PresensiPU");
        em = emf.createEntityManager();
    }

    @Override
    public void insert(Object o) {
        try {
            em.getTransaction().begin();
            em.persist(o);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("Error Tambah Object(" + o.getClass() + ") " + e);
        }
    }

    @Override
    public void update(Object o) {
        try {
            em.getTransaction().begin();
            em.merge(o);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("Error Tambah Object(" + o.getClass() + ") " + e);
        }
    }

    @Override
    public void delete(Object o) {
        try {
            em.getTransaction().begin();
            em.remove(o);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("Error Tambah Object(" + o.getClass() + ") " + e);
        }
    }

}
