#include<bits/stdc++.h>
using namespace std;
int main()
{
	int nodes,edges;
	cin>>nodes>>edges;
	vector<int>adjlist[nodes+1];
	for(int i =0 ; i < edges ; i++)
	{
	int u,v;
	cin>>u>>v;
    adjlist[u].push_back(v);
    adjlist[v].push_back(u);
	}
	//single source shortest path
	queue<pair<int,int>>q;
	q.push({1,0});
	vector<int>distance(nodes+1,0);
	vector<int>visited(nodes+1,0);
	visited[1] = 1;
	while(!q.empty())
	{
        auto Node = q.front();
        int parent_node = Node.first;
        int dist = Node.second;
        q.pop();
        for(auto i:adjlist[parent_node]){
        if(visited[i] == 0)
        {
             distance[i] = dist + 1;
             visited[i] = 1;
             q.push({i,distance[i]});
        }
        }
	}
	for(int i  =0; i < distance.size() ; i++)
	{
	cout<<distance[i]<<" ";
	}
}
