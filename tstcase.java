import java.util.*;

class Solution {
    // Function to return a list containing the union of the two arrays
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
        ArrayList<Integer> result = new ArrayList<>();
        
        int i = 0, j = 0;

        // Traverse both arrays using two pointers
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                // Add a[i] if it is smaller and not a duplicate
                if (result.isEmpty() || result.get(result.size() - 1) != a[i]) {
                    result.add(a[i]);
                }
                i++;
            } else if (a[i] > b[j]) {
                // Add b[j] if it is smaller and not a duplicate
                if (result.isEmpty() || result.get(result.size() - 1) != b[j]) {
                    result.add(b[j]);
                }
                j++;
            } else {
                // If both are equal, add only once and move both pointers
                if (result.isEmpty() || result.get(result.size() - 1) != a[i]) {
                    result.add(a[i]);
                }
                i++;
                j++;
            }
        }

        // Add remaining elements of a[] (if any)
        while (i < n) {
            if (result.isEmpty() || result.get(result.size() - 1) != a[i]) {
                result.add(a[i]);
            }
            i++;
        }

        // Add remaining elements of b[] (if any)
        while (j < m) {
            if (result.isEmpty() || result.get(result.size() - 1) != b[j]) {
                result.add(b[j]);
            }
            j++;
        }

        return result;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] a1 = {1, 2, 3, 4, 5};
        int[] b1 = {1, 2, 3, 6, 7};
        System.out.println(findUnion(a1, b1));  // Output: [1, 2, 3, 4, 5, 6, 7]

        // Test case 2
        int[] a2 = {2, 2, 3, 4, 5};
        int[] b2 = {1, 1, 2, 3, 4};
        System.out.println(findUnion(a2, b2));  // Output: [1, 2, 3, 4, 5]

        // Test case 3
        int[] a3 = {1, 1, 1, 1, 1};
        int[] b3 = {2, 2, 2, 2, 2};
        System.out.println(findUnion(a3, b3));  // Output: [1, 2]
    }
}
