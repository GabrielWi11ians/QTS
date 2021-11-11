/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacorrente2;

/**
 *
 * @author LAB202
 */
public class RealizaDepositoMainTeste {
    public static void main (String[] args) {
        ContaCorrente2 cc = new ContaCorrente2();
        cc.depositar(100.0);
        double saldoAtual = cc.consultaSaldo();
        
        System.out.println("Saldo Atual: "+saldoAtual);
    }
    
}
