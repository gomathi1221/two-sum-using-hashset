class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int c=target-arr[i];
            if(set.contains(c)){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
        
    }
}