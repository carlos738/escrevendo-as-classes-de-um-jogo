public class Heroi {
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
        switch (tipo.toLowerCase()) {
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
    public static void main(String[] args) {
        Heroi heroi1 = new Heroi("Merlin", 100,"mago");
        heroi1.atacar();
    }

}
