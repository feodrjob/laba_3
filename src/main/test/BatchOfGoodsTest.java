import org.example.laba_3.*;
import org.example.laba_3.inetface.Wei;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class BatchOfGoodsTest {
    Pack pack = new Pack("коробка",10);
    BulkProduct bulkProduct = new BulkProduct("щебенка","щебенка для асфальта");
    PieceProduct pieceProduct = new PieceProduct("гудрон","мешок гудрона",50);

    PackagedProductByWeight packagedProductByWeight = new PackagedProductByWeight(bulkProduct,100,pack);
    PackagedProductByWeight packagedProductByWeight2 = new PackagedProductByWeight(bulkProduct,100,pack);
    PackagedPieceGoods packagedPieceGoods = new PackagedPieceGoods(pieceProduct,"discription",10,pack);
    PackagedPieceGoods packagedPieceGoods2 = new PackagedPieceGoods(pieceProduct,"discription",10,pack);

    PackagedSetOfGoods packagedSetOfGoods = new PackagedSetOfGoods(new Wei[]
            {
                    packagedProductByWeight,packagedPieceGoods

    },pack);

    BatchOfGoods batchOfoods = new BatchOfGoods("весовой, штучный и набор для асфальта укладчика","набор топового подростка", new Wei[]{
            packagedProductByWeight2,packagedPieceGoods2,packagedSetOfGoods});



    @Test
    public void getWeihgt(){
        Assertions.assertEquals(1240,batchOfoods.getWeight());
    }

}





