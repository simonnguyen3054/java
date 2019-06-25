public class Human {
  //create variable
  String name;
  int age;
  int heightInInches;
  String eyeColor;

  //constructor method always have the same name as the class name
  //constructor comes by default for all classes implicitly
  public Human(String name, int age, int heightInInches, String eyeColor) {
    super();
    this.name = name;
    this.age = age;
    this.heightInInches = heightInInches;
    this.eyeColor = eyeColor;
  }

  //create method
  public void speak() {
    System.out.println("Hello, my name is " + name);
    System.out.println("I am " + heightInInches + " inches tall");
    System.out.println("I am " + age + " years old");
    System.out.println("My eye color is " + eyeColor);
  }

  public void eat() {
    System.out.println("eating...");
  }

  public void work() {
    System.out.println("working...");
  }

}