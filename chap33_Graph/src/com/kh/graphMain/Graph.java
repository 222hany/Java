package com.kh.graphMain;

import java.util.LinkedList;
// Graph Class : ��������Ʈ�� ����ؼ� ���� ������ ����.
public class Graph {
	private int V; // �׷����� ��� ��
	
	// adjList ��������Ʈ �迭. �� ��帶�� ����� ������ �����ϱ� ���� LinkedList ��ü�迭�� �ʱ�ȭ.
	private LinkedList<Integer>[] adjList;
	
	// �׷��� ������
	// �׷��� ũ��(��� ��)�� �޾ƿͼ� �׷����� �ʱ�ȭ. adjList�迭�� �� ���Ҹ� �� LinkedList�� �ʱ�ȭ.
	public Graph(int ver) {
		V = ver;
		adjList = new LinkedList[ver];
		for(int i = 0; i < ver; i++) {
			adjList[i] = new LinkedList<>();
		}
	}
	
	// addEdge : �׷����� ���ο� ������ �߰�.
	public void addEdge(int source, int des) {
		// source���� des�� ���� ������ �߰��ϸ� adjList�迭���� source�� �ش��ϴ� LinkedList�� des�߰�.
		adjList[source].add(des);
	}
	
	// �׷��� Ž��(���� �켱 Ž��)
	// ���� �켱 Ž���� �����ϰ�, ���� ��带 �Ű������� ����.
	public void DFS(int startNode) {
		// �湮���θ� �����ϱ� ���� visited �迭 �ʱ�ȭ
		boolean[] visited = new boolean[V];
		DFSUtil(startNode, visited);
	}
	
	// ���� ���� �켱 Ž�� ����
	private void DFSUtil(int currentNode, boolean[] visited) {
		// ���� ��带 �湮�� ������ ǥ��
		visited[currentNode] = true;
		System.out.println(currentNode + " "); // ����ȣ ���
		
		// ���� ���� ����� ���� ��带 Ȯ���ϰ� �湮���� ���� ������带 �����(������ �ڸ��� ���ƿ��ų� �ǵ��ƿ���)���� �湮
		for(int neighbor : adjList[currentNode]) {
			if(!visited[neighbor]) {
				DFSUtil(neighbor, visited);
			}
		}
	}
}