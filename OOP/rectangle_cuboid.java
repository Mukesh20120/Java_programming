class rect {
    private int length;
    private int breadth;

    public rect() {
        length = breadth = 1;
    }

    public rect(int l, int b) {
        length = l;
        breadth = b;
    }

    public int area() {
        return length * breadth;
    }
}

class cuboid extends rect {
    private int height;

    public cuboid() {
        height = 1;
    }

    public cuboid(int h) {
        height = h;
    }

    public cuboid(int l, int b) {
        super(l, b);
        height = 1; // if we not set the height then the area can't calculate and it's area =0
    }

    public cuboid(int l, int b, int h) {
        super(l, b);
        height = h;
    }

    public int cuboid_area() {
        return area() * height;
    }
}

public class rectangle_cuboid {
    public static void main(String args[]) {
        // case 1 when we call without giving any value in constructor
        // it call for deafult constructor of the cuboid but before calling it. first
        // call
        // for rectangle deafult constructor it lenght and breadth value become 1
        // and then it call for the cuboid constructor and its height 1
        // then the area is 1*1*1=1;
        cuboid c1 = new cuboid();
        System.out.println(c1.cuboid_area());

        // case 2 we are giving the value in constructor same as previous it will call
        // it parents constructor first and then the cuboid constructor
        // so deafult constructor of parent is lenght and breadth become 1
        // it come to child constructor cuboid and set it height to 10
        // area will become 1*1*10;
        cuboid c2 = new cuboid(10);
        System.out.println(c2.cuboid_area());

        // case 3 we make method overload for the constructor
        // we gave 3 value length breadth and height
        // we call super(lenght, breadth) it will call parents constructor by passing
        // //////these value and it parents retangle length and breadth beocome 5 and 4
        // then height set
        // and calculate the area 5*4*10
        cuboid c3 = new cuboid(10, 5, 4);
        System.out.println(c3.cuboid_area());

        // call only parents constructor by passing value in its children we use
        // super(length and breadth )
        cuboid c4 = new cuboid(5, 4);
        System.out.println(c4.cuboid_area());

    }
}
