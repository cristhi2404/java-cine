
package sensormovement;

public class SensorMovement {
    static Movimiento move =new Movimiento();
    static Alarma alarm =new Alarma();
    static long tiempofinal= System.currentTimeMillis();
    public static void main(String[] args) throws InterruptedException {
        while(true){
            if(System.currentTimeMillis() - tiempofinal >= 30000){
                System.out.println("Ha finalizado la inspeccion");
                break;
            }
            boolean datomove=move.Funcionar();
            alarm.Detectar(datomove);
            Thread.sleep(4000);
        }
    }
}
