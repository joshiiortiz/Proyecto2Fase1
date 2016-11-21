package proyecto2;

public class Mascota{
    private String raza,personalidad;
    private int Id,Energetica,horasAfuera,Alergias,Ninos,Vivienda;

    public Mascota(String raza,String direccion,int Id, int Energetica, int horasAfuera, int Alergias, int Ninos, int Vivienda){
        
        this.raza=raza;
        this.personalidad=personalidad;
        this.Id = Id;
        this.Energetica = Energetica;
        this.horasAfuera = horasAfuera;
        this.Alergias = Alergias;
        this.Ninos = Ninos;
        this.Vivienda = Vivienda;

    }
    
    public String getRaza(){
        return raza;
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
    
    public int getHorasAfuera(){
        return horasAfuera;
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