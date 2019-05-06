import java.util.*;
import java.io.*;
public class ColorMap
{
    private static int colorCount;
    private int[] adjacencyList;
    
    public boolean Color
    {
        
    }   
    public static void main(String[] args)
    {
        
        //Read in adjacnecy list
        File graphFile = new File(args[0]);
        Graph g = new Graph(graphFile);
        
        adjacencyList = new int[vertexCount][vertexCount];
        
        for(int i = 0; i < g.getVertexCount(); i++)
        {
            adjacencyList
        }
            
         
         
        Color(graph);
        System.out.println("This graph has a minimum of " + ColorCount + " colors.")
    }
