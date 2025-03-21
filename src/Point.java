public class Point {
    public static void main(String[] args) {
        Main p1=new Main();
        System.out.println(p1.xCoord);
        System.out.println(p1.yCoord);

        Main p2=new Main(x:3,y:4);
        System.out.println(p2.xCoord);
        System.out.println(p2.yCoord);

        Main p3=new Main(x:5);
        System.out.println(p3.xCoord);
        System.out.println(p3.yCoord);

        Rectangle r1=new Rectangle(new Point(x:3),sideA:4,sideB:5);
        System.out.println(r1.getSideA());
        System.out.println(r1.getSideB());
        System.out.println(r1.getTopleft().xCoord);
        System.out.println(r1.getTopleft().yCoord);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
    }
}
