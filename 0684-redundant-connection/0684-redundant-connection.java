class Solution {
    static int parent[];
    static int rank[];

    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        parent = new int[n+1];
        rank = new int[n+1];

        for(int i = 0;i<n;i++){
            parent[i] = i;
        }

        for(int[] edge:edges){
            int u = edge[0];
            int v = edge[1];

            if(find(u)==find(v)){
                return edge;
            }
            join(u,v);
        }

        return new int[0];
    }


    static int find(int x){
        if(parent[x]!=x){
            parent[x]=find(parent[x]);
        }

        return parent[x];
    }

    static void join(int x,int y){
        int parentx = find(x);
        int parenty = find(y);

        if(parentx == parenty){
             return;
        }

        if(rank[parentx]>rank[parenty]){
            parent[parenty] = parentx;
        }
        else if(rank[parenty]>rank[parentx]){
            parent[parentx] = parenty;
        }
        else{
            parent[parentx] = parenty;
            rank[parenty]++;
        }
    }
}