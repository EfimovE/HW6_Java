// Реализовать множество (set) с помощью TreeMap.
// Создать метод add, добавляющий элемент в ваше множество.
// Объявить и инициализировать компаратор с обратной (от большего к меньшему)
// логикой сортировки чисел. Объявить и инициализировать TreeSet использующий ваш компаратор.
// Добавить несколько эллементов в сет и вывести в консоль.

import java.util.*;
public class Task {
    static Map<Integer, Object> treeMap = new TreeMap<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer num1, Integer num2) {
            return num2.compareTo(num1);
        }
    }
    );
    static Set<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer num1, Integer num2) {
            return num2.compareTo(num1);
        }
    }
    );
    private static final Object OBJECT = new Object();
    static void methodAdd(int x) {
        treeMap.put(x, OBJECT);
        return;
    }
    public static void main(String[] args) {
        methodAdd(5451); methodAdd(25);
        methodAdd(52); methodAdd(5);
        methodAdd(18);
        System.out.println(treeMap.keySet());
        treeSet.add(956); treeSet.add(812);
        treeSet.add(0); treeSet.add(321);
        treeSet.add(15);
        System.out.println(treeSet);
    }

}