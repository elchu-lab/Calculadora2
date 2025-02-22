package genc181802.desafio2;

import java.util.Scanner;

public class Calculadora2 {

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    private static double multiplicacion(double a, double b) {
        return a * b;
    }
    private static double multiplicacion(double a, double b, double c) {
        return a * b * c;}

    protected static float division(float a, float b) {
        return a/b;
    }
    public static int numero(String mensaje) {
        Scanner calculadora = new Scanner(System.in);
        System.out.println(mensaje);
        calculadora.close();
        return calculadora.nextInt();
    }
    public static char operacion() {
        Scanner calculadora = new Scanner(System.in);
        System.out.println("Ahora como quieres calcularlos: ");
        calculadora.close();
        return calculadora.next().charAt(0);
    }

    public static void entradaMatematicaUsuario(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce la operacion: ");
        String linea = entrada.nextLine(); 
        String[] partes = linea.split(" "); //Separar por espacios
        char operador = partes[1].charAt(0);
        switch (operador) {
            case '+':
                System.out.println(suma(Integer.parseInt(partes[0]), Integer.parseInt(partes[2])));
                break;
            case '-':
                System.out.println(resta(Integer.parseInt(partes[0]), Integer.parseInt(partes[2])));
                break;
            case '*':
            if (partes.length == 3) {
                System.out.println(multiplicacion(Double.parseDouble(partes[0]), Double.parseDouble(partes[2])));
            } else {System.out.println(multiplicacion(Double.parseDouble(partes[0]), Double.parseDouble(partes[2]), Double.parseDouble(partes[4])));

            }
            break;
            case '/':    
                System.out.println(division(Float.parseFloat(partes[0]), Float.parseFloat(partes[2])));
                break;
            default:
                throw new AssertionError();
        }
        
        entrada.close();
        
    }

    public static void main(String[] args) {
        entradaMatematicaUsuario();
    }
}
