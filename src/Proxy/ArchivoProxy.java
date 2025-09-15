package Proxy;

public class ArchivoProxy implements Archivo{
    private String documento;
    private Archivo archivo;
    private Boolean permiso;

    public ArchivoProxy(String documento, boolean permiso) {
        this.documento = documento;
        this.permiso = permiso;
    }

    @Override
    public void abrirArchivo() {
        if (permiso == true){
            ArchivoReal ArchivoReal = new ArchivoReal(documento);
            ArchivoReal.abrirArchivo();
        } else {
            System.out.println("Acceso denegado.");
        }
    }
}
