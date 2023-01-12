import java.util.ArrayList;

public class Sacola {
    private Cliente cliente;
    private ArrayList<Fruta> frutas;

    public Sacola(Cliente cliente) {
        this.cliente = cliente;
        this.frutas = new ArrayList<Fruta>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<String> getFrutas() {
        ArrayList<String> frutas = new ArrayList<String>();
        for (Fruta fruta : this.frutas) {
            frutas.add(fruta.getNome());
        }
        return frutas;
    }

    public void addFruta(Fruta fruta) {
        this.frutas.add(fruta);
    }

    public ArrayList<Fruta> getArrayFruta() {
        return this.frutas;
    }

    @Override
    public String toString() {
        String frutas = String.join(", ", this.getFrutas());
        frutas = frutas.substring(0, frutas.length() - 2) + ".";
        return frutas;
    }
}
