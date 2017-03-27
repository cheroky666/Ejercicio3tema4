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
public class Lafragoneta extends Vehiculocarga {

    /**
     * constructor por defecto
     */
    public Lafragoneta() {
        super();
    }

    /**
     * constructor por parametros.
     *
     * @param Tara peso vehiculo.
     * @param matricula matricula vehiculo
     * @param Duracionalquiler duracion alquiler.
     */
    public Lafragoneta(int Tara, String matricula, int Duracionalquiler) {
        super(Tara, matricula, Duracionalquiler);
    }

    /**
     * metodo ImportedelAlquiler
     *
     * @return devuelve el importe
     */
    @Override
    public double ImportedelAlquiler() {
        double importe;
        importe = 50 * super.getDuracionalquiler() + 20 * super.getTara();
        return importe;
    }

    @Override
    public void Recibo() {
        System.out.println("Lafragoneta\n"
                + "------------------\n"
                + "Matricula vehiculo: " + super.getMatriculavehiculo() + "\n"
                + "Duración total: " + super.getDuracionalquiler() + "\n"
                + "Plazas totales: " + super.getTara() + "\n"
                + "Importe total: " + this.ImportedelAlquiler());
    }

}
