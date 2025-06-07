package ex01;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o raio do seu circulo: ");
        double enterRadius = scanner.nextDouble();
        Circle userCircle = new Circle(enterRadius);
        double userArea = userCircle.calculateArea();
        double userPerimeter = userCircle.calculatePerimeter();
        System.out.println("A area do seu circulo é: " + userArea);
        System.out.println("O perímetro do seu circulo é: " + userPerimeter);
        scanner.close();
    }
}
