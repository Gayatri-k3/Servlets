package com.xworkz.lambdaexpexample.lambdaexpression;

import java.util.function.*;


public class FunctionalInterfaceLE {
    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = (product, quantity) -> {
            System.out.println("BiConsumer - Product: " + product + ", Quantity: " + quantity);
        };
        biConsumer.accept("Pen", 20);

        BiFunction<String, Integer, String> biFunction = (name, age) -> name + " is " + age + " years old.";
        System.out.println("BiFunction: " + biFunction.apply("Anu", 25));

        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
        System.out.println("BinaryOperator: " + binaryOperator.apply(4, 5));

        BiPredicate<String, String> biPredicate = (s1, s2) -> s1.length() == s2.length();
        System.out.println("BiPredicate: " + biPredicate.test("car", "bus"));

        BooleanSupplier booleanSupplier = () -> 10 > 5;
        System.out.println("BooleanSupplier: " + booleanSupplier.getAsBoolean());

        Consumer<String> consumer = (str) -> System.out.println("Consumer: " + str.toUpperCase());
        consumer.accept("java");

        DoubleBinaryOperator doubleBinaryOperator = (d1, d2) -> d1 - d2;
        System.out.println("DoubleBinaryOperator: " + doubleBinaryOperator.applyAsDouble(55.5, 33.3));

        DoubleConsumer doubleConsumer = (value) -> System.out.println("DoubleConsumer: Square = " + (value * value));
        doubleConsumer.accept(12.3);

        DoubleFunction<String> doubleFunction = (val) -> "Rounded: " + Math.round(val);
        System.out.println("DoubleFunction: " + doubleFunction.apply(45.67));

        DoublePredicate doublePredicate = (value) -> value > 0;
        System.out.println("DoublePredicate: " + doublePredicate.test(0.001));

        DoubleSupplier doubleSupplier = () -> Math.random() * 100;
        System.out.println("DoubleSupplier: " + doubleSupplier.getAsDouble());

        DoubleToIntFunction doubleToIntFunction = (value) -> (int) Math.floor(value);
        System.out.println("DoubleToIntFunction: " + doubleToIntFunction.applyAsInt(76.88));

        DoubleToLongFunction doubleToLongFunction = (val) -> (long) (val * 100);
        System.out.println("DoubleToLongFunction: " + doubleToLongFunction.applyAsLong(9.2));

        DoubleUnaryOperator doubleUnaryOperator = (value) -> value / 2;
        System.out.println("DoubleUnaryOperator: " + doubleUnaryOperator.applyAsDouble(60));

        Function<String, Integer> function = (str) -> str.length();
        System.out.println("Function: " + function.apply("Functional"));

        IntBinaryOperator intBinaryOperator = (a, b) -> a / b;
        System.out.println("IntBinaryOperator: " + intBinaryOperator.applyAsInt(20, 5));

        IntConsumer intConsumer = (x) -> System.out.println("IntConsumer: x*x = " + (x * x));
        intConsumer.accept(8);

        IntFunction<String> intFunction = (x) -> x % 2 == 0 ? "Even" : "Odd";
        System.out.println("IntFunction: " + intFunction.apply(9));

        IntPredicate intPredicate = (x) -> x > 100;
        System.out.println("IntPredicate: " + intPredicate.test(99));

        IntSupplier intSupplier = () -> 500;
        System.out.println("IntSupplier: " + intSupplier.getAsInt());

        IntToDoubleFunction intToDoubleFunction = (x) -> x * 2.5;
        System.out.println("IntToDoubleFunction: " + intToDoubleFunction.applyAsDouble(4));

        IntToLongFunction intToLongFunction = (x) -> x * 10000L;
        System.out.println("IntToLongFunction: " + intToLongFunction.applyAsLong(2));

        IntUnaryOperator intUnaryOperator = (x) -> x + 10;
        System.out.println("IntUnaryOperator: " + intUnaryOperator.applyAsInt(90));

        LongBinaryOperator longBinaryOperator = (a, b) -> a * b;
        System.out.println("LongBinaryOperator: " + longBinaryOperator.applyAsLong(5L, 20L));

        LongConsumer longConsumer = (x) -> System.out.println("LongConsumer: " + x);
        longConsumer.accept(999999L);

        LongFunction<String> longFunction = (x) -> "Long value: " + x;
        System.out.println("LongFunction: " + longFunction.apply(789654123L));

        LongPredicate longPredicate = (x) -> x % 2 == 1;
        System.out.println("LongPredicate: " + longPredicate.test(45));

        LongSupplier longSupplier = () -> 9876543210L;
        System.out.println("LongSupplier: " + longSupplier.getAsLong());

        LongToDoubleFunction longToDoubleFunction = (x) -> x / 100.0;
        System.out.println("LongToDoubleFunction: " + longToDoubleFunction.applyAsDouble(123456L));

        LongToIntFunction longToIntFunction = (x) -> (int) x;
        System.out.println("LongToIntFunction: " + longToIntFunction.applyAsInt(4321L));

        LongUnaryOperator longUnaryOperator = (x) -> x - 5000;
        System.out.println("LongUnaryOperator: " + longUnaryOperator.applyAsLong(15000));

        ObjDoubleConsumer<String> objDoubleConsumer = (label, value) ->
                System.out.println("ObjDoubleConsumer: " + label + " = " + value);
        objDoubleConsumer.accept("Distance", 45.6);

        ObjIntConsumer<String> objIntConsumer = (label, value) ->
                System.out.println("ObjIntConsumer: " + label + " = " + value);
        objIntConsumer.accept("Marks", 88);

        ObjLongConsumer<String> objLongConsumer = (label, value) ->
                System.out.println("ObjLongConsumer: " + label + " = " + value);
        objLongConsumer.accept("Population", 1400000000L);

        Predicate<String> predicate = (name) -> name.length() >= 5;
        System.out.println("Predicate: " + predicate.test("India"));

        Supplier<String> supplier = () -> "Supplied a string!";
        System.out.println("Supplier: " + supplier.get());

        ToDoubleBiFunction<Integer, Integer> toDoubleBiFunction = (x, y) -> (x + y) / 2.0;
        System.out.println("ToDoubleBiFunction: " + toDoubleBiFunction.applyAsDouble(50, 70));

        ToDoubleFunction<Integer> toDoubleFunction = (x) -> x * 0.75;
        System.out.println("ToDoubleFunction: " + toDoubleFunction.applyAsDouble(40));

        ToIntBiFunction<Double, Double> toIntBiFunction = (a, b) -> (int) (a + b);
        System.out.println("ToIntBiFunction: " + toIntBiFunction.applyAsInt(12.4, 18.6));

        ToIntFunction<String> toIntFunction = (s) -> s.length();
        System.out.println("ToIntFunction: " + toIntFunction.applyAsInt("Laptop"));

        ToLongBiFunction<Integer, Integer> toLongBiFunction = (a, b) -> (long) a * b * 10;
        System.out.println("ToLongBiFunction: " + toLongBiFunction.applyAsLong(30, 40));

        ToLongFunction<Double> toLongFunction = (val) -> (long) (val * 100);
        System.out.println("ToLongFunction: " + toLongFunction.applyAsLong(12.75));

        UnaryOperator<String> unaryOperator = (text) -> text.toLowerCase();
        System.out.println("UnaryOperator: " + unaryOperator.apply("HELLO WORLD"));
    }
}

