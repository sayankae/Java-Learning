abstract class NewChild implements Parent{
    abstract void display();

    interface Node{
        void display();
    }
}

public class AbstractClass extends NewChild{


    @Override
    void display() {
        System.out.println("This method was in Parent Interface.");
    }

    @Override
    public void displayParent() {
        System.out.println("This method was in Abstract Class");
    }

    static class NewNode implements Node{
        @Override
        public void display() {
            System.out.println("Implemented Node from Node Interface.");
        }
    }

    public static void main(String []args){
        AbstractClass obj = new AbstractClass();
        obj.display();
        obj.displayParent();
        new AbstractClass.NewNode().display();

    }
}
