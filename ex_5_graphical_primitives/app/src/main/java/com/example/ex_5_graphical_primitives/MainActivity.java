package com.example.ex_5_graphical_primitives;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        SimpleCanvas s = new SimpleCanvas(this);
        setContentView(s);

    }

    private class  SimpleCanvas extends View{
        Paint paint;
        public SimpleCanvas(Context context) {
            super(context);
            paint = new Paint();



        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            paint.setColor(Color.RED);
            paint.setStrokeWidth(5);

            canvas.drawColor(Color.BLACK);
            paint.setTextSize(30);
            canvas.drawText("Circle",50,80,paint);
            canvas.drawCircle(150,200,50,paint);
            canvas.drawText("Rectangle",50,300,paint);
            canvas.drawRect(100,330,350,380,paint);
            canvas.drawText("Square",50,430,paint);
            canvas.drawRect(100,460,200,560,paint);
            canvas.drawText("Line",50,600,paint);
            canvas.drawLine(100,630,100,730,paint);










        }
    }
}



