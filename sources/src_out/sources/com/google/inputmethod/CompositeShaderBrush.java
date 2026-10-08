package com.google.inputmethod;

import android.graphics.Shader;
import androidx.compose.ui.graphics.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.nr1, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006\""}, d2 = {"Lcom/google/android/nr1;", "Lcom/google/android/jkb;", "dstBrush", "srcBrush", "Landroidx/compose/ui/graphics/e;", "blendMode", "<init>", "(Lcom/google/android/jkb;Lcom/google/android/jkb;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/tsb;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "b", "(J)Landroid/graphics/Shader;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "f", "Lcom/google/android/jkb;", "getDstBrush", "()Lcom/google/android/jkb;", "g", "d", "h", "I", "getBlendMode-0nO6VwU", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CompositeShaderBrush extends jkb {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final jkb dstBrush;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final jkb srcBrush;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final int blendMode;

    public /* synthetic */ CompositeShaderBrush(jkb jkbVar, jkb jkbVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jkbVar, jkbVar2, i);
    }

    @Override // com.google.inputmethod.jkb
    public Shader b(long size) {
        return mkb.a(this.dstBrush.b(size), this.srcBrush.b(size), this.blendMode);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jkb getSrcBrush() {
        return this.srcBrush;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompositeShaderBrush)) {
            return false;
        }
        CompositeShaderBrush compositeShaderBrush = (CompositeShaderBrush) other;
        return Intrinsics.e(this.dstBrush, compositeShaderBrush.dstBrush) && Intrinsics.e(this.srcBrush, compositeShaderBrush.srcBrush) && e.E(this.blendMode, compositeShaderBrush.blendMode);
    }

    public int hashCode() {
        return (((this.dstBrush.hashCode() * 31) + this.srcBrush.hashCode()) * 31) + e.F(this.blendMode);
    }

    public String toString() {
        return "CompositeShaderBrush(dstBrush=" + this.dstBrush + ", srcBrush=" + this.srcBrush + ", blendMode=" + ((Object) e.G(this.blendMode)) + ')';
    }

    private CompositeShaderBrush(jkb jkbVar, jkb jkbVar2, int i) {
        this.dstBrush = jkbVar;
        this.srcBrush = jkbVar2;
        this.blendMode = i;
    }
}
