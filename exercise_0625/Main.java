package exercise.exercise_0625;

/*
统计每个月兔子的总数
有一只兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子，
假如兔子都不死，问每个月的兔子总数为多少？
 */
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            System.out.println(getTotalCount(sc.nextInt()));
        }
    }
    public static int getTotalCount(int monthCount){
        if(monthCount < 3){
            return 1;
        }
        return getTotalCount(monthCount-1)+getTotalCount(monthCount-2);
    }
}