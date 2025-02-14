package ent1.ejb.e7;

import ent1.ejb.e6.MyPoint;

public class MyLine {
    // ZONA DE ATRIBUTOS
    private MyPoint begin;
    private MyPoint end;


    // ZONA DE METODOS
        // Constructor
    public MyLine(int x1, int y1, int x2, int y2){
        MyPoint point1 = new MyPoint(x1,y1);
        MyPoint point2 = new MyPoint(x2,y2);
        this.begin = point1;
        this.end = point2;
    }

    public MyLine (MyPoint begin, MyPoint end){
        this.begin = begin;
        this.end = end;
    }

        // Getter's y setter's
    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX(){
        return begin.getX();
    }

    public void setBeginX(int x){
        this.begin = new MyPoint(x, begin.getY());
    }

    public int getBeginY(){
        return begin.getY();
    }

    public void setBeginY(int y){
        this.begin = new MyPoint(begin.getX(),y);
    }

    public int getEndX(){
        return end.getX();
    }

    public void setEndX(int x){
        this.end = new MyPoint(x,end.getY());
    }

    public int getEndY(){
        return end.getY();
    }

    public void setEndY(int y){
        this.end = new MyPoint(end.getX(),y);
    }

    public int[] getBeginXY(){
        return new int[]{begin.getX(), begin.getY()};
    }

    public void setBeginXY(int x, int y){
        this.begin = new MyPoint(x,y);
    }

    public int[] getEndXY(){
        return new int[]{end.getX(), end.getY()};
    }

    public void setEndXY(int x, int y){
        this.end = new MyPoint(x,y);
    }

    public double getGradient(){
        int xInicio = begin.getX();
        int yInicio = begin.getY();
        int xFin = end.getX();
        int yFin = end.getY();
        return Math.atan2(yFin-yInicio, xFin-xInicio);
    }

    public double getLenght(){
        return begin.distance(end);
    }

        // Otros

    @Override
    public String toString() {
        return "MyLine[begin=" + begin.toString() + ",end=" + end.toString() + "]";
    }
}
