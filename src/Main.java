import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter the number (0 to 999999):");
            number = input.nextInt();

            if (number < 0 || number > 999999) {
                System.out.println("Invalid Number. Try again.");
            }
        } while (number < 0 || number > 999999);

        int a = number % 10;
        int b = number / 10;
        int c = b % 10;
        int g = number / 100;
        int d = g % 10;
        int e = number / 1000;
        int h = number / 10000;
        int f = e % 10;
        int i = h % 10;
        int j = number / 100000;

        String singleDigit[] = {"", "Bir", "Eki", "Uch", "Tort", "Besh", "Alty", "Zheti", "Segiz", "Toguz"};
        String onductar[] = {"", "On", "Zhyyirma", "Otuz", "Kyrk", "Elu", "Altymysh", "Zhetimish", "Seksen", "Tokson"};
        String zhuzduc = "Zhuz";
        String mindic = "Min";

        if (number == 0) {
            System.out.println("Noll");
        } else if (number < 10) {
            System.out.println(singleDigit[number]);
        } else if (number >= 10 && number <= 99) {
            System.out.println(onductar[c] + " " + singleDigit[a]);
        } else if (number >= 100 && number <= 999) {
            System.out.println(singleDigit[d] + " " + zhuzduc + " " + onductar[c] + " " + singleDigit[a]);
        } else if (number >= 1000 && number <= 9999) {
            System.out.println(singleDigit[e] + " " + mindic + " " + singleDigit[d] + " " + zhuzduc + " " + onductar[c] + " " + singleDigit[a]);
        } else if (number >= 10000 && number <= 99999) {
            System.out.println(onductar[h] + " " + singleDigit[f] + " " + mindic + " " + singleDigit[d] + " " + zhuzduc + " " + onductar[c] + " " + singleDigit[a]);
        } else if (number >= 100000 && number <= 999999) {
            System.out.println(singleDigit[j] + " " + zhuzduc + " " + onductar[i] + " " + singleDigit[f] + " " + mindic + " " + singleDigit[d] + " " + zhuzduc + " " + onductar[c] + " " + singleDigit[a]);
        }
    }
}
