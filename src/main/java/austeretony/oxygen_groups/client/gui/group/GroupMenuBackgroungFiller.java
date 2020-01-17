package austeretony.oxygen_groups.client.gui.group;

import austeretony.oxygen_core.client.gui.OxygenGUIUtils;
import austeretony.oxygen_core.client.gui.elements.OxygenBackgroundFiller;

public class GroupMenuBackgroungFiller extends OxygenBackgroundFiller {

    public GroupMenuBackgroungFiller(int xPosition, int yPosition, int width, int height) {             
        super(xPosition, yPosition, width, height);
    }

    @Override
    public void drawBackground() {
        //main background  
        drawRect(0, 0, this.getWidth(), this.getHeight(), this.getEnabledBackgroundColor());      

        //title underline
        OxygenGUIUtils.drawRect(4.0D, 14.0D, this.getWidth() - 4.0D, 14.4D, this.getDisabledBackgroundColor());

        OxygenGUIUtils.drawRect(4.0D, this.getHeight() - 12.6F, this.getWidth() - 4.0D, this.getHeight() - 13.0F, this.getDisabledBackgroundColor());
    }
}