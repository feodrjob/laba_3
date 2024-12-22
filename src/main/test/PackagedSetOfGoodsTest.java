import org.example.laba_3.*;
import org.example.laba_3.inetface.Wei;
import org.junit.Assert;
import org.junit.Test;

public class PackagedSetOfGoodsTest {
    Pack pack = new Pack("Балщой коробка", 100);
    BulkProduct bulkProduct = new BulkProduct("Крага", "Вкусни курага мама клянусь");
    PieceProduct pieceProduct = new PieceProduct("Паровоз", "чух чух ", 5000);

    PackagedProductByWeight packagedProductByWeight = new PackagedProductByWeight(bulkProduct,250,pack);
    PackagedPieceGoods packagedPieceGoods = new PackagedPieceGoods(pieceProduct,"хорощи товар", 5,pack);

    PackagedSetOfGoods packagedSetOfGoods = new PackagedSetOfGoods(new Wei[]{packagedProductByWeight,packagedPieceGoods},pack);

    @Test
    public void BigBox(){
        Assert.assertEquals(25450,packagedSetOfGoods.getNettoWeight(),0.0000000000000000000001);
    }


}