
package poocine;

import java.util.ArrayList;
import java.util.Scanner;
public class Poocine {
    
    public static int eleccionpelicula;
    static Persona user =new Persona();
    static ArrayList<String> Userrecibo =new ArrayList();
    
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Movie Salas =new Movie();
        int continuar=0;
        while(continuar==0){
            Menumovies();
            Adduser(scanner);
            System.out.println("Que pelicua es la que deseas ver?");
            eleccionpelicula=scanner.nextShort();
            scanner.nextLine();
            switch (eleccionpelicula){
                case 1:
                    Salas.Sala1(scanner);
                    break;
                case 2:
                    Salas.Sala2(scanner);
                    break;
                case 3:
                    Salas.Sala3(scanner);
                    break;
                case 4:
                    Salas.Sala4(scanner);
                    break;
            }
            System.out.println("Desea agregar a otro cliente?si(0)/no(1)/imprimir datos(3)");
            continuar=scanner.nextShort();
            scanner.nextLine();
        }
        if(continuar==3){
            Userrecibo=user.GetDatos();
            Imprimirinfo(Userrecibo);

        }
        
    }
    public Poocine(){
        this.eleccionpelicula=0;
    }  
    public static void Menumovies(){
        System.out.println("Code de cristhian ferrer");
        System.out.println("El menu de peliculas es el siguiente :\n1- pelicula 1\n 2- pelicula \n3- pelicula 3\n4- pelicula 4\n5- pelicula 5 ");
    }
    public static void Adduser(Scanner scanner){
        
        System.out.println("Bienvenido new user ingresa tu name");
        String Nameuser=scanner.nextLine();
        user.SetNombre(Nameuser);
        System.out.println("ingresa tu cedula para completar el registro");
        String iduser=scanner.nextLine();
        user.Setid(iduser);
    }
    public static void Imprimirinfo(ArrayList<String> Userrecibo){
        System.out.println(Userrecibo);
    }
}
