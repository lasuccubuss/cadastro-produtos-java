# 🛍️ Cadastro de Produtos em Java

Sistema simples de terminal feito em Java para cadastro, verificação de estoque e cálculo de reposição de produtos. Desenvolvido com foco em entrada interativa usando `Scanner`, estruturas de repetição e controle de fluxo com `switch`.

## 🔧 Funcionalidades

- ✅ Cadastro de produtos (nome, preço e quantidade)
- 📦 Verificação se o estoque está abaixo do ideal
- 💰 Cálculo do valor necessário para repor o estoque até 20 unidades
- 🔁 Menu interativo em terminal (loop até o usuário sair)

## 📂 Estrutura

- `Produtos.java` → classe que representa o produto
- `TestaProdutos.java` → classe com o `main`, menu e lógica interativa

## 💻 Execução

Compile e execute com:

```bash
javac TestaProdutos.java Produtos.java
java TestaProdutos
