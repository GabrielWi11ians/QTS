/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacorrente1;

/**
 *
 * @author Gabri
 */
public class ContaCorrente1 {

        private double saldo;
        
        public void depositar(double valorDeposito) {
            saldo+= valorDeposito;
            System.out.println("Deposito realizado.");
        }
        
        public void sacar(double valorSaque) {
            if (valorSaque <=this.saldo) {
                saldo -= valorSaque;
                System.out.println("Saque Realizado");
            } else {
                System.out.println("Saque Insuficiente. Saque não realizado");
            }
        }
        public double consultaSaldo() {
            return saldo;
        }
}
