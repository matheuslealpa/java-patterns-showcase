# Abstract Factory - Java Design Pattern

## O que é o Abstract Factory?

O padrão Abstract Factory é um padrão de criação que fornece uma interface para criar famílias de objetos relacionados sem especificar suas classes concretas. Ele permite que o cliente produza objetos de diferentes famílias de produtos de forma intercambiável, garantindo que os objetos criados sejam compatíveis entre si.

# Diagrama de Classes

```plantuml
@startuml

interface MobiliaFactory {
  + createCadeira(): Cadeira
  + createSofa(): Sofa
}

interface Cadeira {
  + sentar(): void
}
interface Sofa {
  + deitar(): void
}

class ModernMobiliaFactory
class VictorianMobiliaFactory
ModernMobiliaFactory ..|> MobiliaFactory
VictorianMobiliaFactory ..|> MobiliaFactory

class ModernCadeira
class VictorianCadeira
class ModernSofa
class VictorianSofa
Cadeira <|.. ModernCadeira
Cadeira <|.. VictorianCadeira
Sofa <|.. ModernSofa
Sofa <|.. VictorianSofa

ModernMobiliaFactory *-- ModernCadeira : creates
ModernMobiliaFactory *-- ModernSofa    : creates
VictorianMobiliaFactory *-- VictorianCadeira : creates
VictorianMobiliaFactory *-- VictorianSofa    : creates

class Main {
  + main(args: String[]): void
}
Main ..> MobiliaFactory : uses

@enduml
```

## Material de apoio

https://refactoring.guru/pt-br/design-patterns/abstract-factory
