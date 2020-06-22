/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.breno.botwarmory.model.database.dao;

import co.breno.botwarmory.model.database.dao.generics.IGenericsDAO;
import co.breno.botwarmory.exception.NotConnectionException;
import co.breno.botwarmory.model.ArmorPieceUpgrade;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author breno
 */
public class ArmorPieceUpgradeDAO implements IGenericsDAO<ArmorPieceUpgrade, Integer>{

    @Override
    public void insert(ArmorPieceUpgrade obj) throws NotConnectionException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(ArmorPieceUpgrade obj) throws NotConnectionException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(ArmorPieceUpgrade obj) throws NotConnectionException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArmorPieceUpgrade queryId(Integer key) throws NotConnectionException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ArmorPieceUpgrade> queryAll() throws NotConnectionException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
