 class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>>a=new ArrayList<>();
        if (root == null) {
            return a;
        }
    
        Queue<TreeNode> q = new LinkedList<>();
        Stack<TreeNode> st = new Stack<>();
        q.add(root);
        int flag = 0;
        int h = 0;
        while (!q.isEmpty()) {
            List<Integer>innerList1=new ArrayList<>();
            int levelSize = q.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode temp = q.poll();
                if (flag == 0) {
                    if (temp.left != null) {
                        st.push(temp.left);
                    }
                    if (temp.right != null) {
                        st.push(temp.right);
                    }
                } else {
                    if (temp.right != null) {
                        st.push(temp.right);
                    }
                    if (temp.left != null) {
                        st.push(temp.left);
                    }
                }
                innerList1.add(temp.val);
            }

            while (!st.isEmpty()) {
                q.add(st.pop());
            }
            a.add(innerList1);
            flag = 1 - flag; 
            h++;
            System.out.println(); 
        }
        return a;
    }
}
