package com.google.inputmethod;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001:\u0003\n\u0019\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010!R\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010!R\u0016\u0010&\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010!R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R*\u00101\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010!\u001a\u0004\b(\u0010.\"\u0004\b/\u00100R\u0014\u00102\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010.R\u0011\u00103\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b+\u0010.¨\u00064"}, d2 = {"Lcom/google/android/yq6;", "", "Lcom/google/android/op6;", "gridContent", "<init>", "(Lcom/google/android/op6;)V", "", "currentSlotsPerLine", "", "Lcom/google/android/q15;", "c", "(I)Ljava/util/List;", "", "i", "()V", "lineIndex", "Lcom/google/android/yq6$c;", "d", "(I)Lcom/google/android/yq6$c;", "itemIndex", "e", "(I)I", "maxSpan", "k", "(II)I", "a", "Lcom/google/android/op6;", "Ljava/util/ArrayList;", "Lcom/google/android/yq6$a;", "Lkotlin/collections/ArrayList;", "b", "Ljava/util/ArrayList;", "buckets", "I", "lastLineIndex", "lastLineStartItemIndex", "lastLineStartKnownSpan", "f", "cachedBucketIndex", "", "g", "Ljava/util/List;", "cachedBucket", "h", "previousDefaultSpans", "value", "()I", "j", "(I)V", "slotsPerLine", "bucketSize", "totalSize", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class yq6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final op6 gridContent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ArrayList<a> buckets;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int lastLineIndex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int lastLineStartItemIndex;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int lastLineStartKnownSpan;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int cachedBucketIndex;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<Integer> cachedBucket;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private List<q15> previousDefaultSpans;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int slotsPerLine;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\n\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\u0005\u0010\tR\"\u0010\r\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/google/android/yq6$b;", "Lcom/google/android/wp6;", "<init>", "()V", "", "b", "I", "getMaxCurrentLineSpan", "()I", "(I)V", "maxCurrentLineSpan", "c", "a", "maxLineSpan", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b implements wp6 {
        public static final b a = new b();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static int maxCurrentLineSpan;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static int maxLineSpan;

        private b() {
        }

        @Override // com.google.inputmethod.wp6
        public int a() {
            return maxLineSpan;
        }

        public void b(int i) {
            maxCurrentLineSpan = i;
        }

        public void c(int i) {
            maxLineSpan = i;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/google/android/yq6$c;", "", "", "firstItemIndex", "", "Lcom/google/android/q15;", "spans", "<init>", "(ILjava/util/List;)V", "a", "I", "()I", "b", "Ljava/util/List;", "()Ljava/util/List;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int firstItemIndex;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<q15> spans;

        public c(int i, List<q15> list) {
            this.firstItemIndex = i;
            this.spans = list;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        public final List<q15> b() {
            return this.spans;
        }
    }

    public yq6(op6 op6Var) {
        this.gridContent = op6Var;
        ArrayList<a> arrayList = new ArrayList<>();
        int i = 0;
        arrayList.add(new a(i, i, 2, null));
        this.buckets = arrayList;
        this.cachedBucketIndex = -1;
        this.cachedBucket = new ArrayList();
        this.previousDefaultSpans = m.p();
    }

    private final int b() {
        return ((int) Math.sqrt((((double) h()) * 1.0d) / ((double) this.slotsPerLine))) + 1;
    }

    private final List<q15> c(int currentSlotsPerLine) {
        if (currentSlotsPerLine == this.previousDefaultSpans.size()) {
            return this.previousDefaultSpans;
        }
        ArrayList arrayList = new ArrayList(currentSlotsPerLine);
        for (int i = 0; i < currentSlotsPerLine; i++) {
            arrayList.add(q15.a(wq6.a(1)));
        }
        this.previousDefaultSpans = arrayList;
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(int i, a aVar) {
        return aVar.getFirstItemIndex() - i;
    }

    private final void i() {
        this.buckets.clear();
        int i = 0;
        this.buckets.add(new a(i, i, 2, null));
        this.lastLineIndex = 0;
        this.lastLineStartItemIndex = 0;
        this.lastLineStartKnownSpan = 0;
        this.cachedBucketIndex = -1;
        this.cachedBucket.clear();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0091  */
    public final c d(int lineIndex) {
        int i;
        boolean z;
        int i2;
        int i3;
        if (!this.gridContent.getHasCustomSpans()) {
            int i4 = lineIndex * this.slotsPerLine;
            return new c(i4, c(g.e(g.j(this.slotsPerLine, h() - i4), 0)));
        }
        int iMin = Math.min(lineIndex / b(), this.buckets.size() - 1);
        int iB = b() * iMin;
        int firstItemIndex = this.buckets.get(iMin).getFirstItemIndex();
        int firstItemKnownSpan = this.buckets.get(iMin).getFirstItemKnownSpan();
        int i5 = this.lastLineIndex;
        if (iB <= i5 && i5 <= lineIndex) {
            firstItemIndex = this.lastLineStartItemIndex;
            firstItemKnownSpan = this.lastLineStartKnownSpan;
            iB = i5;
        } else if (iMin == this.cachedBucketIndex && (i = lineIndex - iB) < this.cachedBucket.size()) {
            firstItemIndex = this.cachedBucket.get(i).intValue();
            iB = lineIndex;
            firstItemKnownSpan = 0;
        }
        if (iB % b() == 0) {
            int iB2 = b();
            int i6 = lineIndex - iB;
            if (2 > i6 || i6 >= iB2) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (z) {
            this.cachedBucketIndex = iMin;
            this.cachedBucket.clear();
        }
        if (!(iB <= lineIndex)) {
            cx5.c("currentLine (" + iB + ") > lineIndex (" + lineIndex + ')');
        }
        while (iB < lineIndex && firstItemIndex < h()) {
            if (z) {
                this.cachedBucket.add(Integer.valueOf(firstItemIndex));
            }
            int i7 = 0;
            while (i7 < this.slotsPerLine && firstItemIndex < h()) {
                if (firstItemKnownSpan == 0) {
                    i3 = firstItemKnownSpan;
                    firstItemKnownSpan = k(firstItemIndex, this.slotsPerLine - i7);
                } else {
                    i3 = 0;
                }
                i7 += firstItemKnownSpan;
                if (i7 > this.slotsPerLine) {
                    break;
                }
                firstItemIndex++;
                firstItemKnownSpan = i3;
            }
            iB++;
            if (iB % b() == 0 && firstItemIndex < h()) {
                if (!(this.buckets.size() == iB / b())) {
                    cx5.c("invalid starting point");
                }
                this.buckets.add(new a(firstItemIndex, firstItemKnownSpan));
            }
        }
        this.lastLineIndex = lineIndex;
        this.lastLineStartItemIndex = firstItemIndex;
        this.lastLineStartKnownSpan = firstItemKnownSpan;
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        int i9 = firstItemIndex;
        while (i8 < this.slotsPerLine && i9 < h()) {
            if (firstItemKnownSpan == 0) {
                int i10 = firstItemKnownSpan;
                firstItemKnownSpan = k(i9, this.slotsPerLine - i8);
                i2 = i10;
            } else {
                i2 = 0;
            }
            i8 += firstItemKnownSpan;
            if (i8 > this.slotsPerLine) {
                break;
            }
            i9++;
            arrayList.add(q15.a(wq6.a(firstItemKnownSpan)));
            firstItemKnownSpan = i2;
        }
        return new c(firstItemIndex, arrayList);
    }

    public final int e(final int itemIndex) {
        int i = 0;
        if (h() <= 0) {
            return 0;
        }
        if (!(itemIndex < h())) {
            cx5.a("ItemIndex > total count");
        }
        if (!this.gridContent.getHasCustomSpans()) {
            return itemIndex / this.slotsPerLine;
        }
        int iN = m.n(this.buckets, 0, 0, new Function1() { // from class: com.google.android.xq6
            public final Object invoke(Object obj) {
                return Integer.valueOf(yq6.f(itemIndex, (yq6.a) obj));
            }
        }, 3, (Object) null);
        int i2 = 2;
        if (iN < 0) {
            iN = (-iN) - 2;
        }
        int iB = b() * iN;
        int firstItemIndex = this.buckets.get(iN).getFirstItemIndex();
        if (!(firstItemIndex <= itemIndex)) {
            cx5.a("currentItemIndex > itemIndex");
        }
        int i3 = 0;
        while (firstItemIndex < itemIndex) {
            int i4 = firstItemIndex + 1;
            int iK = k(firstItemIndex, this.slotsPerLine - i3);
            i3 += iK;
            int i5 = this.slotsPerLine;
            if (i3 >= i5) {
                if (i3 == i5) {
                    iB++;
                    i3 = 0;
                } else {
                    iB++;
                    i3 = iK;
                }
            }
            if (iB % b() == 0 && iB / b() >= this.buckets.size()) {
                this.buckets.add(new a(i4 - (i3 > 0 ? 1 : 0), i, i2, null));
            }
            firstItemIndex = i4;
        }
        return i3 + k(itemIndex, this.slotsPerLine - i3) > this.slotsPerLine ? iB + 1 : iB;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getSlotsPerLine() {
        return this.slotsPerLine;
    }

    public final int h() {
        return this.gridContent.o().getSize();
    }

    public final void j(int i) {
        if (i != this.slotsPerLine) {
            this.slotsPerLine = i;
            i();
        }
    }

    public final int k(int itemIndex, int maxSpan) {
        b bVar = b.a;
        bVar.b(maxSpan);
        bVar.c(this.slotsPerLine);
        d66.a<ip6> aVar = this.gridContent.o().get(itemIndex);
        return q15.d(((q15) aVar.c().b().invoke(bVar, Integer.valueOf(itemIndex - aVar.getStartIndex()))).getPackedValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/google/android/yq6$a;", "", "", "firstItemIndex", "firstItemKnownSpan", "<init>", "(II)V", "a", "I", "()I", "b", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int firstItemIndex;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int firstItemKnownSpan;

        public a(int i, int i2) {
            this.firstItemIndex = i;
            this.firstItemKnownSpan = i2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getFirstItemKnownSpan() {
            return this.firstItemKnownSpan;
        }

        public /* synthetic */ a(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i3 & 2) != 0 ? 0 : i2);
        }
    }
}
