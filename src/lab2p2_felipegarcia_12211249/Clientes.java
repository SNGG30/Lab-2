/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_felipegarcia_12211249;

/**
 *
 * @author felip
 */
public class Clientes {
    
    // Atributos
    
    private String Nombre;
    private int Edad;
    private String Identidad;
    private int Pago;
    
    // Constructores
    
    public Clientes(){
    }
    public Clientes(String N, int E, String I, int P){
        this.Nombre = N;
        this.Edad = E;
        this.Identidad = I;
        this.Pago = P;
    }
    
    // Mutadores
    
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String N){
        this.Nombre = N;
    }
    
    public int getEdad(){
        return Edad;
    }
    public void setEdad(int E){
        this.Edad = E;
    }
    
    public String getIdentidad(){
        return Identidad;
    }
    public void setIdentidad(String I){
        this.Identidad = I;
    }
    
    public int getPago(){
        return Pago;
    }
    public void setPago(int P){
        this.Pago = P;
    }
    // Metodos de administracion
    
    public String toString(){
        return "Nombre: " + Nombre + " | Edad: " + Edad + " | Identidad: " + Identidad + " | El cliente debe: L." + Pago;
    }
}
