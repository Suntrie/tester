package org.example;

import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Controller {

    public void startClick(MouseEvent mouseEvent) {
        String source2 = mouseEvent.getPickResult().getIntersectedNode().getId();
        System.out.println(source2);
    }
}
