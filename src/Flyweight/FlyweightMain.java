package Flyweight;

import Flyweight.Arbol;
import Flyweight.FabricaDeArboles;

import java.util.Random;

public class FlyweightMain {
    public static void main(String[] args) {
        FabricaDeArboles fabrica = new FabricaDeArboles();
        Random rand = new Random();

        // Define los tipos de árboles que se van a usar
        String tipo = "Roble";
        String textura = "Rugosa";
        String color = "Verde";

        // Simula la creación de 10 árboles del mismo tipo
        for (int i = 0; i < 10; i++) {
            // Obtiene el mismo objeto Flyweight de la fábrica en cada iteración
            Arbol arbol = fabrica.obtenerArbol(tipo, textura, color);

            // Usa el objeto con propiedades extrínsecas (posición)
            int x = rand.nextInt(100);
            int y = rand.nextInt(100);
            arbol.colocar(x, y);
        }
    }
}