
package lectortemperature;
public class Lectortemperature {
    static TempInvern temp =new TempInvern();
    static Funcioncode funcion =new Funcioncode();
    public static void main(String[] args) throws InterruptedException {
        while(true){
            double dato=temp.CalcularTempinvern();
            System.out.println(dato);
            funcion.Medicion(dato);
            Thread.sleep(5000);
            System.out.println("..."); 
        }
    } 
}
