package dp.structural.bridge.challenge.end;

/**
 * bridge pattern simplifies inheritance structure
 * use bridge pattern to separate out your hierarchy and make your code more flexible.
 * it decouples concrete implementation from the interface, help you to write more maintainable code.
 */
public class Canvas {

  public static void main(String[] args) {
    CheckboxButton checkboxButton = new CheckboxButton(new SmallButtonSize());
    checkboxButton.draw();

    RadioButton radioButton = new RadioButton(new MediumButtonSize());
    radioButton.draw();

    DropdownButton dropdownButton = new DropdownButton(new LargeButtonSize());
    dropdownButton.draw();
  }
}
