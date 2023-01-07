package homeWork5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static homeWork5.ChessBoard.createBoard;
import static homeWork5.HeapSort.printArray;
import static homeWork5.ListOfEmplooyes.getListOfEmplooyes;

public class Main {
    public static void main(String[] args) {
//        personPhoneNumber();
//        emplooyes();
//        getHeapSort();
    }

    /**
     * 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
     * что 1 человек может иметь несколько телефонов.
     */
    public static void personPhoneNumber() {
        PhoneBook people = new PhoneBook();
        people.add("Соловьев Сергей", "89502321456");
        people.add("Козлова Анна", "89826234561");
        people.add("Козлова Анна", "89825234432");
        people.add("Сергеев Леонид", "89045654321");
        people.add("Васильев Петя", "89765345678");

        System.out.println(people.find("Козлова Анна"));
    }

    /**
     * Пусть дан список сотрудников:
     * Написать программу, которая найдет и выведет повторяющиеся имена
     * с количеством повторений. Отсортировать по убыванию популярности.
     */
    private static void emplooyes() {
        ListOfEmplooyes people = new ListOfEmplooyes();
        people.add("Иван", "Иванов");
        people.add("Светлана", "Петрова");
        people.add("Кристина", "Белова");
        people.add("Анна", "Мусина");
        people.add("Анна", "Крутова");
        people.add("Иван", "Юрин");
        people.add("Петр", "Лыков");
        people.add("Павел", "Чернов");
        people.add("Петр", "Чернышов");
        people.add("Мария", "Федорова");
        people.add("Марина", "Светлова");
        people.add("Мария", "Савина");
        people.add("Мария", "Рыкова");
        people.add("Марина", "Лугова");
        people.add("Анна", "Владимирова");
        people.add("Иван", "Мечников");
        people.add("Петр", "Петин");
        people.add("Иван", "Ежов");

        getListOfEmplooyes();
    }

    /**
     * Реализовать алгоритм пирамидальной сортировки (HeapSort)
     */
    public static void getHeapSort() {
        int arr[] = {13, 565, 565, 45, 58, 12, 869, 356, 56};
        HeapSort ob = new HeapSort();
        ob.sort(arr);
        System.out.println("Sorted array is");
        printArray(arr);
    }
}