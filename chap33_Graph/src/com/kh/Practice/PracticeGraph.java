package com.kh.Practice;

import com.kh.BFS.Graph;

public class PracticeGraph {

	public static void main(String[] args) {
		PracticeGraph ph = new PracticeGraph();
		ph.BFSPracticeMain();
		//ph.DFSPracticeMain();
	}
	
	public void BFSPracticeMain() {
		Graph bfs = new Graph(7);
		
		bfs.addEdge(0, 1);
		bfs.addEdge(0, 3);
		bfs.addEdge(1, 2);
		bfs.addEdge(1, 5);
		bfs.addEdge(3, 6);
		bfs.addEdge(3, 4);
		
		System.out.println("BFS Å½»ö°á°ú : ");
		
		bfs.BFS(0);
	}

	public void DFSPracticeMain() {
		int ver = 7;
		Graph dfs = new Graph(ver);
		
		dfs.addEdge(0, 1);
		dfs.addEdge(0, 2);
		dfs.addEdge(1, 3);
		dfs.addEdge(1, 4);
		dfs.addEdge(1, 5);
		dfs.addEdge(2, 6);
		
		System.out.println("DFS Å½»ö °á°ú : ");
		dfs.DFS(0);
	}
}