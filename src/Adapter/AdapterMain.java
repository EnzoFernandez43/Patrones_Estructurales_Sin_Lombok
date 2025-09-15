package Adapter;

public class AdapterMain {
    public static void main(String[] args) {
        //**********Adapter(Wrapper)**********
        impresoraTexto impresión = new impresoraTexto();
        impresión.imprimir("PDF", "TP2.PDF");
        impresión.imprimir("TXT", "TP2.TXT");
        impresión.imprimir("WORD", "TP2.WORD");

    }
}