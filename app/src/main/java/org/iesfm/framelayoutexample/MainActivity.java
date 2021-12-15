package org.iesfm.framelayoutexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvTopRight;
    private TextView tvBottomRight;
    private TextView tvCenterLeft;
    private ImageView ivTop;
    private ImageView ivBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init() {
        tvTopRight = (TextView) findViewById(R.id.tvTopRight);
        tvBottomRight = (TextView) findViewById(R.id.tvBottomRight);
        tvCenterLeft = (TextView) findViewById(R.id.tvCenterLeft);

        ivTop = (ImageView) findViewById(R.id.ivTopLeft);
        ivBottom = (ImageView) findViewById(R.id.ivBottomLeft);

    }

    public void cambiar(View v){
        FrameLayout.LayoutParams paramsTvTop = (FrameLayout.LayoutParams) tvTopRight.getLayoutParams();
        paramsTvTop.gravity = Gravity.BOTTOM | Gravity.LEFT;
        tvTopRight.setLayoutParams(paramsTvTop);

        FrameLayout.LayoutParams paramsTvBottom = (FrameLayout.LayoutParams) tvBottomRight.getLayoutParams();
        paramsTvBottom.gravity = Gravity.TOP | Gravity.LEFT;
        tvBottomRight.setLayoutParams(paramsTvBottom);

        FrameLayout.LayoutParams paramsTvCenter = (FrameLayout.LayoutParams) tvCenterLeft.getLayoutParams();
        paramsTvCenter.gravity = Gravity.CENTER | Gravity.RIGHT;
        tvCenterLeft.setLayoutParams(paramsTvCenter);

        FrameLayout.LayoutParams paramsIvTop = (FrameLayout.LayoutParams) ivTop.getLayoutParams();
        paramsIvTop.gravity = Gravity.BOTTOM | Gravity.RIGHT;
        ivTop.setLayoutParams(paramsIvTop);

        FrameLayout.LayoutParams paramsIvBottom = (FrameLayout.LayoutParams) ivBottom.getLayoutParams();
        paramsIvBottom.gravity = Gravity.TOP | Gravity.RIGHT;
        ivBottom.setLayoutParams(paramsIvBottom);
    }

}