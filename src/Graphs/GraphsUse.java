package Graphs;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class GraphsUse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numE = s.nextInt();
        int numV = s.nextInt();
        HashMap<Integer, ArrayList<Integer>> adjacencyList = new HashMap<>();
        int count = 1;
        while (count <= numE) {
            int source = s.nextInt();
            int dest = s.nextInt();
            if (adjacencyList.containsKey(source)) {
                adjacencyList.get(source).add(dest);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(dest);
                adjacencyList.put(source, list);
            }

            if (adjacencyList.containsKey(dest)) {
                adjacencyList.get(dest).add(source);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(source);
                adjacencyList.put(dest, list);
            }
            count++;
        }
        printDfs(adjacencyList);
        System.out.print(isConnected(adjacencyList));
        System.out.print(hasPath(adjacencyList,s.nextInt(),s.nextInt()));
    }

    public static void printDfs(HashMap<Integer, ArrayList<Integer>> adjacencyList) {
        HashMap<Integer, Boolean> visited = new HashMap<>();
        for (int vertex : adjacencyList.keySet()) {
            if (!visited.containsKey(vertex)) {
                dfsHelper(adjacencyList, vertex, visited);
            }
        }
    }

    public static void dfsHelper(HashMap<Integer, ArrayList<Integer>> adjacencyList, int source, HashMap<Integer, Boolean> visited) {
        System.out.print(source + " ");
        visited.put(source, true);
        for (int adjacentVertex : adjacencyList.get(source)) {
            if (!visited.containsKey(adjacentVertex)) {
                dfsHelper(adjacencyList, adjacentVertex, visited);
            }
        }
    }

    public static boolean isConnected(HashMap<Integer, ArrayList<Integer>> adjacencyList) {
        HashMap<Integer, Boolean> visited = new HashMap<>();
        dfsHelper(adjacencyList, 1, visited);
        return visited.size() == adjacencyList.size();
    }

    public static boolean hasPath(HashMap<Integer, ArrayList<Integer>> adjacencyList, int source,int dest){
        HashMap<Integer, Boolean> visited = new HashMap<>();
        dfsHelper(adjacencyList, source, visited);
        return visited.containsKey(dest);
    }

}
