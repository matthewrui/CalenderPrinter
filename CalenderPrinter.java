public class CalenderPrinter
{    
    public static void main(String[] args) {
        int x = 1;
        while ( x <=31 )
        {
        System.out.println( "September" + x );
        x++;
        if (x==5||x==6||x==12||x==13||x==19||x==20||x==26||x==27)\
        {
        System.out.println("September" +x+"-Weekend");
        x++;
        }
        else if (x==7)
        {
        System.out.println("September" +x+"-NO SCHOOL (Labor Day)")'
        x++;'
        }
        else if (x==25)
        {
        System.out.println("September" +x+"-END OF THE MARKING PERIOD");
        x++;
        }
        }
    }
}    