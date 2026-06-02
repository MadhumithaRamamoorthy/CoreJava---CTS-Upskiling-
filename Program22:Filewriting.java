import java.io.FileWriter;
import java.util.Scanner;

class FileWriteDemo {

    public static void main(String[] args)
            throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        FileWriter fw =
            new FileWriter("output.txt");

        fw.write(text);

        fw.close();

        System.out.println(
            "Data Written Successfully"
        );
    }
}
