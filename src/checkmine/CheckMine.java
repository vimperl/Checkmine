/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkmine;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Vladan
 */
public class CheckMine {

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
        // TODO code application logic here

    
    final TestClass test = new TestClass();

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                test.doStuff();
            }
        }, 0, test.myLong);
    }

    public void doStuff(){
        //do stuff here
    }
        
}
