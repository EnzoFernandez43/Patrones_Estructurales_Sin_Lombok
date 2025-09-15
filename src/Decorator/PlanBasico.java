package Decorator;

public class PlanBasico implements Plan {
    @Override
    public String calidad() {
        return "720p";
    }

    @Override
    public String descargas() {
        return "Descargas no permitidas";
    }
}
