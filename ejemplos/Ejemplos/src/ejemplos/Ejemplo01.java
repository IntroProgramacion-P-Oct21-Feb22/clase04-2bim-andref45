/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        obtenerMultiplicacion(10, 20);
        String miNombre = obtenerNombre();
        String miCiudad = ObtenerCiudadMayuscula("Loja");
        System.out.printf("%s\n", miCiudad);
    }

    public void obtenerSuma() {

    }

    public static void obtenerMultiplicacion(int tabla, int limite) {

    }

    public static String obtenerNombre() {
        return "A";
    }

    public static String ObtenerCiudadMayuscula(String a) {
        return a.toUpperCase();
    }

}
