package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0017¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u0002*\u00020\u0003H\u0017¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8&X§\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/google/android/hm4;", "", "Lcom/google/android/ff3;", "Lcom/google/android/b0d;", "s1", "(F)J", "U", "(J)F", "", "w2", "()F", "getFontScale$annotations", "()V", "fontScale", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface hm4 {
    default float U(long j) {
        if (!d0d.g(b0d.g(j), d0d.INSTANCE.b())) {
            bx5.b("Only Sp can convert to Px");
        }
        fm4 fm4Var = fm4.a;
        if (!fm4Var.f(getFontScale())) {
            return ff3.i(b0d.h(j) * getFontScale());
        }
        em4 em4VarB = fm4Var.b(getFontScale());
        float fH = b0d.h(j);
        return em4VarB == null ? ff3.i(fH * getFontScale()) : ff3.i(em4VarB.b(fH));
    }

    default long s1(float f) {
        fm4 fm4Var = fm4.a;
        if (!fm4Var.f(getFontScale())) {
            return c0d.h(f / getFontScale());
        }
        em4 em4VarB = fm4Var.b(getFontScale());
        return c0d.h(em4VarB != null ? em4VarB.a(f) : f / getFontScale());
    }

    /* JADX INFO: renamed from: w2 */
    float getFontScale();
}
