package com.google.inputmethod;

import android.content.Context;
import androidx.compose.p001foundation.AndroidEdgeEffectOverscrollEffect;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/google/android/qk;", "Lcom/google/android/aw8;", "Landroid/content/Context;", "context", "Lcom/google/android/f43;", "density", "Lcom/google/android/ei1;", "glowColor", "Lcom/google/android/rx8;", "glowDrawPadding", "<init>", "(Landroid/content/Context;Lcom/google/android/f43;JLcom/google/android/rx8;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/zv8;", "a", "()Lcom/google/android/zv8;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/content/Context;", "b", "Lcom/google/android/f43;", "c", "J", "d", "Lcom/google/android/rx8;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class qk implements aw8 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final f43 density;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long glowColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final rx8 glowDrawPadding;

    public /* synthetic */ qk(Context context, f43 f43Var, long j, rx8 rx8Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, f43Var, j, rx8Var);
    }

    @Override // com.google.inputmethod.aw8
    public zv8 a() {
        return new AndroidEdgeEffectOverscrollEffect(this.context, this.density, this.glowColor, this.glowDrawPadding, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.e(qk.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.h(other, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        qk qkVar = (qk) other;
        return Intrinsics.e(this.context, qkVar.context) && Intrinsics.e(this.density, qkVar.density) && ei1.r(this.glowColor, qkVar.glowColor) && Intrinsics.e(this.glowDrawPadding, qkVar.glowDrawPadding);
    }

    public int hashCode() {
        return (((((this.context.hashCode() * 31) + this.density.hashCode()) * 31) + ei1.x(this.glowColor)) * 31) + this.glowDrawPadding.hashCode();
    }

    private qk(Context context, f43 f43Var, long j, rx8 rx8Var) {
        this.context = context;
        this.density = f43Var;
        this.glowColor = j;
        this.glowDrawPadding = rx8Var;
    }
}
