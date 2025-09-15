package Decorator;

public class HD extends Decorador {
    public HD(Plan plan){
        super(plan);
    }

    @Override
    public String calidad() {
        return plan.calidad() + " + HD";
    }

    @Override
    public String descargas() {
        return plan.descargas() + "";
    }

}
