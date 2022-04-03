package ch.hslu.oop.sw06;

public class TestedClass {


    public int getMaximum(int x, int y, int z){
        int a = getMaximum(x, y);
        return getMaximum(a, z);
        }

    public int getMaximum(int x, int y){
        if(x > y){
            return x;
        }
        else{
            return y;
        }
    }
    
}
