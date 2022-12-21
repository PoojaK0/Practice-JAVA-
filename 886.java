/*
We want to split a group of n people (labeled from 1 to n) into two groups of any size. Each person may dislike some other people, and they should not go into the same group.

Given the integer n and the array dislikes where dislikes[i] = [ai, bi] indicates that the person labeled ai does not like the person labeled bi, return true if it is possible to split everyone into two groups in this way.

 

Example 1:

Input: n = 4, dislikes = [[1,2],[1,3],[2,4]]
Output: true
Explanation: group1 [1,4] and group2 [2,3].
Example 2:

Input: n = 3, dislikes = [[1,2],[1,3],[2,3]]
Output: false
*/

class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        int[] color=new int[n+1];
        List<Integer>[] graph = new ArrayList[n+1];
        for(int i=0; i<=n; i++){
            graph[i]=new ArrayList<>();
        }

        for(int[] i : dislikes){
            graph[i[0]].add(i[1]);
            graph[i[1]].add(i[0]);
        }


        for(int i=1; i<=n; i++){
            if(color[i]==0){
                LinkedList<Integer> q = new LinkedList<>();
                q.add(i);//
                color[i]=1;
                while(q.size() != 0){
                    int top=q.removeFirst();
                    for(int k : graph[top]){
                        if(color[k] == color[top])
                        return false;
                        if(color[k] == 0){
                            color[k]=-color[top];
                            q.add(k);
                        }
                    }
                }

            }
        }

    return true;


    }
}
