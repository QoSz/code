using System;

class TryCatchErrorHandling {
    public static void Main(string[] args)
    {
        Console.WriteLine("Enter first number: ");
        string userInput1 = Console.ReadLine();
        Console.WriteLine("Enter second number: ");
        string userInput2 = Console.ReadLine();

		try
		{
			float num1 = float.Parse(userInput1);
			float num2 = float.Parse(userInput2);
			float result = num1 / num2;
			Console.WriteLine(result);
		}
		catch (DivideByZeroException) {
			Console.WriteLine("Number cannot be divided by zero.");
		}
		catch (FormatException)
		{
			Console.WriteLine("Format Exception. Please enter a number next time.");
		}
		catch (OverflowException)
		{
			Console.WriteLine("Overflow Exception. The number you have entered is too large, try entering a smaller number.");
		}
		catch (ArgumentNullException)
		{
			Console.WriteLine("ArgumentNullException. There was no number entered. Enter an integer value next time.");
		}
		finally
		{
			Console.WriteLine("Program Exiting....");
		}
    }
}