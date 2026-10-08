package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.ui.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001B9\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\f\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/google/android/ah0;", "", "Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/b;", "modifier", "Lcom/google/android/x93;", "properties", "content", "<init>", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/b;Lcom/google/android/x93;Lkotlin/jvm/functions/Function2;)V", "a", "Lkotlin/jvm/functions/Function0;", "c", "()Lkotlin/jvm/functions/Function0;", "b", "Landroidx/compose/ui/b;", "()Landroidx/compose/ui/b;", "Lcom/google/android/x93;", "d", "()Lcom/google/android/x93;", "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ah0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function0<Unit> onDismissRequest;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final b modifier;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final x93 properties;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function2<d, Integer, Unit> content;

    /* JADX WARN: Multi-variable type inference failed */
    public ah0(Function0<Unit> function0, b bVar, x93 x93Var, Function2<? super d, ? super Integer, Unit> function2) {
        this.onDismissRequest = function0;
        this.modifier = bVar;
        this.properties = x93Var;
        this.content = function2;
    }

    public final Function2<d, Integer, Unit> a() {
        return this.content;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getModifier() {
        return this.modifier;
    }

    public final Function0<Unit> c() {
        return this.onDismissRequest;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final x93 getProperties() {
        return this.properties;
    }
}
