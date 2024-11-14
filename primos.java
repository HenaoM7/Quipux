import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47);
        
        List<Integer> primos = obtenerNumerosPrimos(numeros);
        System.out.println("Números primos en la lista: " + primos);
    }

    public static boolean esPrimo(int numero) {
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

    public static List<Integer> obtenerNumerosPrimos(List<Integer> numeros) {
        List<Integer> primos = new ArrayList<>();
        for (int numero : numeros) {
            if (esPrimo(numero)) {
                primos.add(numero);  // Agregar el número primo a la lista
            }
        }
        return primos;
    }
}
