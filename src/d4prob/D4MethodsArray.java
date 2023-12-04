package d4prob;

public class D4MethodsArray {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6};
        System.out.println(partSum(intArray, 1, 3));
        System.out.println(partSum(intArray, 1));

    }
    //배열의 일정 구간의 숫자의 합을 구하는 메서드를 작성
    //첫번째 메서드
    public static int partSum(int[] arr, int s, int e) {
        int sum = 0;
        for (int i = s; i < e; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //두번째 메서드
    public static int partSum(int[] arr, int s) {
        return partSum(arr, s, arr.length);
    }
}
