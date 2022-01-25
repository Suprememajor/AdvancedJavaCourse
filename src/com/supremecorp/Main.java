package com.supremecorp;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Color c1 = Color.RED;

        System.out.println("Red Enum name: " + c1.name());
        System.out.println("Red Enum value: " + c1.getValue());

        for (Color color: Color.values()) {
            System.out.println("Enum value: " + color.getValue());
        }
    }
}

enum Color {
    RED("red"), GREEN("green"), BLUE("blue");

    private String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
