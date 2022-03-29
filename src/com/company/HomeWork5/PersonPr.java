package com.company.HomeWork5;

public class PersonPr {

    private String nameSurnamePatronymic;
    private String position;
    private String email;
    private String telephon;
    private String salary;
    private int age;

    public String getNameSurnamePatronymic() {
        return nameSurnamePatronymic;
    }

    public void setNameSurnamePatronymic(String nameSurnamePatronymic) {
        this.nameSurnamePatronymic = nameSurnamePatronymic;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelephon() {
        return telephon;
    }
    public void setTelephon(String telephon) {
        this.telephon = telephon;
    }
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public PersonPr(String nameSurnamePatronymic, String position, String email, String telephon, String salary, int age) {
        this.nameSurnamePatronymic = nameSurnamePatronymic;
        this.position = position;
        this.email = email;
        this.telephon = telephon;
        this.salary = salary;
        this.age = age;
    }

    public static void main(String[] args) {
        PersonPr person1 = new PersonPr("Иванов Иван Иванович", "Директор", "ivanov@gmail.com",
                "069000000", "1 000 $", 45);
        System.out.println(person1); // Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль

    }
    @Override
    public String toString() {
        return "Person{" +
                "nameSurnamePatronymic='" + nameSurnamePatronymic + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", telephon='" + telephon + '\'' +
                ", salary='" + salary + '\'' +
                ", age=" + age +
                '}';
    }
}