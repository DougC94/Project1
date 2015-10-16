import java.util.Scanner;

class Practice
{
    private int input1, input2, answer, value1, value2;

    Scanner op = new Scanner(System.in);

    public static void main(String args[])
    {
        Practice pr = new Practice();
        pr.calculation();

    }

    public void calculation()
    {
        int option;
        System.out.println("Options: 1 = Add");
        System.out.println("Options: 2 = Subtract");
        System.out.println("Options: 3 = Divide");
        System.out.println("Options: 4 = Multiply");
        option = op.nextInt();

        if (option == 1)
        {
            getValue();
            addNumbers();
        }
    }

    public void getValue()
    {

        System.out.println("enter first digit");
        value1 = op.nextInt();
        System.out.println("enter second digit");
        value2 = op.nextInt();
    }

    public void addNumbers()
    {
        answer = value1 + value2;
        System.out.println("Your answer is: " + answer);

    }

    public int subtractNumbers()
    {
        answer = value1 - value2;
        return answer;
    }

    public int devideNumbers()
    {
        answer = value1 / value2;
        return answer;
    }

    public int multiplyNumbers()
    {
        answer = value1 * value2;
        return answer;
    }
}
