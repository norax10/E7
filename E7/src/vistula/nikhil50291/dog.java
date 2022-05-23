package vistula.nikhil50291;

public class dog extends mammal {
    private String breednikhil50291;

    dog() {
        super();
        breednikhil50291 = "NN";
    }

    public dog(String namenikhil50291, int agenikhil50291, int weightnikhil50291, String rzadnikhil50291, String breednikhil50291) {
        super(namenikhil50291, agenikhil50291, weightnikhil50291, rzadnikhil50291);
        this.breednikhil50291 = breednikhil50291;
    }

    public dog(int agenikhil50291, String rzadnikhil50291, String breednikhil50291) {
        super(agenikhil50291, rzadnikhil50291);
        this.breednikhil50291 = breednikhil50291;
    }

    public void sportnikhil50291() {
        System.out.println("The dog is retrieving.");
    }

    @Override
    public void drinkMilknikhil50291() {
        System.out.println("The dog is drinking milk.");
    }

    @Override
    public void getVoicenikhil50291() {
        System.out.println("The dog is barking.");
    }

    public String getBreednikhil50291() {
        return breednikhil50291;
    }

    public void setBreednikhil50291(String breednikhil50291) {
        this.breednikhil50291 = breednikhil50291;
    }

    @Override
    public String toString() {
        return "dog{" +
                "breednikhil50291='" + breednikhil50291 + '\'' +
                '}';
    }
}
