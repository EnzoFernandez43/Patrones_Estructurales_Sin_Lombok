package Bridge;

public class SMS implements CanalesDeEnvio {
    @Override
    public String seleccionarMedio() {
        return "SMS";
    }
}
