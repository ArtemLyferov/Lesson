package lesson_04.class_homework.task3;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.err.println("Знаменатель равен 0");
        } else {
            int nod = Math.abs(nod(numerator, denominator));
            if (denominator > 0) {
                this.numerator = numerator / nod;
                this.denominator = denominator / nod;
            } else {
                this.numerator = -1 * numerator / nod;
                this.denominator = -1 * denominator / nod;
            }
        }
    }

    public Fraction add(Fraction other) {
        if (other == null) {
            System.err.println("Другая дробь отсутствует");
            return null;
        } else {
            int numer = this.numerator * other.denominator + this.denominator + other.numerator;
            int denom = this.denominator * other.denominator;
            return new Fraction(numer, denom);
        }
    }

    public Fraction sub(Fraction other) {
        if (other == null) {
            System.err.println("Другая дробь отсутствует");
            return null;
        } else {
            int numer = this.numerator * other.denominator - this.denominator + other.numerator;
            int denom = this.denominator * other.denominator;
            return new Fraction(numer, denom);
        }
    }

    public Fraction mul(Fraction other) {
        if (other == null) {
            System.err.println("Другая дробь отсутствует");
            return null;
        } else {
            int numer = this.numerator *  other.numerator;
            int denom = this.denominator * other.denominator;
            return new Fraction(numer, denom);
        }
    }

    public Fraction div(Fraction other) {
        if (other == null) {
            System.err.println("Другая дробь отсутствует");
            return null;
        } else if (other.numerator == 0) {
            System.err.println("Деление на 0");
            return null;
        } else {
            int numer = this.numerator *  other.denominator;
            int denom = this.denominator * other.numerator;
            return new Fraction(numer, denom);
        }
    }

    public void makeSameDenominator(Fraction other) {
        if (other == null) {
            System.err.println("Другая дробь отсутствует");
        } else {
            int denom1 = this.denominator;
            int denom2 = other.denominator;

            int nok = nok(denom1, denom2);

            this.numerator *= nok / denom1;
            other.numerator *= nok / denom2;

        }
    }

    private static int nok(int a, int b) {
        return (a * b) / nod(a, b);
    }

    private static int nod(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return nod(b, a % b);
        }
    }

    @Override
    public String toString() {
        if (denominator != 1)
            return String.format("%d/%d", numerator, denominator);
        else
            return String.format("%d", numerator);
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(-10000, -2000);
        Fraction f2 = new Fraction(3, -4);
        Fraction f3 = new Fraction(-11, 33);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        System.out.println(f1.add(f2));
        System.out.println(f2.div(f3));
        System.out.println(f2.mul(f1));
        System.out.println(f2.sub(f3));

        System.out.println(f1.mul(f2).sub(f3).div(f2));


    }

}
