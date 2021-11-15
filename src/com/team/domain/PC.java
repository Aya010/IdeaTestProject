package com.team.domain;

public class PC implements Equipment {
    private String model;
    private String display;

    public PC(String model, String display) {
        super();
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }

    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }
}
