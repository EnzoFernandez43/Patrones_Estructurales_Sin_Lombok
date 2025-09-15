package AdapterCorregido;

public class MainAC {
    public static void main(String[] args) {
        Impresora impresora1 = new Adaptador("PDF");
        impresora1.imprimir("PDF", "TP2.PDF");

        Impresora impresora2 = new Adaptador("TXT");
        impresora2.imprimir("TXT", "TP2.TXT");

        Impresora impresora3 = new Adaptador("WORD");
        impresora3.imprimir("WORD", "TP2.WORD");
    }
}
