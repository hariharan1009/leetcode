class Solution {
    public String convertDateToBinary(String date) {
        String[] a=date.split("-");
        int q1=Integer.parseInt(a[0]);
        int q2=Integer.parseInt(a[1]);
        int q3=Integer.parseInt(a[2]);
        String a1=Integer.toBinaryString(q1);
        String a2=Integer.toBinaryString(q2);
        String a3=Integer.toBinaryString(q3);
        return (a1+"-"+a2+"-"+a3);
    }
}