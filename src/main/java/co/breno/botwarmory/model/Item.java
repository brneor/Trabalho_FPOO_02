/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.breno.botwarmory.model;

/**
 *
 * @author breno
 */
public class Item {
    private String setName, setPiece;
    private int currentLevel;

    public Item() {
    }

    public Item(String setName, String setPiece, int currentLevel) {
        this.setName = setName;
        this.setPiece = setPiece;
        this.currentLevel = currentLevel;
    }
    
    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    public String getSetPiece() {
        return setPiece;
    }

    public void setSetPiece(String setPiece) {
        this.setPiece = setPiece;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }
    
}
