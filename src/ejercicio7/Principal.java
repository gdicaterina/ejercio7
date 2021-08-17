/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author gaboo
 */
public class Principal {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bienvenido. Pon tu nombre para crear tu agenda de jugadores:");
        Seleccion seleccion = new Seleccion(input.nextLine());
        Fecha fecha = new Fecha();
        int op = 0;
        
        do{
            System.out.println("\t##############################");
            System.out.println("\t#######Menu Jugador  #########");
            System.out.println("\t##############################\n");
            
            System.out.println("\t 1. Nuevo Jugador");
            System.out.println("\t 2. Ver Jugadores");
            System.out.println("\t 3. Buscar por Apellido");
            System.out.println("\t 0. Salir");
            
            System.out.print(">");
            
            op = input.nextInt();
            
             switch(op){
                case 1: 
                    input.nextLine(); // Por problema entre nextIn y nextLine
                    System.out.println("Ingreso de nuevo jugador\n");
                    /*Pido los datos*/ 
                    System.out.println("Ingrese apellido");
                    String Apellido = input.nextLine();
                    System.out.println("Ingrese camiseta");
                    int Camiseta = input.nextInt();
                    System.out.println("Ingrese mes");                    
                    fecha.setMes(input.nextInt());
                    System.out.println("Ingrese dia");                    
                    fecha.setDia(input.nextInt());
                    System.out.println("Ingrese Año");                    
                    fecha.setAnio(input.nextInt());                    
                    
                    /*Lo agrego a la agenda*/
                    
                    seleccion.InsertarJugador(Apellido, Camiseta, fecha);
                break;
                
                case 2:
                    input.nextLine(); // Por problema entre nextIn y nextLine
                    System.out.println(seleccion.mostrarJugadores());
                   // System.out.println(seleccion.PerteneceJugador(jugador);
                break;
                
                case 3:
                    input.nextLine(); // Por problema entre nextIn y nextLine
                    //seleccion.
                    
                break;
                
            }        
            
            
        }while (op != 0);
    }
    
    
}
