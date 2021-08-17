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
    
    public void InsertarJugador(String Apellido, int Camiseta, Fecha Nacimiento){
        Jugador jugador = new Jugador(Apellido, Camiseta, Nacimiento);
        jugadores.add(jugador);
    }
    
    public String MostrarJugador(int posicion){
        String Jugador = "\t" + jugadores.get(posicion).getApellido() + "\t" + jugadores.get(posicion).getCamiseta()
                + "\t\t" + jugadores.get(posicion).getNacimiento() + "\t" + jugadores.get(posicion).MostrarJugadorPosicion(jugadores.get(posicion).getCamiseta()) + "\n";
        
        return Jugador;
    }
    
    public boolean PerteneceJugador(Jugador jugador){
        boolean existeJugador = false;
        
        for(int i = 0; i < jugadores.size(); i++){
            if(jugador.getApellido().equals(jugadores.get(i).getApellido())){
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
    
}
