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
public abstract class Vehiculocarga extends Vehiculo {

    private int Tara;

    public Vehiculocarga() {
        Tara = 0;
    }

    /**
     * Todo el codigo esta auto tabulado Constructor por parámetros.
     * --------------------------------------
     *
     * @param Tara el peso.
     * @param matricula matricula.
     * @param Duracionalquiler duracion alquiler.
     */
    public Vehiculocarga(int Tara, String matricula, int Duracionalquiler) {
        super(matricula, Duracionalquiler);
        this.Tara = Tara;
    }

    //métodos get y set.
    public int getTara() {
        return Tara;
    }

    public void setTara(int Tara) {
        this.Tara = Tara;
    }

    /**
     * metodo ImportedelAlquiler
     *
     * @return devuelve el importe
     */
    public abstract double ImportedelAlquiler();

    @Override
    public void Recibo() {
        System.out.println("Matricula del vehiculo: " + super.getMatriculavehiculo() + "\n"
                + "Duración total: " + super.getDuracionalquiler() + "\n"
                + "Tara en toneladas: " + this.Tara + "\n"
                + "Importe total: " + this.ImportedelAlquiler());
    }

}
