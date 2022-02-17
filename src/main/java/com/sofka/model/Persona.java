package com.sofka.model;

import java.util.Random;

public class Persona {
    private String name = "";
    private int age = 0;
    private int dni;
    private char gender = 'H';
    private double weight = 0;
    private double height = 0;

    public Persona() {
        this.dni = generaDNI();
    }

    public Persona(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dni = generaDNI();
    }

    public Persona(String name, int age, char gender, double weight, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.dni = generaDNI();
    }

    public int calcularIMC(){
        int result = 0;
        double imc = this.weight / (this.height * this.height);
        if (imc < 20) {
            result = -1;
        } else if (imc > 25) {
            result = 1;
        }
        return result;
    }

    public boolean esMayorDeEdad() {
        return this.age >= 18;
    }

    private void comprobarSexo(char sexo) {
        if (sexo != 'H' || sexo != 'M'){
            this.gender = 'M';
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dni=" + dni +
                ", gender=" + gender +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    private int generaDNI() {
        Random rnd = new Random();
        int dniRnd = rnd.nextInt(99999999);
        return dniRnd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
