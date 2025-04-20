# Builder - Java Design Pattern

Este módulo demonstra o uso do padrão de projeto **Builder** em Java, utilizando um exemplo prático: construção de um objeto `Carro`.

## O que é o Builder?

O padrão Builder permite a criação de objetos complexos passo a passo, com maior legibilidade, fluência e flexibilidade. Ele é especialmente útil quando um objeto tem muitos atributos opcionais ou combinações de configuração.

---

## Exemplo: Carro

A classe `Carro` possui os seguintes atributos:

- `marca` (obrigatório)
- `modelo` (obrigatório)
- `ano`
- `automatico`
- `cor` (obrigatório)

Utilizamos a classe `CarroBuilder` para construir uma instância de `Carro` de forma fluente:

```java
Carro carro = new CarroBuilder()
    .withMarca("Toyota")
    .withModelo("Corolla")
    .withAno(2024)
    .withAutomatico(true)
    .withCor("Prata")
    .build();

System.out.println(carro);
```

Saida

```java
Toyota Corolla 2024 Automático (Prata)
```

