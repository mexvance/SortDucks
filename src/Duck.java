public class Duck implements Comparable {
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return name = " weighs " + weight;
    }

    public int compareTo(Object object) {

        Duck otherDuck = (Duck)object;

        if (this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight == otherDuck.weight) {

            //if we have equal weight we sort by name
            if (this.name.compareTo(otherDuck.name) < 0){
                return -1;
            } else if (this.name.compareTo(otherDuck.name) == 0){
                return 0;
            } else { //this.name > otherDuck.name
                return 1;
            }
        } else { //this.weight > otherDuck.weight
            return 1;
        }
    }
}
