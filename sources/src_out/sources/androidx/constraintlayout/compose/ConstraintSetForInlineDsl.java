package androidx.constraintlayout.compose;

import android.os.Handler;
import androidx.compose.p004runtime.snapshots.j;
import com.google.inputmethod.cx1;
import com.google.inputmethod.dj7;
import com.google.inputmethod.n6c;
import com.google.inputmethod.yea;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010%\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010'R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010+¨\u0006-"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;", "Lcom/google/android/cx1;", "Lcom/google/android/yea;", "Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "scope", "<init>", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;)V", "Lcom/google/android/n6c;", "state", "", "Lcom/google/android/dj7;", "measurables", "", "a", "(Lcom/google/android/n6c;Ljava/util/List;)V", "", "b", "(Ljava/util/List;)Z", "d", "()V", "f", "e", "Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "getScope", "()Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Landroidx/compose/runtime/snapshots/j;", "c", "Landroidx/compose/runtime/snapshots/j;", "observer", "Z", "getKnownDirty", "()Z", "i", "(Z)V", "knownDirty", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "onCommitAffectingConstrainLambdas", "", "Landroidx/constraintlayout/compose/c;", "Ljava/util/List;", "previousDatas", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
final class ConstraintSetForInlineDsl implements cx1, yea {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ConstraintLayoutScope scope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Handler handler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final j observer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean knownDirty;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Function1<Unit, Unit> onCommitAffectingConstrainLambdas;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<c> previousDatas;

    public ConstraintSetForInlineDsl(ConstraintLayoutScope constraintLayoutScope) {
        Intrinsics.checkNotNullParameter(constraintLayoutScope, "scope");
        this.scope = constraintLayoutScope;
        this.observer = new j(new ConstraintSetForInlineDsl$observer$1(this));
        this.knownDirty = true;
        this.onCommitAffectingConstrainLambdas = new Function1<Unit, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintSetForInlineDsl$onCommitAffectingConstrainLambdas$1
            {
                super(1);
            }

            public final void a(Unit unit) {
                Intrinsics.checkNotNullParameter(unit, "$noName_0");
                this.this$0.i(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Unit) obj);
                return Unit.a;
            }
        };
        this.previousDatas = new ArrayList();
    }

    @Override // com.google.inputmethod.cx1
    public void a(final n6c state, final List<? extends dj7> measurables) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        this.scope.a(state);
        this.previousDatas.clear();
        this.observer.k(Unit.a, this.onCommitAffectingConstrainLambdas, new Function0<Unit>() { // from class: androidx.constraintlayout.compose.ConstraintSetForInlineDsl$applyTo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m82invoke();
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m82invoke() {
                List<dj7> list = measurables;
                n6c n6cVar = state;
                ConstraintSetForInlineDsl constraintSetForInlineDsl = this;
                int size = list.size() - 1;
                if (size < 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    Object objF = list.get(i).f();
                    c cVar = objF instanceof c ? (c) objF : null;
                    if (cVar != null) {
                        ConstrainScope constrainScope = new ConstrainScope(cVar.getRef().getId());
                        cVar.a().invoke(constrainScope);
                        constrainScope.a(n6cVar);
                    }
                    constraintSetForInlineDsl.previousDatas.add(cVar);
                    if (i2 > size) {
                        return;
                    } else {
                        i = i2;
                    }
                }
            }
        });
        this.knownDirty = false;
    }

    @Override // com.google.inputmethod.cx1
    public boolean b(List<? extends dj7> measurables) {
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        if (this.knownDirty || measurables.size() != this.previousDatas.size()) {
            return true;
        }
        int size = measurables.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Object objF = measurables.get(i).f();
                if (!Intrinsics.e(objF instanceof c ? (c) objF : null, this.previousDatas.get(i))) {
                    return true;
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        return false;
    }

    @Override // com.google.inputmethod.yea
    public void d() {
        this.observer.q();
    }

    @Override // com.google.inputmethod.yea
    public void e() {
    }

    @Override // com.google.inputmethod.yea
    public void f() {
        this.observer.r();
        this.observer.f();
    }

    public final void i(boolean z) {
        this.knownDirty = z;
    }
}
