/*1. Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.
Создать один или несколько конструкторов которые гарантирует что у каждого есть имя, фамилия.
Создать массив из 100 обьектов типа Person заполненных случайными данными (Например создать массив на несколько имен и выбирать из него случайным образом).
1.1*. Обеспечить чтобы случайные данные (вес, рост, возраст) выглядели правдоподобно:
не было человека весом 3 кг и ростом 180 и тд.*/
package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int maxNumberOfPeople = 100;
        Person[] person = new Person[maxNumberOfPeople];
        Random random = new Random();
        String tmpName, tmpSurname;
        int tmpAge;
        double tmpWeight, tmpGrowth;
        int indexPeopleInArray = 0;
        while (indexPeopleInArray < person.length) {
            tmpName = randomName();
            tmpSurname = randomSurname();
            tmpAge = random.nextInt(120);
            tmpWeight = random.nextInt(200);
            tmpGrowth = random.nextInt(280);
            Person kandidat = new Person(tmpName, tmpSurname, tmpAge, tmpWeight, tmpGrowth);
            if (kandidat.getName() != null) {
                person[indexPeopleInArray] = kandidat;
                indexPeopleInArray++;
            }
        }
        System.out.println(Arrays.toString(person));
    }

    private static String randomSurname() {
        String[] surname = new String[8];
        surname[0] = "Иванов";
        surname[1] = "Петров";
        surname[2] = "Сидоров";
        surname[3] = "Васильев";
        surname[4] = "Казаков";
        surname[5] = "Сергеев";
        surname[6] = "Ивушки н";
        surname[7] = "Семенов";
        Random random = new Random();
        return surname[random.nextInt(8)];
    }

    private static String randomName() {
        String[] name = new String[8];
        name[0] = "Иван";
        name[1] = "Петр";
        name[2] = "Сидор";
        name[3] = "Василий";
        name[4] = "Альберт";
        name[5] = "Сергей";
        name[6] = "Дмитрий";
        name[7] = "Семен";
        Random random = new Random();
        return name[random.nextInt(7)];
    }
}
