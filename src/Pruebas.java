import java.util.Scanner;
import java.util.Random;
public class Pruebas 
{
    // INICIALIZACION DE VARIABLES ESTÁTICAS
    // Variable Random (para numeros aleatorios)
    static Random random = new Random();
    //Variable operacionMatematica (para implementar operaciones matematicas desde "Logica.java")
    static Logica operacionMatematica = new Logica();

    //----------------------------------------------------------------------------//
    public static int laCifraExacta(int numero1, int numero2)
    {
        int numeroAleatorio = random.nextInt(900) + 100;
        int numeroAleatorio1 = random.nextInt(10) + 1;
        int numeroAleatorio2 = random.nextInt(10) + 1;
        int numeroAleatorio3 = random.nextInt(10) + 1;
        int numeroAleatorio4 = random.nextInt(10) + 1;
        int numeroAleatorio5 = random.nextInt(10) + 1;
        int numeroAleatorio6 = random.nextInt(10) + 1;
        System.out.printf("Selecciona dos números de los siguientes ");
        System.out.printf("introduciendo la tecla correspondiente\n");
        System.out.println("Numero 1: [1] [2] [3] [4] [5] [6]");
        Scanner sc = new Scanner(System.in);
        int numCase = sc.nextInt();
        switch (numCase) 
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
                break;
        }
        System.out.println("Numero 2: [1] [2] [3] [4] [5] [6]");
        int numCase2 = sc.nextInt();
        switch (numCase2) 
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
                break;
        }
        System.out.println("Ahora, deberás elegir una operación matemática:");
        System.out.printf("\n[1] SUMA\n[2] RESTA");
        System.out.printf("\n[3] MULTIPLICACIÓN\n[4] DIVIDR");
        int numCase3 = sc.nextInt();
        switch (numCase3)
        {
            case 1:
                
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            default:
                break;
        }
    }
    // 2. LA PALABRA MÁS LARGA
}
