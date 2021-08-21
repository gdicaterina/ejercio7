/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.ArrayList;

/**
 *
 * @author gaboo
 */
public class Seleccion {
    
    private String Pais;
    private ArrayList<Jugador> jugadores;
        
    public Seleccion(String Pais){
        this.Pais = Pais;
        jugadores = new ArrayList();
    }

    public Seleccion() {
        
    }
    
    public void InsertarJugador(String Apellido, int Camiseta, Fecha Nacimiento){
        Jugador jugador = new Jugador(Apellido, Camiseta, Nacimiento);
        jugadores.add(jugador);
    }
    
    public String MostrarJugador(int posicion){
        
        /*String Jugador = "SubVeinte : " + jugadores.get(posicion).subVeinte() + "Apellido : " + jugadores.get(posicion).getApellido() + "\n" + "Camiseta : " + jugadores.get(posicion).getCamiseta()
                + "\n" + "Nacimiento : " + jugadores.get(posicion).getNacimiento() + "\n" + "Posicion : " + jugadores.get(posicion).MostrarJugadorPosicion(posicion) + "\n";
        */
        String Jugador = "Apellido : " + jugadores.get(posicion).getApellido() + "\n" + "Camiseta : " + jugadores.get(posicion).getCamiseta()
                + "\n" + "Nacimiento : " + jugadores.get(posicion).getNacimiento() + "\n" + "Posicion : " + jugadores.get(posicion).MostrarJugadorPosicion(posicion) + "\n";
        
        
        Jugador += "----------------------------------------------------------------------\n";
        
        return Jugador;
    }
    
    public boolean PerteneceJugador(String Apellido){
        boolean existeJugador = false;
        
        for(int i = 0; i < jugadores.size(); i++){
            if(Apellido.equals(jugadores.get(i).getApellido())){
                return existeJugador = true;
            }
        }
        
        return existeJugador;
    }
    
    public String mostrarJugadores(){
        String JugadoresLista = null;
        
        for(int i = 0; i < jugadores.size(); i++){
            JugadoresLista += this.MostrarJugador(i);
        }
        return JugadoresLista;
    }
    
    public int ObtenerPosicion(String Apellido) {
        for (int i = 0; i < jugadores.size(); i++) {
            if (Apellido.equals(jugadores.get(i).getApellido())) {
                return i;
            }
        }
        return -1;
    }
    
    public Jugador Devolver(int pos){
        return jugadores.get(pos);
    }
    
}
