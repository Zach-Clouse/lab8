import java.util.ArrayList;

public class Undergraduate extends Student {

    public Undergraduate(String name) {
        super(name);
    }

    public Undergraduate(Undergraduate other) {
        super(other.name);
        this.scores = new ArrayList<Integer>(other.scores);
    }
    
    public boolean equals(Undergraduate under) {
        if (under instanceof Undergraduate) {
            for (int i = 0; i < under.scores.size(); i++) {
                if (this.scores.get(i) == under.scores.get(i)) {
                    continue;
                } else {
                    break;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Student o) {
        if (this.name.compareTo(o.name) == 0) {
            if (this.getAverageScore() == o.getAverageScore()) {
                return 0;
            }
        }
        return -1;
    }
    
    public Undergraduate clone() {
        return new Undergraduate(this);
    }

}
