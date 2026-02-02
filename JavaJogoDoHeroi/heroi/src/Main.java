import java.util.ArrayList;

class Heroi {
    private String nome;
    private int idade;
    private String tipo;

    public Heroi(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public void atacar() {
        String ataque;
        switch (tipo) {
            case "mago":
                ataque = "magia";
                break;
            case "guerreiro":
                ataque = "espada";
                break;
            case "monge":
                ataque = "artes marciais";
                break;
            case "ninja":
                ataque = "shuriken";
                break;
            default:
                ataque = "um ataque desconhecido";
        }
        System.out.println("o " + tipo + " atacou usando " + ataque);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Heroi> herois = new ArrayList<>();
        herois.add(new Heroi("Merlin", 100, "mago"));
        herois.add(new Heroi("Arthas", 30, "guerreiro"));
        herois.add(new Heroi("Shaolin", 40, "monge"));
        herois.add(new Heroi("Kenshin", 25, "ninja"));

        for (Heroi h : herois) {
            h.atacar();
        }
    }
}
