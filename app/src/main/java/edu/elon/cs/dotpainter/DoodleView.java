package edu.elon.cs.dotpainter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by LEXI on 9/2/15.
 */
public class DoodleView extends View {

    private ArrayList<Dot> dots;

    public DoodleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        dots = new ArrayList<Dot>();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){

        dots.add(new Dot(event.getX(), event.getY()));

        return true;
    }

    @Override
    protected void onDraw(Canvas canvas){

        for (Dot dot : dots){
            dot.draw(canvas);
        }
        invalidate();

    }
}
