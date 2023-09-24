package dp.structural.bridge.simple_bridge_pattern.end;

import java.awt.*;

public class Square extends Shape {

  private ColorShape colorShape;

  public Square(ColorShape colorShape) {
    this.colorShape = colorShape;
  }

  public void draw(Graphics graphics) {
    colorShape.setColor(graphics);
    graphics.fillRect(5, 15, 50, 50);
  }

}
