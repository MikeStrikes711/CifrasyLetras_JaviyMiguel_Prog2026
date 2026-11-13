/*
* @author Miguel.A Nevado y Javier de la Cruz
* @version 1.0
*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Pruebas 
{
    /**
     * INICIALIZACION DE VARIABLES ESTÁTICAS
     * @.param Random (para numeros aleatorios)
     * @.param operacionMatematica (para implementar operaciones matematicas desde "Logica.java")
     * @.param consonantes Es de "La palabra más larga", contiene todas las consonantes.
     * @.param vocales Es de "La palabra más larga", contiene todas las consonantes.
     * NOTA: Las consonantes son las más utilizadas en el Español, mezcladas con algunas
     * más "extrañas".
     */
    static Random random = new Random();
    static Logica operacionMatematica = new Logica();
    static String[] consonantes = {"S","R","D","N","L","C","T","K","M","F","P"};
    static String[] vocales = {"A","E","I","O","U"};

    //----------------------------------------------------------------------------//
    /*
    * @.param 
    */
    public static void laCifraExacta()
    {
        System.out.println("-------------( LA CIFRA EXACTA )-------------");
        Scanner sc = new Scanner(System.in);
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

    //----------------------------------------------------------------------------//
    public static void laPalabraMasLarga()
    {
        System.out.println("-----------( LA PALABRA MÁS LARGA )-----------");
        Scanner sc = new Scanner(System.in);
        int palabraCorrectaP1 = 0;
        int palabraCorrectaP2 = 0;
        char[] letrasPermitidas = new char[8];
        // TURNO DEL JUGADOR 1
        // 1. GENERA LAS LETRAS AL AZAR DEL P1
        System.out.printf("\n #####[ TURNO DEL JUGADOR NUMERO 1 ]#####\n");
        for (int i = 0; i < 4; i++)
        {
            letrasPermitidas[i] = vocales[random.nextInt(vocales.length)].charAt(0);
        }
        for (int i = 4; i < 8; i++)
        {
            letrasPermitidas[i] = consonantes[random.nextInt(consonantes.length)].charAt(0);
        }


        System.out.println("Letras permitidas: " + Arrays.toString(letrasPermitidas));
        System.out.println("Introduce ahora tu palabra: ");
        String palabraP1 = sc.nextLine().toUpperCase();

        // 1.2 ANALIZA "palabraP1" PARA ENCONTRAR LAS LETRAS GENERADAS
        // Y CONTAR EL NÚMERO DE VECES QUE SE REPITEN.
        
        // La variable letraUsada hace referencia a las letras generadas al azar.
        // Establece cada letra de la frase como "verdadero" o "falso", significando
        // "repetida" o "no repetida".
        boolean[] letraUsadaP1 = new boolean[letrasPermitidas.length];
        
        // "puedeUsarse" es la que se encarga de "validar" una palabra.
        boolean puedeUsarseP1 = true;
        
        // El bucle se detiene si 'puedeUsarse' es falso
        for (int i = 0; i < palabraP1.length() && puedeUsarseP1; i++) 
        {
            char letraActualP1 = palabraP1.charAt(i);
            boolean encontradaP1 = false;
            
            // El bucle se detiene en cuanto encuentra la letra (negando para que busque mientras no sea true)
            for (int j = 0; j < letrasPermitidas.length && !(encontradaP1 == true); j++)
            {
                if (!(letraUsadaP1[j] == true) && letrasPermitidas[j] == letraActualP1)
                {
                    letraUsadaP1[j] = true;
                    encontradaP1 = true;
                }
            }
        
            // Si termina de buscar y no la encontró
            if (encontradaP1 == false)
            {
                puedeUsarseP1 = false;
            }
        }
    
        // 1.3 COMPROBACIÓN DE LA PALABRA (si es válida o no)
        if (puedeUsarseP1 == true) 
        {
            palabraCorrectaP1 = palabraP1.length();
            System.out.println("¡Correcto! La palabra \"" + palabraP1 + "\" SÍ se puede formar con las letras disponibles.");
        } 
        else 
        {
            System.out.println("Incorrecto. La palabra \"" + palabraP1 + "\" NO se puede formar (faltan letras o se repiten más de lo permitido).");
        }

        //#########################################################################//
        // TURNO DEL JUGADOR 2
        // 2.1 GENERA LAS LETRAS AL AZAR DEL P2
        // TURNO DEL JUGADOR 1
        // 1. GENERA LAS LETRAS AL AZAR DEL P1
        System.out.printf("\n #####[ TURNO DEL JUGADOR NUMERO 2 ]#####\n");
        for (int i = 0; i < 4; i++)
        {
            letrasPermitidas[i] = vocales[random.nextInt(vocales.length)].charAt(0);
        }
        for (int i = 4; i < 8; i++)
        {
            letrasPermitidas[i] = consonantes[random.nextInt(consonantes.length)].charAt(0);
        }

        System.out.println("Letras permitidas: " + Arrays.toString(letrasPermitidas));
        System.out.println("Introduce ahora tu palabra: ");
        String palabraP2 = sc.nextLine().toUpperCase();

        // 2.2 ANALIZA "palabraP2" PARA ENCONTRAR LAS LETRAS GENERADAS
        // Y CONTAR EL NÚMERO DE VECES QUE SE REPITEN.

        // La variable letraUsada hace referencia a las letras generadas al azar.
        // Establece cada letra de la frase como "verdadero" o "falso", significando
        // "repetida" o "no repetida".
        boolean[] letraUsadaP2 = new boolean[letrasPermitidas.length];

        // "puedeUsarse" es la que se encarga de "validar" una palabra.
        boolean puedeUsarseP2 = true;

        // El bucle se detiene si 'puedeUsarse' es falso
        for (int i = 0; i < palabraP2.length() && puedeUsarseP2; i++) 
        {
            char letraActualP2 = palabraP2.charAt(i);
            boolean encontradaP2 = false;

            // El bucle se detiene en cuanto encuentra la letra (negando para que busque mientras no sea true)
            for (int j = 0; j < letrasPermitidas.length && !(encontradaP2 == true); j++)
            {
                if (!(letraUsadaP2[j] == true) && letrasPermitidas[j] == letraActualP2)
                {
                    letraUsadaP2[j] = true;
                    encontradaP2 = true;
                }
            }
        
            // Si termina de buscar y no la encontró
            if (encontradaP2 == false)
            {
                puedeUsarseP2 = false;
            }
        }

        // 2.3 COMPROBACIÓN DE LA PALABRA (si es válida o no)
        if (puedeUsarseP2 == true) 
        {
            palabraCorrectaP2 = palabraP2.length();
            System.out.println("¡Correcto! La palabra \"" + palabraP2 + "\" SÍ se puede formar con las letras disponibles.");
        } 
        else 
        {
            System.out.println("Incorrecto. La palabra \"" + palabraP2 + "\" NO se puede formar (faltan letras o se repiten más de lo permitido).");
        }

        // 3. RESULTADOS FINALES
        if (palabraCorrectaP1 > palabraCorrectaP2)
        {
            System.out.println("¡¡¡ EL GANADOR ES EL JUGADOR 1 !!!");
            App.puntosP1+= 1;
        }
        else if (palabraCorrectaP1 < palabraCorrectaP2)
        {
            System.out.println("¡¡¡ EL GANADOR ES EL JUGADOR 2 !!!");
            App.puntosP2+= 1;
        }
        else if (palabraCorrectaP1 == palabraCorrectaP2)
        {
            System.out.println(" ¡¡¡ EMPATE !!!");
            App.puntosP1+= 1;
            App.puntosP2+= 1;
        }
    }

    //----------------------------------------------------------------------------//
    public static void laCalculadoraHumana()
    {
        System.out.println("-----------( LA CALCULADORA HUMANA )-----------");
        Scanner sc = new Scanner(System.in);
        System.out.printf("\nLa calculadora humana consiste en realizar operaciones ");
        System.out.printf("matemáticas de forma consecutiva\nndonde el resultado de la");
        System.out.printf("\noperación anterior se utiliza como el primer número de la ");
        System.out.printf("siguiente operación.\nEl juego consiste en realizar un número ");
        System.out.printf("determinado de rondas, en cada ronda se genera una operación ");
        System.out.printf("matemática aleatoria\ny el jugador debe ingresar la respuesta ");
        System.out.printf("correcta para continuar con la siguiente\nSi el jugador se ");
        System.out.printf("equivoca, se le penaliza con 20 segundos y se le muestra la ");
        System.out.printf("respuesta correcta\nAl final del juego, se muestra el tiempo ");
        System.out.printf("total que tardó en completar todas las rondas y el número de ");
        System.out.printf("fallos cometidos\nIntroduce el número de rondas que deseas jugar: \n");
        int rondas = sc.nextInt();

        //#########################################################################//

        // TURNO DEL JUGADOR 1
        System.out.printf("\n #####( TURNO DEL JUGADOR NUMERO 1 )#####\n");
        int num1 = random.nextInt(100) + 1;
        int fallos = 0;
        int penalizacion;
        long inicio = System.currentTimeMillis();
        for(int i = 0; i< rondas; i++){
            int operacion = random.nextInt(4) + 1;
            int resultado = operacionMatematica.calculadora(num1,operacion);
            int respuesta= sc.nextInt();
          
            if(respuesta == resultado){
            System.out.println("¡Respuesta correcta!");
            } else {
            System.out.println("Respuesta incorrecta. La respuesta correcta es: " + resultado);
            fallos++;
            }
            num1 = resultado;
        }
        
        long fin = System.currentTimeMillis();
        long tiempo = (fin - inicio) / 1000;
        penalizacion = fallos * 20;
        long tiempoTotalP1 = tiempo + penalizacion;
        System.out.println("El número de fallos fue de " + fallos);
        System.out.println("El tiempo fue de " + tiempo + " s " + " y la penalización es de " + penalizacion + " s");
        System.out.println("El tiempo total con la penalización " + tiempoTotalP1);

        //#########################################################################//

        // TURNO DEL JUGADOR 2
        System.out.printf("\n #####( TURNO DEL JUGADOR NUMERO 2 )#####\n");
        num1 = random.nextInt(100) + 1;
        fallos = 0;
        penalizacion = 0;
        inicio = 0;
        fin = 0;
        inicio = System.currentTimeMillis();
        for(int i = 0; i< rondas; i++){
            int operacion = random.nextInt(4) + 1;
            int resultado = operacionMatematica.calculadora(num1,operacion);
            int respuesta= sc.nextInt();
            if(respuesta == resultado){
            System.out.println("¡Respuesta correcta!");
            } else {
            System.out.println("Respuesta incorrecta. La respuesta correcta es: " + resultado);
            fallos++;
            }
            num1 = resultado;
        }
        
        fin = System.currentTimeMillis();
        tiempo = (fin - inicio) / 1000;
        penalizacion = fallos * 20;
        long tiempoTotalP2 = tiempo + penalizacion;
        System.out.println("El número de fallos fue de " + fallos);
        System.out.println("El tiempo fue de " + tiempo + " s " + " y la penalización es de " + penalizacion + " s");
        System.out.println("El tiempo total con la penalización " + tiempoTotalP2 + " s");

        // 3. RESULTADOS FINALES
        if (tiempoTotalP2 > tiempoTotalP1)
        {
            System.out.println("¡¡¡ EL GANADOR ES EL JUGADOR 1 !!!");
            App.puntosP1+= 1;
        }
        else if (tiempoTotalP2 < tiempoTotalP1)
        {
            System.out.println("¡¡¡ EL GANADOR ES EL JUGADOR 2 !!!");
            App.puntosP2+= 1;
        }
        else 
        {
            System.out.println(" ¡¡¡ EMPATE !!!");
            App.puntosP1+= 1;
            App.puntosP2+= 1;
        }
        
    }

    //----------------------------------------------------------------------------//
    public static void adivinarNumero() {

        System.out.println("-------------( EL NÚMERO OCULTO )-------------");
        Scanner sc = new Scanner(System.in);
        int min = 1;
        int max = 50;
        int maxIntentos = 5;
        int intentosP1 = 0;
        int intentosP2 = 0;
        boolean acertadoP1 = false;
        boolean acertadoP2 = false;
        // Generar número secreto aleatorio
        int numeroSecretoP1 = random.nextInt((max - min) + 1) + min;
        int numeroSecretoP2 = random.nextInt((max - min) + 1) + min;
        
        // TURNO JUGADOR 1
        System.out.println("Se ha generado un número entre " + min + " y " + max + ".");
        System.out.println("Tienes " + maxIntentos + " intentos para adivinarlo.\n");
        int intentoActualP1 = 1;
        System.out.printf("\n #####[ TURNO DEL JUGADOR NUMERO 1 ]#####\n");
        while (intentoActualP1 <= maxIntentos && acertadoP1 == false) 
        {
            int numero = -1;
            boolean valido = false;

            // Validación de entrada por consola
            while (!valido)
            {
                System.out.println("Intento " + intentoActualP1 + "/" + maxIntentos + " ");
                System.out.println("Introduce un número (" + min + "-" + max + "): ");
                if (sc.hasNextInt()) // COMPROBAR SI SE HA INTRODUCIDO UN NÚMERO
                {
                    numero = sc.nextInt();
                    sc.nextLine(); // Limpiar buffer
                    if (numero >= min && numero <= max)
                    {
                        valido = true;
                    }
                    else
                    {
                        System.out.println("Error: El número debe estar entre " + min + " y " + max + ".");
                    }
                }
                else
                {
                    System.out.println("Error: Debes introducir un número entero válido.");
                    sc.nextLine(); // Limpiar entrada incorrecta
                }
            }

            // Evaluación del intento
            if (numero == numeroSecretoP1)
            {
                System.out.println("¡EXACTO! Has adivinado el número (" + numeroSecretoP1 + "). ¡Has ganado!");
                acertadoP1 = true;
                intentoActualP1 = intentosP1;
            } 
            else if (numero < numeroSecretoP1)
            {
                System.out.println("PISTA: El número secreto es MAYOR.\n");
            }
            else
            {
                System.out.println("PISTA: El número secreto es MENOR.\n");
            }
            intentoActualP1++;
        }

        //#########################################################################//
        // TURNO JUGADOR 2
        System.out.println("Se ha generado un número entre " + min + " y " + max + ".");
        System.out.println("Tienes " + maxIntentos + " intentos para adivinarlo.\n");
        int intentoActualP2 = 1;
        System.out.printf("\n #####[ TURNO DEL JUGADOR NUMERO 2 ]#####\n");
        while (intentoActualP2 <= maxIntentos && acertadoP2 == false) 
        {
            int numero = -1;
            boolean valido = false;

            // Validación de entrada por consola
            while (!valido)
            {
                System.out.println("Intento " + intentoActualP1 + "/" + maxIntentos + " ");
                System.out.println("Introduce un número (" + min + "-" + max + "): ");
                if (sc.hasNextInt()) // COMPROBAR SI SE HA INTRODUCIDO UN NÚMERO
                {
                    numero = sc.nextInt();
                    sc.nextLine(); // Limpiar buffer
                    if (numero >= min && numero <= max)
                    {
                        valido = true;
                    }
                    else
                    {
                        System.out.println("Error: El número debe estar entre " + min + " y " + max + ".");
                    }
                }
                else
                {
                    System.out.println("Error: Debes introducir un número entero válido.");
                    sc.nextLine(); // Limpiar entrada incorrecta
                }
            }

            // Evaluación del intento
            if (numero == numeroSecretoP2)
            {
                System.out.println("¡EXACTO! Has adivinado el número (" + numeroSecretoP2 + "). ¡Has ganado!");
                acertadoP2 = true;
                intentoActualP2 = intentosP2;
            } 
            else if (numero < numeroSecretoP2)
            {
                System.out.println("PISTA: El número secreto es MAYOR.\n");
            }
            else
            {
                System.out.println("PISTA: El número secreto es MENOR.\n");
            }
            intentoActualP2++;
        }


        if (!acertadoP1)
        {
            System.out.println("\n¡Se acabaron los intentos del JUGADOR 1! El número secreto era: " + numeroSecretoP1);
            intentosP1 = maxIntentos;
            App.puntosP1 += 0;
        }
        if (!acertadoP2)
        {
            System.out.println("\n¡Se acabaron los intentos del JUGADOR 2! El número secreto era: " + numeroSecretoP2);
            intentosP2 = maxIntentos;
            App.puntosP2 += 0;
        }

        if (intentosP1 < intentosP2)
        {
            App.puntosP1 += 1;
            App.puntosP2 += 0;
        }
        else if (intentosP1 > intentosP2)
        {
            App.puntosP1 += 0;
            App.puntosP2 += 1;
        }
        else if (intentosP1 == intentosP2)
        {
            App.puntosP1 += 0;
            App.puntosP2 += 0;
        }
    }
}
