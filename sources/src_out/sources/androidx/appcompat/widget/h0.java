package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class h0 extends ContextWrapper {
    private static final Object c = new Object();
    private static ArrayList<WeakReference<h0>> d;
    private final Resources a;
    private final Resources.Theme b;

    private h0(Context context) {
        super(context);
        if (!m0.c()) {
            this.a = new j0(this, context.getResources());
            this.b = null;
            return;
        }
        m0 m0Var = new m0(this, context.getResources());
        this.a = m0Var;
        Resources.Theme themeNewTheme = m0Var.newTheme();
        this.b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        return ((context instanceof h0) || (context.getResources() instanceof j0) || (context.getResources() instanceof m0) || !m0.c()) ? false : true;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (c) {
            try {
                ArrayList<WeakReference<h0>> arrayList = d;
                if (arrayList == null) {
                    d = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<h0> weakReference = d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            d.remove(size);
                        }
                    }
                    for (int size2 = d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<h0> weakReference2 = d.get(size2);
                        h0 h0Var = weakReference2 != null ? weakReference2.get() : null;
                        if (h0Var != null && h0Var.getBaseContext() == context) {
                            return h0Var;
                        }
                    }
                }
                h0 h0Var2 = new h0(context);
                d.add(new WeakReference<>(h0Var2));
                return h0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
