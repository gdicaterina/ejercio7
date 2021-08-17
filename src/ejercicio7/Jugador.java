/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.time.LocalDate;
import java.time.Period;


/**
 *
 * @author gaboo
 */
public class Jugador {
    private String Apellido;
    private int Camiseta;
    private Fecha Nacimiento;
    
    /**
     * constructor's
     * @param Apellido
     * @param Camiseta
     * @param Nacimiento 
     */
    public Jugador(String Apellido, int Camiseta, Fecha Nacimiento){
        this.Apellido = Apellido;
        this.Camiseta = Camiseta;
        this.Nacimiento = Nacimiento;        
    }
    
    public Jugador(){
        
    }
        
     /*Getters & Setters*/
    public String getApellido(){
        return Apellido;
    }
            
    public void setApellido(String Apellido){
        this.Apellido = Apellido;
    }
    
    public int getCamiseta(){
        return Camiseta;
    }
    
    public void setCamiseta(int Camiseta){
        this.Camiseta = Camiseta;
    }
    
    public Fecha getNacimiento(){
        return Nacimiento;
    }
    
    public void setNacimiento(Fecha Nacimiento){
        this.Nacimiento = Nacimiento;
    }
    
    @Override
    public String toString(){
        return this.Apellido + " " + this.Camiseta + " " + this.Nacimiento;
    }
    
    
    public String posicion(int Camiseta){
        
        this.Camiseta = Camiseta;
        String posicion = null;
        
        switch (Camiseta) {
            case 1:
            case 12:
            case 23:
                posicion = "golero";
                break;
            case 2:
            case 3:
            case 4:
            case 13:
                posicion = "defensa";
                break;
            case 9:
            case 11:
            case 18:
            case 21:
                posicion = "delantero";
                break;
            default:
                posicion = "mediocampista";
                break;
        }
        
        return posicion;
    }
    
    public boolean subVeinte(){
                
        Fecha fecha = new Fecha();        
                
        boolean jugadorMenorDeVeinte = false;
        LocalDate localDateJugador = LocalDate.of(fecha.getAnio(), fecha.getMes(), fecha.getDia());        
        LocalDate localDateNow = LocalDate.now();
        Period Edad = Period.between(localDateJugador, localDateNow);
        //System.out.println(Edad.getYears()+Edad.getMonths()+Edad.getDays());        
        
        if(Edad.getYears() <= 20) {
            jugadorMenorDeVeinte = true;
        }else
            jugadorMenorDeVeinte = false;
        
        return jugadorMenorDeVeinte;
    }
    
    public String MostrarJugadorPosicion(int Camisa){
        String MosstrarJugadorPosicion = Jugador.this.posicion(Camiseta) ;
        
        return MosstrarJugadorPosicion;
    }   
    
    
    
    
}
