package bag.Test;

public class Box {
    int length;
    int width;
    int height;
    int price;
    String name;

    public boolean validate(int a ,int b,int c){
        if(a<= length && b <= width && c <= height){
            return true;
        }else return false;
    }
}
