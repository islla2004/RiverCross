import java.util.LinkedList;

public class SearchAlgorithm {
    // NIMA SAEIDI / SANA GHORBANI / SANA GHOLINAVAZ / BITA RAZPOOR
    private LinkedList<Node> unexpandedNodes;
    private LinkedList<Node> expandedNodes;
    private Node target;


    private boolean isValid(Node node){
              boolean[] a=node.getState();
            boolean father=a[0];
          boolean mother =a[1];
            boolean son1 =a[2];
         boolean  son2 =a[3];
           boolean police =a[4];
            boolean thief =a[5];
           boolean dauther1 =a[6];
            boolean dauther2 =a[7];

        boolean flag1,flag2,flag3;
         if (((!father) && (mother) && (!dauther1 ||!dauther2))||((father)&&(!mother)&&(dauther1||dauther2))){
             flag1=false;
        }
        else{
            flag1=true;
        }
         if (((!mother)&&(father)&&(!son1||!son2))||((mother)&&(!father)&&(son2||son1))){
             flag2=false;
         }
        else {
            flag2=true;
         }
           if( (
                   ((!police)&&(thief)&&((mother)||(father)||(son1)||(son2)||(dauther2)||(dauther1)))
           )
               ||
        (
                ((police)&&(!thief))&&((!mother)||(!father)||(!son1)||(!son2)||(!dauther1)||(!dauther2))
                )
)
               flag3=false;



else {
    flag3=true;
           }

return flag1 && flag2 && flag3;












        }
    private  boolean isGoal(Node node){
        return node.getState()[0]&&node.getState()[1]&&node.getState()[2]&&node.getState()[3]&&node.getState()[4]&&
                node.getState()[5]&&node.getState()[6]&&node.getState()[7]&&
                node.getState()[8];
    }

    private LinkedList<Node> generateChildren(Node node) {


        LinkedList<Node> nodeLinkedList = new LinkedList<>();
        boolean[] a = node.getState();
        boolean father = !a[0];
        boolean mother = !a[1];
        boolean son1 = !a[2];
        boolean son2 = !a[3];
        boolean police = !a[4];
        boolean thief = !a[5];
        boolean dauther1 = !a[6];
        boolean dauther2 = !a[7];
        boolean boat = !a[8];

        if (boat) {
            if (mother && father) {
                Node n = new Node();
                n.setFatherNode(node);

                n.setMother(true);
                n.setFather(true);
                n.setBoat(true);
                n.Clone(n);
                if (isValid(n)){
                    nodeLinkedList.add(n);
                }
                if (isGoal(n)){
                    return nodeLinkedList;
                }

            }
            if (mother && police) {
                Node n = new Node();
                n.setFatherNode(node);
                 n.setMother(true);
                n.setPolice(true);
                n.setBoat(true);
                n.Clone(n);
                if (isValid(n)){
                    nodeLinkedList.add(n);
                }
                if (isGoal(n)){
                    return nodeLinkedList;
                }

            }
            if (police && father) {
                Node n = new Node();
                n.setFatherNode(node);


                n.setPolice(true);
                n.setFather(true);
                n.setBoat(true);
                n.Clone(n);
                if (isValid(n)){
                    nodeLinkedList.add(n);
                }
                if (isGoal(n)){
                    return nodeLinkedList;
                }

            }
            if (mother) {

                if (son1) {
                    Node n = new Node();
                    n.setFatherNode(node);
                     n.setMother(true);
                    n.setSon1(true);
                    n.setBoat(true);
                    n.Clone(n);
                    if (isValid(n)){
                        nodeLinkedList.add(n);
                    }
                    if (isGoal(n)){
                        return nodeLinkedList;
                    }
                 }

                if (son2) {
                    Node n = new Node();
                    n.setFatherNode(node);

                    n.setMother(true);
                    n.setSon2(true);
                    n.setBoat(true);
                    n.Clone(n);
                    if (isValid(n)){
                        nodeLinkedList.add(n);
                    }
                    if (isGoal(n)){
                        return nodeLinkedList;
                    }
                }
                if (dauther1) {
                    Node n = new Node();
                    n.setFatherNode(node);

                    n.setMother(true);
                    n.setDuather1(true);
                    n.setBoat(true);
                    n.Clone(n);
                    if (isValid(n)){
                        nodeLinkedList.add(n);
                    }
                    if (isGoal(n)){
                        return nodeLinkedList;
                    }
                }
                if (dauther2) {
                    Node n = new Node();
                    n.setFatherNode(node);

                    n.setMother(true);
                    n.setDuather2(true);
                    n.setBoat(true);
                    n.Clone(n);
                    if (isValid(n)){
                        nodeLinkedList.add(n);
                    }
                    if (isGoal(n)){
                        return nodeLinkedList;
                    }
                }
                Node n = new Node();
                n.setFatherNode(node);


                n.setMother(true);
                n.setBoat(true);
                n.Clone(n);
                if (isValid(n)){
                    nodeLinkedList.add(n);
                }
                if (isGoal(n)){
                    return nodeLinkedList;
                }
            }
            if (father) {

                if (son1) {
                    Node n = new Node();
                    n.setFatherNode(node);

                     n.setFather(true);
                    n.setSon1(true);
                    n.setBoat(true);
                    n.Clone(n);
                    if (isValid(n)){
                        nodeLinkedList.add(n);
                    }
                    if (isGoal(n)){
                        return nodeLinkedList;
                    }
                }

                if (son2) {
                    Node n = new Node();
                    n.setFatherNode(node);

                    n.setFather(true);
                    n.setSon2(true);
                    n.setBoat(true);
                    n.Clone(n);
                    if (isValid(n)){
                        nodeLinkedList.add(n);
                    }
                    if (isGoal(n)){
                        return nodeLinkedList;
                    }
                }
                if (dauther1) {
                    Node n = new Node();
                    n.setFatherNode(node);

                    n.setFather(true);
                    n.setDuather1(true);
                    n.setBoat(true);
                    n.Clone(n);
                    if (isValid(n)){
                        nodeLinkedList.add(n);
                    }
                    if (isGoal(n)){
                        return nodeLinkedList;
                    }
                }
                if (dauther2) {
                    Node n = new Node();
                    n.setFatherNode(node);


                    n.setFather(true);
                    n.setDuather2(true);
                    n.setBoat(true);
                    n.Clone(n);
                    if (isValid(n)){
                        nodeLinkedList.add(n);
                    }
                    if (isGoal(n)){
                        return nodeLinkedList;
                    }
                }
                Node n = new Node();
                n.setFatherNode(node);


                n.setFather(true);
                n.setBoat(true);
                n.Clone(n);
                if (isValid(n)){
                    nodeLinkedList.add(n);
                }
                if (isGoal(n)){
                    return nodeLinkedList;
                }
            }
            if (police) {

                if (son1) {
                    Node n = new Node();
                    n.setFatherNode(node);
                    n.setPolice(true);
                    n.setSon1(true);
                    n.setBoat(true);
                    n.Clone(n);
                    if (isValid(n)){
                        nodeLinkedList.add(n);
                    }
                    if (isGoal(n)){
                        return nodeLinkedList;
                    }
                }

                if (son2) {
                    Node n = new Node();
                    n.setFatherNode(node);

                    n.setPolice(true);
                    n.setSon2(true);
                    n.setBoat(true);
                    n.Clone(n);
                    if (isValid(n)){
                        nodeLinkedList.add(n);
                    }
                    if (isGoal(n)){
                        return nodeLinkedList;
                    }

                }
                if (dauther1) {
                    Node n = new Node();
                    n.setFatherNode(node);
                    n.setPolice(true);
                    n.setDuather1(true);
                    n.setBoat(true);
                    n.Clone(n);
                    if (isValid(n)){
                        nodeLinkedList.add(n);
                    }
                    if (isGoal(n)){
                        return nodeLinkedList;
                    }
                 }
                if (dauther2) {
                    Node n = new Node();
                    n.setFatherNode(node);

                    n.setPolice(true);
                    n.setDuather2(true);
                    n.setBoat(true);
                    n.Clone(n);
                    if (isValid(n)){
                        nodeLinkedList.add(n);
                    }
                    if (isGoal(n)){
                        return nodeLinkedList;
                    }

                }
                if (thief) {
                    Node n = new Node();
                    n.setFatherNode(node);
                    n.setPolice(true);
                    n.setThief(true);
                    n.setBoat(true);
                    n.Clone(n);
                    if (isValid(n)){
                        nodeLinkedList.add(n);
                    }
                    if (isGoal(n)){
                        return nodeLinkedList;
                    }

                }
                Node n = new Node();
                n.setFatherNode(node);


                n.setPolice(true);
                n.setBoat(true);
                n.Clone(n);
                if (isValid(n)){
                    nodeLinkedList.add(n);
                }
                if (isGoal(n)){
                    return nodeLinkedList;
                }

            }
        }
            else {

            if (!mother && !father) {
                Node n = new Node();
                n.setFatherNode(node);


                n.setMother(false);
                n.setFather(false);
                n.setBoat(false);
                n.Clone(n);
                if (isValid(n)){
                    nodeLinkedList.add(n);
                }

            }
            if (!mother && !police) {
                Node n = new Node();
                n.setFatherNode(node);


                n.setMother(false);
                n.setPolice(false);
                n.setBoat(false);
                n.Clone(n);
                if (isValid(n)){
                    nodeLinkedList.add(n);
                }
             }
            if (!police && !father) {
                Node n = new Node();
                n.setFatherNode(node);


                n.setPolice(false);
                n.setFather(false);
                n.setBoat(false);
                n.Clone(n);
                if (isValid(n)){
                    nodeLinkedList.add(n);
                }

            }
            if (!mother) {

                if (!son1) {
                    Node n = new Node();
                    n.setFatherNode(node);

                      n.setMother(false);
                    n.setSon1(false);
                    n.setBoat(false);
                    n.Clone(n);
                    if (isValid(n)){
                        nodeLinkedList.add(n);
                    }
                }

                if (!son2) {
                    Node n = new Node();
                    n.setFatherNode(node);

                    n.setMother(false);
                    n.setSon2(false);
                    n.setBoat(false);
                    n.Clone(n);
                    if (isValid(n)){
                        nodeLinkedList.add(n);
                    }

                }
                if (!dauther1) {
                    Node n = new Node();
                    n.setFatherNode(node);

                    n.setMother(false);
                    n.setDuather1(false);
                    n.setBoat(false);
                    n.Clone(n);
                    if (isValid(n)){
                        nodeLinkedList.add(n);
                    }
                }
                if (!dauther2) {
                    Node n = new Node();
                    n.setFatherNode(node);

                    n.setMother(false);
                    n.setDuather2(false);
                    n.setBoat(false);
                    n.Clone(n);
                    if (isValid(n)){
                        nodeLinkedList.add(n);
                    }

                }
                Node n = new Node();
                n.setFatherNode(node);


                n.setMother(false);
                n.setBoat(false);
                n.Clone(n);
                if (isValid(n)){
                    nodeLinkedList.add(n);
                }

            }
            if (!father) {

                if (!son1) {
                    Node n = new Node();
                    n.setFatherNode(node);

                     n.setFather(false);
                    n.setSon1(false);
                    n.setBoat(false);
                    n.Clone(n);
                    if (isValid(n)){
                        nodeLinkedList.add(n);
                    }

                }

                if (!son2) {
                    Node n = new Node();
                    n.setFatherNode(node);

                    n.setFather(false);
                    n.setSon2(false);
                    n.setBoat(false);
                    n.Clone(n);
                    if (isValid(n)){
                        nodeLinkedList.add(n);
                    }

                }
                if (!dauther1) {
                    Node n = new Node();
                    n.setFatherNode(node);
                    n.setFather(false);
                    n.setDuather1(false);
                    n.setBoat(false);
                    n.Clone(n);
                    if (isValid(n)){
                        nodeLinkedList.add(n);
                    }

                }
                if (!dauther2) {
                    Node n = new Node();
                    n.setFatherNode(node);

                    n.setFather(false);
                    n.setDuather2(false);
                    n.setBoat(false);
                    n.Clone(n);
                    if (isValid(n)){
                        nodeLinkedList.add(n);
                    }

                }
                Node n = new Node();
                n.setFatherNode(node);


                n.setFather(false);
                n.setBoat(false);
                n.Clone(n);
                if (isValid(n)){
                    nodeLinkedList.add(n);
                }

            }
            if (!police) {

                if (!son1) {
                    Node n = new Node();
                    n.setFatherNode(node);
                    n.setPolice(false);
                    n.setSon1(false);
                    n.setBoat(false);
                    n.Clone(n);
                    if (isValid(n)){
                        nodeLinkedList.add(n);
                    }

                }

                if (!son2) {
                    Node n = new Node();
                    n.setFatherNode(node);

                    n.setPolice(false);
                    n.setSon2(false);
                    n.setBoat(false);
                    n.Clone(n);
                    if (isValid(n)){
                        nodeLinkedList.add(n);
                    }
                }
                if (!dauther1) {
                    Node n = new Node();
                    n.setFatherNode(node);

                    n.setPolice(false);
                    n.setDuather1(false);
                    n.setBoat(false);
                    n.Clone(n);
                    if (isValid(n)){
                        nodeLinkedList.add(n);
                    }
                }
                if (!dauther2) {
                    Node n = new Node();
                    n.setFatherNode(node);

                    n.setPolice(false);
                    n.setDuather2(false);
                    n.setBoat(false);
                    n.Clone(n);
                    if (isValid(n)){
                        nodeLinkedList.add(n);
                    }
                }
                if (!thief) {
                    Node n = new Node();
                    n.setFatherNode(node);
                    n.setPolice(false);
                    n.setThief(false);
                    n.setBoat(false);
                    n.Clone(n);
                    if (isValid(n)){
                        nodeLinkedList.add(n);
                    }

                }
                Node n = new Node();
                n.setFatherNode(node);


                n.setPolice(false);
                n.setBoat(false);
                n.Clone(n);
                if (isValid(n)){
                    nodeLinkedList.add(n);
                }

            }


            }

       return nodeLinkedList;

    }
        public Node search (Node starterNode){
        unexpandedNodes=new LinkedList<>();
        unexpandedNodes.add(starterNode);
        unexpandedNodes.addAll(generateChildren(starterNode));
          /*   while (true){
                 unexpandedNodes.addAll(generateChildren(unexpandedNodes.getLast()));
                 if (isGoal(unexpandedNodes.getLast())){
                     break;
                 }



             }

        /*while (unexpandedNodes.size()!=0&&!isGoal(unexpandedNodes.getLast())){
            generateChildren(unexpandedNodes.getLast());

        }*/
        if (unexpandedNodes.size()==0) return null;
        else return unexpandedNodes.getLast();








       /* Node goal =new Node();
     unexpandedNodes = new LinkedList<>();
            expandedNodes=new LinkedList<>();

            unexpandedNodes.add(starterNode);
            expandedNodes.add(target);

            if (unexpandedNodes.size() == 0) {
                System.out.println("cant solve");
                return null;
            }
            target = unexpandedNodes.getLast();
            unexpandedNodes.removeLast();
            unexpandedNodes.addAll(generateChildren(target));

                      if (isValid(target)) {
                          if (!starterNode.equals(target)) {
                              if (isGoal(target)) {
                                  goal = target;
                                  return goal;
                              }
                          }
                      } else {
                          target = unexpandedNodes.getLast();
                          unexpandedNodes.removeLast();
                          search(target);
                      }
                        return goal;

*/
        }

        public LinkedList<Node> getExpandedNodes(){
        return expandedNodes;
        }









}
