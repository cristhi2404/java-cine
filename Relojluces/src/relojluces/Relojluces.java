
package relojluces;

public class Relojluces {
    static Movimiento move =new Movimiento();
    static Luces luz =new Luces();
    public static int numero;
    static long tiempofinal= System.currentTimeMillis();
    public static boolean Formatohoras=true;
    public static void main(String[] args) throws InterruptedException {
        while (true) {            
            while(numero<=11){
                numero=numero+1;
                if(Formatohoras==true){
                    if(numero<=6){
                        System.out.println("("+numero+" Am."+")");
                        System.out.println("Luces encendidas");
                        
                    }else if(numero>6){
                        System.out.println("("+numero+" Am."+")");
                        boolean datomove=move.Funcionar();
                        luz.Detectar(datomove);
                    }
                }else if(Formatohoras==false){
                    if(numero>=6){
                        System.out.println("("+numero+" Pm."+")");
                        System.out.println("Luces encendidas");
                    }else if(numero<6){
                        System.out.println("("+numero+" Pm."+")");
                        boolean datomove=move.Funcionar();
                        luz.Detectar(datomove);
                    }
                }
                if(numero==12 && Formatohoras==true){Formatohoras=false;
                }else if(numero==12 && Formatohoras==false){Formatohoras=true;
                }
                Thread.sleep(1000);
            }
            if(System.currentTimeMillis() - tiempofinal >= 35000){
                System.out.println("Ha terminado el codigo");
                break;
            }
            numero=0;
        }
    }
    public Relojluces(){
        this.numero=0;
        this.Formatohoras=true; 
    } 
}
