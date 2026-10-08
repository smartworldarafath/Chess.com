package com.google.inputmethod;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\nR\u0011\u0010\u000e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0012\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0014\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001a"}, d2 = {"Lcom/google/android/pbd;", "", "", "packedValue", "d", "(J)J", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "b", "(JLandroidx/compose/ui/unit/LayoutDirection;)I", "c", "g", "(J)I", "start", "h", "top", "f", "end", "e", "bottom", "", "i", "(J)Z", "isLayoutDirectionAware", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class pbd {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long b = qbd.c(0, 0, 0, 0, 14, null);

    /* JADX INFO: renamed from: com.google.android.pbd$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/google/android/pbd$a;", "", "<init>", "()V", "", "packedValue", "", "position", "e", "(JI)I", "int", "d", "(II)J", "start", "top", "end", "bottom", "", "isLayoutDirectionAware", "c", "(IIIIZ)J", "Lcom/google/android/pbd;", "None", "J", "b", "()J", "MASK", "I", "SHIFT", "MAX_VALUE", "IS_LAYOUT_DIRECTION_AWARE", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final long d(int i, int position) {
            return ((long) (i & 32767)) << (position * 15);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int e(long packedValue, int position) {
            return ((int) (packedValue >> (position * 15))) & 32767;
        }

        public final long b() {
            return pbd.b;
        }

        public final long c(int start, int top, int end, int bottom, boolean isLayoutDirectionAware) {
            return d(top, 1) | d(start, 0) | d(end, 2) | d(bottom, 3) | (isLayoutDirectionAware ? Long.MIN_VALUE : 0L);
        }

        private Companion() {
        }
    }

    public static final int b(long j, LayoutDirection layoutDirection) {
        return (!i(j) || layoutDirection == LayoutDirection.Ltr) ? g(j) : f(j);
    }

    public static final int c(long j, LayoutDirection layoutDirection) {
        return (!i(j) || layoutDirection == LayoutDirection.Ltr) ? f(j) : g(j);
    }

    public static long d(long j) {
        return j;
    }

    public static final int e(long j) {
        return INSTANCE.e(j, 3);
    }

    public static final int f(long j) {
        return INSTANCE.e(j, 2);
    }

    public static final int g(long j) {
        return INSTANCE.e(j, 0);
    }

    public static final int h(long j) {
        return INSTANCE.e(j, 1);
    }

    public static final boolean i(long j) {
        return (j & Long.MIN_VALUE) != 0;
    }
}
