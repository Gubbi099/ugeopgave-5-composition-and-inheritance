public class Contest {
    private Animal animal1;
    private Animal animal2;
    private int roundNumber;

    public Contest(Animal a, Animal b) {
        this.animal1 = a;
        this.animal2 = b;
        this.roundNumber = 1;
    }

    public void playRound() {
        while(this.getWinner() == null) {
            System.out.println("--- Runde " + this.roundNumber + " ---");
            this.animal2.subEnergy(this.animal1.attack());
            System.out.println(this.animal1.getName() + " angriber " + this.animal2.getName() + " for " + this.animal1.attack() + "! (" + this.animal2.getName() + " har " + this.animal1.getEnergy() + " energi tilbage)");

            this.animal1.subEnergy(this.animal2.attack());
            System.out.println(this.animal2.getName() + " angriber " + this.animal1.getName() + " for " + this.animal2.attack() + "! (" + this.animal1.getName() + " har " + this.animal2.getEnergy() + " energi tilbage)");

            System.out.println();

            this.roundNumber++;
        }

        String winner = this.getWinner().getName();

        System.out.println(winner + " vandt!");

    }

    public Animal getWinner() {
        if(this.animal1.getEnergy() <= 0 ) {
            return animal2;
        } else if(this.animal2.getEnergy() <= 0) {
            return animal1;
        }
        return null;
    }
}
