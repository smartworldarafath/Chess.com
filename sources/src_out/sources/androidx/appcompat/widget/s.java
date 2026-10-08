package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.google.inputmethod.ax9;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class s extends RatingBar {
    private final r a;

    public s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax9.K);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmapB = this.a.b();
        if (bitmapB != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapB.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public s(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g0.a(this, getContext());
        r rVar = new r(this);
        this.a = rVar;
        rVar.c(attributeSet, i);
    }
}
