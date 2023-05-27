public class Main {
    public static void main(String[] args) {
        long limit = 1000000;
        long longestChainNumber = 0;
        long longestChainLength = 0;

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