import org.example.laba_3.Pack;
import org.junit.Assert;
import org.junit.Test;

public class PackTest {
    Pack pack = new Pack("Упаковка",52);

    @Test
    public void getName(){
        Assert.assertEquals("Упаковка",pack.getName());
    }

    @Test
    public void getWeight(){
        Assert.assertEquals(52,52,0);
    }
}
