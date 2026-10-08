package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0019\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00172\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0007H\u0082\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b \u0010\u001cR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"R.\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001b\u0010$\u0012\u0004\b)\u0010\u0003\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,¨\u0006."}, d2 = {"Lcom/google/android/fm4;", "", "<init>", "()V", "Lcom/google/android/em4;", "start", "end", "", "interpolationPoint", "a", "(Lcom/google/android/em4;Lcom/google/android/em4;F)Lcom/google/android/em4;", "fontScale", "", "d", "(F)I", "key", "e", "(I)F", "scaleKey", "fontScaleConverter", "", "g", "(FLcom/google/android/em4;)V", "Lcom/google/android/e0c;", "table", "h", "(Lcom/google/android/e0c;FLcom/google/android/em4;)V", "c", "(F)Lcom/google/android/em4;", "", "f", "(F)Z", "b", "", "[F", "CommonFontSizes", "Lcom/google/android/e0c;", "getSLookupTables", "()Lcom/google/android/e0c;", "setSLookupTables", "(Lcom/google/android/e0c;)V", "getSLookupTables$annotations", "sLookupTables", "", "[Ljava/lang/Object;", "LookupTablesWriteLock", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class fm4 {
    public static final fm4 a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final float[] CommonFontSizes;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static volatile e0c<em4> sLookupTables;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final Object[] LookupTablesWriteLock;
    public static final int e;

    static {
        fm4 fm4Var = new fm4();
        a = fm4Var;
        CommonFontSizes = new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
        sLookupTables = new e0c<>(0, 1, null);
        Object[] objArr = new Object[0];
        LookupTablesWriteLock = objArr;
        synchronized (objArr) {
            fm4Var.h(sLookupTables, 1.15f, new gm4(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            fm4Var.h(sLookupTables, 1.3f, new gm4(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            fm4Var.h(sLookupTables, 1.5f, new gm4(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            fm4Var.h(sLookupTables, 1.8f, new gm4(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            fm4Var.h(sLookupTables, 2.0f, new gm4(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            Unit unit = Unit.a;
        }
        if (!(fm4Var.e(sLookupTables.h(0)) - 0.01f > 1.03f)) {
            bx5.b("You should only apply non-linear scaling to font scales > 1");
        }
        e = 8;
    }

    private fm4() {
    }

    private final em4 a(em4 start, em4 end, float interpolationPoint) {
        float[] fArr = CommonFontSizes;
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            float f = CommonFontSizes[i];
            fArr2[i] = yh7.a.b(start.b(f), end.b(f), interpolationPoint);
        }
        return new gm4(CommonFontSizes, fArr2);
    }

    private final em4 c(float scaleKey) {
        return sLookupTables.e(d(scaleKey));
    }

    private final int d(float fontScale) {
        return (int) (fontScale * 100.0f);
    }

    private final float e(int key) {
        return key / 100.0f;
    }

    private final void g(float scaleKey, em4 fontScaleConverter) {
        synchronized (LookupTablesWriteLock) {
            e0c<em4> e0cVarClone = sLookupTables.clone();
            a.h(e0cVarClone, scaleKey, fontScaleConverter);
            sLookupTables = e0cVarClone;
            Unit unit = Unit.a;
        }
    }

    private final void h(e0c<em4> table, float scaleKey, em4 fontScaleConverter) {
        table.i(d(scaleKey), fontScaleConverter);
    }

    public final em4 b(float fontScale) {
        em4 em4VarN;
        if (!f(fontScale)) {
            return null;
        }
        em4 em4VarC = a.c(fontScale);
        if (em4VarC != null) {
            return em4VarC;
        }
        int iF = sLookupTables.f(d(fontScale));
        if (iF >= 0) {
            return sLookupTables.n(iF);
        }
        int i = -(iF + 1);
        int i2 = i - 1;
        float fE = 1.0f;
        if (i >= sLookupTables.m()) {
            gm4 gm4Var = new gm4(new float[]{1.0f}, new float[]{fontScale});
            g(fontScale, gm4Var);
            return gm4Var;
        }
        if (i2 < 0) {
            float[] fArr = CommonFontSizes;
            em4VarN = new gm4(fArr, fArr);
        } else {
            fE = e(sLookupTables.h(i2));
            em4VarN = sLookupTables.n(i2);
        }
        em4 em4VarA = a(em4VarN, sLookupTables.n(i), yh7.a.a(0.0f, 1.0f, fE, e(sLookupTables.h(i)), fontScale));
        g(fontScale, em4VarA);
        return em4VarA;
    }

    public final boolean f(float fontScale) {
        return fontScale >= 1.03f;
    }
}
