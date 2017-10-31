package lesson_08;

import lesson_05.classwork.figures.Figure;

import java.util.Comparator;

//Компаратор, который сравнивает фигуры по площади
public class FigureAreaComparator implements Comparator<Figure> {

    @Override
    public int compare(Figure o1, Figure o2) {
        double area1 = o1.getArea();
        double area2 = o2.getArea();
        return Double.compare(area1, area2);
    }
}
