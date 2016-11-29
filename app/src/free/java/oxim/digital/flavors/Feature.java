package oxim.digital.flavors;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;

public final class Feature extends View {

    private static final int SIZE = 200;

    public Feature(final Context context) {
        super(context);
    }

    public Feature(final Context context, final AttributeSet attrs) {
        super(context, attrs);
    }

    public Feature(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        super.onMeasure(MeasureSpec.makeMeasureSpec(SIZE, MeasureSpec.EXACTLY),
                        MeasureSpec.makeMeasureSpec(SIZE, MeasureSpec.EXACTLY));
    }

    @Override
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        setBackgroundColor(Color.MAGENTA);
    }
}
