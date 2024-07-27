from streamlit import *

title('Problem Solving - VI')

markdown(
'''
### 1. Diamond of numbers
##### Problem Statement: 
Students at Ninja School were bored with their
daily routine and wanted to try something new. So, they thought
about observing patterns. While observing the patterns, they found a
very interesting pattern which they wished to explore. Your task is to
help the students to visualize the pattern for any given ‘N’.
Given an integer ‘N’ you need to return the corresponding pattern for
it.
```
For example, pattern for N = 15 will be:
        1
       123
      12345
     1234567
    123456789
   12345678912
  1234567891234
 123456789123456
  1234567891234
   12345678912
    123456789
     1234567
      12345
       123
        1
``` 

### Analysis:
- The pattern is a diamond of numbers.
- The pattern is symmetric about the middle row.

### Code:
```java
package com.hands_onn;

import java.util.Scanner;

public class DiamondOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= 2*n; i+=2) {
            for (int j = 1; j <= 2*n-i; j++) {
                System.out.print(" ");
            }
            int k = 1;
            for (int j = 1; j <= i; j++) {
                if (k >= 10)
                    k=1;
                System.out.print(k+ " ");
                k++;
            }
            System.out.println();
        }
        for (int i = 2*n-2; i >= 0; i-=2) {
            for (int j = 1; j <= 2*n-i+1; j++) {
                System.out.print(" ");
            }
            int k = 1;
            for (int j = 1; j < i; j++) {
                if (k >= 10)
                    k=1;
                System.out.print(k+ " ");
                k++;
            }
            System.out.println();
        }
    }
}
```

### Code With ArrayList:
```java
package com.hands_onn;

import java.util.*;

public class DiamondOfNumbersWithArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<>();
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= 2*n; i+=2) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 1; j <= 2*n-i; j++) {
                stringBuilder.append(" ");
            }
            int k = 1;
            for (int j = 1; j <= i; j++) {
                if (k >= 10)
                    k=1;
                stringBuilder.append(k+ " ");
                k++;
            }
            str.add(stringBuilder.toString());
        }
        for (int i = 2*n-2; i >= 0; i-=2) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 1; j <= 2*n-i+1; j++) {
                stringBuilder.append(" ");
            }
            int k = 1;
            for (int j = 1; j < i; j++) {
                if (k >= 10)
                    k=1;
                stringBuilder.append(k+ " ");
                k++;
            }
            str.add(stringBuilder.toString());
        }

        for (String c: str){
            System.out.println(c);
        }
    }
}
```

### Output:
```
Enter the number : 
6
           1 
         1 2 3 
       1 2 3 4 5 
     1 2 3 4 5 6 7 
   1 2 3 4 5 6 7 8 9 
 1 2 3 4 5 6 7 8 9 1 2 
   1 2 3 4 5 6 7 8 9 
     1 2 3 4 5 6 7 
       1 2 3 4 5 
         1 2 3 
           1 
             
```
'''
)

markdown('---')

markdown(
"""
### 2. Subarray Sum Equals K
##### Problem Statement: 
Given an array of integers nums and an integer
k, return the total number of subarrays whose sum equals to k.
A subarray is a contiguous non-empty sequence of elements within an
array.

### Analysis:
- We can solve this problem using the prefix sum technique.
- We will calculate the prefix sum of the array.
- We will store the prefix sum in a hashmap.
- We will iterate through the array and check if the sum of the subarray equals k.
- If it does, we will increment the count of subarrays.

### Code:
```java
package com.hands_onn;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k : ");
        int k = sc.nextInt();
        System.out.println("The total number of subarrays whose sum equals to k are : " + subarraySum(nums, k));
    }

    private static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0, sum = 0;
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
```

### Output:
```
Enter the size of the array :  3
Enter the elements of the array :  1 1 1
Enter the value of k :  2
The total number of subarrays whose sum equals to k are : 2
```
"""
)

markdown('---')

markdown(
"""
### 3. Longest Subarray With Sum K.
##### Problem Statement: 
Alex and his friend are playing a game of
subarrays. They have an array ‘NUMS’ of length ‘N’. Alex’s friend gives
him an arbitrary integer ‘K’ and asks him to find the length of the
longest subarray in which the sum of elements is equal to ‘K’.
Alex asks for your help to win this game. Find the length of the longest
subarray in which the sum of elements is equal to ‘K’.
If there is no subarray whose sum is ‘K’ then you should return 0.

### Analysis:
- We can solve this problem using the prefix sum technique.
- We will calculate the prefix sum of the array.
- We will store the prefix sum in a hashmap.
- We will iterate through the array and check if the sum of the subarray equals k.
- If it does, we will update the length of the longest subarray.

### Code:
```java
package com.hands_onn;

import java.util.HashMap;
import java.util.Map;
imporrt java.util.Scanner;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k : ");
        int k = sc.nextInt();
        System.out.println("The length of the longest subarray whose sum equals to k is : " + longestSubarrayWithSumK(nums, k));
    }

    private static int longestSubarrayWithSumK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                max = Math.max(max, i - map.get(sum - k));
            }
            map.putIfAbsent(sum, i);
        }
        return max;
    }
}
```

### Output:
```
Enter the size of the array : 
5
Enter the elements of the array : 
1 2 3 4 5
Enter the value of k : 
10
The length of the longest subarray whose sum equals to k is : 4
```
"""
)

markdown('---')

markdown(
"""
### 4. Top K Frequent Elements
##### Problem Statement: 
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

### Analysis:
- We can solve this problem using the priority queue.
- We will create a hashmap to store the frequency of each element.
- We will create a priority queue to store the elements based on their frequency.
- We will iterate through the hashmap and add the elements to the priority queue.
- We will remove the elements from the priority queue until the size of the priority queue is equal to k.
- We will return the elements from the priority queue.

### Code:
```java
package com.hands_onn;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k : ");
        int k = sc.nextInt();
        System.out.println("The k most frequent elements are : " + Arrays.toString(topKFrequent(nums, k)));
    }

    private static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll();
        }
        return res;
    }
}
```

### Output:
```
Enter the size of the array : 
7
Enter the elements of the array : 
1 1 2 2 3 1 2
Enter the value of k : 
2
The k most frequent elements are : [1, 2]
```
"""
)

markdown('---')

markdown(
"""
### 5. K Largest Element
##### Problem Statement: 
You are given an unsorted array containing ‘N’
integers. You need to find ‘K’ largest elements from the given array.
Also, you need to return the elements in non-decreasing order.

### Analysis:
- We can solve this problem using the priority queue.
- We will create a priority queue to store the elements.
- We will iterate through the array and add the elements to the priority queue.
- We will remove the elements from the priority queue until the size of the priority queue is equal to k.
- We will return the elements from the priority queue.

### Code:
```java
package com.hands_onn;

import java.util.*;

public class KLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k : ");
        int k = sc.nextInt();
        System.out.println("The k largest elements are : " + Arrays.toString(kLargestElement(nums, k)));
    }

    private static int[] kLargestElement(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            res[i] = pq.poll();
        }
        return res;
    }
}
```

### Output:
```
Enter the size of the array : 
6
Enter the elements of the array : 
1 4 3 6 2 3
Enter the value of k : 
4
The k largest elements are : [6, 4, 3, 3]
```
"""
)

markdown('---')

markdown(
"""
### 6. Count All Subarrays With Given Sum
##### Problem Statement: 
You are given an integer array 'arr' of size 'N'
and an integer 'K'.

Your task is to find the total number of subarrays of the given array
whose sum of elements is equal to k.
A subarray is defined as a contiguous block of elements in the array.

### Analysis:
- We can solve this problem using the prefix sum technique.
- We will calculate the prefix sum of the array.
- We will store the prefix sum in a hashmap.
- We will iterate through the array and check if the sum of the subarray equals k.
- If it does, we will increment the count of subarrays.

### Code:
```java
package com.hands_onn;

import java.util.*;

public class CountAllSubarraysWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k : ");
        int k = sc.nextInt();
        System.out.println("The total number of subarrays whose sum equals to k are : " + countAllSubarraysWithGivenSum(nums, k));
    }

    private static int countAllSubarraysWithGivenSum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0, sum = 0;
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
```

### Output:
```
Enter the size of the array :
5
Enter the elements of the array :
1 2 3 4 5
Enter the value of k :
5
The total number of subarrays whose sum equals to k are : 2
```
"""
)

markdown('---')

markdown(
"""
### 7. Find Four Elements That Sums To A Given Value
##### Problem Statement: 
You are given an array/list 'ARR' of ‘N’ integers
and an integer value ‘TARGET’. You need to check whether there exist
four numbers (ARR[i], ARR[j], ARR[k], ARR[l]) such that (0 <= i < j <
k < l < N) and ARR[i] + ARR[j] + ARR[k] + ARR[l] = 'TARGET'.

> **Note:**
> 1. All four numbers should exist at different indices in the given array.
> 2. The answer is case-sensitive.

### Analysis:
- We can solve this problem using the two-pointer technique.
- We will sort the array.
- We will iterate through the array and fix the first element.
- We will iterate through the array and fix the second element.
- We will use the two-pointer technique to find the remaining two elements.
- If the sum of the four elements is equal to the target, we will return true.
- If the sum of the four elements is less than the target, we will increment the left pointer.
- If the sum of the four elements is greater than the target, we will decrement the right pointer.

### Code:
```java
package com.hands_onn;

import java.util.*;

public class FindFourElementsThatSumsToAGivenValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the value of target : ");
        int target = sc.nextInt();
        System.out.println(findFourElementsThatSumsToAGivenValue(nums, target));
    }

    private static boolean findFourElementsThatSumsToAGivenValue(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int left = j + 1, right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        return true;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return false;
    }
}
```

### Output:
```
Enter the size of the array : 
5
Enter the elements of the array : 
1 3 3 2 10
Enter the value of target : 
9
true
```
"""
)

markdown('---')

markdown(
"""
### 8. Number of Distinct Islands
Problem Statement: You are given an m x n binary matrix grid. An
island is a group of 1's (representing land) connected 4-directionally
(horizontal or vertical.) You may assume all four edges of the grid are
surrounded by water.
An island is considered to be the same as another if and only if one
island can be translated (and not rotated or reflected) to equal the
other.
Return the number of distinct islands

### Analysis:
- We can solve this problem using the depth-first search technique.
- We will iterate through the grid and find the islands.
- We will mark the visited islands as 0.
- We will store the path of the islands in a set.
- We will return the size of the set.

### Code:
```java
package com.hands_onn;

import java.util.*;

public class NumberOfDistinctIslands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int n = sc.nextInt();
        int[][] grid = new int[m][n];
        System.out.println("Enter the elements of the grid : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.println("The number of distinct islands are : " + numberOfDistinctIslands(grid));
    }

    private static int numberOfDistinctIslands(int[][] grid) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    StringBuilder sb = new StringBuilder();
                    dfs(grid, i, j, sb, "o");
                    set.add(sb.toString());
                }
            }
        }
        return set.size();
    }

    private static void dfs(int[][] grid, int i, int j, StringBuilder sb, String dir) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return;
        }
        grid[i][j] = 0;
        sb.append(dir);
        dfs(grid, i + 1, j, sb, "d");
        dfs(grid, i - 1, j, sb, "u");
        dfs(grid, i, j + 1, sb, "r");
        dfs(grid, i, j - 1, sb, "l");
        sb.append("b");

    }
}
```

### Output:
```
Enter the number of rows : 
4
Enter the number of columns : 
5
Enter the elements of the grid : 
1 1 0 1 1
1 0 0 0 0
0 0 0 0 1
1 1 0 1 1
The number of distinct islands are : 3
```
"""
)

markdown('---')

markdown(
"""
### 9. Valid Sudoku
Problem Statement: Determine if a 9 x 9 Sudoku board is valid. Only
the filled cells need to be validated according to the following rules:
Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-
9 without repetition.
>**Note:**
>A Sudoku board (partially filled) could be valid but is not necessarily
>solvable.
>
>Only the filled cells need to be validated according to the mentioned
>rules.

### Analysis:
- We can solve this problem using the hash set.
- We will iterate through the board and check if the row, column, and sub-boxes are valid.
- We will store the elements in the hash set.
- If the element is already present in the hash set, we will return false.
- If the element is not present in the hash set, we will add it to the hash set.
- If all the rows, columns, and sub-boxes are valid, we will return true.

### Code:
```java
package com.hands_onn;

import java.util.*;

public class ValidSudoku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[9][9];
        System.out.println("Enter the elements of the board : ");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = sc.next().charAt(0);
            }
        }
        System.out.println("The board is valid : " + isValidSudoku(board));
    }

    private static boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if (num != '.') {
                    if (!set.add(num + " in row " + i) || !set.add(num + " in column " + j) || !set.add(num + " in sub-box " + i / 3 + "-" + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
```

### Output
```
Enter the elements of the board : 
5 3 . . 7 . . . .
6 . . 1 9 5 . . .
. 9 8 . . . . 6 .
8 . . . 6 . . . 3
4 . . 8 . 3 . . 1
7 . . . 2 . . . 6
. 6 . . . . 2 8 .
. . . 4 1 9 . . 5
. . . . 8 . . 7 8
The board is valid : true
```
"""
)

markdown('---')

markdown(
"""
### 10.  Insert Delete Get Random O(1)
Problem Statement: Implement the RandomizedSet class:
- RandomizedSet() Initializes the RandomizedSet object.
- bool insert(int val) Inserts an item val into the set if not present. Returns true if the item was not present, false otherwise.
- bool remove(int val) Removes an item val from the set if present.
- Returns true if the item was present, false otherwise.
- int getRandom() Returns a random element from the current set
of elements (it's guaranteed that at least one element exists
when this method is called). Each element must have the same
probability of being returned.You must implement the functions
of the class such that each function works in average O(1) time
complexity

### Code
```java
package com.hands_onn;

import java.util.*;

class RandomizedSet {
    Set<Integer> vals = new HashSet<>();
    private Random rand = new Random();


    public boolean insert(int val) {
        return vals.add(val);
    }

    public boolean remove(int val) {
        return vals.remove(val);
    }

    public Object getRandom() {
        final int index = rand.nextInt(vals.size());
        Object[] value = vals.toArray();
        return value[index];
    }


}

public class InsertDeleteGetRandom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> valToIndex = new ArrayList<>();
        ArrayList<String> vals = new ArrayList<>();
        System.out.println("Enter the size of the list: ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            String key = sc.next();
            vals.add(key);
        }

        for (int i = 0; i < size; i++){
            int val = sc.nextInt();
            valToIndex.add(val);
        }
        RandomizedSet obj = new RandomizedSet();
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < vals.size(); i++) {
            switch (vals.get(i)){
                case "object":
                    ans.add(null);
                    break;

                case "insert":
                    if (obj.insert(valToIndex.get(i)))
                        ans.add("true");
                    else
                        ans.add("false");
                    break;
                case "remove":
                    if (obj.remove(valToIndex.get(i)))
                        ans.add("true");
                    else
                        ans.add("false");
                    break;
                case "getrandom":
                    ans.add(obj.getRandom().toString());
                    break;
                default:
                    ans.add("invalid input");

            }
        }
        System.out.println("Final Output: "+ans);
    }
}
```

### Output
```
Enter the size of the list:
5
object insert remove getrandom insert
-1 2 3 -1 5
Final Output: [null, true, false, 2, true]
```
"""
)

markdown('---')

markdown(
"""
### 11. Find Duplicates Using Bit Array
Problem Statement: You are given an array/list ‘ARR’ of N elements
where N <= 32000. ‘ARR’ can have duplicate entries. Your task is to
find duplicate elements, provided you can use a maximum of 4
KiloBytes of extra memory.

### Analysis:
- We can solve this problem using the bit array technique.
- We will iterate through the array and check if the element is present in the bit array.
- If the element is present, we will add it to the output array.
- If the element is not present, we will add it to the bit array.
- We will return the output array.

### Code:
```java
package com.hands_onn;

import java.util.*;

public class FindDuplicatesUsingBitArray {

    public static ArrayList<Integer> findDup(ArrayList<Integer> arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (ans.contains(arr.get(i))) {
                ans.remove(arr.get(i));
            } else {
                ans.add(arr.get(i));
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            arr.remove(ans.get(i));
        }
        Set<Integer> set = new HashSet<>(arr);
        ArrayList<Integer> op = new ArrayList<>(set);
        Collections.sort(op);
        return op;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=0; i< n; i++){
            arr.add(sc.nextInt());
        }
        System.out.println(findDup(arr));

    }
}
```

### Output:
```
Enter the size of array: 
7
1 1 2 2 3 3 5
[1, 2, 3]
```
"""
)

markdown('---')

markdown(
"""
### 12. Circular Permutation In Binary Representation
Problem Statement: You are given the two integers 'N' and 'X'. Your
task is to find an array 'P' such that:
```
'P' is a permutation of (0, 1, 2, ..., 2 ^ (N - 1)).
```
The first element of the array 'P' is 'X', i.e., P[0] = X.
Adjacent elements of 'P' (i.e., P[i] and P[i + 1]) differ by only 1 bit in
their binary representation.

The first and the last element (i.e., P[0] and P[2^N -1]) are also
considered as adjacent elements.

> Note:
> For N = 2, [0,1,2,3], [0,2,3,1], [1,2,3,0] are some of the valid
permutations but [0,0,1,2], [1,2,3,4], [1,1,1,3] are not.
It is guaranteed that an array 'P' always exits with the given
requirements.

### Analysis:
- We can solve this problem using the gray code technique.
- We will iterate through the array and find the gray code.
- We will return the gray code.

### Code:
```java
package com.hands_onn;

import java.util.*;

public class CircularPermutationInBinaryRepresentation {
    public static List<Integer> circularPermutation(int n, int start) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < 1 << n; i++) {
            res.add(start ^ i ^ i >> 1);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of start: ");
        int start = sc.nextInt();
        System.out.println(circularPermutation(n, start));
    }
}
```

### Output:
```
Enter the value of n: 
4
Enter the value of start: 
1
[1, 0, 2, 3, 7, 6, 4, 5, 13, 12, 14, 15, 11, 10, 8, 9]
```
"""
)

markdown('---')

markdown(
"""
### 13. Best Time to Buy and Sell Stock II
##### Problem Statement: 
You are given an integer array prices where
prices[i] is the price of a given stock on the ith day.
On each day, you may decide to buy and/or sell the stock. You can
only hold at most one share of the stock at any time. However, you
can buy it then immediately sell it on the same day.
Find and return the maximum profit you can achieve.

### Analysis:
- We can solve this problem using the greedy approach.
- We will iterate through the array and check if the current element is greater than the previous element.
- If it is, we will add the difference to the profit.

### Code:
```java
package com.hands_onn;

import java.util.Scanner;

public class BestTimeToBuyAndSellStockII {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements o array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println( maxProfit(arr));
    }
}

```

### Output:
```
Enter the array size: 
6
Enter the elements o array: 
7 1 5 3 6 4
7
```
"""
)

markdown('---')

markdown(
"""
### 14. Process Tasks Using Servers
##### Problem Statement: 
You are given two 0-indexed integer arrays 
servers and tasks of lengths n and m respectively. servers[i] is the 
weight of the ith server, and tasks[j] is the time needed to process the 
jth task in seconds.Tasks are assigned to the servers using a task 
queue. Initially, all servers are free, and the queue is empty.At second 
j, the jth task is inserted into the queue (starting with the 0th task 
being inserted at second 0). As long as there are free servers and the 
queue is not empty, the task in the front of the queue will be assigned 
to a free server with the smallest weight, and in case of a tie, it is 
assigned to a free server with the smallest index.
If there are no free servers and the queue is not empty, we wait until 
a server becomes free and immediately assign the next task. If 
multiple servers become free at the same time, then multiple tasks 
from the queue will be assigned in order of insertion following the 
weight and index priorities above.A server that is assigned task j at 
second t will be free again at second t + tasks[j].Build an array ans of 
length m, where ans[j] is the index of the server the jth task will be 
assigned to.Return the array ans.

### Analysis:
- We can solve this problem using the priority queue.
- We will create a priority queue for available servers (sorted by weight and index).
- We will create a priority queue for tasks in processing (sorted by free time, weight, and index).
- We will initialize available servers with weights and indices.
- We will process tasks and assign them to available servers.
- If no available servers are present, we will wait for the next free server.


### Code:
```java
package com.hands_onn;

import java.util.*;


public class ProcessTasksUsingServers {
    public static int[] assignTasks(int[] servers, int[] tasks) {
        int n = servers.length;
        int m = tasks.length;
        int[] ans = new int[m];

        // Create a priority queue for available servers (sorted by weight and index)
        PriorityQueue<int[]> availableServers = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });

        // Create a priority queue for tasks in processing (sorted by free time, weight, and index)
        PriorityQueue<int[]> processingTasks = new PriorityQueue<>((a, b) -> {
            if (a[2] != b[2]) return a[2] - b[2];
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });

        // Initialize available servers with weights and indices
        for (int i = 0; i < n; i++) {
            availableServers.offer(new int[]{servers[i], i, 0});
        }

        // Process tasks
        for (int j = 0; j < m; j++) {
            int executionTime = tasks[j];

            // Pop servers that will be free at the current time
            while (!processingTasks.isEmpty() && processingTasks.peek()[2] <= j) {
                int[] server = processingTasks.poll();
                availableServers.offer(new int[]{server[0], server[1], server[2] + executionTime});
            }

            if (!availableServers.isEmpty()) {
                int[] server = availableServers.poll();
                ans[j] = server[1]; // Assign task j to server with index server[1]
                processingTasks.offer(new int[]{server[0], server[1], j + executionTime});
            } else {
                // No available servers, wait for the next free server
                int[] server = processingTasks.poll();
                ans[j] = server[1]; // Assign task j to server with index server[1]
                processingTasks.offer(new int[]{server[0], server[1], server[2] + executionTime});
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of server: ");
        int serverSize = sc.nextInt();
        System.out.print("Enter the elements of server: ");
        int[] servers = new int[serverSize];
        for (int i = 0; i < serverSize; i++) {
            servers[i] = sc.nextInt();
        }
        System.out.print("Enter the size of tasks: ");
        int taskSize = sc.nextInt();
        int[] tasks = new int[taskSize];
        System.out.print("Enter the elements of tasks: ");
        for (int i = 0; i < taskSize; i++) {
            tasks[i] = sc.nextInt();
        }

        int[] result = assignTasks(servers, tasks);

        System.out.println(Arrays.toString(result)); // Example output: [2, 2, 0, 2, 1, 2]
    }
}
```

### Output:
```
Enter the size of server: 3
Enter the elements of server: 3 3 2
Enter the size of tasks: 6
Enter the elements of tasks: 1 2 3 2 1 2
[2, 2, 0, 2, 1, 2]
```
"""
)

markdown("---")

markdown(
"""
### 15. Seat Reservation Manager
##### Problem Statement
Design a system that manages the reservation 
state of n seats that are numbered from 1 to n.
Implement the SeatManager class:
SeatManager(int n) Initializes a SeatManager object that will manage n 
seats numbered from 1 to n. All seats are initially available.
int reserve() Fetches the smallest-numbered unreserved seat, reserves 
it, and returns its number.
void unreserve(int seatNumber) Unreserves the seat with the given 
seatNumber.

##### Example 1:
```
Input
    ["SeatManager", "reserve", "reserve", "unreserve", "reserve", 
    "reserve", "reserve", "reserve", "unreserve"]
    [[5], [], [], [2], [], [], [], [], [5]]
Output
    [null, 1, 2, null, 2, 3, 4, 5, null]
```


### Code:
```java
package com.hands_onn;

import java.util.ArrayList;
import java.util.Scanner;

class SeatManager{
    int[] arr;
    int count = 0;
    SeatManager(int n){
        arr = new int[n];
        for (int i = 0; i < n; i++ ) {
            arr[i] = 0;
        }
    }

    public int reserve() {
        if (count < arr.length)
            arr[count++] = 1;
        return count;
    }

    public void unreserve(int n) {
        count--;
        arr[n] = 0;
    }
}

public class SeatReservationManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> valToIndex = new ArrayList<>();
        ArrayList<String> vals = new ArrayList<>();
        System.out.println("Enter the size of the list: ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            String key = sc.next();
            vals.add(key);
        }

        for (int i = 0; i < size; i++){
            int val = sc.nextInt();
            valToIndex.add(val);
        }

        SeatManager obj = new SeatManager(10);
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < vals.size(); i++) {
            switch (vals.get(i)){
                case "object":
                    ans.add(null);
                    break;

                case "reserve":
                    ans.add(Integer.toString(obj.reserve()));
                    break;
                case "unreserve":
                    obj.unreserve(valToIndex.get(i));
                    ans.add(null);
                    break;
                default:
                    ans.add("invalid input");

            }
        }
        System.out.println("Final Output: "+ans);
    }

}
```

### Output:
```
Enter the size of the list: 
9
object reserve reserve unreserve reserve reserve reserve reserve unreserve
5 -1 -1  2 -1 -1 -1 -1 5
Final Output: [null, 1, 2, null, 2, 3, 4, 5, null]
```
"""
)