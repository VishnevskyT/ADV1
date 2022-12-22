package exercise_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Завдання 2
 * Виведення на екран елементів List: Створити список, заповнити його на 10 елементів та вивести на екран вміст,
 * використовуючи iterator.
 */

public class Main {
    public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        int i = 0;
        do {

            System.err.print("Введіть " + ++i + "-е будь-яке ціле число: _");
            list.add(Integer.parseInt(br.readLine()));

        } while (list.size() < 10);

    } catch (IOException e) {
        System.out.println("Щось пішло не так :(");
    }
        Iterator<Integer> iterator = list.listIterator();

    while (iterator.hasNext()) {
//        Integer temp = iterator.next();
        System.out.println(iterator.next());
    }

    }
}
