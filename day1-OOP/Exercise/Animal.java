public class Animal {
  String type;
  int weight;

  public Animal(String type, int weight) {
    super();
    this.type = type;
    this.weight = weight;
  }

  public void describe() {
    System.out.println(type + " weights on average" + weight + " pounds");
  }
}