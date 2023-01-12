import java.util.ArrayList;

public class Utils {

    private ArrayList<Fruta> f1 = new ArrayList<Fruta>();
    private ArrayList<Fruta> f2 = new ArrayList<Fruta>();

    public Utils(ArrayList<Fruta> f1, ArrayList<Fruta> f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public ArrayList<Fruta> getF1() {
        return f1;
    }

    public void setF1(ArrayList<Fruta> f1) {
        this.f1 = f1;
    }

    public ArrayList<Fruta> getF2() {
        return f2;
    }

    public void setF2(ArrayList<Fruta> f2) {
        this.f2 = f2;
    }

    public ArrayList<Fruta> checaFrutasDuplicadas(ArrayList<Fruta> f1, ArrayList<Fruta> f2) {
        ArrayList<Fruta> frutasDuplicadas = new ArrayList<Fruta>();
        for (Fruta fruta : f1) {
            if (f2.contains(fruta)) {
                frutasDuplicadas.add(fruta);
            }
        }
        return frutasDuplicadas;
    }
}
