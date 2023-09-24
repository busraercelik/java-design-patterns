package dp.structural.bridge.challenge.end;

public class CheckboxButton extends Button {

  private ButtonSize buttonSize;

  public CheckboxButton(ButtonSize buttonSize) {
    this.buttonSize = buttonSize;
  }

  public void draw() {
    buttonSize.setButtonSize();
    System.out.println("Drawing a checkbox button.\n");
  }

}
