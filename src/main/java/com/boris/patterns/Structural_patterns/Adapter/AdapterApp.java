package com.boris.patterns.Structural_patterns.Adapter;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AdapterApp {


    public static void main(String[] args) {

        /**
         * Adapter
         */
        // окружность
        Circle circle = new Circle(10);
        // круглый квадрат
        RoundableSquare square = new RoundableSquare(10);
        // круглый квадрат имеет одновременно и сторону
        double side = square.getSide();
        // и радиус
        double radius = square.getRadius();
        // и его можно положить в корзину вместе с другими округлыми
        List<Roundable> roundables = new ArrayList<>();
        roundables.add(circle);
        roundables.add(square);
        // и отсортировать
        roundables.sort(Comparator.comparingDouble(Roundable::getRadius));

        // данность, набор окружностей, реализуют интерфейс Roundable, имеют радиус
        final List<Circle> circles = Arrays.asList(new Circle(1), new Circle(2), new
                Circle(3));
        // другая данность, набор квадратов, просто квадраты и все
        final List<Square> squares = Arrays.asList(new Square(1), new Square(2), new
                Square(3));
        final List<Object> circlesAndSquares = new ArrayList<>();
        circlesAndSquares.addAll(circles);
        circlesAndSquares.addAll(squares);
        // используем безымянный класс кастомного компаратора
        circlesAndSquares.sort(new Comparator<>() {
            @Override
            public int compare(Object o1, Object o2) {
                return Double.compare(
                        asRoundable(o1).getRadius(), asRoundable(o2).getRadius()
                );
            }
            // приведение типа
            private Roundable asRoundable(Object o) {
                if (o instanceof Roundable)
                    return (Roundable) o;
                if (o instanceof Square)
                    return new RoundableSquareAdapter((Square) o);
                throw new InternalError("unexpected type");
            }
        });

    }

}
