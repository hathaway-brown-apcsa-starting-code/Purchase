
/**
 * This class is used to test the Purchase class.
 *
 * @author Michael Buescher @ APCS-A
 * @version 2018-09
 */
import java.util.Scanner;
public class TestPurchase
{
    public static void main (String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        System.out.print ("Please enter the item name:      ");
        String name = kbd.nextLine();
        System.out.print ("Please enter the quantity:       ");
        int num = kbd.nextInt();
        System.out.print ("Please enter the price of each: $");
        double price = kbd.nextDouble();
        
        Purchase p1 = new Purchase (name, num, price);

        System.out.println("\nTesting toString():");
        System.out.println(p1);
        
        System.out.println("Testing individual accessor methods:");
        System.out.println("Testing getItemName: " + p1.getItemName() );
        System.out.println("Testing getQuantity: " + p1.getQuantity() );
        System.out.println("Testing getPrice: " + p1.getPrice() );
        System.out.println("Testing getTotalCost: " + p1.getTotalCost() );
        
        System.out.println("Testing the toString() method: ");
        System.out.println(p1);
        
        kbd.close();
    }
}
