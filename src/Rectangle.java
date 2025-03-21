public class Rectangle {
    private Point topleft;
    private int sideA,sideB;

    public Rectangle(Point topleft, int sideA, int sideB) {
        this.topleft = topleft;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(Point topleft, int sideA) {
        this.topleft = topleft;
        this.sideA = sideA;
        this.sideB=sideA;
    }

    public Point getTopleft() {
        return topleft;
    }

    public void setTopleft(Point topleft) {
        this.topleft = topleft;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if(sideA<0){
        this.sideA = sideA;
        System.out.println("Cant be negative");}
        else{this.sideA=sideA;}
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if(sideB<0){
            this.sideB=0;
            System.out.println("Cant be negative");
        }else{
            this.sideB=sideB;
        }
    }
    public int perimeter(){
        return (2*this.sideA)+(2*this.sideB);
    }
    public int area(){
        return this.sideA*this.sideB;
    }
}
