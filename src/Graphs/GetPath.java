package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GetPath {
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
        HashMap<Integer,Boolean> visited = new HashMap<>();
        ArrayList<Integer> path = getPath(adjacencyList,s.nextInt(),s.nextInt(),visited);
        for(int val : path){
            System.out.print(val + " ");
        }
    }

    public  static ArrayList<Integer> getPath(HashMap<Integer, ArrayList<Integer>> adjacencyList, int source,int dest,HashMap<Integer,Boolean> visited){
        visited.put(source,true);
        if(source == dest){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(source);
        }
        for(int adjacencyVertex : adjacencyList.get(source)){
            if(adjacencyList.containsKey(adjacencyVertex)){
                ArrayList<Integer> subPath = getPath(adjacencyList,adjacencyVertex,dest,visited);
                if(subPath != null)
                    subPath.add(adjacencyVertex);
                    return  subPath;
            }
        }
        return null;
    }
}
