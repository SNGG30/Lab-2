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
        int act = 0;
        boolean centinela = true;
        boolean centinela2 = true;
        ArrayList <Clientes> Cli = new ArrayList();
        ArrayList <Empleados> Emp = new ArrayList();
        ArrayList <Carros> Car = new ArrayList();
        
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
                    
                    System.out.println();
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
                            Clientes in;
                            
                            lea = new Scanner(System.in);
                            System.out.print("Ingrese nombre del cliente: ");
                            String N = lea.nextLine();
                            
                            lea = new Scanner(System.in);
                            System.out.print("Ingrese la edad del cliente: ");
                            int E = lea.nextInt();
                            
                            lea = new Scanner(System.in);
                            System.out.print("Ingrese la identidad del cliente: ");
                            String I = lea.nextLine();
                            
                            int P = 0;
                            
                            in = new Clientes(N, E, I, P);
                            
                            Cli.add(in);
                           
                        }
                        break;
                        
                        case 2:{
                            System.out.println();
                            
                            for (int i = 0; i < Cli.size(); i++) {
                                System.out.print(i + "). " + Cli.get(i).toString());
                                System.out.println();
                            }
                            
                            lea = new Scanner(System.in);
                            System.out.print("Que cliente desea modificar: ");
                            int p = lea.nextInt();
                            
                            lea = new Scanner(System.in);
                            System.out.print("Que desea modificar del cliente? \n"
                                    + "1). Nombre \n"
                                    + "2). Edad \n"
                                    + "3). Identidad \n"
                                    + "4). Pago \n"
                                    + "5). Nada \n"
                                    + "Ingrese opcion que desea modificar: ");
                            int mod = lea.nextInt();
                            
                            switch(mod){
                                
                                case 1:{
                                    lea = new Scanner(System.in);
                                    System.out.print("Ingrese nombre del cliente: ");
                                    String N = lea.nextLine();
                                    
                                    (Cli.get(p)).setNombre(N);
                                }
                                break;
                                
                                case 2:{
                                    lea = new Scanner(System.in);
                                    System.out.print("Ingrese edad del cliente");
                                    int E = lea.nextInt();
                                    
                                    (Cli.get(p)).setEdad(E);
                                    
                                }
                                break;
                                
                                case 3:{
                                    lea = new Scanner(System.in);
                                    System.out.print("Ingrese identidad del cliente");
                                    String I = lea.nextLine();
                                    
                                    (Cli.get(p)).setIdentidad(I);
                                }
                                break;
                                
                                case 4:{
                                    lea = new Scanner (System.in);
                                    System.out.println("Ingrese cuanto debe el cliente");
                                    int Pa = lea.nextInt();
                                    
                                    (Cli.get(p)).setPago(Pa);
                                }
                                break;
                                
                                default:
                                    System.out.println("No se ha modificado nada");
                            }
                        }
                        break;
                        
                        case 3:{
                            System.out.println();
                            
                            boolean del = true;
                
                            while (del == true){
                                System.out.println("REALMENTE DESEA BORRAR ALGO?");
                                System.out.println("1). Si");
                                System.out.print("Ingrese numero: ");
                                int bor = lea.nextInt();
                        
                                switch(bor){
                        
                                  case 1:{
                                                
                                    System.out.println();
                                    for (int i = 0; i < Cli.size(); i++) {
                                        System.out.print(i + "). " + Cli.get(i).toString());
                                        System.out.println();
                                    }
                            
                                    lea = new Scanner(System.in);
                                    System.out.print("Ingrese el indice del producto que desea eliminar: ");
                                    int p = lea.nextInt();
                   
                                    if(p < 0 || p >= Cli.size()){
                                        System.out.println("El indice no se encuentra en el inventario");
                                    }else{
                                        Cli.remove(p);
                                        System.out.println("Entrada eliminada correctamente");
                            }
                   
                            System.out.println();
                            del = false;
                        }
                        break;
                        
                        default:
                            System.out.print("No ha sido borrado nada");
                                }
                            }
                        }
                        break;
                        
                        case 4:{
                            System.out.println();
                            
                            for (int i = 0; i < Cli.size(); i++) {
                                System.out.print(i + "). " + Cli.get(i).toString());
                                System.out.println();
                            }
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
                    System.out.println();
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
                            Empleados em;
                            
                            lea = new Scanner(System.in);
                            System.out.print("Ingrese nombre del empleado: ");
                            String N = lea.nextLine();
                            
                            lea = new Scanner (System.in);
                            System.out.print("Ingrese edad del empleado: ");
                            int E = lea.nextInt();
                            
                            String A = "El empleado esta inactivo";
                            
                            lea = new Scanner (System.in);
                            System.out.print("Ingrese sueldo del empleado: ");
                            int S = lea.nextInt();
                            
                            lea = new Scanner (System.in);
                            System.out.println("Ingrese numero de recursos humanos del empleado: ");
                            String I = lea.nextLine();
                            
                            em = new Empleados(N, E, A, S, I);
                            
                            Emp.add(em);
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
                    System.out.println();
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
