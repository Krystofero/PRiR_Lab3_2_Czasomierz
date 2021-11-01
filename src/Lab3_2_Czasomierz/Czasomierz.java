/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3_2_Czasomierz;

import static java.lang.Thread.sleep;

/**
 *
 * @author Student
 */
public class Czasomierz {
    int sekunda = 0;
    int minuta = 0;
    int godzina = 0;
    
    public Czasomierz() throws InterruptedException{
        this.sekunda = 0;
        this.minuta = 0;
        this.godzina = 0;   
    }
    public void start() throws InterruptedException{
        while(true){
            sekunda++;
            if(sekunda==59){
                minuta++;
                sekunda = 0;
                if(minuta==59){
                    godzina++;
                    minuta = 0;
                    if(godzina==24){
                        godzina = 0;
                    }
                }
            }
            sleep(1000);
            System.out.println(godzina + " : " + minuta + " : " + sekunda);
        } 
    }
}
