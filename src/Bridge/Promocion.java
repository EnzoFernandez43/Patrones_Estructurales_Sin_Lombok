package Bridge;

public class Promocion extends TipoNotificacion{
    public Promocion (CanalesDeEnvio canal){
        super(canal);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando una promoción por " + canal.seleccionarMedio());
    }
}
