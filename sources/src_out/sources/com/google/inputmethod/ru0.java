package com.google.inputmethod;

import android.graphics.Shader;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0007\u001a\u00020\u00012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/android/qu0;", "Lcom/google/android/jkb;", "b", "(Lcom/google/android/qu0;)Lcom/google/android/jkb;", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "shader", "a", "(Landroid/graphics/Shader;)Lcom/google/android/jkb;", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ru0 {

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/google/android/ru0$a", "Lcom/google/android/jkb;", "Lcom/google/android/tsb;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "b", "(J)Landroid/graphics/Shader;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends jkb {
        final /* synthetic */ Shader f;

        a(Shader shader) {
            this.f = shader;
        }

        @Override // com.google.inputmethod.jkb
        public Shader b(long size) {
            return this.f;
        }
    }

    public static final jkb a(Shader shader) {
        return new a(shader);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final jkb b(qu0 qu0Var) throws NoWhenBranchMatchedException {
        if (qu0Var instanceof jkb) {
            return (jkb) qu0Var;
        }
        if (!(qu0Var instanceof SolidColor)) {
            throw new NoWhenBranchMatchedException();
        }
        SolidColor solidColor = (SolidColor) qu0Var;
        qu0 qu0VarS = qu0.Companion.s(qu0.INSTANCE, m.s(new ei1[]{ei1.l(solidColor.getValue()), ei1.l(solidColor.getValue())}), 0.0f, 0.0f, 0, 14, null);
        Intrinsics.h(qu0VarS, "null cannot be cast to non-null type androidx.compose.ui.graphics.ShaderBrush");
        return (jkb) qu0VarS;
    }
}
