package androidx.compose.p002material3.p003internal;

import androidx.compose.p000animation.ColorVectorConverterKt;
import androidx.compose.p000animation.core.AnimateAsStateKt;
import androidx.compose.p000animation.core.Transition;
import androidx.compose.p000animation.core.TransitionKt;
import androidx.compose.p001foundation.interaction.FocusInteractionKt;
import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p002material3.InteractiveComponentSizeKt;
import androidx.compose.p002material3.d1;
import androidx.compose.p002material3.p003internal.TextFieldImplKt;
import androidx.compose.p002material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p002material3.u1;
import androidx.compose.p002material3.v1;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import androidx.compose.p004runtime.s0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.l;
import androidx.compose.ui.graphics.m;
import androidx.compose.ui.graphics.n;
import androidx.compose.ui.graphics.o;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.text.TextStyle;
import com.google.android.dt4;
import com.google.android.ps4;
import com.google.android.ws4;
import com.google.android.yg4;
import com.google.inputmethod.BorderStroke;
import com.google.inputmethod.Typography;
import com.google.inputmethod.afb;
import com.google.inputmethod.ah3;
import com.google.inputmethod.avb;
import com.google.inputmethod.b0d;
import com.google.inputmethod.cz1;
import com.google.inputmethod.d08;
import com.google.inputmethod.dj7;
import com.google.inputmethod.do1;
import com.google.inputmethod.dud;
import com.google.inputmethod.ei1;
import com.google.inputmethod.ej7;
import com.google.inputmethod.f43;
import com.google.inputmethod.ff3;
import com.google.inputmethod.fj7;
import com.google.inputmethod.fs1;
import com.google.inputmethod.gmd;
import com.google.inputmethod.gs1;
import com.google.inputmethod.guc;
import com.google.inputmethod.hh4;
import com.google.inputmethod.j26;
import com.google.inputmethod.kh7;
import com.google.inputmethod.ko1;
import com.google.inputmethod.kx1;
import com.google.inputmethod.mtc;
import com.google.inputmethod.nfb;
import com.google.inputmethod.ns9;
import com.google.inputmethod.ntc;
import com.google.inputmethod.nx1;
import com.google.inputmethod.o58;
import com.google.inputmethod.os9;
import com.google.inputmethod.osb;
import com.google.inputmethod.otc;
import com.google.inputmethod.pn6;
import com.google.inputmethod.pp1;
import com.google.inputmethod.pr0;
import com.google.inputmethod.psc;
import com.google.inputmethod.ptc;
import com.google.inputmethod.q6c;
import com.google.inputmethod.qr;
import com.google.inputmethod.ri1;
import com.google.inputmethod.rx8;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.tc;
import com.google.inputmethod.tjd;
import com.google.inputmethod.tsb;
import com.google.inputmethod.vzc;
import com.google.inputmethod.w2e;
import com.google.inputmethod.xa4;
import com.google.inputmethod.xkb;
import com.google.inputmethod.zn6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference0Impl;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\b\u001aé\u0001\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a-\u0010$\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b$\u0010%\u001a%\u0010&\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b&\u0010'\u001a#\u0010+\u001a\u00020(*\u00020(2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b+\u0010,\u001a#\u00101\u001a\u00020(*\u00020(2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b1\u00102\u001a!\u00105\u001a\u00020(*\u00020(2\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u0004H\u0000¢\u0006\u0004\b5\u00106\u001aE\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:2\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u00107\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u00108\u001a\u0002032\u0006\u00109\u001a\u000203H\u0001¢\u0006\u0004\b<\u0010=\u001a\u000f\u0010>\u001a\u000203H\u0001¢\u0006\u0004\b>\u0010?\u001a\u000f\u0010@\u001a\u000203H\u0001¢\u0006\u0004\b@\u0010?\"\u001a\u0010E\u001a\u0002038\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u001a\u0010H\u001a\u0002038\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010B\u001a\u0004\bG\u0010D\"\u001a\u0010K\u001a\u0002038\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010B\u001a\u0004\bJ\u0010D\"\u001a\u0010N\u001a\u0002038\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010B\u001a\u0004\bM\u0010D\"\u001a\u0010Q\u001a\u0002038\u0000X\u0080\u0004¢\u0006\f\n\u0004\bO\u0010B\u001a\u0004\bP\u0010D\"\u001a\u0010T\u001a\u0002038\u0000X\u0080\u0004¢\u0006\f\n\u0004\bR\u0010B\u001a\u0004\bS\u0010D\"\u001a\u0010W\u001a\u0002038\u0000X\u0080\u0004¢\u0006\f\n\u0004\bU\u0010B\u001a\u0004\bV\u0010D\"\u001a\u0010Y\u001a\u0002038\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010B\u001a\u0004\bB\u0010D\"\u0018\u0010\\\u001a\u00020\u0012*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[\"\u0018\u0010`\u001a\u00020]*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_\"\u0018\u0010b\u001a\u00020]*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\ba\u0010_¨\u0006e²\u0006\f\u0010c\u001a\u00020\u00128\nX\u008a\u0084\u0002²\u0006\f\u0010d\u001a\u00020\u00128\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material3/internal/TextFieldType;", "type", "", "visualText", "Lkotlin/Function0;", "", "innerTextField", "Landroidx/compose/material3/v1;", "labelPosition", "Lkotlin/Function1;", "Lcom/google/android/guc;", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "", "singleLine", "enabled", "isError", "Lcom/google/android/j26;", "interactionSource", "Lcom/google/android/rx8;", "contentPadding", "Lcom/google/android/psc;", "colors", "container", "l", "(Landroidx/compose/material3/internal/TextFieldType;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/v1;Lcom/google/android/ps4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLcom/google/android/j26;Lcom/google/android/rx8;Lcom/google/android/psc;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;II)V", "Lcom/google/android/ei1;", "contentColor", "Landroidx/compose/ui/text/y;", "textStyle", "content", "s", "(JLandroidx/compose/ui/text/y;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "t", "(JLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "Landroidx/compose/ui/b;", "", "defaultErrorMessage", "z", "(Landroidx/compose/ui/b;ZLjava/lang/String;)Landroidx/compose/ui/b;", "Lcom/google/android/ri1;", "color", "Lcom/google/android/xkb;", "shape", "N", "(Landroidx/compose/ui/b;Lcom/google/android/ri1;Lcom/google/android/xkb;)Landroidx/compose/ui/b;", "Lcom/google/android/ff3;", "minHeight", "R", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/b;", "focused", "focusedBorderThickness", "unfocusedBorderThickness", "Lcom/google/android/q6c;", "Lcom/google/android/or0;", "y", "(ZZZLcom/google/android/psc;FFLandroidx/compose/runtime/d;I)Lcom/google/android/q6c;", "Q", "(Landroidx/compose/runtime/d;I)F", "M", "a", "F", "L", "()F", "TextFieldPadding", "b", "C", "AboveLabelHorizontalPadding", "c", "B", "AboveLabelBottomPadding", "d", "K", "SupportingTopPadding", "e", "I", "PrefixSuffixTextPadding", "f", "G", "MinTextLineHeight", "g", "E", "MinFocusedLabelLineHeight", "h", "MinSupportingTextLineHeight", "J", "(Landroidx/compose/material3/v1;)Z", "showExpandedLabel", "Lcom/google/android/tc$b;", "H", "(Landroidx/compose/material3/v1;)Lcom/google/android/tc$b;", "minimizedAlignment", "D", "expandedAlignment", "showPlaceholder", "showPrefixSuffix", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TextFieldImplKt {
    private static final float a;
    private static final float b;
    private static final float c;
    private static final float d;
    private static final float e = ff3.i(2);
    private static final float f = ff3.i(24);
    private static final float g;
    private static final float h;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> a;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2) {
            this.a = function2;
        }

        public final void a(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1729858187, i, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:229)");
            }
            androidx.compose.ui.b bVarB = pn6.b(androidx.compose.ui.b.INSTANCE, "Container");
            Function2<androidx.compose.p004runtime.d, Integer, Unit> function2 = this.a;
            ej7 ej7VarI = androidx.compose.p001foundation.layout.j.i(tc.INSTANCE.o(), true);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, bVarB);
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
            function2.invoke(dVar, 0);
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
    static final class b implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ TextStyle a;
        final /* synthetic */ TextStyle b;
        final /* synthetic */ q6c<Float> c;
        final /* synthetic */ q6c<ei1> d;
        final /* synthetic */ boolean e;
        final /* synthetic */ q6c<ei1> f;
        final /* synthetic */ ps4<guc, androidx.compose.p004runtime.d, Integer, Unit> g;
        final /* synthetic */ i h;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
            final /* synthetic */ ps4<guc, androidx.compose.p004runtime.d, Integer, Unit> a;
            final /* synthetic */ i b;

            /* JADX WARN: Multi-variable type inference failed */
            a(ps4<? super guc, ? super androidx.compose.p004runtime.d, ? super Integer, Unit> ps4Var, i iVar) {
                this.a = ps4Var;
                this.b = iVar;
            }

            public final void a(androidx.compose.p004runtime.d dVar, int i) {
                if (!dVar.g((i & 3) != 2, i & 1)) {
                    dVar.q();
                    return;
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(1157484991, i, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:147)");
                }
                this.a.invoke(this.b, dVar, 6);
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
        b(TextStyle textStyle, TextStyle textStyle2, q6c<Float> q6cVar, q6c<ei1> q6cVar2, boolean z, q6c<ei1> q6cVar3, ps4<? super guc, ? super androidx.compose.p004runtime.d, ? super Integer, Unit> ps4Var, i iVar) {
            this.a = textStyle;
            this.b = textStyle2;
            this.c = q6cVar;
            this.d = q6cVar2;
            this.e = z;
            this.f = q6cVar3;
            this.g = ps4Var;
            this.h = iVar;
        }

        public final void a(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1076580032, i, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:139)");
            }
            TextStyle textStyleC = vzc.c(this.a, this.b, this.c.getValue().floatValue());
            boolean z = this.e;
            q6c<ei1> q6cVar = this.f;
            if (z) {
                textStyleC = TextStyle.c(textStyleC, q6cVar.getValue().getValue(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            }
            TextFieldImplKt.s(this.d.getValue().getValue(), textStyleC, ko1.e(1157484991, true, new a(this.g, this.h), dVar, 54), dVar, 384);
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
        final /* synthetic */ long a;
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> b;

        /* JADX WARN: Multi-variable type inference failed */
        c(long j, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2) {
            this.a = j;
            this.b = function2;
        }

        public final void a(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1736293487, i, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:205)");
            }
            TextFieldImplKt.t(this.a, this.b, dVar, 0);
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
    static final class d implements ps4<androidx.compose.ui.b, androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ q6c<Float> a;
        final /* synthetic */ long b;
        final /* synthetic */ TextStyle c;
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> d;

        /* JADX WARN: Multi-variable type inference failed */
        d(q6c<Float> q6cVar, long j, TextStyle textStyle, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2) {
            this.a = q6cVar;
            this.b = j;
            this.c = textStyle;
            this.d = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(q6c q6cVar, m mVar) {
            mVar.c(((Number) q6cVar.getValue()).floatValue());
            return Unit.a;
        }

        public final void b(androidx.compose.ui.b bVar, androidx.compose.p004runtime.d dVar, int i) {
            if ((i & 6) == 0) {
                i |= dVar.x(bVar) ? 4 : 2;
            }
            if (!dVar.g((i & 19) != 18, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(1405547205, i, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:161)");
            }
            boolean zX = dVar.x(this.a);
            final q6c<Float> q6cVar = this.a;
            Object objR = dVar.R();
            if (zX || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new Function1() { // from class: androidx.compose.material3.internal.j
                    public final Object invoke(Object obj) {
                        return TextFieldImplKt.d.c(q6cVar, (m) obj);
                    }
                };
                dVar.L(objR);
            }
            androidx.compose.ui.b bVarC = l.c(bVar, (Function1) objR);
            long j = this.b;
            TextStyle textStyle = this.c;
            Function2<androidx.compose.p004runtime.d, Integer, Unit> function2 = this.d;
            ej7 ej7VarI = androidx.compose.p001foundation.layout.j.i(tc.INSTANCE.o(), false);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, bVarC);
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
            TextFieldImplKt.s(j, textStyle, function2, dVar, 0);
            dVar.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((androidx.compose.ui.b) obj, (androidx.compose.p004runtime.d) obj2, ((Number) obj3).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class e implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ q6c<Float> a;
        final /* synthetic */ long b;
        final /* synthetic */ TextStyle c;
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> d;

        /* JADX WARN: Multi-variable type inference failed */
        e(q6c<Float> q6cVar, long j, TextStyle textStyle, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2) {
            this.a = q6cVar;
            this.b = j;
            this.c = textStyle;
            this.d = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(q6c q6cVar, m mVar) {
            mVar.c(((Number) q6cVar.getValue()).floatValue());
            return Unit.a;
        }

        public final void b(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(606594655, i, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:178)");
            }
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            boolean zX = dVar.x(this.a);
            final q6c<Float> q6cVar = this.a;
            Object objR = dVar.R();
            if (zX || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new Function1() { // from class: androidx.compose.material3.internal.k
                    public final Object invoke(Object obj) {
                        return TextFieldImplKt.e.c(q6cVar, (m) obj);
                    }
                };
                dVar.L(objR);
            }
            androidx.compose.ui.b bVarC = l.c(companion, (Function1) objR);
            long j = this.b;
            TextStyle textStyle = this.c;
            Function2<androidx.compose.p004runtime.d, Integer, Unit> function2 = this.d;
            ej7 ej7VarI = androidx.compose.p001foundation.layout.j.i(tc.INSTANCE.o(), false);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, bVarC);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion2.b();
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
            dud.i(dVarC, ej7VarI, companion2.d());
            dud.i(dVarC, gs1VarJ, companion2.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion2.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion2.e());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            TextFieldImplKt.s(j, textStyle, function2, dVar, 0);
            dVar.m();
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
    static final class f implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ q6c<Float> a;
        final /* synthetic */ long b;
        final /* synthetic */ TextStyle c;
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> d;

        /* JADX WARN: Multi-variable type inference failed */
        f(q6c<Float> q6cVar, long j, TextStyle textStyle, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2) {
            this.a = q6cVar;
            this.b = j;
            this.c = textStyle;
            this.d = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(q6c q6cVar, m mVar) {
            mVar.c(((Number) q6cVar.getValue()).floatValue());
            return Unit.a;
        }

        public final void b(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-45078754, i, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:192)");
            }
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            boolean zX = dVar.x(this.a);
            final q6c<Float> q6cVar = this.a;
            Object objR = dVar.R();
            if (zX || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new Function1() { // from class: androidx.compose.material3.internal.l
                    public final Object invoke(Object obj) {
                        return TextFieldImplKt.f.c(q6cVar, (m) obj);
                    }
                };
                dVar.L(objR);
            }
            androidx.compose.ui.b bVarC = l.c(companion, (Function1) objR);
            long j = this.b;
            TextStyle textStyle = this.c;
            Function2<androidx.compose.p004runtime.d, Integer, Unit> function2 = this.d;
            ej7 ej7VarI = androidx.compose.p001foundation.layout.j.i(tc.INSTANCE.o(), false);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, bVarC);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion2.b();
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
            dud.i(dVarC, ej7VarI, companion2.d());
            dud.i(dVarC, gs1VarJ, companion2.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion2.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion2.e());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            TextFieldImplKt.s(j, textStyle, function2, dVar, 0);
            dVar.m();
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
    static final class g implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ long a;
        final /* synthetic */ TextStyle b;
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> c;

        /* JADX WARN: Multi-variable type inference failed */
        g(long j, TextStyle textStyle, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2) {
            this.a = j;
            this.b = textStyle;
            this.c = function2;
        }

        public final void a(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(837168720, i, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:218)");
            }
            TextFieldImplKt.s(this.a, this.b, this.c, dVar, 0);
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
    static final class h implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ long a;
        final /* synthetic */ Function2<androidx.compose.p004runtime.d, Integer, Unit> b;

        /* JADX WARN: Multi-variable type inference failed */
        h(long j, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2) {
            this.a = j;
            this.b = function2;
        }

        public final void a(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(1334518521, i, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:211)");
            }
            TextFieldImplKt.t(this.a, this.b, dVar, 0);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/material3/internal/TextFieldImplKt$i", "Lcom/google/android/guc;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class i implements guc {
        final /* synthetic */ q6c<Float> a;

        i(q6c<Float> q6cVar) {
            this.a = q6cVar;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TextFieldType.values().length];
            try {
                iArr[TextFieldType.Filled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldType.Outlined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InputPhase.values().length];
            try {
                iArr2[InputPhase.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class k implements hh4, dt4 {
        private final /* synthetic */ Function0 a;

        k(Function0 function0) {
            this.a = function0;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof hh4) && (obj instanceof dt4)) {
                return Intrinsics.e(getFunctionDelegate(), ((dt4) obj).getFunctionDelegate());
            }
            return false;
        }

        public final ws4<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // com.google.inputmethod.hh4
        public final /* synthetic */ float invoke() {
            return ((Number) this.a.invoke()).floatValue();
        }
    }

    static {
        float f2 = 16;
        a = ff3.i(f2);
        float f3 = 4;
        b = ff3.i(f3);
        c = ff3.i(f3);
        d = ff3.i(f3);
        g = ff3.i(f2);
        h = ff3.i(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(String str, nfb nfbVar) {
        SemanticsPropertiesKt.l(nfbVar, str);
        return Unit.a;
    }

    public static final float B() {
        return c;
    }

    public static final float C() {
        return b;
    }

    public static final tc.b D(v1 v1Var) {
        if (v1Var instanceof v1.a) {
            return ((v1.a) v1Var).a();
        }
        if (v1Var instanceof v1.Attached) {
            return ((v1.Attached) v1Var).getExpandedAlignment();
        }
        throw new IllegalArgumentException("Unknown position: " + v1Var);
    }

    public static final float E() {
        return g;
    }

    public static final float F() {
        return h;
    }

    public static final float G() {
        return f;
    }

    public static final tc.b H(v1 v1Var) {
        if (v1Var instanceof v1.a) {
            return ((v1.a) v1Var).a();
        }
        if (v1Var instanceof v1.Attached) {
            return ((v1.Attached) v1Var).getMinimizedAlignment();
        }
        throw new IllegalArgumentException("Unknown position: " + v1Var);
    }

    public static final float I() {
        return e;
    }

    private static final boolean J(v1 v1Var) {
        return (v1Var instanceof v1.Attached) && !((v1.Attached) v1Var).getAlwaysMinimize();
    }

    public static final float K() {
        return d;
    }

    public static final float L() {
        return a;
    }

    public static final float M(androidx.compose.p004runtime.d dVar, int i2) {
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.o(1251545215, i2, -1, "androidx.compose.material3.internal.minimizedLabelHalfHeight (TextFieldImpl.kt:527)");
        }
        long jS = kh7.a.e(dVar, 6).getBodySmall().s();
        long jA = gmd.a.A();
        if (!b0d.k(jS)) {
            jS = jA;
        }
        float fI = ff3.i(((f43) dVar.v(CompositionLocalsKt.g())).U(jS) / 2);
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.n();
        }
        return fI;
    }

    public static final androidx.compose.ui.b N(androidx.compose.ui.b bVar, final ri1 ri1Var, final xkb xkbVar) {
        return androidx.compose.ui.draw.c.c(bVar, new Function1() { // from class: com.google.android.gtc
            public final Object invoke(Object obj) {
                return TextFieldImplKt.O(xkbVar, ri1Var, (CacheDrawScope) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ah3 O(xkb xkbVar, final ri1 ri1Var, CacheDrawScope cacheDrawScope) {
        final n nVarMo5createOutlinePq9zytI = xkbVar.mo5createOutlinePq9zytI(cacheDrawScope.d(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
        return cacheDrawScope.i(new Function1() { // from class: com.google.android.itc
            public final Object invoke(Object obj) {
                return TextFieldImplKt.P(nVarMo5createOutlinePq9zytI, ri1Var, (DrawScope) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit P(n nVar, ri1 ri1Var, DrawScope drawScope) throws NoWhenBranchMatchedException {
        o.e(drawScope, nVar, ri1Var.a(), 0.0f, null, null, 0, 60, null);
        return Unit.a;
    }

    public static final float Q(androidx.compose.p004runtime.d dVar, int i2) {
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.o(1986450462, i2, -1, "androidx.compose.material3.internal.textFieldHorizontalIconPadding (TextFieldImpl.kt:520)");
        }
        float value = ((ff3) dVar.v(InteractiveComponentSizeKt.e())).getValue();
        if (Float.isNaN(value)) {
            value = ff3.i(0);
        }
        float fI = ff3.i(kotlin.ranges.g.d(ff3.i(ff3.i(value - avb.a.d()) / 2), ff3.i(0)));
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.n();
        }
        return fI;
    }

    public static final androidx.compose.ui.b R(androidx.compose.ui.b bVar, final Function0<ff3> function0) {
        return zn6.a(bVar, new ps4() { // from class: com.google.android.ltc
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return TextFieldImplKt.S(function0, (j) obj, (dj7) obj2, (kx1) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fj7 S(Function0 function0, androidx.compose.ui.layout.j jVar, dj7 dj7Var, kx1 kx1Var) {
        float value = ((ff3) function0.invoke()).getValue();
        final androidx.compose.ui.layout.o oVarR0 = dj7Var.r0(kx1.d(kx1Var.getValue(), 0, 0, nx1.f(kx1Var.getValue(), !ff3.k(value, ff3.INSTANCE.c()) ? jVar.O1(value) : 0), 0, 11, null));
        return androidx.compose.ui.layout.j.Q1(jVar, oVarR0.getWidth(), oVarR0.getHeight(), null, new Function1() { // from class: com.google.android.ctc
            public final Object invoke(Object obj) {
                return TextFieldImplKt.T(oVarR0, (androidx.compose.ui.layout.o.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(androidx.compose.ui.layout.o oVar, androidx.compose.ui.layout.o.a aVar) {
        androidx.compose.ui.layout.o.a.z(aVar, oVar, 0, 0, 0.0f, 4, null);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:222:0x0388  */
    /* JADX WARN: Code duplicated, block: B:240:0x03ca  */
    public static final void l(final TextFieldType textFieldType, final CharSequence charSequence, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, final v1 v1Var, final ps4<? super guc, ? super androidx.compose.p004runtime.d, ? super Integer, Unit> ps4Var, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function3, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function4, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function5, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function6, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function7, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function8, final boolean z, final boolean z2, final boolean z3, final j26 j26Var, final rx8 rx8Var, final psc pscVar, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function9, androidx.compose.p004runtime.d dVar, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        psc pscVar2;
        androidx.compose.p004runtime.d dVar2;
        InputPhase inputPhase;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        boolean z4;
        androidx.compose.p004runtime.d dVar3;
        int i7;
        TextStyle textStyle;
        TextStyle textStyle2;
        final q6c q6cVar;
        do1 do1Var;
        final q6c q6cVar2;
        q6c q6cVar3;
        do1 do1Var2;
        do1 do1VarE;
        do1 do1VarE2;
        do1 do1Var3;
        int i8;
        do1 do1VarE3;
        androidx.compose.p004runtime.d dVarF = dVar.F(546805032);
        if ((i2 & 6) == 0) {
            i4 = (dVarF.C(textFieldType.ordinal()) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 = i4 | (dVarF.T(charSequence) ? 32 : 16);
        } else {
            i5 = i4;
        }
        if ((i2 & 384) == 0) {
            i5 |= dVarF.T(function2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= dVarF.x(v1Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= dVarF.T(ps4Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= dVarF.T(function3) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= dVarF.T(function4) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= dVarF.T(function5) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= dVarF.T(function6) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= dVarF.T(function7) ? 536870912 : 268435456;
        }
        int i9 = i5;
        if ((i3 & 6) == 0) {
            i6 = i3 | (dVarF.T(function8) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= dVarF.A(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= dVarF.A(z2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i6 |= dVarF.A(z3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i6 |= dVarF.x(j26Var) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i6 |= dVarF.x(rx8Var) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            pscVar2 = pscVar;
            i6 |= dVarF.x(pscVar2) ? 1048576 : 524288;
        } else {
            pscVar2 = pscVar;
        }
        if ((i3 & 12582912) == 0) {
            i6 |= dVarF.T(function9) ? 8388608 : 4194304;
        }
        int i10 = i6;
        if (dVarF.g(((i9 & 306783379) == 306783378 && (4793491 & i10) == 4793490) ? false : true, i9 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(546805032, i9, i10, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:98)");
            }
            boolean zBooleanValue = FocusInteractionKt.a(j26Var, dVarF, (i10 >> 12) & 14).getValue().booleanValue();
            if (zBooleanValue) {
                inputPhase = InputPhase.Focused;
            } else {
                inputPhase = charSequence.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
            }
            long jO = pscVar2.o(z2, z3, zBooleanValue);
            Typography typographyE = kh7.a.e(dVarF, 6);
            TextStyle bodyLarge = typographyE.getBodyLarge();
            TextStyle bodySmall = typographyE.getBodySmall();
            long jH = bodyLarge.h();
            ei1.Companion companion = ei1.INSTANCE;
            boolean z5 = (ei1.r(jH, companion.i()) && !ei1.r(bodySmall.h(), companion.i())) || (!ei1.r(bodyLarge.h(), companion.i()) && ei1.r(bodySmall.h(), companion.i()));
            long jH2 = bodySmall.h();
            if (z5 && jH2 == 16) {
                jH2 = jO;
            }
            long jH3 = bodyLarge.h();
            long j2 = (z5 && jH3 == 16) ? jO : jH3;
            boolean z6 = ps4Var != null && J(v1Var);
            boolean z7 = z5;
            long j3 = jH2;
            Transition transitionY = TransitionKt.y(inputPhase, "TextFieldInputState", dVarF, 48, 0);
            ntc ntcVar = new ntc(d08.b(MotionSchemeKeyTokens.FastSpatial, dVarF, 6));
            yg4 yg4Var = yg4.a;
            tjd<Float, qr> tjdVarN = w2e.N(yg4Var);
            InputPhase inputPhase2 = (InputPhase) transitionY.p();
            dVarF.y(-1436405362);
            boolean z8 = z6;
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1436405362, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:391)");
            }
            int[] iArr = j.$EnumSwitchMapping$1;
            int i11 = iArr[inputPhase2.ordinal()];
            float f7 = 1.0f;
            if (i11 == 1) {
                f2 = 1.0f;
            } else {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z8) {
                    f2 = 0.0f;
                }
                f2 = 1.0f;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            dVarF.u();
            Float fValueOf = Float.valueOf(f2);
            InputPhase inputPhase3 = (InputPhase) transitionY.w();
            dVarF.y(-1436405362);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1436405362, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:391)");
            }
            int i12 = iArr[inputPhase3.ordinal()];
            if (i12 == 1) {
                f3 = 1.0f;
            } else {
                if (i12 != 2) {
                    if (i12 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z8) {
                    f3 = 0.0f;
                }
                f3 = 1.0f;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            dVarF.u();
            q6c q6cVarR = TransitionKt.r(transitionY, fValueOf, Float.valueOf(f3), (xa4) ntcVar.invoke(transitionY.u(), dVarF, 0), tjdVarN, "LabelProgress", dVarF, 196608);
            MotionSchemeKeyTokens motionSchemeKeyTokens = MotionSchemeKeyTokens.FastEffects;
            xa4 xa4VarB = d08.b(motionSchemeKeyTokens, dVarF, 6);
            m mVar = new m(xa4VarB, d08.b(MotionSchemeKeyTokens.SlowEffects, dVarF, 6));
            tjd<Float, qr> tjdVarN2 = w2e.N(yg4Var);
            InputPhase inputPhase4 = (InputPhase) transitionY.p();
            dVarF.y(-1093194547);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1093194547, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:416)");
            }
            int i13 = iArr[inputPhase4.ordinal()];
            if (i13 == 1) {
                f4 = 1.0f;
            } else {
                if (i13 != 2) {
                    if (i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!z8) {
                    f4 = 1.0f;
                }
                f4 = 0.0f;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            dVarF.u();
            Float fValueOf2 = Float.valueOf(f4);
            InputPhase inputPhase5 = (InputPhase) transitionY.w();
            dVarF.y(-1093194547);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1093194547, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:416)");
            }
            int i14 = iArr[inputPhase5.ordinal()];
            if (i14 == 1) {
                f5 = 1.0f;
            } else {
                if (i14 != 2) {
                    if (i14 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!z8) {
                    f5 = 1.0f;
                }
                f5 = 0.0f;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            dVarF.u();
            final q6c q6cVarR2 = TransitionKt.r(transitionY, fValueOf2, Float.valueOf(f5), (xa4) mVar.invoke(transitionY.u(), dVarF, 0), tjdVarN2, "PlaceholderOpacity", dVarF, 196608);
            ptc ptcVar = new ptc(xa4VarB);
            tjd<Float, qr> tjdVarN3 = w2e.N(yg4Var);
            InputPhase inputPhase6 = (InputPhase) transitionY.p();
            dVarF.y(-1258455321);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1258455321, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:428)");
            }
            int i15 = iArr[inputPhase6.ordinal()];
            if (i15 == 1) {
                f6 = 1.0f;
            } else {
                if (i15 != 2) {
                    if (i15 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z8) {
                    f6 = 0.0f;
                }
                f6 = 1.0f;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            dVarF.u();
            Float fValueOf3 = Float.valueOf(f6);
            InputPhase inputPhase7 = (InputPhase) transitionY.w();
            dVarF.y(-1258455321);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1258455321, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:428)");
            }
            int i16 = iArr[inputPhase7.ordinal()];
            if (i16 != 1) {
                if (i16 != 2) {
                    if (i16 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z8) {
                    f7 = 0.0f;
                }
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            dVarF.u();
            q6c q6cVarR3 = TransitionKt.r(transitionY, fValueOf3, Float.valueOf(f7), (xa4) ptcVar.invoke(transitionY.u(), dVarF, 0), tjdVarN3, "PrefixSuffixOpacity", dVarF, 196608);
            xa4 xa4VarB2 = d08.b(motionSchemeKeyTokens, dVarF, 6);
            otc otcVar = new otc(xa4VarB2);
            InputPhase inputPhase8 = (InputPhase) transitionY.w();
            dVarF.y(-12973394);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-12973394, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:441)");
            }
            long j4 = iArr[inputPhase8.ordinal()] == 1 ? j3 : j2;
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            dVarF.u();
            androidx.compose.ui.graphics.colorspace.c cVarU = ei1.u(j4);
            boolean zX = dVarF.x(cVarU);
            Object objR = dVarF.R();
            if (zX || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = (tjd) ColorVectorConverterKt.a(companion).invoke(cVarU);
                dVarF.L(objR);
            }
            tjd tjdVar = (tjd) objR;
            InputPhase inputPhase9 = (InputPhase) transitionY.p();
            dVarF.y(-12973394);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-12973394, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:441)");
            }
            long j5 = iArr[inputPhase9.ordinal()] == 1 ? j3 : j2;
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            dVarF.u();
            ei1 ei1VarL = ei1.l(j5);
            InputPhase inputPhase10 = (InputPhase) transitionY.w();
            dVarF.y(-12973394);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-12973394, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:441)");
            }
            if (iArr[inputPhase10.ordinal()] == 1) {
                j2 = j3;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            dVarF.u();
            q6c q6cVarR4 = TransitionKt.r(transitionY, ei1VarL, ei1.l(j2), (xa4) otcVar.invoke(transitionY.u(), dVarF, 0), tjdVar, "LabelTextStyleColor", dVarF, 196608);
            mtc mtcVar = new mtc(xa4VarB2);
            dVarF.y(-464752477);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-464752477, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:452)");
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            dVarF.u();
            androidx.compose.ui.graphics.colorspace.c cVarU2 = ei1.u(jO);
            boolean zX2 = dVarF.x(cVarU2);
            Object objR2 = dVarF.R();
            if (zX2 || objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR2 = (tjd) ColorVectorConverterKt.a(companion).invoke(cVarU2);
                dVarF.L(objR2);
            }
            tjd tjdVar2 = (tjd) objR2;
            dVarF.y(-464752477);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-464752477, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:452)");
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            dVarF.u();
            ei1 ei1VarL2 = ei1.l(jO);
            dVarF.y(-464752477);
            if (androidx.compose.p004runtime.e.k()) {
                z4 = false;
                androidx.compose.p004runtime.e.o(-464752477, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:452)");
            } else {
                z4 = false;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            dVarF.u();
            q6c q6cVarR5 = TransitionKt.r(transitionY, ei1VarL2, ei1.l(jO), (xa4) mtcVar.invoke(transitionY.u(), dVarF, 0), tjdVar2, "LabelContentColor", dVarF, 196608);
            Object objR3 = dVarF.R();
            androidx.compose.p004runtime.d.Companion companion2 = androidx.compose.p004runtime.d.INSTANCE;
            if (objR3 == companion2.a()) {
                objR3 = new i(q6cVarR);
                dVarF.L(objR3);
            }
            i iVar = (i) objR3;
            do1 do1VarE4 = null;
            if (ps4Var == null) {
                dVarF.y(-1891724857);
                dVarF.u();
                q6cVar = q6cVarR;
                dVar3 = dVarF;
                textStyle2 = bodySmall;
                textStyle = bodyLarge;
                i7 = 54;
            } else {
                dVarF.y(-1891724856);
                dVar3 = dVarF;
                i7 = 54;
                b bVar = new b(bodyLarge, bodySmall, q6cVarR, q6cVarR5, z7, q6cVarR4, ps4Var, iVar);
                textStyle = bodyLarge;
                textStyle2 = bodySmall;
                q6cVar = q6cVarR;
                do1VarE4 = ko1.e(-1076580032, true, bVar, dVar3, 54);
                dVar3.u();
            }
            do1 do1Var4 = do1VarE4;
            long jQ = pscVar.q(z2, z3, r45);
            Object objR4 = dVar3.R();
            if (objR4 == companion2.a()) {
                objR4 = p0.d(p0.t(), new Function0() { // from class: com.google.android.btc
                    public final Object invoke() {
                        return Boolean.valueOf(TextFieldImplKt.p(q6cVarR2));
                    }
                });
                dVar3.L(objR4);
            }
            q6c q6cVar4 = (q6c) objR4;
            if (function3 != null && charSequence.length() == 0 && q(q6cVar4)) {
                dVar3.y(-1890614312);
                do1 do1VarE5 = ko1.e(1405547205, true, new d(q6cVarR2, jQ, textStyle, function3), dVar3, i7);
                dVar3.u();
                do1Var = do1VarE5;
            } else {
                dVar3.y(-1890217110);
                dVar3.u();
                do1Var = null;
            }
            long jR = pscVar.r(z2, z3, r45);
            Object objR5 = dVar3.R();
            if (objR5 == companion2.a()) {
                q6cVar2 = q6cVarR3;
                objR5 = p0.d(p0.t(), new Function0() { // from class: com.google.android.dtc
                    public final Object invoke() {
                        return Boolean.valueOf(TextFieldImplKt.m(q6cVar2));
                    }
                });
                dVar3.L(objR5);
            } else {
                q6cVar2 = q6cVarR3;
            }
            q6c q6cVar5 = (q6c) objR5;
            if (function6 == null || !n(q6cVar5)) {
                q6cVar3 = q6cVar2;
                dVar3.y(-1889500886);
                dVar3.u();
                do1Var2 = null;
            } else {
                dVar3.y(-1889877907);
                q6cVar3 = q6cVar2;
                do1 do1VarE6 = ko1.e(606594655, true, new e(q6cVar3, jR, textStyle, function6), dVar3, i7);
                dVar3.u();
                do1Var2 = do1VarE6;
            }
            long jS = pscVar.s(z2, z3, r45);
            if (function7 == null || !n(q6cVar5)) {
                dVar3.y(-1888924534);
                dVar3.u();
                do1VarE = null;
            } else {
                dVar3.y(-1889301555);
                do1VarE = ko1.e(-45078754, true, new f(q6cVar3, jS, textStyle, function7), dVar3, i7);
                dVar3.u();
            }
            long jP = pscVar.p(z2, z3, r45);
            if (function4 == null) {
                dVar3.y(-1888749663);
                dVar3.u();
                do1VarE2 = null;
            } else {
                dVar3.y(-1888749662);
                do1VarE2 = ko1.e(-1736293487, true, new c(jP, function4), dVar3, i7);
                dVar3.u();
            }
            long jW = pscVar.w(z2, z3, r45);
            if (function5 == null) {
                dVar3.y(-1888469888);
                dVar3.u();
                do1Var3 = null;
            } else {
                dVar3.y(-1888469887);
                do1 do1VarE7 = ko1.e(1334518521, true, new h(jW, function5), dVar3, 54);
                dVar3.u();
                do1Var3 = do1VarE7;
            }
            long jT = pscVar.t(z2, z3, zBooleanValue);
            if (function8 == null) {
                dVar3.y(-1888176380);
                dVar3.u();
                do1VarE3 = null;
                i8 = 1;
            } else {
                dVar3.y(-1888176379);
                g gVar = new g(jT, textStyle2, function8);
                i8 = 1;
                do1VarE3 = ko1.e(837168720, true, gVar, dVar3, 54);
                dVar3.u();
            }
            int i17 = j.$EnumSwitchMapping$0[textFieldType.ordinal()];
            if (i17 == i8) {
                androidx.compose.p004runtime.d dVar4 = dVar3;
                dVar4.y(-1887830698);
                u1.f(androidx.compose.ui.b.INSTANCE, function2, do1Var4, do1Var, do1VarE2, do1Var3, do1Var2, do1VarE, z, v1Var, new k(new PropertyReference0Impl(q6cVar) { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$1
                    public Object get() {
                        return ((q6c) ((CallableReference) this).receiver).getValue();
                    }
                }), ko1.e(-1729858187, true, new a(function9), dVar4, 54), do1VarE3, rx8Var, dVar4, ((i9 >> 3) & 112) | 6 | ((i10 << 21) & 234881024) | ((i9 << 18) & 1879048192), ((i10 >> 6) & 7168) | 48);
                dVar2 = dVar4;
                dVar2.u();
                Unit unit = Unit.a;
            } else {
                if (i17 != 2) {
                    androidx.compose.p004runtime.d dVar5 = dVar3;
                    dVar5.y(493292232);
                    dVar5.u();
                    throw new NoWhenBranchMatchedException();
                }
                dVar3.y(-1886778186);
                Object objR6 = dVar3.R();
                if (objR6 == companion2.a()) {
                    objR6 = s0.e(tsb.c(tsb.INSTANCE.b()), null, 2, null);
                    dVar3.L(objR6);
                }
                final o58 o58Var = (o58) objR6;
                do1 do1Var5 = do1VarE3;
                do1 do1Var6 = do1Var;
                do1 do1Var7 = do1VarE;
                do1 do1VarE8 = ko1.e(528115858, true, new Function2<androidx.compose.p004runtime.d, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1
                    public final void a(d dVar6, int i18) {
                        if (!dVar6.g((i18 & 3) != 2, i18 & 1)) {
                            dVar6.q();
                            return;
                        }
                        if (e.k()) {
                            e.o(528115858, i18, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:255)");
                        }
                        b bVarM = d1.m(pn6.b(b.INSTANCE, "Container"), new MutablePropertyReference0Impl(o58Var) { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1.1
                            public Object get() {
                                return ((o58) ((CallableReference) this).receiver).getValue();
                            }
                        }, TextFieldImplKt.H(v1Var), rx8Var);
                        Function2<d, Integer, Unit> function10 = function9;
                        ej7 ej7VarI = androidx.compose.p001foundation.layout.j.i(tc.INSTANCE.o(), true);
                        int iA = pp1.a(dVar6, 0);
                        gs1 gs1VarJ = dVar6.j();
                        b bVarE = ComposedModifierKt.e(dVar6, bVarM);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> function0B = companion3.b();
                        if (dVar6.G() == null) {
                            pp1.d();
                        }
                        dVar6.o();
                        if (dVar6.getInserting()) {
                            dVar6.W(function0B);
                        } else {
                            dVar6.k();
                        }
                        d dVarC = dud.c(dVar6);
                        dud.i(dVarC, ej7VarI, companion3.d());
                        dud.i(dVarC, gs1VarJ, companion3.f());
                        Function2<ComposeUiNode, Integer, Unit> function2C = companion3.c();
                        if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                            dVarC.L(Integer.valueOf(iA));
                            dVarC.e(Integer.valueOf(iA), function2C);
                        }
                        dud.i(dVarC, bVarE, companion3.e());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                        function10.invoke(dVar6, 0);
                        dVar6.m();
                        if (e.k()) {
                            e.n();
                        }
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        a((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }
                }, dVar3, 54);
                androidx.compose.ui.b.Companion companion3 = androidx.compose.ui.b.INSTANCE;
                k kVar = new k(new PropertyReference0Impl(q6cVar) { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$2
                    public Object get() {
                        return ((q6c) ((CallableReference) this).receiver).getValue();
                    }
                });
                boolean zX3 = ((i9 & 7168) == 2048 ? true : z4) | dVar3.x(q6cVar);
                Object objR7 = dVar3.R();
                if (zX3 || objR7 == companion2.a()) {
                    objR7 = new Function1() { // from class: com.google.android.etc
                        public final Object invoke(Object obj) {
                            return TextFieldImplKt.o(v1Var, q6cVar, o58Var, (tsb) obj);
                        }
                    };
                    dVar3.L(objR7);
                }
                androidx.compose.p004runtime.d dVar6 = dVar3;
                d1.j(companion3, function2, do1Var6, do1Var4, do1VarE2, do1Var3, do1Var2, do1Var7, z, v1Var, kVar, (Function1) objR7, do1VarE8, do1Var5, rx8Var, dVar6, ((i9 >> 3) & 112) | 6 | ((i10 << 21) & 234881024) | ((i9 << 18) & 1879048192), (57344 & (i10 >> 3)) | 384);
                dVar2 = dVar6;
                dVar2.u();
                Unit unit2 = Unit.a;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVar2 = dVarF;
            dVar2.q();
        }
        s6b s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.ftc
                public final Object invoke(Object obj, Object obj2) {
                    return TextFieldImplKt.r(textFieldType, charSequence, function2, v1Var, ps4Var, function3, function4, function5, function6, function7, function8, z, z2, z3, j26Var, rx8Var, pscVar, function9, i2, i3, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(q6c q6cVar) {
        return ((Number) q6cVar.getValue()).floatValue() > 0.0f;
    }

    private static final boolean n(q6c<Boolean> q6cVar) {
        return q6cVar.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(v1 v1Var, q6c q6cVar, o58 o58Var, tsb tsbVar) {
        if (v1Var instanceof v1.a) {
            return Unit.a;
        }
        float fFloatValue = ((Number) q6cVar.getValue()).floatValue();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (tsbVar.getPackedValue() >> 32)) * fFloatValue;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tsbVar.getPackedValue() & 4294967295L)) * fFloatValue;
        if (Float.intBitsToFloat((int) (((tsb) o58Var.getValue()).getPackedValue() >> 32)) != fIntBitsToFloat || Float.intBitsToFloat((int) (((tsb) o58Var.getValue()).getPackedValue() & 4294967295L)) != fIntBitsToFloat2) {
            o58Var.setValue(tsb.c(tsb.d((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L))));
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(q6c q6cVar) {
        return ((Number) q6cVar.getValue()).floatValue() > 0.0f;
    }

    private static final boolean q(q6c<Boolean> q6cVar) {
        return q6cVar.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(TextFieldType textFieldType, CharSequence charSequence, Function2 function2, v1 v1Var, ps4 ps4Var, Function2 function3, Function2 function4, Function2 function5, Function2 function6, Function2 function7, Function2 function8, boolean z, boolean z2, boolean z3, j26 j26Var, rx8 rx8Var, psc pscVar, Function2 function9, int i2, int i3, androidx.compose.p004runtime.d dVar, int i4) {
        l(textFieldType, charSequence, function2, v1Var, ps4Var, function3, function4, function5, function6, function7, function8, z, z2, z3, j26Var, rx8Var, pscVar, function9, dVar, saa.a(i2 | 1), saa.a(i3));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(long j2, TextStyle textStyle, Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, androidx.compose.p004runtime.d dVar, final int i2) {
        int i3;
        final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function3;
        final TextStyle textStyle2;
        final long j3;
        androidx.compose.p004runtime.d dVarF = dVar.F(396611577);
        if ((i2 & 6) == 0) {
            i3 = (dVarF.D(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dVarF.x(textStyle) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dVarF.T(function2) ? 256 : 128;
        }
        if (dVarF.g((i3 & 147) != 146, i3 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(396611577, i3, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:325)");
            }
            ns9.b(j2, textStyle, function2, dVarF, i3 & 1022);
            j3 = j2;
            textStyle2 = textStyle;
            function3 = function2;
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            function3 = function2;
            textStyle2 = textStyle;
            j3 = j2;
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.jtc
                public final Object invoke(Object obj, Object obj2) {
                    return TextFieldImplKt.u(j3, textStyle2, function3, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(final long j2, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, androidx.compose.p004runtime.d dVar, final int i2) {
        int i3;
        androidx.compose.p004runtime.d dVarF = dVar.F(590397809);
        if ((i2 & 6) == 0) {
            i3 = (dVarF.D(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dVarF.T(function2) ? 32 : 16;
        }
        if (dVarF.g((i3 & 19) != 18, i3 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(590397809, i3, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:330)");
            }
            fs1.c(cz1.a().d(ei1.l(j2)), function2, dVarF, (i3 & 112) | os9.i);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.ktc
                public final Object invoke(Object obj, Object obj2) {
                    return TextFieldImplKt.v(j2, function2, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(long j2, TextStyle textStyle, Function2 function2, int i2, androidx.compose.p004runtime.d dVar, int i3) {
        s(j2, textStyle, function2, dVar, saa.a(i2 | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(long j2, Function2 function2, int i2, androidx.compose.p004runtime.d dVar, int i3) {
        t(j2, function2, dVar, saa.a(i2 | 1));
        return Unit.a;
    }

    public static final q6c<BorderStroke> y(boolean z, boolean z2, boolean z3, psc pscVar, float f2, float f3, androidx.compose.p004runtime.d dVar, int i2) {
        q6c<ei1> q6cVarR;
        q6c<ff3> q6cVarR2;
        androidx.compose.p004runtime.d dVar2 = dVar;
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.o(2047013045, i2, -1, "androidx.compose.material3.internal.animateBorderStrokeAsState (TextFieldImpl.kt:472)");
        }
        long jN = pscVar.n(z, z2, z3);
        xa4 xa4VarB = d08.b(MotionSchemeKeyTokens.FastEffects, dVar2, 6);
        if (z) {
            dVar2.y(-1674507999);
            q6cVarR = osb.b(jN, xa4VarB, null, null, dVar, 0, 12);
            dVar2 = dVar;
            dVar2.u();
        } else {
            dVar2.y(-1674427244);
            q6cVarR = p0.r(ei1.l(jN), dVar2, 0);
            dVar2.u();
        }
        q6c<ei1> q6cVar = q6cVarR;
        xa4 xa4VarB2 = d08.b(MotionSchemeKeyTokens.FastSpatial, dVar2, 6);
        if (z) {
            dVar2.y(-1674245832);
            q6cVarR2 = AnimateAsStateKt.d(z3 ? f2 : f3, xa4VarB2, null, null, dVar2, 0, 12);
            dVar2.u();
        } else {
            dVar2.y(-1674063769);
            q6cVarR2 = p0.r(ff3.e(f3), dVar2, (i2 >> 15) & 14);
            dVar2.u();
        }
        q6c<BorderStroke> q6cVarR3 = p0.r(pr0.a(q6cVarR2.getValue().getValue(), q6cVar.getValue().getValue()), dVar2, 0);
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.n();
        }
        return q6cVarR3;
    }

    public static final androidx.compose.ui.b z(androidx.compose.ui.b bVar, boolean z, final String str) {
        return z ? afb.d(bVar, false, new Function1() { // from class: com.google.android.htc
            public final Object invoke(Object obj) {
                return TextFieldImplKt.A(str, (nfb) obj);
            }
        }, 1, null) : bVar;
    }
}
