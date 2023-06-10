public class Main {

    //Longest Collatz Sequence - która początkowa liczba poniżej miliona stworzy najdłuższy łańcuch
    public static void main(String[] args) {
        long limit = 1000000;
        long longestChainNumber = 0;
        long longestChainLength = 0;


        // pętla leci przez zmienną limit (1milion) Wewątrz pętla while sprawdza czy zmienna number nie jest  równa 1
        // i stosuje wzór łańcucha przy każdej iteracji zwiękrzając chainLenght. Dodatkowo If sprawdza i podmienia
        // zmienną longestChainNumber na tę najdłuższą.
        for (long i = 1; i < limit; i++) {
            long number = i;
            long chainLength = 1;

            while (number != 1) {
                if (number % 2 == 0) {
                    number = number / 2;
                } else {
                    number = 3 * number + 1;
                }
                chainLength++;
            }

            if (chainLength > longestChainLength) {
                longestChainLength = chainLength;
                longestChainNumber = i;
            }
        }

        System.out.println("Liczba startowa, która generuje najdłuższą sekwencję: " + longestChainNumber);
        System.out.println("Długość sekwencji: " + longestChainLength);
    }
}