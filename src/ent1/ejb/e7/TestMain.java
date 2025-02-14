package ent1.ejb.e7;

import ent1.ejb.e6.MyPoint;

public class TestMain {
    public static void main(String[] args){
// Test constructor
        MyPoint begin = new MyPoint(0,0);
        MyPoint end = new MyPoint(1,1);
        MyLine line = new MyLine(begin, end);
        System.out.println("line is: " + line);

// Test getter and setter
        System.out.println("begin is: " + line.getBegin());
        System.out.println(line.getBeginX());
        System.out.println(line.getBeginY());
        System.out.println("end is: " + line.getEnd());
        System.out.println(line.getEndX());
        System.out.println(line.getEndY());
        line.setBeginX(1);
        line.setBeginY(1);
        System.out.println("newBegin is: " + line.getBegin());
        line.setEndX(2);
        line.setEndY(2);
        System.out.println("newEnd is: " + line.getEnd());
        line.setBeginXY(0,0);
        line.setEndXY(1,1);
        System.out.println(line.getGradient());
        System.out.println(line.getLenght());

    }

}
