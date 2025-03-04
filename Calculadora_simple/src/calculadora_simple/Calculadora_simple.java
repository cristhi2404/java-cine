
package calculadora_simple;

import java.util.ArrayList;
import java.util.Scanner;
public class Calculadora_simple {
    static int Continuar;
    static ArrayList<String> imprimir=new ArrayList();
    public static int seleccion;
    static Operaciones operaciones=new Operaciones();
    static Historia historia =new Historia(); 
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Continuar=0;
        while(Continuar==0){
            Recibirinfo(scanner);
            System.out.println("que operacion desea realizar\n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division");
            seleccion=scanner.nextInt();
            switch (seleccion){
                case 1:
                    operaciones.suma(scanner);
                    break;
                case 2:                    
                    operaciones.resta(scanner);
                    break;
                case 3:                   
                    operaciones.multiplicacion(scanner);
                    break;
                case 4:
                    operaciones.Division(scanner);
                    break;
            }
            System.out.println("Desea hacer otra operacion??si(0)/no(1)/imprimir datos(3)");
            Continuar=scanner.nextInt();
        }
        if (Continuar==3){
           imprimir=historia.getdatos();
            System.out.println(imprimir);
        }
    }
    public Calculadora_simple(){
        this.seleccion=0;
    }
    public static void Recibirinfo(Scanner scanner){
        System.out.println("Ingrese el numero 1");
        double numero1=scanner.nextDouble();
        System.out.println("Ingrese el numero 2");
        double numero2=scanner.nextDouble();
        operaciones.numeros(numero1, numero2);
    }
}
