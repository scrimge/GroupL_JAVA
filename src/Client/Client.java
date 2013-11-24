/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.util.Random;

/**
 *
 * @author Mark
 */
public class Client {

    private int heartBeat;

    public Client() {
        this.heartBeat = 0;

    }

    public int getHeartBeat() {
        return heartBeat;
    }

    public void setHeartBeat(int heartBeat) {
        this.heartBeat = heartBeat;
    }

    public void generateHeartBeat(int average, int range) {

        Random rnd = new Random();
        int output;
        int randomInt = (int) (Math.random() * ((range) + 1));

        

        if (rnd.nextBoolean() == false) {
            randomInt = randomInt / -1;
            output = randomInt + average;
            System.out.println(randomInt);
        } else {
            output = randomInt + average;
            System.out.println(randomInt);
        }
        setHeartBeat(output);

    }
    
    
    public void generateAlarm(){
        
    }

    @Override
    public String toString() {
        return "Client{" + "heartBeat=" + heartBeat + '}';
    }

}
