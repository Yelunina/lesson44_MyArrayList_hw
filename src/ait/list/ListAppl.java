package ait.list;

import ait.list.interfaces.IList;
import ait.list.model.MyArrayList;

public class ListAppl {
    public static void main(String[] args) {
        IList<Integer> list = new MyArrayList<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add(2);
        list.add(7);
        list.add(5);
        list.add(3);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add(7);
        list.add(null);
        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.get(5));
        System.out.println(list.indexOf(3));
        System.out.println(list.indexOf(7));
        System.out.println(list.indexOf(null));
        System.out.println(list.indexOf(10));
        Integer num = list.remove(5);
        System.out.println(num);
        System.out.println(list.size());
        System.out.println(list.remove((Integer) 7));
        System.out.println(list.size());
        System.out.println("===== Homework =====");
        list.clear();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println("=========================");
        list.add(2);
        for (Integer n : list) {
            System.out.println(n);
        }
        System.out.println("=========================");
        list.add(2);
        list.add(7);
        list.add(5);
        list.add(3);
        System.out.println(list.size());
        System.out.println("=========================");
        for (Integer n : list) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("=========================");
        list.add(4, 7);
        System.out.println("=========================");
        for (Integer n : list) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("=========================");
        System.out.println(list.indexOf(7));
        System.out.println(list.lastIndexOf(7));
        System.out.println("=========================");
        System.out.println(list.set(4, 1));
        System.out.println("=========================");
        for (Integer n : list) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("=========================");
        System.out.println(list.get(4));
        System.out.println(list.indexOf(null));
        System.out.println(list.contains(10));
        System.out.println(list.remove(2));
        System.out.println(list.remove(2));
        System.out.println(list.remove(2));
        System.out.println(list.remove(2));
        System.out.println("=========================");
        for (Integer n : list) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}