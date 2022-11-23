import dp.CoinChange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int output = new Solution().numSquares(253);
        System.out.println("output is : " + output);
    }
}
class Solution {
    public int numSquares(int n) {
        List<Integer> perfectSquares = new ArrayList<>(101);

        for(int i = 1; i < 101; ++i) {
            if(i * i <= n) {
                perfectSquares.add(i * i);
            }
            else {
                break;
            }
        }

        if(perfectSquares.contains(n)) {
            return 1;
        }
        int count = getMinimumCount(perfectSquares, n);

        return count;
    }

    public int getMinimumCount(List<Integer> perfectSquares, int number) {
        int allCalculations[] = new int[number + 1];

        Arrays.fill(allCalculations, Integer.MAX_VALUE);
        allCalculations[0] = 0;
        allCalculations[1] = 1;

        for(int num = 2; num <= number; ++num) {
            for(int perfSqure = 0; perfSqure < perfectSquares.size(); ++perfSqure) {
                if(perfectSquares.get(perfSqure) <= num) {
                    int alreadyCalculated = allCalculations[num - perfectSquares.get(perfSqure)];
                    allCalculations[num] = Math.min(allCalculations[num], alreadyCalculated + 1);
                }
                else {
                    break;
                }
            }
        }

        return allCalculations[number];
    }
}