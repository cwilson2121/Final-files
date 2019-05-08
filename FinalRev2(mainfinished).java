//Chris, Austin, Ethan, Cayden
import java.util.*;
import java.io.*;
public class FinalRev2
{
    private static int colorCount;
    private static int[][] adjacencyList;

    public static int[] color(Graph g)
    {
        int[] results = new int[g.getVertexCount()];
        results[0] = 0;
        for (int i = 1; i < g.getVertexCount(); i++ )
        {
            //Assign a color to each vertex. Test for touching colors. Increment color as necessary.
            int color = 0;
            results[i] = color;
            while(testTouching(results[i], results, g))
            {
                color++;
                results[i] = color;
            }
        }
        return results;
    }

    private static boolean testTouching(int vertex, int[] results, Graph g)
    {
        for (int i = 1; i < g.adjacencyList[vertex].length; i++ )
        {
            if(results[vertex] == results[g.adjacencyList[vertex][i]])
            {
                return true;
            }
        }
        return false;

    }

    private static void bubbleSort(int[] results)
    {
        for (int i = 0; i < results.length-1; i++)
        {
            for (int j = 0; i < results.length; j++)
            {
                if(results[j] > results[j+1])
                {
                    int temp = results[j];
                    results[j] = results[j+1];
                    results[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException
    {
        //Read in adjacency list
        File graphFile = new File(args[0]);
        Graph g = new Graph(graphFile);
        System.out.println();
        
        int[] results = color(g); 
        for(int i = 0; i < results.length; i++)
        {
            System.out.println(results[i]);
        }
        
        //Test to see the number of different colors.
        bubbleSort(results);
        for(int i = 0; i < results.length-1; i++)
        {
            if(results[i] != results[i+1])
                colorCount++;
        }
        System.out.println("This graph has a minimum of " + colorCount + " colors.");
    }
}
