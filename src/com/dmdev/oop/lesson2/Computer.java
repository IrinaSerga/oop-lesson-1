package com.dmdev.oop.lesson2;

public class Computer {
    //не указан модификатор доступа, по умолчанию используется package-private (default access).
    //package-private (default): Переменная будет доступна только внутри текущего пакета.
    //Она не будет доступна вне пакета, даже если класс унаследован.
    int ssd = 500; // дефолтное значение - состояние объекта
    int ram;  // default = 0
//    long ram;
    //статические переменные загрузятся первыми при выполнении
    //функции = методы

    Computer (){
        System.out.println("Computer Constructor");
    }

    Computer(int newSSD) {
        ssd = newSSD;
        load();

    }

//    Computer(int newSSD, int newRAM) {
//        ssd = newSSD;
//        ram = newRAM;
//        System.out.println(" ");
//    }

    Computer(int ssd, int newRAM) {
        // конфликт имен
        // здесь приоритет у параметра в методе выше
        this.ssd = ssd; // ссылка на текущий объект
        ram = newRAM;
        System.out.println(" ");
    }
// влияет не только кол-во параметров, но и их порядок
//    Computer(long newRAM, int ssd) {
//        // конфликт имен
//        // здесь приоритет у параметра в методе выше
//        this.ssd = ssd; // ссылка на текущий объект
//        ram = newRAM;
//        System.out.println(" ");
//    }


    // Сигнатура метода: название + список параметров. Возвращаемый тип не входит в сигнатуру метода!(void)
    void  load(){
        System.out.println("Loading computer...");
    }

    void  load(boolean open){
        System.out.println("Loading computer...");
        if (open){
            System.out.println("Opening computer...");
        }
    }

    void printState(){
        System.out.println("Ssd: " + ssd);
        System.out.println("Ram: " + ram);
    }
    // объект = конкретный экземпляр какого-то класса
}
