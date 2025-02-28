
package poocine;

import java.util.Scanner;


public class Puestos {
    static Persona user =new Persona();
    static String acumulador;
    static int continuar;
    static boolean[] Sillasala1 =new boolean[10];
    static boolean[] Sillasala2 =new boolean[10];
    static boolean[] Sillasala3 =new boolean[10];
    static boolean[] Sillasala4 =new boolean[10];
    static boolean[] Sillasala5 =new boolean[10];
    public static int seleccion;
    public Puestos(){
        this.seleccion=0;
    }
    public static void reservasSala1(Scanner scanner){
        acumulador="";
        continuar=0;
        while(continuar==0){
            System.out.println("Seleccione la silla que desea ocupar mi rey");
            seleccion=scanner.nextInt();
            if (seleccion > 0 && seleccion <= 10 && !Sillasala1[seleccion - 1]) {
                Sillasala1[seleccion - 1] = true;
                System.out.println("Silla " + seleccion + " asignada");
                String seleccioncadena=String.valueOf(seleccion);
                acumulador=seleccioncadena+", "+acumulador;
                user.setasientos(acumulador);
            
            }else{
                 System.out.println("Selección inválida o silla ya ocupada.");
            }
            System.out.println("Desea reservar otro asiento?si(0)/no(1)");
            continuar=scanner.nextInt();
        }
    }
    public static void reservasSala2(Scanner scanner){
        continuar=0;
        while(continuar==0){
            System.out.println("Seleccione la silla que desea ocupar mi rey");
            seleccion=scanner.nextInt();
            if (seleccion > 0 && seleccion <= 10 && !Sillasala2[seleccion - 1]) {
                Sillasala2[seleccion - 1] = true;
                System.out.println("Silla " + seleccion + " asignada");
                String seleccioncadena=String.valueOf(seleccion);
                acumulador=seleccioncadena+acumulador;
                user.setasientos(acumulador);
            
            }else{
                 System.out.println("Selección inválida o silla ya ocupada.");
            }
            System.out.println("Desea reservar otro asiento?si(0)/no(1)");
            continuar=scanner.nextInt();
        }
    }
    public static void reservasSala3(Scanner scanner){
        continuar=0;
        while(continuar==0){
            System.out.println("Seleccione la silla que desea ocupar mi rey");
            seleccion=scanner.nextInt();
            if (seleccion > 0 && seleccion <= 10 && !Sillasala3[seleccion - 1]) {
                Sillasala3[seleccion - 1] = true;
                System.out.println("Silla " + seleccion + " asignada");
                String seleccioncadena=String.valueOf(seleccion);
                acumulador=seleccioncadena+acumulador;
                user.setasientos(acumulador);
            
            }else{
                 System.out.println("Selección inválida o silla ya ocupada.");
            }
            System.out.println("Desea reservar otro asiento?si(0)/no(1)");
            continuar=scanner.nextInt();
        }
    }
    public static void reservasSala4(Scanner scanner){
        continuar=0;
        while(continuar==0){
            System.out.println("Seleccione la silla que desea ocupar mi rey");
            seleccion=scanner.nextInt();
            if (seleccion > 0 && seleccion <= 10 && !Sillasala4[seleccion - 1]) {
                Sillasala4[seleccion - 1] = true;
                System.out.println("Silla " + seleccion + " asignada");
                String seleccioncadena=String.valueOf(seleccion);
                acumulador=seleccioncadena+acumulador;
                user.setasientos(acumulador);
            
            }else{
                 System.out.println("Selección inválida o silla ya ocupada.");
            }
            System.out.println("Desea reservar otro asiento?si(0)/no(1)");
            continuar=scanner.nextInt();
        }
    }
    public static void reservasSala5(Scanner scanner){
        continuar=0;
        while(continuar==0){
            System.out.println("Seleccione la silla que desea ocupar mi rey");
            seleccion=scanner.nextInt();
            if (seleccion > 0 && seleccion <= 10 && !Sillasala5[seleccion - 1]) {
                Sillasala5[seleccion - 1] = true;
                System.out.println("Silla " + seleccion + " asignada");
                String seleccioncadena=String.valueOf(seleccion);
                acumulador=seleccioncadena+acumulador;
                user.setasientos(acumulador);
            }else{
                 System.out.println("Selección inválida o silla ya ocupada.");
            }
            System.out.println("Desea reservar otro asiento?si(0)/no(1)");
            continuar=scanner.nextInt();
        }
    }
}
