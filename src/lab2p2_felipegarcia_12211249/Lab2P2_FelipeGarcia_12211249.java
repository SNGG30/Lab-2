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
        int estado = 0;
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
                            
                            lea = new Scanner(System.in);
                            System.out.print("Ingrese cuanto debe el cliente: ");
                            int P = lea.nextInt();
                            
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
                                    System.out.print("Ingrese edad del cliente: ");
                                    int E = lea.nextInt();
                                    
                                    (Cli.get(p)).setEdad(E);
                                    
                                }
                                break;
                                
                                case 3:{
                                    lea = new Scanner(System.in);
                                    System.out.print("Ingrese identidad del cliente: ");
                                    String I = lea.nextLine();
                                    
                                    (Cli.get(p)).setIdentidad(I);
                                }
                                break;
                                
                                case 4:{
                                    lea = new Scanner (System.in);
                                    System.out.print("Ingrese cuanto debe el cliente: ");
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
                                    System.out.print("Ingrese el indice del cliente que desea eliminar: ");
                                    int p = lea.nextInt();
                   
                                    if(p < 0 || p >= Cli.size()){
                                        System.out.println("El cliente no se encuentra en el indice");
                                    }else{
                                        Cli.remove(p);
                                        System.out.println("Cliente eliminada correctamente");
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
                            System.out.print("Ingrese numero de recursos humanos del empleado: ");
                            String I = lea.nextLine();
                            
                            em = new Empleados(N, E, A, S, I);
                            
                            Emp.add(em);
                        }
                        break;
                        
                        case 2:{
                            System.out.println();
                            
                            for (int i = 0; i < Emp.size(); i++) {
                                System.out.print(i + "). " + Emp.get(i).toString());
                                System.out.println();
                            }
                            
                            lea = new Scanner(System.in);
                            System.out.print("Que empleado desea modificar: ");
                            int p = lea.nextInt();
                            
                            lea = new Scanner(System.in);
                            System.out.print("Que desea modificar del empleado? \n"
                                    + "1). Nombre \n"
                                    + "2). Edad \n"
                                    + "3). Pago \n"
                                    + "4). RRHH \n"
                                    + "5). Nada \n"
                                    + "Ingrese opcion que desea modificar: ");
                            int mod = lea.nextInt();
                            
                            switch(mod){
                                
                                case 1:{
                                   lea = new Scanner(System.in);
                                   System.out.print("Ingrese nombre del empleado: ");
                                   String N = lea.nextLine();
                                    
                                   (Emp.get(p)).setNombre(N);
                                }
                                break;
                                
                                case 2:{
                                   lea = new Scanner (System.in);
                                   System.out.print("Ingrese edad del empleado: ");
                                   int E = lea.nextInt();
                                   
                                   (Emp.get(p)).setEdad(E);
                                }
                                break;
                                
                                case 3:{
                                   lea = new Scanner (System.in);
                                   System.out.print("Ingrese sueldo del empleado: ");
                                   int S = lea.nextInt();
                                   
                                   (Emp.get(p)).setSueldo(S);
                                }
                                break;
                                
                                case 4:{
                                   lea = new Scanner (System.in);
                                   System.out.print("Ingrese numero de recursos humanos del empleado: ");
                                   String I = lea.nextLine();
                                   
                                   (Emp.get(p)).setIdentidad(I);
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
                                    for (int i = 0; i < Emp.size(); i++) {
                                        System.out.print(i + "). " + Emp.get(i).toString());
                                        System.out.println();
                                    }
                            
                                    lea = new Scanner(System.in);
                                    System.out.print("Ingrese el indice del empleado que desea eliminar: ");
                                    int p = lea.nextInt();
                   
                                    if(p < 0 || p >= Emp.size()){
                                        System.out.println("El empleado no se encuentra en el indice");
                                    }else{
                                        Emp.remove(p);
                                        System.out.println("Empleado eliminada correctamente");
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
                            
                            for (int i = 0; i < Emp.size(); i++) {
                                System.out.print(i + "). " + Emp.get(i).toString());
                                System.out.println();
                            }
                        }
                        break;
                        
                        case 5:{
                            int opp = 1;
                            
                            if(act == 0){
                                opp = 1;
                            }else if (act == 1){
                                opp = 0;
                            }
                            
                            System.out.println();
                            
                            for (int i = 0; i < Emp.size(); i++) {
                                System.out.print(i + "). " + Emp.get(i).toString());
                                System.out.println();
                            }
                            
                            lea = new Scanner(System.in);
                            System.out.print("A que empleado desea modificarle la asistencia: ");
                            int p = lea.nextInt();
                            
                            (Emp.get(p)).setActividad(SwitchAct(act));
                            
                            act = opp;
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
                            + "2). Modificar estado del carro \n"
                            + "3). Listar carros en sistema \n"
                            + "4). Salir \n"
                            + "Ingrese opcion: ");
                    int car = lea.nextInt();
                    
                    switch(car){
                        
                        case 1:{
                            Carros c;
                            
                            lea = new Scanner(System.in);
                            System.out.print("Ingrese marca del carro: ");
                            String MA = lea.nextLine();
                            
                            lea = new Scanner(System.in);
                            System.out.print("Ingrese modelo del carro: ");
                            String MO = lea.nextLine();
                            
                            lea = new Scanner(System.in);
                            System.out.print("Ingrese fecha de elaboracion: ");
                            String A = lea.nextLine();
                            
                            lea = new Scanner(System.in);
                            System.out.print("Ingrese fecha de ingreso al taller: ");
                            String I = lea.nextLine();
                            
                            String E = "en espera de entrar a reparación";
                            
                            String O;
                            if(Cli.size() == 0){
                                System.out.println("No se le puede asignar dueño a este carro");
                                O = "Null";
                            }else{
                            System.out.println();
                            
                            for (int i = 0; i < Cli.size(); i++) {
                                System.out.print(i + "). " + Cli.get(i).toString());
                                System.out.println();
                            }
                                lea = new Scanner(System.in);
                                System.out.print("Ingrese el indice del dueño: ");
                                int Id = lea.nextInt();
                                
                                O = (Cli.get(Id).getIdentidad());
                           }
                            
                             c = new Carros(MA, MO, A, I, E, O);
                             
                             Car.add(c);
                        }
                        break;
                        
                        case 2:{
                            System.out.println();
                            
                            for (int i = 0; i < Car.size(); i++) {
                                System.out.print(i + "). " + Car.get(i).toString());
                                System.out.println();
                            }
                            
                            lea = new Scanner(System.in);
                            System.out.print("A que carro desea modificarle el estado: ");
                            int p = lea.nextInt();
                            
                            String E;
                            
                            E = Change(estado);
                            Car.get(p).setEstado(E);
                            estado++;
                        }
                        break;
                        
                        case 3:{
                            System.out.println();
                            
                            for (int i = 0; i < Car.size(); i++) {
                                System.out.print(i + "). " + Car.get(i).toString());
                                System.out.println();
                            }
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
        public static String SwitchAct(int act){
        
        String A = "";
        
        if (act == 0) {
            A = "El empleado esta activo";
        }else if (act == 1){
            A = "El empleado esta inactivo";
        }
        return A;
    }
        
        public static String Change(int estado){
            String status = "";
            
            if(estado == 0){
                status = "en reparación";
            }else if(estado == 1){
                status = "en espera de pago de reparación";
            }else if(estado == 2){
                status = "saldo pagado";
            }else if(estado == 3){
                status = "en espera de ser entregado";
            }else{
                status = "Entregado";
            }
            
            return status;
        }
}
