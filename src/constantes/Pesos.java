package constantes;

public enum Pesos {

    PESO1("Bajo peso."),
    PESO2("Peso normal"),
    PESO3("Sobrepeso"),
    PESO4("Obesidad 1"),
    PESO5("Obesidad 2"),
    PESO6("Obesidad 3"),
    PESO7("Obesidad 4");


    private String b;
    Pesos(String s) {
        this.b = s;
    }

    public String getBb() {
        return b;
    }
}
