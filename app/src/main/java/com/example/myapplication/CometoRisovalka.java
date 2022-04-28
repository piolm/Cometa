package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;

public class CometoRisovalka extends View {
    private Paint p;
    private Matrix m;
    public CometoRisovalka(Context context) {
        super(context);
        p = new Paint(Paint.ANTI_ALIAS_FLAG);
        m = new Matrix();
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m.setRotate(25);
        canvas.setMatrix(m);
        canvas.drawColor(Color.BLACK);
        p.setStyle(Paint.Style.FILL);
        p.setColor(Color.YELLOW);
        canvas.drawCircle(190, 190 , 30 ,p);
        p.setStyle(Paint.Style.STROKE);
        p.setColor(Color.LTGRAY);
        canvas.drawOval(135, 60, 610, 310, p);
        canvas.rotate(35);
    }
}
