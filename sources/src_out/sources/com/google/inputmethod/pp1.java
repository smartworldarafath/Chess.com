package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.f;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\"\u0011\u0010\t\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u001a\u0010\u000f\u001a\u00020\n8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\"\u0015\u0010\u0014\u001a\u00060\u0010j\u0002`\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"", "d", "()V", "Landroidx/compose/runtime/f;", "e", "(Landroidx/compose/runtime/d;I)Landroidx/compose/runtime/f;", "Lcom/google/android/qaa;", "c", "(Landroidx/compose/runtime/d;I)Lcom/google/android/qaa;", "currentRecomposeScope", "", "a", "(Landroidx/compose/runtime/d;I)I", "getCurrentCompositeKeyHash$annotations", "(Landroidx/compose/runtime/d;I)V", "currentCompositeKeyHash", "", "Landroidx/compose/runtime/CompositeKeyHashCode;", "b", "(Landroidx/compose/runtime/d;I)J", "currentCompositeKeyHashCode", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class pp1 {
    public static final int a(d dVar, int i) {
        if (e.k()) {
            e.o(524444915, i, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:252)");
        }
        int iY = dVar.Y();
        if (e.k()) {
            e.n();
        }
        return iY;
    }

    public static final long b(d dVar, int i) {
        if (e.k()) {
            e.o(-168259424, i, -1, "androidx.compose.runtime.<get-currentCompositeKeyHashCode> (Composables.kt:268)");
        }
        long jF = dVar.f();
        if (e.k()) {
            e.n();
        }
        return jF;
    }

    public static final qaa c(d dVar, int i) {
        if (e.k()) {
            e.o(394957799, i, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:216)");
        }
        qaa qaaVarO = dVar.O();
        if (qaaVarO == null) {
            throw new IllegalStateException("no recompose scope found");
        }
        dVar.z(qaaVarO);
        if (e.k()) {
            e.n();
        }
        return qaaVarO;
    }

    public static final void d() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final f e(d dVar, int i) {
        if (e.k()) {
            e.o(-1165786124, i, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:516)");
        }
        f fVarW = dVar.w();
        if (e.k()) {
            e.n();
        }
        return fVarW;
    }
}
