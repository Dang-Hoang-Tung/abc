import java.util.List;

public class Solution {
    public int evaluateExpression(List<String> operators, List<Integer> operands) {
        int result = operands.get(0);
        for (int i = 0; i < operators.size(); i++) {
            int nextOperand = operands.get(i + 1);
            switch (operators.get(i)) {
                case "+":
                    result += nextOperand;
                    break;
                case "-":
                    result -= nextOperand;
                    break;
                case "*":
                    result *= nextOperand;
                    break;
                case "
                    result /= nextOperand;
                    break;
                case "**":
                    result = (int) Math.pow(result, nextOperand);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + operators.get(i));
            }
        }
        return result;
    }
}