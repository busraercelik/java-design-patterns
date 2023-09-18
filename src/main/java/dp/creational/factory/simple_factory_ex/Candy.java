package dp.creational.factory.simple_factory_ex;

import java.util.List;

public abstract class Candy {
  abstract List<Candy> makeCandyPackage(int quantity);
}
