package com.frogobox.ai;

import java.util.Arrays;

public class Chromosome {
    private int[] genes;
    private double x1;
    private double x2;
    private double fitness;
    private double functionValue;

    public Chromosome(int length) {
        this.genes = new int[length];
    }
    
    public Chromosome(int[] genes) {
        this.genes = Arrays.copyOf(genes, genes.length);
    }

    public int[] getGenes() {
        return genes;
    }

    public void setGenes(int[] genes) {
        this.genes = genes;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getFitness() {
        return fitness;
    }

    public void setFitness(double fitness) {
        this.fitness = fitness;
    }

    public double getFunctionValue() {
        return functionValue;
    }

    public void setFunctionValue(double functionValue) {
        this.functionValue = functionValue;
    }

    @Override
    public String toString() {
        return "Chromosome{" +
                "x1=" + String.format("%.5f", x1) +
                ", x2=" + String.format("%.5f", x2) +
                ", fitness=" + String.format("%.5f", fitness) +
                ", f(x1,x2)=" + String.format("%.5f", functionValue) +
                ", genes=" + Arrays.toString(genes) +
                '}';
    }
}
