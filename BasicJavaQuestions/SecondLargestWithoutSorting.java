
class SecondLargestWithoutSorting {
    
    public static int findSecondLargest(int[] n){
        int l = 0;
        int sl = 0;
        for(int i = 0; i<n.length; i++){
            if(n[i]>l){
                l = sl;
                sl = n[i];
                 System.out.println("The secon " + l + "jfnfd"+sl);
            }
        }
        return sl;
    }
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 19, 1};
        int result = findSecondLargest(arr);
        System.out.println(result);
    }
}