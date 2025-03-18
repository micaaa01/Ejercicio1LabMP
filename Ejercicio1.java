package Ejercicio1Lab;

import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.lang.IllegalArgumentException;

public class Ejercicio1{
    /*
     * Función que define una interfaz que recibe un arreglo de enteros
     * y devuelde una tupla con el número duplicado y el número faltante
     * en el arreglo.
     * int [] num: Arreglo de enteros.
     * return: Arreglo de enteros con el número duplicado y el número faltante.
     */
    public interface encontrarDuplicadoYFaltante{
        int [] encontrarDupYFal(int [] num);
    }
    //Definimos la clase que implementa la interfaz
    public static class DuplicadoYFaltante implements encontrarDuplicadoYFaltante{
        @Override
        public int [] encontrarDupYFal(int []num){
            Set<Integer> set = new HashSet<>();
            //valor para duplicado en caso de que no ß encuentre uno en el arreglo
            int duplicado = -1;
            //variable para 
            int n = num.length;
            if(num.length <= 2 || num.length >= 50){
                throw new IllegalArgumentException("El arreglo debe tener entre 2 y 50 elementos");
            }else{
                //Ciclo for que encuentra el duplicado
                for(int k : num){
                    if(set.add(k)){
                        //Si no se puede agregare el valor al set, entonces es un duplicado
                        duplicado = k;
                    }
                }
                //Encontrar al faltante
                int sumaEsperada = n * (n +1)/2;
                int sumaActual = 0;
                for(int k : num){
                    sumaActual += k;
                }
                int faltante = sumaEsperada - (sumaActual - duplicado);
                return new int[]{duplicado, faltante};
            }
        }
    } 
    /*
     * Función que recibe una cadenas y devuelve el prefijo común
     * más largo de las cadenas.
     * String [] cadenas: Arreglo de cadenas de texto.
     * return: String con el prefijo común más largo.
     */
    public static String prefijoComún(String[] cadenas) {
        if (cadenas == null || cadenas.length == 0) {
            return "";
        }

        String prefijo = cadenas[0];
        for (int i = 1; i < cadenas.length; i++) {
            while (cadenas[i].indexOf(prefijo) != 0) {
                prefijo = prefijo.substring(0, prefijo.length() - 1);
                if (prefijo.isEmpty()) {
                    return "";
                }
            }
        }
        return prefijo;
    }
    /*
     * Función que convierte un número romano a entero.
     */
    public static int romanoAEntero(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("El número romano no puede estar vacío");
        }

        // Validación con regex: solo permite números romanos válidos (hasta 3999)
            if (!s.matches("^(M{0,3})(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$")) {
            throw new IllegalArgumentException("Número romano inválido según las reglas");
        }

        // Mapa de valores romanos
        Map<Character, Integer> valores = Map.of(
         'I', 1, 'V', 5, 'X', 10, 'L', 50,
         'C', 100, 'D', 500, 'M', 1000
        );

        int total = 0;
        int anterior = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int actual = valores.get(s.charAt(i));
            if (actual < anterior) {
                total -= actual;
            } else {
                total += actual;
            }
            anterior = actual;
        }

        return total;
    }
    /*
     * Función que convierte un número entero a romano.
     * int entero: Número entero a convertir.
     * return: String con el número romano.
     */
    public static String enteroRomano(int entero){
        if(entero <1 || entero > 3999){
            throw new IllegalArgumentException("El número debe estar entre 1 y 3999");
        }else{
            //Creamos un arreglo de enteros con los valores de los números romanos
            int [] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9 , 5, 4, 1};
            //Creamos un arreglo de cadenas con los números romanos
            String [] romanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            
            //variable que concatenará todos lo strings resultantes
            StringBuilder resultado = new StringBuilder();

            for(int i = 0; i < valores.length; i++){
                //Mientras el número entero sea mayor o igual al valor actual
                while(entero >= valores[i]){
                    //Concatenamos el número romano correspondiente
                    resultado.append(romanos[i]);
                    //Restamos el valor al número entero
                    entero -= valores[i];
                }
            } 
            return resultado.toString();
        }
    }
}    