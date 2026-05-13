package tienda.servicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Service {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ProductoService ps = new ProductoService();
    FabricanteService fs = new FabricanteService();
    
    public void menuTienda() throws Exception {
        try {
            int eleccion = 0;
            do {
            System.out.println("Menú de la tienda:");
            System.out.println("1) Lista el nombre de todos los productos.\n"
                    + "2) Lista los nombres y los precios de todos los productos.\n"
                    + "3) Listar aquellos productos que su precio esté entre 120 y 202.\n"
                    + "4) Buscar y listar todos los Portátiles.\n"
                    + "5) Listar el nombre y el precio del producto más barato.\n"
                    + "6) Ingresar un producto a la base de datos.\n"
                    + "7) Ingresar un fabricante a la base de datos\n"
                    + "8) Editar un producto con datos a elección.\n"
                    + "9) Salir del sistema.");

                System.out.println("");
            System.out.print("Ingrese su elección: ");
            eleccion = leer.nextInt();

            switch (eleccion) {
                case 1:
                    try {
                        System.out.println("");
                        ps.mostrarProductosPorNombre();
                        System.out.println("");
                    } catch (Exception e) {
                        System.out.println("Error de sistema");
                    }

                    break;
                case 2:
                    try {
                        System.out.println("");
                        ps.mostrarProductosPorNombreYprecio();
                        System.out.println("");
                    } catch (Exception e) {
                        System.out.println("Error de sistema");
                    }
                    break;
                case 3:
                    try {
                        System.out.println("");
                        ps.mostrarProductosEntrePrecios();
                        System.out.println("");
                    } catch (Exception e) {
                        System.out.println("Error de sistema");
                    }
                    break;
                case 4:
                    try {
                        System.out.println("");
                        ps.mostrarProductosPorPortatil();
                        System.out.println("");
                    } catch (Exception e) {
                        System.out.println("Error de sistema");
                    }
                    break;
                case 5:
                    try {
                        System.out.println("");
                        ps.mostrarElProductoMasBarato();
                        System.out.println("");
                    } catch (Exception e) {
                        System.out.println("Error de sistema");
                    }
                    break;
                case 6:
                    try {
                        System.out.println("");
                        ps.ingresarProducto();
                        System.out.println("");
                    } catch (Exception e) {
                        System.out.println("Error en el sistema");
                    }
                    break;
                case 7:
                    try {
                        System.out.println("");
                        fs.ingresarFabricante();
                        System.out.println("");
                    } catch (Exception e) {
                        System.out.println("Error en el sistema");
                        throw e;
                    }
                    break;
                case 8:
                    try {
                        System.out.println("");
                        ps.modificarProducto();
                        System.out.println("");
                    } catch (Exception e) {
                        throw e;
                    }
                    break;
                case 9:
                    System.out.println("");
                    System.out.println("Ha salido con exito.");
                 
            }
            } while (eleccion != 9);
            
        } catch (InputMismatchException e) {
            System.out.println("Error, ingrese una elección numeral");

        }

    }

}
