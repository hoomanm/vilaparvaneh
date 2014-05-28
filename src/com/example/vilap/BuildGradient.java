package com.example.vilap;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;

public class BuildGradient {
	private static Drawable BuildGradient(final Activity activity , final int[] colors , final float[] positions)
	{
		ShapeDrawable.ShaderFactory sf = new ShapeDrawable.ShaderFactory() {
		    @Override
		    public Shader resize(int width, int height) {
		        LinearGradient lg = new LinearGradient(0, 0,0, height ,
		            colors,
		            positions, Shader.TileMode.REPEAT);
		        return lg;
		    }
		};
		PaintDrawable p=new PaintDrawable();
		p.setShape(new RectShape());
		p.setShaderFactory(sf);
		return p;
	}
}
