package androidx.compose.p002material3;

import androidx.compose.p000animation.core.Animatable;
import androidx.compose.p000animation.core.AnimateAsStateKt;
import androidx.compose.p001foundation.gestures.DraggableKt;
import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p001foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.p001foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p001foundation.layout.g1;
import androidx.compose.p001foundation.layout.j;
import androidx.compose.p002material3.ModalBottomSheetKt;
import androidx.compose.p002material3.SheetValue;
import androidx.compose.p002material3.p003internal.AnchoredDraggableKt;
import androidx.compose.p002material3.p003internal.AnchoredDraggableState;
import androidx.compose.p002material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p004runtime.d;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.l;
import androidx.compose.ui.graphics.m;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.android.qjd;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.inputmethod.afb;
import com.google.inputmethod.afc;
import com.google.inputmethod.aq;
import com.google.inputmethod.bj1;
import com.google.inputmethod.cg3;
import com.google.inputmethod.d08;
import com.google.inputmethod.df9;
import com.google.inputmethod.dud;
import com.google.inputmethod.eg3;
import com.google.inputmethod.ej7;
import com.google.inputmethod.ff3;
import com.google.inputmethod.fp1;
import com.google.inputmethod.gs1;
import com.google.inputmethod.ko1;
import com.google.inputmethod.kx1;
import com.google.inputmethod.mt0;
import com.google.inputmethod.nfb;
import com.google.inputmethod.og3;
import com.google.inputmethod.pp1;
import com.google.inputmethod.q16;
import com.google.inputmethod.q6c;
import com.google.inputmethod.qr;
import com.google.inputmethod.rbc;
import com.google.inputmethod.re8;
import com.google.inputmethod.rh7;
import com.google.inputmethod.rje;
import com.google.inputmethod.rn8;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.ss0;
import com.google.inputmethod.tc;
import com.google.inputmethod.ue8;
import com.google.inputmethod.ugc;
import com.google.inputmethod.v51;
import com.google.inputmethod.vbc;
import com.google.inputmethod.vn3;
import com.google.inputmethod.vs0;
import com.google.inputmethod.vx7;
import com.google.inputmethod.wz9;
import com.google.inputmethod.xa4;
import com.google.inputmethod.xdd;
import com.google.inputmethod.xj1;
import com.google.inputmethod.xkb;
import com.google.inputmethod.xz9;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a·\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\r2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a×\u0001\u0010%\u001a\u00020\u0001*\u00020\u001c2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\u0006\u0010\"\u001a\u00020!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u00172\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u0017H\u0001¢\u0006\u0004\b%\u0010&\u001a\u001b\u0010)\u001a\u00020\u001e*\u00020'2\u0006\u0010(\u001a\u00020\u001eH\u0002¢\u0006\u0004\b)\u0010*\u001a\u001b\u0010+\u001a\u00020\u001e*\u00020'2\u0006\u0010(\u001a\u00020\u001eH\u0002¢\u0006\u0004\b+\u0010*\u001a/\u0010/\u001a\u00020\u00052\b\b\u0002\u0010,\u001a\u00020\t2\u0014\b\u0002\u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\t0\u0017H\u0007¢\u0006\u0004\b/\u00100\u001a5\u00104\u001a\u00020\u00012\u0006\u00101\u001a\u00020\r2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u00102\u001a\u00020\t2\u0006\u00103\u001a\u00020\tH\u0003¢\u0006\u0004\b4\u00105\"\u0014\u00108\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107\"\u0014\u0010:\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107\"\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006@²\u0006\f\u0010?\u001a\u00020\u001e8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/b;", "modifier", "Landroidx/compose/material3/SheetState;", "sheetState", "Lcom/google/android/ff3;", "sheetMaxWidth", "", "sheetGesturesEnabled", "Lcom/google/android/xkb;", "shape", "Lcom/google/android/ei1;", "containerColor", "contentColor", "tonalElevation", "scrimColor", "dragHandle", "Landroidx/compose/foundation/layout/g1;", "contentWindowInsets", "Lcom/google/android/vx7;", "properties", "Lkotlin/Function1;", "Lcom/google/android/xj1;", "content", "s", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/b;Landroidx/compose/material3/SheetState;FZLcom/google/android/xkb;JJFJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lcom/google/android/vx7;Lcom/google/android/ps4;Landroidx/compose/runtime/d;III)V", "Lcom/google/android/mt0;", "Landroidx/compose/animation/core/Animatable;", "", "Lcom/google/android/qr;", "predictiveBackProgress", "Lcom/google/android/ta2;", "scope", "animateToDismiss", "settleToDismiss", "t", "(Lcom/google/android/mt0;Landroidx/compose/animation/core/Animatable;Lcom/google/android/ta2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/b;Landroidx/compose/material3/SheetState;FZLcom/google/android/xkb;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lcom/google/android/ps4;Landroidx/compose/runtime/d;III)V", "Landroidx/compose/ui/graphics/m;", "progress", "R", "(Landroidx/compose/ui/graphics/m;F)F", "S", "skipPartiallyExpanded", "Landroidx/compose/material3/SheetValue;", "confirmValueChange", "T", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;II)Landroidx/compose/material3/SheetState;", "color", "visible", "dismissEnabled", "H", "(JLkotlin/jvm/functions/Function0;ZZLandroidx/compose/runtime/d;I)V", "a", "F", "PredictiveBackMaxScaleXDistance", "b", "PredictiveBackMaxScaleYDistance", "Landroidx/compose/ui/graphics/t;", "c", "J", "PredictiveBackChildTransformOrigin", "alpha", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ModalBottomSheetKt {
    private static final float a = ff3.i(48);
    private static final float b = ff3.i(24);
    private static final long c = xdd.a(0.5f, 0.0f);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements Function2<androidx.compose.p004runtime.d, Integer, g1> {
        public static final a a = new a();

        a() {
        }

        public final g1 a(androidx.compose.p004runtime.d dVar, int i) {
            dVar.y(-511854661);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-511854661, i, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:134)");
            }
            g1 g1VarM = ss0.a.m(dVar, 6);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            dVar.u();
            return g1VarM;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ long a;
        final /* synthetic */ Function0<Unit> b;
        final /* synthetic */ SheetState c;
        final /* synthetic */ vx7 d;
        final /* synthetic */ Animatable<Float, qr> e;
        final /* synthetic */ ta2 f;
        final /* synthetic */ Function1<Float, Unit> g;
        final /* synthetic */ androidx.compose.ui.b h;
        final /* synthetic */ float i;
        final /* synthetic */ boolean j;
        final /* synthetic */ xkb k;
        final /* synthetic */ long l;
        final /* synthetic */ long m;
        final /* synthetic */ float n;
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> o;
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, g1> p;
        final /* synthetic */ ps4<xj1, androidx.compose.p004runtime.d, Integer, Unit> q;

        /* JADX WARN: Multi-variable type inference failed */
        b(long j, Function0<Unit> function0, SheetState sheetState, vx7 vx7Var, Animatable<Float, qr> animatable, ta2 ta2Var, Function1<? super Float, Unit> function1, androidx.compose.ui.b bVar, float f, boolean z, xkb xkbVar, long j2, long j3, float f2, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, Function2<? super androidx.compose.p004runtime.d, ? super Integer, ? extends g1> function3, ps4<? super xj1, ? super androidx.compose.p004runtime.d, ? super Integer, Unit> ps4Var) {
            this.a = j;
            this.b = function0;
            this.c = sheetState;
            this.d = vx7Var;
            this.e = animatable;
            this.f = ta2Var;
            this.g = function1;
            this.h = bVar;
            this.i = f;
            this.j = z;
            this.k = xkbVar;
            this.l = j2;
            this.m = j3;
            this.n = f2;
            this.o = function2;
            this.p = function3;
            this.q = ps4Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(nfb nfbVar) {
            SemanticsPropertiesKt.F0(nfbVar, true);
            return Unit.a;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final void b(androidx.compose.p004runtime.d dVar, int i) throws NoWhenBranchMatchedException {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(1010026864, i, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:185)");
            }
            androidx.compose.ui.b bVarP = WindowInsetsPadding_androidKt.p(SizeKt.f(androidx.compose.ui.b.INSTANCE, 0.0f, 1, null));
            Object objR = dVar.R();
            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new Function1() { // from class: androidx.compose.material3.q0
                    public final Object invoke(Object obj) {
                        return ModalBottomSheetKt.b.c((nfb) obj);
                    }
                };
                dVar.L(objR);
            }
            androidx.compose.ui.b bVarD = afb.d(bVarP, false, (Function1) objR, 1, null);
            long j = this.a;
            Function0<Unit> function0 = this.b;
            SheetState sheetState = this.c;
            vx7 vx7Var = this.d;
            Animatable<Float, qr> animatable = this.e;
            ta2 ta2Var = this.f;
            Function1<Float, Unit> function1 = this.g;
            androidx.compose.ui.b bVar = this.h;
            float f = this.i;
            boolean z = this.j;
            xkb xkbVar = this.k;
            long j2 = this.l;
            long j3 = this.m;
            float f2 = this.n;
            Function2<androidx.compose.p004runtime.d, Integer, Unit> function2 = this.o;
            Function2<androidx.compose.p004runtime.d, Integer, g1> function3 = this.p;
            ps4<xj1, androidx.compose.p004runtime.d, Integer, Unit> ps4Var = this.q;
            ej7 ej7VarI = j.i(tc.INSTANCE.o(), false);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, bVarD);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion.b();
            if (dVar.G() == null) {
                pp1.d();
            }
            dVar.o();
            if (dVar.getInserting()) {
                dVar.W(function0B);
            } else {
                dVar.k();
            }
            androidx.compose.p004runtime.d dVarC = dud.c(dVar);
            dud.i(dVarC, ej7VarI, companion.d());
            dud.i(dVarC, gs1VarJ, companion.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion.e());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            ModalBottomSheetKt.H(j, function0, sheetState.n() != SheetValue.Hidden, vx7Var.getShouldDismissOnClickOutside(), dVar, 0);
            ModalBottomSheetKt.t(boxScopeInstance, animatable, ta2Var, function0, function1, bVar, sheetState, f, z, xkbVar, j2, j3, f2, function2, function3, ps4Var, dVar, (Animatable.m << 3) | 6, 0, 0);
            dVar.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
            b((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c implements Function2<androidx.compose.p004runtime.d, Integer, g1> {
        public static final c a = new c();

        c() {
        }

        public final g1 a(androidx.compose.p004runtime.d dVar, int i) {
            dVar.y(1023699493);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(1023699493, i, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous> (ModalBottomSheet.kt:270)");
            }
            g1 g1VarM = ss0.a.m(dVar, 6);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            dVar.u();
            return g1VarM;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class d implements PointerInputEventHandler {
        final /* synthetic */ Function0<Unit> a;

        d(Function0<Unit> function0) {
            this.a = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(Function0 function0, rn8 rn8Var) {
            function0.invoke();
            return Unit.a;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(df9 df9Var, q22<? super Unit> q22Var) {
            final Function0<Unit> function0 = this.a;
            Object objI = TapGestureDetectorKt.i(df9Var, null, null, null, new Function1() { // from class: androidx.compose.material3.x0
                public final Object invoke(Object obj) {
                    return ModalBottomSheetKt.d.b(function0, (rn8) obj);
                }
            }, q22Var, 7, null);
            return objI == kotlin.coroutines.intrinsics.a.g() ? objI : Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SheetValue.values().length];
            try {
                iArr[SheetValue.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SheetValue.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(SheetState sheetState, ta2 ta2Var, Animatable animatable, final Function0 function0) {
        if (sheetState.i() == SheetValue.Expanded && sheetState.k()) {
            rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new C0189ModalBottomSheetKt$ModalBottomSheet$3$1$1(animatable, null), 3, (Object) null);
            rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new C0190ModalBottomSheetKt$ModalBottomSheet$3$1$2(sheetState, null), 3, (Object) null);
        } else {
            rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new C0191ModalBottomSheetKt$ModalBottomSheet$3$1$3(sheetState, null), 3, (Object) null).A(new Function1() { // from class: com.google.android.sx7
                public final Object invoke(Object obj) {
                    return ModalBottomSheetKt.B(function0, (Throwable) obj);
                }
            });
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(Function0 function0, Throwable th) {
        function0.invoke();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit C(Function0 function0, androidx.compose.ui.b bVar, SheetState sheetState, float f, boolean z, xkb xkbVar, long j, long j2, float f2, long j3, Function2 function2, Function2 function3, vx7 vx7Var, ps4 ps4Var, int i, int i2, int i3, androidx.compose.p004runtime.d dVar, int i4) throws NoWhenBranchMatchedException {
        s(function0, bVar, sheetState, f, z, xkbVar, j, j2, f2, j3, function2, function3, vx7Var, ps4Var, dVar, saa.a(i | 1), saa.a(i2), i3);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(final SheetState sheetState, ta2 ta2Var, final Function0 function0) {
        if (((Boolean) sheetState.h().s().invoke(SheetValue.Hidden)).booleanValue()) {
            rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new C0193ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1(sheetState, null), 3, (Object) null).A(new Function1() { // from class: com.google.android.rx7
                public final Object invoke(Object obj) {
                    return ModalBottomSheetKt.E(sheetState, function0, (Throwable) obj);
                }
            });
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(SheetState sheetState, Function0 function0, Throwable th) {
        if (!sheetState.q()) {
            function0.invoke();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(ta2 ta2Var, final SheetState sheetState, final Function0 function0, float f) {
        rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new C0194ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1(sheetState, f, null), 3, (Object) null).A(new Function1() { // from class: com.google.android.tx7
            public final Object invoke(Object obj) {
                return ModalBottomSheetKt.G(sheetState, function0, (Throwable) obj);
            }
        });
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(SheetState sheetState, Function0 function0, Throwable th) {
        if (!sheetState.q()) {
            function0.invoke();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(final long j, final Function0<Unit> function0, final boolean z, final boolean z2, androidx.compose.p004runtime.d dVar, final int i) {
        int i2;
        int i3;
        androidx.compose.ui.b bVarC;
        androidx.compose.p004runtime.d dVarF = dVar.F(-391613911);
        if ((i & 6) == 0) {
            i2 = (dVarF.D(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.T(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dVarF.A(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= dVarF.A(z2) ? 2048 : 1024;
        }
        if (dVarF.g((i2 & 1171) != 1170, i2 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-391613911, i2, -1, "androidx.compose.material3.Scrim (ModalBottomSheet.kt:514)");
            }
            if (j != 16) {
                dVarF.y(-1438582326);
                int i4 = i2;
                final q6c<Float> q6cVarE = AnimateAsStateKt.e(z ? 1.0f : 0.0f, d08.b(MotionSchemeKeyTokens.DefaultEffects, dVarF, 6), 0.0f, null, null, dVarF, 0, 28);
                rbc.Companion companion = rbc.INSTANCE;
                final String strB = vbc.b(rbc.a(xz9.a), dVarF, 0);
                if (z2) {
                    dVarF.y(-1438283579);
                    androidx.compose.ui.b.Companion companion2 = androidx.compose.ui.b.INSTANCE;
                    int i5 = i4 & 112;
                    boolean z3 = i5 == 32;
                    Object objR = dVarF.R();
                    if (z3 || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                        objR = new d(function0);
                        dVarF.L(objR);
                    }
                    androidx.compose.ui.b bVarC2 = ugc.c(companion2, function0, (PointerInputEventHandler) objR);
                    boolean zX = (i5 == 32) | dVarF.x(strB);
                    Object objR2 = dVarF.R();
                    if (zX || objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                        objR2 = new Function1() { // from class: com.google.android.ux7
                            public final Object invoke(Object obj) {
                                return ModalBottomSheetKt.J(strB, function0, (nfb) obj);
                            }
                        };
                        dVarF.L(objR2);
                    }
                    i3 = 1;
                    bVarC = afb.c(bVarC2, true, (Function1) objR2);
                    dVarF.u();
                } else {
                    i3 = 1;
                    dVarF.y(-1437857391);
                    dVarF.u();
                    bVarC = androidx.compose.ui.b.INSTANCE;
                }
                androidx.compose.ui.b bVarThen = SizeKt.f(androidx.compose.ui.b.INSTANCE, 0.0f, i3, null).then(bVarC);
                int i6 = (dVarF.x(q6cVarE) ? 1 : 0) | ((i4 & 14) == 4 ? i3 : 0);
                Object objR3 = dVarF.R();
                if (i6 != 0 || objR3 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                    objR3 = new Function1() { // from class: com.google.android.ex7
                        public final Object invoke(Object obj) {
                            return ModalBottomSheetKt.L(j, q6cVarE, (DrawScope) obj);
                        }
                    };
                    dVarF.L(objR3);
                }
                v51.b(bVarThen, (Function1) objR3, dVarF, 0);
                dVarF.u();
            } else {
                dVarF.y(-1437676103);
                dVarF.u();
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.fx7
                public final Object invoke(Object obj, Object obj2) {
                    return ModalBottomSheetKt.M(j, function0, z, z2, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final float I(q6c<Float> q6cVar) {
        return q6cVar.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(String str, final Function0 function0, nfb nfbVar) {
        SemanticsPropertiesKt.G0(nfbVar, 1.0f);
        SemanticsPropertiesKt.b0(nfbVar, str);
        SemanticsPropertiesKt.x(nfbVar, null, new Function0() { // from class: com.google.android.lx7
            public final Object invoke() {
                return Boolean.valueOf(ModalBottomSheetKt.K(function0));
            }
        }, 1, null);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean K(Function0 function0) {
        function0.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(long j, q6c q6cVar, DrawScope drawScope) {
        DrawScope.T0(drawScope, j, 0L, 0L, g.n(I(q6cVar), 0.0f, 1.0f), null, null, 0, 118, null);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(long j, Function0 function0, boolean z, boolean z2, int i, androidx.compose.p004runtime.d dVar, int i2) {
        H(j, function0, z, z2, dVar, saa.a(i | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float R(m mVar, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (mVar.getSize() >> 32));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (rh7.b(0.0f, Math.min(mVar.x2(a), fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float S(m mVar, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (mVar.getSize() & 4294967295L));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (rh7.b(0.0f, Math.min(mVar.x2(b), fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    public static final SheetState T(boolean z, Function1<? super SheetValue, Boolean> function1, androidx.compose.p004runtime.d dVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            Object objR = dVar.R();
            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new Function1() { // from class: com.google.android.dx7
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(ModalBottomSheetKt.U((SheetValue) obj));
                    }
                };
                dVar.L(objR);
            }
            function1 = (Function1) objR;
        }
        Function1<? super SheetValue, Boolean> function2 = function1;
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.o(-778250030, i, -1, "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.kt:502)");
        }
        SheetState sheetStateK = m1.k(z2, function2, SheetValue.Hidden, false, 0.0f, 0.0f, dVar, (i & 14) | 384 | (i & 112), 56);
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.n();
        }
        return sheetStateK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean U(SheetValue sheetValue) {
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:101:0x011a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0123  */
    /* JADX WARN: Code duplicated, block: B:106:0x0127  */
    /* JADX WARN: Code duplicated, block: B:109:0x012d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0136  */
    /* JADX WARN: Code duplicated, block: B:112:0x013a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0144  */
    /* JADX WARN: Code duplicated, block: B:115:0x0147  */
    /* JADX WARN: Code duplicated, block: B:117:0x014c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0156  */
    /* JADX WARN: Code duplicated, block: B:122:0x015a  */
    /* JADX WARN: Code duplicated, block: B:125:0x0165 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x016e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0175  */
    /* JADX WARN: Code duplicated, block: B:133:0x0178  */
    /* JADX WARN: Code duplicated, block: B:135:0x017e  */
    /* JADX WARN: Code duplicated, block: B:137:0x0186  */
    /* JADX WARN: Code duplicated, block: B:138:0x0189  */
    /* JADX WARN: Code duplicated, block: B:141:0x0190  */
    /* JADX WARN: Code duplicated, block: B:144:0x0199  */
    /* JADX WARN: Code duplicated, block: B:146:0x019e  */
    /* JADX WARN: Code duplicated, block: B:148:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:150:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:154:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:158:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:161:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:163:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:185:0x0222 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:186:0x0224  */
    /* JADX WARN: Code duplicated, block: B:189:0x022b  */
    /* JADX WARN: Code duplicated, block: B:191:0x0235  */
    /* JADX WARN: Code duplicated, block: B:192:0x023c  */
    /* JADX WARN: Code duplicated, block: B:194:0x023f  */
    /* JADX WARN: Code duplicated, block: B:197:0x0244  */
    /* JADX WARN: Code duplicated, block: B:200:0x0253  */
    /* JADX WARN: Code duplicated, block: B:201:0x025f  */
    /* JADX WARN: Code duplicated, block: B:204:0x0265  */
    /* JADX WARN: Code duplicated, block: B:205:0x0272  */
    /* JADX WARN: Code duplicated, block: B:207:0x0276  */
    /* JADX WARN: Code duplicated, block: B:208:0x027c  */
    /* JADX WARN: Code duplicated, block: B:211:0x0282  */
    /* JADX WARN: Code duplicated, block: B:212:0x028d  */
    /* JADX WARN: Code duplicated, block: B:214:0x0291  */
    /* JADX WARN: Code duplicated, block: B:215:0x0298  */
    /* JADX WARN: Code duplicated, block: B:218:0x029e  */
    /* JADX WARN: Code duplicated, block: B:219:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:222:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:223:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:226:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:229:0x030d  */
    /* JADX WARN: Code duplicated, block: B:231:0x0313  */
    /* JADX WARN: Code duplicated, block: B:237:0x032f  */
    /* JADX WARN: Code duplicated, block: B:239:0x0337  */
    /* JADX WARN: Code duplicated, block: B:242:0x0350  */
    /* JADX WARN: Code duplicated, block: B:245:0x035f  */
    /* JADX WARN: Code duplicated, block: B:247:0x0365  */
    /* JADX WARN: Code duplicated, block: B:253:0x0376  */
    /* JADX WARN: Code duplicated, block: B:254:0x0378  */
    /* JADX WARN: Code duplicated, block: B:257:0x0380  */
    /* JADX WARN: Code duplicated, block: B:259:0x0386  */
    /* JADX WARN: Code duplicated, block: B:262:0x039a  */
    /* JADX WARN: Code duplicated, block: B:264:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:270:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:271:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:274:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:276:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:279:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:282:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:284:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:290:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:291:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:294:0x0406  */
    /* JADX WARN: Code duplicated, block: B:296:0x040c  */
    /* JADX WARN: Code duplicated, block: B:299:0x0456  */
    /* JADX WARN: Code duplicated, block: B:301:0x0460  */
    /* JADX WARN: Code duplicated, block: B:303:0x0466  */
    /* JADX WARN: Code duplicated, block: B:308:0x0471  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:310:0x0477  */
    /* JADX WARN: Code duplicated, block: B:312:0x048f  */
    /* JADX WARN: Code duplicated, block: B:315:0x049e  */
    /* JADX WARN: Code duplicated, block: B:317:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:320:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:322:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:92:0x0101  */
    /* JADX WARN: Code duplicated, block: B:94:0x0107  */
    /* JADX WARN: Code duplicated, block: B:95:0x010a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0114  */
    public static final void s(final Function0<Unit> function0, androidx.compose.ui.b bVar, SheetState sheetState, float f, boolean z, xkb xkbVar, long j, long j2, float f2, long j3, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, Function2<? super androidx.compose.p004runtime.d, ? super Integer, ? extends g1> function3, vx7 vx7Var, final ps4<? super xj1, ? super androidx.compose.p004runtime.d, ? super Integer, Unit> ps4Var, androidx.compose.p004runtime.d dVar, final int i, final int i2, final int i3) throws NoWhenBranchMatchedException {
        int i4;
        androidx.compose.ui.b bVar2;
        final SheetState sheetStateT;
        int i5;
        float f3;
        int i6;
        int i7;
        boolean z2;
        int i8;
        xkb xkbVarH;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z3;
        androidx.compose.p004runtime.d dVar2;
        final long j4;
        final Function2<? super androidx.compose.p004runtime.d, ? super Integer, ? extends g1> function4;
        final vx7 vx7Var2;
        final float f4;
        final boolean z4;
        final androidx.compose.ui.b bVar3;
        final SheetState sheetState2;
        final xkb xkbVar2;
        final long j5;
        final float f5;
        final long j6;
        final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function5;
        s6b s6bVarH;
        float fK;
        long jF;
        long jG;
        float fI;
        long j7;
        Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2A;
        Function2<? super androidx.compose.p004runtime.d, ? super Integer, ? extends g1> function6;
        int i20;
        float f6;
        vx7 vx7Var3;
        float f7;
        Function2<? super androidx.compose.p004runtime.d, ? super Integer, ? extends g1> function7;
        long j8;
        boolean z5;
        androidx.compose.ui.b bVar4;
        xkb xkbVar3;
        Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function8;
        long j9;
        long j10;
        final xa4 xa4VarB;
        final xa4 xa4VarB2;
        final xa4 xa4VarB3;
        int i21;
        boolean zT;
        Object objR;
        Object objR2;
        androidx.compose.p004runtime.d.Companion companion;
        final ta2 ta2Var;
        int i22;
        boolean z6;
        boolean z7;
        Object objR3;
        boolean z8;
        boolean z9;
        Object objR4;
        Object objR5;
        final Animatable animatable;
        boolean z10;
        boolean z11;
        Object objR6;
        boolean z12;
        Object objR7;
        int i23;
        int i24;
        int i25;
        int i26;
        androidx.compose.p004runtime.d dVarF = dVar.F(1904798512);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (dVarF.T(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i27 = i3 & 2;
        if (i27 == 0) {
            if ((i & 48) == 0) {
                bVar2 = bVar;
                i4 |= dVarF.x(bVar2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i3 & 4) == 0) {
                    sheetStateT = sheetState;
                    int i28 = dVarF.x(sheetStateT) ? 256 : 128;
                    i4 |= i28;
                } else {
                    sheetStateT = sheetState;
                }
                i4 |= i28;
            } else {
                sheetStateT = sheetState;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    f3 = f;
                    if (dVarF.B(f3)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    if ((i & 24576) == 0) {
                        z2 = z;
                        if (dVarF.A(z2)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i4 |= i8;
                    }
                    if ((i & 196608) == 0) {
                        xkbVarH = xkbVar;
                        if ((i3 & 32) == 0 || !dVarF.x(xkbVarH)) {
                            i26 = 65536;
                        } else {
                            i26 = 131072;
                        }
                        i4 |= i26;
                    } else {
                        xkbVarH = xkbVar;
                    }
                    if ((i & 1572864) != 0) {
                        if ((i3 & 64) == 0 || !dVarF.D(j)) {
                            i25 = 524288;
                        } else {
                            i25 = 1048576;
                        }
                        i4 |= i25;
                    }
                    if ((i & 12582912) == 0) {
                        int i29 = i4;
                        if ((i3 & 128) == 0 || !dVarF.D(j2)) {
                            i24 = 4194304;
                        } else {
                            i24 = 8388608;
                        }
                        i9 = i29 | i24;
                    } else {
                        i9 = i4;
                    }
                    i10 = i3 & 256;
                    if (i10 != 0) {
                        i9 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (dVarF.B(f2)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i9 |= i11;
                    }
                    if ((i & 805306368) != 0) {
                        if ((i3 & 512) == 0 || !dVarF.D(j3)) {
                            i23 = 268435456;
                        } else {
                            i23 = 536870912;
                        }
                        i9 |= i23;
                    }
                    i12 = i3 & 1024;
                    if (i12 != 0) {
                        i13 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (dVarF.T(function2)) {
                            i14 = 4;
                        } else {
                            i14 = 2;
                        }
                        i13 = i2 | i14;
                    } else {
                        i13 = i2;
                    }
                    if ((i2 & 48) != 0) {
                        i13 |= ((i3 & 2048) == 0 || !dVarF.T(function3)) ? 16 : 32;
                    }
                    i15 = i13;
                    i16 = i3 & 4096;
                    if (i16 != 0) {
                        i18 = i15 | 384;
                    } else {
                        i17 = i15;
                        if ((i2 & 384) != 0) {
                            if (dVarF.x(vx7Var)) {
                                i19 = 256;
                            } else {
                                i19 = 128;
                            }
                            i17 |= i19;
                        }
                        i18 = i17;
                    }
                    if ((i3 & 8192) != 0) {
                        if ((i2 & 3072) == 0) {
                            i18 |= dVarF.T(ps4Var) ? 2048 : 1024;
                        }
                        if ((i9 & 306783379) == 306783378 || (i18 & 1171) != 1170) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (dVarF.g(z3, i9 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0 || dVarF.t()) {
                                if (i27 != 0) {
                                    bVar2 = androidx.compose.ui.b.INSTANCE;
                                }
                                if ((i3 & 4) != 0) {
                                    i9 &= -897;
                                    sheetStateT = T(false, null, dVarF, 0, 3);
                                }
                                if (i5 != 0) {
                                    fK = ss0.a.k();
                                } else {
                                    fK = f3;
                                }
                                if (i7 != 0) {
                                    z2 = true;
                                }
                                if ((i3 & 32) != 0) {
                                    i9 &= -458753;
                                    xkbVarH = ss0.a.h(dVarF, 6);
                                }
                                if ((i3 & 64) != 0) {
                                    jF = ss0.a.f(dVarF, 6);
                                    i9 &= -3670017;
                                } else {
                                    jF = j;
                                }
                                if ((i3 & 128) != 0) {
                                    jG = bj1.g(jF, dVarF, (i9 >> 18) & 14);
                                    i9 &= -29360129;
                                } else {
                                    jG = j2;
                                }
                                if (i10 != 0) {
                                    fI = ff3.i(0);
                                } else {
                                    fI = f2;
                                }
                                if ((i3 & 512) != 0) {
                                    j7 = ss0.a.j(dVarF, 6);
                                    i9 &= -1879048193;
                                } else {
                                    j7 = j3;
                                }
                                if (i12 != 0) {
                                    function2A = fp1.a.a();
                                } else {
                                    function2A = function2;
                                }
                                if ((i3 & 2048) != 0) {
                                    function6 = a.a;
                                    i18 &= -113;
                                } else {
                                    function6 = function3;
                                }
                                i20 = i18;
                                if (i16 != 0) {
                                    f6 = fK;
                                    vx7Var3 = new vx7(false, false, 3, null);
                                    f7 = fI;
                                    function7 = function6;
                                    j8 = jF;
                                    z5 = z2;
                                    bVar4 = bVar2;
                                    xkbVar3 = xkbVarH;
                                    function8 = function2A;
                                    j9 = jG;
                                    j10 = j7;
                                    i18 = i20;
                                } else {
                                    f6 = fK;
                                    vx7Var3 = vx7Var;
                                    f7 = fI;
                                    function7 = function6;
                                    j8 = jF;
                                    z5 = z2;
                                    bVar4 = bVar2;
                                    xkbVar3 = xkbVarH;
                                    function8 = function2A;
                                    j9 = jG;
                                    j10 = j7;
                                }
                            } else {
                                dVarF.q();
                                if ((i3 & 4) != 0) {
                                    i9 &= -897;
                                }
                                if ((i3 & 32) != 0) {
                                    i9 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    i9 &= -3670017;
                                }
                                if ((i3 & 128) != 0) {
                                    i9 &= -29360129;
                                }
                                if ((i3 & 512) != 0) {
                                    i9 &= -1879048193;
                                }
                                if ((i3 & 2048) != 0) {
                                    i18 &= -113;
                                }
                                j8 = j;
                                j9 = j2;
                                f7 = f2;
                                j10 = j3;
                                function8 = function2;
                                function7 = function3;
                                vx7Var3 = vx7Var;
                                f6 = f3;
                                z5 = z2;
                                bVar4 = bVar2;
                                xkbVar3 = xkbVarH;
                            }
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(1904798512, i9, i18, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
                            }
                            MotionSchemeKeyTokens motionSchemeKeyTokens = MotionSchemeKeyTokens.DefaultSpatial;
                            xa4VarB = d08.b(motionSchemeKeyTokens, dVarF, 6);
                            xa4VarB2 = d08.b(motionSchemeKeyTokens, dVarF, 6);
                            xa4VarB3 = d08.b(MotionSchemeKeyTokens.FastEffects, dVarF, 6);
                            i21 = (i9 & 896) ^ 384;
                            zT = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(xa4VarB2) | dVarF.T(xa4VarB3) | dVarF.T(xa4VarB);
                            objR = dVarF.R();
                            if (zT || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR = new Function0() { // from class: com.google.android.mx7
                                    public final Object invoke() {
                                        return ModalBottomSheetKt.z(sheetStateT, xa4VarB2, xa4VarB3, xa4VarB);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            vn3.i((Function0) objR, dVarF, 0);
                            objR2 = dVarF.R();
                            companion = androidx.compose.p004runtime.d.INSTANCE;
                            if (objR2 == companion.a()) {
                                objR2 = vn3.k(EmptyCoroutineContext.a, dVarF);
                                dVarF.L(objR2);
                            }
                            ta2Var = (ta2) objR2;
                            boolean zT2 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var);
                            i22 = i9 & 14;
                            if (i22 == 4) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            z7 = zT2 | z6;
                            objR3 = dVarF.R();
                            if (z7 || objR3 == companion.a()) {
                                objR3 = new Function0() { // from class: com.google.android.nx7
                                    public final Object invoke() {
                                        return ModalBottomSheetKt.D(sheetStateT, ta2Var, function0);
                                    }
                                };
                                dVarF.L(objR3);
                            }
                            Function0 function1 = (Function0) objR3;
                            boolean zT3 = dVarF.T(ta2Var) | ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256);
                            if (i22 == 4) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            z9 = zT3 | z8;
                            objR4 = dVarF.R();
                            if (z9 || objR4 == companion.a()) {
                                objR4 = new Function1() { // from class: com.google.android.ox7
                                    public final Object invoke(Object obj) {
                                        return ModalBottomSheetKt.F(ta2Var, sheetStateT, function0, ((Float) obj).floatValue());
                                    }
                                };
                                dVarF.L(objR4);
                            }
                            Function1 function9 = (Function1) objR4;
                            objR5 = dVarF.R();
                            if (objR5 == companion.a()) {
                                objR5 = aq.b(0.0f, 0.0f, 2, null);
                                dVarF.L(objR5);
                            }
                            animatable = (Animatable) objR5;
                            boolean zT4 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var) | dVarF.T(animatable);
                            if (i22 == 4) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            z11 = z10 | zT4;
                            objR6 = dVarF.R();
                            if (z11 || objR6 == companion.a()) {
                                objR6 = new Function0() { // from class: com.google.android.px7
                                    public final Object invoke() {
                                        return ModalBottomSheetKt.A(sheetStateT, ta2Var, animatable, function0);
                                    }
                                };
                                dVarF.L(objR6);
                            }
                            b1.e((Function0) objR6, j9, vx7Var3, animatable, ko1.e(1010026864, true, new b(j10, function1, sheetStateT, vx7Var3, animatable, ta2Var, function9, bVar4, f6, z5, xkbVar3, j8, j9, f7, function8, function7, ps4Var), dVarF, 54), dVarF, (i18 & 896) | ((i9 >> 18) & 112) | 24576 | (Animatable.m << 9));
                            dVar2 = dVarF;
                            if (sheetStateT.j()) {
                                dVar2.y(748459762);
                                z12 = (i21 <= 256 && dVar2.x(sheetStateT)) || (i9 & 384) == 256;
                                objR7 = dVar2.R();
                                if (z12 || objR7 == companion.a()) {
                                    objR7 = new C0192ModalBottomSheetKt$ModalBottomSheet$5$1(sheetStateT, null);
                                    dVar2.L(objR7);
                                }
                                vn3.g(sheetStateT, (Function2) objR7, dVar2, (i9 >> 6) & 14);
                                dVar2.u();
                            } else {
                                dVar2.y(748521266);
                                dVar2.u();
                            }
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            sheetState2 = sheetStateT;
                            j6 = j10;
                            vx7Var2 = vx7Var3;
                            bVar3 = bVar4;
                            f4 = f6;
                            z4 = z5;
                            xkbVar2 = xkbVar3;
                            j4 = j8;
                            j5 = j9;
                            f5 = f7;
                            function5 = function8;
                            function4 = function7;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            j4 = j;
                            function4 = function3;
                            vx7Var2 = vx7Var;
                            f4 = f3;
                            z4 = z2;
                            bVar3 = bVar2;
                            sheetState2 = sheetStateT;
                            xkbVar2 = xkbVarH;
                            j5 = j2;
                            f5 = f2;
                            j6 = j3;
                            function5 = function2;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.qx7
                                public final Object invoke(Object obj, Object obj2) {
                                    return ModalBottomSheetKt.C(function0, bVar3, sheetState2, f4, z4, xkbVar2, j4, j5, f5, j6, function5, function4, vx7Var2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i18 |= 3072;
                    if ((i9 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (dVarF.g(z3, i9 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i27 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if ((i3 & 4) != 0) {
                                i9 &= -897;
                                sheetStateT = T(false, null, dVarF, 0, 3);
                            }
                            if (i5 != 0) {
                                fK = ss0.a.k();
                            } else {
                                fK = f3;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 32) != 0) {
                                i9 &= -458753;
                                xkbVarH = ss0.a.h(dVarF, 6);
                            }
                            if ((i3 & 64) != 0) {
                                jF = ss0.a.f(dVarF, 6);
                                i9 &= -3670017;
                            } else {
                                jF = j;
                            }
                            if ((i3 & 128) != 0) {
                                jG = bj1.g(jF, dVarF, (i9 >> 18) & 14);
                                i9 &= -29360129;
                            } else {
                                jG = j2;
                            }
                            if (i10 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f2;
                            }
                            if ((i3 & 512) != 0) {
                                j7 = ss0.a.j(dVarF, 6);
                                i9 &= -1879048193;
                            } else {
                                j7 = j3;
                            }
                            if (i12 != 0) {
                                function2A = fp1.a.a();
                            } else {
                                function2A = function2;
                            }
                            if ((i3 & 2048) != 0) {
                                function6 = a.a;
                                i18 &= -113;
                            } else {
                                function6 = function3;
                            }
                            i20 = i18;
                            if (i16 != 0) {
                                f6 = fK;
                                vx7Var3 = new vx7(false, false, 3, null);
                                f7 = fI;
                                function7 = function6;
                                j8 = jF;
                                z5 = z2;
                                bVar4 = bVar2;
                                xkbVar3 = xkbVarH;
                                function8 = function2A;
                                j9 = jG;
                                j10 = j7;
                                i18 = i20;
                            } else {
                                f6 = fK;
                                vx7Var3 = vx7Var;
                                f7 = fI;
                                function7 = function6;
                                j8 = jF;
                                z5 = z2;
                                bVar4 = bVar2;
                                xkbVar3 = xkbVarH;
                                function8 = function2A;
                                j9 = jG;
                                j10 = j7;
                            }
                        } else {
                            if (i27 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if ((i3 & 4) != 0) {
                                i9 &= -897;
                                sheetStateT = T(false, null, dVarF, 0, 3);
                            }
                            if (i5 != 0) {
                                fK = ss0.a.k();
                            } else {
                                fK = f3;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 32) != 0) {
                                i9 &= -458753;
                                xkbVarH = ss0.a.h(dVarF, 6);
                            }
                            if ((i3 & 64) != 0) {
                                jF = ss0.a.f(dVarF, 6);
                                i9 &= -3670017;
                            } else {
                                jF = j;
                            }
                            if ((i3 & 128) != 0) {
                                jG = bj1.g(jF, dVarF, (i9 >> 18) & 14);
                                i9 &= -29360129;
                            } else {
                                jG = j2;
                            }
                            if (i10 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f2;
                            }
                            if ((i3 & 512) != 0) {
                                j7 = ss0.a.j(dVarF, 6);
                                i9 &= -1879048193;
                            } else {
                                j7 = j3;
                            }
                            if (i12 != 0) {
                                function2A = fp1.a.a();
                            } else {
                                function2A = function2;
                            }
                            if ((i3 & 2048) != 0) {
                                function6 = a.a;
                                i18 &= -113;
                            } else {
                                function6 = function3;
                            }
                            i20 = i18;
                            if (i16 != 0) {
                                f6 = fK;
                                vx7Var3 = new vx7(false, false, 3, null);
                                f7 = fI;
                                function7 = function6;
                                j8 = jF;
                                z5 = z2;
                                bVar4 = bVar2;
                                xkbVar3 = xkbVarH;
                                function8 = function2A;
                                j9 = jG;
                                j10 = j7;
                                i18 = i20;
                            } else {
                                f6 = fK;
                                vx7Var3 = vx7Var;
                                f7 = fI;
                                function7 = function6;
                                j8 = jF;
                                z5 = z2;
                                bVar4 = bVar2;
                                xkbVar3 = xkbVarH;
                                function8 = function2A;
                                j9 = jG;
                                j10 = j7;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(1904798512, i9, i18, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
                        }
                        MotionSchemeKeyTokens motionSchemeKeyTokens2 = MotionSchemeKeyTokens.DefaultSpatial;
                        xa4VarB = d08.b(motionSchemeKeyTokens2, dVarF, 6);
                        xa4VarB2 = d08.b(motionSchemeKeyTokens2, dVarF, 6);
                        xa4VarB3 = d08.b(MotionSchemeKeyTokens.FastEffects, dVarF, 6);
                        i21 = (i9 & 896) ^ 384;
                        zT = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(xa4VarB2) | dVarF.T(xa4VarB3) | dVarF.T(xa4VarB);
                        objR = dVarF.R();
                        if (zT) {
                            objR = new Function0() { // from class: com.google.android.mx7
                                public final Object invoke() {
                                    return ModalBottomSheetKt.z(sheetStateT, xa4VarB2, xa4VarB3, xa4VarB);
                                }
                            };
                            dVarF.L(objR);
                        } else {
                            objR = new Function0() { // from class: com.google.android.mx7
                                public final Object invoke() {
                                    return ModalBottomSheetKt.z(sheetStateT, xa4VarB2, xa4VarB3, xa4VarB);
                                }
                            };
                            dVarF.L(objR);
                        }
                        vn3.i((Function0) objR, dVarF, 0);
                        objR2 = dVarF.R();
                        companion = androidx.compose.p004runtime.d.INSTANCE;
                        if (objR2 == companion.a()) {
                            objR2 = vn3.k(EmptyCoroutineContext.a, dVarF);
                            dVarF.L(objR2);
                        }
                        ta2Var = (ta2) objR2;
                        boolean zT5 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var);
                        i22 = i9 & 14;
                        if (i22 == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z7 = zT5 | z6;
                        objR3 = dVarF.R();
                        if (z7) {
                            objR3 = new Function0() { // from class: com.google.android.nx7
                                public final Object invoke() {
                                    return ModalBottomSheetKt.D(sheetStateT, ta2Var, function0);
                                }
                            };
                            dVarF.L(objR3);
                        } else {
                            objR3 = new Function0() { // from class: com.google.android.nx7
                                public final Object invoke() {
                                    return ModalBottomSheetKt.D(sheetStateT, ta2Var, function0);
                                }
                            };
                            dVarF.L(objR3);
                        }
                        Function0 function10 = (Function0) objR3;
                        boolean zT6 = dVarF.T(ta2Var) | ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256);
                        if (i22 == 4) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        z9 = zT6 | z8;
                        objR4 = dVarF.R();
                        if (z9) {
                            objR4 = new Function1() { // from class: com.google.android.ox7
                                public final Object invoke(Object obj) {
                                    return ModalBottomSheetKt.F(ta2Var, sheetStateT, function0, ((Float) obj).floatValue());
                                }
                            };
                            dVarF.L(objR4);
                        } else {
                            objR4 = new Function1() { // from class: com.google.android.ox7
                                public final Object invoke(Object obj) {
                                    return ModalBottomSheetKt.F(ta2Var, sheetStateT, function0, ((Float) obj).floatValue());
                                }
                            };
                            dVarF.L(objR4);
                        }
                        Function1 function11 = (Function1) objR4;
                        objR5 = dVarF.R();
                        if (objR5 == companion.a()) {
                            objR5 = aq.b(0.0f, 0.0f, 2, null);
                            dVarF.L(objR5);
                        }
                        animatable = (Animatable) objR5;
                        boolean zT7 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var) | dVarF.T(animatable);
                        if (i22 == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = z10 | zT7;
                        objR6 = dVarF.R();
                        if (z11) {
                            objR6 = new Function0() { // from class: com.google.android.px7
                                public final Object invoke() {
                                    return ModalBottomSheetKt.A(sheetStateT, ta2Var, animatable, function0);
                                }
                            };
                            dVarF.L(objR6);
                        } else {
                            objR6 = new Function0() { // from class: com.google.android.px7
                                public final Object invoke() {
                                    return ModalBottomSheetKt.A(sheetStateT, ta2Var, animatable, function0);
                                }
                            };
                            dVarF.L(objR6);
                        }
                        b1.e((Function0) objR6, j9, vx7Var3, animatable, ko1.e(1010026864, true, new b(j10, function10, sheetStateT, vx7Var3, animatable, ta2Var, function11, bVar4, f6, z5, xkbVar3, j8, j9, f7, function8, function7, ps4Var), dVarF, 54), dVarF, (i18 & 896) | ((i9 >> 18) & 112) | 24576 | (Animatable.m << 9));
                        dVar2 = dVarF;
                        if (sheetStateT.j()) {
                            dVar2.y(748459762);
                            if (i21 <= 256) {
                            }
                            objR7 = dVar2.R();
                            if (z12) {
                                objR7 = new C0192ModalBottomSheetKt$ModalBottomSheet$5$1(sheetStateT, null);
                                dVar2.L(objR7);
                            } else {
                                objR7 = new C0192ModalBottomSheetKt$ModalBottomSheet$5$1(sheetStateT, null);
                                dVar2.L(objR7);
                            }
                            vn3.g(sheetStateT, (Function2) objR7, dVar2, (i9 >> 6) & 14);
                            dVar2.u();
                        } else {
                            dVar2.y(748521266);
                            dVar2.u();
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        sheetState2 = sheetStateT;
                        j6 = j10;
                        vx7Var2 = vx7Var3;
                        bVar3 = bVar4;
                        f4 = f6;
                        z4 = z5;
                        xkbVar2 = xkbVar3;
                        j4 = j8;
                        j5 = j9;
                        f5 = f7;
                        function5 = function8;
                        function4 = function7;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        j4 = j;
                        function4 = function3;
                        vx7Var2 = vx7Var;
                        f4 = f3;
                        z4 = z2;
                        bVar3 = bVar2;
                        sheetState2 = sheetStateT;
                        xkbVar2 = xkbVarH;
                        j5 = j2;
                        f5 = f2;
                        j6 = j3;
                        function5 = function2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.qx7
                            public final Object invoke(Object obj, Object obj2) {
                                return ModalBottomSheetKt.C(function0, bVar3, sheetState2, f4, z4, xkbVar2, j4, j5, f5, j6, function5, function4, vx7Var2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i4 |= 24576;
                z2 = z;
                if ((i & 196608) == 0) {
                    xkbVarH = xkbVar;
                    if ((i3 & 32) == 0) {
                        i26 = 65536;
                    } else {
                        i26 = 65536;
                    }
                    i4 |= i26;
                } else {
                    xkbVarH = xkbVar;
                }
                if ((i & 1572864) != 0) {
                    if ((i3 & 64) == 0) {
                        i25 = 524288;
                    } else {
                        i25 = 524288;
                    }
                    i4 |= i25;
                }
                if ((i & 12582912) == 0) {
                    int i210 = i4;
                    if ((i3 & 128) == 0) {
                        i24 = 4194304;
                    } else {
                        i24 = 4194304;
                    }
                    i9 = i210 | i24;
                } else {
                    i9 = i4;
                }
                i10 = i3 & 256;
                if (i10 != 0) {
                    i9 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (dVarF.B(f2)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i9 |= i11;
                }
                if ((i & 805306368) != 0) {
                    if ((i3 & 512) == 0) {
                        i23 = 268435456;
                    } else {
                        i23 = 268435456;
                    }
                    i9 |= i23;
                }
                i12 = i3 & 1024;
                if (i12 != 0) {
                    i13 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (dVarF.T(function2)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i13 = i2 | i14;
                } else {
                    i13 = i2;
                }
                if ((i2 & 48) != 0) {
                    i13 |= ((i3 & 2048) == 0 || !dVarF.T(function3)) ? 16 : 32;
                }
                i15 = i13;
                i16 = i3 & 4096;
                if (i16 != 0) {
                    i18 = i15 | 384;
                } else {
                    i17 = i15;
                    if ((i2 & 384) != 0) {
                        if (dVarF.x(vx7Var)) {
                            i19 = 256;
                        } else {
                            i19 = 128;
                        }
                        i17 |= i19;
                    }
                    i18 = i17;
                }
                if ((i3 & 8192) != 0) {
                    if ((i2 & 3072) == 0) {
                        i18 |= dVarF.T(ps4Var) ? 2048 : 1024;
                    }
                    if ((i9 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (dVarF.g(z3, i9 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i27 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if ((i3 & 4) != 0) {
                                i9 &= -897;
                                sheetStateT = T(false, null, dVarF, 0, 3);
                            }
                            if (i5 != 0) {
                                fK = ss0.a.k();
                            } else {
                                fK = f3;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 32) != 0) {
                                i9 &= -458753;
                                xkbVarH = ss0.a.h(dVarF, 6);
                            }
                            if ((i3 & 64) != 0) {
                                jF = ss0.a.f(dVarF, 6);
                                i9 &= -3670017;
                            } else {
                                jF = j;
                            }
                            if ((i3 & 128) != 0) {
                                jG = bj1.g(jF, dVarF, (i9 >> 18) & 14);
                                i9 &= -29360129;
                            } else {
                                jG = j2;
                            }
                            if (i10 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f2;
                            }
                            if ((i3 & 512) != 0) {
                                j7 = ss0.a.j(dVarF, 6);
                                i9 &= -1879048193;
                            } else {
                                j7 = j3;
                            }
                            if (i12 != 0) {
                                function2A = fp1.a.a();
                            } else {
                                function2A = function2;
                            }
                            if ((i3 & 2048) != 0) {
                                function6 = a.a;
                                i18 &= -113;
                            } else {
                                function6 = function3;
                            }
                            i20 = i18;
                            if (i16 != 0) {
                                f6 = fK;
                                vx7Var3 = new vx7(false, false, 3, null);
                                f7 = fI;
                                function7 = function6;
                                j8 = jF;
                                z5 = z2;
                                bVar4 = bVar2;
                                xkbVar3 = xkbVarH;
                                function8 = function2A;
                                j9 = jG;
                                j10 = j7;
                                i18 = i20;
                            } else {
                                f6 = fK;
                                vx7Var3 = vx7Var;
                                f7 = fI;
                                function7 = function6;
                                j8 = jF;
                                z5 = z2;
                                bVar4 = bVar2;
                                xkbVar3 = xkbVarH;
                                function8 = function2A;
                                j9 = jG;
                                j10 = j7;
                            }
                        } else {
                            if (i27 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if ((i3 & 4) != 0) {
                                i9 &= -897;
                                sheetStateT = T(false, null, dVarF, 0, 3);
                            }
                            if (i5 != 0) {
                                fK = ss0.a.k();
                            } else {
                                fK = f3;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 32) != 0) {
                                i9 &= -458753;
                                xkbVarH = ss0.a.h(dVarF, 6);
                            }
                            if ((i3 & 64) != 0) {
                                jF = ss0.a.f(dVarF, 6);
                                i9 &= -3670017;
                            } else {
                                jF = j;
                            }
                            if ((i3 & 128) != 0) {
                                jG = bj1.g(jF, dVarF, (i9 >> 18) & 14);
                                i9 &= -29360129;
                            } else {
                                jG = j2;
                            }
                            if (i10 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f2;
                            }
                            if ((i3 & 512) != 0) {
                                j7 = ss0.a.j(dVarF, 6);
                                i9 &= -1879048193;
                            } else {
                                j7 = j3;
                            }
                            if (i12 != 0) {
                                function2A = fp1.a.a();
                            } else {
                                function2A = function2;
                            }
                            if ((i3 & 2048) != 0) {
                                function6 = a.a;
                                i18 &= -113;
                            } else {
                                function6 = function3;
                            }
                            i20 = i18;
                            if (i16 != 0) {
                                f6 = fK;
                                vx7Var3 = new vx7(false, false, 3, null);
                                f7 = fI;
                                function7 = function6;
                                j8 = jF;
                                z5 = z2;
                                bVar4 = bVar2;
                                xkbVar3 = xkbVarH;
                                function8 = function2A;
                                j9 = jG;
                                j10 = j7;
                                i18 = i20;
                            } else {
                                f6 = fK;
                                vx7Var3 = vx7Var;
                                f7 = fI;
                                function7 = function6;
                                j8 = jF;
                                z5 = z2;
                                bVar4 = bVar2;
                                xkbVar3 = xkbVarH;
                                function8 = function2A;
                                j9 = jG;
                                j10 = j7;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(1904798512, i9, i18, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
                        }
                        MotionSchemeKeyTokens motionSchemeKeyTokens3 = MotionSchemeKeyTokens.DefaultSpatial;
                        xa4VarB = d08.b(motionSchemeKeyTokens3, dVarF, 6);
                        xa4VarB2 = d08.b(motionSchemeKeyTokens3, dVarF, 6);
                        xa4VarB3 = d08.b(MotionSchemeKeyTokens.FastEffects, dVarF, 6);
                        i21 = (i9 & 896) ^ 384;
                        zT = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(xa4VarB2) | dVarF.T(xa4VarB3) | dVarF.T(xa4VarB);
                        objR = dVarF.R();
                        if (zT) {
                            objR = new Function0() { // from class: com.google.android.mx7
                                public final Object invoke() {
                                    return ModalBottomSheetKt.z(sheetStateT, xa4VarB2, xa4VarB3, xa4VarB);
                                }
                            };
                            dVarF.L(objR);
                        } else {
                            objR = new Function0() { // from class: com.google.android.mx7
                                public final Object invoke() {
                                    return ModalBottomSheetKt.z(sheetStateT, xa4VarB2, xa4VarB3, xa4VarB);
                                }
                            };
                            dVarF.L(objR);
                        }
                        vn3.i((Function0) objR, dVarF, 0);
                        objR2 = dVarF.R();
                        companion = androidx.compose.p004runtime.d.INSTANCE;
                        if (objR2 == companion.a()) {
                            objR2 = vn3.k(EmptyCoroutineContext.a, dVarF);
                            dVarF.L(objR2);
                        }
                        ta2Var = (ta2) objR2;
                        boolean zT8 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var);
                        i22 = i9 & 14;
                        if (i22 == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z7 = zT8 | z6;
                        objR3 = dVarF.R();
                        if (z7) {
                            objR3 = new Function0() { // from class: com.google.android.nx7
                                public final Object invoke() {
                                    return ModalBottomSheetKt.D(sheetStateT, ta2Var, function0);
                                }
                            };
                            dVarF.L(objR3);
                        } else {
                            objR3 = new Function0() { // from class: com.google.android.nx7
                                public final Object invoke() {
                                    return ModalBottomSheetKt.D(sheetStateT, ta2Var, function0);
                                }
                            };
                            dVarF.L(objR3);
                        }
                        Function0 function12 = (Function0) objR3;
                        boolean zT9 = dVarF.T(ta2Var) | ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256);
                        if (i22 == 4) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        z9 = zT9 | z8;
                        objR4 = dVarF.R();
                        if (z9) {
                            objR4 = new Function1() { // from class: com.google.android.ox7
                                public final Object invoke(Object obj) {
                                    return ModalBottomSheetKt.F(ta2Var, sheetStateT, function0, ((Float) obj).floatValue());
                                }
                            };
                            dVarF.L(objR4);
                        } else {
                            objR4 = new Function1() { // from class: com.google.android.ox7
                                public final Object invoke(Object obj) {
                                    return ModalBottomSheetKt.F(ta2Var, sheetStateT, function0, ((Float) obj).floatValue());
                                }
                            };
                            dVarF.L(objR4);
                        }
                        Function1 function13 = (Function1) objR4;
                        objR5 = dVarF.R();
                        if (objR5 == companion.a()) {
                            objR5 = aq.b(0.0f, 0.0f, 2, null);
                            dVarF.L(objR5);
                        }
                        animatable = (Animatable) objR5;
                        boolean zT10 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var) | dVarF.T(animatable);
                        if (i22 == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = z10 | zT10;
                        objR6 = dVarF.R();
                        if (z11) {
                            objR6 = new Function0() { // from class: com.google.android.px7
                                public final Object invoke() {
                                    return ModalBottomSheetKt.A(sheetStateT, ta2Var, animatable, function0);
                                }
                            };
                            dVarF.L(objR6);
                        } else {
                            objR6 = new Function0() { // from class: com.google.android.px7
                                public final Object invoke() {
                                    return ModalBottomSheetKt.A(sheetStateT, ta2Var, animatable, function0);
                                }
                            };
                            dVarF.L(objR6);
                        }
                        b1.e((Function0) objR6, j9, vx7Var3, animatable, ko1.e(1010026864, true, new b(j10, function12, sheetStateT, vx7Var3, animatable, ta2Var, function13, bVar4, f6, z5, xkbVar3, j8, j9, f7, function8, function7, ps4Var), dVarF, 54), dVarF, (i18 & 896) | ((i9 >> 18) & 112) | 24576 | (Animatable.m << 9));
                        dVar2 = dVarF;
                        if (sheetStateT.j()) {
                            dVar2.y(748459762);
                            if (i21 <= 256) {
                            }
                            objR7 = dVar2.R();
                            if (z12) {
                                objR7 = new C0192ModalBottomSheetKt$ModalBottomSheet$5$1(sheetStateT, null);
                                dVar2.L(objR7);
                            } else {
                                objR7 = new C0192ModalBottomSheetKt$ModalBottomSheet$5$1(sheetStateT, null);
                                dVar2.L(objR7);
                            }
                            vn3.g(sheetStateT, (Function2) objR7, dVar2, (i9 >> 6) & 14);
                            dVar2.u();
                        } else {
                            dVar2.y(748521266);
                            dVar2.u();
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        sheetState2 = sheetStateT;
                        j6 = j10;
                        vx7Var2 = vx7Var3;
                        bVar3 = bVar4;
                        f4 = f6;
                        z4 = z5;
                        xkbVar2 = xkbVar3;
                        j4 = j8;
                        j5 = j9;
                        f5 = f7;
                        function5 = function8;
                        function4 = function7;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        j4 = j;
                        function4 = function3;
                        vx7Var2 = vx7Var;
                        f4 = f3;
                        z4 = z2;
                        bVar3 = bVar2;
                        sheetState2 = sheetStateT;
                        xkbVar2 = xkbVarH;
                        j5 = j2;
                        f5 = f2;
                        j6 = j3;
                        function5 = function2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.qx7
                            public final Object invoke(Object obj, Object obj2) {
                                return ModalBottomSheetKt.C(function0, bVar3, sheetState2, f4, z4, xkbVar2, j4, j5, f5, j6, function5, function4, vx7Var2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i18 |= 3072;
                if ((i9 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (dVarF.g(z3, i9 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i27 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            i9 &= -897;
                            sheetStateT = T(false, null, dVarF, 0, 3);
                        }
                        if (i5 != 0) {
                            fK = ss0.a.k();
                        } else {
                            fK = f3;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            i9 &= -458753;
                            xkbVarH = ss0.a.h(dVarF, 6);
                        }
                        if ((i3 & 64) != 0) {
                            jF = ss0.a.f(dVarF, 6);
                            i9 &= -3670017;
                        } else {
                            jF = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(jF, dVarF, (i9 >> 18) & 14);
                            i9 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if (i10 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if ((i3 & 512) != 0) {
                            j7 = ss0.a.j(dVarF, 6);
                            i9 &= -1879048193;
                        } else {
                            j7 = j3;
                        }
                        if (i12 != 0) {
                            function2A = fp1.a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i3 & 2048) != 0) {
                            function6 = a.a;
                            i18 &= -113;
                        } else {
                            function6 = function3;
                        }
                        i20 = i18;
                        if (i16 != 0) {
                            f6 = fK;
                            vx7Var3 = new vx7(false, false, 3, null);
                            f7 = fI;
                            function7 = function6;
                            j8 = jF;
                            z5 = z2;
                            bVar4 = bVar2;
                            xkbVar3 = xkbVarH;
                            function8 = function2A;
                            j9 = jG;
                            j10 = j7;
                            i18 = i20;
                        } else {
                            f6 = fK;
                            vx7Var3 = vx7Var;
                            f7 = fI;
                            function7 = function6;
                            j8 = jF;
                            z5 = z2;
                            bVar4 = bVar2;
                            xkbVar3 = xkbVarH;
                            function8 = function2A;
                            j9 = jG;
                            j10 = j7;
                        }
                    } else {
                        if (i27 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            i9 &= -897;
                            sheetStateT = T(false, null, dVarF, 0, 3);
                        }
                        if (i5 != 0) {
                            fK = ss0.a.k();
                        } else {
                            fK = f3;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            i9 &= -458753;
                            xkbVarH = ss0.a.h(dVarF, 6);
                        }
                        if ((i3 & 64) != 0) {
                            jF = ss0.a.f(dVarF, 6);
                            i9 &= -3670017;
                        } else {
                            jF = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(jF, dVarF, (i9 >> 18) & 14);
                            i9 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if (i10 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if ((i3 & 512) != 0) {
                            j7 = ss0.a.j(dVarF, 6);
                            i9 &= -1879048193;
                        } else {
                            j7 = j3;
                        }
                        if (i12 != 0) {
                            function2A = fp1.a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i3 & 2048) != 0) {
                            function6 = a.a;
                            i18 &= -113;
                        } else {
                            function6 = function3;
                        }
                        i20 = i18;
                        if (i16 != 0) {
                            f6 = fK;
                            vx7Var3 = new vx7(false, false, 3, null);
                            f7 = fI;
                            function7 = function6;
                            j8 = jF;
                            z5 = z2;
                            bVar4 = bVar2;
                            xkbVar3 = xkbVarH;
                            function8 = function2A;
                            j9 = jG;
                            j10 = j7;
                            i18 = i20;
                        } else {
                            f6 = fK;
                            vx7Var3 = vx7Var;
                            f7 = fI;
                            function7 = function6;
                            j8 = jF;
                            z5 = z2;
                            bVar4 = bVar2;
                            xkbVar3 = xkbVarH;
                            function8 = function2A;
                            j9 = jG;
                            j10 = j7;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(1904798512, i9, i18, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
                    }
                    MotionSchemeKeyTokens motionSchemeKeyTokens4 = MotionSchemeKeyTokens.DefaultSpatial;
                    xa4VarB = d08.b(motionSchemeKeyTokens4, dVarF, 6);
                    xa4VarB2 = d08.b(motionSchemeKeyTokens4, dVarF, 6);
                    xa4VarB3 = d08.b(MotionSchemeKeyTokens.FastEffects, dVarF, 6);
                    i21 = (i9 & 896) ^ 384;
                    zT = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(xa4VarB2) | dVarF.T(xa4VarB3) | dVarF.T(xa4VarB);
                    objR = dVarF.R();
                    if (zT) {
                        objR = new Function0() { // from class: com.google.android.mx7
                            public final Object invoke() {
                                return ModalBottomSheetKt.z(sheetStateT, xa4VarB2, xa4VarB3, xa4VarB);
                            }
                        };
                        dVarF.L(objR);
                    } else {
                        objR = new Function0() { // from class: com.google.android.mx7
                            public final Object invoke() {
                                return ModalBottomSheetKt.z(sheetStateT, xa4VarB2, xa4VarB3, xa4VarB);
                            }
                        };
                        dVarF.L(objR);
                    }
                    vn3.i((Function0) objR, dVarF, 0);
                    objR2 = dVarF.R();
                    companion = androidx.compose.p004runtime.d.INSTANCE;
                    if (objR2 == companion.a()) {
                        objR2 = vn3.k(EmptyCoroutineContext.a, dVarF);
                        dVarF.L(objR2);
                    }
                    ta2Var = (ta2) objR2;
                    boolean zT11 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var);
                    i22 = i9 & 14;
                    if (i22 == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = zT11 | z6;
                    objR3 = dVarF.R();
                    if (z7) {
                        objR3 = new Function0() { // from class: com.google.android.nx7
                            public final Object invoke() {
                                return ModalBottomSheetKt.D(sheetStateT, ta2Var, function0);
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function0() { // from class: com.google.android.nx7
                            public final Object invoke() {
                                return ModalBottomSheetKt.D(sheetStateT, ta2Var, function0);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    Function0 function14 = (Function0) objR3;
                    boolean zT12 = dVarF.T(ta2Var) | ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256);
                    if (i22 == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = zT12 | z8;
                    objR4 = dVarF.R();
                    if (z9) {
                        objR4 = new Function1() { // from class: com.google.android.ox7
                            public final Object invoke(Object obj) {
                                return ModalBottomSheetKt.F(ta2Var, sheetStateT, function0, ((Float) obj).floatValue());
                            }
                        };
                        dVarF.L(objR4);
                    } else {
                        objR4 = new Function1() { // from class: com.google.android.ox7
                            public final Object invoke(Object obj) {
                                return ModalBottomSheetKt.F(ta2Var, sheetStateT, function0, ((Float) obj).floatValue());
                            }
                        };
                        dVarF.L(objR4);
                    }
                    Function1 function15 = (Function1) objR4;
                    objR5 = dVarF.R();
                    if (objR5 == companion.a()) {
                        objR5 = aq.b(0.0f, 0.0f, 2, null);
                        dVarF.L(objR5);
                    }
                    animatable = (Animatable) objR5;
                    boolean zT13 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var) | dVarF.T(animatable);
                    if (i22 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = z10 | zT13;
                    objR6 = dVarF.R();
                    if (z11) {
                        objR6 = new Function0() { // from class: com.google.android.px7
                            public final Object invoke() {
                                return ModalBottomSheetKt.A(sheetStateT, ta2Var, animatable, function0);
                            }
                        };
                        dVarF.L(objR6);
                    } else {
                        objR6 = new Function0() { // from class: com.google.android.px7
                            public final Object invoke() {
                                return ModalBottomSheetKt.A(sheetStateT, ta2Var, animatable, function0);
                            }
                        };
                        dVarF.L(objR6);
                    }
                    b1.e((Function0) objR6, j9, vx7Var3, animatable, ko1.e(1010026864, true, new b(j10, function14, sheetStateT, vx7Var3, animatable, ta2Var, function15, bVar4, f6, z5, xkbVar3, j8, j9, f7, function8, function7, ps4Var), dVarF, 54), dVarF, (i18 & 896) | ((i9 >> 18) & 112) | 24576 | (Animatable.m << 9));
                    dVar2 = dVarF;
                    if (sheetStateT.j()) {
                        dVar2.y(748459762);
                        if (i21 <= 256) {
                        }
                        objR7 = dVar2.R();
                        if (z12) {
                            objR7 = new C0192ModalBottomSheetKt$ModalBottomSheet$5$1(sheetStateT, null);
                            dVar2.L(objR7);
                        } else {
                            objR7 = new C0192ModalBottomSheetKt$ModalBottomSheet$5$1(sheetStateT, null);
                            dVar2.L(objR7);
                        }
                        vn3.g(sheetStateT, (Function2) objR7, dVar2, (i9 >> 6) & 14);
                        dVar2.u();
                    } else {
                        dVar2.y(748521266);
                        dVar2.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    sheetState2 = sheetStateT;
                    j6 = j10;
                    vx7Var2 = vx7Var3;
                    bVar3 = bVar4;
                    f4 = f6;
                    z4 = z5;
                    xkbVar2 = xkbVar3;
                    j4 = j8;
                    j5 = j9;
                    f5 = f7;
                    function5 = function8;
                    function4 = function7;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    j4 = j;
                    function4 = function3;
                    vx7Var2 = vx7Var;
                    f4 = f3;
                    z4 = z2;
                    bVar3 = bVar2;
                    sheetState2 = sheetStateT;
                    xkbVar2 = xkbVarH;
                    j5 = j2;
                    f5 = f2;
                    j6 = j3;
                    function5 = function2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.qx7
                        public final Object invoke(Object obj, Object obj2) {
                            return ModalBottomSheetKt.C(function0, bVar3, sheetState2, f4, z4, xkbVar2, j4, j5, f5, j6, function5, function4, vx7Var2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 3072;
            f3 = f;
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i & 24576) == 0) {
                    z2 = z;
                    if (dVarF.A(z2)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((i & 196608) == 0) {
                    xkbVarH = xkbVar;
                    if ((i3 & 32) == 0) {
                        i26 = 65536;
                    } else {
                        i26 = 65536;
                    }
                    i4 |= i26;
                } else {
                    xkbVarH = xkbVar;
                }
                if ((i & 1572864) != 0) {
                    if ((i3 & 64) == 0) {
                        i25 = 524288;
                    } else {
                        i25 = 524288;
                    }
                    i4 |= i25;
                }
                if ((i & 12582912) == 0) {
                    int i211 = i4;
                    if ((i3 & 128) == 0) {
                        i24 = 4194304;
                    } else {
                        i24 = 4194304;
                    }
                    i9 = i211 | i24;
                } else {
                    i9 = i4;
                }
                i10 = i3 & 256;
                if (i10 != 0) {
                    i9 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (dVarF.B(f2)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i9 |= i11;
                }
                if ((i & 805306368) != 0) {
                    if ((i3 & 512) == 0) {
                        i23 = 268435456;
                    } else {
                        i23 = 268435456;
                    }
                    i9 |= i23;
                }
                i12 = i3 & 1024;
                if (i12 != 0) {
                    i13 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (dVarF.T(function2)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i13 = i2 | i14;
                } else {
                    i13 = i2;
                }
                if ((i2 & 48) != 0) {
                    i13 |= ((i3 & 2048) == 0 || !dVarF.T(function3)) ? 16 : 32;
                }
                i15 = i13;
                i16 = i3 & 4096;
                if (i16 != 0) {
                    i18 = i15 | 384;
                } else {
                    i17 = i15;
                    if ((i2 & 384) != 0) {
                        if (dVarF.x(vx7Var)) {
                            i19 = 256;
                        } else {
                            i19 = 128;
                        }
                        i17 |= i19;
                    }
                    i18 = i17;
                }
                if ((i3 & 8192) != 0) {
                    if ((i2 & 3072) == 0) {
                        i18 |= dVarF.T(ps4Var) ? 2048 : 1024;
                    }
                    if ((i9 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (dVarF.g(z3, i9 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i27 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if ((i3 & 4) != 0) {
                                i9 &= -897;
                                sheetStateT = T(false, null, dVarF, 0, 3);
                            }
                            if (i5 != 0) {
                                fK = ss0.a.k();
                            } else {
                                fK = f3;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 32) != 0) {
                                i9 &= -458753;
                                xkbVarH = ss0.a.h(dVarF, 6);
                            }
                            if ((i3 & 64) != 0) {
                                jF = ss0.a.f(dVarF, 6);
                                i9 &= -3670017;
                            } else {
                                jF = j;
                            }
                            if ((i3 & 128) != 0) {
                                jG = bj1.g(jF, dVarF, (i9 >> 18) & 14);
                                i9 &= -29360129;
                            } else {
                                jG = j2;
                            }
                            if (i10 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f2;
                            }
                            if ((i3 & 512) != 0) {
                                j7 = ss0.a.j(dVarF, 6);
                                i9 &= -1879048193;
                            } else {
                                j7 = j3;
                            }
                            if (i12 != 0) {
                                function2A = fp1.a.a();
                            } else {
                                function2A = function2;
                            }
                            if ((i3 & 2048) != 0) {
                                function6 = a.a;
                                i18 &= -113;
                            } else {
                                function6 = function3;
                            }
                            i20 = i18;
                            if (i16 != 0) {
                                f6 = fK;
                                vx7Var3 = new vx7(false, false, 3, null);
                                f7 = fI;
                                function7 = function6;
                                j8 = jF;
                                z5 = z2;
                                bVar4 = bVar2;
                                xkbVar3 = xkbVarH;
                                function8 = function2A;
                                j9 = jG;
                                j10 = j7;
                                i18 = i20;
                            } else {
                                f6 = fK;
                                vx7Var3 = vx7Var;
                                f7 = fI;
                                function7 = function6;
                                j8 = jF;
                                z5 = z2;
                                bVar4 = bVar2;
                                xkbVar3 = xkbVarH;
                                function8 = function2A;
                                j9 = jG;
                                j10 = j7;
                            }
                        } else {
                            if (i27 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if ((i3 & 4) != 0) {
                                i9 &= -897;
                                sheetStateT = T(false, null, dVarF, 0, 3);
                            }
                            if (i5 != 0) {
                                fK = ss0.a.k();
                            } else {
                                fK = f3;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 32) != 0) {
                                i9 &= -458753;
                                xkbVarH = ss0.a.h(dVarF, 6);
                            }
                            if ((i3 & 64) != 0) {
                                jF = ss0.a.f(dVarF, 6);
                                i9 &= -3670017;
                            } else {
                                jF = j;
                            }
                            if ((i3 & 128) != 0) {
                                jG = bj1.g(jF, dVarF, (i9 >> 18) & 14);
                                i9 &= -29360129;
                            } else {
                                jG = j2;
                            }
                            if (i10 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f2;
                            }
                            if ((i3 & 512) != 0) {
                                j7 = ss0.a.j(dVarF, 6);
                                i9 &= -1879048193;
                            } else {
                                j7 = j3;
                            }
                            if (i12 != 0) {
                                function2A = fp1.a.a();
                            } else {
                                function2A = function2;
                            }
                            if ((i3 & 2048) != 0) {
                                function6 = a.a;
                                i18 &= -113;
                            } else {
                                function6 = function3;
                            }
                            i20 = i18;
                            if (i16 != 0) {
                                f6 = fK;
                                vx7Var3 = new vx7(false, false, 3, null);
                                f7 = fI;
                                function7 = function6;
                                j8 = jF;
                                z5 = z2;
                                bVar4 = bVar2;
                                xkbVar3 = xkbVarH;
                                function8 = function2A;
                                j9 = jG;
                                j10 = j7;
                                i18 = i20;
                            } else {
                                f6 = fK;
                                vx7Var3 = vx7Var;
                                f7 = fI;
                                function7 = function6;
                                j8 = jF;
                                z5 = z2;
                                bVar4 = bVar2;
                                xkbVar3 = xkbVarH;
                                function8 = function2A;
                                j9 = jG;
                                j10 = j7;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(1904798512, i9, i18, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
                        }
                        MotionSchemeKeyTokens motionSchemeKeyTokens5 = MotionSchemeKeyTokens.DefaultSpatial;
                        xa4VarB = d08.b(motionSchemeKeyTokens5, dVarF, 6);
                        xa4VarB2 = d08.b(motionSchemeKeyTokens5, dVarF, 6);
                        xa4VarB3 = d08.b(MotionSchemeKeyTokens.FastEffects, dVarF, 6);
                        i21 = (i9 & 896) ^ 384;
                        zT = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(xa4VarB2) | dVarF.T(xa4VarB3) | dVarF.T(xa4VarB);
                        objR = dVarF.R();
                        if (zT) {
                            objR = new Function0() { // from class: com.google.android.mx7
                                public final Object invoke() {
                                    return ModalBottomSheetKt.z(sheetStateT, xa4VarB2, xa4VarB3, xa4VarB);
                                }
                            };
                            dVarF.L(objR);
                        } else {
                            objR = new Function0() { // from class: com.google.android.mx7
                                public final Object invoke() {
                                    return ModalBottomSheetKt.z(sheetStateT, xa4VarB2, xa4VarB3, xa4VarB);
                                }
                            };
                            dVarF.L(objR);
                        }
                        vn3.i((Function0) objR, dVarF, 0);
                        objR2 = dVarF.R();
                        companion = androidx.compose.p004runtime.d.INSTANCE;
                        if (objR2 == companion.a()) {
                            objR2 = vn3.k(EmptyCoroutineContext.a, dVarF);
                            dVarF.L(objR2);
                        }
                        ta2Var = (ta2) objR2;
                        boolean zT14 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var);
                        i22 = i9 & 14;
                        if (i22 == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z7 = zT14 | z6;
                        objR3 = dVarF.R();
                        if (z7) {
                            objR3 = new Function0() { // from class: com.google.android.nx7
                                public final Object invoke() {
                                    return ModalBottomSheetKt.D(sheetStateT, ta2Var, function0);
                                }
                            };
                            dVarF.L(objR3);
                        } else {
                            objR3 = new Function0() { // from class: com.google.android.nx7
                                public final Object invoke() {
                                    return ModalBottomSheetKt.D(sheetStateT, ta2Var, function0);
                                }
                            };
                            dVarF.L(objR3);
                        }
                        Function0 function16 = (Function0) objR3;
                        boolean zT15 = dVarF.T(ta2Var) | ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256);
                        if (i22 == 4) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        z9 = zT15 | z8;
                        objR4 = dVarF.R();
                        if (z9) {
                            objR4 = new Function1() { // from class: com.google.android.ox7
                                public final Object invoke(Object obj) {
                                    return ModalBottomSheetKt.F(ta2Var, sheetStateT, function0, ((Float) obj).floatValue());
                                }
                            };
                            dVarF.L(objR4);
                        } else {
                            objR4 = new Function1() { // from class: com.google.android.ox7
                                public final Object invoke(Object obj) {
                                    return ModalBottomSheetKt.F(ta2Var, sheetStateT, function0, ((Float) obj).floatValue());
                                }
                            };
                            dVarF.L(objR4);
                        }
                        Function1 function17 = (Function1) objR4;
                        objR5 = dVarF.R();
                        if (objR5 == companion.a()) {
                            objR5 = aq.b(0.0f, 0.0f, 2, null);
                            dVarF.L(objR5);
                        }
                        animatable = (Animatable) objR5;
                        boolean zT16 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var) | dVarF.T(animatable);
                        if (i22 == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = z10 | zT16;
                        objR6 = dVarF.R();
                        if (z11) {
                            objR6 = new Function0() { // from class: com.google.android.px7
                                public final Object invoke() {
                                    return ModalBottomSheetKt.A(sheetStateT, ta2Var, animatable, function0);
                                }
                            };
                            dVarF.L(objR6);
                        } else {
                            objR6 = new Function0() { // from class: com.google.android.px7
                                public final Object invoke() {
                                    return ModalBottomSheetKt.A(sheetStateT, ta2Var, animatable, function0);
                                }
                            };
                            dVarF.L(objR6);
                        }
                        b1.e((Function0) objR6, j9, vx7Var3, animatable, ko1.e(1010026864, true, new b(j10, function16, sheetStateT, vx7Var3, animatable, ta2Var, function17, bVar4, f6, z5, xkbVar3, j8, j9, f7, function8, function7, ps4Var), dVarF, 54), dVarF, (i18 & 896) | ((i9 >> 18) & 112) | 24576 | (Animatable.m << 9));
                        dVar2 = dVarF;
                        if (sheetStateT.j()) {
                            dVar2.y(748459762);
                            if (i21 <= 256) {
                            }
                            objR7 = dVar2.R();
                            if (z12) {
                                objR7 = new C0192ModalBottomSheetKt$ModalBottomSheet$5$1(sheetStateT, null);
                                dVar2.L(objR7);
                            } else {
                                objR7 = new C0192ModalBottomSheetKt$ModalBottomSheet$5$1(sheetStateT, null);
                                dVar2.L(objR7);
                            }
                            vn3.g(sheetStateT, (Function2) objR7, dVar2, (i9 >> 6) & 14);
                            dVar2.u();
                        } else {
                            dVar2.y(748521266);
                            dVar2.u();
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        sheetState2 = sheetStateT;
                        j6 = j10;
                        vx7Var2 = vx7Var3;
                        bVar3 = bVar4;
                        f4 = f6;
                        z4 = z5;
                        xkbVar2 = xkbVar3;
                        j4 = j8;
                        j5 = j9;
                        f5 = f7;
                        function5 = function8;
                        function4 = function7;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        j4 = j;
                        function4 = function3;
                        vx7Var2 = vx7Var;
                        f4 = f3;
                        z4 = z2;
                        bVar3 = bVar2;
                        sheetState2 = sheetStateT;
                        xkbVar2 = xkbVarH;
                        j5 = j2;
                        f5 = f2;
                        j6 = j3;
                        function5 = function2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.qx7
                            public final Object invoke(Object obj, Object obj2) {
                                return ModalBottomSheetKt.C(function0, bVar3, sheetState2, f4, z4, xkbVar2, j4, j5, f5, j6, function5, function4, vx7Var2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i18 |= 3072;
                if ((i9 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (dVarF.g(z3, i9 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i27 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            i9 &= -897;
                            sheetStateT = T(false, null, dVarF, 0, 3);
                        }
                        if (i5 != 0) {
                            fK = ss0.a.k();
                        } else {
                            fK = f3;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            i9 &= -458753;
                            xkbVarH = ss0.a.h(dVarF, 6);
                        }
                        if ((i3 & 64) != 0) {
                            jF = ss0.a.f(dVarF, 6);
                            i9 &= -3670017;
                        } else {
                            jF = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(jF, dVarF, (i9 >> 18) & 14);
                            i9 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if (i10 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if ((i3 & 512) != 0) {
                            j7 = ss0.a.j(dVarF, 6);
                            i9 &= -1879048193;
                        } else {
                            j7 = j3;
                        }
                        if (i12 != 0) {
                            function2A = fp1.a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i3 & 2048) != 0) {
                            function6 = a.a;
                            i18 &= -113;
                        } else {
                            function6 = function3;
                        }
                        i20 = i18;
                        if (i16 != 0) {
                            f6 = fK;
                            vx7Var3 = new vx7(false, false, 3, null);
                            f7 = fI;
                            function7 = function6;
                            j8 = jF;
                            z5 = z2;
                            bVar4 = bVar2;
                            xkbVar3 = xkbVarH;
                            function8 = function2A;
                            j9 = jG;
                            j10 = j7;
                            i18 = i20;
                        } else {
                            f6 = fK;
                            vx7Var3 = vx7Var;
                            f7 = fI;
                            function7 = function6;
                            j8 = jF;
                            z5 = z2;
                            bVar4 = bVar2;
                            xkbVar3 = xkbVarH;
                            function8 = function2A;
                            j9 = jG;
                            j10 = j7;
                        }
                    } else {
                        if (i27 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            i9 &= -897;
                            sheetStateT = T(false, null, dVarF, 0, 3);
                        }
                        if (i5 != 0) {
                            fK = ss0.a.k();
                        } else {
                            fK = f3;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            i9 &= -458753;
                            xkbVarH = ss0.a.h(dVarF, 6);
                        }
                        if ((i3 & 64) != 0) {
                            jF = ss0.a.f(dVarF, 6);
                            i9 &= -3670017;
                        } else {
                            jF = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(jF, dVarF, (i9 >> 18) & 14);
                            i9 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if (i10 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if ((i3 & 512) != 0) {
                            j7 = ss0.a.j(dVarF, 6);
                            i9 &= -1879048193;
                        } else {
                            j7 = j3;
                        }
                        if (i12 != 0) {
                            function2A = fp1.a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i3 & 2048) != 0) {
                            function6 = a.a;
                            i18 &= -113;
                        } else {
                            function6 = function3;
                        }
                        i20 = i18;
                        if (i16 != 0) {
                            f6 = fK;
                            vx7Var3 = new vx7(false, false, 3, null);
                            f7 = fI;
                            function7 = function6;
                            j8 = jF;
                            z5 = z2;
                            bVar4 = bVar2;
                            xkbVar3 = xkbVarH;
                            function8 = function2A;
                            j9 = jG;
                            j10 = j7;
                            i18 = i20;
                        } else {
                            f6 = fK;
                            vx7Var3 = vx7Var;
                            f7 = fI;
                            function7 = function6;
                            j8 = jF;
                            z5 = z2;
                            bVar4 = bVar2;
                            xkbVar3 = xkbVarH;
                            function8 = function2A;
                            j9 = jG;
                            j10 = j7;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(1904798512, i9, i18, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
                    }
                    MotionSchemeKeyTokens motionSchemeKeyTokens6 = MotionSchemeKeyTokens.DefaultSpatial;
                    xa4VarB = d08.b(motionSchemeKeyTokens6, dVarF, 6);
                    xa4VarB2 = d08.b(motionSchemeKeyTokens6, dVarF, 6);
                    xa4VarB3 = d08.b(MotionSchemeKeyTokens.FastEffects, dVarF, 6);
                    i21 = (i9 & 896) ^ 384;
                    zT = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(xa4VarB2) | dVarF.T(xa4VarB3) | dVarF.T(xa4VarB);
                    objR = dVarF.R();
                    if (zT) {
                        objR = new Function0() { // from class: com.google.android.mx7
                            public final Object invoke() {
                                return ModalBottomSheetKt.z(sheetStateT, xa4VarB2, xa4VarB3, xa4VarB);
                            }
                        };
                        dVarF.L(objR);
                    } else {
                        objR = new Function0() { // from class: com.google.android.mx7
                            public final Object invoke() {
                                return ModalBottomSheetKt.z(sheetStateT, xa4VarB2, xa4VarB3, xa4VarB);
                            }
                        };
                        dVarF.L(objR);
                    }
                    vn3.i((Function0) objR, dVarF, 0);
                    objR2 = dVarF.R();
                    companion = androidx.compose.p004runtime.d.INSTANCE;
                    if (objR2 == companion.a()) {
                        objR2 = vn3.k(EmptyCoroutineContext.a, dVarF);
                        dVarF.L(objR2);
                    }
                    ta2Var = (ta2) objR2;
                    boolean zT17 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var);
                    i22 = i9 & 14;
                    if (i22 == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = zT17 | z6;
                    objR3 = dVarF.R();
                    if (z7) {
                        objR3 = new Function0() { // from class: com.google.android.nx7
                            public final Object invoke() {
                                return ModalBottomSheetKt.D(sheetStateT, ta2Var, function0);
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function0() { // from class: com.google.android.nx7
                            public final Object invoke() {
                                return ModalBottomSheetKt.D(sheetStateT, ta2Var, function0);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    Function0 function18 = (Function0) objR3;
                    boolean zT18 = dVarF.T(ta2Var) | ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256);
                    if (i22 == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = zT18 | z8;
                    objR4 = dVarF.R();
                    if (z9) {
                        objR4 = new Function1() { // from class: com.google.android.ox7
                            public final Object invoke(Object obj) {
                                return ModalBottomSheetKt.F(ta2Var, sheetStateT, function0, ((Float) obj).floatValue());
                            }
                        };
                        dVarF.L(objR4);
                    } else {
                        objR4 = new Function1() { // from class: com.google.android.ox7
                            public final Object invoke(Object obj) {
                                return ModalBottomSheetKt.F(ta2Var, sheetStateT, function0, ((Float) obj).floatValue());
                            }
                        };
                        dVarF.L(objR4);
                    }
                    Function1 function19 = (Function1) objR4;
                    objR5 = dVarF.R();
                    if (objR5 == companion.a()) {
                        objR5 = aq.b(0.0f, 0.0f, 2, null);
                        dVarF.L(objR5);
                    }
                    animatable = (Animatable) objR5;
                    boolean zT19 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var) | dVarF.T(animatable);
                    if (i22 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = z10 | zT19;
                    objR6 = dVarF.R();
                    if (z11) {
                        objR6 = new Function0() { // from class: com.google.android.px7
                            public final Object invoke() {
                                return ModalBottomSheetKt.A(sheetStateT, ta2Var, animatable, function0);
                            }
                        };
                        dVarF.L(objR6);
                    } else {
                        objR6 = new Function0() { // from class: com.google.android.px7
                            public final Object invoke() {
                                return ModalBottomSheetKt.A(sheetStateT, ta2Var, animatable, function0);
                            }
                        };
                        dVarF.L(objR6);
                    }
                    b1.e((Function0) objR6, j9, vx7Var3, animatable, ko1.e(1010026864, true, new b(j10, function18, sheetStateT, vx7Var3, animatable, ta2Var, function19, bVar4, f6, z5, xkbVar3, j8, j9, f7, function8, function7, ps4Var), dVarF, 54), dVarF, (i18 & 896) | ((i9 >> 18) & 112) | 24576 | (Animatable.m << 9));
                    dVar2 = dVarF;
                    if (sheetStateT.j()) {
                        dVar2.y(748459762);
                        if (i21 <= 256) {
                        }
                        objR7 = dVar2.R();
                        if (z12) {
                            objR7 = new C0192ModalBottomSheetKt$ModalBottomSheet$5$1(sheetStateT, null);
                            dVar2.L(objR7);
                        } else {
                            objR7 = new C0192ModalBottomSheetKt$ModalBottomSheet$5$1(sheetStateT, null);
                            dVar2.L(objR7);
                        }
                        vn3.g(sheetStateT, (Function2) objR7, dVar2, (i9 >> 6) & 14);
                        dVar2.u();
                    } else {
                        dVar2.y(748521266);
                        dVar2.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    sheetState2 = sheetStateT;
                    j6 = j10;
                    vx7Var2 = vx7Var3;
                    bVar3 = bVar4;
                    f4 = f6;
                    z4 = z5;
                    xkbVar2 = xkbVar3;
                    j4 = j8;
                    j5 = j9;
                    f5 = f7;
                    function5 = function8;
                    function4 = function7;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    j4 = j;
                    function4 = function3;
                    vx7Var2 = vx7Var;
                    f4 = f3;
                    z4 = z2;
                    bVar3 = bVar2;
                    sheetState2 = sheetStateT;
                    xkbVar2 = xkbVarH;
                    j5 = j2;
                    f5 = f2;
                    j6 = j3;
                    function5 = function2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.qx7
                        public final Object invoke(Object obj, Object obj2) {
                            return ModalBottomSheetKt.C(function0, bVar3, sheetState2, f4, z4, xkbVar2, j4, j5, f5, j6, function5, function4, vx7Var2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 24576;
            z2 = z;
            if ((i & 196608) == 0) {
                xkbVarH = xkbVar;
                if ((i3 & 32) == 0) {
                    i26 = 65536;
                } else {
                    i26 = 65536;
                }
                i4 |= i26;
            } else {
                xkbVarH = xkbVar;
            }
            if ((i & 1572864) != 0) {
                if ((i3 & 64) == 0) {
                    i25 = 524288;
                } else {
                    i25 = 524288;
                }
                i4 |= i25;
            }
            if ((i & 12582912) == 0) {
                int i212 = i4;
                if ((i3 & 128) == 0) {
                    i24 = 4194304;
                } else {
                    i24 = 4194304;
                }
                i9 = i212 | i24;
            } else {
                i9 = i4;
            }
            i10 = i3 & 256;
            if (i10 != 0) {
                i9 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (dVarF.B(f2)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i9 |= i11;
            }
            if ((i & 805306368) != 0) {
                if ((i3 & 512) == 0) {
                    i23 = 268435456;
                } else {
                    i23 = 268435456;
                }
                i9 |= i23;
            }
            i12 = i3 & 1024;
            if (i12 != 0) {
                i13 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (dVarF.T(function2)) {
                    i14 = 4;
                } else {
                    i14 = 2;
                }
                i13 = i2 | i14;
            } else {
                i13 = i2;
            }
            if ((i2 & 48) != 0) {
                i13 |= ((i3 & 2048) == 0 || !dVarF.T(function3)) ? 16 : 32;
            }
            i15 = i13;
            i16 = i3 & 4096;
            if (i16 != 0) {
                i18 = i15 | 384;
            } else {
                i17 = i15;
                if ((i2 & 384) != 0) {
                    if (dVarF.x(vx7Var)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                i18 = i17;
            }
            if ((i3 & 8192) != 0) {
                if ((i2 & 3072) == 0) {
                    i18 |= dVarF.T(ps4Var) ? 2048 : 1024;
                }
                if ((i9 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (dVarF.g(z3, i9 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i27 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            i9 &= -897;
                            sheetStateT = T(false, null, dVarF, 0, 3);
                        }
                        if (i5 != 0) {
                            fK = ss0.a.k();
                        } else {
                            fK = f3;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            i9 &= -458753;
                            xkbVarH = ss0.a.h(dVarF, 6);
                        }
                        if ((i3 & 64) != 0) {
                            jF = ss0.a.f(dVarF, 6);
                            i9 &= -3670017;
                        } else {
                            jF = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(jF, dVarF, (i9 >> 18) & 14);
                            i9 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if (i10 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if ((i3 & 512) != 0) {
                            j7 = ss0.a.j(dVarF, 6);
                            i9 &= -1879048193;
                        } else {
                            j7 = j3;
                        }
                        if (i12 != 0) {
                            function2A = fp1.a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i3 & 2048) != 0) {
                            function6 = a.a;
                            i18 &= -113;
                        } else {
                            function6 = function3;
                        }
                        i20 = i18;
                        if (i16 != 0) {
                            f6 = fK;
                            vx7Var3 = new vx7(false, false, 3, null);
                            f7 = fI;
                            function7 = function6;
                            j8 = jF;
                            z5 = z2;
                            bVar4 = bVar2;
                            xkbVar3 = xkbVarH;
                            function8 = function2A;
                            j9 = jG;
                            j10 = j7;
                            i18 = i20;
                        } else {
                            f6 = fK;
                            vx7Var3 = vx7Var;
                            f7 = fI;
                            function7 = function6;
                            j8 = jF;
                            z5 = z2;
                            bVar4 = bVar2;
                            xkbVar3 = xkbVarH;
                            function8 = function2A;
                            j9 = jG;
                            j10 = j7;
                        }
                    } else {
                        if (i27 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            i9 &= -897;
                            sheetStateT = T(false, null, dVarF, 0, 3);
                        }
                        if (i5 != 0) {
                            fK = ss0.a.k();
                        } else {
                            fK = f3;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            i9 &= -458753;
                            xkbVarH = ss0.a.h(dVarF, 6);
                        }
                        if ((i3 & 64) != 0) {
                            jF = ss0.a.f(dVarF, 6);
                            i9 &= -3670017;
                        } else {
                            jF = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(jF, dVarF, (i9 >> 18) & 14);
                            i9 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if (i10 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if ((i3 & 512) != 0) {
                            j7 = ss0.a.j(dVarF, 6);
                            i9 &= -1879048193;
                        } else {
                            j7 = j3;
                        }
                        if (i12 != 0) {
                            function2A = fp1.a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i3 & 2048) != 0) {
                            function6 = a.a;
                            i18 &= -113;
                        } else {
                            function6 = function3;
                        }
                        i20 = i18;
                        if (i16 != 0) {
                            f6 = fK;
                            vx7Var3 = new vx7(false, false, 3, null);
                            f7 = fI;
                            function7 = function6;
                            j8 = jF;
                            z5 = z2;
                            bVar4 = bVar2;
                            xkbVar3 = xkbVarH;
                            function8 = function2A;
                            j9 = jG;
                            j10 = j7;
                            i18 = i20;
                        } else {
                            f6 = fK;
                            vx7Var3 = vx7Var;
                            f7 = fI;
                            function7 = function6;
                            j8 = jF;
                            z5 = z2;
                            bVar4 = bVar2;
                            xkbVar3 = xkbVarH;
                            function8 = function2A;
                            j9 = jG;
                            j10 = j7;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(1904798512, i9, i18, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
                    }
                    MotionSchemeKeyTokens motionSchemeKeyTokens7 = MotionSchemeKeyTokens.DefaultSpatial;
                    xa4VarB = d08.b(motionSchemeKeyTokens7, dVarF, 6);
                    xa4VarB2 = d08.b(motionSchemeKeyTokens7, dVarF, 6);
                    xa4VarB3 = d08.b(MotionSchemeKeyTokens.FastEffects, dVarF, 6);
                    i21 = (i9 & 896) ^ 384;
                    zT = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(xa4VarB2) | dVarF.T(xa4VarB3) | dVarF.T(xa4VarB);
                    objR = dVarF.R();
                    if (zT) {
                        objR = new Function0() { // from class: com.google.android.mx7
                            public final Object invoke() {
                                return ModalBottomSheetKt.z(sheetStateT, xa4VarB2, xa4VarB3, xa4VarB);
                            }
                        };
                        dVarF.L(objR);
                    } else {
                        objR = new Function0() { // from class: com.google.android.mx7
                            public final Object invoke() {
                                return ModalBottomSheetKt.z(sheetStateT, xa4VarB2, xa4VarB3, xa4VarB);
                            }
                        };
                        dVarF.L(objR);
                    }
                    vn3.i((Function0) objR, dVarF, 0);
                    objR2 = dVarF.R();
                    companion = androidx.compose.p004runtime.d.INSTANCE;
                    if (objR2 == companion.a()) {
                        objR2 = vn3.k(EmptyCoroutineContext.a, dVarF);
                        dVarF.L(objR2);
                    }
                    ta2Var = (ta2) objR2;
                    boolean zT110 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var);
                    i22 = i9 & 14;
                    if (i22 == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = zT110 | z6;
                    objR3 = dVarF.R();
                    if (z7) {
                        objR3 = new Function0() { // from class: com.google.android.nx7
                            public final Object invoke() {
                                return ModalBottomSheetKt.D(sheetStateT, ta2Var, function0);
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function0() { // from class: com.google.android.nx7
                            public final Object invoke() {
                                return ModalBottomSheetKt.D(sheetStateT, ta2Var, function0);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    Function0 function110 = (Function0) objR3;
                    boolean zT111 = dVarF.T(ta2Var) | ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256);
                    if (i22 == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = zT111 | z8;
                    objR4 = dVarF.R();
                    if (z9) {
                        objR4 = new Function1() { // from class: com.google.android.ox7
                            public final Object invoke(Object obj) {
                                return ModalBottomSheetKt.F(ta2Var, sheetStateT, function0, ((Float) obj).floatValue());
                            }
                        };
                        dVarF.L(objR4);
                    } else {
                        objR4 = new Function1() { // from class: com.google.android.ox7
                            public final Object invoke(Object obj) {
                                return ModalBottomSheetKt.F(ta2Var, sheetStateT, function0, ((Float) obj).floatValue());
                            }
                        };
                        dVarF.L(objR4);
                    }
                    Function1 function111 = (Function1) objR4;
                    objR5 = dVarF.R();
                    if (objR5 == companion.a()) {
                        objR5 = aq.b(0.0f, 0.0f, 2, null);
                        dVarF.L(objR5);
                    }
                    animatable = (Animatable) objR5;
                    boolean zT112 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var) | dVarF.T(animatable);
                    if (i22 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = z10 | zT112;
                    objR6 = dVarF.R();
                    if (z11) {
                        objR6 = new Function0() { // from class: com.google.android.px7
                            public final Object invoke() {
                                return ModalBottomSheetKt.A(sheetStateT, ta2Var, animatable, function0);
                            }
                        };
                        dVarF.L(objR6);
                    } else {
                        objR6 = new Function0() { // from class: com.google.android.px7
                            public final Object invoke() {
                                return ModalBottomSheetKt.A(sheetStateT, ta2Var, animatable, function0);
                            }
                        };
                        dVarF.L(objR6);
                    }
                    b1.e((Function0) objR6, j9, vx7Var3, animatable, ko1.e(1010026864, true, new b(j10, function110, sheetStateT, vx7Var3, animatable, ta2Var, function111, bVar4, f6, z5, xkbVar3, j8, j9, f7, function8, function7, ps4Var), dVarF, 54), dVarF, (i18 & 896) | ((i9 >> 18) & 112) | 24576 | (Animatable.m << 9));
                    dVar2 = dVarF;
                    if (sheetStateT.j()) {
                        dVar2.y(748459762);
                        if (i21 <= 256) {
                        }
                        objR7 = dVar2.R();
                        if (z12) {
                            objR7 = new C0192ModalBottomSheetKt$ModalBottomSheet$5$1(sheetStateT, null);
                            dVar2.L(objR7);
                        } else {
                            objR7 = new C0192ModalBottomSheetKt$ModalBottomSheet$5$1(sheetStateT, null);
                            dVar2.L(objR7);
                        }
                        vn3.g(sheetStateT, (Function2) objR7, dVar2, (i9 >> 6) & 14);
                        dVar2.u();
                    } else {
                        dVar2.y(748521266);
                        dVar2.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    sheetState2 = sheetStateT;
                    j6 = j10;
                    vx7Var2 = vx7Var3;
                    bVar3 = bVar4;
                    f4 = f6;
                    z4 = z5;
                    xkbVar2 = xkbVar3;
                    j4 = j8;
                    j5 = j9;
                    f5 = f7;
                    function5 = function8;
                    function4 = function7;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    j4 = j;
                    function4 = function3;
                    vx7Var2 = vx7Var;
                    f4 = f3;
                    z4 = z2;
                    bVar3 = bVar2;
                    sheetState2 = sheetStateT;
                    xkbVar2 = xkbVarH;
                    j5 = j2;
                    f5 = f2;
                    j6 = j3;
                    function5 = function2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.qx7
                        public final Object invoke(Object obj, Object obj2) {
                            return ModalBottomSheetKt.C(function0, bVar3, sheetState2, f4, z4, xkbVar2, j4, j5, f5, j6, function5, function4, vx7Var2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 3072;
            if ((i9 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (dVarF.g(z3, i9 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i27 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        i9 &= -897;
                        sheetStateT = T(false, null, dVarF, 0, 3);
                    }
                    if (i5 != 0) {
                        fK = ss0.a.k();
                    } else {
                        fK = f3;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 32) != 0) {
                        i9 &= -458753;
                        xkbVarH = ss0.a.h(dVarF, 6);
                    }
                    if ((i3 & 64) != 0) {
                        jF = ss0.a.f(dVarF, 6);
                        i9 &= -3670017;
                    } else {
                        jF = j;
                    }
                    if ((i3 & 128) != 0) {
                        jG = bj1.g(jF, dVarF, (i9 >> 18) & 14);
                        i9 &= -29360129;
                    } else {
                        jG = j2;
                    }
                    if (i10 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f2;
                    }
                    if ((i3 & 512) != 0) {
                        j7 = ss0.a.j(dVarF, 6);
                        i9 &= -1879048193;
                    } else {
                        j7 = j3;
                    }
                    if (i12 != 0) {
                        function2A = fp1.a.a();
                    } else {
                        function2A = function2;
                    }
                    if ((i3 & 2048) != 0) {
                        function6 = a.a;
                        i18 &= -113;
                    } else {
                        function6 = function3;
                    }
                    i20 = i18;
                    if (i16 != 0) {
                        f6 = fK;
                        vx7Var3 = new vx7(false, false, 3, null);
                        f7 = fI;
                        function7 = function6;
                        j8 = jF;
                        z5 = z2;
                        bVar4 = bVar2;
                        xkbVar3 = xkbVarH;
                        function8 = function2A;
                        j9 = jG;
                        j10 = j7;
                        i18 = i20;
                    } else {
                        f6 = fK;
                        vx7Var3 = vx7Var;
                        f7 = fI;
                        function7 = function6;
                        j8 = jF;
                        z5 = z2;
                        bVar4 = bVar2;
                        xkbVar3 = xkbVarH;
                        function8 = function2A;
                        j9 = jG;
                        j10 = j7;
                    }
                } else {
                    if (i27 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        i9 &= -897;
                        sheetStateT = T(false, null, dVarF, 0, 3);
                    }
                    if (i5 != 0) {
                        fK = ss0.a.k();
                    } else {
                        fK = f3;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 32) != 0) {
                        i9 &= -458753;
                        xkbVarH = ss0.a.h(dVarF, 6);
                    }
                    if ((i3 & 64) != 0) {
                        jF = ss0.a.f(dVarF, 6);
                        i9 &= -3670017;
                    } else {
                        jF = j;
                    }
                    if ((i3 & 128) != 0) {
                        jG = bj1.g(jF, dVarF, (i9 >> 18) & 14);
                        i9 &= -29360129;
                    } else {
                        jG = j2;
                    }
                    if (i10 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f2;
                    }
                    if ((i3 & 512) != 0) {
                        j7 = ss0.a.j(dVarF, 6);
                        i9 &= -1879048193;
                    } else {
                        j7 = j3;
                    }
                    if (i12 != 0) {
                        function2A = fp1.a.a();
                    } else {
                        function2A = function2;
                    }
                    if ((i3 & 2048) != 0) {
                        function6 = a.a;
                        i18 &= -113;
                    } else {
                        function6 = function3;
                    }
                    i20 = i18;
                    if (i16 != 0) {
                        f6 = fK;
                        vx7Var3 = new vx7(false, false, 3, null);
                        f7 = fI;
                        function7 = function6;
                        j8 = jF;
                        z5 = z2;
                        bVar4 = bVar2;
                        xkbVar3 = xkbVarH;
                        function8 = function2A;
                        j9 = jG;
                        j10 = j7;
                        i18 = i20;
                    } else {
                        f6 = fK;
                        vx7Var3 = vx7Var;
                        f7 = fI;
                        function7 = function6;
                        j8 = jF;
                        z5 = z2;
                        bVar4 = bVar2;
                        xkbVar3 = xkbVarH;
                        function8 = function2A;
                        j9 = jG;
                        j10 = j7;
                    }
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(1904798512, i9, i18, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
                }
                MotionSchemeKeyTokens motionSchemeKeyTokens8 = MotionSchemeKeyTokens.DefaultSpatial;
                xa4VarB = d08.b(motionSchemeKeyTokens8, dVarF, 6);
                xa4VarB2 = d08.b(motionSchemeKeyTokens8, dVarF, 6);
                xa4VarB3 = d08.b(MotionSchemeKeyTokens.FastEffects, dVarF, 6);
                i21 = (i9 & 896) ^ 384;
                zT = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(xa4VarB2) | dVarF.T(xa4VarB3) | dVarF.T(xa4VarB);
                objR = dVarF.R();
                if (zT) {
                    objR = new Function0() { // from class: com.google.android.mx7
                        public final Object invoke() {
                            return ModalBottomSheetKt.z(sheetStateT, xa4VarB2, xa4VarB3, xa4VarB);
                        }
                    };
                    dVarF.L(objR);
                } else {
                    objR = new Function0() { // from class: com.google.android.mx7
                        public final Object invoke() {
                            return ModalBottomSheetKt.z(sheetStateT, xa4VarB2, xa4VarB3, xa4VarB);
                        }
                    };
                    dVarF.L(objR);
                }
                vn3.i((Function0) objR, dVarF, 0);
                objR2 = dVarF.R();
                companion = androidx.compose.p004runtime.d.INSTANCE;
                if (objR2 == companion.a()) {
                    objR2 = vn3.k(EmptyCoroutineContext.a, dVarF);
                    dVarF.L(objR2);
                }
                ta2Var = (ta2) objR2;
                boolean zT113 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var);
                i22 = i9 & 14;
                if (i22 == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = zT113 | z6;
                objR3 = dVarF.R();
                if (z7) {
                    objR3 = new Function0() { // from class: com.google.android.nx7
                        public final Object invoke() {
                            return ModalBottomSheetKt.D(sheetStateT, ta2Var, function0);
                        }
                    };
                    dVarF.L(objR3);
                } else {
                    objR3 = new Function0() { // from class: com.google.android.nx7
                        public final Object invoke() {
                            return ModalBottomSheetKt.D(sheetStateT, ta2Var, function0);
                        }
                    };
                    dVarF.L(objR3);
                }
                Function0 function112 = (Function0) objR3;
                boolean zT114 = dVarF.T(ta2Var) | ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256);
                if (i22 == 4) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = zT114 | z8;
                objR4 = dVarF.R();
                if (z9) {
                    objR4 = new Function1() { // from class: com.google.android.ox7
                        public final Object invoke(Object obj) {
                            return ModalBottomSheetKt.F(ta2Var, sheetStateT, function0, ((Float) obj).floatValue());
                        }
                    };
                    dVarF.L(objR4);
                } else {
                    objR4 = new Function1() { // from class: com.google.android.ox7
                        public final Object invoke(Object obj) {
                            return ModalBottomSheetKt.F(ta2Var, sheetStateT, function0, ((Float) obj).floatValue());
                        }
                    };
                    dVarF.L(objR4);
                }
                Function1 function113 = (Function1) objR4;
                objR5 = dVarF.R();
                if (objR5 == companion.a()) {
                    objR5 = aq.b(0.0f, 0.0f, 2, null);
                    dVarF.L(objR5);
                }
                animatable = (Animatable) objR5;
                boolean zT115 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var) | dVarF.T(animatable);
                if (i22 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = z10 | zT115;
                objR6 = dVarF.R();
                if (z11) {
                    objR6 = new Function0() { // from class: com.google.android.px7
                        public final Object invoke() {
                            return ModalBottomSheetKt.A(sheetStateT, ta2Var, animatable, function0);
                        }
                    };
                    dVarF.L(objR6);
                } else {
                    objR6 = new Function0() { // from class: com.google.android.px7
                        public final Object invoke() {
                            return ModalBottomSheetKt.A(sheetStateT, ta2Var, animatable, function0);
                        }
                    };
                    dVarF.L(objR6);
                }
                b1.e((Function0) objR6, j9, vx7Var3, animatable, ko1.e(1010026864, true, new b(j10, function112, sheetStateT, vx7Var3, animatable, ta2Var, function113, bVar4, f6, z5, xkbVar3, j8, j9, f7, function8, function7, ps4Var), dVarF, 54), dVarF, (i18 & 896) | ((i9 >> 18) & 112) | 24576 | (Animatable.m << 9));
                dVar2 = dVarF;
                if (sheetStateT.j()) {
                    dVar2.y(748459762);
                    if (i21 <= 256) {
                    }
                    objR7 = dVar2.R();
                    if (z12) {
                        objR7 = new C0192ModalBottomSheetKt$ModalBottomSheet$5$1(sheetStateT, null);
                        dVar2.L(objR7);
                    } else {
                        objR7 = new C0192ModalBottomSheetKt$ModalBottomSheet$5$1(sheetStateT, null);
                        dVar2.L(objR7);
                    }
                    vn3.g(sheetStateT, (Function2) objR7, dVar2, (i9 >> 6) & 14);
                    dVar2.u();
                } else {
                    dVar2.y(748521266);
                    dVar2.u();
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                sheetState2 = sheetStateT;
                j6 = j10;
                vx7Var2 = vx7Var3;
                bVar3 = bVar4;
                f4 = f6;
                z4 = z5;
                xkbVar2 = xkbVar3;
                j4 = j8;
                j5 = j9;
                f5 = f7;
                function5 = function8;
                function4 = function7;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                j4 = j;
                function4 = function3;
                vx7Var2 = vx7Var;
                f4 = f3;
                z4 = z2;
                bVar3 = bVar2;
                sheetState2 = sheetStateT;
                xkbVar2 = xkbVarH;
                j5 = j2;
                f5 = f2;
                j6 = j3;
                function5 = function2;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.qx7
                    public final Object invoke(Object obj, Object obj2) {
                        return ModalBottomSheetKt.C(function0, bVar3, sheetState2, f4, z4, xkbVar2, j4, j5, f5, j6, function5, function4, vx7Var2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 48;
        bVar2 = bVar;
        if ((i & 384) == 0) {
            if ((i3 & 4) == 0) {
                sheetStateT = sheetState;
                if (dVarF.x(sheetStateT)) {
                }
                i4 |= i28;
            } else {
                sheetStateT = sheetState;
            }
            i4 |= i28;
        } else {
            sheetStateT = sheetState;
        }
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i & 3072) == 0) {
                f3 = f;
                if (dVarF.B(f3)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i & 24576) == 0) {
                    z2 = z;
                    if (dVarF.A(z2)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((i & 196608) == 0) {
                    xkbVarH = xkbVar;
                    if ((i3 & 32) == 0) {
                        i26 = 65536;
                    } else {
                        i26 = 65536;
                    }
                    i4 |= i26;
                } else {
                    xkbVarH = xkbVar;
                }
                if ((i & 1572864) != 0) {
                    if ((i3 & 64) == 0) {
                        i25 = 524288;
                    } else {
                        i25 = 524288;
                    }
                    i4 |= i25;
                }
                if ((i & 12582912) == 0) {
                    int i213 = i4;
                    if ((i3 & 128) == 0) {
                        i24 = 4194304;
                    } else {
                        i24 = 4194304;
                    }
                    i9 = i213 | i24;
                } else {
                    i9 = i4;
                }
                i10 = i3 & 256;
                if (i10 != 0) {
                    i9 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (dVarF.B(f2)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i9 |= i11;
                }
                if ((i & 805306368) != 0) {
                    if ((i3 & 512) == 0) {
                        i23 = 268435456;
                    } else {
                        i23 = 268435456;
                    }
                    i9 |= i23;
                }
                i12 = i3 & 1024;
                if (i12 != 0) {
                    i13 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (dVarF.T(function2)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i13 = i2 | i14;
                } else {
                    i13 = i2;
                }
                if ((i2 & 48) != 0) {
                    i13 |= ((i3 & 2048) == 0 || !dVarF.T(function3)) ? 16 : 32;
                }
                i15 = i13;
                i16 = i3 & 4096;
                if (i16 != 0) {
                    i18 = i15 | 384;
                } else {
                    i17 = i15;
                    if ((i2 & 384) != 0) {
                        if (dVarF.x(vx7Var)) {
                            i19 = 256;
                        } else {
                            i19 = 128;
                        }
                        i17 |= i19;
                    }
                    i18 = i17;
                }
                if ((i3 & 8192) != 0) {
                    if ((i2 & 3072) == 0) {
                        i18 |= dVarF.T(ps4Var) ? 2048 : 1024;
                    }
                    if ((i9 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (dVarF.g(z3, i9 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i27 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if ((i3 & 4) != 0) {
                                i9 &= -897;
                                sheetStateT = T(false, null, dVarF, 0, 3);
                            }
                            if (i5 != 0) {
                                fK = ss0.a.k();
                            } else {
                                fK = f3;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 32) != 0) {
                                i9 &= -458753;
                                xkbVarH = ss0.a.h(dVarF, 6);
                            }
                            if ((i3 & 64) != 0) {
                                jF = ss0.a.f(dVarF, 6);
                                i9 &= -3670017;
                            } else {
                                jF = j;
                            }
                            if ((i3 & 128) != 0) {
                                jG = bj1.g(jF, dVarF, (i9 >> 18) & 14);
                                i9 &= -29360129;
                            } else {
                                jG = j2;
                            }
                            if (i10 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f2;
                            }
                            if ((i3 & 512) != 0) {
                                j7 = ss0.a.j(dVarF, 6);
                                i9 &= -1879048193;
                            } else {
                                j7 = j3;
                            }
                            if (i12 != 0) {
                                function2A = fp1.a.a();
                            } else {
                                function2A = function2;
                            }
                            if ((i3 & 2048) != 0) {
                                function6 = a.a;
                                i18 &= -113;
                            } else {
                                function6 = function3;
                            }
                            i20 = i18;
                            if (i16 != 0) {
                                f6 = fK;
                                vx7Var3 = new vx7(false, false, 3, null);
                                f7 = fI;
                                function7 = function6;
                                j8 = jF;
                                z5 = z2;
                                bVar4 = bVar2;
                                xkbVar3 = xkbVarH;
                                function8 = function2A;
                                j9 = jG;
                                j10 = j7;
                                i18 = i20;
                            } else {
                                f6 = fK;
                                vx7Var3 = vx7Var;
                                f7 = fI;
                                function7 = function6;
                                j8 = jF;
                                z5 = z2;
                                bVar4 = bVar2;
                                xkbVar3 = xkbVarH;
                                function8 = function2A;
                                j9 = jG;
                                j10 = j7;
                            }
                        } else {
                            if (i27 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if ((i3 & 4) != 0) {
                                i9 &= -897;
                                sheetStateT = T(false, null, dVarF, 0, 3);
                            }
                            if (i5 != 0) {
                                fK = ss0.a.k();
                            } else {
                                fK = f3;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 32) != 0) {
                                i9 &= -458753;
                                xkbVarH = ss0.a.h(dVarF, 6);
                            }
                            if ((i3 & 64) != 0) {
                                jF = ss0.a.f(dVarF, 6);
                                i9 &= -3670017;
                            } else {
                                jF = j;
                            }
                            if ((i3 & 128) != 0) {
                                jG = bj1.g(jF, dVarF, (i9 >> 18) & 14);
                                i9 &= -29360129;
                            } else {
                                jG = j2;
                            }
                            if (i10 != 0) {
                                fI = ff3.i(0);
                            } else {
                                fI = f2;
                            }
                            if ((i3 & 512) != 0) {
                                j7 = ss0.a.j(dVarF, 6);
                                i9 &= -1879048193;
                            } else {
                                j7 = j3;
                            }
                            if (i12 != 0) {
                                function2A = fp1.a.a();
                            } else {
                                function2A = function2;
                            }
                            if ((i3 & 2048) != 0) {
                                function6 = a.a;
                                i18 &= -113;
                            } else {
                                function6 = function3;
                            }
                            i20 = i18;
                            if (i16 != 0) {
                                f6 = fK;
                                vx7Var3 = new vx7(false, false, 3, null);
                                f7 = fI;
                                function7 = function6;
                                j8 = jF;
                                z5 = z2;
                                bVar4 = bVar2;
                                xkbVar3 = xkbVarH;
                                function8 = function2A;
                                j9 = jG;
                                j10 = j7;
                                i18 = i20;
                            } else {
                                f6 = fK;
                                vx7Var3 = vx7Var;
                                f7 = fI;
                                function7 = function6;
                                j8 = jF;
                                z5 = z2;
                                bVar4 = bVar2;
                                xkbVar3 = xkbVarH;
                                function8 = function2A;
                                j9 = jG;
                                j10 = j7;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(1904798512, i9, i18, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
                        }
                        MotionSchemeKeyTokens motionSchemeKeyTokens9 = MotionSchemeKeyTokens.DefaultSpatial;
                        xa4VarB = d08.b(motionSchemeKeyTokens9, dVarF, 6);
                        xa4VarB2 = d08.b(motionSchemeKeyTokens9, dVarF, 6);
                        xa4VarB3 = d08.b(MotionSchemeKeyTokens.FastEffects, dVarF, 6);
                        i21 = (i9 & 896) ^ 384;
                        zT = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(xa4VarB2) | dVarF.T(xa4VarB3) | dVarF.T(xa4VarB);
                        objR = dVarF.R();
                        if (zT) {
                            objR = new Function0() { // from class: com.google.android.mx7
                                public final Object invoke() {
                                    return ModalBottomSheetKt.z(sheetStateT, xa4VarB2, xa4VarB3, xa4VarB);
                                }
                            };
                            dVarF.L(objR);
                        } else {
                            objR = new Function0() { // from class: com.google.android.mx7
                                public final Object invoke() {
                                    return ModalBottomSheetKt.z(sheetStateT, xa4VarB2, xa4VarB3, xa4VarB);
                                }
                            };
                            dVarF.L(objR);
                        }
                        vn3.i((Function0) objR, dVarF, 0);
                        objR2 = dVarF.R();
                        companion = androidx.compose.p004runtime.d.INSTANCE;
                        if (objR2 == companion.a()) {
                            objR2 = vn3.k(EmptyCoroutineContext.a, dVarF);
                            dVarF.L(objR2);
                        }
                        ta2Var = (ta2) objR2;
                        boolean zT116 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var);
                        i22 = i9 & 14;
                        if (i22 == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z7 = zT116 | z6;
                        objR3 = dVarF.R();
                        if (z7) {
                            objR3 = new Function0() { // from class: com.google.android.nx7
                                public final Object invoke() {
                                    return ModalBottomSheetKt.D(sheetStateT, ta2Var, function0);
                                }
                            };
                            dVarF.L(objR3);
                        } else {
                            objR3 = new Function0() { // from class: com.google.android.nx7
                                public final Object invoke() {
                                    return ModalBottomSheetKt.D(sheetStateT, ta2Var, function0);
                                }
                            };
                            dVarF.L(objR3);
                        }
                        Function0 function114 = (Function0) objR3;
                        boolean zT117 = dVarF.T(ta2Var) | ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256);
                        if (i22 == 4) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        z9 = zT117 | z8;
                        objR4 = dVarF.R();
                        if (z9) {
                            objR4 = new Function1() { // from class: com.google.android.ox7
                                public final Object invoke(Object obj) {
                                    return ModalBottomSheetKt.F(ta2Var, sheetStateT, function0, ((Float) obj).floatValue());
                                }
                            };
                            dVarF.L(objR4);
                        } else {
                            objR4 = new Function1() { // from class: com.google.android.ox7
                                public final Object invoke(Object obj) {
                                    return ModalBottomSheetKt.F(ta2Var, sheetStateT, function0, ((Float) obj).floatValue());
                                }
                            };
                            dVarF.L(objR4);
                        }
                        Function1 function115 = (Function1) objR4;
                        objR5 = dVarF.R();
                        if (objR5 == companion.a()) {
                            objR5 = aq.b(0.0f, 0.0f, 2, null);
                            dVarF.L(objR5);
                        }
                        animatable = (Animatable) objR5;
                        boolean zT118 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var) | dVarF.T(animatable);
                        if (i22 == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = z10 | zT118;
                        objR6 = dVarF.R();
                        if (z11) {
                            objR6 = new Function0() { // from class: com.google.android.px7
                                public final Object invoke() {
                                    return ModalBottomSheetKt.A(sheetStateT, ta2Var, animatable, function0);
                                }
                            };
                            dVarF.L(objR6);
                        } else {
                            objR6 = new Function0() { // from class: com.google.android.px7
                                public final Object invoke() {
                                    return ModalBottomSheetKt.A(sheetStateT, ta2Var, animatable, function0);
                                }
                            };
                            dVarF.L(objR6);
                        }
                        b1.e((Function0) objR6, j9, vx7Var3, animatable, ko1.e(1010026864, true, new b(j10, function114, sheetStateT, vx7Var3, animatable, ta2Var, function115, bVar4, f6, z5, xkbVar3, j8, j9, f7, function8, function7, ps4Var), dVarF, 54), dVarF, (i18 & 896) | ((i9 >> 18) & 112) | 24576 | (Animatable.m << 9));
                        dVar2 = dVarF;
                        if (sheetStateT.j()) {
                            dVar2.y(748459762);
                            if (i21 <= 256) {
                            }
                            objR7 = dVar2.R();
                            if (z12) {
                                objR7 = new C0192ModalBottomSheetKt$ModalBottomSheet$5$1(sheetStateT, null);
                                dVar2.L(objR7);
                            } else {
                                objR7 = new C0192ModalBottomSheetKt$ModalBottomSheet$5$1(sheetStateT, null);
                                dVar2.L(objR7);
                            }
                            vn3.g(sheetStateT, (Function2) objR7, dVar2, (i9 >> 6) & 14);
                            dVar2.u();
                        } else {
                            dVar2.y(748521266);
                            dVar2.u();
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        sheetState2 = sheetStateT;
                        j6 = j10;
                        vx7Var2 = vx7Var3;
                        bVar3 = bVar4;
                        f4 = f6;
                        z4 = z5;
                        xkbVar2 = xkbVar3;
                        j4 = j8;
                        j5 = j9;
                        f5 = f7;
                        function5 = function8;
                        function4 = function7;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        j4 = j;
                        function4 = function3;
                        vx7Var2 = vx7Var;
                        f4 = f3;
                        z4 = z2;
                        bVar3 = bVar2;
                        sheetState2 = sheetStateT;
                        xkbVar2 = xkbVarH;
                        j5 = j2;
                        f5 = f2;
                        j6 = j3;
                        function5 = function2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.qx7
                            public final Object invoke(Object obj, Object obj2) {
                                return ModalBottomSheetKt.C(function0, bVar3, sheetState2, f4, z4, xkbVar2, j4, j5, f5, j6, function5, function4, vx7Var2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i18 |= 3072;
                if ((i9 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (dVarF.g(z3, i9 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i27 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            i9 &= -897;
                            sheetStateT = T(false, null, dVarF, 0, 3);
                        }
                        if (i5 != 0) {
                            fK = ss0.a.k();
                        } else {
                            fK = f3;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            i9 &= -458753;
                            xkbVarH = ss0.a.h(dVarF, 6);
                        }
                        if ((i3 & 64) != 0) {
                            jF = ss0.a.f(dVarF, 6);
                            i9 &= -3670017;
                        } else {
                            jF = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(jF, dVarF, (i9 >> 18) & 14);
                            i9 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if (i10 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if ((i3 & 512) != 0) {
                            j7 = ss0.a.j(dVarF, 6);
                            i9 &= -1879048193;
                        } else {
                            j7 = j3;
                        }
                        if (i12 != 0) {
                            function2A = fp1.a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i3 & 2048) != 0) {
                            function6 = a.a;
                            i18 &= -113;
                        } else {
                            function6 = function3;
                        }
                        i20 = i18;
                        if (i16 != 0) {
                            f6 = fK;
                            vx7Var3 = new vx7(false, false, 3, null);
                            f7 = fI;
                            function7 = function6;
                            j8 = jF;
                            z5 = z2;
                            bVar4 = bVar2;
                            xkbVar3 = xkbVarH;
                            function8 = function2A;
                            j9 = jG;
                            j10 = j7;
                            i18 = i20;
                        } else {
                            f6 = fK;
                            vx7Var3 = vx7Var;
                            f7 = fI;
                            function7 = function6;
                            j8 = jF;
                            z5 = z2;
                            bVar4 = bVar2;
                            xkbVar3 = xkbVarH;
                            function8 = function2A;
                            j9 = jG;
                            j10 = j7;
                        }
                    } else {
                        if (i27 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            i9 &= -897;
                            sheetStateT = T(false, null, dVarF, 0, 3);
                        }
                        if (i5 != 0) {
                            fK = ss0.a.k();
                        } else {
                            fK = f3;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            i9 &= -458753;
                            xkbVarH = ss0.a.h(dVarF, 6);
                        }
                        if ((i3 & 64) != 0) {
                            jF = ss0.a.f(dVarF, 6);
                            i9 &= -3670017;
                        } else {
                            jF = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(jF, dVarF, (i9 >> 18) & 14);
                            i9 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if (i10 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if ((i3 & 512) != 0) {
                            j7 = ss0.a.j(dVarF, 6);
                            i9 &= -1879048193;
                        } else {
                            j7 = j3;
                        }
                        if (i12 != 0) {
                            function2A = fp1.a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i3 & 2048) != 0) {
                            function6 = a.a;
                            i18 &= -113;
                        } else {
                            function6 = function3;
                        }
                        i20 = i18;
                        if (i16 != 0) {
                            f6 = fK;
                            vx7Var3 = new vx7(false, false, 3, null);
                            f7 = fI;
                            function7 = function6;
                            j8 = jF;
                            z5 = z2;
                            bVar4 = bVar2;
                            xkbVar3 = xkbVarH;
                            function8 = function2A;
                            j9 = jG;
                            j10 = j7;
                            i18 = i20;
                        } else {
                            f6 = fK;
                            vx7Var3 = vx7Var;
                            f7 = fI;
                            function7 = function6;
                            j8 = jF;
                            z5 = z2;
                            bVar4 = bVar2;
                            xkbVar3 = xkbVarH;
                            function8 = function2A;
                            j9 = jG;
                            j10 = j7;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(1904798512, i9, i18, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
                    }
                    MotionSchemeKeyTokens motionSchemeKeyTokens10 = MotionSchemeKeyTokens.DefaultSpatial;
                    xa4VarB = d08.b(motionSchemeKeyTokens10, dVarF, 6);
                    xa4VarB2 = d08.b(motionSchemeKeyTokens10, dVarF, 6);
                    xa4VarB3 = d08.b(MotionSchemeKeyTokens.FastEffects, dVarF, 6);
                    i21 = (i9 & 896) ^ 384;
                    zT = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(xa4VarB2) | dVarF.T(xa4VarB3) | dVarF.T(xa4VarB);
                    objR = dVarF.R();
                    if (zT) {
                        objR = new Function0() { // from class: com.google.android.mx7
                            public final Object invoke() {
                                return ModalBottomSheetKt.z(sheetStateT, xa4VarB2, xa4VarB3, xa4VarB);
                            }
                        };
                        dVarF.L(objR);
                    } else {
                        objR = new Function0() { // from class: com.google.android.mx7
                            public final Object invoke() {
                                return ModalBottomSheetKt.z(sheetStateT, xa4VarB2, xa4VarB3, xa4VarB);
                            }
                        };
                        dVarF.L(objR);
                    }
                    vn3.i((Function0) objR, dVarF, 0);
                    objR2 = dVarF.R();
                    companion = androidx.compose.p004runtime.d.INSTANCE;
                    if (objR2 == companion.a()) {
                        objR2 = vn3.k(EmptyCoroutineContext.a, dVarF);
                        dVarF.L(objR2);
                    }
                    ta2Var = (ta2) objR2;
                    boolean zT119 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var);
                    i22 = i9 & 14;
                    if (i22 == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = zT119 | z6;
                    objR3 = dVarF.R();
                    if (z7) {
                        objR3 = new Function0() { // from class: com.google.android.nx7
                            public final Object invoke() {
                                return ModalBottomSheetKt.D(sheetStateT, ta2Var, function0);
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function0() { // from class: com.google.android.nx7
                            public final Object invoke() {
                                return ModalBottomSheetKt.D(sheetStateT, ta2Var, function0);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    Function0 function116 = (Function0) objR3;
                    boolean zT1110 = dVarF.T(ta2Var) | ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256);
                    if (i22 == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = zT1110 | z8;
                    objR4 = dVarF.R();
                    if (z9) {
                        objR4 = new Function1() { // from class: com.google.android.ox7
                            public final Object invoke(Object obj) {
                                return ModalBottomSheetKt.F(ta2Var, sheetStateT, function0, ((Float) obj).floatValue());
                            }
                        };
                        dVarF.L(objR4);
                    } else {
                        objR4 = new Function1() { // from class: com.google.android.ox7
                            public final Object invoke(Object obj) {
                                return ModalBottomSheetKt.F(ta2Var, sheetStateT, function0, ((Float) obj).floatValue());
                            }
                        };
                        dVarF.L(objR4);
                    }
                    Function1 function117 = (Function1) objR4;
                    objR5 = dVarF.R();
                    if (objR5 == companion.a()) {
                        objR5 = aq.b(0.0f, 0.0f, 2, null);
                        dVarF.L(objR5);
                    }
                    animatable = (Animatable) objR5;
                    boolean zT1111 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var) | dVarF.T(animatable);
                    if (i22 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = z10 | zT1111;
                    objR6 = dVarF.R();
                    if (z11) {
                        objR6 = new Function0() { // from class: com.google.android.px7
                            public final Object invoke() {
                                return ModalBottomSheetKt.A(sheetStateT, ta2Var, animatable, function0);
                            }
                        };
                        dVarF.L(objR6);
                    } else {
                        objR6 = new Function0() { // from class: com.google.android.px7
                            public final Object invoke() {
                                return ModalBottomSheetKt.A(sheetStateT, ta2Var, animatable, function0);
                            }
                        };
                        dVarF.L(objR6);
                    }
                    b1.e((Function0) objR6, j9, vx7Var3, animatable, ko1.e(1010026864, true, new b(j10, function116, sheetStateT, vx7Var3, animatable, ta2Var, function117, bVar4, f6, z5, xkbVar3, j8, j9, f7, function8, function7, ps4Var), dVarF, 54), dVarF, (i18 & 896) | ((i9 >> 18) & 112) | 24576 | (Animatable.m << 9));
                    dVar2 = dVarF;
                    if (sheetStateT.j()) {
                        dVar2.y(748459762);
                        if (i21 <= 256) {
                        }
                        objR7 = dVar2.R();
                        if (z12) {
                            objR7 = new C0192ModalBottomSheetKt$ModalBottomSheet$5$1(sheetStateT, null);
                            dVar2.L(objR7);
                        } else {
                            objR7 = new C0192ModalBottomSheetKt$ModalBottomSheet$5$1(sheetStateT, null);
                            dVar2.L(objR7);
                        }
                        vn3.g(sheetStateT, (Function2) objR7, dVar2, (i9 >> 6) & 14);
                        dVar2.u();
                    } else {
                        dVar2.y(748521266);
                        dVar2.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    sheetState2 = sheetStateT;
                    j6 = j10;
                    vx7Var2 = vx7Var3;
                    bVar3 = bVar4;
                    f4 = f6;
                    z4 = z5;
                    xkbVar2 = xkbVar3;
                    j4 = j8;
                    j5 = j9;
                    f5 = f7;
                    function5 = function8;
                    function4 = function7;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    j4 = j;
                    function4 = function3;
                    vx7Var2 = vx7Var;
                    f4 = f3;
                    z4 = z2;
                    bVar3 = bVar2;
                    sheetState2 = sheetStateT;
                    xkbVar2 = xkbVarH;
                    j5 = j2;
                    f5 = f2;
                    j6 = j3;
                    function5 = function2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.qx7
                        public final Object invoke(Object obj, Object obj2) {
                            return ModalBottomSheetKt.C(function0, bVar3, sheetState2, f4, z4, xkbVar2, j4, j5, f5, j6, function5, function4, vx7Var2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 24576;
            z2 = z;
            if ((i & 196608) == 0) {
                xkbVarH = xkbVar;
                if ((i3 & 32) == 0) {
                    i26 = 65536;
                } else {
                    i26 = 65536;
                }
                i4 |= i26;
            } else {
                xkbVarH = xkbVar;
            }
            if ((i & 1572864) != 0) {
                if ((i3 & 64) == 0) {
                    i25 = 524288;
                } else {
                    i25 = 524288;
                }
                i4 |= i25;
            }
            if ((i & 12582912) == 0) {
                int i214 = i4;
                if ((i3 & 128) == 0) {
                    i24 = 4194304;
                } else {
                    i24 = 4194304;
                }
                i9 = i214 | i24;
            } else {
                i9 = i4;
            }
            i10 = i3 & 256;
            if (i10 != 0) {
                i9 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (dVarF.B(f2)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i9 |= i11;
            }
            if ((i & 805306368) != 0) {
                if ((i3 & 512) == 0) {
                    i23 = 268435456;
                } else {
                    i23 = 268435456;
                }
                i9 |= i23;
            }
            i12 = i3 & 1024;
            if (i12 != 0) {
                i13 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (dVarF.T(function2)) {
                    i14 = 4;
                } else {
                    i14 = 2;
                }
                i13 = i2 | i14;
            } else {
                i13 = i2;
            }
            if ((i2 & 48) != 0) {
                i13 |= ((i3 & 2048) == 0 || !dVarF.T(function3)) ? 16 : 32;
            }
            i15 = i13;
            i16 = i3 & 4096;
            if (i16 != 0) {
                i18 = i15 | 384;
            } else {
                i17 = i15;
                if ((i2 & 384) != 0) {
                    if (dVarF.x(vx7Var)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                i18 = i17;
            }
            if ((i3 & 8192) != 0) {
                if ((i2 & 3072) == 0) {
                    i18 |= dVarF.T(ps4Var) ? 2048 : 1024;
                }
                if ((i9 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (dVarF.g(z3, i9 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i27 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            i9 &= -897;
                            sheetStateT = T(false, null, dVarF, 0, 3);
                        }
                        if (i5 != 0) {
                            fK = ss0.a.k();
                        } else {
                            fK = f3;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            i9 &= -458753;
                            xkbVarH = ss0.a.h(dVarF, 6);
                        }
                        if ((i3 & 64) != 0) {
                            jF = ss0.a.f(dVarF, 6);
                            i9 &= -3670017;
                        } else {
                            jF = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(jF, dVarF, (i9 >> 18) & 14);
                            i9 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if (i10 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if ((i3 & 512) != 0) {
                            j7 = ss0.a.j(dVarF, 6);
                            i9 &= -1879048193;
                        } else {
                            j7 = j3;
                        }
                        if (i12 != 0) {
                            function2A = fp1.a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i3 & 2048) != 0) {
                            function6 = a.a;
                            i18 &= -113;
                        } else {
                            function6 = function3;
                        }
                        i20 = i18;
                        if (i16 != 0) {
                            f6 = fK;
                            vx7Var3 = new vx7(false, false, 3, null);
                            f7 = fI;
                            function7 = function6;
                            j8 = jF;
                            z5 = z2;
                            bVar4 = bVar2;
                            xkbVar3 = xkbVarH;
                            function8 = function2A;
                            j9 = jG;
                            j10 = j7;
                            i18 = i20;
                        } else {
                            f6 = fK;
                            vx7Var3 = vx7Var;
                            f7 = fI;
                            function7 = function6;
                            j8 = jF;
                            z5 = z2;
                            bVar4 = bVar2;
                            xkbVar3 = xkbVarH;
                            function8 = function2A;
                            j9 = jG;
                            j10 = j7;
                        }
                    } else {
                        if (i27 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            i9 &= -897;
                            sheetStateT = T(false, null, dVarF, 0, 3);
                        }
                        if (i5 != 0) {
                            fK = ss0.a.k();
                        } else {
                            fK = f3;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            i9 &= -458753;
                            xkbVarH = ss0.a.h(dVarF, 6);
                        }
                        if ((i3 & 64) != 0) {
                            jF = ss0.a.f(dVarF, 6);
                            i9 &= -3670017;
                        } else {
                            jF = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(jF, dVarF, (i9 >> 18) & 14);
                            i9 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if (i10 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if ((i3 & 512) != 0) {
                            j7 = ss0.a.j(dVarF, 6);
                            i9 &= -1879048193;
                        } else {
                            j7 = j3;
                        }
                        if (i12 != 0) {
                            function2A = fp1.a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i3 & 2048) != 0) {
                            function6 = a.a;
                            i18 &= -113;
                        } else {
                            function6 = function3;
                        }
                        i20 = i18;
                        if (i16 != 0) {
                            f6 = fK;
                            vx7Var3 = new vx7(false, false, 3, null);
                            f7 = fI;
                            function7 = function6;
                            j8 = jF;
                            z5 = z2;
                            bVar4 = bVar2;
                            xkbVar3 = xkbVarH;
                            function8 = function2A;
                            j9 = jG;
                            j10 = j7;
                            i18 = i20;
                        } else {
                            f6 = fK;
                            vx7Var3 = vx7Var;
                            f7 = fI;
                            function7 = function6;
                            j8 = jF;
                            z5 = z2;
                            bVar4 = bVar2;
                            xkbVar3 = xkbVarH;
                            function8 = function2A;
                            j9 = jG;
                            j10 = j7;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(1904798512, i9, i18, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
                    }
                    MotionSchemeKeyTokens motionSchemeKeyTokens11 = MotionSchemeKeyTokens.DefaultSpatial;
                    xa4VarB = d08.b(motionSchemeKeyTokens11, dVarF, 6);
                    xa4VarB2 = d08.b(motionSchemeKeyTokens11, dVarF, 6);
                    xa4VarB3 = d08.b(MotionSchemeKeyTokens.FastEffects, dVarF, 6);
                    i21 = (i9 & 896) ^ 384;
                    zT = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(xa4VarB2) | dVarF.T(xa4VarB3) | dVarF.T(xa4VarB);
                    objR = dVarF.R();
                    if (zT) {
                        objR = new Function0() { // from class: com.google.android.mx7
                            public final Object invoke() {
                                return ModalBottomSheetKt.z(sheetStateT, xa4VarB2, xa4VarB3, xa4VarB);
                            }
                        };
                        dVarF.L(objR);
                    } else {
                        objR = new Function0() { // from class: com.google.android.mx7
                            public final Object invoke() {
                                return ModalBottomSheetKt.z(sheetStateT, xa4VarB2, xa4VarB3, xa4VarB);
                            }
                        };
                        dVarF.L(objR);
                    }
                    vn3.i((Function0) objR, dVarF, 0);
                    objR2 = dVarF.R();
                    companion = androidx.compose.p004runtime.d.INSTANCE;
                    if (objR2 == companion.a()) {
                        objR2 = vn3.k(EmptyCoroutineContext.a, dVarF);
                        dVarF.L(objR2);
                    }
                    ta2Var = (ta2) objR2;
                    boolean zT1112 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var);
                    i22 = i9 & 14;
                    if (i22 == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = zT1112 | z6;
                    objR3 = dVarF.R();
                    if (z7) {
                        objR3 = new Function0() { // from class: com.google.android.nx7
                            public final Object invoke() {
                                return ModalBottomSheetKt.D(sheetStateT, ta2Var, function0);
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function0() { // from class: com.google.android.nx7
                            public final Object invoke() {
                                return ModalBottomSheetKt.D(sheetStateT, ta2Var, function0);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    Function0 function118 = (Function0) objR3;
                    boolean zT1113 = dVarF.T(ta2Var) | ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256);
                    if (i22 == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = zT1113 | z8;
                    objR4 = dVarF.R();
                    if (z9) {
                        objR4 = new Function1() { // from class: com.google.android.ox7
                            public final Object invoke(Object obj) {
                                return ModalBottomSheetKt.F(ta2Var, sheetStateT, function0, ((Float) obj).floatValue());
                            }
                        };
                        dVarF.L(objR4);
                    } else {
                        objR4 = new Function1() { // from class: com.google.android.ox7
                            public final Object invoke(Object obj) {
                                return ModalBottomSheetKt.F(ta2Var, sheetStateT, function0, ((Float) obj).floatValue());
                            }
                        };
                        dVarF.L(objR4);
                    }
                    Function1 function119 = (Function1) objR4;
                    objR5 = dVarF.R();
                    if (objR5 == companion.a()) {
                        objR5 = aq.b(0.0f, 0.0f, 2, null);
                        dVarF.L(objR5);
                    }
                    animatable = (Animatable) objR5;
                    boolean zT1114 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var) | dVarF.T(animatable);
                    if (i22 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = z10 | zT1114;
                    objR6 = dVarF.R();
                    if (z11) {
                        objR6 = new Function0() { // from class: com.google.android.px7
                            public final Object invoke() {
                                return ModalBottomSheetKt.A(sheetStateT, ta2Var, animatable, function0);
                            }
                        };
                        dVarF.L(objR6);
                    } else {
                        objR6 = new Function0() { // from class: com.google.android.px7
                            public final Object invoke() {
                                return ModalBottomSheetKt.A(sheetStateT, ta2Var, animatable, function0);
                            }
                        };
                        dVarF.L(objR6);
                    }
                    b1.e((Function0) objR6, j9, vx7Var3, animatable, ko1.e(1010026864, true, new b(j10, function118, sheetStateT, vx7Var3, animatable, ta2Var, function119, bVar4, f6, z5, xkbVar3, j8, j9, f7, function8, function7, ps4Var), dVarF, 54), dVarF, (i18 & 896) | ((i9 >> 18) & 112) | 24576 | (Animatable.m << 9));
                    dVar2 = dVarF;
                    if (sheetStateT.j()) {
                        dVar2.y(748459762);
                        if (i21 <= 256) {
                        }
                        objR7 = dVar2.R();
                        if (z12) {
                            objR7 = new C0192ModalBottomSheetKt$ModalBottomSheet$5$1(sheetStateT, null);
                            dVar2.L(objR7);
                        } else {
                            objR7 = new C0192ModalBottomSheetKt$ModalBottomSheet$5$1(sheetStateT, null);
                            dVar2.L(objR7);
                        }
                        vn3.g(sheetStateT, (Function2) objR7, dVar2, (i9 >> 6) & 14);
                        dVar2.u();
                    } else {
                        dVar2.y(748521266);
                        dVar2.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    sheetState2 = sheetStateT;
                    j6 = j10;
                    vx7Var2 = vx7Var3;
                    bVar3 = bVar4;
                    f4 = f6;
                    z4 = z5;
                    xkbVar2 = xkbVar3;
                    j4 = j8;
                    j5 = j9;
                    f5 = f7;
                    function5 = function8;
                    function4 = function7;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    j4 = j;
                    function4 = function3;
                    vx7Var2 = vx7Var;
                    f4 = f3;
                    z4 = z2;
                    bVar3 = bVar2;
                    sheetState2 = sheetStateT;
                    xkbVar2 = xkbVarH;
                    j5 = j2;
                    f5 = f2;
                    j6 = j3;
                    function5 = function2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.qx7
                        public final Object invoke(Object obj, Object obj2) {
                            return ModalBottomSheetKt.C(function0, bVar3, sheetState2, f4, z4, xkbVar2, j4, j5, f5, j6, function5, function4, vx7Var2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 3072;
            if ((i9 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (dVarF.g(z3, i9 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i27 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        i9 &= -897;
                        sheetStateT = T(false, null, dVarF, 0, 3);
                    }
                    if (i5 != 0) {
                        fK = ss0.a.k();
                    } else {
                        fK = f3;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 32) != 0) {
                        i9 &= -458753;
                        xkbVarH = ss0.a.h(dVarF, 6);
                    }
                    if ((i3 & 64) != 0) {
                        jF = ss0.a.f(dVarF, 6);
                        i9 &= -3670017;
                    } else {
                        jF = j;
                    }
                    if ((i3 & 128) != 0) {
                        jG = bj1.g(jF, dVarF, (i9 >> 18) & 14);
                        i9 &= -29360129;
                    } else {
                        jG = j2;
                    }
                    if (i10 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f2;
                    }
                    if ((i3 & 512) != 0) {
                        j7 = ss0.a.j(dVarF, 6);
                        i9 &= -1879048193;
                    } else {
                        j7 = j3;
                    }
                    if (i12 != 0) {
                        function2A = fp1.a.a();
                    } else {
                        function2A = function2;
                    }
                    if ((i3 & 2048) != 0) {
                        function6 = a.a;
                        i18 &= -113;
                    } else {
                        function6 = function3;
                    }
                    i20 = i18;
                    if (i16 != 0) {
                        f6 = fK;
                        vx7Var3 = new vx7(false, false, 3, null);
                        f7 = fI;
                        function7 = function6;
                        j8 = jF;
                        z5 = z2;
                        bVar4 = bVar2;
                        xkbVar3 = xkbVarH;
                        function8 = function2A;
                        j9 = jG;
                        j10 = j7;
                        i18 = i20;
                    } else {
                        f6 = fK;
                        vx7Var3 = vx7Var;
                        f7 = fI;
                        function7 = function6;
                        j8 = jF;
                        z5 = z2;
                        bVar4 = bVar2;
                        xkbVar3 = xkbVarH;
                        function8 = function2A;
                        j9 = jG;
                        j10 = j7;
                    }
                } else {
                    if (i27 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        i9 &= -897;
                        sheetStateT = T(false, null, dVarF, 0, 3);
                    }
                    if (i5 != 0) {
                        fK = ss0.a.k();
                    } else {
                        fK = f3;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 32) != 0) {
                        i9 &= -458753;
                        xkbVarH = ss0.a.h(dVarF, 6);
                    }
                    if ((i3 & 64) != 0) {
                        jF = ss0.a.f(dVarF, 6);
                        i9 &= -3670017;
                    } else {
                        jF = j;
                    }
                    if ((i3 & 128) != 0) {
                        jG = bj1.g(jF, dVarF, (i9 >> 18) & 14);
                        i9 &= -29360129;
                    } else {
                        jG = j2;
                    }
                    if (i10 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f2;
                    }
                    if ((i3 & 512) != 0) {
                        j7 = ss0.a.j(dVarF, 6);
                        i9 &= -1879048193;
                    } else {
                        j7 = j3;
                    }
                    if (i12 != 0) {
                        function2A = fp1.a.a();
                    } else {
                        function2A = function2;
                    }
                    if ((i3 & 2048) != 0) {
                        function6 = a.a;
                        i18 &= -113;
                    } else {
                        function6 = function3;
                    }
                    i20 = i18;
                    if (i16 != 0) {
                        f6 = fK;
                        vx7Var3 = new vx7(false, false, 3, null);
                        f7 = fI;
                        function7 = function6;
                        j8 = jF;
                        z5 = z2;
                        bVar4 = bVar2;
                        xkbVar3 = xkbVarH;
                        function8 = function2A;
                        j9 = jG;
                        j10 = j7;
                        i18 = i20;
                    } else {
                        f6 = fK;
                        vx7Var3 = vx7Var;
                        f7 = fI;
                        function7 = function6;
                        j8 = jF;
                        z5 = z2;
                        bVar4 = bVar2;
                        xkbVar3 = xkbVarH;
                        function8 = function2A;
                        j9 = jG;
                        j10 = j7;
                    }
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(1904798512, i9, i18, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
                }
                MotionSchemeKeyTokens motionSchemeKeyTokens12 = MotionSchemeKeyTokens.DefaultSpatial;
                xa4VarB = d08.b(motionSchemeKeyTokens12, dVarF, 6);
                xa4VarB2 = d08.b(motionSchemeKeyTokens12, dVarF, 6);
                xa4VarB3 = d08.b(MotionSchemeKeyTokens.FastEffects, dVarF, 6);
                i21 = (i9 & 896) ^ 384;
                zT = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(xa4VarB2) | dVarF.T(xa4VarB3) | dVarF.T(xa4VarB);
                objR = dVarF.R();
                if (zT) {
                    objR = new Function0() { // from class: com.google.android.mx7
                        public final Object invoke() {
                            return ModalBottomSheetKt.z(sheetStateT, xa4VarB2, xa4VarB3, xa4VarB);
                        }
                    };
                    dVarF.L(objR);
                } else {
                    objR = new Function0() { // from class: com.google.android.mx7
                        public final Object invoke() {
                            return ModalBottomSheetKt.z(sheetStateT, xa4VarB2, xa4VarB3, xa4VarB);
                        }
                    };
                    dVarF.L(objR);
                }
                vn3.i((Function0) objR, dVarF, 0);
                objR2 = dVarF.R();
                companion = androidx.compose.p004runtime.d.INSTANCE;
                if (objR2 == companion.a()) {
                    objR2 = vn3.k(EmptyCoroutineContext.a, dVarF);
                    dVarF.L(objR2);
                }
                ta2Var = (ta2) objR2;
                boolean zT1115 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var);
                i22 = i9 & 14;
                if (i22 == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = zT1115 | z6;
                objR3 = dVarF.R();
                if (z7) {
                    objR3 = new Function0() { // from class: com.google.android.nx7
                        public final Object invoke() {
                            return ModalBottomSheetKt.D(sheetStateT, ta2Var, function0);
                        }
                    };
                    dVarF.L(objR3);
                } else {
                    objR3 = new Function0() { // from class: com.google.android.nx7
                        public final Object invoke() {
                            return ModalBottomSheetKt.D(sheetStateT, ta2Var, function0);
                        }
                    };
                    dVarF.L(objR3);
                }
                Function0 function1110 = (Function0) objR3;
                boolean zT1116 = dVarF.T(ta2Var) | ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256);
                if (i22 == 4) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = zT1116 | z8;
                objR4 = dVarF.R();
                if (z9) {
                    objR4 = new Function1() { // from class: com.google.android.ox7
                        public final Object invoke(Object obj) {
                            return ModalBottomSheetKt.F(ta2Var, sheetStateT, function0, ((Float) obj).floatValue());
                        }
                    };
                    dVarF.L(objR4);
                } else {
                    objR4 = new Function1() { // from class: com.google.android.ox7
                        public final Object invoke(Object obj) {
                            return ModalBottomSheetKt.F(ta2Var, sheetStateT, function0, ((Float) obj).floatValue());
                        }
                    };
                    dVarF.L(objR4);
                }
                Function1 function1111 = (Function1) objR4;
                objR5 = dVarF.R();
                if (objR5 == companion.a()) {
                    objR5 = aq.b(0.0f, 0.0f, 2, null);
                    dVarF.L(objR5);
                }
                animatable = (Animatable) objR5;
                boolean zT1117 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var) | dVarF.T(animatable);
                if (i22 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = z10 | zT1117;
                objR6 = dVarF.R();
                if (z11) {
                    objR6 = new Function0() { // from class: com.google.android.px7
                        public final Object invoke() {
                            return ModalBottomSheetKt.A(sheetStateT, ta2Var, animatable, function0);
                        }
                    };
                    dVarF.L(objR6);
                } else {
                    objR6 = new Function0() { // from class: com.google.android.px7
                        public final Object invoke() {
                            return ModalBottomSheetKt.A(sheetStateT, ta2Var, animatable, function0);
                        }
                    };
                    dVarF.L(objR6);
                }
                b1.e((Function0) objR6, j9, vx7Var3, animatable, ko1.e(1010026864, true, new b(j10, function1110, sheetStateT, vx7Var3, animatable, ta2Var, function1111, bVar4, f6, z5, xkbVar3, j8, j9, f7, function8, function7, ps4Var), dVarF, 54), dVarF, (i18 & 896) | ((i9 >> 18) & 112) | 24576 | (Animatable.m << 9));
                dVar2 = dVarF;
                if (sheetStateT.j()) {
                    dVar2.y(748459762);
                    if (i21 <= 256) {
                    }
                    objR7 = dVar2.R();
                    if (z12) {
                        objR7 = new C0192ModalBottomSheetKt$ModalBottomSheet$5$1(sheetStateT, null);
                        dVar2.L(objR7);
                    } else {
                        objR7 = new C0192ModalBottomSheetKt$ModalBottomSheet$5$1(sheetStateT, null);
                        dVar2.L(objR7);
                    }
                    vn3.g(sheetStateT, (Function2) objR7, dVar2, (i9 >> 6) & 14);
                    dVar2.u();
                } else {
                    dVar2.y(748521266);
                    dVar2.u();
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                sheetState2 = sheetStateT;
                j6 = j10;
                vx7Var2 = vx7Var3;
                bVar3 = bVar4;
                f4 = f6;
                z4 = z5;
                xkbVar2 = xkbVar3;
                j4 = j8;
                j5 = j9;
                f5 = f7;
                function5 = function8;
                function4 = function7;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                j4 = j;
                function4 = function3;
                vx7Var2 = vx7Var;
                f4 = f3;
                z4 = z2;
                bVar3 = bVar2;
                sheetState2 = sheetStateT;
                xkbVar2 = xkbVarH;
                j5 = j2;
                f5 = f2;
                j6 = j3;
                function5 = function2;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.qx7
                    public final Object invoke(Object obj, Object obj2) {
                        return ModalBottomSheetKt.C(function0, bVar3, sheetState2, f4, z4, xkbVar2, j4, j5, f5, j6, function5, function4, vx7Var2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 3072;
        f3 = f;
        i7 = i3 & 16;
        if (i7 != 0) {
            if ((i & 24576) == 0) {
                z2 = z;
                if (dVarF.A(z2)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i4 |= i8;
            }
            if ((i & 196608) == 0) {
                xkbVarH = xkbVar;
                if ((i3 & 32) == 0) {
                    i26 = 65536;
                } else {
                    i26 = 65536;
                }
                i4 |= i26;
            } else {
                xkbVarH = xkbVar;
            }
            if ((i & 1572864) != 0) {
                if ((i3 & 64) == 0) {
                    i25 = 524288;
                } else {
                    i25 = 524288;
                }
                i4 |= i25;
            }
            if ((i & 12582912) == 0) {
                int i215 = i4;
                if ((i3 & 128) == 0) {
                    i24 = 4194304;
                } else {
                    i24 = 4194304;
                }
                i9 = i215 | i24;
            } else {
                i9 = i4;
            }
            i10 = i3 & 256;
            if (i10 != 0) {
                i9 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (dVarF.B(f2)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i9 |= i11;
            }
            if ((i & 805306368) != 0) {
                if ((i3 & 512) == 0) {
                    i23 = 268435456;
                } else {
                    i23 = 268435456;
                }
                i9 |= i23;
            }
            i12 = i3 & 1024;
            if (i12 != 0) {
                i13 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (dVarF.T(function2)) {
                    i14 = 4;
                } else {
                    i14 = 2;
                }
                i13 = i2 | i14;
            } else {
                i13 = i2;
            }
            if ((i2 & 48) != 0) {
                i13 |= ((i3 & 2048) == 0 || !dVarF.T(function3)) ? 16 : 32;
            }
            i15 = i13;
            i16 = i3 & 4096;
            if (i16 != 0) {
                i18 = i15 | 384;
            } else {
                i17 = i15;
                if ((i2 & 384) != 0) {
                    if (dVarF.x(vx7Var)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                i18 = i17;
            }
            if ((i3 & 8192) != 0) {
                if ((i2 & 3072) == 0) {
                    i18 |= dVarF.T(ps4Var) ? 2048 : 1024;
                }
                if ((i9 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (dVarF.g(z3, i9 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i27 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            i9 &= -897;
                            sheetStateT = T(false, null, dVarF, 0, 3);
                        }
                        if (i5 != 0) {
                            fK = ss0.a.k();
                        } else {
                            fK = f3;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            i9 &= -458753;
                            xkbVarH = ss0.a.h(dVarF, 6);
                        }
                        if ((i3 & 64) != 0) {
                            jF = ss0.a.f(dVarF, 6);
                            i9 &= -3670017;
                        } else {
                            jF = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(jF, dVarF, (i9 >> 18) & 14);
                            i9 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if (i10 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if ((i3 & 512) != 0) {
                            j7 = ss0.a.j(dVarF, 6);
                            i9 &= -1879048193;
                        } else {
                            j7 = j3;
                        }
                        if (i12 != 0) {
                            function2A = fp1.a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i3 & 2048) != 0) {
                            function6 = a.a;
                            i18 &= -113;
                        } else {
                            function6 = function3;
                        }
                        i20 = i18;
                        if (i16 != 0) {
                            f6 = fK;
                            vx7Var3 = new vx7(false, false, 3, null);
                            f7 = fI;
                            function7 = function6;
                            j8 = jF;
                            z5 = z2;
                            bVar4 = bVar2;
                            xkbVar3 = xkbVarH;
                            function8 = function2A;
                            j9 = jG;
                            j10 = j7;
                            i18 = i20;
                        } else {
                            f6 = fK;
                            vx7Var3 = vx7Var;
                            f7 = fI;
                            function7 = function6;
                            j8 = jF;
                            z5 = z2;
                            bVar4 = bVar2;
                            xkbVar3 = xkbVarH;
                            function8 = function2A;
                            j9 = jG;
                            j10 = j7;
                        }
                    } else {
                        if (i27 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            i9 &= -897;
                            sheetStateT = T(false, null, dVarF, 0, 3);
                        }
                        if (i5 != 0) {
                            fK = ss0.a.k();
                        } else {
                            fK = f3;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            i9 &= -458753;
                            xkbVarH = ss0.a.h(dVarF, 6);
                        }
                        if ((i3 & 64) != 0) {
                            jF = ss0.a.f(dVarF, 6);
                            i9 &= -3670017;
                        } else {
                            jF = j;
                        }
                        if ((i3 & 128) != 0) {
                            jG = bj1.g(jF, dVarF, (i9 >> 18) & 14);
                            i9 &= -29360129;
                        } else {
                            jG = j2;
                        }
                        if (i10 != 0) {
                            fI = ff3.i(0);
                        } else {
                            fI = f2;
                        }
                        if ((i3 & 512) != 0) {
                            j7 = ss0.a.j(dVarF, 6);
                            i9 &= -1879048193;
                        } else {
                            j7 = j3;
                        }
                        if (i12 != 0) {
                            function2A = fp1.a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i3 & 2048) != 0) {
                            function6 = a.a;
                            i18 &= -113;
                        } else {
                            function6 = function3;
                        }
                        i20 = i18;
                        if (i16 != 0) {
                            f6 = fK;
                            vx7Var3 = new vx7(false, false, 3, null);
                            f7 = fI;
                            function7 = function6;
                            j8 = jF;
                            z5 = z2;
                            bVar4 = bVar2;
                            xkbVar3 = xkbVarH;
                            function8 = function2A;
                            j9 = jG;
                            j10 = j7;
                            i18 = i20;
                        } else {
                            f6 = fK;
                            vx7Var3 = vx7Var;
                            f7 = fI;
                            function7 = function6;
                            j8 = jF;
                            z5 = z2;
                            bVar4 = bVar2;
                            xkbVar3 = xkbVarH;
                            function8 = function2A;
                            j9 = jG;
                            j10 = j7;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(1904798512, i9, i18, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
                    }
                    MotionSchemeKeyTokens motionSchemeKeyTokens13 = MotionSchemeKeyTokens.DefaultSpatial;
                    xa4VarB = d08.b(motionSchemeKeyTokens13, dVarF, 6);
                    xa4VarB2 = d08.b(motionSchemeKeyTokens13, dVarF, 6);
                    xa4VarB3 = d08.b(MotionSchemeKeyTokens.FastEffects, dVarF, 6);
                    i21 = (i9 & 896) ^ 384;
                    zT = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(xa4VarB2) | dVarF.T(xa4VarB3) | dVarF.T(xa4VarB);
                    objR = dVarF.R();
                    if (zT) {
                        objR = new Function0() { // from class: com.google.android.mx7
                            public final Object invoke() {
                                return ModalBottomSheetKt.z(sheetStateT, xa4VarB2, xa4VarB3, xa4VarB);
                            }
                        };
                        dVarF.L(objR);
                    } else {
                        objR = new Function0() { // from class: com.google.android.mx7
                            public final Object invoke() {
                                return ModalBottomSheetKt.z(sheetStateT, xa4VarB2, xa4VarB3, xa4VarB);
                            }
                        };
                        dVarF.L(objR);
                    }
                    vn3.i((Function0) objR, dVarF, 0);
                    objR2 = dVarF.R();
                    companion = androidx.compose.p004runtime.d.INSTANCE;
                    if (objR2 == companion.a()) {
                        objR2 = vn3.k(EmptyCoroutineContext.a, dVarF);
                        dVarF.L(objR2);
                    }
                    ta2Var = (ta2) objR2;
                    boolean zT1118 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var);
                    i22 = i9 & 14;
                    if (i22 == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = zT1118 | z6;
                    objR3 = dVarF.R();
                    if (z7) {
                        objR3 = new Function0() { // from class: com.google.android.nx7
                            public final Object invoke() {
                                return ModalBottomSheetKt.D(sheetStateT, ta2Var, function0);
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function0() { // from class: com.google.android.nx7
                            public final Object invoke() {
                                return ModalBottomSheetKt.D(sheetStateT, ta2Var, function0);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    Function0 function1112 = (Function0) objR3;
                    boolean zT1119 = dVarF.T(ta2Var) | ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256);
                    if (i22 == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = zT1119 | z8;
                    objR4 = dVarF.R();
                    if (z9) {
                        objR4 = new Function1() { // from class: com.google.android.ox7
                            public final Object invoke(Object obj) {
                                return ModalBottomSheetKt.F(ta2Var, sheetStateT, function0, ((Float) obj).floatValue());
                            }
                        };
                        dVarF.L(objR4);
                    } else {
                        objR4 = new Function1() { // from class: com.google.android.ox7
                            public final Object invoke(Object obj) {
                                return ModalBottomSheetKt.F(ta2Var, sheetStateT, function0, ((Float) obj).floatValue());
                            }
                        };
                        dVarF.L(objR4);
                    }
                    Function1 function1113 = (Function1) objR4;
                    objR5 = dVarF.R();
                    if (objR5 == companion.a()) {
                        objR5 = aq.b(0.0f, 0.0f, 2, null);
                        dVarF.L(objR5);
                    }
                    animatable = (Animatable) objR5;
                    boolean zT11110 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var) | dVarF.T(animatable);
                    if (i22 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = z10 | zT11110;
                    objR6 = dVarF.R();
                    if (z11) {
                        objR6 = new Function0() { // from class: com.google.android.px7
                            public final Object invoke() {
                                return ModalBottomSheetKt.A(sheetStateT, ta2Var, animatable, function0);
                            }
                        };
                        dVarF.L(objR6);
                    } else {
                        objR6 = new Function0() { // from class: com.google.android.px7
                            public final Object invoke() {
                                return ModalBottomSheetKt.A(sheetStateT, ta2Var, animatable, function0);
                            }
                        };
                        dVarF.L(objR6);
                    }
                    b1.e((Function0) objR6, j9, vx7Var3, animatable, ko1.e(1010026864, true, new b(j10, function1112, sheetStateT, vx7Var3, animatable, ta2Var, function1113, bVar4, f6, z5, xkbVar3, j8, j9, f7, function8, function7, ps4Var), dVarF, 54), dVarF, (i18 & 896) | ((i9 >> 18) & 112) | 24576 | (Animatable.m << 9));
                    dVar2 = dVarF;
                    if (sheetStateT.j()) {
                        dVar2.y(748459762);
                        if (i21 <= 256) {
                        }
                        objR7 = dVar2.R();
                        if (z12) {
                            objR7 = new C0192ModalBottomSheetKt$ModalBottomSheet$5$1(sheetStateT, null);
                            dVar2.L(objR7);
                        } else {
                            objR7 = new C0192ModalBottomSheetKt$ModalBottomSheet$5$1(sheetStateT, null);
                            dVar2.L(objR7);
                        }
                        vn3.g(sheetStateT, (Function2) objR7, dVar2, (i9 >> 6) & 14);
                        dVar2.u();
                    } else {
                        dVar2.y(748521266);
                        dVar2.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    sheetState2 = sheetStateT;
                    j6 = j10;
                    vx7Var2 = vx7Var3;
                    bVar3 = bVar4;
                    f4 = f6;
                    z4 = z5;
                    xkbVar2 = xkbVar3;
                    j4 = j8;
                    j5 = j9;
                    f5 = f7;
                    function5 = function8;
                    function4 = function7;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    j4 = j;
                    function4 = function3;
                    vx7Var2 = vx7Var;
                    f4 = f3;
                    z4 = z2;
                    bVar3 = bVar2;
                    sheetState2 = sheetStateT;
                    xkbVar2 = xkbVarH;
                    j5 = j2;
                    f5 = f2;
                    j6 = j3;
                    function5 = function2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.qx7
                        public final Object invoke(Object obj, Object obj2) {
                            return ModalBottomSheetKt.C(function0, bVar3, sheetState2, f4, z4, xkbVar2, j4, j5, f5, j6, function5, function4, vx7Var2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 3072;
            if ((i9 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (dVarF.g(z3, i9 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i27 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        i9 &= -897;
                        sheetStateT = T(false, null, dVarF, 0, 3);
                    }
                    if (i5 != 0) {
                        fK = ss0.a.k();
                    } else {
                        fK = f3;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 32) != 0) {
                        i9 &= -458753;
                        xkbVarH = ss0.a.h(dVarF, 6);
                    }
                    if ((i3 & 64) != 0) {
                        jF = ss0.a.f(dVarF, 6);
                        i9 &= -3670017;
                    } else {
                        jF = j;
                    }
                    if ((i3 & 128) != 0) {
                        jG = bj1.g(jF, dVarF, (i9 >> 18) & 14);
                        i9 &= -29360129;
                    } else {
                        jG = j2;
                    }
                    if (i10 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f2;
                    }
                    if ((i3 & 512) != 0) {
                        j7 = ss0.a.j(dVarF, 6);
                        i9 &= -1879048193;
                    } else {
                        j7 = j3;
                    }
                    if (i12 != 0) {
                        function2A = fp1.a.a();
                    } else {
                        function2A = function2;
                    }
                    if ((i3 & 2048) != 0) {
                        function6 = a.a;
                        i18 &= -113;
                    } else {
                        function6 = function3;
                    }
                    i20 = i18;
                    if (i16 != 0) {
                        f6 = fK;
                        vx7Var3 = new vx7(false, false, 3, null);
                        f7 = fI;
                        function7 = function6;
                        j8 = jF;
                        z5 = z2;
                        bVar4 = bVar2;
                        xkbVar3 = xkbVarH;
                        function8 = function2A;
                        j9 = jG;
                        j10 = j7;
                        i18 = i20;
                    } else {
                        f6 = fK;
                        vx7Var3 = vx7Var;
                        f7 = fI;
                        function7 = function6;
                        j8 = jF;
                        z5 = z2;
                        bVar4 = bVar2;
                        xkbVar3 = xkbVarH;
                        function8 = function2A;
                        j9 = jG;
                        j10 = j7;
                    }
                } else {
                    if (i27 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        i9 &= -897;
                        sheetStateT = T(false, null, dVarF, 0, 3);
                    }
                    if (i5 != 0) {
                        fK = ss0.a.k();
                    } else {
                        fK = f3;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 32) != 0) {
                        i9 &= -458753;
                        xkbVarH = ss0.a.h(dVarF, 6);
                    }
                    if ((i3 & 64) != 0) {
                        jF = ss0.a.f(dVarF, 6);
                        i9 &= -3670017;
                    } else {
                        jF = j;
                    }
                    if ((i3 & 128) != 0) {
                        jG = bj1.g(jF, dVarF, (i9 >> 18) & 14);
                        i9 &= -29360129;
                    } else {
                        jG = j2;
                    }
                    if (i10 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f2;
                    }
                    if ((i3 & 512) != 0) {
                        j7 = ss0.a.j(dVarF, 6);
                        i9 &= -1879048193;
                    } else {
                        j7 = j3;
                    }
                    if (i12 != 0) {
                        function2A = fp1.a.a();
                    } else {
                        function2A = function2;
                    }
                    if ((i3 & 2048) != 0) {
                        function6 = a.a;
                        i18 &= -113;
                    } else {
                        function6 = function3;
                    }
                    i20 = i18;
                    if (i16 != 0) {
                        f6 = fK;
                        vx7Var3 = new vx7(false, false, 3, null);
                        f7 = fI;
                        function7 = function6;
                        j8 = jF;
                        z5 = z2;
                        bVar4 = bVar2;
                        xkbVar3 = xkbVarH;
                        function8 = function2A;
                        j9 = jG;
                        j10 = j7;
                        i18 = i20;
                    } else {
                        f6 = fK;
                        vx7Var3 = vx7Var;
                        f7 = fI;
                        function7 = function6;
                        j8 = jF;
                        z5 = z2;
                        bVar4 = bVar2;
                        xkbVar3 = xkbVarH;
                        function8 = function2A;
                        j9 = jG;
                        j10 = j7;
                    }
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(1904798512, i9, i18, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
                }
                MotionSchemeKeyTokens motionSchemeKeyTokens14 = MotionSchemeKeyTokens.DefaultSpatial;
                xa4VarB = d08.b(motionSchemeKeyTokens14, dVarF, 6);
                xa4VarB2 = d08.b(motionSchemeKeyTokens14, dVarF, 6);
                xa4VarB3 = d08.b(MotionSchemeKeyTokens.FastEffects, dVarF, 6);
                i21 = (i9 & 896) ^ 384;
                zT = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(xa4VarB2) | dVarF.T(xa4VarB3) | dVarF.T(xa4VarB);
                objR = dVarF.R();
                if (zT) {
                    objR = new Function0() { // from class: com.google.android.mx7
                        public final Object invoke() {
                            return ModalBottomSheetKt.z(sheetStateT, xa4VarB2, xa4VarB3, xa4VarB);
                        }
                    };
                    dVarF.L(objR);
                } else {
                    objR = new Function0() { // from class: com.google.android.mx7
                        public final Object invoke() {
                            return ModalBottomSheetKt.z(sheetStateT, xa4VarB2, xa4VarB3, xa4VarB);
                        }
                    };
                    dVarF.L(objR);
                }
                vn3.i((Function0) objR, dVarF, 0);
                objR2 = dVarF.R();
                companion = androidx.compose.p004runtime.d.INSTANCE;
                if (objR2 == companion.a()) {
                    objR2 = vn3.k(EmptyCoroutineContext.a, dVarF);
                    dVarF.L(objR2);
                }
                ta2Var = (ta2) objR2;
                boolean zT11111 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var);
                i22 = i9 & 14;
                if (i22 == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = zT11111 | z6;
                objR3 = dVarF.R();
                if (z7) {
                    objR3 = new Function0() { // from class: com.google.android.nx7
                        public final Object invoke() {
                            return ModalBottomSheetKt.D(sheetStateT, ta2Var, function0);
                        }
                    };
                    dVarF.L(objR3);
                } else {
                    objR3 = new Function0() { // from class: com.google.android.nx7
                        public final Object invoke() {
                            return ModalBottomSheetKt.D(sheetStateT, ta2Var, function0);
                        }
                    };
                    dVarF.L(objR3);
                }
                Function0 function1114 = (Function0) objR3;
                boolean zT11112 = dVarF.T(ta2Var) | ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256);
                if (i22 == 4) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = zT11112 | z8;
                objR4 = dVarF.R();
                if (z9) {
                    objR4 = new Function1() { // from class: com.google.android.ox7
                        public final Object invoke(Object obj) {
                            return ModalBottomSheetKt.F(ta2Var, sheetStateT, function0, ((Float) obj).floatValue());
                        }
                    };
                    dVarF.L(objR4);
                } else {
                    objR4 = new Function1() { // from class: com.google.android.ox7
                        public final Object invoke(Object obj) {
                            return ModalBottomSheetKt.F(ta2Var, sheetStateT, function0, ((Float) obj).floatValue());
                        }
                    };
                    dVarF.L(objR4);
                }
                Function1 function1115 = (Function1) objR4;
                objR5 = dVarF.R();
                if (objR5 == companion.a()) {
                    objR5 = aq.b(0.0f, 0.0f, 2, null);
                    dVarF.L(objR5);
                }
                animatable = (Animatable) objR5;
                boolean zT11113 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var) | dVarF.T(animatable);
                if (i22 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = z10 | zT11113;
                objR6 = dVarF.R();
                if (z11) {
                    objR6 = new Function0() { // from class: com.google.android.px7
                        public final Object invoke() {
                            return ModalBottomSheetKt.A(sheetStateT, ta2Var, animatable, function0);
                        }
                    };
                    dVarF.L(objR6);
                } else {
                    objR6 = new Function0() { // from class: com.google.android.px7
                        public final Object invoke() {
                            return ModalBottomSheetKt.A(sheetStateT, ta2Var, animatable, function0);
                        }
                    };
                    dVarF.L(objR6);
                }
                b1.e((Function0) objR6, j9, vx7Var3, animatable, ko1.e(1010026864, true, new b(j10, function1114, sheetStateT, vx7Var3, animatable, ta2Var, function1115, bVar4, f6, z5, xkbVar3, j8, j9, f7, function8, function7, ps4Var), dVarF, 54), dVarF, (i18 & 896) | ((i9 >> 18) & 112) | 24576 | (Animatable.m << 9));
                dVar2 = dVarF;
                if (sheetStateT.j()) {
                    dVar2.y(748459762);
                    if (i21 <= 256) {
                    }
                    objR7 = dVar2.R();
                    if (z12) {
                        objR7 = new C0192ModalBottomSheetKt$ModalBottomSheet$5$1(sheetStateT, null);
                        dVar2.L(objR7);
                    } else {
                        objR7 = new C0192ModalBottomSheetKt$ModalBottomSheet$5$1(sheetStateT, null);
                        dVar2.L(objR7);
                    }
                    vn3.g(sheetStateT, (Function2) objR7, dVar2, (i9 >> 6) & 14);
                    dVar2.u();
                } else {
                    dVar2.y(748521266);
                    dVar2.u();
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                sheetState2 = sheetStateT;
                j6 = j10;
                vx7Var2 = vx7Var3;
                bVar3 = bVar4;
                f4 = f6;
                z4 = z5;
                xkbVar2 = xkbVar3;
                j4 = j8;
                j5 = j9;
                f5 = f7;
                function5 = function8;
                function4 = function7;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                j4 = j;
                function4 = function3;
                vx7Var2 = vx7Var;
                f4 = f3;
                z4 = z2;
                bVar3 = bVar2;
                sheetState2 = sheetStateT;
                xkbVar2 = xkbVarH;
                j5 = j2;
                f5 = f2;
                j6 = j3;
                function5 = function2;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.qx7
                    public final Object invoke(Object obj, Object obj2) {
                        return ModalBottomSheetKt.C(function0, bVar3, sheetState2, f4, z4, xkbVar2, j4, j5, f5, j6, function5, function4, vx7Var2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 24576;
        z2 = z;
        if ((i & 196608) == 0) {
            xkbVarH = xkbVar;
            if ((i3 & 32) == 0) {
                i26 = 65536;
            } else {
                i26 = 65536;
            }
            i4 |= i26;
        } else {
            xkbVarH = xkbVar;
        }
        if ((i & 1572864) != 0) {
            if ((i3 & 64) == 0) {
                i25 = 524288;
            } else {
                i25 = 524288;
            }
            i4 |= i25;
        }
        if ((i & 12582912) == 0) {
            int i216 = i4;
            if ((i3 & 128) == 0) {
                i24 = 4194304;
            } else {
                i24 = 4194304;
            }
            i9 = i216 | i24;
        } else {
            i9 = i4;
        }
        i10 = i3 & 256;
        if (i10 != 0) {
            i9 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (dVarF.B(f2)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i9 |= i11;
        }
        if ((i & 805306368) != 0) {
            if ((i3 & 512) == 0) {
                i23 = 268435456;
            } else {
                i23 = 268435456;
            }
            i9 |= i23;
        }
        i12 = i3 & 1024;
        if (i12 != 0) {
            i13 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (dVarF.T(function2)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i2 | i14;
        } else {
            i13 = i2;
        }
        if ((i2 & 48) != 0) {
            i13 |= ((i3 & 2048) == 0 || !dVarF.T(function3)) ? 16 : 32;
        }
        i15 = i13;
        i16 = i3 & 4096;
        if (i16 != 0) {
            i18 = i15 | 384;
        } else {
            i17 = i15;
            if ((i2 & 384) != 0) {
                if (dVarF.x(vx7Var)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            i18 = i17;
        }
        if ((i3 & 8192) != 0) {
            if ((i2 & 3072) == 0) {
                i18 |= dVarF.T(ps4Var) ? 2048 : 1024;
            }
            if ((i9 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (dVarF.g(z3, i9 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i27 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        i9 &= -897;
                        sheetStateT = T(false, null, dVarF, 0, 3);
                    }
                    if (i5 != 0) {
                        fK = ss0.a.k();
                    } else {
                        fK = f3;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 32) != 0) {
                        i9 &= -458753;
                        xkbVarH = ss0.a.h(dVarF, 6);
                    }
                    if ((i3 & 64) != 0) {
                        jF = ss0.a.f(dVarF, 6);
                        i9 &= -3670017;
                    } else {
                        jF = j;
                    }
                    if ((i3 & 128) != 0) {
                        jG = bj1.g(jF, dVarF, (i9 >> 18) & 14);
                        i9 &= -29360129;
                    } else {
                        jG = j2;
                    }
                    if (i10 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f2;
                    }
                    if ((i3 & 512) != 0) {
                        j7 = ss0.a.j(dVarF, 6);
                        i9 &= -1879048193;
                    } else {
                        j7 = j3;
                    }
                    if (i12 != 0) {
                        function2A = fp1.a.a();
                    } else {
                        function2A = function2;
                    }
                    if ((i3 & 2048) != 0) {
                        function6 = a.a;
                        i18 &= -113;
                    } else {
                        function6 = function3;
                    }
                    i20 = i18;
                    if (i16 != 0) {
                        f6 = fK;
                        vx7Var3 = new vx7(false, false, 3, null);
                        f7 = fI;
                        function7 = function6;
                        j8 = jF;
                        z5 = z2;
                        bVar4 = bVar2;
                        xkbVar3 = xkbVarH;
                        function8 = function2A;
                        j9 = jG;
                        j10 = j7;
                        i18 = i20;
                    } else {
                        f6 = fK;
                        vx7Var3 = vx7Var;
                        f7 = fI;
                        function7 = function6;
                        j8 = jF;
                        z5 = z2;
                        bVar4 = bVar2;
                        xkbVar3 = xkbVarH;
                        function8 = function2A;
                        j9 = jG;
                        j10 = j7;
                    }
                } else {
                    if (i27 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        i9 &= -897;
                        sheetStateT = T(false, null, dVarF, 0, 3);
                    }
                    if (i5 != 0) {
                        fK = ss0.a.k();
                    } else {
                        fK = f3;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 32) != 0) {
                        i9 &= -458753;
                        xkbVarH = ss0.a.h(dVarF, 6);
                    }
                    if ((i3 & 64) != 0) {
                        jF = ss0.a.f(dVarF, 6);
                        i9 &= -3670017;
                    } else {
                        jF = j;
                    }
                    if ((i3 & 128) != 0) {
                        jG = bj1.g(jF, dVarF, (i9 >> 18) & 14);
                        i9 &= -29360129;
                    } else {
                        jG = j2;
                    }
                    if (i10 != 0) {
                        fI = ff3.i(0);
                    } else {
                        fI = f2;
                    }
                    if ((i3 & 512) != 0) {
                        j7 = ss0.a.j(dVarF, 6);
                        i9 &= -1879048193;
                    } else {
                        j7 = j3;
                    }
                    if (i12 != 0) {
                        function2A = fp1.a.a();
                    } else {
                        function2A = function2;
                    }
                    if ((i3 & 2048) != 0) {
                        function6 = a.a;
                        i18 &= -113;
                    } else {
                        function6 = function3;
                    }
                    i20 = i18;
                    if (i16 != 0) {
                        f6 = fK;
                        vx7Var3 = new vx7(false, false, 3, null);
                        f7 = fI;
                        function7 = function6;
                        j8 = jF;
                        z5 = z2;
                        bVar4 = bVar2;
                        xkbVar3 = xkbVarH;
                        function8 = function2A;
                        j9 = jG;
                        j10 = j7;
                        i18 = i20;
                    } else {
                        f6 = fK;
                        vx7Var3 = vx7Var;
                        f7 = fI;
                        function7 = function6;
                        j8 = jF;
                        z5 = z2;
                        bVar4 = bVar2;
                        xkbVar3 = xkbVarH;
                        function8 = function2A;
                        j9 = jG;
                        j10 = j7;
                    }
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(1904798512, i9, i18, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
                }
                MotionSchemeKeyTokens motionSchemeKeyTokens15 = MotionSchemeKeyTokens.DefaultSpatial;
                xa4VarB = d08.b(motionSchemeKeyTokens15, dVarF, 6);
                xa4VarB2 = d08.b(motionSchemeKeyTokens15, dVarF, 6);
                xa4VarB3 = d08.b(MotionSchemeKeyTokens.FastEffects, dVarF, 6);
                i21 = (i9 & 896) ^ 384;
                zT = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(xa4VarB2) | dVarF.T(xa4VarB3) | dVarF.T(xa4VarB);
                objR = dVarF.R();
                if (zT) {
                    objR = new Function0() { // from class: com.google.android.mx7
                        public final Object invoke() {
                            return ModalBottomSheetKt.z(sheetStateT, xa4VarB2, xa4VarB3, xa4VarB);
                        }
                    };
                    dVarF.L(objR);
                } else {
                    objR = new Function0() { // from class: com.google.android.mx7
                        public final Object invoke() {
                            return ModalBottomSheetKt.z(sheetStateT, xa4VarB2, xa4VarB3, xa4VarB);
                        }
                    };
                    dVarF.L(objR);
                }
                vn3.i((Function0) objR, dVarF, 0);
                objR2 = dVarF.R();
                companion = androidx.compose.p004runtime.d.INSTANCE;
                if (objR2 == companion.a()) {
                    objR2 = vn3.k(EmptyCoroutineContext.a, dVarF);
                    dVarF.L(objR2);
                }
                ta2Var = (ta2) objR2;
                boolean zT11114 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var);
                i22 = i9 & 14;
                if (i22 == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = zT11114 | z6;
                objR3 = dVarF.R();
                if (z7) {
                    objR3 = new Function0() { // from class: com.google.android.nx7
                        public final Object invoke() {
                            return ModalBottomSheetKt.D(sheetStateT, ta2Var, function0);
                        }
                    };
                    dVarF.L(objR3);
                } else {
                    objR3 = new Function0() { // from class: com.google.android.nx7
                        public final Object invoke() {
                            return ModalBottomSheetKt.D(sheetStateT, ta2Var, function0);
                        }
                    };
                    dVarF.L(objR3);
                }
                Function0 function1116 = (Function0) objR3;
                boolean zT11115 = dVarF.T(ta2Var) | ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256);
                if (i22 == 4) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = zT11115 | z8;
                objR4 = dVarF.R();
                if (z9) {
                    objR4 = new Function1() { // from class: com.google.android.ox7
                        public final Object invoke(Object obj) {
                            return ModalBottomSheetKt.F(ta2Var, sheetStateT, function0, ((Float) obj).floatValue());
                        }
                    };
                    dVarF.L(objR4);
                } else {
                    objR4 = new Function1() { // from class: com.google.android.ox7
                        public final Object invoke(Object obj) {
                            return ModalBottomSheetKt.F(ta2Var, sheetStateT, function0, ((Float) obj).floatValue());
                        }
                    };
                    dVarF.L(objR4);
                }
                Function1 function1117 = (Function1) objR4;
                objR5 = dVarF.R();
                if (objR5 == companion.a()) {
                    objR5 = aq.b(0.0f, 0.0f, 2, null);
                    dVarF.L(objR5);
                }
                animatable = (Animatable) objR5;
                boolean zT11116 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var) | dVarF.T(animatable);
                if (i22 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = z10 | zT11116;
                objR6 = dVarF.R();
                if (z11) {
                    objR6 = new Function0() { // from class: com.google.android.px7
                        public final Object invoke() {
                            return ModalBottomSheetKt.A(sheetStateT, ta2Var, animatable, function0);
                        }
                    };
                    dVarF.L(objR6);
                } else {
                    objR6 = new Function0() { // from class: com.google.android.px7
                        public final Object invoke() {
                            return ModalBottomSheetKt.A(sheetStateT, ta2Var, animatable, function0);
                        }
                    };
                    dVarF.L(objR6);
                }
                b1.e((Function0) objR6, j9, vx7Var3, animatable, ko1.e(1010026864, true, new b(j10, function1116, sheetStateT, vx7Var3, animatable, ta2Var, function1117, bVar4, f6, z5, xkbVar3, j8, j9, f7, function8, function7, ps4Var), dVarF, 54), dVarF, (i18 & 896) | ((i9 >> 18) & 112) | 24576 | (Animatable.m << 9));
                dVar2 = dVarF;
                if (sheetStateT.j()) {
                    dVar2.y(748459762);
                    if (i21 <= 256) {
                    }
                    objR7 = dVar2.R();
                    if (z12) {
                        objR7 = new C0192ModalBottomSheetKt$ModalBottomSheet$5$1(sheetStateT, null);
                        dVar2.L(objR7);
                    } else {
                        objR7 = new C0192ModalBottomSheetKt$ModalBottomSheet$5$1(sheetStateT, null);
                        dVar2.L(objR7);
                    }
                    vn3.g(sheetStateT, (Function2) objR7, dVar2, (i9 >> 6) & 14);
                    dVar2.u();
                } else {
                    dVar2.y(748521266);
                    dVar2.u();
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                sheetState2 = sheetStateT;
                j6 = j10;
                vx7Var2 = vx7Var3;
                bVar3 = bVar4;
                f4 = f6;
                z4 = z5;
                xkbVar2 = xkbVar3;
                j4 = j8;
                j5 = j9;
                f5 = f7;
                function5 = function8;
                function4 = function7;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                j4 = j;
                function4 = function3;
                vx7Var2 = vx7Var;
                f4 = f3;
                z4 = z2;
                bVar3 = bVar2;
                sheetState2 = sheetStateT;
                xkbVar2 = xkbVarH;
                j5 = j2;
                f5 = f2;
                j6 = j3;
                function5 = function2;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.qx7
                    public final Object invoke(Object obj, Object obj2) {
                        return ModalBottomSheetKt.C(function0, bVar3, sheetState2, f4, z4, xkbVar2, j4, j5, f5, j6, function5, function4, vx7Var2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 3072;
        if ((i9 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (dVarF.g(z3, i9 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i27 != 0) {
                    bVar2 = androidx.compose.ui.b.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    i9 &= -897;
                    sheetStateT = T(false, null, dVarF, 0, 3);
                }
                if (i5 != 0) {
                    fK = ss0.a.k();
                } else {
                    fK = f3;
                }
                if (i7 != 0) {
                    z2 = true;
                }
                if ((i3 & 32) != 0) {
                    i9 &= -458753;
                    xkbVarH = ss0.a.h(dVarF, 6);
                }
                if ((i3 & 64) != 0) {
                    jF = ss0.a.f(dVarF, 6);
                    i9 &= -3670017;
                } else {
                    jF = j;
                }
                if ((i3 & 128) != 0) {
                    jG = bj1.g(jF, dVarF, (i9 >> 18) & 14);
                    i9 &= -29360129;
                } else {
                    jG = j2;
                }
                if (i10 != 0) {
                    fI = ff3.i(0);
                } else {
                    fI = f2;
                }
                if ((i3 & 512) != 0) {
                    j7 = ss0.a.j(dVarF, 6);
                    i9 &= -1879048193;
                } else {
                    j7 = j3;
                }
                if (i12 != 0) {
                    function2A = fp1.a.a();
                } else {
                    function2A = function2;
                }
                if ((i3 & 2048) != 0) {
                    function6 = a.a;
                    i18 &= -113;
                } else {
                    function6 = function3;
                }
                i20 = i18;
                if (i16 != 0) {
                    f6 = fK;
                    vx7Var3 = new vx7(false, false, 3, null);
                    f7 = fI;
                    function7 = function6;
                    j8 = jF;
                    z5 = z2;
                    bVar4 = bVar2;
                    xkbVar3 = xkbVarH;
                    function8 = function2A;
                    j9 = jG;
                    j10 = j7;
                    i18 = i20;
                } else {
                    f6 = fK;
                    vx7Var3 = vx7Var;
                    f7 = fI;
                    function7 = function6;
                    j8 = jF;
                    z5 = z2;
                    bVar4 = bVar2;
                    xkbVar3 = xkbVarH;
                    function8 = function2A;
                    j9 = jG;
                    j10 = j7;
                }
            } else {
                if (i27 != 0) {
                    bVar2 = androidx.compose.ui.b.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    i9 &= -897;
                    sheetStateT = T(false, null, dVarF, 0, 3);
                }
                if (i5 != 0) {
                    fK = ss0.a.k();
                } else {
                    fK = f3;
                }
                if (i7 != 0) {
                    z2 = true;
                }
                if ((i3 & 32) != 0) {
                    i9 &= -458753;
                    xkbVarH = ss0.a.h(dVarF, 6);
                }
                if ((i3 & 64) != 0) {
                    jF = ss0.a.f(dVarF, 6);
                    i9 &= -3670017;
                } else {
                    jF = j;
                }
                if ((i3 & 128) != 0) {
                    jG = bj1.g(jF, dVarF, (i9 >> 18) & 14);
                    i9 &= -29360129;
                } else {
                    jG = j2;
                }
                if (i10 != 0) {
                    fI = ff3.i(0);
                } else {
                    fI = f2;
                }
                if ((i3 & 512) != 0) {
                    j7 = ss0.a.j(dVarF, 6);
                    i9 &= -1879048193;
                } else {
                    j7 = j3;
                }
                if (i12 != 0) {
                    function2A = fp1.a.a();
                } else {
                    function2A = function2;
                }
                if ((i3 & 2048) != 0) {
                    function6 = a.a;
                    i18 &= -113;
                } else {
                    function6 = function3;
                }
                i20 = i18;
                if (i16 != 0) {
                    f6 = fK;
                    vx7Var3 = new vx7(false, false, 3, null);
                    f7 = fI;
                    function7 = function6;
                    j8 = jF;
                    z5 = z2;
                    bVar4 = bVar2;
                    xkbVar3 = xkbVarH;
                    function8 = function2A;
                    j9 = jG;
                    j10 = j7;
                    i18 = i20;
                } else {
                    f6 = fK;
                    vx7Var3 = vx7Var;
                    f7 = fI;
                    function7 = function6;
                    j8 = jF;
                    z5 = z2;
                    bVar4 = bVar2;
                    xkbVar3 = xkbVarH;
                    function8 = function2A;
                    j9 = jG;
                    j10 = j7;
                }
            }
            dVarF.M();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(1904798512, i9, i18, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
            }
            MotionSchemeKeyTokens motionSchemeKeyTokens16 = MotionSchemeKeyTokens.DefaultSpatial;
            xa4VarB = d08.b(motionSchemeKeyTokens16, dVarF, 6);
            xa4VarB2 = d08.b(motionSchemeKeyTokens16, dVarF, 6);
            xa4VarB3 = d08.b(MotionSchemeKeyTokens.FastEffects, dVarF, 6);
            i21 = (i9 & 896) ^ 384;
            zT = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(xa4VarB2) | dVarF.T(xa4VarB3) | dVarF.T(xa4VarB);
            objR = dVarF.R();
            if (zT) {
                objR = new Function0() { // from class: com.google.android.mx7
                    public final Object invoke() {
                        return ModalBottomSheetKt.z(sheetStateT, xa4VarB2, xa4VarB3, xa4VarB);
                    }
                };
                dVarF.L(objR);
            } else {
                objR = new Function0() { // from class: com.google.android.mx7
                    public final Object invoke() {
                        return ModalBottomSheetKt.z(sheetStateT, xa4VarB2, xa4VarB3, xa4VarB);
                    }
                };
                dVarF.L(objR);
            }
            vn3.i((Function0) objR, dVarF, 0);
            objR2 = dVarF.R();
            companion = androidx.compose.p004runtime.d.INSTANCE;
            if (objR2 == companion.a()) {
                objR2 = vn3.k(EmptyCoroutineContext.a, dVarF);
                dVarF.L(objR2);
            }
            ta2Var = (ta2) objR2;
            boolean zT11117 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var);
            i22 = i9 & 14;
            if (i22 == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            z7 = zT11117 | z6;
            objR3 = dVarF.R();
            if (z7) {
                objR3 = new Function0() { // from class: com.google.android.nx7
                    public final Object invoke() {
                        return ModalBottomSheetKt.D(sheetStateT, ta2Var, function0);
                    }
                };
                dVarF.L(objR3);
            } else {
                objR3 = new Function0() { // from class: com.google.android.nx7
                    public final Object invoke() {
                        return ModalBottomSheetKt.D(sheetStateT, ta2Var, function0);
                    }
                };
                dVarF.L(objR3);
            }
            Function0 function1118 = (Function0) objR3;
            boolean zT11118 = dVarF.T(ta2Var) | ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256);
            if (i22 == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            z9 = zT11118 | z8;
            objR4 = dVarF.R();
            if (z9) {
                objR4 = new Function1() { // from class: com.google.android.ox7
                    public final Object invoke(Object obj) {
                        return ModalBottomSheetKt.F(ta2Var, sheetStateT, function0, ((Float) obj).floatValue());
                    }
                };
                dVarF.L(objR4);
            } else {
                objR4 = new Function1() { // from class: com.google.android.ox7
                    public final Object invoke(Object obj) {
                        return ModalBottomSheetKt.F(ta2Var, sheetStateT, function0, ((Float) obj).floatValue());
                    }
                };
                dVarF.L(objR4);
            }
            Function1 function1119 = (Function1) objR4;
            objR5 = dVarF.R();
            if (objR5 == companion.a()) {
                objR5 = aq.b(0.0f, 0.0f, 2, null);
                dVarF.L(objR5);
            }
            animatable = (Animatable) objR5;
            boolean zT11119 = ((i21 <= 256 && dVarF.x(sheetStateT)) || (i9 & 384) == 256) | dVarF.T(ta2Var) | dVarF.T(animatable);
            if (i22 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = z10 | zT11119;
            objR6 = dVarF.R();
            if (z11) {
                objR6 = new Function0() { // from class: com.google.android.px7
                    public final Object invoke() {
                        return ModalBottomSheetKt.A(sheetStateT, ta2Var, animatable, function0);
                    }
                };
                dVarF.L(objR6);
            } else {
                objR6 = new Function0() { // from class: com.google.android.px7
                    public final Object invoke() {
                        return ModalBottomSheetKt.A(sheetStateT, ta2Var, animatable, function0);
                    }
                };
                dVarF.L(objR6);
            }
            b1.e((Function0) objR6, j9, vx7Var3, animatable, ko1.e(1010026864, true, new b(j10, function1118, sheetStateT, vx7Var3, animatable, ta2Var, function1119, bVar4, f6, z5, xkbVar3, j8, j9, f7, function8, function7, ps4Var), dVarF, 54), dVarF, (i18 & 896) | ((i9 >> 18) & 112) | 24576 | (Animatable.m << 9));
            dVar2 = dVarF;
            if (sheetStateT.j()) {
                dVar2.y(748459762);
                if (i21 <= 256) {
                }
                objR7 = dVar2.R();
                if (z12) {
                    objR7 = new C0192ModalBottomSheetKt$ModalBottomSheet$5$1(sheetStateT, null);
                    dVar2.L(objR7);
                } else {
                    objR7 = new C0192ModalBottomSheetKt$ModalBottomSheet$5$1(sheetStateT, null);
                    dVar2.L(objR7);
                }
                vn3.g(sheetStateT, (Function2) objR7, dVar2, (i9 >> 6) & 14);
                dVar2.u();
            } else {
                dVar2.y(748521266);
                dVar2.u();
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            sheetState2 = sheetStateT;
            j6 = j10;
            vx7Var2 = vx7Var3;
            bVar3 = bVar4;
            f4 = f6;
            z4 = z5;
            xkbVar2 = xkbVar3;
            j4 = j8;
            j5 = j9;
            f5 = f7;
            function5 = function8;
            function4 = function7;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            j4 = j;
            function4 = function3;
            vx7Var2 = vx7Var;
            f4 = f3;
            z4 = z2;
            bVar3 = bVar2;
            sheetState2 = sheetStateT;
            xkbVar2 = xkbVarH;
            j5 = j2;
            f5 = f2;
            j6 = j3;
            function5 = function2;
        }
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.qx7
                public final Object invoke(Object obj, Object obj2) {
                    return ModalBottomSheetKt.C(function0, bVar3, sheetState2, f4, z4, xkbVar2, j4, j5, f5, j6, function5, function4, vx7Var2, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:100:0x0122  */
    /* JADX WARN: Code duplicated, block: B:102:0x0126  */
    /* JADX WARN: Code duplicated, block: B:105:0x0131 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x0138  */
    /* JADX WARN: Code duplicated, block: B:111:0x013e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0142  */
    /* JADX WARN: Code duplicated, block: B:115:0x014b  */
    /* JADX WARN: Code duplicated, block: B:116:0x014e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0156  */
    /* JADX WARN: Code duplicated, block: B:122:0x015f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0167  */
    /* JADX WARN: Code duplicated, block: B:127:0x0170  */
    /* JADX WARN: Code duplicated, block: B:130:0x0177  */
    /* JADX WARN: Code duplicated, block: B:133:0x0180  */
    /* JADX WARN: Code duplicated, block: B:134:0x0183  */
    /* JADX WARN: Code duplicated, block: B:136:0x0189  */
    /* JADX WARN: Code duplicated, block: B:138:0x0191  */
    /* JADX WARN: Code duplicated, block: B:139:0x0194  */
    /* JADX WARN: Code duplicated, block: B:141:0x019b  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:147:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:150:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:152:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:155:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:157:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:160:0x01d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:165:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:167:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:169:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:171:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:175:0x0203  */
    /* JADX WARN: Code duplicated, block: B:179:0x0210  */
    /* JADX WARN: Code duplicated, block: B:182:0x0219  */
    /* JADX WARN: Code duplicated, block: B:184:0x022b  */
    /* JADX WARN: Code duplicated, block: B:204:0x026e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:205:0x0270  */
    /* JADX WARN: Code duplicated, block: B:208:0x0277  */
    /* JADX WARN: Code duplicated, block: B:209:0x0285  */
    /* JADX WARN: Code duplicated, block: B:211:0x0289  */
    /* JADX WARN: Code duplicated, block: B:213:0x0291  */
    /* JADX WARN: Code duplicated, block: B:214:0x0293  */
    /* JADX WARN: Code duplicated, block: B:217:0x0299  */
    /* JADX WARN: Code duplicated, block: B:218:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:221:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:222:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:225:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:226:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:228:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:229:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:231:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:232:0x02da  */
    /* JADX WARN: Code duplicated, block: B:235:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:236:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:239:0x0306  */
    /* JADX WARN: Code duplicated, block: B:240:0x0311  */
    /* JADX WARN: Code duplicated, block: B:243:0x033d  */
    /* JADX WARN: Code duplicated, block: B:245:0x034f  */
    /* JADX WARN: Code duplicated, block: B:247:0x0355  */
    /* JADX WARN: Code duplicated, block: B:253:0x0362  */
    /* JADX WARN: Code duplicated, block: B:255:0x036a  */
    /* JADX WARN: Code duplicated, block: B:257:0x0381  */
    /* JADX WARN: Code duplicated, block: B:260:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:262:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:266:0x03b2 A[PHI: r42
  0x03b2: PHI (r42v2 long) = (r42v0 long), (r42v3 long) binds: [B:265:0x03b0, B:263:0x03ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:267:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:270:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:272:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:275:0x03db  */
    /* JADX WARN: Code duplicated, block: B:278:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:281:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:282:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:285:0x0400  */
    /* JADX WARN: Code duplicated, block: B:287:0x0408  */
    /* JADX WARN: Code duplicated, block: B:290:0x042f  */
    /* JADX WARN: Code duplicated, block: B:292:0x0437  */
    /* JADX WARN: Code duplicated, block: B:295:0x0471  */
    /* JADX WARN: Code duplicated, block: B:297:0x0477  */
    /* JADX WARN: Code duplicated, block: B:303:0x0484  */
    /* JADX WARN: Code duplicated, block: B:309:0x0491  */
    /* JADX WARN: Code duplicated, block: B:312:0x049a  */
    /* JADX WARN: Code duplicated, block: B:314:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:317:0x0508  */
    /* JADX WARN: Code duplicated, block: B:319:0x051d  */
    /* JADX WARN: Code duplicated, block: B:322:0x053b  */
    /* JADX WARN: Code duplicated, block: B:324:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00de  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:90:0x0104  */
    /* JADX WARN: Code duplicated, block: B:91:0x0109  */
    /* JADX WARN: Code duplicated, block: B:93:0x010f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0115  */
    /* JADX WARN: Code duplicated, block: B:96:0x0118  */
    public static final void t(final mt0 mt0Var, final Animatable<Float, qr> animatable, final ta2 ta2Var, final Function0<Unit> function0, final Function1<? super Float, Unit> function1, androidx.compose.ui.b bVar, SheetState sheetState, float f, boolean z, xkb xkbVar, long j, long j2, float f2, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, Function2<? super androidx.compose.p004runtime.d, ? super Integer, ? extends g1> function3, final ps4<? super xj1, ? super androidx.compose.p004runtime.d, ? super Integer, Unit> ps4Var, androidx.compose.p004runtime.d dVar, final int i, final int i2, final int i3) throws NoWhenBranchMatchedException {
        int i4;
        ta2 ta2Var2;
        int i5;
        int i6;
        int i7;
        int i8;
        androidx.compose.ui.b bVar2;
        int i9;
        final SheetState sheetStateT;
        int i10;
        float fK;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j3;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z2;
        final boolean z3;
        final long j4;
        final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function4;
        final float f3;
        final SheetState sheetState2;
        final androidx.compose.ui.b bVar3;
        androidx.compose.p004runtime.d dVar2;
        final xkb xkbVar2;
        final long j5;
        final float f4;
        final Function2<? super androidx.compose.p004runtime.d, ? super Integer, ? extends g1> function5;
        s6b s6bVarH;
        int i23;
        boolean z4;
        xkb xkbVarH;
        long jF;
        long jG;
        float fG;
        Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2B;
        int i24;
        androidx.compose.ui.b bVar4;
        float f5;
        int i25;
        long j6;
        xkb xkbVar3;
        Function2<? super androidx.compose.p004runtime.d, ? super Integer, ? extends g1> function6;
        final String strB;
        androidx.compose.ui.b bVarB;
        int i26;
        long j7;
        boolean z5;
        Object objR;
        boolean z6;
        boolean z7;
        Object objR2;
        boolean zX;
        Object objR3;
        boolean z8;
        boolean z9;
        Object objR4;
        boolean z10;
        Object objR5;
        int i27;
        int i28;
        androidx.compose.p004runtime.d dVarF = dVar.F(-37400432);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (dVarF.x(mt0Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 1) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= (i & 64) == 0 ? dVarF.x(animatable) : dVarF.T(animatable) ? 32 : 16;
        }
        if ((i3 & 2) == 0) {
            if ((i & 384) == 0) {
                ta2Var2 = ta2Var;
                i4 |= dVarF.T(ta2Var2) ? 256 : 128;
            }
            if ((i3 & 4) != 0) {
                if ((i & 3072) == 0) {
                    if (dVarF.T(function0)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i4 |= i5;
                }
                i6 = 8192;
                if ((i3 & 8) != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    if (dVarF.T(function1)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i4 |= i7;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    i4 |= 196608;
                    bVar2 = bVar;
                } else {
                    bVar2 = bVar;
                    if ((i & 196608) == 0) {
                        if (dVarF.x(bVar2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i4 |= i9;
                    }
                }
                if ((i & 1572864) == 0) {
                    sheetStateT = sheetState;
                    if ((i3 & 32) == 0 || !dVarF.x(sheetStateT)) {
                        i28 = 524288;
                    } else {
                        i28 = 1048576;
                    }
                    i4 |= i28;
                } else {
                    sheetStateT = sheetState;
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                    i4 |= 12582912;
                    fK = f;
                } else {
                    fK = f;
                    if ((i & 12582912) == 0) {
                        if (dVarF.B(fK)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i4 |= i11;
                    }
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (dVarF.A(z)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i4 |= i13;
                }
                if ((i & 805306368) != 0) {
                    i4 |= ((i3 & 256) == 0 || !dVarF.x(xkbVar)) ? 268435456 : 536870912;
                }
                if ((i2 & 6) == 0) {
                    if ((i3 & 512) == 0) {
                        i14 = i4;
                        int i29 = dVarF.D(j) ? 4 : 2;
                        i15 = i2 | i29;
                    } else {
                        i14 = i4;
                    }
                    i15 = i2 | i29;
                } else {
                    i14 = i4;
                    i15 = i2;
                }
                if ((i2 & 48) == 0) {
                    j3 = j2;
                    if ((i3 & 1024) == 0 || !dVarF.D(j3)) {
                        i27 = 16;
                    } else {
                        i27 = 32;
                    }
                    i15 |= i27;
                } else {
                    j3 = j2;
                }
                i16 = i15;
                i17 = i3 & 2048;
                if (i17 != 0) {
                    i18 = i16 | 384;
                } else if ((i2 & 384) == 0) {
                    if (dVarF.B(f2)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i18 = i16 | i19;
                } else {
                    i18 = i16;
                }
                i20 = i3 & 4096;
                if (i20 != 0) {
                    i22 = i18 | 3072;
                } else {
                    i21 = i18;
                    if ((i2 & 3072) == 0) {
                        i22 = i21 | (dVarF.T(function2) ? 2048 : 1024);
                    } else {
                        i22 = i21;
                    }
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 8192) == 0 && dVarF.T(function3)) {
                        i6 = 16384;
                    }
                    i22 |= i6;
                }
                if ((i3 & 16384) != 0) {
                    if ((i2 & 196608) == 0) {
                        i22 |= dVarF.T(ps4Var) ? 131072 : 65536;
                    }
                    if ((i14 & 306783379) == 306783378 || (i22 & 74899) != 74898) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (dVarF.g(z2, i14 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0 || dVarF.t()) {
                            if (i8 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if ((i3 & 32) != 0) {
                                sheetStateT = T(false, null, dVarF, 0, 3);
                                i23 = i14 & (-3670017);
                            }
                            if (i10 != 0) {
                                i23 = i14;
                                fK = ss0.a.k();
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 256) != 0) {
                                xkbVarH = ss0.a.h(dVarF, 6);
                                i23 &= -1879048193;
                            } else {
                                xkbVarH = xkbVar;
                            }
                            if ((i3 & 512) != 0) {
                                i22 &= -15;
                                jF = ss0.a.f(dVarF, 6);
                            } else {
                                jF = j;
                            }
                            if ((i3 & 1024) != 0) {
                                jG = bj1.g(jF, dVarF, i22 & 14);
                                i22 &= -113;
                            } else {
                                jG = j2;
                            }
                            if (i17 != 0) {
                                fG = ss0.a.g();
                            } else {
                                fG = f2;
                            }
                            if (i20 != 0) {
                                function2B = fp1.a.b();
                            } else {
                                function2B = function2;
                            }
                            if ((i3 & 8192) != 0) {
                                androidx.compose.ui.b bVar5 = bVar2;
                                i24 = i23;
                                bVar4 = bVar5;
                                xkb xkbVar4 = xkbVarH;
                                function6 = c.a;
                                f5 = fK;
                                j6 = jF;
                                xkbVar3 = xkbVar4;
                                i25 = i22 & (-57345);
                            } else {
                                androidx.compose.ui.b bVar6 = bVar2;
                                i24 = i23;
                                bVar4 = bVar6;
                                f5 = fK;
                                i25 = i22;
                                j6 = jF;
                                xkbVar3 = xkbVarH;
                                function6 = function3;
                            }
                        } else {
                            dVarF.q();
                            int i30 = (i3 & 32) != 0 ? i14 & (-3670017) : i14;
                            if ((i3 & 256) != 0) {
                                i30 &= -1879048193;
                            }
                            if ((i3 & 512) != 0) {
                                i22 &= -15;
                            }
                            if ((i3 & 1024) != 0) {
                                i22 &= -113;
                            }
                            if ((i3 & 8192) != 0) {
                                i22 &= -57345;
                            }
                            androidx.compose.ui.b bVar7 = bVar2;
                            i24 = i30;
                            bVar4 = bVar7;
                            z4 = z;
                            fG = f2;
                            function2B = function2;
                            function6 = function3;
                            jG = j3;
                            f5 = fK;
                            i25 = i22;
                            xkbVar3 = xkbVar;
                            j6 = j;
                        }
                        dVarF.M();
                        float f6 = fG;
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-37400432, i24, i25, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:272)");
                        }
                        rbc.Companion companion = rbc.INSTANCE;
                        strB = vbc.b(rbc.a(wz9.e), dVarF, 0);
                        androidx.compose.ui.b bVar8 = bVar4;
                        int i31 = i25;
                        androidx.compose.ui.b bVarH = SizeKt.h(SizeKt.A(mt0Var.k(bVar4, tc.INSTANCE.m()), 0.0f, f5, 1, null), 0.0f, 1, null);
                        if (z4) {
                            dVarF.y(-1582035383);
                            androidx.compose.ui.b.Companion companion2 = androidx.compose.ui.b.INSTANCE;
                            z10 = (((i24 & 3670016) ^ 1572864) <= 1048576 && dVarF.x(sheetStateT)) || (i24 & 1572864) == 1048576;
                            objR5 = dVarF.R();
                            if (z10 || objR5 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR5 = m1.f(sheetStateT, Orientation.Vertical, function1);
                                dVarF.L(objR5);
                            }
                            bVarB = ue8.b(companion2, (re8) objR5, null, 2, null);
                            dVarF.u();
                        } else {
                            dVarF.y(-1582020872);
                            dVarF.u();
                            bVarB = androidx.compose.ui.b.INSTANCE;
                        }
                        androidx.compose.ui.b bVarThen = bVarH.then(bVarB);
                        AnchoredDraggableState<SheetValue> anchoredDraggableStateH = sheetStateT.h();
                        Orientation orientation = Orientation.Vertical;
                        i26 = (i24 & 3670016) ^ 1572864;
                        if (i26 > 1048576 || !dVarF.x(sheetStateT)) {
                            j7 = j6;
                            if ((i24 & 1572864) != 1048576) {
                                z5 = false;
                            }
                            objR = dVarF.R();
                            if (z5 || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR = new Function2() { // from class: com.google.android.gx7
                                    public final Object invoke(Object obj, Object obj2) {
                                        return ModalBottomSheetKt.u(sheetStateT, (q16) obj, (kx1) obj2);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            androidx.compose.ui.b bVarE = AnchoredDraggableKt.e(bVarThen, anchoredDraggableStateH, orientation, (Function2) objR);
                            og3 draggableState = sheetStateT.h().getDraggableState();
                            if (z4 || !sheetStateT.q()) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            boolean z11 = sheetStateT.h().z();
                            if ((i24 & 57344) == 16384) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            objR2 = dVarF.R();
                            if (z7 || objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR2 = new C0195ModalBottomSheetKt$ModalBottomSheetContent$4$1(function1, null);
                                dVarF.L(objR2);
                            }
                            androidx.compose.ui.b bVarG = DraggableKt.g(bVarE, draggableState, orientation, z6, null, z11, null, (ps4) objR2, false, 168, null);
                            zX = dVarF.x(strB);
                            objR3 = dVarF.R();
                            if (zX || objR3 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR3 = new Function1() { // from class: com.google.android.hx7
                                    public final Object invoke(Object obj) {
                                        return ModalBottomSheetKt.w(strB, (nfb) obj);
                                    }
                                };
                                dVarF.L(objR3);
                            }
                            androidx.compose.ui.b bVarA = WindowInsetsPaddingKt.a(afb.d(bVarG, false, (Function1) objR3, 1, null), rje.c(0, g.e((int) sheetStateT.l(), 0), 0, 0, 13, null));
                            boolean z12 = (i26 <= 1048576 && dVarF.x(sheetStateT)) || (i24 & 1572864) == 1048576;
                            if ((i24 & 112) != 32 || ((i24 & 64) != 0 && dVarF.T(animatable))) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            z9 = z12 | z8;
                            objR4 = dVarF.R();
                            if (z9 || objR4 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR4 = new Function1() { // from class: com.google.android.ix7
                                    public final Object invoke(Object obj) {
                                        return ModalBottomSheetKt.x(sheetStateT, animatable, (m) obj);
                                    }
                                };
                                dVarF.L(objR4);
                            }
                            SheetState sheetState3 = sheetStateT;
                            boolean z13 = z4;
                            Function2<? super androidx.compose.p004runtime.d, ? super Integer, ? extends g1> function7 = function6;
                            Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function8 = function2B;
                            int i32 = i31 << 6;
                            xkb xkbVar5 = xkbVar3;
                            long j8 = jG;
                            afc.c(vs0.e(l.c(bVarA, (Function1) objR4), sheetStateT), xkbVar5, j7, j8, f6, 0.0f, null, ko1.e(728743275, true, new ModalBottomSheetKt$ModalBottomSheetContent$7(function7, animatable, sheetState3, function8, ps4Var, function0, ta2Var2, z13), dVarF, 54), dVarF, ((i24 >> 24) & 112) | 12582912 | (i32 & 896) | (i32 & 7168) | (57344 & i32), 96);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            z3 = z13;
                            sheetState2 = sheetState3;
                            function4 = function8;
                            xkbVar2 = xkbVar5;
                            f4 = f6;
                            dVar2 = dVarF;
                            f3 = f5;
                            function5 = function7;
                            j4 = j8;
                            bVar3 = bVar8;
                            j5 = j7;
                        } else {
                            j7 = j6;
                        }
                        z5 = true;
                        objR = dVarF.R();
                        if (z5) {
                            objR = new Function2() { // from class: com.google.android.gx7
                                public final Object invoke(Object obj, Object obj2) {
                                    return ModalBottomSheetKt.u(sheetStateT, (q16) obj, (kx1) obj2);
                                }
                            };
                            dVarF.L(objR);
                        } else {
                            objR = new Function2() { // from class: com.google.android.gx7
                                public final Object invoke(Object obj, Object obj2) {
                                    return ModalBottomSheetKt.u(sheetStateT, (q16) obj, (kx1) obj2);
                                }
                            };
                            dVarF.L(objR);
                        }
                        androidx.compose.ui.b bVarE2 = AnchoredDraggableKt.e(bVarThen, anchoredDraggableStateH, orientation, (Function2) objR);
                        og3 draggableState2 = sheetStateT.h().getDraggableState();
                        if (z4) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        boolean z14 = sheetStateT.h().z();
                        if ((i24 & 57344) == 16384) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        objR2 = dVarF.R();
                        if (z7) {
                            objR2 = new C0195ModalBottomSheetKt$ModalBottomSheetContent$4$1(function1, null);
                            dVarF.L(objR2);
                        } else {
                            objR2 = new C0195ModalBottomSheetKt$ModalBottomSheetContent$4$1(function1, null);
                            dVarF.L(objR2);
                        }
                        androidx.compose.ui.b bVarG2 = DraggableKt.g(bVarE2, draggableState2, orientation, z6, null, z14, null, (ps4) objR2, false, 168, null);
                        zX = dVarF.x(strB);
                        objR3 = dVarF.R();
                        if (zX) {
                            objR3 = new Function1() { // from class: com.google.android.hx7
                                public final Object invoke(Object obj) {
                                    return ModalBottomSheetKt.w(strB, (nfb) obj);
                                }
                            };
                            dVarF.L(objR3);
                        } else {
                            objR3 = new Function1() { // from class: com.google.android.hx7
                                public final Object invoke(Object obj) {
                                    return ModalBottomSheetKt.w(strB, (nfb) obj);
                                }
                            };
                            dVarF.L(objR3);
                        }
                        androidx.compose.ui.b bVarA2 = WindowInsetsPaddingKt.a(afb.d(bVarG2, false, (Function1) objR3, 1, null), rje.c(0, g.e((int) sheetStateT.l(), 0), 0, 0, 13, null));
                        if (i26 <= 1048576) {
                        }
                        if ((i24 & 112) != 32) {
                            z8 = true;
                        } else {
                            z8 = true;
                        }
                        z9 = z12 | z8;
                        objR4 = dVarF.R();
                        if (z9) {
                            objR4 = new Function1() { // from class: com.google.android.ix7
                                public final Object invoke(Object obj) {
                                    return ModalBottomSheetKt.x(sheetStateT, animatable, (m) obj);
                                }
                            };
                            dVarF.L(objR4);
                        } else {
                            objR4 = new Function1() { // from class: com.google.android.ix7
                                public final Object invoke(Object obj) {
                                    return ModalBottomSheetKt.x(sheetStateT, animatable, (m) obj);
                                }
                            };
                            dVarF.L(objR4);
                        }
                        SheetState sheetState4 = sheetStateT;
                        boolean z15 = z4;
                        Function2<? super androidx.compose.p004runtime.d, ? super Integer, ? extends g1> function9 = function6;
                        Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function10 = function2B;
                        int i33 = i31 << 6;
                        xkb xkbVar6 = xkbVar3;
                        long j9 = jG;
                        afc.c(vs0.e(l.c(bVarA2, (Function1) objR4), sheetStateT), xkbVar6, j7, j9, f6, 0.0f, null, ko1.e(728743275, true, new ModalBottomSheetKt$ModalBottomSheetContent$7(function9, animatable, sheetState4, function10, ps4Var, function0, ta2Var2, z15), dVarF, 54), dVarF, ((i24 >> 24) & 112) | 12582912 | (i33 & 896) | (i33 & 7168) | (57344 & i33), 96);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        z3 = z15;
                        sheetState2 = sheetState4;
                        function4 = function10;
                        xkbVar2 = xkbVar6;
                        f4 = f6;
                        dVar2 = dVarF;
                        f3 = f5;
                        function5 = function9;
                        j4 = j9;
                        bVar3 = bVar8;
                        j5 = j7;
                    } else {
                        dVarF.q();
                        z3 = z;
                        j4 = j2;
                        function4 = function2;
                        f3 = fK;
                        sheetState2 = sheetStateT;
                        bVar3 = bVar2;
                        dVar2 = dVarF;
                        xkbVar2 = xkbVar;
                        j5 = j;
                        f4 = f2;
                        function5 = function3;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.jx7
                            public final Object invoke(Object obj, Object obj2) {
                                return ModalBottomSheetKt.y(mt0Var, animatable, ta2Var, function0, function1, bVar3, sheetState2, f3, z3, xkbVar2, j5, j4, f4, function4, function5, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i22 |= 196608;
                if ((i14 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (dVarF.g(z2, i14 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if ((i3 & 32) != 0) {
                            sheetStateT = T(false, null, dVarF, 0, 3);
                            i23 = i14 & (-3670017);
                        }
                        if (i10 != 0) {
                            i23 = i14;
                            fK = ss0.a.k();
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 256) != 0) {
                            xkbVarH = ss0.a.h(dVarF, 6);
                            i23 &= -1879048193;
                        } else {
                            xkbVarH = xkbVar;
                        }
                        if ((i3 & 512) != 0) {
                            i22 &= -15;
                            jF = ss0.a.f(dVarF, 6);
                        } else {
                            jF = j;
                        }
                        if ((i3 & 1024) != 0) {
                            jG = bj1.g(jF, dVarF, i22 & 14);
                            i22 &= -113;
                        } else {
                            jG = j2;
                        }
                        if (i17 != 0) {
                            fG = ss0.a.g();
                        } else {
                            fG = f2;
                        }
                        if (i20 != 0) {
                            function2B = fp1.a.b();
                        } else {
                            function2B = function2;
                        }
                        if ((i3 & 8192) != 0) {
                            androidx.compose.ui.b bVar9 = bVar2;
                            i24 = i23;
                            bVar4 = bVar9;
                            xkb xkbVar7 = xkbVarH;
                            function6 = c.a;
                            f5 = fK;
                            j6 = jF;
                            xkbVar3 = xkbVar7;
                            i25 = i22 & (-57345);
                        } else {
                            androidx.compose.ui.b bVar10 = bVar2;
                            i24 = i23;
                            bVar4 = bVar10;
                            f5 = fK;
                            i25 = i22;
                            j6 = jF;
                            xkbVar3 = xkbVarH;
                            function6 = function3;
                        }
                    } else {
                        if (i8 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if ((i3 & 32) != 0) {
                            sheetStateT = T(false, null, dVarF, 0, 3);
                            i23 = i14 & (-3670017);
                        }
                        if (i10 != 0) {
                            i23 = i14;
                            fK = ss0.a.k();
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 256) != 0) {
                            xkbVarH = ss0.a.h(dVarF, 6);
                            i23 &= -1879048193;
                        } else {
                            xkbVarH = xkbVar;
                        }
                        if ((i3 & 512) != 0) {
                            i22 &= -15;
                            jF = ss0.a.f(dVarF, 6);
                        } else {
                            jF = j;
                        }
                        if ((i3 & 1024) != 0) {
                            jG = bj1.g(jF, dVarF, i22 & 14);
                            i22 &= -113;
                        } else {
                            jG = j2;
                        }
                        if (i17 != 0) {
                            fG = ss0.a.g();
                        } else {
                            fG = f2;
                        }
                        if (i20 != 0) {
                            function2B = fp1.a.b();
                        } else {
                            function2B = function2;
                        }
                        if ((i3 & 8192) != 0) {
                            androidx.compose.ui.b bVar11 = bVar2;
                            i24 = i23;
                            bVar4 = bVar11;
                            xkb xkbVar8 = xkbVarH;
                            function6 = c.a;
                            f5 = fK;
                            j6 = jF;
                            xkbVar3 = xkbVar8;
                            i25 = i22 & (-57345);
                        } else {
                            androidx.compose.ui.b bVar12 = bVar2;
                            i24 = i23;
                            bVar4 = bVar12;
                            f5 = fK;
                            i25 = i22;
                            j6 = jF;
                            xkbVar3 = xkbVarH;
                            function6 = function3;
                        }
                    }
                    dVarF.M();
                    float f7 = fG;
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-37400432, i24, i25, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:272)");
                    }
                    rbc.Companion companion3 = rbc.INSTANCE;
                    strB = vbc.b(rbc.a(wz9.e), dVarF, 0);
                    androidx.compose.ui.b bVar13 = bVar4;
                    int i34 = i25;
                    androidx.compose.ui.b bVarH2 = SizeKt.h(SizeKt.A(mt0Var.k(bVar4, tc.INSTANCE.m()), 0.0f, f5, 1, null), 0.0f, 1, null);
                    if (z4) {
                        dVarF.y(-1582035383);
                        androidx.compose.ui.b.Companion companion4 = androidx.compose.ui.b.INSTANCE;
                        if (((i24 & 3670016) ^ 1572864) <= 1048576) {
                        }
                        objR5 = dVarF.R();
                        if (z10) {
                            objR5 = m1.f(sheetStateT, Orientation.Vertical, function1);
                            dVarF.L(objR5);
                        } else {
                            objR5 = m1.f(sheetStateT, Orientation.Vertical, function1);
                            dVarF.L(objR5);
                        }
                        bVarB = ue8.b(companion4, (re8) objR5, null, 2, null);
                        dVarF.u();
                    } else {
                        dVarF.y(-1582020872);
                        dVarF.u();
                        bVarB = androidx.compose.ui.b.INSTANCE;
                    }
                    androidx.compose.ui.b bVarThen2 = bVarH2.then(bVarB);
                    AnchoredDraggableState<SheetValue> anchoredDraggableStateH2 = sheetStateT.h();
                    Orientation orientation2 = Orientation.Vertical;
                    i26 = (i24 & 3670016) ^ 1572864;
                    if (i26 > 1048576) {
                        j7 = j6;
                        if ((i24 & 1572864) != 1048576) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                    } else {
                        j7 = j6;
                        if ((i24 & 1572864) != 1048576) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                    }
                    objR = dVarF.R();
                    if (z5) {
                        objR = new Function2() { // from class: com.google.android.gx7
                            public final Object invoke(Object obj, Object obj2) {
                                return ModalBottomSheetKt.u(sheetStateT, (q16) obj, (kx1) obj2);
                            }
                        };
                        dVarF.L(objR);
                    } else {
                        objR = new Function2() { // from class: com.google.android.gx7
                            public final Object invoke(Object obj, Object obj2) {
                                return ModalBottomSheetKt.u(sheetStateT, (q16) obj, (kx1) obj2);
                            }
                        };
                        dVarF.L(objR);
                    }
                    androidx.compose.ui.b bVarE3 = AnchoredDraggableKt.e(bVarThen2, anchoredDraggableStateH2, orientation2, (Function2) objR);
                    og3 draggableState3 = sheetStateT.h().getDraggableState();
                    if (z4) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    boolean z16 = sheetStateT.h().z();
                    if ((i24 & 57344) == 16384) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    objR2 = dVarF.R();
                    if (z7) {
                        objR2 = new C0195ModalBottomSheetKt$ModalBottomSheetContent$4$1(function1, null);
                        dVarF.L(objR2);
                    } else {
                        objR2 = new C0195ModalBottomSheetKt$ModalBottomSheetContent$4$1(function1, null);
                        dVarF.L(objR2);
                    }
                    androidx.compose.ui.b bVarG3 = DraggableKt.g(bVarE3, draggableState3, orientation2, z6, null, z16, null, (ps4) objR2, false, 168, null);
                    zX = dVarF.x(strB);
                    objR3 = dVarF.R();
                    if (zX) {
                        objR3 = new Function1() { // from class: com.google.android.hx7
                            public final Object invoke(Object obj) {
                                return ModalBottomSheetKt.w(strB, (nfb) obj);
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function1() { // from class: com.google.android.hx7
                            public final Object invoke(Object obj) {
                                return ModalBottomSheetKt.w(strB, (nfb) obj);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    androidx.compose.ui.b bVarA3 = WindowInsetsPaddingKt.a(afb.d(bVarG3, false, (Function1) objR3, 1, null), rje.c(0, g.e((int) sheetStateT.l(), 0), 0, 0, 13, null));
                    if (i26 <= 1048576) {
                    }
                    if ((i24 & 112) != 32) {
                        z8 = true;
                    } else {
                        z8 = true;
                    }
                    z9 = z12 | z8;
                    objR4 = dVarF.R();
                    if (z9) {
                        objR4 = new Function1() { // from class: com.google.android.ix7
                            public final Object invoke(Object obj) {
                                return ModalBottomSheetKt.x(sheetStateT, animatable, (m) obj);
                            }
                        };
                        dVarF.L(objR4);
                    } else {
                        objR4 = new Function1() { // from class: com.google.android.ix7
                            public final Object invoke(Object obj) {
                                return ModalBottomSheetKt.x(sheetStateT, animatable, (m) obj);
                            }
                        };
                        dVarF.L(objR4);
                    }
                    SheetState sheetState5 = sheetStateT;
                    boolean z17 = z4;
                    Function2<? super androidx.compose.p004runtime.d, ? super Integer, ? extends g1> function11 = function6;
                    Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function12 = function2B;
                    int i35 = i34 << 6;
                    xkb xkbVar9 = xkbVar3;
                    long j10 = jG;
                    afc.c(vs0.e(l.c(bVarA3, (Function1) objR4), sheetStateT), xkbVar9, j7, j10, f7, 0.0f, null, ko1.e(728743275, true, new ModalBottomSheetKt$ModalBottomSheetContent$7(function11, animatable, sheetState5, function12, ps4Var, function0, ta2Var2, z17), dVarF, 54), dVarF, ((i24 >> 24) & 112) | 12582912 | (i35 & 896) | (i35 & 7168) | (57344 & i35), 96);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    z3 = z17;
                    sheetState2 = sheetState5;
                    function4 = function12;
                    xkbVar2 = xkbVar9;
                    f4 = f7;
                    dVar2 = dVarF;
                    f3 = f5;
                    function5 = function11;
                    j4 = j10;
                    bVar3 = bVar13;
                    j5 = j7;
                } else {
                    dVarF.q();
                    z3 = z;
                    j4 = j2;
                    function4 = function2;
                    f3 = fK;
                    sheetState2 = sheetStateT;
                    bVar3 = bVar2;
                    dVar2 = dVarF;
                    xkbVar2 = xkbVar;
                    j5 = j;
                    f4 = f2;
                    function5 = function3;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.jx7
                        public final Object invoke(Object obj, Object obj2) {
                            return ModalBottomSheetKt.y(mt0Var, animatable, ta2Var, function0, function1, bVar3, sheetState2, f3, z3, xkbVar2, j5, j4, f4, function4, function5, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 3072;
            i6 = 8192;
            if ((i3 & 8) != 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                if (dVarF.T(function1)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i4 |= i7;
            }
            i8 = i3 & 16;
            if (i8 != 0) {
                i4 |= 196608;
                bVar2 = bVar;
            } else {
                bVar2 = bVar;
                if ((i & 196608) == 0) {
                    if (dVarF.x(bVar2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
            }
            if ((i & 1572864) == 0) {
                sheetStateT = sheetState;
                if ((i3 & 32) == 0) {
                    i28 = 524288;
                } else {
                    i28 = 524288;
                }
                i4 |= i28;
            } else {
                sheetStateT = sheetState;
            }
            i10 = i3 & 64;
            if (i10 != 0) {
                i4 |= 12582912;
                fK = f;
            } else {
                fK = f;
                if ((i & 12582912) == 0) {
                    if (dVarF.B(fK)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i4 |= i11;
                }
            }
            i12 = i3 & 128;
            if (i12 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (dVarF.A(z)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i4 |= i13;
            }
            if ((i & 805306368) != 0) {
                i4 |= ((i3 & 256) == 0 || !dVarF.x(xkbVar)) ? 268435456 : 536870912;
            }
            if ((i2 & 6) == 0) {
                if ((i3 & 512) == 0) {
                    i14 = i4;
                    if (dVarF.D(j)) {
                    }
                    i15 = i2 | i29;
                } else {
                    i14 = i4;
                }
                i15 = i2 | i29;
            } else {
                i14 = i4;
                i15 = i2;
            }
            if ((i2 & 48) == 0) {
                j3 = j2;
                if ((i3 & 1024) == 0) {
                    i27 = 16;
                } else {
                    i27 = 16;
                }
                i15 |= i27;
            } else {
                j3 = j2;
            }
            i16 = i15;
            i17 = i3 & 2048;
            if (i17 != 0) {
                i18 = i16 | 384;
            } else if ((i2 & 384) == 0) {
                if (dVarF.B(f2)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i18 = i16 | i19;
            } else {
                i18 = i16;
            }
            i20 = i3 & 4096;
            if (i20 != 0) {
                i22 = i18 | 3072;
            } else {
                i21 = i18;
                if ((i2 & 3072) == 0) {
                    i22 = i21 | (dVarF.T(function2) ? 2048 : 1024);
                } else {
                    i22 = i21;
                }
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 8192) == 0) {
                    i6 = 16384;
                }
                i22 |= i6;
            }
            if ((i3 & 16384) != 0) {
                if ((i2 & 196608) == 0) {
                    i22 |= dVarF.T(ps4Var) ? 131072 : 65536;
                }
                if ((i14 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (dVarF.g(z2, i14 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if ((i3 & 32) != 0) {
                            sheetStateT = T(false, null, dVarF, 0, 3);
                            i23 = i14 & (-3670017);
                        }
                        if (i10 != 0) {
                            i23 = i14;
                            fK = ss0.a.k();
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 256) != 0) {
                            xkbVarH = ss0.a.h(dVarF, 6);
                            i23 &= -1879048193;
                        } else {
                            xkbVarH = xkbVar;
                        }
                        if ((i3 & 512) != 0) {
                            i22 &= -15;
                            jF = ss0.a.f(dVarF, 6);
                        } else {
                            jF = j;
                        }
                        if ((i3 & 1024) != 0) {
                            jG = bj1.g(jF, dVarF, i22 & 14);
                            i22 &= -113;
                        } else {
                            jG = j2;
                        }
                        if (i17 != 0) {
                            fG = ss0.a.g();
                        } else {
                            fG = f2;
                        }
                        if (i20 != 0) {
                            function2B = fp1.a.b();
                        } else {
                            function2B = function2;
                        }
                        if ((i3 & 8192) != 0) {
                            androidx.compose.ui.b bVar14 = bVar2;
                            i24 = i23;
                            bVar4 = bVar14;
                            xkb xkbVar10 = xkbVarH;
                            function6 = c.a;
                            f5 = fK;
                            j6 = jF;
                            xkbVar3 = xkbVar10;
                            i25 = i22 & (-57345);
                        } else {
                            androidx.compose.ui.b bVar15 = bVar2;
                            i24 = i23;
                            bVar4 = bVar15;
                            f5 = fK;
                            i25 = i22;
                            j6 = jF;
                            xkbVar3 = xkbVarH;
                            function6 = function3;
                        }
                    } else {
                        if (i8 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if ((i3 & 32) != 0) {
                            sheetStateT = T(false, null, dVarF, 0, 3);
                            i23 = i14 & (-3670017);
                        }
                        if (i10 != 0) {
                            i23 = i14;
                            fK = ss0.a.k();
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 256) != 0) {
                            xkbVarH = ss0.a.h(dVarF, 6);
                            i23 &= -1879048193;
                        } else {
                            xkbVarH = xkbVar;
                        }
                        if ((i3 & 512) != 0) {
                            i22 &= -15;
                            jF = ss0.a.f(dVarF, 6);
                        } else {
                            jF = j;
                        }
                        if ((i3 & 1024) != 0) {
                            jG = bj1.g(jF, dVarF, i22 & 14);
                            i22 &= -113;
                        } else {
                            jG = j2;
                        }
                        if (i17 != 0) {
                            fG = ss0.a.g();
                        } else {
                            fG = f2;
                        }
                        if (i20 != 0) {
                            function2B = fp1.a.b();
                        } else {
                            function2B = function2;
                        }
                        if ((i3 & 8192) != 0) {
                            androidx.compose.ui.b bVar16 = bVar2;
                            i24 = i23;
                            bVar4 = bVar16;
                            xkb xkbVar11 = xkbVarH;
                            function6 = c.a;
                            f5 = fK;
                            j6 = jF;
                            xkbVar3 = xkbVar11;
                            i25 = i22 & (-57345);
                        } else {
                            androidx.compose.ui.b bVar17 = bVar2;
                            i24 = i23;
                            bVar4 = bVar17;
                            f5 = fK;
                            i25 = i22;
                            j6 = jF;
                            xkbVar3 = xkbVarH;
                            function6 = function3;
                        }
                    }
                    dVarF.M();
                    float f8 = fG;
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-37400432, i24, i25, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:272)");
                    }
                    rbc.Companion companion5 = rbc.INSTANCE;
                    strB = vbc.b(rbc.a(wz9.e), dVarF, 0);
                    androidx.compose.ui.b bVar18 = bVar4;
                    int i36 = i25;
                    androidx.compose.ui.b bVarH3 = SizeKt.h(SizeKt.A(mt0Var.k(bVar4, tc.INSTANCE.m()), 0.0f, f5, 1, null), 0.0f, 1, null);
                    if (z4) {
                        dVarF.y(-1582035383);
                        androidx.compose.ui.b.Companion companion6 = androidx.compose.ui.b.INSTANCE;
                        if (((i24 & 3670016) ^ 1572864) <= 1048576) {
                        }
                        objR5 = dVarF.R();
                        if (z10) {
                            objR5 = m1.f(sheetStateT, Orientation.Vertical, function1);
                            dVarF.L(objR5);
                        } else {
                            objR5 = m1.f(sheetStateT, Orientation.Vertical, function1);
                            dVarF.L(objR5);
                        }
                        bVarB = ue8.b(companion6, (re8) objR5, null, 2, null);
                        dVarF.u();
                    } else {
                        dVarF.y(-1582020872);
                        dVarF.u();
                        bVarB = androidx.compose.ui.b.INSTANCE;
                    }
                    androidx.compose.ui.b bVarThen3 = bVarH3.then(bVarB);
                    AnchoredDraggableState<SheetValue> anchoredDraggableStateH3 = sheetStateT.h();
                    Orientation orientation3 = Orientation.Vertical;
                    i26 = (i24 & 3670016) ^ 1572864;
                    if (i26 > 1048576) {
                        j7 = j6;
                        if ((i24 & 1572864) != 1048576) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                    } else {
                        j7 = j6;
                        if ((i24 & 1572864) != 1048576) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                    }
                    objR = dVarF.R();
                    if (z5) {
                        objR = new Function2() { // from class: com.google.android.gx7
                            public final Object invoke(Object obj, Object obj2) {
                                return ModalBottomSheetKt.u(sheetStateT, (q16) obj, (kx1) obj2);
                            }
                        };
                        dVarF.L(objR);
                    } else {
                        objR = new Function2() { // from class: com.google.android.gx7
                            public final Object invoke(Object obj, Object obj2) {
                                return ModalBottomSheetKt.u(sheetStateT, (q16) obj, (kx1) obj2);
                            }
                        };
                        dVarF.L(objR);
                    }
                    androidx.compose.ui.b bVarE4 = AnchoredDraggableKt.e(bVarThen3, anchoredDraggableStateH3, orientation3, (Function2) objR);
                    og3 draggableState4 = sheetStateT.h().getDraggableState();
                    if (z4) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    boolean z18 = sheetStateT.h().z();
                    if ((i24 & 57344) == 16384) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    objR2 = dVarF.R();
                    if (z7) {
                        objR2 = new C0195ModalBottomSheetKt$ModalBottomSheetContent$4$1(function1, null);
                        dVarF.L(objR2);
                    } else {
                        objR2 = new C0195ModalBottomSheetKt$ModalBottomSheetContent$4$1(function1, null);
                        dVarF.L(objR2);
                    }
                    androidx.compose.ui.b bVarG4 = DraggableKt.g(bVarE4, draggableState4, orientation3, z6, null, z18, null, (ps4) objR2, false, 168, null);
                    zX = dVarF.x(strB);
                    objR3 = dVarF.R();
                    if (zX) {
                        objR3 = new Function1() { // from class: com.google.android.hx7
                            public final Object invoke(Object obj) {
                                return ModalBottomSheetKt.w(strB, (nfb) obj);
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function1() { // from class: com.google.android.hx7
                            public final Object invoke(Object obj) {
                                return ModalBottomSheetKt.w(strB, (nfb) obj);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    androidx.compose.ui.b bVarA4 = WindowInsetsPaddingKt.a(afb.d(bVarG4, false, (Function1) objR3, 1, null), rje.c(0, g.e((int) sheetStateT.l(), 0), 0, 0, 13, null));
                    if (i26 <= 1048576) {
                    }
                    if ((i24 & 112) != 32) {
                        z8 = true;
                    } else {
                        z8 = true;
                    }
                    z9 = z12 | z8;
                    objR4 = dVarF.R();
                    if (z9) {
                        objR4 = new Function1() { // from class: com.google.android.ix7
                            public final Object invoke(Object obj) {
                                return ModalBottomSheetKt.x(sheetStateT, animatable, (m) obj);
                            }
                        };
                        dVarF.L(objR4);
                    } else {
                        objR4 = new Function1() { // from class: com.google.android.ix7
                            public final Object invoke(Object obj) {
                                return ModalBottomSheetKt.x(sheetStateT, animatable, (m) obj);
                            }
                        };
                        dVarF.L(objR4);
                    }
                    SheetState sheetState6 = sheetStateT;
                    boolean z19 = z4;
                    Function2<? super androidx.compose.p004runtime.d, ? super Integer, ? extends g1> function13 = function6;
                    Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function14 = function2B;
                    int i37 = i36 << 6;
                    xkb xkbVar12 = xkbVar3;
                    long j11 = jG;
                    afc.c(vs0.e(l.c(bVarA4, (Function1) objR4), sheetStateT), xkbVar12, j7, j11, f8, 0.0f, null, ko1.e(728743275, true, new ModalBottomSheetKt$ModalBottomSheetContent$7(function13, animatable, sheetState6, function14, ps4Var, function0, ta2Var2, z19), dVarF, 54), dVarF, ((i24 >> 24) & 112) | 12582912 | (i37 & 896) | (i37 & 7168) | (57344 & i37), 96);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    z3 = z19;
                    sheetState2 = sheetState6;
                    function4 = function14;
                    xkbVar2 = xkbVar12;
                    f4 = f8;
                    dVar2 = dVarF;
                    f3 = f5;
                    function5 = function13;
                    j4 = j11;
                    bVar3 = bVar18;
                    j5 = j7;
                } else {
                    dVarF.q();
                    z3 = z;
                    j4 = j2;
                    function4 = function2;
                    f3 = fK;
                    sheetState2 = sheetStateT;
                    bVar3 = bVar2;
                    dVar2 = dVarF;
                    xkbVar2 = xkbVar;
                    j5 = j;
                    f4 = f2;
                    function5 = function3;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.jx7
                        public final Object invoke(Object obj, Object obj2) {
                            return ModalBottomSheetKt.y(mt0Var, animatable, ta2Var, function0, function1, bVar3, sheetState2, f3, z3, xkbVar2, j5, j4, f4, function4, function5, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i22 |= 196608;
            if ((i14 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (dVarF.g(z2, i14 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if ((i3 & 32) != 0) {
                        sheetStateT = T(false, null, dVarF, 0, 3);
                        i23 = i14 & (-3670017);
                    }
                    if (i10 != 0) {
                        i23 = i14;
                        fK = ss0.a.k();
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & 256) != 0) {
                        xkbVarH = ss0.a.h(dVarF, 6);
                        i23 &= -1879048193;
                    } else {
                        xkbVarH = xkbVar;
                    }
                    if ((i3 & 512) != 0) {
                        i22 &= -15;
                        jF = ss0.a.f(dVarF, 6);
                    } else {
                        jF = j;
                    }
                    if ((i3 & 1024) != 0) {
                        jG = bj1.g(jF, dVarF, i22 & 14);
                        i22 &= -113;
                    } else {
                        jG = j2;
                    }
                    if (i17 != 0) {
                        fG = ss0.a.g();
                    } else {
                        fG = f2;
                    }
                    if (i20 != 0) {
                        function2B = fp1.a.b();
                    } else {
                        function2B = function2;
                    }
                    if ((i3 & 8192) != 0) {
                        androidx.compose.ui.b bVar19 = bVar2;
                        i24 = i23;
                        bVar4 = bVar19;
                        xkb xkbVar13 = xkbVarH;
                        function6 = c.a;
                        f5 = fK;
                        j6 = jF;
                        xkbVar3 = xkbVar13;
                        i25 = i22 & (-57345);
                    } else {
                        androidx.compose.ui.b bVar110 = bVar2;
                        i24 = i23;
                        bVar4 = bVar110;
                        f5 = fK;
                        i25 = i22;
                        j6 = jF;
                        xkbVar3 = xkbVarH;
                        function6 = function3;
                    }
                } else {
                    if (i8 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if ((i3 & 32) != 0) {
                        sheetStateT = T(false, null, dVarF, 0, 3);
                        i23 = i14 & (-3670017);
                    }
                    if (i10 != 0) {
                        i23 = i14;
                        fK = ss0.a.k();
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & 256) != 0) {
                        xkbVarH = ss0.a.h(dVarF, 6);
                        i23 &= -1879048193;
                    } else {
                        xkbVarH = xkbVar;
                    }
                    if ((i3 & 512) != 0) {
                        i22 &= -15;
                        jF = ss0.a.f(dVarF, 6);
                    } else {
                        jF = j;
                    }
                    if ((i3 & 1024) != 0) {
                        jG = bj1.g(jF, dVarF, i22 & 14);
                        i22 &= -113;
                    } else {
                        jG = j2;
                    }
                    if (i17 != 0) {
                        fG = ss0.a.g();
                    } else {
                        fG = f2;
                    }
                    if (i20 != 0) {
                        function2B = fp1.a.b();
                    } else {
                        function2B = function2;
                    }
                    if ((i3 & 8192) != 0) {
                        androidx.compose.ui.b bVar111 = bVar2;
                        i24 = i23;
                        bVar4 = bVar111;
                        xkb xkbVar14 = xkbVarH;
                        function6 = c.a;
                        f5 = fK;
                        j6 = jF;
                        xkbVar3 = xkbVar14;
                        i25 = i22 & (-57345);
                    } else {
                        androidx.compose.ui.b bVar112 = bVar2;
                        i24 = i23;
                        bVar4 = bVar112;
                        f5 = fK;
                        i25 = i22;
                        j6 = jF;
                        xkbVar3 = xkbVarH;
                        function6 = function3;
                    }
                }
                dVarF.M();
                float f9 = fG;
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-37400432, i24, i25, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:272)");
                }
                rbc.Companion companion7 = rbc.INSTANCE;
                strB = vbc.b(rbc.a(wz9.e), dVarF, 0);
                androidx.compose.ui.b bVar113 = bVar4;
                int i38 = i25;
                androidx.compose.ui.b bVarH4 = SizeKt.h(SizeKt.A(mt0Var.k(bVar4, tc.INSTANCE.m()), 0.0f, f5, 1, null), 0.0f, 1, null);
                if (z4) {
                    dVarF.y(-1582035383);
                    androidx.compose.ui.b.Companion companion8 = androidx.compose.ui.b.INSTANCE;
                    if (((i24 & 3670016) ^ 1572864) <= 1048576) {
                    }
                    objR5 = dVarF.R();
                    if (z10) {
                        objR5 = m1.f(sheetStateT, Orientation.Vertical, function1);
                        dVarF.L(objR5);
                    } else {
                        objR5 = m1.f(sheetStateT, Orientation.Vertical, function1);
                        dVarF.L(objR5);
                    }
                    bVarB = ue8.b(companion8, (re8) objR5, null, 2, null);
                    dVarF.u();
                } else {
                    dVarF.y(-1582020872);
                    dVarF.u();
                    bVarB = androidx.compose.ui.b.INSTANCE;
                }
                androidx.compose.ui.b bVarThen4 = bVarH4.then(bVarB);
                AnchoredDraggableState<SheetValue> anchoredDraggableStateH4 = sheetStateT.h();
                Orientation orientation4 = Orientation.Vertical;
                i26 = (i24 & 3670016) ^ 1572864;
                if (i26 > 1048576) {
                    j7 = j6;
                    if ((i24 & 1572864) != 1048576) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                } else {
                    j7 = j6;
                    if ((i24 & 1572864) != 1048576) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                }
                objR = dVarF.R();
                if (z5) {
                    objR = new Function2() { // from class: com.google.android.gx7
                        public final Object invoke(Object obj, Object obj2) {
                            return ModalBottomSheetKt.u(sheetStateT, (q16) obj, (kx1) obj2);
                        }
                    };
                    dVarF.L(objR);
                } else {
                    objR = new Function2() { // from class: com.google.android.gx7
                        public final Object invoke(Object obj, Object obj2) {
                            return ModalBottomSheetKt.u(sheetStateT, (q16) obj, (kx1) obj2);
                        }
                    };
                    dVarF.L(objR);
                }
                androidx.compose.ui.b bVarE5 = AnchoredDraggableKt.e(bVarThen4, anchoredDraggableStateH4, orientation4, (Function2) objR);
                og3 draggableState5 = sheetStateT.h().getDraggableState();
                if (z4) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                boolean z110 = sheetStateT.h().z();
                if ((i24 & 57344) == 16384) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objR2 = dVarF.R();
                if (z7) {
                    objR2 = new C0195ModalBottomSheetKt$ModalBottomSheetContent$4$1(function1, null);
                    dVarF.L(objR2);
                } else {
                    objR2 = new C0195ModalBottomSheetKt$ModalBottomSheetContent$4$1(function1, null);
                    dVarF.L(objR2);
                }
                androidx.compose.ui.b bVarG5 = DraggableKt.g(bVarE5, draggableState5, orientation4, z6, null, z110, null, (ps4) objR2, false, 168, null);
                zX = dVarF.x(strB);
                objR3 = dVarF.R();
                if (zX) {
                    objR3 = new Function1() { // from class: com.google.android.hx7
                        public final Object invoke(Object obj) {
                            return ModalBottomSheetKt.w(strB, (nfb) obj);
                        }
                    };
                    dVarF.L(objR3);
                } else {
                    objR3 = new Function1() { // from class: com.google.android.hx7
                        public final Object invoke(Object obj) {
                            return ModalBottomSheetKt.w(strB, (nfb) obj);
                        }
                    };
                    dVarF.L(objR3);
                }
                androidx.compose.ui.b bVarA5 = WindowInsetsPaddingKt.a(afb.d(bVarG5, false, (Function1) objR3, 1, null), rje.c(0, g.e((int) sheetStateT.l(), 0), 0, 0, 13, null));
                if (i26 <= 1048576) {
                }
                if ((i24 & 112) != 32) {
                    z8 = true;
                } else {
                    z8 = true;
                }
                z9 = z12 | z8;
                objR4 = dVarF.R();
                if (z9) {
                    objR4 = new Function1() { // from class: com.google.android.ix7
                        public final Object invoke(Object obj) {
                            return ModalBottomSheetKt.x(sheetStateT, animatable, (m) obj);
                        }
                    };
                    dVarF.L(objR4);
                } else {
                    objR4 = new Function1() { // from class: com.google.android.ix7
                        public final Object invoke(Object obj) {
                            return ModalBottomSheetKt.x(sheetStateT, animatable, (m) obj);
                        }
                    };
                    dVarF.L(objR4);
                }
                SheetState sheetState7 = sheetStateT;
                boolean z111 = z4;
                Function2<? super androidx.compose.p004runtime.d, ? super Integer, ? extends g1> function15 = function6;
                Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function16 = function2B;
                int i39 = i38 << 6;
                xkb xkbVar15 = xkbVar3;
                long j12 = jG;
                afc.c(vs0.e(l.c(bVarA5, (Function1) objR4), sheetStateT), xkbVar15, j7, j12, f9, 0.0f, null, ko1.e(728743275, true, new ModalBottomSheetKt$ModalBottomSheetContent$7(function15, animatable, sheetState7, function16, ps4Var, function0, ta2Var2, z111), dVarF, 54), dVarF, ((i24 >> 24) & 112) | 12582912 | (i39 & 896) | (i39 & 7168) | (57344 & i39), 96);
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                z3 = z111;
                sheetState2 = sheetState7;
                function4 = function16;
                xkbVar2 = xkbVar15;
                f4 = f9;
                dVar2 = dVarF;
                f3 = f5;
                function5 = function15;
                j4 = j12;
                bVar3 = bVar113;
                j5 = j7;
            } else {
                dVarF.q();
                z3 = z;
                j4 = j2;
                function4 = function2;
                f3 = fK;
                sheetState2 = sheetStateT;
                bVar3 = bVar2;
                dVar2 = dVarF;
                xkbVar2 = xkbVar;
                j5 = j;
                f4 = f2;
                function5 = function3;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.jx7
                    public final Object invoke(Object obj, Object obj2) {
                        return ModalBottomSheetKt.y(mt0Var, animatable, ta2Var, function0, function1, bVar3, sheetState2, f3, z3, xkbVar2, j5, j4, f4, function4, function5, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 384;
        ta2Var2 = ta2Var;
        if ((i3 & 4) != 0) {
            if ((i & 3072) == 0) {
                if (dVarF.T(function0)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i4 |= i5;
            }
            i6 = 8192;
            if ((i3 & 8) != 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                if (dVarF.T(function1)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i4 |= i7;
            }
            i8 = i3 & 16;
            if (i8 != 0) {
                i4 |= 196608;
                bVar2 = bVar;
            } else {
                bVar2 = bVar;
                if ((i & 196608) == 0) {
                    if (dVarF.x(bVar2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
            }
            if ((i & 1572864) == 0) {
                sheetStateT = sheetState;
                if ((i3 & 32) == 0) {
                    i28 = 524288;
                } else {
                    i28 = 524288;
                }
                i4 |= i28;
            } else {
                sheetStateT = sheetState;
            }
            i10 = i3 & 64;
            if (i10 != 0) {
                i4 |= 12582912;
                fK = f;
            } else {
                fK = f;
                if ((i & 12582912) == 0) {
                    if (dVarF.B(fK)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i4 |= i11;
                }
            }
            i12 = i3 & 128;
            if (i12 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (dVarF.A(z)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i4 |= i13;
            }
            if ((i & 805306368) != 0) {
                i4 |= ((i3 & 256) == 0 || !dVarF.x(xkbVar)) ? 268435456 : 536870912;
            }
            if ((i2 & 6) == 0) {
                if ((i3 & 512) == 0) {
                    i14 = i4;
                    if (dVarF.D(j)) {
                    }
                    i15 = i2 | i29;
                } else {
                    i14 = i4;
                }
                i15 = i2 | i29;
            } else {
                i14 = i4;
                i15 = i2;
            }
            if ((i2 & 48) == 0) {
                j3 = j2;
                if ((i3 & 1024) == 0) {
                    i27 = 16;
                } else {
                    i27 = 16;
                }
                i15 |= i27;
            } else {
                j3 = j2;
            }
            i16 = i15;
            i17 = i3 & 2048;
            if (i17 != 0) {
                i18 = i16 | 384;
            } else if ((i2 & 384) == 0) {
                if (dVarF.B(f2)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i18 = i16 | i19;
            } else {
                i18 = i16;
            }
            i20 = i3 & 4096;
            if (i20 != 0) {
                i22 = i18 | 3072;
            } else {
                i21 = i18;
                if ((i2 & 3072) == 0) {
                    i22 = i21 | (dVarF.T(function2) ? 2048 : 1024);
                } else {
                    i22 = i21;
                }
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 8192) == 0) {
                    i6 = 16384;
                }
                i22 |= i6;
            }
            if ((i3 & 16384) != 0) {
                if ((i2 & 196608) == 0) {
                    i22 |= dVarF.T(ps4Var) ? 131072 : 65536;
                }
                if ((i14 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (dVarF.g(z2, i14 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if ((i3 & 32) != 0) {
                            sheetStateT = T(false, null, dVarF, 0, 3);
                            i23 = i14 & (-3670017);
                        }
                        if (i10 != 0) {
                            i23 = i14;
                            fK = ss0.a.k();
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 256) != 0) {
                            xkbVarH = ss0.a.h(dVarF, 6);
                            i23 &= -1879048193;
                        } else {
                            xkbVarH = xkbVar;
                        }
                        if ((i3 & 512) != 0) {
                            i22 &= -15;
                            jF = ss0.a.f(dVarF, 6);
                        } else {
                            jF = j;
                        }
                        if ((i3 & 1024) != 0) {
                            jG = bj1.g(jF, dVarF, i22 & 14);
                            i22 &= -113;
                        } else {
                            jG = j2;
                        }
                        if (i17 != 0) {
                            fG = ss0.a.g();
                        } else {
                            fG = f2;
                        }
                        if (i20 != 0) {
                            function2B = fp1.a.b();
                        } else {
                            function2B = function2;
                        }
                        if ((i3 & 8192) != 0) {
                            androidx.compose.ui.b bVar114 = bVar2;
                            i24 = i23;
                            bVar4 = bVar114;
                            xkb xkbVar16 = xkbVarH;
                            function6 = c.a;
                            f5 = fK;
                            j6 = jF;
                            xkbVar3 = xkbVar16;
                            i25 = i22 & (-57345);
                        } else {
                            androidx.compose.ui.b bVar115 = bVar2;
                            i24 = i23;
                            bVar4 = bVar115;
                            f5 = fK;
                            i25 = i22;
                            j6 = jF;
                            xkbVar3 = xkbVarH;
                            function6 = function3;
                        }
                    } else {
                        if (i8 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if ((i3 & 32) != 0) {
                            sheetStateT = T(false, null, dVarF, 0, 3);
                            i23 = i14 & (-3670017);
                        }
                        if (i10 != 0) {
                            i23 = i14;
                            fK = ss0.a.k();
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 256) != 0) {
                            xkbVarH = ss0.a.h(dVarF, 6);
                            i23 &= -1879048193;
                        } else {
                            xkbVarH = xkbVar;
                        }
                        if ((i3 & 512) != 0) {
                            i22 &= -15;
                            jF = ss0.a.f(dVarF, 6);
                        } else {
                            jF = j;
                        }
                        if ((i3 & 1024) != 0) {
                            jG = bj1.g(jF, dVarF, i22 & 14);
                            i22 &= -113;
                        } else {
                            jG = j2;
                        }
                        if (i17 != 0) {
                            fG = ss0.a.g();
                        } else {
                            fG = f2;
                        }
                        if (i20 != 0) {
                            function2B = fp1.a.b();
                        } else {
                            function2B = function2;
                        }
                        if ((i3 & 8192) != 0) {
                            androidx.compose.ui.b bVar116 = bVar2;
                            i24 = i23;
                            bVar4 = bVar116;
                            xkb xkbVar17 = xkbVarH;
                            function6 = c.a;
                            f5 = fK;
                            j6 = jF;
                            xkbVar3 = xkbVar17;
                            i25 = i22 & (-57345);
                        } else {
                            androidx.compose.ui.b bVar117 = bVar2;
                            i24 = i23;
                            bVar4 = bVar117;
                            f5 = fK;
                            i25 = i22;
                            j6 = jF;
                            xkbVar3 = xkbVarH;
                            function6 = function3;
                        }
                    }
                    dVarF.M();
                    float f10 = fG;
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-37400432, i24, i25, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:272)");
                    }
                    rbc.Companion companion9 = rbc.INSTANCE;
                    strB = vbc.b(rbc.a(wz9.e), dVarF, 0);
                    androidx.compose.ui.b bVar118 = bVar4;
                    int i310 = i25;
                    androidx.compose.ui.b bVarH5 = SizeKt.h(SizeKt.A(mt0Var.k(bVar4, tc.INSTANCE.m()), 0.0f, f5, 1, null), 0.0f, 1, null);
                    if (z4) {
                        dVarF.y(-1582035383);
                        androidx.compose.ui.b.Companion companion10 = androidx.compose.ui.b.INSTANCE;
                        if (((i24 & 3670016) ^ 1572864) <= 1048576) {
                        }
                        objR5 = dVarF.R();
                        if (z10) {
                            objR5 = m1.f(sheetStateT, Orientation.Vertical, function1);
                            dVarF.L(objR5);
                        } else {
                            objR5 = m1.f(sheetStateT, Orientation.Vertical, function1);
                            dVarF.L(objR5);
                        }
                        bVarB = ue8.b(companion10, (re8) objR5, null, 2, null);
                        dVarF.u();
                    } else {
                        dVarF.y(-1582020872);
                        dVarF.u();
                        bVarB = androidx.compose.ui.b.INSTANCE;
                    }
                    androidx.compose.ui.b bVarThen5 = bVarH5.then(bVarB);
                    AnchoredDraggableState<SheetValue> anchoredDraggableStateH5 = sheetStateT.h();
                    Orientation orientation5 = Orientation.Vertical;
                    i26 = (i24 & 3670016) ^ 1572864;
                    if (i26 > 1048576) {
                        j7 = j6;
                        if ((i24 & 1572864) != 1048576) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                    } else {
                        j7 = j6;
                        if ((i24 & 1572864) != 1048576) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                    }
                    objR = dVarF.R();
                    if (z5) {
                        objR = new Function2() { // from class: com.google.android.gx7
                            public final Object invoke(Object obj, Object obj2) {
                                return ModalBottomSheetKt.u(sheetStateT, (q16) obj, (kx1) obj2);
                            }
                        };
                        dVarF.L(objR);
                    } else {
                        objR = new Function2() { // from class: com.google.android.gx7
                            public final Object invoke(Object obj, Object obj2) {
                                return ModalBottomSheetKt.u(sheetStateT, (q16) obj, (kx1) obj2);
                            }
                        };
                        dVarF.L(objR);
                    }
                    androidx.compose.ui.b bVarE6 = AnchoredDraggableKt.e(bVarThen5, anchoredDraggableStateH5, orientation5, (Function2) objR);
                    og3 draggableState6 = sheetStateT.h().getDraggableState();
                    if (z4) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    boolean z112 = sheetStateT.h().z();
                    if ((i24 & 57344) == 16384) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    objR2 = dVarF.R();
                    if (z7) {
                        objR2 = new C0195ModalBottomSheetKt$ModalBottomSheetContent$4$1(function1, null);
                        dVarF.L(objR2);
                    } else {
                        objR2 = new C0195ModalBottomSheetKt$ModalBottomSheetContent$4$1(function1, null);
                        dVarF.L(objR2);
                    }
                    androidx.compose.ui.b bVarG6 = DraggableKt.g(bVarE6, draggableState6, orientation5, z6, null, z112, null, (ps4) objR2, false, 168, null);
                    zX = dVarF.x(strB);
                    objR3 = dVarF.R();
                    if (zX) {
                        objR3 = new Function1() { // from class: com.google.android.hx7
                            public final Object invoke(Object obj) {
                                return ModalBottomSheetKt.w(strB, (nfb) obj);
                            }
                        };
                        dVarF.L(objR3);
                    } else {
                        objR3 = new Function1() { // from class: com.google.android.hx7
                            public final Object invoke(Object obj) {
                                return ModalBottomSheetKt.w(strB, (nfb) obj);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    androidx.compose.ui.b bVarA6 = WindowInsetsPaddingKt.a(afb.d(bVarG6, false, (Function1) objR3, 1, null), rje.c(0, g.e((int) sheetStateT.l(), 0), 0, 0, 13, null));
                    if (i26 <= 1048576) {
                    }
                    if ((i24 & 112) != 32) {
                        z8 = true;
                    } else {
                        z8 = true;
                    }
                    z9 = z12 | z8;
                    objR4 = dVarF.R();
                    if (z9) {
                        objR4 = new Function1() { // from class: com.google.android.ix7
                            public final Object invoke(Object obj) {
                                return ModalBottomSheetKt.x(sheetStateT, animatable, (m) obj);
                            }
                        };
                        dVarF.L(objR4);
                    } else {
                        objR4 = new Function1() { // from class: com.google.android.ix7
                            public final Object invoke(Object obj) {
                                return ModalBottomSheetKt.x(sheetStateT, animatable, (m) obj);
                            }
                        };
                        dVarF.L(objR4);
                    }
                    SheetState sheetState8 = sheetStateT;
                    boolean z113 = z4;
                    Function2<? super androidx.compose.p004runtime.d, ? super Integer, ? extends g1> function17 = function6;
                    Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function18 = function2B;
                    int i311 = i310 << 6;
                    xkb xkbVar18 = xkbVar3;
                    long j13 = jG;
                    afc.c(vs0.e(l.c(bVarA6, (Function1) objR4), sheetStateT), xkbVar18, j7, j13, f10, 0.0f, null, ko1.e(728743275, true, new ModalBottomSheetKt$ModalBottomSheetContent$7(function17, animatable, sheetState8, function18, ps4Var, function0, ta2Var2, z113), dVarF, 54), dVarF, ((i24 >> 24) & 112) | 12582912 | (i311 & 896) | (i311 & 7168) | (57344 & i311), 96);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    z3 = z113;
                    sheetState2 = sheetState8;
                    function4 = function18;
                    xkbVar2 = xkbVar18;
                    f4 = f10;
                    dVar2 = dVarF;
                    f3 = f5;
                    function5 = function17;
                    j4 = j13;
                    bVar3 = bVar118;
                    j5 = j7;
                } else {
                    dVarF.q();
                    z3 = z;
                    j4 = j2;
                    function4 = function2;
                    f3 = fK;
                    sheetState2 = sheetStateT;
                    bVar3 = bVar2;
                    dVar2 = dVarF;
                    xkbVar2 = xkbVar;
                    j5 = j;
                    f4 = f2;
                    function5 = function3;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.jx7
                        public final Object invoke(Object obj, Object obj2) {
                            return ModalBottomSheetKt.y(mt0Var, animatable, ta2Var, function0, function1, bVar3, sheetState2, f3, z3, xkbVar2, j5, j4, f4, function4, function5, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i22 |= 196608;
            if ((i14 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (dVarF.g(z2, i14 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if ((i3 & 32) != 0) {
                        sheetStateT = T(false, null, dVarF, 0, 3);
                        i23 = i14 & (-3670017);
                    }
                    if (i10 != 0) {
                        i23 = i14;
                        fK = ss0.a.k();
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & 256) != 0) {
                        xkbVarH = ss0.a.h(dVarF, 6);
                        i23 &= -1879048193;
                    } else {
                        xkbVarH = xkbVar;
                    }
                    if ((i3 & 512) != 0) {
                        i22 &= -15;
                        jF = ss0.a.f(dVarF, 6);
                    } else {
                        jF = j;
                    }
                    if ((i3 & 1024) != 0) {
                        jG = bj1.g(jF, dVarF, i22 & 14);
                        i22 &= -113;
                    } else {
                        jG = j2;
                    }
                    if (i17 != 0) {
                        fG = ss0.a.g();
                    } else {
                        fG = f2;
                    }
                    if (i20 != 0) {
                        function2B = fp1.a.b();
                    } else {
                        function2B = function2;
                    }
                    if ((i3 & 8192) != 0) {
                        androidx.compose.ui.b bVar119 = bVar2;
                        i24 = i23;
                        bVar4 = bVar119;
                        xkb xkbVar19 = xkbVarH;
                        function6 = c.a;
                        f5 = fK;
                        j6 = jF;
                        xkbVar3 = xkbVar19;
                        i25 = i22 & (-57345);
                    } else {
                        androidx.compose.ui.b bVar1110 = bVar2;
                        i24 = i23;
                        bVar4 = bVar1110;
                        f5 = fK;
                        i25 = i22;
                        j6 = jF;
                        xkbVar3 = xkbVarH;
                        function6 = function3;
                    }
                } else {
                    if (i8 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if ((i3 & 32) != 0) {
                        sheetStateT = T(false, null, dVarF, 0, 3);
                        i23 = i14 & (-3670017);
                    }
                    if (i10 != 0) {
                        i23 = i14;
                        fK = ss0.a.k();
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & 256) != 0) {
                        xkbVarH = ss0.a.h(dVarF, 6);
                        i23 &= -1879048193;
                    } else {
                        xkbVarH = xkbVar;
                    }
                    if ((i3 & 512) != 0) {
                        i22 &= -15;
                        jF = ss0.a.f(dVarF, 6);
                    } else {
                        jF = j;
                    }
                    if ((i3 & 1024) != 0) {
                        jG = bj1.g(jF, dVarF, i22 & 14);
                        i22 &= -113;
                    } else {
                        jG = j2;
                    }
                    if (i17 != 0) {
                        fG = ss0.a.g();
                    } else {
                        fG = f2;
                    }
                    if (i20 != 0) {
                        function2B = fp1.a.b();
                    } else {
                        function2B = function2;
                    }
                    if ((i3 & 8192) != 0) {
                        androidx.compose.ui.b bVar1111 = bVar2;
                        i24 = i23;
                        bVar4 = bVar1111;
                        xkb xkbVar110 = xkbVarH;
                        function6 = c.a;
                        f5 = fK;
                        j6 = jF;
                        xkbVar3 = xkbVar110;
                        i25 = i22 & (-57345);
                    } else {
                        androidx.compose.ui.b bVar1112 = bVar2;
                        i24 = i23;
                        bVar4 = bVar1112;
                        f5 = fK;
                        i25 = i22;
                        j6 = jF;
                        xkbVar3 = xkbVarH;
                        function6 = function3;
                    }
                }
                dVarF.M();
                float f11 = fG;
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-37400432, i24, i25, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:272)");
                }
                rbc.Companion companion11 = rbc.INSTANCE;
                strB = vbc.b(rbc.a(wz9.e), dVarF, 0);
                androidx.compose.ui.b bVar1113 = bVar4;
                int i312 = i25;
                androidx.compose.ui.b bVarH6 = SizeKt.h(SizeKt.A(mt0Var.k(bVar4, tc.INSTANCE.m()), 0.0f, f5, 1, null), 0.0f, 1, null);
                if (z4) {
                    dVarF.y(-1582035383);
                    androidx.compose.ui.b.Companion companion12 = androidx.compose.ui.b.INSTANCE;
                    if (((i24 & 3670016) ^ 1572864) <= 1048576) {
                    }
                    objR5 = dVarF.R();
                    if (z10) {
                        objR5 = m1.f(sheetStateT, Orientation.Vertical, function1);
                        dVarF.L(objR5);
                    } else {
                        objR5 = m1.f(sheetStateT, Orientation.Vertical, function1);
                        dVarF.L(objR5);
                    }
                    bVarB = ue8.b(companion12, (re8) objR5, null, 2, null);
                    dVarF.u();
                } else {
                    dVarF.y(-1582020872);
                    dVarF.u();
                    bVarB = androidx.compose.ui.b.INSTANCE;
                }
                androidx.compose.ui.b bVarThen6 = bVarH6.then(bVarB);
                AnchoredDraggableState<SheetValue> anchoredDraggableStateH6 = sheetStateT.h();
                Orientation orientation6 = Orientation.Vertical;
                i26 = (i24 & 3670016) ^ 1572864;
                if (i26 > 1048576) {
                    j7 = j6;
                    if ((i24 & 1572864) != 1048576) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                } else {
                    j7 = j6;
                    if ((i24 & 1572864) != 1048576) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                }
                objR = dVarF.R();
                if (z5) {
                    objR = new Function2() { // from class: com.google.android.gx7
                        public final Object invoke(Object obj, Object obj2) {
                            return ModalBottomSheetKt.u(sheetStateT, (q16) obj, (kx1) obj2);
                        }
                    };
                    dVarF.L(objR);
                } else {
                    objR = new Function2() { // from class: com.google.android.gx7
                        public final Object invoke(Object obj, Object obj2) {
                            return ModalBottomSheetKt.u(sheetStateT, (q16) obj, (kx1) obj2);
                        }
                    };
                    dVarF.L(objR);
                }
                androidx.compose.ui.b bVarE7 = AnchoredDraggableKt.e(bVarThen6, anchoredDraggableStateH6, orientation6, (Function2) objR);
                og3 draggableState7 = sheetStateT.h().getDraggableState();
                if (z4) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                boolean z114 = sheetStateT.h().z();
                if ((i24 & 57344) == 16384) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objR2 = dVarF.R();
                if (z7) {
                    objR2 = new C0195ModalBottomSheetKt$ModalBottomSheetContent$4$1(function1, null);
                    dVarF.L(objR2);
                } else {
                    objR2 = new C0195ModalBottomSheetKt$ModalBottomSheetContent$4$1(function1, null);
                    dVarF.L(objR2);
                }
                androidx.compose.ui.b bVarG7 = DraggableKt.g(bVarE7, draggableState7, orientation6, z6, null, z114, null, (ps4) objR2, false, 168, null);
                zX = dVarF.x(strB);
                objR3 = dVarF.R();
                if (zX) {
                    objR3 = new Function1() { // from class: com.google.android.hx7
                        public final Object invoke(Object obj) {
                            return ModalBottomSheetKt.w(strB, (nfb) obj);
                        }
                    };
                    dVarF.L(objR3);
                } else {
                    objR3 = new Function1() { // from class: com.google.android.hx7
                        public final Object invoke(Object obj) {
                            return ModalBottomSheetKt.w(strB, (nfb) obj);
                        }
                    };
                    dVarF.L(objR3);
                }
                androidx.compose.ui.b bVarA7 = WindowInsetsPaddingKt.a(afb.d(bVarG7, false, (Function1) objR3, 1, null), rje.c(0, g.e((int) sheetStateT.l(), 0), 0, 0, 13, null));
                if (i26 <= 1048576) {
                }
                if ((i24 & 112) != 32) {
                    z8 = true;
                } else {
                    z8 = true;
                }
                z9 = z12 | z8;
                objR4 = dVarF.R();
                if (z9) {
                    objR4 = new Function1() { // from class: com.google.android.ix7
                        public final Object invoke(Object obj) {
                            return ModalBottomSheetKt.x(sheetStateT, animatable, (m) obj);
                        }
                    };
                    dVarF.L(objR4);
                } else {
                    objR4 = new Function1() { // from class: com.google.android.ix7
                        public final Object invoke(Object obj) {
                            return ModalBottomSheetKt.x(sheetStateT, animatable, (m) obj);
                        }
                    };
                    dVarF.L(objR4);
                }
                SheetState sheetState9 = sheetStateT;
                boolean z115 = z4;
                Function2<? super androidx.compose.p004runtime.d, ? super Integer, ? extends g1> function19 = function6;
                Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function110 = function2B;
                int i313 = i312 << 6;
                xkb xkbVar111 = xkbVar3;
                long j14 = jG;
                afc.c(vs0.e(l.c(bVarA7, (Function1) objR4), sheetStateT), xkbVar111, j7, j14, f11, 0.0f, null, ko1.e(728743275, true, new ModalBottomSheetKt$ModalBottomSheetContent$7(function19, animatable, sheetState9, function110, ps4Var, function0, ta2Var2, z115), dVarF, 54), dVarF, ((i24 >> 24) & 112) | 12582912 | (i313 & 896) | (i313 & 7168) | (57344 & i313), 96);
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                z3 = z115;
                sheetState2 = sheetState9;
                function4 = function110;
                xkbVar2 = xkbVar111;
                f4 = f11;
                dVar2 = dVarF;
                f3 = f5;
                function5 = function19;
                j4 = j14;
                bVar3 = bVar1113;
                j5 = j7;
            } else {
                dVarF.q();
                z3 = z;
                j4 = j2;
                function4 = function2;
                f3 = fK;
                sheetState2 = sheetStateT;
                bVar3 = bVar2;
                dVar2 = dVarF;
                xkbVar2 = xkbVar;
                j5 = j;
                f4 = f2;
                function5 = function3;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.jx7
                    public final Object invoke(Object obj, Object obj2) {
                        return ModalBottomSheetKt.y(mt0Var, animatable, ta2Var, function0, function1, bVar3, sheetState2, f3, z3, xkbVar2, j5, j4, f4, function4, function5, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 3072;
        i6 = 8192;
        if ((i3 & 8) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            if (dVarF.T(function1)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i4 |= i7;
        }
        i8 = i3 & 16;
        if (i8 != 0) {
            i4 |= 196608;
            bVar2 = bVar;
        } else {
            bVar2 = bVar;
            if ((i & 196608) == 0) {
                if (dVarF.x(bVar2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i4 |= i9;
            }
        }
        if ((i & 1572864) == 0) {
            sheetStateT = sheetState;
            if ((i3 & 32) == 0) {
                i28 = 524288;
            } else {
                i28 = 524288;
            }
            i4 |= i28;
        } else {
            sheetStateT = sheetState;
        }
        i10 = i3 & 64;
        if (i10 != 0) {
            i4 |= 12582912;
            fK = f;
        } else {
            fK = f;
            if ((i & 12582912) == 0) {
                if (dVarF.B(fK)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i4 |= i11;
            }
        }
        i12 = i3 & 128;
        if (i12 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (dVarF.A(z)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i4 |= i13;
        }
        if ((i & 805306368) != 0) {
            i4 |= ((i3 & 256) == 0 || !dVarF.x(xkbVar)) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            if ((i3 & 512) == 0) {
                i14 = i4;
                if (dVarF.D(j)) {
                }
                i15 = i2 | i29;
            } else {
                i14 = i4;
            }
            i15 = i2 | i29;
        } else {
            i14 = i4;
            i15 = i2;
        }
        if ((i2 & 48) == 0) {
            j3 = j2;
            if ((i3 & 1024) == 0) {
                i27 = 16;
            } else {
                i27 = 16;
            }
            i15 |= i27;
        } else {
            j3 = j2;
        }
        i16 = i15;
        i17 = i3 & 2048;
        if (i17 != 0) {
            i18 = i16 | 384;
        } else if ((i2 & 384) == 0) {
            if (dVarF.B(f2)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i18 = i16 | i19;
        } else {
            i18 = i16;
        }
        i20 = i3 & 4096;
        if (i20 != 0) {
            i22 = i18 | 3072;
        } else {
            i21 = i18;
            if ((i2 & 3072) == 0) {
                i22 = i21 | (dVarF.T(function2) ? 2048 : 1024);
            } else {
                i22 = i21;
            }
        }
        if ((i2 & 24576) != 0) {
            if ((i3 & 8192) == 0) {
                i6 = 16384;
            }
            i22 |= i6;
        }
        if ((i3 & 16384) != 0) {
            if ((i2 & 196608) == 0) {
                i22 |= dVarF.T(ps4Var) ? 131072 : 65536;
            }
            if ((i14 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (dVarF.g(z2, i14 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if ((i3 & 32) != 0) {
                        sheetStateT = T(false, null, dVarF, 0, 3);
                        i23 = i14 & (-3670017);
                    }
                    if (i10 != 0) {
                        i23 = i14;
                        fK = ss0.a.k();
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & 256) != 0) {
                        xkbVarH = ss0.a.h(dVarF, 6);
                        i23 &= -1879048193;
                    } else {
                        xkbVarH = xkbVar;
                    }
                    if ((i3 & 512) != 0) {
                        i22 &= -15;
                        jF = ss0.a.f(dVarF, 6);
                    } else {
                        jF = j;
                    }
                    if ((i3 & 1024) != 0) {
                        jG = bj1.g(jF, dVarF, i22 & 14);
                        i22 &= -113;
                    } else {
                        jG = j2;
                    }
                    if (i17 != 0) {
                        fG = ss0.a.g();
                    } else {
                        fG = f2;
                    }
                    if (i20 != 0) {
                        function2B = fp1.a.b();
                    } else {
                        function2B = function2;
                    }
                    if ((i3 & 8192) != 0) {
                        androidx.compose.ui.b bVar1114 = bVar2;
                        i24 = i23;
                        bVar4 = bVar1114;
                        xkb xkbVar112 = xkbVarH;
                        function6 = c.a;
                        f5 = fK;
                        j6 = jF;
                        xkbVar3 = xkbVar112;
                        i25 = i22 & (-57345);
                    } else {
                        androidx.compose.ui.b bVar1115 = bVar2;
                        i24 = i23;
                        bVar4 = bVar1115;
                        f5 = fK;
                        i25 = i22;
                        j6 = jF;
                        xkbVar3 = xkbVarH;
                        function6 = function3;
                    }
                } else {
                    if (i8 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if ((i3 & 32) != 0) {
                        sheetStateT = T(false, null, dVarF, 0, 3);
                        i23 = i14 & (-3670017);
                    }
                    if (i10 != 0) {
                        i23 = i14;
                        fK = ss0.a.k();
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & 256) != 0) {
                        xkbVarH = ss0.a.h(dVarF, 6);
                        i23 &= -1879048193;
                    } else {
                        xkbVarH = xkbVar;
                    }
                    if ((i3 & 512) != 0) {
                        i22 &= -15;
                        jF = ss0.a.f(dVarF, 6);
                    } else {
                        jF = j;
                    }
                    if ((i3 & 1024) != 0) {
                        jG = bj1.g(jF, dVarF, i22 & 14);
                        i22 &= -113;
                    } else {
                        jG = j2;
                    }
                    if (i17 != 0) {
                        fG = ss0.a.g();
                    } else {
                        fG = f2;
                    }
                    if (i20 != 0) {
                        function2B = fp1.a.b();
                    } else {
                        function2B = function2;
                    }
                    if ((i3 & 8192) != 0) {
                        androidx.compose.ui.b bVar1116 = bVar2;
                        i24 = i23;
                        bVar4 = bVar1116;
                        xkb xkbVar113 = xkbVarH;
                        function6 = c.a;
                        f5 = fK;
                        j6 = jF;
                        xkbVar3 = xkbVar113;
                        i25 = i22 & (-57345);
                    } else {
                        androidx.compose.ui.b bVar1117 = bVar2;
                        i24 = i23;
                        bVar4 = bVar1117;
                        f5 = fK;
                        i25 = i22;
                        j6 = jF;
                        xkbVar3 = xkbVarH;
                        function6 = function3;
                    }
                }
                dVarF.M();
                float f12 = fG;
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-37400432, i24, i25, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:272)");
                }
                rbc.Companion companion13 = rbc.INSTANCE;
                strB = vbc.b(rbc.a(wz9.e), dVarF, 0);
                androidx.compose.ui.b bVar1118 = bVar4;
                int i314 = i25;
                androidx.compose.ui.b bVarH7 = SizeKt.h(SizeKt.A(mt0Var.k(bVar4, tc.INSTANCE.m()), 0.0f, f5, 1, null), 0.0f, 1, null);
                if (z4) {
                    dVarF.y(-1582035383);
                    androidx.compose.ui.b.Companion companion14 = androidx.compose.ui.b.INSTANCE;
                    if (((i24 & 3670016) ^ 1572864) <= 1048576) {
                    }
                    objR5 = dVarF.R();
                    if (z10) {
                        objR5 = m1.f(sheetStateT, Orientation.Vertical, function1);
                        dVarF.L(objR5);
                    } else {
                        objR5 = m1.f(sheetStateT, Orientation.Vertical, function1);
                        dVarF.L(objR5);
                    }
                    bVarB = ue8.b(companion14, (re8) objR5, null, 2, null);
                    dVarF.u();
                } else {
                    dVarF.y(-1582020872);
                    dVarF.u();
                    bVarB = androidx.compose.ui.b.INSTANCE;
                }
                androidx.compose.ui.b bVarThen7 = bVarH7.then(bVarB);
                AnchoredDraggableState<SheetValue> anchoredDraggableStateH7 = sheetStateT.h();
                Orientation orientation7 = Orientation.Vertical;
                i26 = (i24 & 3670016) ^ 1572864;
                if (i26 > 1048576) {
                    j7 = j6;
                    if ((i24 & 1572864) != 1048576) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                } else {
                    j7 = j6;
                    if ((i24 & 1572864) != 1048576) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                }
                objR = dVarF.R();
                if (z5) {
                    objR = new Function2() { // from class: com.google.android.gx7
                        public final Object invoke(Object obj, Object obj2) {
                            return ModalBottomSheetKt.u(sheetStateT, (q16) obj, (kx1) obj2);
                        }
                    };
                    dVarF.L(objR);
                } else {
                    objR = new Function2() { // from class: com.google.android.gx7
                        public final Object invoke(Object obj, Object obj2) {
                            return ModalBottomSheetKt.u(sheetStateT, (q16) obj, (kx1) obj2);
                        }
                    };
                    dVarF.L(objR);
                }
                androidx.compose.ui.b bVarE8 = AnchoredDraggableKt.e(bVarThen7, anchoredDraggableStateH7, orientation7, (Function2) objR);
                og3 draggableState8 = sheetStateT.h().getDraggableState();
                if (z4) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                boolean z116 = sheetStateT.h().z();
                if ((i24 & 57344) == 16384) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objR2 = dVarF.R();
                if (z7) {
                    objR2 = new C0195ModalBottomSheetKt$ModalBottomSheetContent$4$1(function1, null);
                    dVarF.L(objR2);
                } else {
                    objR2 = new C0195ModalBottomSheetKt$ModalBottomSheetContent$4$1(function1, null);
                    dVarF.L(objR2);
                }
                androidx.compose.ui.b bVarG8 = DraggableKt.g(bVarE8, draggableState8, orientation7, z6, null, z116, null, (ps4) objR2, false, 168, null);
                zX = dVarF.x(strB);
                objR3 = dVarF.R();
                if (zX) {
                    objR3 = new Function1() { // from class: com.google.android.hx7
                        public final Object invoke(Object obj) {
                            return ModalBottomSheetKt.w(strB, (nfb) obj);
                        }
                    };
                    dVarF.L(objR3);
                } else {
                    objR3 = new Function1() { // from class: com.google.android.hx7
                        public final Object invoke(Object obj) {
                            return ModalBottomSheetKt.w(strB, (nfb) obj);
                        }
                    };
                    dVarF.L(objR3);
                }
                androidx.compose.ui.b bVarA8 = WindowInsetsPaddingKt.a(afb.d(bVarG8, false, (Function1) objR3, 1, null), rje.c(0, g.e((int) sheetStateT.l(), 0), 0, 0, 13, null));
                if (i26 <= 1048576) {
                }
                if ((i24 & 112) != 32) {
                    z8 = true;
                } else {
                    z8 = true;
                }
                z9 = z12 | z8;
                objR4 = dVarF.R();
                if (z9) {
                    objR4 = new Function1() { // from class: com.google.android.ix7
                        public final Object invoke(Object obj) {
                            return ModalBottomSheetKt.x(sheetStateT, animatable, (m) obj);
                        }
                    };
                    dVarF.L(objR4);
                } else {
                    objR4 = new Function1() { // from class: com.google.android.ix7
                        public final Object invoke(Object obj) {
                            return ModalBottomSheetKt.x(sheetStateT, animatable, (m) obj);
                        }
                    };
                    dVarF.L(objR4);
                }
                SheetState sheetState10 = sheetStateT;
                boolean z117 = z4;
                Function2<? super androidx.compose.p004runtime.d, ? super Integer, ? extends g1> function111 = function6;
                Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function112 = function2B;
                int i315 = i314 << 6;
                xkb xkbVar114 = xkbVar3;
                long j15 = jG;
                afc.c(vs0.e(l.c(bVarA8, (Function1) objR4), sheetStateT), xkbVar114, j7, j15, f12, 0.0f, null, ko1.e(728743275, true, new ModalBottomSheetKt$ModalBottomSheetContent$7(function111, animatable, sheetState10, function112, ps4Var, function0, ta2Var2, z117), dVarF, 54), dVarF, ((i24 >> 24) & 112) | 12582912 | (i315 & 896) | (i315 & 7168) | (57344 & i315), 96);
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                z3 = z117;
                sheetState2 = sheetState10;
                function4 = function112;
                xkbVar2 = xkbVar114;
                f4 = f12;
                dVar2 = dVarF;
                f3 = f5;
                function5 = function111;
                j4 = j15;
                bVar3 = bVar1118;
                j5 = j7;
            } else {
                dVarF.q();
                z3 = z;
                j4 = j2;
                function4 = function2;
                f3 = fK;
                sheetState2 = sheetStateT;
                bVar3 = bVar2;
                dVar2 = dVarF;
                xkbVar2 = xkbVar;
                j5 = j;
                f4 = f2;
                function5 = function3;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.jx7
                    public final Object invoke(Object obj, Object obj2) {
                        return ModalBottomSheetKt.y(mt0Var, animatable, ta2Var, function0, function1, bVar3, sheetState2, f3, z3, xkbVar2, j5, j4, f4, function4, function5, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i22 |= 196608;
        if ((i14 & 306783379) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (dVarF.g(z2, i14 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    bVar2 = androidx.compose.ui.b.INSTANCE;
                }
                if ((i3 & 32) != 0) {
                    sheetStateT = T(false, null, dVarF, 0, 3);
                    i23 = i14 & (-3670017);
                }
                if (i10 != 0) {
                    i23 = i14;
                    fK = ss0.a.k();
                }
                if (i12 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if ((i3 & 256) != 0) {
                    xkbVarH = ss0.a.h(dVarF, 6);
                    i23 &= -1879048193;
                } else {
                    xkbVarH = xkbVar;
                }
                if ((i3 & 512) != 0) {
                    i22 &= -15;
                    jF = ss0.a.f(dVarF, 6);
                } else {
                    jF = j;
                }
                if ((i3 & 1024) != 0) {
                    jG = bj1.g(jF, dVarF, i22 & 14);
                    i22 &= -113;
                } else {
                    jG = j2;
                }
                if (i17 != 0) {
                    fG = ss0.a.g();
                } else {
                    fG = f2;
                }
                if (i20 != 0) {
                    function2B = fp1.a.b();
                } else {
                    function2B = function2;
                }
                if ((i3 & 8192) != 0) {
                    androidx.compose.ui.b bVar1119 = bVar2;
                    i24 = i23;
                    bVar4 = bVar1119;
                    xkb xkbVar115 = xkbVarH;
                    function6 = c.a;
                    f5 = fK;
                    j6 = jF;
                    xkbVar3 = xkbVar115;
                    i25 = i22 & (-57345);
                } else {
                    androidx.compose.ui.b bVar11110 = bVar2;
                    i24 = i23;
                    bVar4 = bVar11110;
                    f5 = fK;
                    i25 = i22;
                    j6 = jF;
                    xkbVar3 = xkbVarH;
                    function6 = function3;
                }
            } else {
                if (i8 != 0) {
                    bVar2 = androidx.compose.ui.b.INSTANCE;
                }
                if ((i3 & 32) != 0) {
                    sheetStateT = T(false, null, dVarF, 0, 3);
                    i23 = i14 & (-3670017);
                }
                if (i10 != 0) {
                    i23 = i14;
                    fK = ss0.a.k();
                }
                if (i12 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if ((i3 & 256) != 0) {
                    xkbVarH = ss0.a.h(dVarF, 6);
                    i23 &= -1879048193;
                } else {
                    xkbVarH = xkbVar;
                }
                if ((i3 & 512) != 0) {
                    i22 &= -15;
                    jF = ss0.a.f(dVarF, 6);
                } else {
                    jF = j;
                }
                if ((i3 & 1024) != 0) {
                    jG = bj1.g(jF, dVarF, i22 & 14);
                    i22 &= -113;
                } else {
                    jG = j2;
                }
                if (i17 != 0) {
                    fG = ss0.a.g();
                } else {
                    fG = f2;
                }
                if (i20 != 0) {
                    function2B = fp1.a.b();
                } else {
                    function2B = function2;
                }
                if ((i3 & 8192) != 0) {
                    androidx.compose.ui.b bVar11111 = bVar2;
                    i24 = i23;
                    bVar4 = bVar11111;
                    xkb xkbVar116 = xkbVarH;
                    function6 = c.a;
                    f5 = fK;
                    j6 = jF;
                    xkbVar3 = xkbVar116;
                    i25 = i22 & (-57345);
                } else {
                    androidx.compose.ui.b bVar11112 = bVar2;
                    i24 = i23;
                    bVar4 = bVar11112;
                    f5 = fK;
                    i25 = i22;
                    j6 = jF;
                    xkbVar3 = xkbVarH;
                    function6 = function3;
                }
            }
            dVarF.M();
            float f13 = fG;
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-37400432, i24, i25, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:272)");
            }
            rbc.Companion companion15 = rbc.INSTANCE;
            strB = vbc.b(rbc.a(wz9.e), dVarF, 0);
            androidx.compose.ui.b bVar11113 = bVar4;
            int i316 = i25;
            androidx.compose.ui.b bVarH8 = SizeKt.h(SizeKt.A(mt0Var.k(bVar4, tc.INSTANCE.m()), 0.0f, f5, 1, null), 0.0f, 1, null);
            if (z4) {
                dVarF.y(-1582035383);
                androidx.compose.ui.b.Companion companion16 = androidx.compose.ui.b.INSTANCE;
                if (((i24 & 3670016) ^ 1572864) <= 1048576) {
                }
                objR5 = dVarF.R();
                if (z10) {
                    objR5 = m1.f(sheetStateT, Orientation.Vertical, function1);
                    dVarF.L(objR5);
                } else {
                    objR5 = m1.f(sheetStateT, Orientation.Vertical, function1);
                    dVarF.L(objR5);
                }
                bVarB = ue8.b(companion16, (re8) objR5, null, 2, null);
                dVarF.u();
            } else {
                dVarF.y(-1582020872);
                dVarF.u();
                bVarB = androidx.compose.ui.b.INSTANCE;
            }
            androidx.compose.ui.b bVarThen8 = bVarH8.then(bVarB);
            AnchoredDraggableState<SheetValue> anchoredDraggableStateH8 = sheetStateT.h();
            Orientation orientation8 = Orientation.Vertical;
            i26 = (i24 & 3670016) ^ 1572864;
            if (i26 > 1048576) {
                j7 = j6;
                if ((i24 & 1572864) != 1048576) {
                    z5 = true;
                } else {
                    z5 = false;
                }
            } else {
                j7 = j6;
                if ((i24 & 1572864) != 1048576) {
                    z5 = true;
                } else {
                    z5 = false;
                }
            }
            objR = dVarF.R();
            if (z5) {
                objR = new Function2() { // from class: com.google.android.gx7
                    public final Object invoke(Object obj, Object obj2) {
                        return ModalBottomSheetKt.u(sheetStateT, (q16) obj, (kx1) obj2);
                    }
                };
                dVarF.L(objR);
            } else {
                objR = new Function2() { // from class: com.google.android.gx7
                    public final Object invoke(Object obj, Object obj2) {
                        return ModalBottomSheetKt.u(sheetStateT, (q16) obj, (kx1) obj2);
                    }
                };
                dVarF.L(objR);
            }
            androidx.compose.ui.b bVarE9 = AnchoredDraggableKt.e(bVarThen8, anchoredDraggableStateH8, orientation8, (Function2) objR);
            og3 draggableState9 = sheetStateT.h().getDraggableState();
            if (z4) {
                z6 = false;
            } else {
                z6 = false;
            }
            boolean z118 = sheetStateT.h().z();
            if ((i24 & 57344) == 16384) {
                z7 = true;
            } else {
                z7 = false;
            }
            objR2 = dVarF.R();
            if (z7) {
                objR2 = new C0195ModalBottomSheetKt$ModalBottomSheetContent$4$1(function1, null);
                dVarF.L(objR2);
            } else {
                objR2 = new C0195ModalBottomSheetKt$ModalBottomSheetContent$4$1(function1, null);
                dVarF.L(objR2);
            }
            androidx.compose.ui.b bVarG9 = DraggableKt.g(bVarE9, draggableState9, orientation8, z6, null, z118, null, (ps4) objR2, false, 168, null);
            zX = dVarF.x(strB);
            objR3 = dVarF.R();
            if (zX) {
                objR3 = new Function1() { // from class: com.google.android.hx7
                    public final Object invoke(Object obj) {
                        return ModalBottomSheetKt.w(strB, (nfb) obj);
                    }
                };
                dVarF.L(objR3);
            } else {
                objR3 = new Function1() { // from class: com.google.android.hx7
                    public final Object invoke(Object obj) {
                        return ModalBottomSheetKt.w(strB, (nfb) obj);
                    }
                };
                dVarF.L(objR3);
            }
            androidx.compose.ui.b bVarA9 = WindowInsetsPaddingKt.a(afb.d(bVarG9, false, (Function1) objR3, 1, null), rje.c(0, g.e((int) sheetStateT.l(), 0), 0, 0, 13, null));
            if (i26 <= 1048576) {
            }
            if ((i24 & 112) != 32) {
                z8 = true;
            } else {
                z8 = true;
            }
            z9 = z12 | z8;
            objR4 = dVarF.R();
            if (z9) {
                objR4 = new Function1() { // from class: com.google.android.ix7
                    public final Object invoke(Object obj) {
                        return ModalBottomSheetKt.x(sheetStateT, animatable, (m) obj);
                    }
                };
                dVarF.L(objR4);
            } else {
                objR4 = new Function1() { // from class: com.google.android.ix7
                    public final Object invoke(Object obj) {
                        return ModalBottomSheetKt.x(sheetStateT, animatable, (m) obj);
                    }
                };
                dVarF.L(objR4);
            }
            SheetState sheetState11 = sheetStateT;
            boolean z119 = z4;
            Function2<? super androidx.compose.p004runtime.d, ? super Integer, ? extends g1> function113 = function6;
            Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function114 = function2B;
            int i317 = i316 << 6;
            xkb xkbVar117 = xkbVar3;
            long j16 = jG;
            afc.c(vs0.e(l.c(bVarA9, (Function1) objR4), sheetStateT), xkbVar117, j7, j16, f13, 0.0f, null, ko1.e(728743275, true, new ModalBottomSheetKt$ModalBottomSheetContent$7(function113, animatable, sheetState11, function114, ps4Var, function0, ta2Var2, z119), dVarF, 54), dVarF, ((i24 >> 24) & 112) | 12582912 | (i317 & 896) | (i317 & 7168) | (57344 & i317), 96);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            z3 = z119;
            sheetState2 = sheetState11;
            function4 = function114;
            xkbVar2 = xkbVar117;
            f4 = f13;
            dVar2 = dVarF;
            f3 = f5;
            function5 = function113;
            j4 = j16;
            bVar3 = bVar11113;
            j5 = j7;
        } else {
            dVarF.q();
            z3 = z;
            j4 = j2;
            function4 = function2;
            f3 = fK;
            sheetState2 = sheetStateT;
            bVar3 = bVar2;
            dVar2 = dVarF;
            xkbVar2 = xkbVar;
            j5 = j;
            f4 = f2;
            function5 = function3;
        }
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.jx7
                public final Object invoke(Object obj, Object obj2) {
                    return ModalBottomSheetKt.y(mt0Var, animatable, ta2Var, function0, function1, bVar3, sheetState2, f3, z3, xkbVar2, j5, j4, f4, function4, function5, ps4Var, i, i2, i3, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Pair u(final SheetState sheetState, final q16 q16Var, kx1 kx1Var) throws NoWhenBranchMatchedException {
        SheetValue sheetValue;
        final float fK = kx1.k(kx1Var.getValue());
        cg3 cg3VarA = AnchoredDraggableKt.a(new Function1() { // from class: com.google.android.kx7
            public final Object invoke(Object obj) {
                return ModalBottomSheetKt.v(fK, q16Var, sheetState, (eg3) obj);
            }
        });
        int i = e.$EnumSwitchMapping$0[sheetState.h().y().ordinal()];
        if (i == 1) {
            sheetValue = SheetValue.Hidden;
        } else if (i == 2) {
            sheetValue = SheetValue.PartiallyExpanded;
            if (!cg3VarA.d(sheetValue)) {
                sheetValue = SheetValue.Expanded;
                if (!cg3VarA.d(sheetValue)) {
                    sheetValue = SheetValue.Hidden;
                }
            }
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            sheetValue = SheetValue.Expanded;
            if (!cg3VarA.d(sheetValue)) {
                sheetValue = SheetValue.Hidden;
            }
        }
        return qjd.a(cg3VarA, sheetValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(float f, q16 q16Var, SheetState sheetState, eg3 eg3Var) {
        eg3Var.a(SheetValue.Hidden, f);
        if (((int) (q16Var.getPackedValue() & 4294967295L)) > f / 2 && !sheetState.getSkipPartiallyExpanded()) {
            eg3Var.a(SheetValue.PartiallyExpanded, f / 2.0f);
        }
        if (((int) (q16Var.getPackedValue() & 4294967295L)) != 0) {
            eg3Var.a(SheetValue.Expanded, Math.max(0.0f, f - ((int) (q16Var.getPackedValue() & 4294967295L))));
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(String str, nfb nfbVar) {
        SemanticsPropertiesKt.l0(nfbVar, str);
        SemanticsPropertiesKt.G0(nfbVar, 0.0f);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(SheetState sheetState, Animatable animatable, m mVar) {
        float fX = sheetState.h().x();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (mVar.getSize() & 4294967295L));
        if (!Float.isNaN(fX) && !Float.isNaN(fIntBitsToFloat) && fIntBitsToFloat != 0.0f) {
            float fFloatValue = ((Number) animatable.m()).floatValue();
            mVar.G(R(mVar, fFloatValue));
            mVar.M(S(mVar, fFloatValue));
            mVar.i0(xdd.a(0.5f, (fX + fIntBitsToFloat) / fIntBitsToFloat));
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit y(mt0 mt0Var, Animatable animatable, ta2 ta2Var, Function0 function0, Function1 function1, androidx.compose.ui.b bVar, SheetState sheetState, float f, boolean z, xkb xkbVar, long j, long j2, float f2, Function2 function2, Function2 function3, ps4 ps4Var, int i, int i2, int i3, androidx.compose.p004runtime.d dVar, int i4) throws NoWhenBranchMatchedException {
        t(mt0Var, animatable, ta2Var, function0, function1, bVar, sheetState, f, z, xkbVar, j, j2, f2, function2, function3, ps4Var, dVar, saa.a(i | 1), saa.a(i2), i3);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(SheetState sheetState, xa4 xa4Var, xa4 xa4Var2, xa4 xa4Var3) {
        sheetState.v(xa4Var);
        sheetState.u(xa4Var2);
        sheetState.t(xa4Var3);
        return Unit.a;
    }
}
