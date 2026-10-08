package androidx.constraintlayout.compose;

import androidx.compose.ui.platform.InspectableValueKt;
import com.google.inputmethod.f43;
import com.google.inputmethod.jz5;
import com.google.inputmethod.kz5;
import com.google.inputmethod.w19;
import com.google.inputmethod.ww1;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002 !B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00060\u0007R\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J/\u0010\u0011\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\b\u0018\u00010\u0007R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;", "<init>", "()V", "Lcom/google/android/ww1;", "m", "()Lcom/google/android/ww1;", "Landroidx/constraintlayout/compose/ConstraintLayoutScope$a;", "n", "()Landroidx/constraintlayout/compose/ConstraintLayoutScope$a;", "", "j", "Landroidx/compose/ui/b;", "ref", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/ConstrainScope;", "constrainBlock", "l", "(Landroidx/compose/ui/b;Lcom/google/android/ww1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/b;", "e", "Landroidx/constraintlayout/compose/ConstraintLayoutScope$a;", "referencesObject", "", "f", "I", "ChildrenStartIndex", "g", "childId", "Ljava/util/ArrayList;", "h", "Ljava/util/ArrayList;", "childrenRefs", "ConstrainAsModifier", "a", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ConstraintLayoutScope extends ConstraintLayoutBaseScope {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private a referencesObject;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int ChildrenStartIndex;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int childId = this.ChildrenStartIndex;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final ArrayList<ww1> childrenRefs = new ArrayList<>();

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainAsModifier;", "Lcom/google/android/w19;", "Lcom/google/android/kz5;", "Lcom/google/android/ww1;", "ref", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/ConstrainScope;", "", "constrainBlock", "<init>", "(Lcom/google/android/ww1;Lkotlin/jvm/functions/Function1;)V", "Lcom/google/android/f43;", "", "parentData", "Landroidx/constraintlayout/compose/c;", "a", "(Lcom/google/android/f43;Ljava/lang/Object;)Landroidx/constraintlayout/compose/c;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Lcom/google/android/ww1;", "f", "Lkotlin/jvm/functions/Function1;", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class ConstrainAsModifier extends kz5 implements w19 {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final ww1 ref;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final Function1<ConstrainScope, Unit> constrainBlock;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ConstrainAsModifier(final ww1 ww1Var, final Function1<? super ConstrainScope, Unit> function1) {
            super(InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutScope$ConstrainAsModifier$special$$inlined$debugInspectorInfo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(jz5 jz5Var) {
                    Intrinsics.checkNotNullParameter(jz5Var, "$this$null");
                    jz5Var.b("constrainAs");
                    jz5Var.getProperties().c("ref", ww1Var);
                    jz5Var.getProperties().c("constrainBlock", function1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((jz5) obj);
                    return Unit.a;
                }
            } : InspectableValueKt.a());
            Intrinsics.checkNotNullParameter(ww1Var, "ref");
            Intrinsics.checkNotNullParameter(function1, "constrainBlock");
            this.ref = ww1Var;
            this.constrainBlock = function1;
        }

        @Override // com.google.inputmethod.w19
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c r(f43 f43Var, Object obj) {
            Intrinsics.checkNotNullParameter(f43Var, "<this>");
            return new c(this.ref, this.constrainBlock);
        }

        @Override // androidx.compose.ui.b.InterfaceC0050b, androidx.compose.ui.b
        public boolean all(Function1<? super androidx.compose.ui.b.InterfaceC0050b, Boolean> function1) {
            return w19.a.a(this, function1);
        }

        public boolean equals(Object other) {
            Function1<ConstrainScope, Unit> function1 = this.constrainBlock;
            ConstrainAsModifier constrainAsModifier = other instanceof ConstrainAsModifier ? (ConstrainAsModifier) other : null;
            return Intrinsics.e(function1, constrainAsModifier != null ? constrainAsModifier.constrainBlock : null);
        }

        @Override // androidx.compose.ui.b.InterfaceC0050b, androidx.compose.ui.b
        public <R> R foldIn(R r, Function2<? super R, ? super androidx.compose.ui.b.InterfaceC0050b, ? extends R> function2) {
            return (R) w19.a.b(this, r, function2);
        }

        public int hashCode() {
            return this.constrainBlock.hashCode();
        }

        @Override // androidx.compose.ui.b
        public androidx.compose.ui.b then(androidx.compose.ui.b bVar) {
            return w19.a.c(this, bVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0010\u0010\t\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0010\u0010\n\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutScope$a;", "", "<init>", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;)V", "Lcom/google/android/ww1;", "a", "()Lcom/google/android/ww1;", "b", "c", "d", "e", "f", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public final class a {
        final /* synthetic */ ConstraintLayoutScope a;

        public a(ConstraintLayoutScope constraintLayoutScope) {
            Intrinsics.checkNotNullParameter(constraintLayoutScope, "this$0");
            this.a = constraintLayoutScope;
        }

        public final ww1 a() {
            return this.a.m();
        }

        public final ww1 b() {
            return this.a.m();
        }

        public final ww1 c() {
            return this.a.m();
        }

        public final ww1 d() {
            return this.a.m();
        }

        public final ww1 e() {
            return this.a.m();
        }

        public final ww1 f() {
            return this.a.m();
        }
    }

    @Override // androidx.constraintlayout.compose.ConstraintLayoutBaseScope
    public void j() {
        super.j();
        this.childId = this.ChildrenStartIndex;
    }

    public final androidx.compose.ui.b l(androidx.compose.ui.b bVar, ww1 ww1Var, Function1<? super ConstrainScope, Unit> function1) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(ww1Var, "ref");
        Intrinsics.checkNotNullParameter(function1, "constrainBlock");
        return bVar.then(new ConstrainAsModifier(ww1Var, function1));
    }

    public final ww1 m() {
        ArrayList<ww1> arrayList = this.childrenRefs;
        int i = this.childId;
        this.childId = i + 1;
        ww1 ww1Var = (ww1) m.C0(arrayList, i);
        if (ww1Var != null) {
            return ww1Var;
        }
        ww1 ww1Var2 = new ww1(Integer.valueOf(this.childId));
        this.childrenRefs.add(ww1Var2);
        return ww1Var2;
    }

    public final a n() {
        a aVar = this.referencesObject;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.referencesObject = aVar2;
        return aVar2;
    }
}
