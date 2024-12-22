import org.example.laba_3.BulkProduct;
import org.junit.Assert;
import org.junit.Test;

public class BulkProductTest {
    BulkProduct bulkProduct = new BulkProduct("балкпродутк", "весовой товар");

    @Test
    public void getName(){
        Assert.assertEquals("балкпродутк",bulkProduct.getName());
    }
    @Test
    public void getDuscription(){
        Assert.assertEquals("весовой товар",bulkProduct.getDescription());
    }

}
