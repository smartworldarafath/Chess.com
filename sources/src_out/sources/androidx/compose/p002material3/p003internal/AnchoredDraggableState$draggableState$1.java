package androidx.compose.p002material3.p003internal;

import androidx.compose.p001foundation.MutatePriority;
import com.google.android.q22;
import com.google.inputmethod.bg3;
import com.google.inputmethod.og3;
import com.google.inputmethod.qg;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\b\u0004*\u0002\u0000\f\b\n\u0018\u00002\u00020\u0001J<\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\r¨\u0006\u000f"}, d2 = {"androidx/compose/material3/internal/AnchoredDraggableState$draggableState$1", "Lcom/google/android/og3;", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function2;", "Lcom/google/android/bg3;", "Lcom/google/android/q22;", "", "", "block", "a", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "androidx/compose/material3/internal/AnchoredDraggableState$draggableState$1$a", "Landroidx/compose/material3/internal/AnchoredDraggableState$draggableState$1$a;", "dragScope", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AnchoredDraggableState$draggableState$1 implements og3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final a dragScope;
    final /* synthetic */ AnchoredDraggableState<T> b;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/material3/internal/AnchoredDraggableState$draggableState$1$a", "Lcom/google/android/bg3;", "", "pixels", "", "a", "(F)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements bg3 {
        final /* synthetic */ AnchoredDraggableState<T> a;

        a(AnchoredDraggableState<T> anchoredDraggableState) {
            this.a = anchoredDraggableState;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.inputmethod.bg3
        public void a(float pixels) {
            qg.b(((AnchoredDraggableState) this.a).anchoredDragScope, this.a.A(pixels), 0.0f, 2, null);
        }
    }

    AnchoredDraggableState$draggableState$1(AnchoredDraggableState<T> anchoredDraggableState) {
        this.b = anchoredDraggableState;
        this.dragScope = new a(anchoredDraggableState);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.inputmethod.og3
    public Object a(MutatePriority mutatePriority, Function2<? super bg3, ? super q22<? super Unit>, ? extends Object> function2, q22<? super Unit> q22Var) {
        Object objI = this.b.i(mutatePriority, new AnchoredDraggableState$draggableState$1$drag$2(this, function2, null), q22Var);
        return objI == kotlin.coroutines.intrinsics.a.g() ? objI : Unit.a;
    }
}
