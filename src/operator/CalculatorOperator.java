package operator;

public interface CalculatorOperator<T> {
    T sum(T a, T b);
    T sub(T a, T b);
    T multi(T a, T b);
    T div(T a, T b);
}
