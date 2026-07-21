class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans=new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer>cur=new ArrayList<>();

            List<Integer>prev=(i>0)?ans.get(i-1):null;

            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    cur.add(1);
                }else{
                    cur.add(prev.get(j-1)+prev.get(j));
                }
            }
            ans.add(cur);
        }
        return ans;
    }
}