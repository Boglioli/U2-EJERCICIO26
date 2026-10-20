public class ImpresoraTinta extends Impresor {
    private int cartucho;
    public ImpresoraTinta(String modelo, int resolucion, int cartucho) {
        super(modelo, resolucion);
        this.cartucho = cartucho;
    }
    public void imprimirDocumento(String documento) {
        if (cartucho <= 0) {
            System.out.println("no se puede imprimir, el cartucho esta agotado");
        } else {
            System.out.println("imprimiendo con tinta " + documento);
            cartucho--;
            System.out.println("cartucho restante " + cartucho);
        }
    }
    @Override
    public void mostrarEstado() {
        super.mostrarEstado();
        System.out.println("cartucho: " + cartucho);
    }
}
