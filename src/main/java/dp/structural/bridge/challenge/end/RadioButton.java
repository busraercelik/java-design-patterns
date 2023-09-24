package dp.structural.bridge.challenge.end;

public class RadioButton extends Button {

  private ButtonSize buttonSize;

  public RadioButton(ButtonSize buttonSize) {
    this.buttonSize = buttonSize;
  }

  public void draw() {
    buttonSize.setButtonSize();
    System.out.println("Drawing a radio button.\n");
  }

}
