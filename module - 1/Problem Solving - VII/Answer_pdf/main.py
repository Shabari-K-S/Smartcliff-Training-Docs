from streamlit import *

title("Problem  Solving VII")

markdown(
"""
### 1. Different Sub sequences GCD
##### Problem statement : 
You are given an array “ARR” of positive integers. Your task
is to find the number of different GCD’s in all the non-empty subsequences of the
given array.
> **Note:**
>
>The GCD of a list of numbers is defined as the greatest number that perfectly
divides all the members of the given list. For example, the GCD of 6, 8, and 10 is 2.
A subsequence of the array is a list that can be made by using some elements of
the given array. All the elements can also be part of a subsequence.
For example: the array [1, 2] has subsequences: [1], [2] and [1, 2]. Similarly for
the array [1, 2, 3], one of the subsequences is [1, 3].

### Analysis
- We can find the GCD of all the subsequence of the given array and store it in a set.
- Finally, we can return the length of the set which will be the number of different GCD’s in all the non-empty subsequences of the given array.


### Code
```java
package com.hands_on;

import java.util.*;

public class DifferentSubSequencesGCD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many query's needed: ");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("The count of `Different Subsequence GCD` of the given array is "+gcdSubsequences(arr));
        }
    }

    public static int gcdSubsequences(int[] arr) {
        int cnt = 0;
        HashMap<Integer, Integer> factorToGcd = new HashMap<>();
        for (int num : arr) {
            for (int i = 1; i * i <= num; i++) {
                if (num % i != 0) continue;
                int i2 = num / i;
                int gcd1 = gcd(factorToGcd.getOrDefault(i, num), num);
                int gcd2 = gcd(factorToGcd.getOrDefault(i2, num), num);
                factorToGcd.put(i, gcd1);
                factorToGcd.put(i2, gcd2);
            }
        }
        for (int f : factorToGcd.keySet()) {
            if (factorToGcd.get(f) == f) cnt++;
        }
        return cnt;
    }


    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
```

### Output
```
Enter how many query's needed: 1
Enter the size of the array: 3
Enter the elements of the array: 6 8 10
The count of `Different Subsequence GCD` of the given array is 4
```
"""
)

markdown('---')

markdown(
"""
### 2. 24 Game
##### Problem statement : 
Henry is feeling lonely, so he started playing online games.
While searching for fun, he found an exciting game. In this game, Ninja has to
choose four cards at random. On each card, there is a number between 1 to 9, both
inclusive. For Henry to win, he has to make the number 24 using the number on
cards and the following operator *, /, +, -, (, ).

Help Henry to find whether he will win the game or not, on the basis of his
selection. If Henry can win the game, print true otherwise, print false.

Example:-
If the cards Ninja chooses are 4, 1, 8, 7. Then Ninja can make 24 by (8 - 4) * (7 -
1). Hence Ninja can win, so you have to return true.

>**Note:-**
The division operator ‘/’ represents actual division, not integer division. For
example, 4 / (1 - ⅔ ) = 12.

### Analysis
- We can generate all the possible permutations of the given array of numbers.
- Then we can generate all the possible expressions using the given numbers.
- Finally, we can evaluate the expression and check if the result is 24 or not.

### Code
```java
package com.hands_on;

import java.util.*;

public class TwentyFourGame {
    public boolean point24(int[] cards) {
        return mixCard(cards, 0);
    }
    public boolean backtrack(List<Double> cards){
        if(cards.size() == 1){
            return Math.abs(cards.getFirst() - 24) <= 0;
        }
        boolean result = false;
        for(int i = 0; i < cards.size() - 1; i++){
            for(int k = 0; k < 4; k++){
                //Skip apply '/' when b == 0 => a/b not valid
                if(k == 3 && cards.get(i+1) == (double) 0){
                    continue;
                }
                List<Double> groups = new ArrayList<>();
                for(int j = 0; j < cards.size(); j++){
                    if(j < i){
                        groups.add(cards.get(j));
                    }else if(j == i){
                        groups.add(applyOps(cards.get(i), cards.get(i+1), k));
                    }else if(j > i+1){
                        groups.add(cards.get(j));
                    }
                }
                result = result || backtrack(groups);
            }
        }
        return result;
    }
    public double applyOps(double a, double b, int k){
        return (k == 0 ? a + b : (k == 1 ? a - b : (k == 2 ? a*b : a/b)));
    }
    public boolean mixCard(int[] cards, int start){
        int n = cards.length;
        if(start == n){
            List<Double> list = new ArrayList<>();
            for (int card : cards) {
                list.add((double) card);
            }
            return backtrack(list);
        }
        boolean result = false;
        for(int i = start; i < n; i++){
            swap(cards, start, i);
            result = result || mixCard(cards, start + 1);
            swap(cards, start, i);
        }
        return result;
    }
    public void swap(int[] cards, int i, int j){
        int temp = cards[i];
        cards[i] = cards[j];
        cards[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many query's needed: ");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            TwentyFourGame twentyFourGame = new TwentyFourGame();
            System.out.println("The result of the game is "+twentyFourGame.point24(arr));
        }
    }
}
```

### Output
```
Enter how many query's needed: 2
Enter the size of the array: 4 
Enter the elements of the array: 4 1 8 7
The result of the game is true
Enter the size of the array: 4
Enter the elements of the array: 1 2 1 2
The result of the game is false
```
"""
)

markdown('---')

markdown(
"""
### 3. Running Median
##### Problem statement : 
You are given a stream of 'N' integers. For every 'i-th'
integer added to the running list of integers, print the resulting median.
Print only the integer part of the median.

### Analysis
- We can use two priority queues to store the elements of the given array.
- One priority queue will store the elements in the increasing order and the other in the decreasing order.
- We can maintain the size of the two priority queues such that the difference between the size of the two priority queues is at most 1.
- If the size of the two priority queues is equal, we can return the average of the top elements of the two priority queues.
- If the size of the two priority queues is not equal, we can return the top element of the priority queue with the greater size.

### Code
```java
package com.hands_on;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class RunningMedian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many query's needed: ");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            for (int i = 0; i < n; i++) {
                if (maxHeap.isEmpty() || arr[i] < maxHeap.peek()) {
                    maxHeap.add(arr[i]);
                } else {
                    minHeap.add(arr[i]);
                }
                if (maxHeap.size() > minHeap.size() + 1) {
                    minHeap.add(maxHeap.poll());
                } else if (minHeap.size() > maxHeap.size()) {
                    maxHeap.add(minHeap.poll());
                }
                if (maxHeap.size() == minHeap.size()) {
                    System.out.print((maxHeap.peek() + minHeap.peek()) / 2 + " ");
                } else {
                    System.out.print(maxHeap.peek() + " ");
                }
            }
            System.out.println();
        }
    }
}
```

### Output
```
Enter how many query's needed: 1
Enter the size of the array: 6
Enter the elements of the array: 6 2 1 3 7 5
6 4 2 2 3 4 
```
"""
)

markdown('---')

markdown(
"""
### 4. Settle Debt
Problem statement
A group of friends went on a trip and sometimes lent each other money. Each
transaction among them is represented by the tuple (X, Y, Z) which means person
‘X’ gave person ‘Y’ $Z. Given a list of ‘N’ transactions between a group of friends,
return the minimum number of transactions required to settle the debt.

> **Example:**
Alice paid for Bill's lunch for $10. Then later Chris gave Alice $5 for a taxi ride.
Assuming Alice, Bill, and Chris are person 0, 1, and 2 respectively (0, 1, 2 are the
person's ID), the transaction can be represented as [[0, 1, 10], [2, 0, 5]].So here
the minimum number of transactions to settle the debt is 2.

### Analysis
- We can use a recursive approach to find the minimum number of transactions required to settle the debt.
- We can use a hashmap to store the net amount of money each person owes.
- We can use a recursive function to find the minimum number of transactions required to settle the debt.
- In the recursive function, we can find the first person who owes money and the first person who is owed money.
- We can then settle the debt between the two persons and recursively call the function to settle the remaining debt.
- Finally, we can return the minimum number of transactions required to settle the debt.

### Code
```java
package com.hands_on;

import java.util.HashMap;
import java.util.Scanner;

public class SettleDebt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many query's needed: ");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[][] transactions = new int[n][3];
            System.out.print("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    transactions[i][j] = sc.nextInt();
                }
            }
            System.out.println("The minimum number of transactions required to settle the debt is "+minTransfers(transactions));
        }
    }

    public static int minTransfers(int[][] transactions) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int[] transaction : transactions) {
            map.put(transaction[0], map.getOrDefault(transaction[0], 0) - transaction[2]);
            map.put(transaction[1], map.getOrDefault(transaction[1], 0) + transaction[2]);
        }
        return settleDebt(0, map);
    }

    public static int settleDebt(int start, HashMap<Integer, Integer> map) {
        while (start < map.size() && map.get(start) == 0) {
            start++;
        }
        if (start == map.size()) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int i = start + 1; i < map.size(); i++) {
            if (map.get(start) * map.get(i) < 0) {
                map.put(i, map.get(i) + map.get(start));
                min = Math.min(min, 1 + settleDebt(start + 1, map));
                map.put(i, map.get(i) - map.get(start));
            }
        }
        return min;
    }
}
```

### Output
```
Enter how many query's needed: 1
Enter the size of the array: 4
Enter the elements of the array: 
0 1 10
1 0 1
1 2 5
2 0 5
The minimum number of transactions required to settle the debt is 1
"""
)

markdown('---')

markdown(
"""
### 5. Meeting Rooms III
##### Problem statement : 
You are given an integer n. There are n rooms numbered
from 0 to n - 1. You are given a 2D integer array meetings where meetings[i] =
[starti, endi] means that a meeting will be held during the half-closed time
interval [starti, endi). All the values of starti are unique.

Meetings are allocated to rooms in the following manner:
1. Each meeting will take place in the unused room with the lowest number.
2. If there are no available rooms, the meeting will be delayed until a room becomes free. The delayed meeting should have the same duration as the original meeting.
3. When a room becomes unused, meetings that have an earlier original start time should be given the room.

Return the number of the room that held the most meetings. If there are multiple
rooms, return the room with the lowest number.

A half-closed interval [a, b) is the interval between a and b including a and not
including b.

### Analysis
- We can use a priority queue to store the end time of the meetings.
- We can sort the meetings based on the start time.
- We can iterate through the meetings and check if the end time of the top element of the priority queue is less than the start time of the current meeting.
- If the end time of the top element of the priority queue is less than the start time of the current meeting, we can remove the top element of the priority queue.
- Finally, we can return the size of the priority queue which will be the number of the room that held the most meetings.


### Code
```java
package com.hands_on;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MeetingRoomsIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many query's needed: ");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.print("Enter the number of room: ");
            int n = sc.nextInt();
            System.out.print("Enter the size of the array: ");
            int m = sc.nextInt();
            int[][] meetings = new int[m][2];
            System.out.print("Enter the elements of the array: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < 2; j++) {
                    meetings[i][j] = sc.nextInt();
                }
            }
            System.out.println("The number of the room that held the most meetings is "+maxMeetingRooms(n, meetings));
        }
    }

    public static int maxMeetingRooms(int n, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
        PriorityQueue<int[]> busy
                = new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        PriorityQueue<Integer> idle = new PriorityQueue<>();
        for (int i = 0; i < n; ++i) {
            idle.offer(i);
        }
        int[] cnt = new int[n];
        for (var v : meetings) {
            int s = v[0], e = v[1];
            while (!busy.isEmpty() && busy.peek()[0] <= s) {
                idle.offer(busy.poll()[1]);
            }
            int i = 0;
            if (!idle.isEmpty()) {
                i = idle.poll();
                busy.offer(new int[] {e, i});
            } else {
                var x = busy.poll();
                i = x[1];
                busy.offer(new int[] {x[0] + e - s, i});
            }
            ++cnt[i];
        }
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            if (cnt[ans] < cnt[i]) {
                ans = i;
            }
        }
        return ans;
    }
}
```

### Output:
```
Enter how many query's needed: 1
Enter the number of room: 3
Enter the size of the array: 5
Enter the elements of the array: 1 20
2 10
3 5
4 9
6 8
The number of the room that held the most meetings is 1
```

"""
)


markdown('---')

markdown(
"""
### 6. Find Servers That Handled Most Number of Requests
##### Problem statement : 
You have k servers numbered from 0 to k-1 that are being
used to handle multiple requests simultaneously. Each server has infinite
computational capacity but cannot handle more than one request at a time.

The requests are assigned to servers according to a specific algorithm:
- The ith (0-indexed) request arrives.
- If all servers are busy, the request is dropped (not handled at all).
- If the (i % k)th server is available, assign the request to that server.
- Otherwise, assign the request to the next available server (wrapping around
the list of servers and starting from 0 if necessary). 

For example, if the i
th server is busy, try to assign the request to the (i+1)th server, then the (i+2)th server, and so on.

You are given a strictly increasing array arrival of positive integers,
where arrival[i] represents the arrival time of the i
th request, and another array load, where load[i] represents the load of the i
th request (the time it takes to complete). Your goal is to find the busiest server(s). A server is
considered busiest if it handled the most number of requests successfully among
all the servers.

Return a list containing the IDs (0-indexed) of the busiest server(s). You may
return the IDs in any order.

### Analysis
- We can use a priority queue to store the available servers.
- We can use a priority queue to store the busy servers.
- We can iterate through the arrival array and check if the server is available.
- If the server is available, we can assign the request to the server.
- If the server is not available, we can assign the request to the next available server.
- Finally, we can return the list of the busiest server(s).

Input: k = 3, arrival = [1,2,3,4,5], load = [5,2,3,3,3]
Output: [1]
Explanation:
All of the servers start out available.
The first 3 requests are handled by the first 3 servers in order.
Request 3 comes in. Server 0 is busy, so it's assigned to the next available server,
which is 1.
Request 4 comes in. It cannot be handled since all servers are busy, so it is
dropped.
Servers 0 and 2 handled one request each, while server 1 handled two requests.
Hence server 1 is the busiest server.

### Code
```java
package com.hands_on;

import java.util.*;

public class FSTHMNOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many query's needed: ");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.print("Enter the number of servers: ");
            int k = sc.nextInt();
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arrival = new int[n];
            int[] load = new int[n];
            System.out.print("Enter the elements of the arrival array: ");
            for (int i = 0; i < n; i++) {
                arrival[i] = sc.nextInt();
            }
            System.out.print("Enter the elements of the load array: ");
            for (int i = 0; i < n; i++) {
                load[i] = sc.nextInt();
            }
            System.out.println("The busiest server(s) is "+busiestServers(k, arrival, load));
        }
    }

    public static List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        int[] counts = new int[k];
        TreeSet<Integer> available = new TreeSet<>();
        for (int i = 0; i < k; i++) {
            available.add(i);
        }
        PriorityQueue<int[]> busy = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < arrival.length; i++) {
            int time = arrival[i];
            int duration = load[i];
            while (!busy.isEmpty() && busy.peek()[0] <= time) {
                available.add(busy.poll()[1]);
            }
            if (available.isEmpty()) {
                continue;
            }
            Integer server = available.ceiling(i % k);
            if (server == null) {
                server = available.first();
            }
            counts[server]++;
            available.remove(server);
            busy.add(new int[]{time + duration, server});
        }
        List<Integer> result = new ArrayList<>();
        int max = Arrays.stream(counts).max().getAsInt();
        for (int i = 0; i < k; i++) {
            if (counts[i] == max) {
                result.add(i);
            }
        }
        System.out.println(available + " "+ Arrays.toString(busy.element()));
        return result;
    }
}
```

### Output
```
Enter how many query's needed: 1
Enter the number of servers: 3
Enter the size of the array: 5
Enter the elements of the arrival array: 1 2 3 4 5
Enter the elements of the load array: 5 2 3 3 3
The busiest server(s) is [1]
```
"""
)

markdown('---')

markdown(
"""
### 7. Minimum Number of Refueling Stops
##### Problem statement : 
A car travels from a starting position to a destination which
is target miles east of the starting position.

There are gas stations along the way. The gas stations are represented as an array
stations where stations[i] = [positioni, fueli] indicates that the ith gas station is
positioni miles east of the starting position and has fueli liters of gas.

The car starts with an infinite tank of gas, which initially has startFuel liters of fuel
in it. It uses one liter of gas per one mile that it drives. When the car reaches a gas
station, it may stop and refuel, transferring all the gas from the station into the car.

Return the minimum number of refueling stops the car must make in order to reach
its destination. If it cannot reach the destination, return -1.

> **Note:-** 
>
> If the car reaches a gas station with 0 fuel left, the car can still refuel
there. If the car reaches the destination with 0 fuel left, it is still considered to have
arrived.

### Analysis
- We can use a priority queue to store the gas stations.
- We can iterate through the gas stations and check if the car can reach the gas station.
- If the car can reach the gas station, we can add the gas station to the priority queue.
- If the car cannot reach the gas station, we can refuel the car using the gas stations in the priority queue.
- Finally, we can return the minimum number of refueling stops the car must make in order to reach its destination.

### Code
```java
package com.hands_on;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MinimumNumberOfRefuelingStops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many query's needed: ");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.print("Enter the target: ");
            int target = sc.nextInt();
            System.out.print("Enter the startFuel: ");
            int startFuel = sc.nextInt();
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[][] stations = new int[n][2];
            System.out.print("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 2; j++) {
                    stations[i][j] = sc.nextInt();
                }
            }
            System.out.println("The minimum number of refueling stops the car must make is "+minRefuelStops(target, startFuel, stations));
        }
    }

    public static int minRefuelStops(int target, int startFuel, int[][] stations) {
        int n = stations.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int i = 0, res;
        for (res = 0; startFuel < target; res++) {
            while (i < n && stations[i][0] <= startFuel) {
                pq.add(stations[i++][1]);
            }
            if (pq.isEmpty()) {
                return -1;
            }
            startFuel += pq.poll();
        }
        return res;
    }
}
```
"""
)

markdown('---')

markdown(
"""
### 9. Ninja Jump
Problem statement : Ninja is assigned a task to reach the last stone by his
master. These stones are numbered with some value and in the form of an array.
He is allowed to jump either odd-numbered jumps or even-numbered jumps and
has to reach the last stone.

So your task is to find the number of starting index from which he may start
jumping so he reaches the last stones. You are provided with the given array and
you have to find the number of starting index of the array from which Ninja can
reach the end of the array by jumping some number of times.

For jumping you have to follow below instructions:

You may jump forward from index ‘i’ to index ‘j’ (with i < j) in the following way:
During odd-numbered jumps (i.e., jumps 1, 3, 5, ...), you jump to the index ‘j’ such
that ‘arr[i] <= arr[j]’ and ‘arr[j]’ is the smallest possible value. If there are multiple
such indices ‘j’, you can only jump to the smallest such index j.
During even-numbered jumps (i.e., jumps 2, 4, 6, ...), you jump to the index ‘j’
such that ‘arr[i] >= arr[j]’ and ‘arr[j]’ is the largest possible value. If there are
multiple such indices ‘j’, you can only jump to the smallest such index ‘j’.
It may be the case that for some index ‘i’, there are no legal jumps.

### Analysis
- We can use a stack to store the indices of the array.
- We can use a map to store the indices of the array.
- We can iterate through the array and check if the index is odd or even.
- If the index is odd, we can find the next index which is smaller than the current index.
- If the index is even, we can find the next index which is greater than the current index.
- Finally, we can return the number of starting index from which Ninja can reach the end of the array.

### Code
```java

```

### Output
```
```
"""
)

markdown('---')

markdown(
"""
### 11. Reverse Subarray To Maximize Array Value
##### Problem statement : 
You are given an array of integers ‘NUMS’. The beauty of
this array can be defined as:

The sum of absolute difference of each two consecutive elements.
In one operation you can reverse one subarray of ‘NUMS’. Your task is to find
maximum beauty by performing the operation exactly once.

Sample Input 1:
```
1
5
5 4 1 7 2
```
Sample Output 1:
```
17
```
> **Explanation for sample input 1:a**
The current beauty of the array is |5 - 4| + |4 - 1| + |1 - 7| + |7 - 2| = 15, after
reversing the subarray [4, 1, 7, 2] beauty becomes = |5 - 2| + |2 - 7| + |7 - 1| +
|1 - 4| = 17, which is the maximum beauty we can obtain.

### Analysis
- We can find the sum of the absolute difference of each two consecutive elements of the given array.
- We can find the maximum beauty by reversing the subarray of the given array.
- Finally, we can return the maximum beauty by performing the operation exactly once.

### Code
```java
package com.hands_on;

import java.util.*;

public class ReverseSubarrayToMaximizeArrayValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many query's needed: ");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] nums = new int[n];
            System.out.print("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            System.out.println("The maximum beauty of the array is "+maxBeauty(nums));
        }
    }

    public static int maxBeauty(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += Math.abs(nums[i] - nums[i + 1]);
        }
        int max = 0;
        for (int i = 1; i < n - 1; i++) {
            max = Math.max(max, Math.abs(nums[i] - nums[i - 1]) + Math.abs(nums[i + 1] - nums[i]) - Math.abs(nums[i + 1] - nums[i - 1]));
        }
        max = Math.max(max, Math.abs(nums[1] - nums[0]));
        max = Math.max(max, Math.abs(nums[n - 1] - nums[n - 2]));
        return sum + max;
    }
}
```
"""
)