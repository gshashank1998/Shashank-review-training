class MathsCalculations
{
    public int factorial(int number)         // factorial calcuations
    {
        int i,fact=1;
        for(i=1;i<=number;i++)
          fact*=i;
        return fact;  
    }
    public double square(double number)     // square of double numbers
    {
        return number*number;
    }
    public double cube(double number)      // cube of double numbers
    {
        return number*number*number;
    }
}
public class MainClass
{
    public static void main(String arg[])
    {
        MathsCalculations obj=new MathsCalculations();

        int number1 = 5;
        double number2 = 5.5;
        if(number1>0 && number1<=20)
        System.out.println("factorial of "+number1+" = "+obj.factorial(number1));
        else System.out.println("number1 is out of range");
        System.out.println("square of "+number2+" = "+obj.square(number2));
        System.out.println("cube of "+number2+" = "+obj.cube(number2));
    }
}