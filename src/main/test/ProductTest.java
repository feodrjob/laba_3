import org.example.laba_3.Product;
import org.junit.Assert;
import org.junit.Test;

public class ProductTest {
    Product product = new Product("Ручка","Самая лучшая и удобная ручка на свете");

    @Test
    public void getName(){
        Assert.assertEquals("Ручка",product.getName());
    }
    @Test
    public void getDiscription(){
        Assert.assertEquals("Самая лучшая и удобная ручка на свете",product.getDescription());
    }
}
