/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author Eugene Vu
 */
public class IntStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
           FileInputStream inputStream = new FileInputStream("example1.txt");
           
           int data = inputStream.read();
           while(data != -1){
               System.out.println((char)data);
               
               data = inputStream.read();
           }
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
    
}
