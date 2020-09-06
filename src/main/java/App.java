import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to,\n 1. Encode \n 2. Decode \n 3. Exit");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1){
            System.out.println("Enter text");
            String inputText = scanner.nextLine().toUpperCase();
            System.out.println("Enter key");
            int Key = scanner.nextInt();
            Encoding encoding = new Encoding(inputText,Key);
            System.out.println(String.format("Your encrypted text is:  %s",encoding.encode()));

        }
        else if(choice == 2){
            System.out.println("Enter text to decrypt");
            String inputText = scanner.nextLine().toUpperCase();
            System.out.println("Enter key");
            int Key = scanner.nextInt();
            Decoding decoding = new Decoding(Key,inputText);
            System.out.println(String.format("Your decrypted text is:  %s",decoding.decode()));
        }
        else  if(choice == 3){
            System.exit(0);
        }
        else {
            System.out.println("Unknown input");
        }
    }
}
