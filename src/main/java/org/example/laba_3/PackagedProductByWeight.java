package org.example.laba_3;
import org.example.laba_3.inetface.Wei;

public class PackagedProductByWeight extends BulkProduct implements Wei {
    private final double weight;
    private final Pack pack;


    public PackagedProductByWeight(BulkProduct bulkProduct, double weight, Pack pack) {
        super(bulkProduct.getName(), bulkProduct.getDescription());
        this.weight = weight;
        this.pack = pack;
    }

    @Override
    public double getGrossWeight() {
        return weight + pack.getWeight();
    }

    @Override
    public double getNettoWeight() {
        return weight;
    }
}
