package com.google.inputmethod;

import androidx.compose.p004runtime.b0;
import androidx.compose.p004runtime.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001Bo\b\u0000\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u001a\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u0017\u0010'R6\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f0\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b!\u0010*\"\u0004\b+\u0010,R\u001a\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010-\u001a\u0004\b%\u0010.R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b(\u0010*¨\u0006/"}, d2 = {"Lcom/google/android/r08;", "", "Lcom/google/android/n08;", "content", "parameter", "Lcom/google/android/x22;", "composition", "Lcom/google/android/cub;", "slotStorage", "Lcom/google/android/mg;", "anchor", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/b0;", "invalidations", "Lcom/google/android/a69;", "locals", "nestedReferences", "<init>", "(Lcom/google/android/n08;Ljava/lang/Object;Lcom/google/android/x22;Lcom/google/android/cub;Lcom/google/android/mg;Ljava/util/List;Lcom/google/android/a69;Ljava/util/List;)V", "", "j", "()V", "a", "Lcom/google/android/n08;", "c", "()Lcom/google/android/n08;", "b", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", "Lcom/google/android/x22;", "()Lcom/google/android/x22;", "d", "Lcom/google/android/cub;", "h", "()Lcom/google/android/cub;", "e", "Lcom/google/android/mg;", "()Lcom/google/android/mg;", "f", "Ljava/util/List;", "()Ljava/util/List;", "i", "(Ljava/util/List;)V", "Lcom/google/android/a69;", "()Lcom/google/android/a69;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r08 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final n08<Object> content;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Object parameter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final x22 composition;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final cub slotStorage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final mg anchor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private List<? extends Pair<b0, ? extends Object>> invalidations;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final a69 locals;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final List<r08> nestedReferences;

    public r08(n08<Object> n08Var, Object obj, x22 x22Var, cub cubVar, mg mgVar, List<? extends Pair<b0, ? extends Object>> list, a69 a69Var, List<r08> list2) {
        this.content = n08Var;
        this.parameter = obj;
        this.composition = x22Var;
        this.slotStorage = cubVar;
        this.anchor = mgVar;
        this.invalidations = list;
        this.locals = a69Var;
        this.nestedReferences = list2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final mg getAnchor() {
        return this.anchor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final x22 getComposition() {
        return this.composition;
    }

    public final n08<Object> c() {
        return this.content;
    }

    public final List<Pair<b0, Object>> d() {
        return this.invalidations;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a69 getLocals() {
        return this.locals;
    }

    public final List<r08> f() {
        return this.nestedReferences;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Object getParameter() {
        return this.parameter;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final cub getSlotStorage() {
        return this.slotStorage;
    }

    public final void i(List<? extends Pair<b0, ? extends Object>> list) {
        this.invalidations = list;
    }

    public final void j() {
        if (this.anchor.a()) {
            List<? extends Pair<b0, ? extends Object>> list = this.invalidations;
            x22 x22Var = this.composition;
            Intrinsics.h(x22Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            this.invalidations = m.a1(list, ((g) x22Var).P(this.anchor));
        }
    }
}
