# 5-Desafio-Java10x

Este projeto foi criado para praticar e demonstrar o que aprendi sobre Programação Orientada a Objetos em Java.

## ✅ O que eu usei

- **Interface**: para definir os métodos básicos de uma conta (`consultarSaldo` e `depositar`).
- **Classe Abstrata**: com o atributo `saldo` e métodos compartilhados.
- **Herança**: para criar dois tipos de contas diferentes.
- **Enum**: para representar os tipos de conta (CORRENTE e POUPANCA).
- **Polimorfismo**: usando a interface como tipo para permitir comportamentos diferentes.
- **Transferência**: método para transferir saldo entre contas diferentes.

## 🧱 Estrutura do projeto

- `Conta`: interface com métodos `consultarSaldo()` e `depositar(double valor)`.
- `ContaBancaria`: classe abstrata que implementa `Conta` e contém o saldo.
- `ContaCorrente`: classe que herda de `ContaBancaria` e faz depósito normal.
- `ContaPoupanca`: classe que herda de `ContaBancaria` e aplica uma taxa de 1% no depósito.
- `TipoConta`: enum que define os tipos de conta.
- `BancoKonoha`: classe com método para transferir saldo entre contas.
