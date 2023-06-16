import java.util.Scanner;

public class kazuate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetNumber = (int) (Math.random() * 90) + 10; // プログラマが設定した数（10~99の整数）
        int maxGuesses = 5; // ユーザが数を入力できる回数

        System.out.println("数当てゲームを開始します！");
        System.out.println("10から99までの整数を予想して入力してください。");

        for (int guesses = 1; guesses <= maxGuesses; guesses++) {
            System.out.print("予想: ");
            int userGuess = scanner.nextInt();

            if (userGuess == targetNumber) {
                System.out.println("当たり！");
                break;
            } else if (userGuess > targetNumber) {
                System.out.println("設定された数より大きいです。");
            } else {
                System.out.println("設定された数より小さいです。");
            }

            int difference = Math.abs(userGuess - targetNumber);
            if (difference >= 20) {
                System.out.println("20以上差があります。");
            }

            if (guesses == maxGuesses) {
                System.out.println("ゲームオーバー！正解は " + targetNumber + " でした。");
            }
        }

        scanner.close();
    }
}

