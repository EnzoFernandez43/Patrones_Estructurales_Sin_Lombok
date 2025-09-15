package AdapterCorregido;

public class Adaptador implements Impresora {
    private ImpresoraPDF impresoraPDF;
    private ImpresoraTextoPlano impresoraTextoPlano;

    public Adaptador(String tipoTexto) {
        if (tipoTexto.equalsIgnoreCase("PDF")) {
            impresoraPDF = new ImpresoraPDF();
        } else if (tipoTexto.equalsIgnoreCase("TXT")) {
            impresoraTextoPlano = new ImpresoraTextoPlano();
        }
    }

    @Override
    public void imprimir(String tipoTexto, String fileName) {
        if (tipoTexto.equalsIgnoreCase("PDF")) {
            impresoraPDF.imprimirPDF(fileName);
        } else if (tipoTexto.equalsIgnoreCase("TXT")) {
            impresoraTextoPlano.imprimirTextoPlano(fileName);
        } else {
            System.out.println("Formato no soportado: " + tipoTexto);
        }
    }
}
