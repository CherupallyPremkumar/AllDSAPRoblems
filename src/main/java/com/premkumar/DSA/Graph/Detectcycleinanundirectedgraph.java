package com.premkumar.DSA.Graph;

import java.util.*;

public class Detectcycleinanundirectedgraph {
    private int V;
    private LinkedList<Integer>[] adj;

    public Detectcycleinanundirectedgraph(int v) {
           V=v;
           adj=new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i]=new LinkedList();
        }
    }
    private void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }
    void pr()
    {

        System.out.println(Arrays.toString(adj));
    }
    public static void main(String[] args)
    {
        Detectcycleinanundirectedgraph g1 = new Detectcycleinanundirectedgraph(5);
        g1.addEdge(1, 0);
        g1.addEdge(0, 2);
        g1.addEdge(2, 1);
        g1.addEdge(0, 3);
        g1.addEdge(3, 4);
        if (g1.isCyclic())
            System.out.println("Detectcycleinanundirectedgraph contains cycle");
        else
            System.out.println("Detectcycleinanundirectedgraph doesn't contain cycle");
        Detectcycleinanundirectedgraph g2 = new Detectcycleinanundirectedgraph(3);
        g2.addEdge(0, 1);
        g2.addEdge(1, 2);
        if (g2.isCyclic())
            System.out.println("Detectcycleinanundirectedgraph contains cycle");
        else
            System.out.println("Detectcycleinanundirectedgraph doesn't contain cycle");
        g1.pr();
    }

    private boolean isCyclic() {
        Boolean[] visited = new Boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;
        for (int u = 0; u < V; u++) {

            // Don't recur for u if already visited
            if (!visited[u])
                if (isCyclicUtil(u, visited, -1))
                    return true;
        }
        return false;
    }

    private boolean isCyclicUtil(int v, Boolean[] visited, int parent) {
        visited[v] = true;
        Integer i;
        for (Integer integer : adj[v]) {
            i = integer;
            if (!visited[i]) {
                if (isCyclicUtil(i, visited, v))
                    return true;
            }
            else if (i != parent)
                return true;
        }
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 3, 4, 5));
        return false;
    }



}
