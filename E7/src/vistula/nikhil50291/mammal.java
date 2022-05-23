package vistula.nikhil50291;

public class mammal extends animal {
    private String ordernikhil50291;

    public mammal() {
        super();
        ordernikhil50291 = "NN";
    }

    public mammal(String namenikhil50291, int agenikhil50291, int weightnikhil50291, String ordernikhil50291) {
        super(namenikhil50291, agenikhil50291, weightnikhil50291);
        this.ordernikhil50291 = ordernikhil50291;
    }

    public mammal(int agenikhil50291, String ordernikhil50291) {
        super(agenikhil50291);
        this.ordernikhil50291 = ordernikhil50291;
    }

    public void drinkMilknikhil50291() {
        System.out.println("Gulp gulp");
    }


    @Override
    public void getVoicenikhil50291() {
        System.out.println("Mammal is making sounds");
    }

    public String getOrdernikhil50291() {
        return ordernikhil50291;
    }

    public void setOrdernikhil50291(String ordernikhil50291) {
        this.ordernikhil50291 = ordernikhil50291;
    }

    @Override
    public String toString() {
        return "mammal{" +
                "ordernikhil50291='" + ordernikhil50291 + '\'' +
                '}';
    }
}
