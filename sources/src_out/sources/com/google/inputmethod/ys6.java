package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 52\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001 B'\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\t*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\t*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\t*\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0011J#\u0010 \u001a\u00020\u001f*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J5\u0010&\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\"2\u0006\u0010\u0014\u001a\u00020\u000f2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00018\u00000#H\u0016¢\u0006\u0004\b&\u0010'J-\u0010)\u001a\u00020(2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b)\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/google/android/ys6;", "Landroidx/compose/ui/b$c;", "Landroidx/compose/ui/node/c;", "Lcom/google/android/im0;", "Lcom/google/android/hm0;", "Lcom/google/android/zs6;", "state", "Lcom/google/android/us6;", "beyondBoundsInfo", "", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "<init>", "(Lcom/google/android/zs6;Lcom/google/android/us6;ZLandroidx/compose/foundation/gestures/Orientation;)V", "Lcom/google/android/hm0$b;", "q3", "(I)Z", "Lcom/google/android/us6$a;", "currentInterval", "direction", "o3", "(Lcom/google/android/us6$a;I)Lcom/google/android/us6$a;", "p3", "(Lcom/google/android/us6$a;I)Z", "r3", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "T", "Lkotlin/Function1;", "Lcom/google/android/hm0$a;", "block", "y1", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "t3", "p", "Lcom/google/android/zs6;", "q", "Lcom/google/android/us6;", "r", "Z", "s", "Landroidx/compose/foundation/gestures/Orientation;", "X0", "()Lcom/google/android/hm0;", "beyondBoundsLayout", "t", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ys6 extends b.c implements androidx.compose.ui.node.c, im0, hm0 {
    public static final int u = 8;
    private static final a v = new a();

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private zs6 state;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private us6 beyondBoundsInfo;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private boolean reverseLayout;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private Orientation orientation;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"com/google/android/ys6$a", "Lcom/google/android/hm0$a;", "", "a", "Z", "()Z", "hasMoreContent", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements hm0.a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean hasMoreContent;

        a() {
        }

        @Override // com.google.android.hm0.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getHasMoreContent() {
            return this.hasMoreContent;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/google/android/ys6$d", "Lcom/google/android/hm0$a;", "", "a", "()Z", "hasMoreContent", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements hm0.a {
        final /* synthetic */ Ref.ObjectRef<us6.Interval> b;
        final /* synthetic */ int c;

        d(Ref.ObjectRef<us6.Interval> objectRef, int i) {
            this.b = objectRef;
            this.c = i;
        }

        @Override // com.google.android.hm0.a
        /* JADX INFO: renamed from: a */
        public boolean getHasMoreContent() {
            return ys6.this.p3((us6.Interval) this.b.element, this.c);
        }
    }

    public ys6(zs6 zs6Var, us6 us6Var, boolean z, Orientation orientation) {
        this.state = zs6Var;
        this.beyondBoundsInfo = us6Var;
        this.reverseLayout = z;
        this.orientation = orientation;
    }

    private final us6.Interval o3(us6.Interval currentInterval, int direction) {
        int start = currentInterval.getStart();
        int end = currentInterval.getEnd();
        if (q3(direction)) {
            end++;
        } else {
            start--;
        }
        return this.beyondBoundsInfo.a(start, end);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p3(us6.Interval interval, int i) {
        if (r3(i)) {
            return false;
        }
        if (q3(i)) {
            return interval.getEnd() < this.state.a() - 1;
        }
        return interval.getStart() > 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final boolean q3(int i) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        hm0.b.Companion companion = hm0.b.INSTANCE;
        if (hm0.b.h(i, companion.c())) {
            return false;
        }
        if (hm0.b.h(i, companion.b())) {
            return true;
        }
        if (hm0.b.h(i, companion.a())) {
            return this.reverseLayout;
        }
        if (hm0.b.h(i, companion.d())) {
            return !this.reverseLayout;
        }
        if (hm0.b.h(i, companion.e())) {
            int i2 = c.$EnumSwitchMapping$0[y23.p(this).ordinal()];
            if (i2 == 1) {
                return this.reverseLayout;
            }
            if (i2 == 2) {
                return !this.reverseLayout;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!hm0.b.h(i, companion.f())) {
            ws6.c();
            throw new KotlinNothingValueException();
        }
        int i3 = c.$EnumSwitchMapping$0[y23.p(this).ordinal()];
        if (i3 == 1) {
            return !this.reverseLayout;
        }
        if (i3 == 2) {
            return this.reverseLayout;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final boolean r3(int i) throws KotlinNothingValueException {
        hm0.b.Companion companion = hm0.b.INSTANCE;
        if (hm0.b.h(i, companion.a()) || hm0.b.h(i, companion.d())) {
            return this.orientation == Orientation.Horizontal;
        }
        if (hm0.b.h(i, companion.e()) || hm0.b.h(i, companion.f())) {
            return this.orientation == Orientation.Vertical;
        }
        if (hm0.b.h(i, companion.c()) || hm0.b.h(i, companion.b())) {
            return false;
        }
        ws6.c();
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s3(o oVar, o.a aVar) {
        o.a.z(aVar, oVar, 0, 0, 0.0f, 4, null);
        return Unit.a;
    }

    @Override // com.google.inputmethod.im0
    public hm0 X0() {
        return this;
    }

    @Override // androidx.compose.ui.node.c
    public fj7 b(j jVar, dj7 dj7Var, long j) {
        final o oVarR0 = dj7Var.r0(j);
        return j.Q1(jVar, oVarR0.getWidth(), oVarR0.getHeight(), null, new Function1() { // from class: com.google.android.xs6
            public final Object invoke(Object obj) {
                return ys6.s3(oVarR0, (o.a) obj);
            }
        }, 4, null);
    }

    public final void t3(zs6 state, us6 beyondBoundsInfo, boolean reverseLayout, Orientation orientation) {
        this.state = state;
        this.beyondBoundsInfo = beyondBoundsInfo;
        this.reverseLayout = reverseLayout;
        this.orientation = orientation;
    }

    @Override // com.google.inputmethod.hm0
    public <T> T y1(int direction, Function1<? super hm0.a, ? extends T> block) {
        if (this.state.a() <= 0 || !this.state.e() || !getIsAttached()) {
            return (T) block.invoke(v);
        }
        int iD = q3(direction) ? this.state.d() : this.state.c();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = this.beyondBoundsInfo.a(iD, iD);
        int iJ = g.j(this.state.b() * 2, this.state.a());
        T t = null;
        int i = 0;
        while (t == null && p3((us6.Interval) objectRef.element, direction) && i < iJ) {
            us6.Interval intervalO3 = o3((us6.Interval) objectRef.element, direction);
            this.beyondBoundsInfo.e((us6.Interval) objectRef.element);
            objectRef.element = intervalO3;
            i++;
            bo6.d(this);
            t = (T) block.invoke(new d(objectRef, direction));
        }
        this.beyondBoundsInfo.e((us6.Interval) objectRef.element);
        bo6.d(this);
        return t;
    }
}
