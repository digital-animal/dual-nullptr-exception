package com.zahid;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        try {
            ThrowDemo.demoproc();
        } catch (NullPointerException e) {
            System.out.println("recaught inside main. message: " + e.toString());
        }
    }
}
