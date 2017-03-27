/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3v2tema4;

/**
 *
 * @author mario todo el código está auto tabulado ---ctrl+alt+f----(por si se
 * parece al de otros trabajos)
 */
public abstract class Vehiculo {

    //atributos de vehiculo 
    private String matriculavehiculo;
    private int duracionalquiler;

    /**
     * constructor por defecto
     */
    public Vehiculo() {
        matriculavehiculo = "";
        duracionalquiler = 0;
    }

    /**
     * constructor por parametros ----------------------------
     *
     * @param matriculavehiculo matricula vehiculo.
     * @param duracionalquiler duracion alquiler.
     */
    public Vehiculo(String matriculavehiculo, int duracionalquiler) {
        this.matriculavehiculo = matriculavehiculo;
        this.duracionalquiler = duracionalquiler;
    }

    //get y set de la clase vehiculo
    public String getMatriculavehiculo() {
        return matriculavehiculo;
    }

    public void setMatriculavehiculo(String matriculavehiculo) {
        this.matriculavehiculo = matriculavehiculo;
    }

    public int getDuracionalquiler() {
        return duracionalquiler;
    }

    public void setDuracionalquiler(int duracionalquiler) {
        this.duracionalquiler = duracionalquiler;
    }

    /**
     * metodo ImportedelAlquiler
     *
     * @return devuelve el importe
     */
    public abstract double ImportedelAlquiler();

    /**
     * muestra los datos del vehiculo
     */
    public abstract void Recibo();

}
