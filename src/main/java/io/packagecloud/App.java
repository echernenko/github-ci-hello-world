package io.packagecloud;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        new App().helper();
    }

    private int helper() {
        return 123;
    }
}
