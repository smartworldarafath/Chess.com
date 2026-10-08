package com.google.inputmethod;

import androidx.compose.p004runtime.p0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0001\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR+\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/google/android/cu6;", "Lcom/google/android/q6c;", "Lkotlin/ranges/IntRange;", "", "firstVisibleItem", "slidingWindowSize", "extraItemCount", "<init>", "(III)V", "", "m", "(I)V", "a", "I", "b", "<set-?>", "c", "Lcom/google/android/o58;", "()Lkotlin/ranges/IntRange;", "g", "(Lkotlin/ranges/IntRange;)V", "value", "d", "lastFirstVisibleItem", "e", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class cu6 implements q6c<IntRange> {
    private static final a e = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int slidingWindowSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int extraItemCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final o58 value;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int lastFirstVisibleItem;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/cu6$a;", "", "<init>", "()V", "", "firstVisibleItem", "slidingWindowSize", "extraItemCount", "Lkotlin/ranges/IntRange;", "b", "(III)Lkotlin/ranges/IntRange;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final IntRange b(int firstVisibleItem, int slidingWindowSize, int extraItemCount) {
            int i = (firstVisibleItem / slidingWindowSize) * slidingWindowSize;
            return g.A(Math.max(i - extraItemCount, 0), i + slidingWindowSize + extraItemCount);
        }

        private a() {
        }
    }

    public cu6(int i, int i2, int i3) {
        this.slidingWindowSize = i2;
        this.extraItemCount = i3;
        this.value = p0.i(e.b(i, i2, i3), p0.t());
        this.lastFirstVisibleItem = i;
    }

    private void g(IntRange intRange) {
        this.value.setValue(intRange);
    }

    @Override // com.google.inputmethod.q6c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public IntRange getValue() {
        return (IntRange) this.value.getValue();
    }

    public final void m(int firstVisibleItem) {
        if (firstVisibleItem != this.lastFirstVisibleItem) {
            this.lastFirstVisibleItem = firstVisibleItem;
            g(e.b(firstVisibleItem, this.slidingWindowSize, this.extraItemCount));
        }
    }
}
