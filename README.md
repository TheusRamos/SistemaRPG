# Sistema de RPG de Turnos em Console

## Sobre o Projeto

Este projeto é um jogo de RPG (Role-Playing Game) clássico, baseado em turnos e executado em console. Foi desenvolvido como trabalho avaliativo para a disciplina de Programação Orientada a Objetos, ministrada pelo professor Márcio no Centro Universitário Mário Palmério (UNIFUCAMP).

O jogo mergulha o jogador em um mundo de fantasia onde ele pode criar seu próprio herói, escolher entre diferentes classes, enfrentar monstros, coletar itens, equipar seu personagem e salvar seu progresso para continuar a aventura em outro momento.

## Funcionalidades Principais

* **Criação de Personagem:** Escolha entre 3 classes distintas, cada uma com atributos, habilidades e descrições únicas.
* **Sistema de Classes:**
    * `Mago`: Mestre do arcano, focado em dano mágico baseado em inteligência.
    * `Arqueiro`: Predador silencioso, com habilidades de dano crítico e esquiva.
    * `Dançarino das Lâminas`: Guerreiro ágil, focado em dano corpo a corpo e na habilidade de mitigar dano com robustez.
* **Combate Baseado em Turnos:** Sistema de combate clássico onde o herói e o monstro se alternam em turnos de ataque.
* **Inimigos Variados:** Enfrente uma gama de 6 monstros diferentes, cada um com seus próprios atributos e tabela de loot.
* **Sistema de Loot:** Ao derrotar monstros, há uma chance de dropar itens valiosos, desde armas a armaduras.
* **Inventário e Equipamentos:** Gerencie um inventário de itens e equipe seu personagem com armas e armaduras específicas para sua classe, que alteram seus atributos de combate.
* **Persistência de Dados:** O progresso do jogo, incluindo personagens criados e seus inventários, é salvo em arquivos (`.dat`) usando a serialização de objetos do Java, permitindo carregar um jogo salvo anteriormente.
* **Recuperação de Vida:** Sistema de acampamento que permite ao jogador recuperar a vida do personagem fora de combate, com um mecanismo de *cooldown* de tempo real para evitar o uso abusivo.

## Tecnologias Utilizadas

* **Java:** O projeto é inteiramente construído em Java, utilizando os principais pilares da Programação Orientada a Objetos.
* **POO (Programação Orientada a Objetos):**
    * **Herança:** Utilizada na estrutura das classes `Personagem`, `Item`, `Arma` e `Armadura`.
    * **Polimorfismo:** Aplicado nos métodos `atacar` e `receberDano`, onde cada classe de herói ou inimigo tem sua própria implementação.
    * **Abstração e Encapsulamento:** Conceitos aplicados em todo o projeto para garantir um código organizado e de fácil manutenção.
* **Java Serialization:** Utilizada para salvar e carregar o estado do jogo em arquivos binários.

## Como Executar o Projeto

1.  Clone este repositório para a sua máquina local.
2.  Abra o projeto em sua IDE Java de preferência (Ex: NetBeans, IntelliJ, VS Code com extensões Java).
3.  Localize o arquivo `SistemaRPG.java` dentro do pacote `com.mycompany.sistemarpg`.
4.  Execute o método `main()` contido neste arquivo para iniciar o jogo.

## Estrutura dos Pacotes

* `com.mycompany.sistemarpg`: Pacote principal que contém a classe `SistemaRPG` (ponto de entrada do programa).
* `Heros`: Contém a classe abstrata `Personagem` e suas implementações de heróis (`Mago`, `Arqueiro`, `DancarinoDasLaminas`).
* `Inimigos`: Contém as classes dos monstros que o jogador pode enfrentar.
* `Items`: Contém a classe abstrata `Item` e suas especializações (`Arma`, `Armadura`, `Pocao`, etc.).
* `Funcoes`: Classes utilitárias como `GerenciadorDeArquivos` e `FabricaDeItens`.
* `Menu`: Classes responsáveis pela interação com o usuário e pela lógica dos menus (`Menu`, `Combate`, etc.).

---
## Autor

* **Jeazly**

*Trabalho desenvolvido para a disciplina de Programação Orientada a Objetos.*
*Professor: Márcio*
*Instituição: UNIFUCAMP*
