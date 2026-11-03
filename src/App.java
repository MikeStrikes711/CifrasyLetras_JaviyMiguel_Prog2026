import java.util.Scanner;
public class App 
{
    //|1. MODOS DE JUEGO
    //|     MODO CONCURSO
    //|     MODO RÁPIDO

    //|2. PRUEBAS DISPONIBLES
    //|     LA CIFRA EXACTA
    //|     LA PALABRA MÁS LARGA
    //|     LA CALCULADORA HUMANA
    //|     PRUEBA ORIGINAL

    //|

    public static void main(String[] args) throws Exception 
    {   Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDOS A CIFRAS Y LETRAS");
        System.out.printf("MODOS DE JUEGO:\n[1] MODO CONCURSO\n[2] MODO RÁPIDO");
        int modo = sc.nextInt();
        switch(modo){
            case 1:
                
                break;
            case 2:

                break;
            default:
                System.out.println("Opción no válida");
        }
    }



}
