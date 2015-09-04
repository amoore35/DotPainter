package edu.elon.cs.dotpainter;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by LEXI on 9/2/15.
 */
public class Dot {

    private float x, y;
    private final int RADIUS = 50;
    private Paint paint;

    public Dot(float x, float y){
        this.x = x;
        this.y = y;

        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);
        int alpha = (int) (Math.random() * 256);

        paint = new Paint();
        paint.setARGB(alpha, red, green, blue);

    }

    public void draw(Canvas canvas){
        canvas.drawCircle(x, y, RADIUS, paint);
    }

}
