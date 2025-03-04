
package poofizz;


public class  Poofizz {

    public static int numero;
    public static void main(String[] args) {
        while(numero<100){
            numero=numero+1;
            if(numero!=0 && numero%3==0 && numero%5==0){
                System.out.println(numero+" Fizz Buzz");
            }else if(numero%5==0 && numero%3!=0){
                System.out.println(numero+" Buzz");
            }else if(numero%3==0 && numero%5!=0){
                System.out.println(numero+" Fizz ");
            }else{
                System.out.println(numero+" ");
            }
           
        }
    }
    public Poofizz(){
        this.numero=0;
    }
}
