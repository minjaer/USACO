import java.util.*;

public class Milk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstBucketCapacity = in.nextInt();
        int firstAmount = in.nextInt();
        int secondBucketCapacity = in.nextInt();
        int secondAmount = in.nextInt();
        int thirdBucketCapacity = in.nextInt();
        int thirdAmount = in.nextInt();
    }

    public static int pourOneToTwo(int amount1, int capacity2, int amount2)
    {
        if (capacity2 - amount2 >= amount1)
        {(
            amount2 += amount1;
            amount1 = 0;
        }
        else
        {
            amount1 -= (capacity2 - amount2);
            amount2 = capacity2;
        }
        return amount2;
    }
}
