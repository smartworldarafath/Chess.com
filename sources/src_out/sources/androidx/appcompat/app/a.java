package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.inputmethod.d1a;
import com.google.inputmethod.t7;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public abstract class a {

    public interface b {
        void a(boolean z);
    }

    @Deprecated
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void h(boolean z);

    public abstract int i();

    public abstract Context j();

    public boolean k() {
        return false;
    }

    public void l(Configuration configuration) {
    }

    void m() {
    }

    public abstract boolean n(int i, KeyEvent keyEvent);

    public boolean o(KeyEvent keyEvent) {
        return false;
    }

    public boolean p() {
        return false;
    }

    public abstract void q(boolean z);

    public abstract void r(boolean z);

    public abstract void s(Drawable drawable);

    public abstract void t(boolean z);

    public abstract void u(CharSequence charSequence);

    public abstract void v(CharSequence charSequence);

    public t7 w(t7.a aVar) {
        return null;
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0006a extends ViewGroup.MarginLayoutParams {
        public int a;

        public C0006a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d1a.t);
            this.a = typedArrayObtainStyledAttributes.getInt(d1a.u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0006a(int i, int i2) {
            super(i, i2);
            this.a = 8388627;
        }

        public C0006a(C0006a c0006a) {
            super((ViewGroup.MarginLayoutParams) c0006a);
            this.a = 0;
            this.a = c0006a.a;
        }

        public C0006a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }
    }
}
