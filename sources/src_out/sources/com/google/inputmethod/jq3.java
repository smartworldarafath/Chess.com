package com.google.inputmethod;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00158\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/google/android/jq3;", "Lcom/google/android/rp3;", "", "maxDepth", "", "resetsDepthForChildren", "<init>", "(IZ)V", "", "c", "()Ljava/lang/String;", "a", "I", "e", "()I", "g", "(I)V", "b", "Z", "f", "()Z", "", "Ljava/util/List;", "d", "()Ljava/util/List;", "children", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class jq3 implements rp3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int maxDepth;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean resetsDepthForChildren;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<rp3> children;

    /* JADX WARN: Multi-variable type inference failed */
    public jq3() {
        this(0, 0 == true ? 1 : 0, 3, null);
    }

    protected final String c() {
        return h.i(m.J0(this.children, ",\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), "  ");
    }

    public final List<rp3> d() {
        return this.children;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMaxDepth() {
        return this.maxDepth;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getResetsDepthForChildren() {
        return this.resetsDepthForChildren;
    }

    public final void g(int i) {
        this.maxDepth = i;
    }

    public jq3(int i, boolean z) {
        this.maxDepth = i;
        this.resetsDepthForChildren = z;
        this.children = new ArrayList();
    }

    public /* synthetic */ jq3(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Integer.MAX_VALUE : i, (i2 & 2) != 0 ? false : z);
    }
}
