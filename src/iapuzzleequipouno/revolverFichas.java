
package iapuzzleequipouno;

//Hecho por el EQUIPO UNO:
    //Burboa Astorga Ricardo
    //Luna García Pedro Alfonso
    //Vázquez Chávez Michael Alexsandro
//Inteligencia Artificial 7IS-01V
//Puzzle 3x3

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class revolverFichas {
    
    public static void randomizeArray(Integer[] arregloFichas) {
        //Revuelvo los elementos en el arreglo.
        List<Integer> fichasRevueltas = Arrays.asList(arregloFichas);
        Collections.shuffle(fichasRevueltas);
        System.out.println("Las fichas revueltas quedan de la siguiente manera = " + fichasRevueltas);
    }
    
}
