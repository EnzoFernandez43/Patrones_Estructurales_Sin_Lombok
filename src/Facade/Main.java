package Facade;

public class Main {
    public static void main(String[] args) {
        Carrito carro = new Carrito();
        Pago pago = new Pago();
        Envio envio = new Envio();

        TiendaFacade tienda = new TiendaFacade(carro,pago,envio);
        tienda.realizarCompra();
    }
}
