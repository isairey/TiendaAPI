package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;

public final class ProductoDAO extends DAO {

    public void ingresarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe ingresar un producto");
            }
            String sql = "INSERT INTO Producto (codigo, nombre, precio, codigo_fabricante)"
                    + "VALUES (" + producto.getCodigo() + ", '" + producto.getNombre() + "', " + producto.getPrecio()
                    + ", " + producto.getCodigoFabricante() + ");";
            insertarModificarElimnar(sql);

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public void modificarNombreProducto(Producto producto, int codigop) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe ingresar un producto");
            }
            String sql = "UPDATE Producto SET"
                    + " codigo = " + producto.getCodigo() + ", nombre = '" + producto.getNombre() + "', precio = " + producto.getPrecio()
                    + ", codigo_fabricante = " + producto.getCodigoFabricante() + " Where codigo = " + codigop + ";";
            insertarModificarElimnar(sql);

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> listarProductos() throws Exception {
        try {
            String sql = "SELECT * from producto";
            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList<>();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getInt(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }

    }

    public Collection<Producto> listarProductosEntrePrecios() throws Exception {
        try {
            String sql = "SELECT * FROM Producto WHERE precio > 119  AND precio < 203";
            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList<>();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getInt(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> listarProductosPorPortatil() throws Exception {
        try {
            String sql = "SELECT * FROM Producto WHERE Nombre like ('%Portátil%')";
            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList<>();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getInt(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> listaElProductoMasBarato() throws Exception {
        try {
            String sql = "SELECT * FROM Producto ORDER BY precio ASC LIMIT 1";
            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList<>();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getInt(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Producto buscarProductoPorCodigo(int codigo) throws Exception {
        try {
            String sql = "SELECT * FROM Producto WHERE Codigo = " + codigo + ";";
            consultarBase(sql);

            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getInt(3));
                producto.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Producto buscarProductoPorCodigoFabricante(int codigoFabricante) throws Exception {
        try {
            String sql = "SELECT * FROM Producto WHERE Codigo_Fabricante = " + codigoFabricante + ";";
            consultarBase(sql);

            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getInt(3));
                producto.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

}
