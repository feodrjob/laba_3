package org.example.laba_3;

import org.example.laba_3.inetface.Wei;

public class PackagedSetOfGoods implements Wei {
    private final Wei[] weights;
    private final Pack pack;
    private final String name;

    public PackagedSetOfGoods(Wei[] weights,Pack pack) {
        this.weights = weights;
        this.pack = pack;
        this.name = "name";
    }




    public Wei[] getWeights() {
        return weights;
    }

    @Override
    public double getNettoWeight() {
        double sumNetWeights = 0;
        for(Wei obj: weights){
            sumNetWeights+=obj.getGrossWeight();
        }
        return sumNetWeights;
    }

    @Override
    public double getGrossWeight() {
        double sumGrosWeight = 0;
        for(Wei obj: weights){
            sumGrosWeight+= obj.getGrossWeight();
        }
        return sumGrosWeight;
    }

    @Override
    public String getName() {
        return name;
    }
}
