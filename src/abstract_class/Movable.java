package abstract_class;

public interface Movable {

  void move();

  default void beforeMove() {
    System.out.println("Ready to move");
  }
}
