package androidx.compose.ui;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001f¨\u0006\""}, d2 = {"Landroidx/compose/ui/CombinedModifier;", "Landroidx/compose/ui/b;", "outer", "inner", "<init>", "(Landroidx/compose/ui/b;Landroidx/compose/ui/b;)V", "R", "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/b$b;", "operation", "foldIn", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "all", "(Lkotlin/jvm/functions/Function1;)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "d", "Landroidx/compose/ui/b;", "c", "()Landroidx/compose/ui/b;", "e", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CombinedModifier implements b {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final b outer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final b inner;

    public CombinedModifier(b bVar, b bVar2) {
        this.outer = bVar;
        this.inner = bVar2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getInner() {
        return this.inner;
    }

    @Override // androidx.compose.ui.b
    public boolean all(Function1<? super b.InterfaceC0050b, Boolean> predicate) {
        return this.outer.all(predicate) && this.inner.all(predicate);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getOuter() {
        return this.outer;
    }

    public boolean equals(Object other) {
        if (!(other instanceof CombinedModifier)) {
            return false;
        }
        CombinedModifier combinedModifier = (CombinedModifier) other;
        return Intrinsics.e(this.outer, combinedModifier.outer) && Intrinsics.e(this.inner, combinedModifier.inner);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.b
    public <R> R foldIn(R initial, Function2<? super R, ? super b.InterfaceC0050b, ? extends R> operation) {
        return (R) this.inner.foldIn(this.outer.foldIn(initial, operation), operation);
    }

    public int hashCode() {
        return this.outer.hashCode() + (this.inner.hashCode() * 31);
    }

    public String toString() {
        return '[' + ((String) foldIn("", new Function2<String, b.InterfaceC0050b, String>() { // from class: androidx.compose.ui.CombinedModifier.toString.1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(String str, b.InterfaceC0050b interfaceC0050b) {
                if (str.length() == 0) {
                    return interfaceC0050b.toString();
                }
                return str + ", " + interfaceC0050b;
            }
        })) + ']';
    }
}
