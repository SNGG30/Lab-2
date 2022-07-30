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
public class Carros {
    
    //Atributos
    
    private String Marca;
    private String Modelo;
    private String Año;
    private String Ingreso;
    private String Estado;
    private String Owner;
    // Constructores
    
     public Carros(){
      }
     public Carros(String MA, String MO, String A, String I, String E, String O){
         this.Marca = MA;
         this.Modelo = MO;
         this.Año = A;
         this.Ingreso = I;
         this.Estado = E;
         this.Owner = O;
     }
    
    // Mutadores
    
     public String getMarca(){
         return Marca;
     }
     public void setMarca(String MA){
         this.Marca = MA;
     }
     
     public String getModelo(){
         return Modelo;
     }
     public void setModelo(String MO){
         this.Modelo = MO;
     }
     
     public String getAño(){
         return Año;
     }
     public void setAño(String A){
         this.Año = A;
     }
     
     public String getIngreso(){
         return Ingreso;
     }
     public void setIngreso(String I){
         this.Ingreso = I;
     }
     
     public String getEstado(){
         return Estado;
     }
     public void setEstado(String E){
         this.Estado = E;
     }
     
     
    // Metodos de administracion
    public String toString(){
        return "Marca: " + Marca + " | Modelo: " + Modelo + " | Fecha de elaboracion: " + Año+ " | Fecha de ingreso al taller: " + Ingreso + " | Estado en el taller: " + Estado + " | Dueño: " + Owner;
    }
}
