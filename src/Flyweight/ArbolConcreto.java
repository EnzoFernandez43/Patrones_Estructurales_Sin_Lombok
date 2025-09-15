package Flyweight;

public class ArbolConcreto implements Arbol {
    private final String tipoArbol;
    private final String textura;
    private final String color;

    public ArbolConcreto(String tipoArbol, String textura, String color) {
        this.tipoArbol = tipoArbol;
        this.textura = textura;
        this.color = color;
        System.out.println("Creando arbol de tipo " + tipoArbol + " de textura " + textura + " de color " + color + ".");
    }

    @Override
    public void colocar(int x, int y) {
        System.out.println("colocando arbol en la posición " + x +", "+ y + ".");
    }
}
