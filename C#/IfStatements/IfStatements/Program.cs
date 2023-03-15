class IfStatements { 
    public static void Main(string[] args)
    {

        try {
            Console.WriteLine("What is the temperature today? ");
            int temp = int.Parse(Console.ReadLine());

            if (temp < 10)
            {
                Console.WriteLine("Wear a court");
            }
            else if (temp == 10)
            {
                Console.WriteLine("Wear warm t-shirt and trousers");
            }
            else if (temp > 10)
            {
                Console.WriteLine("Wear shorts");
            }
            else
            {
                Console.WriteLine("Wear Anything!");
            }

        } catch (FormatException) {
            Console.WriteLine("FormatException. Please enter an integer next time.");
        }

    }
}
