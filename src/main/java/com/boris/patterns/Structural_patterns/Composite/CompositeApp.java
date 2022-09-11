package com.boris.patterns.Structural_patterns.Composite;

public class CompositeApp {

    public static void main(String[] args) {

        // инициализация операций
        Operation drill6 = new MachiningOperation("отверстие 6 мм");
        Operation drill5 = new MachiningOperation("отверстие 5 мм");
        Operation screw6 = new MachiningOperation("нарезать резьбу M6");
        Operation chamfer10 = new MachiningOperation("снять фаску 10мм");
        Operation m6composite = new CompositeOperation().add(drill5,screw6,chamfer10);
        // использование разных по структуре операций идентично
        drill6.perform();
        m6composite.perform();


    }
}
