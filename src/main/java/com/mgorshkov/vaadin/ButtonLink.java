package com.mgorshkov.vaadin;

import com.vaadin.server.ExternalResource;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Label;

/**
 * Created by mgorshkov on 12/21/16.
 */
@SuppressWarnings("serial")
public class ButtonLink extends Label {

    /** Constructor
     *
     * @param caption  text on the button
     * @param externalResource  where link goes
     * @param width    added to the constructor to make you remember that you don't specify a width the button does not appear (it's 0px wide)
     */
    public ButtonLink(String caption, ExternalResource externalResource, String width, String align, String fontAwesome) {
        super(
                "<a href='"+externalResource.getURL()+"' style='text-decoration: none; display: block;'>" +
                        // The following lines are copy pasted from rendered Vaadin v6.1 buttons.
                        "<div class='v-button v-widget' tabindex='0' style='width: 100%;' role='button'>" +
                        "<span class='v-button-wrap'>" +
                        "<span class='v-icon FontAwesome'>"+
                        fontAwesome+
                        "</span>"+
                        "<span class='v-button-caption'>"+
                        caption +
                        "</span>"+
                        "</span>"+
                        "</div>"+
                        "</a>",
                ContentMode.HTML);
                super.setWidth(null);
    }
}
