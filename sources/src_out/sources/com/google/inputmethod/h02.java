package com.google.inputmethod;

import androidx.compose.p000animation.AnimatedContentKt;
import androidx.compose.p000animation.d;
import androidx.compose.p000animation.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\u0012R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R.\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0010\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/google/android/h02;", "", "Landroidx/compose/animation/d;", "targetContentEnter", "Landroidx/compose/animation/f;", "initialContentExit", "", "targetContentZIndex", "Lcom/google/android/jtb;", "sizeTransform", "<init>", "(Landroidx/compose/animation/d;Landroidx/compose/animation/f;FLcom/google/android/jtb;)V", "a", "Landroidx/compose/animation/d;", "c", "()Landroidx/compose/animation/d;", "b", "Landroidx/compose/animation/f;", "()Landroidx/compose/animation/f;", "<set-?>", "Lcom/google/android/l48;", "d", "()F", "setTargetContentZIndex", "(F)V", "value", "Lcom/google/android/jtb;", "()Lcom/google/android/jtb;", "e", "(Lcom/google/android/jtb;)V", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h02 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final d targetContentEnter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final f initialContentExit;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final l48 targetContentZIndex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private jtb sizeTransform;

    public h02(d dVar, f fVar, float f, jtb jtbVar) {
        this.targetContentEnter = dVar;
        this.initialContentExit = fVar;
        this.targetContentZIndex = tm9.a(f);
        this.sizeTransform = jtbVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final f getInitialContentExit() {
        return this.initialContentExit;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jtb getSizeTransform() {
        return this.sizeTransform;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getTargetContentEnter() {
        return this.targetContentEnter;
    }

    public final float d() {
        return this.targetContentZIndex.b();
    }

    public final void e(jtb jtbVar) {
        this.sizeTransform = jtbVar;
    }

    public /* synthetic */ h02(d dVar, f fVar, float f, jtb jtbVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, fVar, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? AnimatedContentKt.d(false, null, 3, null) : jtbVar);
    }
}
