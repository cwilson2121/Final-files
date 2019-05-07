import java.util.*;
import java.io.*;
public class ColorMap
{
    private static int colorCount;
    private int[] adjacencyList;

    public boolean color
    {
        int[] results = new int[g.getVertexCount()];
        results[0] = 0;
        for (int i = 1; i < g.getVertexCount(); i++ )
        {
            //Assign a color to each vertex. Test for touching colors. Increment color as necessary.
            int color = 0;
            results[i] = color;
            while(testTouching(results[i], results))
            {
                color++;
                results[i] = color;
            }
        }

    }

    private boolean testTouching(int vertex, int[] results)
    {
        for (int i = 1; i < g.adjacencyList[vertex].length; i++ )
        {
            if(results[vertex] == g.adjacencyList[vertex][i])
            

        }

    }

    public static void main(String[] args)
    {

        //Read in adjacnecy list
        File graphFile = new File(args[0]);
        Graph g = new Graph(graphFile);

        adjacencyList = new int[vertexCount][vertexCount];

        for(int i = 0; i < g.getVertexCount(); i++)
        {
            adjacencyList;
        }



        Color(graph);
        System.out.println("This graph has a minimum of " + ColorCount + " colors.")
    }
