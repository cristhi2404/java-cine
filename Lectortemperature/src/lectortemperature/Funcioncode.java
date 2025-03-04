
package lectortemperature;

public class Funcioncode {
    
    public Funcioncode(){
        
    }
    public void Medicion(double datotemp){
        if(datotemp<10){
            System.out.println("Activando calefactor");
        }else if(datotemp>10 && datotemp<25){
            System.out.println("la temperatura esta firme");
        }else{
            System.out.println("prendiendo un ventiladorcito melo");
        }
        
    }
}
