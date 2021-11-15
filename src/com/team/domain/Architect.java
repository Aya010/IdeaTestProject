package com.team.domain;

public class Architect extends Designer {
    private int stock;

    //Architect :  13, id, name, age, salary, bonus, stock
    public Architect(int id, String name, int age, double salary, double bonus, int stock, Equipment equipment) {
        super(id, name, age, salary, bonus, equipment);
        this.stock = stock;
    }

    public Architect(int id, String name, int age, double salary, double bonus, int stock) {
        super(id, name, age, salary, bonus);
        this.stock = stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }
}
