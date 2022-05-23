package vistula.nikhil50291;

public class main {
    public static void main(String[] args) {

        animal animal[] = new animal[6];

        animal[0] = new mammal("Little brown", 2, 3, "Bat");
        animal[1] = new dog("Tom", 3, 16, "Carnivora", "German Shepard");
        animal[2] = new fish("Catfish", 2, 1, "Yellow");
        animal[3] = new bird("Falcon", 4, 10, "Brown");
        animal[4] = new pigeon("Smith", 3, 4, "Grey", "Argentina");

        animal[2].getVoicenikhil50291();
        animal[4].getVoicenikhil50291();

    }
}
