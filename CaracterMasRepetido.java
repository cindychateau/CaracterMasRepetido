/*
   Crear una función que reciba como parámetro un string. Esta función se encarga
   de returnar el caracter más repetido dentro del string. Si hay un empate retornar
   únicamente uno de ellos. 
*/
import java.util.HashMap;

public class CaracterMasRepetido {
    /*
    texto = "Hoolaaa"
    letras = {}
    texto = "hoolaaa"
    
    i=0
    letra = "h"
    letras = {
        "h": 1
    }

    i=1
    letra = "o"
    letras = {
        "h": 1,
        "o": 1
    }

    i=2
    letra = "o"
    conteo = 1
    conteo = 2
    letras = {
        "h": 1,
        "o": 2
    }

    i=3
    letra = "l"
    letras = {
        "h": 1,
        "o": 2,
        "l": 1
    }

    i=4
    letra = "a"
    letras = {
        "h": 1,
        "o": 2,
        "l": 1,
        "a": 1
    }

    i=5
    letra = "a"
    conteo = 1
    conteo = 2
    letras = {
        "h": 1,
        "o": 2,
        "l": 1,
        "a": 2
    }

    i=6
    letra = "a"
    conteo = 2
    conteo = 3
    letras = {
        "h": 1,
        "o": 2,
        "l": 1,
        "a": 3
    }

    repetidos = 0
    letraRepetida = ' '

    letra = "h"
    repetidos = 1
    letraRepetida = "h"

    letra = "o"
    repetidos = 2
    letraRepetida = "o"

    letra = "l"

    letra = "a"
    repetidos = 3
    letraRepetida = "a"


    Existe letras['a'] = NULL

     */
    public static char encuentraCaracterMasRepetido(String texto){
        HashMap<Character, Integer> letras = new HashMap<Character, Integer>();

        texto = texto.toLowerCase();

        for(int i=0; i<texto.length(); i++){

            char letra = texto.charAt(i);
            if(letras.get(letra) == null){
                letras.put(letra, 1);
            }else{
                int conteo = letras.get(letra);
                conteo++;
                letras.put(letra, conteo);
            }

        }

        int repetidos = 0;
        char letraRepetida = ' ';
        
        for (char letra:letras.keySet()) {
            if(repetidos < letras.get(letra)){
                repetidos = letras.get(letra);
                letraRepetida = letra;
            }

        }

        return letraRepetida;

    }

    public static void main(String args[]){
        String texto = "Hoolaaa";
        System.out.println(encuentraCaracterMasRepetido(texto));
    }


}