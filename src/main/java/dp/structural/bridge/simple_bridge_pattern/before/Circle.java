package dp.structural.bridge.simple_bridge_pattern.before;

import java.awt.Graphics;

public abstract class Circle extends Shape {

  public void draw(Graphics graphics) {
    graphics.fillOval(75, 15, 50, 50);
  }



}
