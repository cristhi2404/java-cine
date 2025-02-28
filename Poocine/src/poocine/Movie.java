
package poocine;

import java.util.Scanner;


public class Movie {
    Puestos asientos=new Puestos();
    
    
    public void Sala1(Scanner scanner){
        System.out.println("Pelicula 1");
        asientos.reservasSala1(scanner);
    }
    public void Sala2(Scanner scanner){
        System.out.println("Pelicula 1");
        asientos.reservasSala2(scanner);
    }
    public void Sala3(Scanner scanner){
        System.out.println("Pelicula 1");
        asientos.reservasSala3(scanner);
    }
    public void Sala4(Scanner scanner){
        System.out.println("Pelicula 1");
        asientos.reservasSala4(scanner);
    }
    public void Sala5(Scanner scanner){
        System.out.println("Pelicula 1");
        asientos.reservasSala5(scanner);
    }
}
