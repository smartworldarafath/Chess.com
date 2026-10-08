package com.google.inputmethod;

import androidx.compose.ui.text.font.l0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/google/android/mod;", "", "<init>", "()V", "Lcom/google/android/kod;", "typefaceRequest", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/l0;", "", "resolveTypeface", "Lcom/google/android/q6c;", "b", "(Lcom/google/android/kod;Lkotlin/jvm/functions/Function1;)Lcom/google/android/q6c;", "Lcom/google/android/gic;", "a", "Lcom/google/android/gic;", "getLock$ui_text", "()Lcom/google/android/gic;", "lock", "Lcom/google/android/dd7;", "Lcom/google/android/dd7;", "resultCache", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class mod {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final gic lock = new gic();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final dd7<TypefaceRequest, l0> resultCache = new dd7<>(16);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(mod modVar, TypefaceRequest typefaceRequest, l0 l0Var) {
        synchronized (modVar.lock) {
            try {
                if (l0Var.getCacheable()) {
                    modVar.resultCache.f(typefaceRequest, l0Var);
                } else {
                    modVar.resultCache.g(typefaceRequest);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return Unit.a;
    }

    public final q6c<Object> b(final TypefaceRequest typefaceRequest, Function1<? super Function1<? super l0, Unit>, ? extends l0> resolveTypeface) {
        synchronized (this.lock) {
            l0 l0VarD = this.resultCache.d(typefaceRequest);
            if (l0VarD != null) {
                if (l0VarD.getCacheable()) {
                    return l0VarD;
                }
                this.resultCache.g(typefaceRequest);
            }
            try {
                l0 l0Var = (l0) resolveTypeface.invoke(new Function1() { // from class: com.google.android.lod
                    public final Object invoke(Object obj) {
                        return mod.c(this.a, typefaceRequest, (l0) obj);
                    }
                });
                synchronized (this.lock) {
                    try {
                        if (this.resultCache.d(typefaceRequest) == null && l0Var.getCacheable()) {
                            this.resultCache.f(typefaceRequest, l0Var);
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return l0Var;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }
}
