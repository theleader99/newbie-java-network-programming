/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author Eugene Vu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServerThread thread = new ServerThread("Server 1 ");
        ServerThread thread2 = new ServerThread("Server 2 ");
        thread2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(thread2.getName() + " priority: " + thread2.getPriority());
        thread.start();
        thread2.start();
    }
    
}
