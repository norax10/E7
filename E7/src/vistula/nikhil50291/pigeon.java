package vistula.nikhil50291;


public class pigeon extends bird {
    private String speciesnikhil50291;

    pigeon() {
        super();
        speciesnikhil50291 = "NN";
    }

    public pigeon(String namenikhil50291, int agenikhil50291, int weightnikhil50291, String featherColornikhil50291, String speciesnikhil50291) {
        super(namenikhil50291, agenikhil50291, weightnikhil50291, featherColornikhil50291);
        this.speciesnikhil50291 = speciesnikhil50291;
    }

    public pigeon(int agenikhil50291, String featherColornikhil50291, String speciesnikhil50291) {
        super(agenikhil50291, featherColornikhil50291);
        this.speciesnikhil50291 = speciesnikhil50291;
    }

    public void peckingWoodnikhil50291() {
        System.out.println("The pigeon is pecking wood");
    }

    @Override
    public void getVoicenikhil50291() {
        System.out.println("The pigeon chirps");
    }

    public String getSpeciesnikhil50291() {
        return speciesnikhil50291;
    }

    public void setSpeciesnikhil50291(String speciesnikhil50291) {
        this.speciesnikhil50291 = speciesnikhil50291;
    }

    @Override
    public String toString() {
        return "pigeon{" +
                "speciesnikhil50291='" + speciesnikhil50291 + '\'' +
                '}';
    }
}
