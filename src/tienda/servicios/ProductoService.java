package tienda.servicios;

import java.util.Collection;
import java.util.Scanner;
import tienda.persistencia.ProductoDAO;
import tienda.entidades.Producto;

public class ProductoService {

    private ProductoDAO pd;
    private Producto p;
    private Scanner leer;

    public ProductoService() {
        this.pd = new ProductoDAO();
        this.p = new Producto();
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Collection<Producto> listarProductos() throws Exception {
        try {
            Collection<Producto> productos = pd.listarProductos();

            return productos;
        } catch (Exception e) {
            System.out.println("Error de sistema");
            throw e;
        }
    }

    public void mostrarProductosPorNombre() throws Exception {
        try {

            Collection<Producto> productos = listarProductos();
            if (productos.isEmpty()) {
                throw new Exception("No hay productos guardados");
            } else {
                for (Producto p : productos) {
                    System.out.println("Nombre: " + p.getNombre());
                }
            }
        } catch (Exception e) {
            System.out.println("Error de sistema");
            throw e;
        }

    }

    public void mostrarProductosPorNombreYprecio() throws Exception {
        try {

            Collection<Producto> productos = listarProductos();
            if (productos.isEmpty()) {
                throw new Exception("No hay productos guardados");
            } else {
                for (Producto p : productos) {
                    System.out.println("Nombre: " + p.getNombre() + " | Precio: " + p.getPrecio() + "$");
                }
            }
        } catch (Exception e) {
            System.out.println("Error de sistema");
            throw e;
        }
    }

    public Collection<Producto> listarProductosPorPrecio() throws Exception {
        try {
            Collection<Producto> productos = pd.listarProductosEntrePrecios();

            return productos;
        } catch (Exception e) {
            System.out.println("Error de sistema");
            throw e;
        }
    }

    public void mostrarProductosEntrePrecios() throws Exception {
        try {

            Collection<Producto> productos = listarProductosPorPrecio();
            if (productos.isEmpty()) {
                throw new Exception("No hay productos guardados");
            } else {
                for (Producto p : productos) {
                    System.out.println(p.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Error de sistema");
            throw e;
        }
    }

    public Collection<Producto> listarProductosPorPortatil() throws Exception {
        try {
            Collection<Producto> productos = pd.listarProductosPorPortatil();

            return productos;
        } catch (Exception e) {
            System.out.println("Error de sistema");
            throw e;
        }
    }

    public void mostrarProductosPorPortatil() throws Exception {
        try {

            Collection<Producto> productos = listarProductosPorPortatil();
            if (productos.isEmpty()) {
                throw new Exception("No hay productos guardados");
            } else {
                for (Producto p : productos) {
                    System.out.println(p.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Error de sistema");
            throw e;
        }
    }

    public Collection<Producto> listarElProductoMasBarato() throws Exception {
        try {
            Collection<Producto> productos = pd.listaElProductoMasBarato();

            return productos;
        } catch (Exception e) {
            System.out.println("Error de sistema");
            throw e;
        }
    }

    public void mostrarElProductoMasBarato() throws Exception {
        try {

            Collection<Producto> productos = listarElProductoMasBarato();
            if (productos.isEmpty()) {
                throw new Exception("No hay productos guardados");
            } else {
                for (Producto p : productos) {
                    System.out.println(p.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Error de sistema");
            throw e;
        }
    }

    public void ingresarProducto() throws Exception {
        try {
            System.out.print("Ingrese el código del producto: ");
            int codigo = leer.nextInt();
            if (pd.buscarProductoPorCodigo(codigo) != null) {
                throw new Exception("El codigo del producto ya existe en la base de datos");
            }
            p.setCodigo(codigo);
            System.out.print("Ingrese el codigo del fabricante del producto: ");
            int codigoFabricante = leer.nextInt();
            p.setCodigoFabricante(codigoFabricante);
            System.out.print("Ingrese el precio del producto: ");
            int Precio = leer.nextInt();
            p.setPrecio(Precio);

            System.out.print("Ingrese el nombre del producto: ");
            String Nombre = leer.next();
            p.setNombre(Nombre);

            pd.ingresarProducto(p);
            System.out.println("Producto ingresado correctamente en la base de datos.");
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarProducto() throws Exception {

        try {

            System.out.print("Ingrese el codigo del producto que desea modificar: ");
            int codigop = leer.nextInt();
            if (p.getCodigo() == codigop) {
                throw new Exception("El codigo introducido no corresponde a ningún producto registrado");
            }
            if (pd.buscarProductoPorCodigo(codigop) != null) {

                System.out.print("Ingrese el codigo nuevo del producto: ");
                int codigoNuevo = leer.nextInt();               
                p.setCodigo(codigoNuevo);
                System.out.print("Ingrese el codigo de fabricante nuevo: ");
                 int codigoFabricante = leer.nextInt();
                p.setCodigoFabricante(codigoFabricante);
                System.out.print("Ingrese el precio nuevo: ");
                int precio = leer.nextInt();
                p.setPrecio(precio);
                System.out.print("Ingrese el nombre nuevo: ");
                String nombre = leer.next();
                if (nombre.trim().isEmpty()) {
                    throw new Exception("Debe introducír un nombre nuevo");
                }
                p.setNombre(nombre);
                pd.modificarNombreProducto(p, codigop);
            } else {
                throw new Exception("Error, el codigo ingresado no está relacionado a ningún producto registrado.");
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
