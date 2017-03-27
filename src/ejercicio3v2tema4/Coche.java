/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3v2tema4;

/**
 *
 * @author mario todo el código etá auto tabulado (por si se parece al de otros
 */
public class Coche extends Vehiculotransporte {

    /**
     * Constructor por defecto.
     */
    public Coche() {

        super();
    }

    /**
     * constructor por parametros de coche que hereda de vehiculo.
     * 
     *
     * @param numeroplazas numero de plazas.
     * @param matricula matricula del coche.
     * @param Duracionalquiler duración alquiler.
     */
    public Coche(int numeroplazas, String matricula, int Duracionalquiler) {
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
        importe = 50 * super.numeroplazas + (1.5 * super.getDuracionalquiler() + super.numeroplazas * 1.5);
        return importe;
    }

    /**
     *
     */
    @Override
    public void Recibo() {
        System.out.println("Coche\n" + "------------------\n"
                + "Matricula vehiculo: " + super.getMatriculavehiculo() + "\n"
                + "Duración total: " + super.getDuracionalquiler() + "\n"
                + "Plazas totales: " + super.numeroplazas + "\n"
                + "Importe alquiler: " + this.ImportedelAlquiler());

    }
}
