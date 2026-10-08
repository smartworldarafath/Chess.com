package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.google.inputmethod.pae;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public abstract class a {
    public static int f = -1;
    int a;
    int b;
    String c;
    protected int d;
    HashMap<String, ConstraintAttribute> e;

    public a() {
        int i = f;
        this.a = i;
        this.b = i;
        this.c = null;
    }

    public abstract void a(HashMap<String, pae> map);

    @Override // 
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract a clone();

    public a c(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        return this;
    }

    abstract void d(HashSet<String> hashSet);

    abstract void e(Context context, AttributeSet attributeSet);

    boolean f(String str) {
        String str2 = this.c;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    public void g(HashMap<String, Integer> map) {
    }

    public a h(int i) {
        this.b = i;
        return this;
    }
}
