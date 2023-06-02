import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int choice;
        Book b = new Book();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title: ");
        b.title = sc.nextLine();
        System.out.print("Enter price: ");
        b.price = sc.nextInt();
        System.out.print("1. Test getTitle()");
        System.out.print("2. Test setPrice()");
        System.out.print("Enter TC (1 or 2): ");
        choice = sc.nextInt();
        System.out.print("OUTPUT:");
        switch(choice){
            case 1:
                System.out.println(b.getTitle());
                break;
            case 2:
                int newPrice;
                System.out.print("Enter new price: ");
                newPrice = sc.nextInt();
                b.setPrice(newPrice);
                System.out.println(b.getPrice());
                break;
            default:
                break;
        }
   }
}
