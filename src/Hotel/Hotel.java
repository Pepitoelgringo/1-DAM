package Hotel;
import java.util.Objects;
import java.util.Scanner;


public class Hotel {
    Scanner reader = new Scanner(System.in);
    String nombreHotel;
    private int totalhabitacioneshotel;
    private int numhabitacion;
    String clientehabitacion [];
    float numdiascliente[];
    float gastoshabitacion[];
    private String DNI;
    private int opcioncargar;
    private final float comida=12.50f;
    private final float bebida=4.50f;
    private final float spa=25;
    private float gastostotalescomida=0;
    private int diasenelhotel;
    private int costodiahotel=50;

    public Hotel(String nombreHotel, int totalhabitacioneshotel) {
        this.nombreHotel = nombreHotel;
        this.totalhabitacioneshotel = totalhabitacioneshotel;
        this.clientehabitacion = new String[totalhabitacioneshotel];
        numdiascliente = new float[totalhabitacioneshotel];
        gastoshabitacion = new float[totalhabitacioneshotel];
    }

    public void reservarHabitacion(String DNI){
        for (int i=0; i < clientehabitacion.length; i++) {
            if (clientehabitacion[i] == null) {
                clientehabitacion[i] = DNI;
                System.out.println("Se le ha asignado la habitacion numero: " +i);
                break;
            }
        }
    }
    public void cancelarReserva(String DNI) {
        for (int i=0; i < clientehabitacion.length; i++) {
            if (Objects.equals(clientehabitacion[i], DNI)) {
                clientehabitacion[i] = null;
                System.out.println("Reserva cancelada, que tengas un buen dia");
            }
        }
    }
    public void cargarServicios(int numHabitacion) {
        int contadorcomida=0,contadorbebida=0,contadorspa=0;
        do {
            System.out.println("Escriba 1 si desea una bebida, 2 para comida, 3 para una sesion de spa y 0 para finalizar");
            opcioncargar = reader.nextInt();
            if (opcioncargar==1) {
                contadorbebida++;
            }else if (opcioncargar==2) {
                contadorcomida++;
            } else if (opcioncargar==3) {
                contadorspa++;
            }
        } while (opcioncargar!=0);
        gastoshabitacion[numHabitacion] = Float.parseFloat(String.valueOf(contadorbebida*bebida+contadorcomida*comida+contadorspa*spa));
        System.out.println("La factura de esta compra asciende a: " +gastoshabitacion[numHabitacion]+" euros");
    }
    public void generarFactura(int numHabitacion) {
        System.out.println("¿Cuantos dias ha estado en el hotel?");
        diasenelhotel = reader.nextInt();
        costodiahotel = diasenelhotel*costodiahotel;
        numdiascliente[numHabitacion] = Float.parseFloat(String.valueOf(costodiahotel));
        gastoshabitacion[numHabitacion] = gastoshabitacion[numHabitacion] + numdiascliente[numHabitacion];
        System.out.println("El precio total de su estancia es de : "+gastoshabitacion[numHabitacion]);
    }
    public int habitacionesLibres() {
        int contadorhabitacioneslibres=0;
        for (int i=0; i < clientehabitacion.length; i++) {
            if (clientehabitacion[i]==null) {
                contadorhabitacioneslibres++;
            }
        }
        return contadorhabitacioneslibres;
    }
    public int buscarhabitacion(String DNI) {
        int buscadorhabitacion=-1;
        for (int i=0; i < clientehabitacion.length;i++) {
            buscadorhabitacion++;
            if (Objects.equals(clientehabitacion[i], DNI)) {
                break;
            }
        }
        return buscadorhabitacion;
    }
    //public int comprobardnihabitacion(String DNI) {

   //}
}