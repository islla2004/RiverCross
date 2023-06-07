import java.util.LinkedList;

public class Main {
// NIMA SAEIDI / SANA GHORBANI / SANA GHOLINAVAZ / BITA RAZPOOR
public static int transferIndex;




    public static Node initialState(){

        Node node=new Node();
         node.setPolice(false);
          node.setThief(false);
          node.setFather(false);
          node.setDuather2(false);
          node.setSon1(false);
          node.setSon2(false);
          node.setDuather1(false);
          node.setMother(false);
          node.setBoat(false);
          node.setFatherNode(null);
       return node;

    }

    public static void show(Node node){


        System.out.println("transfer index :");
        System.out.println(transferIndex);
        node.toString(node);

         transferIndex++;
    }
    public static void showPath(Node node){

            show(node);

            if (node.getFatherNode() != null) {
                showPath(node.getFatherNode());

            }


        

    }

    public static void main(String[] args) {

     SearchAlgorithm searchAlgorithm=new SearchAlgorithm();
     Node result;
     result=searchAlgorithm.search(initialState());
        showPath(result);



    }
}