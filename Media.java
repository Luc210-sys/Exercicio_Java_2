/*
Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
números 4, 5 e 6. A soma das duas médias. A média das médias.
*/

public class Media {
    public static void main (String[]  args) {
        
        int[] primArray = {8, 9, 7};
        int[] segArray = {4, 5, 6};

        int mediaUm = 0;
        for (int i = 0; i < primArray.length; i++) mediaUm += primArray[i];

        float resultUm = mediaUm / primArray.length;
        System.out.println(resultUm);

        int mediaDois = 0;
        for (int i = 0; i < segArray.length; i++) mediaDois += segArray[i];

        float resultDois = mediaDois / segArray.length;
        System.out.println(resultDois);

        float somaMedias = resultUm + resultDois;
        System.out.println(somaMedias);
        System.out.println(somaMedias / 2);
    }
}
