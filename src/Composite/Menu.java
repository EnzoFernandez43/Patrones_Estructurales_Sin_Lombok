package Composite;

import java.util.ArrayList;
import java.util.List;

public class Menu implements ElementoMenu{
    private String nombre;
    private List<ElementoMenu> elementos = new ArrayList<>();

    public Menu(String nombre){
        this.nombre = nombre;
    }

    public void addElementos(ElementoMenu elemento){
        elementos.add(elemento);
    }

    public void mostrar(String indent) {
        System.out.println(indent + "- Menu: " + nombre);
        for (ElementoMenu elemento : elementos){
            elemento.mostrar(indent + "  ");
        }
    }
}
