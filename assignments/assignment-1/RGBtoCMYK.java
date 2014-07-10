public class RGBtoCMYK
{
    public static void main(String[] args)
    {
        int red = Integer.parseInt(args[0]);
        int green = Integer.parseInt(args[1]);
        int blue = Integer.parseInt(args[2]);
        
        if (red==0 && green==0 && blue==0)
        {
            double cyan = 0.0; double magenta = 0.0; 
            double yellow = 0.0; double black = 1.0; 
            System.out.println("cyan    = " + cyan);
            System.out.println("magenta = " + magenta);
            System.out.println("yellow  = " + yellow);
            System.out.println("black   = " + black);
        }
        else
        {
            double white = Math.max(red/255.0, Math.max(green/255.0, blue/255.0));
            double cyan = (white - red/255.0)/white;
            double magenta = (white - green/255.0)/white;
            double yellow = (white - blue/255.0)/white;
            double black = 1.0-white;
            System.out.println("cyan    = " + cyan);
            System.out.println("magenta = " + magenta);
            System.out.println("yellow  = " + yellow);
            System.out.println("black   = " + black);
            
        } 
    }
}
