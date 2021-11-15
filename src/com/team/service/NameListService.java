package com.team.service;

import java.util.List;

import com.team.domain.*;

public class NameListService {
    private List<Employee> employees;

    public Employee getEmployee(int id) {//TODO:throws TeamException
        return employees.get(id);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public NameListService() {
        for (int i = 0; i < Data.EMPLOYEES.length; i++) {
            int type = Integer.parseInt(Data.EMPLOYEES[i][0]);
            int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
            String name = Data.EMPLOYEES[i][2];
            int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
            double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);
            Equipment eq;
            double bonus;
            int stock;
            switch (type) {
                case Data.EMPLOYEE:
                    employees.add(new Employee(id, name, age, salary));
                    break;
                case Data.PROGRAMMER:
                    eq = createEquipment(i);
                    employees.add(new Programmer(id, name, age, salary, eq));
                    break;
                case Data.DESIGNER:
                    eq = createEquipment(i);
                    bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    employees.add(new Designer(id, name, age, salary, bonus, eq));
                    break;
                case Data.ARCHITECT:
                    eq = createEquipment(i);
                    bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    stock = Integer.parseInt(Data.EMPLOYEES[i][6]);
                    employees.add(new Architect(id, name, age, salary, bonus, stock, eq));
                    break;
            }
        }
    }

    private Equipment createEquipment(int index) {
        int type = Integer.parseInt(Data.EQUIPMENTS[index][0]);
        switch (type) {
            case Data.PC:
                return new PC(Data.EQUIPMENTS[index][1], Data.EQUIPMENTS[index][2]);
            case Data.NOTEBOOK:
                int price = Integer.parseInt(Data.EQUIPMENTS[index][2]);
                return new NoteBook(Data.EQUIPMENTS[index][1], price);
            case Data.PRINTER:
                return new Printer(Data.EQUIPMENTS[index][1], Data.EQUIPMENTS[index][2]);
        }
        return null;
    }
    public static void main(String[] args) {

    }
}
