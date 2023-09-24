package dp.structural.bridge.simple_bridge_pattern.end;

import java.awt.*;

public class RedColorShape implements ColorShape{
  @Override
  public void setColor(Graphics graphics) {
    graphics.setColor(Color.RED);
  }
}
