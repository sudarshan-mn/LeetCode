class Solution {
    public int[][] merge(int[][] intervals) {
        List<int []>ans=new ArrayList<>();

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        int start=intervals[0][0];
        int end=intervals[0][1];

        for(int i=1;i<intervals.length;i++){
            int current_start=intervals[i][0];
            int current_end=intervals[i][1];

            if(current_start<=end){
                end=Math.max(current_end,end);
            }else{
                ans.add(new int[]{start,end});
                start=current_start;
                end=current_end;
            }
        }

        ans.add(new int[]{start,end});

return ans.toArray(new int[ans.size()][]);
    }
}