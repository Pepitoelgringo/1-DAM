package Hotel;


public interface IHotel {
    public void reservarHabitacion(String DNI);
    public void cancelarReserva(String DNI);
    public void cancelarReserva(int numHabitacion);
    public void cargarServicios(int numHabitacion);
    public void generarFactura(int numHabitacion);
    public void habitacionesLibres();
    public int buscarhabitacion(String DNI);
    }