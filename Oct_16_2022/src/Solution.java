import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Given an integer array nums, 
 * return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, 
 * and nums[i] + nums[j] + nums[k] == 0
 */
public class Solution {
	public static List<List<Integer>> threeSum(int[] nums) {
		Map<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < nums.length - 1; i++) {
			map.put(i, new ArrayList<>());
			for (int j = i + 1; j < nums.length; j++) {
				map.get(i).add(nums[i] + nums[j]);
			}
		}
		
		List<List<Integer>> result = new ArrayList<>();
		for (Integer i : map.keySet()) {
			for (Integer j : map.get(i)) {
				for (int k = i + map.get(i).indexOf(j) + 2; k < nums.length; k++) {
					if (j + nums[k] == 0) {
						List<Integer> temp = new ArrayList<>();
						temp.add(nums[i]);
						temp.add(nums[i + map.get(i).indexOf(j) + 1]);
						temp.add(nums[k]);
						Collections.sort(temp);
						if (!result.contains(temp)) {
							result.add(temp);
						}
					}
				}
			}
		}
		
		return result;
	}

}

/*
 * This one works, but very slow. O(n*n*n)...
 * Should think more to optimize
*/

/*
 * Another solution, O(n*n)
 * 
 * 
 * public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res  = new HashSet<>();
        if(nums.length==0) return new ArrayList<>(res);
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2;i++){
            int j =i+1;
           int  k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0)res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                else if ( sum >0) k--;
                else if (sum<0) j++;
            }

        }
        return new ArrayList<>(res);
    }
*/