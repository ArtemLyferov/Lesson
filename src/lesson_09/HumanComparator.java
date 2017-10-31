package lesson_09;

import lesson_05.classwork.animals.Human;

import java.util.Comparator;

public class HumanComparator implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
