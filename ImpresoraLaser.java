public class ImpresoraLaser extends Impresor {
    private int toner;
    public ImpresoraLaser(String modelo, int resolucion, int toner) {
        super(modelo, resolucion);
        this.toner = toner;
    }
    public void imprimirDocumento(String documento) {
        if (toner <= 0) {
            System.out.println("no se puede imprimir, el toner esta agotado");
        } else {
            System.out.println("imprimiendo en laser: " + documento);
            toner--;
            System.out.println("toner restante " + toner);
        }
    }
    @Override
    public void mostrarEstado() {
        super.mostrarEstado();
        System.out.println("toner: " + toner);
    }
}