class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int key : nums){
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));

        for(int key : map.keySet()){
            heap.add(key);
        }

        int arr[] = new int[k];

        for(int i = 0; i<k; i++){
            arr[i] = heap.poll();
        }

        return arr;
    }
}