package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/google/android/n15;", "", "<init>", "()V", "a", "b", "Lcom/google/android/n15$a;", "Lcom/google/android/n15$b;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class n15 {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0007"}, d2 = {"Lcom/google/android/n15$a;", "Lcom/google/android/n15;", "Lcom/google/android/ff3;", "minSize", "F", "a", "()F", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends n15 {
        public final float a() {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/google/android/n15$b;", "Lcom/google/android/n15;", "", "count", "<init>", "(I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends n15 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int count;

        public b(int i) {
            super(null);
            this.count = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.e(b.class, other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.h(other, "null cannot be cast to non-null type androidx.glance.appwidget.lazy.GridCells.Fixed");
            return this.count == ((b) other).count;
        }

        public int hashCode() {
            return this.count;
        }
    }

    public /* synthetic */ n15(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private n15() {
    }
}
