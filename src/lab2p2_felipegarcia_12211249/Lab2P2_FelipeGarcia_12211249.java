/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_felipegarcia_12211249;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author felip
 */
public class Lab2P2_FelipeGarcia_12211249 {
    static Scanner lea = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String usuario;
        String contra;
        boolean centinela = true;
        boolean centinela2 = true;
        ArrayList Clientes = new ArrayList();
        ArrayList Empleados = new ArrayList();
        ArrayList Carros = new ArrayList();
        
        while(centinela == true){
        System.out.println("INICIO DE SESION");
        
        lea = new Scanner(System.in);
        System.out.print("Nombre de usuario (case sensitive): ");
        usuario = lea.nextLine();
        
        
        lea = new Scanner(System.in);
        System.out.print("Contraseña (case sensitive): ");
        contra = lea.nextLine();
        
        if(usuario.equals("admin") && contra.equals("admin1234")){
            
            while(centinela2 == true){
            System.out.println();
            lea = new Scanner(System.in);
            System.out.print("Bienvenido admin, que desea ver? \n"
                    + "1). Clientes \n"
                    + "2). Empleados \n"
                    + "3). Carros \n"
                    + "4). Salir \n"
                    + "Ingrese opcion: ");
            int opcionmenu = lea.nextInt();

            switch (opcionmenu){
                
                case 1:{
                    
                    System.out.print("MENU DE CLIENTES \n"
                            + "1). Crear entrada \n"
                            + "2). Modificar entrada \n"
                            + "3). Eliminar entrada \n"
                            + "4). Listar clientes en sistema \n"
                            + "5). Listar carros por clientes \n"
                            + "6). Salir \n"
                            + "Ingrese opcion: ");
                    int client = lea.nextInt();
                    
                    switch (client){
                        
                        case 1:{
                            
                        }
                        break;
                        
                        case 2:{
                            
                        }
                        break;
                        
                        case 3:{
                            
                        }
                        break;
                        
                        case 4:{
                            
                        }
                        break;
                        
                        case 5:{
                            
                        }
                        break;
                        
                        default:
                            System.out.println();
                    }
                }
                break;
                
                case 2:{
                    System.out.print("MENU DE EMPLEADOS \n"
                            + "1). Crear entrada \n"
                            + "2). Modificar entrada \n"
                            + "3). Eliminar entrada \n"
                            + "4). Listar empleados en sistema \n"
                            + "5). Marcar asistencia de empleado \n"
                            + "6). Salir \n"
                            + "Ingrese opcion: ");
                    int emp = lea.nextInt();
                    
                    switch(emp){
                        
                        case 1:{
                            
                        }
                        break;
                        
                        case 2:{
                            
                        }
                        break;
                        
                        case 3:{
                            
                        }
                        break;
                        
                        case 4:{
                            
                        }
                        break;
                        
                        case 5:{
                            
                        }
                        break;
                        
                        default:
                            System.out.println();
                    }
                }
                break;
                
                case 3:{
                    System.out.print("MENU DE CARROS \n"
                            + "1). Agregar carro a sistema \n"
                            + "2). Modificar entrada \n"
                            + "3). Eliminar entrada \n"
                            + "4). Listar carros en sistema \n"
                            + "5). Salir \n"
                            + "Ingrese opcion: ");
                    int car = lea.nextInt();
                    
                    switch(car){
                        
                        case 1:{
                            
                        }
                        break;
                        
                        case 2:{
                            
                        }
                        break;
                        
                        case 3:{
                            
                        }
                        break;
                        
                        case 4:{
                            
                        }
                        break;
                        
                        default:
                            System.out.println();
                    }
                }
                break;
                
                case 4:{
                    System.out.println("Gracias por usar el programa");
                    centinela2 = false;
                }
                break;
                
                default:
                    System.out.println("Opcion incorrecta, ingrese denuevo");
            }
            
            }
            centinela = false;
        }else{
            System.out.println("Nombre de usuario o contraseña incorrecta, ingrese denuevo");
            System.out.println();
        }
    }
  }
}
