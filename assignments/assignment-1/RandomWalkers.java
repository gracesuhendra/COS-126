public class RandomWalkers
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        int T = Integer.parseInt(args[1]);
        double sum = 0.0;
        for (int t=1; t<=T; t++)
        {
            double x=0; double y=0; 
            for (int n=1; n<=N; n++)
            {
                double r = Math.random();
                if (r<0.25)
                    x = x+1;
                else if (r<0.5)
                    x = x-1;
                else if (r<0.75)
                    y = y+1;
                else
                    y = y-1;              
            }
        double squared_distance = x*x + y*y; 
        sum = sum + squared_distance;
        }
        double mean_squared_distance = sum/T;
        System.out.println("mean quared distance = "+mean_squared_distance);
    }   
}
