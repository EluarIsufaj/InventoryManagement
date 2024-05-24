import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Product> products;
    public Inventory(){
        products = new ArrayList<>();
    }
    public void  addProduct(Product product){
        products.add(product);
    }
    public void removeProduct(int id){
        products.removeIf(product -> product.getId() == id);
    }

    public Product findProductByID(int id){
        for (Product product : products){
            if (product.getId() == id){
                return product;
            }
        }return null;
    }
    public List<Product> listProducts(){
        return products;
    }
}
