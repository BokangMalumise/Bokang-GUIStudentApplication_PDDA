/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.data;

import java.io.IOException;

/**
 *
 * @author MALUMISE B (221597409)
 */
public class DataStorageException extends IOException{

    public DataStorageException() {
    }

    public DataStorageException(String msg) {
        super(msg);
    }
    
}
