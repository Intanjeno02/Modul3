import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("sisa angka adalah :");
    for (int i = 1; i<50; i++ ){
        if ( i%3 == 0 || i%5 == 0){
        continue;
        }
        System.out.println(i);
    }

    scanner.close();
}
}