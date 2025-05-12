class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> s = new HashSet<>();
        int n=digits.length;
        for(int i=0;i<n;i++){
            if(digits[i]==0) continue;
            for(int j=0;j<n;j++){
                if (i == j) continue;
                for(int k=0;k<n;k++){
                    if (i == k || j == k) continue;
                      int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                      if(num%2==0){
                        s.add(num);
                      }
                }
            }
        }
         List<Integer> list = new ArrayList<>(s);
        Collections.sort(list);
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}