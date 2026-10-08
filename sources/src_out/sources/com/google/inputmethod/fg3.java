package com.google.inputmethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u001c\u0010\t\u001a\u00020\u0005*\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010R\"\u0010\u0019\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/google/android/fg3;", "T", "", "<init>", "()V", "", "d", "", "position", "a", "(Ljava/lang/Object;F)V", "", "c", "()[F", "", "b", "()Ljava/util/List;", "", "Ljava/util/List;", "getKeys$foundation", "keys", "[F", "getPositions$foundation", "setPositions$foundation", "([F)V", "positions", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class fg3<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<T> keys = new ArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private float[] positions;

    public fg3() {
        float[] fArr = new float[5];
        for (int i = 0; i < 5; i++) {
            fArr[i] = Float.NaN;
        }
        this.positions = fArr;
    }

    private final void d() {
        float[] fArrCopyOf = Arrays.copyOf(this.positions, this.keys.size() + 2);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        this.positions = fArrCopyOf;
    }

    public final void a(T t, float f) {
        this.keys.add(t);
        if (this.positions.length < this.keys.size()) {
            d();
        }
        this.positions[this.keys.size() - 1] = f;
    }

    public final List<T> b() {
        return this.keys;
    }

    public final float[] c() {
        return f.u(this.positions, 0, this.keys.size());
    }
}
