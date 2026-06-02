import java.util.*;

class ArrayListDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> names =
            new ArrayList<>();

        System.out.print(
            "How many names? "
        );

        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++) {

            names.add(
                sc.nextLine()
            );
        }

        System.out.println(
            "Student Names"
        );

        for(String s : names) {

            System.out.println(s);
        }
    }
}
