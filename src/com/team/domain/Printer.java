package com.team.domain;

public class Printer implements Equipment {
    private String name;
    private String type;

    public Printer() {
        super();
    }

    public Printer(String name, String price) {
        super();
        this.name = name;
        this.type = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String getDescription() {
        return name + "(" + type + ")";
    }
}
