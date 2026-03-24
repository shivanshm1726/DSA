/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);

        int firstTry = orderAgnostic(mountainArr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnostic(mountainArr, target, peak+1, mountainArr.length()-1);
    }

    int findPeak(MountainArray arr){
        int start = 0;
        int end = arr.length() - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr.get(mid) < arr.get(mid+1)){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }

    int orderAgnostic(MountainArray arr, int target, int start, int end){
        boolean isAsc = arr.get(start) < arr.get(end);

        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(arr.get(mid) == target){
                return mid;
            }

            if(isAsc){
                if(target < arr.get(mid)){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(arr.get(mid) > target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}