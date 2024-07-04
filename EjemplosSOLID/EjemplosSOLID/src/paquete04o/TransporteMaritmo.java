/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04o;

/**
 *
 * @author Paula Lopez
 */
public class TransporteMaritmo  extends Transporte {

private String Marino;

    public void establecerMarino(String n) {
        Marino = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 14.00 + 0.20;
    }

    public String obtenerMarino() {
        return Marino ;
    }

}

