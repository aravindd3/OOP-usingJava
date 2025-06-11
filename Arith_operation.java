class ArithmeticOperation {
    double num1,num2;
    public void calculate() {
    }
}
class Calculator2 extends ArithmeticOperation {
public Calculator2(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void calculate() {
        double result = num1 + num2;
        System.out.println("Result of addition: " + result);
    }
}

public class Arith_operation {
    public static void main(String[] args) {
        Calculator2 calc = new Calculator2(10, 20);
        System.out.println("Calling calculate from child class:");
        calc.calculate();
    }
}
