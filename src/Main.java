import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            // Crear un array para almacenar los números
            int[] numeros = new int[10];

            // Solicitar al usuario ingresar 10 números
            System.out.println("Ingrese 10 números:");

            for (int i = 0; i < 10; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
            }

            // Ordenar los números primos al principio
            ordenarNumerosPrimos(numeros);

            // Mostrar el array con los números primos al principio
            mostrarArray(numeros);
        }

        // Función para mostrar el array con posición y valor
        private static void mostrarArray ( int[] array){
            for (int i = 0; i < array.length; i++) {
                System.out.println(i + " - " + array[i]);
            }
        }

        // Función para ordenar los números primos al principio del array
        private static void ordenarNumerosPrimos ( int[] array){
            int[] resultado = new int[array.length];
            int indicePrimos = 0;
            int indiceNoPrimos = array.length - 1;

            for (int i = 0; i < array.length; i++) {
                if (esPrimo(array[i])) {
                    resultado[indicePrimos++] = array[i];
                } else {
                    resultado[indiceNoPrimos--] = array[i];
                }
            }

            // Copiar el array resultado de vuelta al original
            System.arraycopy(resultado, 0, array, 0, array.length);
        }

        // Función para verificar si un número es primo
        private static boolean esPrimo ( int numero){
            if (numero <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
