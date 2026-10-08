package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
class j0 extends c0 {
    private final WeakReference<Context> b;

    public j0(Context context, Resources resources) {
        super(resources);
        this.b = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable drawableA = a(i);
        Context context = this.b.get();
        if (drawableA != null && context != null) {
            b0.g().w(context, i, drawableA);
        }
        return drawableA;
    }
}
