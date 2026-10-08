package com.google.inputmethod;

import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b`\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J'\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJU\u0010\u0013\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lcom/google/android/d9c;", "", "", "firstVisibleItemIndex", "lastVisibleItemIndex", "Lcom/google/android/x06;", "stickyItems", "b", "(IILcom/google/android/x06;)Lcom/google/android/x06;", "", "Lcom/google/android/yt6;", "visibleStickyItems", "itemIndex", "itemSize", "itemOffset", "beforeContentPadding", "afterContentPadding", "layoutWidth", "layoutHeight", "a", "(Ljava/util/List;IIIIIII)I", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d9c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.google.android.d9c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/google/android/d9c$a;", "", "<init>", "()V", "Lcom/google/android/d9c;", "b", "Lcom/google/android/d9c;", "a", "()Lcom/google/android/d9c;", "StickToTopPlacement", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final d9c StickToTopPlacement = new C0106a();

        /* JADX INFO: renamed from: com.google.android.d9c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JU\u0010\r\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"com/google/android/d9c$a$a", "Lcom/google/android/d9c;", "", "Lcom/google/android/yt6;", "visibleStickyItems", "", "itemIndex", "itemSize", "itemOffset", "beforeContentPadding", "afterContentPadding", "layoutWidth", "layoutHeight", "a", "(Ljava/util/List;IIIIIII)I", "firstVisibleItemIndex", "lastVisibleItemIndex", "Lcom/google/android/x06;", "stickyItems", "b", "(IILcom/google/android/x06;)Lcom/google/android/x06;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C0106a implements d9c {
            C0106a() {
            }

            @Override // com.google.inputmethod.d9c
            public int a(List<? extends yt6> visibleStickyItems, int itemIndex, int itemSize, int itemOffset, int beforeContentPadding, int afterContentPadding, int layoutWidth, int layoutHeight) {
                yt6 yt6Var;
                int size = visibleStickyItems.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        yt6Var = null;
                        break;
                    }
                    yt6Var = visibleStickyItems.get(i);
                    if (yt6Var.getIndex() != itemIndex) {
                        break;
                    }
                    i++;
                }
                yt6 yt6Var2 = yt6Var;
                int iC = yt6Var2 != null ? xu6.c(yt6Var2) : Integer.MIN_VALUE;
                int iMax = itemOffset == Integer.MIN_VALUE ? -beforeContentPadding : Math.max(-beforeContentPadding, itemOffset);
                return iC != Integer.MIN_VALUE ? Math.min(iMax, iC - itemSize) : iMax;
            }

            @Override // com.google.inputmethod.d9c
            public x06 b(int firstVisibleItemIndex, int lastVisibleItemIndex, x06 stickyItems) {
                int i;
                if (lastVisibleItemIndex - firstVisibleItemIndex < 0 || (i = stickyItems._size) == 0) {
                    return y06.a();
                }
                IntRange intRangeA = g.A(0, i);
                int iF = intRangeA.f();
                int i2 = intRangeA.i();
                int iE = -1;
                if (iF <= i2) {
                    while (stickyItems.e(iF) <= firstVisibleItemIndex) {
                        iE = stickyItems.e(iF);
                        if (iF == i2) {
                            break;
                        }
                        iF++;
                    }
                }
                return iE == -1 ? y06.a() : y06.b(iE);
            }
        }

        private Companion() {
        }

        public final d9c a() {
            return StickToTopPlacement;
        }
    }

    int a(List<? extends yt6> visibleStickyItems, int itemIndex, int itemSize, int itemOffset, int beforeContentPadding, int afterContentPadding, int layoutWidth, int layoutHeight);

    x06 b(int firstVisibleItemIndex, int lastVisibleItemIndex, x06 stickyItems);
}
