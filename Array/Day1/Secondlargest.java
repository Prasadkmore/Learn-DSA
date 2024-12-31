class Solution {
  public:
    // Function returns the second
    // largest elements
    int getSecondLargest(vector<int> &arr) {
        // Code Here
            if (arr == null || arr.size() < 2) {
            return -1; // No second largest element exists
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                // Update second largest and largest
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                // Update second largest if it's less than largest and greater than current second largest
                secondLargest = num;
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        List<Integer> arr1 = new ArrayList<>();
        arr1.add(10);
        arr1.add(5);
        arr1.add(20);
        arr1.add(20);
        arr1.add(15);
        System.out.println(solution.getSecondLargest(arr1)); // Output: 15

        List<Integer> arr2 = new ArrayList<>();
        arr2.add(10); // Single element
        System.out.println(solution.getSecondLargest(arr2)); // Output: -1

        List<Integer> arr3 = new ArrayList<>();
        arr3.add(10);
        arr3.add(10);
        arr3.add(10); // All elements are equal
        System.out.println(solution.getSecondLargest(arr3)); // Output: -1
    }
};