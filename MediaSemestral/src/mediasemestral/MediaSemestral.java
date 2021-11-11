/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediasemestral;

/**
 *
 * @author LAB202
 */
public class MediaSemestral {
    private double nt1 = 8.0;
    private double nt2 = 8.0;
    private double nt3 = 8.0;
    private double media;
    
public void media() {
            media = (nt1+nt2+nt3)/3;
            System.out.println("Média Realizada");
        }
        
    public double calcular(){
        return media;
    }
}
