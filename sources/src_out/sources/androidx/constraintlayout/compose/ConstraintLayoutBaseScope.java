package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.State;
import com.google.inputmethod.ff3;
import com.google.inputmethod.jf0;
import com.google.inputmethod.n6c;
import com.google.inputmethod.of5;
import com.google.inputmethod.pf5;
import com.google.inputmethod.r25;
import com.google.inputmethod.t71;
import com.google.inputmethod.ww1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\b'\u0018\u00002\u00020\u0001:\u0003\r\u001d.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015\"\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010\u001d\u001a\u00020\u001a2\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015\"\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001cJ+\u0010!\u001a\u00020 2\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015\"\u00020\u00162\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"R,\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060$0#8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'R(\u0010-\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001d\u0010)\u0012\u0004\b,\u0010\u0003\u001a\u0004\b*\u0010\n\"\u0004\b+\u0010\bR\u0014\u0010/\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b.\u0010)R\u0016\u00100\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010)\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;", "", "<init>", "()V", "", "value", "", "k", "(I)V", "e", "()I", "Lcom/google/android/n6c;", "state", "a", "(Lcom/google/android/n6c;)V", "j", "", "fraction", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$c;", "d", "(F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$c;", "", "Lcom/google/android/ww1;", "elements", "Lcom/google/android/ff3;", "margin", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$b;", "g", "([Lcom/google/android/ww1;F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$b;", "b", "Lcom/google/android/t71;", "chainStyle", "Lcom/google/android/pf5;", "f", "([Lcom/google/android/ww1;Lcom/google/android/t71;)Lcom/google/android/pf5;", "", "Lkotlin/Function1;", "Ljava/util/List;", "getTasks", "()Ljava/util/List;", "tasks", "I", "i", "setHelpersHashCode", "getHelpersHashCode$annotations", "helpersHashCode", "c", "HelpersStartId", "helperId", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class ConstraintLayoutBaseScope {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int helpersHashCode;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<Function1<n6c, Unit>> tasks = new ArrayList();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int HelpersStartId = 1000;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int helperId = 1000;

    /* JADX INFO: renamed from: androidx.constraintlayout.compose.ConstraintLayoutBaseScope$a, reason: from toString */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$a;", "", "id", "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getId$compose_release", "()Ljava/lang/Object;", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class BaselineAnchor {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final Object id;

        public BaselineAnchor(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "id");
            this.id = obj;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BaselineAnchor) && Intrinsics.e(this.id, ((BaselineAnchor) other).id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return "BaselineAnchor(id=" + this.id + ')';
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.compose.ConstraintLayoutBaseScope$b, reason: from toString */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0015"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$b;", "", "id", "", "index", "<init>", "(Ljava/lang/Object;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "I", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class HorizontalAnchor {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final Object id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final int index;

        public HorizontalAnchor(Object obj, int i) {
            Intrinsics.checkNotNullParameter(obj, "id");
            this.id = obj;
            this.index = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HorizontalAnchor)) {
                return false;
            }
            HorizontalAnchor horizontalAnchor = (HorizontalAnchor) other;
            return Intrinsics.e(this.id, horizontalAnchor.id) && this.index == horizontalAnchor.index;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + Integer.hashCode(this.index);
        }

        public String toString() {
            return "HorizontalAnchor(id=" + this.id + ", index=" + this.index + ')';
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.compose.ConstraintLayoutBaseScope$c, reason: from toString */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0015"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$c;", "", "id", "", "index", "<init>", "(Ljava/lang/Object;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "I", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class VerticalAnchor {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final Object id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final int index;

        public VerticalAnchor(Object obj, int i) {
            Intrinsics.checkNotNullParameter(obj, "id");
            this.id = obj;
            this.index = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VerticalAnchor)) {
                return false;
            }
            VerticalAnchor verticalAnchor = (VerticalAnchor) other;
            return Intrinsics.e(this.id, verticalAnchor.id) && this.index == verticalAnchor.index;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + Integer.hashCode(this.index);
        }

        public String toString() {
            return "VerticalAnchor(id=" + this.id + ", index=" + this.index + ')';
        }
    }

    public static /* synthetic */ HorizontalAnchor c(ConstraintLayoutBaseScope constraintLayoutBaseScope, ww1[] ww1VarArr, float f, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createBottomBarrier-3ABfNKs");
        }
        if ((i & 2) != 0) {
            f = ff3.i(0);
        }
        return constraintLayoutBaseScope.b(ww1VarArr, f);
    }

    private final int e() {
        int i = this.helperId;
        this.helperId = i + 1;
        return i;
    }

    public static /* synthetic */ HorizontalAnchor h(ConstraintLayoutBaseScope constraintLayoutBaseScope, ww1[] ww1VarArr, float f, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createTopBarrier-3ABfNKs");
        }
        if ((i & 2) != 0) {
            f = ff3.i(0);
        }
        return constraintLayoutBaseScope.g(ww1VarArr, f);
    }

    private final void k(int value) {
        this.helpersHashCode = ((this.helpersHashCode * 1009) + value) % 1000000007;
    }

    public final void a(n6c state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Iterator<T> it = this.tasks.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(state);
        }
    }

    public final HorizontalAnchor b(final ww1[] elements, final float margin) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        final int iE = e();
        this.tasks.add(new Function1<n6c, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutBaseScope$createBottomBarrier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(n6c n6cVar) {
                Intrinsics.checkNotNullParameter(n6cVar, "state");
                jf0 jf0VarB = n6cVar.b(Integer.valueOf(iE), State.Direction.BOTTOM);
                ww1[] ww1VarArr = elements;
                ArrayList arrayList = new ArrayList(ww1VarArr.length);
                for (ww1 ww1Var : ww1VarArr) {
                    arrayList.add(ww1Var.getId());
                }
                Object[] array = arrayList.toArray(new Object[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                jf0VarB.a0(Arrays.copyOf(array, array.length));
                jf0VarB.C(n6cVar.d(ff3.e(margin)));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((n6c) obj);
                return Unit.a;
            }
        });
        k(15);
        for (ww1 ww1Var : elements) {
            k(ww1Var.hashCode());
        }
        k(ff3.l(margin));
        return new HorizontalAnchor(Integer.valueOf(iE), 0);
    }

    public final VerticalAnchor d(final float fraction) {
        final int iE = e();
        this.tasks.add(new Function1<n6c, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutBaseScope$createGuidelineFromStart$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(n6c n6cVar) {
                Intrinsics.checkNotNullParameter(n6cVar, "state");
                r25 r25VarP = n6cVar.p(Integer.valueOf(iE));
                float f = fraction;
                if (n6cVar.r() == LayoutDirection.Ltr) {
                    r25VarP.e(f);
                } else {
                    r25VarP.e(1.0f - f);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((n6c) obj);
                return Unit.a;
            }
        });
        k(3);
        k(Float.hashCode(fraction));
        return new VerticalAnchor(Integer.valueOf(iE), 0);
    }

    public final pf5 f(final ww1[] elements, final t71 chainStyle) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(chainStyle, "chainStyle");
        final int iE = e();
        this.tasks.add(new Function1<n6c, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutBaseScope$createHorizontalChain$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(n6c n6cVar) {
                Intrinsics.checkNotNullParameter(n6cVar, "state");
                androidx.constraintlayout.core.state.c cVarI = n6cVar.i(Integer.valueOf(iE), State.Helper.HORIZONTAL_CHAIN);
                if (cVarI == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.state.helpers.HorizontalChainReference");
                }
                of5 of5Var = (of5) cVarI;
                ww1[] ww1VarArr = elements;
                ArrayList arrayList = new ArrayList(ww1VarArr.length);
                for (ww1 ww1Var : ww1VarArr) {
                    arrayList.add(ww1Var.getId());
                }
                Object[] array = arrayList.toArray(new Object[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                of5Var.a0(Arrays.copyOf(array, array.length));
                of5Var.i0(chainStyle.getStyle());
                of5Var.apply();
                if (chainStyle.getBias() != null) {
                    n6cVar.c(elements[0].getId()).y(chainStyle.getBias().floatValue());
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((n6c) obj);
                return Unit.a;
            }
        });
        k(16);
        for (ww1 ww1Var : elements) {
            k(ww1Var.hashCode());
        }
        k(chainStyle.hashCode());
        return new pf5(Integer.valueOf(iE));
    }

    public final HorizontalAnchor g(final ww1[] elements, final float margin) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        final int iE = e();
        this.tasks.add(new Function1<n6c, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutBaseScope$createTopBarrier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(n6c n6cVar) {
                Intrinsics.checkNotNullParameter(n6cVar, "state");
                jf0 jf0VarB = n6cVar.b(Integer.valueOf(iE), State.Direction.TOP);
                ww1[] ww1VarArr = elements;
                ArrayList arrayList = new ArrayList(ww1VarArr.length);
                for (ww1 ww1Var : ww1VarArr) {
                    arrayList.add(ww1Var.getId());
                }
                Object[] array = arrayList.toArray(new Object[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                jf0VarB.a0(Arrays.copyOf(array, array.length));
                jf0VarB.C(n6cVar.d(ff3.e(margin)));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((n6c) obj);
                return Unit.a;
            }
        });
        k(12);
        for (ww1 ww1Var : elements) {
            k(ww1Var.hashCode());
        }
        k(ff3.l(margin));
        return new HorizontalAnchor(Integer.valueOf(iE), 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getHelpersHashCode() {
        return this.helpersHashCode;
    }

    public void j() {
        this.tasks.clear();
        this.helperId = this.HelpersStartId;
        this.helpersHashCode = 0;
    }
}
