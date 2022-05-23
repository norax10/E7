package vistula.nikhil50291;

public class fish extends animal {
    private String scaleColornikhil50291;

    public fish(Object o) {
        super();
        scaleColornikhil50291 = "NN";
    }

    public fish(String namenikhil50291, int agenikhil50291, int weightnikhil50291, String scaleColornikhil50291) {
        super(namenikhil50291, agenikhil50291, weightnikhil50291);
        this.scaleColornikhil50291 = scaleColornikhil50291;
    }

    public fish(int agenikhil50291, String scaleColornikhil50291) {
        super(agenikhil50291);
        this.scaleColornikhil50291 = scaleColornikhil50291;
    }

    public void drinkWaternikhil50291() {
        System.out.println("Gulp gulp");
    }

    @Override
    public void getVoicenikhil50291() {
        System.out.println("fish is making sounds");
    }

    public String getScaleColornikhil50291() {
        return scaleColornikhil50291;
    }

    public void setScaleColornikhil50291(String scaleColornikhil50291) {
        this.scaleColornikhil50291 = scaleColornikhil50291;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "scaleColornikhil50291='" + scaleColornikhil50291 + '\'' +
                '}';
    }
}
