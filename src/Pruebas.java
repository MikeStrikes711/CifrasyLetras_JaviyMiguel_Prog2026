import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import java.util.Random;
public class Pruebas 
{
    // INICIALIZACION DE VARIABLES ESTÁTICAS
    // Variable Random (para numeros aleatorios)
    static Random random = new Random();
    // Variable operacionMatematica (para implementar operaciones matematicas desde "Logica.java")
    static Logica operacionMatematica = new Logica();
    // Variable de entrada de teclado (SCANNER)
    static Scanner sc = new Scanner(System.in);

    //----------------------------------------------------------------------------//
    public static void laCifraExacta()
    {
        int numeroObjetivo = random.nextInt(400) + 100;
        int numeroAleatorio1 = random.nextInt(10) + 1;
        int numeroAleatorio2 = random.nextInt(10) + 1;
        int numeroAleatorio3 = random.nextInt(10) + 1;
        int numeroAleatorio4 = random.nextInt(10) + 1;
        int numeroAleatorio5 = random.nextInt(10) + 1;
        int numeroAleatorio6 = random.nextInt(10) + 1;
        int numero1;
        int numero2;
        int totalP1 = 0;
        int totalP2 = 0;
        int distanciaP1 = totalP1 - numeroObjetivo;
        int distanciaP2 = totalP2 - numeroObjetivo;
        
        // TURNO DEL JUGADOR 1
        // 1. SELECCIONA 2 NÚMEROS (numero1 y numero2)
        // 1.1. NUMERO 1
        System.out.printf("\n #####( TURNO DEL JUGADOR NUMERO 1 )#####");
        System.out.printf("\nSelecciona dos números de los siguientes ");
        System.out.printf("introduciendo la tecla correspondiente");
        System.out.printf("\nNUMERO 1:");
        System.out.printf("\n[1]" + numeroAleatorio1 +" \n[2]" + numeroAleatorio2);
        System.out.printf("\n[3]" + numeroAleatorio3 +"\n[4]" + numeroAleatorio4);
        System.out.printf("\n[5]" + numeroAleatorio5 +"\n[6]" + numeroAleatorio6);
        System.out.printf("\nTu respuesta: ");
        int numCaseP1 = sc.nextInt();
        switch (numCaseP1) 
        {
            case 1:
                numero1 = numeroAleatorio1;
                break;
            case 2:
                numero1 = numeroAleatorio2;
                break;
            case 3:
                numero1 = numeroAleatorio3;
                break;
            case 4:
                numero1 = numeroAleatorio4;
                break;
            case 5:
                numero1 = numeroAleatorio5;
                break;
            case 6:
                numero1 = numeroAleatorio6;
                break;
            default:
                numero1 = 0;
                break;
        }
        for (int i = 0; i < 5; i++) 
        {
            System.out.println("Intento numero " + i);
            //1.2. NUMERO 2
            System.out.printf("\nNUMERO 2:");
            System.out.printf("\n[1]" + numeroAleatorio1 +" \n[2]" + numeroAleatorio2);
            System.out.printf("\n[3]" + numeroAleatorio3 +"\n[4]" + numeroAleatorio4);
            System.out.printf("\n[5]" + numeroAleatorio5 +"\n[6]" + numeroAleatorio6);
            System.out.printf("\nTu respuesta: ");
            int numCaseP12 = sc.nextInt();
            switch (numCaseP12) 
            {
                case 1:
                    numero2 = numeroAleatorio1;
                    break;
                case 2:
                    numero2 = numeroAleatorio2;
                    break;
                case 3:
                    numero2 = numeroAleatorio3;
                    break;
                case 4:
                    numero2 = numeroAleatorio4;
                    break;
                case 5:
                    numero2 = numeroAleatorio5;
                    break;
                case 6:
                    numero2 = numeroAleatorio6;
                    break;
                default:
                    numero2 = 0;
                    break;
            }
            // 1.3. OPERACIONES MATEMATICAS
            System.out.println("Ahora, deberás elegir una operación matemática:");
            System.out.printf("\n[1] SUMA\n[2] RESTA");
            System.out.printf("\n[3] MULTIPLICACIÓN\n[4] DIVIDR");
            System.out.printf("\nTu respuesta: ");
            int numCaseP13 = sc.nextInt();
            switch (numCaseP13)
            {
                case 1:
                    totalP1 += operacionMatematica.sumar(numero1, numero2);
                    break;
                case 2:
                    totalP1 += operacionMatematica.restar(numero1, numero2);
                    break;
                case 3:
                    totalP1 += operacionMatematica.multiplicar(numero1, numero2);
                    break;
                case 4:
                    totalP1 += operacionMatematica.dividir(numero1, numero2);
                    break;
                default:
                    totalP1 = 0;
                    break;
            }
        }
        System.out.println("Tu resultado es: " + totalP1);

        //#########################################################################//
        // TURNO DEL JUGADOR 2
        // 2. SELECCIONA 2 NÚMEROS (numero1 y numero2)
        // 2.1. NUMERO 1
        System.out.printf("\n #####[ TURNO DEL JUGADOR NUMERO 2 ]#####");
        System.out.printf("\nSelecciona dos números de los siguientes ");
        System.out.printf("introduciendo la tecla correspondiente");
        System.out.printf("\nNUMERO 1:");
        System.out.printf("\n[1]" + numeroAleatorio1 +" \n[2]" + numeroAleatorio2);
        System.out.printf("\n[3]" + numeroAleatorio3 +"\n[4]" + numeroAleatorio4);
        System.out.printf("\n[5]" + numeroAleatorio5 +"\n[6]" + numeroAleatorio6);
        System.out.printf("\nTu respuesta: ");
        int numCaseP2 = sc.nextInt();
        switch (numCaseP2) 
        {
            case 1:
                numero1 = numeroAleatorio1;
                break;
            case 2:
                numero1 = numeroAleatorio2;
                break;
            case 3:
                numero1 = numeroAleatorio3;
                break;
            case 4:
                numero1 = numeroAleatorio4;
                break;
            case 5:
                numero1 = numeroAleatorio5;
                break;
            case 6:
                numero1 = numeroAleatorio6;
                break;
            default:
                numero1 = 0;
                break;
        }
        for (int i = 0; i < 5; i++) 
        {
            System.out.println("Intento numero " + i);
            //2.2. NUMERO 2
            System.out.printf("\nNUMERO 2:");
            System.out.printf("\n[1]" + numeroAleatorio1 +" \n[2]" + numeroAleatorio2);
            System.out.printf("\n[3]" + numeroAleatorio3 +"\n[4]" + numeroAleatorio4);
            System.out.printf("\n[5]" + numeroAleatorio5 +"\n[6]" + numeroAleatorio6);
            System.out.printf("\nTu respuesta: ");
            int numCaseP22 = sc.nextInt();
            switch (numCaseP22) 
            {
                case 1:
                    numero2 = numeroAleatorio1;
                    break;
                case 2:
                    numero2 = numeroAleatorio2;
                    break;
                case 3:
                    numero2 = numeroAleatorio3;
                    break;
                case 4:
                    numero2 = numeroAleatorio4;
                    break;
                case 5:
                    numero2 = numeroAleatorio5;
                    break;
                case 6:
                    numero2 = numeroAleatorio6;
                    break;
                default:
                    numero2 = 0;
                    break;
            }
            // 2.3. OPERACIONES MATEMATICAS
            System.out.println("Ahora, deberás elegir una operación matemática:");
            System.out.printf("\n[1] SUMA\n[2] RESTA");
            System.out.printf("\n[3] MULTIPLICACIÓN\n[4] DIVIDR");
            System.out.printf("\nTu respuesta: ");
            int numCaseP23 = sc.nextInt();
            switch (numCaseP23)
            {
                case 1:
                    totalP2 += operacionMatematica.sumar(numero1, numero2);
                    break;
                case 2:
                    totalP2 += operacionMatematica.restar(numero1, numero2);
                    break;
                case 3:
                    totalP2 += operacionMatematica.multiplicar(numero1, numero2);
                    break;
                case 4:
                    totalP2 += operacionMatematica.dividir(numero1, numero2);
                    break;
                default:
                    totalP2 = 0;
                    break;
            }
        }
        System.out.println("Tu resultado es: " + totalP2);
        System.out.println("El número objetivo era " + numeroObjetivo);

        // 3. RESULTADOS FINALES (COMPARACION)
        if (distanciaP1 < distanciaP2) 
        {
            System.out.println("¡¡¡ EL GANADOR ES EL JUGADOR 1 !!!");
            App.puntosP1+= 1;
        }
        else
        {
            System.out.println("¡¡¡ EL GANADOR ES EL JUGADOR 2 !!!");
            App.puntosP2+= 1;
        }
    }
    // 2. LA PALABRA MÁS LARGA
}
