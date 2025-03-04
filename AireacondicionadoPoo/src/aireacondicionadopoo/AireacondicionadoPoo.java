
package aireacondicionadopoo;

import java.util.Random;
public class AireacondicionadoPoo {
    static Random random =new Random();
    static Deteccion deteccion =new Deteccion();
    static long tiempofinal=System.currentTimeMillis();
    public static void main(String[] args) throws InterruptedException {
        while (true) {            
             if(System.currentTimeMillis() - tiempofinal >= 30000){
                System.out.println("Ha finalizado la inspeccion");
                break;
            }
            int Porcentajehumedad = random.nextInt(85) + 10;
            int temp = random.nextInt(30) + 10;
            System.out.println(Porcentajehumedad+" - Porcentaje de humedad");
            System.out.println(temp+" - Temperatura");
            deteccion.Precesarinfo(Porcentajehumedad, temp);
            Thread.sleep(1000);
        }
    }
    
}
