import java.util.ArrayList;

public class Main {


    static void main() {
        ArrayList<Animal> animals = new ArrayList<>();

        Animal a = new Lion("Simba", 100);
        Animal b = new Rabbit("Bugs Bunny", 100);
        Animal c = new Wolf("Bugs Bunny", 100);
        Animal d = new Rabbit("Harold", 100);

        animals.add(a);
        animals.add(b);
        animals.add(c);
        animals.add(d);


        Contest contest = new Contest(animals.get(0), animals.get(1));
        contest.playRound();



    }
}
