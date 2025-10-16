# Interface Gráfica Java Swing

Este projeto demonstra a criação de uma interface gráfica simples usando Java Swing, implementando componentes básicos de GUI e gerenciamento de eventos.

## Descrição

O projeto consiste em uma aplicação desktop que apresenta diversos componentes de interface gráfica, incluindo campos de entrada, botões, checkboxes e comboboxes. Foi desenvolvido como exemplo prático de programação com interfaces gráficas em Java.

## Funcionalidades

- Interface gráfica com formulário de login (usuário e senha)
- Checkboxes para seleção múltipla de instrutores
- ComboBox (dropdown) com lista de instrutores
- Botões interativos que respondem a eventos de clique
- Implementação de ActionListener personalizado

## Estrutura do Projeto

```
src/
├── Test.java        # Classe principal com a interface gráfica
└── MeuListener.java # Implementação do ActionListener para eventos
```

## Tecnologias Utilizadas

- Java
- Swing (para interface gráfica)
- AWT (Abstract Window Toolkit)

## Como Executar

1. Certifique-se de ter o JDK instalado em seu sistema
2. Compile os arquivos Java:
   ```bash
   javac src/*.java
   ```
3. Execute a aplicação:
   ```bash
   java -cp src Test
   ```

## Componentes da Interface

- **JFrame**: Janela principal da aplicação
- **JPanel**: Painel para organizar os componentes
- **JLabel**: Rótulos para os campos
- **JTextField**: Campo de entrada de texto para usuário
- **JPasswordField**: Campo de entrada para senha
- **JCheckBox**: Caixas de seleção para instrutores
- **JComboBox**: Lista suspensa com opções
- **JButton**: Botões de ação

## Aprendizado

Este projeto é ideal para iniciantes que desejam aprender sobre:
- Criação de interfaces gráficas em Java
- Uso de componentes Swing
- Implementação de listeners para eventos
- Organização básica de layouts em aplicações desktop

## Autor

Desenvolvido como material de estudo baseado no curso K19 - Java.