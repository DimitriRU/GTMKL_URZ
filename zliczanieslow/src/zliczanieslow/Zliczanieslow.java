/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zliczanieslow;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class Zliczanieslow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
       
        File file = new File("sample.txt");
try(Scanner sc = new Scanner(new FileInputStream(file))){
    int count=0;
    while(sc.hasNext()){
        sc.next();
        count++;
    }
System.out.println("Number of words: " + count);
}
        
        
    }
    
}
