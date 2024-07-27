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