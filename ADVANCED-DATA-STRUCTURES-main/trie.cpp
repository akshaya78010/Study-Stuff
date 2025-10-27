#include<bits/stdc++.h>
using namespace std;
class Node{
private:
    Node *array[26];
    bool flag;
public:
    Node(){
    for(int i = 0; i < 26 ; i++)
    {
        array[i] = NULL;
    }
       flag = false;
   }
   //char is conatined or not
    bool contain(char ch)
    {
        return array[ch - 'a'] != NULL;
    }
   //lekapothe char pettu
    void put(char ch,Node *node)
    {
     array[ch - 'a'] = node;
    }
    Node* next(char ch)
    {
        return array[ch - 'a'];
    }
   //flag ni set cheyyi
    void set()
    {
        flag = true;
    }
   //flag ni return cheyyi
    bool end()
    {
        return flag;
    }
};
class Trie{
private:
    Node *root = new Node();
//insertion
public:
void insert(string word)
{
    Node *temp = root;
for(auto ch:word)
{
    if(!temp->contain(ch))
    {
        temp->put(ch,new Node());
    }
    temp = temp->next(ch);
}
temp->set();
}
bool search(string word)
{
Node *temp = root;
for(auto ch:word)
{
if(!temp->contain(ch))
{
    return false;
}
temp = temp->next(ch);
}
return temp->end();
}
};
int main()
{
    vector<string>words = {"dog","bat","cat"};
    Trie trie;
    for(int i = 0; i < 3 ; i++)
    {
        trie.insert(words[i]);
    }
    string str = "bata";
    if(!trie.search(str))
    {
        cout<<"no";
    }
    else
    {
        cout<<"yes";
    }
}
