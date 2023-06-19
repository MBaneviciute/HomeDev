import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Random;

public class paswManag {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "!", "@", "#", "$", "%", "&", "*"};

        System.out.println("Enter Input : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        try {
            input = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String password = generatePassword(input, arr);
        System.out.println("Generated Password: " + password);
    }

    public static String generatePassword(String input, String[] arr) {
        StringBuilder password = new StringBuilder();
        Random random = new Random(input.hashCode());

        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(arr.length);
            password.append(arr[index]);
        }

        return password.toString();
    }
}