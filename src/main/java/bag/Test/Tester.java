package bag.Test;

public class Tester {
    public static void main(String[] args) {
        Box[] boxes = {new Box1(),new Box2(),new Box3(),new Box4(),new Box5(),new Box6()};
        int length=10;
        int width=14;
        int height=8;
        for(Box box : boxes){
            if(box.validate(length,width,height)){
                System.out.println(box.name + "it is "+ box.price);
                break;
            }
        }
    }
}
