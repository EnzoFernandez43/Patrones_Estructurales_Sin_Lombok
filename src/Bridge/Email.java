package Bridge;

public class Email implements CanalesDeEnvio {

    @Override
    public String seleccionarMedio() {
        return "email";
    }
}
