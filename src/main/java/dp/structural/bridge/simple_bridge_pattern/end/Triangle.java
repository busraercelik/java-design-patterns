package dp.structural.bridge.simple_bridge_pattern.end;

import java.awt.*;

public class Triangle extends Shape {

  private ColorShape colorShape;

  public Triangle(ColorShape colorShape) {
    this.colorShape = colorShape;
  }

  public void draw(Graphics graphics) {
    colorShape.setColor(graphics);
    int[] x = {200, 250, 150};
    int[] y = {15, 65, 65};
    int n = 3;
    graphics.fillPolygon(x, y, n);
  }

}
