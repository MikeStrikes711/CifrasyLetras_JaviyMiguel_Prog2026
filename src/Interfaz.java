import java.util.Random;
import java.util.Scanner;

public class Interfaz {

    // INICIALIZAR VARIABLES ESTÁTICAS
    static int puntosP1 = App.puntosP1; // PUNTOS DEL JUGADOR 1
    static int puntosP2 = App.puntosP2; // PUNTOS DEL JUGADOR 2


    public static void inicio() {
        System.out.printf("\nBienvenido a LETRAS Y CIFRAS\nSelecciona que modo deseas jugar:\n");
        System.out.printf("[1] Modo Concurso\n[2] Modo Rápido\n");
        Scanner sc = new Scanner(System.in);
        int modo = sc.nextInt();
            switch (modo) {
                case 1:
                    System.out.println("Elegiste Modo Concurso");
                    ModoConcurso();
                    break;
                case 2:
                    System.out.println("Elegiste Modo Rápido");
                    ModoRapido();
                    break;
                default:
                    System.out.println("No elegiste ningún modo");
                    break;
            }
    }

    public static void ModoConcurso() {
        Pruebas.laCifraExacta();
        System.out.printf("\nMARCADORES: " +
                "\n[JUGADOR 1]: " + puntosP1 +
                "\n[JUGADOR 2]: " + puntosP2 +
                "\n");
        Pruebas.laPalabraMasLarga();
        System.out.printf("\nMARCADORES: " +
                "\n[JUGADOR 1]: " + puntosP1 +
                "\n[JUGADOR 2]: " + puntosP2 +
                "\n");
        Pruebas.laCalculadoraHumana();
        System.out.printf("\nMARCADORES: " +
                "\n[JUGADOR 1]: " + puntosP1 +
                "\n[JUGADOR 2]: " + puntosP2 +
                "\n");
        Pruebas.adivinarNumero();
        System.out.printf("\nMARCADORES: " +
                "\n[JUGADOR 1]: " + puntosP1 +
                "\n[JUGADOR 2]: " + puntosP2 +
                "\n");
    }

    public static void ModoRapido() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("[1]Aleatoriamente o [2]Elegir modo");
        int numero = sc.nextInt();
        if (numero == 1) {
            int prueba = random.nextInt(4) + 1;
            switch (prueba) {
                case 1:
                    Pruebas.laCifraExacta();
                    System.out.printf("\nMARCADORES: " +
                            "\n[JUGADOR 1]: " + puntosP1 +
                            "\n[JUGADOR 2]: " + puntosP2 +
                            "\n");
                    break;
                case 2:
                    Pruebas.laPalabraMasLarga();
                    System.out.printf("\nMARCADORES: " +
                            "\n[JUGADOR 1]: " + puntosP1 +
                            "\n[JUGADOR 2]: " + puntosP2 +
                            "\n");
                    break;
                case 3:
                    Pruebas.laCalculadoraHumana();
                    System.out.printf("\nMARCADORES: " +
                            "\n[JUGADOR 1]: " + puntosP1 +
                            "\n[JUGADOR 2]: " + puntosP2 +
                            "\n");
                    break;
                default:
                    Pruebas.adivinarNumero();
                    System.out.printf("\nMARCADORES: " +
                            "\n[JUGADOR 1]: " + puntosP1 +
                            "\n[JUGADOR 2]: " + puntosP2 +
                            "\n");
                    break;
            }
        }

        if (numero == 2) {
            System.out.printf("\n[1] La cifra exacta" + " \n[2] La palabra más larga");
            System.out.printf("\n[3] La calculadora humana" + "\n[4] Adivinar la Cifra\n");
            int prueba = sc.nextInt();
            switch (prueba) {
                case 1:
                    Pruebas.laCifraExacta();
                    System.out.printf("\nMARCADORES: " +
                            "\n[JUGADOR 1]: " + puntosP1 +
                            "\n[JUGADOR 2]: " + puntosP2 +
                            "\n");
                    break;
                case 2:
                    Pruebas.laPalabraMasLarga();
                    System.out.printf("\nMARCADORES: " +
                            "\n[JUGADOR 1]: " + puntosP1 +
                            "\n[JUGADOR 2]: " + puntosP2 +
                            "\n");
                    break;
                case 3:
                    Pruebas.laCalculadoraHumana();
                    System.out.printf("\nMARCADORES: " +
                            "\n[JUGADOR 1]: " + puntosP1 +
                            "\n[JUGADOR 2]: " + puntosP2 +
                            "\n");
                    break;
                case 4:
                    Pruebas.adivinarNumero();
                    System.out.printf("\nMARCADORES: " +
                            "\n[JUGADOR 1]: " + puntosP1 +
                            "\n[JUGADOR 2]: " + puntosP2 +
                            "\n");
                    break;
                default:
                    System.out.println("No elegiste ninguna prueba");
                    break;
            }
        }
    }
}
