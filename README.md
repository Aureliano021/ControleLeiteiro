# 🐄 CalendarioLeite

Sistema de registro de produção de leite desenvolvido em Java, criado para substituir o controle manual em caderno e facilitar o fechamento mensal com a cooperativa.

## 💡 Contexto

Em propriedades rurais, o leite coletado pelas vacas é enviado diariamente ao carro do leite, que transporta ao resfriador e depois à cooperativa (DaVaca). No final do mês, o produtor precisa bater o total registrado com os dados da cooperativa para receber o pagamento corretamente.

Este sistema automatiza esse controle, substituindo o caderno físico por registros digitais estruturados.

## ✅ Funcionalidades atuais

- Registrar diariamente a quantidade de leite produzida
- Indicar se houve retirada para consumo interno (`fora: true`)
- Persistência dos dados em arquivo `.json` local
- Visualizar registro por data específica
- Validação de data com suporte a datas retroativas

## 🗂️ Estrutura do JSON gerado

```json
[
  {
    "quantidadeleite": 180,
    "data": "19/05/2026",
    "fora": false
  },
  {
    "quantidadeleite": 120,
    "data": "20/05/2026",
    "fora": true
  }
]
```

## 🚧 Funcionalidades planejadas

- [ ] Soma total por mês para fechamento com a cooperativa
- [ ] Menu interativo no terminal (adicionar, visualizar, resumo mensal)
- [ ] Validação de entrada de dados (ex: impedir datas futuras)
- [ ] Detectar registro duplicado para o mesmo dia

## 🔮 Futuro do projeto

- **API REST** com Spring Boot para servir os dados via HTTP
- **Aplicativo Android** para registro e consulta pelo celular no campo

## 🛠️ Tecnologias

- Java 26
- [Gson](https://github.com/google/gson) — serialização/deserialização JSON
- Maven

## ▶️ Como executar

1. Clone o repositório
2. Abra no IntelliJ IDEA
3. Execute a classe `Main`
4. Na primeira execução, o arquivo `arquivo.json` será criado automaticamente

## 👨‍💻 Sobre

Projeto desenvolvido durante o aprendizado de Java no curso de Engenharia de Software — Uniasselvi. Criado para resolver um problema real do dia a dia em uma propriedade rural no interior da Bahia.
