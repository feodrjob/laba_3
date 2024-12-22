import org.example.laba_3.BulkProduct;
import org.example.laba_3.Pack;
import org.example.laba_3.PackagedProductByWeight;
import org.junit.Assert;
import org.junit.Test;

public class PackagedProductByWeightTest {
    Pack pack = new Pack("pack",2);
    BulkProduct bulkProduct = new BulkProduct("candies","Korouwka");
    PackagedProductByWeight packagedProductByWeight = new PackagedProductByWeight(bulkProduct,50,pack);

    @Test
    public void getNetto(){
        Assert.assertEquals(50,packagedProductByWeight.getNettoWeight(),0.00000000001);
    }

    @Test
    public void getGross(){
        Assert.assertEquals(52,packagedProductByWeight.getGrossWeight(),0.000000000001);
    }

}
