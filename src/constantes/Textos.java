package constantes;

public enum Textos {
    TITULO("QUE DESEA HACER?..."),
    OP1("1.Masa corporal."),
    OP11("Ingrese peso:"),
    OP12("Ingrese estatura:"),
    OP13("La masa corporal es: "),
    OP2("2.Signo zodiacal."),
    OP21("Ingrese dia"),
    OP22("Ingrese mes"),
    OP23("Ingrese año"),
    OP3("3.Salario."),
    OP4("4.Vector."),
    OP5("5.Salir."),
    OP31("Ingrese cantidad de salarios: "),
    OP32("Salario:"),
    OP33("Ingresar salario?"),
    OP34("Seleccione:"),
    OP35("El salario maximo ingresado es: "),
    OP36("El promedio de los salarios ingresados es: "),
    OP37("El cantidad total de salarios pagados es: "),
    OP41("Cuantos numeros desea ingresar?"),
    OP42("Ingrese numero:"),
    OP43("El promedio de los numeros positivos es: "),
    OP44("El promedio de los numeros negativos es: ");

    private String a;
    Textos(String s) {
        this.a = s;
    }

    public String getAa() {
        return a;
    }
}
