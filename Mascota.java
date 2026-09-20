import java.time.LocalDate;

public class Mascota {
    private String nombre;
    private String raza;
    private int anioNacimiento = 0;
    private Persona miVeterinario;
 
    public Mascota(String pNombre, String pRaza) {
        nombre = pNombre;
        raza = pRaza;
    }
 
    public Mascota(String pNombre, String pRaza, int pAnioNacimiento) {
        nombre = pNombre;
        raza = pRaza;
        anioNacimiento = pAnioNacimiento;
    }
 
    public String consultaNombreVeterinario() {
        if (miVeterinario == null) {
            return "Sin veterinario asignado";
        }
        return miVeterinario.getNombre();
    }
 
    public void asignarVeterinario(Persona vet) {
        miVeterinario = vet;
    }
 
    private int calcularEdadCanina() {
        if(anioNacimiento == 0){
            return 0;
        }
        return calcularAnioActual() - anioNacimiento;
    }
    
    private int calcularEdadHumana() {
        return calcularEdadCanina() * 7;
    }
    
    private int calcularAnioActual() {
        return LocalDate.now().getYear();
    }
 
     public String getNombre() {
        return nombre;
    }
 
        public String toString() {
        return "Nombre: " + nombre
             + "\nRaza: " + raza
             + "\nAño de nacimiento: " + anioNacimiento
             + "\nEdad canina: " + calcularEdadCanina()
             + "\nEdad humana: " + calcularEdadHumana()
             + "\nVeterinario: " + consultaNombreVeterinario();
    }
}
 
