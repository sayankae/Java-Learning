interface Parent {
    //method inside interface are abstract
    void displayParent();
}

//Class inside interface
//Extending Interface
interface Child extends Parent {
    void displayChild();

    class Talent {
        String talent;

        Talent(String talent) {
            this.talent = talent;
        }

        @Override
        public String toString() {
            return "Talent{" +
                    "talent='" + talent + '\'' +
                    '}';
        }
    }
}

class Sunny implements Child {
    public void displayParent() {
        System.out.println("Parent : Painter");
    }

    public void displayChild() {
        System.out.println("Child : Poet");
    }

}


public class InterfaceDefinition {
    public static void main(String[] args) {
        Sunny sunny = new Sunny();
        Sunny.Talent child = new Child.Talent("Writing Poems.");
        System.out.println(child);
    }
}
