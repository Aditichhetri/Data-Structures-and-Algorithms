package DsaOne.Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    static void nge(int arr[], int n, int ans[]) {
        Stack<Integer> s = new Stack<>();
        // int top=-1;
        for (int i = n - 1; i >= 0; i--) {
            if (s.isEmpty())
                ans[i] = -1;

            else if ((s.size() > 0) && arr[i] < s.peek()) {
                ans[i] = s.peek();

            } else if ((s.size() > 0) && s.peek() <= arr[i]) {
                while (s.size() > 0 && s.peek() <= arr[i])
                    s.pop();
                if (s.size() == 0) {
                    ans[i] = -1;
                } else
                    ans[i] = s.peek();

            }
            s.push(arr[i]);

        }
    }

    static void printArray(int ans[]) {
        System.out.print(Arrays.toString(ans));
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 4 };
        int n = arr.length;
        int ans[] = new int[n];
        nge(arr, n, ans);
        printArray(ans);

    }

}
