import com.functionalprogramming.lambda.demo.Calculator;
import com.functionalprogramming.lambda.demo.CalculatorImpl;
import com.functionalprogramming.lambda.demo.ScientificCalc;

interface  AddData{
    int add(int a, int y);
}
public class Main{


    public static void main(String[] args) {

        Calculator c = new CalculatorImpl(10);
        Calculator c2 = new ScientificCalc();

        c.switchOn();
        c2.switchOn();

        AddData add = (a,b) ->{
           return a+b;
        };

        add.add(12,12);
    }
}
