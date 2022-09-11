package com.boris.patterns.Structural_patterns.Bridge;

public class BridgeApp {

    public static void main(String[] args) {

        // создаем физические датчики
        Speedometer speedometer = new Speedometer();
        Accelerometer accelerometer = new Accelerometer();
        measure(speedometer);
        measure(accelerometer);
    }

    private static void measure(SensorImpl sensor) {
        System.out.println(sensor.getClass().getSimpleName());
        // датчик мгновенного значения
        BaseSensor baseSensor = new BaseSensor(sensor);
        // датчик усредненного значения по 5 последним измерениям
        AverageSensor averageSensor = new AverageSensor(sensor, 5);
        // серия измерений
        for (int i = 0; i < 10; i++) {
            System.out.printf("мгновенное значение : %f, среднее значение: %f \n",
                    baseSensor.getValue(), averageSensor.getAverageValue());
        }

    }

}
