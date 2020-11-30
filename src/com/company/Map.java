package com.company;
import java.util.*;
//The lifes work of Wilhelm Von Schaffgotsch King of Prussia, Sir Leo of the Italics, as well as duMb DuMB iDIoT

public class Map {
Node head;
Node currPos;
int distance = 0;
    Node a = new Node("A");
    Node b = new Node("B");
    Node d = new Node("D");
    Node c = new Node("C");
    Node e = new Node("E");
    Node f = new Node("F");
    Map(){
        ArrayList<Node> nexta = new ArrayList<Node>();
        ArrayList<Node> nextb = new ArrayList<Node>();
        ArrayList<Node> nextc = new ArrayList<Node>();
        ArrayList<Node> nextd = new ArrayList<Node>();
        ArrayList<Node> nexte = new ArrayList<Node>();
        ArrayList<Node> nextf = new ArrayList<Node>();
        nexta.add(f);
        nexta.add(c);
        nexta.add(b);
        nexta.add(d);
        ArrayList<Integer> disa = new ArrayList<Integer>();
        ArrayList<Integer> disb = new ArrayList<Integer>();
        ArrayList<Integer> disc = new ArrayList<Integer>();
        ArrayList<Integer> disd = new ArrayList<Integer>();
        ArrayList<Integer> dise = new ArrayList<Integer>();
        ArrayList<Integer> disf = new ArrayList<Integer>();
        disa.add(2);
        disa.add(5);
        disa.add(8);
        disa.add(3);
        a.construct(nexta, disa);//node a :(
        nextb.add(a);
        nextb.add(e);
        disb.add(8);
        disb.add(3);
        b.construct(nextb,disb);//node b
        nextc.add(f);
        nextc.add(a);
        nextc.add(e);
        disc.add(4);
        disc.add(5);
        disc.add(1);
        c.construct(nextc, disc);//node c
//I hate this.
        nextd.add(a);
        disd.add(3);
        d.construct(nextd, disd);//node D
        nexte.add(c);
        nexte.add(b);
        dise.add(1);
        dise.add(3);
        e.construct(nexte, dise);//node e
        nextf.add(a);
        nextf.add(c);
        disf.add(2);
        disf.add(4);
        f.construct(nextf, disf);//node f AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAh
        head = a;
        currPos = a;
    }//do not open (is big)
    void printMap(){
        currPos.currPos();
    }

    void trav(int index){
        if(index > currPos.getDis().size() -1|| index < 0){
            System.out.println("TOOOOOOO BEEG or too smol");
        }
        else{
            distance += currPos.getDis().get(index);
            currPos = currPos.getNext().get(index);
            System.out.println("Distance Traveled " + distance);
        }
    }

    void test(){
        ArrayList<Node> next = a.getNext();
        next.get(2);
    }

    class Node{
        ArrayList<Node> next;
        ArrayList<Integer> size;
        String name = "";
            Node(String x) {
                name = x;
            }
        String getName(){
            return name;
        }
        ArrayList<Node> getNext(){
                return next;
        }
        ArrayList<Integer> getDis(){
            return size;
        }

        void construct(ArrayList<Node> sad, ArrayList<Integer> endMii){
                next = sad;
                size = endMii;
        }

        void currPos(){
            ArrayList<Node> next = currPos.getNext();
            ArrayList<Integer> dis = currPos.getDis();
            System.out.println("Please choose one(Use Int)");
            System.out.println("Current Position: "+ name);
            for(int x = 0; x < next.size(); x++){
                System.out.println(x+ ") " + next.get(x).getName() + ": "+ dis.get(x));
            }
        }

    }
}













































































































































































































































































































//https://youtu.be/dQw4w9WgXcQ





























































































































































































































































































































































































































































































































































































/*
____
|  |
|  |
|  |
|  |
|  |________
|___________|
 */