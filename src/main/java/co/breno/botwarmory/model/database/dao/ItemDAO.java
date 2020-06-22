/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.breno.botwarmory.model.database.dao;

import co.breno.botwarmory.model.database.dao.generics.IGenericsDAO;
import co.breno.botwarmory.exception.NotConnectionException;
import co.breno.botwarmory.model.Item;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author breno
 */
public class ItemDAO implements IGenericsDAO<Item, Integer>{

    @Override
    public void insert(Item obj) throws NotConnectionException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(Item obj) throws NotConnectionException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Item obj) throws NotConnectionException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Item queryId(Integer key) throws NotConnectionException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Item> queryAll() throws NotConnectionException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
