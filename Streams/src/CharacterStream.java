
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eugene Vu
 */
public class CharacterStream {
    public static void main(String[] args) {
        try {
            OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("example4.txt"));
            InputStreamReader in = new InputStreamReader(new FileInputStream("example4.txt"));
            
            System.out.println(out.getEncoding());
            
         
            
            //out.close(); //call the flush method
            out.write("Another string");
//            out.flush();
            
            out.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
