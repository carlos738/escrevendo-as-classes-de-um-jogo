using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http.Headers;
using System.Threading.Tasks;
using JogoCSharp.Models;
using Microsoft.AspNetCore.Mvc;

namespace JogoCSharp.Controllers
{
    [ApiController]
    [Route("api/[controller]")]
    public class HeroisController  : ControllerBase
    {
        private static List<Heroi> herois = new List<Heroi>{
             new Heroi("Merlin", 100, "mago"),
            new Heroi("Arthas", 30, "guerreiro"),
            new Heroi("Shaolin", 40, "monge"),
            new Heroi("Kenshin", 25, "ninja")
        };
        
        [HttpGet]
        public IEnumerable<Heroi> Get() => herois;

        [HttpGet("atacar/{nome}")]
        public string Atacar(string nome){
            var heroi = herois.FirstOrDefault(h => h.Nome.ToLower() == nome.ToLower());
            return heroi != null ? heroi.Atacar() : "Herói não encontrado";
        }
    }
}