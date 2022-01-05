/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo041 {

    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        int primervalor;
        int segundovalor;

        System.out.println("Ingrese el valor de el primer número");
        primervalor = entrada.nextInt();

        System.out.println("Ingrese el valor de el segundo número");
        segundovalor = entrada.nextInt();

        obtenerMultiplicacion(primervalor, segundovalor);

    }

    public static void obtenerMultiplicacion(int a, int b) {
        int resultado;
        resultado = a * b;
        System.out.printf("El valor de la multiplicación es: %d\n", resultado);

    }

}
