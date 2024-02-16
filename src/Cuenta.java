import javax.swing.*;

public class Cuenta {
    public double cantidad;
    public String titular;
    public double deuda;
    public Cuenta(int cantidad, String titular) {
        this.cantidad = cantidad;
        this.titular = titular;
        this.deuda = deuda;
    }
    public void ingresardinero (double dinero){
        this.cantidad+= dinero; //this.cantidad = this.cantidad + dinero;
    }
    public void retirardinero (double dinero) {

        if (dinero > this.cantidad )
            System.out.println("asfw");
         else this.cantidad-= dinero;
    }
    public void pedirprestamo (double dinero) {
        this.deuda += dinero + dinero/10;
    }
    public void ver_saldo () {
        System.out.println("El saldo de tu cuenta es: "+ this.cantidad);
        //JOptionPane.showMessageDialog(null, "El saldo de tu cuenta es: "+ this.cantidad);

    }
    public void ver_deuda () {
        System.out.println("Su deuda asciende a " + this.deuda);
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "cantidad=" + cantidad +
                ", titular='" + titular + '\'' +
                ", deuda=" + deuda +
                '}';
    }
}