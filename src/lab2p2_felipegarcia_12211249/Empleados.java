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
public class Empleados {
    
    // Atributos
    
    private String Nombre;
    private int Edad;
    private String Activo;
    private int Sueldo;
    private String Identidad;
    
    // Constructores
       
    public Empleados(){
      }
    public Empleados(String N, int E, String A, int S, String I){
        this.Nombre = N;
        this.Edad = E;
        this.Activo = A;
        this.Sueldo = S;
        this.Identidad = I;
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
            
    public String getActividad(){
        return Activo;
    }
    public void setActividad(String A){
        this.Activo = A;
    } 
    
    public int getSueldo(){
        return Sueldo;
    }
    public void setSueldo(int S){
        this.Sueldo = S;
    }
    
    public String getIdentidad(){
        return Identidad;
    }
    public void setIdentidad(String I){
        this.Identidad = I;
    }
    
    
    // Metodos de administracion
 
    public String toString(){
        return "Nombre: " + Nombre + " | Edad: " + Edad + " | Actividad: " + Activo + " | Se le paga: " + Sueldo + " | Identidad RRHH: " + Identidad;
    }
}
