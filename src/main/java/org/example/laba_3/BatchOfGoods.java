package org.example.laba_3;

import org.example.laba_3.inetface.Wei;

public class BatchOfGoods {
    private final String name;
    private final String description;
    private final Wei[] weights;

    public BatchOfGoods(String name, String description, Wei[] weights) {
        this.name = name;
        this.description = description;
        this.weights = weights;
    }
    public Wei[] getWeights() {
        return weights;
    }

    public double getWeight(){
        double weight = 0;
        for (Wei obj : weights) {
            weight += obj.getGrossWeight();
        }
        return weight;
    }



}
