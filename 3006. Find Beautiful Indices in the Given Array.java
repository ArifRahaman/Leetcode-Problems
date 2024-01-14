class Solution {
    public List<Integer> beautifulIndices(String s, String a, String b, int k) {
        ArrayList<Integer> A1 = new ArrayList<>();
        ArrayList<Integer> A2 = new ArrayList<>();

        int index1 = -1;
        int index2 = -1;

        while ((index1 = s.indexOf(a, index1 + 1)) != -1) {
            A1.add(index1);
        }

        while ((index2 = s.indexOf(b, index2 + 1)) != -1) {
            A2.add(index2);
        }
      ArrayList<Integer> Answers = new ArrayList<>();
        for(int i=0;i<A1.size();i++){
            for(int j=0;j<A2.size();j++){
                if(Math.abs(A1.get(i)-A2.get(j))<=k){
                    Answers.add(A1.get(i));
                    break;
                }
            }
        }
        return Answers;     
    }
}
