
package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Fabricante;


public final class FabricanteDAO extends DAO{
    
    public void guardarFabricante(Fabricante fabricante) throws Exception{
        try {
            if (fabricante == null){
                throw new Exception("Debe indicar un fabricante");
            }
            String sql = "INSERT INTO Fabricante (codigo, nombre)"
                    + "VALUES ( '" + fabricante.getCodigo() + "' , '" + fabricante.getNombre() + "' );";
            insertarModificarElimnar(sql);
                
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    } 
    
    public Fabricante buscarCodigoFabricante(int codigo) throws Exception {
        try {
            String sql = "SELECT * FROM Fabricante WHERE Codigo = " + codigo + ";";
            consultarBase(sql);
            
            Fabricante fabricante = null;
            while (resultado.next()){
               fabricante = new Fabricante();
               fabricante.setCodigo(resultado.getInt(1));
               fabricante.setNombre(resultado.getString(2));
              
            }
            desconectarBase();
            return fabricante;
            
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
    public Fabricante buscarNombreFabricante(String nombre) throws Exception {
        try {
            String sql = "SELECT * FROM fabricante WHERE Nombre like ('%" + nombre + "%');";
            consultarBase(sql);
            
            Fabricante fabricante = null;
            while (resultado.next()){
               fabricante = new Fabricante();
               fabricante.setCodigo(resultado.getInt(1));
               fabricante.setNombre(resultado.getString(2));
              
            }
            desconectarBase();
            return fabricante;
            
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
    
}
