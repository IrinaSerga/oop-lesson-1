package com.dmdev.oop.lesson2;

public class ComputerRunner {

    public static void main(String[] args) {
        int value = 5; //тип данных именование = значение
        // класс - это новый тип, который мы создали
        Computer computer = new Computer(); //переменная компьютер с типом компьютер //оператор new - ключевое слово, а затем конструктор
        computer.printState();
//        computer.load();
//        System.out.println("Ram: " + computer.ram);
//        System.out.println("Ssd: " + computer.ssd);

        //new Computer(); -- конструктор по-умолчанию. Ф-я, кот должна точь в точь соответствовать именованию класса

        Computer computer2 = new Computer(1050);
        computer2.printState();

        Computer computer3 = new Computer(10000, 10000);
        computer3.printState();
        computer3.load(true);
    }



}
