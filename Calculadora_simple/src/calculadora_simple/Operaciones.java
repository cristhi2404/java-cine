package calculadora_simple;
import java.util.Scanner;
public class Operaciones {
    static Historia history =new Historia();
    private static double numero1;
    private static double numero2;
    private static double resultado;
    public Operaciones(){
        this.numero1=0;
        this.numero2=0;
        this.resultado=0;
    }
    public void numeros(double dato1, double dato2){
        this.numero1=dato1;
        this.numero2=dato2;
    }
    public void suma(Scanner scanner){
        String num1=String.valueOf(numero1);
        String num2=String.valueOf(numero2);
        resultado=numero1+numero2;
        String result=String.valueOf(resultado);
        String acumulado=("("+num1+" + "+num2+" = "+result+")"+" .");
        System.out.println(acumulado);
        history.Guardardatos(acumulado);
    }
    public void resta(Scanner scanner){
        String num1=String.valueOf(numero1);
        String num2=String.valueOf(numero2);
        resultado=numero1-numero2;
        String result=String.valueOf(resultado);
        String acumulado=("("+num1+" - "+num2+" = "+result+")"+" .");
        System.out.println(acumulado);
        history.Guardardatos(acumulado);
    }
    public void multiplicacion(Scanner scanner){
        String num1=String.valueOf(numero1);
        String num2=String.valueOf(numero2);
        resultado=numero1*numero2;
        String result=String.valueOf(resultado);
        String acumulado=("("+num1+" * "+num2+" = "+result+")"+" .");
        System.out.println(acumulado);
        history.Guardardatos(acumulado);
    }
    public void Division(Scanner scanner){
        String num1=String.valueOf(numero1);
        String num2=String.valueOf(numero2);
        resultado=numero1/numero2;
        String result=String.valueOf(resultado);
        String acumulado=("("+num1+" / "+num2+" = "+result+")"+" .");
        System.out.println(acumulado);
        history.Guardardatos(acumulado);
    }
}
