package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.google.inputmethod.gc5;
import com.google.inputmethod.k44;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class c extends a implements k44 {
    protected final State l0;
    final State.Helper m0;
    protected ArrayList<Object> n0;
    private gc5 o0;

    public c(State state, State.Helper helper) {
        super(state);
        this.n0 = new ArrayList<>();
        this.l0 = state;
        this.m0 = helper;
    }

    @Override // androidx.constraintlayout.core.state.a, com.google.inputmethod.bca
    public ConstraintWidget a() {
        return c0();
    }

    public c a0(Object... objArr) {
        Collections.addAll(this.n0, objArr);
        return this;
    }

    @Override // androidx.constraintlayout.core.state.a, com.google.inputmethod.bca
    public void apply() {
    }

    public void b0() {
        super.apply();
    }

    public gc5 c0() {
        return this.o0;
    }
}
