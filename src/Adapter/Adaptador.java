package Adapter;

//Conecta ambas interfaces
public class Adaptador implements Impresora{
    private ImpresoraPDF impresora;

    public Adaptador(){
        impresora = new ImpresoraPDF();
    }

    @Override
    public void imprimir(String TipoTexto, String fileName) {
        if(TipoTexto.equalsIgnoreCase("PDF")){
            impresora.imprimirPDF(fileName);
        }else{
            System.out.println("Formato no soportado: " + TipoTexto);
        }
    }
}
