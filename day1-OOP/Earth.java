public class Earth {
  //Entry point for all java application
  //codes are executed line by line in this method
  public static void main(String args[]) {
    //define a varibale of type human
    //Human tom;

    //create a new object
    //tom = new Human();

    //assign properties
    // tom.age = 28;
    // tom.eyeColor = "brown";
    // tom.heightInInches = 72;
    // tom.name = "Tom Simon";

    // tom.speak();

    Human human1 = new Human("Simon", 28, 72, "brown");

    human1.speak();
  }

}
