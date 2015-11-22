package me.letsroast.sizzle;

import android.graphics.Bitmap;

/**
 * Created by Eric on 11/10/2015.
 */
public class Content {
    private String txtTitle;
    private String txtPoints;
    private Bitmap image;

    public Content(Bitmap image, String title, String points) {
        this.image = image;
        txtTitle = title;
        txtPoints = points;
    }

    public String getTxtTitle() { return txtTitle; }

    public String getTxtPoints() { return txtPoints; }

    public Bitmap getImage() { return image; }
}
