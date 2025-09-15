package Decorator;

public class DescargasOffline extends Decorador {
    public DescargasOffline (Plan plan){
        super(plan);
    }

    @Override
    public String calidad() {
        return plan.calidad() + " + 4K";
    }

    @Override
    public String descargas() {
        return plan.descargas() + " + Todas las descargas permitidas";
    }
}
