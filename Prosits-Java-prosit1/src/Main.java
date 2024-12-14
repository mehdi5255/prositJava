import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ZooManagement zm = new ZooManagement();

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the number of cages");

        int numberOfCages = sc.nextInt();

        System.out.println("Insert the name of the zoo");

        String nameOfZoo = sc.next();

        zm.nbrCages = numberOfCages;
        zm.zooName = nameOfZoo;

        zm.displayInformation();
    }
}
