# Sistema de Estoque – Loja de Eletrônicos  
Aplicação em Java utilizando **Mapas com Listas** para gerenciar produtos de forma simples, didática e modular.

## Sobre o Projeto
Este projeto foi desenvolvido com foco educacional para a disciplina de **Algoritmos, Estrutura de Dados e TAD**.  
O objetivo é mostrar, na prática, como utilizar a estrutura de dados **Map<String, List<String>>** para armazenar informações de produtos em um estoque.

Cada produto possui:
- Código (chave do mapa)
- Nome
- Preço
- Quantidade disponível

O projeto segue boas práticas:
- Código modularizado  
- Classes organizadas  
- Métodos bem comentados  
- Main com apenas uma linha conforme solicitado  


## Estrutura do Projeto

src/  
├── Main.java → contém apenas a execução do programa  
├── Menu.java → interface textual com o usuário  
├── Estoque.java → regras de negócio e manipulação do mapa  
└── Util.java → leitura de dados do usuário (Scanner)  


## Funcionalidades

### Adicionar produto  
Inclui um novo item no mapa, usando o código como chave.

### Remover produto  
Exclui o produto totalmente do estoque.

### Atualizar quantidade  
Modifica apenas a quantidade disponível, mantendo as demais informações.

### Buscar produto  
Mostra nome, preço e quantidade a partir do código.

### Listar todos os produtos  
Exibe todos os itens armazenados no mapa.

### Calcular valor total do estoque  
Soma `preço × quantidade` de todos os produtos cadastrados.

## Como Executar

### 1. Entre na pasta do projeto
```bash
cd /sua/pasta/projeto
```
2. Compile todos os arquivos
```bash
javac *.java
```
3. Execute o programa
```bash
java Main
```

### Exemplo de Uso
Ao iniciar o programa:

<img width="528" height="213" alt="image" src="https://github.com/user-attachments/assets/71ac2669-740d-4243-b559-e67c2acfddf6" />

### Tecnologias Utilizadas
- Java 17+
- Map, List e HashMap
- Terminal / Linha de Comando
- Paradigma estruturado e modular

### Objetivo Educacional
Este projeto demonstra:
- Manipulação de estruturas associativas
- Modelagem simples de dados
- Modularização de código
- Práticas iniciais de desenvolvimento em Java
- Ideal para estudantes iniciantes em programação e estruturas de dados.

### Licença
Este projeto é livre para fins educacionais.

### Autoria
Desenvolvido por Juliana Apgaua Sant'Ana Vidigal, como parte das atividades práticas da disciplina Algoritmos e Estrutura de Dados.
