package Adapter;

public class impresoraTexto implements Impresora {
    private Adaptador adaptador;

    @Override
    public void imprimir(String TipoTexto, String fileName) {
        if (TipoTexto.equalsIgnoreCase("TXT")) {
            System.out.println("Imprimiendo TXT: " + fileName);
        } else {
            Adaptador adaptador = new Adaptador();
            adaptador.imprimir(TipoTexto, fileName);
        }
    }
}