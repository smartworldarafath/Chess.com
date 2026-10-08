package com.google.inputmethod;

import android.text.SegmentFinder;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/android/ut;", "", "<init>", "()V", "Lcom/google/android/ncb;", "Landroid/text/SegmentFinder;", "a", "(Lcom/google/android/ncb;)Landroid/text/SegmentFinder;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ut {
    public static final ut a = new ut();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"com/google/android/ut$a", "Landroid/text/SegmentFinder;", "", "offset", "previousStartBoundary", "(I)I", "previousEndBoundary", "nextStartBoundary", "nextEndBoundary", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends SegmentFinder {
        final /* synthetic */ ncb a;

        a(ncb ncbVar) {
            this.a = ncbVar;
        }

        public int nextEndBoundary(int offset) {
            return this.a.d(offset);
        }

        public int nextStartBoundary(int offset) {
            return this.a.b(offset);
        }

        public int previousEndBoundary(int offset) {
            return this.a.a(offset);
        }

        public int previousStartBoundary(int offset) {
            return this.a.c(offset);
        }
    }

    private ut() {
    }

    public final SegmentFinder a(ncb ncbVar) {
        return kl.a(new a(ncbVar));
    }
}
