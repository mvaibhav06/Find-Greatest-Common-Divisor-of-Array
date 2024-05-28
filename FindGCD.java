class FindGCD {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a = nums[0];
        int b = nums[nums.length-1];
        int out = -1;
        for(int i=1; i<=a; i++){
            if(a%i==0 && b%i==0){
                out = i;
            }
        }
        return out;
    }
}
