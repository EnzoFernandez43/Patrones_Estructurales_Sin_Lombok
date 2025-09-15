package Decorator;

public class Decorador implements Plan {
    protected Plan plan;

    public  Decorador (Plan plan){
        this.plan = plan;
    }

    @Override
    public String calidad() {
        return plan.calidad();
    }

    @Override
    public String descargas() {
        return plan.descargas();
    }

}
