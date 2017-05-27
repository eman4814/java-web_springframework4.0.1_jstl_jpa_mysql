/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implement;

import Entity.Admin;
import Interface.AdminInterface;
import java.util.List;

/**
 *
 * @author Computer
 */
public class AdminImplement extends GeneralImplement implements AdminInterface{

    public AdminImplement() {
        super();
    }

    @Override
    public Admin getByID(int id) {
        Admin a = em.find(Admin.class, id);
        return a;
    }

    @Override
    public List<Admin> getAll() {
        List<Admin> list = em.createNamedQuery("Admin.findAll").getResultList();
        return list;
    }
    
}
