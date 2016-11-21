/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

public class Persona{
    private String username,password,nombre,personalidad;
    private int Id,Energetica,TiempoLibre,Alergias,Ninos,Vivienda;

    public Persona(String username, String password, String nombre,String direccion,int Id, int Energetica, int TiempoLibre, int Alergias, int Ninos, int Vivienda){
        this.username=username;
        this.password=password;
        this.nombre=nombre;
        this.personalidad=personalidad;
        this.Id = Id;
        this.Energetica = Energetica;
        this.TiempoLibre = TiempoLibre;
        this.Alergias = Alergias;
        this.Ninos = Ninos;
        this.Vivienda = Vivienda;

    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getPersonalidad(){
        return personalidad;
    }
   
    public int getId(){
        return Id;
    }
    
    public int getEnergetica(){
        return Energetica;
    }
    
    public int getTiempoLibre(){
        return TiempoLibre;
    }
    
    
    public int getAlergias(){
        return Alergias;
    }
    
    public int getNinos(){
        return Ninos;
    }
    
    public int getVivienda(){
        return Vivienda;
    }
    
}