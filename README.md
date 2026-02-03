# escrevendo-as-classes-de-um-jogo

📘 Documentação do Projeto: Jogo de Heróis
🎯 Objetivo

Criar uma classe genérica que represente um herói com:

    nome

    idade

    tipo (guerreiro, mago, monge, ninja)

E um método atacar que exibe:
Code

"O {tipo} atacou usando {ataque}"

☕ Java
Código
java

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
            case "mago": ataque = "usou magia"; break;
            case "guerreiro": ataque = "usou espada"; break;
            case "monge": ataque = "usou artes marciais"; break;
            case "ninja": ataque = "usou shuriken"; break;
            default: ataque = "não sabe atacar";
        }
        System.out.println("O " + tipo + " atacou usando " + ataque);
    }
}

public class Main {
    public static void main(String[] args) {
        Heroi mago = new Heroi("Merlin", 150, "mago");
        mago.atacar();
    }
}

Como rodar

    Salve os arquivos como Heroi.java e Main.java.

    Compile:
    bash

javac Heroi.java Main.java

Execute:
bash

    java Main

🐍 Python
Código
python

class Heroi:
    def __init__(self, nome, idade, tipo):
        self.nome = nome
        self.idade = idade
        self.tipo = tipo

    def atacar(self):
        ataques = {
            "mago": "usou magia",
            "guerreiro": "usou espada",
            "monge": "usou artes marciais",
            "ninja": "usou shuriken"
        }
        ataque = ataques.get(self.tipo.lower(), "não sabe atacar")
        print(f"O {self.tipo} atacou usando {ataque}")


mago = Heroi("Merlin", 150, "mago")
mago.atacar()

Como rodar

    Salve como heroi.py.

    Execute no terminal:
    bash

    python heroi.py

⚙️ C#
Código
csharp

using System;

public class Heroi {
    public string Nome { get; set; }
    public int Idade { get; set; }
    public string Tipo { get; set; }

    public Heroi(string nome, int idade, string tipo) {
        Nome = nome;
        Idade = idade;
        Tipo = tipo;
    }

    public void Atacar() {
        string ataque = Tipo.ToLower() switch {
            "mago" => "usou magia",
            "guerreiro" => "usou espada",
            "monge" => "usou artes marciais",
            "ninja" => "usou shuriken",
            _ => "não sabe atacar"
        };
        Console.WriteLine($"O {Tipo} atacou usando {ataque}");
    }
}

class Program {
    static void Main() {
        Heroi guerreiro = new Heroi("Arthur", 30, "guerreiro");
        guerreiro.Atacar();
    }
}

Como rodar

    Salve como Program.cs.

    Compile:
    bash

csc Program.cs

(ou use dotnet build se estiver em um projeto .NET).

Execute:
bash

Program.exe

ou
bash

    dotnet run

🌐 JavaScript
Código
javascript

class Heroi {
    constructor(nome, idade, tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    atacar() {
        let ataque;
        switch (this.tipo.toLowerCase()) {
            case "mago": ataque = "usou magia"; break;
            case "guerreiro": ataque = "usou espada"; break;
            case "monge": ataque = "usou artes marciais"; break;
            case "ninja": ataque = "usou shuriken"; break;
            default: ataque = "não sabe atacar";
        }
        console.log(`O ${this.tipo} atacou usando ${ataque}`);
    }
}

const ninja = new Heroi("Hanzo", 25, "ninja");
ninja.atacar();

Como rodar

    Salve como heroi.js.

    Execute no terminal:
    bash

    node heroi.js

📊 Comparação de Execução
Linguagem	Arquivo	Comando de execução
Java	Main.java	javac Heroi.java Main.java && java Main
Python	heroi.py	python heroi.py
C#	Program.cs	csc Program.cs && Program.exe ou dotnet run
JS	heroi.js	node heroi.js
🎯 Conclusão

    O projeto é simples e pode ser rodado em qualquer linguagem.

    Em Java, você compila e roda com javac/java.

    Em Python, basta executar o script.

    Em C#, você compila com csc ou usa dotnet run.

    Em JavaScript, roda com node.

## Comando usado para acessar o localhost do projeto ClasseDoHeroi em java
http://localhost:8080/heroi/atacar?nome=Merlin&idade=150&tipo=mago
