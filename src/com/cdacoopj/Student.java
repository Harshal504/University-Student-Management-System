package com.cdacoopj;

import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student>{
    private int rollNo;
    private String name;
    private String department;
    private double cgpa;

    public Student(int rollNo, String name, String department, double cgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", cgpa=" + cgpa;
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(this.cgpa,o.cgpa);
    }
}

class NameComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}


class RollComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getRollNo()- o2.getRollNo();
    }
}
