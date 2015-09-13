package edu.elon.cs.dotpainter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;

/**
 * Draw dots to the screen on touches.
 *
 * @author J. Hollingsworth and CSC 303 - Fall 2015
 */
public class DoodleView extends View {

    public final static int DEFAULT_WIDTH = 25;
    public static int ALPHA = 0;
    public static int RED = 0;
    public static int GREEN = 0;
    public static int BLUE = 0;

    private ArrayList<Line> theLines;
    private int penWidth = DEFAULT_WIDTH;

    public DoodleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        theLines = new ArrayList<Line>();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float touchedX = 0;
        float touchedY = 0;
        if (event.getAction() == MotionEvent.ACTION_DOWN){
            touchedX = event.getX();
            touchedY = event.getY();
        }
        if (event.getAction() == MotionEvent.ACTION_MOVE){
            theLines.add(new Line(touchedX, touchedY, event.getX(), event.getY(), ALPHA, RED,
                    BLUE, GREEN, penWidth));

        }

        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {

        for (Line line : theLines) {
            line.drawLine(canvas);
        }
        invalidate();
    }

    public void setPenWidth(int penWidth) {
        this.penWidth = penWidth;
    }

    public int getPenWidth() {
        return penWidth;
    }

    public void setPenColor(int alpha, int red, int green, int blue){

        ALPHA = alpha;
        RED = red;
        GREEN = green;
        BLUE = blue;
    }

    public int[] getARGB(){
        int[] aRGB = {ALPHA, RED, GREEN, BLUE};
        return aRGB;
    }
}
