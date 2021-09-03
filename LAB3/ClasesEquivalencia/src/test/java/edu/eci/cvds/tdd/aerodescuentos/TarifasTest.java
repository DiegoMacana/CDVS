/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.tdd.aerodescuentos;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author natao
 */
public class TarifasTest {
   
    //verificar que no cumple con ninguna condicion para un descuento.
    @Test
    public void validateTarifaBase() {
        long tarifaBase=60000;
        int diasAntelacion=2;
        int edad=20;
       
        long tarifa=(long)CalculadorDescuentos.calculoTarifa(tarifaBase,diasAntelacion,edad);
         Assert.assertEquals(tarifa, tarifaBase);
        
    }
}
