package Practice;

public class Calculation
{
    // Creating object from Main class (Used to reference variables within class)

    public int input1, input2, answer, value1, value2;

    public void addNumbers()
    {
        answer = value1 + value2;
        System.out.println("Your answer is: " + answer);

    }

    public void subtractNumbers()
    {
        answer = value1 - value2;
        System.out.println("Your answer is: " + answer);
    }

    public void divideNumbers()
    {
        answer = value1 / value2;
        System.out.println("Your answer is: " + answer);
    }

    public void multiplyNumbers()
    {
        answer = value1 * value2;
        System.out.println("Your answer is: " + answer);
    }
}
