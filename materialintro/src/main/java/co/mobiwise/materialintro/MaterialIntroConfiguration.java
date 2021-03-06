package co.mobiwise.materialintro;


import android.view.ViewGroup;

import co.mobiwise.materialintro.shape.Focus;
import co.mobiwise.materialintro.shape.FocusGravity;
import co.mobiwise.materialintro.utils.Constants;

public class MaterialIntroConfiguration {

    private int maskColor;

    private long delayMillis;

    private boolean isFadeAnimationEnabled;

    private Focus focusType;

    private FocusGravity focusGravity;

    private int padding;

    private boolean dismissOnTouch;

    private int colorTextViewInfo;


    private boolean isImageViewEnabled;

    private ViewGroup mParentViewGroup;

    public MaterialIntroConfiguration() {
        maskColor = Constants.DEFAULT_MASK_COLOR;
        delayMillis = Constants.DEFAULT_DELAY_MILLIS;
        padding = Constants.DEFAULT_TARGET_PADDING;
        colorTextViewInfo = Constants.DEFAULT_COLOR_TEXT_VIEW_INFO;
        focusType = Focus.ALL;
        focusGravity = FocusGravity.CENTER;
        isFadeAnimationEnabled = false;
        dismissOnTouch = false;
        isImageViewEnabled = true;
    }

    public int getMaskColor() {
        return maskColor;
    }

    public void setMaskColor(int maskColor) {
        this.maskColor = maskColor;
    }

    public long getDelayMillis() {
        return delayMillis;
    }

    public void setDelayMillis(long delayMillis) {
        this.delayMillis = delayMillis;
    }

    public boolean isFadeAnimationEnabled() {
        return isFadeAnimationEnabled;
    }

    public void setFadeAnimationEnabled(boolean fadeAnimationEnabled) {
        isFadeAnimationEnabled = fadeAnimationEnabled;
    }

    public Focus getFocusType() {
        return focusType;
    }

    public void setFocusType(Focus focusType) {
        this.focusType = focusType;
    }

    public FocusGravity getFocusGravity() {
        return focusGravity;
    }



    public void setFocusGravity(FocusGravity focusGravity) {
        this.focusGravity = focusGravity;
    }

    public int getPadding() {
        return padding;
    }

    public void setPadding(int padding) {
        this.padding = padding;
    }

    public ViewGroup getParentViewGroup() {
        return mParentViewGroup;
    }

    public void setParentViewGroup(ViewGroup group) {
        this.mParentViewGroup = group;
    }

    public boolean isDismissOnTouch() {
        return dismissOnTouch;
    }

    public void setDismissOnTouch(boolean dismissOnTouch) {
        this.dismissOnTouch = dismissOnTouch;
    }

    public int getColorTextViewInfo() {
        return colorTextViewInfo;
    }

    public void setColorTextViewInfo(int colorTextViewInfo) {
        this.colorTextViewInfo = colorTextViewInfo;
    }



    public boolean isImageViewEnabled(){
        return isImageViewEnabled;
    }

}