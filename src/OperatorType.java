import javax.swing.*;

public enum OperatorType {
    PLUS('+'),
    MINUS('-'),
    MULTI('*'),
    DIVIDE('/');

    private final char op;
    OperatorType(char op) {
        this.op = op;
    }

    private char getOp() {
        return op;
    }

    public static OperatorType getOpType(char input) {
        for(OperatorType symbol : OperatorType.values()) {
            if (symbol.getOp() == input)
                return symbol;
        }
        throw new IllegalArgumentException("올바르지 않은 연산자입니다.");
    }
}
