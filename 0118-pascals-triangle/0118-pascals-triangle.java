class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pas=new ArrayList<>();
        int n=numRows;
         for(int i=0;i<n;i++)
         {
            List<Integer> row=new ArrayList<>();
            int count=1;
            for(int j=0;j<=i;j++)
            {
                if(i==0 || j==0)
                {
                    row.add(count);
                }
                else
                {
                    count=(count*(i-j+1))/j;
                    row.add(count);
                }
            }
            pas.add(row);
         }
         return pas;
    }
}