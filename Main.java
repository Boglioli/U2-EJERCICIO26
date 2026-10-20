public class Main {
    public static void main(String[] args) {
        ImpresoraLaser laser = new ImpresoraLaser("HP laser jet" , 1200, 2);
        ImpresoraTinta tinta = new ImpresoraTinta("epson ecotank" , 600 , 1);
        System.out.println("IMPRESORA LASER");
        laser.mostrarEstado();
        laser.imprimirDocumento("informe de ventas");
        System.out.println();
        System.out.println("IMPRESORA TINTA");
        tinta.mostrarEstado();
        tinta.imprimirDocumento("trabajo practico");
        tinta.imprimirDocumento("foto");
        System.out.println();
        System.out.println("ESTADO FINAL");
        laser.mostrarEstado();
        System.out.println();
        tinta.mostrarEstado();
    }
}
