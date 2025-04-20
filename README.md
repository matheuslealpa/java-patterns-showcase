# Java Design Patterns Showcase

Projeto com o objetivo de documentar e exemplificar os principais **Design Patterns** utilizando **Java 21** e **Maven**.

## Estrutura do Projeto

Este repositório é estruturado como um projeto multi-módulo Maven. Cada módulo representa um padrão de projeto isolado com sua própria implementação e exemplos.

### Módulos disponíveis

- `factory-method`: Demonstra a criação de objetos utilizando o padrão Factory Method com uso moderno de `static of()` por exemplo.
- `builder`: Demonstra a criação de objetos complexos passo a passo com o padrão **Builder**, utilizando como exemplo a construção de um objeto `Carro`.

## Execução

Para executar um módulo específico (ex: `factory-method`), use:

```bash
mvn clean install -pl modules/factory-method exec:java
