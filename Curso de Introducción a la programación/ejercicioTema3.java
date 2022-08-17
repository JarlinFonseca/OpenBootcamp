/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jarlin
 */
public class ejercicioTema3 {
    public static void main(String[] args) {
        // Primera parte
       int resultadoSuma = suma(10,70,20);
       System.out.println("El resultado de la suma de los 3 valores es: "+resultadoSuma);
        
       //Segunda parte
       Coche vehiculo = new Coche(0);
       vehiculo.incrementarNumeroPuertas();
        System.out.println("El numero de puertas del coche es: "+vehiculo.numeroPuertas);
        
    }
    
     // Primera parte
    public static int suma(int a, int b, int c){
       int suma = a+b+c;
       return suma;
    }   
}

//Segunda parte
class Coche{
    protected String placa, modelo, marca;
    protected int numeroPuertas;
    
    public Coche(int numeroPuertas){
        this.numeroPuertas = numeroPuertas;
    }
    
    public void incrementarNumeroPuertas(){
        this.numeroPuertas++;
    }
}
