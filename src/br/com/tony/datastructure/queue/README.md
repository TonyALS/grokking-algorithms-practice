# Fila

## O problema
Implemente um algoritmo que simule uma fila, sendo que deve-se respeitar a 
premissa do FIFO - First In First Out.

## Solução
Dado uma fila com tamanho máximo de 5 elementos, a seguinte lógica pode ser aplicada para resolver o problema.
### Primeiro passo
Devemos criar duas variáveis contadoras (firstElement e lastElement) que  iniciem com zero e que sejam incrementadas na seguinte ordem:
**FirstElement(Inicia em `0` sendo incrementado ao remover um item):** É usado para calcular o índice em que está o primeiro elemento da fila usando a 
operação de resto da divisão. <br>
Exemplo:
`[PRIMEIRO, SEGUNDO, TERCEIRO]` o valor de firstElement é `0` e caso algum item seja removido, o valor deve ser
incrementado em `1`.

**LastElement(Inicia em `0` sendo incrementado ao adicionar um item):** É usado para calcular, usando a operação de resto da divisão, o índice em que deve ser adicionado o último elemento da fila.<br> 
Exemplo:
`[PRIMEIRO, SEGUNDO, TERCEIRO]` o valor lastElement é `3` e a medida que adicionamos elementos à fila
devemos incrementá-lo em 1.

### Segundo passo: Lógica dos índices de remoção e adição:
Suponha que a fila tenha um tamanho máximo de 3 elementos e que esteja cheia:
`[PRIMEIRO, SEGUNDO, TERCEIRO]`
Nesse ponto, como somente foram adicionados itens, o **LastElement** está com valor `3` e o **FirstELement**
está com valor `0`. Caso remova 1 item, teríamos uma posição vazia na fila e o **FirstELement**
ficaria com valor `1`:
`[VAZIO, SEGUNDO, TERCEIRO]`<br>
Como fazer com que o próximo item a ser adicionado seja colocado no índice `0` que está vazio sem a necessidade de realizar
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
