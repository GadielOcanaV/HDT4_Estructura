import java.util.Stack;

public class ExpressionEvaluator {
    private final Stack<Integer> operandStack = new Stack<>();

    public int evaluateExpression(String expression) {
        // Convertir la expresión infix a postfix
        String postfixExpression = convertToPostfix(expression);

        // Evaluar la expresión postfix
        return evaluatePostfix(postfixExpression);
    }

    private String convertToPostfix(String infixExpression) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> operatorStack = new Stack<>();

        for (char ch : infixExpression.toCharArray()) {
            if (Character.isDigit(ch)) {
                postfix.append(ch); // Si es un dígito, agregar directamente al resultado postfix
            } else if (ch == '(') {
                operatorStack.push(ch); // Si es '(' push a la pila de operadores
            } else if (ch == ')') {
                // Mientras haya operadores en la pila y el operador en el tope no sea '('
                // Sacar operadores de la pila y agregarlos al resultado postfix
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    postfix.append(operatorStack.pop());
                }
                operatorStack.pop(); // Sacar '(' de la pila
            } else {
                // Es un operador
                // Mientras haya operadores en la pila con mayor o igual precedencia
                // Sacar operadores de la pila y agregarlos al resultado postfix
                while (!operatorStack.isEmpty() && precedence(operatorStack.peek()) >= precedence(ch)) {
                    postfix.append(operatorStack.pop());
                }
                operatorStack.push(ch); // Push el operador actual a la pila
            }
        }

        // Sacar los operadores restantes de la pila y agregarlos al resultado postfix
        while (!operatorStack.isEmpty()) {
            postfix.append(operatorStack.pop());
        }

        return postfix.toString();
    }
    // Método para determinar la precedencia de un operador
    private int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }

    private int evaluatePostfix(String postfixExpression) {
        for (char ch : postfixExpression.toCharArray()) {
            if (Character.isDigit(ch)) {
                operandStack.push(Character.getNumericValue(ch)); // Si es un dígito, push a la pila de operandos
            } else {
                // Es un operador
                // Sacar los dos operandos superiores de la pila
                int operand2 = operandStack.pop();
                int operand1 = operandStack.pop();

                // Realizar la operación correspondiente y poner el resultado en la pila
                switch (ch) {
                    case '+':
                        operandStack.push(operand1 + operand2);
                        break;
                    case '-':
                        operandStack.push(operand1 - operand2);
                        break;
                    case '*':
                        operandStack.push(operand1 * operand2);
                        break;
                    case '/':
                        operandStack.push(operand1 / operand2);
                        break;
                }
            }
        }

        // El resultado final estará en la cima de la pila de operandos
        return operandStack.pop();
    }

}

