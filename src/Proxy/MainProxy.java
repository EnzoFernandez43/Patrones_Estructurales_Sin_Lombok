package Proxy;

public class MainProxy {
    public static void main(String[] args) {

        //Usuarios con permisos
        Archivo archivo1 = new ArchivoProxy("Desarrollo.pdf", true);
        archivo1.abrirArchivo();

        //Usuario sin permisos
        Archivo archivo2 = new ArchivoProxy("Software.pdf", false);
        archivo2.abrirArchivo();
    }
}