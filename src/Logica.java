import java.util.Random;
import java.util.Scanner;

public class Logica {
    
    // PROCESO DE SUMA
    public int sumar(int num1, int num2) {
        int suma = num1 + num2;
        return suma;

    }

    // PROCESO DE RESTA
    public int restar(int num1, int num2) {
        int resta = num1 - num2;
        return resta;
    }

    // PROCESO DE MULTIPLICACIÓN
    public int multiplicar(int num1, int num2) {
        int multiplicacion = num1 * num2;
        return multiplicacion;
    }

    // PROCESO DE DIVISIÓN
    public int dividir(int num1, int num2) {
        int division = num1 / num2;
        if (num2 == 0) {
            System.out.println("No es posible dividir entre 0");
        }
        return division;
    }

    // PROCESO DE CALCULADORA
    public int calculadora(int num1, int operacion) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num2;
        int resultado;

        switch (operacion) {
            case 1:

                num2 = random.nextInt(90) + 10;
                resultado = sumar(num1, num2);
                System.out.printf("\n¿Cuánto es " + num1 + "+" + num2 + "?");
            break;
           

            case 2:

                num2 = random.nextInt(90) + 10;
                resultado = restar(num1, num2);
                System.out.printf("\n¿Cuánto es " + num1 + "-" + num2 + "?");
            break;
            

            case 3:

                num2 = random.nextInt(9) + 1;
                resultado = multiplicar(num1, num2);
                System.out.printf("\n¿Cuánto es " + num1 + "*" + num2 + "?");
            break;
            

            default:

                num2 = random.nextInt(9) + 1;
                resultado = dividir(num1, num2);
                System.out.printf("\n¿Cuánto es " + num1 + "/" + num2 + "?");
            break;
            
        }
        return resultado;
    }

    // LOGOTIPO
    public static void logo()
    {  
        System.out.println(",___________________________________________________________________________________________________.");
        System.out.println("|o                                                                                                 o|");
        System.out.println("|    _/          _/_/    _/_/_/_/      _/  _/_/       _/_/_/        _/_/_/                 _/    _/ |");   
        System.out.println("|   _/        _/_/_/_/    _/          _/_/         _/    _/      _/_/                     _/    _/  |");   
        System.out.println("|  _/        _/          _/          _/           _/    _/          _/_/                 _/    _/   |");   
        System.out.println("| _/_/_/_/    _/_/_/      _/_/      _/             _/_/_/      _/_/_/                     _/_/_/    |");   
        System.out.println("|                                                                                            _/     |");   
        System.out.println("|                                                                                       _/_/        |");                                                               
        System.out.println("|      _/_/_/       _/         _/_/                                                                 |");   
        System.out.println("|   _/                      _/           _/  _/_/       _/_/_/        _/_/_/                        |");   
        System.out.println("|  _/             _/     _/_/_/_/       _/_/         _/    _/      _/_/                             |");   
        System.out.println("| _/             _/       _/           _/           _/    _/          _/_/                          |");   
        System.out.println("|  _/_/_/       _/       _/           _/             _/_/_/      _/_/_/                             |");
        System.out.println("|o_________________________________________________________________________________________________o|");                                                                       
    }
}