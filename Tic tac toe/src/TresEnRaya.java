import java.util.Scanner;

public class TresEnRaya {
    public static void main(String[] args) {
        // Crear la matriz para el tablero
        char[][] tablero = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        // Inicializar variables de control
        boolean juegoTerminado = false;
        char jugadorActual = 'X'; // 'X' empieza el juego
        Scanner scanner = new Scanner(System.in);

        // Bucle principal del juego
        while (!juegoTerminado) {
            // Mostrar el tablero actual
            System.out.println("Estado actual del tablero:");
            mostrarTablero(tablero);

            // Solicitar al jugador su movimiento
            System.out.println("Turno del jugador " + jugadorActual + ". Introduzca fila y columna (1, 2 o 3):");
            int fila, columna;

            while (true) {
                System.out.print("Fila: ");
                fila = scanner.nextInt();
                System.out.print("Columna: ");
                columna = scanner.nextInt();

                // Validar que la posición es válida y no está ocupada
                if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ') {
                    break; // Entrada válida
                } else {
                    System.out.println("Movimiento inválido. Inténtelo de nuevo.");
                }
            }

            // Realizar el movimiento
            tablero[fila][columna] = jugadorActual;

            // Verificar si el jugador actual ha ganado
            if (verificarGanador(tablero, jugadorActual)) {
                System.out.println("¡El jugador " + jugadorActual + " ha ganado!");
                mostrarTablero(tablero);
                juegoTerminado = true;
            } else if (esEmpate(tablero)) {
                // Verificar si hay empate
                System.out.println("¡Es un empate!");
                mostrarTablero(tablero);
                juegoTerminado = true;
            } else {
                // Cambiar turno al siguiente jugador
                jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
            }
        }

        // Cerrar el scanner al final del juego
        scanner.close();
    }

    // Mostrar el tablero en la consola
    public static void mostrarTablero(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
                if (j < 2) System.out.print(" | "); // Separador de columnas
            }
            System.out.println();
            if (i < 2) System.out.println("---------"); // Separador de filas
        }
    }

    // Verificar si un jugador ha ganado
    public static boolean verificarGanador(char[][] tablero, char jugador) {
        // Verificar filas, columnas y diagonales
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) return true; // Fila
            if (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador) return true; // Columna
        }
        if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) return true; // Diagonal principal
        if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) return true; // Diagonal secundaria
        return false;
    }

    // Verificar si el tablero está lleno (empate)
    public static boolean esEmpate(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') return false; // Si hay un espacio vacío, no hay empate
            }
        }
        return true; // Si no hay espacios vacíos, es empate
    }
}
