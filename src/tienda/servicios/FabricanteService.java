
package tienda.servicios;

import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

public final class FabricanteService {
    
    private Scanner leer;
    private Fabricante f;
    private FabricanteDAO fd;

    public FabricanteService() {
        leer = new Scanner(System.in).useDelimiter("\n");
        this.f = new Fabricante();
        this.fd = new FabricanteDAO();
    }
    
    
    
    public void ingresarFabricante() throws Exception {
        try {
            System.out.print("Ingrese el código del fabricante: ");
            int codigo = leer.nextInt();
            if (fd.buscarCodigoFabricante(codigo) != null) {
                throw new Exception("Error, codigo de fabricante ya registrado en el sistema");
            }
            f.setCodigo(codigo);
            System.out.print("Ingrese el nombre del fabricante: ");
            String nombre = leer.next();
            if (fd.buscarNombreFabricante(nombre) != null) {
                throw new Exception("Error, nombre de fabricante ya registrado en el sistema");
            }
            f.setNombre(nombre);
            fd.guardarFabricante(f);
            System.out.println("Fabricante ingresado correctamente en la base de datos.");
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    
}
