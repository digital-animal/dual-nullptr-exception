package com.zahid;

public class ThrowDemo {
    public static void demoproc() {
        try {
            throw new NullPointerException("throwing NullPointerException inside demoproc");
        } catch (NullPointerException e) {
            System.out.println("caught inside demo proc. message: " + e.toString());
            throw e;
        }
    }
}
