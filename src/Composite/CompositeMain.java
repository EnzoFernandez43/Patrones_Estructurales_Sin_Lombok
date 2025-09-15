package Composite;

public class CompositeMain {
    public static void main(String[] args) {
        ElementoMenu plato1 = new Plato("Pasta");
        ElementoMenu plato2 = new Plato("Pizza");
        ElementoMenu plato3 = new Plato("Sushi");

        Menu menu1 = new Menu("Comida Italiana");
        menu1.addElementos(plato1);
        menu1.addElementos(plato2);
        Menu menu2 = new Menu("Comida internacional");
        menu2.addElementos(plato3);
        menu2.addElementos(menu1);

        menu2.mostrar("");
    }
}
