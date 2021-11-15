package com.team.domain;

import com.team.service.Status;

public class Programmer extends Employee {
    private Equipment equipment;
    private int memberId;
    private Status status = Status.FREE;

    //Programmer:  11, id, name, age, salary

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public Programmer(int id, String name, int age, double salary) {
        super(id, name, age, salary);
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Equipment getEquipment() {
        return equipment;
    }
}
