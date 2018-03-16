/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkmine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

/**
 *
 * @author Vladan
 */
class TestClass {

    public long myLong = 300000;

    void doStuff() {

        String hostname = "Unknown";

        try {
            InetAddress addr;
            addr = InetAddress.getLocalHost();
            hostname = addr.getHostName();
        } catch (UnknownHostException ex) {
            System.out.println("Hostname can not be resolved");
        }
        //System.out.println(hostname);
        
        try {
            String tinyUrl = "http://tokyopos.i-solutions.rs/checkmine.php?kl=";
            String tinyUrlLookup = tinyUrl + hostname;
            BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(tinyUrlLookup).openStream()));
            reader.close();

        } catch (Exception e) {
            System.out.println();
        }

    }

}
