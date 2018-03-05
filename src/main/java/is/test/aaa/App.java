package is.test.aaa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(func(100, new Target()));
    }
    
    
    public static int add(final int x, final int y) {
    		return x + y;
    }
    
    public static int func(final int x, final Target t) {
    		return t.getAdded(x);
    }
}
