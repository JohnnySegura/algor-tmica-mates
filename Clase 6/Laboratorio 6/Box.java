package com.miempresa.laboratorio6;

public class Box {
    public static class Point {
        public int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public Point[] coords;

    public Box(int x, int y, int width, int height) {
        coords = new Point[4];

        coords[0] = new Point(x, y);
        coords[1] = new Point(x + width, y);
        coords[2] = new Point(x, y + height);
        coords[3] = new Point(x + width, y + height);
    }

    public static void main(String[] args) {
        Box box = new Box(0, 0, 10, 10);
        for (Point point : box.coords) {
            System.out.println("x: " + point.x + ", y: " + point.y);
        }
    }
}
