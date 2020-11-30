package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Map map = new Map();
        boolean loop = true;
        while(loop) {
            map.printMap();
            Scanner in = new Scanner(System.in);
            int index = in.nextInt();
            map.trav(index);
        }
    }
}
