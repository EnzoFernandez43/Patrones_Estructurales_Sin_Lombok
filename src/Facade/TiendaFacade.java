package Facade;

public class TiendaFacade {
    private Carrito carro;
    private Pago pago;
    private Envio envio;

    public TiendaFacade(Carrito carro, Pago pago, Envio envio){
        this.carro = carro;
        this.pago = pago;
        this.envio = envio;
    }

    public void realizarCompra(){
        System.out.println("Realizando compra...");
        carro.agregarProducto();
        pago.pagar();
        envio.envio();
    }
}
