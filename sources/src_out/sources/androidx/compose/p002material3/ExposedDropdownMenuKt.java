package androidx.compose.p002material3;

import android.view.KeyEvent;
import androidx.compose.p001foundation.gestures.ForEachGestureKt;
import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p002material3.ExposedDropdownMenuKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.s0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.focus.f;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import com.google.android.lq2;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.android.sh7;
import com.google.inputmethod.afb;
import com.google.inputmethod.cc0;
import com.google.inputmethod.df9;
import com.google.inputmethod.dj7;
import com.google.inputmethod.dud;
import com.google.inputmethod.ej7;
import com.google.inputmethod.f43;
import com.google.inputmethod.ff3;
import com.google.inputmethod.fj7;
import com.google.inputmethod.gba;
import com.google.inputmethod.gd0;
import com.google.inputmethod.gs1;
import com.google.inputmethod.hpa;
import com.google.inputmethod.hyb;
import com.google.inputmethod.ii6;
import com.google.inputmethod.k16;
import com.google.inputmethod.kba;
import com.google.inputmethod.kn6;
import com.google.inputmethod.kx1;
import com.google.inputmethod.ln6;
import com.google.inputmethod.mwb;
import com.google.inputmethod.nfb;
import com.google.inputmethod.nx1;
import com.google.inputmethod.o58;
import com.google.inputmethod.oi6;
import com.google.inputmethod.pp1;
import com.google.inputmethod.q48;
import com.google.inputmethod.qq7;
import com.google.inputmethod.r16;
import com.google.inputmethod.rbc;
import com.google.inputmethod.rhe;
import com.google.inputmethod.ri6;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.si6;
import com.google.inputmethod.tc;
import com.google.inputmethod.ugc;
import com.google.inputmethod.vbc;
import com.google.inputmethod.vn3;
import com.google.inputmethod.wi6;
import com.google.inputmethod.wz9;
import com.google.inputmethod.xq8;
import com.google.inputmethod.zk4;
import com.google.inputmethod.zn6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001aI\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\r\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001aa\u0010\u0019\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a)\u0010!\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"\u001a\u0015\u0010$\u001a\u00020\u001d*\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b$\u0010%\"\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(\"\u0018\u0010,\u001a\u00020\u0000*\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010+\"\u0018\u0010.\u001a\u00020\u0000*\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010+*8\b\u0007\u00107\"\u00020\u000b2\u00020\u000bB*\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u001c\b2\u0012\u0018\b\u000bB\u0014\b3\u0012\b\b4\u0012\u0004\b\b(5\u0012\u0006\b6\u0012\u0002\b\f¨\u0006;²\u0006\u0010\u00108\u001a\u0004\u0018\u00010#8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00109\u001a\u00020\u001f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010:\u001a\u00020\u001f8\n@\nX\u008a\u008e\u0002"}, d2 = {"", "expanded", "Lkotlin/Function1;", "", "onExpandedChange", "Landroidx/compose/ui/b;", "modifier", "Landroidx/compose/material3/g0;", "content", "h", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/b;Lcom/google/android/ps4;Landroidx/compose/runtime/d;II)V", "Landroidx/compose/material3/f0;", "that", "E", "(Ljava/lang/String;Ljava/lang/String;)Z", "Lkotlin/Function0;", "anchorType", "Lcom/google/android/o58;", "alwaysFocusable", "", "expandedDescription", "collapsedDescription", "toggleDescription", "Lcom/google/android/hyb;", "keyboardController", "A", "(Landroidx/compose/ui/b;ZLkotlin/jvm/functions/Function0;Ljava/lang/String;Lcom/google/android/o58;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/hyb;)Landroidx/compose/ui/b;", "Lcom/google/android/k16;", "windowBounds", "Lcom/google/android/gba;", "anchorBounds", "", "verticalMargin", "z", "(Lcom/google/android/k16;Lcom/google/android/gba;I)I", "Lcom/google/android/kn6;", "D", "(Lcom/google/android/kn6;)Lcom/google/android/gba;", "Lcom/google/android/ff3;", "a", "F", "ExposedDropdownMenuItemHorizontalPadding", "Lcom/google/android/oi6;", "(Landroid/view/KeyEvent;)Z", "isClick", "G", "isEnterMinusSpacebar", "Lcom/google/android/r43;", "message", "Renamed to ExposedDropdownMenuAnchorType", "replaceWith", "Lcom/google/android/kia;", "expression", "ExposedDropdownMenuAnchorType", "imports", "MenuAnchorType", "anchorCoordinates", "anchorWidth", "menuMaxHeight", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ExposedDropdownMenuKt {
    private static final float a = ff3.i(16);

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00038PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"androidx/compose/material3/ExposedDropdownMenuKt$a", "Landroidx/compose/material3/h0;", "Landroidx/compose/ui/b;", "Landroidx/compose/material3/f0;", "type", "", "enabled", "k", "(Landroidx/compose/ui/b;Ljava/lang/String;Z)Landroidx/compose/ui/b;", "matchAnchorWidth", "h", "(Landroidx/compose/ui/b;Z)Landroidx/compose/ui/b;", "j", "()Ljava/lang/String;", "anchorType", "i", "()Z", "alwaysFocusable", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends h0 {
        final /* synthetic */ f b;
        final /* synthetic */ boolean c;
        final /* synthetic */ o58<Boolean> d;
        final /* synthetic */ String e;
        final /* synthetic */ String f;
        final /* synthetic */ String g;
        final /* synthetic */ hyb h;
        final /* synthetic */ o58<f0> i;
        final /* synthetic */ Function1<Boolean, Unit> j;
        final /* synthetic */ q48 k;
        final /* synthetic */ q48 l;

        /* JADX WARN: Multi-variable type inference failed */
        a(f fVar, boolean z, o58<Boolean> o58Var, String str, String str2, String str3, hyb hybVar, o58<f0> o58Var2, Function1<? super Boolean, Unit> function1, q48 q48Var, q48 q48Var2) {
            this.b = fVar;
            this.c = z;
            this.d = o58Var;
            this.e = str;
            this.f = str2;
            this.g = str3;
            this.h = hybVar;
            this.i = o58Var2;
            this.j = function1;
            this.k = q48Var;
            this.l = q48Var2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fj7 q(boolean z, q48 q48Var, q48 q48Var2, j jVar, dj7 dj7Var, kx1 kx1Var) {
            int iG = nx1.g(kx1Var.getValue(), ExposedDropdownMenuKt.p(q48Var));
            int iF = nx1.f(kx1Var.getValue(), ExposedDropdownMenuKt.r(q48Var2));
            int iN = z ? iG : kx1.n(kx1Var.getValue());
            if (!z) {
                iG = kx1.l(kx1Var.getValue());
            }
            final o oVarR0 = dj7Var.r0(kx1.d(kx1Var.getValue(), iN, iG, 0, iF, 4, null));
            return j.Q1(jVar, oVarR0.getWidth(), oVarR0.getHeight(), null, new Function1() { // from class: com.google.android.h14
                public final Object invoke(Object obj) {
                    return ExposedDropdownMenuKt.a.r(oVarR0, (o.a) obj);
                }
            }, 4, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(o oVar, o.a aVar) {
            o.a.z(aVar, oVar, 0, 0, 0.0f, 4, null);
            return Unit.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(String str, o58 o58Var) {
            if (ExposedDropdownMenuKt.E(str, ((f0) o58Var.getValue()).getName())) {
                o58Var.setValue(f0.d(str));
            }
            return Unit.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(o58 o58Var, String str, Function1 function1, boolean z) {
            o58Var.setValue(f0.d(str));
            function1.invoke(Boolean.valueOf(!z));
            return Unit.a;
        }

        @Override // androidx.compose.p002material3.g0
        public androidx.compose.ui.b h(androidx.compose.ui.b bVar, final boolean z) {
            final q48 q48Var = this.k;
            final q48 q48Var2 = this.l;
            return zn6.a(bVar, new ps4() { // from class: com.google.android.e14
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ExposedDropdownMenuKt.a.q(z, q48Var, q48Var2, (j) obj, (dj7) obj2, (kx1) obj3);
                }
            });
        }

        @Override // androidx.compose.p002material3.g0
        public boolean i() {
            return this.d.getValue().booleanValue();
        }

        @Override // androidx.compose.p002material3.g0
        public String j() {
            return this.i.getValue().getName();
        }

        @Override // androidx.compose.p002material3.g0
        public androidx.compose.ui.b k(androidx.compose.ui.b bVar, final String str, boolean z) {
            androidx.compose.ui.b bVarA;
            androidx.compose.ui.b bVarA2 = zk4.a(bVar, this.b);
            final o58<f0> o58Var = this.i;
            androidx.compose.ui.b bVarThen = bVarA2.then(new d0(new Function0() { // from class: com.google.android.f14
                public final Object invoke() {
                    return ExposedDropdownMenuKt.a.s(str, o58Var);
                }
            }));
            if (z) {
                androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
                final boolean z2 = this.c;
                final o58<f0> o58Var2 = this.i;
                final Function1<Boolean, Unit> function1 = this.j;
                bVarA = ExposedDropdownMenuKt.A(companion, z2, new Function0() { // from class: com.google.android.g14
                    public final Object invoke() {
                        return ExposedDropdownMenuKt.a.t(o58Var2, str, function1, z2);
                    }
                }, str, this.d, this.e, this.f, this.g, this.h);
            } else {
                bVarA = androidx.compose.ui.b.INSTANCE;
            }
            return bVarThen.then(bVarA);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements Function1<oi6, Boolean> {
        final /* synthetic */ String a;
        final /* synthetic */ Function0<Unit> b;
        final /* synthetic */ boolean c;
        final /* synthetic */ o58<Boolean> d;

        b(String str, Function0<Unit> function0, boolean z, o58<Boolean> o58Var) {
            this.a = str;
            this.b = function0;
            this.c = z;
            this.d = o58Var;
        }

        public final Boolean a(KeyEvent keyEvent) {
            if (ExposedDropdownMenuKt.F(keyEvent)) {
                if (!f0.g(this.a, f0.INSTANCE.a())) {
                    this.b.invoke();
                } else if (ExposedDropdownMenuKt.G(keyEvent)) {
                    this.b.invoke();
                    return Boolean.TRUE;
                }
            }
            if (f0.g(this.a, f0.INSTANCE.a()) && this.c) {
                long jA = si6.a(keyEvent);
                ii6.Companion companion = ii6.INSTANCE;
                if (ii6.T(jA, companion.L()) || ii6.T(si6.a(keyEvent), companion.j()) || ii6.T(si6.a(keyEvent), companion.m())) {
                    o58<Boolean> o58Var = this.d;
                    Boolean bool = Boolean.TRUE;
                    o58Var.setValue(bool);
                    return bool;
                }
            }
            o58<Boolean> o58Var2 = this.d;
            Boolean bool2 = Boolean.FALSE;
            o58Var2.setValue(bool2);
            return bool2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((oi6) obj).getNativeKeyEvent());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.b A(androidx.compose.ui.b bVar, final boolean z, final Function0<Unit> function0, final String str, o58<Boolean> o58Var, final String str2, final String str3, final String str4, final hyb hybVar) {
        return afb.d(wi6.b(ugc.c(bVar, function0, new PointerInputEventHandler() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$expandable$1

            /* JADX INFO: renamed from: androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/cc0;", "", "<anonymous>", "(Lcom/google/android/cc0;)V"}, k = 3, mv = {2, 0, 0})
            @lq2(c = "androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1", f = "ExposedDropdownMenu.kt", l = {1426, 1430}, m = "invokeSuspend")
            static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<cc0, q22<? super Unit>, Object> {
                final /* synthetic */ String $anchorType;
                final /* synthetic */ Function0<Unit> $onExpandedChange;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(String str, Function0<Unit> function0, q22<? super AnonymousClass1> q22Var) {
                    super(2, q22Var);
                    this.$anchorType = str;
                    this.$onExpandedChange = function0;
                }

                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(cc0 cc0Var, q22<? super Unit> q22Var) {
                    return create(cc0Var, q22Var).invokeSuspend(Unit.a);
                }

                public final q22<Unit> create(Object obj, q22<?> q22Var) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$anchorType, this.$onExpandedChange, q22Var);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
                
                    if (r11 == r0) goto L19;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                    /*
                        r10 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
                        int r1 = r10.label
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L24
                        if (r1 == r3) goto L1b
                        if (r1 != r2) goto L13
                        kotlin.f.b(r11)
                        r7 = r10
                        goto L5f
                    L13:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r0)
                        throw r11
                    L1b:
                        java.lang.Object r1 = r10.L$0
                        com.google.android.cc0 r1 = (com.google.inputmethod.cc0) r1
                        kotlin.f.b(r11)
                        r7 = r10
                        goto L3e
                    L24:
                        kotlin.f.b(r11)
                        java.lang.Object r11 = r10.L$0
                        r4 = r11
                        com.google.android.cc0 r4 = (com.google.inputmethod.cc0) r4
                        androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                        r10.L$0 = r4
                        r10.label = r3
                        r5 = 0
                        r8 = 1
                        r9 = 0
                        r7 = r10
                        java.lang.Object r11 = androidx.compose.p001foundation.gestures.TapGestureDetectorKt.d(r4, r5, r6, r7, r8, r9)
                        if (r11 != r0) goto L3d
                        goto L5e
                    L3d:
                        r1 = r4
                    L3e:
                        androidx.compose.ui.input.pointer.i r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
                        java.lang.String r3 = r7.$anchorType
                        androidx.compose.material3.f0$a r4 = androidx.compose.p002material3.f0.INSTANCE
                        java.lang.String r4 = r4.c()
                        boolean r3 = androidx.compose.p002material3.f0.g(r3, r4)
                        if (r3 == 0) goto L51
                        r11.a()
                    L51:
                        androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                        r3 = 0
                        r7.L$0 = r3
                        r7.label = r2
                        java.lang.Object r11 = androidx.compose.p001foundation.gestures.TapGestureDetectorKt.q(r1, r11, r10)
                        if (r11 != r0) goto L5f
                    L5e:
                        return r0
                    L5f:
                        androidx.compose.ui.input.pointer.i r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
                        if (r11 == 0) goto L68
                        kotlin.jvm.functions.Function0<kotlin.Unit> r11 = r7.$onExpandedChange
                        r11.invoke()
                    L68:
                        kotlin.Unit r11 = kotlin.Unit.a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002material3.ExposedDropdownMenuKt$expandable$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(df9 df9Var, q22<? super Unit> q22Var) {
                Object objD = ForEachGestureKt.d(df9Var, new AnonymousClass1(str, function0, null), q22Var);
                return objD == a.g() ? objD : Unit.a;
            }
        }), new b(str, function0, z, o58Var)), false, new Function1() { // from class: com.google.android.c14
            public final Object invoke(Object obj) {
                return ExposedDropdownMenuKt.B(str, z, str2, str3, str4, function0, hybVar, (nfb) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(final String str, boolean z, String str2, String str3, String str4, final Function0 function0, final hyb hybVar, nfb nfbVar) {
        if (f0.g(str, f0.INSTANCE.c())) {
            SemanticsPropertiesKt.p0(nfbVar, hpa.INSTANCE.a());
            if (!z) {
                str2 = str3;
            }
            SemanticsPropertiesKt.v0(nfbVar, str2);
            SemanticsPropertiesKt.b0(nfbVar, str4);
        } else {
            SemanticsPropertiesKt.p0(nfbVar, hpa.INSTANCE.d());
        }
        SemanticsPropertiesKt.x(nfbVar, null, new Function0() { // from class: com.google.android.d14
            public final Object invoke() {
                return Boolean.valueOf(ExposedDropdownMenuKt.C(function0, str, hybVar));
            }
        }, 1, null);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C(Function0 function0, String str, hyb hybVar) {
        function0.invoke();
        if (!f0.g(str, f0.INSTANCE.a()) || hybVar == null) {
            return true;
        }
        hybVar.show();
        return true;
    }

    private static final gba D(kn6 kn6Var) {
        return (kn6Var == null || !kn6Var.b()) ? gba.INSTANCE.a() : kba.c(ln6.i(kn6Var), r16.e(kn6Var.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean E(String str, String str2) {
        f0.Companion companion = f0.INSTANCE;
        if (f0.g(str, companion.b()) || f0.g(str, companion.a())) {
            return true;
        }
        if (f0.g(str, companion.c())) {
            return f0.g(str2, companion.c());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean F(KeyEvent keyEvent) {
        if (ri6.e(si6.b(keyEvent), ri6.INSTANCE.b())) {
            return G(keyEvent) || ii6.T(si6.a(keyEvent), ii6.INSTANCE.K());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean G(KeyEvent keyEvent) {
        long jA = si6.a(keyEvent);
        ii6.Companion companion = ii6.INSTANCE;
        return ii6.T(jA, companion.i()) || ii6.T(jA, companion.n()) || ii6.T(jA, companion.B());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x022d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0239  */
    /* JADX WARN: Code duplicated, block: B:104:0x023d  */
    /* JADX WARN: Code duplicated, block: B:109:0x026c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0295  */
    /* JADX WARN: Code duplicated, block: B:116:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:119:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:121:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:122:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:127:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:130:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:131:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:136:0x0305  */
    /* JADX WARN: Code duplicated, block: B:139:0x0319  */
    /* JADX WARN: Code duplicated, block: B:141:0x031e  */
    /* JADX WARN: Code duplicated, block: B:144:0x0329  */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:70:0x0139  */
    /* JADX WARN: Code duplicated, block: B:71:0x014d  */
    /* JADX WARN: Code duplicated, block: B:74:0x015b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0169  */
    /* JADX WARN: Code duplicated, block: B:78:0x0172  */
    /* JADX WARN: Code duplicated, block: B:79:0x0175  */
    /* JADX WARN: Code duplicated, block: B:82:0x017e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0181  */
    /* JADX WARN: Code duplicated, block: B:88:0x019c  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f0  */
    public static final void h(boolean z, final Function1<? super Boolean, Unit> function1, androidx.compose.ui.b bVar, ps4<? super g0, ? super d, ? super Integer, Unit> ps4Var, d dVar, final int i, final int i2) {
        int i3;
        androidx.compose.ui.b bVar2;
        int i4;
        boolean z2;
        final ps4<? super g0, ? super d, ? super Integer, Unit> ps4Var2;
        final androidx.compose.ui.b bVar3;
        s6b s6bVarH;
        androidx.compose.ui.b bVar4;
        rhe rheVarK;
        final int iO1;
        Object objR;
        d.Companion companion;
        final o58 o58Var;
        Object objR2;
        q48 q48Var;
        Object objR3;
        q48 q48Var2;
        Object objR4;
        final f fVar;
        hyb hybVar;
        String strB;
        String strB2;
        String strB3;
        Object objR5;
        o58 o58Var2;
        Object objR6;
        o58 o58Var3;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        boolean zX;
        Object aVar;
        q48 q48Var3;
        final q48 q48Var4;
        final rhe rheVar;
        boolean zT;
        Object objR7;
        int iA;
        Function0<ComposeUiNode> function0B;
        d dVarC;
        Function2<ComposeUiNode, Integer, Unit> function2C;
        boolean z5;
        Object objR8;
        boolean z6;
        Object objR9;
        boolean zT2;
        Object objR10;
        final boolean z7 = z;
        d dVarF = dVar.F(1597265892);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.A(z7) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= dVarF.T(function1) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                bVar2 = bVar;
                i3 |= dVarF.x(bVar2) ? 256 : 128;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (dVarF.T(ps4Var)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            if ((i3 & 1171) != 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (dVarF.g(z2, i3 & 1)) {
                if (i7 != 0) {
                    bVar4 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (e.k()) {
                    e.o(1597265892, i3, -1, "androidx.compose.material3.ExposedDropdownMenuBox (ExposedDropdownMenu.kt:141)");
                }
                rheVarK = i0.k(dVarF, 0);
                f43 f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                iO1 = f43Var.O1(qq7.n());
                objR = dVarF.R();
                companion = d.INSTANCE;
                if (objR == companion.a()) {
                    objR = s0.e(null, null, 2, null);
                    dVarF.L(objR);
                }
                o58Var = (o58) objR;
                objR2 = dVarF.R();
                if (objR2 == companion.a()) {
                    objR2 = mwb.a(0);
                    dVarF.L(objR2);
                }
                q48Var = (q48) objR2;
                objR3 = dVarF.R();
                if (objR3 == companion.a()) {
                    objR3 = mwb.a(0);
                    dVarF.L(objR3);
                }
                q48Var2 = (q48) objR3;
                objR4 = dVarF.R();
                if (objR4 == companion.a()) {
                    objR4 = new f();
                    dVarF.L(objR4);
                }
                fVar = (f) objR4;
                hybVar = (hyb) dVarF.v(CompositionLocalsKt.r());
                rbc.Companion companion2 = rbc.INSTANCE;
                strB = vbc.b(rbc.a(wz9.F), dVarF, 0);
                strB2 = vbc.b(rbc.a(wz9.E), dVarF, 0);
                strB3 = vbc.b(rbc.a(wz9.G), dVarF, 0);
                objR5 = dVarF.R();
                if (objR5 == companion.a()) {
                    objR5 = s0.e(f0.d(f0.INSTANCE.b()), null, 2, null);
                    dVarF.L(objR5);
                }
                o58Var2 = (o58) objR5;
                objR6 = dVarF.R();
                if (objR6 == companion.a()) {
                    objR6 = s0.e(Boolean.FALSE, null, 2, null);
                    dVarF.L(objR6);
                }
                o58Var3 = (o58) objR6;
                i5 = i3 & 14;
                if (i5 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                i6 = i3 & 112;
                if (i6 == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zX = dVarF.x(f43Var) | z3 | z4 | dVarF.x(rheVarK);
                Object objR11 = dVarF.R();
                if (!zX || objR11 == companion.a()) {
                    q48Var3 = q48Var;
                    q48Var4 = q48Var2;
                    rheVar = rheVarK;
                    aVar = new a(fVar, z, o58Var3, strB, strB2, strB3, hybVar, o58Var2, function1, q48Var3, q48Var4);
                    fVar = fVar;
                    z7 = z;
                    dVarF.L(aVar);
                } else {
                    z7 = z;
                    q48Var3 = q48Var;
                    rheVar = rheVarK;
                    aVar = objR11;
                    q48Var4 = q48Var2;
                }
                a aVar2 = (a) aVar;
                zT = dVarF.T(rheVar) | dVarF.C(iO1);
                objR7 = dVarF.R();
                if (zT || objR7 == companion.a()) {
                    final q48 q48Var5 = q48Var3;
                    final q48 q48Var6 = q48Var4;
                    final rhe rheVar2 = rheVar;
                    objR7 = new Function1() { // from class: com.google.android.x04
                        public final Object invoke(Object obj) {
                            return ExposedDropdownMenuKt.i(rheVar2, iO1, o58Var, q48Var5, q48Var6, (kn6) obj);
                        }
                    };
                    dVarF.L(objR7);
                }
                androidx.compose.ui.b bVarA = xq8.a(bVar4, (Function1) objR7);
                ej7 ej7VarI = androidx.compose.p001foundation.layout.j.i(tc.INSTANCE.o(), false);
                iA = pp1.a(dVarF, 0);
                gs1 gs1VarJ = dVarF.j();
                androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, bVarA);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                function0B = companion3.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                dVarC = dud.c(dVarF);
                dud.i(dVarC, ej7VarI, companion3.d());
                dud.i(dVarC, gs1VarJ, companion3.f());
                function2C = companion3.c();
                if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                }
                dud.i(dVarC, bVarE, companion3.e());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                ps4Var2 = ps4Var;
                ps4Var2.invoke(aVar2, dVarF, Integer.valueOf((i3 >> 6) & 112));
                dVarF.m();
                if (z7) {
                    dVarF.y(209894723);
                    zT2 = dVarF.T(rheVar) | dVarF.C(iO1);
                    objR10 = dVarF.R();
                    if (zT2 || objR10 == companion.a()) {
                        objR10 = new Function0() { // from class: com.google.android.y04
                            public final Object invoke() {
                                return ExposedDropdownMenuKt.j(rheVar, iO1, o58Var, q48Var4);
                            }
                        };
                        dVarF.L(objR10);
                    }
                    i0.d((Function0) objR10, dVarF, 0);
                    dVarF.u();
                } else {
                    dVarF.y(210228190);
                    dVarF.u();
                }
                if (i5 == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objR8 = dVarF.R();
                if (z5 || objR8 == companion.a()) {
                    objR8 = new Function0() { // from class: com.google.android.z04
                        public final Object invoke() {
                            return ExposedDropdownMenuKt.l(z7, fVar);
                        }
                    };
                    dVarF.L(objR8);
                }
                vn3.i((Function0) objR8, dVarF, 0);
                if (i6 == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objR9 = dVarF.R();
                if (z6 || objR9 == companion.a()) {
                    objR9 = new Function0() { // from class: com.google.android.a14
                        public final Object invoke() {
                            return ExposedDropdownMenuKt.m(function1);
                        }
                    };
                    dVarF.L(objR9);
                }
                gd0.b(z7, (Function0) objR9, dVarF, i5, 0);
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar4;
            } else {
                ps4Var2 = ps4Var;
                dVarF.q();
                bVar3 = bVar2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.b14
                    public final Object invoke(Object obj, Object obj2) {
                        return ExposedDropdownMenuKt.n(z7, function1, bVar3, ps4Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        bVar2 = bVar;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (dVarF.T(ps4Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (dVarF.g(z2, i3 & 1)) {
            if (i7 != 0) {
                bVar4 = androidx.compose.ui.b.INSTANCE;
            } else {
                bVar4 = bVar2;
            }
            if (e.k()) {
                e.o(1597265892, i3, -1, "androidx.compose.material3.ExposedDropdownMenuBox (ExposedDropdownMenu.kt:141)");
            }
            rheVarK = i0.k(dVarF, 0);
            f43 f43Var2 = (f43) dVarF.v(CompositionLocalsKt.g());
            iO1 = f43Var2.O1(qq7.n());
            objR = dVarF.R();
            companion = d.INSTANCE;
            if (objR == companion.a()) {
                objR = s0.e(null, null, 2, null);
                dVarF.L(objR);
            }
            o58Var = (o58) objR;
            objR2 = dVarF.R();
            if (objR2 == companion.a()) {
                objR2 = mwb.a(0);
                dVarF.L(objR2);
            }
            q48Var = (q48) objR2;
            objR3 = dVarF.R();
            if (objR3 == companion.a()) {
                objR3 = mwb.a(0);
                dVarF.L(objR3);
            }
            q48Var2 = (q48) objR3;
            objR4 = dVarF.R();
            if (objR4 == companion.a()) {
                objR4 = new f();
                dVarF.L(objR4);
            }
            fVar = (f) objR4;
            hybVar = (hyb) dVarF.v(CompositionLocalsKt.r());
            rbc.Companion companion4 = rbc.INSTANCE;
            strB = vbc.b(rbc.a(wz9.F), dVarF, 0);
            strB2 = vbc.b(rbc.a(wz9.E), dVarF, 0);
            strB3 = vbc.b(rbc.a(wz9.G), dVarF, 0);
            objR5 = dVarF.R();
            if (objR5 == companion.a()) {
                objR5 = s0.e(f0.d(f0.INSTANCE.b()), null, 2, null);
                dVarF.L(objR5);
            }
            o58Var2 = (o58) objR5;
            objR6 = dVarF.R();
            if (objR6 == companion.a()) {
                objR6 = s0.e(Boolean.FALSE, null, 2, null);
                dVarF.L(objR6);
            }
            o58Var3 = (o58) objR6;
            i5 = i3 & 14;
            if (i5 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            i6 = i3 & 112;
            if (i6 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            zX = dVarF.x(f43Var2) | z3 | z4 | dVarF.x(rheVarK);
            Object objR12 = dVarF.R();
            if (zX) {
                q48Var3 = q48Var;
                q48Var4 = q48Var2;
                rheVar = rheVarK;
                aVar = new a(fVar, z, o58Var3, strB, strB2, strB3, hybVar, o58Var2, function1, q48Var3, q48Var4);
                fVar = fVar;
                z7 = z;
                dVarF.L(aVar);
            } else {
                q48Var3 = q48Var;
                q48Var4 = q48Var2;
                rheVar = rheVarK;
                aVar = new a(fVar, z, o58Var3, strB, strB2, strB3, hybVar, o58Var2, function1, q48Var3, q48Var4);
                fVar = fVar;
                z7 = z;
                dVarF.L(aVar);
            }
            a aVar3 = (a) aVar;
            zT = dVarF.T(rheVar) | dVarF.C(iO1);
            objR7 = dVarF.R();
            if (zT) {
                final q48 q48Var7 = q48Var3;
                final q48 q48Var8 = q48Var4;
                final rhe rheVar3 = rheVar;
                objR7 = new Function1() { // from class: com.google.android.x04
                    public final Object invoke(Object obj) {
                        return ExposedDropdownMenuKt.i(rheVar3, iO1, o58Var, q48Var7, q48Var8, (kn6) obj);
                    }
                };
                dVarF.L(objR7);
            } else {
                final q48 q48Var9 = q48Var3;
                final q48 q48Var10 = q48Var4;
                final rhe rheVar4 = rheVar;
                objR7 = new Function1() { // from class: com.google.android.x04
                    public final Object invoke(Object obj) {
                        return ExposedDropdownMenuKt.i(rheVar4, iO1, o58Var, q48Var9, q48Var10, (kn6) obj);
                    }
                };
                dVarF.L(objR7);
            }
            androidx.compose.ui.b bVarA2 = xq8.a(bVar4, (Function1) objR7);
            ej7 ej7VarI2 = androidx.compose.p001foundation.layout.j.i(tc.INSTANCE.o(), false);
            iA = pp1.a(dVarF, 0);
            gs1 gs1VarJ2 = dVarF.j();
            androidx.compose.ui.b bVarE2 = ComposedModifierKt.e(dVarF, bVarA2);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            function0B = companion5.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            dVarC = dud.c(dVarF);
            dud.i(dVarC, ej7VarI2, companion5.d());
            dud.i(dVarC, gs1VarJ2, companion5.f());
            function2C = companion5.c();
            if (dVarC.getInserting()) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            } else {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE2, companion5.e());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.a;
            ps4Var2 = ps4Var;
            ps4Var2.invoke(aVar3, dVarF, Integer.valueOf((i3 >> 6) & 112));
            dVarF.m();
            if (z7) {
                dVarF.y(209894723);
                zT2 = dVarF.T(rheVar) | dVarF.C(iO1);
                objR10 = dVarF.R();
                if (zT2) {
                    objR10 = new Function0() { // from class: com.google.android.y04
                        public final Object invoke() {
                            return ExposedDropdownMenuKt.j(rheVar, iO1, o58Var, q48Var4);
                        }
                    };
                    dVarF.L(objR10);
                } else {
                    objR10 = new Function0() { // from class: com.google.android.y04
                        public final Object invoke() {
                            return ExposedDropdownMenuKt.j(rheVar, iO1, o58Var, q48Var4);
                        }
                    };
                    dVarF.L(objR10);
                }
                i0.d((Function0) objR10, dVarF, 0);
                dVarF.u();
            } else {
                dVarF.y(210228190);
                dVarF.u();
            }
            if (i5 == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            objR8 = dVarF.R();
            if (z5) {
                objR8 = new Function0() { // from class: com.google.android.z04
                    public final Object invoke() {
                        return ExposedDropdownMenuKt.l(z7, fVar);
                    }
                };
                dVarF.L(objR8);
            } else {
                objR8 = new Function0() { // from class: com.google.android.z04
                    public final Object invoke() {
                        return ExposedDropdownMenuKt.l(z7, fVar);
                    }
                };
                dVarF.L(objR8);
            }
            vn3.i((Function0) objR8, dVarF, 0);
            if (i6 == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            objR9 = dVarF.R();
            if (z6) {
                objR9 = new Function0() { // from class: com.google.android.a14
                    public final Object invoke() {
                        return ExposedDropdownMenuKt.m(function1);
                    }
                };
                dVarF.L(objR9);
            } else {
                objR9 = new Function0() { // from class: com.google.android.a14
                    public final Object invoke() {
                        return ExposedDropdownMenuKt.m(function1);
                    }
                };
                dVarF.L(objR9);
            }
            gd0.b(z7, (Function0) objR9, dVarF, i5, 0);
            if (e.k()) {
                e.n();
            }
            bVar3 = bVar4;
        } else {
            ps4Var2 = ps4Var;
            dVarF.q();
            bVar3 = bVar2;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.b14
                public final Object invoke(Object obj, Object obj2) {
                    return ExposedDropdownMenuKt.n(z7, function1, bVar3, ps4Var2, i, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(rhe rheVar, int i, o58 o58Var, q48 q48Var, q48 q48Var2, kn6 kn6Var) {
        o(o58Var, kn6Var);
        q(q48Var, (int) (kn6Var.a() >> 32));
        s(q48Var2, z(rheVar.a(), D(k(o58Var)), i));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(rhe rheVar, int i, o58 o58Var, q48 q48Var) {
        s(q48Var, z(rheVar.a(), D(k(o58Var)), i));
        return Unit.a;
    }

    private static final kn6 k(o58<kn6> o58Var) {
        return o58Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(boolean z, f fVar) {
        if (z) {
            f.h(fVar, 0, 1, null);
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(Function1 function1) {
        function1.invoke(Boolean.FALSE);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(boolean z, Function1 function1, androidx.compose.ui.b bVar, ps4 ps4Var, int i, int i2, d dVar, int i3) {
        h(z, function1, bVar, ps4Var, dVar, saa.a(i | 1), i2);
        return Unit.a;
    }

    private static final void o(o58<kn6> o58Var, kn6 kn6Var) {
        o58Var.setValue(kn6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(q48 q48Var) {
        return q48Var.getIntValue();
    }

    private static final void q(q48 q48Var, int i) {
        q48Var.f(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(q48 q48Var) {
        return q48Var.getIntValue();
    }

    private static final void s(q48 q48Var, int i) {
        q48Var.f(i);
    }

    private static final int z(k16 k16Var, gba gbaVar, int i) {
        if (gbaVar == null) {
            return 0;
        }
        int top = k16Var.getTop() + i;
        int bottom = k16Var.getBottom() - i;
        return Math.max((gbaVar.getTop() > ((float) k16Var.getBottom()) || gbaVar.getBottom() < ((float) k16Var.getTop())) ? bottom - top : sh7.d(Math.max(gbaVar.getTop() - top, bottom - gbaVar.getBottom())), 0);
    }
}
