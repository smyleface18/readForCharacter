/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author SCIS2
 */
public class Archivos {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String path = "./data.txt";
        
        FileReader fileReader = null;
        
        try {
            fileReader = new FileReader(path);
            int value = fileReader.read();
            while (value != -1){
                System.out.print((char)value);
                value = fileReader.read();
            }
        }catch (IOException e){
            System.out.println("Ha ocurrido un error");
        }finally{
            if(fileReader != null){
                fileReader.close();
            }
        }
        
    }
}
