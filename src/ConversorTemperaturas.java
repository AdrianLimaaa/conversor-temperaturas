import java.util.Scanner;

public class ConversorTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        double celsius = 0;
        double fahrenheit = 0;
        double kelvin = 0;

        do {
            //Menu
            System.out.println("===== CONVERSOR DE TEMPERATURAS =====");
            System.out.println("1 - Celsius para Fahrenheit");
            System.out.println("2 - Fahrenheit para Celsius");
            System.out.println("3 - Celsius para Kelvin");
            System.out.println("4 - Fahrenheit para Kelvin");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("Digite a temperatura em Celsius");
                    celsius = scanner.nextDouble();
                    fahrenheit = celsiusParaFahrenheit(celsius);
                    System.out.println("Resultado: " + fahrenheit + " °F");
                    break;
                case 2:
                    System.out.println("Digite a temperatura em Fahrenheit");
                     fahrenheit = scanner.nextDouble();
                     celsius = fahrenheitParaCelsius(fahrenheit);
                    System.out.println("Resultado: " + celsius + " Cº");
                    break;
                case 3:
                    System.out.println("Digite a temperatura em Celsius");
                    celsius = scanner.nextDouble();
                    kelvin = celsiusParaKevin(celsius);
                    System.out.println("Resultado: " + kelvin + " Kº" );
                    break;
                case 4:
                    System.out.println("Digite a temperatura em Fahrenheit");
                    fahrenheit = scanner.nextDouble();
                    kelvin = fahrenheitParaKevin(fahrenheit);
                    System.out.println("Resultado: " + kelvin + " Kº" );
            }
        } while (opcao != 5);

        scanner.close();
    }
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    public static double celsiusParaKevin(double celsius) {
        return celsius + 273.15;
    }
    public static double fahrenheitParaKevin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }
}
