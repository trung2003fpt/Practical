import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        SpecCar sCar = new SpecCar();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter maker: ");
        sCar.maker = sc.nextLine();
        System.out.print("Enter price: ");
        sCar.price = sc.nextInt();
        System.out.print("Enter type: ");
        sCar.type = sc.nextInt();
        int choice;
        System.out.println("1. Test toString()");
        System.out.println("2. Test setData()");
        System.out.println("1. Test getValue()");
        System.out.print("Enter TC(1,2,3): ");
        choice = sc.nextInt();
        System.out.println("OUTPUT:");
        switch(choice){
            case 1: 
                Car car = new Car(sCar.maker, sCar.price);
                System.out.println(car);
                System.out.println(sCar.toString());
                break;
            case 2:
                sCar.setData();
                break;
            case 3:
                System.out.println(sCar.getValue());
                break;
        }
}
}