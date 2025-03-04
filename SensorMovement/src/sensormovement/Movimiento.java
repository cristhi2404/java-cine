
package sensormovement;

import java.util.Random;
public class Movimiento {
    public static boolean movement;
    static Random random =new Random();
    public Movimiento(){
        this.movement=false;
    }
    public boolean Funcionar(){
        System.out.println("Analizando la casa...");
        movement=random.nextBoolean();
        return movement;
    }
}
