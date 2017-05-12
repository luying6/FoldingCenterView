package com.luying.foldingcenterview;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private FoldingCenterView foldingCenterView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.start);
        foldingCenterView = (FoldingCenterView) findViewById(R.id.folding);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.mp);
        //初始化图片
        foldingCenterView.setBitmap(bitmap);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                foldingCenterView.setFolds(foldingCenterView, 1000);
            }
        });
    }
}
