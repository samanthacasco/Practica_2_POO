import java.util.ArrayList;

public class Persona{
    private String nombre;
    private String codigoLicencia;
    private ArrayList<Mascota> misMascotas;
    
    public Persona(String pNombre, String pCodigoLicencia){
        nombre = pNombre;
        codigoLicencia = pCodigoLicencia;
        misMascotas = new ArrayList<Mascota>();
    }
    
    public void asignarMascota(Mascota mascota){
        misMascotas.add(mascota);    
    }
    
    public String consultarNombreMisMascotas(){
        String nombresMascotas = "";
        for(Mascota mascotaActual : misMascotas){
            nombresMascotas += mascotaActual.getNombre() + "\n";
        }
        return nombresMascotas;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String toString(){
        return "Nombre: " + nombre + "\nCodigo de licencia: " + codigoLicencia;
    }
}