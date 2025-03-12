# Desafio Controle de Fluxo - DIO

## 📌 Sobre o Projeto
Este projeto foi desenvolvido como parte do desafio da DIO (Digital Innovation One) na trilha de **Java Básico**. Ele consiste em um programa que recebe dois números inteiros como entrada e realiza uma contagem de acordo com a diferença entre eles. Caso o primeiro número seja maior que o segundo, uma exceção personalizada é lançada.

## 🚀 Tecnologias Utilizadas
- Java 11+
- IntelliJ IDEA ou qualquer outra IDE compatível

## 📂 Estrutura do Projeto
```
DesafioControleFluxo/
│── bin/
│── src/
│   ├── Contador.java
│   ├── ParametrosInvalidosException.java
│── lib/
│── .vscode/
│── README.md
```

## ⚙️ Como Executar
### **1️⃣ Clonar o Repositório**
```bash
git clone https://github.com/seu-usuario/desafio-controle-fluxo.git
cd desafio-controle-fluxo
```

### **2️⃣ Compilar e Executar o Código**
Se estiver usando o terminal:
```bash
javac -d bin src/Contador.java
java -cp bin Contador
```
Ou execute o arquivo `Contador.java` diretamente pela IDE.

## 📝 Regras do Programa
1. O usuário deve inserir dois números inteiros.
2. Se o primeiro número for **maior** que o segundo, a exceção `ParametrosInvalidosException` será lançada.
3. Caso contrário, o programa imprimirá uma sequência de números até a diferença entre os valores informados.

## 💻 Exemplo de Entrada e Saída
### **Entrada:**
```
Digite o primeiro parâmetro:
5
Digite o segundo parâmetro:
10
```

### **Saída:**
```
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
Imprimindo o número 4
Imprimindo o número 5
```

Se o primeiro número for maior:
```
Digite o primeiro parâmetro:
10
Digite o segundo parâmetro:
5
```
Saída:
```
O segundo parâmetro deve ser maior que o primeiro
```

## 📌 Autor
Desenvolvido por [Gabriel Eric](https://github.com/Gabriel-Eric08). Sinta-se à vontade para contribuir! 🚀
