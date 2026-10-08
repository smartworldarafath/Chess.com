package com.google.inputmethod;

import com.google.android.sh7;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b!\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\b*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\b*\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001b\u0010\u0011\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JK\u0010\u001f\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 JG\u0010#\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0017H\u0002¢\u0006\u0004\b#\u0010$J#\u0010'\u001a\u00020\u0017*\u00020\u000b2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0017H\u0002¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020-2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u0001H\u0002¢\u0006\u0004\b.\u0010/J'\u00100\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u0017H\u0002¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0017H\u0002¢\u0006\u0004\b2\u0010+J\u001f\u00105\u001a\u00020\b2\u0006\u00103\u001a\u00020\u00172\u0006\u00104\u001a\u00020\u0017H\u0002¢\u0006\u0004\b5\u0010+J#\u00107\u001a\u00020\b*\u00020\u000b2\u0006\u0010%\u001a\u00020\u00172\u0006\u00106\u001a\u00020\u0017H\u0002¢\u0006\u0004\b7\u00108J\u0013\u00109\u001a\u00020\b*\u00020\u000bH\u0002¢\u0006\u0004\b9\u0010\rJ\u0019\u0010:\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b:\u0010\u0012J\u0011\u0010;\u001a\u00020\b*\u00020\u000b¢\u0006\u0004\b;\u0010\rJ\r\u0010<\u001a\u00020\u0004¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\b¢\u0006\u0004\b>\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR \u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0D0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010JR\u0014\u0010N\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010MR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020-0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010GR\u0016\u0010Q\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010PR\u0016\u0010S\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010RR\u0016\u0010T\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010BR$\u0010Y\u001a\u00020\u00172\u0006\u0010U\u001a\u00020\u00178\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bV\u0010R\u001a\u0004\bW\u0010XR$\u0010\\\u001a\u00020\u00172\u0006\u0010U\u001a\u00020\u00178\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bZ\u0010R\u001a\u0004\b[\u0010XR\u0016\u0010]\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010RR\u0016\u0010^\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010RR\u0016\u0010_\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010BR\u0016\u0010\"\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010R¨\u0006`"}, d2 = {"Lcom/google/android/h11;", "", "Lcom/google/android/bt6;", "cacheWindow", "", "enableInitialPrefetch", "<init>", "(Lcom/google/android/bt6;Z)V", "", "A", "()V", "Lcom/google/android/i11;", "o", "(Lcom/google/android/i11;)V", "p", "", "delta", "g", "(Lcom/google/android/i11;F)V", "h", "refillForward", "v", "(Lcom/google/android/i11;Z)V", "", "visibleWindowStart", "visibleWindowEnd", "prefetchForwardWindow", "mainAxisExtraSpaceEnd", "mainAxisExtraSpaceStart", "scrollDelta", "applyForwardPrefetch", "s", "(Lcom/google/android/i11;IIIIIFZ)V", "keepAroundWindow", "itemsCount", "r", "(IIIIIFI)V", "index", "isUrgent", "i", "(Lcom/google/android/i11;IZ)I", "size", "d", "(II)V", "key", "Lcom/google/android/n11;", "B", "(IILjava/lang/Object;)Lcom/google/android/n11;", "e", "(ILjava/lang/Object;I)V", "f", "startLine", "endLine", "w", "itemSize", "q", "(Lcom/google/android/i11;II)V", "y", "t", "u", "n", "()Z", "x", "a", "Lcom/google/android/bt6;", "b", "Z", "Lcom/google/android/o48;", "", "Lcom/google/android/nu6$b;", "c", "Lcom/google/android/o48;", "prefetchWindowHandles", "Lcom/google/android/p48;", "Lcom/google/android/p48;", "indicesToRemove", "Lcom/google/android/m48;", "Lcom/google/android/m48;", "windowCache", "windowCacheWithItems", "F", "previousPassDelta", "I", "previousPassItemCount", "hasUpdatedVisibleItemsOnce", "value", "j", "m", "()I", "prefetchWindowStartLine", "k", "l", "prefetchWindowEndLine", "prefetchWindowStartExtraSpace", "prefetchWindowEndExtraSpace", "shouldRefillWindow", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class h11 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final bt6 cacheWindow;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean enableInitialPrefetch;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float previousPassDelta;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean hasUpdatedVisibleItemsOnce;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int prefetchWindowStartExtraSpace;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int prefetchWindowEndExtraSpace;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean shouldRefillWindow;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private int itemsCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final o48<List<nu6.b>> prefetchWindowHandles = f16.c();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final p48 indicesToRemove = p16.b();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final m48 windowCache = s06.a();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final o48<CachedItem> windowCacheWithItems = f16.c();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int previousPassItemCount = -1;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int prefetchWindowStartLine = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int prefetchWindowEndLine = t04.INVALID_ID;

    public h11(bt6 bt6Var, boolean z) {
        this.cacheWindow = bt6Var;
        this.enableInitialPrefetch = z;
    }

    private final void A() {
        uo.a("prefetchWindowStartExtraSpace", this.prefetchWindowStartExtraSpace);
        uo.a("prefetchWindowEndExtraSpace", this.prefetchWindowEndExtraSpace);
        uo.a("prefetchWindowStartIndex", this.prefetchWindowStartLine);
        uo.a("prefetchWindowEndIndex", this.prefetchWindowEndLine);
    }

    private final CachedItem B(int index, int size, Object key) {
        CachedItem cachedItemB = this.windowCacheWithItems.b(index);
        if (cachedItemB == null) {
            return new CachedItem(key, size);
        }
        cachedItemB.d(size);
        cachedItemB.c(key);
        return cachedItemB;
    }

    private final void d(int index, int size) {
        if (up1.isCacheWindowRefillFixEnabled) {
            this.windowCacheWithItems.r(index, B(index, size, CachedItem.INSTANCE));
        } else {
            this.windowCache.u(index, size);
        }
        if (index > this.prefetchWindowEndLine) {
            this.prefetchWindowEndLine = index;
            this.prefetchWindowEndExtraSpace -= size;
        } else if (index < this.prefetchWindowStartLine) {
            this.prefetchWindowStartLine = index;
            this.prefetchWindowStartExtraSpace -= size;
        }
    }

    private final void e(int index, Object key, int size) {
        if (this.windowCacheWithItems.a(index)) {
            CachedItem cachedItemB = this.windowCacheWithItems.b(index);
            Intrinsics.g(cachedItemB);
            int mainAxisSize = cachedItemB.getMainAxisSize();
            CachedItem cachedItemB2 = this.windowCacheWithItems.b(index);
            Intrinsics.g(cachedItemB2);
            Object key2 = cachedItemB2.getKey();
            if (mainAxisSize != size || !Intrinsics.e(key2, key)) {
                this.shouldRefillWindow = true;
            }
        }
        this.windowCacheWithItems.r(index, B(index, size, key));
        this.prefetchWindowStartLine = Math.min(this.prefetchWindowStartLine, index);
        this.prefetchWindowEndLine = Math.max(this.prefetchWindowEndLine, index);
        List<nu6.b> listO = this.prefetchWindowHandles.o(index);
        if (listO != null) {
            int size2 = listO.size();
            for (int i = 0; i < size2; i++) {
                listO.get(i).cancel();
            }
        }
    }

    private final void f(int index, int size) {
        if (this.windowCache.a(index) && this.windowCache.c(index) != size) {
            this.shouldRefillWindow = true;
        }
        this.windowCache.u(index, size);
        this.prefetchWindowStartLine = Math.min(this.prefetchWindowStartLine, index);
        this.prefetchWindowEndLine = Math.max(this.prefetchWindowEndLine, index);
        List<nu6.b> listO = this.prefetchWindowHandles.o(index);
        if (listO != null) {
            int size2 = listO.size();
            for (int i = 0; i < size2; i++) {
                listO.get(i).cancel();
            }
        }
    }

    private final void g(i11 i11Var, float f) {
        if (i11Var.e()) {
            int iH = i11Var.h();
            bt6 bt6Var = this.cacheWindow;
            f43 density = i11Var.getDensity();
            int iA = density != null ? bt6Var.a(density, iH) : 0;
            this.itemsCount = i11Var.d();
            r(i11Var.j(), i11Var.n(), i11Var.p(), i11Var.o(), iA, f, i11Var.d());
        }
    }

    private final void h(i11 i11Var, float f) {
        if (i11Var.e()) {
            int iH = i11Var.h();
            bt6 bt6Var = this.cacheWindow;
            f43 density = i11Var.getDensity();
            int iB = density != null ? bt6Var.b(density, iH) : 0;
            s(i11Var, i11Var.j(), i11Var.n(), iB, i11Var.p(), i11Var.o(), f, f <= 0.0f);
        }
    }

    private final int i(final i11 i11Var, int i, boolean z) {
        List<nu6.b> listB;
        List<nu6.b> listB2;
        List<nu6.b> listB3;
        List<nu6.b> listB4;
        int i2 = 0;
        if (!up1.isCacheWindowRefillFixEnabled) {
            if (this.windowCache.a(i)) {
                return this.windowCache.c(i);
            }
            if (this.prefetchWindowHandles.a(i)) {
                if (z && (listB2 = this.prefetchWindowHandles.b(i)) != null) {
                    int size = listB2.size();
                    while (i2 < size) {
                        listB2.get(i2).d();
                        i2++;
                    }
                }
                return -1;
            }
            this.prefetchWindowHandles.r(i, i11Var.f(i, new Function2() { // from class: com.google.android.f11
                public final Object invoke(Object obj, Object obj2) {
                    return h11.j(this.a, i11Var, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                }
            }));
            if (z && (listB = this.prefetchWindowHandles.b(i)) != null) {
                int size2 = listB.size();
                while (i2 < size2) {
                    listB.get(i2).d();
                    i2++;
                }
            }
            return -1;
        }
        if (this.windowCacheWithItems.a(i)) {
            CachedItem cachedItemB = this.windowCacheWithItems.b(i);
            Intrinsics.g(cachedItemB);
            return cachedItemB.getMainAxisSize();
        }
        if (this.prefetchWindowHandles.a(i)) {
            if (z && (listB4 = this.prefetchWindowHandles.b(i)) != null) {
                int size3 = listB4.size();
                while (i2 < size3) {
                    listB4.get(i2).d();
                    i2++;
                }
            }
            return -1;
        }
        this.prefetchWindowHandles.r(i, i11Var.f(i, new Function2() { // from class: com.google.android.e11
            public final Object invoke(Object obj, Object obj2) {
                return h11.k(this.a, i11Var, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        }));
        if (z && (listB3 = this.prefetchWindowHandles.b(i)) != null) {
            int size4 = listB3.size();
            while (i2 < size4) {
                listB3.get(i2).d();
                i2++;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(h11 h11Var, i11 i11Var, int i, int i2) {
        h11Var.q(i11Var, i, i2);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(h11 h11Var, i11 i11Var, int i, int i2) {
        h11Var.q(i11Var, i, i2);
        return Unit.a;
    }

    private final void o(i11 i11Var) {
        this.shouldRefillWindow = true;
        if (i11Var.e()) {
            this.prefetchWindowStartLine = g.e(this.prefetchWindowStartLine, 0);
            int i = i11Var.i();
            if (i != -1) {
                this.prefetchWindowEndLine = g.j(this.prefetchWindowEndLine, i);
            }
            if (this.previousPassDelta <= 0.0f) {
                w(i11Var.n(), this.itemsCount - 1);
            } else {
                w(0, i11Var.j());
            }
        }
    }

    private final void p(i11 i11Var) {
        this.shouldRefillWindow = true;
        this.prefetchWindowStartLine = g.e(this.prefetchWindowStartLine, 0);
        int i = i11Var.i();
        if (i != -1) {
            this.prefetchWindowEndLine = g.j(this.prefetchWindowEndLine, i);
        }
        w(this.prefetchWindowEndLine, this.itemsCount - 1);
    }

    private final void q(i11 i11Var, int i, int i2) {
        d(i, i2);
        y(i11Var);
        A();
    }

    private final void r(int visibleWindowStart, int visibleWindowEnd, int mainAxisExtraSpaceEnd, int mainAxisExtraSpaceStart, int keepAroundWindow, float scrollDelta, int itemsCount) {
        int i;
        int iC;
        int i2;
        int iC2;
        if (scrollDelta <= 0.0f) {
            this.prefetchWindowStartExtraSpace = keepAroundWindow - mainAxisExtraSpaceStart;
            this.prefetchWindowStartLine = visibleWindowStart;
            while (this.prefetchWindowStartExtraSpace > 0 && (i2 = this.prefetchWindowStartLine) > 0) {
                if (!up1.isCacheWindowRefillFixEnabled) {
                    if (!this.windowCache.a(i2 - 1)) {
                        break;
                    }
                    iC2 = this.windowCache.c(this.prefetchWindowStartLine - 1);
                    this.prefetchWindowStartLine--;
                    this.prefetchWindowStartExtraSpace -= iC2;
                } else {
                    if (!this.windowCacheWithItems.a(i2 - 1)) {
                        break;
                    }
                    CachedItem cachedItemB = this.windowCacheWithItems.b(this.prefetchWindowStartLine - 1);
                    Intrinsics.g(cachedItemB);
                    iC2 = cachedItemB.getMainAxisSize();
                    this.prefetchWindowStartLine--;
                    this.prefetchWindowStartExtraSpace -= iC2;
                }
            }
            w(0, this.prefetchWindowStartLine - 1);
            return;
        }
        this.prefetchWindowEndExtraSpace = keepAroundWindow - mainAxisExtraSpaceEnd;
        this.prefetchWindowEndLine = visibleWindowEnd;
        while (this.prefetchWindowEndExtraSpace > 0 && (i = this.prefetchWindowEndLine) < itemsCount - 1) {
            if (!up1.isCacheWindowRefillFixEnabled) {
                if (!this.windowCache.a(i + 1)) {
                    break;
                }
                iC = this.windowCache.c(this.prefetchWindowEndLine + 1);
                this.prefetchWindowEndLine++;
                this.prefetchWindowEndExtraSpace -= iC;
            } else {
                if (!this.windowCacheWithItems.a(i + 1)) {
                    break;
                }
                CachedItem cachedItemB2 = this.windowCacheWithItems.b(this.prefetchWindowEndLine + 1);
                Intrinsics.g(cachedItemB2);
                iC = cachedItemB2.getMainAxisSize();
                this.prefetchWindowEndLine++;
                this.prefetchWindowEndExtraSpace -= iC;
            }
        }
        w(this.prefetchWindowEndLine + 1, itemsCount - 1);
    }

    private final void s(i11 i11Var, int i, int i2, int i3, int i4, int i5, float f, boolean z) {
        int i6;
        boolean z2 = Math.signum(f) == Math.signum(this.previousPassDelta);
        if (!z) {
            if (!z2 || this.shouldRefillWindow) {
                this.prefetchWindowStartExtraSpace = i3 - i5;
                this.prefetchWindowStartLine = i;
            } else {
                this.prefetchWindowStartExtraSpace = g.j(this.prefetchWindowStartExtraSpace + sh7.d(Math.abs(f)), i3 - i5);
            }
            while (this.prefetchWindowStartExtraSpace > 0 && (i6 = this.prefetchWindowStartLine) > 0) {
                int i7 = i(i11Var, this.prefetchWindowStartLine - 1, i6 + (-1) == i + (-1) && (!up1.isCacheWindowRefillFixEnabled || (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) != 0) && Math.abs(f) >= ((float) i5));
                if (i7 == -1) {
                    return;
                }
                this.prefetchWindowStartLine--;
                this.prefetchWindowStartExtraSpace -= i7;
            }
            return;
        }
        if (!z2 || this.shouldRefillWindow) {
            this.prefetchWindowEndExtraSpace = i3 - i4;
            this.prefetchWindowEndLine = i2;
        } else {
            this.prefetchWindowEndExtraSpace = g.j(this.prefetchWindowEndExtraSpace + sh7.d(Math.abs(f)), i3 - i4);
        }
        while (this.prefetchWindowEndExtraSpace > 0 && i11Var.m(this.prefetchWindowEndLine) != -1 && i11Var.m(this.prefetchWindowEndLine) < this.itemsCount - 1) {
            int i8 = i(i11Var, this.prefetchWindowEndLine + 1, this.prefetchWindowEndLine + 1 == i2 + 1 && (!up1.isCacheWindowRefillFixEnabled || (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) != 0) && Math.abs(f) >= ((float) i4));
            if (i8 == -1) {
                return;
            }
            this.prefetchWindowEndLine++;
            this.prefetchWindowEndExtraSpace -= i8;
        }
    }

    private final void v(i11 i11Var, boolean z) {
        if (i11Var.e()) {
            int iH = i11Var.h();
            bt6 bt6Var = this.cacheWindow;
            f43 density = i11Var.getDensity();
            s(i11Var, i11Var.j(), i11Var.n(), density != null ? bt6Var.b(density, iH) : 0, i11Var.p(), i11Var.o(), 0.0f, z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8 A[LOOP:2: B:28:0x0086->B:41:0x00b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f9 A[LOOP:4: B:45:0x00c7->B:58:0x00f9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x00bb A[EDGE_INSN: B:85:0x00bb->B:42:0x00bb BREAK  A[LOOP:2: B:28:0x0086->B:41:0x00b8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00fc A[EDGE_INSN: B:92:0x00fc->B:59:0x00fc BREAK  A[LOOP:4: B:45:0x00c7->B:58:0x00f9], SYNTHETIC] */
    private final void w(int startLine, int endLine) {
        char c;
        long j;
        long j2;
        long j3;
        int i;
        int i2;
        char c2;
        this.indicesToRemove.i();
        o48<List<nu6.b>> o48Var = this.prefetchWindowHandles;
        int[] iArr = o48Var.keys;
        long[] jArr = o48Var.metadata;
        int length = jArr.length - 2;
        char c3 = 7;
        long j4 = -9187201950435737472L;
        if (length >= 0) {
            int i3 = 0;
            j2 = 128;
            while (true) {
                long j5 = jArr[i3];
                j3 = 255;
                if ((((~j5) << c3) & j5 & j4) != j4) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j5 & 255) < 128) {
                            c2 = c3;
                            int i6 = iArr[(i3 << 3) + i5];
                            if (startLine <= i6 && i6 <= endLine) {
                                this.indicesToRemove.g(i6);
                            }
                            j5 >>= 8;
                            i5++;
                            c3 = c2;
                            j4 = j4;
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i5++;
                        c3 = c2;
                        j4 = j4;
                    }
                    c = c3;
                    j = j4;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    c = c3;
                    j = j4;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                c3 = c;
                j4 = j;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        m48 m48Var = this.windowCache;
        int[] iArr2 = m48Var.keys;
        long[] jArr2 = m48Var.metadata;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr2[i7];
                if ((((~j6) << c) & j6 & j) == j) {
                    if (i7 != length2) {
                        break;
                        break;
                    }
                    i7++;
                } else {
                    int i8 = 8 - ((~(i7 - length2)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((j6 & j3) < j2 && startLine <= (i2 = iArr2[(i7 << 3) + i9]) && i2 <= endLine) {
                            this.indicesToRemove.g(i2);
                        }
                        j6 >>= 8;
                    }
                    if (i8 != 8) {
                        break;
                    } else if (i7 != length2) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
        }
        o48<CachedItem> o48Var2 = this.windowCacheWithItems;
        int[] iArr3 = o48Var2.keys;
        long[] jArr3 = o48Var2.metadata;
        int length3 = jArr3.length - 2;
        if (length3 >= 0) {
            int i10 = 0;
            while (true) {
                long j7 = jArr3[i10];
                if ((((~j7) << c) & j7 & j) == j) {
                    if (i10 != length3) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length3)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((j7 & j3) < j2 && startLine <= (i = iArr3[(i10 << 3) + i12]) && i <= endLine) {
                            this.indicesToRemove.g(i);
                        }
                        j7 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    } else if (i10 != length3) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        p48 p48Var = this.indicesToRemove;
        int[] iArr4 = p48Var.elements;
        long[] jArr4 = p48Var.metadata;
        int length4 = jArr4.length - 2;
        if (length4 < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j8 = jArr4[i13];
            if ((((~j8) << c) & j8 & j) != j) {
                int i14 = 8 - ((~(i13 - length4)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((j8 & j3) < j2) {
                        int i16 = iArr4[(i13 << 3) + i15];
                        List<nu6.b> listO = this.prefetchWindowHandles.o(i16);
                        if (listO != null) {
                            int size = listO.size();
                            for (int i17 = 0; i17 < size; i17++) {
                                listO.get(i17).cancel();
                            }
                        }
                        this.windowCache.r(i16);
                        this.windowCacheWithItems.o(i16);
                    }
                    j8 >>= 8;
                }
                if (i14 != 8) {
                    return;
                }
            }
            if (i13 == length4) {
                return;
            } else {
                i13++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    private final void y(final i11 i11Var) {
        int i;
        if (Math.signum(this.previousPassDelta) <= 0.0f) {
            if (this.prefetchWindowEndExtraSpace > 0) {
                i = this.prefetchWindowEndLine + 1;
            } else {
                i = -1;
            }
        } else if (Math.signum(this.previousPassDelta) <= 0.0f || this.prefetchWindowStartExtraSpace <= 0) {
            i = -1;
        } else {
            i = this.prefetchWindowStartLine - 1;
        }
        if (i <= 0 || i11Var.m(i) == -1 || i11Var.m(i) >= this.itemsCount) {
            return;
        }
        this.prefetchWindowHandles.r(i, i11Var.f(i, new Function2() { // from class: com.google.android.g11
            public final Object invoke(Object obj, Object obj2) {
                return h11.z(this.a, i11Var, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(h11 h11Var, i11 i11Var, int i, int i2) {
        h11Var.q(i11Var, i, i2);
        return Unit.a;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getPrefetchWindowEndLine() {
        return this.prefetchWindowEndLine;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getPrefetchWindowStartLine() {
        return this.prefetchWindowStartLine;
    }

    public final boolean n() {
        return (this.prefetchWindowStartLine == Integer.MAX_VALUE || this.prefetchWindowEndLine == Integer.MIN_VALUE) ? false : true;
    }

    public final void t(i11 i11Var, float f) {
        A();
        g(i11Var, f);
        h(i11Var, f);
        this.previousPassDelta = f;
        A();
    }

    public final void u(i11 i11Var) {
        if (!this.hasUpdatedVisibleItemsOnce && this.enableInitialPrefetch) {
            bt6 bt6Var = this.cacheWindow;
            f43 density = i11Var.getDensity();
            if ((density != null ? bt6Var.b(density, i11Var.h()) : 0) != 0) {
                this.shouldRefillWindow = true;
            }
            this.hasUpdatedVisibleItemsOnce = true;
        }
        int i = this.previousPassItemCount;
        if (i != -1 && i != i11Var.d()) {
            if (up1.isCacheWindowRefillFixEnabled) {
                o(i11Var);
            } else {
                p(i11Var);
            }
        }
        this.itemsCount = i11Var.d();
        if (i11Var.e()) {
            int iL = i11Var.l();
            for (int i2 = 0; i2 < iL; i2++) {
                int iK = i11Var.k(i2);
                Object objQ = i11Var.q(i2);
                int iG = i11Var.g(i2);
                if (up1.isCacheWindowRefillFixEnabled) {
                    if (iK != -1) {
                        e(iK, objQ, iG);
                    }
                } else if (iK != -1) {
                    f(iK, iG);
                }
            }
            if (this.shouldRefillWindow) {
                v(i11Var, this.previousPassDelta <= 0.0f);
                this.shouldRefillWindow = false;
            }
        } else {
            x();
        }
        this.previousPassItemCount = i11Var.d();
    }

    public final void x() {
        this.prefetchWindowStartLine = Integer.MAX_VALUE;
        this.prefetchWindowEndLine = t04.INVALID_ID;
        this.prefetchWindowStartExtraSpace = 0;
        this.prefetchWindowEndExtraSpace = 0;
        this.shouldRefillWindow = false;
        this.windowCache.j();
        this.windowCacheWithItems.g();
        o48<List<nu6.b>> o48Var = this.prefetchWindowHandles;
        long[] jArr = o48Var.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = o48Var.keys[i4];
                        List list = (List) o48Var.values[i4];
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((nu6.b) list.get(i6)).cancel();
                        }
                        o48Var.p(i4);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
