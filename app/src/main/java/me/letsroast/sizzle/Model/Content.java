package me.letsroast.sizzle.Model;

import android.graphics.Bitmap;

import com.parse.ParseObject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eric on 11/10/2015.
 */
public class Content {
    private String txtTitle;
    private String txtPoints;
    private Bitmap image;

    private ArrayList<String> comments;

    public Content(Bitmap image, String title, String points) {
        this.image = image;
        txtTitle = title;
        txtPoints = points;
        //this.comments = (ArrayList<String>) comments; // TODO: Last place worked: trying to get comment section
    }

    public String getTxtTitle() { return txtTitle; }

    public String getTxtPoints() { return txtPoints; }

    public Bitmap getImage() { return image; }

    public ArrayList getComments() { return comments; };
}
