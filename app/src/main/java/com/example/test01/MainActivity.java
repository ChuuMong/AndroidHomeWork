package com.example.test01;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.InputStream;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.root_view);

        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();

        //dip->px 변환
        float f1 = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 500, displayMetrics);

        //sp->px 변환
        float f2 = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 300, displayMetrics);

        //pt->px 변환
        float f3 = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_PT, 300, displayMetrics);

        //in->px 변환
        float f4 = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_IN, 300, displayMetrics);

        //mm->px 변환
        float f5 = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_MM, 300, displayMetrics);

        textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen.size));

        TypedValue typedValue = new TypedValue();
        getResources().getValue(R.dimen.size, typedValue, true);

        float f6 = TypedValue.complexToFloat(typedValue.data);
        float f7 = TypedValue.complexToDimension(typedValue.data, displayMetrics);
        int i1 = TypedValue.complexToDimensionPixelOffset(typedValue.data, displayMetrics);
        int i2 = TypedValue.complexToDimensionPixelSize(typedValue.data, displayMetrics);
        String s1 = TypedValue.coerceToString(typedValue.type, typedValue.data);

        TypedValue typedValue2 = new TypedValue();
        getResources().getValue(R.string.app_name, typedValue2, true);
        String s2 = typedValue2.coerceToString().toString();

        TypedValue typedValue3 = new TypedValue();
        getResources().getValue(R.mipmap.ic_launcher, typedValue3, true);
        String s3 = typedValue3.coerceToString().toString();

        TypedValue typedValue4 = new TypedValue();
        getResources().getValue(R.color.red, typedValue4, true);
        textView.setTextColor(typedValue4.data);
    }
}
