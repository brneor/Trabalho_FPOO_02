/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.breno.botwarmory.exception;

/**
 *
 * @author daves
 */
public class NotConnectionException extends Exception {

    public NotConnectionException() {
        super("A conexão com o banco não foi possível");
    }
    
}
