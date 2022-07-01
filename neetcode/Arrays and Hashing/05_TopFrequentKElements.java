class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map=new HashMap<Integer, Integer>();
        int freq[]=new int[k];
        for(int num: nums)
        {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        PriorityQueue<int[]> queue=new PriorityQueue<int[]>((a,b) -> b[0] - a[0]);
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            queue.add(new int[]{entry.getValue(), entry.getKey()});
        }
        
        for(int i=0; i<k; i++)
        {
            freq[i]=queue.remove()[1];
        }
        return freq;
    }
}