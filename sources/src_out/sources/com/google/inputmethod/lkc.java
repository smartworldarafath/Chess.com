package com.google.inputmethod;

import androidx.compose.p000animation.ColorVectorConverterKt;
import androidx.compose.p000animation.core.Transition;
import androidx.compose.p000animation.core.TransitionKt;
import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p001foundation.layout.o;
import androidx.compose.p002material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p004runtime.d;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import com.google.android.ps4;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a}\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001am\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a5\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a/\u0010\u001a\u001a\u00020\u00032\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010!\u001a\u00020\u0003*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"\u001aK\u0010*\u001a\u00020\u0003*\u00020\u001c2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u001fH\u0002¢\u0006\u0004\b*\u0010+\"\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.\"\u0014\u00101\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.\"\u001a\u00105\u001a\u00020,8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b3\u00104\"\u0014\u00107\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010.\"\u0014\u00108\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010.\"\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010:\"\u0014\u0010<\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010.¨\u0006>²\u0006\f\u0010=\u001a\u00020\n8\nX\u008a\u0084\u0002"}, d2 = {"", "selected", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/b;", "modifier", "enabled", "text", "icon", "Lcom/google/android/ei1;", "selectedContentColor", "unselectedContentColor", "Lcom/google/android/r48;", "interactionSource", "f", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/b;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJLcom/google/android/r48;Landroidx/compose/runtime/d;II)V", "Lkotlin/Function1;", "Lcom/google/android/xj1;", "content", "e", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/b;ZJJLcom/google/android/r48;Lcom/google/android/ps4;Landroidx/compose/runtime/d;II)V", "activeColor", "inactiveColor", "i", "(JJZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "g", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "Landroidx/compose/ui/layout/o$a;", "Landroidx/compose/ui/layout/o;", "textOrIconPlaceable", "", "tabHeight", "v", "(Landroidx/compose/ui/layout/o$a;Landroidx/compose/ui/layout/o;I)V", "Lcom/google/android/f43;", "density", "textPlaceable", "iconPlaceable", "tabWidth", "firstBaseline", "lastBaseline", "u", "(Landroidx/compose/ui/layout/o$a;Lcom/google/android/f43;Landroidx/compose/ui/layout/o;Landroidx/compose/ui/layout/o;IIII)V", "Lcom/google/android/ff3;", "a", "F", "SmallTabHeight", "b", "LargeTabHeight", "c", "t", "()F", "HorizontalTextPadding", "d", "SingleLineTextBaselineWithIcon", "DoubleLineTextBaselineWithIcon", "Lcom/google/android/b0d;", "J", "IconDistanceFromBaseline", "TextDistanceFromLeadingIcon", "color", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class lkc {
    private static final float a = mm9.a.c();
    private static final float b = ff3.i(72);
    private static final float c = ff3.i(16);
    private static final float d = ff3.i(14);
    private static final float e = ff3.i(6);
    private static final long f = c0d.i(20);
    private static final float g = ff3.i(8);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements ps4<xj1, androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> a;
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> b;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function3) {
            this.a = function2;
            this.b = function3;
        }

        public final void a(xj1 xj1Var, androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 17) != 16, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-906085472, i, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:120)");
            }
            lkc.g(this.a, this.b, dVar, 0);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((xj1) obj, (androidx.compose.p004runtime.d) obj2, ((Number) obj3).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ androidx.compose.ui.b a;
        final /* synthetic */ boolean b;
        final /* synthetic */ r48 c;
        final /* synthetic */ av5 d;
        final /* synthetic */ boolean e;
        final /* synthetic */ Function0<Unit> f;
        final /* synthetic */ ps4<xj1, androidx.compose.p004runtime.d, Integer, Unit> g;

        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.b bVar, boolean z, r48 r48Var, av5 av5Var, boolean z2, Function0<Unit> function0, ps4<? super xj1, ? super androidx.compose.p004runtime.d, ? super Integer, Unit> ps4Var) {
            this.a = bVar;
            this.b = z;
            this.c = r48Var;
            this.d = av5Var;
            this.e = z2;
            this.f = function0;
            this.g = ps4Var;
        }

        public final void a(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(1128552423, i, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:244)");
            }
            androidx.compose.ui.b bVarH = SizeKt.h(hdb.a(this.a, this.b, this.c, this.d, this.e, hpa.j(hpa.INSTANCE.h()), this.f), 0.0f, 1, null);
            tc.b bVarG = tc.INSTANCE.g();
            androidx.compose.foundation.layout.c.f fVarE = androidx.compose.p001foundation.layout.c.a.e();
            ps4<xj1, androidx.compose.p004runtime.d, Integer, Unit> ps4Var = this.g;
            ej7 ej7VarA = o.a(fVarE, bVarG, dVar, 54);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, bVarH);
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
            dud.i(dVarC, ej7VarA, companion.d());
            dud.i(dVarC, gs1VarJ, companion.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion.e());
            ps4Var.invoke(yj1.a, dVar, 6);
            dVar.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> a;

        /* JADX WARN: Multi-variable type inference failed */
        c(Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2) {
            this.a = function2;
        }

        public final void a(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1745256900, i, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:104)");
            }
            qxc.h(TextStyle.c(xod.e(mm9.a.d(), dVar, 6), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, cpc.INSTANCE.a(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), this.a, dVar, 0);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class d implements ej7 {
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> a;
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> b;

        /* JADX WARN: Multi-variable type inference failed */
        d(Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function3) {
            this.a = function2;
            this.b = function3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(androidx.compose.ui.layout.o oVar, androidx.compose.ui.layout.o oVar2, j jVar, int i, int i2, Integer num, Integer num2, androidx.compose.ui.layout.o.a aVar) {
            if (oVar != null && oVar2 != null) {
                Intrinsics.g(num);
                int iIntValue = num.intValue();
                Intrinsics.g(num2);
                lkc.u(aVar, jVar, oVar, oVar2, i, i2, iIntValue, num2.intValue());
            } else if (oVar != null) {
                lkc.v(aVar, oVar, i2);
            } else if (oVar2 != null) {
                lkc.v(aVar, oVar2, i2);
            }
            return Unit.a;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        @Override // com.google.inputmethod.ej7
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final fj7 mo0measure3p2s80s(final j jVar, List<? extends dj7> list, long j) throws KotlinNothingValueException {
            androidx.compose.ui.layout.o oVarR0;
            androidx.compose.ui.layout.o oVarR1;
            if (this.a != null) {
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        m47.f("Collection contains no element matching the predicate.");
                        throw new KotlinNothingValueException();
                    }
                    dj7 dj7Var = list.get(i);
                    if (Intrinsics.e(pn6.a(dj7Var), "text")) {
                        oVarR0 = dj7Var.r0(kx1.d(j, 0, 0, 0, 0, 11, null));
                        break;
                    }
                    i++;
                }
            } else {
                oVarR0 = null;
            }
            if (this.b != null) {
                int size2 = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        m47.f("Collection contains no element matching the predicate.");
                        throw new KotlinNothingValueException();
                    }
                    dj7 dj7Var2 = list.get(i2);
                    if (Intrinsics.e(pn6.a(dj7Var2), "icon")) {
                        oVarR1 = dj7Var2.r0(j);
                        break;
                    }
                    i2++;
                }
            } else {
                oVarR1 = null;
            }
            final int iMax = Math.max(oVarR0 != null ? oVarR0.getWidth() : 0, oVarR1 != null ? oVarR1.getWidth() : 0);
            final int iMax2 = Math.max(jVar.O1((oVarR0 == null || oVarR1 == null) ? lkc.a : lkc.b), (oVarR1 != null ? oVarR1.getHeight() : 0) + (oVarR0 != null ? oVarR0.getHeight() : 0) + jVar.A2(lkc.f));
            final Integer numValueOf = oVarR0 != null ? Integer.valueOf(oVarR0.J(AlignmentLineKt.a())) : null;
            final Integer numValueOf2 = oVarR0 != null ? Integer.valueOf(oVarR0.J(AlignmentLineKt.b())) : null;
            final androidx.compose.ui.layout.o oVar = oVarR0;
            final androidx.compose.ui.layout.o oVar2 = oVarR1;
            return j.Q1(jVar, iMax, iMax2, null, new Function1() { // from class: com.google.android.mkc
                public final Object invoke(Object obj) {
                    return lkc.d.b(oVar, oVar2, jVar, iMax, iMax2, numValueOf, numValueOf2, (androidx.compose.ui.layout.o.a) obj);
                }
            }, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class e implements ps4<Transition.b<Boolean>, androidx.compose.p004runtime.d, Integer, xa4<ei1>> {
        public static final e a = new e();

        e() {
        }

        public final xa4<ei1> a(Transition.b<Boolean> bVar, androidx.compose.p004runtime.d dVar, int i) {
            xa4<ei1> xa4VarB;
            dVar.y(1058649156);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(1058649156, i, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:280)");
            }
            if (bVar.c(Boolean.FALSE, Boolean.TRUE)) {
                dVar.y(272207019);
                xa4VarB = d08.b(MotionSchemeKeyTokens.DefaultEffects, dVar, 6);
                dVar.u();
            } else {
                dVar.y(272326989);
                xa4VarB = d08.b(MotionSchemeKeyTokens.FastEffects, dVar, 6);
                dVar.u();
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            dVar.u();
            return xa4VarB;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((Transition.b) obj, (androidx.compose.p004runtime.d) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0129 A[PHI: r0 r4 r8 r9 r13
  0x0129: PHI (r0v28 int) = (r0v16 int), (r0v32 int), (r0v33 int) binds: [B:120:0x015b, B:105:0x0126, B:106:0x0128] A[DONT_GENERATE, DONT_INLINE]
  0x0129: PHI (r4v8 androidx.compose.ui.b) = (r4v5 androidx.compose.ui.b), (r4v2 androidx.compose.ui.b), (r4v2 androidx.compose.ui.b) binds: [B:120:0x015b, B:105:0x0126, B:106:0x0128] A[DONT_GENERATE, DONT_INLINE]
  0x0129: PHI (r8v9 boolean) = (r8v3 boolean), (r8v2 boolean), (r8v2 boolean) binds: [B:120:0x015b, B:105:0x0126, B:106:0x0128] A[DONT_GENERATE, DONT_INLINE]
  0x0129: PHI (r9v13 long) = (r9v9 long), (r9v6 long), (r9v6 long) binds: [B:120:0x015b, B:105:0x0126, B:106:0x0128] A[DONT_GENERATE, DONT_INLINE]
  0x0129: PHI (r13v9 long) = (r13v5 long), (r13v3 long), (r13v3 long) binds: [B:120:0x015b, B:105:0x0126, B:106:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x0136 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0138  */
    /* JADX WARN: Code duplicated, block: B:112:0x013d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0142  */
    /* JADX WARN: Code duplicated, block: B:116:0x0153  */
    /* JADX WARN: Code duplicated, block: B:119:0x0159  */
    /* JADX WARN: Code duplicated, block: B:121:0x015d  */
    /* JADX WARN: Code duplicated, block: B:124:0x016f  */
    /* JADX WARN: Code duplicated, block: B:127:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:129:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:132:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:95:0x0104  */
    /* JADX WARN: Code duplicated, block: B:97:0x0111  */
    public static final void e(final boolean z, final Function0<Unit> function0, androidx.compose.ui.b bVar, boolean z2, long j, long j2, r48 r48Var, final ps4<? super xj1, ? super androidx.compose.p004runtime.d, ? super Integer, Unit> ps4Var, androidx.compose.p004runtime.d dVar, final int i, final int i2) {
        boolean z3;
        int i3;
        int i4;
        androidx.compose.ui.b bVar2;
        int i5;
        int i6;
        boolean z4;
        int i7;
        long value;
        long j3;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z5;
        final androidx.compose.ui.b bVar3;
        final boolean z6;
        final long j4;
        final long j5;
        final r48 r48Var2;
        s6b s6bVarH;
        int i12;
        androidx.compose.ui.b bVar4;
        long j6;
        r48 r48Var3;
        androidx.compose.p004runtime.d dVarF = dVar.F(-1573136853);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 6) == 0) {
                i3 = (dVarF.A(z3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) == 0) {
            if ((i & 48) == 0) {
                i3 |= dVarF.T(function0) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    bVar2 = bVar;
                    if (dVarF.x(bVar2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        z4 = z2;
                        if (dVarF.A(z4)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    if ((i & 24576) == 0) {
                        if ((i2 & 16) == 0) {
                            value = j;
                            int i13 = dVarF.D(value) ? 16384 : 8192;
                            i3 |= i13;
                        } else {
                            value = j;
                        }
                        i3 |= i13;
                    } else {
                        value = j;
                    }
                    if ((196608 & i) == 0) {
                        if ((i2 & 32) == 0) {
                            j3 = j2;
                            int i14 = dVarF.D(j3) ? 131072 : 65536;
                            i3 |= i14;
                        } else {
                            j3 = j2;
                        }
                        i3 |= i14;
                    } else {
                        j3 = j2;
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (dVarF.x(r48Var)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 128) != 0) {
                        if ((i & 12582912) == 0) {
                            if (dVarF.T(ps4Var)) {
                                i10 = 8388608;
                            } else {
                                i10 = 4194304;
                            }
                            i3 |= i10;
                        }
                        i11 = i3;
                        if ((i3 & 4793491) != 4793490) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (dVarF.g(z5, i11 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0 || dVarF.t()) {
                                if (i4 != 0) {
                                    bVar2 = androidx.compose.ui.b.INSTANCE;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                }
                                if ((i2 & 16) != 0) {
                                    value = ((ei1) dVarF.v(cz1.a())).getValue();
                                    i12 = i11 & (-57345);
                                } else {
                                    i12 = i11;
                                }
                                if ((i2 & 32) != 0) {
                                    i12 &= -458753;
                                    j3 = value;
                                }
                                if (i8 != 0) {
                                    bVar4 = bVar2;
                                    j6 = j3;
                                    r48Var3 = null;
                                }
                                boolean z7 = z4;
                                dVarF.M();
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.o(-1573136853, i12, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                                }
                                int i15 = i12 >> 12;
                                i(value, j6, z, ko1.e(1128552423, true, new b(bVar4, z3, r48Var3, xoa.e(true, 0.0f, value, 2, null), z7, function0, ps4Var), dVarF, 54), dVarF, (i15 & 112) | (i15 & 14) | 3072 | ((i12 << 6) & 896));
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.n();
                                }
                                j4 = value;
                                r48Var2 = r48Var3;
                                j5 = j6;
                                bVar3 = bVar4;
                                z6 = z7;
                            } else {
                                dVarF.q();
                                i12 = (i2 & 16) != 0 ? i11 & (-57345) : i11;
                                if ((i2 & 32) != 0) {
                                    i12 &= -458753;
                                }
                            }
                            bVar4 = bVar2;
                            j6 = j3;
                            r48Var3 = r48Var;
                            boolean z8 = z4;
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-1573136853, i12, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                            }
                            int i16 = i12 >> 12;
                            i(value, j6, z, ko1.e(1128552423, true, new b(bVar4, z3, r48Var3, xoa.e(true, 0.0f, value, 2, null), z8, function0, ps4Var), dVarF, 54), dVarF, (i16 & 112) | (i16 & 14) | 3072 | ((i12 << 6) & 896));
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            j4 = value;
                            r48Var2 = r48Var3;
                            j5 = j6;
                            bVar3 = bVar4;
                            z6 = z8;
                        } else {
                            dVarF.q();
                            bVar3 = bVar2;
                            z6 = z4;
                            j4 = value;
                            j5 = j3;
                            r48Var2 = r48Var;
                        }
                        s6bVarH = dVarF.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.ikc
                                public final Object invoke(Object obj, Object obj2) {
                                    return lkc.l(z, function0, bVar3, z6, j4, j5, r48Var2, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i3 |= 12582912;
                    i11 = i3;
                    if ((i3 & 4793491) != 4793490) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (dVarF.g(z5, i11 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 16) != 0) {
                                value = ((ei1) dVarF.v(cz1.a())).getValue();
                                i12 = i11 & (-57345);
                            } else {
                                i12 = i11;
                            }
                            if ((i2 & 32) != 0) {
                                i12 &= -458753;
                                j3 = value;
                            }
                            if (i8 != 0) {
                                bVar4 = bVar2;
                                j6 = j3;
                                r48Var3 = null;
                            } else {
                                bVar4 = bVar2;
                                j6 = j3;
                                r48Var3 = r48Var;
                            }
                        } else {
                            if (i4 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 16) != 0) {
                                value = ((ei1) dVarF.v(cz1.a())).getValue();
                                i12 = i11 & (-57345);
                            } else {
                                i12 = i11;
                            }
                            if ((i2 & 32) != 0) {
                                i12 &= -458753;
                                j3 = value;
                            }
                            if (i8 != 0) {
                                bVar4 = bVar2;
                                j6 = j3;
                                r48Var3 = null;
                            } else {
                                bVar4 = bVar2;
                                j6 = j3;
                                r48Var3 = r48Var;
                            }
                        }
                        boolean z9 = z4;
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-1573136853, i12, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                        }
                        int i17 = i12 >> 12;
                        i(value, j6, z, ko1.e(1128552423, true, new b(bVar4, z3, r48Var3, xoa.e(true, 0.0f, value, 2, null), z9, function0, ps4Var), dVarF, 54), dVarF, (i17 & 112) | (i17 & 14) | 3072 | ((i12 << 6) & 896));
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        j4 = value;
                        r48Var2 = r48Var3;
                        j5 = j6;
                        bVar3 = bVar4;
                        z6 = z9;
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                        z6 = z4;
                        j4 = value;
                        j5 = j3;
                        r48Var2 = r48Var;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.ikc
                            public final Object invoke(Object obj, Object obj2) {
                                return lkc.l(z, function0, bVar3, z6, j4, j5, r48Var2, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 3072;
                z4 = z2;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        value = j;
                        if (dVarF.D(value)) {
                        }
                        i3 |= i13;
                    } else {
                        value = j;
                    }
                    i3 |= i13;
                } else {
                    value = j;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        j3 = j2;
                        if (dVarF.D(j3)) {
                        }
                        i3 |= i14;
                    } else {
                        j3 = j2;
                    }
                    i3 |= i14;
                } else {
                    j3 = j2;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (dVarF.x(r48Var)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if ((i2 & 128) != 0) {
                    if ((i & 12582912) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i3 |= i10;
                    }
                    i11 = i3;
                    if ((i3 & 4793491) != 4793490) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (dVarF.g(z5, i11 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 16) != 0) {
                                value = ((ei1) dVarF.v(cz1.a())).getValue();
                                i12 = i11 & (-57345);
                            } else {
                                i12 = i11;
                            }
                            if ((i2 & 32) != 0) {
                                i12 &= -458753;
                                j3 = value;
                            }
                            if (i8 != 0) {
                                bVar4 = bVar2;
                                j6 = j3;
                                r48Var3 = null;
                            } else {
                                bVar4 = bVar2;
                                j6 = j3;
                                r48Var3 = r48Var;
                            }
                        } else {
                            if (i4 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 16) != 0) {
                                value = ((ei1) dVarF.v(cz1.a())).getValue();
                                i12 = i11 & (-57345);
                            } else {
                                i12 = i11;
                            }
                            if ((i2 & 32) != 0) {
                                i12 &= -458753;
                                j3 = value;
                            }
                            if (i8 != 0) {
                                bVar4 = bVar2;
                                j6 = j3;
                                r48Var3 = null;
                            } else {
                                bVar4 = bVar2;
                                j6 = j3;
                                r48Var3 = r48Var;
                            }
                        }
                        boolean z10 = z4;
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-1573136853, i12, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                        }
                        int i18 = i12 >> 12;
                        i(value, j6, z, ko1.e(1128552423, true, new b(bVar4, z3, r48Var3, xoa.e(true, 0.0f, value, 2, null), z10, function0, ps4Var), dVarF, 54), dVarF, (i18 & 112) | (i18 & 14) | 3072 | ((i12 << 6) & 896));
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        j4 = value;
                        r48Var2 = r48Var3;
                        j5 = j6;
                        bVar3 = bVar4;
                        z6 = z10;
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                        z6 = z4;
                        j4 = value;
                        j5 = j3;
                        r48Var2 = r48Var;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.ikc
                            public final Object invoke(Object obj, Object obj2) {
                                return lkc.l(z, function0, bVar3, z6, j4, j5, r48Var2, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 12582912;
                i11 = i3;
                if ((i3 & 4793491) != 4793490) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dVarF.g(z5, i11 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 16) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i12 = i11 & (-57345);
                        } else {
                            i12 = i11;
                        }
                        if ((i2 & 32) != 0) {
                            i12 &= -458753;
                            j3 = value;
                        }
                        if (i8 != 0) {
                            bVar4 = bVar2;
                            j6 = j3;
                            r48Var3 = null;
                        } else {
                            bVar4 = bVar2;
                            j6 = j3;
                            r48Var3 = r48Var;
                        }
                    } else {
                        if (i4 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 16) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i12 = i11 & (-57345);
                        } else {
                            i12 = i11;
                        }
                        if ((i2 & 32) != 0) {
                            i12 &= -458753;
                            j3 = value;
                        }
                        if (i8 != 0) {
                            bVar4 = bVar2;
                            j6 = j3;
                            r48Var3 = null;
                        } else {
                            bVar4 = bVar2;
                            j6 = j3;
                            r48Var3 = r48Var;
                        }
                    }
                    boolean z11 = z4;
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-1573136853, i12, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                    }
                    int i19 = i12 >> 12;
                    i(value, j6, z, ko1.e(1128552423, true, new b(bVar4, z3, r48Var3, xoa.e(true, 0.0f, value, 2, null), z11, function0, ps4Var), dVarF, 54), dVarF, (i19 & 112) | (i19 & 14) | 3072 | ((i12 << 6) & 896));
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    j4 = value;
                    r48Var2 = r48Var3;
                    j5 = j6;
                    bVar3 = bVar4;
                    z6 = z11;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    z6 = z4;
                    j4 = value;
                    j5 = j3;
                    r48Var2 = r48Var;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.ikc
                        public final Object invoke(Object obj, Object obj2) {
                            return lkc.l(z, function0, bVar3, z6, j4, j5, r48Var2, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 384;
            bVar2 = bVar;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    z4 = z2;
                    if (dVarF.A(z4)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        value = j;
                        if (dVarF.D(value)) {
                        }
                        i3 |= i13;
                    } else {
                        value = j;
                    }
                    i3 |= i13;
                } else {
                    value = j;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        j3 = j2;
                        if (dVarF.D(j3)) {
                        }
                        i3 |= i14;
                    } else {
                        j3 = j2;
                    }
                    i3 |= i14;
                } else {
                    j3 = j2;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (dVarF.x(r48Var)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if ((i2 & 128) != 0) {
                    if ((i & 12582912) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i3 |= i10;
                    }
                    i11 = i3;
                    if ((i3 & 4793491) != 4793490) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (dVarF.g(z5, i11 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 16) != 0) {
                                value = ((ei1) dVarF.v(cz1.a())).getValue();
                                i12 = i11 & (-57345);
                            } else {
                                i12 = i11;
                            }
                            if ((i2 & 32) != 0) {
                                i12 &= -458753;
                                j3 = value;
                            }
                            if (i8 != 0) {
                                bVar4 = bVar2;
                                j6 = j3;
                                r48Var3 = null;
                            } else {
                                bVar4 = bVar2;
                                j6 = j3;
                                r48Var3 = r48Var;
                            }
                        } else {
                            if (i4 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 16) != 0) {
                                value = ((ei1) dVarF.v(cz1.a())).getValue();
                                i12 = i11 & (-57345);
                            } else {
                                i12 = i11;
                            }
                            if ((i2 & 32) != 0) {
                                i12 &= -458753;
                                j3 = value;
                            }
                            if (i8 != 0) {
                                bVar4 = bVar2;
                                j6 = j3;
                                r48Var3 = null;
                            } else {
                                bVar4 = bVar2;
                                j6 = j3;
                                r48Var3 = r48Var;
                            }
                        }
                        boolean z12 = z4;
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-1573136853, i12, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                        }
                        int i110 = i12 >> 12;
                        i(value, j6, z, ko1.e(1128552423, true, new b(bVar4, z3, r48Var3, xoa.e(true, 0.0f, value, 2, null), z12, function0, ps4Var), dVarF, 54), dVarF, (i110 & 112) | (i110 & 14) | 3072 | ((i12 << 6) & 896));
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        j4 = value;
                        r48Var2 = r48Var3;
                        j5 = j6;
                        bVar3 = bVar4;
                        z6 = z12;
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                        z6 = z4;
                        j4 = value;
                        j5 = j3;
                        r48Var2 = r48Var;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.ikc
                            public final Object invoke(Object obj, Object obj2) {
                                return lkc.l(z, function0, bVar3, z6, j4, j5, r48Var2, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 12582912;
                i11 = i3;
                if ((i3 & 4793491) != 4793490) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dVarF.g(z5, i11 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 16) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i12 = i11 & (-57345);
                        } else {
                            i12 = i11;
                        }
                        if ((i2 & 32) != 0) {
                            i12 &= -458753;
                            j3 = value;
                        }
                        if (i8 != 0) {
                            bVar4 = bVar2;
                            j6 = j3;
                            r48Var3 = null;
                        } else {
                            bVar4 = bVar2;
                            j6 = j3;
                            r48Var3 = r48Var;
                        }
                    } else {
                        if (i4 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 16) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i12 = i11 & (-57345);
                        } else {
                            i12 = i11;
                        }
                        if ((i2 & 32) != 0) {
                            i12 &= -458753;
                            j3 = value;
                        }
                        if (i8 != 0) {
                            bVar4 = bVar2;
                            j6 = j3;
                            r48Var3 = null;
                        } else {
                            bVar4 = bVar2;
                            j6 = j3;
                            r48Var3 = r48Var;
                        }
                    }
                    boolean z13 = z4;
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-1573136853, i12, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                    }
                    int i111 = i12 >> 12;
                    i(value, j6, z, ko1.e(1128552423, true, new b(bVar4, z3, r48Var3, xoa.e(true, 0.0f, value, 2, null), z13, function0, ps4Var), dVarF, 54), dVarF, (i111 & 112) | (i111 & 14) | 3072 | ((i12 << 6) & 896));
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    j4 = value;
                    r48Var2 = r48Var3;
                    j5 = j6;
                    bVar3 = bVar4;
                    z6 = z13;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    z6 = z4;
                    j4 = value;
                    j5 = j3;
                    r48Var2 = r48Var;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.ikc
                        public final Object invoke(Object obj, Object obj2) {
                            return lkc.l(z, function0, bVar3, z6, j4, j5, r48Var2, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 3072;
            z4 = z2;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    value = j;
                    if (dVarF.D(value)) {
                    }
                    i3 |= i13;
                } else {
                    value = j;
                }
                i3 |= i13;
            } else {
                value = j;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    j3 = j2;
                    if (dVarF.D(j3)) {
                    }
                    i3 |= i14;
                } else {
                    j3 = j2;
                }
                i3 |= i14;
            } else {
                j3 = j2;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (dVarF.x(r48Var)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            if ((i2 & 128) != 0) {
                if ((i & 12582912) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
                i11 = i3;
                if ((i3 & 4793491) != 4793490) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dVarF.g(z5, i11 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 16) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i12 = i11 & (-57345);
                        } else {
                            i12 = i11;
                        }
                        if ((i2 & 32) != 0) {
                            i12 &= -458753;
                            j3 = value;
                        }
                        if (i8 != 0) {
                            bVar4 = bVar2;
                            j6 = j3;
                            r48Var3 = null;
                        } else {
                            bVar4 = bVar2;
                            j6 = j3;
                            r48Var3 = r48Var;
                        }
                    } else {
                        if (i4 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 16) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i12 = i11 & (-57345);
                        } else {
                            i12 = i11;
                        }
                        if ((i2 & 32) != 0) {
                            i12 &= -458753;
                            j3 = value;
                        }
                        if (i8 != 0) {
                            bVar4 = bVar2;
                            j6 = j3;
                            r48Var3 = null;
                        } else {
                            bVar4 = bVar2;
                            j6 = j3;
                            r48Var3 = r48Var;
                        }
                    }
                    boolean z14 = z4;
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-1573136853, i12, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                    }
                    int i112 = i12 >> 12;
                    i(value, j6, z, ko1.e(1128552423, true, new b(bVar4, z3, r48Var3, xoa.e(true, 0.0f, value, 2, null), z14, function0, ps4Var), dVarF, 54), dVarF, (i112 & 112) | (i112 & 14) | 3072 | ((i12 << 6) & 896));
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    j4 = value;
                    r48Var2 = r48Var3;
                    j5 = j6;
                    bVar3 = bVar4;
                    z6 = z14;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    z6 = z4;
                    j4 = value;
                    j5 = j3;
                    r48Var2 = r48Var;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.ikc
                        public final Object invoke(Object obj, Object obj2) {
                            return lkc.l(z, function0, bVar3, z6, j4, j5, r48Var2, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 12582912;
            i11 = i3;
            if ((i3 & 4793491) != 4793490) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (dVarF.g(z5, i11 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 16) != 0) {
                        value = ((ei1) dVarF.v(cz1.a())).getValue();
                        i12 = i11 & (-57345);
                    } else {
                        i12 = i11;
                    }
                    if ((i2 & 32) != 0) {
                        i12 &= -458753;
                        j3 = value;
                    }
                    if (i8 != 0) {
                        bVar4 = bVar2;
                        j6 = j3;
                        r48Var3 = null;
                    } else {
                        bVar4 = bVar2;
                        j6 = j3;
                        r48Var3 = r48Var;
                    }
                } else {
                    if (i4 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 16) != 0) {
                        value = ((ei1) dVarF.v(cz1.a())).getValue();
                        i12 = i11 & (-57345);
                    } else {
                        i12 = i11;
                    }
                    if ((i2 & 32) != 0) {
                        i12 &= -458753;
                        j3 = value;
                    }
                    if (i8 != 0) {
                        bVar4 = bVar2;
                        j6 = j3;
                        r48Var3 = null;
                    } else {
                        bVar4 = bVar2;
                        j6 = j3;
                        r48Var3 = r48Var;
                    }
                }
                boolean z15 = z4;
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-1573136853, i12, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                }
                int i113 = i12 >> 12;
                i(value, j6, z, ko1.e(1128552423, true, new b(bVar4, z3, r48Var3, xoa.e(true, 0.0f, value, 2, null), z15, function0, ps4Var), dVarF, 54), dVarF, (i113 & 112) | (i113 & 14) | 3072 | ((i12 << 6) & 896));
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                j4 = value;
                r48Var2 = r48Var3;
                j5 = j6;
                bVar3 = bVar4;
                z6 = z15;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                z6 = z4;
                j4 = value;
                j5 = j3;
                r48Var2 = r48Var;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.ikc
                    public final Object invoke(Object obj, Object obj2) {
                        return lkc.l(z, function0, bVar3, z6, j4, j5, r48Var2, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                bVar2 = bVar;
                if (dVarF.x(bVar2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    z4 = z2;
                    if (dVarF.A(z4)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        value = j;
                        if (dVarF.D(value)) {
                        }
                        i3 |= i13;
                    } else {
                        value = j;
                    }
                    i3 |= i13;
                } else {
                    value = j;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        j3 = j2;
                        if (dVarF.D(j3)) {
                        }
                        i3 |= i14;
                    } else {
                        j3 = j2;
                    }
                    i3 |= i14;
                } else {
                    j3 = j2;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (dVarF.x(r48Var)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if ((i2 & 128) != 0) {
                    if ((i & 12582912) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i3 |= i10;
                    }
                    i11 = i3;
                    if ((i3 & 4793491) != 4793490) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (dVarF.g(z5, i11 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 16) != 0) {
                                value = ((ei1) dVarF.v(cz1.a())).getValue();
                                i12 = i11 & (-57345);
                            } else {
                                i12 = i11;
                            }
                            if ((i2 & 32) != 0) {
                                i12 &= -458753;
                                j3 = value;
                            }
                            if (i8 != 0) {
                                bVar4 = bVar2;
                                j6 = j3;
                                r48Var3 = null;
                            } else {
                                bVar4 = bVar2;
                                j6 = j3;
                                r48Var3 = r48Var;
                            }
                        } else {
                            if (i4 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 16) != 0) {
                                value = ((ei1) dVarF.v(cz1.a())).getValue();
                                i12 = i11 & (-57345);
                            } else {
                                i12 = i11;
                            }
                            if ((i2 & 32) != 0) {
                                i12 &= -458753;
                                j3 = value;
                            }
                            if (i8 != 0) {
                                bVar4 = bVar2;
                                j6 = j3;
                                r48Var3 = null;
                            } else {
                                bVar4 = bVar2;
                                j6 = j3;
                                r48Var3 = r48Var;
                            }
                        }
                        boolean z16 = z4;
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-1573136853, i12, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                        }
                        int i114 = i12 >> 12;
                        i(value, j6, z, ko1.e(1128552423, true, new b(bVar4, z3, r48Var3, xoa.e(true, 0.0f, value, 2, null), z16, function0, ps4Var), dVarF, 54), dVarF, (i114 & 112) | (i114 & 14) | 3072 | ((i12 << 6) & 896));
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        j4 = value;
                        r48Var2 = r48Var3;
                        j5 = j6;
                        bVar3 = bVar4;
                        z6 = z16;
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                        z6 = z4;
                        j4 = value;
                        j5 = j3;
                        r48Var2 = r48Var;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.ikc
                            public final Object invoke(Object obj, Object obj2) {
                                return lkc.l(z, function0, bVar3, z6, j4, j5, r48Var2, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 12582912;
                i11 = i3;
                if ((i3 & 4793491) != 4793490) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dVarF.g(z5, i11 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 16) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i12 = i11 & (-57345);
                        } else {
                            i12 = i11;
                        }
                        if ((i2 & 32) != 0) {
                            i12 &= -458753;
                            j3 = value;
                        }
                        if (i8 != 0) {
                            bVar4 = bVar2;
                            j6 = j3;
                            r48Var3 = null;
                        } else {
                            bVar4 = bVar2;
                            j6 = j3;
                            r48Var3 = r48Var;
                        }
                    } else {
                        if (i4 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 16) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i12 = i11 & (-57345);
                        } else {
                            i12 = i11;
                        }
                        if ((i2 & 32) != 0) {
                            i12 &= -458753;
                            j3 = value;
                        }
                        if (i8 != 0) {
                            bVar4 = bVar2;
                            j6 = j3;
                            r48Var3 = null;
                        } else {
                            bVar4 = bVar2;
                            j6 = j3;
                            r48Var3 = r48Var;
                        }
                    }
                    boolean z17 = z4;
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-1573136853, i12, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                    }
                    int i115 = i12 >> 12;
                    i(value, j6, z, ko1.e(1128552423, true, new b(bVar4, z3, r48Var3, xoa.e(true, 0.0f, value, 2, null), z17, function0, ps4Var), dVarF, 54), dVarF, (i115 & 112) | (i115 & 14) | 3072 | ((i12 << 6) & 896));
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    j4 = value;
                    r48Var2 = r48Var3;
                    j5 = j6;
                    bVar3 = bVar4;
                    z6 = z17;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    z6 = z4;
                    j4 = value;
                    j5 = j3;
                    r48Var2 = r48Var;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.ikc
                        public final Object invoke(Object obj, Object obj2) {
                            return lkc.l(z, function0, bVar3, z6, j4, j5, r48Var2, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 3072;
            z4 = z2;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    value = j;
                    if (dVarF.D(value)) {
                    }
                    i3 |= i13;
                } else {
                    value = j;
                }
                i3 |= i13;
            } else {
                value = j;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    j3 = j2;
                    if (dVarF.D(j3)) {
                    }
                    i3 |= i14;
                } else {
                    j3 = j2;
                }
                i3 |= i14;
            } else {
                j3 = j2;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (dVarF.x(r48Var)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            if ((i2 & 128) != 0) {
                if ((i & 12582912) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
                i11 = i3;
                if ((i3 & 4793491) != 4793490) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dVarF.g(z5, i11 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 16) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i12 = i11 & (-57345);
                        } else {
                            i12 = i11;
                        }
                        if ((i2 & 32) != 0) {
                            i12 &= -458753;
                            j3 = value;
                        }
                        if (i8 != 0) {
                            bVar4 = bVar2;
                            j6 = j3;
                            r48Var3 = null;
                        } else {
                            bVar4 = bVar2;
                            j6 = j3;
                            r48Var3 = r48Var;
                        }
                    } else {
                        if (i4 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 16) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i12 = i11 & (-57345);
                        } else {
                            i12 = i11;
                        }
                        if ((i2 & 32) != 0) {
                            i12 &= -458753;
                            j3 = value;
                        }
                        if (i8 != 0) {
                            bVar4 = bVar2;
                            j6 = j3;
                            r48Var3 = null;
                        } else {
                            bVar4 = bVar2;
                            j6 = j3;
                            r48Var3 = r48Var;
                        }
                    }
                    boolean z18 = z4;
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-1573136853, i12, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                    }
                    int i116 = i12 >> 12;
                    i(value, j6, z, ko1.e(1128552423, true, new b(bVar4, z3, r48Var3, xoa.e(true, 0.0f, value, 2, null), z18, function0, ps4Var), dVarF, 54), dVarF, (i116 & 112) | (i116 & 14) | 3072 | ((i12 << 6) & 896));
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    j4 = value;
                    r48Var2 = r48Var3;
                    j5 = j6;
                    bVar3 = bVar4;
                    z6 = z18;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    z6 = z4;
                    j4 = value;
                    j5 = j3;
                    r48Var2 = r48Var;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.ikc
                        public final Object invoke(Object obj, Object obj2) {
                            return lkc.l(z, function0, bVar3, z6, j4, j5, r48Var2, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 12582912;
            i11 = i3;
            if ((i3 & 4793491) != 4793490) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (dVarF.g(z5, i11 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 16) != 0) {
                        value = ((ei1) dVarF.v(cz1.a())).getValue();
                        i12 = i11 & (-57345);
                    } else {
                        i12 = i11;
                    }
                    if ((i2 & 32) != 0) {
                        i12 &= -458753;
                        j3 = value;
                    }
                    if (i8 != 0) {
                        bVar4 = bVar2;
                        j6 = j3;
                        r48Var3 = null;
                    } else {
                        bVar4 = bVar2;
                        j6 = j3;
                        r48Var3 = r48Var;
                    }
                } else {
                    if (i4 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 16) != 0) {
                        value = ((ei1) dVarF.v(cz1.a())).getValue();
                        i12 = i11 & (-57345);
                    } else {
                        i12 = i11;
                    }
                    if ((i2 & 32) != 0) {
                        i12 &= -458753;
                        j3 = value;
                    }
                    if (i8 != 0) {
                        bVar4 = bVar2;
                        j6 = j3;
                        r48Var3 = null;
                    } else {
                        bVar4 = bVar2;
                        j6 = j3;
                        r48Var3 = r48Var;
                    }
                }
                boolean z19 = z4;
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-1573136853, i12, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                }
                int i117 = i12 >> 12;
                i(value, j6, z, ko1.e(1128552423, true, new b(bVar4, z3, r48Var3, xoa.e(true, 0.0f, value, 2, null), z19, function0, ps4Var), dVarF, 54), dVarF, (i117 & 112) | (i117 & 14) | 3072 | ((i12 << 6) & 896));
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                j4 = value;
                r48Var2 = r48Var3;
                j5 = j6;
                bVar3 = bVar4;
                z6 = z19;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                z6 = z4;
                j4 = value;
                j5 = j3;
                r48Var2 = r48Var;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.ikc
                    public final Object invoke(Object obj, Object obj2) {
                        return lkc.l(z, function0, bVar3, z6, j4, j5, r48Var2, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        bVar2 = bVar;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                z4 = z2;
                if (dVarF.A(z4)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    value = j;
                    if (dVarF.D(value)) {
                    }
                    i3 |= i13;
                } else {
                    value = j;
                }
                i3 |= i13;
            } else {
                value = j;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    j3 = j2;
                    if (dVarF.D(j3)) {
                    }
                    i3 |= i14;
                } else {
                    j3 = j2;
                }
                i3 |= i14;
            } else {
                j3 = j2;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (dVarF.x(r48Var)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            if ((i2 & 128) != 0) {
                if ((i & 12582912) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
                i11 = i3;
                if ((i3 & 4793491) != 4793490) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dVarF.g(z5, i11 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 16) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i12 = i11 & (-57345);
                        } else {
                            i12 = i11;
                        }
                        if ((i2 & 32) != 0) {
                            i12 &= -458753;
                            j3 = value;
                        }
                        if (i8 != 0) {
                            bVar4 = bVar2;
                            j6 = j3;
                            r48Var3 = null;
                        } else {
                            bVar4 = bVar2;
                            j6 = j3;
                            r48Var3 = r48Var;
                        }
                    } else {
                        if (i4 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 16) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i12 = i11 & (-57345);
                        } else {
                            i12 = i11;
                        }
                        if ((i2 & 32) != 0) {
                            i12 &= -458753;
                            j3 = value;
                        }
                        if (i8 != 0) {
                            bVar4 = bVar2;
                            j6 = j3;
                            r48Var3 = null;
                        } else {
                            bVar4 = bVar2;
                            j6 = j3;
                            r48Var3 = r48Var;
                        }
                    }
                    boolean z110 = z4;
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-1573136853, i12, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                    }
                    int i118 = i12 >> 12;
                    i(value, j6, z, ko1.e(1128552423, true, new b(bVar4, z3, r48Var3, xoa.e(true, 0.0f, value, 2, null), z110, function0, ps4Var), dVarF, 54), dVarF, (i118 & 112) | (i118 & 14) | 3072 | ((i12 << 6) & 896));
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    j4 = value;
                    r48Var2 = r48Var3;
                    j5 = j6;
                    bVar3 = bVar4;
                    z6 = z110;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    z6 = z4;
                    j4 = value;
                    j5 = j3;
                    r48Var2 = r48Var;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.ikc
                        public final Object invoke(Object obj, Object obj2) {
                            return lkc.l(z, function0, bVar3, z6, j4, j5, r48Var2, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 12582912;
            i11 = i3;
            if ((i3 & 4793491) != 4793490) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (dVarF.g(z5, i11 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 16) != 0) {
                        value = ((ei1) dVarF.v(cz1.a())).getValue();
                        i12 = i11 & (-57345);
                    } else {
                        i12 = i11;
                    }
                    if ((i2 & 32) != 0) {
                        i12 &= -458753;
                        j3 = value;
                    }
                    if (i8 != 0) {
                        bVar4 = bVar2;
                        j6 = j3;
                        r48Var3 = null;
                    } else {
                        bVar4 = bVar2;
                        j6 = j3;
                        r48Var3 = r48Var;
                    }
                } else {
                    if (i4 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 16) != 0) {
                        value = ((ei1) dVarF.v(cz1.a())).getValue();
                        i12 = i11 & (-57345);
                    } else {
                        i12 = i11;
                    }
                    if ((i2 & 32) != 0) {
                        i12 &= -458753;
                        j3 = value;
                    }
                    if (i8 != 0) {
                        bVar4 = bVar2;
                        j6 = j3;
                        r48Var3 = null;
                    } else {
                        bVar4 = bVar2;
                        j6 = j3;
                        r48Var3 = r48Var;
                    }
                }
                boolean z111 = z4;
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-1573136853, i12, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                }
                int i119 = i12 >> 12;
                i(value, j6, z, ko1.e(1128552423, true, new b(bVar4, z3, r48Var3, xoa.e(true, 0.0f, value, 2, null), z111, function0, ps4Var), dVarF, 54), dVarF, (i119 & 112) | (i119 & 14) | 3072 | ((i12 << 6) & 896));
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                j4 = value;
                r48Var2 = r48Var3;
                j5 = j6;
                bVar3 = bVar4;
                z6 = z111;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                z6 = z4;
                j4 = value;
                j5 = j3;
                r48Var2 = r48Var;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.ikc
                    public final Object invoke(Object obj, Object obj2) {
                        return lkc.l(z, function0, bVar3, z6, j4, j5, r48Var2, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 3072;
        z4 = z2;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                value = j;
                if (dVarF.D(value)) {
                }
                i3 |= i13;
            } else {
                value = j;
            }
            i3 |= i13;
        } else {
            value = j;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                j3 = j2;
                if (dVarF.D(j3)) {
                }
                i3 |= i14;
            } else {
                j3 = j2;
            }
            i3 |= i14;
        } else {
            j3 = j2;
        }
        i8 = i2 & 64;
        if (i8 != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (dVarF.x(r48Var)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        }
        if ((i2 & 128) != 0) {
            if ((i & 12582912) == 0) {
                if (dVarF.T(ps4Var)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i3 |= i10;
            }
            i11 = i3;
            if ((i3 & 4793491) != 4793490) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (dVarF.g(z5, i11 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 16) != 0) {
                        value = ((ei1) dVarF.v(cz1.a())).getValue();
                        i12 = i11 & (-57345);
                    } else {
                        i12 = i11;
                    }
                    if ((i2 & 32) != 0) {
                        i12 &= -458753;
                        j3 = value;
                    }
                    if (i8 != 0) {
                        bVar4 = bVar2;
                        j6 = j3;
                        r48Var3 = null;
                    } else {
                        bVar4 = bVar2;
                        j6 = j3;
                        r48Var3 = r48Var;
                    }
                } else {
                    if (i4 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 16) != 0) {
                        value = ((ei1) dVarF.v(cz1.a())).getValue();
                        i12 = i11 & (-57345);
                    } else {
                        i12 = i11;
                    }
                    if ((i2 & 32) != 0) {
                        i12 &= -458753;
                        j3 = value;
                    }
                    if (i8 != 0) {
                        bVar4 = bVar2;
                        j6 = j3;
                        r48Var3 = null;
                    } else {
                        bVar4 = bVar2;
                        j6 = j3;
                        r48Var3 = r48Var;
                    }
                }
                boolean z112 = z4;
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-1573136853, i12, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                }
                int i1110 = i12 >> 12;
                i(value, j6, z, ko1.e(1128552423, true, new b(bVar4, z3, r48Var3, xoa.e(true, 0.0f, value, 2, null), z112, function0, ps4Var), dVarF, 54), dVarF, (i1110 & 112) | (i1110 & 14) | 3072 | ((i12 << 6) & 896));
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                j4 = value;
                r48Var2 = r48Var3;
                j5 = j6;
                bVar3 = bVar4;
                z6 = z112;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                z6 = z4;
                j4 = value;
                j5 = j3;
                r48Var2 = r48Var;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.ikc
                    public final Object invoke(Object obj, Object obj2) {
                        return lkc.l(z, function0, bVar3, z6, j4, j5, r48Var2, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 12582912;
        i11 = i3;
        if ((i3 & 4793491) != 4793490) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (dVarF.g(z5, i11 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                    bVar2 = androidx.compose.ui.b.INSTANCE;
                }
                if (i6 != 0) {
                    z4 = true;
                }
                if ((i2 & 16) != 0) {
                    value = ((ei1) dVarF.v(cz1.a())).getValue();
                    i12 = i11 & (-57345);
                } else {
                    i12 = i11;
                }
                if ((i2 & 32) != 0) {
                    i12 &= -458753;
                    j3 = value;
                }
                if (i8 != 0) {
                    bVar4 = bVar2;
                    j6 = j3;
                    r48Var3 = null;
                } else {
                    bVar4 = bVar2;
                    j6 = j3;
                    r48Var3 = r48Var;
                }
            } else {
                if (i4 != 0) {
                    bVar2 = androidx.compose.ui.b.INSTANCE;
                }
                if (i6 != 0) {
                    z4 = true;
                }
                if ((i2 & 16) != 0) {
                    value = ((ei1) dVarF.v(cz1.a())).getValue();
                    i12 = i11 & (-57345);
                } else {
                    i12 = i11;
                }
                if ((i2 & 32) != 0) {
                    i12 &= -458753;
                    j3 = value;
                }
                if (i8 != 0) {
                    bVar4 = bVar2;
                    j6 = j3;
                    r48Var3 = null;
                } else {
                    bVar4 = bVar2;
                    j6 = j3;
                    r48Var3 = r48Var;
                }
            }
            boolean z113 = z4;
            dVarF.M();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1573136853, i12, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
            }
            int i1111 = i12 >> 12;
            i(value, j6, z, ko1.e(1128552423, true, new b(bVar4, z3, r48Var3, xoa.e(true, 0.0f, value, 2, null), z113, function0, ps4Var), dVarF, 54), dVarF, (i1111 & 112) | (i1111 & 14) | 3072 | ((i12 << 6) & 896));
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            j4 = value;
            r48Var2 = r48Var3;
            j5 = j6;
            bVar3 = bVar4;
            z6 = z113;
        } else {
            dVarF.q();
            bVar3 = bVar2;
            z6 = z4;
            j4 = value;
            j5 = j3;
            r48Var2 = r48Var;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.ikc
                public final Object invoke(Object obj, Object obj2) {
                    return lkc.l(z, function0, bVar3, z6, j4, j5, r48Var2, ps4Var, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011d  */
    /* JADX WARN: Code duplicated, block: B:102:0x011f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0128  */
    /* JADX WARN: Code duplicated, block: B:107:0x0137  */
    /* JADX WARN: Code duplicated, block: B:117:0x015a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x015c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0161  */
    /* JADX WARN: Code duplicated, block: B:122:0x0164  */
    /* JADX WARN: Code duplicated, block: B:124:0x0168  */
    /* JADX WARN: Code duplicated, block: B:127:0x016e  */
    /* JADX WARN: Code duplicated, block: B:128:0x017f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0185  */
    /* JADX WARN: Code duplicated, block: B:132:0x018b  */
    /* JADX WARN: Code duplicated, block: B:135:0x0193  */
    /* JADX WARN: Code duplicated, block: B:136:0x019d  */
    /* JADX WARN: Code duplicated, block: B:139:0x01af  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:147:0x020e  */
    /* JADX WARN: Code duplicated, block: B:149:0x021d  */
    /* JADX WARN: Code duplicated, block: B:152:0x0232  */
    /* JADX WARN: Code duplicated, block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00db  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:94:0x0101  */
    /* JADX WARN: Code duplicated, block: B:96:0x010b  */
    /* JADX WARN: Code duplicated, block: B:97:0x010e  */
    public static final void f(final boolean z, final Function0<Unit> function0, androidx.compose.ui.b bVar, boolean z2, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function3, long j, long j2, r48 r48Var, androidx.compose.p004runtime.d dVar, final int i, final int i2) {
        boolean z3;
        int i3;
        Function0<Unit> function1;
        androidx.compose.ui.b bVar2;
        int i4;
        boolean z4;
        int i5;
        int i6;
        Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function4;
        int i7;
        int i8;
        Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function5;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z5;
        androidx.compose.p004runtime.d dVar2;
        final r48 r48Var2;
        final androidx.compose.ui.b bVar3;
        final boolean z6;
        final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function6;
        final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function7;
        final long j3;
        final long j4;
        s6b s6bVarH;
        long value;
        long j5;
        boolean z7;
        do1 do1VarE;
        long j6;
        long j7;
        int i14;
        r48 r48Var3;
        int i15;
        int i16;
        androidx.compose.p004runtime.d dVarF = dVar.F(1015017965);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 6) == 0) {
                i3 = (dVarF.A(z3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i & 48) == 0) {
                i3 |= dVarF.T(function1) ? 32 : 16;
            }
        }
        int i17 = i2 & 4;
        if (i17 == 0) {
            if ((i & 384) == 0) {
                bVar2 = bVar;
                i3 |= dVarF.x(bVar2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z4 = z2;
                    if (dVarF.A(z4)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        function4 = function2;
                        if (dVarF.T(function4)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        if ((196608 & i) == 0) {
                            function5 = function3;
                            if (dVarF.T(function5)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                i16 = i3;
                                i11 = i17;
                                int i18 = dVarF.D(j) ? 1048576 : 524288;
                                i10 = i16 | i18;
                            } else {
                                i16 = i3;
                                i11 = i17;
                            }
                            i10 = i16 | i18;
                        } else {
                            i10 = i3;
                            i11 = i17;
                        }
                        if ((i & 12582912) != 0) {
                            if ((i2 & 128) == 0 || !dVarF.D(j2)) {
                                i15 = 4194304;
                            } else {
                                i15 = 8388608;
                            }
                            i10 |= i15;
                        }
                        i12 = i2 & 256;
                        if (i12 != 0) {
                            if ((i & 100663296) == 0) {
                                if (dVarF.x(r48Var)) {
                                    i13 = 67108864;
                                } else {
                                    i13 = 33554432;
                                }
                                i10 |= i13;
                            }
                            if ((i10 & 38347923) != 38347922) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (dVarF.g(z5, i10 & 1)) {
                                dVarF.U();
                                if ((i & 1) != 0 || dVarF.t()) {
                                    if (i11 != 0) {
                                        bVar2 = androidx.compose.ui.b.INSTANCE;
                                    }
                                    if (i4 != 0) {
                                        z4 = true;
                                    }
                                    if (i6 != 0) {
                                        function4 = null;
                                    }
                                    if (i8 != 0) {
                                        function5 = null;
                                    }
                                    if ((i2 & 64) != 0) {
                                        value = ((ei1) dVarF.v(cz1.a())).getValue();
                                        i10 &= -3670017;
                                    } else {
                                        value = j;
                                    }
                                    if ((i2 & 128) != 0) {
                                        i10 &= -29360129;
                                        j5 = value;
                                    } else {
                                        j5 = j2;
                                    }
                                    z7 = z4;
                                    do1VarE = null;
                                    if (i12 != 0) {
                                        j6 = value;
                                        i14 = 1015017965;
                                        r48Var3 = null;
                                        j7 = j5;
                                    } else {
                                        j6 = value;
                                        j7 = j5;
                                        i14 = 1015017965;
                                        r48Var3 = r48Var;
                                    }
                                } else {
                                    dVarF.q();
                                    if ((i2 & 64) != 0) {
                                        i10 &= -3670017;
                                    }
                                    if ((i2 & 128) != 0) {
                                        i10 &= -29360129;
                                    }
                                    j6 = j;
                                    r48Var3 = r48Var;
                                    z7 = z4;
                                    do1VarE = null;
                                    i14 = 1015017965;
                                    j7 = j2;
                                }
                                dVarF.M();
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                                }
                                if (function4 == null) {
                                    dVarF.y(1830899669);
                                } else {
                                    dVarF.y(1830899670);
                                    do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
                                }
                                dVarF.u();
                                int i19 = i10 >> 6;
                                dVar2 = dVarF;
                                e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i19) | (458752 & i19) | (i19 & 3670016), 0);
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.n();
                                }
                                bVar3 = bVar2;
                                function6 = function4;
                                function7 = function5;
                                z6 = z7;
                                j3 = j6;
                                j4 = j7;
                                r48Var2 = r48Var3;
                            } else {
                                dVar2 = dVarF;
                                dVar2.q();
                                r48Var2 = r48Var;
                                bVar3 = bVar2;
                                z6 = z4;
                                function6 = function4;
                                function7 = function5;
                                j3 = j;
                                j4 = j2;
                            }
                            s6bVarH = dVar2.H();
                            if (s6bVarH != null) {
                                s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                                    public final Object invoke(Object obj, Object obj2) {
                                        return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i10 |= 100663296;
                        if ((i10 & 38347923) != 38347922) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (dVarF.g(z5, i10 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i11 != 0) {
                                    bVar2 = androidx.compose.ui.b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    z4 = true;
                                }
                                if (i6 != 0) {
                                    function4 = null;
                                }
                                if (i8 != 0) {
                                    function5 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    value = ((ei1) dVarF.v(cz1.a())).getValue();
                                    i10 &= -3670017;
                                } else {
                                    value = j;
                                }
                                if ((i2 & 128) != 0) {
                                    i10 &= -29360129;
                                    j5 = value;
                                } else {
                                    j5 = j2;
                                }
                                z7 = z4;
                                do1VarE = null;
                                if (i12 != 0) {
                                    j6 = value;
                                    i14 = 1015017965;
                                    r48Var3 = null;
                                    j7 = j5;
                                } else {
                                    j6 = value;
                                    j7 = j5;
                                    i14 = 1015017965;
                                    r48Var3 = r48Var;
                                }
                            } else {
                                if (i11 != 0) {
                                    bVar2 = androidx.compose.ui.b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    z4 = true;
                                }
                                if (i6 != 0) {
                                    function4 = null;
                                }
                                if (i8 != 0) {
                                    function5 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    value = ((ei1) dVarF.v(cz1.a())).getValue();
                                    i10 &= -3670017;
                                } else {
                                    value = j;
                                }
                                if ((i2 & 128) != 0) {
                                    i10 &= -29360129;
                                    j5 = value;
                                } else {
                                    j5 = j2;
                                }
                                z7 = z4;
                                do1VarE = null;
                                if (i12 != 0) {
                                    j6 = value;
                                    i14 = 1015017965;
                                    r48Var3 = null;
                                    j7 = j5;
                                } else {
                                    j6 = value;
                                    j7 = j5;
                                    i14 = 1015017965;
                                    r48Var3 = r48Var;
                                }
                            }
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                            }
                            if (function4 == null) {
                                dVarF.y(1830899669);
                            } else {
                                dVarF.y(1830899670);
                                do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
                            }
                            dVarF.u();
                            int i110 = i10 >> 6;
                            dVar2 = dVarF;
                            e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i110) | (458752 & i110) | (i110 & 3670016), 0);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar2;
                            function6 = function4;
                            function7 = function5;
                            z6 = z7;
                            j3 = j6;
                            j4 = j7;
                            r48Var2 = r48Var3;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            r48Var2 = r48Var;
                            bVar3 = bVar2;
                            z6 = z4;
                            function6 = function4;
                            function7 = function5;
                            j3 = j;
                            j4 = j2;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                                public final Object invoke(Object obj, Object obj2) {
                                    return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i3 |= 196608;
                    function5 = function3;
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            i16 = i3;
                            i11 = i17;
                            if (dVarF.D(j)) {
                            }
                            i10 = i16 | i18;
                        } else {
                            i16 = i3;
                            i11 = i17;
                        }
                        i10 = i16 | i18;
                    } else {
                        i10 = i3;
                        i11 = i17;
                    }
                    if ((i & 12582912) != 0) {
                        if ((i2 & 128) == 0) {
                            i15 = 4194304;
                        } else {
                            i15 = 4194304;
                        }
                        i10 |= i15;
                    }
                    i12 = i2 & 256;
                    if (i12 != 0) {
                        if ((i & 100663296) == 0) {
                            if (dVarF.x(r48Var)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i10 |= i13;
                        }
                        if ((i10 & 38347923) != 38347922) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (dVarF.g(z5, i10 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i11 != 0) {
                                    bVar2 = androidx.compose.ui.b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    z4 = true;
                                }
                                if (i6 != 0) {
                                    function4 = null;
                                }
                                if (i8 != 0) {
                                    function5 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    value = ((ei1) dVarF.v(cz1.a())).getValue();
                                    i10 &= -3670017;
                                } else {
                                    value = j;
                                }
                                if ((i2 & 128) != 0) {
                                    i10 &= -29360129;
                                    j5 = value;
                                } else {
                                    j5 = j2;
                                }
                                z7 = z4;
                                do1VarE = null;
                                if (i12 != 0) {
                                    j6 = value;
                                    i14 = 1015017965;
                                    r48Var3 = null;
                                    j7 = j5;
                                } else {
                                    j6 = value;
                                    j7 = j5;
                                    i14 = 1015017965;
                                    r48Var3 = r48Var;
                                }
                            } else {
                                if (i11 != 0) {
                                    bVar2 = androidx.compose.ui.b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    z4 = true;
                                }
                                if (i6 != 0) {
                                    function4 = null;
                                }
                                if (i8 != 0) {
                                    function5 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    value = ((ei1) dVarF.v(cz1.a())).getValue();
                                    i10 &= -3670017;
                                } else {
                                    value = j;
                                }
                                if ((i2 & 128) != 0) {
                                    i10 &= -29360129;
                                    j5 = value;
                                } else {
                                    j5 = j2;
                                }
                                z7 = z4;
                                do1VarE = null;
                                if (i12 != 0) {
                                    j6 = value;
                                    i14 = 1015017965;
                                    r48Var3 = null;
                                    j7 = j5;
                                } else {
                                    j6 = value;
                                    j7 = j5;
                                    i14 = 1015017965;
                                    r48Var3 = r48Var;
                                }
                            }
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                            }
                            if (function4 == null) {
                                dVarF.y(1830899669);
                            } else {
                                dVarF.y(1830899670);
                                do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
                            }
                            dVarF.u();
                            int i111 = i10 >> 6;
                            dVar2 = dVarF;
                            e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i111) | (458752 & i111) | (i111 & 3670016), 0);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar2;
                            function6 = function4;
                            function7 = function5;
                            z6 = z7;
                            j3 = j6;
                            j4 = j7;
                            r48Var2 = r48Var3;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            r48Var2 = r48Var;
                            bVar3 = bVar2;
                            z6 = z4;
                            function6 = function4;
                            function7 = function5;
                            j3 = j;
                            j4 = j2;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                                public final Object invoke(Object obj, Object obj2) {
                                    return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i10 |= 100663296;
                    if ((i10 & 38347923) != 38347922) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (dVarF.g(z5, i10 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function4 = null;
                            }
                            if (i8 != 0) {
                                function5 = null;
                            }
                            if ((i2 & 64) != 0) {
                                value = ((ei1) dVarF.v(cz1.a())).getValue();
                                i10 &= -3670017;
                            } else {
                                value = j;
                            }
                            if ((i2 & 128) != 0) {
                                i10 &= -29360129;
                                j5 = value;
                            } else {
                                j5 = j2;
                            }
                            z7 = z4;
                            do1VarE = null;
                            if (i12 != 0) {
                                j6 = value;
                                i14 = 1015017965;
                                r48Var3 = null;
                                j7 = j5;
                            } else {
                                j6 = value;
                                j7 = j5;
                                i14 = 1015017965;
                                r48Var3 = r48Var;
                            }
                        } else {
                            if (i11 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function4 = null;
                            }
                            if (i8 != 0) {
                                function5 = null;
                            }
                            if ((i2 & 64) != 0) {
                                value = ((ei1) dVarF.v(cz1.a())).getValue();
                                i10 &= -3670017;
                            } else {
                                value = j;
                            }
                            if ((i2 & 128) != 0) {
                                i10 &= -29360129;
                                j5 = value;
                            } else {
                                j5 = j2;
                            }
                            z7 = z4;
                            do1VarE = null;
                            if (i12 != 0) {
                                j6 = value;
                                i14 = 1015017965;
                                r48Var3 = null;
                                j7 = j5;
                            } else {
                                j6 = value;
                                j7 = j5;
                                i14 = 1015017965;
                                r48Var3 = r48Var;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                        }
                        if (function4 == null) {
                            dVarF.y(1830899669);
                        } else {
                            dVarF.y(1830899670);
                            do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
                        }
                        dVarF.u();
                        int i112 = i10 >> 6;
                        dVar2 = dVarF;
                        e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i112) | (458752 & i112) | (i112 & 3670016), 0);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar2;
                        function6 = function4;
                        function7 = function5;
                        z6 = z7;
                        j3 = j6;
                        j4 = j7;
                        r48Var2 = r48Var3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        r48Var2 = r48Var;
                        bVar3 = bVar2;
                        z6 = z4;
                        function6 = function4;
                        function7 = function5;
                        j3 = j;
                        j4 = j2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                            public final Object invoke(Object obj, Object obj2) {
                                return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 24576;
                function4 = function2;
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        function5 = function3;
                        if (dVarF.T(function5)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            i16 = i3;
                            i11 = i17;
                            if (dVarF.D(j)) {
                            }
                            i10 = i16 | i18;
                        } else {
                            i16 = i3;
                            i11 = i17;
                        }
                        i10 = i16 | i18;
                    } else {
                        i10 = i3;
                        i11 = i17;
                    }
                    if ((i & 12582912) != 0) {
                        if ((i2 & 128) == 0) {
                            i15 = 4194304;
                        } else {
                            i15 = 4194304;
                        }
                        i10 |= i15;
                    }
                    i12 = i2 & 256;
                    if (i12 != 0) {
                        if ((i & 100663296) == 0) {
                            if (dVarF.x(r48Var)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i10 |= i13;
                        }
                        if ((i10 & 38347923) != 38347922) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (dVarF.g(z5, i10 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i11 != 0) {
                                    bVar2 = androidx.compose.ui.b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    z4 = true;
                                }
                                if (i6 != 0) {
                                    function4 = null;
                                }
                                if (i8 != 0) {
                                    function5 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    value = ((ei1) dVarF.v(cz1.a())).getValue();
                                    i10 &= -3670017;
                                } else {
                                    value = j;
                                }
                                if ((i2 & 128) != 0) {
                                    i10 &= -29360129;
                                    j5 = value;
                                } else {
                                    j5 = j2;
                                }
                                z7 = z4;
                                do1VarE = null;
                                if (i12 != 0) {
                                    j6 = value;
                                    i14 = 1015017965;
                                    r48Var3 = null;
                                    j7 = j5;
                                } else {
                                    j6 = value;
                                    j7 = j5;
                                    i14 = 1015017965;
                                    r48Var3 = r48Var;
                                }
                            } else {
                                if (i11 != 0) {
                                    bVar2 = androidx.compose.ui.b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    z4 = true;
                                }
                                if (i6 != 0) {
                                    function4 = null;
                                }
                                if (i8 != 0) {
                                    function5 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    value = ((ei1) dVarF.v(cz1.a())).getValue();
                                    i10 &= -3670017;
                                } else {
                                    value = j;
                                }
                                if ((i2 & 128) != 0) {
                                    i10 &= -29360129;
                                    j5 = value;
                                } else {
                                    j5 = j2;
                                }
                                z7 = z4;
                                do1VarE = null;
                                if (i12 != 0) {
                                    j6 = value;
                                    i14 = 1015017965;
                                    r48Var3 = null;
                                    j7 = j5;
                                } else {
                                    j6 = value;
                                    j7 = j5;
                                    i14 = 1015017965;
                                    r48Var3 = r48Var;
                                }
                            }
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                            }
                            if (function4 == null) {
                                dVarF.y(1830899669);
                            } else {
                                dVarF.y(1830899670);
                                do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
                            }
                            dVarF.u();
                            int i113 = i10 >> 6;
                            dVar2 = dVarF;
                            e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i113) | (458752 & i113) | (i113 & 3670016), 0);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar2;
                            function6 = function4;
                            function7 = function5;
                            z6 = z7;
                            j3 = j6;
                            j4 = j7;
                            r48Var2 = r48Var3;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            r48Var2 = r48Var;
                            bVar3 = bVar2;
                            z6 = z4;
                            function6 = function4;
                            function7 = function5;
                            j3 = j;
                            j4 = j2;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                                public final Object invoke(Object obj, Object obj2) {
                                    return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i10 |= 100663296;
                    if ((i10 & 38347923) != 38347922) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (dVarF.g(z5, i10 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function4 = null;
                            }
                            if (i8 != 0) {
                                function5 = null;
                            }
                            if ((i2 & 64) != 0) {
                                value = ((ei1) dVarF.v(cz1.a())).getValue();
                                i10 &= -3670017;
                            } else {
                                value = j;
                            }
                            if ((i2 & 128) != 0) {
                                i10 &= -29360129;
                                j5 = value;
                            } else {
                                j5 = j2;
                            }
                            z7 = z4;
                            do1VarE = null;
                            if (i12 != 0) {
                                j6 = value;
                                i14 = 1015017965;
                                r48Var3 = null;
                                j7 = j5;
                            } else {
                                j6 = value;
                                j7 = j5;
                                i14 = 1015017965;
                                r48Var3 = r48Var;
                            }
                        } else {
                            if (i11 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function4 = null;
                            }
                            if (i8 != 0) {
                                function5 = null;
                            }
                            if ((i2 & 64) != 0) {
                                value = ((ei1) dVarF.v(cz1.a())).getValue();
                                i10 &= -3670017;
                            } else {
                                value = j;
                            }
                            if ((i2 & 128) != 0) {
                                i10 &= -29360129;
                                j5 = value;
                            } else {
                                j5 = j2;
                            }
                            z7 = z4;
                            do1VarE = null;
                            if (i12 != 0) {
                                j6 = value;
                                i14 = 1015017965;
                                r48Var3 = null;
                                j7 = j5;
                            } else {
                                j6 = value;
                                j7 = j5;
                                i14 = 1015017965;
                                r48Var3 = r48Var;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                        }
                        if (function4 == null) {
                            dVarF.y(1830899669);
                        } else {
                            dVarF.y(1830899670);
                            do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
                        }
                        dVarF.u();
                        int i114 = i10 >> 6;
                        dVar2 = dVarF;
                        e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i114) | (458752 & i114) | (i114 & 3670016), 0);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar2;
                        function6 = function4;
                        function7 = function5;
                        z6 = z7;
                        j3 = j6;
                        j4 = j7;
                        r48Var2 = r48Var3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        r48Var2 = r48Var;
                        bVar3 = bVar2;
                        z6 = z4;
                        function6 = function4;
                        function7 = function5;
                        j3 = j;
                        j4 = j2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                            public final Object invoke(Object obj, Object obj2) {
                                return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 196608;
                function5 = function3;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        i16 = i3;
                        i11 = i17;
                        if (dVarF.D(j)) {
                        }
                        i10 = i16 | i18;
                    } else {
                        i16 = i3;
                        i11 = i17;
                    }
                    i10 = i16 | i18;
                } else {
                    i10 = i3;
                    i11 = i17;
                }
                if ((i & 12582912) != 0) {
                    if ((i2 & 128) == 0) {
                        i15 = 4194304;
                    } else {
                        i15 = 4194304;
                    }
                    i10 |= i15;
                }
                i12 = i2 & 256;
                if (i12 != 0) {
                    if ((i & 100663296) == 0) {
                        if (dVarF.x(r48Var)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i10 |= i13;
                    }
                    if ((i10 & 38347923) != 38347922) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (dVarF.g(z5, i10 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function4 = null;
                            }
                            if (i8 != 0) {
                                function5 = null;
                            }
                            if ((i2 & 64) != 0) {
                                value = ((ei1) dVarF.v(cz1.a())).getValue();
                                i10 &= -3670017;
                            } else {
                                value = j;
                            }
                            if ((i2 & 128) != 0) {
                                i10 &= -29360129;
                                j5 = value;
                            } else {
                                j5 = j2;
                            }
                            z7 = z4;
                            do1VarE = null;
                            if (i12 != 0) {
                                j6 = value;
                                i14 = 1015017965;
                                r48Var3 = null;
                                j7 = j5;
                            } else {
                                j6 = value;
                                j7 = j5;
                                i14 = 1015017965;
                                r48Var3 = r48Var;
                            }
                        } else {
                            if (i11 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function4 = null;
                            }
                            if (i8 != 0) {
                                function5 = null;
                            }
                            if ((i2 & 64) != 0) {
                                value = ((ei1) dVarF.v(cz1.a())).getValue();
                                i10 &= -3670017;
                            } else {
                                value = j;
                            }
                            if ((i2 & 128) != 0) {
                                i10 &= -29360129;
                                j5 = value;
                            } else {
                                j5 = j2;
                            }
                            z7 = z4;
                            do1VarE = null;
                            if (i12 != 0) {
                                j6 = value;
                                i14 = 1015017965;
                                r48Var3 = null;
                                j7 = j5;
                            } else {
                                j6 = value;
                                j7 = j5;
                                i14 = 1015017965;
                                r48Var3 = r48Var;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                        }
                        if (function4 == null) {
                            dVarF.y(1830899669);
                        } else {
                            dVarF.y(1830899670);
                            do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
                        }
                        dVarF.u();
                        int i115 = i10 >> 6;
                        dVar2 = dVarF;
                        e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i115) | (458752 & i115) | (i115 & 3670016), 0);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar2;
                        function6 = function4;
                        function7 = function5;
                        z6 = z7;
                        j3 = j6;
                        j4 = j7;
                        r48Var2 = r48Var3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        r48Var2 = r48Var;
                        bVar3 = bVar2;
                        z6 = z4;
                        function6 = function4;
                        function7 = function5;
                        j3 = j;
                        j4 = j2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                            public final Object invoke(Object obj, Object obj2) {
                                return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i10 |= 100663296;
                if ((i10 & 38347923) != 38347922) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dVarF.g(z5, i10 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        }
                        if ((i2 & 64) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i10 &= -3670017;
                        } else {
                            value = j;
                        }
                        if ((i2 & 128) != 0) {
                            i10 &= -29360129;
                            j5 = value;
                        } else {
                            j5 = j2;
                        }
                        z7 = z4;
                        do1VarE = null;
                        if (i12 != 0) {
                            j6 = value;
                            i14 = 1015017965;
                            r48Var3 = null;
                            j7 = j5;
                        } else {
                            j6 = value;
                            j7 = j5;
                            i14 = 1015017965;
                            r48Var3 = r48Var;
                        }
                    } else {
                        if (i11 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        }
                        if ((i2 & 64) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i10 &= -3670017;
                        } else {
                            value = j;
                        }
                        if ((i2 & 128) != 0) {
                            i10 &= -29360129;
                            j5 = value;
                        } else {
                            j5 = j2;
                        }
                        z7 = z4;
                        do1VarE = null;
                        if (i12 != 0) {
                            j6 = value;
                            i14 = 1015017965;
                            r48Var3 = null;
                            j7 = j5;
                        } else {
                            j6 = value;
                            j7 = j5;
                            i14 = 1015017965;
                            r48Var3 = r48Var;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                    }
                    if (function4 == null) {
                        dVarF.y(1830899669);
                    } else {
                        dVarF.y(1830899670);
                        do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
                    }
                    dVarF.u();
                    int i116 = i10 >> 6;
                    dVar2 = dVarF;
                    e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i116) | (458752 & i116) | (i116 & 3670016), 0);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar2;
                    function6 = function4;
                    function7 = function5;
                    z6 = z7;
                    j3 = j6;
                    j4 = j7;
                    r48Var2 = r48Var3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    r48Var2 = r48Var;
                    bVar3 = bVar2;
                    z6 = z4;
                    function6 = function4;
                    function7 = function5;
                    j3 = j;
                    j4 = j2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                        public final Object invoke(Object obj, Object obj2) {
                            return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 3072;
            z4 = z2;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    function4 = function2;
                    if (dVarF.T(function4)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        function5 = function3;
                        if (dVarF.T(function5)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            i16 = i3;
                            i11 = i17;
                            if (dVarF.D(j)) {
                            }
                            i10 = i16 | i18;
                        } else {
                            i16 = i3;
                            i11 = i17;
                        }
                        i10 = i16 | i18;
                    } else {
                        i10 = i3;
                        i11 = i17;
                    }
                    if ((i & 12582912) != 0) {
                        if ((i2 & 128) == 0) {
                            i15 = 4194304;
                        } else {
                            i15 = 4194304;
                        }
                        i10 |= i15;
                    }
                    i12 = i2 & 256;
                    if (i12 != 0) {
                        if ((i & 100663296) == 0) {
                            if (dVarF.x(r48Var)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i10 |= i13;
                        }
                        if ((i10 & 38347923) != 38347922) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (dVarF.g(z5, i10 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i11 != 0) {
                                    bVar2 = androidx.compose.ui.b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    z4 = true;
                                }
                                if (i6 != 0) {
                                    function4 = null;
                                }
                                if (i8 != 0) {
                                    function5 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    value = ((ei1) dVarF.v(cz1.a())).getValue();
                                    i10 &= -3670017;
                                } else {
                                    value = j;
                                }
                                if ((i2 & 128) != 0) {
                                    i10 &= -29360129;
                                    j5 = value;
                                } else {
                                    j5 = j2;
                                }
                                z7 = z4;
                                do1VarE = null;
                                if (i12 != 0) {
                                    j6 = value;
                                    i14 = 1015017965;
                                    r48Var3 = null;
                                    j7 = j5;
                                } else {
                                    j6 = value;
                                    j7 = j5;
                                    i14 = 1015017965;
                                    r48Var3 = r48Var;
                                }
                            } else {
                                if (i11 != 0) {
                                    bVar2 = androidx.compose.ui.b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    z4 = true;
                                }
                                if (i6 != 0) {
                                    function4 = null;
                                }
                                if (i8 != 0) {
                                    function5 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    value = ((ei1) dVarF.v(cz1.a())).getValue();
                                    i10 &= -3670017;
                                } else {
                                    value = j;
                                }
                                if ((i2 & 128) != 0) {
                                    i10 &= -29360129;
                                    j5 = value;
                                } else {
                                    j5 = j2;
                                }
                                z7 = z4;
                                do1VarE = null;
                                if (i12 != 0) {
                                    j6 = value;
                                    i14 = 1015017965;
                                    r48Var3 = null;
                                    j7 = j5;
                                } else {
                                    j6 = value;
                                    j7 = j5;
                                    i14 = 1015017965;
                                    r48Var3 = r48Var;
                                }
                            }
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                            }
                            if (function4 == null) {
                                dVarF.y(1830899669);
                            } else {
                                dVarF.y(1830899670);
                                do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
                            }
                            dVarF.u();
                            int i117 = i10 >> 6;
                            dVar2 = dVarF;
                            e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i117) | (458752 & i117) | (i117 & 3670016), 0);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar2;
                            function6 = function4;
                            function7 = function5;
                            z6 = z7;
                            j3 = j6;
                            j4 = j7;
                            r48Var2 = r48Var3;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            r48Var2 = r48Var;
                            bVar3 = bVar2;
                            z6 = z4;
                            function6 = function4;
                            function7 = function5;
                            j3 = j;
                            j4 = j2;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                                public final Object invoke(Object obj, Object obj2) {
                                    return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i10 |= 100663296;
                    if ((i10 & 38347923) != 38347922) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (dVarF.g(z5, i10 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function4 = null;
                            }
                            if (i8 != 0) {
                                function5 = null;
                            }
                            if ((i2 & 64) != 0) {
                                value = ((ei1) dVarF.v(cz1.a())).getValue();
                                i10 &= -3670017;
                            } else {
                                value = j;
                            }
                            if ((i2 & 128) != 0) {
                                i10 &= -29360129;
                                j5 = value;
                            } else {
                                j5 = j2;
                            }
                            z7 = z4;
                            do1VarE = null;
                            if (i12 != 0) {
                                j6 = value;
                                i14 = 1015017965;
                                r48Var3 = null;
                                j7 = j5;
                            } else {
                                j6 = value;
                                j7 = j5;
                                i14 = 1015017965;
                                r48Var3 = r48Var;
                            }
                        } else {
                            if (i11 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function4 = null;
                            }
                            if (i8 != 0) {
                                function5 = null;
                            }
                            if ((i2 & 64) != 0) {
                                value = ((ei1) dVarF.v(cz1.a())).getValue();
                                i10 &= -3670017;
                            } else {
                                value = j;
                            }
                            if ((i2 & 128) != 0) {
                                i10 &= -29360129;
                                j5 = value;
                            } else {
                                j5 = j2;
                            }
                            z7 = z4;
                            do1VarE = null;
                            if (i12 != 0) {
                                j6 = value;
                                i14 = 1015017965;
                                r48Var3 = null;
                                j7 = j5;
                            } else {
                                j6 = value;
                                j7 = j5;
                                i14 = 1015017965;
                                r48Var3 = r48Var;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                        }
                        if (function4 == null) {
                            dVarF.y(1830899669);
                        } else {
                            dVarF.y(1830899670);
                            do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
                        }
                        dVarF.u();
                        int i118 = i10 >> 6;
                        dVar2 = dVarF;
                        e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i118) | (458752 & i118) | (i118 & 3670016), 0);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar2;
                        function6 = function4;
                        function7 = function5;
                        z6 = z7;
                        j3 = j6;
                        j4 = j7;
                        r48Var2 = r48Var3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        r48Var2 = r48Var;
                        bVar3 = bVar2;
                        z6 = z4;
                        function6 = function4;
                        function7 = function5;
                        j3 = j;
                        j4 = j2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                            public final Object invoke(Object obj, Object obj2) {
                                return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 196608;
                function5 = function3;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        i16 = i3;
                        i11 = i17;
                        if (dVarF.D(j)) {
                        }
                        i10 = i16 | i18;
                    } else {
                        i16 = i3;
                        i11 = i17;
                    }
                    i10 = i16 | i18;
                } else {
                    i10 = i3;
                    i11 = i17;
                }
                if ((i & 12582912) != 0) {
                    if ((i2 & 128) == 0) {
                        i15 = 4194304;
                    } else {
                        i15 = 4194304;
                    }
                    i10 |= i15;
                }
                i12 = i2 & 256;
                if (i12 != 0) {
                    if ((i & 100663296) == 0) {
                        if (dVarF.x(r48Var)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i10 |= i13;
                    }
                    if ((i10 & 38347923) != 38347922) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (dVarF.g(z5, i10 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function4 = null;
                            }
                            if (i8 != 0) {
                                function5 = null;
                            }
                            if ((i2 & 64) != 0) {
                                value = ((ei1) dVarF.v(cz1.a())).getValue();
                                i10 &= -3670017;
                            } else {
                                value = j;
                            }
                            if ((i2 & 128) != 0) {
                                i10 &= -29360129;
                                j5 = value;
                            } else {
                                j5 = j2;
                            }
                            z7 = z4;
                            do1VarE = null;
                            if (i12 != 0) {
                                j6 = value;
                                i14 = 1015017965;
                                r48Var3 = null;
                                j7 = j5;
                            } else {
                                j6 = value;
                                j7 = j5;
                                i14 = 1015017965;
                                r48Var3 = r48Var;
                            }
                        } else {
                            if (i11 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function4 = null;
                            }
                            if (i8 != 0) {
                                function5 = null;
                            }
                            if ((i2 & 64) != 0) {
                                value = ((ei1) dVarF.v(cz1.a())).getValue();
                                i10 &= -3670017;
                            } else {
                                value = j;
                            }
                            if ((i2 & 128) != 0) {
                                i10 &= -29360129;
                                j5 = value;
                            } else {
                                j5 = j2;
                            }
                            z7 = z4;
                            do1VarE = null;
                            if (i12 != 0) {
                                j6 = value;
                                i14 = 1015017965;
                                r48Var3 = null;
                                j7 = j5;
                            } else {
                                j6 = value;
                                j7 = j5;
                                i14 = 1015017965;
                                r48Var3 = r48Var;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                        }
                        if (function4 == null) {
                            dVarF.y(1830899669);
                        } else {
                            dVarF.y(1830899670);
                            do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
                        }
                        dVarF.u();
                        int i119 = i10 >> 6;
                        dVar2 = dVarF;
                        e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i119) | (458752 & i119) | (i119 & 3670016), 0);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar2;
                        function6 = function4;
                        function7 = function5;
                        z6 = z7;
                        j3 = j6;
                        j4 = j7;
                        r48Var2 = r48Var3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        r48Var2 = r48Var;
                        bVar3 = bVar2;
                        z6 = z4;
                        function6 = function4;
                        function7 = function5;
                        j3 = j;
                        j4 = j2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                            public final Object invoke(Object obj, Object obj2) {
                                return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i10 |= 100663296;
                if ((i10 & 38347923) != 38347922) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dVarF.g(z5, i10 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        }
                        if ((i2 & 64) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i10 &= -3670017;
                        } else {
                            value = j;
                        }
                        if ((i2 & 128) != 0) {
                            i10 &= -29360129;
                            j5 = value;
                        } else {
                            j5 = j2;
                        }
                        z7 = z4;
                        do1VarE = null;
                        if (i12 != 0) {
                            j6 = value;
                            i14 = 1015017965;
                            r48Var3 = null;
                            j7 = j5;
                        } else {
                            j6 = value;
                            j7 = j5;
                            i14 = 1015017965;
                            r48Var3 = r48Var;
                        }
                    } else {
                        if (i11 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        }
                        if ((i2 & 64) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i10 &= -3670017;
                        } else {
                            value = j;
                        }
                        if ((i2 & 128) != 0) {
                            i10 &= -29360129;
                            j5 = value;
                        } else {
                            j5 = j2;
                        }
                        z7 = z4;
                        do1VarE = null;
                        if (i12 != 0) {
                            j6 = value;
                            i14 = 1015017965;
                            r48Var3 = null;
                            j7 = j5;
                        } else {
                            j6 = value;
                            j7 = j5;
                            i14 = 1015017965;
                            r48Var3 = r48Var;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                    }
                    if (function4 == null) {
                        dVarF.y(1830899669);
                    } else {
                        dVarF.y(1830899670);
                        do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
                    }
                    dVarF.u();
                    int i1110 = i10 >> 6;
                    dVar2 = dVarF;
                    e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i1110) | (458752 & i1110) | (i1110 & 3670016), 0);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar2;
                    function6 = function4;
                    function7 = function5;
                    z6 = z7;
                    j3 = j6;
                    j4 = j7;
                    r48Var2 = r48Var3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    r48Var2 = r48Var;
                    bVar3 = bVar2;
                    z6 = z4;
                    function6 = function4;
                    function7 = function5;
                    j3 = j;
                    j4 = j2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                        public final Object invoke(Object obj, Object obj2) {
                            return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            function4 = function2;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    function5 = function3;
                    if (dVarF.T(function5)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        i16 = i3;
                        i11 = i17;
                        if (dVarF.D(j)) {
                        }
                        i10 = i16 | i18;
                    } else {
                        i16 = i3;
                        i11 = i17;
                    }
                    i10 = i16 | i18;
                } else {
                    i10 = i3;
                    i11 = i17;
                }
                if ((i & 12582912) != 0) {
                    if ((i2 & 128) == 0) {
                        i15 = 4194304;
                    } else {
                        i15 = 4194304;
                    }
                    i10 |= i15;
                }
                i12 = i2 & 256;
                if (i12 != 0) {
                    if ((i & 100663296) == 0) {
                        if (dVarF.x(r48Var)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i10 |= i13;
                    }
                    if ((i10 & 38347923) != 38347922) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (dVarF.g(z5, i10 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function4 = null;
                            }
                            if (i8 != 0) {
                                function5 = null;
                            }
                            if ((i2 & 64) != 0) {
                                value = ((ei1) dVarF.v(cz1.a())).getValue();
                                i10 &= -3670017;
                            } else {
                                value = j;
                            }
                            if ((i2 & 128) != 0) {
                                i10 &= -29360129;
                                j5 = value;
                            } else {
                                j5 = j2;
                            }
                            z7 = z4;
                            do1VarE = null;
                            if (i12 != 0) {
                                j6 = value;
                                i14 = 1015017965;
                                r48Var3 = null;
                                j7 = j5;
                            } else {
                                j6 = value;
                                j7 = j5;
                                i14 = 1015017965;
                                r48Var3 = r48Var;
                            }
                        } else {
                            if (i11 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function4 = null;
                            }
                            if (i8 != 0) {
                                function5 = null;
                            }
                            if ((i2 & 64) != 0) {
                                value = ((ei1) dVarF.v(cz1.a())).getValue();
                                i10 &= -3670017;
                            } else {
                                value = j;
                            }
                            if ((i2 & 128) != 0) {
                                i10 &= -29360129;
                                j5 = value;
                            } else {
                                j5 = j2;
                            }
                            z7 = z4;
                            do1VarE = null;
                            if (i12 != 0) {
                                j6 = value;
                                i14 = 1015017965;
                                r48Var3 = null;
                                j7 = j5;
                            } else {
                                j6 = value;
                                j7 = j5;
                                i14 = 1015017965;
                                r48Var3 = r48Var;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                        }
                        if (function4 == null) {
                            dVarF.y(1830899669);
                        } else {
                            dVarF.y(1830899670);
                            do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
                        }
                        dVarF.u();
                        int i1111 = i10 >> 6;
                        dVar2 = dVarF;
                        e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i1111) | (458752 & i1111) | (i1111 & 3670016), 0);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar2;
                        function6 = function4;
                        function7 = function5;
                        z6 = z7;
                        j3 = j6;
                        j4 = j7;
                        r48Var2 = r48Var3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        r48Var2 = r48Var;
                        bVar3 = bVar2;
                        z6 = z4;
                        function6 = function4;
                        function7 = function5;
                        j3 = j;
                        j4 = j2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                            public final Object invoke(Object obj, Object obj2) {
                                return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i10 |= 100663296;
                if ((i10 & 38347923) != 38347922) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dVarF.g(z5, i10 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        }
                        if ((i2 & 64) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i10 &= -3670017;
                        } else {
                            value = j;
                        }
                        if ((i2 & 128) != 0) {
                            i10 &= -29360129;
                            j5 = value;
                        } else {
                            j5 = j2;
                        }
                        z7 = z4;
                        do1VarE = null;
                        if (i12 != 0) {
                            j6 = value;
                            i14 = 1015017965;
                            r48Var3 = null;
                            j7 = j5;
                        } else {
                            j6 = value;
                            j7 = j5;
                            i14 = 1015017965;
                            r48Var3 = r48Var;
                        }
                    } else {
                        if (i11 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        }
                        if ((i2 & 64) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i10 &= -3670017;
                        } else {
                            value = j;
                        }
                        if ((i2 & 128) != 0) {
                            i10 &= -29360129;
                            j5 = value;
                        } else {
                            j5 = j2;
                        }
                        z7 = z4;
                        do1VarE = null;
                        if (i12 != 0) {
                            j6 = value;
                            i14 = 1015017965;
                            r48Var3 = null;
                            j7 = j5;
                        } else {
                            j6 = value;
                            j7 = j5;
                            i14 = 1015017965;
                            r48Var3 = r48Var;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                    }
                    if (function4 == null) {
                        dVarF.y(1830899669);
                    } else {
                        dVarF.y(1830899670);
                        do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
                    }
                    dVarF.u();
                    int i1112 = i10 >> 6;
                    dVar2 = dVarF;
                    e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i1112) | (458752 & i1112) | (i1112 & 3670016), 0);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar2;
                    function6 = function4;
                    function7 = function5;
                    z6 = z7;
                    j3 = j6;
                    j4 = j7;
                    r48Var2 = r48Var3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    r48Var2 = r48Var;
                    bVar3 = bVar2;
                    z6 = z4;
                    function6 = function4;
                    function7 = function5;
                    j3 = j;
                    j4 = j2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                        public final Object invoke(Object obj, Object obj2) {
                            return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 196608;
            function5 = function3;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    i16 = i3;
                    i11 = i17;
                    if (dVarF.D(j)) {
                    }
                    i10 = i16 | i18;
                } else {
                    i16 = i3;
                    i11 = i17;
                }
                i10 = i16 | i18;
            } else {
                i10 = i3;
                i11 = i17;
            }
            if ((i & 12582912) != 0) {
                if ((i2 & 128) == 0) {
                    i15 = 4194304;
                } else {
                    i15 = 4194304;
                }
                i10 |= i15;
            }
            i12 = i2 & 256;
            if (i12 != 0) {
                if ((i & 100663296) == 0) {
                    if (dVarF.x(r48Var)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i10 |= i13;
                }
                if ((i10 & 38347923) != 38347922) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dVarF.g(z5, i10 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        }
                        if ((i2 & 64) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i10 &= -3670017;
                        } else {
                            value = j;
                        }
                        if ((i2 & 128) != 0) {
                            i10 &= -29360129;
                            j5 = value;
                        } else {
                            j5 = j2;
                        }
                        z7 = z4;
                        do1VarE = null;
                        if (i12 != 0) {
                            j6 = value;
                            i14 = 1015017965;
                            r48Var3 = null;
                            j7 = j5;
                        } else {
                            j6 = value;
                            j7 = j5;
                            i14 = 1015017965;
                            r48Var3 = r48Var;
                        }
                    } else {
                        if (i11 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        }
                        if ((i2 & 64) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i10 &= -3670017;
                        } else {
                            value = j;
                        }
                        if ((i2 & 128) != 0) {
                            i10 &= -29360129;
                            j5 = value;
                        } else {
                            j5 = j2;
                        }
                        z7 = z4;
                        do1VarE = null;
                        if (i12 != 0) {
                            j6 = value;
                            i14 = 1015017965;
                            r48Var3 = null;
                            j7 = j5;
                        } else {
                            j6 = value;
                            j7 = j5;
                            i14 = 1015017965;
                            r48Var3 = r48Var;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                    }
                    if (function4 == null) {
                        dVarF.y(1830899669);
                    } else {
                        dVarF.y(1830899670);
                        do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
                    }
                    dVarF.u();
                    int i1113 = i10 >> 6;
                    dVar2 = dVarF;
                    e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i1113) | (458752 & i1113) | (i1113 & 3670016), 0);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar2;
                    function6 = function4;
                    function7 = function5;
                    z6 = z7;
                    j3 = j6;
                    j4 = j7;
                    r48Var2 = r48Var3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    r48Var2 = r48Var;
                    bVar3 = bVar2;
                    z6 = z4;
                    function6 = function4;
                    function7 = function5;
                    j3 = j;
                    j4 = j2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                        public final Object invoke(Object obj, Object obj2) {
                            return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i10 |= 100663296;
            if ((i10 & 38347923) != 38347922) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (dVarF.g(z5, i10 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    }
                    if (i8 != 0) {
                        function5 = null;
                    }
                    if ((i2 & 64) != 0) {
                        value = ((ei1) dVarF.v(cz1.a())).getValue();
                        i10 &= -3670017;
                    } else {
                        value = j;
                    }
                    if ((i2 & 128) != 0) {
                        i10 &= -29360129;
                        j5 = value;
                    } else {
                        j5 = j2;
                    }
                    z7 = z4;
                    do1VarE = null;
                    if (i12 != 0) {
                        j6 = value;
                        i14 = 1015017965;
                        r48Var3 = null;
                        j7 = j5;
                    } else {
                        j6 = value;
                        j7 = j5;
                        i14 = 1015017965;
                        r48Var3 = r48Var;
                    }
                } else {
                    if (i11 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    }
                    if (i8 != 0) {
                        function5 = null;
                    }
                    if ((i2 & 64) != 0) {
                        value = ((ei1) dVarF.v(cz1.a())).getValue();
                        i10 &= -3670017;
                    } else {
                        value = j;
                    }
                    if ((i2 & 128) != 0) {
                        i10 &= -29360129;
                        j5 = value;
                    } else {
                        j5 = j2;
                    }
                    z7 = z4;
                    do1VarE = null;
                    if (i12 != 0) {
                        j6 = value;
                        i14 = 1015017965;
                        r48Var3 = null;
                        j7 = j5;
                    } else {
                        j6 = value;
                        j7 = j5;
                        i14 = 1015017965;
                        r48Var3 = r48Var;
                    }
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                }
                if (function4 == null) {
                    dVarF.y(1830899669);
                } else {
                    dVarF.y(1830899670);
                    do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
                }
                dVarF.u();
                int i1114 = i10 >> 6;
                dVar2 = dVarF;
                e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i1114) | (458752 & i1114) | (i1114 & 3670016), 0);
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                bVar3 = bVar2;
                function6 = function4;
                function7 = function5;
                z6 = z7;
                j3 = j6;
                j4 = j7;
                r48Var2 = r48Var3;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                r48Var2 = r48Var;
                bVar3 = bVar2;
                z6 = z4;
                function6 = function4;
                function7 = function5;
                j3 = j;
                j4 = j2;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                    public final Object invoke(Object obj, Object obj2) {
                        return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        bVar2 = bVar;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z4 = z2;
                if (dVarF.A(z4)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    function4 = function2;
                    if (dVarF.T(function4)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        function5 = function3;
                        if (dVarF.T(function5)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            i16 = i3;
                            i11 = i17;
                            if (dVarF.D(j)) {
                            }
                            i10 = i16 | i18;
                        } else {
                            i16 = i3;
                            i11 = i17;
                        }
                        i10 = i16 | i18;
                    } else {
                        i10 = i3;
                        i11 = i17;
                    }
                    if ((i & 12582912) != 0) {
                        if ((i2 & 128) == 0) {
                            i15 = 4194304;
                        } else {
                            i15 = 4194304;
                        }
                        i10 |= i15;
                    }
                    i12 = i2 & 256;
                    if (i12 != 0) {
                        if ((i & 100663296) == 0) {
                            if (dVarF.x(r48Var)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i10 |= i13;
                        }
                        if ((i10 & 38347923) != 38347922) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (dVarF.g(z5, i10 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0) {
                                if (i11 != 0) {
                                    bVar2 = androidx.compose.ui.b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    z4 = true;
                                }
                                if (i6 != 0) {
                                    function4 = null;
                                }
                                if (i8 != 0) {
                                    function5 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    value = ((ei1) dVarF.v(cz1.a())).getValue();
                                    i10 &= -3670017;
                                } else {
                                    value = j;
                                }
                                if ((i2 & 128) != 0) {
                                    i10 &= -29360129;
                                    j5 = value;
                                } else {
                                    j5 = j2;
                                }
                                z7 = z4;
                                do1VarE = null;
                                if (i12 != 0) {
                                    j6 = value;
                                    i14 = 1015017965;
                                    r48Var3 = null;
                                    j7 = j5;
                                } else {
                                    j6 = value;
                                    j7 = j5;
                                    i14 = 1015017965;
                                    r48Var3 = r48Var;
                                }
                            } else {
                                if (i11 != 0) {
                                    bVar2 = androidx.compose.ui.b.INSTANCE;
                                }
                                if (i4 != 0) {
                                    z4 = true;
                                }
                                if (i6 != 0) {
                                    function4 = null;
                                }
                                if (i8 != 0) {
                                    function5 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    value = ((ei1) dVarF.v(cz1.a())).getValue();
                                    i10 &= -3670017;
                                } else {
                                    value = j;
                                }
                                if ((i2 & 128) != 0) {
                                    i10 &= -29360129;
                                    j5 = value;
                                } else {
                                    j5 = j2;
                                }
                                z7 = z4;
                                do1VarE = null;
                                if (i12 != 0) {
                                    j6 = value;
                                    i14 = 1015017965;
                                    r48Var3 = null;
                                    j7 = j5;
                                } else {
                                    j6 = value;
                                    j7 = j5;
                                    i14 = 1015017965;
                                    r48Var3 = r48Var;
                                }
                            }
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                            }
                            if (function4 == null) {
                                dVarF.y(1830899669);
                            } else {
                                dVarF.y(1830899670);
                                do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
                            }
                            dVarF.u();
                            int i1115 = i10 >> 6;
                            dVar2 = dVarF;
                            e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i1115) | (458752 & i1115) | (i1115 & 3670016), 0);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            bVar3 = bVar2;
                            function6 = function4;
                            function7 = function5;
                            z6 = z7;
                            j3 = j6;
                            j4 = j7;
                            r48Var2 = r48Var3;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            r48Var2 = r48Var;
                            bVar3 = bVar2;
                            z6 = z4;
                            function6 = function4;
                            function7 = function5;
                            j3 = j;
                            j4 = j2;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                                public final Object invoke(Object obj, Object obj2) {
                                    return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i10 |= 100663296;
                    if ((i10 & 38347923) != 38347922) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (dVarF.g(z5, i10 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function4 = null;
                            }
                            if (i8 != 0) {
                                function5 = null;
                            }
                            if ((i2 & 64) != 0) {
                                value = ((ei1) dVarF.v(cz1.a())).getValue();
                                i10 &= -3670017;
                            } else {
                                value = j;
                            }
                            if ((i2 & 128) != 0) {
                                i10 &= -29360129;
                                j5 = value;
                            } else {
                                j5 = j2;
                            }
                            z7 = z4;
                            do1VarE = null;
                            if (i12 != 0) {
                                j6 = value;
                                i14 = 1015017965;
                                r48Var3 = null;
                                j7 = j5;
                            } else {
                                j6 = value;
                                j7 = j5;
                                i14 = 1015017965;
                                r48Var3 = r48Var;
                            }
                        } else {
                            if (i11 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function4 = null;
                            }
                            if (i8 != 0) {
                                function5 = null;
                            }
                            if ((i2 & 64) != 0) {
                                value = ((ei1) dVarF.v(cz1.a())).getValue();
                                i10 &= -3670017;
                            } else {
                                value = j;
                            }
                            if ((i2 & 128) != 0) {
                                i10 &= -29360129;
                                j5 = value;
                            } else {
                                j5 = j2;
                            }
                            z7 = z4;
                            do1VarE = null;
                            if (i12 != 0) {
                                j6 = value;
                                i14 = 1015017965;
                                r48Var3 = null;
                                j7 = j5;
                            } else {
                                j6 = value;
                                j7 = j5;
                                i14 = 1015017965;
                                r48Var3 = r48Var;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                        }
                        if (function4 == null) {
                            dVarF.y(1830899669);
                        } else {
                            dVarF.y(1830899670);
                            do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
                        }
                        dVarF.u();
                        int i1116 = i10 >> 6;
                        dVar2 = dVarF;
                        e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i1116) | (458752 & i1116) | (i1116 & 3670016), 0);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar2;
                        function6 = function4;
                        function7 = function5;
                        z6 = z7;
                        j3 = j6;
                        j4 = j7;
                        r48Var2 = r48Var3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        r48Var2 = r48Var;
                        bVar3 = bVar2;
                        z6 = z4;
                        function6 = function4;
                        function7 = function5;
                        j3 = j;
                        j4 = j2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                            public final Object invoke(Object obj, Object obj2) {
                                return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 196608;
                function5 = function3;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        i16 = i3;
                        i11 = i17;
                        if (dVarF.D(j)) {
                        }
                        i10 = i16 | i18;
                    } else {
                        i16 = i3;
                        i11 = i17;
                    }
                    i10 = i16 | i18;
                } else {
                    i10 = i3;
                    i11 = i17;
                }
                if ((i & 12582912) != 0) {
                    if ((i2 & 128) == 0) {
                        i15 = 4194304;
                    } else {
                        i15 = 4194304;
                    }
                    i10 |= i15;
                }
                i12 = i2 & 256;
                if (i12 != 0) {
                    if ((i & 100663296) == 0) {
                        if (dVarF.x(r48Var)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i10 |= i13;
                    }
                    if ((i10 & 38347923) != 38347922) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (dVarF.g(z5, i10 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function4 = null;
                            }
                            if (i8 != 0) {
                                function5 = null;
                            }
                            if ((i2 & 64) != 0) {
                                value = ((ei1) dVarF.v(cz1.a())).getValue();
                                i10 &= -3670017;
                            } else {
                                value = j;
                            }
                            if ((i2 & 128) != 0) {
                                i10 &= -29360129;
                                j5 = value;
                            } else {
                                j5 = j2;
                            }
                            z7 = z4;
                            do1VarE = null;
                            if (i12 != 0) {
                                j6 = value;
                                i14 = 1015017965;
                                r48Var3 = null;
                                j7 = j5;
                            } else {
                                j6 = value;
                                j7 = j5;
                                i14 = 1015017965;
                                r48Var3 = r48Var;
                            }
                        } else {
                            if (i11 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function4 = null;
                            }
                            if (i8 != 0) {
                                function5 = null;
                            }
                            if ((i2 & 64) != 0) {
                                value = ((ei1) dVarF.v(cz1.a())).getValue();
                                i10 &= -3670017;
                            } else {
                                value = j;
                            }
                            if ((i2 & 128) != 0) {
                                i10 &= -29360129;
                                j5 = value;
                            } else {
                                j5 = j2;
                            }
                            z7 = z4;
                            do1VarE = null;
                            if (i12 != 0) {
                                j6 = value;
                                i14 = 1015017965;
                                r48Var3 = null;
                                j7 = j5;
                            } else {
                                j6 = value;
                                j7 = j5;
                                i14 = 1015017965;
                                r48Var3 = r48Var;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                        }
                        if (function4 == null) {
                            dVarF.y(1830899669);
                        } else {
                            dVarF.y(1830899670);
                            do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
                        }
                        dVarF.u();
                        int i1117 = i10 >> 6;
                        dVar2 = dVarF;
                        e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i1117) | (458752 & i1117) | (i1117 & 3670016), 0);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar2;
                        function6 = function4;
                        function7 = function5;
                        z6 = z7;
                        j3 = j6;
                        j4 = j7;
                        r48Var2 = r48Var3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        r48Var2 = r48Var;
                        bVar3 = bVar2;
                        z6 = z4;
                        function6 = function4;
                        function7 = function5;
                        j3 = j;
                        j4 = j2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                            public final Object invoke(Object obj, Object obj2) {
                                return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i10 |= 100663296;
                if ((i10 & 38347923) != 38347922) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dVarF.g(z5, i10 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        }
                        if ((i2 & 64) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i10 &= -3670017;
                        } else {
                            value = j;
                        }
                        if ((i2 & 128) != 0) {
                            i10 &= -29360129;
                            j5 = value;
                        } else {
                            j5 = j2;
                        }
                        z7 = z4;
                        do1VarE = null;
                        if (i12 != 0) {
                            j6 = value;
                            i14 = 1015017965;
                            r48Var3 = null;
                            j7 = j5;
                        } else {
                            j6 = value;
                            j7 = j5;
                            i14 = 1015017965;
                            r48Var3 = r48Var;
                        }
                    } else {
                        if (i11 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        }
                        if ((i2 & 64) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i10 &= -3670017;
                        } else {
                            value = j;
                        }
                        if ((i2 & 128) != 0) {
                            i10 &= -29360129;
                            j5 = value;
                        } else {
                            j5 = j2;
                        }
                        z7 = z4;
                        do1VarE = null;
                        if (i12 != 0) {
                            j6 = value;
                            i14 = 1015017965;
                            r48Var3 = null;
                            j7 = j5;
                        } else {
                            j6 = value;
                            j7 = j5;
                            i14 = 1015017965;
                            r48Var3 = r48Var;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                    }
                    if (function4 == null) {
                        dVarF.y(1830899669);
                    } else {
                        dVarF.y(1830899670);
                        do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
                    }
                    dVarF.u();
                    int i1118 = i10 >> 6;
                    dVar2 = dVarF;
                    e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i1118) | (458752 & i1118) | (i1118 & 3670016), 0);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar2;
                    function6 = function4;
                    function7 = function5;
                    z6 = z7;
                    j3 = j6;
                    j4 = j7;
                    r48Var2 = r48Var3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    r48Var2 = r48Var;
                    bVar3 = bVar2;
                    z6 = z4;
                    function6 = function4;
                    function7 = function5;
                    j3 = j;
                    j4 = j2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                        public final Object invoke(Object obj, Object obj2) {
                            return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            function4 = function2;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    function5 = function3;
                    if (dVarF.T(function5)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        i16 = i3;
                        i11 = i17;
                        if (dVarF.D(j)) {
                        }
                        i10 = i16 | i18;
                    } else {
                        i16 = i3;
                        i11 = i17;
                    }
                    i10 = i16 | i18;
                } else {
                    i10 = i3;
                    i11 = i17;
                }
                if ((i & 12582912) != 0) {
                    if ((i2 & 128) == 0) {
                        i15 = 4194304;
                    } else {
                        i15 = 4194304;
                    }
                    i10 |= i15;
                }
                i12 = i2 & 256;
                if (i12 != 0) {
                    if ((i & 100663296) == 0) {
                        if (dVarF.x(r48Var)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i10 |= i13;
                    }
                    if ((i10 & 38347923) != 38347922) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (dVarF.g(z5, i10 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function4 = null;
                            }
                            if (i8 != 0) {
                                function5 = null;
                            }
                            if ((i2 & 64) != 0) {
                                value = ((ei1) dVarF.v(cz1.a())).getValue();
                                i10 &= -3670017;
                            } else {
                                value = j;
                            }
                            if ((i2 & 128) != 0) {
                                i10 &= -29360129;
                                j5 = value;
                            } else {
                                j5 = j2;
                            }
                            z7 = z4;
                            do1VarE = null;
                            if (i12 != 0) {
                                j6 = value;
                                i14 = 1015017965;
                                r48Var3 = null;
                                j7 = j5;
                            } else {
                                j6 = value;
                                j7 = j5;
                                i14 = 1015017965;
                                r48Var3 = r48Var;
                            }
                        } else {
                            if (i11 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function4 = null;
                            }
                            if (i8 != 0) {
                                function5 = null;
                            }
                            if ((i2 & 64) != 0) {
                                value = ((ei1) dVarF.v(cz1.a())).getValue();
                                i10 &= -3670017;
                            } else {
                                value = j;
                            }
                            if ((i2 & 128) != 0) {
                                i10 &= -29360129;
                                j5 = value;
                            } else {
                                j5 = j2;
                            }
                            z7 = z4;
                            do1VarE = null;
                            if (i12 != 0) {
                                j6 = value;
                                i14 = 1015017965;
                                r48Var3 = null;
                                j7 = j5;
                            } else {
                                j6 = value;
                                j7 = j5;
                                i14 = 1015017965;
                                r48Var3 = r48Var;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                        }
                        if (function4 == null) {
                            dVarF.y(1830899669);
                        } else {
                            dVarF.y(1830899670);
                            do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
                        }
                        dVarF.u();
                        int i1119 = i10 >> 6;
                        dVar2 = dVarF;
                        e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i1119) | (458752 & i1119) | (i1119 & 3670016), 0);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar2;
                        function6 = function4;
                        function7 = function5;
                        z6 = z7;
                        j3 = j6;
                        j4 = j7;
                        r48Var2 = r48Var3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        r48Var2 = r48Var;
                        bVar3 = bVar2;
                        z6 = z4;
                        function6 = function4;
                        function7 = function5;
                        j3 = j;
                        j4 = j2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                            public final Object invoke(Object obj, Object obj2) {
                                return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i10 |= 100663296;
                if ((i10 & 38347923) != 38347922) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dVarF.g(z5, i10 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        }
                        if ((i2 & 64) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i10 &= -3670017;
                        } else {
                            value = j;
                        }
                        if ((i2 & 128) != 0) {
                            i10 &= -29360129;
                            j5 = value;
                        } else {
                            j5 = j2;
                        }
                        z7 = z4;
                        do1VarE = null;
                        if (i12 != 0) {
                            j6 = value;
                            i14 = 1015017965;
                            r48Var3 = null;
                            j7 = j5;
                        } else {
                            j6 = value;
                            j7 = j5;
                            i14 = 1015017965;
                            r48Var3 = r48Var;
                        }
                    } else {
                        if (i11 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        }
                        if ((i2 & 64) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i10 &= -3670017;
                        } else {
                            value = j;
                        }
                        if ((i2 & 128) != 0) {
                            i10 &= -29360129;
                            j5 = value;
                        } else {
                            j5 = j2;
                        }
                        z7 = z4;
                        do1VarE = null;
                        if (i12 != 0) {
                            j6 = value;
                            i14 = 1015017965;
                            r48Var3 = null;
                            j7 = j5;
                        } else {
                            j6 = value;
                            j7 = j5;
                            i14 = 1015017965;
                            r48Var3 = r48Var;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                    }
                    if (function4 == null) {
                        dVarF.y(1830899669);
                    } else {
                        dVarF.y(1830899670);
                        do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
                    }
                    dVarF.u();
                    int i11110 = i10 >> 6;
                    dVar2 = dVarF;
                    e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i11110) | (458752 & i11110) | (i11110 & 3670016), 0);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar2;
                    function6 = function4;
                    function7 = function5;
                    z6 = z7;
                    j3 = j6;
                    j4 = j7;
                    r48Var2 = r48Var3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    r48Var2 = r48Var;
                    bVar3 = bVar2;
                    z6 = z4;
                    function6 = function4;
                    function7 = function5;
                    j3 = j;
                    j4 = j2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                        public final Object invoke(Object obj, Object obj2) {
                            return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 196608;
            function5 = function3;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    i16 = i3;
                    i11 = i17;
                    if (dVarF.D(j)) {
                    }
                    i10 = i16 | i18;
                } else {
                    i16 = i3;
                    i11 = i17;
                }
                i10 = i16 | i18;
            } else {
                i10 = i3;
                i11 = i17;
            }
            if ((i & 12582912) != 0) {
                if ((i2 & 128) == 0) {
                    i15 = 4194304;
                } else {
                    i15 = 4194304;
                }
                i10 |= i15;
            }
            i12 = i2 & 256;
            if (i12 != 0) {
                if ((i & 100663296) == 0) {
                    if (dVarF.x(r48Var)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i10 |= i13;
                }
                if ((i10 & 38347923) != 38347922) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dVarF.g(z5, i10 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        }
                        if ((i2 & 64) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i10 &= -3670017;
                        } else {
                            value = j;
                        }
                        if ((i2 & 128) != 0) {
                            i10 &= -29360129;
                            j5 = value;
                        } else {
                            j5 = j2;
                        }
                        z7 = z4;
                        do1VarE = null;
                        if (i12 != 0) {
                            j6 = value;
                            i14 = 1015017965;
                            r48Var3 = null;
                            j7 = j5;
                        } else {
                            j6 = value;
                            j7 = j5;
                            i14 = 1015017965;
                            r48Var3 = r48Var;
                        }
                    } else {
                        if (i11 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        }
                        if ((i2 & 64) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i10 &= -3670017;
                        } else {
                            value = j;
                        }
                        if ((i2 & 128) != 0) {
                            i10 &= -29360129;
                            j5 = value;
                        } else {
                            j5 = j2;
                        }
                        z7 = z4;
                        do1VarE = null;
                        if (i12 != 0) {
                            j6 = value;
                            i14 = 1015017965;
                            r48Var3 = null;
                            j7 = j5;
                        } else {
                            j6 = value;
                            j7 = j5;
                            i14 = 1015017965;
                            r48Var3 = r48Var;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                    }
                    if (function4 == null) {
                        dVarF.y(1830899669);
                    } else {
                        dVarF.y(1830899670);
                        do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
                    }
                    dVarF.u();
                    int i11111 = i10 >> 6;
                    dVar2 = dVarF;
                    e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i11111) | (458752 & i11111) | (i11111 & 3670016), 0);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar2;
                    function6 = function4;
                    function7 = function5;
                    z6 = z7;
                    j3 = j6;
                    j4 = j7;
                    r48Var2 = r48Var3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    r48Var2 = r48Var;
                    bVar3 = bVar2;
                    z6 = z4;
                    function6 = function4;
                    function7 = function5;
                    j3 = j;
                    j4 = j2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                        public final Object invoke(Object obj, Object obj2) {
                            return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i10 |= 100663296;
            if ((i10 & 38347923) != 38347922) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (dVarF.g(z5, i10 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    }
                    if (i8 != 0) {
                        function5 = null;
                    }
                    if ((i2 & 64) != 0) {
                        value = ((ei1) dVarF.v(cz1.a())).getValue();
                        i10 &= -3670017;
                    } else {
                        value = j;
                    }
                    if ((i2 & 128) != 0) {
                        i10 &= -29360129;
                        j5 = value;
                    } else {
                        j5 = j2;
                    }
                    z7 = z4;
                    do1VarE = null;
                    if (i12 != 0) {
                        j6 = value;
                        i14 = 1015017965;
                        r48Var3 = null;
                        j7 = j5;
                    } else {
                        j6 = value;
                        j7 = j5;
                        i14 = 1015017965;
                        r48Var3 = r48Var;
                    }
                } else {
                    if (i11 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    }
                    if (i8 != 0) {
                        function5 = null;
                    }
                    if ((i2 & 64) != 0) {
                        value = ((ei1) dVarF.v(cz1.a())).getValue();
                        i10 &= -3670017;
                    } else {
                        value = j;
                    }
                    if ((i2 & 128) != 0) {
                        i10 &= -29360129;
                        j5 = value;
                    } else {
                        j5 = j2;
                    }
                    z7 = z4;
                    do1VarE = null;
                    if (i12 != 0) {
                        j6 = value;
                        i14 = 1015017965;
                        r48Var3 = null;
                        j7 = j5;
                    } else {
                        j6 = value;
                        j7 = j5;
                        i14 = 1015017965;
                        r48Var3 = r48Var;
                    }
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                }
                if (function4 == null) {
                    dVarF.y(1830899669);
                } else {
                    dVarF.y(1830899670);
                    do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
                }
                dVarF.u();
                int i11112 = i10 >> 6;
                dVar2 = dVarF;
                e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i11112) | (458752 & i11112) | (i11112 & 3670016), 0);
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                bVar3 = bVar2;
                function6 = function4;
                function7 = function5;
                z6 = z7;
                j3 = j6;
                j4 = j7;
                r48Var2 = r48Var3;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                r48Var2 = r48Var;
                bVar3 = bVar2;
                z6 = z4;
                function6 = function4;
                function7 = function5;
                j3 = j;
                j4 = j2;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                    public final Object invoke(Object obj, Object obj2) {
                        return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 3072;
        z4 = z2;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                function4 = function2;
                if (dVarF.T(function4)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    function5 = function3;
                    if (dVarF.T(function5)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        i16 = i3;
                        i11 = i17;
                        if (dVarF.D(j)) {
                        }
                        i10 = i16 | i18;
                    } else {
                        i16 = i3;
                        i11 = i17;
                    }
                    i10 = i16 | i18;
                } else {
                    i10 = i3;
                    i11 = i17;
                }
                if ((i & 12582912) != 0) {
                    if ((i2 & 128) == 0) {
                        i15 = 4194304;
                    } else {
                        i15 = 4194304;
                    }
                    i10 |= i15;
                }
                i12 = i2 & 256;
                if (i12 != 0) {
                    if ((i & 100663296) == 0) {
                        if (dVarF.x(r48Var)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i10 |= i13;
                    }
                    if ((i10 & 38347923) != 38347922) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (dVarF.g(z5, i10 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function4 = null;
                            }
                            if (i8 != 0) {
                                function5 = null;
                            }
                            if ((i2 & 64) != 0) {
                                value = ((ei1) dVarF.v(cz1.a())).getValue();
                                i10 &= -3670017;
                            } else {
                                value = j;
                            }
                            if ((i2 & 128) != 0) {
                                i10 &= -29360129;
                                j5 = value;
                            } else {
                                j5 = j2;
                            }
                            z7 = z4;
                            do1VarE = null;
                            if (i12 != 0) {
                                j6 = value;
                                i14 = 1015017965;
                                r48Var3 = null;
                                j7 = j5;
                            } else {
                                j6 = value;
                                j7 = j5;
                                i14 = 1015017965;
                                r48Var3 = r48Var;
                            }
                        } else {
                            if (i11 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                function4 = null;
                            }
                            if (i8 != 0) {
                                function5 = null;
                            }
                            if ((i2 & 64) != 0) {
                                value = ((ei1) dVarF.v(cz1.a())).getValue();
                                i10 &= -3670017;
                            } else {
                                value = j;
                            }
                            if ((i2 & 128) != 0) {
                                i10 &= -29360129;
                                j5 = value;
                            } else {
                                j5 = j2;
                            }
                            z7 = z4;
                            do1VarE = null;
                            if (i12 != 0) {
                                j6 = value;
                                i14 = 1015017965;
                                r48Var3 = null;
                                j7 = j5;
                            } else {
                                j6 = value;
                                j7 = j5;
                                i14 = 1015017965;
                                r48Var3 = r48Var;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                        }
                        if (function4 == null) {
                            dVarF.y(1830899669);
                        } else {
                            dVarF.y(1830899670);
                            do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
                        }
                        dVarF.u();
                        int i11113 = i10 >> 6;
                        dVar2 = dVarF;
                        e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i11113) | (458752 & i11113) | (i11113 & 3670016), 0);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        bVar3 = bVar2;
                        function6 = function4;
                        function7 = function5;
                        z6 = z7;
                        j3 = j6;
                        j4 = j7;
                        r48Var2 = r48Var3;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        r48Var2 = r48Var;
                        bVar3 = bVar2;
                        z6 = z4;
                        function6 = function4;
                        function7 = function5;
                        j3 = j;
                        j4 = j2;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                            public final Object invoke(Object obj, Object obj2) {
                                return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i10 |= 100663296;
                if ((i10 & 38347923) != 38347922) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dVarF.g(z5, i10 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        }
                        if ((i2 & 64) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i10 &= -3670017;
                        } else {
                            value = j;
                        }
                        if ((i2 & 128) != 0) {
                            i10 &= -29360129;
                            j5 = value;
                        } else {
                            j5 = j2;
                        }
                        z7 = z4;
                        do1VarE = null;
                        if (i12 != 0) {
                            j6 = value;
                            i14 = 1015017965;
                            r48Var3 = null;
                            j7 = j5;
                        } else {
                            j6 = value;
                            j7 = j5;
                            i14 = 1015017965;
                            r48Var3 = r48Var;
                        }
                    } else {
                        if (i11 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        }
                        if ((i2 & 64) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i10 &= -3670017;
                        } else {
                            value = j;
                        }
                        if ((i2 & 128) != 0) {
                            i10 &= -29360129;
                            j5 = value;
                        } else {
                            j5 = j2;
                        }
                        z7 = z4;
                        do1VarE = null;
                        if (i12 != 0) {
                            j6 = value;
                            i14 = 1015017965;
                            r48Var3 = null;
                            j7 = j5;
                        } else {
                            j6 = value;
                            j7 = j5;
                            i14 = 1015017965;
                            r48Var3 = r48Var;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                    }
                    if (function4 == null) {
                        dVarF.y(1830899669);
                    } else {
                        dVarF.y(1830899670);
                        do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
                    }
                    dVarF.u();
                    int i11114 = i10 >> 6;
                    dVar2 = dVarF;
                    e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i11114) | (458752 & i11114) | (i11114 & 3670016), 0);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar2;
                    function6 = function4;
                    function7 = function5;
                    z6 = z7;
                    j3 = j6;
                    j4 = j7;
                    r48Var2 = r48Var3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    r48Var2 = r48Var;
                    bVar3 = bVar2;
                    z6 = z4;
                    function6 = function4;
                    function7 = function5;
                    j3 = j;
                    j4 = j2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                        public final Object invoke(Object obj, Object obj2) {
                            return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 196608;
            function5 = function3;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    i16 = i3;
                    i11 = i17;
                    if (dVarF.D(j)) {
                    }
                    i10 = i16 | i18;
                } else {
                    i16 = i3;
                    i11 = i17;
                }
                i10 = i16 | i18;
            } else {
                i10 = i3;
                i11 = i17;
            }
            if ((i & 12582912) != 0) {
                if ((i2 & 128) == 0) {
                    i15 = 4194304;
                } else {
                    i15 = 4194304;
                }
                i10 |= i15;
            }
            i12 = i2 & 256;
            if (i12 != 0) {
                if ((i & 100663296) == 0) {
                    if (dVarF.x(r48Var)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i10 |= i13;
                }
                if ((i10 & 38347923) != 38347922) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dVarF.g(z5, i10 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        }
                        if ((i2 & 64) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i10 &= -3670017;
                        } else {
                            value = j;
                        }
                        if ((i2 & 128) != 0) {
                            i10 &= -29360129;
                            j5 = value;
                        } else {
                            j5 = j2;
                        }
                        z7 = z4;
                        do1VarE = null;
                        if (i12 != 0) {
                            j6 = value;
                            i14 = 1015017965;
                            r48Var3 = null;
                            j7 = j5;
                        } else {
                            j6 = value;
                            j7 = j5;
                            i14 = 1015017965;
                            r48Var3 = r48Var;
                        }
                    } else {
                        if (i11 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        }
                        if ((i2 & 64) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i10 &= -3670017;
                        } else {
                            value = j;
                        }
                        if ((i2 & 128) != 0) {
                            i10 &= -29360129;
                            j5 = value;
                        } else {
                            j5 = j2;
                        }
                        z7 = z4;
                        do1VarE = null;
                        if (i12 != 0) {
                            j6 = value;
                            i14 = 1015017965;
                            r48Var3 = null;
                            j7 = j5;
                        } else {
                            j6 = value;
                            j7 = j5;
                            i14 = 1015017965;
                            r48Var3 = r48Var;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                    }
                    if (function4 == null) {
                        dVarF.y(1830899669);
                    } else {
                        dVarF.y(1830899670);
                        do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
                    }
                    dVarF.u();
                    int i11115 = i10 >> 6;
                    dVar2 = dVarF;
                    e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i11115) | (458752 & i11115) | (i11115 & 3670016), 0);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar2;
                    function6 = function4;
                    function7 = function5;
                    z6 = z7;
                    j3 = j6;
                    j4 = j7;
                    r48Var2 = r48Var3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    r48Var2 = r48Var;
                    bVar3 = bVar2;
                    z6 = z4;
                    function6 = function4;
                    function7 = function5;
                    j3 = j;
                    j4 = j2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                        public final Object invoke(Object obj, Object obj2) {
                            return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i10 |= 100663296;
            if ((i10 & 38347923) != 38347922) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (dVarF.g(z5, i10 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    }
                    if (i8 != 0) {
                        function5 = null;
                    }
                    if ((i2 & 64) != 0) {
                        value = ((ei1) dVarF.v(cz1.a())).getValue();
                        i10 &= -3670017;
                    } else {
                        value = j;
                    }
                    if ((i2 & 128) != 0) {
                        i10 &= -29360129;
                        j5 = value;
                    } else {
                        j5 = j2;
                    }
                    z7 = z4;
                    do1VarE = null;
                    if (i12 != 0) {
                        j6 = value;
                        i14 = 1015017965;
                        r48Var3 = null;
                        j7 = j5;
                    } else {
                        j6 = value;
                        j7 = j5;
                        i14 = 1015017965;
                        r48Var3 = r48Var;
                    }
                } else {
                    if (i11 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    }
                    if (i8 != 0) {
                        function5 = null;
                    }
                    if ((i2 & 64) != 0) {
                        value = ((ei1) dVarF.v(cz1.a())).getValue();
                        i10 &= -3670017;
                    } else {
                        value = j;
                    }
                    if ((i2 & 128) != 0) {
                        i10 &= -29360129;
                        j5 = value;
                    } else {
                        j5 = j2;
                    }
                    z7 = z4;
                    do1VarE = null;
                    if (i12 != 0) {
                        j6 = value;
                        i14 = 1015017965;
                        r48Var3 = null;
                        j7 = j5;
                    } else {
                        j6 = value;
                        j7 = j5;
                        i14 = 1015017965;
                        r48Var3 = r48Var;
                    }
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                }
                if (function4 == null) {
                    dVarF.y(1830899669);
                } else {
                    dVarF.y(1830899670);
                    do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
                }
                dVarF.u();
                int i11116 = i10 >> 6;
                dVar2 = dVarF;
                e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i11116) | (458752 & i11116) | (i11116 & 3670016), 0);
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                bVar3 = bVar2;
                function6 = function4;
                function7 = function5;
                z6 = z7;
                j3 = j6;
                j4 = j7;
                r48Var2 = r48Var3;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                r48Var2 = r48Var;
                bVar3 = bVar2;
                z6 = z4;
                function6 = function4;
                function7 = function5;
                j3 = j;
                j4 = j2;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                    public final Object invoke(Object obj, Object obj2) {
                        return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 24576;
        function4 = function2;
        i8 = i2 & 32;
        if (i8 != 0) {
            if ((196608 & i) == 0) {
                function5 = function3;
                if (dVarF.T(function5)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    i16 = i3;
                    i11 = i17;
                    if (dVarF.D(j)) {
                    }
                    i10 = i16 | i18;
                } else {
                    i16 = i3;
                    i11 = i17;
                }
                i10 = i16 | i18;
            } else {
                i10 = i3;
                i11 = i17;
            }
            if ((i & 12582912) != 0) {
                if ((i2 & 128) == 0) {
                    i15 = 4194304;
                } else {
                    i15 = 4194304;
                }
                i10 |= i15;
            }
            i12 = i2 & 256;
            if (i12 != 0) {
                if ((i & 100663296) == 0) {
                    if (dVarF.x(r48Var)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i10 |= i13;
                }
                if ((i10 & 38347923) != 38347922) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dVarF.g(z5, i10 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        }
                        if ((i2 & 64) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i10 &= -3670017;
                        } else {
                            value = j;
                        }
                        if ((i2 & 128) != 0) {
                            i10 &= -29360129;
                            j5 = value;
                        } else {
                            j5 = j2;
                        }
                        z7 = z4;
                        do1VarE = null;
                        if (i12 != 0) {
                            j6 = value;
                            i14 = 1015017965;
                            r48Var3 = null;
                            j7 = j5;
                        } else {
                            j6 = value;
                            j7 = j5;
                            i14 = 1015017965;
                            r48Var3 = r48Var;
                        }
                    } else {
                        if (i11 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        }
                        if ((i2 & 64) != 0) {
                            value = ((ei1) dVarF.v(cz1.a())).getValue();
                            i10 &= -3670017;
                        } else {
                            value = j;
                        }
                        if ((i2 & 128) != 0) {
                            i10 &= -29360129;
                            j5 = value;
                        } else {
                            j5 = j2;
                        }
                        z7 = z4;
                        do1VarE = null;
                        if (i12 != 0) {
                            j6 = value;
                            i14 = 1015017965;
                            r48Var3 = null;
                            j7 = j5;
                        } else {
                            j6 = value;
                            j7 = j5;
                            i14 = 1015017965;
                            r48Var3 = r48Var;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                    }
                    if (function4 == null) {
                        dVarF.y(1830899669);
                    } else {
                        dVarF.y(1830899670);
                        do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
                    }
                    dVarF.u();
                    int i11117 = i10 >> 6;
                    dVar2 = dVarF;
                    e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i11117) | (458752 & i11117) | (i11117 & 3670016), 0);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar2;
                    function6 = function4;
                    function7 = function5;
                    z6 = z7;
                    j3 = j6;
                    j4 = j7;
                    r48Var2 = r48Var3;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    r48Var2 = r48Var;
                    bVar3 = bVar2;
                    z6 = z4;
                    function6 = function4;
                    function7 = function5;
                    j3 = j;
                    j4 = j2;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                        public final Object invoke(Object obj, Object obj2) {
                            return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i10 |= 100663296;
            if ((i10 & 38347923) != 38347922) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (dVarF.g(z5, i10 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    }
                    if (i8 != 0) {
                        function5 = null;
                    }
                    if ((i2 & 64) != 0) {
                        value = ((ei1) dVarF.v(cz1.a())).getValue();
                        i10 &= -3670017;
                    } else {
                        value = j;
                    }
                    if ((i2 & 128) != 0) {
                        i10 &= -29360129;
                        j5 = value;
                    } else {
                        j5 = j2;
                    }
                    z7 = z4;
                    do1VarE = null;
                    if (i12 != 0) {
                        j6 = value;
                        i14 = 1015017965;
                        r48Var3 = null;
                        j7 = j5;
                    } else {
                        j6 = value;
                        j7 = j5;
                        i14 = 1015017965;
                        r48Var3 = r48Var;
                    }
                } else {
                    if (i11 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    }
                    if (i8 != 0) {
                        function5 = null;
                    }
                    if ((i2 & 64) != 0) {
                        value = ((ei1) dVarF.v(cz1.a())).getValue();
                        i10 &= -3670017;
                    } else {
                        value = j;
                    }
                    if ((i2 & 128) != 0) {
                        i10 &= -29360129;
                        j5 = value;
                    } else {
                        j5 = j2;
                    }
                    z7 = z4;
                    do1VarE = null;
                    if (i12 != 0) {
                        j6 = value;
                        i14 = 1015017965;
                        r48Var3 = null;
                        j7 = j5;
                    } else {
                        j6 = value;
                        j7 = j5;
                        i14 = 1015017965;
                        r48Var3 = r48Var;
                    }
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                }
                if (function4 == null) {
                    dVarF.y(1830899669);
                } else {
                    dVarF.y(1830899670);
                    do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
                }
                dVarF.u();
                int i11118 = i10 >> 6;
                dVar2 = dVarF;
                e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i11118) | (458752 & i11118) | (i11118 & 3670016), 0);
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                bVar3 = bVar2;
                function6 = function4;
                function7 = function5;
                z6 = z7;
                j3 = j6;
                j4 = j7;
                r48Var2 = r48Var3;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                r48Var2 = r48Var;
                bVar3 = bVar2;
                z6 = z4;
                function6 = function4;
                function7 = function5;
                j3 = j;
                j4 = j2;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                    public final Object invoke(Object obj, Object obj2) {
                        return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 196608;
        function5 = function3;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                i16 = i3;
                i11 = i17;
                if (dVarF.D(j)) {
                }
                i10 = i16 | i18;
            } else {
                i16 = i3;
                i11 = i17;
            }
            i10 = i16 | i18;
        } else {
            i10 = i3;
            i11 = i17;
        }
        if ((i & 12582912) != 0) {
            if ((i2 & 128) == 0) {
                i15 = 4194304;
            } else {
                i15 = 4194304;
            }
            i10 |= i15;
        }
        i12 = i2 & 256;
        if (i12 != 0) {
            if ((i & 100663296) == 0) {
                if (dVarF.x(r48Var)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i10 |= i13;
            }
            if ((i10 & 38347923) != 38347922) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (dVarF.g(z5, i10 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    }
                    if (i8 != 0) {
                        function5 = null;
                    }
                    if ((i2 & 64) != 0) {
                        value = ((ei1) dVarF.v(cz1.a())).getValue();
                        i10 &= -3670017;
                    } else {
                        value = j;
                    }
                    if ((i2 & 128) != 0) {
                        i10 &= -29360129;
                        j5 = value;
                    } else {
                        j5 = j2;
                    }
                    z7 = z4;
                    do1VarE = null;
                    if (i12 != 0) {
                        j6 = value;
                        i14 = 1015017965;
                        r48Var3 = null;
                        j7 = j5;
                    } else {
                        j6 = value;
                        j7 = j5;
                        i14 = 1015017965;
                        r48Var3 = r48Var;
                    }
                } else {
                    if (i11 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    }
                    if (i8 != 0) {
                        function5 = null;
                    }
                    if ((i2 & 64) != 0) {
                        value = ((ei1) dVarF.v(cz1.a())).getValue();
                        i10 &= -3670017;
                    } else {
                        value = j;
                    }
                    if ((i2 & 128) != 0) {
                        i10 &= -29360129;
                        j5 = value;
                    } else {
                        j5 = j2;
                    }
                    z7 = z4;
                    do1VarE = null;
                    if (i12 != 0) {
                        j6 = value;
                        i14 = 1015017965;
                        r48Var3 = null;
                        j7 = j5;
                    } else {
                        j6 = value;
                        j7 = j5;
                        i14 = 1015017965;
                        r48Var3 = r48Var;
                    }
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                }
                if (function4 == null) {
                    dVarF.y(1830899669);
                } else {
                    dVarF.y(1830899670);
                    do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
                }
                dVarF.u();
                int i11119 = i10 >> 6;
                dVar2 = dVarF;
                e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i11119) | (458752 & i11119) | (i11119 & 3670016), 0);
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                bVar3 = bVar2;
                function6 = function4;
                function7 = function5;
                z6 = z7;
                j3 = j6;
                j4 = j7;
                r48Var2 = r48Var3;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                r48Var2 = r48Var;
                bVar3 = bVar2;
                z6 = z4;
                function6 = function4;
                function7 = function5;
                j3 = j;
                j4 = j2;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                    public final Object invoke(Object obj, Object obj2) {
                        return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i10 |= 100663296;
        if ((i10 & 38347923) != 38347922) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (dVarF.g(z5, i10 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    bVar2 = androidx.compose.ui.b.INSTANCE;
                }
                if (i4 != 0) {
                    z4 = true;
                }
                if (i6 != 0) {
                    function4 = null;
                }
                if (i8 != 0) {
                    function5 = null;
                }
                if ((i2 & 64) != 0) {
                    value = ((ei1) dVarF.v(cz1.a())).getValue();
                    i10 &= -3670017;
                } else {
                    value = j;
                }
                if ((i2 & 128) != 0) {
                    i10 &= -29360129;
                    j5 = value;
                } else {
                    j5 = j2;
                }
                z7 = z4;
                do1VarE = null;
                if (i12 != 0) {
                    j6 = value;
                    i14 = 1015017965;
                    r48Var3 = null;
                    j7 = j5;
                } else {
                    j6 = value;
                    j7 = j5;
                    i14 = 1015017965;
                    r48Var3 = r48Var;
                }
            } else {
                if (i11 != 0) {
                    bVar2 = androidx.compose.ui.b.INSTANCE;
                }
                if (i4 != 0) {
                    z4 = true;
                }
                if (i6 != 0) {
                    function4 = null;
                }
                if (i8 != 0) {
                    function5 = null;
                }
                if ((i2 & 64) != 0) {
                    value = ((ei1) dVarF.v(cz1.a())).getValue();
                    i10 &= -3670017;
                } else {
                    value = j;
                }
                if ((i2 & 128) != 0) {
                    i10 &= -29360129;
                    j5 = value;
                } else {
                    j5 = j2;
                }
                z7 = z4;
                do1VarE = null;
                if (i12 != 0) {
                    j6 = value;
                    i14 = 1015017965;
                    r48Var3 = null;
                    j7 = j5;
                } else {
                    j6 = value;
                    j7 = j5;
                    i14 = 1015017965;
                    r48Var3 = r48Var;
                }
            }
            dVarF.M();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
            }
            if (function4 == null) {
                dVarF.y(1830899669);
            } else {
                dVarF.y(1830899670);
                do1VarE = ko1.e(-1745256900, true, new c(function4), dVarF, 54);
            }
            dVarF.u();
            int i111110 = i10 >> 6;
            dVar2 = dVarF;
            e(z3, function1, fe0.j(bVar2), z7, j6, j7, r48Var3, ko1.e(-906085472, true, new a(do1VarE, function5), dVarF, 54), dVar2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 7168) | (57344 & i111110) | (458752 & i111110) | (i111110 & 3670016), 0);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            bVar3 = bVar2;
            function6 = function4;
            function7 = function5;
            z6 = z7;
            j3 = j6;
            j4 = j7;
            r48Var2 = r48Var3;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            r48Var2 = r48Var;
            bVar3 = bVar2;
            z6 = z4;
            function6 = function4;
            function7 = function5;
            j3 = j;
            j4 = j2;
        }
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.hkc
                public final Object invoke(Object obj, Object obj2) {
                    return lkc.m(z, function0, bVar3, z6, function6, function7, j3, j4, r48Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function3, androidx.compose.p004runtime.d dVar, final int i) {
        int i2;
        androidx.compose.p004runtime.d dVarF = dVar.F(-1349901398);
        if ((i & 6) == 0) {
            i2 = (dVarF.T(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.T(function3) ? 32 : 16;
        }
        if (dVarF.g((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1349901398, i2, -1, "androidx.compose.material3.TabBaselineLayout (Tab.kt:300)");
            }
            int i3 = i2 & 14;
            boolean z = (i3 == 4) | ((i2 & 112) == 32);
            Object objR = dVarF.R();
            if (z || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new d(function2, function3);
                dVarF.L(objR);
            }
            ej7 ej7Var = (ej7) objR;
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            int iA = pp1.a(dVarF, 0);
            gs1 gs1VarJ = dVarF.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion2.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            androidx.compose.p004runtime.d dVarC = dud.c(dVarF);
            dud.i(dVarC, ej7Var, companion2.d());
            dud.i(dVarC, gs1VarJ, companion2.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion2.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion2.e());
            if (function2 != null) {
                dVarF.y(870361332);
                androidx.compose.ui.b bVarP = nx8.p(pn6.b(companion, "text"), c, 0.0f, 2, null);
                ej7 ej7VarI = androidx.compose.p001foundation.layout.j.i(tc.INSTANCE.o(), false);
                int iA2 = pp1.a(dVarF, 0);
                gs1 gs1VarJ2 = dVarF.j();
                androidx.compose.ui.b bVarE2 = ComposedModifierKt.e(dVarF, bVarP);
                Function0<ComposeUiNode> function0B2 = companion2.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B2);
                } else {
                    dVarF.k();
                }
                androidx.compose.p004runtime.d dVarC2 = dud.c(dVarF);
                dud.i(dVarC2, ej7VarI, companion2.d());
                dud.i(dVarC2, gs1VarJ2, companion2.f());
                Function2<ComposeUiNode, Integer, Unit> function2C2 = companion2.c();
                if (dVarC2.getInserting() || !Intrinsics.e(dVarC2.R(), Integer.valueOf(iA2))) {
                    dVarC2.L(Integer.valueOf(iA2));
                    dVarC2.e(Integer.valueOf(iA2), function2C2);
                }
                dud.i(dVarC2, bVarE2, companion2.e());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                function2.invoke(dVarF, Integer.valueOf(i3));
                dVarF.m();
                dVarF.u();
            } else {
                dVarF.y(870466081);
                dVarF.u();
            }
            if (function3 != null) {
                dVarF.y(870494880);
                androidx.compose.ui.b bVarB = pn6.b(companion, "icon");
                ej7 ej7VarI2 = androidx.compose.p001foundation.layout.j.i(tc.INSTANCE.o(), false);
                int iA3 = pp1.a(dVarF, 0);
                gs1 gs1VarJ3 = dVarF.j();
                androidx.compose.ui.b bVarE3 = ComposedModifierKt.e(dVarF, bVarB);
                Function0<ComposeUiNode> function0B3 = companion2.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B3);
                } else {
                    dVarF.k();
                }
                androidx.compose.p004runtime.d dVarC3 = dud.c(dVarF);
                dud.i(dVarC3, ej7VarI2, companion2.d());
                dud.i(dVarC3, gs1VarJ3, companion2.f());
                Function2<ComposeUiNode, Integer, Unit> function2C3 = companion2.c();
                if (dVarC3.getInserting() || !Intrinsics.e(dVarC3.R(), Integer.valueOf(iA3))) {
                    dVarC3.L(Integer.valueOf(iA3));
                    dVarC3.e(Integer.valueOf(iA3), function2C3);
                }
                dud.i(dVarC3, bVarE3, companion2.e());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.a;
                function3.invoke(dVarF, Integer.valueOf((i2 >> 3) & 14));
                dVarF.m();
                dVarF.u();
            } else {
                dVarF.y(870557345);
                dVarF.u();
            }
            dVarF.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.jkc
                public final Object invoke(Object obj, Object obj2) {
                    return lkc.h(function2, function3, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Function2 function2, Function2 function3, int i, androidx.compose.p004runtime.d dVar, int i2) {
        g(function2, function3, dVar, saa.a(i | 1));
        return Unit.a;
    }

    private static final void i(final long j, final long j2, boolean z, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, androidx.compose.p004runtime.d dVar, final int i) {
        int i2;
        final boolean z2;
        androidx.compose.p004runtime.d dVarF = dVar.F(-833145221);
        if ((i & 6) == 0) {
            i2 = (dVarF.D(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.D(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= dVarF.A(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= dVarF.T(function2) ? 2048 : 1024;
        }
        if (dVarF.g((i2 & 1171) != 1170, i2 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-833145221, i2, -1, "androidx.compose.material3.TabTransition (Tab.kt:274)");
            }
            int i3 = i2 >> 6;
            Transition transitionY = TransitionKt.y(Boolean.valueOf(z2), null, dVarF, i3 & 14, 2);
            e eVar = e.a;
            boolean zBooleanValue = ((Boolean) transitionY.w()).booleanValue();
            dVarF.y(-1069234984);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1069234984, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:289)");
            }
            long j3 = zBooleanValue ? j : j2;
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            dVarF.u();
            androidx.compose.ui.graphics.colorspace.c cVarU = ei1.u(j3);
            boolean zX = dVarF.x(cVarU);
            Object objR = dVarF.R();
            if (zX || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = (tjd) ColorVectorConverterKt.a(ei1.INSTANCE).invoke(cVarU);
                dVarF.L(objR);
            }
            tjd tjdVar = (tjd) objR;
            boolean zBooleanValue2 = ((Boolean) transitionY.p()).booleanValue();
            dVarF.y(-1069234984);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1069234984, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:289)");
            }
            long j4 = zBooleanValue2 ? j : j2;
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            dVarF.u();
            ei1 ei1VarL = ei1.l(j4);
            boolean zBooleanValue3 = ((Boolean) transitionY.w()).booleanValue();
            dVarF.y(-1069234984);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1069234984, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:289)");
            }
            long j5 = zBooleanValue3 ? j : j2;
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            dVarF.u();
            fs1.c(cz1.a().d(ei1.l(j(TransitionKt.r(transitionY, ei1VarL, ei1.l(j5), (xa4) eVar.invoke(transitionY.u(), dVarF, 0), tjdVar, "ColorAnimation", dVarF, 0)))), function2, dVarF, os9.i | (i3 & 112));
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.kkc
                public final Object invoke(Object obj, Object obj2) {
                    return lkc.k(j, j2, z2, function2, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final long j(q6c<ei1> q6cVar) {
        return q6cVar.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(long j, long j2, boolean z, Function2 function2, int i, androidx.compose.p004runtime.d dVar, int i2) {
        i(j, j2, z, function2, dVar, saa.a(i | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(boolean z, Function0 function0, androidx.compose.ui.b bVar, boolean z2, long j, long j2, r48 r48Var, ps4 ps4Var, int i, int i2, androidx.compose.p004runtime.d dVar, int i3) {
        e(z, function0, bVar, z2, j, j2, r48Var, ps4Var, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(boolean z, Function0 function0, androidx.compose.ui.b bVar, boolean z2, Function2 function2, Function2 function3, long j, long j2, r48 r48Var, int i, int i2, androidx.compose.p004runtime.d dVar, int i3) {
        f(z, function0, bVar, z2, function2, function3, j, j2, r48Var, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    public static final float t() {
        return c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(androidx.compose.ui.layout.o.a aVar, f43 f43Var, androidx.compose.ui.layout.o oVar, androidx.compose.ui.layout.o oVar2, int i, int i2, int i3, int i4) {
        int iO1 = f43Var.O1(i3 == i4 ? d : e) + f43Var.O1(mm9.a.b());
        int height = (oVar2.getHeight() + f43Var.A2(f)) - i3;
        int i5 = (i2 - i4) - iO1;
        androidx.compose.ui.layout.o.a.L(aVar, oVar, (i - oVar.getWidth()) / 2, i5, 0.0f, 4, null);
        androidx.compose.ui.layout.o.a.L(aVar, oVar2, (i - oVar2.getWidth()) / 2, i5 - height, 0.0f, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(androidx.compose.ui.layout.o.a aVar, androidx.compose.ui.layout.o oVar, int i) {
        androidx.compose.ui.layout.o.a.L(aVar, oVar, 0, (i - oVar.getHeight()) / 2, 0.0f, 4, null);
    }
}
