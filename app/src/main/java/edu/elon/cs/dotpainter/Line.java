package edu.elon.cs.dotpainter;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by Alexia Moore on 9/12/15.
 */
public class Line {

    private float x0, y0, x1, y1;
    private int alpha, red, blue, green;
    private int penWidth;

    public Line(float x0, float y0, float x1, float y1, int alpha, int red,
                int blue, int green, int penWidth){
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
        this.alpha = alpha;
        this.red = red;
        this.blue = blue;
        this.green = green;
        this.penWidth = penWidth;
    }

    public void drawLine(Canvas canvas){
        Paint paint = new Paint();
        paint.setARGB(alpha, red, green, blue);
        paint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawLine(x0, y0, x1, y1, paint);
    }
}
