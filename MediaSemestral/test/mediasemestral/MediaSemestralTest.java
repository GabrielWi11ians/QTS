/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import mediasemestral.mediasemestral;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LAB202
 */
public class TesteUnitario {
    
    @Test
    public void realizaDepositoEmContaCorrente() {

        mediasemestral ms = new mediasemestral();
        ms.calcular();
        double saldoDaConta = ms.consultaSaldo();
        
        assertEquals(8.0, ms.calcular(), 0.0001);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
