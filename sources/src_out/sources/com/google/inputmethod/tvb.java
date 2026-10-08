package com.google.inputmethod;

import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p001foundation.layout.t0;
import androidx.compose.p004runtime.d;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import com.google.android.ps4;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u0087\u0001\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001ag\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aS\u0010\u001a\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001aU\u0010\u001e\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0003¢\u0006\u0004\b\u001e\u0010\u001b\"\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\"\u0014\u0010$\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!\"\u0014\u0010&\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010!\"\u0014\u0010(\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010!\"\u0014\u0010)\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010!\"\u0014\u0010+\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010!\"\u0014\u0010,\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010!\"\u0014\u0010.\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010!¨\u0006/"}, d2 = {"Landroidx/compose/ui/b;", "modifier", "Lkotlin/Function0;", "", "action", "dismissAction", "", "actionOnNewLine", "Lcom/google/android/xkb;", "shape", "Lcom/google/android/ei1;", "containerColor", "contentColor", "actionContentColor", "dismissActionContentColor", "content", "i", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLcom/google/android/xkb;JJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;II)V", "Lcom/google/android/jvb;", "snackbarData", "actionColor", "j", "(Lcom/google/android/jvb;Landroidx/compose/ui/b;ZLcom/google/android/xkb;JJJJJLandroidx/compose/runtime/d;II)V", "text", "Landroidx/compose/ui/text/y;", "actionTextStyle", "e", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/y;JJLandroidx/compose/runtime/d;I)V", "actionTextColor", "dismissActionColor", "g", "Lcom/google/android/ff3;", "a", "F", "ContainerMaxWidth", "b", "HeightToFirstLine", "c", "HorizontalSpacing", "d", "HorizontalSpacingButtonSide", "SeparateButtonExtraY", "f", "SnackbarVerticalPadding", "TextEndExtraSpacing", "h", "LongButtonVerticalOffset", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class tvb {
    private static final float d;
    private static final float g;
    private static final float a = ff3.i(600);
    private static final float b = ff3.i(30);
    private static final float c = ff3.i(16);
    private static final float e = ff3.i(2);
    private static final float f = ff3.i(6);
    private static final float h = ff3.i(12);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements ej7 {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(o oVar, int i, o oVar2, int i2, int i3, o oVar3, int i4, int i5, o.a aVar) {
            o.a.L(aVar, oVar, 0, i, 0.0f, 4, null);
            if (oVar2 != null) {
                o.a.L(aVar, oVar2, i2, i3, 0.0f, 4, null);
            }
            if (oVar3 != null) {
                o.a.L(aVar, oVar3, i4, i5, 0.0f, 4, null);
            }
            return Unit.a;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX WARN: Code duplicated, block: B:60:0x0125 A[PHI: r0 r4
  0x0125: PHI (r0v12 int) = (r0v11 int), (r0v18 int), (r0v18 int) binds: [B:63:0x0148, B:56:0x0116, B:58:0x0120] A[DONT_GENERATE, DONT_INLINE]
  0x0125: PHI (r4v4 int) = (r4v3 int), (r4v12 int), (r4v12 int) binds: [B:63:0x0148, B:56:0x0116, B:58:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // com.google.inputmethod.ej7
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final fj7 mo0measure3p2s80s(j jVar, List<? extends dj7> list, long j) throws KotlinNothingValueException {
            dj7 dj7Var;
            dj7 dj7Var2;
            int iO1;
            int iMax;
            int height;
            int iJ;
            j jVar2 = jVar;
            int iMin = Math.min(kx1.l(j), jVar2.O1(tvb.a));
            String str = this.a;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    dj7Var = null;
                    break;
                }
                dj7Var = list.get(i);
                if (Intrinsics.e(pn6.a(dj7Var), str)) {
                    break;
                }
                i++;
            }
            dj7 dj7Var3 = dj7Var;
            o oVarR0 = dj7Var3 != null ? dj7Var3.r0(j) : null;
            String str2 = this.b;
            int size2 = list.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    dj7Var2 = null;
                    break;
                }
                dj7Var2 = list.get(i2);
                if (Intrinsics.e(pn6.a(dj7Var2), str2)) {
                    break;
                }
                i2++;
            }
            dj7 dj7Var4 = dj7Var2;
            final o oVarR1 = dj7Var4 != null ? dj7Var4.r0(j) : null;
            int width = oVarR0 != null ? oVarR0.getWidth() : 0;
            int height2 = oVarR0 != null ? oVarR0.getHeight() : 0;
            int width2 = oVarR1 != null ? oVarR1.getWidth() : 0;
            int height3 = oVarR1 != null ? oVarR1.getHeight() : 0;
            int iE = g.e(((iMin - width) - width2) - (width2 == 0 ? jVar2.O1(tvb.g) : 0), kx1.n(j));
            String str3 = this.c;
            int size3 = list.size();
            int i3 = 0;
            while (i3 < size3) {
                dj7 dj7Var5 = list.get(i3);
                if (Intrinsics.e(pn6.a(dj7Var5), str3)) {
                    int i4 = height3;
                    final o oVarR2 = dj7Var5.r0(kx1.d(j, 0, iE, 0, 0, 9, null));
                    int iJ2 = oVarR2.J(AlignmentLineKt.a());
                    int iJ3 = oVarR2.J(AlignmentLineKt.b());
                    boolean z = true;
                    boolean z2 = (iJ2 == Integer.MIN_VALUE || iJ3 == Integer.MIN_VALUE) ? false : true;
                    if (iJ2 != iJ3 && z2) {
                        z = false;
                    }
                    final int i5 = iMin - width2;
                    final int i6 = i5 - width;
                    if (z) {
                        iMax = Math.max(jVar2.O1(wvb.a.g()), Math.max(height2, i4));
                        iO1 = (iMax - oVarR2.getHeight()) / 2;
                        if (oVarR0 == null || (iJ = oVarR0.J(AlignmentLineKt.a())) == Integer.MIN_VALUE) {
                            height = 0;
                        } else {
                            height = (iJ2 + iO1) - iJ;
                        }
                    } else {
                        iO1 = jVar2.O1(tvb.b) - iJ2;
                        iMax = Math.max(jVar2.O1(wvb.a.j()), oVarR2.getHeight() + iO1);
                        if (oVarR0 != null) {
                            height = (iMax - oVarR0.getHeight()) / 2;
                        } else {
                            height = 0;
                        }
                    }
                    final int i7 = height;
                    final int i8 = iO1;
                    int i9 = iMax;
                    final int height4 = oVarR1 != null ? (i9 - oVarR1.getHeight()) / 2 : 0;
                    final o oVar = oVarR0;
                    return j.Q1(jVar2, iMin, i9, null, new Function1() { // from class: com.google.android.svb
                        public final Object invoke(Object obj) {
                            return tvb.a.b(oVarR2, i8, oVarR1, i5, height4, oVar, i6, i7, (o.a) obj);
                        }
                    }, 4, null);
                }
                i3++;
                jVar2 = jVar;
                height3 = height3;
            }
            m47.f("Collection contains no element matching the predicate.");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ boolean a;
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> b;
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> c;
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> d;
        final /* synthetic */ long e;
        final /* synthetic */ long f;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
            final /* synthetic */ boolean a;
            final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> b;
            final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> c;
            final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> d;
            final /* synthetic */ TextStyle e;
            final /* synthetic */ long f;
            final /* synthetic */ long g;

            /* JADX WARN: Multi-variable type inference failed */
            a(boolean z, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function3, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function4, TextStyle textStyle, long j, long j2) {
                this.a = z;
                this.b = function2;
                this.c = function3;
                this.d = function4;
                this.e = textStyle;
                this.f = j;
                this.g = j2;
            }

            public final void a(androidx.compose.p004runtime.d dVar, int i) {
                if (!dVar.g((i & 3) != 2, i & 1)) {
                    dVar.q();
                    return;
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(969655473, i, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:121)");
                }
                if (!this.a || this.b == null) {
                    dVar.y(-168976609);
                    tvb.g(this.c, this.b, this.d, this.e, this.f, this.g, dVar, 0);
                    dVar.u();
                } else {
                    dVar.y(-168990288);
                    tvb.e(this.c, this.b, this.d, this.e, this.f, this.g, dVar, 0);
                    dVar.u();
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                return Unit.a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(boolean z, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function3, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function4, long j, long j2) {
            this.a = z;
            this.b = function2;
            this.c = function3;
            this.d = function4;
            this.e = j;
            this.f = j2;
        }

        public final void a(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1343524879, i, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:118)");
            }
            wvb wvbVar = wvb.a;
            fs1.c(qxc.q().d(xod.e(wvbVar.i(), dVar, 6)), ko1.e(969655473, true, new a(this.a, this.b, this.c, this.d, xod.e(wvbVar.b(), dVar, 6), this.e, this.f), dVar, 54), dVar, os9.i | 48);
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
        final /* synthetic */ jvb a;

        c(jvb jvbVar) {
            this.a = jvbVar;
        }

        public final void a(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1266389126, i, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:246)");
            }
            qxc.j(this.a.getVisuals().getMessage(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, dVar, 0, 0, 262142);
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
    static final class d implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ long a;
        final /* synthetic */ jvb b;
        final /* synthetic */ String c;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a implements ps4<hra, androidx.compose.p004runtime.d, Integer, Unit> {
            final /* synthetic */ String a;

            a(String str) {
                this.a = str;
            }

            public final void a(hra hraVar, androidx.compose.p004runtime.d dVar, int i) {
                if (!dVar.g((i & 17) != 16, i & 1)) {
                    dVar.q();
                    return;
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(521110564, i, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:214)");
                }
                qxc.j(this.a, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, dVar, 0, 0, 262142);
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((hra) obj, (androidx.compose.p004runtime.d) obj2, ((Number) obj3).intValue());
                return Unit.a;
            }
        }

        d(long j, jvb jvbVar, String str) {
            this.a = j;
            this.b = jvbVar;
            this.c = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(jvb jvbVar) {
            jvbVar.b();
            return Unit.a;
        }

        public final void b(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1378313599, i, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:211)");
            }
            vx0 vx0VarS = wx0.a.s(0L, this.a, 0L, 0L, dVar, 24576, 13);
            boolean zX = dVar.x(this.b);
            final jvb jvbVar = this.b;
            Object objR = dVar.R();
            if (zX || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new Function0() { // from class: com.google.android.uvb
                    public final Object invoke() {
                        return tvb.d.c(jvbVar);
                    }
                };
                dVar.L(objR);
            }
            by0.j((Function0) objR, null, false, null, vx0VarS, null, null, null, null, ko1.e(521110564, true, new a(this.c), dVar, 54), dVar, 805306368, 494);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class e implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ jvb a;

        e(jvb jvbVar) {
            this.a = jvbVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(jvb jvbVar) {
            jvbVar.dismiss();
            return Unit.a;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final void b(androidx.compose.p004runtime.d dVar, int i) throws NoWhenBranchMatchedException {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1812633777, i, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:223)");
            }
            boolean zX = dVar.x(this.a);
            final jvb jvbVar = this.a;
            Object objR = dVar.R();
            if (zX || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new Function0() { // from class: com.google.android.vvb
                    public final Object invoke() {
                        return tvb.e.c(jvbVar);
                    }
                };
                dVar.L(objR);
            }
            nj5.h((Function0) objR, null, false, null, null, null, lp1.a.a(), dVar, 1572864, 62);
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

    static {
        float f2 = 8;
        d = ff3.i(f2);
        g = ff3.i(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v31 */
    public static final void e(final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function3, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function4, final TextStyle textStyle, final long j, final long j2, androidx.compose.p004runtime.d dVar, final int i) {
        int i2;
        ?? r7;
        androidx.compose.p004runtime.d dVarF = dVar.F(-264666338);
        if ((i & 6) == 0) {
            i2 = (dVarF.T(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.T(function3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dVarF.T(function4) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= dVarF.x(textStyle) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dVarF.D(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dVarF.D(j2) ? 131072 : 65536;
        }
        if (dVarF.g((74899 & i2) != 74898, i2 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-264666338, i2, -1, "androidx.compose.material3.NewLineButtonSnackbar (Snackbar.kt:258)");
            }
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            androidx.compose.ui.b bVarR = nx8.r(SizeKt.h(SizeKt.A(companion, 0.0f, a, 1, null), 0.0f, 1, null), c, 0.0f, 0.0f, e, 6, null);
            androidx.compose.p001foundation.layout.c cVar = androidx.compose.p001foundation.layout.c.a;
            androidx.compose.foundation.layout.c.n nVarK = cVar.k();
            tc.Companion companion2 = tc.INSTANCE;
            int i3 = i2;
            ej7 ej7VarA = androidx.compose.p001foundation.layout.o.a(nVarK, companion2.k(), dVarF, 0);
            int iA = pp1.a(dVarF, 0);
            gs1 gs1VarJ = dVarF.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, bVarR);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion3.b();
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
            dud.i(dVarC, ej7VarA, companion3.d());
            dud.i(dVarC, gs1VarJ, companion3.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion3.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion3.e());
            yj1 yj1Var = yj1.a;
            androidx.compose.ui.b bVarH = androidx.compose.p001foundation.layout.AlignmentLineKt.h(companion, b, h);
            float fI = d;
            androidx.compose.ui.b bVarR2 = nx8.r(bVarH, 0.0f, 0.0f, fI, 0.0f, 11, null);
            ej7 ej7VarI = androidx.compose.p001foundation.layout.j.i(companion2.o(), false);
            int iA2 = pp1.a(dVarF, 0);
            gs1 gs1VarJ2 = dVarF.j();
            androidx.compose.ui.b bVarE2 = ComposedModifierKt.e(dVarF, bVarR2);
            Function0<ComposeUiNode> function0B2 = companion3.b();
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
            dud.i(dVarC2, ej7VarI, companion3.d());
            dud.i(dVarC2, gs1VarJ2, companion3.f());
            Function2<ComposeUiNode, Integer, Unit> function2C2 = companion3.c();
            if (dVarC2.getInserting() || !Intrinsics.e(dVarC2.R(), Integer.valueOf(iA2))) {
                dVarC2.L(Integer.valueOf(iA2));
                dVarC2.e(Integer.valueOf(iA2), function2C2);
            }
            dud.i(dVarC2, bVarE2, companion3.e());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            function2.invoke(dVarF, Integer.valueOf(i3 & 14));
            dVarF.m();
            androidx.compose.ui.b bVarB = yj1Var.b(companion, companion2.j());
            if (function4 == null) {
                r7 = 0;
            } else {
                r7 = 0;
                fI = ff3.i(0);
            }
            androidx.compose.ui.b bVarR3 = nx8.r(bVarB, 0.0f, 0.0f, fI, 0.0f, 11, null);
            ej7 ej7VarI2 = androidx.compose.p001foundation.layout.j.i(companion2.o(), r7);
            int iA3 = pp1.a(dVarF, r7);
            gs1 gs1VarJ3 = dVarF.j();
            androidx.compose.ui.b bVarE3 = ComposedModifierKt.e(dVarF, bVarR3);
            Function0<ComposeUiNode> function0B3 = companion3.b();
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
            dud.i(dVarC3, ej7VarI2, companion3.d());
            dud.i(dVarC3, gs1VarJ3, companion3.f());
            Function2<ComposeUiNode, Integer, Unit> function2C3 = companion3.c();
            if (dVarC3.getInserting() || !Intrinsics.e(dVarC3.R(), Integer.valueOf(iA3))) {
                dVarC3.L(Integer.valueOf(iA3));
                dVarC3.e(Integer.valueOf(iA3), function2C3);
            }
            dud.i(dVarC3, bVarE3, companion3.e());
            ej7 ej7VarB = t0.b(cVar.j(), companion2.l(), dVarF, 0);
            int iA4 = pp1.a(dVarF, 0);
            gs1 gs1VarJ4 = dVarF.j();
            androidx.compose.ui.b bVarE4 = ComposedModifierKt.e(dVarF, companion);
            Function0<ComposeUiNode> function0B4 = companion3.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B4);
            } else {
                dVarF.k();
            }
            androidx.compose.p004runtime.d dVarC4 = dud.c(dVarF);
            dud.i(dVarC4, ej7VarB, companion3.d());
            dud.i(dVarC4, gs1VarJ4, companion3.f());
            Function2<ComposeUiNode, Integer, Unit> function2C4 = companion3.c();
            if (dVarC4.getInserting() || !Intrinsics.e(dVarC4.R(), Integer.valueOf(iA4))) {
                dVarC4.L(Integer.valueOf(iA4));
                dVarC4.e(Integer.valueOf(iA4), function2C4);
            }
            dud.i(dVarC4, bVarE4, companion3.e());
            ira iraVar = ira.a;
            os9[] os9VarArr = {cz1.a().d(ei1.l(j)), qxc.q().d(textStyle)};
            int i4 = os9.i;
            fs1.d(os9VarArr, function3, dVarF, (i3 & 112) | i4);
            if (function4 != null) {
                dVarF.y(916269829);
                fs1.c(cz1.a().d(ei1.l(j2)), function4, dVarF, i4 | ((i3 >> 3) & 112));
                dVarF.u();
            } else {
                dVarF.y(916475483);
                dVarF.u();
            }
            dVarF.m();
            dVarF.m();
            dVarF.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.rvb
                public final Object invoke(Object obj, Object obj2) {
                    return tvb.f(function2, function3, function4, textStyle, j, j2, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Function2 function2, Function2 function3, Function2 function4, TextStyle textStyle, long j, long j2, int i, androidx.compose.p004runtime.d dVar, int i2) {
        e(function2, function3, function4, textStyle, j, j2, dVar, saa.a(i | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function3, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function4, final TextStyle textStyle, final long j, final long j2, androidx.compose.p004runtime.d dVar, final int i) {
        int i2;
        androidx.compose.p004runtime.d dVarF = dVar.F(-931325388);
        if ((i & 6) == 0) {
            i2 = (dVarF.T(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.T(function3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dVarF.T(function4) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= dVarF.x(textStyle) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dVarF.D(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dVarF.D(j2) ? 131072 : 65536;
        }
        if (dVarF.g((74899 & i2) != 74898, i2 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-931325388, i2, -1, "androidx.compose.material3.OneRowSnackbar (Snackbar.kt:303)");
            }
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            androidx.compose.ui.b bVarR = nx8.r(companion, c, 0.0f, function4 == null ? d : ff3.i(0), 0.0f, 10, null);
            Object objR = dVarF.R();
            int i3 = i2;
            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new a("action", "dismissAction", "text");
                dVarF.L(objR);
            }
            ej7 ej7Var = (ej7) objR;
            int iA = pp1.a(dVarF, 0);
            gs1 gs1VarJ = dVarF.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, bVarR);
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
            androidx.compose.ui.b bVarP = nx8.p(pn6.b(companion, "text"), 0.0f, f, 1, null);
            tc.Companion companion3 = tc.INSTANCE;
            ej7 ej7VarI = androidx.compose.p001foundation.layout.j.i(companion3.o(), false);
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
            function2.invoke(dVarF, Integer.valueOf(i3 & 14));
            dVarF.m();
            if (function3 != null) {
                dVarF.y(-1014168049);
                androidx.compose.ui.b bVarB = pn6.b(companion, "action");
                ej7 ej7VarI2 = androidx.compose.p001foundation.layout.j.i(companion3.o(), false);
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
                fs1.d(new os9[]{cz1.a().d(ei1.l(j)), qxc.q().d(textStyle)}, function3, dVarF, os9.i | (i3 & 112));
                dVarF.m();
                dVarF.u();
            } else {
                dVarF.y(-1013852841);
                dVarF.u();
            }
            if (function4 != null) {
                dVarF.y(-1013804481);
                androidx.compose.ui.b bVarB2 = pn6.b(companion, "dismissAction");
                ej7 ej7VarI3 = androidx.compose.p001foundation.layout.j.i(companion3.o(), false);
                int iA4 = pp1.a(dVarF, 0);
                gs1 gs1VarJ4 = dVarF.j();
                androidx.compose.ui.b bVarE4 = ComposedModifierKt.e(dVarF, bVarB2);
                Function0<ComposeUiNode> function0B4 = companion2.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B4);
                } else {
                    dVarF.k();
                }
                androidx.compose.p004runtime.d dVarC4 = dud.c(dVarF);
                dud.i(dVarC4, ej7VarI3, companion2.d());
                dud.i(dVarC4, gs1VarJ4, companion2.f());
                Function2<ComposeUiNode, Integer, Unit> function2C4 = companion2.c();
                if (dVarC4.getInserting() || !Intrinsics.e(dVarC4.R(), Integer.valueOf(iA4))) {
                    dVarC4.L(Integer.valueOf(iA4));
                    dVarC4.e(Integer.valueOf(iA4), function2C4);
                }
                dud.i(dVarC4, bVarE4, companion2.e());
                fs1.c(cz1.a().d(ei1.l(j2)), function4, dVarF, os9.i | ((i3 >> 3) & 112));
                dVarF.m();
                dVarF.u();
            } else {
                dVarF.y(-1013535401);
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
            s6bVarH.a(new Function2() { // from class: com.google.android.qvb
                public final Object invoke(Object obj, Object obj2) {
                    return tvb.h(function2, function3, function4, textStyle, j, j2, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Function2 function2, Function2 function3, Function2 function4, TextStyle textStyle, long j, long j2, int i, androidx.compose.p004runtime.d dVar, int i2) {
        g(function2, function3, function4, textStyle, j, j2, dVar, saa.a(i | 1));
        return Unit.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:100:0x010f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0114  */
    /* JADX WARN: Code duplicated, block: B:104:0x0118  */
    /* JADX WARN: Code duplicated, block: B:106:0x0120  */
    /* JADX WARN: Code duplicated, block: B:107:0x0123  */
    /* JADX WARN: Code duplicated, block: B:111:0x0131  */
    /* JADX WARN: Code duplicated, block: B:112:0x0133  */
    /* JADX WARN: Code duplicated, block: B:115:0x013c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0152  */
    /* JADX WARN: Code duplicated, block: B:136:0x0189 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x018b  */
    /* JADX WARN: Code duplicated, block: B:138:0x018e  */
    /* JADX WARN: Code duplicated, block: B:141:0x0194  */
    /* JADX WARN: Code duplicated, block: B:144:0x0199  */
    /* JADX WARN: Code duplicated, block: B:146:0x019d  */
    /* JADX WARN: Code duplicated, block: B:147:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:150:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:151:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:154:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:155:0x01be  */
    /* JADX WARN: Code duplicated, block: B:158:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:159:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:162:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:163:0x01db  */
    /* JADX WARN: Code duplicated, block: B:166:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:167:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:170:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:173:0x025a  */
    /* JADX WARN: Code duplicated, block: B:175:0x0269  */
    /* JADX WARN: Code duplicated, block: B:178:0x0280  */
    /* JADX WARN: Code duplicated, block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00da  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:95:0x0103  */
    /* JADX WARN: Code duplicated, block: B:97:0x0107  */
    public static final void i(androidx.compose.ui.b bVar, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function3, boolean z, xkb xkbVar, long j, long j2, long j3, long j4, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function4, androidx.compose.p004runtime.d dVar, final int i, final int i2) throws NoWhenBranchMatchedException {
        int i3;
        Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function5;
        int i4;
        Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function6;
        int i5;
        int i6;
        boolean z2;
        int i7;
        xkb xkbVar2;
        long j5;
        int i8;
        boolean z3;
        androidx.compose.p004runtime.d dVar2;
        final androidx.compose.ui.b bVar2;
        final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function7;
        final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function8;
        final boolean z4;
        final xkb xkbVar3;
        final long j6;
        final long j7;
        final long j8;
        final long j9;
        s6b s6bVarH;
        androidx.compose.ui.b bVar3;
        Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function9;
        boolean z5;
        xkb xkbVarF;
        long jC;
        long jD;
        long jB;
        long jE;
        int i9;
        int i10;
        int i11;
        androidx.compose.p004runtime.d dVarF = dVar.F(-1218779924);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.x(bVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 == 0) {
            if ((i & 48) == 0) {
                function5 = function2;
                i3 |= dVarF.T(function5) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    function6 = function3;
                    if (dVarF.T(function6)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        z2 = z;
                        if (dVarF.A(z2)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    if ((i & 24576) == 0) {
                        if ((i2 & 16) == 0) {
                            xkbVar2 = xkbVar;
                            int i14 = dVarF.x(xkbVar2) ? 16384 : 8192;
                            i3 |= i14;
                        } else {
                            xkbVar2 = xkbVar;
                        }
                        i3 |= i14;
                    } else {
                        xkbVar2 = xkbVar;
                    }
                    if ((196608 & i) == 0) {
                        if ((i2 & 32) == 0) {
                            j5 = j;
                            int i15 = dVarF.D(j5) ? 131072 : 65536;
                            i3 |= i15;
                        } else {
                            j5 = j;
                        }
                        i3 |= i15;
                    } else {
                        j5 = j;
                    }
                    if ((i & 1572864) != 0) {
                        if ((i2 & 64) == 0 || !dVarF.D(j2)) {
                            i11 = 524288;
                        } else {
                            i11 = 1048576;
                        }
                        i3 |= i11;
                    }
                    if ((i & 12582912) != 0) {
                        if ((i2 & 128) == 0 || !dVarF.D(j3)) {
                            i10 = 4194304;
                        } else {
                            i10 = 8388608;
                        }
                        i3 |= i10;
                    }
                    if ((100663296 & i) != 0) {
                        if ((i2 & 256) == 0 || !dVarF.D(j4)) {
                            i9 = 33554432;
                        } else {
                            i9 = 67108864;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 512) != 0) {
                        if ((i & 805306368) == 0) {
                            if (dVarF.T(function4)) {
                                i8 = 536870912;
                            } else {
                                i8 = 268435456;
                            }
                            i3 |= i8;
                        }
                        if ((i3 & 306783379) != 306783378) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (dVarF.g(z3, i3 & 1)) {
                            dVarF.U();
                            if ((i & 1) != 0 || dVarF.t()) {
                                if (i12 != 0) {
                                    bVar3 = androidx.compose.ui.b.INSTANCE;
                                } else {
                                    bVar3 = bVar;
                                }
                                if (i13 != 0) {
                                    function5 = null;
                                }
                                function9 = i4 == 0 ? function6 : null;
                                if (i6 != 0) {
                                    z5 = false;
                                } else {
                                    z5 = z2;
                                }
                                if ((i2 & 16) != 0) {
                                    xkbVarF = kvb.a.f(dVarF, 6);
                                    i3 &= -57345;
                                } else {
                                    xkbVarF = xkbVar2;
                                }
                                if ((i2 & 32) != 0) {
                                    jC = kvb.a.c(dVarF, 6);
                                    i3 &= -458753;
                                } else {
                                    jC = j5;
                                }
                                if ((i2 & 64) != 0) {
                                    jD = kvb.a.d(dVarF, 6);
                                    i3 &= -3670017;
                                } else {
                                    jD = j2;
                                }
                                if ((i2 & 128) != 0) {
                                    jB = kvb.a.b(dVarF, 6);
                                    i3 &= -29360129;
                                } else {
                                    jB = j3;
                                }
                                if ((i2 & 256) != 0) {
                                    jE = kvb.a.e(dVarF, 6);
                                    i3 &= -234881025;
                                } else {
                                    jE = j4;
                                }
                            } else {
                                dVarF.q();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                if ((i2 & 256) != 0) {
                                    i3 &= -234881025;
                                }
                                bVar3 = bVar;
                                jE = j4;
                                function9 = function6;
                                z5 = z2;
                                xkbVarF = xkbVar2;
                                jC = j5;
                                jD = j2;
                                jB = j3;
                            }
                            dVarF.M();
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(-1218779924, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
                            }
                            androidx.compose.ui.b bVar4 = bVar3;
                            int i16 = i3 >> 9;
                            afc.c(bVar4, xkbVarF, jC, jD, 0.0f, wvb.a.d(), null, ko1.e(-1343524879, true, new b(z5, function5, function4, function9, jB, jE), dVarF, 54), dVarF, (i3 & 14) | 12779520 | (i16 & 112) | (i16 & 896) | (i16 & 7168), 80);
                            bVar2 = bVar4;
                            dVar2 = dVarF;
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            xkbVar3 = xkbVarF;
                            function7 = function5;
                            j6 = jC;
                            j7 = jD;
                            j8 = jB;
                            z4 = z5;
                            j9 = jE;
                            function8 = function9;
                        } else {
                            dVar2 = dVarF;
                            dVar2.q();
                            bVar2 = bVar;
                            function7 = function5;
                            function8 = function6;
                            z4 = z2;
                            xkbVar3 = xkbVar2;
                            j6 = j5;
                            j7 = j2;
                            j8 = j3;
                            j9 = j4;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.pvb
                                public final Object invoke(Object obj, Object obj2) {
                                    return tvb.k(bVar2, function7, function8, z4, xkbVar3, j6, j7, j8, j9, function4, i, i2, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i3 |= 805306368;
                    if ((i3 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i3 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i4 == 0) {
                            }
                            if (i6 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            if ((i2 & 16) != 0) {
                                xkbVarF = kvb.a.f(dVarF, 6);
                                i3 &= -57345;
                            } else {
                                xkbVarF = xkbVar2;
                            }
                            if ((i2 & 32) != 0) {
                                jC = kvb.a.c(dVarF, 6);
                                i3 &= -458753;
                            } else {
                                jC = j5;
                            }
                            if ((i2 & 64) != 0) {
                                jD = kvb.a.d(dVarF, 6);
                                i3 &= -3670017;
                            } else {
                                jD = j2;
                            }
                            if ((i2 & 128) != 0) {
                                jB = kvb.a.b(dVarF, 6);
                                i3 &= -29360129;
                            } else {
                                jB = j3;
                            }
                            if ((i2 & 256) != 0) {
                                jE = kvb.a.e(dVarF, 6);
                                i3 &= -234881025;
                            } else {
                                jE = j4;
                            }
                        } else {
                            if (i12 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i4 == 0) {
                            }
                            if (i6 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            if ((i2 & 16) != 0) {
                                xkbVarF = kvb.a.f(dVarF, 6);
                                i3 &= -57345;
                            } else {
                                xkbVarF = xkbVar2;
                            }
                            if ((i2 & 32) != 0) {
                                jC = kvb.a.c(dVarF, 6);
                                i3 &= -458753;
                            } else {
                                jC = j5;
                            }
                            if ((i2 & 64) != 0) {
                                jD = kvb.a.d(dVarF, 6);
                                i3 &= -3670017;
                            } else {
                                jD = j2;
                            }
                            if ((i2 & 128) != 0) {
                                jB = kvb.a.b(dVarF, 6);
                                i3 &= -29360129;
                            } else {
                                jB = j3;
                            }
                            if ((i2 & 256) != 0) {
                                jE = kvb.a.e(dVarF, 6);
                                i3 &= -234881025;
                            } else {
                                jE = j4;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-1218779924, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
                        }
                        androidx.compose.ui.b bVar5 = bVar3;
                        int i17 = i3 >> 9;
                        afc.c(bVar5, xkbVarF, jC, jD, 0.0f, wvb.a.d(), null, ko1.e(-1343524879, true, new b(z5, function5, function4, function9, jB, jE), dVarF, 54), dVarF, (i3 & 14) | 12779520 | (i17 & 112) | (i17 & 896) | (i17 & 7168), 80);
                        bVar2 = bVar5;
                        dVar2 = dVarF;
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        xkbVar3 = xkbVarF;
                        function7 = function5;
                        j6 = jC;
                        j7 = jD;
                        j8 = jB;
                        z4 = z5;
                        j9 = jE;
                        function8 = function9;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar2 = bVar;
                        function7 = function5;
                        function8 = function6;
                        z4 = z2;
                        xkbVar3 = xkbVar2;
                        j6 = j5;
                        j7 = j2;
                        j8 = j3;
                        j9 = j4;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.pvb
                            public final Object invoke(Object obj, Object obj2) {
                                return tvb.k(bVar2, function7, function8, z4, xkbVar3, j6, j7, j8, j9, function4, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 3072;
                z2 = z;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        xkbVar2 = xkbVar;
                        if (dVarF.x(xkbVar2)) {
                        }
                        i3 |= i14;
                    } else {
                        xkbVar2 = xkbVar;
                    }
                    i3 |= i14;
                } else {
                    xkbVar2 = xkbVar;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        j5 = j;
                        if (dVarF.D(j5)) {
                        }
                        i3 |= i15;
                    } else {
                        j5 = j;
                    }
                    i3 |= i15;
                } else {
                    j5 = j;
                }
                if ((i & 1572864) != 0) {
                    if ((i2 & 64) == 0) {
                        i11 = 524288;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                if ((i & 12582912) != 0) {
                    if ((i2 & 128) == 0) {
                        i10 = 4194304;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
                if ((100663296 & i) != 0) {
                    if ((i2 & 256) == 0) {
                        i9 = 33554432;
                    } else {
                        i9 = 33554432;
                    }
                    i3 |= i9;
                }
                if ((i2 & 512) != 0) {
                    if ((i & 805306368) == 0) {
                        if (dVarF.T(function4)) {
                            i8 = 536870912;
                        } else {
                            i8 = 268435456;
                        }
                        i3 |= i8;
                    }
                    if ((i3 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i3 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i4 == 0) {
                            }
                            if (i6 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            if ((i2 & 16) != 0) {
                                xkbVarF = kvb.a.f(dVarF, 6);
                                i3 &= -57345;
                            } else {
                                xkbVarF = xkbVar2;
                            }
                            if ((i2 & 32) != 0) {
                                jC = kvb.a.c(dVarF, 6);
                                i3 &= -458753;
                            } else {
                                jC = j5;
                            }
                            if ((i2 & 64) != 0) {
                                jD = kvb.a.d(dVarF, 6);
                                i3 &= -3670017;
                            } else {
                                jD = j2;
                            }
                            if ((i2 & 128) != 0) {
                                jB = kvb.a.b(dVarF, 6);
                                i3 &= -29360129;
                            } else {
                                jB = j3;
                            }
                            if ((i2 & 256) != 0) {
                                jE = kvb.a.e(dVarF, 6);
                                i3 &= -234881025;
                            } else {
                                jE = j4;
                            }
                        } else {
                            if (i12 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i4 == 0) {
                            }
                            if (i6 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            if ((i2 & 16) != 0) {
                                xkbVarF = kvb.a.f(dVarF, 6);
                                i3 &= -57345;
                            } else {
                                xkbVarF = xkbVar2;
                            }
                            if ((i2 & 32) != 0) {
                                jC = kvb.a.c(dVarF, 6);
                                i3 &= -458753;
                            } else {
                                jC = j5;
                            }
                            if ((i2 & 64) != 0) {
                                jD = kvb.a.d(dVarF, 6);
                                i3 &= -3670017;
                            } else {
                                jD = j2;
                            }
                            if ((i2 & 128) != 0) {
                                jB = kvb.a.b(dVarF, 6);
                                i3 &= -29360129;
                            } else {
                                jB = j3;
                            }
                            if ((i2 & 256) != 0) {
                                jE = kvb.a.e(dVarF, 6);
                                i3 &= -234881025;
                            } else {
                                jE = j4;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-1218779924, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
                        }
                        androidx.compose.ui.b bVar6 = bVar3;
                        int i18 = i3 >> 9;
                        afc.c(bVar6, xkbVarF, jC, jD, 0.0f, wvb.a.d(), null, ko1.e(-1343524879, true, new b(z5, function5, function4, function9, jB, jE), dVarF, 54), dVarF, (i3 & 14) | 12779520 | (i18 & 112) | (i18 & 896) | (i18 & 7168), 80);
                        bVar2 = bVar6;
                        dVar2 = dVarF;
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        xkbVar3 = xkbVarF;
                        function7 = function5;
                        j6 = jC;
                        j7 = jD;
                        j8 = jB;
                        z4 = z5;
                        j9 = jE;
                        function8 = function9;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar2 = bVar;
                        function7 = function5;
                        function8 = function6;
                        z4 = z2;
                        xkbVar3 = xkbVar2;
                        j6 = j5;
                        j7 = j2;
                        j8 = j3;
                        j9 = j4;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.pvb
                            public final Object invoke(Object obj, Object obj2) {
                                return tvb.k(bVar2, function7, function8, z4, xkbVar3, j6, j7, j8, j9, function4, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 805306368;
                if ((i3 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i2 & 16) != 0) {
                            xkbVarF = kvb.a.f(dVarF, 6);
                            i3 &= -57345;
                        } else {
                            xkbVarF = xkbVar2;
                        }
                        if ((i2 & 32) != 0) {
                            jC = kvb.a.c(dVarF, 6);
                            i3 &= -458753;
                        } else {
                            jC = j5;
                        }
                        if ((i2 & 64) != 0) {
                            jD = kvb.a.d(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            jD = j2;
                        }
                        if ((i2 & 128) != 0) {
                            jB = kvb.a.b(dVarF, 6);
                            i3 &= -29360129;
                        } else {
                            jB = j3;
                        }
                        if ((i2 & 256) != 0) {
                            jE = kvb.a.e(dVarF, 6);
                            i3 &= -234881025;
                        } else {
                            jE = j4;
                        }
                    } else {
                        if (i12 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i2 & 16) != 0) {
                            xkbVarF = kvb.a.f(dVarF, 6);
                            i3 &= -57345;
                        } else {
                            xkbVarF = xkbVar2;
                        }
                        if ((i2 & 32) != 0) {
                            jC = kvb.a.c(dVarF, 6);
                            i3 &= -458753;
                        } else {
                            jC = j5;
                        }
                        if ((i2 & 64) != 0) {
                            jD = kvb.a.d(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            jD = j2;
                        }
                        if ((i2 & 128) != 0) {
                            jB = kvb.a.b(dVarF, 6);
                            i3 &= -29360129;
                        } else {
                            jB = j3;
                        }
                        if ((i2 & 256) != 0) {
                            jE = kvb.a.e(dVarF, 6);
                            i3 &= -234881025;
                        } else {
                            jE = j4;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-1218779924, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
                    }
                    androidx.compose.ui.b bVar7 = bVar3;
                    int i19 = i3 >> 9;
                    afc.c(bVar7, xkbVarF, jC, jD, 0.0f, wvb.a.d(), null, ko1.e(-1343524879, true, new b(z5, function5, function4, function9, jB, jE), dVarF, 54), dVarF, (i3 & 14) | 12779520 | (i19 & 112) | (i19 & 896) | (i19 & 7168), 80);
                    bVar2 = bVar7;
                    dVar2 = dVarF;
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    xkbVar3 = xkbVarF;
                    function7 = function5;
                    j6 = jC;
                    j7 = jD;
                    j8 = jB;
                    z4 = z5;
                    j9 = jE;
                    function8 = function9;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar2 = bVar;
                    function7 = function5;
                    function8 = function6;
                    z4 = z2;
                    xkbVar3 = xkbVar2;
                    j6 = j5;
                    j7 = j2;
                    j8 = j3;
                    j9 = j4;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.pvb
                        public final Object invoke(Object obj, Object obj2) {
                            return tvb.k(bVar2, function7, function8, z4, xkbVar3, j6, j7, j8, j9, function4, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 384;
            function6 = function3;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    if (dVarF.A(z2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        xkbVar2 = xkbVar;
                        if (dVarF.x(xkbVar2)) {
                        }
                        i3 |= i14;
                    } else {
                        xkbVar2 = xkbVar;
                    }
                    i3 |= i14;
                } else {
                    xkbVar2 = xkbVar;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        j5 = j;
                        if (dVarF.D(j5)) {
                        }
                        i3 |= i15;
                    } else {
                        j5 = j;
                    }
                    i3 |= i15;
                } else {
                    j5 = j;
                }
                if ((i & 1572864) != 0) {
                    if ((i2 & 64) == 0) {
                        i11 = 524288;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                if ((i & 12582912) != 0) {
                    if ((i2 & 128) == 0) {
                        i10 = 4194304;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
                if ((100663296 & i) != 0) {
                    if ((i2 & 256) == 0) {
                        i9 = 33554432;
                    } else {
                        i9 = 33554432;
                    }
                    i3 |= i9;
                }
                if ((i2 & 512) != 0) {
                    if ((i & 805306368) == 0) {
                        if (dVarF.T(function4)) {
                            i8 = 536870912;
                        } else {
                            i8 = 268435456;
                        }
                        i3 |= i8;
                    }
                    if ((i3 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i3 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i4 == 0) {
                            }
                            if (i6 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            if ((i2 & 16) != 0) {
                                xkbVarF = kvb.a.f(dVarF, 6);
                                i3 &= -57345;
                            } else {
                                xkbVarF = xkbVar2;
                            }
                            if ((i2 & 32) != 0) {
                                jC = kvb.a.c(dVarF, 6);
                                i3 &= -458753;
                            } else {
                                jC = j5;
                            }
                            if ((i2 & 64) != 0) {
                                jD = kvb.a.d(dVarF, 6);
                                i3 &= -3670017;
                            } else {
                                jD = j2;
                            }
                            if ((i2 & 128) != 0) {
                                jB = kvb.a.b(dVarF, 6);
                                i3 &= -29360129;
                            } else {
                                jB = j3;
                            }
                            if ((i2 & 256) != 0) {
                                jE = kvb.a.e(dVarF, 6);
                                i3 &= -234881025;
                            } else {
                                jE = j4;
                            }
                        } else {
                            if (i12 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i4 == 0) {
                            }
                            if (i6 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            if ((i2 & 16) != 0) {
                                xkbVarF = kvb.a.f(dVarF, 6);
                                i3 &= -57345;
                            } else {
                                xkbVarF = xkbVar2;
                            }
                            if ((i2 & 32) != 0) {
                                jC = kvb.a.c(dVarF, 6);
                                i3 &= -458753;
                            } else {
                                jC = j5;
                            }
                            if ((i2 & 64) != 0) {
                                jD = kvb.a.d(dVarF, 6);
                                i3 &= -3670017;
                            } else {
                                jD = j2;
                            }
                            if ((i2 & 128) != 0) {
                                jB = kvb.a.b(dVarF, 6);
                                i3 &= -29360129;
                            } else {
                                jB = j3;
                            }
                            if ((i2 & 256) != 0) {
                                jE = kvb.a.e(dVarF, 6);
                                i3 &= -234881025;
                            } else {
                                jE = j4;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-1218779924, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
                        }
                        androidx.compose.ui.b bVar8 = bVar3;
                        int i110 = i3 >> 9;
                        afc.c(bVar8, xkbVarF, jC, jD, 0.0f, wvb.a.d(), null, ko1.e(-1343524879, true, new b(z5, function5, function4, function9, jB, jE), dVarF, 54), dVarF, (i3 & 14) | 12779520 | (i110 & 112) | (i110 & 896) | (i110 & 7168), 80);
                        bVar2 = bVar8;
                        dVar2 = dVarF;
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        xkbVar3 = xkbVarF;
                        function7 = function5;
                        j6 = jC;
                        j7 = jD;
                        j8 = jB;
                        z4 = z5;
                        j9 = jE;
                        function8 = function9;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar2 = bVar;
                        function7 = function5;
                        function8 = function6;
                        z4 = z2;
                        xkbVar3 = xkbVar2;
                        j6 = j5;
                        j7 = j2;
                        j8 = j3;
                        j9 = j4;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.pvb
                            public final Object invoke(Object obj, Object obj2) {
                                return tvb.k(bVar2, function7, function8, z4, xkbVar3, j6, j7, j8, j9, function4, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 805306368;
                if ((i3 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i2 & 16) != 0) {
                            xkbVarF = kvb.a.f(dVarF, 6);
                            i3 &= -57345;
                        } else {
                            xkbVarF = xkbVar2;
                        }
                        if ((i2 & 32) != 0) {
                            jC = kvb.a.c(dVarF, 6);
                            i3 &= -458753;
                        } else {
                            jC = j5;
                        }
                        if ((i2 & 64) != 0) {
                            jD = kvb.a.d(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            jD = j2;
                        }
                        if ((i2 & 128) != 0) {
                            jB = kvb.a.b(dVarF, 6);
                            i3 &= -29360129;
                        } else {
                            jB = j3;
                        }
                        if ((i2 & 256) != 0) {
                            jE = kvb.a.e(dVarF, 6);
                            i3 &= -234881025;
                        } else {
                            jE = j4;
                        }
                    } else {
                        if (i12 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i2 & 16) != 0) {
                            xkbVarF = kvb.a.f(dVarF, 6);
                            i3 &= -57345;
                        } else {
                            xkbVarF = xkbVar2;
                        }
                        if ((i2 & 32) != 0) {
                            jC = kvb.a.c(dVarF, 6);
                            i3 &= -458753;
                        } else {
                            jC = j5;
                        }
                        if ((i2 & 64) != 0) {
                            jD = kvb.a.d(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            jD = j2;
                        }
                        if ((i2 & 128) != 0) {
                            jB = kvb.a.b(dVarF, 6);
                            i3 &= -29360129;
                        } else {
                            jB = j3;
                        }
                        if ((i2 & 256) != 0) {
                            jE = kvb.a.e(dVarF, 6);
                            i3 &= -234881025;
                        } else {
                            jE = j4;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-1218779924, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
                    }
                    androidx.compose.ui.b bVar9 = bVar3;
                    int i111 = i3 >> 9;
                    afc.c(bVar9, xkbVarF, jC, jD, 0.0f, wvb.a.d(), null, ko1.e(-1343524879, true, new b(z5, function5, function4, function9, jB, jE), dVarF, 54), dVarF, (i3 & 14) | 12779520 | (i111 & 112) | (i111 & 896) | (i111 & 7168), 80);
                    bVar2 = bVar9;
                    dVar2 = dVarF;
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    xkbVar3 = xkbVarF;
                    function7 = function5;
                    j6 = jC;
                    j7 = jD;
                    j8 = jB;
                    z4 = z5;
                    j9 = jE;
                    function8 = function9;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar2 = bVar;
                    function7 = function5;
                    function8 = function6;
                    z4 = z2;
                    xkbVar3 = xkbVar2;
                    j6 = j5;
                    j7 = j2;
                    j8 = j3;
                    j9 = j4;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.pvb
                        public final Object invoke(Object obj, Object obj2) {
                            return tvb.k(bVar2, function7, function8, z4, xkbVar3, j6, j7, j8, j9, function4, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 3072;
            z2 = z;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    xkbVar2 = xkbVar;
                    if (dVarF.x(xkbVar2)) {
                    }
                    i3 |= i14;
                } else {
                    xkbVar2 = xkbVar;
                }
                i3 |= i14;
            } else {
                xkbVar2 = xkbVar;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    j5 = j;
                    if (dVarF.D(j5)) {
                    }
                    i3 |= i15;
                } else {
                    j5 = j;
                }
                i3 |= i15;
            } else {
                j5 = j;
            }
            if ((i & 1572864) != 0) {
                if ((i2 & 64) == 0) {
                    i11 = 524288;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            if ((i & 12582912) != 0) {
                if ((i2 & 128) == 0) {
                    i10 = 4194304;
                } else {
                    i10 = 4194304;
                }
                i3 |= i10;
            }
            if ((100663296 & i) != 0) {
                if ((i2 & 256) == 0) {
                    i9 = 33554432;
                } else {
                    i9 = 33554432;
                }
                i3 |= i9;
            }
            if ((i2 & 512) != 0) {
                if ((i & 805306368) == 0) {
                    if (dVarF.T(function4)) {
                        i8 = 536870912;
                    } else {
                        i8 = 268435456;
                    }
                    i3 |= i8;
                }
                if ((i3 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i2 & 16) != 0) {
                            xkbVarF = kvb.a.f(dVarF, 6);
                            i3 &= -57345;
                        } else {
                            xkbVarF = xkbVar2;
                        }
                        if ((i2 & 32) != 0) {
                            jC = kvb.a.c(dVarF, 6);
                            i3 &= -458753;
                        } else {
                            jC = j5;
                        }
                        if ((i2 & 64) != 0) {
                            jD = kvb.a.d(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            jD = j2;
                        }
                        if ((i2 & 128) != 0) {
                            jB = kvb.a.b(dVarF, 6);
                            i3 &= -29360129;
                        } else {
                            jB = j3;
                        }
                        if ((i2 & 256) != 0) {
                            jE = kvb.a.e(dVarF, 6);
                            i3 &= -234881025;
                        } else {
                            jE = j4;
                        }
                    } else {
                        if (i12 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i2 & 16) != 0) {
                            xkbVarF = kvb.a.f(dVarF, 6);
                            i3 &= -57345;
                        } else {
                            xkbVarF = xkbVar2;
                        }
                        if ((i2 & 32) != 0) {
                            jC = kvb.a.c(dVarF, 6);
                            i3 &= -458753;
                        } else {
                            jC = j5;
                        }
                        if ((i2 & 64) != 0) {
                            jD = kvb.a.d(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            jD = j2;
                        }
                        if ((i2 & 128) != 0) {
                            jB = kvb.a.b(dVarF, 6);
                            i3 &= -29360129;
                        } else {
                            jB = j3;
                        }
                        if ((i2 & 256) != 0) {
                            jE = kvb.a.e(dVarF, 6);
                            i3 &= -234881025;
                        } else {
                            jE = j4;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-1218779924, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
                    }
                    androidx.compose.ui.b bVar10 = bVar3;
                    int i112 = i3 >> 9;
                    afc.c(bVar10, xkbVarF, jC, jD, 0.0f, wvb.a.d(), null, ko1.e(-1343524879, true, new b(z5, function5, function4, function9, jB, jE), dVarF, 54), dVarF, (i3 & 14) | 12779520 | (i112 & 112) | (i112 & 896) | (i112 & 7168), 80);
                    bVar2 = bVar10;
                    dVar2 = dVarF;
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    xkbVar3 = xkbVarF;
                    function7 = function5;
                    j6 = jC;
                    j7 = jD;
                    j8 = jB;
                    z4 = z5;
                    j9 = jE;
                    function8 = function9;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar2 = bVar;
                    function7 = function5;
                    function8 = function6;
                    z4 = z2;
                    xkbVar3 = xkbVar2;
                    j6 = j5;
                    j7 = j2;
                    j8 = j3;
                    j9 = j4;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.pvb
                        public final Object invoke(Object obj, Object obj2) {
                            return tvb.k(bVar2, function7, function8, z4, xkbVar3, j6, j7, j8, j9, function4, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 805306368;
            if ((i3 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i4 == 0) {
                    }
                    if (i6 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i2 & 16) != 0) {
                        xkbVarF = kvb.a.f(dVarF, 6);
                        i3 &= -57345;
                    } else {
                        xkbVarF = xkbVar2;
                    }
                    if ((i2 & 32) != 0) {
                        jC = kvb.a.c(dVarF, 6);
                        i3 &= -458753;
                    } else {
                        jC = j5;
                    }
                    if ((i2 & 64) != 0) {
                        jD = kvb.a.d(dVarF, 6);
                        i3 &= -3670017;
                    } else {
                        jD = j2;
                    }
                    if ((i2 & 128) != 0) {
                        jB = kvb.a.b(dVarF, 6);
                        i3 &= -29360129;
                    } else {
                        jB = j3;
                    }
                    if ((i2 & 256) != 0) {
                        jE = kvb.a.e(dVarF, 6);
                        i3 &= -234881025;
                    } else {
                        jE = j4;
                    }
                } else {
                    if (i12 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i4 == 0) {
                    }
                    if (i6 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i2 & 16) != 0) {
                        xkbVarF = kvb.a.f(dVarF, 6);
                        i3 &= -57345;
                    } else {
                        xkbVarF = xkbVar2;
                    }
                    if ((i2 & 32) != 0) {
                        jC = kvb.a.c(dVarF, 6);
                        i3 &= -458753;
                    } else {
                        jC = j5;
                    }
                    if ((i2 & 64) != 0) {
                        jD = kvb.a.d(dVarF, 6);
                        i3 &= -3670017;
                    } else {
                        jD = j2;
                    }
                    if ((i2 & 128) != 0) {
                        jB = kvb.a.b(dVarF, 6);
                        i3 &= -29360129;
                    } else {
                        jB = j3;
                    }
                    if ((i2 & 256) != 0) {
                        jE = kvb.a.e(dVarF, 6);
                        i3 &= -234881025;
                    } else {
                        jE = j4;
                    }
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-1218779924, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
                }
                androidx.compose.ui.b bVar11 = bVar3;
                int i113 = i3 >> 9;
                afc.c(bVar11, xkbVarF, jC, jD, 0.0f, wvb.a.d(), null, ko1.e(-1343524879, true, new b(z5, function5, function4, function9, jB, jE), dVarF, 54), dVarF, (i3 & 14) | 12779520 | (i113 & 112) | (i113 & 896) | (i113 & 7168), 80);
                bVar2 = bVar11;
                dVar2 = dVarF;
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                xkbVar3 = xkbVarF;
                function7 = function5;
                j6 = jC;
                j7 = jD;
                j8 = jB;
                z4 = z5;
                j9 = jE;
                function8 = function9;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar2 = bVar;
                function7 = function5;
                function8 = function6;
                z4 = z2;
                xkbVar3 = xkbVar2;
                j6 = j5;
                j7 = j2;
                j8 = j3;
                j9 = j4;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.pvb
                    public final Object invoke(Object obj, Object obj2) {
                        return tvb.k(bVar2, function7, function8, z4, xkbVar3, j6, j7, j8, j9, function4, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 48;
        function5 = function2;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                function6 = function3;
                if (dVarF.T(function6)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    if (dVarF.A(z2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        xkbVar2 = xkbVar;
                        if (dVarF.x(xkbVar2)) {
                        }
                        i3 |= i14;
                    } else {
                        xkbVar2 = xkbVar;
                    }
                    i3 |= i14;
                } else {
                    xkbVar2 = xkbVar;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        j5 = j;
                        if (dVarF.D(j5)) {
                        }
                        i3 |= i15;
                    } else {
                        j5 = j;
                    }
                    i3 |= i15;
                } else {
                    j5 = j;
                }
                if ((i & 1572864) != 0) {
                    if ((i2 & 64) == 0) {
                        i11 = 524288;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                if ((i & 12582912) != 0) {
                    if ((i2 & 128) == 0) {
                        i10 = 4194304;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
                if ((100663296 & i) != 0) {
                    if ((i2 & 256) == 0) {
                        i9 = 33554432;
                    } else {
                        i9 = 33554432;
                    }
                    i3 |= i9;
                }
                if ((i2 & 512) != 0) {
                    if ((i & 805306368) == 0) {
                        if (dVarF.T(function4)) {
                            i8 = 536870912;
                        } else {
                            i8 = 268435456;
                        }
                        i3 |= i8;
                    }
                    if ((i3 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i3 & 1)) {
                        dVarF.U();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i4 == 0) {
                            }
                            if (i6 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            if ((i2 & 16) != 0) {
                                xkbVarF = kvb.a.f(dVarF, 6);
                                i3 &= -57345;
                            } else {
                                xkbVarF = xkbVar2;
                            }
                            if ((i2 & 32) != 0) {
                                jC = kvb.a.c(dVarF, 6);
                                i3 &= -458753;
                            } else {
                                jC = j5;
                            }
                            if ((i2 & 64) != 0) {
                                jD = kvb.a.d(dVarF, 6);
                                i3 &= -3670017;
                            } else {
                                jD = j2;
                            }
                            if ((i2 & 128) != 0) {
                                jB = kvb.a.b(dVarF, 6);
                                i3 &= -29360129;
                            } else {
                                jB = j3;
                            }
                            if ((i2 & 256) != 0) {
                                jE = kvb.a.e(dVarF, 6);
                                i3 &= -234881025;
                            } else {
                                jE = j4;
                            }
                        } else {
                            if (i12 != 0) {
                                bVar3 = androidx.compose.ui.b.INSTANCE;
                            } else {
                                bVar3 = bVar;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i4 == 0) {
                            }
                            if (i6 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            if ((i2 & 16) != 0) {
                                xkbVarF = kvb.a.f(dVarF, 6);
                                i3 &= -57345;
                            } else {
                                xkbVarF = xkbVar2;
                            }
                            if ((i2 & 32) != 0) {
                                jC = kvb.a.c(dVarF, 6);
                                i3 &= -458753;
                            } else {
                                jC = j5;
                            }
                            if ((i2 & 64) != 0) {
                                jD = kvb.a.d(dVarF, 6);
                                i3 &= -3670017;
                            } else {
                                jD = j2;
                            }
                            if ((i2 & 128) != 0) {
                                jB = kvb.a.b(dVarF, 6);
                                i3 &= -29360129;
                            } else {
                                jB = j3;
                            }
                            if ((i2 & 256) != 0) {
                                jE = kvb.a.e(dVarF, 6);
                                i3 &= -234881025;
                            } else {
                                jE = j4;
                            }
                        }
                        dVarF.M();
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-1218779924, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
                        }
                        androidx.compose.ui.b bVar12 = bVar3;
                        int i114 = i3 >> 9;
                        afc.c(bVar12, xkbVarF, jC, jD, 0.0f, wvb.a.d(), null, ko1.e(-1343524879, true, new b(z5, function5, function4, function9, jB, jE), dVarF, 54), dVarF, (i3 & 14) | 12779520 | (i114 & 112) | (i114 & 896) | (i114 & 7168), 80);
                        bVar2 = bVar12;
                        dVar2 = dVarF;
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        xkbVar3 = xkbVarF;
                        function7 = function5;
                        j6 = jC;
                        j7 = jD;
                        j8 = jB;
                        z4 = z5;
                        j9 = jE;
                        function8 = function9;
                    } else {
                        dVar2 = dVarF;
                        dVar2.q();
                        bVar2 = bVar;
                        function7 = function5;
                        function8 = function6;
                        z4 = z2;
                        xkbVar3 = xkbVar2;
                        j6 = j5;
                        j7 = j2;
                        j8 = j3;
                        j9 = j4;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.pvb
                            public final Object invoke(Object obj, Object obj2) {
                                return tvb.k(bVar2, function7, function8, z4, xkbVar3, j6, j7, j8, j9, function4, i, i2, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 805306368;
                if ((i3 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i2 & 16) != 0) {
                            xkbVarF = kvb.a.f(dVarF, 6);
                            i3 &= -57345;
                        } else {
                            xkbVarF = xkbVar2;
                        }
                        if ((i2 & 32) != 0) {
                            jC = kvb.a.c(dVarF, 6);
                            i3 &= -458753;
                        } else {
                            jC = j5;
                        }
                        if ((i2 & 64) != 0) {
                            jD = kvb.a.d(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            jD = j2;
                        }
                        if ((i2 & 128) != 0) {
                            jB = kvb.a.b(dVarF, 6);
                            i3 &= -29360129;
                        } else {
                            jB = j3;
                        }
                        if ((i2 & 256) != 0) {
                            jE = kvb.a.e(dVarF, 6);
                            i3 &= -234881025;
                        } else {
                            jE = j4;
                        }
                    } else {
                        if (i12 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i2 & 16) != 0) {
                            xkbVarF = kvb.a.f(dVarF, 6);
                            i3 &= -57345;
                        } else {
                            xkbVarF = xkbVar2;
                        }
                        if ((i2 & 32) != 0) {
                            jC = kvb.a.c(dVarF, 6);
                            i3 &= -458753;
                        } else {
                            jC = j5;
                        }
                        if ((i2 & 64) != 0) {
                            jD = kvb.a.d(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            jD = j2;
                        }
                        if ((i2 & 128) != 0) {
                            jB = kvb.a.b(dVarF, 6);
                            i3 &= -29360129;
                        } else {
                            jB = j3;
                        }
                        if ((i2 & 256) != 0) {
                            jE = kvb.a.e(dVarF, 6);
                            i3 &= -234881025;
                        } else {
                            jE = j4;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-1218779924, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
                    }
                    androidx.compose.ui.b bVar13 = bVar3;
                    int i115 = i3 >> 9;
                    afc.c(bVar13, xkbVarF, jC, jD, 0.0f, wvb.a.d(), null, ko1.e(-1343524879, true, new b(z5, function5, function4, function9, jB, jE), dVarF, 54), dVarF, (i3 & 14) | 12779520 | (i115 & 112) | (i115 & 896) | (i115 & 7168), 80);
                    bVar2 = bVar13;
                    dVar2 = dVarF;
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    xkbVar3 = xkbVarF;
                    function7 = function5;
                    j6 = jC;
                    j7 = jD;
                    j8 = jB;
                    z4 = z5;
                    j9 = jE;
                    function8 = function9;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar2 = bVar;
                    function7 = function5;
                    function8 = function6;
                    z4 = z2;
                    xkbVar3 = xkbVar2;
                    j6 = j5;
                    j7 = j2;
                    j8 = j3;
                    j9 = j4;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.pvb
                        public final Object invoke(Object obj, Object obj2) {
                            return tvb.k(bVar2, function7, function8, z4, xkbVar3, j6, j7, j8, j9, function4, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 3072;
            z2 = z;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    xkbVar2 = xkbVar;
                    if (dVarF.x(xkbVar2)) {
                    }
                    i3 |= i14;
                } else {
                    xkbVar2 = xkbVar;
                }
                i3 |= i14;
            } else {
                xkbVar2 = xkbVar;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    j5 = j;
                    if (dVarF.D(j5)) {
                    }
                    i3 |= i15;
                } else {
                    j5 = j;
                }
                i3 |= i15;
            } else {
                j5 = j;
            }
            if ((i & 1572864) != 0) {
                if ((i2 & 64) == 0) {
                    i11 = 524288;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            if ((i & 12582912) != 0) {
                if ((i2 & 128) == 0) {
                    i10 = 4194304;
                } else {
                    i10 = 4194304;
                }
                i3 |= i10;
            }
            if ((100663296 & i) != 0) {
                if ((i2 & 256) == 0) {
                    i9 = 33554432;
                } else {
                    i9 = 33554432;
                }
                i3 |= i9;
            }
            if ((i2 & 512) != 0) {
                if ((i & 805306368) == 0) {
                    if (dVarF.T(function4)) {
                        i8 = 536870912;
                    } else {
                        i8 = 268435456;
                    }
                    i3 |= i8;
                }
                if ((i3 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i2 & 16) != 0) {
                            xkbVarF = kvb.a.f(dVarF, 6);
                            i3 &= -57345;
                        } else {
                            xkbVarF = xkbVar2;
                        }
                        if ((i2 & 32) != 0) {
                            jC = kvb.a.c(dVarF, 6);
                            i3 &= -458753;
                        } else {
                            jC = j5;
                        }
                        if ((i2 & 64) != 0) {
                            jD = kvb.a.d(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            jD = j2;
                        }
                        if ((i2 & 128) != 0) {
                            jB = kvb.a.b(dVarF, 6);
                            i3 &= -29360129;
                        } else {
                            jB = j3;
                        }
                        if ((i2 & 256) != 0) {
                            jE = kvb.a.e(dVarF, 6);
                            i3 &= -234881025;
                        } else {
                            jE = j4;
                        }
                    } else {
                        if (i12 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i2 & 16) != 0) {
                            xkbVarF = kvb.a.f(dVarF, 6);
                            i3 &= -57345;
                        } else {
                            xkbVarF = xkbVar2;
                        }
                        if ((i2 & 32) != 0) {
                            jC = kvb.a.c(dVarF, 6);
                            i3 &= -458753;
                        } else {
                            jC = j5;
                        }
                        if ((i2 & 64) != 0) {
                            jD = kvb.a.d(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            jD = j2;
                        }
                        if ((i2 & 128) != 0) {
                            jB = kvb.a.b(dVarF, 6);
                            i3 &= -29360129;
                        } else {
                            jB = j3;
                        }
                        if ((i2 & 256) != 0) {
                            jE = kvb.a.e(dVarF, 6);
                            i3 &= -234881025;
                        } else {
                            jE = j4;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-1218779924, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
                    }
                    androidx.compose.ui.b bVar14 = bVar3;
                    int i116 = i3 >> 9;
                    afc.c(bVar14, xkbVarF, jC, jD, 0.0f, wvb.a.d(), null, ko1.e(-1343524879, true, new b(z5, function5, function4, function9, jB, jE), dVarF, 54), dVarF, (i3 & 14) | 12779520 | (i116 & 112) | (i116 & 896) | (i116 & 7168), 80);
                    bVar2 = bVar14;
                    dVar2 = dVarF;
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    xkbVar3 = xkbVarF;
                    function7 = function5;
                    j6 = jC;
                    j7 = jD;
                    j8 = jB;
                    z4 = z5;
                    j9 = jE;
                    function8 = function9;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar2 = bVar;
                    function7 = function5;
                    function8 = function6;
                    z4 = z2;
                    xkbVar3 = xkbVar2;
                    j6 = j5;
                    j7 = j2;
                    j8 = j3;
                    j9 = j4;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.pvb
                        public final Object invoke(Object obj, Object obj2) {
                            return tvb.k(bVar2, function7, function8, z4, xkbVar3, j6, j7, j8, j9, function4, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 805306368;
            if ((i3 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i4 == 0) {
                    }
                    if (i6 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i2 & 16) != 0) {
                        xkbVarF = kvb.a.f(dVarF, 6);
                        i3 &= -57345;
                    } else {
                        xkbVarF = xkbVar2;
                    }
                    if ((i2 & 32) != 0) {
                        jC = kvb.a.c(dVarF, 6);
                        i3 &= -458753;
                    } else {
                        jC = j5;
                    }
                    if ((i2 & 64) != 0) {
                        jD = kvb.a.d(dVarF, 6);
                        i3 &= -3670017;
                    } else {
                        jD = j2;
                    }
                    if ((i2 & 128) != 0) {
                        jB = kvb.a.b(dVarF, 6);
                        i3 &= -29360129;
                    } else {
                        jB = j3;
                    }
                    if ((i2 & 256) != 0) {
                        jE = kvb.a.e(dVarF, 6);
                        i3 &= -234881025;
                    } else {
                        jE = j4;
                    }
                } else {
                    if (i12 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i4 == 0) {
                    }
                    if (i6 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i2 & 16) != 0) {
                        xkbVarF = kvb.a.f(dVarF, 6);
                        i3 &= -57345;
                    } else {
                        xkbVarF = xkbVar2;
                    }
                    if ((i2 & 32) != 0) {
                        jC = kvb.a.c(dVarF, 6);
                        i3 &= -458753;
                    } else {
                        jC = j5;
                    }
                    if ((i2 & 64) != 0) {
                        jD = kvb.a.d(dVarF, 6);
                        i3 &= -3670017;
                    } else {
                        jD = j2;
                    }
                    if ((i2 & 128) != 0) {
                        jB = kvb.a.b(dVarF, 6);
                        i3 &= -29360129;
                    } else {
                        jB = j3;
                    }
                    if ((i2 & 256) != 0) {
                        jE = kvb.a.e(dVarF, 6);
                        i3 &= -234881025;
                    } else {
                        jE = j4;
                    }
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-1218779924, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
                }
                androidx.compose.ui.b bVar15 = bVar3;
                int i117 = i3 >> 9;
                afc.c(bVar15, xkbVarF, jC, jD, 0.0f, wvb.a.d(), null, ko1.e(-1343524879, true, new b(z5, function5, function4, function9, jB, jE), dVarF, 54), dVarF, (i3 & 14) | 12779520 | (i117 & 112) | (i117 & 896) | (i117 & 7168), 80);
                bVar2 = bVar15;
                dVar2 = dVarF;
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                xkbVar3 = xkbVarF;
                function7 = function5;
                j6 = jC;
                j7 = jD;
                j8 = jB;
                z4 = z5;
                j9 = jE;
                function8 = function9;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar2 = bVar;
                function7 = function5;
                function8 = function6;
                z4 = z2;
                xkbVar3 = xkbVar2;
                j6 = j5;
                j7 = j2;
                j8 = j3;
                j9 = j4;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.pvb
                    public final Object invoke(Object obj, Object obj2) {
                        return tvb.k(bVar2, function7, function8, z4, xkbVar3, j6, j7, j8, j9, function4, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        function6 = function3;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                if (dVarF.A(z2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    xkbVar2 = xkbVar;
                    if (dVarF.x(xkbVar2)) {
                    }
                    i3 |= i14;
                } else {
                    xkbVar2 = xkbVar;
                }
                i3 |= i14;
            } else {
                xkbVar2 = xkbVar;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    j5 = j;
                    if (dVarF.D(j5)) {
                    }
                    i3 |= i15;
                } else {
                    j5 = j;
                }
                i3 |= i15;
            } else {
                j5 = j;
            }
            if ((i & 1572864) != 0) {
                if ((i2 & 64) == 0) {
                    i11 = 524288;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            if ((i & 12582912) != 0) {
                if ((i2 & 128) == 0) {
                    i10 = 4194304;
                } else {
                    i10 = 4194304;
                }
                i3 |= i10;
            }
            if ((100663296 & i) != 0) {
                if ((i2 & 256) == 0) {
                    i9 = 33554432;
                } else {
                    i9 = 33554432;
                }
                i3 |= i9;
            }
            if ((i2 & 512) != 0) {
                if ((i & 805306368) == 0) {
                    if (dVarF.T(function4)) {
                        i8 = 536870912;
                    } else {
                        i8 = 268435456;
                    }
                    i3 |= i8;
                }
                if ((i3 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i3 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i2 & 16) != 0) {
                            xkbVarF = kvb.a.f(dVarF, 6);
                            i3 &= -57345;
                        } else {
                            xkbVarF = xkbVar2;
                        }
                        if ((i2 & 32) != 0) {
                            jC = kvb.a.c(dVarF, 6);
                            i3 &= -458753;
                        } else {
                            jC = j5;
                        }
                        if ((i2 & 64) != 0) {
                            jD = kvb.a.d(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            jD = j2;
                        }
                        if ((i2 & 128) != 0) {
                            jB = kvb.a.b(dVarF, 6);
                            i3 &= -29360129;
                        } else {
                            jB = j3;
                        }
                        if ((i2 & 256) != 0) {
                            jE = kvb.a.e(dVarF, 6);
                            i3 &= -234881025;
                        } else {
                            jE = j4;
                        }
                    } else {
                        if (i12 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i2 & 16) != 0) {
                            xkbVarF = kvb.a.f(dVarF, 6);
                            i3 &= -57345;
                        } else {
                            xkbVarF = xkbVar2;
                        }
                        if ((i2 & 32) != 0) {
                            jC = kvb.a.c(dVarF, 6);
                            i3 &= -458753;
                        } else {
                            jC = j5;
                        }
                        if ((i2 & 64) != 0) {
                            jD = kvb.a.d(dVarF, 6);
                            i3 &= -3670017;
                        } else {
                            jD = j2;
                        }
                        if ((i2 & 128) != 0) {
                            jB = kvb.a.b(dVarF, 6);
                            i3 &= -29360129;
                        } else {
                            jB = j3;
                        }
                        if ((i2 & 256) != 0) {
                            jE = kvb.a.e(dVarF, 6);
                            i3 &= -234881025;
                        } else {
                            jE = j4;
                        }
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-1218779924, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
                    }
                    androidx.compose.ui.b bVar16 = bVar3;
                    int i118 = i3 >> 9;
                    afc.c(bVar16, xkbVarF, jC, jD, 0.0f, wvb.a.d(), null, ko1.e(-1343524879, true, new b(z5, function5, function4, function9, jB, jE), dVarF, 54), dVarF, (i3 & 14) | 12779520 | (i118 & 112) | (i118 & 896) | (i118 & 7168), 80);
                    bVar2 = bVar16;
                    dVar2 = dVarF;
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    xkbVar3 = xkbVarF;
                    function7 = function5;
                    j6 = jC;
                    j7 = jD;
                    j8 = jB;
                    z4 = z5;
                    j9 = jE;
                    function8 = function9;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar2 = bVar;
                    function7 = function5;
                    function8 = function6;
                    z4 = z2;
                    xkbVar3 = xkbVar2;
                    j6 = j5;
                    j7 = j2;
                    j8 = j3;
                    j9 = j4;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.pvb
                        public final Object invoke(Object obj, Object obj2) {
                            return tvb.k(bVar2, function7, function8, z4, xkbVar3, j6, j7, j8, j9, function4, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 805306368;
            if ((i3 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i4 == 0) {
                    }
                    if (i6 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i2 & 16) != 0) {
                        xkbVarF = kvb.a.f(dVarF, 6);
                        i3 &= -57345;
                    } else {
                        xkbVarF = xkbVar2;
                    }
                    if ((i2 & 32) != 0) {
                        jC = kvb.a.c(dVarF, 6);
                        i3 &= -458753;
                    } else {
                        jC = j5;
                    }
                    if ((i2 & 64) != 0) {
                        jD = kvb.a.d(dVarF, 6);
                        i3 &= -3670017;
                    } else {
                        jD = j2;
                    }
                    if ((i2 & 128) != 0) {
                        jB = kvb.a.b(dVarF, 6);
                        i3 &= -29360129;
                    } else {
                        jB = j3;
                    }
                    if ((i2 & 256) != 0) {
                        jE = kvb.a.e(dVarF, 6);
                        i3 &= -234881025;
                    } else {
                        jE = j4;
                    }
                } else {
                    if (i12 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i4 == 0) {
                    }
                    if (i6 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i2 & 16) != 0) {
                        xkbVarF = kvb.a.f(dVarF, 6);
                        i3 &= -57345;
                    } else {
                        xkbVarF = xkbVar2;
                    }
                    if ((i2 & 32) != 0) {
                        jC = kvb.a.c(dVarF, 6);
                        i3 &= -458753;
                    } else {
                        jC = j5;
                    }
                    if ((i2 & 64) != 0) {
                        jD = kvb.a.d(dVarF, 6);
                        i3 &= -3670017;
                    } else {
                        jD = j2;
                    }
                    if ((i2 & 128) != 0) {
                        jB = kvb.a.b(dVarF, 6);
                        i3 &= -29360129;
                    } else {
                        jB = j3;
                    }
                    if ((i2 & 256) != 0) {
                        jE = kvb.a.e(dVarF, 6);
                        i3 &= -234881025;
                    } else {
                        jE = j4;
                    }
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-1218779924, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
                }
                androidx.compose.ui.b bVar17 = bVar3;
                int i119 = i3 >> 9;
                afc.c(bVar17, xkbVarF, jC, jD, 0.0f, wvb.a.d(), null, ko1.e(-1343524879, true, new b(z5, function5, function4, function9, jB, jE), dVarF, 54), dVarF, (i3 & 14) | 12779520 | (i119 & 112) | (i119 & 896) | (i119 & 7168), 80);
                bVar2 = bVar17;
                dVar2 = dVarF;
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                xkbVar3 = xkbVarF;
                function7 = function5;
                j6 = jC;
                j7 = jD;
                j8 = jB;
                z4 = z5;
                j9 = jE;
                function8 = function9;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar2 = bVar;
                function7 = function5;
                function8 = function6;
                z4 = z2;
                xkbVar3 = xkbVar2;
                j6 = j5;
                j7 = j2;
                j8 = j3;
                j9 = j4;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.pvb
                    public final Object invoke(Object obj, Object obj2) {
                        return tvb.k(bVar2, function7, function8, z4, xkbVar3, j6, j7, j8, j9, function4, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                xkbVar2 = xkbVar;
                if (dVarF.x(xkbVar2)) {
                }
                i3 |= i14;
            } else {
                xkbVar2 = xkbVar;
            }
            i3 |= i14;
        } else {
            xkbVar2 = xkbVar;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                j5 = j;
                if (dVarF.D(j5)) {
                }
                i3 |= i15;
            } else {
                j5 = j;
            }
            i3 |= i15;
        } else {
            j5 = j;
        }
        if ((i & 1572864) != 0) {
            if ((i2 & 64) == 0) {
                i11 = 524288;
            } else {
                i11 = 524288;
            }
            i3 |= i11;
        }
        if ((i & 12582912) != 0) {
            if ((i2 & 128) == 0) {
                i10 = 4194304;
            } else {
                i10 = 4194304;
            }
            i3 |= i10;
        }
        if ((100663296 & i) != 0) {
            if ((i2 & 256) == 0) {
                i9 = 33554432;
            } else {
                i9 = 33554432;
            }
            i3 |= i9;
        }
        if ((i2 & 512) != 0) {
            if ((i & 805306368) == 0) {
                if (dVarF.T(function4)) {
                    i8 = 536870912;
                } else {
                    i8 = 268435456;
                }
                i3 |= i8;
            }
            if ((i3 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i3 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i4 == 0) {
                    }
                    if (i6 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i2 & 16) != 0) {
                        xkbVarF = kvb.a.f(dVarF, 6);
                        i3 &= -57345;
                    } else {
                        xkbVarF = xkbVar2;
                    }
                    if ((i2 & 32) != 0) {
                        jC = kvb.a.c(dVarF, 6);
                        i3 &= -458753;
                    } else {
                        jC = j5;
                    }
                    if ((i2 & 64) != 0) {
                        jD = kvb.a.d(dVarF, 6);
                        i3 &= -3670017;
                    } else {
                        jD = j2;
                    }
                    if ((i2 & 128) != 0) {
                        jB = kvb.a.b(dVarF, 6);
                        i3 &= -29360129;
                    } else {
                        jB = j3;
                    }
                    if ((i2 & 256) != 0) {
                        jE = kvb.a.e(dVarF, 6);
                        i3 &= -234881025;
                    } else {
                        jE = j4;
                    }
                } else {
                    if (i12 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i4 == 0) {
                    }
                    if (i6 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i2 & 16) != 0) {
                        xkbVarF = kvb.a.f(dVarF, 6);
                        i3 &= -57345;
                    } else {
                        xkbVarF = xkbVar2;
                    }
                    if ((i2 & 32) != 0) {
                        jC = kvb.a.c(dVarF, 6);
                        i3 &= -458753;
                    } else {
                        jC = j5;
                    }
                    if ((i2 & 64) != 0) {
                        jD = kvb.a.d(dVarF, 6);
                        i3 &= -3670017;
                    } else {
                        jD = j2;
                    }
                    if ((i2 & 128) != 0) {
                        jB = kvb.a.b(dVarF, 6);
                        i3 &= -29360129;
                    } else {
                        jB = j3;
                    }
                    if ((i2 & 256) != 0) {
                        jE = kvb.a.e(dVarF, 6);
                        i3 &= -234881025;
                    } else {
                        jE = j4;
                    }
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-1218779924, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
                }
                androidx.compose.ui.b bVar18 = bVar3;
                int i1110 = i3 >> 9;
                afc.c(bVar18, xkbVarF, jC, jD, 0.0f, wvb.a.d(), null, ko1.e(-1343524879, true, new b(z5, function5, function4, function9, jB, jE), dVarF, 54), dVarF, (i3 & 14) | 12779520 | (i1110 & 112) | (i1110 & 896) | (i1110 & 7168), 80);
                bVar2 = bVar18;
                dVar2 = dVarF;
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                xkbVar3 = xkbVarF;
                function7 = function5;
                j6 = jC;
                j7 = jD;
                j8 = jB;
                z4 = z5;
                j9 = jE;
                function8 = function9;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar2 = bVar;
                function7 = function5;
                function8 = function6;
                z4 = z2;
                xkbVar3 = xkbVar2;
                j6 = j5;
                j7 = j2;
                j8 = j3;
                j9 = j4;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.pvb
                    public final Object invoke(Object obj, Object obj2) {
                        return tvb.k(bVar2, function7, function8, z4, xkbVar3, j6, j7, j8, j9, function4, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 805306368;
        if ((i3 & 306783379) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (dVarF.g(z3, i3 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    bVar3 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar3 = bVar;
                }
                if (i13 != 0) {
                    function5 = null;
                }
                if (i4 == 0) {
                }
                if (i6 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if ((i2 & 16) != 0) {
                    xkbVarF = kvb.a.f(dVarF, 6);
                    i3 &= -57345;
                } else {
                    xkbVarF = xkbVar2;
                }
                if ((i2 & 32) != 0) {
                    jC = kvb.a.c(dVarF, 6);
                    i3 &= -458753;
                } else {
                    jC = j5;
                }
                if ((i2 & 64) != 0) {
                    jD = kvb.a.d(dVarF, 6);
                    i3 &= -3670017;
                } else {
                    jD = j2;
                }
                if ((i2 & 128) != 0) {
                    jB = kvb.a.b(dVarF, 6);
                    i3 &= -29360129;
                } else {
                    jB = j3;
                }
                if ((i2 & 256) != 0) {
                    jE = kvb.a.e(dVarF, 6);
                    i3 &= -234881025;
                } else {
                    jE = j4;
                }
            } else {
                if (i12 != 0) {
                    bVar3 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar3 = bVar;
                }
                if (i13 != 0) {
                    function5 = null;
                }
                if (i4 == 0) {
                }
                if (i6 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if ((i2 & 16) != 0) {
                    xkbVarF = kvb.a.f(dVarF, 6);
                    i3 &= -57345;
                } else {
                    xkbVarF = xkbVar2;
                }
                if ((i2 & 32) != 0) {
                    jC = kvb.a.c(dVarF, 6);
                    i3 &= -458753;
                } else {
                    jC = j5;
                }
                if ((i2 & 64) != 0) {
                    jD = kvb.a.d(dVarF, 6);
                    i3 &= -3670017;
                } else {
                    jD = j2;
                }
                if ((i2 & 128) != 0) {
                    jB = kvb.a.b(dVarF, 6);
                    i3 &= -29360129;
                } else {
                    jB = j3;
                }
                if ((i2 & 256) != 0) {
                    jE = kvb.a.e(dVarF, 6);
                    i3 &= -234881025;
                } else {
                    jE = j4;
                }
            }
            dVarF.M();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1218779924, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
            }
            androidx.compose.ui.b bVar19 = bVar3;
            int i1111 = i3 >> 9;
            afc.c(bVar19, xkbVarF, jC, jD, 0.0f, wvb.a.d(), null, ko1.e(-1343524879, true, new b(z5, function5, function4, function9, jB, jE), dVarF, 54), dVarF, (i3 & 14) | 12779520 | (i1111 & 112) | (i1111 & 896) | (i1111 & 7168), 80);
            bVar2 = bVar19;
            dVar2 = dVarF;
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            xkbVar3 = xkbVarF;
            function7 = function5;
            j6 = jC;
            j7 = jD;
            j8 = jB;
            z4 = z5;
            j9 = jE;
            function8 = function9;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            bVar2 = bVar;
            function7 = function5;
            function8 = function6;
            z4 = z2;
            xkbVar3 = xkbVar2;
            j6 = j5;
            j7 = j2;
            j8 = j3;
            j9 = j4;
        }
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.pvb
                public final Object invoke(Object obj, Object obj2) {
                    return tvb.k(bVar2, function7, function8, z4, xkbVar3, j6, j7, j8, j9, function4, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0113  */
    /* JADX WARN: Code duplicated, block: B:102:0x0115  */
    /* JADX WARN: Code duplicated, block: B:105:0x011e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0134  */
    /* JADX WARN: Code duplicated, block: B:129:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x0174  */
    /* JADX WARN: Code duplicated, block: B:131:0x0177  */
    /* JADX WARN: Code duplicated, block: B:133:0x017a  */
    /* JADX WARN: Code duplicated, block: B:134:0x017d  */
    /* JADX WARN: Code duplicated, block: B:137:0x0184  */
    /* JADX WARN: Code duplicated, block: B:138:0x018d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0192  */
    /* JADX WARN: Code duplicated, block: B:142:0x019b  */
    /* JADX WARN: Code duplicated, block: B:145:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:146:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:150:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:153:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:154:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:157:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:165:0x020e  */
    /* JADX WARN: Code duplicated, block: B:166:0x0226  */
    /* JADX WARN: Code duplicated, block: B:169:0x023b  */
    /* JADX WARN: Code duplicated, block: B:171:0x0253  */
    /* JADX WARN: Code duplicated, block: B:174:0x029e  */
    /* JADX WARN: Code duplicated, block: B:176:0x02af  */
    /* JADX WARN: Code duplicated, block: B:179:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0090  */
    /* JADX WARN: Code duplicated, block: B:59:0x0097  */
    /* JADX WARN: Code duplicated, block: B:61:0x009b  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:81:0x00da  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:96:0x0103  */
    /* JADX WARN: Code duplicated, block: B:98:0x0107  */
    public static final void j(final jvb jvbVar, androidx.compose.ui.b bVar, boolean z, xkb xkbVar, long j, long j2, long j3, long j4, long j5, androidx.compose.p004runtime.d dVar, final int i, final int i2) {
        int i3;
        androidx.compose.ui.b bVar2;
        int i4;
        boolean z2;
        int i5;
        xkb xkbVar2;
        long j6;
        long j7;
        int i6;
        int i7;
        boolean z3;
        androidx.compose.p004runtime.d dVar2;
        final androidx.compose.ui.b bVar3;
        final boolean z4;
        final xkb xkbVar3;
        final long j8;
        final long j9;
        final long j10;
        final long j11;
        final long j12;
        s6b s6bVarH;
        boolean z5;
        xkb xkbVarF;
        long jC;
        long jD;
        long jA;
        long jB;
        long jE;
        boolean z6;
        String actionLabel;
        do1 do1VarE;
        do1 do1Var;
        int i8;
        int i9;
        int i10;
        androidx.compose.p004runtime.d dVarF = dVar.F(274621471);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.x(jvbVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 48) == 0) {
                bVar2 = bVar;
                i3 |= dVarF.x(bVar2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    if (dVarF.A(z2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        xkbVar2 = xkbVar;
                        int i12 = dVarF.x(xkbVar2) ? 2048 : 1024;
                        i3 |= i12;
                    } else {
                        xkbVar2 = xkbVar;
                    }
                    i3 |= i12;
                } else {
                    xkbVar2 = xkbVar;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        j6 = j;
                        int i13 = dVarF.D(j6) ? 16384 : 8192;
                        i3 |= i13;
                    } else {
                        j6 = j;
                    }
                    i3 |= i13;
                } else {
                    j6 = j;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        j7 = j2;
                        int i14 = dVarF.D(j7) ? 131072 : 65536;
                        i3 |= i14;
                    } else {
                        j7 = j2;
                    }
                    i3 |= i14;
                } else {
                    j7 = j2;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        i10 = i3;
                        i7 = i11;
                        int i15 = dVarF.D(j3) ? 1048576 : 524288;
                        i6 = i10 | i15;
                    } else {
                        i10 = i3;
                        i7 = i11;
                    }
                    i6 = i10 | i15;
                } else {
                    i6 = i3;
                    i7 = i11;
                }
                if ((i & 12582912) != 0) {
                    if ((i2 & 128) == 0 || !dVarF.D(j4)) {
                        i9 = 4194304;
                    } else {
                        i9 = 8388608;
                    }
                    i6 |= i9;
                }
                if ((100663296 & i) != 0) {
                    if ((i2 & 256) == 0 || !dVarF.D(j5)) {
                        i8 = 33554432;
                    } else {
                        i8 = 67108864;
                    }
                    i6 |= i8;
                }
                if ((38347923 & i6) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i6 & 1)) {
                    dVarF.U();
                    if ((i & 1) != 0 || dVarF.t()) {
                        if (i7 != 0) {
                            bVar3 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar3 = bVar2;
                        }
                        if (i4 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            xkbVarF = kvb.a.f(dVarF, 6);
                            i6 &= -7169;
                        } else {
                            xkbVarF = xkbVar2;
                        }
                        if ((i2 & 16) != 0) {
                            jC = kvb.a.c(dVarF, 6);
                            i6 &= -57345;
                        } else {
                            jC = j6;
                        }
                        if ((i2 & 32) != 0) {
                            jD = kvb.a.d(dVarF, 6);
                            i6 &= -458753;
                        } else {
                            jD = j7;
                        }
                        if ((i2 & 64) != 0) {
                            jA = kvb.a.a(dVarF, 6);
                            i6 &= -3670017;
                        } else {
                            jA = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jB = kvb.a.b(dVarF, 6);
                            i6 &= -29360129;
                        } else {
                            jB = j4;
                        }
                        if ((i2 & 256) != 0) {
                            i6 &= -234881025;
                            jE = kvb.a.e(dVarF, 6);
                        } else {
                            jE = j5;
                        }
                        z6 = z5;
                    } else {
                        dVarF.q();
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i6 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i6 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i6 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            i6 &= -29360129;
                        }
                        if ((i2 & 256) != 0) {
                            i6 &= -234881025;
                        }
                        jB = j4;
                        jE = j5;
                        bVar3 = bVar2;
                        z6 = z2;
                        xkbVarF = xkbVar2;
                        jC = j6;
                        jD = j7;
                        jA = j3;
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(274621471, i6, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:206)");
                    }
                    actionLabel = jvbVar.getVisuals().getActionLabel();
                    do1VarE = null;
                    if (actionLabel != null) {
                        dVarF.y(-663815981);
                        do1 do1VarE2 = ko1.e(-1378313599, true, new d(jA, jvbVar, actionLabel), dVarF, 54);
                        dVarF.u();
                        do1Var = do1VarE2;
                    } else {
                        dVarF.y(-663517017);
                        dVarF.u();
                        do1Var = null;
                    }
                    if (jvbVar.getVisuals().getWithDismissAction()) {
                        dVarF.y(-663364652);
                        do1VarE = ko1.e(-1812633777, true, new e(jvbVar), dVarF, 54);
                        dVarF.u();
                    } else {
                        dVarF.y(-662974393);
                        dVarF.u();
                    }
                    int i16 = i6 << 3;
                    dVar2 = dVarF;
                    i(nx8.n(bVar3, ff3.i(12)), do1Var, do1VarE, z6, xkbVarF, jC, jD, jB, jE, ko1.e(-1266389126, true, new c(jvbVar), dVarF, 54), dVar2, (i16 & 3670016) | (i16 & 7168) | 805306368 | (57344 & i16) | (458752 & i16) | (29360128 & i6) | (234881024 & i6), 0);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    j10 = jA;
                    z4 = z6;
                    xkbVar3 = xkbVarF;
                    j8 = jC;
                    j9 = jD;
                    j11 = jB;
                    j12 = jE;
                } else {
                    dVar2 = dVarF;
                    dVar2.q();
                    bVar3 = bVar2;
                    z4 = z2;
                    xkbVar3 = xkbVar2;
                    j8 = j6;
                    j9 = j7;
                    j10 = j3;
                    j11 = j4;
                    j12 = j5;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.ovb
                        public final Object invoke(Object obj, Object obj2) {
                            return tvb.l(jvbVar, bVar3, z4, xkbVar3, j8, j9, j10, j11, j12, i, i2, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    xkbVar2 = xkbVar;
                    if (dVarF.x(xkbVar2)) {
                    }
                    i3 |= i12;
                } else {
                    xkbVar2 = xkbVar;
                }
                i3 |= i12;
            } else {
                xkbVar2 = xkbVar;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    j6 = j;
                    if (dVarF.D(j6)) {
                    }
                    i3 |= i13;
                } else {
                    j6 = j;
                }
                i3 |= i13;
            } else {
                j6 = j;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    j7 = j2;
                    if (dVarF.D(j7)) {
                    }
                    i3 |= i14;
                } else {
                    j7 = j2;
                }
                i3 |= i14;
            } else {
                j7 = j2;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    i10 = i3;
                    i7 = i11;
                    if (dVarF.D(j3)) {
                    }
                    i6 = i10 | i15;
                } else {
                    i10 = i3;
                    i7 = i11;
                }
                i6 = i10 | i15;
            } else {
                i6 = i3;
                i7 = i11;
            }
            if ((i & 12582912) != 0) {
                if ((i2 & 128) == 0) {
                    i9 = 4194304;
                } else {
                    i9 = 4194304;
                }
                i6 |= i9;
            }
            if ((100663296 & i) != 0) {
                if ((i2 & 256) == 0) {
                    i8 = 33554432;
                } else {
                    i8 = 33554432;
                }
                i6 |= i8;
            }
            if ((38347923 & i6) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i6 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i4 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        xkbVarF = kvb.a.f(dVarF, 6);
                        i6 &= -7169;
                    } else {
                        xkbVarF = xkbVar2;
                    }
                    if ((i2 & 16) != 0) {
                        jC = kvb.a.c(dVarF, 6);
                        i6 &= -57345;
                    } else {
                        jC = j6;
                    }
                    if ((i2 & 32) != 0) {
                        jD = kvb.a.d(dVarF, 6);
                        i6 &= -458753;
                    } else {
                        jD = j7;
                    }
                    if ((i2 & 64) != 0) {
                        jA = kvb.a.a(dVarF, 6);
                        i6 &= -3670017;
                    } else {
                        jA = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jB = kvb.a.b(dVarF, 6);
                        i6 &= -29360129;
                    } else {
                        jB = j4;
                    }
                    if ((i2 & 256) != 0) {
                        i6 &= -234881025;
                        jE = kvb.a.e(dVarF, 6);
                    } else {
                        jE = j5;
                    }
                    z6 = z5;
                } else {
                    if (i7 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i4 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        xkbVarF = kvb.a.f(dVarF, 6);
                        i6 &= -7169;
                    } else {
                        xkbVarF = xkbVar2;
                    }
                    if ((i2 & 16) != 0) {
                        jC = kvb.a.c(dVarF, 6);
                        i6 &= -57345;
                    } else {
                        jC = j6;
                    }
                    if ((i2 & 32) != 0) {
                        jD = kvb.a.d(dVarF, 6);
                        i6 &= -458753;
                    } else {
                        jD = j7;
                    }
                    if ((i2 & 64) != 0) {
                        jA = kvb.a.a(dVarF, 6);
                        i6 &= -3670017;
                    } else {
                        jA = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jB = kvb.a.b(dVarF, 6);
                        i6 &= -29360129;
                    } else {
                        jB = j4;
                    }
                    if ((i2 & 256) != 0) {
                        i6 &= -234881025;
                        jE = kvb.a.e(dVarF, 6);
                    } else {
                        jE = j5;
                    }
                    z6 = z5;
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(274621471, i6, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:206)");
                }
                actionLabel = jvbVar.getVisuals().getActionLabel();
                do1VarE = null;
                if (actionLabel != null) {
                    dVarF.y(-663815981);
                    do1 do1VarE3 = ko1.e(-1378313599, true, new d(jA, jvbVar, actionLabel), dVarF, 54);
                    dVarF.u();
                    do1Var = do1VarE3;
                } else {
                    dVarF.y(-663517017);
                    dVarF.u();
                    do1Var = null;
                }
                if (jvbVar.getVisuals().getWithDismissAction()) {
                    dVarF.y(-663364652);
                    do1VarE = ko1.e(-1812633777, true, new e(jvbVar), dVarF, 54);
                    dVarF.u();
                } else {
                    dVarF.y(-662974393);
                    dVarF.u();
                }
                int i17 = i6 << 3;
                dVar2 = dVarF;
                i(nx8.n(bVar3, ff3.i(12)), do1Var, do1VarE, z6, xkbVarF, jC, jD, jB, jE, ko1.e(-1266389126, true, new c(jvbVar), dVarF, 54), dVar2, (i17 & 3670016) | (i17 & 7168) | 805306368 | (57344 & i17) | (458752 & i17) | (29360128 & i6) | (234881024 & i6), 0);
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                j10 = jA;
                z4 = z6;
                xkbVar3 = xkbVarF;
                j8 = jC;
                j9 = jD;
                j11 = jB;
                j12 = jE;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar3 = bVar2;
                z4 = z2;
                xkbVar3 = xkbVar2;
                j8 = j6;
                j9 = j7;
                j10 = j3;
                j11 = j4;
                j12 = j5;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.ovb
                    public final Object invoke(Object obj, Object obj2) {
                        return tvb.l(jvbVar, bVar3, z4, xkbVar3, j8, j9, j10, j11, j12, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 48;
        bVar2 = bVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                z2 = z;
                if (dVarF.A(z2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    xkbVar2 = xkbVar;
                    if (dVarF.x(xkbVar2)) {
                    }
                    i3 |= i12;
                } else {
                    xkbVar2 = xkbVar;
                }
                i3 |= i12;
            } else {
                xkbVar2 = xkbVar;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    j6 = j;
                    if (dVarF.D(j6)) {
                    }
                    i3 |= i13;
                } else {
                    j6 = j;
                }
                i3 |= i13;
            } else {
                j6 = j;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    j7 = j2;
                    if (dVarF.D(j7)) {
                    }
                    i3 |= i14;
                } else {
                    j7 = j2;
                }
                i3 |= i14;
            } else {
                j7 = j2;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    i10 = i3;
                    i7 = i11;
                    if (dVarF.D(j3)) {
                    }
                    i6 = i10 | i15;
                } else {
                    i10 = i3;
                    i7 = i11;
                }
                i6 = i10 | i15;
            } else {
                i6 = i3;
                i7 = i11;
            }
            if ((i & 12582912) != 0) {
                if ((i2 & 128) == 0) {
                    i9 = 4194304;
                } else {
                    i9 = 4194304;
                }
                i6 |= i9;
            }
            if ((100663296 & i) != 0) {
                if ((i2 & 256) == 0) {
                    i8 = 33554432;
                } else {
                    i8 = 33554432;
                }
                i6 |= i8;
            }
            if ((38347923 & i6) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i6 & 1)) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i4 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        xkbVarF = kvb.a.f(dVarF, 6);
                        i6 &= -7169;
                    } else {
                        xkbVarF = xkbVar2;
                    }
                    if ((i2 & 16) != 0) {
                        jC = kvb.a.c(dVarF, 6);
                        i6 &= -57345;
                    } else {
                        jC = j6;
                    }
                    if ((i2 & 32) != 0) {
                        jD = kvb.a.d(dVarF, 6);
                        i6 &= -458753;
                    } else {
                        jD = j7;
                    }
                    if ((i2 & 64) != 0) {
                        jA = kvb.a.a(dVarF, 6);
                        i6 &= -3670017;
                    } else {
                        jA = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jB = kvb.a.b(dVarF, 6);
                        i6 &= -29360129;
                    } else {
                        jB = j4;
                    }
                    if ((i2 & 256) != 0) {
                        i6 &= -234881025;
                        jE = kvb.a.e(dVarF, 6);
                    } else {
                        jE = j5;
                    }
                    z6 = z5;
                } else {
                    if (i7 != 0) {
                        bVar3 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i4 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        xkbVarF = kvb.a.f(dVarF, 6);
                        i6 &= -7169;
                    } else {
                        xkbVarF = xkbVar2;
                    }
                    if ((i2 & 16) != 0) {
                        jC = kvb.a.c(dVarF, 6);
                        i6 &= -57345;
                    } else {
                        jC = j6;
                    }
                    if ((i2 & 32) != 0) {
                        jD = kvb.a.d(dVarF, 6);
                        i6 &= -458753;
                    } else {
                        jD = j7;
                    }
                    if ((i2 & 64) != 0) {
                        jA = kvb.a.a(dVarF, 6);
                        i6 &= -3670017;
                    } else {
                        jA = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jB = kvb.a.b(dVarF, 6);
                        i6 &= -29360129;
                    } else {
                        jB = j4;
                    }
                    if ((i2 & 256) != 0) {
                        i6 &= -234881025;
                        jE = kvb.a.e(dVarF, 6);
                    } else {
                        jE = j5;
                    }
                    z6 = z5;
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(274621471, i6, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:206)");
                }
                actionLabel = jvbVar.getVisuals().getActionLabel();
                do1VarE = null;
                if (actionLabel != null) {
                    dVarF.y(-663815981);
                    do1 do1VarE4 = ko1.e(-1378313599, true, new d(jA, jvbVar, actionLabel), dVarF, 54);
                    dVarF.u();
                    do1Var = do1VarE4;
                } else {
                    dVarF.y(-663517017);
                    dVarF.u();
                    do1Var = null;
                }
                if (jvbVar.getVisuals().getWithDismissAction()) {
                    dVarF.y(-663364652);
                    do1VarE = ko1.e(-1812633777, true, new e(jvbVar), dVarF, 54);
                    dVarF.u();
                } else {
                    dVarF.y(-662974393);
                    dVarF.u();
                }
                int i18 = i6 << 3;
                dVar2 = dVarF;
                i(nx8.n(bVar3, ff3.i(12)), do1Var, do1VarE, z6, xkbVarF, jC, jD, jB, jE, ko1.e(-1266389126, true, new c(jvbVar), dVarF, 54), dVar2, (i18 & 3670016) | (i18 & 7168) | 805306368 | (57344 & i18) | (458752 & i18) | (29360128 & i6) | (234881024 & i6), 0);
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                j10 = jA;
                z4 = z6;
                xkbVar3 = xkbVarF;
                j8 = jC;
                j9 = jD;
                j11 = jB;
                j12 = jE;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar3 = bVar2;
                z4 = z2;
                xkbVar3 = xkbVar2;
                j8 = j6;
                j9 = j7;
                j10 = j3;
                j11 = j4;
                j12 = j5;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.ovb
                    public final Object invoke(Object obj, Object obj2) {
                        return tvb.l(jvbVar, bVar3, z4, xkbVar3, j8, j9, j10, j11, j12, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                xkbVar2 = xkbVar;
                if (dVarF.x(xkbVar2)) {
                }
                i3 |= i12;
            } else {
                xkbVar2 = xkbVar;
            }
            i3 |= i12;
        } else {
            xkbVar2 = xkbVar;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                j6 = j;
                if (dVarF.D(j6)) {
                }
                i3 |= i13;
            } else {
                j6 = j;
            }
            i3 |= i13;
        } else {
            j6 = j;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                j7 = j2;
                if (dVarF.D(j7)) {
                }
                i3 |= i14;
            } else {
                j7 = j2;
            }
            i3 |= i14;
        } else {
            j7 = j2;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                i10 = i3;
                i7 = i11;
                if (dVarF.D(j3)) {
                }
                i6 = i10 | i15;
            } else {
                i10 = i3;
                i7 = i11;
            }
            i6 = i10 | i15;
        } else {
            i6 = i3;
            i7 = i11;
        }
        if ((i & 12582912) != 0) {
            if ((i2 & 128) == 0) {
                i9 = 4194304;
            } else {
                i9 = 4194304;
            }
            i6 |= i9;
        }
        if ((100663296 & i) != 0) {
            if ((i2 & 256) == 0) {
                i8 = 33554432;
            } else {
                i8 = 33554432;
            }
            i6 |= i8;
        }
        if ((38347923 & i6) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (dVarF.g(z3, i6 & 1)) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    bVar3 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar3 = bVar2;
                }
                if (i4 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if ((i2 & 8) != 0) {
                    xkbVarF = kvb.a.f(dVarF, 6);
                    i6 &= -7169;
                } else {
                    xkbVarF = xkbVar2;
                }
                if ((i2 & 16) != 0) {
                    jC = kvb.a.c(dVarF, 6);
                    i6 &= -57345;
                } else {
                    jC = j6;
                }
                if ((i2 & 32) != 0) {
                    jD = kvb.a.d(dVarF, 6);
                    i6 &= -458753;
                } else {
                    jD = j7;
                }
                if ((i2 & 64) != 0) {
                    jA = kvb.a.a(dVarF, 6);
                    i6 &= -3670017;
                } else {
                    jA = j3;
                }
                if ((i2 & 128) != 0) {
                    jB = kvb.a.b(dVarF, 6);
                    i6 &= -29360129;
                } else {
                    jB = j4;
                }
                if ((i2 & 256) != 0) {
                    i6 &= -234881025;
                    jE = kvb.a.e(dVarF, 6);
                } else {
                    jE = j5;
                }
                z6 = z5;
            } else {
                if (i7 != 0) {
                    bVar3 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar3 = bVar2;
                }
                if (i4 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if ((i2 & 8) != 0) {
                    xkbVarF = kvb.a.f(dVarF, 6);
                    i6 &= -7169;
                } else {
                    xkbVarF = xkbVar2;
                }
                if ((i2 & 16) != 0) {
                    jC = kvb.a.c(dVarF, 6);
                    i6 &= -57345;
                } else {
                    jC = j6;
                }
                if ((i2 & 32) != 0) {
                    jD = kvb.a.d(dVarF, 6);
                    i6 &= -458753;
                } else {
                    jD = j7;
                }
                if ((i2 & 64) != 0) {
                    jA = kvb.a.a(dVarF, 6);
                    i6 &= -3670017;
                } else {
                    jA = j3;
                }
                if ((i2 & 128) != 0) {
                    jB = kvb.a.b(dVarF, 6);
                    i6 &= -29360129;
                } else {
                    jB = j4;
                }
                if ((i2 & 256) != 0) {
                    i6 &= -234881025;
                    jE = kvb.a.e(dVarF, 6);
                } else {
                    jE = j5;
                }
                z6 = z5;
            }
            dVarF.M();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(274621471, i6, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:206)");
            }
            actionLabel = jvbVar.getVisuals().getActionLabel();
            do1VarE = null;
            if (actionLabel != null) {
                dVarF.y(-663815981);
                do1 do1VarE5 = ko1.e(-1378313599, true, new d(jA, jvbVar, actionLabel), dVarF, 54);
                dVarF.u();
                do1Var = do1VarE5;
            } else {
                dVarF.y(-663517017);
                dVarF.u();
                do1Var = null;
            }
            if (jvbVar.getVisuals().getWithDismissAction()) {
                dVarF.y(-663364652);
                do1VarE = ko1.e(-1812633777, true, new e(jvbVar), dVarF, 54);
                dVarF.u();
            } else {
                dVarF.y(-662974393);
                dVarF.u();
            }
            int i19 = i6 << 3;
            dVar2 = dVarF;
            i(nx8.n(bVar3, ff3.i(12)), do1Var, do1VarE, z6, xkbVarF, jC, jD, jB, jE, ko1.e(-1266389126, true, new c(jvbVar), dVarF, 54), dVar2, (i19 & 3670016) | (i19 & 7168) | 805306368 | (57344 & i19) | (458752 & i19) | (29360128 & i6) | (234881024 & i6), 0);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            j10 = jA;
            z4 = z6;
            xkbVar3 = xkbVarF;
            j8 = jC;
            j9 = jD;
            j11 = jB;
            j12 = jE;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            bVar3 = bVar2;
            z4 = z2;
            xkbVar3 = xkbVar2;
            j8 = j6;
            j9 = j7;
            j10 = j3;
            j11 = j4;
            j12 = j5;
        }
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.ovb
                public final Object invoke(Object obj, Object obj2) {
                    return tvb.l(jvbVar, bVar3, z4, xkbVar3, j8, j9, j10, j11, j12, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit k(androidx.compose.ui.b bVar, Function2 function2, Function2 function3, boolean z, xkb xkbVar, long j, long j2, long j3, long j4, Function2 function4, int i, int i2, androidx.compose.p004runtime.d dVar, int i3) throws NoWhenBranchMatchedException {
        i(bVar, function2, function3, z, xkbVar, j, j2, j3, j4, function4, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(jvb jvbVar, androidx.compose.ui.b bVar, boolean z, xkb xkbVar, long j, long j2, long j3, long j4, long j5, int i, int i2, androidx.compose.p004runtime.d dVar, int i3) {
        j(jvbVar, bVar, z, xkbVar, j, j2, j3, j4, j5, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }
}
