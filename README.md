# Snake Game

### Explicação do código:

1 - O código nesta classe representa um jogo de cobra. <br>
2 - O objeto Snake armazena as informações sobre a cobra e o objeto Board armazena as informações sobre o tabuleiro.<br>
3 - A variável de direção controla em qual direção o jogador está se movendo (esquerda, direita, para cima ou para baixo).<br>
4 - O método isGameOver() verifica se há uma condição de game over.<br>
5 - Se houver uma condição de fim de jogo, então setGameOver() define o sinalizador gameOver como verdadeiro para que ele pare de jogar quando houver um fim de jogo.<br>
6 - O método getDirection() retorna um valor inteiro que indica em qual direção o jogador está se movendo no momento (0 para esquerda, 1 para direita, 2 para cima e -2 para baixo).<br>
7 - O código é responsável por gerenciar o jogo do Snake Game.<br>
8 - A classe tem várias propriedades e métodos que são relevantes para o jogo.<br>
9 - A primeira propriedade é o objeto cobra que faz referência ao personagem real do Jogo da Cobra.<br>
10 - O objeto cobra tem várias propriedades, incluindo direção, tabuleiro e gameOver.<br>
11 - A próxima propriedade é o objeto Board que faz referência à superfície de jogo na qual o Jogo da Cobra ocorre.<br>
12 - O objeto Board também possui uma propriedade de direção que indica onde no espaço o jogador está localizado em relação à superfície de jogo.<br>
13 - As duas últimas propriedades são usadas para controlar se o jogo acabou ou não.<br>
14 - gameOver será definido como verdadeiro se o jogador perder, enquanto isGameOver será definido como falso se<br>
15 - O código começa imprimindo “Going to update the game”.<br>
16 - Esta é uma mensagem que será exibida toda vez que o código for executado.<br>
17 - Em seguida, o código verifica se gameOver foi definido como verdadeiro.<br>
18 - Caso contrário, o código define a direção como DIRECTION_NONE e define gameOver como verdadeiro.<br>
19 - A próxima parte do código determina qual célula na cabeça da cobra está sendo usada como ponto de referência.<br>
20 - O método getNextCell() usa variáveis ​​de linha e coluna para determinar essas informações.<br>
21 - Em seguida, ele retorna o objeto Cell para uso em outras partes do programa.<br>
22 - A próxima seção de código atualiza vários aspectos do jogo com base na entrada do usuário nas teclas do teclado.<br>
23 - Primeiro, ele verifica se alguma tecla foi pressionada.<br>
24 - Nesse caso, ele usa essas teclas pressionadas como entradas para mover ou desenvolver células no corpo da cobra.<br>
25 - Por fim, ele atualiza vários elementos na tela com base no que foi feito com essas células (por exemplo, geração de alimentos).<br>
26 - O código atualiza o jogo em intervalos regulares e aceita entrada do usuário do teclado.<br>
27 - Se o usuário inserir uma direção diferente de DIRECTION_NONE, o código definirá a direção para a entrada escolhida.<br>
28 - Se o usuário inserir uma célula que não esteja no caminho da cobra, o código moverá a cobra para essa célula e verificará se ela colide com algo em seu caminho.<br>
29 - Em caso afirmativo, defina Direção como DIRECTION_NONE.<br>
30 - Caso contrário, se a célula for um item de comida, o código aumentará a cobra e chamará generateFood() a bordo .<br>
31 - O código começa criando uma nova instância da classe Snake.<br>
32 - Este objeto representará a cobra do jogador no jogo.<br>
33 - A variável initPos armazena a localização dessa cobra a qualquer momento.<br>
34 - Em seguida, um novo objeto Tabuleiro é criado e inicializado com o tamanho da área de jogo (10×10).<br>
35 - Esta placa será usada para rastrear onde a cobra se moveu e quais obstáculos ela encontrou ao longo do caminho.<br>
36 - Um novo objeto Game é então criado, contendo informações sobre o jogo em si, bem como nossa instância de cobra.<br>
37 - A propriedade gameOver é definida como false para que possamos acompanhar se há ou não um jogo sendo jogado.<br>
38 - A propriedade de direção é definida como DIRECTION_RIGHT para que os usuários possam controlar o movimento da cobra usando a entrada do teclado.<br>
39 - O código atualiza periodicamente os objetos Game e Board com base na entrada do usuário recebida da classe Keyboard.<br>
40 - Sempre que um pressionamento de tecla é detectado, um manipulador de eventos para essa tecla específica é chamado.<br>
41 - Nesse caso, simplesmente imprimimos “Pressione a seta para a esquerda para mover para a esquerda” na tela sempre que as teclas de seta para a esquerda forem detectadas pelo nosso código.<br>
42 - O código cria uma nova instância do jogo Snake, inicializa-o na posição especificada (0, 0) e cria um novo objeto Board.<br>
43 - O código então cria um novo objeto Game e define suas propriedades para corresponder às do objeto Snake.<br>
44 - Em seguida, o código declara duas variáveis: initSnake e board.<br>
45 - initSnake é uma instância da classe Snake, enquanto board é uma instância da classe Board.<br>
46 - A próxima linha de código configura um cronômetro que atualizará o jogo em intervalos regulares.<br>
47 - Isso nos permitirá reagir à entrada do usuário no teclado.<br>
48 - Por fim, o código declara duas variáveis: gameOver e direction.<br>
49 -gameOver é definido como false para que o jogo possa continuar mesmo que atinja sua condição final.<br>

Referência:  
http://massivetechinterview.blogspot.com/2015/10/snake-game-design.html
