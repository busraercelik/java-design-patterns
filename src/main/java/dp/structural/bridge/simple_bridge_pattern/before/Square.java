package dp.structural.bridge.simple_bridge_pattern.before;

import java.awt.Graphics;

public abstract class Square extends Shape {

  public void draw(Graphics graphics) {
    graphics.fillRect(5, 15, 50, 50);
  }

}
