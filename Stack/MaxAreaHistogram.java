package DsaOne.Stack;

import java.util.Stack;

public class MaxAreaHistogram {
    static int maxArea(int arr[]) {
        int max = 0;
        int ns[] = nextSmaller(arr);
        int ps[] = previousSmaller(arr);
        for (int i = 0; i < arr.length; i++) {
            int cur = (ns[i] - ps[i] - 1) * arr[i];
            max = Math.max(max, cur);
        }
        return max;
    }

    static int[] nextSmaller(int arr[]) {
        int ns[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();// stores indexes
        s.push(-1);
        for (int i = arr.length - 1; i >= 0; i--) {// 2
            while (s.peek() != -1 && arr[i] <= arr[s.peek()]) {
                s.pop();
            }
            ns[i] = s.peek();
            s.push(i);
        }
        return ns;
    }

    static int[] previousSmaller(int arr[]) {
        int ps[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        for (int i = 0; i< arr.length; i++) {// 2
            while (s.peek() != -1 && arr[i] <= arr[s.peek()]) {
                s.pop();
            }
            ps[i] = s.peek();
            s.push(i);
        }
        return ps;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3, 1 };
        System.out.println(maxArea(arr));
    }
}
