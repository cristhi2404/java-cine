
package poocine;

import java.util.ArrayList;



public class Persona {
    Poocine cine =new Poocine();
    private static String Nombre;
    private static String Iduser;
    private static String asientos;
    public static ArrayList<String> User =new ArrayList();
    public Persona(){
        
        this.Nombre="";
        this.Iduser="";
        this.asientos="";
        
        
    }
    public  void SetNombre(String Datoname){
        this.Nombre=Datoname;
    }
    public  void Setid(String DatoID){
        this.Iduser=DatoID;
    }
    public void setasientos(String acumulador){
        this.asientos=acumulador;
    }
    public ArrayList<String> GetDatos(){
        User.add("Nombre : "+Nombre+"\nId : "+Iduser+"\nAsientos reservados : "+asientos);
        return User;
    }
    
    
}
