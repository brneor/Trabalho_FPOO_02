/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.breno.botwarmory.model.database.dao.generics;

import co.breno.botwarmory.exception.NotConnectionException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author breno
 */
public interface IGenericsDAO<C, K> {
    public void insert(C obj) throws NotConnectionException, SQLException;
    public void edit(C obj) throws NotConnectionException, SQLException;
    public void delete(C obj) throws NotConnectionException, SQLException;
    public C queryId(K key) throws NotConnectionException, SQLException;
    public ArrayList<C> queryAll() throws NotConnectionException, SQLException;
}
