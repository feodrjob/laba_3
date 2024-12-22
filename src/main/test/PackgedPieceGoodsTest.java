import org.example.laba_3.Pack;
import org.example.laba_3.PackagedPieceGoods;
import org.example.laba_3.PieceProduct;
import org.junit.Assert;
import org.junit.Test;

public class PackgedPieceGoodsTest {
    PieceProduct pieceProduct = new PieceProduct("одын штук", "штуков",52);
    Pack pack = new Pack("Упаковка",1);

    PackagedPieceGoods packagedPieceGoods = new PackagedPieceGoods(pieceProduct,"Антоны журавели",3,pack);
    @Test
    public void getCount(){
        Assert.assertEquals(3,packagedPieceGoods.getCount());
    }

    @Test
    public void getNetto(){
        Assert.assertEquals(156,packagedPieceGoods.getNettoWeight(),0.00000000001);
    }

    @Test
    public void getBrutto(){
        Assert.assertEquals(157,packagedPieceGoods.getGrossWeight(),0.00000000001);
    }
}
