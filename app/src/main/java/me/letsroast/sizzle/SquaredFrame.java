package me.letsroast.sizzle;

/**
 * Created by Orang on 11/11/2015.
 */
import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class SquaredFrame extends RelativeLayout{
    public SquaredFrame(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int size = Math.min(getMeasuredWidth(), getMeasuredHeight());
        setMeasuredDimension(size, size);
    }
}