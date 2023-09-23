/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;

/**
 *
 * @author yaneth
 */
import java.util.Random;
import java.util.Scanner;

public class SumaAleatoria {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(101); // Genera un número aleatorio entre 0 y 100
        int num2 = random.nextInt(101); // Genera otro número aleatorio entre 0 y 100
        int resultadoEsperado = num1 + num2; // Calcula la suma esperada

        System.out.println("cual es la respuesta al siguiente problema?");
        System.out.print(num1 + " + " + num2 + " = ? ");

        try {
            Scanner scanner = new Scanner(System.in);
            int respuestaUsuario = scanner.nextInt(); // Lee la respuesta del usuario
            scanner.close();

            if (respuestaUsuario == resultadoEsperado) {
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Disculpa, respuesta equivocada. La respuesta correcta es " + resultadoEsperado + ".");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Ingresa un número válido.");
            System.exit(0);
        }
    }
}