package com.company.HomeWork5;

public class TestPersonPr {
    public static void main(String[] args) {
        PersonPr[] persArray = new PersonPr[5];
        persArray[0] = new PersonPr("Петров Петр", "Инженер", "petrov@mail.ru",
                "062458978", "520 $", 52);

        persArray[1] = new PersonPr("Сидоров Олег", "Электрик", "sidorov@mail.ru",
                "072458978", "580 $", 35);

        persArray[2] = new PersonPr("Антонов Антон", "Бухгалтер", "antonov@mail.ru",
                "06256778", "900 $", 40);

        persArray[3] = new PersonPr("Афанасьев Антон", "Начальник отдела", "anton@mail.ru",
                "062458978", "800 $", 28);

        persArray[4] = new PersonPr("Нестеров Владимир", "Администратор", "vladimir@mail.ru",
                "062129978", "600 $", 41);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                System.out.println(persArray[i]); // С помощью цикла вывести информацию только о сотрудниках старше 40 лет
            }
        }
    }
}