package com.google.inputmethod;

import com.google.android.r43;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001:\u0003\u001a&\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B-\b\u0017\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\nJ7\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u0016\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u001a\u0010#\u0012\u0004\b$\u0010\u0003R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R*\u00101\u001a\u0004\u0018\u00010)8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\b*\u0010+\u0012\u0004\b0\u0010\u0003\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00107\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00109\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u00102\u001a\u0004\b&\u00104\"\u0004\b8\u00106R\"\u0010;\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u00102\u001a\u0004\b*\u00104\"\u0004\b:\u00106¨\u0006<"}, d2 = {"Lcom/google/android/nu6;", "", "<init>", "()V", "Lcom/google/android/fl9;", "prefetchScheduler", "Lkotlin/Function1;", "Lcom/google/android/qe8;", "", "onNestedPrefetch", "(Lcom/google/android/fl9;Lkotlin/jvm/functions/Function1;)V", "", "index", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/nu6$c;", "onItemPremeasured", "Lcom/google/android/nu6$b;", "g", "(IJLkotlin/jvm/functions/Function1;)Lcom/google/android/nu6$b;", "", "isHighPriority", "i", "(IJZLkotlin/jvm/functions/Function1;)Lcom/google/android/nu6$b;", "", "Lcom/google/android/dl9;", "b", "()Ljava/util/List;", "a", "Lcom/google/android/fl9;", "f", "()Lcom/google/android/fl9;", "setPrefetchScheduler$foundation", "(Lcom/google/android/fl9;)V", "getPrefetchScheduler$foundation$annotations", "Lkotlin/jvm/functions/Function1;", "getOnNestedPrefetch$annotations", "Lcom/google/android/cl9;", "c", "Lcom/google/android/cl9;", "prefetchMetrics", "Lcom/google/android/bl9;", "d", "Lcom/google/android/bl9;", "e", "()Lcom/google/android/bl9;", "k", "(Lcom/google/android/bl9;)V", "getPrefetchHandleProvider$foundation$annotations", "prefetchHandleProvider", "I", "getRealizedNestedPrefetchCount$foundation", "()I", "l", "(I)V", "realizedNestedPrefetchCount", "j", "idealNestedPrefetchCount", "setLastNumberOfNestedPrefetchItems$foundation", "lastNumberOfNestedPrefetchItems", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class nu6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private fl9 prefetchScheduler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Function1<? super qe8, Unit> onNestedPrefetch;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final cl9 prefetchMetrics;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private bl9 prefetchHandleProvider;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int realizedNestedPrefetchCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int idealNestedPrefetchCount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int lastNumberOfNestedPrefetchItems;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/google/android/nu6$a;", "Lcom/google/android/qe8;", "", "nestedPrefetchItemCount", "<init>", "(Lcom/google/android/nu6;I)V", "index", "", "a", "(I)V", "I", "b", "()I", "", "Lcom/google/android/dl9;", "Ljava/util/List;", "_requests", "", "c", "()Ljava/util/List;", "requests", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class a implements qe8 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int nestedPrefetchItemCount;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<dl9> _requests = new ArrayList();

        public a(int i) {
            this.nestedPrefetchItemCount = i;
        }

        @Override // com.google.inputmethod.qe8
        public void a(int index) {
            bl9 prefetchHandleProvider = nu6.this.getPrefetchHandleProvider();
            if (prefetchHandleProvider == null) {
                return;
            }
            this._requests.add(prefetchHandleProvider.d(index, nu6.this.prefetchMetrics));
        }

        @Override // com.google.inputmethod.qe8
        /* JADX INFO: renamed from: b, reason: from getter */
        public int getNestedPrefetchItemCount() {
            return this.nestedPrefetchItemCount;
        }

        public final List<dl9> c() {
            return this._requests;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004\u0082\u0001\u0002\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/google/android/nu6$b;", "", "", "cancel", "()V", "d", "Lcom/google/android/gk3;", "Lcom/google/android/bl9$a;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        void cancel();

        void d();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b\u0082\u0001\u0001\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/google/android/nu6$c;", "", "", "placeableIndex", "Lcom/google/android/q16;", "c", "(I)J", "b", "()I", "placeablesCount", "getIndex", "index", "Lcom/google/android/bl9$a;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface c {
        int b();

        long c(int placeableIndex);

        int getIndex();
    }

    public nu6() {
        this.prefetchMetrics = new cl9();
        this.realizedNestedPrefetchCount = -1;
        this.idealNestedPrefetchCount = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b h(nu6 nu6Var, int i, long j, Function1 function1, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        return nu6Var.g(i, j, function1);
    }

    public final List<dl9> b() {
        Function1<? super qe8, Unit> function1 = this.onNestedPrefetch;
        if (function1 == null) {
            return m.p();
        }
        a aVar = new a(this.realizedNestedPrefetchCount);
        function1.invoke(aVar);
        List<dl9> listC = aVar.c();
        this.lastNumberOfNestedPrefetchItems = listC.size();
        return listC;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getIdealNestedPrefetchCount() {
        return this.idealNestedPrefetchCount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getLastNumberOfNestedPrefetchItems() {
        return this.lastNumberOfNestedPrefetchItems;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final bl9 getPrefetchHandleProvider() {
        return this.prefetchHandleProvider;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final fl9 getPrefetchScheduler() {
        return this.prefetchScheduler;
    }

    public final b g(int index, long constraints, Function1<? super c, Unit> onItemPremeasured) {
        return i(index, constraints, true, onItemPremeasured);
    }

    public final b i(int index, long constraints, boolean isHighPriority, Function1<? super c, Unit> onItemPremeasured) {
        b bVarH;
        bl9 bl9Var = this.prefetchHandleProvider;
        return (bl9Var == null || (bVarH = bl9Var.h(index, constraints, this.prefetchMetrics, isHighPriority, onItemPremeasured)) == null) ? gk3.a : bVarH;
    }

    public final void j(int i) {
        this.idealNestedPrefetchCount = i;
    }

    public final void k(bl9 bl9Var) {
        this.prefetchHandleProvider = bl9Var;
    }

    public final void l(int i) {
        this.realizedNestedPrefetchCount = i;
    }

    public /* synthetic */ nu6(fl9 fl9Var, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fl9Var, (i & 2) != 0 ? null : function1);
    }

    @r43
    public nu6(fl9 fl9Var, Function1<? super qe8, Unit> function1) {
        this();
        this.prefetchScheduler = fl9Var;
        this.onNestedPrefetch = function1;
    }
}
