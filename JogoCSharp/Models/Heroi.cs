using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace JogoCSharp.Models
{
    public class Heroi
    {

        public string Nome { get; set; }
        public int Idade { get; set; }
        public string Tipo { get; set; }

        public Heroi(string nome, int idade, string tipo)
        {
            Nome = nome;
            Idade = idade;
            Tipo = tipo;

        }
        public string Atacar()
        {
            return Tipo.ToLower() switch
            {
                "mago" => $"o {Tipo} atacou usando magia",
                "guerreiro" => $"o {Tipo} atacou usando espada",
                "monge" => $"o {Tipo} atacou usando artes marciais",
                "ninja" => $"o {Tipo} atacou usando shuriken",
                _ => $"o {Tipo} atacou de forma desconhecida"
            };
        }
    }
}