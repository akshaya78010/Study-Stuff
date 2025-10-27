#include<bits/stdc++.h>
using namespace std;
struct treenode
{
	int data;
	struct treenode *left;
	struct treenode *right;
	treenode(int val)
	{
		data = val;
		left  = NULL;
		right = NULL;
	}
};
void inorder(treenode *root)
{
	if(root != NULL)
	{
		inorder(root->left);
		cout<<root->data<<" ";
		inorder(root->right);
	}
}
treenode*createatreeBFS(vector<string>&nodes){
    int idx = 0;
    if(nodes[idx] == "N")
    {
    	return NULL;
	}
	treenode *root = new treenode(stoi(nodes[idx]));
	treenode *temp = root;
	 queue<treenode*>Q;
    //Q.pop() , Q.front() , Q.empty(), Q.size()
    Q.push(root);
    //root->1
    while(!Q.empty() && idx < nodes.size()){
        treenode *temp = Q.front();
        Q.pop();
        idx++;
        //first left take care
        if(nodes[idx]!="N"){
            treenode *nn = new treenode(stoi(nodes[idx]));
            temp->left = nn;
            Q.push(nn);

        }
        //insert right
        idx++;
        if(idx < nodes.size() && nodes[idx]!="N"){
            treenode *nn = new treenode(stoi(nodes[idx]));
            temp->right = nn;
            Q.push(nn);
        }
    }
    return root;
}
int main()
{
	string s;
	getline(cin,s);
	vector<string>nodes;
	stringstream ss(s);
	string temp;
	while(ss>>temp)
	{
	    nodes.push_back(temp);
	}
	treenode *root = createatreeBFS(nodes);
	inorder(root);
}