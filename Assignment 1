public class RandomWalker
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        int x=0; int y=0; 
        
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
            System.out.println("("+x+", "+y+")");
        }
        int squared_distance = x*x + y*y; 
        System.out.println("Squared distance = "+squared_distance);
    }
}
