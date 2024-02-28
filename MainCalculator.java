import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la expresión infix:");
        String infixExpression = scanner.nextLine();

        // Crear una instancia del evaluador de expresiones
        ExpressionEvaluator evaluator = new ExpressionEvaluator();

        // Evaluar la expresión
        try {
            int result = evaluator.evaluateExpression(infixExpression);
            System.out.println("Resultado: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

