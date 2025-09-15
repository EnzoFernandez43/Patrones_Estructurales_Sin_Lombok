package Bridge;

public class Alerta extends TipoNotificacion{

    public Alerta (CanalesDeEnvio canal){
        super(canal);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando una alerta por " + canal.seleccionarMedio());
    }
}
