package com.sandstorm.softspec.punkarnban.etc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/**
 * Created by FTTX on 5/26/2016 AD.
 */
public class HealthBar extends ProgressBar {

    private String healthText;
    private String nameText = "Test HW";

    private Paint textPaint;


    public HealthBar(Context context) {
        super(context);
        healthText = "0/100";
        textPaint = new Paint();
        textPaint.setColor(Color.BLACK);
        textPaint.setTextSize(30);
        //Example change later

    }

    public HealthBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        healthText = "0/100";
        textPaint = new Paint();
        textPaint.setColor(Color.BLACK);
        textPaint.setTextSize(30);

    }

    public HealthBar(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        healthText = "0/100";
        textPaint = new Paint();
        textPaint.setColor(Color.BLACK);
        textPaint.setTextSize(30);

    }

    public HealthBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        healthText = "0/100";
        textPaint = new Paint();
        textPaint.setColor(Color.BLACK);
        textPaint.setTextSize(30);

    }

    @Override
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Rect bound = new Rect();
        textPaint.getTextBounds(healthText, 0 ,healthText.length(),bound);
        int x = (int)(getWidth()*0.9  - bound.centerX());
        int y = getHeight()/2 - bound.centerY();
        canvas.drawText(healthText,x,y, textPaint);
        textPaint.getTextBounds(nameText, 0 , nameText.length(),bound);
        x = 0;
        canvas.drawText(nameText,x,y,textPaint);


    }

    public synchronized void setText(String text) {
        this.healthText = text;
        drawableStateChanged();
    }
}
