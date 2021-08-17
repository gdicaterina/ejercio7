/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author gaboo
 */
public class Fecha {
    private int Dia;
    private int Mes;
    private int Anio;
    
    /**
     * constructor's
     * @param Dia
     * @param Mes
     * @param Anio 
     */
    public Fecha(int Dia, int Mes, int Anio){
        this.Dia = Dia;
        this.Mes = Mes;
        this.Anio = Anio;
    }
    
    public Fecha(){
        
    }
    /*Getters & Setters*/
    public int getDia(){
        return Dia;
    }
    
    public void setDia(int Dia){
        this.Dia = Dia;
    }
    
    public int getMes(){
        return Mes;
    }
    
    public void setMes(int Mes){
        this.Mes = Mes;
    }
    
    public int getAnio(){
        return Anio;
    }
    
    public void setAnio(int Anio){
        this.Anio = Anio;
    }
    
    @Override
    public String toString(){
        return this.Anio + "/" + this.Mes + "/" + this.Dia ;
    }
    
    
}
