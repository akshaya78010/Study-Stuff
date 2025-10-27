#include<bits/stdc++.h>
 using namespace std;
 
 void DFS(int node, vector<int>& visited, vector<int>adjList[]){
     visited[node] = 1;
     cout << node << " ";
     for(auto child : adjList[node]){
         if(visited[child] == 0){
             DFS(child, visited, adjList);
         }
     }
 }
 void BFS(int node, vector<int>&visted, vector<int> adjList[] ){
     queue<int>q;
     q.push(node);
     visted[node] = 1;
     while(!q.empty()){
         node = q.front();
         cout << node << " ";
         q.pop();
         for(auto i : adjList[node]){
             if(visted[i] == 0){
                 q.push(i);
                 visted[i] = 1;
             }
         }
     }
 }
 int main(){
     int n,e;
     cin >>n>>e;
     vector<int>adjList[n+1];
     for(int i = 0; i < e; i++){
         int u, v;
         cin >> u >> v;
         adjList[u].push_back(v);
         adjList[v].push_back(u);
     }
     vector<int>visited(n+1,0);
     for(int i = 1; i <= n; i++){
         if(visited[i] == 0){
             DFS(i, visited, adjList);
         }
     }
     cout << endl;
     vector<int>visted(n+1, 0);
     BFS(1, visted, adjList);
 }