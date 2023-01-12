import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo a frutaria driven!");

        Cliente c1 = new Cliente("Victor");
        Cliente c2 = new Cliente("Gabriel");

        Fruta uva = new Fruta("Uva");
        Fruta banana = new Fruta("Banana");
        Fruta acerola = new Fruta("Acerola");
        Fruta morango = new Fruta("Morango");
        Fruta laranja = new Fruta("Laranja");

        System.out.println("\nTemos as seguintes frutas cadastradas:");

        System.out.println(uva.getNome());
        System.out.println(banana.getNome());
        System.out.println(acerola.getNome());
        System.out.println(morango.getNome());
        System.out.println(laranja.getNome());

        Sacola s1 = new Sacola(c1);
        Sacola s2 = new Sacola(c2);

        s1.addFruta(uva);
        s1.addFruta(banana);
        s1.addFruta(acerola);

        s2.addFruta(morango);
        s2.addFruta(laranja);
        s2.addFruta(banana);

        System.out.println("\nTemos dois clientes e cada um com sua sacola");

        System.out.println(
                "\n O primeiro cliente é " + s1.getCliente().getNome() + " e ele tem as seguintes frutas na sacola:");
        System.out.println(s1.toString());

        System.out.println(
                "\n O segundo cliente é " + s2.getCliente().getNome() + " e ele tem as seguintes frutas na sacola:");
        System.out.println(s2.toString());

        System.out.println("\nVamos verificar se temos frutas duplicadas nas sacolas");

        Utils u = new Utils(s1.getArrayFruta(), s2.getArrayFruta());

        ArrayList<Fruta> frutasDuplicadas = u.checaFrutasDuplicadas(s1.getArrayFruta(), s2.getArrayFruta());

        if (frutasDuplicadas.size() > 0) {
            System.out.println("\nTemos frutas duplicadas nas sacolas, são elas:");
            for (Fruta fruta : frutasDuplicadas) {
                System.out.println(fruta.getNome());
            }
        } else {
            System.out.println("\nNão temos frutas duplicadas nas sacolas");
        }

    }
}
