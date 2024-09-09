public class Multiples
{
    public static void main(String[] args)
    {
        int multiples_of_3_or_5 = 0;
        for (int i = 1; i < 1000; i++)
        {
            if (i % 3 == 0 || i % 5 == 0)
            {
                multiples_of_3_or_5++;
            }
        }
        System.out.println(multiples_of_3_or_5);
    }
}
