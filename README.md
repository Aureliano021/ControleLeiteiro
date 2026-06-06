# 🐄 Controle Leiteiro

Um sistema desenvolvido em Java para digitalizar o controle manual da produção de leite em propriedades rurais. Ele atua como um **histórico detalhado da produção do rebanho** e facilita o **fechamento financeiro mensal** com laticínios.

Este projeto nasceu como um laboratório prático para consolidar conceitos de Engenharia de Software aplicados a um problema real de gestão no interior da Bahia. A arquitetura inicial via terminal já pavimenta o caminho para uma futura integração mobile e web.

## ✅ Funcionalidades

* **Registro Diário e Consumo:** Inserção da produção do dia e marcação de retiradas para consumo interno.
* **Relatórios e Histórico:** Visualização de registros por data específica, com cálculos totais filtrados por mês ou ano.
* **Validação Automática:** Suporte inteligente a datas retroativas (`dd/MM/yyyy`).
* **Persistência Local:** Salvamento automático estruturado em `.json`.

<details>
<summary><b>Ver estrutura do JSON gerado</b></summary>

```json
[
  {
    "quantidadeleite": 180,
    "data": "19/05/2026",
    "fora": false
  }
]
```
</details>

## 🚀 Próximos Passos

* [ ] Tratamento de registros duplicados.
* [ ] **API REST** com Spring Boot para consumo de dados via HTTP.
* [ ] **Aplicativo Android** para uso direto no curral.

## 🛠️ Tecnologias

* **Java 26**
* **Gson:** Serialização e desserialização JSON.
* **Maven:** Gerenciamento de dependências.

## ▶️ Como Executar

1. Clone o repositório.
2. Abra na sua IDE (recomendado: IntelliJ IDEA).
3. Execute a classe `Main`.
4. Um arquivo `arquivoan.json` será criado automaticamente na raiz para armazenar os registros.