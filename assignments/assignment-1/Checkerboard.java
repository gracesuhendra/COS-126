public class Checkerboard
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        for (int i=1; i<=N; i++)
        {
            if (i%2 == 1)
            {
                for (int j=1; j<=N; j++)
                    System.out.print("* ");
            }
            else
            {
                for (int j=1; j<=N; j++)
                    System.out.print(" *");
            }
            System.out.println();
        }
    }
}
