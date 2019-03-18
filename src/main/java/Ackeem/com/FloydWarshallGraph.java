package Ackeem.com;
import java.io.BufferedReader;
import java.io.File;
import java.util.Iterator;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import java.io.FileReader;


public class FloydWarshallGraph {


    public static void main(String[] args) {
         /*public FloydWarshallGraph() {*/
            Graph graph = new SingleGraph("tutorial 1");

            File file = new File("src\\main\\java\\Ackeem\\com\\towns\\FloydWarshallGraph.txt");

            try{
                BufferedReader br = new BufferedReader(new FileReader(file));

                String st;
                while ((st = br.readLine()) != null)
                    graph.addNode(st);//ADD NODES TO GRAPH. fFROM TXT FILE
            }catch(Exception e){
                e.printStackTrace();
            }

        /*}*/
    }




      /*  graph.setStrict(false);
        graph.setAutoCreate(true);
        graph.display();*/

        /*graph.addNode()

        graph.addEdge("AB", "A", "B");
        graph.addEdge("BC", "B", "C");
        graph.addEdge("CA", "C", "A");
        graph.addEdge("AD", "A", "D");
        graph.addEdge("DE", "D", "E");
        graph.addEdge("DF", "D", "F");
        graph.addEdge("EF", "E", "F");*/
    }
