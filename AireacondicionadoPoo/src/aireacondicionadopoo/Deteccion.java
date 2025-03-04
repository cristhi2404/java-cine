/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aireacondicionadopoo;

/**
 *
 * @author EQUIPO
 */
public class Deteccion {
    
    public Deteccion(){
        
    }
    public void Precesarinfo(int datohumedad, int datotemp){
        if(datohumedad>60 && datotemp>28 && datotemp<30){
            System.out.println("Encendendo aire acondicionado");
        }else if(datotemp>30){
            System.out.println("Encender aire acondicionado");
        }else{
            System.out.println("aire apagado");
        }
    }
}
