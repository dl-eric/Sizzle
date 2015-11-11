package me.letsroast.sizzle;

import android.hardware.Camera;

import java.util.Comparator;

/**
 * Created by Orang on 11/11/2015.
 */
public class SizeComparator implements Comparator<Camera.Size> {
    @Override
    public int compare(Camera.Size lhs, Camera.Size rhs) {
        int left = lhs.width * lhs.height;
        int right = rhs.width * rhs.height;

        if (left < right) {
            return (-1);
        } else if (left > right) {
            return (1);
        }
        return (0);
    }

}
