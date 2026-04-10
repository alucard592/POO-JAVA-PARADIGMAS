import java.util.ArrayList;
import java.util.List;

public class Casa {
    private String direccion;
    private List<Habitacion> habitaciones;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
    }

    public void agregarHabitacion(String nombreHabitacion) {
        // La habitacion se crea DENTRO de Casa (composicion fuerte)
        Habitacion habitacion = new Habitacion(nombreHabitacion);
        habitaciones.add(habitacion);
    }

    public void mostrarHabitaciones() {
        System.out.println("Casa ubicada en: " + direccion);
        for (Habitacion habitacion : habitaciones) {
            System.out.println("- " + habitacion.getNombre());
        }
    }
}
