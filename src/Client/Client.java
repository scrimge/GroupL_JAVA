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
    private int lowLimit;
    private int highLimit;
    private boolean alarmFlag;

    public Client(int lowLimit,int highLimit) {
        this.heartBeat = 0;
        this.lowLimit = lowLimit;
        this.highLimit = highLimit;
        this.alarmFlag = false;

    }

    public Client() {
        this.heartBeat = 0;
        this.lowLimit = 0;
        this.highLimit = 0;
        this.alarmFlag = false;
    }

   
    
    
    

    public int getHeartBeat() {
        return heartBeat;

    }

    public int getLowLimit() {
        return lowLimit;
    }

    public void setLowLimit(int lowLimit) {
        this.lowLimit = lowLimit;
    }

    public int getHighLimit() {
        return highLimit;
    }

    public void setHighLimit(int highLimit) {
        this.highLimit = highLimit;
    }

    public boolean isAlarmFlag() {
        return alarmFlag;
    }

    public void setAlarmFlag(boolean alarmFlag) {
        this.alarmFlag = alarmFlag;
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
        
        
        if(output > highLimit || output < lowLimit){
            alarmFlag = true;
            
        }

    }
    
    
    

    @Override
    public String toString() {
        return "Client{" + "heartBeat=" + heartBeat + '}';
    }

}
