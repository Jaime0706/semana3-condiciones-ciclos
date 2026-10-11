import java.util.Scanner;

public class DesafiosLogicos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("Estudiante: Jaime Alejandro Monzon Contreras");
        System.out.println("Carné: 9941-24-11049");
        System.out.println("Semana 3 — Condiciones y ciclos");

        do {
            System.out.println();
            System.out.println("========= DESAFÍOS LÓGICOS =========");
            System.out.println();
            System.out.println("1. Generar una secuencia");
            System.out.println("2. Realizar un conteo regresivo");
            System.out.println("3. Analizar números");
            System.out.println("4. Dibujar una pirámide");
            System.out.println("5. Validar palabra secreta");
            System.out.println("6. Salir");
            System.out.println();
            System.out.print("Seleccione una opción: ");


            if (!sc.hasNextInt()) {
                sc.next();
                System.out.println("Opción inválida. Escriba un número del 1 al 6.");
                opcion = 0;
                continue;
            }
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    // OPCIÓN 1: Generar una secuencia
                    System.out.print("Número inicial: ");
                    int inicio = sc.nextInt();
                    System.out.print("Número final: ");
                    int fin = sc.nextInt();
                    System.out.print("Incremento: ");
                    int incremento = sc.nextInt();

                    if (incremento <= 0) {
                        System.out.println("Error: el incremento debe ser mayor que cero.");
                    } else if (fin <= inicio) {
                        System.out.println("Error: el número final debe ser mayor que el inicial.");
                    } else {
                        for (int i = inicio; i <= fin; i += incremento) {
                            System.out.print(i + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    // OPCIÓN 2: Conteo regresivo
                    System.out.print("Ingrese el número inicial: ");
                    int numero = sc.nextInt();

                    while (numero < 10 || numero > 50) {
                        System.out.println("El número debe estar entre 10 y 50.");
                        System.out.print("Ingrese el número inicial: ");
                        numero = sc.nextInt();
                    }

                    int contador = numero;
                    while (contador >= 0) {
                        System.out.print(contador + " ");
                        contador--;
                    }
                    System.out.println();
                    System.out.println("¡Despegue!");
                    break;

                case 3:
                    // OPCIÓN 3: Analizar números
                    int positivos = 0;
                    int negativos = 0;
                    int suma = 0;
                    int ignorados = 0;

                    while (true) {
                        System.out.print("Ingrese un número: ");
                        int n = sc.nextInt();

                        if (n == 0) {
                            break; // el 0 solo termina el ingreso
                        }

                        if (n > 0) {
                            positivos++;
                        } else {
                            negativos++;
                        }

                        if (n % 5 == 0) {
                            System.out.println("El número " + n + " fue ignorado.");
                            ignorados++;
                            continue; // los múltiplos de 5 no se suman
                        }

                        suma += n;
                    }

                    System.out.println();
                    System.out.println("Resultado:");
                    System.out.println("Positivos: " + positivos);
                    System.out.println("Negativos: " + negativos);
                    System.out.println("Suma válida: " + suma);
                    System.out.println("Números ignorados: " + ignorados);
                    break;

                case 4:
                    // OPCIÓN 4: Dibujar una pirámide
                    System.out.print("Ingrese la altura: ");
                    int altura = sc.nextInt();

                    if (altura < 3 || altura > 10) {
                        System.out.println("Error: la altura debe estar entre 3 y 10.");
                    } else {
                        for (int fila = 1; fila <= altura; fila++) {
                            // primero los espacios de la izquierda
                            for (int espacio = 1; espacio <= altura - fila; espacio++) {
                                System.out.print(" ");
                            }
                            // luego los asteriscos
                            for (int asterisco = 1; asterisco <= 2 * fila - 1; asterisco++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                    }
                    break;
                case 5:
                    // OPCIÓN 5: Validar palabra secreta
                    sc.nextLine(); // limpia el salto de línea que quedó pendiente
                    String palabra;
                    do {
                        System.out.print("Ingrese la palabra secreta: ");
                        palabra = sc.nextLine().trim();

                        if (palabra.equalsIgnoreCase("Guatemala")) {
                            System.out.println("Palabra correcta.");
                        } else {
                            System.out.println("Palabra incorrecta. Intente nuevamente.");
                        }
                    } while (!palabra.equalsIgnoreCase("Guatemala"));
                    break;

                case 6:
                    System.out.println("Programa finalizado correctamente.");
                    break;

                default:
                    System.out.println("Opción inexistente. Elija una opción del 1 al 6.");
            }

        } while (opcion != 6);

        sc.close();
    }
}