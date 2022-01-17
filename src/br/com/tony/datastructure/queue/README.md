# Fila

### O problema
Implemente um algoritmo que simule uma fila, sendo que deve-se respeitar a 
premissa do FIFO - First In First Out.

### Solução
Dado uma fila com tamanho máximo de 5 elementos, a seguinte lógica pode ser
aplicada para resolver o problema:
1º Necessário que tenhamos 2 variáveis contadoras (firstElement e lastElement) que 
iniciem com zero e que sejam incrementadas na seguinte ordem:
**FirstElement(Inicia em `0` sendo incrementado ao remover um item):** É índice do primeiro a entrar, ou, caso o primeiro
seja removido, é o índice do elemento imediatamente posterior. Exemplo:
`[PRIMEIRO, SEGUNDO, TERCEIRO]` o índice firstElement é `0` e caso eu o remova, o valor deve ser
incrementado em 1 e passa a ser o índice `1`.

**LastElement(Inicia em `0` sendo incrementado ao adicionar um item):** É o índice do último elemento a ser adicionado na fila e começa em `0`. Exemplo:
`[PRIMEIRO, SEGUNDO, TERCEIRO]` o índice lastElement é `2` e a medida que adicionamos elementos à fila
devemos incrementá-lo em 1.

### Uso da operação de resto da divisão
Suponha que a fila tenha um tamanho máximo de 3 elementos e que esteja cheia:
`[PRIMEIRO, SEGUNDO, TERCEIRO]`
Nesse ponto, como somente foram adicionados itens, o **LastElement** está com valor `3` e o **FirstELement**
está com valor `0`. Caso remova 1 item, teríamos uma posição vazia na fila e o **FirstELement**
ficaria com valor `1`:
`[VAZIO, SEGUNDO, TERCEIRO]`
Como fazer com que o próximo item a ser adicionado seja colocado no índice `0` sem a necessidade de realizar
operações de decremento dos contadores?
Podemos utilizar o resto da divisão das variáveis contadoras **FirstElement** e **LastElement** pelo tamanho
total da fila. Exemplo:
Para saber em qual índice **adicionar** elementos:
`int index = LastElement % TAMANHO_MAXIMO_FILA(3);`
O resultado da operação seria:
- LastElement == 0, então LastElement % 3 == 0;
- LastElement == 1, então LastElement % 3 == 1;
- LastElement == 2, então LastElement % 3 == 2;
- LastElement == 3, então LastElement % 3 == 0 (Sempre que LastElement for igual ao tamanho máximo da fila
o resultado da operação será `0` e o ciclo será reiniciado).

Para saber em qual índice **remover** elementos:
`int index = FirstElement % TAMANHO_MAXIMO_FILA(3);`
Segue a mesma lógica do passo anterior.
