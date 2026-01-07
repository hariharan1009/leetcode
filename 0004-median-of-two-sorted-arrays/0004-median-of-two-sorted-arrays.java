class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int[] a=new int[n1+n2];
        int k=0;
        for(int i:nums1){
            a[k++]=i;
        }
        for(int i:nums2){
            a[k++]=i;
        }
        Arrays.sort(a);
        if(a.length%2==1){
            return (double)a[a.length/2];
        }
        else{
            return ((double) a[a.length/2-1] +(double) a[a.length/2])/2.0;
        }
    }
}