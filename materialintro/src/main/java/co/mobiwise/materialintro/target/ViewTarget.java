package co.mobiwise.materialintro.target;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;

import co.mobiwise.materialintro.utils.Utils;

/**
 * Created by mertsimsek on 25/01/16.
 */
public class ViewTarget implements Target {

    private Context context;
    private View view;

    public ViewTarget(View view, Context context) {
        this.view = view;
        this.context = context;
    }

    @Override
    public Point getPoint() {

        int[] location = new int[2];
        view.getLocationInWindow(location);
        return new Point((int) (location[0] - Utils.getLeftWidth(context) + (view.getWidth() / 2)), location[1] + (view.getHeight() / 2));

    }

    @Override
    public Rect getRect() {
        int[] location = new int[2];
        view.getLocationInWindow(location);
        return new Rect(
                (int) (location[0] - Utils.getLeftWidth(context)),
                location[1],
                (int) (location[0] - Utils.getLeftWidth(context) + view.getWidth()),
                location[1] + view.getHeight()
        );
    }

    @Override
    public View getView() {
        return view;
    }

}
