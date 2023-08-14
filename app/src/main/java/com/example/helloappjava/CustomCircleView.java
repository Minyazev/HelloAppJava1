package com.example.helloappjava;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
public class CustomCircleView extends View {
    private Paint paint;
    public CustomCircleView(Context context) {
        super(context);
        init();
    }
    public CustomCircleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    public CustomCircleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
    private void init() {
        paint = new Paint();
        paint.setColor(Color.RED);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // Рисуем красный круг в центре вида
        float centerX = getWidth() / 2f;
        float centerY = getHeight() / 2f;
        float radius = Math.min(centerX, centerY) / 2f;
        canvas.drawCircle(centerX, centerY, radius, paint);
    }
}