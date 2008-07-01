package edu.stanford.smi.protegex.widget.imagemap;

import edu.stanford.smi.protege.widget.*;

/**
 *  Description of the class
 *
 * @author    William Grosso <grosso@smi.stanford.edu>
 */
public class ImageMapWidgetConfigurationPanel extends WidgetConfigurationPanel {

    public ImageMapWidgetConfigurationPanel(ImageMapWidget widget) {
        super(widget);
        addTab("Configure ImageMap", new MainConfigurationPanel(widget));
        addTab("Define Rectangles", new RectangleConfigurationPanel(widget));
    }
}
