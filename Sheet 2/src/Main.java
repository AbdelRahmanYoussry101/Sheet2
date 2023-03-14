public class Main {
    // Person.java
    public class Person {
        private String name;
        private String address;
        private String phoneNumber;
        private String email;

        public Person(String name, String address, String phoneNumber, String email) {
            this.name = name;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        @Override
        public String toString() {
            return "Person: " + name;
        }
    }

    // Student.java
    public class Student extends Person {
        public static final String FRESHMAN = "Freshman";
        public static final String SOPHOMORE = "Sophomore";
        public static final String JUNIOR = "Junior";
        public static final String SENIOR = "Senior";

        private String status;

        public Student(String name, String address, String phoneNumber, String email, String status) {
            super(name, address, phoneNumber, email);
            this.status = status;
        }

        @Override
        public String toString() {
            return "Student: " + super.toString();
        }
    }

    // Employee.java
    public class Employee extends Person {
        private String office;
        private double salary;
        private String dateHired;

        public Employee(String name, String address, String phoneNumber, String email, String office, double salary, String dateHired) {
            super(name, address, phoneNumber, email);
            this.office = office;
            this.salary = salary;
            this.dateHired = dateHired;
        }

        @Override
        public String toString() {
            return "Employee: " + super.toString();
        }
    }

    // Faculty.java
    public class Faculty extends Employee {
        private String officeHours;
        private String rank;

        public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, String dateHired, String officeHours, String rank) {
            super(name, address, phoneNumber, email, office, salary, dateHired);
            this.officeHours = officeHours;
            this.rank = rank;
        }

        @Override
        public String toString() {
            return "Faculty: " + super.toString();
        }
    }

    // Staff.java
    public class Staff extends Employee {
        private String title;

        public Staff(String name, String address, String phoneNumber, String email, String office, double salary, String date){}

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}}