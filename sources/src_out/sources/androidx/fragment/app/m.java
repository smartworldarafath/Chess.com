package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import com.google.inputmethod.di9;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class m {
    private final o<?> a;

    private m(o<?> oVar) {
        this.a = oVar;
    }

    public static m b(o<?> oVar) {
        return new m((o) di9.h(oVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        FragmentManager fragmentManager = this.a.getFragmentManager();
        o<?> oVar = this.a;
        fragmentManager.q(oVar, oVar, fragment);
    }

    public void c() {
        this.a.getFragmentManager().E();
    }

    public boolean d(MenuItem menuItem) {
        return this.a.getFragmentManager().H(menuItem);
    }

    public void e() {
        this.a.getFragmentManager().I();
    }

    public void f() {
        this.a.getFragmentManager().K();
    }

    public void g() {
        this.a.getFragmentManager().T();
    }

    public void h() {
        this.a.getFragmentManager().X();
    }

    public void i() {
        this.a.getFragmentManager().Y();
    }

    public void j() {
        this.a.getFragmentManager().a0();
    }

    public boolean k() {
        return this.a.getFragmentManager().h0(true);
    }

    public FragmentManager l() {
        return this.a.getFragmentManager();
    }

    public void m() {
        this.a.getFragmentManager().d1();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.getFragmentManager().F0().onCreateView(view, str, context, attributeSet);
    }
}
