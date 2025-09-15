package Proxy;

public class ArchivoReal implements Archivo {
    private String documento;
    private Boolean permiso;
    @Override
    public void abrirArchivo() {
        System.out.println("Abriendo documento " + documento);
    }

    public ArchivoReal(String documento, Boolean permiso){
        this.documento = documento;
        this.permiso = permiso;
    }

    public ArchivoReal(String documento){
        this.documento = documento;
    }
}
