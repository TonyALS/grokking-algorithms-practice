package br.com.tony.chapter1.search;

/**
 * Na busca binária os elementos do array devem estar ordenados.
 * @author tony
 * */
public class BinarySearch {
    public static void main(String[] args) {
        var array = array(10000001);

        var initial = System.currentTimeMillis();
        System.out.println("Posição do valor no array: " + findSimple(array, 10000000));
        System.out.println("Tempo em milissegundos busca simples: " + (System.currentTimeMillis() - initial));

        var initialBinary = System.currentTimeMillis();
        System.out.println("Posição do valor no array: " + binarySearch(array, 10000000));
        System.out.println("Tempo em milissegundos busca binária: " + (System.currentTimeMillis() - initialBinary));
    }

    /*
     * Busca binária
     * */
    public static int binarySearch(int[] array, int item) {
        //  Índice mínimo
        var low = 0;
        //  Índice máximo
        var high = array.length - 1;

        var numIteracoes = 0;
        while (low <= high) {
            numIteracoes++;

            //  Meio da lista: Por exemplo, lista de 10 elementos o primeiro
            //  elementInTheMidPosition será no índice 5
            var mid = (low + high) / 2;

            //  Começamos a busca pela metade da lista, portanto pegamos o elemento da posição mid do array
            var elementInTheMidPosition = array[mid];

            //  Comparamos o elementInTheMidPosition com o item a ser pesquisado, se for igual retornamos
            if (elementInTheMidPosition == item) {
                System.out.println("Iterações busca binária: " + numIteracoes);
                return mid;
            }

            /*
             * Se o elemento do meio da lista for maior (não maior ou igual pois se for igual cai no primeiro if)
             * devemos atualizar a posicao final do array (high) usada no cálculo da posicao média para
             * metade atual - 1, ou seja, se o array tem 10 posições na primeira iteração seria:
             * -> low = 0;
             * -> high = 9;
             *
             * Se o item que pegamos no meio do array for maior que o item a ser buscado, significa que devemos
             * continuar a busca pela metade de baixo do array, portanto o índice high deve ser atualizado com o
             * valor de mid - 1:
             * -> low = 0;
             * -> high = 5 - 1 = 4;
             * Na próxima iteracao iremos comparar o item da posição 2 pois (0 + 4) / 2 = 2;
             * */
            if (elementInTheMidPosition > item) {
                high = mid - 1;
            }
            /*
             * Se o elemento do meio da lista for menor (não menor ou igual pois se for igual cai no primeiro if)
             * devemos atualizar a posicao inicial do array usada no cálculo da posicao média para começar a partir
             * da metade atual + 1, ou seja, se o array tem 10 posições na primeira iteração seria:
             * -> low = 0;
             * -> high = 9;
             *
             * Se o item que pegamos no meio do array for menor que o item a ser buscado, significa que devemos
             * continuar a busca pela metade de cima do array, portanto o índice low deve ser atualizado com o
             * valor de mi + 1:
             * -> low = 5 + 1 == 6
             * -> high = 10;
             * Na próxima iteracao iremos comparar o item da posição 8 pois (6 + 10) / 2 = 8;
             * */
            else {
                low = mid + 1;
            }
        }
        return -1;
    }


    /*
     * Busca simples
     * */
    public static Integer findSimple(int[] array, int item) {
        var tamArray = array.length;
        var numIteracoes = 0;
        for (int i = 0; i < tamArray; i++) {
            numIteracoes++;
            if (array[i] == item) {
                System.out.println("Iterações busca simples: " + numIteracoes);
                return i;
            }
        }
        return -1;
    }

    public static int[] array(int tamArray) {
        var array = new int[tamArray];
        for (int i = 0; i < tamArray; i++) {
            array[i] = i;
        }
        return array;
    }
}
