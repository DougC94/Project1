package Practice;

public class Options
{
    Main m = new Main();

    Calculation c = new Calculation();

    public void options()
    {
        int option;
        System.out.println("Options: 1 = Add");
        System.out.println("Options: 2 = Subtract");
        System.out.println("Options: 3 = Divide");
        System.out.println("Options: 4 = Multiply");
        option = m.op.nextInt();

        if (option == 1)
        {
            getValue();
            c.addNumbers();
        }
        if (option == 2)
        {
            getValue();
            c.subtractNumbers();
        }
        if (option == 3)
        {
            getValue();
            c.divideNumbers();
        }
        if (option == 4)
        {
            getValue();
            c.multiplyNumbers();
        }
        if (option > 4 || option < 1)
        {
            System.out.println("You have entered an invalid number");
            options();
        }

    }

    public void getValue()
    {
        System.out.println("enter first digit");
        c.value1 = m.op.nextInt();
        System.out.println("enter second digit");
        c.value2 = m.op.nextInt();
    }
}
