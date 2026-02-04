"use strict";

function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }

function _defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if ("value" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } }

function _createClass(Constructor, protoProps, staticProps) { if (protoProps) _defineProperties(Constructor.prototype, protoProps); if (staticProps) _defineProperties(Constructor, staticProps); return Constructor; }

var express = require("express");

var req = require("express/lib/request");

var res = require("express/lib/response");

var app = express();

var Heroi =
/*#__PURE__*/
function () {
  function Heroi(nome, idade, tipo) {
    _classCallCheck(this, Heroi);

    this.nome = nome;
    this.idade = idade;
    this.tipo = tipo;
  }

  _createClass(Heroi, [{
    key: "atacar",
    value: function atacar() {
      var ataque = {
        mago: "magia",
        guerreiro: "espada",
        monge: "artes marciais",
        ninja: "shuriken"
      };
      return "o ".concat(this.tipo, " atacou usando ").concat(ataques[this.tipo] || "ataque desconhecido");
    }
  }]);

  return Heroi;
}();

var herois = [new Heroi("Merlin", 100, "mago"), new Heroi("Arthas", 30, "guerreiro"), new Heroi("Shaolin", 40, "monge"), new Heroi("Kenshin", 25, "ninja")];
app.get("/herois", function (req, res) {
  return res.json(herois);
});
app.get("/herois/atacar/nome", function (req, res) {
  var heroi = herois.find(function (h) {
    return h.nome.toLowerCase() === req.params.nome.toLowerCase();
  });
  res.send(heroi ? heroi.atacar() : "Herói não encontrado");
});
app.listen(3000, function () {
  return console.log("Servidor Node está rodando na porta 3000");
});