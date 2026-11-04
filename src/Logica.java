import java.util.Random;
import java.util.Scanner;

public class Logica {
    
    public int sumar(int num1, int num2) {
        int suma = num1 + num2;
        return suma;

    }

    public int restar(int num1, int num2){
        int resta = num1 - num2;
        return resta;
    }

    public int multiplicar(int num1, int num2){
        int multiplicacion = num1 * num2;
        return multiplicacion;
    }

    public int dividir(int num1, int num2){
        int division = num1 / num2;
        if(num2 == 0){
            System.out.println("No es posible dividir entre 0");
        }
        return division;
    }

    public int calculadora(int num1, int num2){
        Random random = new Random();
        int NumeroInicial = random.nextInt(100) + 1;
        int NumeroAuxiliar = random.nextInt(100) + 1;
        num1 = NumeroInicial;
        num2 = NumeroAuxiliar;
        int opcion = random.nextInt(4) + 1;
        switch(opcion){
            
        }

    }
}