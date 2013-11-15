package practica3.centrosDistribucion;

import java.util.Scanner;

public class VentaBotica {

    private static Scanner consulta;

    public static void main(String[] args) {

        consulta = new Scanner(System.in);
        String nomProducto;
        int tipoProducto;
        String nomCliente;
        int codReceta;
        double precio;
        double descuento;
        double total;
        int dni;
        String nombres;
        String pater;
        String mater;
        int telefono;
        String direccion;
        String distrito;

        System.out.print("Ingrese nombre de producto a buscar : ");
        nomProducto = consulta.nextLine();

        if (nomProducto.equals(nomProducto)) {

            System.out.print("Ingrese nombre de cliente : ");
            nomCliente = consulta.nextLine();

            if (nomCliente.equals(nomCliente)) {

                //TIPO 1 = PRODUCTOS DE ASEO / TIPO 2 = MEDICAMENTO
                System.out.print("Ingrese tipo de producto : ");
                tipoProducto = consulta.nextInt();

                if (tipoProducto == 1) {

                    //TIPO 1 = PRODUCTOS DE ASEO / TIPO 2 = MEDICAMENTO
                    System.out.print("Ingrese precio de producto: ");
                    precio = consulta.nextDouble();
                    descuento = (double) (precio * 0.15);
                    total = (double) (precio - descuento);

                    System.out.println("Precio : " + precio + " Nuevos soles");
                    System.out.println("Descuento (15%): " + descuento + " Nuevos soles");
                    System.out.println("Total a pagar : " + total + " Nuevos soles");
                    System.out.println("Gracias por su compra.......vuelva pronto " + nomCliente);

                } else {

                    //CODIGO 1 = SI / CODIGO 2 = NO
                    System.out.print("Tiene receta : ");
                    codReceta = consulta.nextInt();

                    if (codReceta == 1) {

                        System.out.print("Ingrese precio de producto: ");
                        precio = consulta.nextDouble();
                        total = (double) (precio);

                        System.out.println("Precio : " + precio + " Nuevos soles");
                        System.out.println("Producto no tiene descuento : ");
                        System.out.println("Total a pagar : " + total + " Nuevos soles");
                        System.out.println("Gracias por su compra.......vuelva pronto " + nomCliente);

                    } else {

                        System.out.println("Lo sentimos necesita traer su receta medica.......vuelva pronto");
                    }
                }
            } else {

                System.out.println("Cliente no existe");
                System.out.print("Ingrese DNI de nuevo cliente : ");
                dni = consulta.nextInt();
                System.out.print("Ingrese nombres de nuevo cliente : ");
                nombres = consulta.nextLine();
                System.out.print("Ingrese apellido paterno de nuevo cliente : ");
                pater = consulta.nextLine();
                System.out.print("Ingrese apellido materno de nuevo cliente : ");
                mater = consulta.nextLine();
                System.out.print("Ingrese direccion de nuevo cliente : ");
                direccion = consulta.nextLine();
                System.out.print("Ingrese telefono de nuevo cliente : ");
                telefono = consulta.nextInt();
                System.out.print("Ingrese distrito de nuevo cliente : ");
                distrito = consulta.nextLine();

                //TIPO 1 = PRODUCTOS DE ASEO / TIPO 2 = MEDICAMENTO
                System.out.print("Ingrese tipo de producto : ");
                tipoProducto = consulta.nextInt();

                if (tipoProducto == 1) {

                    //TIPO 1 = PRODUCTOS DE ASEO / TIPO 2 = MEDICAMENTO
                    System.out.print("Ingrese precio de producto: ");
                    precio = consulta.nextDouble();
                    descuento = (double) (precio * 0.15);
                    total = (double) (precio - descuento);

                    System.out.println("Precio : " + precio + " Nuevos soles");
                    System.out.println("Descuento (15%): " + descuento + " Nuevos soles");
                    System.out.println("Total a pagar : " + total + " Nuevos soles");
                    System.out.println("Gracias por su compra.......vuelva pronto " + nomCliente);

                } else {

                    //CODIGO 1 = SI / CODIGO 2 = NO
                    System.out.print("Tiene receta : ");
                    codReceta = consulta.nextInt();

                    if (codReceta == 1) {

                        System.out.print("Ingrese precio de producto: ");
                        precio = consulta.nextDouble();
                        total = (double) (precio);

                        System.out.println("Precio : " + precio + " Nuevos soles");
                        System.out.println("Producto no tiene descuento : ");
                        System.out.println("Total a pagar : " + total + " Nuevos soles");
                        System.out.println("Gracias por su compra.......vuelva pronto");

                    } else {

                        System.out.println("\n" + "Lo sentimos necesita traer su receta medica.......vuelva pronto");

                    }
                }
            }
        } else {

            System.out.println("Lo sentimos el producto no hay en stock.......vuelva pronto");
        }
    }
}
