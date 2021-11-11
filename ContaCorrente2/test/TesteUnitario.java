/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import contacorrente2.ContaCorrente2;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LAB202
 */
public class TesteUnitario {
    
    @Test
    public void realizaDepositoEmContaCorrente() {
        double valorDeposito = 200.0;
        double saldoEsperado = 200.0;
        ContaCorrente2 cc = new ContaCorrente2();
        cc.depositar(valorDeposito);
        double saldoDaConta = cc.consultaSaldo();
        
        assertEquals(saldoEsperado, saldoDaConta, 0.0001);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
