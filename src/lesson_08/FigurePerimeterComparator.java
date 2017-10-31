package lesson_08;

import lesson_05.classwork.figures.Figure;

import java.util.Comparator;

//Компаратор, который сравнивает фигуры по площади
public class FigurePerimeterComparator implements Comparator<Figure> {

    @Override
    public int compare(Figure o1, Figure o2) {
        double o1Perimeter = o1.getPerimeter();
        double o2Perimeter = o2.getPerimeter();
        return Double.compare(o1Perimeter, o2Perimeter);
    }
}
