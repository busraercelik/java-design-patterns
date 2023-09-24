package dp.structural.bridge.challenge.end;

public class DropdownButton extends Button {

  private ButtonSize buttonSize;

  public DropdownButton(ButtonSize buttonSize) {
    this.buttonSize = buttonSize;
  }

  public void draw() {
    buttonSize.setButtonSize();
    System.out.println("Drawing a dropdown button.\n");
  }

}
