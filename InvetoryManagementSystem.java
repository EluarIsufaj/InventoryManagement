import java.util.List;
import java.util.Scanner;

public class InvetoryManagementSystem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Inventory inventory  = new Inventory();
        int productIDCounter = 1;

        while (true){
          System.out.println("\nInventory Management System");
          System.out.println("1. Add Product");
          System.out.println("2. Remove Product");
          System.out.println("3. List Product");
          System.out.println("4. Exit");
          System.out.println("Select an Option");

          int choise = scanner.nextInt();
          scanner.nextLine();

          switch (choise){
              case 1 :
                  System.out.println("Enter a product name");
                  String name = scanner.nextLine();
                  System.out.println("Enter a product price");
                  Double price = scanner.nextDouble();
                  System.out.println("Enter a product quantity");
                  int quantity = scanner.nextInt();

                  Product product= new Product(productIDCounter,name,price,quantity);
                  inventory.addProduct(product);
                  System.out.println("Product id " + productIDCounter);
                  productIDCounter++;
                  break;
              case 2:
                  System.out.println("Enter the id to remove");
                  int productIdtoRemove = scanner.nextInt();
                  inventory.removeProduct(productIdtoRemove);
                  System.out.println("Product removed");
                  break;
              case 3 :
                  List<Product> products = inventory.listProducts();
                  if  (products.isEmpty()){
                      System.out.println("No product in the inventory");
                  }else {
                      for (Product p : products){
                          System.out.println("\n" +p);
                      }
                  }break;
              case 4:
                  System.out.println("Exiting");
                  scanner.close();
                  System.exit(0);
              default:
                  System.out.println("Invalid choise. Please try again");
          }
        }
    }
}
