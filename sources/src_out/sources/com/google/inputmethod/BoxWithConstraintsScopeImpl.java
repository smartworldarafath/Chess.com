package com.google.inputmethod;

import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.ui.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.st0, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0017\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0097\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0019\u001a\u00020\u0014*\u00020\u0014H\u0097\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#¨\u0006'"}, d2 = {"Lcom/google/android/st0;", "Lcom/google/android/rt0;", "Lcom/google/android/mt0;", "Lcom/google/android/f43;", "density", "Lcom/google/android/kx1;", "constraints", "<init>", "(Lcom/google/android/f43;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/b;", "Lcom/google/android/tc;", "alignment", "k", "(Landroidx/compose/ui/b;Lcom/google/android/tc;)Landroidx/compose/ui/b;", "j", "(Landroidx/compose/ui/b;)Landroidx/compose/ui/b;", "b", "Lcom/google/android/f43;", "c", "J", "d", "()J", "Lcom/google/android/ff3;", "e", "()F", "maxWidth", "h", "maxHeight", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class BoxWithConstraintsScopeImpl implements rt0, mt0 {
    private final /* synthetic */ BoxScopeInstance a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final f43 density;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long constraints;

    public /* synthetic */ BoxWithConstraintsScopeImpl(f43 f43Var, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(f43Var, j);
    }

    @Override // com.google.inputmethod.rt0
    /* JADX INFO: renamed from: d, reason: from getter */
    public long getConstraints() {
        return this.constraints;
    }

    @Override // com.google.inputmethod.rt0
    public float e() {
        return kx1.h(getConstraints()) ? this.density.O0(kx1.l(getConstraints())) : ff3.INSTANCE.b();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoxWithConstraintsScopeImpl)) {
            return false;
        }
        BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) other;
        return Intrinsics.e(this.density, boxWithConstraintsScopeImpl.density) && kx1.f(this.constraints, boxWithConstraintsScopeImpl.constraints);
    }

    @Override // com.google.inputmethod.rt0
    public float h() {
        return kx1.g(getConstraints()) ? this.density.O0(kx1.k(getConstraints())) : ff3.INSTANCE.b();
    }

    public int hashCode() {
        return (this.density.hashCode() * 31) + kx1.o(this.constraints);
    }

    @Override // com.google.inputmethod.mt0
    public b j(b bVar) {
        return this.a.j(bVar);
    }

    @Override // com.google.inputmethod.mt0
    public b k(b bVar, tc tcVar) {
        return this.a.k(bVar, tcVar);
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.density + ", constraints=" + ((Object) kx1.q(this.constraints)) + ')';
    }

    private BoxWithConstraintsScopeImpl(f43 f43Var, long j) {
        this.a = BoxScopeInstance.a;
        this.density = f43Var;
        this.constraints = j;
    }
}
