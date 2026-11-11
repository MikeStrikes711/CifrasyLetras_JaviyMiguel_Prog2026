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

    // INICIALIZAR EL ACUMULADOR DE PUNTUACIONES DE LOS JUGADORES 1 Y 2
    static int puntosP1 = 0;    // PUNTOS DEL JUGADOR 1
    static int puntosP2 = 0;    // PUNTOS DEL JUGADOR 2
    public static void main(String[] args) throws Exception 
    {
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
    }
}
