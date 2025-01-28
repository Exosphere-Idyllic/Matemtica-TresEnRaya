# Tres en Raya (Tic-Tac-Toe) en Java

Este es un sencillo juego de Tres en Raya (Tic-Tac-Toe) implementado en Java, utilizando una matriz bidimensional de 3x3 para representar el tablero. 
El programa se ejecuta completamente en consola y permite que dos jugadores jueguen turnándose.

## Características

- Representación del tablero mediante una matriz de 3x3.
- Turnos alternados entre los jugadores `X` y `O`.
- Validación de movimientos para evitar posiciones inválidas o ya ocupadas.
- Detección de victoria mediante filas, columnas y diagonales.
- Verificación de empate si el tablero está lleno y no hay un ganador.
- Diseño intuitivo y completamente funcional desde la consola.

## Requisitos

- **Java 8** o superior.
- Editor de texto o entorno de desarrollo integrado (IDE) como IntelliJ IDEA, Eclipse o VS Code.
   
## Estructura del código 

El programa está contenido en un solo archivo llamado TresEnRaya.java, organizado de la siguiente manera:

Declaración del tablero: Una matriz de char de tamaño 3x3 para representar el estado del juego.
Bucle principal: Controla el flujo del juego, alternando entre los jugadores.
Funciones auxiliares:
mostrarTablero: Imprime el tablero en la consola.
verificarGanador: Comprueba si un jugador ha ganado.
esEmpate: Verifica si el tablero está lleno y no hay ganador.
