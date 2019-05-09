package com.alex;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean isCatPlaying(boolean summer, int temperature)
    {
     if (temperature < 25 || summer && temperature > 45 || summer == false && temperature > 35)   return false;

     return true;

    }
}
