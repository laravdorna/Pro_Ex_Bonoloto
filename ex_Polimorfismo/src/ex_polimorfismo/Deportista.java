/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_polimorfismo;

/**
 *
 * @author lvazquezdorna
 */
public class Deportista extends Persoa{
    
    private String deporte;

    public Deportista() {
    }

    public Deportista(String deporte, String nome, float soldo) {
        super(nome, soldo);
        this.deporte = deporte;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    @Override
    public String toString() {
        return "Deportista:  \n" + super.toString() + "\ndeporte:" + deporte;
    }
    
    @Override
    public float calcularSoldo(){
    return super.calcularSoldo()+2000;
    }
}
