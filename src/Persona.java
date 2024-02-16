public class Persona {
    private String nombre;
    private int edad;
    private char sexo;
    private String DNI;
    private float peso;
    private float altura;
    private float IMC=0;
    private int numdni;
    private char letradni;
//GETS AND SETS
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getIMC() {
        return IMC;
    }
    public void setIMC(float IMC) {
        this.IMC = IMC;
    }
    public int getNumdni() {
        return numdni;
    }
    public void setNumdni(int numdni) {
        this.numdni = numdni;
    }
    public char getLetradni() {
        return letradni;
    }
    public void setLetradni(char letradni) {
        this.letradni = letradni;
    }
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", DNI='" + DNI + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", IMC=" + IMC +
                ", numdni=" + numdni +
                ", letradni=" + letradni +
                '}';
    }
    public Persona(String nombre, int edad, char sexo, String DNI, float peso, float altura) {
            this.nombre = nombre;
            this.edad = edad;
            this.sexo = sexo;
            this.DNI = DNI;
            this.peso = peso;
            this.altura = altura;
        }
        public Persona(String nombre, int edad, char sexo, float peso, float altura) {
            this.nombre = nombre;
            this.edad = edad;
            this.sexo = sexo;
            this.peso = peso;
            this.altura = altura;
        }
        public Persona (){
        }
        private void calcularIMC (float peso, float altura) {
            this.peso = peso;
            this.altura = altura;
            this.IMC = peso/(altura*altura);
        }
        public void generar_dni () {
            generar_numero_dni();
            generar_letra_dni();
            System.out.println("Su nuevo DNI es: " + this.numdni + this.letradni);
        }
        private void generar_numero_dni () {
            this.numdni = (int) (Math.random()*100000000);
        }
        private void generar_letra_dni () {
            char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                    'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
            int restodni = this.numdni%23;
            this.letradni = letras[restodni];
        }
        public void calcular_mas_18 () {

            if (this.edad >=18) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("No es mayor de edad");
            }
        }
        public void HoM (char sexo) {
            this.sexo = sexo;
            calcularIMC(this.peso,this.altura);
            if (sexo =='m') {
                if (IMC < 16) {
                    System.out.println("Desnutrición");}
                if (IMC >= 16 && IMC <=19.9) {
                    System.out.println("Bajo peso");}
                if (IMC >= 20 && IMC <=23.9) {
                    System.out.println("Peso normal");}
                if (IMC >= 24 && IMC <=28.9) {
                    System.out.println("Ligero sobrepeso");}
                if (IMC >= 29 && IMC <=37) {
                    System.out.println("Obesidad severa");}
                if (IMC >= 37) {
                    System.out.println("Obesidad morbida");}
            } else {
                if (IMC < 17) {
                    System.out.println("Desnutrición");}
                if (IMC >= 17 && IMC <=19.9) {
                    System.out.println("Bajo peso");}
                if (IMC >= 20 && IMC <=24.9) {
                    System.out.println("Peso normal");}
                if (IMC >= 25 && IMC <=29.9) {
                    System.out.println("Ligero sobrepeso");}
                if (IMC >= 30 && IMC <=40) {
                    System.out.println("Obesidad severa");}
                if (IMC >= 40) {
                    System.out.println("Obesidad morbida");}
            }
        }
    }