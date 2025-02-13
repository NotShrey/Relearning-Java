
public class tst2 {

    public static int getLongestSubarray(int[] a, long k) {
        int n = a.length; // size of the array.

        int left = 0, right = 0; // 2 pointers
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward thw right pointer:
            right++;
            if (right < n) {
                sum += a[right];
            }
        }

        return maxLen;
    }

    public static int nre(int a[], long k) {
        int n = a.length;
        int l = 0, r = 0;
        long sum = a[0];
        int maxLen = 0;

        while (r < n) {
            while (l <= r && sum > k) {
                sum -= a[l];
                l++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, r - l + 1);
            }

            r++;

            if (r < n) {
                sum += a[r];
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = nre(a, k);
        int len2 = getLongestSubarray(a,k);
        System.out.println("The length of the longest subarray is: " + len);
        System.out.println("The length of the longest subarray is: " + len2);
    }
}
