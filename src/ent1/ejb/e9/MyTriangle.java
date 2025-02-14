package ent1.ejb.e9;

import ent1.ejb.e6.MyPoint;
import ent1.ejb.e7.MyLine;

public class MyTriangle {
    // ZONA DE ATRIBUTOS
    MyPoint v1;
    MyPoint v2;
    MyPoint v3;


    // ZONA DE METODOS
        // Constructor
    public MyTriangle (int x1, int y1, int x2, int y2, int x3, int y3){
        this.v1 = new MyPoint(x1,y1);
        this.v2 = new MyPoint(x2,y2);
        this.v3 = new MyPoint(x3,y3);
    }

    public MyTriangle (MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

        // Getter's y setter's
    public MyPoint getV1() {
        return v1;
    }

    public void setV1(MyPoint v1) {
        this.v1 = v1;
    }

    public MyPoint getV2() {
        return v2;
    }

    public void setV2(MyPoint v2) {
        this.v2 = v2;
    }

    public MyPoint getV3() {
        return v3;
    }

    public void setV3(MyPoint v3) {
        this.v3 = v3;
    }

    public double getPerimeter(){
        MyLine edge1 = new MyLine(v1,v2);
        MyLine edge2 = new MyLine(v2,v3);
        MyLine edge3 = new MyLine(v3,v1);
        return edge1.getLenght() + edge2.getLenght() + edge3.getLenght();
    }

        // Otros
    @Override
    public String toString() {
        return "MyTriangle[v1=" + v1.toString() +
                ",v2=" + v2.toString() +
                ",v3=" + v3.toString() +
                "]";
    }
}
