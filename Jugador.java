//Ricardo Quelal
public class Jugador extends Persona {

    private boolean esCapitan;

    public Jugador(String nombre, String apellido, int edad, String cedula, String telefono, boolean esCapitan) {
        super(nombre, apellido, edad, cedula, telefono);
        this.esCapitan = esCapitan;
    }

    public boolean isEsCapitan() {
        return esCapitan;
    }

    public void setEsCapitan(boolean esCapitan) {
        this.esCapitan = esCapitan;
    }

    @Override
    public String toString() {
        return super.toString() + (esCapitan ? " [CAPITÁN / DELEGADO]" : "");
    }
}