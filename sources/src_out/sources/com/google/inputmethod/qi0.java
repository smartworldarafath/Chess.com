package com.google.inputmethod;

import android.os.Trace;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.snapshots.g;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.b;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.h;
import androidx.compose.ui.text.k;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a=\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\nH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"\u001f\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u001a\u0010#\u001a\u00020\u00128@X\u0081\u0004¢\u0006\f\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"", "text", "Landroidx/compose/ui/text/y;", "style", "Landroidx/compose/ui/text/font/l$b;", "fontFamilyResolver", "", "e", "(Ljava/lang/String;Landroidx/compose/ui/text/y;Landroidx/compose/ui/text/font/l$b;Landroidx/compose/runtime/d;I)V", "Landroidx/compose/ui/text/b;", "", "Landroidx/compose/ui/text/b$d;", "Lcom/google/android/v99;", "placeholders", "d", "(Landroidx/compose/ui/text/b;Landroidx/compose/ui/text/y;Landroidx/compose/ui/text/font/l$b;Ljava/util/List;Landroidx/compose/runtime/d;I)V", "", "textLength", "", "j", "(I)Z", "Lcom/google/android/ks9;", "Ljava/util/concurrent/Executor;", "a", "Lcom/google/android/ks9;", "getLocalBackgroundTextMeasurementExecutor", "()Lcom/google/android/ks9;", "LocalBackgroundTextMeasurementExecutor", "b", "Ljava/lang/Boolean;", "backingCoreCountSatisfactory", "i", "()Z", "getCoreCountSatisfactory$annotations", "()V", "coreCountSatisfactory", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class qi0 {
    private static final ks9<Executor> a = fs1.j(new Function0() { // from class: com.google.android.oi0
        public final Object invoke() {
            return qi0.h();
        }
    });
    private static Boolean b;

    public static final void d(final b bVar, final TextStyle textStyle, final l.b bVar2, final List<b.Range<Placeholder>> list, d dVar, int i) {
        if (e.k()) {
            e.o(-650368117, i, -1, "androidx.compose.foundation.text.BackgroundTextMeasurement (BasicText.android.kt:112)");
        }
        Executor executor = (Executor) dVar.v(a);
        if (executor == null || !j(bVar.length())) {
            dVar.y(-517090505);
            dVar.u();
        } else {
            dVar.y(-518737659);
            final LayoutDirection layoutDirection = (LayoutDirection) dVar.v(CompositionLocalsKt.m());
            final f43 f43Var = (f43) dVar.v(CompositionLocalsKt.g());
            try {
                executor.execute(new Runnable() { // from class: com.google.android.ni0
                    @Override // java.lang.Runnable
                    public final void run() {
                        qi0.g(textStyle, layoutDirection, list, bVar, f43Var, bVar2);
                    }
                });
            } catch (RejectedExecutionException unused) {
            }
            dVar.u();
        }
        if (e.k()) {
            e.n();
        }
    }

    public static final void e(final String str, final TextStyle textStyle, final l.b bVar, d dVar, int i) {
        if (e.k()) {
            e.o(1589371739, i, -1, "androidx.compose.foundation.text.BackgroundTextMeasurement (BasicText.android.kt:68)");
        }
        Executor executor = (Executor) dVar.v(a);
        if (executor == null || !j(str.length())) {
            dVar.y(1255914055);
            dVar.u();
        } else {
            dVar.y(1254298614);
            final LayoutDirection layoutDirection = (LayoutDirection) dVar.v(CompositionLocalsKt.m());
            final f43 f43Var = (f43) dVar.v(CompositionLocalsKt.g());
            try {
                executor.execute(new Runnable() { // from class: com.google.android.pi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        qi0.f(textStyle, layoutDirection, str, f43Var, bVar);
                    }
                });
            } catch (RejectedExecutionException unused) {
            }
            dVar.u();
        }
        if (e.k()) {
            e.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(TextStyle textStyle, LayoutDirection layoutDirection, String str, f43 f43Var, l.b bVar) {
        Trace.beginSection("BackgroundTextMeasurement");
        try {
            androidx.compose.p004runtime.snapshots.b bVarO = g.Companion.o(g.INSTANCE, null, null, 3, null);
            try {
                g gVarL = bVarO.l();
                try {
                    d19 d19VarB = k.b(str, vzc.d(textStyle, layoutDirection), m.p(), f43Var, bVar, null, 32, null);
                    d19VarB.b();
                    d19VarB.a();
                    Unit unit = Unit.a;
                    bVarO.s(gVarL);
                    bVarO.C().a();
                    bVarO.d();
                    Trace.endSection();
                } catch (Throwable th) {
                    bVarO.s(gVarL);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    bVarO.d();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(TextStyle textStyle, LayoutDirection layoutDirection, List list, b bVar, f43 f43Var, l.b bVar2) {
        Trace.beginSection("BackgroundTextMeasurement");
        try {
            androidx.compose.p004runtime.snapshots.b bVarO = g.Companion.o(g.INSTANCE, null, null, 3, null);
            try {
                g gVarL = bVarO.l();
                try {
                    TextStyle textStyleD = vzc.d(textStyle, layoutDirection);
                    if (list == null) {
                        list = m.p();
                    }
                    h hVar = new h(bVar, textStyleD, list, f43Var, bVar2);
                    hVar.b();
                    hVar.a();
                    Unit unit = Unit.a;
                    bVarO.s(gVarL);
                    bVarO.C().a();
                    bVarO.d();
                    Trace.endSection();
                } catch (Throwable th) {
                    bVarO.s(gVarL);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    bVarO.d();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor h() {
        return null;
    }

    public static final boolean i() {
        if (b == null) {
            b = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
        }
        Boolean bool = b;
        Intrinsics.g(bool);
        return bool.booleanValue();
    }

    public static final boolean j(int i) {
        return i >= 8 && i < 1000 && i();
    }
}
