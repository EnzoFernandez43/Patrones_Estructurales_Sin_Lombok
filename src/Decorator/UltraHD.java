package Decorator;

public class UltraHD extends Decorador {
    public UltraHD(Plan plan){
        super(plan);
    }

    @Override
    public String calidad() {
        return plan.calidad() + " + UltraHD";
    }

    @Override
    public String descargas() {
        return plan.descargas() + " + Solo descargas moviles";
    }
}
