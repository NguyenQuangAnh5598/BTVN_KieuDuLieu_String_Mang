import java.util.ArrayList;
import java.util.List;

public class FindMaxSum {
    public static void main(String[] args) {
        int[] a = {6, 7, 2, 9, 4, 6, 9, 1, 4, 2};
        getList(a);
    }

    public static void getList(int[] numbers) {
        int max = numbers[0];
        int sum = Integer.MIN_VALUE;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list2.add(numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                list2.add(numbers[i]);
            } else if (numbers[i] < max) {
                max = numbers[i];
                if (sum < getSum(list2)) {
                    sum = getSum(list2);
                    list1.clear();
                    list1.addAll(list2);

                }
                list2.clear();
                list2.add(max);
            }
        }
        if (getSum(list1) > getSum(list2)) {
            for (Integer integer : list1) {
                System.out.println(integer);
            }
        } else {
            for (Integer integer : list2) {
                System.out.println(integer);
            }
        }
    }

    public static int getSum(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }
}
