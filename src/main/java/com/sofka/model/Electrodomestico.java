package com.sofka.model;

public class Electrodomestico {
    private double basePrice = 100;
    private String color = "blanco";
    private char energyConsume = 'F';
    private double weight = 5;

    public Electrodomestico() {
    }

    public Electrodomestico(double basePrice, double weight) {
        this.basePrice = basePrice;
        this.weight = weight;
    }

    public Electrodomestico(double basePrice, String color, char energyConsume, double weight) {
        this.basePrice = basePrice;
        this.color = this.comprobarColor(color);
        this.energyConsume = this.comprobarConsumoEnergetico(energyConsume);
        this.weight = weight;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getColor() {
        return color;
    }

    public char getEnergyConsume() {
        return energyConsume;
    }

    public double getWeight() {
        return weight;
    }

    private char comprobarConsumoEnergetico(char letra) {
        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
            return letra;
        } else {
            return 'F';
        }
    }

    private String comprobarColor(String color){
        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            return color;
        } else {
            return "blanco";
        }
    }

    public double precioFinal() {
        double addForConsume = 0;
        switch (this.energyConsume) {
            case 'A':
                addForConsume = 100;
                break;
            case 'B':
                addForConsume = 80;
                break;
            case 'C':
                addForConsume = 60;
                break;
            case 'D':
                addForConsume = 50;
                break;
            case 'E':
                addForConsume = 30;
                break;
            case 'F':
                addForConsume = 10;
                break;
        }
        return this.getBasePrice() + addForConsume;
    }
}
