#include<iostream>
using namespace std;
int main()
{
	int n,e;
	cin>>n,e;
	int graph[n+1][n+1];
	for(int i = 0; i < n+1 ; i++)
	{
		for(int j = 0; j < n+1 ; j++)
		{
			graph[i][j] = 0;
		}
	}
	for(int i =0 ; i < e ; i++)
	{
		int u,v;
		cin>>u>>v;
		graph[u][v] = 1;
		graph[v][u] = 1;
	}
}