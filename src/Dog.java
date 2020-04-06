public class Dog {
    private int age;
    private int weight;
    private String name;

    public Dog(int age, int weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
