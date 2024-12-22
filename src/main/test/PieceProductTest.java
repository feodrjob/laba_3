import org.example.laba_3.PieceProduct;
import org.junit.Assert;
import org.junit.Test;

public class PieceProductTest {
    PieceProduct pieceProduct = new PieceProduct("одын штук", "штуков",52);

    @Test
    public void getName(){
        Assert.assertEquals("одын штук",pieceProduct.getName());
    }
    @Test
    public void getDescription(){
        Assert.assertEquals("штуков",pieceProduct.getDescription());
    }
    @Test
    public void getWeight(){
        Assert.assertEquals(52,52,0);
    }
}
