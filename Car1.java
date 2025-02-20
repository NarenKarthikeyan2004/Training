class Car1{
    String model;
    Car1() {
        System.out.println("DC");
    }
    Car1(String model)  {
        this.model = model;
    }
    void display() {
        System.out.println("Model: " + model);
    }
    public static void main(String[] args) {
        Car1 c = new Car1("Toyata");
        Car1 d = new Car1();
        c.display();
    }
}
