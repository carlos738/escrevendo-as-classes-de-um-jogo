const express = require("express");
const req = require("express/lib/request");
const res = require("express/lib/response");
const app = express();

class Heroi{
    constructor(nome,idade,tipo){
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }
    atacar(){
        const ataque={
            mago: "magia",
            guerreiro: "espada",
            monge: "artes marciais",
            ninja: "shuriken"

        };
        return `o ${this.tipo} atacou usando ${ataques[this.tipo] || "ataque desconhecido"}`;
    }
}
const herois = [
    new Heroi("Merlin", 100, "mago"),
    new Heroi("Arthas", 30, "guerreiro"),
    new Heroi("Shaolin", 40, "monge"),
    new Heroi("Kenshin", 25, "ninja")
];
app.get("/herois", (req, res)=> res.json(herois));
app.get("/herois/atacar/nome", (req, res)=> {
    const heroi = herois.find(h => h.nome.toLowerCase()=== req.params.nome.toLowerCase());
    res.send(heroi ? heroi.atacar() : "Herói não encontrado");
});
app.listen(3000, ()=> console.log("Servidor Node está rodando na porta 3000"));





