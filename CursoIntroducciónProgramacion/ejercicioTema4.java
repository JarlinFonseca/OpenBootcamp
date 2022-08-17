package CursoIntroducciónProgramacion;

import java.util.*;

/**
 *
 * @author Jarlin
 */
public class ejercicioTema4 {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in, "UTF-8");

        System.out.println("Escriba un número para identificar si es positivo, "
                + "negativo o cero:");
        int numeroIf = sc.nextInt();
        var resultadoNum = getNumberIf(numeroIf);
        System.out.println(resultadoNum + '\n');

        
        System.out.println("Lista de números generados por el while:");
        int numerosWhile[] = getNumerosWhile();
        for (int i = 0; i < numerosWhile.length; i++) {
            System.out.println(numerosWhile[i]);
        }
        System.out.println();

        
        System.out.println("Número generado por el Do While(se ejecuta una sola vez):");
        var num = getNumeroDoWhile();
        System.out.println(num);
        System.out.println();
        
        System.out.println("Lista de números generados por el for:");
        int numerosFor[] = getNumerosFor();
        for (int i = 0; i < numerosFor.length; i++) {
            System.out.println(numerosFor[i]);
        }
        System.out.println();
        
        System.out.println("Escriba una estación del año: ");
        String estacion = sc.next();
        String resultado = getEstacionSwitch(estacion);
        System.out.println(resultado);
        
    }

    public static String getNumberIf(int numeroIf) {
        String resultado = "";
        if (numeroIf > 0) {
            resultado = "El número es positivo";
        } else if (numeroIf < 0) {
            resultado = "El número es negativo";
        } else {
            resultado = "El número es 0";
        }

        return resultado;
    }

    public static int[] getNumerosWhile() {

        int array[] = new int[3];

        int numeroWhile = 0;
        while (numeroWhile < 3) {
            array[numeroWhile] = numeroWhile;
            numeroWhile++;
        }

        return array;
    }
    
    public static int getNumeroDoWhile(){
    
         int numeroDoWhile= 3;
         int result=0;
        do{
            result = numeroDoWhile;
            numeroDoWhile++;
        }while(numeroDoWhile < 3); 
        
        return result;
    }
    
      public static int[] getNumerosFor() {

        int array[] = new int[4];

          for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
              array[numeroFor] = numeroFor;
          }

        return array;
    }
      
      public static String getEstacionSwitch(String estacion){
          // Forma tradicional de switch
          /*
          String mensajeEstacion;
          switch(estacion){
              case "verano":
                 mensajeEstacion = "Se encuentra en la estación: "+estacion;
                 break;
              case "invierno":
                 mensajeEstacion = "Se encuentra en la estación: "+estacion;
                 break;
              case "primavera":
                 mensajeEstacion = "Se encuentra en la estación: "+estacion;
                 break;
              case "otoño":
                 mensajeEstacion = "Se encuentra en la estación: "+estacion;
                 break;
              default:
                  mensajeEstacion = "NO es una estación"; 
          }
            */
          
          // Nueva forma de switch
          String mensajeEstacion;
          mensajeEstacion = switch (estacion) {
            case "verano" -> "Se encuentra en la estación: "+estacion;
            case "invierno" -> "Se encuentra en la estación: "+estacion;
            case "primavera" -> "Se encuentra en la estación: "+estacion;
            case "otoño" -> "Se encuentra en la estación: "+estacion;
            default -> "NO es una estación";
        };
          return mensajeEstacion;
      }  
}
