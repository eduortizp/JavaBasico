package practica3.centrosDistribucion;

import java.util.Scanner;

public class VentaFinal {

    private static Scanner pago;

    public static void main(String[] args) {

        pago = new Scanner(System.in);
        int codProducto;
        int codLocal;
        int codReceta;
        double precio;
        double descuento;
        double total;

        //PRODUCTO CODIGO 1 = REGALOS / CODIGO 2 = MEDICAMENTOS
        System.out.print("Ingrese codigo de producto: ");
        codProducto = pago.nextInt();

        if (codProducto == 1) {

            //LOCAL CODIGO 1 = BOTICA / CODIGO 2 = FARMACIA
            System.out.print("Ingrese codigo de local: ");
            codLocal = pago.nextInt();

            if (codLocal == 1) {

                System.out.print("Ingrese precio de producto: ");
                precio = pago.nextDouble();
                descuento = (double) (precio * 0.15);
                total = (double) (precio - descuento);
                System.out.println("\n" + "Descuento (15%): " + descuento + "\n" +"Total a pagar: " + total + "\t" + "Nuevos soles" + "\n" + "Gracias por su compra" + "\n");

            } else {

                System.out.println("\n" + "Lo sentimos no contamos con el producto" + "\n");
            }

        } else {

            //RECETA CODIGO 1 = TIENE RECETA / CODIGO 2 = NO TIENE RECETA
            System.out.print("Cuenta con receta de Dr. registrado: ");
            codReceta = pago.nextInt();

            if (codReceta == 1) {

                System.out.print("Ingrese precio de producto: ");
                precio = pago.nextDouble();
                total = (double) (precio);
                System.out.println("\n" + "Total a pagar: " + total + "\t" + "Nuevos soles" + "\n" + "Gracias por su compra" + "\n");

            } else {

                System.out.println("\n" + "Lo sentimos necesita traer su receta medica.......vuelva pronto" );

            }
        }
    }
}