package lesson_04.class_homework.task1;


public class Line {

    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        if (start == null || end == null) {
            System.err.println("Одна или обе точки отсутствуют");
        } else if (start.equals(end)) {
            System.err.println("Переданы одинаковые точки");
        } else {
            this.start = start;
            this.end = end;
        }
    }

    public double getLength() {
        //return start.distanceTo(end);
        //return end.distanceTo(start);
        return Point.distanceBetween(start, end);
    }

    public static void compareLinesLength(Line l1, Line l2) {
        if (l1 == null || l2 == null) {
            System.err.println("Один или оба отрезка отсутствуют");
        } else {
            double length1 = l1.getLength();
            double length2 = l2.getLength();
            if (length1 > length2) {
                System.out.println("Первый отрезок больше");
            } else if (length1 < length2) {
                System.out.println("Второй отрезок больше");
            } else {
                System.out.println("Отрезки равны");
            }
        }
    }

    public static boolean getIntersectionPoint(Line l1, Line l2) {
        // Find the four orientations needed for general and
        // special cases
        int o1 = orientation(l1.start, l1.end, l2.start);
        int o2 = orientation(l1.start, l1.end, l2.end);
        int o3 = orientation(l2.start, l2.end, l1.start);
        int o4 = orientation(l2.start, l2.end, l1.end);

        // General case
        if (o1 != o2 && o3 != o4)
            return true;

        // Special Cases
        // p1, q1 and p2 are colinear and p2 lies on segment p1q1
        if (o1 == 0 && onSegment(l1.start, l2.start,  l1.end)) return true;

        // p1, q1 and p2 are colinear and q2 lies on segment p1q1
        if (o2 == 0 && onSegment(l1.start, l2.end,  l1.end)) return true;

        // p2, q2 and p1 are colinear and p1 lies on segment p2q2
        if (o3 == 0 && onSegment(l2.start, l1.start, l2.end)) return true;

        // p2, q2 and q1 are colinear and q1 lies on segment p2q2
        if (o4 == 0 && onSegment(l2.start, l1.end, l2.end)) return true;

        return false; // Doesn't fall in any of the above cases


    }

    private static boolean onSegment(Point p, Point q, Point r)
    {
        if (q.getX() <= Math.max(p.getX(), r.getX()) && q.getX() >=  Math.min(p.getX(), r.getX()) &&
                q.getY() <= Math.max(p.getY(), r.getY()) && q.getY() >=  Math.min(p.getY(), r.getY()))
            return true;

        return false;
    }

    private static int orientation(Point p, Point q, Point r)
    {
        // See http://www.geeksforgeeks.org/orientation-3-ordered-points/
        // for details of below formula.
        double val = (q.getY() - p.getY()) * (r.getX() - q.getX()) -
                (q.getX() - p.getX()) * (r.getY() - q.getY());

        if (val == 0) return 0;  // colinear

        return (val > 0)? 1: 2; // clock or counterclock wise
    }
}
