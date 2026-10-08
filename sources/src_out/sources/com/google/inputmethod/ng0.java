package com.google.inputmethod;

import androidx.compose.ui.text.b;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.x;
import com.google.inputmethod.ng0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000e\n\u0002\b\u0005\b!\u0018\u0000 e*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0001%B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0019\u001a\u00020\u0017*\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0082\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001b\u001a\u00020\u0017*\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0082\u0010¢\u0006\u0004\b\u001b\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u0017*\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u0017*\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001aJ\u001b\u0010\u001f\u001a\u00020\u0017*\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010\u001aJ\u000f\u0010 \u001a\u00020\u0017H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0017H\u0002¢\u0006\u0004\b#\u0010!J\u0017\u0010%\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u0017H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020\u0017H\u0004¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020'2\u0006\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u0017H\u0004¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00028\u0000¢\u0006\u0004\b.\u0010\u0010J\r\u0010/\u001a\u00028\u0000¢\u0006\u0004\b/\u0010\u0010J\r\u00100\u001a\u00028\u0000¢\u0006\u0004\b0\u0010\u0010J\r\u00101\u001a\u00028\u0000¢\u0006\u0004\b1\u0010\u0010J!\u00104\u001a\u00028\u00002\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020'02¢\u0006\u0004\b4\u00105J!\u00106\u001a\u00028\u00002\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020'02¢\u0006\u0004\b6\u00105J\r\u00107\u001a\u00020\u0017¢\u0006\u0004\b7\u0010!J\r\u00108\u001a\u00020\u0017¢\u0006\u0004\b8\u0010!J\r\u00109\u001a\u00020\u0017¢\u0006\u0004\b9\u0010!J\r\u0010:\u001a\u00028\u0000¢\u0006\u0004\b:\u0010\u0010J\r\u0010;\u001a\u00028\u0000¢\u0006\u0004\b;\u0010\u0010J\r\u0010<\u001a\u00028\u0000¢\u0006\u0004\b<\u0010\u0010J\r\u0010=\u001a\u00028\u0000¢\u0006\u0004\b=\u0010\u0010J\u000f\u0010>\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b@\u0010?J\r\u0010A\u001a\u00028\u0000¢\u0006\u0004\bA\u0010\u0010J\r\u0010B\u001a\u00028\u0000¢\u0006\u0004\bB\u0010\u0010J\r\u0010C\u001a\u00028\u0000¢\u0006\u0004\bC\u0010\u0010J\r\u0010D\u001a\u00028\u0000¢\u0006\u0004\bD\u0010\u0010J\u000f\u0010E\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\bE\u0010?J\r\u0010F\u001a\u00028\u0000¢\u0006\u0004\bF\u0010\u0010J\u000f\u0010G\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\bG\u0010?J\r\u0010H\u001a\u00028\u0000¢\u0006\u0004\bH\u0010\u0010J\r\u0010I\u001a\u00028\u0000¢\u0006\u0004\bI\u0010\u0010J\r\u0010J\u001a\u00028\u0000¢\u0006\u0004\bJ\u0010\u0010J\r\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0001\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\bN\u0010OR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b6\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b/\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\"\u0010]\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u00101\u001a\u0004\bZ\u0010O\"\u0004\b[\u0010\\R\"\u0010`\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010K\u001a\u0004\bV\u0010M\"\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bb\u0010c¨\u0006f"}, d2 = {"Lcom/google/android/ng0;", "T", "", "Landroidx/compose/ui/text/b;", "originalText", "Landroidx/compose/ui/text/x;", "originalSelection", "Lcom/google/android/vxc;", "layoutResult", "Lcom/google/android/zn8;", "offsetMapping", "Lcom/google/android/yyc;", "state", "<init>", "(Landroidx/compose/ui/text/b;JLcom/google/android/vxc;Lcom/google/android/zn8;Lcom/google/android/yyc;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "G", "()Lcom/google/android/ng0;", "D", "F", "I", "", "y", "()Z", "", "currentOffset", "n", "(Lcom/google/android/vxc;I)I", "s", "j", "g", "linesAmount", "z", "W", "()I", "Y", "X", "offset", "a", "(I)I", "", "U", "(I)V", "start", "end", "V", "(II)V", "S", "d", "B", "J", "Lkotlin/Function1;", "or", "b", "(Lkotlin/jvm/functions/Function1;)Lcom/google/android/ng0;", "c", "r", "q", "l", "M", "L", "C", "K", "m", "()Ljava/lang/Integer;", "u", "H", "E", "R", "A", "i", "Q", "f", "N", "O", "P", "Landroidx/compose/ui/text/b;", "getOriginalText", "()Landroidx/compose/ui/text/b;", "getOriginalSelection-d9O1mEE", "()J", "Lcom/google/android/vxc;", "getLayoutResult", "()Lcom/google/android/vxc;", "Lcom/google/android/zn8;", "p", "()Lcom/google/android/zn8;", "e", "Lcom/google/android/yyc;", "w", "()Lcom/google/android/yyc;", "v", "setSelection-5zc-tL8", "(J)V", "selection", "setAnnotatedString", "(Landroidx/compose/ui/text/b;)V", "annotatedString", "", "x", "()Ljava/lang/String;", "text", "h", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ng0<T extends ng0<T>> {
    public static final int i = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final b originalText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long originalSelection;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextLayoutResult layoutResult;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final zn8 offsetMapping;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final yyc state;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long selection;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private b annotatedString;

    public /* synthetic */ ng0(b bVar, long j, TextLayoutResult textLayoutResult, zn8 zn8Var, yyc yycVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, j, textLayoutResult, zn8Var, yycVar);
    }

    private final T D() {
        int iL;
        getState().b();
        if (x().length() > 0 && (iL = l()) != -1) {
            U(iL);
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T F() {
        Integer numM;
        getState().b();
        if (x().length() > 0 && (numM = m()) != null) {
            U(numM.intValue());
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T G() {
        int iQ;
        getState().b();
        if (x().length() > 0 && (iQ = q()) != -1) {
            U(iQ);
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T I() {
        Integer numU;
        getState().b();
        if (x().length() > 0 && (numU = u()) != null) {
            U(numU.intValue());
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final int W() {
        return this.offsetMapping.b(x.i(this.selection));
    }

    private final int X() {
        return this.offsetMapping.b(x.k(this.selection));
    }

    private final int Y() {
        return this.offsetMapping.b(x.l(this.selection));
    }

    private final int a(int offset) {
        return g.j(offset, x().length() - 1);
    }

    private final int g(TextLayoutResult textLayoutResult, int i2) {
        return this.offsetMapping.a(textLayoutResult.o(textLayoutResult.q(i2), true));
    }

    static /* synthetic */ int h(ng0 ng0Var, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
        }
        if ((i3 & 1) != 0) {
            i2 = ng0Var.X();
        }
        return ng0Var.g(textLayoutResult, i2);
    }

    private final int j(TextLayoutResult textLayoutResult, int i2) {
        return this.offsetMapping.a(textLayoutResult.u(textLayoutResult.q(i2)));
    }

    static /* synthetic */ int k(ng0 ng0Var, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
        }
        if ((i3 & 1) != 0) {
            i2 = ng0Var.Y();
        }
        return ng0Var.j(textLayoutResult, i2);
    }

    private final int n(TextLayoutResult textLayoutResult, int i2) {
        while (i2 < this.originalText.length()) {
            long jC = textLayoutResult.C(a(i2));
            if (x.i(jC) > i2) {
                return this.offsetMapping.a(x.i(jC));
            }
            i2++;
        }
        return this.originalText.length();
    }

    static /* synthetic */ int o(ng0 ng0Var, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
        }
        if ((i3 & 1) != 0) {
            i2 = ng0Var.W();
        }
        return ng0Var.n(textLayoutResult, i2);
    }

    private final int s(TextLayoutResult textLayoutResult, int i2) {
        while (i2 > 0) {
            long jC = textLayoutResult.C(a(i2));
            if (x.n(jC) < i2) {
                return this.offsetMapping.a(x.n(jC));
            }
            i2--;
        }
        return 0;
    }

    static /* synthetic */ int t(ng0 ng0Var, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
        }
        if ((i3 & 1) != 0) {
            i2 = ng0Var.W();
        }
        return ng0Var.s(textLayoutResult, i2);
    }

    private final boolean y() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        return (textLayoutResult != null ? textLayoutResult.y(W()) : null) != ResolvedTextDirection.Rtl;
    }

    private final int z(TextLayoutResult textLayoutResult, int i2) {
        int iW = W();
        if (this.state.getCachedX() == null) {
            this.state.c(Float.valueOf(textLayoutResult.e(iW).getLeft()));
        }
        int iQ = textLayoutResult.q(iW) + i2;
        if (iQ < 0) {
            return 0;
        }
        if (iQ >= textLayoutResult.n()) {
            return x().length();
        }
        float fM = textLayoutResult.m(iQ) - 1;
        Float cachedX = this.state.getCachedX();
        Intrinsics.g(cachedX);
        float fFloatValue = cachedX.floatValue();
        if ((y() && fFloatValue >= textLayoutResult.t(iQ)) || (!y() && fFloatValue <= textLayoutResult.s(iQ))) {
            return textLayoutResult.o(iQ, true);
        }
        return this.offsetMapping.a(textLayoutResult.x(rn8.e((((long) Float.floatToRawIntBits(cachedX.floatValue())) << 32) | (((long) Float.floatToRawIntBits(fM)) & 4294967295L))));
    }

    public final T A() {
        TextLayoutResult textLayoutResult;
        if (x().length() > 0 && (textLayoutResult = this.layoutResult) != null) {
            U(z(textLayoutResult, 1));
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T B() {
        getState().b();
        if (x().length() > 0) {
            if (y()) {
                G();
            } else {
                D();
            }
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T C() {
        getState().b();
        if (x().length() > 0) {
            if (y()) {
                I();
            } else {
                F();
            }
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T E() {
        getState().b();
        if (x().length() > 0) {
            int iA = vac.a(x(), x.k(this.selection));
            if (iA == x.k(this.selection) && iA != x().length()) {
                iA = vac.a(x(), iA + 1);
            }
            U(iA);
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T H() {
        getState().b();
        if (x().length() > 0) {
            int iB = vac.b(x(), x.l(this.selection));
            if (iB == x.l(this.selection) && iB != 0) {
                iB = vac.b(x(), iB - 1);
            }
            U(iB);
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T J() {
        getState().b();
        if (x().length() > 0) {
            if (y()) {
                D();
            } else {
                G();
            }
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T K() {
        getState().b();
        if (x().length() > 0) {
            if (y()) {
                F();
            } else {
                I();
            }
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T L() {
        getState().b();
        if (x().length() > 0) {
            U(x().length());
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T M() {
        getState().b();
        if (x().length() > 0) {
            U(0);
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T N() {
        Integer numF;
        getState().b();
        if (x().length() > 0 && (numF = f()) != null) {
            U(numF.intValue());
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T O() {
        getState().b();
        if (x().length() > 0) {
            if (y()) {
                Q();
            } else {
                N();
            }
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T P() {
        getState().b();
        if (x().length() > 0) {
            if (y()) {
                N();
            } else {
                Q();
            }
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T Q() {
        Integer numI;
        getState().b();
        if (x().length() > 0 && (numI = i()) != null) {
            U(numI.intValue());
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T R() {
        TextLayoutResult textLayoutResult;
        if (x().length() > 0 && (textLayoutResult = this.layoutResult) != null) {
            U(z(textLayoutResult, -1));
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T S() {
        getState().b();
        if (x().length() > 0) {
            V(0, x().length());
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T T() {
        if (x().length() > 0) {
            this.selection = zyc.b(x.n(this.originalSelection), x.i(this.selection));
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    protected final void U(int offset) {
        V(offset, offset);
    }

    protected final void V(int start, int end) {
        this.selection = zyc.b(start, end);
    }

    public final T b(Function1<? super T, Unit> or) {
        getState().b();
        if (x().length() > 0) {
            if (x.h(this.selection)) {
                Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
                or.invoke(this);
            } else if (y()) {
                U(x.l(this.selection));
            } else {
                U(x.k(this.selection));
            }
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T c(Function1<? super T, Unit> or) {
        getState().b();
        if (x().length() > 0) {
            if (x.h(this.selection)) {
                Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
                or.invoke(this);
            } else if (y()) {
                U(x.k(this.selection));
            } else {
                U(x.l(this.selection));
            }
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T d() {
        getState().b();
        if (x().length() > 0) {
            U(x.i(this.selection));
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b getAnnotatedString() {
        return this.annotatedString;
    }

    public final Integer f() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(h(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    public final Integer i() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(k(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    public final int l() {
        return wac.c(this.annotatedString.getText(), x.i(this.selection));
    }

    public final Integer m() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(o(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final zn8 getOffsetMapping() {
        return this.offsetMapping;
    }

    public final int q() {
        return wac.d(this.annotatedString.getText(), x.i(this.selection));
    }

    public final int r() {
        return wac.b(this.annotatedString.getText(), x.i(this.selection), -1);
    }

    public final Integer u() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(t(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final long getSelection() {
        return this.selection;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final yyc getState() {
        return this.state;
    }

    public final String x() {
        return this.annotatedString.getText();
    }

    private ng0(b bVar, long j, TextLayoutResult textLayoutResult, zn8 zn8Var, yyc yycVar) {
        this.originalText = bVar;
        this.originalSelection = j;
        this.layoutResult = textLayoutResult;
        this.offsetMapping = zn8Var;
        this.state = yycVar;
        this.selection = j;
        this.annotatedString = bVar;
    }
}
