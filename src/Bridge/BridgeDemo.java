package Bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        TipoNotificacion alertaSMS = new Alerta(new SMS());
        TipoNotificacion promocionEmail = new Promocion(new Email());

        alertaSMS.enviar();
        promocionEmail.enviar();

    }

}
