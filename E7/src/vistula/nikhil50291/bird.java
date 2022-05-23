package vistula.nikhil50291;

public class bird extends animal {
    private String featherColornikhil50291;


    public bird() {
        super();
        featherColornikhil50291 = "NN";

    }

    public bird(String namenikhil50291, int agenikhil50291, int weightnikhil50291, String featherColornikhil50291) {
        super(namenikhil50291, agenikhil50291, weightnikhil50291);
        this.featherColornikhil50291 = featherColornikhil50291;
    }

    public bird(int agenikhil50291, String featherColornikhil50291) {
        super(agenikhil50291);
        this.featherColornikhil50291 = featherColornikhil50291;
    }

    public void takingflightnikhil50291() {
        System.out.println("Flap flap");
    }

    @Override
    public void getVoicenikhil50291() {
        System.out.println("bird is making sounds");
    }

    public String getFeatherColornikhil50291() {
        return featherColornikhil50291;
    }

    public void setFeatherColornikhil50291(String featherColornikhil50291) {
        this.featherColornikhil50291 = featherColornikhil50291;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "featherColornikhil50291='" + featherColornikhil50291 + '\'' +
                '}';
    }
}
