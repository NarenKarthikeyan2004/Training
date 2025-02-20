class Car1{
    String model;
    Car() {
        System.out.println("DC");
    }
    Car(String model)  {
        this.model = model;
    }
    void display() {
        System.out.println("Model: " + model);
    }
    public static void main(String[] args) {
        Car c = new Car("AUDI");
        Car d = new Car();
        c.display();
    }
}