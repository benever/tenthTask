package task.oop;

import java.util.stream.LongStream;

public class StreamTask {
    public static void main(String[] args) {
        System.out.println(getArithmeticProgressionSum(10000000 ,1000000000));

    }
    public static long getArithmeticProgressionSum(int a, int b){
        return LongStream.range(a, b).parallel().sum();
    }
}
