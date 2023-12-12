package com.java.comp2013sunhe;

public class AbsSnake {
	
		private static final long serialVersionUID = -3641221053272056036L;


    // TODO: það þarf endurnýjun

    public static int moving;

    public static int move(int x) {
        moving = x;
        return moving;
    }

    public static void stop() {
        moving = 0;
    }
}
