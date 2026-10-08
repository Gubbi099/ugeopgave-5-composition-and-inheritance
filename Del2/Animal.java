public abstract class Animal {
    private String name;
    private int energy;

    public Animal(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public abstract int attack();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void subEnergy(int amount) {
        this.energy -= amount;
    }

    public boolean isActive() {
        return this.energy > 0;
    }


    @Override
    public String toString() {
        return this.getClass().getName() + " '" + this.name + "' (energi: " + this.energy + ")";
    }

}
