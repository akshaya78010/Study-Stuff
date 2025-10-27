#include<bits/stdc++.h>
using namespace std;
struct treenode{
	int data;
	struct treenode *left;
	struct treenode* right;
	treenode(int val):data(val),left(NULL),right(NULL){};
};
void inorder(treenode *root)
{
	if(root!= NULL)
	{
		inorder(root->left);
		cout<<root->data<<" ";
		inorder(root->right);
	}
}
void preorder(treenode *root)
{
	if(root!= NULL)
	{
		cout<<root->data<<" ";
		inorder(root->left);
		inorder(root->right);
	}
}
void postorder(treenode *root)
{
	inorder(root->left);
	inorder(root->right);
	cout<<root->data<<" ";
}
treenode *createdfs(vector<string>&nodes,int idx)
{
	if(idx >= nodes.size() || nodes[idx] == "N")
	{
		return NULL;
	}
	treenode *root = new treenode(stoi(nodes[idx]));
	root->left = createdfs(nodes,idx*2+1);
	root->right = createdfs(nodes,idx*2+2);
	return root;
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
	string str;
	getline(cin,str);
	vector<string>nodes;
	stringstream ss(str);
	string temp;
	while(ss>>temp)
	{
		nodes.push_back(temp);
	}
	treenode *root = createdfs(nodes,0);
	inorder(root);
	cout<<endl;
	preorder(root);
	cout<<endl;
	postorder(root);
	cout<<endl;
}