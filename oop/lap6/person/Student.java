package hus.oop.lap6.person;

import java.util.StringTokenizer;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double free) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = free;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFree(double free) {
        this.fee = free;
    }

    @Override
    public String toString() {
        return String.format("Student[%s,program=%s,year=%d,fee=%.2f]", super.toString(), program, year, fee);
    }
}

