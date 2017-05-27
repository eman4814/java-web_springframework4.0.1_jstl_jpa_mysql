/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entity.Admin;
import java.util.List;

/**
 *
 * @author Computer
 */
public interface AdminInterface {

    public Admin getByID(int id);

    public List<Admin> getAll();
}
