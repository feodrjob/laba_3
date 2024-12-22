package org.example.laba_3;

import org.example.laba_3.inetface.Wei;

public class PackagedPieceGoods extends PieceProduct implements Wei {
    private final int count;
    private final Pack pack;


    public PackagedPieceGoods(PieceProduct piceproduct, String description, int count, Pack pack) {
        super(piceproduct.getName(), piceproduct.getDescription(), piceproduct.getWeight());
        this.count = count;
        this.pack = pack;
    }

    public int getCount() {
        return count;
    }


    @Override
    public double getGrossWeight() {
        return count * getWeight() + pack.getWeight();
    }

    @Override
    public double getNettoWeight() {
        return count * getWeight();
    }
}
