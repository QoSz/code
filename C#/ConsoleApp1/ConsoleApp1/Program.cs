using System;

namespace ConsoleApp1
{
    class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Result of addiiton is {0}", addition());
            Console.WriteLine();
            Console.WriteLine("Result of division is {0}", division());
            Console.Read();
        }

        public static int addition() {
            Console.WriteLine("Enter first number for addition: ");
            int num1 = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter second number: ");
            int num2 = int.Parse(Console.ReadLine());
            return num1 + num2;
        }

        public static float division() {
            Console.WriteLine("Enter first number for division");
            float num1 = float.Parse(Console.ReadLine());
            Console.WriteLine("Enter second number for division");
            float num2 = float.Parse(Console.ReadLine());
            return num1 / num2;
        }



    }
}
