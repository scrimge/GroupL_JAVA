/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import Client.Client;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mark
 */
public class Test_client {
    
   public static void main(String[] args) {
       
       
       //Client(int lowLimit,int highLimit)
       Client c1 = new Client(160,178);
       for (int i = 0; i < 12; i++) {
           //generateHeartBeat(int Average, int range)
           c1.generateHeartBeat(170, 10);
           System.out.println(c1.toString());
           System.out.println(c1.isAlarmFlag());
           try {
               sleep(0);
           } catch (InterruptedException ex) {
               Logger.getLogger(Test_client.class.getName()).log(Level.SEVERE, null, ex);
           }
           
        
           
       }
       
   } 
    
}
