# Proxy - Java Design Pattern

## O que é o Proxy?

O padrão Proxy fornece um **substituto ou representante** de outro objeto para controlar o acesso a ele. Ele é útil para adicionar funcionalidades como **caching, logging, autenticação, fallback ou controle de acesso**, sem alterar a lógica da implementação real.

---

## Exemplo 1: Integração com serviço externo (CEP)

Neste exemplo, simulamos a chamada a um serviço de busca de endereço via CEP. O proxy é responsável por:

- Interceptar a chamada real
- Registrar logs
- Implementar lógica de fallback em caso de falha

### Componentes:

- `CepService`: Interface que define a operação `buscarEnderecoPorCep`.
- `CepServiceImpl`: Simula a chamada real ao serviço externo.
- `CepServiceProxy`: Implementa a lógica de proxy com controle de erro e fallback.

### Exemplo de uso:

```java
CepService real = new CepServiceImpl();
CepService proxy = new CepServiceProxy(real);

String resultado = proxy.buscarEnderecoPorCep("66000-000");
System.out.println(resultado);
```

## Diagrama de classe 

```plantuml
@startuml
interface CepService {
    +buscarEnderecoPorCep(cep: String): String
}

class CepServiceImpl implements CepService {
    +buscarEnderecoPorCep(cep: String): String
}

class CepServiceProxy implements CepService {
    -realService: CepService
    +CepServiceProxy(realService: CepService)
    +buscarEnderecoPorCep(cep: String): String
}

CepService <|.. CepServiceImpl
CepService <|.. CepServiceProxy
CepServiceProxy --> CepService : delega chamadas
@enduml

```


## EExemplo 2: Controle de acesso a documentos

Neste segundo exemplo, usamos o proxy para restringir o acesso a documentos com base no usuário.


### Componentes:

- `Documento`: Interface que define a operação exibir().
- `DocumentoReal`: Implementação real com o conteúdo do documento.
- `DocumentoProxy`: Controla o acesso, permitindo apenas usuários autorizados.

### Exemplo de uso:

```java
Documento doc1 = new DocumentoProxy(new DocumentoReal("Segredo TOP"), "admin");
doc1.exibir(); // Acesso permitido

Documento doc2 = new DocumentoProxy(new DocumentoReal("Segredo TOP"), "convidado");
doc2.exibir(); // Acesso negado
```

## Diagrama de classe 

```plantuml
@startuml
interface Documento {
    +exibir(): void
}

class DocumentoReal implements Documento {
    -conteudo: String
    +DocumentoReal(conteudo: String)
    +exibir(): void
}

class DocumentoProxy implements Documento {
    -documentoReal: DocumentoReal
    -usuario: String
    +DocumentoProxy(documentoReal: DocumentoReal, usuario: String)
    +exibir(): void
}

Documento <|.. DocumentoReal
Documento <|.. DocumentoProxy
DocumentoProxy --> DocumentoReal : delega com controle de acesso
@enduml

```
