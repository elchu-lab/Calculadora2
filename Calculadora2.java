package genc181802.desafio2;

import java.util.Scanner;
//Usar comentarios para explicar el código
//Usar nombres de variables y funciones descriptivas

public class Calculadora2 {
    //Vamos a crear una calculadora que reciba inputs del usuario
    //Guardar los inputs en variables
    //Realizar operaciones aritméticas con estas variables

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
        return calculadora.nextInt();
    }
    public static char operacion() {
        Scanner calculadora = new Scanner(System.in);
        System.out.println("Ahora como quieres calcularlos: ");
        return calculadora.next().charAt(0);
    }

    public static void main(String[] args) {
        System.out.println("Bienvenido a la calculadora magica");
        int Numero1 = numero("Cual es el primer numero?");
        int Numero2 = numero("Cual es su segundo numero?");
        int numero3 = numero("Cual es su tercer numero?");
        char operacion = operacion();
        double resultado;

        switch (operacion) {
            case '+':
                System.out.println(suma(Numero1,Numero2));
                break;
            case '-':
                System.out.println(resta(Numero1,Numero2));
                break;
            case '*':
                System.out.println(multiplicacion(Numero1,Numero2));
                break;
            case '/':
                System.out.println(division(Numero1,Numero2));
                break;
            default:
                System.out.println("Operacion no Valida");
                return;
        }
    }



}
