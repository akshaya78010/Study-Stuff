#include<stdio.h>
#include<stdlib.h>
#include<math.h>
struct Node{
	int data;
	struct Node *next;
};
struct Graph{
	int no_of_nodes;
	struct Graph **adjlist;
};
struct Graph *CreateAGraph(int n)
{int i;
	struct Graph *graph=(struct Graph*)malloc(sizeof(struct Graph));
	graph->no_of_nodes = n;
	graph->adjlist = (struct Node**)malloc(n * sizeof(struct Node*));
	for(int i =0 ; i < n ; i++)
	{
		graph->adjlist[i] = NULL;
	}
	return graph;
}
struct Node *createANode(int val)
{
	struct Node *nn = (struct Node*)malloc(sizeof(struct Node));
	nn->data = val;
	nn->next = NULL;
	return nn;
}
void addEdge(int v,int u,struct Graph *graph)
{
	//connect u->v
	//create a node v
	struct Node *newnode = createANode(v);
	newnode->next = graph->adjlist[u];
	graph->adjlist[u] = newnode;
	//create a node u
	struct Node *Newnode = createANode(u);
	Newnode->next = graph->adjlist[v];
	graph->adjlist[v] = Newnode;
}
int main()
{
	int n,e;
	scanf("%d %d",&n,&e);
	//create a graph
	struct Graph* graph = CreateAGraph(n);
	for(int i = 0; i < e ; i++)
	{
		int u,v;
		scanf("%d %d",&u,&v);
		addEdge(v,u,graph);
	}
}