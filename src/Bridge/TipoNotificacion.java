package Bridge;

public abstract class TipoNotificacion {
    protected CanalesDeEnvio canal;

    public TipoNotificacion(CanalesDeEnvio canal){
        this.canal = canal;
    }

    public abstract void enviar();
}
