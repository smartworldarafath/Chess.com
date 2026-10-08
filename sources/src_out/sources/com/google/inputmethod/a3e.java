package com.google.inputmethod;

import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.graphics.h;
import androidx.compose.ui.graphics.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\t\u001a\u00020\b*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\u0006*\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\u000e\u001a\u00020\b*\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0017\u0010\u001c\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018\"\u0017\u0010\u001f\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018\"\u0017\u0010#\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010 \u001a\u0004\b!\u0010\"\"\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018¨\u0006&"}, d2 = {"", "pathStr", "", "Lcom/google/android/u39;", "a", "(Ljava/lang/String;)Ljava/util/List;", "Lcom/google/android/ei1;", "other", "", "f", "(JJ)Z", "h", "(J)J", "Landroidx/compose/ui/graphics/h;", "g", "(Landroidx/compose/ui/graphics/h;)Z", "Ljava/util/List;", "e", "()Ljava/util/List;", "EmptyPath", "Lcom/google/android/wbc;", "b", "I", "c", "()I", "DefaultStrokeLineCap", "Lcom/google/android/ybc;", "d", "DefaultStrokeLineJoin", "Landroidx/compose/ui/graphics/e;", "getDefaultTintBlendMode", "DefaultTintBlendMode", "J", "getDefaultTintColor", "()J", "DefaultTintColor", "Landroidx/compose/ui/graphics/p;", "DefaultFillType", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a3e {
    private static final List<u39> a = m.p();
    private static final int b = wbc.INSTANCE.a();
    private static final int c = ybc.INSTANCE.b();
    private static final int d = e.INSTANCE.z();
    private static final long e = ei1.INSTANCE.h();
    private static final int f = p.INSTANCE.b();

    public static final List<u39> a(String str) {
        return str == null ? a : new y39().a(str).d();
    }

    public static final int b() {
        return f;
    }

    public static final int c() {
        return b;
    }

    public static final int d() {
        return c;
    }

    public static final List<u39> e() {
        return a;
    }

    public static final boolean f(long j, long j2) {
        return ei1.w(j) == ei1.w(j2) && ei1.v(j) == ei1.v(j2) && ei1.t(j) == ei1.t(j2);
    }

    public static final boolean g(h hVar) {
        if (!(hVar instanceof BlendModeColorFilter)) {
            return hVar == null;
        }
        BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) hVar;
        int blendMode = blendModeColorFilter.getBlendMode();
        e.Companion companion = e.INSTANCE;
        return e.E(blendMode, companion.z()) || e.E(blendModeColorFilter.getBlendMode(), companion.B());
    }

    public static final long h(long j) {
        return ei1.s(j) == 1.0f ? j : ei1.p(j, 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
    }
}
