package CodePractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSumProblem {
    public static void main(String[] args) {

        int[] numbs ={1,2,3,4};
        int target=4;

        twoSumProblem tw = new twoSumProblem();
        int[] index =tw.twoSum(target,numbs);
        System.out.println(Arrays.toString(index));
    }

    public int[] twoSum(int target,int Arr[]){

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < Arr.length; i++) {
            int compliment=target-Arr[i];
            if (map.containsKey(compliment)) {
                return new int[]{map.get(compliment), i};
            }
            map.put(Arr[i],i );
        }
        return new int[]{};
    }
}
