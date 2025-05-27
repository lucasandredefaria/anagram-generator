# Gerador de Anagramas em Java 21
Este projeto é uma aplicação Java criada com objetivo de gerar todos os possíveis anagramas a partir de um conjunto de letras distintas.

## Funcionalidade
Dada uma lista de letras distintas, o programa retorna todas as possíveis combinações (anagramas).  
Exemplo de entrada: `["a", "b", "c"]`  
Saída esperada:
```
abc  
acb  
bac  
bca  
cab  
cba  
```

## Estrutura do Projeto

```
anagram-generator/
??? pom.xml
??? README.md
??? src/
?   ??? main/
?   ?   ??? java/com/example/
?   ?       ??? AnagramGenerator.java
?   ??? test/
?       ??? java/com/example/
?           ??? AnagramGeneratorTest.java
```

## Requisitos
- Java 21
- Maven 3.x

## Como Executar

### 1. Clonar o projeto

```bash
git clone https://github.com/lucasandredefaria/anagram-generator.git
cd anagram-generator
```
### 2. Build do projeto com Maven
```bash
mvn clean install
```

### 3. Executar os testes unitários
```bash
mvn test
```

Os testes estão definidos na classe `AnagramGeneratorTest.java` e cobrem:
- Entrada com letras válidas
- Entrada com apenas uma letra
- Entrada vazia (deve lançar exceção)

### 4. Exemplo de uso no código
```java
List<String> anagrams = AnagramGenerator.generateAnagrams("abc");
anagrams.forEach(System.out::println);
```

## Observações
- A entrada deve conter apenas letras (`a-z` ou `A-Z`) e não pode estar vazia.
- Letras repetidas não são suportadas.
- A validação é feita automaticamente antes da geração dos anagramas.

## Autor
Projeto desenvolvido por `LUCAS FARIA`.
