/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3v2tema4;

/**
 *
 * @author mario
 */
public class Bus extends Vehiculotransporte {

    /**
     * Constructor por defecto.
     */
    public Bus() {
        super();
    }

    /**
     * constructor por parametros
     *
     * @param numeroplazas numero de plazas.
     * @param matricula numero de matricula del bus
     * @param Duracionalquiler duracion alquiler.
     *
     */
    public Bus(int numeroplazas, String matricula, int Duracionalquiler) {
        super(numeroplazas, matricula, Duracionalquiler);
    }

    /**
     * metodo ImportedelAlquiler
     *
     * @return devuelve el importe
     */
    @Override
    public double ImportedelAlquiler() {
        double importe;
        importe = 50 * super.numeroplazas + (1.5 * super.getDuracionalquiler() + super.numeroplazas * 1.5) + 2 * super.numeroplazas;
        return importe;
    }

    /**
     * informacion al recibo
     */
    @Override
    public void Recibo() {
        System.out.println("Bus\n"
                + "------------------\n"
                + "Matricula: " + super.getMatriculavehiculo() + "\n"
                + "Duración: " + super.getDuracionalquiler() + "\n"
                + "Plazas: " + super.numeroplazas + "\n"
                + "Importe: " + this.ImportedelAlquiler());

    }
}
