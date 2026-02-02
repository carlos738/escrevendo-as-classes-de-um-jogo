using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Heroi
{
    public class Heroi
    {
        public string Nome{get;set;}
        public int Idade{get;set;}
        public string Tipo{get;set;}

        public Heroi(string nome,int idade,string tipo){
            Nome = nome;
            Idade = idade;
            Tipo = tipo;
        }
        public void Atacar(){
            string ataque = Tipo switch{
                "mago" => "magia",
                "guerrerio" => "espada",
                "monge" => "artes marciais",
                "ninja" => "shuriken",
                _ => "um ataque desonhcido"
            };
            Console.WriteLine($"o {Tipo} atacou usando {ataque}");
        }
    }
    class Program{
        public static void Main(string[] args)
        {
            Heroi heroi1 = new Heroi("Kenhsin", 25, "ninja");
            heroi1.Atacar();
        }
    }
}