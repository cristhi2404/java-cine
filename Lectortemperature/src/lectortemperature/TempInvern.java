
package lectortemperature;
import java.util.Random;
public class TempInvern {
    private static double temperatura;
    static Random random=new Random();
    public TempInvern(){
        this.temperatura=0;
    }
    public double CalcularTempinvern(){
        System.out.println("Calculando la temperatura del invernadero");
        temperatura=random.nextDouble(31);
        return temperatura;
    }
}
