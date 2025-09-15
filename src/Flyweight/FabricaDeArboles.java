package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaDeArboles {
    private Map<String, Arbol>arboles = new HashMap<>();


    public Arbol obtenerArbol(String tipoArbol, String textura, String color){
        String clave = tipoArbol + "_" + textura + "_" + color;

        if (!arboles.containsKey(clave)) {
            System.out.println("Creando un nuevo árbol.");
            arboles.put(clave, (Arbol) new ArbolConcreto(tipoArbol, textura, color));
        }

        // Devolvemos el objeto existente o el nuevo
        return arboles.get(clave);
    }
}
