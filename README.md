# Gerador de Anagramas em Java 21
Este projeto � uma aplica��o Java criada com objetivo de gerar todos os poss�veis anagramas a partir de um conjunto de letras distintas.

## Funcionalidade
Dada uma lista de letras distintas, o programa retorna todas as poss�veis combina��es (anagramas).  
Exemplo de entrada: `["a", "b", "c"]`  
Sa�da esperada:
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

### 3. Executar os testes unit�rios
```bash
mvn test
```

Os testes est�o definidos na classe `AnagramGeneratorTest.java` e cobrem:
- Entrada com letras v�lidas
- Entrada com apenas uma letra
- Entrada vazia (deve lan�ar exce��o)

### 4. Exemplo de uso no c�digo
```java
List<String> anagrams = AnagramGenerator.generateAnagrams("abc");
anagrams.forEach(System.out::println);
```

## Observa��es
- A entrada deve conter apenas letras (`a-z` ou `A-Z`) e n�o pode estar vazia.
- Letras repetidas n�o s�o suportadas.
- A valida��o � feita automaticamente antes da gera��o dos anagramas.

## Autor
Projeto desenvolvido por `LUCAS FARIA`.
