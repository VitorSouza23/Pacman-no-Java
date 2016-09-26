/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.pacmanwho.sons;

import java.io.File;

/**
 *
 * @author Vitor
 */
public class Musica {
    private File file;

    public Musica(File file) {
        this.file = file;
    }
    
    

    /**
     * @return the file
     */
    public File getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(File file) {
        this.file = file;
    }
    
    public void play(){
        
    }
    
    public void pause(){
        
    }
}
