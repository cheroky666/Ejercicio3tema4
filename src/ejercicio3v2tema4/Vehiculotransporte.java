/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3v2tema4;

/**
 *
 * @author mario todo el código etá auto tabulado (por si se parece al de otros
 * trabajos)
 */
public abstract class Vehiculotransporte extends Vehiculo {

    int numeroplazas;

    /**
     * constructor por defecto,
     */
    public Vehiculotransporte() {
        numeroplazas = 0;
    }

    public Vehiculotransporte(int numeroplazas) {
        this.numeroplazas = numeroplazas;
    }

    public Vehiculotransporte(int numeroplazas, String matricula, int Duracionalquiler) {
        super(matricula, Duracionalquiler);
        this.numeroplazas = numeroplazas;
    }

    public int getNumeroplazas() {
        return numeroplazas;
    }

    public void setNumeroplazas(int numeroplazas) {
        this.numeroplazas = numeroplazas;
    }

    /**
     * metodo ImportedelAlquiler
     *
     * @return devuelve el importe
     * 
     */
    @Override
    public abstract double ImportedelAlquiler();

    /**
     * este metodo sirve para mostrar todo por pantalla.
     */
    @Override
    public void Recibo() {
        System.out.println("Matricula del vehiculo: " + super.getMatriculavehiculo() + "\n"
                + "Duración del alquiler: " + super.getDuracionalquiler() + "\n"
                + "Plazas del vehiculo: " + this.numeroplazas + "\n"
                + "Importe total: " + this.ImportedelAlquiler());
    }

}
