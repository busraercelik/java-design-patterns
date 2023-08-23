package dp.creational.builder.simple_builder_ex;

import java.awt.*;

public interface Builder {
    Builder setDimensions(Dimension dimensions);

    Builder setCeilingHeight(int ceilingHeight);

    Builder setFloorNumber(int floorNumber);

    Builder setWallColor(Color wallColor);

    Builder setNumberOfWindows(int numberOfWindows);

    Builder setNumberOfDoors(int numberOfDoors);
}
