package androidx.compose.p001foundation;

import android.view.View;
import androidx.compose.p001foundation.MagnifierNode;
import androidx.compose.p004runtime.p0;
import androidx.compose.ui.b;
import androidx.compose.ui.node.l;
import com.google.android.h81;
import com.google.android.p81;
import com.google.android.rw0;
import com.google.inputmethod.bfb;
import com.google.inputmethod.dz4;
import com.google.inputmethod.f43;
import com.google.inputmethod.ff3;
import com.google.inputmethod.fz1;
import com.google.inputmethod.gb9;
import com.google.inputmethod.jf3;
import com.google.inputmethod.kn6;
import com.google.inputmethod.ln6;
import com.google.inputmethod.nfb;
import com.google.inputmethod.o58;
import com.google.inputmethod.on8;
import com.google.inputmethod.q16;
import com.google.inputmethod.q6c;
import com.google.inputmethod.r16;
import com.google.inputmethod.rn8;
import com.google.inputmethod.y23;
import com.google.inputmethod.yg3;
import com.google.inputmethod.z23;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.a;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0091\u0001\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u0085\u0001\u0010\u001f\u001a\u00020\f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00102\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\u001cJ\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010\u001cJ\u000f\u0010#\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010\u001cJ\u0013\u0010%\u001a\u00020\f*\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0013\u0010,\u001a\u00020\f*\u00020+H\u0016¢\u0006\u0004\b,\u0010-R.\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R0\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u00103R0\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010/\u001a\u0004\b8\u00101\"\u0004\b9\u00103R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010;\u001a\u0004\bM\u0010=\"\u0004\bN\u0010?R\"\u0010\u0015\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010;\u001a\u0004\bP\u0010=\"\u0004\bQ\u0010?R\"\u0010\u0016\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010A\u001a\u0004\bS\u0010C\"\u0004\bT\u0010ER\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0018\u0010^\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010a\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010e\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR/\u0010l\u001a\u0004\u0018\u00010'2\b\u0010f\u001a\u0004\u0018\u00010'8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010*R\u001e\u0010o\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010nR\u0016\u0010q\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010GR\u0018\u0010t\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010sR\u001e\u0010x\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010z\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010I¨\u0006{"}, d2 = {"Landroidx/compose/foundation/MagnifierNode;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/dz4;", "Lcom/google/android/yg3;", "Lcom/google/android/bfb;", "Lcom/google/android/on8;", "Lkotlin/Function1;", "Lcom/google/android/f43;", "Lcom/google/android/rn8;", "sourceCenter", "magnifierCenter", "Lcom/google/android/jf3;", "", "onSizeChanged", "", "zoom", "", "useTextDefault", "size", "Lcom/google/android/ff3;", "cornerRadius", "elevation", "clippingEnabled", "Landroidx/compose/foundation/u;", "platformMagnifierFactory", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLandroidx/compose/foundation/u;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "v3", "()V", "y3", "z3", "x3", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLkotlin/jvm/functions/Function1;Landroidx/compose/foundation/u;)V", "V2", "W2", "M1", "Lcom/google/android/fz1;", "j", "(Lcom/google/android/fz1;)V", "Lcom/google/android/kn6;", "coordinates", "D", "(Lcom/google/android/kn6;)V", "Lcom/google/android/nfb;", "H0", "(Lcom/google/android/nfb;)V", "p", "Lkotlin/jvm/functions/Function1;", "getSourceCenter", "()Lkotlin/jvm/functions/Function1;", "setSourceCenter", "(Lkotlin/jvm/functions/Function1;)V", "q", "getMagnifierCenter", "setMagnifierCenter", "r", "getOnSizeChanged", "setOnSizeChanged", "s", "F", "getZoom", "()F", "setZoom", "(F)V", "t", "Z", "getUseTextDefault", "()Z", "setUseTextDefault", "(Z)V", "u", "J", "getSize-MYxV2XQ", "()J", "setSize-EaSLcWc", "(J)V", "v", "getCornerRadius-D9Ej5fM", "setCornerRadius-0680j_4", "w", "getElevation-D9Ej5fM", "setElevation-0680j_4", "x", "getClippingEnabled", "setClippingEnabled", "y", "Landroidx/compose/foundation/u;", "getPlatformMagnifierFactory", "()Landroidx/compose/foundation/u;", "setPlatformMagnifierFactory", "(Landroidx/compose/foundation/u;)V", "Landroid/view/View;", "z", "Landroid/view/View;", "view", "A", "Lcom/google/android/f43;", "density", "Lcom/google/android/gb9;", "B", "Lcom/google/android/gb9;", "magnifier", "<set-?>", "C", "Lcom/google/android/o58;", "h0", "()Lcom/google/android/kn6;", "w3", "layoutCoordinates", "Lcom/google/android/q6c;", "Lcom/google/android/q6c;", "anchorPositionInRootState", "E", "sourceCenterInRoot", "Lcom/google/android/q16;", "Lcom/google/android/q16;", "previousSize", "Lcom/google/android/h81;", "G", "Lcom/google/android/h81;", "drawSignalChannel", "s3", "anchorPositionInRoot", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MagnifierNode extends b.c implements dz4, yg3, bfb, on8 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private f43 density;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private gb9 magnifier;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final o58 layoutCoordinates;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private q6c<rn8> anchorPositionInRootState;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private long sourceCenterInRoot;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private q16 previousSize;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private h81<Unit> drawSignalChannel;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private Function1<? super f43, rn8> sourceCenter;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private Function1<? super f43, rn8> magnifierCenter;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private Function1<? super jf3, Unit> onSizeChanged;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private float zoom;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private boolean useTextDefault;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private long size;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private float cornerRadius;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private float elevation;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private boolean clippingEnabled;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private u platformMagnifierFactory;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private View view;

    public /* synthetic */ MagnifierNode(Function1 function1, Function1 function2, Function1 function3, float f, boolean z, long j, float f2, float f3, boolean z2, u uVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, function2, function3, f, z, j, f2, f3, z2, uVar);
    }

    private final kn6 h0() {
        return (kn6) this.layoutCoordinates.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rn8 r3(MagnifierNode magnifierNode) {
        return rn8.d(magnifierNode.sourceCenterInRoot);
    }

    private final long s3() {
        if (this.anchorPositionInRootState == null) {
            this.anchorPositionInRootState = p0.e(new Function0() { // from class: com.google.android.rd7
                public final Object invoke() {
                    return MagnifierNode.t3(this.a);
                }
            });
        }
        q6c<rn8> q6cVar = this.anchorPositionInRootState;
        return q6cVar != null ? q6cVar.getValue().getPackedValue() : rn8.INSTANCE.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rn8 t3(MagnifierNode magnifierNode) {
        kn6 kn6VarH0 = magnifierNode.h0();
        return rn8.d(kn6VarH0 != null ? ln6.h(kn6VarH0) : rn8.INSTANCE.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final Unit u3(MagnifierNode magnifierNode) throws KotlinNothingValueException {
        magnifierNode.y3();
        return Unit.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void v3() throws KotlinNothingValueException {
        gb9 gb9Var = this.magnifier;
        if (gb9Var != null) {
            gb9Var.dismiss();
        }
        View viewA = this.view;
        if (viewA == null) {
            viewA = z23.a(this);
        }
        View view = viewA;
        this.view = view;
        f43 f43VarM = this.density;
        if (f43VarM == null) {
            f43VarM = y23.m(this);
        }
        f43 f43Var = f43VarM;
        this.density = f43Var;
        this.magnifier = this.platformMagnifierFactory.a(view, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, f43Var, this.zoom);
        z3();
    }

    private final void w3(kn6 kn6Var) {
        this.layoutCoordinates.setValue(kn6Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    private final void y3() throws KotlinNothingValueException {
        long jB;
        f43 f43VarM = this.density;
        if (f43VarM == null) {
            f43VarM = y23.m(this);
            this.density = f43VarM;
        }
        long packedValue = ((rn8) this.sourceCenter.invoke(f43VarM)).getPackedValue();
        if ((packedValue & 9223372034707292159L) == 9205357640488583168L || (s3() & 9223372034707292159L) == 9205357640488583168L) {
            this.sourceCenterInRoot = rn8.INSTANCE.b();
            gb9 gb9Var = this.magnifier;
            if (gb9Var != null) {
                gb9Var.dismiss();
                return;
            }
            return;
        }
        this.sourceCenterInRoot = rn8.q(s3(), packedValue);
        Function1<? super f43, rn8> function1 = this.magnifierCenter;
        if (function1 != null) {
            rn8 rn8VarD = rn8.d(((rn8) function1.invoke(f43VarM)).getPackedValue());
            if ((rn8VarD.getPackedValue() & 9223372034707292159L) == 9205357640488583168L) {
                rn8VarD = null;
            }
            if (rn8VarD != null) {
                jB = rn8.q(s3(), rn8VarD.getPackedValue());
            } else {
                jB = rn8.INSTANCE.b();
            }
        } else {
            jB = rn8.INSTANCE.b();
        }
        long j = jB;
        if (this.magnifier == null) {
            v3();
        }
        gb9 gb9Var2 = this.magnifier;
        if (gb9Var2 != null) {
            gb9Var2.b(this.sourceCenterInRoot, j, this.zoom);
        }
        z3();
    }

    private final void z3() {
        f43 f43Var;
        gb9 gb9Var = this.magnifier;
        if (gb9Var == null || (f43Var = this.density) == null || q16.e(gb9Var.a(), this.previousSize)) {
            return;
        }
        Function1<? super jf3, Unit> function1 = this.onSizeChanged;
        if (function1 != null) {
            function1.invoke(jf3.c(f43Var.S(r16.e(gb9Var.a()))));
        }
        this.previousSize = q16.b(gb9Var.a());
    }

    @Override // com.google.inputmethod.dz4
    public void D(kn6 coordinates) {
        w3(coordinates);
    }

    @Override // com.google.inputmethod.bfb
    public void H0(nfb nfbVar) {
        nfbVar.b(t.b(), new Function0() { // from class: com.google.android.qd7
            public final Object invoke() {
                return MagnifierNode.r3(this.a);
            }
        });
    }

    @Override // com.google.inputmethod.on8
    public void M1() {
        l.a(this, new Function0() { // from class: com.google.android.pd7
            public final Object invoke() {
                return MagnifierNode.u3(this.a);
            }
        });
    }

    @Override // androidx.compose.ui.b.c
    public void V2() {
        M1();
        this.drawSignalChannel = p81.b(0, (BufferOverflow) null, (Function1) null, 7, (Object) null);
        rw0.d(L2(), (CoroutineContext) null, CoroutineStart.d, new C0165MagnifierNode$onAttach$1(this, null), 1, (Object) null);
    }

    @Override // androidx.compose.ui.b.c
    public void W2() {
        gb9 gb9Var = this.magnifier;
        if (gb9Var != null) {
            gb9Var.dismiss();
        }
        this.magnifier = null;
    }

    @Override // com.google.inputmethod.yg3
    public void j(fz1 fz1Var) {
        fz1Var.j1();
        h81<Unit> h81Var = this.drawSignalChannel;
        if (h81Var != null) {
            a.b(h81Var.e(Unit.a));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void x3(Function1<? super f43, rn8> sourceCenter, Function1<? super f43, rn8> magnifierCenter, float zoom, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, Function1<? super jf3, Unit> onSizeChanged, u platformMagnifierFactory) throws KotlinNothingValueException {
        float f = this.zoom;
        long j = this.size;
        float f2 = this.cornerRadius;
        boolean z = this.useTextDefault;
        float f3 = this.elevation;
        boolean z2 = this.clippingEnabled;
        u uVar = this.platformMagnifierFactory;
        View view = this.view;
        f43 f43Var = this.density;
        this.sourceCenter = sourceCenter;
        this.magnifierCenter = magnifierCenter;
        this.zoom = zoom;
        this.useTextDefault = useTextDefault;
        this.size = size;
        this.cornerRadius = cornerRadius;
        this.elevation = elevation;
        this.clippingEnabled = clippingEnabled;
        this.onSizeChanged = onSizeChanged;
        this.platformMagnifierFactory = platformMagnifierFactory;
        View viewA = z23.a(this);
        f43 f43VarM = y23.m(this);
        if (this.magnifier != null && ((!t.a(zoom, f) && !platformMagnifierFactory.b()) || !jf3.f(size, j) || !ff3.k(cornerRadius, f2) || !ff3.k(elevation, f3) || useTextDefault != z || clippingEnabled != z2 || !Intrinsics.e(platformMagnifierFactory, uVar) || !Intrinsics.e(viewA, view) || !Intrinsics.e(f43VarM, f43Var))) {
            v3();
        }
        y3();
    }

    private MagnifierNode(Function1<? super f43, rn8> function1, Function1<? super f43, rn8> function2, Function1<? super jf3, Unit> function3, float f, boolean z, long j, float f2, float f3, boolean z2, u uVar) {
        this.sourceCenter = function1;
        this.magnifierCenter = function2;
        this.onSizeChanged = function3;
        this.zoom = f;
        this.useTextDefault = z;
        this.size = j;
        this.cornerRadius = f2;
        this.elevation = f3;
        this.clippingEnabled = z2;
        this.platformMagnifierFactory = uVar;
        this.layoutCoordinates = p0.i(null, p0.k());
        this.sourceCenterInRoot = rn8.INSTANCE.b();
    }
}
