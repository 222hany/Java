package com.kh.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class Graph { // Graph 클래스 : 자료 구조를 나타냄
	private int V; // 그래프의 정점 수
	private LinkedList<Integer>[] adj; // 인접리스트
	
	// 그래프 초기화
	public Graph(int v) { // 그래프 클래스의 생성자에서 그래프의 정점 수(V)를 받아서 초기화
		this.V = v;
		adj = new LinkedList[v]; // adj : 인접리스트를 나타내고 각 정점마다 인접한 정점들의 목록을 저장
		for(int i = 0; i < v; ++i) {
			adj[i] = new LinkedList();
		}
	}
	
	// addEdge : 그래프에 간선을 추가
	public void addEdge(int v, int w) { // v와 w가 간선의 양 끝 정점을 나타냄
		adj[v].add(w);
	}
	
	// BFS 탐색을 수행
	public void BFS(int start) {
		boolean[] visited = new boolean[V]; // visited : 각 정점의 방문 여부를 추적하고 표시하기 위한 배열
		Queue<Integer> queue = new LinkedList<>(); // Queue : BFS를 위한 데이터 구조로 사용
		
		visited[start] = true;
		queue.add(start); // 탐색은 시작노드(start)에서 시작하고 시작노드를 방문하고 큐에 추가
		
		while(!queue.isEmpty()) { // 큐가 이어질 때 까지 반복적으로 다음 단계의 인접한 노드를 방문
			start = queue.poll();
			System.out.print(start + " ");
			
			for(Integer neighbor : adj[start]) {
				if(!visited[neighbor]) {
					visited[neighbor] = true;
					queue.add(neighbor);
				}
			}
		}
	}

	public void DFS(int i) {
		
	}

}
