import java.util.LinkedList;

public class Node {
    // NIMA SAEIDI / SANA GHORBANI / SANA GHOLINAVAZ / BITA RAZPOOR
    private boolean father;
    private boolean mother;
    private boolean son1;
    private boolean son2;
    private boolean duather1;
    private boolean duather2;
    private boolean police;
    private boolean thief;
    private boolean boat;
    private Node fatherNode;
    private boolean [] state;



    public boolean equals(Node targetNode){
          SearchAlgorithm searchAlgorithm=new SearchAlgorithm();

        for (int i = 0; i < searchAlgorithm.getExpandedNodes().size(); i++) {
            boolean[] s=searchAlgorithm.getExpandedNodes().get(i).getState();
             boolean[] f=targetNode.getState();
            boolean[] t={true,true,true,true,true,true,true,true,true};
             boolean[] flag=new boolean[9];
              if (s[i]==f[i]){
                  flag[i]=true;
              }
            if (flag ==t) {
                return true;

            }
        }
    return false;
    }


    public String toString(Node node){
        System.out.println("boat latest transfer :");
          boolean[] booleans= node.getFatherNode().getState();
                boolean [] r= node.getState();
                if (booleans[0]!=r[0]){
                    System.out.println("father");
                }if (booleans[1]!=r[1]){
                    System.out.println("mother");
                } if (booleans[2]!=r[2]){
                    System.out.println("son1");
                } if (booleans[3]!=r[3]){
                    System.out.println("son2");
                } if (booleans[4]!=r[4]){
                    System.out.println("police");
                } if (booleans[5]!=r[5]){
                    System.out.println("thief");
                } if (booleans[6]!=r[6]){
                    System.out.println("duather1");
                } if (booleans[7]!=r[7]){
                    System.out.println("duather2");
                }


        System.out.println("________________________________________");
        System.out.println("Boat location :");
        if (boat){
            System.out.println("region2");
        }
        else {
            System.out.println("region1");
        }
        System.out.println("_________________________________________");
        System.out.println("region1:");
        if (!mother) System.out.println("mother");
        if (!father) System.out.println("father");
        if (!son1) System.out.println("son1");
        if (!son2) System.out.println("son2");
        if (!police) System.out.println("police");
        if (!thief) System.out.println("thief");
        if (!duather1) System.out.println("dauther1");
        if (!duather2) System.out.println("dauther2");
        System.out.println("__________________________________________");
        System.out.println("region2:");
        if (mother) System.out.println("mother");
        if (father) System.out.println("father");
        if (son1) System.out.println("son1");
        if (son2) System.out.println("son2");
        if (police) System.out.println("police");
        if (thief) System.out.println("thief");
        if (duather1) System.out.println("dauther1");
        if (duather2) System.out.println("dauther2");
        System.out.println("________________________________________");


        return "";
    }


    public Node Clone(Node node){
         Node n=node;

         return n;

    }


     public boolean[] getState(){
        state=new boolean[9];
        state[0]=this.father;
        state[1]=this.mother;
        state[2]=this.son1;
        state[3]=this.son2;
        state[4]=this.police;
        state[5]=this.thief;
        state[6]=this.duather1;
        state[7]=this.duather2;
        state[8]=this.boat;
        return state;
    }
     public void setFather(boolean father) {
         this.father = father;
     }
    public void setMother(boolean mother) {
        this.mother = mother;
    }
    public void setSon2(boolean son2) {
        this.son2 = son2;
    }
    public void setSon1(boolean son1) {
        this.son1 = son1;
    }
    public void setPolice(boolean police) {
        this.police = police;
    }
    public void setBoat(boolean boat) {
        this.boat = boat;
    }
    public void setDuather1(boolean duather1) {
        this.duather1 = duather1;
    }
    public void setDuather2(boolean duather2) {
        this.duather2 = duather2;
    }
    public void setThief(boolean thief) {
        this.thief = thief;
    }




    public void setFatherNode(Node fatherNode) {
        this.fatherNode = fatherNode;
    }
    public Node getFatherNode(){
        return this.fatherNode;
    }
}
