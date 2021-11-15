package com.team.domain;

public class Designer extends Programmer {
    private double bonus;

    //Designer  :  12, id, name, age, salary, bonus
    public Designer(int id, String name, int age, double salary, double bonus, Equipment equipment) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public Designer(int id, String name, int age, double salary, double bonus) {
        super(id, name, age, salary);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
}
