package com.dmdev.oop.lesson2;

public class Computer {
    //не указан модификатор доступа, по умолчанию используется package-private (default access).
    //package-private (default): Переменная будет доступна только внутри текущего пакета.
    //Она не будет доступна вне пакета, даже если класс унаследован.
    int ssd = 500; // дефолтное значение
    int ram = 1024;
    //статические переменные загрузятся первыми при выполнении
    //функции = методы
    void  load(){
        System.out.println("Loading computer...");
    }

    void printState(){
        System.out.println("Ssd: " + ssd);
        System.out.println("Ram: " + ram);
    }
    // объект = конкретный экземпляр какого-то класса
}
