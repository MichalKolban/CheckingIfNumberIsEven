
	import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Podaje liczbę");

                int liczba = scanner.nextInt();

                if (liczba % 2 == 0)

                    System.out.println("Liczba " + liczba + " jest parzysta!");

                else

                    System.out.println("Liczba " + liczba + " nie jest parzysta!");

            }
        }
