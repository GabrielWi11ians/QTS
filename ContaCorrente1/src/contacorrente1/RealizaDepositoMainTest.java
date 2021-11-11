/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacorrente1;

/**
 *
 * @author LAB202
 */
public class RealizaDepositoMainTest {
    public static void main (String[] args) {
        ContaCorrente1 cc = new ContaCorrente1();
        cc.depositar(100.0);
        double saldoAtual = cc.consultaSaldo();
        
        System.out.println("Saldo Atual: "+saldoAtual);
    }
    
}
