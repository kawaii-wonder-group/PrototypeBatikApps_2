package com.example.diefel.prototypebatikapps_2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by ASUS on 12/7/2016.
 */

public class TouchEventView extends View {
    private Paint paint = new Paint();
    private Path path = new Path();

    public TouchEventView(Context ctx, AttributeSet attrs)
    {
        super(ctx,attrs);
        paint.setAntiAlias(true);
        paint.setColor(Color.WHITE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(20);
        this.setBackgroundColor(Color.BLACK);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        canvas.drawPath(path,paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        float xPos = event.getX();
        float yPos = event.getY();

        switch (event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                path.moveTo(xPos,yPos);
                return true;
            case MotionEvent.ACTION_MOVE:
                path.lineTo(xPos,yPos);
                //return true;
                break;
            case MotionEvent.ACTION_UP:
                break; //do nothing finger lifted
            default:
                return false;
        }
        // schedule a repaint
        invalidate();
        return true;

    }
}
