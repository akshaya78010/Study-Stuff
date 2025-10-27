#include <iostream>
#include <vector>
#include <queue>
using namespace std;

// Function for Breadth-First Traversal (BFT)
void bft(int start, vector<vector<int>>& adjMatrix, vector<bool>& visited) {
    int n = adjMatrix.size();
    queue<int> q;

    visited[start] = true;
    q.push(start);

    while (!q.empty()) {
        int node = q.front();
        q.pop();
        cout << node << " "; // Print the node when visited

        // Traverse all adjacent nodes of the current node
        for (int i = 0; i < n; i++) {
            if (adjMatrix[node][i] == 1 && !visited[i]) { // Check for an edge and unvisited node
                visited[i] = true;
                q.push(i);
            }
        }
    }
}

// Function for Depth-First Traversal (DFT)
void dft(int node, vector<vector<int>>& adjMatrix, vector<bool>& visited) {
    visited[node] = true;
    cout << node << " "; // Print the node when visited

    // Traverse all adjacent nodes of the current node
    for (int i = 0; i < adjMatrix.size(); i++) {
        if (adjMatrix[node][i] == 1 && !visited[i]) { // Check for an edge and unvisited node
            dft(i, adjMatrix, visited);
        }
    }
}

int main() {
    int n, e;
    cout << "Enter the number of nodes and edges: ";
    cin >> n >> e;

    // Create adjacency matrix and initialize with 0
    vector<vector<int>> adjMatrix(n, vector<int>(n, 0));

    cout << "Enter the edges (u v):" << endl;
    for (int i = 0; i < e; i++) {
        int u, v;
        cin >> u >> v;
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1; // For undirected graph
    }

    // BFT starting from node 0
    vector<bool> visited(n, false);
    cout << "BFT: ";
    bft(0, adjMatrix, visited);
    cout << endl;

    // DFT starting from node 0
    fill(visited.begin(), visited.end(), false); // Reset visited array
    cout << "DFT: ";
    dft(0, adjMatrix, visited);
    cout << endl;

    return 0;
}
