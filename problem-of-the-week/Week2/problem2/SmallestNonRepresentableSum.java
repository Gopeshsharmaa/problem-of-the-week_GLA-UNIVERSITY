import java.util.Scanner;

public class SmallestNonRepresentableSum {

    public static int findSmallestNonRepresentable(int[] coins) {
        long res = 1; // Start with the smallest amount we can't form yet

        for (int coin : coins) {
            if (coin > res) break;
            res += coin;
        }

        return (int) res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().trim().split(" ");
        int[] coins = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            coins[i] = Integer.parseInt(input[i]);
        }

        int result = findSmallestNonRepresentable(coins);
        System.out.println(result);
    }
}
