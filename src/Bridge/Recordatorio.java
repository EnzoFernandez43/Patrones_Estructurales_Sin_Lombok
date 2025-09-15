package Bridge;

public class Recordatorio extends TipoNotificacion{
    public Recordatorio (CanalesDeEnvio canal){
        super(canal);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando un recordatorio por " + canal.seleccionarMedio());
    }
}
