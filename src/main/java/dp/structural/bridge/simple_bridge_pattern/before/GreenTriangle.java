package dp.structural.bridge.simple_bridge_pattern.before;

import java.awt.Color;
import java.awt.Graphics;

public class GreenTriangle extends Triangle{

  public void draw(Graphics graphics) {
    graphics.setColor(Color.GREEN);
    super.draw(graphics);
  }

}
