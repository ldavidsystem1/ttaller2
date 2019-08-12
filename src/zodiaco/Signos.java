package zodiaco;

public enum Signos {

    SI1("Acuario"),
    S2("Piscis"),
    S3("Aries"),
    S4("Tauro"),
    S5("Geminis"),
    S6("Cancer"),
    S7("Leo"),
    S8("Virgo"),
    S9("Libra"),
    S10("Scorpio"),
    S11("Sagitario"),
    S12("Capricornio");

    private String c;
    Signos(String s) {
        this.c = s;
    }

    public String getCc() {
        return c;
    }
}
