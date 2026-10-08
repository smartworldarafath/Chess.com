package androidx.compose.p001foundation.text;

import android.view.KeyEvent;
import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p001foundation.text.CoreTextFieldKt;
import androidx.compose.p001foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter_androidKt;
import androidx.compose.p001foundation.text.selection.SelectedTextType;
import androidx.compose.p001foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.p001foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p001foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.p0;
import androidx.compose.p004runtime.snapshots.g;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.a0;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.b;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.x;
import com.google.android.lq2;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.android.qjd;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.inputmethod.CoreTextFieldSemanticsModifier;
import com.google.inputmethod.SelectionColors;
import com.google.inputmethod.SelectionHandleInfo;
import com.google.inputmethod.SolidColor;
import com.google.inputmethod.TextFieldValue;
import com.google.inputmethod.TextLayoutResult;
import com.google.inputmethod.TransformedText;
import com.google.inputmethod.a39;
import com.google.inputmethod.afb;
import com.google.inputmethod.asc;
import com.google.inputmethod.atc;
import com.google.inputmethod.c65;
import com.google.inputmethod.co8;
import com.google.inputmethod.cqb;
import com.google.inputmethod.csc;
import com.google.inputmethod.cu0;
import com.google.inputmethod.d22;
import com.google.inputmethod.df9;
import com.google.inputmethod.dfa;
import com.google.inputmethod.dj7;
import com.google.inputmethod.dl4;
import com.google.inputmethod.dud;
import com.google.inputmethod.dxc;
import com.google.inputmethod.ei1;
import com.google.inputmethod.ej7;
import com.google.inputmethod.f43;
import com.google.inputmethod.f66;
import com.google.inputmethod.feb;
import com.google.inputmethod.fj7;
import com.google.inputmethod.fvc;
import com.google.inputmethod.fz1;
import com.google.inputmethod.gba;
import com.google.inputmethod.gs1;
import com.google.inputmethod.gsc;
import com.google.inputmethod.h66;
import com.google.inputmethod.hcc;
import com.google.inputmethod.huc;
import com.google.inputmethod.hxc;
import com.google.inputmethod.hyb;
import com.google.inputmethod.jd3;
import com.google.inputmethod.jf1;
import com.google.inputmethod.jzc;
import com.google.inputmethod.k07;
import com.google.inputmethod.k0b;
import com.google.inputmethod.kd3;
import com.google.inputmethod.kn6;
import com.google.inputmethod.ko1;
import com.google.inputmethod.ma0;
import com.google.inputmethod.na0;
import com.google.inputmethod.nce;
import com.google.inputmethod.nfb;
import com.google.inputmethod.nk;
import com.google.inputmethod.o0e;
import com.google.inputmethod.oi6;
import com.google.inputmethod.ok4;
import com.google.inputmethod.pp1;
import com.google.inputmethod.q6c;
import com.google.inputmethod.qaa;
import com.google.inputmethod.qi6;
import com.google.inputmethod.qu0;
import com.google.inputmethod.r48;
import com.google.inputmethod.rn8;
import com.google.inputmethod.rsd;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.tc;
import com.google.inputmethod.tuc;
import com.google.inputmethod.ugc;
import com.google.inputmethod.up1;
import com.google.inputmethod.vn3;
import com.google.inputmethod.wi6;
import com.google.inputmethod.wxc;
import com.google.inputmethod.xq8;
import com.google.inputmethod.xvc;
import com.google.inputmethod.y92;
import com.google.inputmethod.ysc;
import com.google.inputmethod.yz6;
import com.google.inputmethod.yzc;
import com.google.inputmethod.zn8;
import com.google.inputmethod.zo1;
import com.google.inputmethod.zsc;
import com.google.inputmethod.zv8;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.b0;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aã\u0001\u0010 \u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00112\u001a\b\u0002\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001c\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0001¢\u0006\u0004\b \u0010!\u001a-\u0010%\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u001cH\u0003¢\u0006\u0004\b%\u0010&\u001a#\u0010)\u001a\u00020\u0005*\u00020\u00052\u0006\u0010(\u001a\u00020'2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b)\u0010*\u001a'\u0010.\u001a\u00020\u00032\u0006\u0010(\u001a\u00020'2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u0011H\u0000¢\u0006\u0004\b.\u0010/\u001a7\u00104\u001a\u00020\u00032\u0006\u00101\u001a\u0002002\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105\u001a\u0017\u00106\u001a\u00020\u00032\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b6\u00107\u001a4\u0010<\u001a\u00020\u0003*\u0002082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\u000b2\u0006\u00103\u001a\u000202H\u0080@¢\u0006\u0004\b<\u0010=\u001a\u001f\u0010?\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\"2\u0006\u0010>\u001a\u00020\u0011H\u0003¢\u0006\u0004\b?\u0010@\u001a\u0017\u0010A\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\bA\u0010B\u001a+\u0010C\u001a\u00020\u0005*\u00020\u00052\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00103\u001a\u000202H\u0000¢\u0006\u0004\bC\u0010D\u001a'\u0010E\u001a\u00020\u00032\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\bE\u0010F\u001a#\u0010J\u001a\u00020\u0005*\u00020\u00052\u0006\u0010G\u001a\u00020\"2\u0006\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\bJ\u0010K¨\u0006M²\u0006\f\u0010L\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, d2 = {"Lcom/google/android/cwc;", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/b;", "modifier", "Landroidx/compose/ui/text/y;", "textStyle", "Lcom/google/android/nce;", "visualTransformation", "Lcom/google/android/vxc;", "onTextLayout", "Lcom/google/android/r48;", "interactionSource", "Lcom/google/android/qu0;", "cursorBrush", "", "softWrap", "", "maxLines", "minLines", "Landroidx/compose/ui/text/input/b;", "imeOptions", "Landroidx/compose/foundation/text/m;", "keyboardActions", "enabled", "readOnly", "Lkotlin/Function0;", "decorationBox", "Landroidx/compose/foundation/text/u;", "textScrollerPosition", "w", "(Lcom/google/android/cwc;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/b;Landroidx/compose/ui/text/y;Lcom/google/android/nce;Lkotlin/jvm/functions/Function1;Lcom/google/android/r48;Lcom/google/android/qu0;ZIILandroidx/compose/ui/text/input/b;Landroidx/compose/foundation/text/m;ZZLcom/google/android/ps4;Landroidx/compose/foundation/text/u;Landroidx/compose/runtime/d;III)V", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "content", "P", "(Landroidx/compose/ui/b;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "Lcom/google/android/k07;", "state", "g0", "(Landroidx/compose/ui/b;Lcom/google/android/k07;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)Landroidx/compose/ui/b;", "Landroidx/compose/ui/focus/f;", "focusRequester", "allowKeyboard", "h0", "(Lcom/google/android/k07;Landroidx/compose/ui/focus/f;Z)V", "Lcom/google/android/dxc;", "textInputService", "Lcom/google/android/zn8;", "offsetMapping", "i0", "(Lcom/google/android/dxc;Lcom/google/android/k07;Lcom/google/android/cwc;Landroidx/compose/ui/text/input/b;Lcom/google/android/zn8;)V", "e0", "(Lcom/google/android/k07;)V", "Lcom/google/android/cu0;", "Lcom/google/android/asc;", "textDelegate", "textLayoutResult", "b0", "(Lcom/google/android/cu0;Lcom/google/android/cwc;Lcom/google/android/asc;Lcom/google/android/vxc;Lcom/google/android/zn8;Lcom/google/android/q22;)Ljava/lang/Object;", "show", "R", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;ZLandroidx/compose/runtime/d;I)V", "T", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/d;I)V", "c0", "(Landroidx/compose/ui/b;Lcom/google/android/k07;Lcom/google/android/cwc;Lcom/google/android/zn8;)Landroidx/compose/ui/b;", "f0", "(Lcom/google/android/k07;Lcom/google/android/cwc;Lcom/google/android/zn8;)V", "textFieldSelectionManager", "Lcom/google/android/ta2;", "coroutineScope", "a0", "(Landroidx/compose/ui/b;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lcom/google/android/ta2;)Landroidx/compose/ui/b;", "writeable", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CoreTextFieldKt {

    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\u000b\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001a\u00020\u000e*\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"androidx/compose/foundation/text/CoreTextFieldKt$a", "Lcom/google/android/ej7;", "Landroidx/compose/ui/layout/j;", "", "Lcom/google/android/dj7;", "measurables", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/j;Ljava/util/List;J)Lcom/google/android/fj7;", "measure", "Lcom/google/android/h66;", "Lcom/google/android/f66;", "", "height", "maxIntrinsicWidth", "(Lcom/google/android/h66;Ljava/util/List;I)I", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements ej7 {
        final /* synthetic */ k07 a;
        final /* synthetic */ Function1<TextLayoutResult, Unit> b;
        final /* synthetic */ TextFieldValue c;
        final /* synthetic */ zn8 d;
        final /* synthetic */ f43 e;
        final /* synthetic */ int f;

        /* JADX WARN: Multi-variable type inference failed */
        a(k07 k07Var, Function1<? super TextLayoutResult, Unit> function1, TextFieldValue textFieldValue, zn8 zn8Var, f43 f43Var, int i) {
            this.a = k07Var;
            this.b = function1;
            this.c = textFieldValue;
            this.d = zn8Var;
            this.e = f43Var;
            this.f = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(o.a aVar) {
            return Unit.a;
        }

        @Override // com.google.inputmethod.ej7
        public int maxIntrinsicWidth(h66 h66Var, List<? extends f66> list, int i) {
            this.a.getTextDelegate().m(h66Var.getLayoutDirection());
            return this.a.getTextDelegate().c();
        }

        @Override // com.google.inputmethod.ej7
        /* JADX INFO: renamed from: measure-3p2s80s */
        public fj7 mo0measure3p2s80s(j jVar, List<? extends dj7> list, long j) {
            g.Companion companion = g.INSTANCE;
            k07 k07Var = this.a;
            g gVarD = companion.d();
            Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
            g gVarE = companion.e(gVarD);
            try {
                wxc wxcVarN = k07Var.n();
                companion.l(gVarD, gVarE, function1G);
                TextLayoutResult value = wxcVarN != null ? wxcVarN.getValue() : null;
                Triple<Integer, Integer, TextLayoutResult> tripleF = r.INSTANCE.f(this.a.getTextDelegate(), j, jVar.getLayoutDirection(), value);
                int iIntValue = ((Number) tripleF.a()).intValue();
                int iIntValue2 = ((Number) tripleF.b()).intValue();
                TextLayoutResult textLayoutResult = (TextLayoutResult) tripleF.c();
                if (!Intrinsics.e(value, textLayoutResult)) {
                    this.a.Q(new wxc(textLayoutResult, null, wxcVarN != null ? wxcVarN.getDecorationBoxCoordinates() : null, 2, null));
                    this.b.invoke(textLayoutResult);
                    CoreTextFieldKt.f0(this.a, this.c, this.d);
                }
                this.a.R(this.e.O0(this.f == 1 ? csc.a(textLayoutResult.m(0)) : 0));
                return jVar.h2(iIntValue, iIntValue2, b0.n(new Pair[]{qjd.a(AlignmentLineKt.a(), Integer.valueOf(Math.round(textLayoutResult.getFirstBaseline()))), qjd.a(AlignmentLineKt.b(), Integer.valueOf(Math.round(textLayoutResult.getLastBaseline())))}), new Function1() { // from class: com.google.android.i92
                    public final Object invoke(Object obj) {
                        return CoreTextFieldKt.a.b((o.a) obj);
                    }
                });
            } catch (Throwable th) {
                companion.l(gVarD, gVarE, function1G);
                throw th;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/foundation/text/CoreTextFieldKt$b", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements jd3 {
        final /* synthetic */ TextFieldSelectionManager a;

        public b(TextFieldSelectionManager textFieldSelectionManager) {
            this.a = textFieldSelectionManager;
        }

        @Override // com.google.inputmethod.jd3
        public void dispose() {
            this.a.r0();
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/foundation/text/CoreTextFieldKt$c", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements jd3 {
        @Override // com.google.inputmethod.jd3
        public void dispose() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements co8 {
        final /* synthetic */ long a;

        d(long j) {
            this.a = j;
        }

        @Override // com.google.inputmethod.co8
        public final long a() {
            return this.a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function1<oi6, Boolean> {
        final /* synthetic */ k07 a;
        final /* synthetic */ TextFieldSelectionManager b;

        e(k07 k07Var, TextFieldSelectionManager textFieldSelectionManager) {
            this.a = k07Var;
            this.b = textFieldSelectionManager;
        }

        public final Boolean a(KeyEvent keyEvent) {
            boolean z;
            if (this.a.g() == HandleState.Selection && qi6.a(keyEvent)) {
                z = true;
                TextFieldSelectionManager.L(this.b, null, 1, null);
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((oi6) obj).getNativeKeyEvent());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.b A(TextFieldSelectionManager textFieldSelectionManager) {
        return textFieldSelectionManager.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(k07 k07Var, boolean z, boolean z2, dxc dxcVar, TextFieldValue textFieldValue, ImeOptions imeOptions, zn8 zn8Var, TextFieldSelectionManager textFieldSelectionManager, ta2 ta2Var, cu0 cu0Var, dl4 dl4Var) {
        wxc wxcVarN;
        if (k07Var.h() == dl4Var.a()) {
            return Unit.a;
        }
        k07Var.L(dl4Var.a());
        if (k07Var.h() && z && !z2) {
            i0(dxcVar, k07Var, textFieldValue, imeOptions, zn8Var);
        } else {
            e0(k07Var);
        }
        if (dl4Var.a() && (wxcVarN = k07Var.n()) != null) {
            rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(cu0Var, textFieldValue, k07Var, wxcVarN, zn8Var, null), 3, (Object) null);
        }
        if (!dl4Var.a()) {
            TextFieldSelectionManager.L(textFieldSelectionManager, null, 1, null);
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C(q6c<Boolean> q6cVar) {
        return q6cVar.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(k07 k07Var, boolean z, a0 a0Var, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, zn8 zn8Var, kn6 kn6Var) {
        hxc inputSession;
        k07Var.P(kn6Var);
        wxc wxcVarN = k07Var.n();
        if (wxcVarN != null) {
            wxcVarN.i(kn6Var);
        }
        if (z) {
            if (k07Var.g() == HandleState.Selection) {
                if (k07Var.w() && a0Var.b()) {
                    textFieldSelectionManager.V0();
                } else {
                    textFieldSelectionManager.r0();
                }
                k07Var.W(TextFieldSelectionManager_androidKt.y(textFieldSelectionManager, true));
                k07Var.V(TextFieldSelectionManager_androidKt.y(textFieldSelectionManager, false));
                k07Var.T(x.h(textFieldValue.getSelection()));
            } else if (k07Var.g() == HandleState.Cursor) {
                k07Var.T(TextFieldSelectionManager_androidKt.y(textFieldSelectionManager, true));
            }
            f0(k07Var, textFieldValue, zn8Var);
            wxc wxcVarN2 = k07Var.n();
            if (wxcVarN2 != null && (inputSession = k07Var.getInputSession()) != null && k07Var.h()) {
                r.INSTANCE.o(inputSession, textFieldValue, zn8Var, wxcVarN2);
            }
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd3 E(TextFieldSelectionManager textFieldSelectionManager, kd3 kd3Var) {
        return new b(textFieldSelectionManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd3 F(k07 k07Var, dxc dxcVar, TextFieldValue textFieldValue, ImeOptions imeOptions, kd3 kd3Var) {
        if (k07Var.h()) {
            k07Var.N(r.INSTANCE.l(dxcVar, textFieldValue, k07Var.getProcessor(), imeOptions, k07Var.r(), k07Var.p()));
        }
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(boolean z, androidx.compose.p001foundation.text.input.internal.b bVar) {
        if (z) {
            bVar.k();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(k07 k07Var, qu0 qu0Var, fz1 fz1Var) {
        fz1Var.j1();
        if (k07Var.e() || k07Var.k()) {
            DrawScope.U0(fz1Var, qu0Var, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(k07 k07Var, kn6 kn6Var) {
        wxc wxcVarN = k07Var.n();
        if (wxcVarN != null) {
            wxcVarN.h(kn6Var);
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(ps4 ps4Var, final k07 k07Var, final TextStyle textStyle, final int i, final int i2, final u uVar, final TextFieldValue textFieldValue, final nce nceVar, final androidx.compose.ui.b bVar, final androidx.compose.ui.b bVar2, final androidx.compose.ui.b bVar3, final androidx.compose.ui.b bVar4, final cu0 cu0Var, final TextFieldSelectionManager textFieldSelectionManager, final boolean z, final boolean z2, final Function1 function1, final zn8 zn8Var, final f43 f43Var, androidx.compose.p004runtime.d dVar, int i3) {
        if (dVar.g((i3 & 3) != 2, i3 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-814563849, i3, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:548)");
            }
            ps4Var.invoke(ko1.e(-44346382, true, new Function2() { // from class: com.google.android.t82
                public final Object invoke(Object obj, Object obj2) {
                    return CoreTextFieldKt.K(k07Var, textStyle, i, i2, uVar, textFieldValue, nceVar, bVar, bVar2, bVar3, bVar4, cu0Var, textFieldSelectionManager, z, z2, function1, zn8Var, f43Var, (d) obj, ((Integer) obj2).intValue());
                }
            }, dVar, 54), dVar, 6);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVar.q();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(final k07 k07Var, TextStyle textStyle, int i, final int i2, u uVar, final TextFieldValue textFieldValue, nce nceVar, androidx.compose.ui.b bVar, androidx.compose.ui.b bVar2, androidx.compose.ui.b bVar3, androidx.compose.ui.b bVar4, cu0 cu0Var, final TextFieldSelectionManager textFieldSelectionManager, final boolean z, final boolean z2, final Function1 function1, final zn8 zn8Var, final f43 f43Var, androidx.compose.p004runtime.d dVar, int i3) {
        if (dVar.g((i3 & 3) != 2, i3 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-44346382, i3, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:551)");
            }
            androidx.compose.ui.b bVarB = HeightInLinesModifierKt.b(SizeKt.k(androidx.compose.ui.b.INSTANCE, k07Var.o(), 0.0f, 2, null), textStyle, i, i2);
            boolean zT = dVar.T(k07Var);
            Object objR = dVar.R();
            if (zT || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new Function0() { // from class: com.google.android.u82
                    public final Object invoke() {
                        return CoreTextFieldKt.L(k07Var);
                    }
                };
                dVar.L(objR);
            }
            cqb.b(androidx.compose.p001foundation.relocation.c.b(xvc.i(tuc.b(bVarB, uVar, textFieldValue, nceVar, (Function0) objR).then(bVar).then(bVar2), textStyle).then(bVar3).then(bVar4), cu0Var), ko1.e(1412697320, true, new Function2() { // from class: com.google.android.v82
                public final Object invoke(Object obj, Object obj2) {
                    return CoreTextFieldKt.M(textFieldSelectionManager, k07Var, z, z2, function1, textFieldValue, zn8Var, f43Var, i2, (d) obj, ((Integer) obj2).intValue());
                }
            }, dVar, 54), dVar, 48, 0);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVar.q();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wxc L(k07 k07Var) {
        return k07Var.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x00b2  */
    public static final Unit M(TextFieldSelectionManager textFieldSelectionManager, k07 k07Var, boolean z, boolean z2, Function1 function1, TextFieldValue textFieldValue, zn8 zn8Var, f43 f43Var, int i, androidx.compose.p004runtime.d dVar, int i2) {
        boolean z3;
        if (dVar.g((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(1412697320, i2, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:572)");
            }
            a aVar = new a(k07Var, function1, textFieldValue, zn8Var, f43Var, i);
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            int iHashCode = Long.hashCode(pp1.b(dVar, 0));
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, companion);
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
            dud.i(dVarC, aVar, companion2.d());
            dud.i(dVarC, gs1VarJ, companion2.f());
            dud.i(dVarC, Integer.valueOf(iHashCode), companion2.c());
            dud.g(dVarC, companion2.a());
            dud.i(dVarC, bVarE, companion2.e());
            dVar.m();
            if (k07Var.g() != HandleState.None && k07Var.m() != null) {
                kn6 kn6VarM = k07Var.m();
                Intrinsics.g(kn6VarM);
                z3 = kn6VarM.b() && z;
            }
            R(textFieldSelectionManager, z3, dVar, 0);
            if (k07Var.g() == HandleState.Cursor && !z2 && z) {
                dVar.y(-714666198);
                T(textFieldSelectionManager, dVar, 0);
                dVar.u();
            } else {
                dVar.y(-714589318);
                dVar.u();
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVar.q();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(TextFieldValue textFieldValue, Function1 function1, androidx.compose.ui.b bVar, TextStyle textStyle, nce nceVar, Function1 function2, r48 r48Var, qu0 qu0Var, boolean z, int i, int i2, ImeOptions imeOptions, m mVar, boolean z2, boolean z3, ps4 ps4Var, u uVar, int i3, int i4, int i5, androidx.compose.p004runtime.d dVar, int i6) {
        w(textFieldValue, function1, bVar, textStyle, nceVar, function2, r48Var, qu0Var, z, i, i2, imeOptions, mVar, z2, z3, ps4Var, uVar, dVar, saa.a(i3 | 1), saa.a(i4), i5);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u O(Orientation orientation) {
        return new u(orientation, 0.0f, 2, null);
    }

    private static final void P(final androidx.compose.ui.b bVar, final TextFieldSelectionManager textFieldSelectionManager, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, androidx.compose.p004runtime.d dVar, final int i) {
        int i2;
        androidx.compose.p004runtime.d dVarF = dVar.F(2036174316);
        if ((i & 6) == 0) {
            i2 = (dVarF.x(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.T(textFieldSelectionManager) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dVarF.T(function2) ? 256 : 128;
        }
        if (dVarF.g((i2 & 147) != 146, i2 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(2036174316, i2, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:661)");
            }
            ej7 ej7VarI = androidx.compose.p001foundation.layout.j.i(tc.INSTANCE.o(), true);
            int iHashCode = Long.hashCode(pp1.b(dVarF, 0));
            gs1 gs1VarJ = dVarF.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, bVar);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion.b();
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
            dud.i(dVarC, ej7VarI, companion.d());
            dud.i(dVarC, gs1VarJ, companion.f());
            dud.i(dVarC, Integer.valueOf(iHashCode), companion.c());
            dud.g(dVarC, companion.a());
            dud.i(dVarC, bVarE, companion.e());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            d22.b(textFieldSelectionManager, function2, dVarF, (i2 >> 3) & 126);
            dVarF.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.r82
                public final Object invoke(Object obj, Object obj2) {
                    return CoreTextFieldKt.Q(bVar, textFieldSelectionManager, function2, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(androidx.compose.ui.b bVar, TextFieldSelectionManager textFieldSelectionManager, Function2 function2, int i, androidx.compose.p004runtime.d dVar, int i2) {
        P(bVar, textFieldSelectionManager, function2, dVar, saa.a(i | 1));
        return Unit.a;
    }

    private static final void R(final TextFieldSelectionManager textFieldSelectionManager, final boolean z, androidx.compose.p004runtime.d dVar, final int i) {
        int i2;
        wxc wxcVarN;
        TextLayoutResult value;
        androidx.compose.p004runtime.d dVarF = dVar.F(626339208);
        if ((i & 6) == 0) {
            i2 = (dVarF.T(textFieldSelectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.A(z) ? 32 : 16;
        }
        if (dVarF.g((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(626339208, i2, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1014)");
            }
            if (z) {
                dVarF.y(1530097388);
                k07 state = textFieldSelectionManager.getState();
                TextLayoutResult textLayoutResult = null;
                if (state != null && (wxcVarN = state.n()) != null && (value = wxcVarN.getValue()) != null) {
                    k07 state2 = textFieldSelectionManager.getState();
                    if (!(state2 != null ? state2.getIsLayoutResultStale() : true)) {
                        textLayoutResult = value;
                    }
                }
                if (textLayoutResult == null) {
                    dVarF.y(1530097387);
                    dVarF.u();
                } else {
                    dVarF.y(1530097388);
                    if (x.h(textFieldSelectionManager.p0().getSelection())) {
                        dVarF.y(2110860558);
                        dVarF.u();
                    } else {
                        dVarF.y(2109807302);
                        int iB = textFieldSelectionManager.getOffsetMapping().b(x.n(textFieldSelectionManager.p0().getSelection()));
                        int iB2 = textFieldSelectionManager.getOffsetMapping().b(x.i(textFieldSelectionManager.p0().getSelection()));
                        ResolvedTextDirection resolvedTextDirectionC = textLayoutResult.c(iB);
                        ResolvedTextDirection resolvedTextDirectionC2 = textLayoutResult.c(Math.max(iB2 - 1, 0));
                        k07 state3 = textFieldSelectionManager.getState();
                        if (state3 == null || !state3.y()) {
                            dVarF.y(2110490542);
                            dVarF.u();
                        } else {
                            dVarF.y(2110225306);
                            fvc.h(true, resolvedTextDirectionC, textFieldSelectionManager, dVarF, ((i2 << 6) & 896) | 6);
                            dVarF.u();
                        }
                        k07 state4 = textFieldSelectionManager.getState();
                        if (state4 == null || !state4.x()) {
                            dVarF.y(2110838734);
                            dVarF.u();
                        } else {
                            dVarF.y(2110574459);
                            fvc.h(false, resolvedTextDirectionC2, textFieldSelectionManager, dVarF, ((i2 << 6) & 896) | 6);
                            dVarF.u();
                        }
                        dVarF.u();
                    }
                    k07 state5 = textFieldSelectionManager.getState();
                    if (state5 != null) {
                        if (textFieldSelectionManager.t0()) {
                            state5.U(false);
                        }
                        if (state5.h()) {
                            if (state5.w()) {
                                textFieldSelectionManager.V0();
                            } else {
                                textFieldSelectionManager.r0();
                            }
                        }
                        Unit unit = Unit.a;
                    }
                    dVarF.u();
                }
                dVarF.u();
            } else {
                dVarF.y(1989076778);
                dVarF.u();
                textFieldSelectionManager.r0();
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.z82
                public final Object invoke(Object obj, Object obj2) {
                    return CoreTextFieldKt.S(textFieldSelectionManager, z, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i, androidx.compose.p004runtime.d dVar, int i2) {
        R(textFieldSelectionManager, z, dVar, saa.a(i | 1));
        return Unit.a;
    }

    public static final void T(final TextFieldSelectionManager textFieldSelectionManager, androidx.compose.p004runtime.d dVar, final int i) {
        int i2;
        androidx.compose.ui.text.b bVarO0;
        androidx.compose.p004runtime.d dVarF = dVar.F(-1436003720);
        if ((i & 6) == 0) {
            i2 = (dVarF.T(textFieldSelectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (dVarF.g((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1436003720, i2, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1061)");
            }
            k07 state = textFieldSelectionManager.getState();
            if (state == null || !state.v() || (bVarO0 = textFieldSelectionManager.o0()) == null || bVarO0.length() <= 0) {
                dVarF.y(-2111042550);
                dVarF.u();
            } else {
                dVarF.y(-2112351432);
                boolean zX = dVarF.x(textFieldSelectionManager);
                Object objR = dVarF.R();
                if (zX || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                    objR = textFieldSelectionManager.H();
                    dVarF.L(objR);
                }
                final gsc gscVar = (gsc) objR;
                final long jV = textFieldSelectionManager.V((f43) dVarF.v(CompositionLocalsKt.g()));
                boolean zD = dVarF.D(jV);
                Object objR2 = dVarF.R();
                if (zD || objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                    objR2 = new d(jV);
                    dVarF.L(objR2);
                }
                co8 co8Var = (co8) objR2;
                androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
                boolean zT = dVarF.T(gscVar) | dVarF.T(textFieldSelectionManager);
                Object objR3 = dVarF.R();
                if (zT || objR3 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                    objR3 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1

                        /* JADX INFO: renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1, reason: invalid class name */
                        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
                        @lq2(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1", f = "CoreTextField.kt", l = {}, m = "invokeSuspend", v = 1)
                        static final class AnonymousClass1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
                            final /* synthetic */ TextFieldSelectionManager $manager;
                            final /* synthetic */ gsc $observer;
                            final /* synthetic */ df9 $this_pointerInput;
                            private /* synthetic */ Object L$0;
                            int label;

                            /* JADX INFO: renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1, reason: invalid class name and collision with other inner class name */
                            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
                            @lq2(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1", f = "CoreTextField.kt", l = {1074}, m = "invokeSuspend", v = 1)
                            static final class C00241 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
                                final /* synthetic */ gsc $observer;
                                final /* synthetic */ df9 $this_pointerInput;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C00241(df9 df9Var, gsc gscVar, q22<? super C00241> q22Var) {
                                    super(2, q22Var);
                                    this.$this_pointerInput = df9Var;
                                    this.$observer = gscVar;
                                }

                                public final q22<Unit> create(Object obj, q22<?> q22Var) {
                                    return new C00241(this.$this_pointerInput, this.$observer, q22Var);
                                }

                                public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
                                    return create(ta2Var, q22Var).invokeSuspend(Unit.a);
                                }

                                public final Object invokeSuspend(Object obj) {
                                    Object objG = a.g();
                                    int i = this.label;
                                    if (i == 0) {
                                        f.b(obj);
                                        df9 df9Var = this.$this_pointerInput;
                                        gsc gscVar = this.$observer;
                                        this.label = 1;
                                        if (LongPressTextDragObserverKt.g(df9Var, gscVar, this) == objG) {
                                            return objG;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        f.b(obj);
                                    }
                                    return Unit.a;
                                }
                            }

                            /* JADX INFO: renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2, reason: invalid class name */
                            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
                            @lq2(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2", f = "CoreTextField.kt", l = {1077}, m = "invokeSuspend", v = 1)
                            static final class AnonymousClass2 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
                                final /* synthetic */ TextFieldSelectionManager $manager;
                                final /* synthetic */ df9 $this_pointerInput;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass2(df9 df9Var, TextFieldSelectionManager textFieldSelectionManager, q22<? super AnonymousClass2> q22Var) {
                                    super(2, q22Var);
                                    this.$this_pointerInput = df9Var;
                                    this.$manager = textFieldSelectionManager;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit l(TextFieldSelectionManager textFieldSelectionManager, rn8 rn8Var) {
                                    textFieldSelectionManager.V0();
                                    return Unit.a;
                                }

                                public final q22<Unit> create(Object obj, q22<?> q22Var) {
                                    return new AnonymousClass2(this.$this_pointerInput, this.$manager, q22Var);
                                }

                                public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
                                    return create(ta2Var, q22Var).invokeSuspend(Unit.a);
                                }

                                public final Object invokeSuspend(Object obj) {
                                    Object objG = a.g();
                                    int i = this.label;
                                    if (i == 0) {
                                        f.b(obj);
                                        df9 df9Var = this.$this_pointerInput;
                                        final TextFieldSelectionManager textFieldSelectionManager = this.$manager;
                                        Function1 function1 = 
                                        /*  JADX ERROR: Method code generation error
                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0020: CONSTRUCTOR (r5v0 'function1' kotlin.jvm.functions.Function1) = (r10v1 'textFieldSelectionManager' androidx.compose.foundation.text.selection.TextFieldSelectionManager A[DONT_INLINE]) A[DECLARE_VAR, MD:(androidx.compose.foundation.text.selection.TextFieldSelectionManager):void (m)] call: androidx.compose.foundation.text.e.<init>(androidx.compose.foundation.text.selection.TextFieldSelectionManager):void type: CONSTRUCTOR in method: androidx.compose.foundation.text.CoreTextFieldKt.TextFieldCursorHandle.2.1.1.2.invokeSuspend(java.lang.Object):java.lang.Object, file: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.compose.foundation.text.e, state: NOT_LOADED
                                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                            	... 21 more
                                            */
                                        /*
                                            this = this;
                                            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
                                            int r1 = r9.label
                                            r2 = 1
                                            if (r1 == 0) goto L17
                                            if (r1 != r2) goto Lf
                                            kotlin.f.b(r10)
                                            goto L32
                                        Lf:
                                            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                            r10.<init>(r0)
                                            throw r10
                                        L17:
                                            kotlin.f.b(r10)
                                            com.google.android.df9 r1 = r9.$this_pointerInput
                                            androidx.compose.foundation.text.selection.TextFieldSelectionManager r10 = r9.$manager
                                            androidx.compose.foundation.text.e r5 = new androidx.compose.foundation.text.e
                                            r5.<init>(r10)
                                            r9.label = r2
                                            r2 = 0
                                            r3 = 0
                                            r4 = 0
                                            r7 = 7
                                            r8 = 0
                                            r6 = r9
                                            java.lang.Object r10 = androidx.compose.p001foundation.gestures.TapGestureDetectorKt.i(r1, r2, r3, r4, r5, r6, r7, r8)
                                            if (r10 != r0) goto L32
                                            return r0
                                        L32:
                                            kotlin.Unit r10 = kotlin.Unit.a
                                            return r10
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1.AnonymousClass1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass1(df9 df9Var, gsc gscVar, TextFieldSelectionManager textFieldSelectionManager, q22<? super AnonymousClass1> q22Var) {
                                    super(2, q22Var);
                                    this.$this_pointerInput = df9Var;
                                    this.$observer = gscVar;
                                    this.$manager = textFieldSelectionManager;
                                }

                                public final q22<Unit> create(Object obj, q22<?> q22Var) {
                                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_pointerInput, this.$observer, this.$manager, q22Var);
                                    anonymousClass1.L$0 = obj;
                                    return anonymousClass1;
                                }

                                public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
                                    return create(ta2Var, q22Var).invokeSuspend(Unit.a);
                                }

                                public final Object invokeSuspend(Object obj) {
                                    a.g();
                                    if (this.label != 0) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    f.b(obj);
                                    ta2 ta2Var = (ta2) this.L$0;
                                    CoroutineStart coroutineStart = CoroutineStart.d;
                                    rw0.d(ta2Var, (CoroutineContext) null, coroutineStart, new C00241(this.$this_pointerInput, this.$observer, null), 1, (Object) null);
                                    rw0.d(ta2Var, (CoroutineContext) null, coroutineStart, new AnonymousClass2(this.$this_pointerInput, this.$manager, null), 1, (Object) null);
                                    return Unit.a;
                                }
                            }

                            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                            public final Object invoke(df9 df9Var, q22<? super Unit> q22Var) {
                                Object objG = kotlinx.coroutines.j.g(new AnonymousClass1(df9Var, gscVar, textFieldSelectionManager, null), q22Var);
                                return objG == a.g() ? objG : Unit.a;
                            }
                        };
                        dVarF.L(objR3);
                    }
                    androidx.compose.ui.b bVarC = ugc.c(companion, gscVar, (PointerInputEventHandler) objR3);
                    boolean zD2 = dVarF.D(jV);
                    Object objR4 = dVarF.R();
                    if (zD2 || objR4 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                        objR4 = new Function1() { // from class: com.google.android.w82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.U(jV, (nfb) obj);
                            }
                        };
                        dVarF.L(objR4);
                    }
                    nk.g(co8Var, afb.d(bVarC, false, (Function1) objR4, 1, null), 0L, dVarF, 0, 4);
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
                s6bVarH.a(new Function2() { // from class: com.google.android.y82
                    public final Object invoke(Object obj, Object obj2) {
                        return CoreTextFieldKt.V(textFieldSelectionManager, i, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit U(long j, nfb nfbVar) {
            nfbVar.b(feb.d(), new SelectionHandleInfo(Handle.Cursor, j, SelectionHandleAnchor.Middle, true, null));
            return Unit.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit V(TextFieldSelectionManager textFieldSelectionManager, int i, androidx.compose.p004runtime.d dVar, int i2) {
            T(textFieldSelectionManager, dVar, saa.a(i | 1));
            return Unit.a;
        }

        private static final androidx.compose.ui.b a0(androidx.compose.ui.b bVar, TextFieldSelectionManager textFieldSelectionManager, ta2 ta2Var) {
            return up1.isNewContextMenuEnabled ? TextFieldSelectionManager_androidKt.m(bVar, textFieldSelectionManager, ta2Var) : bVar;
        }

        public static final Object b0(cu0 cu0Var, TextFieldValue textFieldValue, asc ascVar, TextLayoutResult textLayoutResult, zn8 zn8Var, q22<? super Unit> q22Var) {
            gba gbaVarD;
            int iB = zn8Var.b(x.k(textFieldValue.getSelection()));
            if (iB < textLayoutResult.getLayoutInput().getText().length()) {
                gbaVarD = textLayoutResult.d(iB);
            } else {
                gbaVarD = iB != 0 ? textLayoutResult.d(iB - 1) : new gba(0.0f, 0.0f, 1.0f, (int) (ysc.b(ascVar.getStyle(), ascVar.getDensity(), ascVar.getFontFamilyResolver(), null, 0, 24, null) & 4294967295L));
            }
            Object objA = cu0Var.a(gbaVarD, q22Var);
            return objA == kotlin.coroutines.intrinsics.a.g() ? objA : Unit.a;
        }

        public static final androidx.compose.ui.b c0(androidx.compose.ui.b bVar, final k07 k07Var, final TextFieldValue textFieldValue, final zn8 zn8Var) {
            return androidx.compose.ui.draw.c.b(bVar, new Function1() { // from class: com.google.android.s82
                public final Object invoke(Object obj) {
                    return CoreTextFieldKt.d0(k07Var, textFieldValue, zn8Var, (DrawScope) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d0(k07 k07Var, TextFieldValue textFieldValue, zn8 zn8Var, DrawScope drawScope) {
            wxc wxcVarN = k07Var.n();
            if (wxcVarN != null) {
                r.INSTANCE.d(drawScope.getDrawContext().b(), textFieldValue, k07Var.u(), k07Var.f(), zn8Var, wxcVarN.getValue(), k07Var.getHighlightPaint(), k07Var.getSelectionBackgroundColor());
            }
            return Unit.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e0(k07 k07Var) {
            hxc inputSession = k07Var.getInputSession();
            if (inputSession != null) {
                r.INSTANCE.i(inputSession, k07Var.getProcessor(), k07Var.r());
            }
            k07Var.N(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f0(k07 k07Var, TextFieldValue textFieldValue, zn8 zn8Var) {
            g.Companion companion = g.INSTANCE;
            g gVarD = companion.d();
            Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
            g gVarE = companion.e(gVarD);
            try {
                wxc wxcVarN = k07Var.n();
                if (wxcVarN == null) {
                    return;
                }
                hxc inputSession = k07Var.getInputSession();
                if (inputSession == null) {
                    return;
                }
                kn6 kn6VarM = k07Var.m();
                if (kn6VarM == null) {
                    return;
                }
                r.INSTANCE.g(textFieldValue, k07Var.getTextDelegate(), wxcVarN.getValue(), kn6VarM, inputSession, k07Var.h(), zn8Var);
                Unit unit = Unit.a;
            } finally {
                companion.l(gVarD, gVarE, function1G);
            }
        }

        private static final androidx.compose.ui.b g0(androidx.compose.ui.b bVar, k07 k07Var, TextFieldSelectionManager textFieldSelectionManager) {
            return wi6.b(bVar, new e(k07Var, textFieldSelectionManager));
        }

        public static final void h0(k07 k07Var, androidx.compose.ui.focus.f fVar, boolean z) {
            hyb keyboardController;
            if (!k07Var.h()) {
                androidx.compose.ui.focus.f.h(fVar, 0, 1, null);
            } else {
                if (!z || (keyboardController = k07Var.getKeyboardController()) == null) {
                    return;
                }
                keyboardController.show();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i0(dxc dxcVar, k07 k07Var, TextFieldValue textFieldValue, ImeOptions imeOptions, zn8 zn8Var) {
            k07Var.N(r.INSTANCE.k(dxcVar, textFieldValue, k07Var.getProcessor(), imeOptions, k07Var.r(), k07Var.p()));
            f0(k07Var, textFieldValue, zn8Var);
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0126  */
        /* JADX WARN: Code duplicated, block: B:104:0x012e  */
        /* JADX WARN: Code duplicated, block: B:105:0x0137  */
        /* JADX WARN: Code duplicated, block: B:107:0x013b  */
        /* JADX WARN: Code duplicated, block: B:109:0x0145  */
        /* JADX WARN: Code duplicated, block: B:110:0x0148  */
        /* JADX WARN: Code duplicated, block: B:112:0x014d  */
        /* JADX WARN: Code duplicated, block: B:115:0x0157  */
        /* JADX WARN: Code duplicated, block: B:117:0x015b  */
        /* JADX WARN: Code duplicated, block: B:120:0x0166 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:124:0x016f  */
        /* JADX WARN: Code duplicated, block: B:127:0x0178  */
        /* JADX WARN: Code duplicated, block: B:128:0x017b  */
        /* JADX WARN: Code duplicated, block: B:130:0x0181  */
        /* JADX WARN: Code duplicated, block: B:132:0x0189  */
        /* JADX WARN: Code duplicated, block: B:133:0x018c  */
        /* JADX WARN: Code duplicated, block: B:135:0x0193  */
        /* JADX WARN: Code duplicated, block: B:138:0x019d  */
        /* JADX WARN: Code duplicated, block: B:139:0x01a0  */
        /* JADX WARN: Code duplicated, block: B:141:0x01a6  */
        /* JADX WARN: Code duplicated, block: B:143:0x01ae  */
        /* JADX WARN: Code duplicated, block: B:145:0x01b5  */
        /* JADX WARN: Code duplicated, block: B:148:0x01bf  */
        /* JADX WARN: Code duplicated, block: B:149:0x01c6  */
        /* JADX WARN: Code duplicated, block: B:151:0x01cc  */
        /* JADX WARN: Code duplicated, block: B:153:0x01d4  */
        /* JADX WARN: Code duplicated, block: B:155:0x01d9  */
        /* JADX WARN: Code duplicated, block: B:158:0x01e4  */
        /* JADX WARN: Code duplicated, block: B:159:0x01e9  */
        /* JADX WARN: Code duplicated, block: B:161:0x01ef  */
        /* JADX WARN: Code duplicated, block: B:163:0x01f5  */
        /* JADX WARN: Code duplicated, block: B:164:0x01f8  */
        /* JADX WARN: Code duplicated, block: B:168:0x0200  */
        /* JADX WARN: Code duplicated, block: B:169:0x0205  */
        /* JADX WARN: Code duplicated, block: B:171:0x020b  */
        /* JADX WARN: Code duplicated, block: B:173:0x0211  */
        /* JADX WARN: Code duplicated, block: B:174:0x0214  */
        /* JADX WARN: Code duplicated, block: B:178:0x0224  */
        /* JADX WARN: Code duplicated, block: B:182:0x0231  */
        /* JADX WARN: Code duplicated, block: B:185:0x023a  */
        /* JADX WARN: Code duplicated, block: B:187:0x0242  */
        /* JADX WARN: Code duplicated, block: B:194:0x0269 A[PHI: r0 r2 r4 r7 r8 r10 r11 r12 r13 r14 r15 r17 r18 r19 r21
  0x0269: PHI (r0v98 androidx.compose.ui.b) = (r0v35 androidx.compose.ui.b), (r0v101 androidx.compose.ui.b) binds: [B:237:0x0303, B:193:0x0252] A[DONT_GENERATE, DONT_INLINE]
  0x0269: PHI (r2v57 com.google.android.qu0) = (r2v8 com.google.android.qu0), (r2v58 com.google.android.qu0) binds: [B:237:0x0303, B:193:0x0252] A[DONT_GENERATE, DONT_INLINE]
  0x0269: PHI (r4v53 int) = (r4v9 int), (r4v54 int) binds: [B:237:0x0303, B:193:0x0252] A[DONT_GENERATE, DONT_INLINE]
  0x0269: PHI (r7v37 com.google.android.r48) = (r7v3 com.google.android.r48), (r7v1 com.google.android.r48) binds: [B:237:0x0303, B:193:0x0252] A[DONT_GENERATE, DONT_INLINE]
  0x0269: PHI (r8v18 com.google.android.nce) = (r8v4 com.google.android.nce), (r8v19 com.google.android.nce) binds: [B:237:0x0303, B:193:0x0252] A[DONT_GENERATE, DONT_INLINE]
  0x0269: PHI (r10v54 androidx.compose.ui.text.y) = (r10v7 androidx.compose.ui.text.y), (r10v2 androidx.compose.ui.text.y) binds: [B:237:0x0303, B:193:0x0252] A[DONT_GENERATE, DONT_INLINE]
  0x0269: PHI (r11v39 boolean) = (r11v5 boolean), (r11v40 boolean) binds: [B:237:0x0303, B:193:0x0252] A[DONT_GENERATE, DONT_INLINE]
  0x0269: PHI (r12v39 int) = (r12v4 int), (r12v40 int) binds: [B:237:0x0303, B:193:0x0252] A[DONT_GENERATE, DONT_INLINE]
  0x0269: PHI (r13v43 int) = (r13v4 int), (r13v44 int) binds: [B:237:0x0303, B:193:0x0252] A[DONT_GENERATE, DONT_INLINE]
  0x0269: PHI (r14v15 androidx.compose.ui.text.input.b) = (r14v6 androidx.compose.ui.text.input.b), (r14v16 androidx.compose.ui.text.input.b) binds: [B:237:0x0303, B:193:0x0252] A[DONT_GENERATE, DONT_INLINE]
  0x0269: PHI (r15v18 boolean) = (r15v6 boolean), (r15v19 boolean) binds: [B:237:0x0303, B:193:0x0252] A[DONT_GENERATE, DONT_INLINE]
  0x0269: PHI (r17v13 kotlin.jvm.functions.Function1<? super com.google.android.vxc, kotlin.Unit>) = 
  (r17v9 kotlin.jvm.functions.Function1<? super com.google.android.vxc, kotlin.Unit>)
  (r17v14 kotlin.jvm.functions.Function1<? super com.google.android.vxc, kotlin.Unit>)
 binds: [B:237:0x0303, B:193:0x0252] A[DONT_GENERATE, DONT_INLINE]
  0x0269: PHI (r18v13 androidx.compose.foundation.text.m) = (r18v3 androidx.compose.foundation.text.m), (r18v14 androidx.compose.foundation.text.m) binds: [B:237:0x0303, B:193:0x0252] A[DONT_GENERATE, DONT_INLINE]
  0x0269: PHI (r19v12 boolean) = (r19v7 boolean), (r19v13 boolean) binds: [B:237:0x0303, B:193:0x0252] A[DONT_GENERATE, DONT_INLINE]
  0x0269: PHI (r21v11 com.google.android.ps4<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.d, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.d, ? super java.lang.Integer, kotlin.Unit>) = 
  (r21v6 com.google.android.ps4<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.d, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.d, ? super java.lang.Integer, kotlin.Unit>)
  (r21v12 com.google.android.ps4<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.d, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.d, ? super java.lang.Integer, kotlin.Unit>)
 binds: [B:237:0x0303, B:193:0x0252] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:195:0x026d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:196:0x026f  */
        /* JADX WARN: Code duplicated, block: B:198:0x0274  */
        /* JADX WARN: Code duplicated, block: B:199:0x027b  */
        /* JADX WARN: Code duplicated, block: B:201:0x027e  */
        /* JADX WARN: Code duplicated, block: B:203:0x0287  */
        /* JADX WARN: Code duplicated, block: B:205:0x0293  */
        /* JADX WARN: Code duplicated, block: B:208:0x02a0  */
        /* JADX WARN: Code duplicated, block: B:210:0x02a3  */
        /* JADX WARN: Code duplicated, block: B:212:0x02b0  */
        /* JADX WARN: Code duplicated, block: B:213:0x02b2  */
        /* JADX WARN: Code duplicated, block: B:215:0x02b6  */
        /* JADX WARN: Code duplicated, block: B:216:0x02ba  */
        /* JADX WARN: Code duplicated, block: B:218:0x02be  */
        /* JADX WARN: Code duplicated, block: B:219:0x02c0  */
        /* JADX WARN: Code duplicated, block: B:222:0x02c6  */
        /* JADX WARN: Code duplicated, block: B:223:0x02cf  */
        /* JADX WARN: Code duplicated, block: B:225:0x02d3  */
        /* JADX WARN: Code duplicated, block: B:226:0x02da  */
        /* JADX WARN: Code duplicated, block: B:228:0x02de  */
        /* JADX WARN: Code duplicated, block: B:229:0x02e1  */
        /* JADX WARN: Code duplicated, block: B:231:0x02e5  */
        /* JADX WARN: Code duplicated, block: B:232:0x02e8  */
        /* JADX WARN: Code duplicated, block: B:234:0x02ec  */
        /* JADX WARN: Code duplicated, block: B:235:0x02f3  */
        /* JADX WARN: Code duplicated, block: B:238:0x0305  */
        /* JADX WARN: Code duplicated, block: B:241:0x0312  */
        /* JADX WARN: Code duplicated, block: B:244:0x0328  */
        /* JADX WARN: Code duplicated, block: B:247:0x033e  */
        /* JADX WARN: Code duplicated, block: B:250:0x0351  */
        /* JADX WARN: Code duplicated, block: B:253:0x03a8 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:257:0x03b3  */
        /* JADX WARN: Code duplicated, block: B:259:0x03b7  */
        /* JADX WARN: Code duplicated, block: B:261:0x03df  */
        /* JADX WARN: Code duplicated, block: B:263:0x03e5  */
        /* JADX WARN: Code duplicated, block: B:265:0x03fa  */
        /* JADX WARN: Code duplicated, block: B:268:0x0413  */
        /* JADX WARN: Code duplicated, block: B:270:0x0423  */
        /* JADX WARN: Code duplicated, block: B:271:0x0426  */
        /* JADX WARN: Code duplicated, block: B:274:0x0433  */
        /* JADX WARN: Code duplicated, block: B:276:0x0438  */
        /* JADX WARN: Code duplicated, block: B:277:0x043a  */
        /* JADX WARN: Code duplicated, block: B:280:0x0444  */
        /* JADX WARN: Code duplicated, block: B:281:0x0446  */
        /* JADX WARN: Code duplicated, block: B:284:0x044e  */
        /* JADX WARN: Code duplicated, block: B:288:0x0458  */
        /* JADX WARN: Code duplicated, block: B:290:0x0466  */
        /* JADX WARN: Code duplicated, block: B:293:0x0475  */
        /* JADX WARN: Code duplicated, block: B:294:0x0477  */
        /* JADX WARN: Code duplicated, block: B:299:0x049a  */
        /* JADX WARN: Code duplicated, block: B:303:0x04aa  */
        /* JADX WARN: Code duplicated, block: B:306:0x0513  */
        /* JADX WARN: Code duplicated, block: B:307:0x0521  */
        /* JADX WARN: Code duplicated, block: B:310:0x0542  */
        /* JADX WARN: Code duplicated, block: B:313:0x0559  */
        /* JADX WARN: Code duplicated, block: B:316:0x056e  */
        /* JADX WARN: Code duplicated, block: B:319:0x05c5  */
        /* JADX WARN: Code duplicated, block: B:31:0x0058  */
        /* JADX WARN: Code duplicated, block: B:320:0x05de  */
        /* JADX WARN: Code duplicated, block: B:323:0x0609  */
        /* JADX WARN: Code duplicated, block: B:324:0x060b  */
        /* JADX WARN: Code duplicated, block: B:327:0x0618  */
        /* JADX WARN: Code duplicated, block: B:328:0x061a  */
        /* JADX WARN: Code duplicated, block: B:331:0x0625  */
        /* JADX WARN: Code duplicated, block: B:332:0x0627  */
        /* JADX WARN: Code duplicated, block: B:335:0x0633  */
        /* JADX WARN: Code duplicated, block: B:339:0x063d  */
        /* JADX WARN: Code duplicated, block: B:33:0x005d  */
        /* JADX WARN: Code duplicated, block: B:341:0x0643 A[PHI: r51
  0x0643: PHI (r51v12 com.google.android.dxc) = (r51v4 com.google.android.dxc), (r51v13 com.google.android.dxc) binds: [B:340:0x0641, B:338:0x063a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:342:0x0645  */
        /* JADX WARN: Code duplicated, block: B:345:0x0662  */
        /* JADX WARN: Code duplicated, block: B:349:0x0679  */
        /* JADX WARN: Code duplicated, block: B:352:0x06b3 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:355:0x06ba  */
        /* JADX WARN: Code duplicated, block: B:358:0x06e6  */
        /* JADX WARN: Code duplicated, block: B:35:0x0061  */
        /* JADX WARN: Code duplicated, block: B:362:0x06f0  */
        /* JADX WARN: Code duplicated, block: B:364:0x06f6 A[PHI: r53
  0x06f6: PHI (r53v12 androidx.compose.ui.text.input.b) = (r53v4 androidx.compose.ui.text.input.b), (r53v13 androidx.compose.ui.text.input.b) binds: [B:363:0x06f4, B:361:0x06ed] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:365:0x06f8  */
        /* JADX WARN: Code duplicated, block: B:368:0x0701  */
        /* JADX WARN: Code duplicated, block: B:372:0x0710  */
        /* JADX WARN: Code duplicated, block: B:375:0x077b  */
        /* JADX WARN: Code duplicated, block: B:376:0x077d  */
        /* JADX WARN: Code duplicated, block: B:379:0x0793  */
        /* JADX WARN: Code duplicated, block: B:37:0x0069  */
        /* JADX WARN: Code duplicated, block: B:380:0x0795  */
        /* JADX WARN: Code duplicated, block: B:383:0x07a8  */
        /* JADX WARN: Code duplicated, block: B:387:0x07b6  */
        /* JADX WARN: Code duplicated, block: B:38:0x006c  */
        /* JADX WARN: Code duplicated, block: B:390:0x0801 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:397:0x081c  */
        /* JADX WARN: Code duplicated, block: B:400:0x083d  */
        /* JADX WARN: Code duplicated, block: B:402:0x0843  */
        /* JADX WARN: Code duplicated, block: B:405:0x085d  */
        /* JADX WARN: Code duplicated, block: B:406:0x085f  */
        /* JADX WARN: Code duplicated, block: B:409:0x0865  */
        /* JADX WARN: Code duplicated, block: B:411:0x086b  */
        /* JADX WARN: Code duplicated, block: B:417:0x0879  */
        /* JADX WARN: Code duplicated, block: B:419:0x087f  */
        /* JADX WARN: Code duplicated, block: B:422:0x0899  */
        /* JADX WARN: Code duplicated, block: B:423:0x089b  */
        /* JADX WARN: Code duplicated, block: B:426:0x08cc  */
        /* JADX WARN: Code duplicated, block: B:429:0x08dc  */
        /* JADX WARN: Code duplicated, block: B:42:0x0076  */
        /* JADX WARN: Code duplicated, block: B:432:0x08f9  */
        /* JADX WARN: Code duplicated, block: B:434:0x08ff  */
        /* JADX WARN: Code duplicated, block: B:437:0x0942  */
        /* JADX WARN: Code duplicated, block: B:439:0x0948  */
        /* JADX WARN: Code duplicated, block: B:442:0x099e  */
        /* JADX WARN: Code duplicated, block: B:449:0x09b2  */
        /* JADX WARN: Code duplicated, block: B:44:0x007b  */
        /* JADX WARN: Code duplicated, block: B:451:0x09b5  */
        /* JADX WARN: Code duplicated, block: B:453:0x09bb  */
        /* JADX WARN: Code duplicated, block: B:456:0x0a0a  */
        /* JADX WARN: Code duplicated, block: B:458:0x0a2e  */
        /* JADX WARN: Code duplicated, block: B:461:0x0a4f  */
        /* JADX WARN: Code duplicated, block: B:463:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:46:0x007f  */
        /* JADX WARN: Code duplicated, block: B:48:0x0087  */
        /* JADX WARN: Code duplicated, block: B:49:0x008a  */
        /* JADX WARN: Code duplicated, block: B:53:0x0096  */
        /* JADX WARN: Code duplicated, block: B:54:0x009b  */
        /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:66:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:78:0x00e3  */
        /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:86:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:88:0x0101  */
        /* JADX WARN: Code duplicated, block: B:89:0x0104  */
        /* JADX WARN: Code duplicated, block: B:93:0x010e  */
        /* JADX WARN: Code duplicated, block: B:95:0x0115  */
        /* JADX WARN: Code duplicated, block: B:97:0x0119  */
        /* JADX WARN: Code duplicated, block: B:99:0x0123  */
        public static final void w(final TextFieldValue textFieldValue, final Function1<? super TextFieldValue, Unit> function1, androidx.compose.ui.b bVar, TextStyle textStyle, nce nceVar, Function1<? super TextLayoutResult, Unit> function2, r48 r48Var, qu0 qu0Var, boolean z, int i, int i2, ImeOptions imeOptions, m mVar, boolean z2, boolean z3, ps4<? super Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit>, ? super androidx.compose.p004runtime.d, ? super Integer, Unit> ps4Var, u uVar, androidx.compose.p004runtime.d dVar, final int i3, final int i4, final int i5) {
            int i6;
            androidx.compose.ui.b bVar2;
            int i7;
            TextStyle textStyle2;
            int i8;
            int i9;
            nce nceVarC;
            int i10;
            int i11;
            Function1<? super TextLayoutResult, Unit> function3;
            int i12;
            int i13;
            final r48 r48Var2;
            int i14;
            int i15;
            final qu0 solidColor;
            int i16;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            int i28;
            int i29;
            int i30;
            int i31;
            int i32;
            int i33;
            int i34;
            int i35;
            int i36;
            int i37;
            boolean z4;
            final boolean z5;
            final ImeOptions imeOptions2;
            final m mVar2;
            final ps4<? super Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit>, ? super androidx.compose.p004runtime.d, ? super Integer, Unit> ps4Var2;
            final u uVar2;
            androidx.compose.p004runtime.d dVar2;
            final TextStyle textStyle3;
            final Function1<? super TextLayoutResult, Unit> function4;
            final nce nceVar2;
            final androidx.compose.ui.b bVar3;
            final int i38;
            final int i39;
            final boolean z6;
            final boolean z7;
            s6b s6bVarH;
            TextStyle textStyleA;
            boolean z8;
            int i40;
            int i41;
            ImeOptions imeOptionsA;
            m mVarA;
            boolean z9;
            boolean z10;
            ps4<? super Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit>, ? super androidx.compose.p004runtime.d, ? super Integer, Unit> ps4VarB;
            androidx.compose.ui.b bVar4;
            boolean z11;
            final Function1<? super TextLayoutResult, Unit> function5;
            boolean z12;
            ImeOptions imeOptions3;
            qu0 qu0Var2;
            nce nceVar3;
            int i42;
            u uVar3;
            Object objR;
            qu0 qu0Var3;
            Object objR2;
            androidx.compose.p004runtime.d.Companion companion;
            androidx.compose.ui.focus.f fVar;
            Object objR3;
            int i43;
            final androidx.compose.p001foundation.text.input.internal.b bVar5;
            Object objR4;
            dxc dxcVar;
            final f43 f43Var;
            l.b bVar6;
            long selectionBackgroundColor;
            ok4 ok4Var;
            final a0 a0Var;
            final TextStyle textStyle4;
            hyb hybVar;
            boolean z13;
            final Orientation orientation;
            u uVar4;
            int i44;
            boolean z14;
            boolean z15;
            boolean z16;
            Object objR5;
            TransformedText transformedTextC;
            x composition;
            u uVar5;
            TransformedText transformedTextC2;
            androidx.compose.ui.text.b text;
            zn8 offsetMapping;
            qaa qaaVarC;
            boolean zX;
            Object objR6;
            final k07 k07Var;
            Object objR7;
            rsd rsdVar;
            Object objR8;
            final ta2 ta2Var;
            Object objR9;
            final cu0 cu0Var;
            Object objR10;
            final TextFieldSelectionManager textFieldSelectionManager;
            androidx.compose.ui.b.Companion companion2;
            int i45;
            int i46;
            boolean z17;
            boolean z18;
            boolean z19;
            int i47;
            final dxc dxcVar2;
            boolean z20;
            boolean zT;
            Object objR11;
            final zn8 zn8Var;
            k07 k07Var2;
            boolean z21;
            TextFieldValue textFieldValue2;
            ImeOptions imeOptions4;
            TextFieldSelectionManager textFieldSelectionManager2;
            ta2 ta2Var2;
            cu0 cu0Var2;
            boolean z22;
            q6c q6cVarR;
            ImeOptions imeOptions5;
            boolean z23;
            boolean z24;
            Object objR12;
            k07 k07Var3;
            TextFieldSelectionManager textFieldSelectionManager3;
            ImeOptions imeOptions6;
            final ImeOptions imeOptions7;
            final boolean z25;
            final k07 k07Var4;
            final TextFieldSelectionManager textFieldSelectionManager4;
            final zn8 zn8Var2;
            boolean z26;
            boolean z27;
            boolean zT2;
            Object objR13;
            a0 a0Var2;
            TextFieldSelectionManager textFieldSelectionManager5;
            final TextFieldSelectionManager textFieldSelectionManager6;
            boolean z28;
            boolean zT3;
            Object objR14;
            boolean z29;
            boolean z30;
            Object objR15;
            final int i48;
            boolean z31;
            int keyboardType;
            androidx.compose.ui.text.input.d.Companion companion3;
            final boolean z32;
            boolean zA;
            Object objR16;
            final qu0 qu0VarE;
            boolean zT4;
            Object objR17;
            boolean z33;
            androidx.compose.ui.b bVarZ;
            String str;
            boolean zC;
            Object objR18;
            androidx.compose.p004runtime.d dVarF = dVar.F(31062401);
            if ((i3 & 6) == 0) {
                i6 = (dVarF.x(textFieldValue) ? 4 : 2) | i3;
            } else {
                i6 = i3;
            }
            if ((i3 & 48) == 0) {
                i6 |= dVarF.T(function1) ? 32 : 16;
            }
            int i49 = i5 & 4;
            if (i49 == 0) {
                if ((i3 & 384) == 0) {
                    bVar2 = bVar;
                    i6 |= dVarF.x(bVar2) ? 256 : 128;
                }
                i7 = i5 & 8;
                if (i7 != 0) {
                    if ((i3 & 3072) == 0) {
                        textStyle2 = textStyle;
                        if (dVarF.x(textStyle2)) {
                            i8 = 2048;
                        } else {
                            i8 = 1024;
                        }
                        i6 |= i8;
                    }
                    i9 = i5 & 16;
                    if (i9 != 0) {
                        if ((i3 & 24576) == 0) {
                            nceVarC = nceVar;
                            if (dVarF.x(nceVarC)) {
                                i10 = 16384;
                            } else {
                                i10 = 8192;
                            }
                            i6 |= i10;
                        }
                        i11 = i5 & 32;
                        if (i11 != 0) {
                            i6 |= 196608;
                            function3 = function2;
                        } else {
                            function3 = function2;
                            if ((i3 & 196608) == 0) {
                                if (dVarF.T(function3)) {
                                    i12 = 131072;
                                } else {
                                    i12 = 65536;
                                }
                                i6 |= i12;
                            }
                        }
                        i13 = i5 & 64;
                        if (i13 != 0) {
                            i6 |= 1572864;
                            r48Var2 = r48Var;
                        } else {
                            r48Var2 = r48Var;
                            if ((i3 & 1572864) == 0) {
                                if (dVarF.x(r48Var2)) {
                                    i14 = 1048576;
                                } else {
                                    i14 = 524288;
                                }
                                i6 |= i14;
                            }
                        }
                        i15 = i5 & 128;
                        if (i15 != 0) {
                            i6 |= 12582912;
                            solidColor = qu0Var;
                        } else {
                            solidColor = qu0Var;
                            if ((i3 & 12582912) == 0) {
                                if (dVarF.x(solidColor)) {
                                    i16 = 8388608;
                                } else {
                                    i16 = 4194304;
                                }
                                i6 |= i16;
                            }
                        }
                        i17 = i5 & 256;
                        if (i17 != 0) {
                            i6 |= 100663296;
                        } else if ((i3 & 100663296) == 0) {
                            if (dVarF.A(z)) {
                                i18 = 67108864;
                            } else {
                                i18 = 33554432;
                            }
                            i6 |= i18;
                        }
                        i19 = i5 & 512;
                        if (i19 != 0) {
                            if ((i3 & 805306368) == 0) {
                                if (dVarF.C(i)) {
                                    i20 = 536870912;
                                } else {
                                    i20 = 268435456;
                                }
                                i6 |= i20;
                            }
                            i21 = i5 & 1024;
                            if (i21 != 0) {
                                i22 = i4 | 6;
                            } else if ((i4 & 6) == 0) {
                                if (dVarF.C(i2)) {
                                    i23 = 4;
                                } else {
                                    i23 = 2;
                                }
                                i22 = i4 | i23;
                            } else {
                                i22 = i4;
                            }
                            if ((i4 & 48) != 0) {
                                i22 |= ((i5 & 2048) == 0 || !dVarF.x(imeOptions)) ? 16 : 32;
                            }
                            i24 = i22;
                            i25 = i5 & 4096;
                            if (i25 != 0) {
                                i26 = i24 | 384;
                            } else if ((i4 & 384) == 0) {
                                if (dVarF.x(mVar)) {
                                    i27 = 256;
                                } else {
                                    i27 = 128;
                                }
                                i26 = i24 | i27;
                            } else {
                                i26 = i24;
                            }
                            i28 = i5 & 8192;
                            if (i28 != 0) {
                                i30 = i26 | 3072;
                            } else {
                                i29 = i26;
                                if ((i4 & 3072) == 0) {
                                    i30 = i29 | (dVarF.A(z2) ? 2048 : 1024);
                                } else {
                                    i30 = i29;
                                }
                            }
                            i31 = i5 & 16384;
                            if (i31 != 0) {
                                i33 = i30 | 24576;
                            } else {
                                i32 = i30;
                                if ((i4 & 24576) == 0) {
                                    i33 = i32 | (dVarF.A(z3) ? 16384 : 8192);
                                } else {
                                    i33 = i32;
                                }
                            }
                            i34 = i5 & 32768;
                            if (i34 != 0) {
                                i33 |= 196608;
                            } else if ((i4 & 196608) == 0) {
                                if (dVarF.T(ps4Var)) {
                                    i35 = 131072;
                                } else {
                                    i35 = 65536;
                                }
                                i33 |= i35;
                            }
                            i36 = i5 & 65536;
                            if (i36 != 0) {
                                i33 |= 1572864;
                            } else if ((i4 & 1572864) == 0) {
                                if (dVarF.x(uVar)) {
                                    i37 = 1048576;
                                } else {
                                    i37 = 524288;
                                }
                                i33 |= i37;
                            }
                            if ((i6 & 306783379) == 306783378 || (i33 & 599187) != 599186) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (dVarF.g(z4, i6 & 1)) {
                                dVarF.U();
                                if ((i3 & 1) != 0 || dVarF.t()) {
                                    if (i49 != 0) {
                                        bVar2 = androidx.compose.ui.b.INSTANCE;
                                    }
                                    if (i7 != 0) {
                                        textStyleA = TextStyle.INSTANCE.a();
                                    } else {
                                        textStyleA = textStyle2;
                                    }
                                    if (i9 != 0) {
                                        nceVarC = nce.INSTANCE.c();
                                    }
                                    if (i11 != 0) {
                                        objR = dVarF.R();
                                        if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                            objR = new Function1() { // from class: com.google.android.m82
                                                public final Object invoke(Object obj) {
                                                    return CoreTextFieldKt.x((TextLayoutResult) obj);
                                                }
                                            };
                                            dVarF.L(objR);
                                        }
                                        function3 = (Function1) objR;
                                    }
                                    if (i13 != 0) {
                                        r48Var2 = null;
                                    }
                                    if (i15 != 0) {
                                        solidColor = new SolidColor(ei1.INSTANCE.i(), null);
                                    }
                                    if (i17 != 0) {
                                        z8 = true;
                                    } else {
                                        z8 = z;
                                    }
                                    if (i19 != 0) {
                                        i40 = Integer.MAX_VALUE;
                                    } else {
                                        i40 = i;
                                    }
                                    if (i21 != 0) {
                                        i41 = 1;
                                    } else {
                                        i41 = i2;
                                    }
                                    if ((i5 & 2048) != 0) {
                                        imeOptionsA = ImeOptions.INSTANCE.a();
                                        i33 &= -113;
                                    } else {
                                        imeOptionsA = imeOptions;
                                    }
                                    if (i25 != 0) {
                                        mVarA = m.INSTANCE.a();
                                    } else {
                                        mVarA = mVar;
                                    }
                                    if (i28 != 0) {
                                        z9 = true;
                                    } else {
                                        z9 = z2;
                                    }
                                    if (i31 != 0) {
                                        z10 = false;
                                    } else {
                                        z10 = z3;
                                    }
                                    if (i34 != 0) {
                                        ps4VarB = zo1.a.b();
                                    } else {
                                        ps4VarB = ps4Var;
                                    }
                                    boolean z34 = z8;
                                    textStyle2 = textStyleA;
                                    bVar4 = bVar2;
                                    z11 = z9;
                                    function5 = function3;
                                    z12 = z34;
                                    nce nceVar4 = nceVarC;
                                    imeOptions3 = imeOptionsA;
                                    qu0Var2 = solidColor;
                                    nceVar3 = nceVar4;
                                    i42 = i33;
                                    if (i36 != 0) {
                                        uVar3 = null;
                                    }
                                    dVarF.M();
                                    qu0Var3 = qu0Var2;
                                    if (androidx.compose.p004runtime.e.k()) {
                                        androidx.compose.p004runtime.e.o(31062401, i6, i42, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                                    }
                                    objR2 = dVarF.R();
                                    companion = androidx.compose.p004runtime.d.INSTANCE;
                                    if (objR2 == companion.a()) {
                                        objR2 = new androidx.compose.ui.focus.f();
                                        dVarF.L(objR2);
                                    }
                                    fVar = (androidx.compose.ui.focus.f) objR2;
                                    objR3 = dVarF.R();
                                    i43 = i6;
                                    if (objR3 == companion.a()) {
                                        objR3 = LegacyPlatformTextInputServiceAdapter_androidKt.b();
                                        dVarF.L(objR3);
                                    }
                                    bVar5 = (androidx.compose.p001foundation.text.input.internal.b) objR3;
                                    objR4 = dVarF.R();
                                    if (objR4 == companion.a()) {
                                        objR4 = new dxc(bVar5);
                                        dVarF.L(objR4);
                                    }
                                    dxcVar = (dxc) objR4;
                                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                                    bVar6 = (l.b) dVarF.v(CompositionLocalsKt.i());
                                    selectionBackgroundColor = ((SelectionColors) dVarF.v(jzc.c())).getSelectionBackgroundColor();
                                    ok4Var = (ok4) dVarF.v(CompositionLocalsKt.h());
                                    a0Var = (a0) dVarF.v(CompositionLocalsKt.v());
                                    textStyle4 = textStyle2;
                                    hybVar = (hyb) dVarF.v(CompositionLocalsKt.r());
                                    z13 = z12;
                                    if (i40 == 1 || z13 || !imeOptions3.getSingleLine()) {
                                        orientation = Orientation.Vertical;
                                    } else {
                                        orientation = Orientation.Horizontal;
                                    }
                                    if (uVar3 == null) {
                                        dVarF.y(-213744626);
                                        Object[] objArr = {orientation};
                                        k0b<u, Object> k0bVarA = u.INSTANCE.a();
                                        zC = dVarF.C(orientation.ordinal());
                                        objR18 = dVarF.R();
                                        if (zC || objR18 == companion.a()) {
                                            objR18 = new Function0() { // from class: com.google.android.d92
                                                public final Object invoke() {
                                                    return CoreTextFieldKt.O(orientation);
                                                }
                                            };
                                            dVarF.L(objR18);
                                        }
                                        uVar4 = (u) dfa.k(objArr, k0bVarA, (Function0) objR18, dVarF, 0);
                                        dVarF.u();
                                    } else {
                                        dVarF.y(-213745742);
                                        dVarF.u();
                                        uVar4 = uVar3;
                                    }
                                    if (uVar4.j() != orientation) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("Mismatching scroller orientation; ");
                                        if (orientation == Orientation.Vertical) {
                                            str = "only single-line, non-wrap text fields can scroll horizontally";
                                        } else {
                                            str = "single-line, non-wrap text fields can only scroll horizontally";
                                        }
                                        sb.append(str);
                                        throw new IllegalArgumentException(sb.toString());
                                    }
                                    i44 = i43 & 14;
                                    if (i44 == 4) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if ((i43 & 57344) == 16384) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    z16 = z14 | z15;
                                    objR5 = dVarF.R();
                                    if (!z16 || objR5 == companion.a()) {
                                        transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                                        composition = textFieldValue.getComposition();
                                        if (composition != null) {
                                            uVar5 = uVar4;
                                            transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                            if (transformedTextC2 != null) {
                                                objR5 = transformedTextC2;
                                            }
                                            dVarF.L(objR5);
                                        } else {
                                            uVar5 = uVar4;
                                        }
                                        objR5 = transformedTextC;
                                        dVarF.L(objR5);
                                    } else {
                                        uVar5 = uVar4;
                                    }
                                    TransformedText transformedText = (TransformedText) objR5;
                                    text = transformedText.getText();
                                    offsetMapping = transformedText.getOffsetMapping();
                                    qaaVarC = pp1.c(dVarF, 0);
                                    zX = dVarF.x(hybVar);
                                    objR6 = dVarF.R();
                                    if (zX || objR6 == companion.a()) {
                                        objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                                        dVarF.L(objR6);
                                    }
                                    k07Var = (k07) objR6;
                                    m mVar3 = mVarA;
                                    k07Var.X(textFieldValue.getText(), text, textStyle4, z13, r54, bVar6, function1, mVar3, ok4Var, selectionBackgroundColor);
                                    k07Var.getProcessor().e(textFieldValue, k07Var.getInputSession());
                                    objR7 = dVarF.R();
                                    if (objR7 == companion.a()) {
                                        objR7 = new rsd(0, 1, null);
                                        dVarF.L(objR7);
                                    }
                                    rsdVar = (rsd) objR7;
                                    rsd.f(rsdVar, textFieldValue, 0L, 2, null);
                                    objR8 = dVarF.R();
                                    if (objR8 == companion.a()) {
                                        objR8 = vn3.k(EmptyCoroutineContext.a, dVarF);
                                        dVarF.L(objR8);
                                    }
                                    ta2Var = (ta2) objR8;
                                    objR9 = dVarF.R();
                                    if (objR9 == companion.a()) {
                                        objR9 = androidx.compose.p001foundation.relocation.c.a();
                                        dVarF.L(objR9);
                                    }
                                    cu0Var = (cu0) objR9;
                                    objR10 = dVarF.R();
                                    r48 r48Var3 = r48Var2;
                                    if (objR10 == companion.a()) {
                                        objR10 = new TextFieldSelectionManager(rsdVar);
                                        dVarF.L(objR10);
                                    }
                                    textFieldSelectionManager = (TextFieldSelectionManager) objR10;
                                    textFieldSelectionManager.L0(offsetMapping);
                                    textFieldSelectionManager.U0(nceVar3);
                                    textFieldSelectionManager.M0(k07Var.r());
                                    textFieldSelectionManager.Q0(k07Var);
                                    textFieldSelectionManager.T0(textFieldValue);
                                    textFieldSelectionManager.z0((jf1) dVarF.v(CompositionLocalsKt.d()));
                                    textFieldSelectionManager.A0(ta2Var);
                                    textFieldSelectionManager.R0((yzc) dVarF.v(CompositionLocalsKt.s()));
                                    textFieldSelectionManager.I0((c65) dVarF.v(CompositionLocalsKt.k()));
                                    textFieldSelectionManager.G0(fVar);
                                    textFieldSelectionManager.E0(!z10);
                                    textFieldSelectionManager.F0(z11);
                                    if (up1.isSmartSelectionEnabled) {
                                        dVarF.y(1966756105);
                                        textFieldSelectionManager.N0(androidx.compose.p001foundation.text.selection.c.h(SelectedTextType.EditableText, textStyle4.u(), dVarF, 6));
                                        dVarF.u();
                                    } else {
                                        dVarF.y(1966902177);
                                        dVarF.u();
                                    }
                                    k07Var.h();
                                    new Function1() { // from class: com.google.android.e92
                                        public final Object invoke(Object obj) {
                                            return CoreTextFieldKt.y(textFieldSelectionManager, (b) obj);
                                        }
                                    };
                                    new Function0() { // from class: com.google.android.f92
                                        public final Object invoke() {
                                            return CoreTextFieldKt.z(textFieldSelectionManager);
                                        }
                                    };
                                    new Function0() { // from class: com.google.android.g92
                                        public final Object invoke() {
                                            return CoreTextFieldKt.A(textFieldSelectionManager);
                                        }
                                    };
                                    companion2 = androidx.compose.ui.b.INSTANCE;
                                    boolean zT5 = dVarF.T(k07Var);
                                    i45 = i42 & 7168;
                                    i46 = i42;
                                    if (i45 == 2048) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    boolean z35 = z17 | zT5;
                                    if ((i46 & 57344) == 16384) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    boolean zT6 = z35 | z18 | dVarF.T(dxcVar);
                                    if (i44 == 4) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    boolean z36 = zT6 | z19;
                                    i47 = (i46 & 112) ^ 48;
                                    if (i47 > 32 || !dVarF.x(imeOptions3)) {
                                        dxcVar2 = dxcVar;
                                        if ((i46 & 48) != 32) {
                                            z20 = false;
                                        }
                                        zT = z36 | z20 | dVarF.T(offsetMapping) | dVarF.T(ta2Var) | dVarF.T(cu0Var) | dVarF.T(textFieldSelectionManager);
                                        objR11 = dVarF.R();
                                        if (!zT || objR11 == companion.a()) {
                                            zn8Var = offsetMapping;
                                            final ImeOptions imeOptions8 = imeOptions3;
                                            final boolean z37 = z11;
                                            final boolean z38 = z10;
                                            objR11 = new Function1() { // from class: com.google.android.h92
                                                public final Object invoke(Object obj) {
                                                    return CoreTextFieldKt.B(k07Var, z37, z38, dxcVar2, textFieldValue, imeOptions8, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                                                }
                                            };
                                            k07Var2 = k07Var;
                                            z21 = z37;
                                            textFieldValue2 = textFieldValue;
                                            imeOptions4 = imeOptions8;
                                            textFieldSelectionManager2 = textFieldSelectionManager;
                                            ta2Var2 = ta2Var;
                                            cu0Var2 = cu0Var;
                                            dVarF.L(objR11);
                                        } else {
                                            textFieldSelectionManager2 = textFieldSelectionManager;
                                            z21 = z11;
                                            cu0Var2 = cu0Var;
                                            k07Var2 = k07Var;
                                            zn8Var = offsetMapping;
                                            imeOptions4 = imeOptions3;
                                            ta2Var2 = ta2Var;
                                            textFieldValue2 = textFieldValue;
                                        }
                                        final cu0 cu0Var3 = cu0Var2;
                                        androidx.compose.ui.b bVarA = atc.a(companion2, z21, fVar, r48Var3, (Function1) objR11);
                                        if (z21 || z10) {
                                            z22 = false;
                                        } else {
                                            z22 = true;
                                        }
                                        q6cVarR = p0.r(Boolean.valueOf(z22), dVarF, 0);
                                        Unit unit = Unit.a;
                                        boolean zX2 = dVarF.x(q6cVarR) | dVarF.T(k07Var2) | dVarF.T(dxcVar2) | dVarF.T(textFieldSelectionManager2);
                                        if (i47 > 32 || !dVarF.x(imeOptions4)) {
                                            imeOptions5 = imeOptions4;
                                            if ((i46 & 48) != 32) {
                                                z23 = false;
                                            }
                                            z24 = zX2 | z23;
                                            objR12 = dVarF.R();
                                            if (!z24 || objR12 == companion.a()) {
                                                ImeOptions imeOptions9 = imeOptions5;
                                                dxc dxcVar3 = dxcVar2;
                                                TextFieldSelectionManager textFieldSelectionManager7 = textFieldSelectionManager2;
                                                k07 k07Var5 = k07Var2;
                                                objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var5, q6cVarR, dxcVar3, textFieldSelectionManager7, imeOptions9, null);
                                                k07Var3 = k07Var5;
                                                textFieldSelectionManager3 = textFieldSelectionManager7;
                                                imeOptions6 = imeOptions9;
                                                dVarF.L(objR12);
                                            } else {
                                                k07 k07Var6 = k07Var2;
                                                textFieldSelectionManager3 = textFieldSelectionManager2;
                                                k07Var3 = k07Var6;
                                                imeOptions6 = imeOptions5;
                                            }
                                            imeOptions7 = imeOptions6;
                                            vn3.g(unit, (Function2) objR12, dVarF, 6);
                                            int i50 = i46 >> 3;
                                            z25 = z21;
                                            k07Var4 = k07Var3;
                                            textFieldSelectionManager4 = textFieldSelectionManager3;
                                            androidx.compose.ui.b bVarA2 = huc.a(companion2, textFieldSelectionManager4, z25, r48Var3, k07Var4, fVar, z10, zn8Var, dVarF, (i50 & 896) | 196614 | ((i43 >> 9) & 7168) | ((i46 << 6) & 3670016));
                                            zn8Var2 = zn8Var;
                                            final androidx.compose.ui.b bVarB = y92.b(companion2, k07Var4, textFieldValue2, zn8Var2);
                                            boolean zT7 = dVarF.T(k07Var4);
                                            if (i45 == 2048) {
                                                z26 = true;
                                            } else {
                                                z26 = false;
                                            }
                                            boolean zX3 = zT7 | z26 | dVarF.x(a0Var) | dVarF.T(textFieldSelectionManager4);
                                            if (i44 == 4) {
                                                z27 = true;
                                            } else {
                                                z27 = false;
                                            }
                                            zT2 = zX3 | z27 | dVarF.T(zn8Var2);
                                            objR13 = dVarF.R();
                                            if (!zT2 || objR13 == companion.a()) {
                                                objR13 = new Function1() { // from class: com.google.android.n82
                                                    public final Object invoke(Object obj) {
                                                        return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                                                    }
                                                };
                                                a0Var2 = a0Var;
                                                textFieldSelectionManager5 = textFieldSelectionManager4;
                                                dVarF.L(objR13);
                                            } else {
                                                textFieldSelectionManager5 = textFieldSelectionManager4;
                                                a0Var2 = a0Var;
                                            }
                                            final androidx.compose.ui.b bVarA3 = xq8.a(companion2, (Function1) objR13);
                                            textFieldSelectionManager6 = textFieldSelectionManager5;
                                            CoreTextFieldSemanticsModifier j92Var = new CoreTextFieldSemanticsModifier(transformedText, textFieldValue, k07Var4, z10, z25, nceVar3 instanceof a39, zn8Var2, textFieldSelectionManager6, imeOptions7, fVar);
                                            a0 a0Var3 = a0Var2;
                                            if (z25 != 0 || z10 || !a0Var3.b() || k07Var4.B()) {
                                                z28 = false;
                                            } else {
                                                z28 = true;
                                            }
                                            final androidx.compose.ui.b bVarA4 = y92.a(companion2, k07Var4, textFieldValue, zn8Var2, qu0Var3, z28);
                                            final nce nceVar5 = nceVar3;
                                            zT3 = dVarF.T(textFieldSelectionManager6);
                                            objR14 = dVarF.R();
                                            if (zT3 || objR14 == companion.a()) {
                                                objR14 = new Function1() { // from class: com.google.android.o82
                                                    public final Object invoke(Object obj) {
                                                        return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                                                    }
                                                };
                                                dVarF.L(objR14);
                                            }
                                            vn3.c(textFieldSelectionManager6, (Function1) objR14, dVarF, 0);
                                            boolean zT8 = dVarF.T(k07Var4) | dVarF.T(dxcVar2);
                                            if (i44 == 4) {
                                                z29 = true;
                                            } else {
                                                z29 = false;
                                            }
                                            z30 = z29 | zT8 | ((i47 <= 32 && dVarF.x(imeOptions7)) || (i46 & 48) == 32);
                                            objR15 = dVarF.R();
                                            if (z30 || objR15 == companion.a()) {
                                                objR15 = new Function1() { // from class: com.google.android.p82
                                                    public final Object invoke(Object obj) {
                                                        return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                                                    }
                                                };
                                                dVarF.L(objR15);
                                            }
                                            vn3.c(imeOptions7, (Function1) objR15, dVarF, i50 & 14);
                                            Function1<TextFieldValue, Unit> function1R = k07Var4.r();
                                            boolean z39 = !z10;
                                            i48 = i40;
                                            if (i48 == 1) {
                                                z31 = true;
                                            } else {
                                                z31 = false;
                                            }
                                            androidx.compose.ui.b bVarB2 = TextFieldKeyInputKt.b(companion2, k07Var4, textFieldSelectionManager6, textFieldValue, function1R, z39, z31, zn8Var2, rsdVar, imeOptions7.getImeAction());
                                            keyboardType = imeOptions7.getKeyboardType();
                                            companion3 = androidx.compose.ui.text.input.d.INSTANCE;
                                            if (!androidx.compose.ui.text.input.d.n(keyboardType, companion3.f()) || androidx.compose.ui.text.input.d.n(imeOptions7.getKeyboardType(), companion3.e())) {
                                                z32 = false;
                                            } else {
                                                z32 = true;
                                            }
                                            boolean zC2 = C(q6cVarR);
                                            zA = dVarF.A(z32) | dVarF.T(bVar5);
                                            objR16 = dVarF.R();
                                            if (zA || objR16 == companion.a()) {
                                                objR16 = new Function0() { // from class: com.google.android.q82
                                                    public final Object invoke() {
                                                        return CoreTextFieldKt.G(z32, bVar5);
                                                    }
                                                };
                                                dVarF.L(objR16);
                                            }
                                            androidx.compose.ui.b bVarB3 = hcc.b(companion2, zC2, z32, (Function0) objR16);
                                            ta2 ta2Var3 = ta2Var2;
                                            qu0VarE = ma0.e((qu0) dVarF.v(ma0.c()), ((ei1) dVarF.v(ma0.d())).getValue(), na0.a());
                                            zT4 = dVarF.T(k07Var4) | dVarF.x(qu0VarE);
                                            objR17 = dVarF.R();
                                            if (zT4 || objR17 == companion.a()) {
                                                objR17 = new Function1() { // from class: com.google.android.x82
                                                    public final Object invoke(Object obj) {
                                                        return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                                                    }
                                                };
                                                dVarF.L(objR17);
                                            }
                                            androidx.compose.ui.b bVarD = androidx.compose.ui.draw.c.d(companion2, (Function1) objR17);
                                            zv8 zv8VarA = tuc.a(dVarF, 0);
                                            androidx.compose.ui.b bVar7 = bVar4;
                                            androidx.compose.ui.b bVarThen = g0(zsc.b(yz6.a(bVar7.then(bVarD), bVar5, k07Var4, textFieldSelectionManager6).then(bVarB3).then(bVarA), k07Var4, ok4Var), k07Var4, textFieldSelectionManager6).then(bVarB2);
                                            final u uVar6 = uVar5;
                                            androidx.compose.ui.b bVarA0 = a0(xq8.a(TextFieldScrollKt.f(bVarThen, uVar6, r48Var3, z25, zv8VarA).then(bVarA2).then(j92Var), new Function1() { // from class: com.google.android.a92
                                                public final Object invoke(Object obj) {
                                                    return CoreTextFieldKt.I(k07Var4, (kn6) obj);
                                                }
                                            }), textFieldSelectionManager6, ta2Var3);
                                            if (!z25 && k07Var4.h() && k07Var4.C() && a0Var3.b()) {
                                                z33 = true;
                                            } else {
                                                z33 = false;
                                            }
                                            if (z33) {
                                                bVarZ = TextFieldSelectionManager_androidKt.z(companion2, textFieldSelectionManager6);
                                            } else {
                                                bVarZ = companion2;
                                            }
                                            final ps4<? super Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit>, ? super androidx.compose.p004runtime.d, ? super Integer, Unit> ps4Var3 = ps4VarB;
                                            final androidx.compose.ui.b bVar8 = bVarZ;
                                            final boolean z40 = z10;
                                            final boolean z41 = z33;
                                            final int i51 = i41;
                                            P(bVarA0, textFieldSelectionManager6, ko1.e(-814563849, true, new Function2() { // from class: com.google.android.b92
                                                public final Object invoke(Object obj, Object obj2) {
                                                    return CoreTextFieldKt.J(ps4Var3, k07Var4, textStyle4, i51, i48, uVar6, textFieldValue, nceVar5, bVarA4, bVarB, bVarA3, bVar8, cu0Var3, textFieldSelectionManager6, z41, z40, function5, zn8Var2, f43Var, (d) obj, ((Integer) obj2).intValue());
                                                }
                                            }, dVarF, 54), dVarF, 384);
                                            if (androidx.compose.p004runtime.e.k()) {
                                                androidx.compose.p004runtime.e.n();
                                            }
                                            ps4Var2 = ps4Var3;
                                            dVar2 = dVarF;
                                            function4 = function5;
                                            z7 = z40;
                                            uVar2 = uVar3;
                                            z6 = z25;
                                            r48Var2 = r48Var3;
                                            z5 = z13;
                                            mVar2 = mVar3;
                                            i39 = i41;
                                            solidColor = qu0Var3;
                                            bVar3 = bVar7;
                                            i38 = i48;
                                            nceVar2 = nceVar5;
                                            textStyle3 = textStyle4;
                                            imeOptions2 = imeOptions7;
                                        } else {
                                            imeOptions5 = imeOptions4;
                                        }
                                        z23 = true;
                                        z24 = zX2 | z23;
                                        objR12 = dVarF.R();
                                        if (z24) {
                                            ImeOptions imeOptions10 = imeOptions5;
                                            dxc dxcVar4 = dxcVar2;
                                            TextFieldSelectionManager textFieldSelectionManager8 = textFieldSelectionManager2;
                                            k07 k07Var7 = k07Var2;
                                            objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var7, q6cVarR, dxcVar4, textFieldSelectionManager8, imeOptions10, null);
                                            k07Var3 = k07Var7;
                                            textFieldSelectionManager3 = textFieldSelectionManager8;
                                            imeOptions6 = imeOptions10;
                                            dVarF.L(objR12);
                                        } else {
                                            ImeOptions imeOptions11 = imeOptions5;
                                            dxc dxcVar5 = dxcVar2;
                                            TextFieldSelectionManager textFieldSelectionManager9 = textFieldSelectionManager2;
                                            k07 k07Var8 = k07Var2;
                                            objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var8, q6cVarR, dxcVar5, textFieldSelectionManager9, imeOptions11, null);
                                            k07Var3 = k07Var8;
                                            textFieldSelectionManager3 = textFieldSelectionManager9;
                                            imeOptions6 = imeOptions11;
                                            dVarF.L(objR12);
                                        }
                                        imeOptions7 = imeOptions6;
                                        vn3.g(unit, (Function2) objR12, dVarF, 6);
                                        int i52 = i46 >> 3;
                                        z25 = z21;
                                        k07Var4 = k07Var3;
                                        textFieldSelectionManager4 = textFieldSelectionManager3;
                                        androidx.compose.ui.b bVarA5 = huc.a(companion2, textFieldSelectionManager4, z25, r48Var3, k07Var4, fVar, z10, zn8Var, dVarF, (i52 & 896) | 196614 | ((i43 >> 9) & 7168) | ((i46 << 6) & 3670016));
                                        zn8Var2 = zn8Var;
                                        final androidx.compose.ui.b bVarB4 = y92.b(companion2, k07Var4, textFieldValue2, zn8Var2);
                                        boolean zT9 = dVarF.T(k07Var4);
                                        if (i45 == 2048) {
                                            z26 = true;
                                        } else {
                                            z26 = false;
                                        }
                                        boolean zX4 = zT9 | z26 | dVarF.x(a0Var) | dVarF.T(textFieldSelectionManager4);
                                        if (i44 == 4) {
                                            z27 = true;
                                        } else {
                                            z27 = false;
                                        }
                                        zT2 = zX4 | z27 | dVarF.T(zn8Var2);
                                        objR13 = dVarF.R();
                                        if (zT2) {
                                            objR13 = new Function1() { // from class: com.google.android.n82
                                                public final Object invoke(Object obj) {
                                                    return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                                                }
                                            };
                                            a0Var2 = a0Var;
                                            textFieldSelectionManager5 = textFieldSelectionManager4;
                                            dVarF.L(objR13);
                                        } else {
                                            objR13 = new Function1() { // from class: com.google.android.n82
                                                public final Object invoke(Object obj) {
                                                    return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                                                }
                                            };
                                            a0Var2 = a0Var;
                                            textFieldSelectionManager5 = textFieldSelectionManager4;
                                            dVarF.L(objR13);
                                        }
                                        final androidx.compose.ui.b bVarA6 = xq8.a(companion2, (Function1) objR13);
                                        textFieldSelectionManager6 = textFieldSelectionManager5;
                                        CoreTextFieldSemanticsModifier j92Var2 = new CoreTextFieldSemanticsModifier(transformedText, textFieldValue, k07Var4, z10, z25, nceVar3 instanceof a39, zn8Var2, textFieldSelectionManager6, imeOptions7, fVar);
                                        a0 a0Var4 = a0Var2;
                                        if (z25 != 0) {
                                            z28 = false;
                                        } else {
                                            z28 = false;
                                        }
                                        final androidx.compose.ui.b bVarA7 = y92.a(companion2, k07Var4, textFieldValue, zn8Var2, qu0Var3, z28);
                                        final nce nceVar6 = nceVar3;
                                        zT3 = dVarF.T(textFieldSelectionManager6);
                                        objR14 = dVarF.R();
                                        if (zT3) {
                                            objR14 = new Function1() { // from class: com.google.android.o82
                                                public final Object invoke(Object obj) {
                                                    return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                                                }
                                            };
                                            dVarF.L(objR14);
                                        } else {
                                            objR14 = new Function1() { // from class: com.google.android.o82
                                                public final Object invoke(Object obj) {
                                                    return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                                                }
                                            };
                                            dVarF.L(objR14);
                                        }
                                        vn3.c(textFieldSelectionManager6, (Function1) objR14, dVarF, 0);
                                        boolean zT10 = dVarF.T(k07Var4) | dVarF.T(dxcVar2);
                                        if (i44 == 4) {
                                            z29 = true;
                                        } else {
                                            z29 = false;
                                        }
                                        z30 = z29 | zT10 | ((i47 <= 32 && dVarF.x(imeOptions7)) || (i46 & 48) == 32);
                                        objR15 = dVarF.R();
                                        if (z30) {
                                            objR15 = new Function1() { // from class: com.google.android.p82
                                                public final Object invoke(Object obj) {
                                                    return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                                                }
                                            };
                                            dVarF.L(objR15);
                                        } else {
                                            objR15 = new Function1() { // from class: com.google.android.p82
                                                public final Object invoke(Object obj) {
                                                    return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                                                }
                                            };
                                            dVarF.L(objR15);
                                        }
                                        vn3.c(imeOptions7, (Function1) objR15, dVarF, i52 & 14);
                                        Function1<TextFieldValue, Unit> function1R2 = k07Var4.r();
                                        boolean z310 = !z10;
                                        i48 = i40;
                                        if (i48 == 1) {
                                            z31 = true;
                                        } else {
                                            z31 = false;
                                        }
                                        androidx.compose.ui.b bVarB5 = TextFieldKeyInputKt.b(companion2, k07Var4, textFieldSelectionManager6, textFieldValue, function1R2, z310, z31, zn8Var2, rsdVar, imeOptions7.getImeAction());
                                        keyboardType = imeOptions7.getKeyboardType();
                                        companion3 = androidx.compose.ui.text.input.d.INSTANCE;
                                        if (androidx.compose.ui.text.input.d.n(keyboardType, companion3.f())) {
                                            z32 = false;
                                        } else {
                                            z32 = false;
                                        }
                                        boolean zC3 = C(q6cVarR);
                                        zA = dVarF.A(z32) | dVarF.T(bVar5);
                                        objR16 = dVarF.R();
                                        if (zA) {
                                            objR16 = new Function0() { // from class: com.google.android.q82
                                                public final Object invoke() {
                                                    return CoreTextFieldKt.G(z32, bVar5);
                                                }
                                            };
                                            dVarF.L(objR16);
                                        } else {
                                            objR16 = new Function0() { // from class: com.google.android.q82
                                                public final Object invoke() {
                                                    return CoreTextFieldKt.G(z32, bVar5);
                                                }
                                            };
                                            dVarF.L(objR16);
                                        }
                                        androidx.compose.ui.b bVarB6 = hcc.b(companion2, zC3, z32, (Function0) objR16);
                                        ta2 ta2Var4 = ta2Var2;
                                        qu0VarE = ma0.e((qu0) dVarF.v(ma0.c()), ((ei1) dVarF.v(ma0.d())).getValue(), na0.a());
                                        zT4 = dVarF.T(k07Var4) | dVarF.x(qu0VarE);
                                        objR17 = dVarF.R();
                                        if (zT4) {
                                            objR17 = new Function1() { // from class: com.google.android.x82
                                                public final Object invoke(Object obj) {
                                                    return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                                                }
                                            };
                                            dVarF.L(objR17);
                                        } else {
                                            objR17 = new Function1() { // from class: com.google.android.x82
                                                public final Object invoke(Object obj) {
                                                    return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                                                }
                                            };
                                            dVarF.L(objR17);
                                        }
                                        androidx.compose.ui.b bVarD2 = androidx.compose.ui.draw.c.d(companion2, (Function1) objR17);
                                        zv8 zv8VarA2 = tuc.a(dVarF, 0);
                                        androidx.compose.ui.b bVar9 = bVar4;
                                        androidx.compose.ui.b bVarThen2 = g0(zsc.b(yz6.a(bVar9.then(bVarD2), bVar5, k07Var4, textFieldSelectionManager6).then(bVarB6).then(bVarA), k07Var4, ok4Var), k07Var4, textFieldSelectionManager6).then(bVarB5);
                                        final u uVar7 = uVar5;
                                        androidx.compose.ui.b bVarA1 = a0(xq8.a(TextFieldScrollKt.f(bVarThen2, uVar7, r48Var3, z25, zv8VarA2).then(bVarA5).then(j92Var2), new Function1() { // from class: com.google.android.a92
                                            public final Object invoke(Object obj) {
                                                return CoreTextFieldKt.I(k07Var4, (kn6) obj);
                                            }
                                        }), textFieldSelectionManager6, ta2Var4);
                                        if (!z25) {
                                            z33 = false;
                                        } else {
                                            z33 = false;
                                        }
                                        if (z33) {
                                            bVarZ = TextFieldSelectionManager_androidKt.z(companion2, textFieldSelectionManager6);
                                        } else {
                                            bVarZ = companion2;
                                        }
                                        final ps4 ps4Var4 = ps4VarB;
                                        final androidx.compose.ui.b bVar10 = bVarZ;
                                        final boolean z42 = z10;
                                        final boolean z43 = z33;
                                        final int i53 = i41;
                                        P(bVarA1, textFieldSelectionManager6, ko1.e(-814563849, true, new Function2() { // from class: com.google.android.b92
                                            public final Object invoke(Object obj, Object obj2) {
                                                return CoreTextFieldKt.J(ps4Var4, k07Var4, textStyle4, i53, i48, uVar7, textFieldValue, nceVar6, bVarA7, bVarB4, bVarA6, bVar10, cu0Var3, textFieldSelectionManager6, z43, z42, function5, zn8Var2, f43Var, (d) obj, ((Integer) obj2).intValue());
                                            }
                                        }, dVarF, 54), dVarF, 384);
                                        if (androidx.compose.p004runtime.e.k()) {
                                            androidx.compose.p004runtime.e.n();
                                        }
                                        ps4Var2 = ps4Var4;
                                        dVar2 = dVarF;
                                        function4 = function5;
                                        z7 = z42;
                                        uVar2 = uVar3;
                                        z6 = z25;
                                        r48Var2 = r48Var3;
                                        z5 = z13;
                                        mVar2 = mVar3;
                                        i39 = i41;
                                        solidColor = qu0Var3;
                                        bVar3 = bVar9;
                                        i38 = i48;
                                        nceVar2 = nceVar6;
                                        textStyle3 = textStyle4;
                                        imeOptions2 = imeOptions7;
                                    } else {
                                        dxcVar2 = dxcVar;
                                    }
                                    z20 = true;
                                    zT = z36 | z20 | dVarF.T(offsetMapping) | dVarF.T(ta2Var) | dVarF.T(cu0Var) | dVarF.T(textFieldSelectionManager);
                                    objR11 = dVarF.R();
                                    if (zT) {
                                        zn8Var = offsetMapping;
                                        final ImeOptions imeOptions12 = imeOptions3;
                                        final boolean z311 = z11;
                                        final boolean z312 = z10;
                                        objR11 = new Function1() { // from class: com.google.android.h92
                                            public final Object invoke(Object obj) {
                                                return CoreTextFieldKt.B(k07Var, z311, z312, dxcVar2, textFieldValue, imeOptions12, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                                            }
                                        };
                                        k07Var2 = k07Var;
                                        z21 = z311;
                                        textFieldValue2 = textFieldValue;
                                        imeOptions4 = imeOptions12;
                                        textFieldSelectionManager2 = textFieldSelectionManager;
                                        ta2Var2 = ta2Var;
                                        cu0Var2 = cu0Var;
                                        dVarF.L(objR11);
                                    } else {
                                        zn8Var = offsetMapping;
                                        final ImeOptions imeOptions13 = imeOptions3;
                                        final boolean z313 = z11;
                                        final boolean z314 = z10;
                                        objR11 = new Function1() { // from class: com.google.android.h92
                                            public final Object invoke(Object obj) {
                                                return CoreTextFieldKt.B(k07Var, z313, z314, dxcVar2, textFieldValue, imeOptions13, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                                            }
                                        };
                                        k07Var2 = k07Var;
                                        z21 = z313;
                                        textFieldValue2 = textFieldValue;
                                        imeOptions4 = imeOptions13;
                                        textFieldSelectionManager2 = textFieldSelectionManager;
                                        ta2Var2 = ta2Var;
                                        cu0Var2 = cu0Var;
                                        dVarF.L(objR11);
                                    }
                                    final cu0 cu0Var4 = cu0Var2;
                                    androidx.compose.ui.b bVarA8 = atc.a(companion2, z21, fVar, r48Var3, (Function1) objR11);
                                    if (z21) {
                                        z22 = false;
                                    } else {
                                        z22 = false;
                                    }
                                    q6cVarR = p0.r(Boolean.valueOf(z22), dVarF, 0);
                                    Unit unit2 = Unit.a;
                                    boolean zX5 = dVarF.x(q6cVarR) | dVarF.T(k07Var2) | dVarF.T(dxcVar2) | dVarF.T(textFieldSelectionManager2);
                                    if (i47 > 32) {
                                        imeOptions5 = imeOptions4;
                                        if ((i46 & 48) != 32) {
                                            z23 = true;
                                        } else {
                                            z23 = false;
                                        }
                                    } else {
                                        imeOptions5 = imeOptions4;
                                        if ((i46 & 48) != 32) {
                                            z23 = true;
                                        } else {
                                            z23 = false;
                                        }
                                    }
                                    z24 = zX5 | z23;
                                    objR12 = dVarF.R();
                                    if (z24) {
                                        ImeOptions imeOptions14 = imeOptions5;
                                        dxc dxcVar6 = dxcVar2;
                                        TextFieldSelectionManager textFieldSelectionManager10 = textFieldSelectionManager2;
                                        k07 k07Var9 = k07Var2;
                                        objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var9, q6cVarR, dxcVar6, textFieldSelectionManager10, imeOptions14, null);
                                        k07Var3 = k07Var9;
                                        textFieldSelectionManager3 = textFieldSelectionManager10;
                                        imeOptions6 = imeOptions14;
                                        dVarF.L(objR12);
                                    } else {
                                        ImeOptions imeOptions15 = imeOptions5;
                                        dxc dxcVar7 = dxcVar2;
                                        TextFieldSelectionManager textFieldSelectionManager11 = textFieldSelectionManager2;
                                        k07 k07Var10 = k07Var2;
                                        objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var10, q6cVarR, dxcVar7, textFieldSelectionManager11, imeOptions15, null);
                                        k07Var3 = k07Var10;
                                        textFieldSelectionManager3 = textFieldSelectionManager11;
                                        imeOptions6 = imeOptions15;
                                        dVarF.L(objR12);
                                    }
                                    imeOptions7 = imeOptions6;
                                    vn3.g(unit2, (Function2) objR12, dVarF, 6);
                                    int i54 = i46 >> 3;
                                    z25 = z21;
                                    k07Var4 = k07Var3;
                                    textFieldSelectionManager4 = textFieldSelectionManager3;
                                    androidx.compose.ui.b bVarA9 = huc.a(companion2, textFieldSelectionManager4, z25, r48Var3, k07Var4, fVar, z10, zn8Var, dVarF, (i54 & 896) | 196614 | ((i43 >> 9) & 7168) | ((i46 << 6) & 3670016));
                                    zn8Var2 = zn8Var;
                                    final androidx.compose.ui.b bVarB7 = y92.b(companion2, k07Var4, textFieldValue2, zn8Var2);
                                    boolean zT11 = dVarF.T(k07Var4);
                                    if (i45 == 2048) {
                                        z26 = true;
                                    } else {
                                        z26 = false;
                                    }
                                    boolean zX6 = zT11 | z26 | dVarF.x(a0Var) | dVarF.T(textFieldSelectionManager4);
                                    if (i44 == 4) {
                                        z27 = true;
                                    } else {
                                        z27 = false;
                                    }
                                    zT2 = zX6 | z27 | dVarF.T(zn8Var2);
                                    objR13 = dVarF.R();
                                    if (zT2) {
                                        objR13 = new Function1() { // from class: com.google.android.n82
                                            public final Object invoke(Object obj) {
                                                return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                                            }
                                        };
                                        a0Var2 = a0Var;
                                        textFieldSelectionManager5 = textFieldSelectionManager4;
                                        dVarF.L(objR13);
                                    } else {
                                        objR13 = new Function1() { // from class: com.google.android.n82
                                            public final Object invoke(Object obj) {
                                                return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                                            }
                                        };
                                        a0Var2 = a0Var;
                                        textFieldSelectionManager5 = textFieldSelectionManager4;
                                        dVarF.L(objR13);
                                    }
                                    final androidx.compose.ui.b bVarA10 = xq8.a(companion2, (Function1) objR13);
                                    textFieldSelectionManager6 = textFieldSelectionManager5;
                                    CoreTextFieldSemanticsModifier j92Var3 = new CoreTextFieldSemanticsModifier(transformedText, textFieldValue, k07Var4, z10, z25, nceVar3 instanceof a39, zn8Var2, textFieldSelectionManager6, imeOptions7, fVar);
                                    a0 a0Var5 = a0Var2;
                                    if (z25 != 0) {
                                        z28 = false;
                                    } else {
                                        z28 = false;
                                    }
                                    final androidx.compose.ui.b bVarA11 = y92.a(companion2, k07Var4, textFieldValue, zn8Var2, qu0Var3, z28);
                                    final nce nceVar7 = nceVar3;
                                    zT3 = dVarF.T(textFieldSelectionManager6);
                                    objR14 = dVarF.R();
                                    if (zT3) {
                                        objR14 = new Function1() { // from class: com.google.android.o82
                                            public final Object invoke(Object obj) {
                                                return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                                            }
                                        };
                                        dVarF.L(objR14);
                                    } else {
                                        objR14 = new Function1() { // from class: com.google.android.o82
                                            public final Object invoke(Object obj) {
                                                return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                                            }
                                        };
                                        dVarF.L(objR14);
                                    }
                                    vn3.c(textFieldSelectionManager6, (Function1) objR14, dVarF, 0);
                                    boolean zT12 = dVarF.T(k07Var4) | dVarF.T(dxcVar2);
                                    if (i44 == 4) {
                                        z29 = true;
                                    } else {
                                        z29 = false;
                                    }
                                    z30 = z29 | zT12 | ((i47 <= 32 && dVarF.x(imeOptions7)) || (i46 & 48) == 32);
                                    objR15 = dVarF.R();
                                    if (z30) {
                                        objR15 = new Function1() { // from class: com.google.android.p82
                                            public final Object invoke(Object obj) {
                                                return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                                            }
                                        };
                                        dVarF.L(objR15);
                                    } else {
                                        objR15 = new Function1() { // from class: com.google.android.p82
                                            public final Object invoke(Object obj) {
                                                return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                                            }
                                        };
                                        dVarF.L(objR15);
                                    }
                                    vn3.c(imeOptions7, (Function1) objR15, dVarF, i54 & 14);
                                    Function1<TextFieldValue, Unit> function1R3 = k07Var4.r();
                                    boolean z315 = !z10;
                                    i48 = i40;
                                    if (i48 == 1) {
                                        z31 = true;
                                    } else {
                                        z31 = false;
                                    }
                                    androidx.compose.ui.b bVarB8 = TextFieldKeyInputKt.b(companion2, k07Var4, textFieldSelectionManager6, textFieldValue, function1R3, z315, z31, zn8Var2, rsdVar, imeOptions7.getImeAction());
                                    keyboardType = imeOptions7.getKeyboardType();
                                    companion3 = androidx.compose.ui.text.input.d.INSTANCE;
                                    if (androidx.compose.ui.text.input.d.n(keyboardType, companion3.f())) {
                                        z32 = false;
                                    } else {
                                        z32 = false;
                                    }
                                    boolean zC4 = C(q6cVarR);
                                    zA = dVarF.A(z32) | dVarF.T(bVar5);
                                    objR16 = dVarF.R();
                                    if (zA) {
                                        objR16 = new Function0() { // from class: com.google.android.q82
                                            public final Object invoke() {
                                                return CoreTextFieldKt.G(z32, bVar5);
                                            }
                                        };
                                        dVarF.L(objR16);
                                    } else {
                                        objR16 = new Function0() { // from class: com.google.android.q82
                                            public final Object invoke() {
                                                return CoreTextFieldKt.G(z32, bVar5);
                                            }
                                        };
                                        dVarF.L(objR16);
                                    }
                                    androidx.compose.ui.b bVarB9 = hcc.b(companion2, zC4, z32, (Function0) objR16);
                                    ta2 ta2Var5 = ta2Var2;
                                    qu0VarE = ma0.e((qu0) dVarF.v(ma0.c()), ((ei1) dVarF.v(ma0.d())).getValue(), na0.a());
                                    zT4 = dVarF.T(k07Var4) | dVarF.x(qu0VarE);
                                    objR17 = dVarF.R();
                                    if (zT4) {
                                        objR17 = new Function1() { // from class: com.google.android.x82
                                            public final Object invoke(Object obj) {
                                                return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                                            }
                                        };
                                        dVarF.L(objR17);
                                    } else {
                                        objR17 = new Function1() { // from class: com.google.android.x82
                                            public final Object invoke(Object obj) {
                                                return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                                            }
                                        };
                                        dVarF.L(objR17);
                                    }
                                    androidx.compose.ui.b bVarD3 = androidx.compose.ui.draw.c.d(companion2, (Function1) objR17);
                                    zv8 zv8VarA3 = tuc.a(dVarF, 0);
                                    androidx.compose.ui.b bVar11 = bVar4;
                                    androidx.compose.ui.b bVarThen3 = g0(zsc.b(yz6.a(bVar11.then(bVarD3), bVar5, k07Var4, textFieldSelectionManager6).then(bVarB9).then(bVarA8), k07Var4, ok4Var), k07Var4, textFieldSelectionManager6).then(bVarB8);
                                    final u uVar8 = uVar5;
                                    androidx.compose.ui.b bVarA12 = a0(xq8.a(TextFieldScrollKt.f(bVarThen3, uVar8, r48Var3, z25, zv8VarA3).then(bVarA9).then(j92Var3), new Function1() { // from class: com.google.android.a92
                                        public final Object invoke(Object obj) {
                                            return CoreTextFieldKt.I(k07Var4, (kn6) obj);
                                        }
                                    }), textFieldSelectionManager6, ta2Var5);
                                    if (!z25) {
                                        z33 = false;
                                    } else {
                                        z33 = false;
                                    }
                                    if (z33) {
                                        bVarZ = TextFieldSelectionManager_androidKt.z(companion2, textFieldSelectionManager6);
                                    } else {
                                        bVarZ = companion2;
                                    }
                                    final ps4 ps4Var5 = ps4VarB;
                                    final androidx.compose.ui.b bVar12 = bVarZ;
                                    final boolean z44 = z10;
                                    final boolean z45 = z33;
                                    final int i55 = i41;
                                    P(bVarA12, textFieldSelectionManager6, ko1.e(-814563849, true, new Function2() { // from class: com.google.android.b92
                                        public final Object invoke(Object obj, Object obj2) {
                                            return CoreTextFieldKt.J(ps4Var5, k07Var4, textStyle4, i55, i48, uVar8, textFieldValue, nceVar7, bVarA11, bVarB7, bVarA10, bVar12, cu0Var4, textFieldSelectionManager6, z45, z44, function5, zn8Var2, f43Var, (d) obj, ((Integer) obj2).intValue());
                                        }
                                    }, dVarF, 54), dVarF, 384);
                                    if (androidx.compose.p004runtime.e.k()) {
                                        androidx.compose.p004runtime.e.n();
                                    }
                                    ps4Var2 = ps4Var5;
                                    dVar2 = dVarF;
                                    function4 = function5;
                                    z7 = z44;
                                    uVar2 = uVar3;
                                    z6 = z25;
                                    r48Var2 = r48Var3;
                                    z5 = z13;
                                    mVar2 = mVar3;
                                    i39 = i41;
                                    solidColor = qu0Var3;
                                    bVar3 = bVar11;
                                    i38 = i48;
                                    nceVar2 = nceVar7;
                                    textStyle3 = textStyle4;
                                    imeOptions2 = imeOptions7;
                                } else {
                                    dVarF.q();
                                    if ((i5 & 2048) != 0) {
                                        i33 &= -113;
                                    }
                                    i40 = i;
                                    i41 = i2;
                                    mVarA = mVar;
                                    z10 = z3;
                                    ps4VarB = ps4Var;
                                    qu0Var2 = solidColor;
                                    function5 = function3;
                                    nceVar3 = nceVarC;
                                    bVar4 = bVar2;
                                    i42 = i33;
                                    z12 = z;
                                    imeOptions3 = imeOptions;
                                    z11 = z2;
                                }
                                uVar3 = uVar;
                                dVarF.M();
                                qu0Var3 = qu0Var2;
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.o(31062401, i6, i42, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                                }
                                objR2 = dVarF.R();
                                companion = androidx.compose.p004runtime.d.INSTANCE;
                                if (objR2 == companion.a()) {
                                    objR2 = new androidx.compose.ui.focus.f();
                                    dVarF.L(objR2);
                                }
                                fVar = (androidx.compose.ui.focus.f) objR2;
                                objR3 = dVarF.R();
                                i43 = i6;
                                if (objR3 == companion.a()) {
                                    objR3 = LegacyPlatformTextInputServiceAdapter_androidKt.b();
                                    dVarF.L(objR3);
                                }
                                bVar5 = (androidx.compose.p001foundation.text.input.internal.b) objR3;
                                objR4 = dVarF.R();
                                if (objR4 == companion.a()) {
                                    objR4 = new dxc(bVar5);
                                    dVarF.L(objR4);
                                }
                                dxcVar = (dxc) objR4;
                                f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                                bVar6 = (l.b) dVarF.v(CompositionLocalsKt.i());
                                selectionBackgroundColor = ((SelectionColors) dVarF.v(jzc.c())).getSelectionBackgroundColor();
                                ok4Var = (ok4) dVarF.v(CompositionLocalsKt.h());
                                a0Var = (a0) dVarF.v(CompositionLocalsKt.v());
                                textStyle4 = textStyle2;
                                hybVar = (hyb) dVarF.v(CompositionLocalsKt.r());
                                z13 = z12;
                                if (i40 == 1) {
                                    orientation = Orientation.Vertical;
                                } else {
                                    orientation = Orientation.Vertical;
                                }
                                if (uVar3 == null) {
                                    dVarF.y(-213744626);
                                    Object[] objArr2 = {orientation};
                                    k0b<u, Object> k0bVarA2 = u.INSTANCE.a();
                                    zC = dVarF.C(orientation.ordinal());
                                    objR18 = dVarF.R();
                                    if (zC) {
                                        objR18 = new Function0() { // from class: com.google.android.d92
                                            public final Object invoke() {
                                                return CoreTextFieldKt.O(orientation);
                                            }
                                        };
                                        dVarF.L(objR18);
                                    } else {
                                        objR18 = new Function0() { // from class: com.google.android.d92
                                            public final Object invoke() {
                                                return CoreTextFieldKt.O(orientation);
                                            }
                                        };
                                        dVarF.L(objR18);
                                    }
                                    uVar4 = (u) dfa.k(objArr2, k0bVarA2, (Function0) objR18, dVarF, 0);
                                    dVarF.u();
                                } else {
                                    dVarF.y(-213745742);
                                    dVarF.u();
                                    uVar4 = uVar3;
                                }
                                if (uVar4.j() != orientation) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Mismatching scroller orientation; ");
                                    if (orientation == Orientation.Vertical) {
                                        str = "only single-line, non-wrap text fields can scroll horizontally";
                                    } else {
                                        str = "single-line, non-wrap text fields can only scroll horizontally";
                                    }
                                    sb2.append(str);
                                    throw new IllegalArgumentException(sb2.toString());
                                }
                                i44 = i43 & 14;
                                if (i44 == 4) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if ((i43 & 57344) == 16384) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                z16 = z14 | z15;
                                objR5 = dVarF.R();
                                if (z16) {
                                    transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                                    composition = textFieldValue.getComposition();
                                    if (composition != null) {
                                        uVar5 = uVar4;
                                        transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                        if (transformedTextC2 != null) {
                                            objR5 = transformedTextC2;
                                        }
                                        dVarF.L(objR5);
                                    } else {
                                        uVar5 = uVar4;
                                    }
                                    objR5 = transformedTextC;
                                    dVarF.L(objR5);
                                } else {
                                    transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                                    composition = textFieldValue.getComposition();
                                    if (composition != null) {
                                        uVar5 = uVar4;
                                        transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                        if (transformedTextC2 != null) {
                                            objR5 = transformedTextC2;
                                        }
                                        dVarF.L(objR5);
                                    } else {
                                        uVar5 = uVar4;
                                    }
                                    objR5 = transformedTextC;
                                    dVarF.L(objR5);
                                }
                                TransformedText transformedText2 = (TransformedText) objR5;
                                text = transformedText2.getText();
                                offsetMapping = transformedText2.getOffsetMapping();
                                qaaVarC = pp1.c(dVarF, 0);
                                zX = dVarF.x(hybVar);
                                objR6 = dVarF.R();
                                if (zX) {
                                    objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                                    dVarF.L(objR6);
                                } else {
                                    objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                                    dVarF.L(objR6);
                                }
                                k07Var = (k07) objR6;
                                m mVar4 = mVarA;
                                k07Var.X(textFieldValue.getText(), text, textStyle4, z13, r54, bVar6, function1, mVar4, ok4Var, selectionBackgroundColor);
                                k07Var.getProcessor().e(textFieldValue, k07Var.getInputSession());
                                objR7 = dVarF.R();
                                if (objR7 == companion.a()) {
                                    objR7 = new rsd(0, 1, null);
                                    dVarF.L(objR7);
                                }
                                rsdVar = (rsd) objR7;
                                rsd.f(rsdVar, textFieldValue, 0L, 2, null);
                                objR8 = dVarF.R();
                                if (objR8 == companion.a()) {
                                    objR8 = vn3.k(EmptyCoroutineContext.a, dVarF);
                                    dVarF.L(objR8);
                                }
                                ta2Var = (ta2) objR8;
                                objR9 = dVarF.R();
                                if (objR9 == companion.a()) {
                                    objR9 = androidx.compose.p001foundation.relocation.c.a();
                                    dVarF.L(objR9);
                                }
                                cu0Var = (cu0) objR9;
                                objR10 = dVarF.R();
                                r48 r48Var4 = r48Var2;
                                if (objR10 == companion.a()) {
                                    objR10 = new TextFieldSelectionManager(rsdVar);
                                    dVarF.L(objR10);
                                }
                                textFieldSelectionManager = (TextFieldSelectionManager) objR10;
                                textFieldSelectionManager.L0(offsetMapping);
                                textFieldSelectionManager.U0(nceVar3);
                                textFieldSelectionManager.M0(k07Var.r());
                                textFieldSelectionManager.Q0(k07Var);
                                textFieldSelectionManager.T0(textFieldValue);
                                textFieldSelectionManager.z0((jf1) dVarF.v(CompositionLocalsKt.d()));
                                textFieldSelectionManager.A0(ta2Var);
                                textFieldSelectionManager.R0((yzc) dVarF.v(CompositionLocalsKt.s()));
                                textFieldSelectionManager.I0((c65) dVarF.v(CompositionLocalsKt.k()));
                                textFieldSelectionManager.G0(fVar);
                                textFieldSelectionManager.E0(!z10);
                                textFieldSelectionManager.F0(z11);
                                if (up1.isSmartSelectionEnabled) {
                                    dVarF.y(1966756105);
                                    textFieldSelectionManager.N0(androidx.compose.p001foundation.text.selection.c.h(SelectedTextType.EditableText, textStyle4.u(), dVarF, 6));
                                    dVarF.u();
                                } else {
                                    dVarF.y(1966902177);
                                    dVarF.u();
                                }
                                k07Var.h();
                                new Function1() { // from class: com.google.android.e92
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.y(textFieldSelectionManager, (b) obj);
                                    }
                                };
                                new Function0() { // from class: com.google.android.f92
                                    public final Object invoke() {
                                        return CoreTextFieldKt.z(textFieldSelectionManager);
                                    }
                                };
                                new Function0() { // from class: com.google.android.g92
                                    public final Object invoke() {
                                        return CoreTextFieldKt.A(textFieldSelectionManager);
                                    }
                                };
                                companion2 = androidx.compose.ui.b.INSTANCE;
                                boolean zT13 = dVarF.T(k07Var);
                                i45 = i42 & 7168;
                                i46 = i42;
                                if (i45 == 2048) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                boolean z316 = z17 | zT13;
                                if ((i46 & 57344) == 16384) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                boolean zT14 = z316 | z18 | dVarF.T(dxcVar);
                                if (i44 == 4) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                boolean z317 = zT14 | z19;
                                i47 = (i46 & 112) ^ 48;
                                if (i47 > 32) {
                                    dxcVar2 = dxcVar;
                                    if ((i46 & 48) != 32) {
                                        z20 = true;
                                    } else {
                                        z20 = false;
                                    }
                                } else {
                                    dxcVar2 = dxcVar;
                                    if ((i46 & 48) != 32) {
                                        z20 = true;
                                    } else {
                                        z20 = false;
                                    }
                                }
                                zT = z317 | z20 | dVarF.T(offsetMapping) | dVarF.T(ta2Var) | dVarF.T(cu0Var) | dVarF.T(textFieldSelectionManager);
                                objR11 = dVarF.R();
                                if (zT) {
                                    zn8Var = offsetMapping;
                                    final ImeOptions imeOptions16 = imeOptions3;
                                    final boolean z318 = z11;
                                    final boolean z319 = z10;
                                    objR11 = new Function1() { // from class: com.google.android.h92
                                        public final Object invoke(Object obj) {
                                            return CoreTextFieldKt.B(k07Var, z318, z319, dxcVar2, textFieldValue, imeOptions16, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                                        }
                                    };
                                    k07Var2 = k07Var;
                                    z21 = z318;
                                    textFieldValue2 = textFieldValue;
                                    imeOptions4 = imeOptions16;
                                    textFieldSelectionManager2 = textFieldSelectionManager;
                                    ta2Var2 = ta2Var;
                                    cu0Var2 = cu0Var;
                                    dVarF.L(objR11);
                                } else {
                                    zn8Var = offsetMapping;
                                    final ImeOptions imeOptions17 = imeOptions3;
                                    final boolean z3110 = z11;
                                    final boolean z3111 = z10;
                                    objR11 = new Function1() { // from class: com.google.android.h92
                                        public final Object invoke(Object obj) {
                                            return CoreTextFieldKt.B(k07Var, z3110, z3111, dxcVar2, textFieldValue, imeOptions17, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                                        }
                                    };
                                    k07Var2 = k07Var;
                                    z21 = z3110;
                                    textFieldValue2 = textFieldValue;
                                    imeOptions4 = imeOptions17;
                                    textFieldSelectionManager2 = textFieldSelectionManager;
                                    ta2Var2 = ta2Var;
                                    cu0Var2 = cu0Var;
                                    dVarF.L(objR11);
                                }
                                final cu0 cu0Var5 = cu0Var2;
                                androidx.compose.ui.b bVarA13 = atc.a(companion2, z21, fVar, r48Var4, (Function1) objR11);
                                if (z21) {
                                    z22 = false;
                                } else {
                                    z22 = false;
                                }
                                q6cVarR = p0.r(Boolean.valueOf(z22), dVarF, 0);
                                Unit unit3 = Unit.a;
                                boolean zX7 = dVarF.x(q6cVarR) | dVarF.T(k07Var2) | dVarF.T(dxcVar2) | dVarF.T(textFieldSelectionManager2);
                                if (i47 > 32) {
                                    imeOptions5 = imeOptions4;
                                    if ((i46 & 48) != 32) {
                                        z23 = true;
                                    } else {
                                        z23 = false;
                                    }
                                } else {
                                    imeOptions5 = imeOptions4;
                                    if ((i46 & 48) != 32) {
                                        z23 = true;
                                    } else {
                                        z23 = false;
                                    }
                                }
                                z24 = zX7 | z23;
                                objR12 = dVarF.R();
                                if (z24) {
                                    ImeOptions imeOptions18 = imeOptions5;
                                    dxc dxcVar8 = dxcVar2;
                                    TextFieldSelectionManager textFieldSelectionManager12 = textFieldSelectionManager2;
                                    k07 k07Var11 = k07Var2;
                                    objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var11, q6cVarR, dxcVar8, textFieldSelectionManager12, imeOptions18, null);
                                    k07Var3 = k07Var11;
                                    textFieldSelectionManager3 = textFieldSelectionManager12;
                                    imeOptions6 = imeOptions18;
                                    dVarF.L(objR12);
                                } else {
                                    ImeOptions imeOptions19 = imeOptions5;
                                    dxc dxcVar9 = dxcVar2;
                                    TextFieldSelectionManager textFieldSelectionManager13 = textFieldSelectionManager2;
                                    k07 k07Var12 = k07Var2;
                                    objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var12, q6cVarR, dxcVar9, textFieldSelectionManager13, imeOptions19, null);
                                    k07Var3 = k07Var12;
                                    textFieldSelectionManager3 = textFieldSelectionManager13;
                                    imeOptions6 = imeOptions19;
                                    dVarF.L(objR12);
                                }
                                imeOptions7 = imeOptions6;
                                vn3.g(unit3, (Function2) objR12, dVarF, 6);
                                int i56 = i46 >> 3;
                                z25 = z21;
                                k07Var4 = k07Var3;
                                textFieldSelectionManager4 = textFieldSelectionManager3;
                                androidx.compose.ui.b bVarA14 = huc.a(companion2, textFieldSelectionManager4, z25, r48Var4, k07Var4, fVar, z10, zn8Var, dVarF, (i56 & 896) | 196614 | ((i43 >> 9) & 7168) | ((i46 << 6) & 3670016));
                                zn8Var2 = zn8Var;
                                final androidx.compose.ui.b bVarB10 = y92.b(companion2, k07Var4, textFieldValue2, zn8Var2);
                                boolean zT15 = dVarF.T(k07Var4);
                                if (i45 == 2048) {
                                    z26 = true;
                                } else {
                                    z26 = false;
                                }
                                boolean zX8 = zT15 | z26 | dVarF.x(a0Var) | dVarF.T(textFieldSelectionManager4);
                                if (i44 == 4) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                zT2 = zX8 | z27 | dVarF.T(zn8Var2);
                                objR13 = dVarF.R();
                                if (zT2) {
                                    objR13 = new Function1() { // from class: com.google.android.n82
                                        public final Object invoke(Object obj) {
                                            return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                                        }
                                    };
                                    a0Var2 = a0Var;
                                    textFieldSelectionManager5 = textFieldSelectionManager4;
                                    dVarF.L(objR13);
                                } else {
                                    objR13 = new Function1() { // from class: com.google.android.n82
                                        public final Object invoke(Object obj) {
                                            return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                                        }
                                    };
                                    a0Var2 = a0Var;
                                    textFieldSelectionManager5 = textFieldSelectionManager4;
                                    dVarF.L(objR13);
                                }
                                final androidx.compose.ui.b bVarA15 = xq8.a(companion2, (Function1) objR13);
                                textFieldSelectionManager6 = textFieldSelectionManager5;
                                CoreTextFieldSemanticsModifier j92Var4 = new CoreTextFieldSemanticsModifier(transformedText2, textFieldValue, k07Var4, z10, z25, nceVar3 instanceof a39, zn8Var2, textFieldSelectionManager6, imeOptions7, fVar);
                                a0 a0Var6 = a0Var2;
                                if (z25 != 0) {
                                    z28 = false;
                                } else {
                                    z28 = false;
                                }
                                final androidx.compose.ui.b bVarA16 = y92.a(companion2, k07Var4, textFieldValue, zn8Var2, qu0Var3, z28);
                                final nce nceVar8 = nceVar3;
                                zT3 = dVarF.T(textFieldSelectionManager6);
                                objR14 = dVarF.R();
                                if (zT3) {
                                    objR14 = new Function1() { // from class: com.google.android.o82
                                        public final Object invoke(Object obj) {
                                            return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                                        }
                                    };
                                    dVarF.L(objR14);
                                } else {
                                    objR14 = new Function1() { // from class: com.google.android.o82
                                        public final Object invoke(Object obj) {
                                            return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                                        }
                                    };
                                    dVarF.L(objR14);
                                }
                                vn3.c(textFieldSelectionManager6, (Function1) objR14, dVarF, 0);
                                boolean zT16 = dVarF.T(k07Var4) | dVarF.T(dxcVar2);
                                if (i44 == 4) {
                                    z29 = true;
                                } else {
                                    z29 = false;
                                }
                                z30 = z29 | zT16 | ((i47 <= 32 && dVarF.x(imeOptions7)) || (i46 & 48) == 32);
                                objR15 = dVarF.R();
                                if (z30) {
                                    objR15 = new Function1() { // from class: com.google.android.p82
                                        public final Object invoke(Object obj) {
                                            return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                                        }
                                    };
                                    dVarF.L(objR15);
                                } else {
                                    objR15 = new Function1() { // from class: com.google.android.p82
                                        public final Object invoke(Object obj) {
                                            return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                                        }
                                    };
                                    dVarF.L(objR15);
                                }
                                vn3.c(imeOptions7, (Function1) objR15, dVarF, i56 & 14);
                                Function1<TextFieldValue, Unit> function1R4 = k07Var4.r();
                                boolean z3112 = !z10;
                                i48 = i40;
                                if (i48 == 1) {
                                    z31 = true;
                                } else {
                                    z31 = false;
                                }
                                androidx.compose.ui.b bVarB11 = TextFieldKeyInputKt.b(companion2, k07Var4, textFieldSelectionManager6, textFieldValue, function1R4, z3112, z31, zn8Var2, rsdVar, imeOptions7.getImeAction());
                                keyboardType = imeOptions7.getKeyboardType();
                                companion3 = androidx.compose.ui.text.input.d.INSTANCE;
                                if (androidx.compose.ui.text.input.d.n(keyboardType, companion3.f())) {
                                    z32 = false;
                                } else {
                                    z32 = false;
                                }
                                boolean zC5 = C(q6cVarR);
                                zA = dVarF.A(z32) | dVarF.T(bVar5);
                                objR16 = dVarF.R();
                                if (zA) {
                                    objR16 = new Function0() { // from class: com.google.android.q82
                                        public final Object invoke() {
                                            return CoreTextFieldKt.G(z32, bVar5);
                                        }
                                    };
                                    dVarF.L(objR16);
                                } else {
                                    objR16 = new Function0() { // from class: com.google.android.q82
                                        public final Object invoke() {
                                            return CoreTextFieldKt.G(z32, bVar5);
                                        }
                                    };
                                    dVarF.L(objR16);
                                }
                                androidx.compose.ui.b bVarB12 = hcc.b(companion2, zC5, z32, (Function0) objR16);
                                ta2 ta2Var6 = ta2Var2;
                                qu0VarE = ma0.e((qu0) dVarF.v(ma0.c()), ((ei1) dVarF.v(ma0.d())).getValue(), na0.a());
                                zT4 = dVarF.T(k07Var4) | dVarF.x(qu0VarE);
                                objR17 = dVarF.R();
                                if (zT4) {
                                    objR17 = new Function1() { // from class: com.google.android.x82
                                        public final Object invoke(Object obj) {
                                            return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                                        }
                                    };
                                    dVarF.L(objR17);
                                } else {
                                    objR17 = new Function1() { // from class: com.google.android.x82
                                        public final Object invoke(Object obj) {
                                            return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                                        }
                                    };
                                    dVarF.L(objR17);
                                }
                                androidx.compose.ui.b bVarD4 = androidx.compose.ui.draw.c.d(companion2, (Function1) objR17);
                                zv8 zv8VarA4 = tuc.a(dVarF, 0);
                                androidx.compose.ui.b bVar13 = bVar4;
                                androidx.compose.ui.b bVarThen4 = g0(zsc.b(yz6.a(bVar13.then(bVarD4), bVar5, k07Var4, textFieldSelectionManager6).then(bVarB12).then(bVarA13), k07Var4, ok4Var), k07Var4, textFieldSelectionManager6).then(bVarB11);
                                final u uVar9 = uVar5;
                                androidx.compose.ui.b bVarA17 = a0(xq8.a(TextFieldScrollKt.f(bVarThen4, uVar9, r48Var4, z25, zv8VarA4).then(bVarA14).then(j92Var4), new Function1() { // from class: com.google.android.a92
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.I(k07Var4, (kn6) obj);
                                    }
                                }), textFieldSelectionManager6, ta2Var6);
                                if (!z25) {
                                    z33 = false;
                                } else {
                                    z33 = false;
                                }
                                if (z33) {
                                    bVarZ = TextFieldSelectionManager_androidKt.z(companion2, textFieldSelectionManager6);
                                } else {
                                    bVarZ = companion2;
                                }
                                final ps4 ps4Var6 = ps4VarB;
                                final androidx.compose.ui.b bVar14 = bVarZ;
                                final boolean z46 = z10;
                                final boolean z47 = z33;
                                final int i57 = i41;
                                P(bVarA17, textFieldSelectionManager6, ko1.e(-814563849, true, new Function2() { // from class: com.google.android.b92
                                    public final Object invoke(Object obj, Object obj2) {
                                        return CoreTextFieldKt.J(ps4Var6, k07Var4, textStyle4, i57, i48, uVar9, textFieldValue, nceVar8, bVarA16, bVarB10, bVarA15, bVar14, cu0Var5, textFieldSelectionManager6, z47, z46, function5, zn8Var2, f43Var, (d) obj, ((Integer) obj2).intValue());
                                    }
                                }, dVarF, 54), dVarF, 384);
                                if (androidx.compose.p004runtime.e.k()) {
                                    androidx.compose.p004runtime.e.n();
                                }
                                ps4Var2 = ps4Var6;
                                dVar2 = dVarF;
                                function4 = function5;
                                z7 = z46;
                                uVar2 = uVar3;
                                z6 = z25;
                                r48Var2 = r48Var4;
                                z5 = z13;
                                mVar2 = mVar4;
                                i39 = i41;
                                solidColor = qu0Var3;
                                bVar3 = bVar13;
                                i38 = i48;
                                nceVar2 = nceVar8;
                                textStyle3 = textStyle4;
                                imeOptions2 = imeOptions7;
                            } else {
                                dVarF.q();
                                z5 = z;
                                imeOptions2 = imeOptions;
                                mVar2 = mVar;
                                ps4Var2 = ps4Var;
                                uVar2 = uVar;
                                dVar2 = dVarF;
                                textStyle3 = textStyle2;
                                function4 = function3;
                                nceVar2 = nceVarC;
                                bVar3 = bVar2;
                                i38 = i;
                                i39 = i2;
                                z6 = z2;
                                z7 = z3;
                            }
                            s6bVarH = dVar2.H();
                            if (s6bVarH != null) {
                                s6bVarH.a(new Function2() { // from class: com.google.android.c92
                                    public final Object invoke(Object obj, Object obj2) {
                                        return CoreTextFieldKt.N(textFieldValue, function1, bVar3, textStyle3, nceVar2, function4, r48Var2, solidColor, z5, i38, i39, imeOptions2, mVar2, z6, z7, ps4Var2, uVar2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i6 |= 805306368;
                        i21 = i5 & 1024;
                        if (i21 != 0) {
                            i22 = i4 | 6;
                        } else if ((i4 & 6) == 0) {
                            if (dVarF.C(i2)) {
                                i23 = 4;
                            } else {
                                i23 = 2;
                            }
                            i22 = i4 | i23;
                        } else {
                            i22 = i4;
                        }
                        if ((i4 & 48) != 0) {
                            i22 |= ((i5 & 2048) == 0 || !dVarF.x(imeOptions)) ? 16 : 32;
                        }
                        i24 = i22;
                        i25 = i5 & 4096;
                        if (i25 != 0) {
                            i26 = i24 | 384;
                        } else if ((i4 & 384) == 0) {
                            if (dVarF.x(mVar)) {
                                i27 = 256;
                            } else {
                                i27 = 128;
                            }
                            i26 = i24 | i27;
                        } else {
                            i26 = i24;
                        }
                        i28 = i5 & 8192;
                        if (i28 != 0) {
                            i30 = i26 | 3072;
                        } else {
                            i29 = i26;
                            if ((i4 & 3072) == 0) {
                                i30 = i29 | (dVarF.A(z2) ? 2048 : 1024);
                            } else {
                                i30 = i29;
                            }
                        }
                        i31 = i5 & 16384;
                        if (i31 != 0) {
                            i33 = i30 | 24576;
                        } else {
                            i32 = i30;
                            if ((i4 & 24576) == 0) {
                                i33 = i32 | (dVarF.A(z3) ? 16384 : 8192);
                            } else {
                                i33 = i32;
                            }
                        }
                        i34 = i5 & 32768;
                        if (i34 != 0) {
                            i33 |= 196608;
                        } else if ((i4 & 196608) == 0) {
                            if (dVarF.T(ps4Var)) {
                                i35 = 131072;
                            } else {
                                i35 = 65536;
                            }
                            i33 |= i35;
                        }
                        i36 = i5 & 65536;
                        if (i36 != 0) {
                            i33 |= 1572864;
                        } else if ((i4 & 1572864) == 0) {
                            if (dVarF.x(uVar)) {
                                i37 = 1048576;
                            } else {
                                i37 = 524288;
                            }
                            i33 |= i37;
                        }
                        if ((i6 & 306783379) == 306783378) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (dVarF.g(z4, i6 & 1)) {
                            dVarF.U();
                            if ((i3 & 1) != 0) {
                                if (i49 != 0) {
                                    bVar2 = androidx.compose.ui.b.INSTANCE;
                                }
                                if (i7 != 0) {
                                    textStyleA = TextStyle.INSTANCE.a();
                                } else {
                                    textStyleA = textStyle2;
                                }
                                if (i9 != 0) {
                                    nceVarC = nce.INSTANCE.c();
                                }
                                if (i11 != 0) {
                                    objR = dVarF.R();
                                    if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                        objR = new Function1() { // from class: com.google.android.m82
                                            public final Object invoke(Object obj) {
                                                return CoreTextFieldKt.x((TextLayoutResult) obj);
                                            }
                                        };
                                        dVarF.L(objR);
                                    }
                                    function3 = (Function1) objR;
                                }
                                if (i13 != 0) {
                                    r48Var2 = null;
                                }
                                if (i15 != 0) {
                                    solidColor = new SolidColor(ei1.INSTANCE.i(), null);
                                }
                                if (i17 != 0) {
                                    z8 = true;
                                } else {
                                    z8 = z;
                                }
                                if (i19 != 0) {
                                    i40 = Integer.MAX_VALUE;
                                } else {
                                    i40 = i;
                                }
                                if (i21 != 0) {
                                    i41 = 1;
                                } else {
                                    i41 = i2;
                                }
                                if ((i5 & 2048) != 0) {
                                    imeOptionsA = ImeOptions.INSTANCE.a();
                                    i33 &= -113;
                                } else {
                                    imeOptionsA = imeOptions;
                                }
                                if (i25 != 0) {
                                    mVarA = m.INSTANCE.a();
                                } else {
                                    mVarA = mVar;
                                }
                                if (i28 != 0) {
                                    z9 = true;
                                } else {
                                    z9 = z2;
                                }
                                if (i31 != 0) {
                                    z10 = false;
                                } else {
                                    z10 = z3;
                                }
                                if (i34 != 0) {
                                    ps4VarB = zo1.a.b();
                                } else {
                                    ps4VarB = ps4Var;
                                }
                                boolean z320 = z8;
                                textStyle2 = textStyleA;
                                bVar4 = bVar2;
                                z11 = z9;
                                function5 = function3;
                                z12 = z320;
                                nce nceVar9 = nceVarC;
                                imeOptions3 = imeOptionsA;
                                qu0Var2 = solidColor;
                                nceVar3 = nceVar9;
                                i42 = i33;
                                if (i36 != 0) {
                                    uVar3 = null;
                                } else {
                                    uVar3 = uVar;
                                }
                            } else {
                                if (i49 != 0) {
                                    bVar2 = androidx.compose.ui.b.INSTANCE;
                                }
                                if (i7 != 0) {
                                    textStyleA = TextStyle.INSTANCE.a();
                                } else {
                                    textStyleA = textStyle2;
                                }
                                if (i9 != 0) {
                                    nceVarC = nce.INSTANCE.c();
                                }
                                if (i11 != 0) {
                                    objR = dVarF.R();
                                    if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                        objR = new Function1() { // from class: com.google.android.m82
                                            public final Object invoke(Object obj) {
                                                return CoreTextFieldKt.x((TextLayoutResult) obj);
                                            }
                                        };
                                        dVarF.L(objR);
                                    }
                                    function3 = (Function1) objR;
                                }
                                if (i13 != 0) {
                                    r48Var2 = null;
                                }
                                if (i15 != 0) {
                                    solidColor = new SolidColor(ei1.INSTANCE.i(), null);
                                }
                                if (i17 != 0) {
                                    z8 = true;
                                } else {
                                    z8 = z;
                                }
                                if (i19 != 0) {
                                    i40 = Integer.MAX_VALUE;
                                } else {
                                    i40 = i;
                                }
                                if (i21 != 0) {
                                    i41 = 1;
                                } else {
                                    i41 = i2;
                                }
                                if ((i5 & 2048) != 0) {
                                    imeOptionsA = ImeOptions.INSTANCE.a();
                                    i33 &= -113;
                                } else {
                                    imeOptionsA = imeOptions;
                                }
                                if (i25 != 0) {
                                    mVarA = m.INSTANCE.a();
                                } else {
                                    mVarA = mVar;
                                }
                                if (i28 != 0) {
                                    z9 = true;
                                } else {
                                    z9 = z2;
                                }
                                if (i31 != 0) {
                                    z10 = false;
                                } else {
                                    z10 = z3;
                                }
                                if (i34 != 0) {
                                    ps4VarB = zo1.a.b();
                                } else {
                                    ps4VarB = ps4Var;
                                }
                                boolean z321 = z8;
                                textStyle2 = textStyleA;
                                bVar4 = bVar2;
                                z11 = z9;
                                function5 = function3;
                                z12 = z321;
                                nce nceVar10 = nceVarC;
                                imeOptions3 = imeOptionsA;
                                qu0Var2 = solidColor;
                                nceVar3 = nceVar10;
                                i42 = i33;
                                if (i36 != 0) {
                                    uVar3 = null;
                                } else {
                                    uVar3 = uVar;
                                }
                            }
                            dVarF.M();
                            qu0Var3 = qu0Var2;
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(31062401, i6, i42, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                            }
                            objR2 = dVarF.R();
                            companion = androidx.compose.p004runtime.d.INSTANCE;
                            if (objR2 == companion.a()) {
                                objR2 = new androidx.compose.ui.focus.f();
                                dVarF.L(objR2);
                            }
                            fVar = (androidx.compose.ui.focus.f) objR2;
                            objR3 = dVarF.R();
                            i43 = i6;
                            if (objR3 == companion.a()) {
                                objR3 = LegacyPlatformTextInputServiceAdapter_androidKt.b();
                                dVarF.L(objR3);
                            }
                            bVar5 = (androidx.compose.p001foundation.text.input.internal.b) objR3;
                            objR4 = dVarF.R();
                            if (objR4 == companion.a()) {
                                objR4 = new dxc(bVar5);
                                dVarF.L(objR4);
                            }
                            dxcVar = (dxc) objR4;
                            f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                            bVar6 = (l.b) dVarF.v(CompositionLocalsKt.i());
                            selectionBackgroundColor = ((SelectionColors) dVarF.v(jzc.c())).getSelectionBackgroundColor();
                            ok4Var = (ok4) dVarF.v(CompositionLocalsKt.h());
                            a0Var = (a0) dVarF.v(CompositionLocalsKt.v());
                            textStyle4 = textStyle2;
                            hybVar = (hyb) dVarF.v(CompositionLocalsKt.r());
                            z13 = z12;
                            if (i40 == 1) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Vertical;
                            }
                            if (uVar3 == null) {
                                dVarF.y(-213744626);
                                Object[] objArr3 = {orientation};
                                k0b<u, Object> k0bVarA3 = u.INSTANCE.a();
                                zC = dVarF.C(orientation.ordinal());
                                objR18 = dVarF.R();
                                if (zC) {
                                    objR18 = new Function0() { // from class: com.google.android.d92
                                        public final Object invoke() {
                                            return CoreTextFieldKt.O(orientation);
                                        }
                                    };
                                    dVarF.L(objR18);
                                } else {
                                    objR18 = new Function0() { // from class: com.google.android.d92
                                        public final Object invoke() {
                                            return CoreTextFieldKt.O(orientation);
                                        }
                                    };
                                    dVarF.L(objR18);
                                }
                                uVar4 = (u) dfa.k(objArr3, k0bVarA3, (Function0) objR18, dVarF, 0);
                                dVarF.u();
                            } else {
                                dVarF.y(-213745742);
                                dVarF.u();
                                uVar4 = uVar3;
                            }
                            if (uVar4.j() != orientation) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Mismatching scroller orientation; ");
                                if (orientation == Orientation.Vertical) {
                                    str = "only single-line, non-wrap text fields can scroll horizontally";
                                } else {
                                    str = "single-line, non-wrap text fields can only scroll horizontally";
                                }
                                sb3.append(str);
                                throw new IllegalArgumentException(sb3.toString());
                            }
                            i44 = i43 & 14;
                            if (i44 == 4) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if ((i43 & 57344) == 16384) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z14 | z15;
                            objR5 = dVarF.R();
                            if (z16) {
                                transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                                composition = textFieldValue.getComposition();
                                if (composition != null) {
                                    uVar5 = uVar4;
                                    transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                    if (transformedTextC2 != null) {
                                        objR5 = transformedTextC2;
                                    }
                                    dVarF.L(objR5);
                                } else {
                                    uVar5 = uVar4;
                                }
                                objR5 = transformedTextC;
                                dVarF.L(objR5);
                            } else {
                                transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                                composition = textFieldValue.getComposition();
                                if (composition != null) {
                                    uVar5 = uVar4;
                                    transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                    if (transformedTextC2 != null) {
                                        objR5 = transformedTextC2;
                                    }
                                    dVarF.L(objR5);
                                } else {
                                    uVar5 = uVar4;
                                }
                                objR5 = transformedTextC;
                                dVarF.L(objR5);
                            }
                            TransformedText transformedText3 = (TransformedText) objR5;
                            text = transformedText3.getText();
                            offsetMapping = transformedText3.getOffsetMapping();
                            qaaVarC = pp1.c(dVarF, 0);
                            zX = dVarF.x(hybVar);
                            objR6 = dVarF.R();
                            if (zX) {
                                objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                                dVarF.L(objR6);
                            } else {
                                objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                                dVarF.L(objR6);
                            }
                            k07Var = (k07) objR6;
                            m mVar5 = mVarA;
                            k07Var.X(textFieldValue.getText(), text, textStyle4, z13, r54, bVar6, function1, mVar5, ok4Var, selectionBackgroundColor);
                            k07Var.getProcessor().e(textFieldValue, k07Var.getInputSession());
                            objR7 = dVarF.R();
                            if (objR7 == companion.a()) {
                                objR7 = new rsd(0, 1, null);
                                dVarF.L(objR7);
                            }
                            rsdVar = (rsd) objR7;
                            rsd.f(rsdVar, textFieldValue, 0L, 2, null);
                            objR8 = dVarF.R();
                            if (objR8 == companion.a()) {
                                objR8 = vn3.k(EmptyCoroutineContext.a, dVarF);
                                dVarF.L(objR8);
                            }
                            ta2Var = (ta2) objR8;
                            objR9 = dVarF.R();
                            if (objR9 == companion.a()) {
                                objR9 = androidx.compose.p001foundation.relocation.c.a();
                                dVarF.L(objR9);
                            }
                            cu0Var = (cu0) objR9;
                            objR10 = dVarF.R();
                            r48 r48Var5 = r48Var2;
                            if (objR10 == companion.a()) {
                                objR10 = new TextFieldSelectionManager(rsdVar);
                                dVarF.L(objR10);
                            }
                            textFieldSelectionManager = (TextFieldSelectionManager) objR10;
                            textFieldSelectionManager.L0(offsetMapping);
                            textFieldSelectionManager.U0(nceVar3);
                            textFieldSelectionManager.M0(k07Var.r());
                            textFieldSelectionManager.Q0(k07Var);
                            textFieldSelectionManager.T0(textFieldValue);
                            textFieldSelectionManager.z0((jf1) dVarF.v(CompositionLocalsKt.d()));
                            textFieldSelectionManager.A0(ta2Var);
                            textFieldSelectionManager.R0((yzc) dVarF.v(CompositionLocalsKt.s()));
                            textFieldSelectionManager.I0((c65) dVarF.v(CompositionLocalsKt.k()));
                            textFieldSelectionManager.G0(fVar);
                            textFieldSelectionManager.E0(!z10);
                            textFieldSelectionManager.F0(z11);
                            if (up1.isSmartSelectionEnabled) {
                                dVarF.y(1966756105);
                                textFieldSelectionManager.N0(androidx.compose.p001foundation.text.selection.c.h(SelectedTextType.EditableText, textStyle4.u(), dVarF, 6));
                                dVarF.u();
                            } else {
                                dVarF.y(1966902177);
                                dVarF.u();
                            }
                            k07Var.h();
                            new Function1() { // from class: com.google.android.e92
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.y(textFieldSelectionManager, (b) obj);
                                }
                            };
                            new Function0() { // from class: com.google.android.f92
                                public final Object invoke() {
                                    return CoreTextFieldKt.z(textFieldSelectionManager);
                                }
                            };
                            new Function0() { // from class: com.google.android.g92
                                public final Object invoke() {
                                    return CoreTextFieldKt.A(textFieldSelectionManager);
                                }
                            };
                            companion2 = androidx.compose.ui.b.INSTANCE;
                            boolean zT17 = dVarF.T(k07Var);
                            i45 = i42 & 7168;
                            i46 = i42;
                            if (i45 == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            boolean z3113 = z17 | zT17;
                            if ((i46 & 57344) == 16384) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            boolean zT18 = z3113 | z18 | dVarF.T(dxcVar);
                            if (i44 == 4) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            boolean z3114 = zT18 | z19;
                            i47 = (i46 & 112) ^ 48;
                            if (i47 > 32) {
                                dxcVar2 = dxcVar;
                                if ((i46 & 48) != 32) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                            } else {
                                dxcVar2 = dxcVar;
                                if ((i46 & 48) != 32) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                            }
                            zT = z3114 | z20 | dVarF.T(offsetMapping) | dVarF.T(ta2Var) | dVarF.T(cu0Var) | dVarF.T(textFieldSelectionManager);
                            objR11 = dVarF.R();
                            if (zT) {
                                zn8Var = offsetMapping;
                                final ImeOptions imeOptions110 = imeOptions3;
                                final boolean z3115 = z11;
                                final boolean z3116 = z10;
                                objR11 = new Function1() { // from class: com.google.android.h92
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.B(k07Var, z3115, z3116, dxcVar2, textFieldValue, imeOptions110, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                                    }
                                };
                                k07Var2 = k07Var;
                                z21 = z3115;
                                textFieldValue2 = textFieldValue;
                                imeOptions4 = imeOptions110;
                                textFieldSelectionManager2 = textFieldSelectionManager;
                                ta2Var2 = ta2Var;
                                cu0Var2 = cu0Var;
                                dVarF.L(objR11);
                            } else {
                                zn8Var = offsetMapping;
                                final ImeOptions imeOptions111 = imeOptions3;
                                final boolean z3117 = z11;
                                final boolean z3118 = z10;
                                objR11 = new Function1() { // from class: com.google.android.h92
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.B(k07Var, z3117, z3118, dxcVar2, textFieldValue, imeOptions111, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                                    }
                                };
                                k07Var2 = k07Var;
                                z21 = z3117;
                                textFieldValue2 = textFieldValue;
                                imeOptions4 = imeOptions111;
                                textFieldSelectionManager2 = textFieldSelectionManager;
                                ta2Var2 = ta2Var;
                                cu0Var2 = cu0Var;
                                dVarF.L(objR11);
                            }
                            final cu0 cu0Var6 = cu0Var2;
                            androidx.compose.ui.b bVarA18 = atc.a(companion2, z21, fVar, r48Var5, (Function1) objR11);
                            if (z21) {
                                z22 = false;
                            } else {
                                z22 = false;
                            }
                            q6cVarR = p0.r(Boolean.valueOf(z22), dVarF, 0);
                            Unit unit4 = Unit.a;
                            boolean zX9 = dVarF.x(q6cVarR) | dVarF.T(k07Var2) | dVarF.T(dxcVar2) | dVarF.T(textFieldSelectionManager2);
                            if (i47 > 32) {
                                imeOptions5 = imeOptions4;
                                if ((i46 & 48) != 32) {
                                    z23 = true;
                                } else {
                                    z23 = false;
                                }
                            } else {
                                imeOptions5 = imeOptions4;
                                if ((i46 & 48) != 32) {
                                    z23 = true;
                                } else {
                                    z23 = false;
                                }
                            }
                            z24 = zX9 | z23;
                            objR12 = dVarF.R();
                            if (z24) {
                                ImeOptions imeOptions112 = imeOptions5;
                                dxc dxcVar10 = dxcVar2;
                                TextFieldSelectionManager textFieldSelectionManager14 = textFieldSelectionManager2;
                                k07 k07Var13 = k07Var2;
                                objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var13, q6cVarR, dxcVar10, textFieldSelectionManager14, imeOptions112, null);
                                k07Var3 = k07Var13;
                                textFieldSelectionManager3 = textFieldSelectionManager14;
                                imeOptions6 = imeOptions112;
                                dVarF.L(objR12);
                            } else {
                                ImeOptions imeOptions113 = imeOptions5;
                                dxc dxcVar11 = dxcVar2;
                                TextFieldSelectionManager textFieldSelectionManager15 = textFieldSelectionManager2;
                                k07 k07Var14 = k07Var2;
                                objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var14, q6cVarR, dxcVar11, textFieldSelectionManager15, imeOptions113, null);
                                k07Var3 = k07Var14;
                                textFieldSelectionManager3 = textFieldSelectionManager15;
                                imeOptions6 = imeOptions113;
                                dVarF.L(objR12);
                            }
                            imeOptions7 = imeOptions6;
                            vn3.g(unit4, (Function2) objR12, dVarF, 6);
                            int i58 = i46 >> 3;
                            z25 = z21;
                            k07Var4 = k07Var3;
                            textFieldSelectionManager4 = textFieldSelectionManager3;
                            androidx.compose.ui.b bVarA19 = huc.a(companion2, textFieldSelectionManager4, z25, r48Var5, k07Var4, fVar, z10, zn8Var, dVarF, (i58 & 896) | 196614 | ((i43 >> 9) & 7168) | ((i46 << 6) & 3670016));
                            zn8Var2 = zn8Var;
                            final androidx.compose.ui.b bVarB13 = y92.b(companion2, k07Var4, textFieldValue2, zn8Var2);
                            boolean zT19 = dVarF.T(k07Var4);
                            if (i45 == 2048) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            boolean zX10 = zT19 | z26 | dVarF.x(a0Var) | dVarF.T(textFieldSelectionManager4);
                            if (i44 == 4) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            zT2 = zX10 | z27 | dVarF.T(zn8Var2);
                            objR13 = dVarF.R();
                            if (zT2) {
                                objR13 = new Function1() { // from class: com.google.android.n82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                                    }
                                };
                                a0Var2 = a0Var;
                                textFieldSelectionManager5 = textFieldSelectionManager4;
                                dVarF.L(objR13);
                            } else {
                                objR13 = new Function1() { // from class: com.google.android.n82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                                    }
                                };
                                a0Var2 = a0Var;
                                textFieldSelectionManager5 = textFieldSelectionManager4;
                                dVarF.L(objR13);
                            }
                            final androidx.compose.ui.b bVarA110 = xq8.a(companion2, (Function1) objR13);
                            textFieldSelectionManager6 = textFieldSelectionManager5;
                            CoreTextFieldSemanticsModifier j92Var5 = new CoreTextFieldSemanticsModifier(transformedText3, textFieldValue, k07Var4, z10, z25, nceVar3 instanceof a39, zn8Var2, textFieldSelectionManager6, imeOptions7, fVar);
                            a0 a0Var7 = a0Var2;
                            if (z25 != 0) {
                                z28 = false;
                            } else {
                                z28 = false;
                            }
                            final androidx.compose.ui.b bVarA111 = y92.a(companion2, k07Var4, textFieldValue, zn8Var2, qu0Var3, z28);
                            final nce nceVar11 = nceVar3;
                            zT3 = dVarF.T(textFieldSelectionManager6);
                            objR14 = dVarF.R();
                            if (zT3) {
                                objR14 = new Function1() { // from class: com.google.android.o82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                                    }
                                };
                                dVarF.L(objR14);
                            } else {
                                objR14 = new Function1() { // from class: com.google.android.o82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                                    }
                                };
                                dVarF.L(objR14);
                            }
                            vn3.c(textFieldSelectionManager6, (Function1) objR14, dVarF, 0);
                            boolean zT110 = dVarF.T(k07Var4) | dVarF.T(dxcVar2);
                            if (i44 == 4) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            z30 = z29 | zT110 | ((i47 <= 32 && dVarF.x(imeOptions7)) || (i46 & 48) == 32);
                            objR15 = dVarF.R();
                            if (z30) {
                                objR15 = new Function1() { // from class: com.google.android.p82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                                    }
                                };
                                dVarF.L(objR15);
                            } else {
                                objR15 = new Function1() { // from class: com.google.android.p82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                                    }
                                };
                                dVarF.L(objR15);
                            }
                            vn3.c(imeOptions7, (Function1) objR15, dVarF, i58 & 14);
                            Function1<TextFieldValue, Unit> function1R5 = k07Var4.r();
                            boolean z3119 = !z10;
                            i48 = i40;
                            if (i48 == 1) {
                                z31 = true;
                            } else {
                                z31 = false;
                            }
                            androidx.compose.ui.b bVarB14 = TextFieldKeyInputKt.b(companion2, k07Var4, textFieldSelectionManager6, textFieldValue, function1R5, z3119, z31, zn8Var2, rsdVar, imeOptions7.getImeAction());
                            keyboardType = imeOptions7.getKeyboardType();
                            companion3 = androidx.compose.ui.text.input.d.INSTANCE;
                            if (androidx.compose.ui.text.input.d.n(keyboardType, companion3.f())) {
                                z32 = false;
                            } else {
                                z32 = false;
                            }
                            boolean zC6 = C(q6cVarR);
                            zA = dVarF.A(z32) | dVarF.T(bVar5);
                            objR16 = dVarF.R();
                            if (zA) {
                                objR16 = new Function0() { // from class: com.google.android.q82
                                    public final Object invoke() {
                                        return CoreTextFieldKt.G(z32, bVar5);
                                    }
                                };
                                dVarF.L(objR16);
                            } else {
                                objR16 = new Function0() { // from class: com.google.android.q82
                                    public final Object invoke() {
                                        return CoreTextFieldKt.G(z32, bVar5);
                                    }
                                };
                                dVarF.L(objR16);
                            }
                            androidx.compose.ui.b bVarB15 = hcc.b(companion2, zC6, z32, (Function0) objR16);
                            ta2 ta2Var7 = ta2Var2;
                            qu0VarE = ma0.e((qu0) dVarF.v(ma0.c()), ((ei1) dVarF.v(ma0.d())).getValue(), na0.a());
                            zT4 = dVarF.T(k07Var4) | dVarF.x(qu0VarE);
                            objR17 = dVarF.R();
                            if (zT4) {
                                objR17 = new Function1() { // from class: com.google.android.x82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                                    }
                                };
                                dVarF.L(objR17);
                            } else {
                                objR17 = new Function1() { // from class: com.google.android.x82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                                    }
                                };
                                dVarF.L(objR17);
                            }
                            androidx.compose.ui.b bVarD5 = androidx.compose.ui.draw.c.d(companion2, (Function1) objR17);
                            zv8 zv8VarA5 = tuc.a(dVarF, 0);
                            androidx.compose.ui.b bVar15 = bVar4;
                            androidx.compose.ui.b bVarThen5 = g0(zsc.b(yz6.a(bVar15.then(bVarD5), bVar5, k07Var4, textFieldSelectionManager6).then(bVarB15).then(bVarA18), k07Var4, ok4Var), k07Var4, textFieldSelectionManager6).then(bVarB14);
                            final u uVar10 = uVar5;
                            androidx.compose.ui.b bVarA112 = a0(xq8.a(TextFieldScrollKt.f(bVarThen5, uVar10, r48Var5, z25, zv8VarA5).then(bVarA19).then(j92Var5), new Function1() { // from class: com.google.android.a92
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.I(k07Var4, (kn6) obj);
                                }
                            }), textFieldSelectionManager6, ta2Var7);
                            if (!z25) {
                                z33 = false;
                            } else {
                                z33 = false;
                            }
                            if (z33) {
                                bVarZ = TextFieldSelectionManager_androidKt.z(companion2, textFieldSelectionManager6);
                            } else {
                                bVarZ = companion2;
                            }
                            final ps4 ps4Var7 = ps4VarB;
                            final androidx.compose.ui.b bVar16 = bVarZ;
                            final boolean z48 = z10;
                            final boolean z49 = z33;
                            final int i59 = i41;
                            P(bVarA112, textFieldSelectionManager6, ko1.e(-814563849, true, new Function2() { // from class: com.google.android.b92
                                public final Object invoke(Object obj, Object obj2) {
                                    return CoreTextFieldKt.J(ps4Var7, k07Var4, textStyle4, i59, i48, uVar10, textFieldValue, nceVar11, bVarA111, bVarB13, bVarA110, bVar16, cu0Var6, textFieldSelectionManager6, z49, z48, function5, zn8Var2, f43Var, (d) obj, ((Integer) obj2).intValue());
                                }
                            }, dVarF, 54), dVarF, 384);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            ps4Var2 = ps4Var7;
                            dVar2 = dVarF;
                            function4 = function5;
                            z7 = z48;
                            uVar2 = uVar3;
                            z6 = z25;
                            r48Var2 = r48Var5;
                            z5 = z13;
                            mVar2 = mVar5;
                            i39 = i41;
                            solidColor = qu0Var3;
                            bVar3 = bVar15;
                            i38 = i48;
                            nceVar2 = nceVar11;
                            textStyle3 = textStyle4;
                            imeOptions2 = imeOptions7;
                        } else {
                            dVarF.q();
                            z5 = z;
                            imeOptions2 = imeOptions;
                            mVar2 = mVar;
                            ps4Var2 = ps4Var;
                            uVar2 = uVar;
                            dVar2 = dVarF;
                            textStyle3 = textStyle2;
                            function4 = function3;
                            nceVar2 = nceVarC;
                            bVar3 = bVar2;
                            i38 = i;
                            i39 = i2;
                            z6 = z2;
                            z7 = z3;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.c92
                                public final Object invoke(Object obj, Object obj2) {
                                    return CoreTextFieldKt.N(textFieldValue, function1, bVar3, textStyle3, nceVar2, function4, r48Var2, solidColor, z5, i38, i39, imeOptions2, mVar2, z6, z7, ps4Var2, uVar2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i6 |= 24576;
                    nceVarC = nceVar;
                    i11 = i5 & 32;
                    if (i11 != 0) {
                        i6 |= 196608;
                        function3 = function2;
                    } else {
                        function3 = function2;
                        if ((i3 & 196608) == 0) {
                            if (dVarF.T(function3)) {
                                i12 = 131072;
                            } else {
                                i12 = 65536;
                            }
                            i6 |= i12;
                        }
                    }
                    i13 = i5 & 64;
                    if (i13 != 0) {
                        i6 |= 1572864;
                        r48Var2 = r48Var;
                    } else {
                        r48Var2 = r48Var;
                        if ((i3 & 1572864) == 0) {
                            if (dVarF.x(r48Var2)) {
                                i14 = 1048576;
                            } else {
                                i14 = 524288;
                            }
                            i6 |= i14;
                        }
                    }
                    i15 = i5 & 128;
                    if (i15 != 0) {
                        i6 |= 12582912;
                        solidColor = qu0Var;
                    } else {
                        solidColor = qu0Var;
                        if ((i3 & 12582912) == 0) {
                            if (dVarF.x(solidColor)) {
                                i16 = 8388608;
                            } else {
                                i16 = 4194304;
                            }
                            i6 |= i16;
                        }
                    }
                    i17 = i5 & 256;
                    if (i17 != 0) {
                        i6 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        if (dVarF.A(z)) {
                            i18 = 67108864;
                        } else {
                            i18 = 33554432;
                        }
                        i6 |= i18;
                    }
                    i19 = i5 & 512;
                    if (i19 != 0) {
                        if ((i3 & 805306368) == 0) {
                            if (dVarF.C(i)) {
                                i20 = 536870912;
                            } else {
                                i20 = 268435456;
                            }
                            i6 |= i20;
                        }
                        i21 = i5 & 1024;
                        if (i21 != 0) {
                            i22 = i4 | 6;
                        } else if ((i4 & 6) == 0) {
                            if (dVarF.C(i2)) {
                                i23 = 4;
                            } else {
                                i23 = 2;
                            }
                            i22 = i4 | i23;
                        } else {
                            i22 = i4;
                        }
                        if ((i4 & 48) != 0) {
                            i22 |= ((i5 & 2048) == 0 || !dVarF.x(imeOptions)) ? 16 : 32;
                        }
                        i24 = i22;
                        i25 = i5 & 4096;
                        if (i25 != 0) {
                            i26 = i24 | 384;
                        } else if ((i4 & 384) == 0) {
                            if (dVarF.x(mVar)) {
                                i27 = 256;
                            } else {
                                i27 = 128;
                            }
                            i26 = i24 | i27;
                        } else {
                            i26 = i24;
                        }
                        i28 = i5 & 8192;
                        if (i28 != 0) {
                            i30 = i26 | 3072;
                        } else {
                            i29 = i26;
                            if ((i4 & 3072) == 0) {
                                i30 = i29 | (dVarF.A(z2) ? 2048 : 1024);
                            } else {
                                i30 = i29;
                            }
                        }
                        i31 = i5 & 16384;
                        if (i31 != 0) {
                            i33 = i30 | 24576;
                        } else {
                            i32 = i30;
                            if ((i4 & 24576) == 0) {
                                i33 = i32 | (dVarF.A(z3) ? 16384 : 8192);
                            } else {
                                i33 = i32;
                            }
                        }
                        i34 = i5 & 32768;
                        if (i34 != 0) {
                            i33 |= 196608;
                        } else if ((i4 & 196608) == 0) {
                            if (dVarF.T(ps4Var)) {
                                i35 = 131072;
                            } else {
                                i35 = 65536;
                            }
                            i33 |= i35;
                        }
                        i36 = i5 & 65536;
                        if (i36 != 0) {
                            i33 |= 1572864;
                        } else if ((i4 & 1572864) == 0) {
                            if (dVarF.x(uVar)) {
                                i37 = 1048576;
                            } else {
                                i37 = 524288;
                            }
                            i33 |= i37;
                        }
                        if ((i6 & 306783379) == 306783378) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (dVarF.g(z4, i6 & 1)) {
                            dVarF.U();
                            if ((i3 & 1) != 0) {
                                if (i49 != 0) {
                                    bVar2 = androidx.compose.ui.b.INSTANCE;
                                }
                                if (i7 != 0) {
                                    textStyleA = TextStyle.INSTANCE.a();
                                } else {
                                    textStyleA = textStyle2;
                                }
                                if (i9 != 0) {
                                    nceVarC = nce.INSTANCE.c();
                                }
                                if (i11 != 0) {
                                    objR = dVarF.R();
                                    if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                        objR = new Function1() { // from class: com.google.android.m82
                                            public final Object invoke(Object obj) {
                                                return CoreTextFieldKt.x((TextLayoutResult) obj);
                                            }
                                        };
                                        dVarF.L(objR);
                                    }
                                    function3 = (Function1) objR;
                                }
                                if (i13 != 0) {
                                    r48Var2 = null;
                                }
                                if (i15 != 0) {
                                    solidColor = new SolidColor(ei1.INSTANCE.i(), null);
                                }
                                if (i17 != 0) {
                                    z8 = true;
                                } else {
                                    z8 = z;
                                }
                                if (i19 != 0) {
                                    i40 = Integer.MAX_VALUE;
                                } else {
                                    i40 = i;
                                }
                                if (i21 != 0) {
                                    i41 = 1;
                                } else {
                                    i41 = i2;
                                }
                                if ((i5 & 2048) != 0) {
                                    imeOptionsA = ImeOptions.INSTANCE.a();
                                    i33 &= -113;
                                } else {
                                    imeOptionsA = imeOptions;
                                }
                                if (i25 != 0) {
                                    mVarA = m.INSTANCE.a();
                                } else {
                                    mVarA = mVar;
                                }
                                if (i28 != 0) {
                                    z9 = true;
                                } else {
                                    z9 = z2;
                                }
                                if (i31 != 0) {
                                    z10 = false;
                                } else {
                                    z10 = z3;
                                }
                                if (i34 != 0) {
                                    ps4VarB = zo1.a.b();
                                } else {
                                    ps4VarB = ps4Var;
                                }
                                boolean z322 = z8;
                                textStyle2 = textStyleA;
                                bVar4 = bVar2;
                                z11 = z9;
                                function5 = function3;
                                z12 = z322;
                                nce nceVar12 = nceVarC;
                                imeOptions3 = imeOptionsA;
                                qu0Var2 = solidColor;
                                nceVar3 = nceVar12;
                                i42 = i33;
                                if (i36 != 0) {
                                    uVar3 = null;
                                } else {
                                    uVar3 = uVar;
                                }
                            } else {
                                if (i49 != 0) {
                                    bVar2 = androidx.compose.ui.b.INSTANCE;
                                }
                                if (i7 != 0) {
                                    textStyleA = TextStyle.INSTANCE.a();
                                } else {
                                    textStyleA = textStyle2;
                                }
                                if (i9 != 0) {
                                    nceVarC = nce.INSTANCE.c();
                                }
                                if (i11 != 0) {
                                    objR = dVarF.R();
                                    if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                        objR = new Function1() { // from class: com.google.android.m82
                                            public final Object invoke(Object obj) {
                                                return CoreTextFieldKt.x((TextLayoutResult) obj);
                                            }
                                        };
                                        dVarF.L(objR);
                                    }
                                    function3 = (Function1) objR;
                                }
                                if (i13 != 0) {
                                    r48Var2 = null;
                                }
                                if (i15 != 0) {
                                    solidColor = new SolidColor(ei1.INSTANCE.i(), null);
                                }
                                if (i17 != 0) {
                                    z8 = true;
                                } else {
                                    z8 = z;
                                }
                                if (i19 != 0) {
                                    i40 = Integer.MAX_VALUE;
                                } else {
                                    i40 = i;
                                }
                                if (i21 != 0) {
                                    i41 = 1;
                                } else {
                                    i41 = i2;
                                }
                                if ((i5 & 2048) != 0) {
                                    imeOptionsA = ImeOptions.INSTANCE.a();
                                    i33 &= -113;
                                } else {
                                    imeOptionsA = imeOptions;
                                }
                                if (i25 != 0) {
                                    mVarA = m.INSTANCE.a();
                                } else {
                                    mVarA = mVar;
                                }
                                if (i28 != 0) {
                                    z9 = true;
                                } else {
                                    z9 = z2;
                                }
                                if (i31 != 0) {
                                    z10 = false;
                                } else {
                                    z10 = z3;
                                }
                                if (i34 != 0) {
                                    ps4VarB = zo1.a.b();
                                } else {
                                    ps4VarB = ps4Var;
                                }
                                boolean z323 = z8;
                                textStyle2 = textStyleA;
                                bVar4 = bVar2;
                                z11 = z9;
                                function5 = function3;
                                z12 = z323;
                                nce nceVar13 = nceVarC;
                                imeOptions3 = imeOptionsA;
                                qu0Var2 = solidColor;
                                nceVar3 = nceVar13;
                                i42 = i33;
                                if (i36 != 0) {
                                    uVar3 = null;
                                } else {
                                    uVar3 = uVar;
                                }
                            }
                            dVarF.M();
                            qu0Var3 = qu0Var2;
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(31062401, i6, i42, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                            }
                            objR2 = dVarF.R();
                            companion = androidx.compose.p004runtime.d.INSTANCE;
                            if (objR2 == companion.a()) {
                                objR2 = new androidx.compose.ui.focus.f();
                                dVarF.L(objR2);
                            }
                            fVar = (androidx.compose.ui.focus.f) objR2;
                            objR3 = dVarF.R();
                            i43 = i6;
                            if (objR3 == companion.a()) {
                                objR3 = LegacyPlatformTextInputServiceAdapter_androidKt.b();
                                dVarF.L(objR3);
                            }
                            bVar5 = (androidx.compose.p001foundation.text.input.internal.b) objR3;
                            objR4 = dVarF.R();
                            if (objR4 == companion.a()) {
                                objR4 = new dxc(bVar5);
                                dVarF.L(objR4);
                            }
                            dxcVar = (dxc) objR4;
                            f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                            bVar6 = (l.b) dVarF.v(CompositionLocalsKt.i());
                            selectionBackgroundColor = ((SelectionColors) dVarF.v(jzc.c())).getSelectionBackgroundColor();
                            ok4Var = (ok4) dVarF.v(CompositionLocalsKt.h());
                            a0Var = (a0) dVarF.v(CompositionLocalsKt.v());
                            textStyle4 = textStyle2;
                            hybVar = (hyb) dVarF.v(CompositionLocalsKt.r());
                            z13 = z12;
                            if (i40 == 1) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Vertical;
                            }
                            if (uVar3 == null) {
                                dVarF.y(-213744626);
                                Object[] objArr4 = {orientation};
                                k0b<u, Object> k0bVarA4 = u.INSTANCE.a();
                                zC = dVarF.C(orientation.ordinal());
                                objR18 = dVarF.R();
                                if (zC) {
                                    objR18 = new Function0() { // from class: com.google.android.d92
                                        public final Object invoke() {
                                            return CoreTextFieldKt.O(orientation);
                                        }
                                    };
                                    dVarF.L(objR18);
                                } else {
                                    objR18 = new Function0() { // from class: com.google.android.d92
                                        public final Object invoke() {
                                            return CoreTextFieldKt.O(orientation);
                                        }
                                    };
                                    dVarF.L(objR18);
                                }
                                uVar4 = (u) dfa.k(objArr4, k0bVarA4, (Function0) objR18, dVarF, 0);
                                dVarF.u();
                            } else {
                                dVarF.y(-213745742);
                                dVarF.u();
                                uVar4 = uVar3;
                            }
                            if (uVar4.j() != orientation) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("Mismatching scroller orientation; ");
                                if (orientation == Orientation.Vertical) {
                                    str = "only single-line, non-wrap text fields can scroll horizontally";
                                } else {
                                    str = "single-line, non-wrap text fields can only scroll horizontally";
                                }
                                sb4.append(str);
                                throw new IllegalArgumentException(sb4.toString());
                            }
                            i44 = i43 & 14;
                            if (i44 == 4) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if ((i43 & 57344) == 16384) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z14 | z15;
                            objR5 = dVarF.R();
                            if (z16) {
                                transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                                composition = textFieldValue.getComposition();
                                if (composition != null) {
                                    uVar5 = uVar4;
                                    transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                    if (transformedTextC2 != null) {
                                        objR5 = transformedTextC2;
                                    }
                                    dVarF.L(objR5);
                                } else {
                                    uVar5 = uVar4;
                                }
                                objR5 = transformedTextC;
                                dVarF.L(objR5);
                            } else {
                                transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                                composition = textFieldValue.getComposition();
                                if (composition != null) {
                                    uVar5 = uVar4;
                                    transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                    if (transformedTextC2 != null) {
                                        objR5 = transformedTextC2;
                                    }
                                    dVarF.L(objR5);
                                } else {
                                    uVar5 = uVar4;
                                }
                                objR5 = transformedTextC;
                                dVarF.L(objR5);
                            }
                            TransformedText transformedText4 = (TransformedText) objR5;
                            text = transformedText4.getText();
                            offsetMapping = transformedText4.getOffsetMapping();
                            qaaVarC = pp1.c(dVarF, 0);
                            zX = dVarF.x(hybVar);
                            objR6 = dVarF.R();
                            if (zX) {
                                objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                                dVarF.L(objR6);
                            } else {
                                objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                                dVarF.L(objR6);
                            }
                            k07Var = (k07) objR6;
                            m mVar6 = mVarA;
                            k07Var.X(textFieldValue.getText(), text, textStyle4, z13, r54, bVar6, function1, mVar6, ok4Var, selectionBackgroundColor);
                            k07Var.getProcessor().e(textFieldValue, k07Var.getInputSession());
                            objR7 = dVarF.R();
                            if (objR7 == companion.a()) {
                                objR7 = new rsd(0, 1, null);
                                dVarF.L(objR7);
                            }
                            rsdVar = (rsd) objR7;
                            rsd.f(rsdVar, textFieldValue, 0L, 2, null);
                            objR8 = dVarF.R();
                            if (objR8 == companion.a()) {
                                objR8 = vn3.k(EmptyCoroutineContext.a, dVarF);
                                dVarF.L(objR8);
                            }
                            ta2Var = (ta2) objR8;
                            objR9 = dVarF.R();
                            if (objR9 == companion.a()) {
                                objR9 = androidx.compose.p001foundation.relocation.c.a();
                                dVarF.L(objR9);
                            }
                            cu0Var = (cu0) objR9;
                            objR10 = dVarF.R();
                            r48 r48Var6 = r48Var2;
                            if (objR10 == companion.a()) {
                                objR10 = new TextFieldSelectionManager(rsdVar);
                                dVarF.L(objR10);
                            }
                            textFieldSelectionManager = (TextFieldSelectionManager) objR10;
                            textFieldSelectionManager.L0(offsetMapping);
                            textFieldSelectionManager.U0(nceVar3);
                            textFieldSelectionManager.M0(k07Var.r());
                            textFieldSelectionManager.Q0(k07Var);
                            textFieldSelectionManager.T0(textFieldValue);
                            textFieldSelectionManager.z0((jf1) dVarF.v(CompositionLocalsKt.d()));
                            textFieldSelectionManager.A0(ta2Var);
                            textFieldSelectionManager.R0((yzc) dVarF.v(CompositionLocalsKt.s()));
                            textFieldSelectionManager.I0((c65) dVarF.v(CompositionLocalsKt.k()));
                            textFieldSelectionManager.G0(fVar);
                            textFieldSelectionManager.E0(!z10);
                            textFieldSelectionManager.F0(z11);
                            if (up1.isSmartSelectionEnabled) {
                                dVarF.y(1966756105);
                                textFieldSelectionManager.N0(androidx.compose.p001foundation.text.selection.c.h(SelectedTextType.EditableText, textStyle4.u(), dVarF, 6));
                                dVarF.u();
                            } else {
                                dVarF.y(1966902177);
                                dVarF.u();
                            }
                            k07Var.h();
                            new Function1() { // from class: com.google.android.e92
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.y(textFieldSelectionManager, (b) obj);
                                }
                            };
                            new Function0() { // from class: com.google.android.f92
                                public final Object invoke() {
                                    return CoreTextFieldKt.z(textFieldSelectionManager);
                                }
                            };
                            new Function0() { // from class: com.google.android.g92
                                public final Object invoke() {
                                    return CoreTextFieldKt.A(textFieldSelectionManager);
                                }
                            };
                            companion2 = androidx.compose.ui.b.INSTANCE;
                            boolean zT111 = dVarF.T(k07Var);
                            i45 = i42 & 7168;
                            i46 = i42;
                            if (i45 == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            boolean z31110 = z17 | zT111;
                            if ((i46 & 57344) == 16384) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            boolean zT112 = z31110 | z18 | dVarF.T(dxcVar);
                            if (i44 == 4) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            boolean z31111 = zT112 | z19;
                            i47 = (i46 & 112) ^ 48;
                            if (i47 > 32) {
                                dxcVar2 = dxcVar;
                                if ((i46 & 48) != 32) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                            } else {
                                dxcVar2 = dxcVar;
                                if ((i46 & 48) != 32) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                            }
                            zT = z31111 | z20 | dVarF.T(offsetMapping) | dVarF.T(ta2Var) | dVarF.T(cu0Var) | dVarF.T(textFieldSelectionManager);
                            objR11 = dVarF.R();
                            if (zT) {
                                zn8Var = offsetMapping;
                                final ImeOptions imeOptions114 = imeOptions3;
                                final boolean z31112 = z11;
                                final boolean z31113 = z10;
                                objR11 = new Function1() { // from class: com.google.android.h92
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.B(k07Var, z31112, z31113, dxcVar2, textFieldValue, imeOptions114, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                                    }
                                };
                                k07Var2 = k07Var;
                                z21 = z31112;
                                textFieldValue2 = textFieldValue;
                                imeOptions4 = imeOptions114;
                                textFieldSelectionManager2 = textFieldSelectionManager;
                                ta2Var2 = ta2Var;
                                cu0Var2 = cu0Var;
                                dVarF.L(objR11);
                            } else {
                                zn8Var = offsetMapping;
                                final ImeOptions imeOptions115 = imeOptions3;
                                final boolean z31114 = z11;
                                final boolean z31115 = z10;
                                objR11 = new Function1() { // from class: com.google.android.h92
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.B(k07Var, z31114, z31115, dxcVar2, textFieldValue, imeOptions115, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                                    }
                                };
                                k07Var2 = k07Var;
                                z21 = z31114;
                                textFieldValue2 = textFieldValue;
                                imeOptions4 = imeOptions115;
                                textFieldSelectionManager2 = textFieldSelectionManager;
                                ta2Var2 = ta2Var;
                                cu0Var2 = cu0Var;
                                dVarF.L(objR11);
                            }
                            final cu0 cu0Var7 = cu0Var2;
                            androidx.compose.ui.b bVarA113 = atc.a(companion2, z21, fVar, r48Var6, (Function1) objR11);
                            if (z21) {
                                z22 = false;
                            } else {
                                z22 = false;
                            }
                            q6cVarR = p0.r(Boolean.valueOf(z22), dVarF, 0);
                            Unit unit5 = Unit.a;
                            boolean zX11 = dVarF.x(q6cVarR) | dVarF.T(k07Var2) | dVarF.T(dxcVar2) | dVarF.T(textFieldSelectionManager2);
                            if (i47 > 32) {
                                imeOptions5 = imeOptions4;
                                if ((i46 & 48) != 32) {
                                    z23 = true;
                                } else {
                                    z23 = false;
                                }
                            } else {
                                imeOptions5 = imeOptions4;
                                if ((i46 & 48) != 32) {
                                    z23 = true;
                                } else {
                                    z23 = false;
                                }
                            }
                            z24 = zX11 | z23;
                            objR12 = dVarF.R();
                            if (z24) {
                                ImeOptions imeOptions116 = imeOptions5;
                                dxc dxcVar12 = dxcVar2;
                                TextFieldSelectionManager textFieldSelectionManager16 = textFieldSelectionManager2;
                                k07 k07Var15 = k07Var2;
                                objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var15, q6cVarR, dxcVar12, textFieldSelectionManager16, imeOptions116, null);
                                k07Var3 = k07Var15;
                                textFieldSelectionManager3 = textFieldSelectionManager16;
                                imeOptions6 = imeOptions116;
                                dVarF.L(objR12);
                            } else {
                                ImeOptions imeOptions117 = imeOptions5;
                                dxc dxcVar13 = dxcVar2;
                                TextFieldSelectionManager textFieldSelectionManager17 = textFieldSelectionManager2;
                                k07 k07Var16 = k07Var2;
                                objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var16, q6cVarR, dxcVar13, textFieldSelectionManager17, imeOptions117, null);
                                k07Var3 = k07Var16;
                                textFieldSelectionManager3 = textFieldSelectionManager17;
                                imeOptions6 = imeOptions117;
                                dVarF.L(objR12);
                            }
                            imeOptions7 = imeOptions6;
                            vn3.g(unit5, (Function2) objR12, dVarF, 6);
                            int i510 = i46 >> 3;
                            z25 = z21;
                            k07Var4 = k07Var3;
                            textFieldSelectionManager4 = textFieldSelectionManager3;
                            androidx.compose.ui.b bVarA114 = huc.a(companion2, textFieldSelectionManager4, z25, r48Var6, k07Var4, fVar, z10, zn8Var, dVarF, (i510 & 896) | 196614 | ((i43 >> 9) & 7168) | ((i46 << 6) & 3670016));
                            zn8Var2 = zn8Var;
                            final androidx.compose.ui.b bVarB16 = y92.b(companion2, k07Var4, textFieldValue2, zn8Var2);
                            boolean zT113 = dVarF.T(k07Var4);
                            if (i45 == 2048) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            boolean zX12 = zT113 | z26 | dVarF.x(a0Var) | dVarF.T(textFieldSelectionManager4);
                            if (i44 == 4) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            zT2 = zX12 | z27 | dVarF.T(zn8Var2);
                            objR13 = dVarF.R();
                            if (zT2) {
                                objR13 = new Function1() { // from class: com.google.android.n82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                                    }
                                };
                                a0Var2 = a0Var;
                                textFieldSelectionManager5 = textFieldSelectionManager4;
                                dVarF.L(objR13);
                            } else {
                                objR13 = new Function1() { // from class: com.google.android.n82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                                    }
                                };
                                a0Var2 = a0Var;
                                textFieldSelectionManager5 = textFieldSelectionManager4;
                                dVarF.L(objR13);
                            }
                            final androidx.compose.ui.b bVarA115 = xq8.a(companion2, (Function1) objR13);
                            textFieldSelectionManager6 = textFieldSelectionManager5;
                            CoreTextFieldSemanticsModifier j92Var6 = new CoreTextFieldSemanticsModifier(transformedText4, textFieldValue, k07Var4, z10, z25, nceVar3 instanceof a39, zn8Var2, textFieldSelectionManager6, imeOptions7, fVar);
                            a0 a0Var8 = a0Var2;
                            if (z25 != 0) {
                                z28 = false;
                            } else {
                                z28 = false;
                            }
                            final androidx.compose.ui.b bVarA116 = y92.a(companion2, k07Var4, textFieldValue, zn8Var2, qu0Var3, z28);
                            final nce nceVar14 = nceVar3;
                            zT3 = dVarF.T(textFieldSelectionManager6);
                            objR14 = dVarF.R();
                            if (zT3) {
                                objR14 = new Function1() { // from class: com.google.android.o82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                                    }
                                };
                                dVarF.L(objR14);
                            } else {
                                objR14 = new Function1() { // from class: com.google.android.o82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                                    }
                                };
                                dVarF.L(objR14);
                            }
                            vn3.c(textFieldSelectionManager6, (Function1) objR14, dVarF, 0);
                            boolean zT114 = dVarF.T(k07Var4) | dVarF.T(dxcVar2);
                            if (i44 == 4) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            z30 = z29 | zT114 | ((i47 <= 32 && dVarF.x(imeOptions7)) || (i46 & 48) == 32);
                            objR15 = dVarF.R();
                            if (z30) {
                                objR15 = new Function1() { // from class: com.google.android.p82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                                    }
                                };
                                dVarF.L(objR15);
                            } else {
                                objR15 = new Function1() { // from class: com.google.android.p82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                                    }
                                };
                                dVarF.L(objR15);
                            }
                            vn3.c(imeOptions7, (Function1) objR15, dVarF, i510 & 14);
                            Function1<TextFieldValue, Unit> function1R6 = k07Var4.r();
                            boolean z31116 = !z10;
                            i48 = i40;
                            if (i48 == 1) {
                                z31 = true;
                            } else {
                                z31 = false;
                            }
                            androidx.compose.ui.b bVarB17 = TextFieldKeyInputKt.b(companion2, k07Var4, textFieldSelectionManager6, textFieldValue, function1R6, z31116, z31, zn8Var2, rsdVar, imeOptions7.getImeAction());
                            keyboardType = imeOptions7.getKeyboardType();
                            companion3 = androidx.compose.ui.text.input.d.INSTANCE;
                            if (androidx.compose.ui.text.input.d.n(keyboardType, companion3.f())) {
                                z32 = false;
                            } else {
                                z32 = false;
                            }
                            boolean zC7 = C(q6cVarR);
                            zA = dVarF.A(z32) | dVarF.T(bVar5);
                            objR16 = dVarF.R();
                            if (zA) {
                                objR16 = new Function0() { // from class: com.google.android.q82
                                    public final Object invoke() {
                                        return CoreTextFieldKt.G(z32, bVar5);
                                    }
                                };
                                dVarF.L(objR16);
                            } else {
                                objR16 = new Function0() { // from class: com.google.android.q82
                                    public final Object invoke() {
                                        return CoreTextFieldKt.G(z32, bVar5);
                                    }
                                };
                                dVarF.L(objR16);
                            }
                            androidx.compose.ui.b bVarB18 = hcc.b(companion2, zC7, z32, (Function0) objR16);
                            ta2 ta2Var8 = ta2Var2;
                            qu0VarE = ma0.e((qu0) dVarF.v(ma0.c()), ((ei1) dVarF.v(ma0.d())).getValue(), na0.a());
                            zT4 = dVarF.T(k07Var4) | dVarF.x(qu0VarE);
                            objR17 = dVarF.R();
                            if (zT4) {
                                objR17 = new Function1() { // from class: com.google.android.x82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                                    }
                                };
                                dVarF.L(objR17);
                            } else {
                                objR17 = new Function1() { // from class: com.google.android.x82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                                    }
                                };
                                dVarF.L(objR17);
                            }
                            androidx.compose.ui.b bVarD6 = androidx.compose.ui.draw.c.d(companion2, (Function1) objR17);
                            zv8 zv8VarA6 = tuc.a(dVarF, 0);
                            androidx.compose.ui.b bVar17 = bVar4;
                            androidx.compose.ui.b bVarThen6 = g0(zsc.b(yz6.a(bVar17.then(bVarD6), bVar5, k07Var4, textFieldSelectionManager6).then(bVarB18).then(bVarA113), k07Var4, ok4Var), k07Var4, textFieldSelectionManager6).then(bVarB17);
                            final u uVar11 = uVar5;
                            androidx.compose.ui.b bVarA117 = a0(xq8.a(TextFieldScrollKt.f(bVarThen6, uVar11, r48Var6, z25, zv8VarA6).then(bVarA114).then(j92Var6), new Function1() { // from class: com.google.android.a92
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.I(k07Var4, (kn6) obj);
                                }
                            }), textFieldSelectionManager6, ta2Var8);
                            if (!z25) {
                                z33 = false;
                            } else {
                                z33 = false;
                            }
                            if (z33) {
                                bVarZ = TextFieldSelectionManager_androidKt.z(companion2, textFieldSelectionManager6);
                            } else {
                                bVarZ = companion2;
                            }
                            final ps4 ps4Var8 = ps4VarB;
                            final androidx.compose.ui.b bVar18 = bVarZ;
                            final boolean z410 = z10;
                            final boolean z411 = z33;
                            final int i511 = i41;
                            P(bVarA117, textFieldSelectionManager6, ko1.e(-814563849, true, new Function2() { // from class: com.google.android.b92
                                public final Object invoke(Object obj, Object obj2) {
                                    return CoreTextFieldKt.J(ps4Var8, k07Var4, textStyle4, i511, i48, uVar11, textFieldValue, nceVar14, bVarA116, bVarB16, bVarA115, bVar18, cu0Var7, textFieldSelectionManager6, z411, z410, function5, zn8Var2, f43Var, (d) obj, ((Integer) obj2).intValue());
                                }
                            }, dVarF, 54), dVarF, 384);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            ps4Var2 = ps4Var8;
                            dVar2 = dVarF;
                            function4 = function5;
                            z7 = z410;
                            uVar2 = uVar3;
                            z6 = z25;
                            r48Var2 = r48Var6;
                            z5 = z13;
                            mVar2 = mVar6;
                            i39 = i41;
                            solidColor = qu0Var3;
                            bVar3 = bVar17;
                            i38 = i48;
                            nceVar2 = nceVar14;
                            textStyle3 = textStyle4;
                            imeOptions2 = imeOptions7;
                        } else {
                            dVarF.q();
                            z5 = z;
                            imeOptions2 = imeOptions;
                            mVar2 = mVar;
                            ps4Var2 = ps4Var;
                            uVar2 = uVar;
                            dVar2 = dVarF;
                            textStyle3 = textStyle2;
                            function4 = function3;
                            nceVar2 = nceVarC;
                            bVar3 = bVar2;
                            i38 = i;
                            i39 = i2;
                            z6 = z2;
                            z7 = z3;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.c92
                                public final Object invoke(Object obj, Object obj2) {
                                    return CoreTextFieldKt.N(textFieldValue, function1, bVar3, textStyle3, nceVar2, function4, r48Var2, solidColor, z5, i38, i39, imeOptions2, mVar2, z6, z7, ps4Var2, uVar2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i6 |= 805306368;
                    i21 = i5 & 1024;
                    if (i21 != 0) {
                        i22 = i4 | 6;
                    } else if ((i4 & 6) == 0) {
                        if (dVarF.C(i2)) {
                            i23 = 4;
                        } else {
                            i23 = 2;
                        }
                        i22 = i4 | i23;
                    } else {
                        i22 = i4;
                    }
                    if ((i4 & 48) != 0) {
                        i22 |= ((i5 & 2048) == 0 || !dVarF.x(imeOptions)) ? 16 : 32;
                    }
                    i24 = i22;
                    i25 = i5 & 4096;
                    if (i25 != 0) {
                        i26 = i24 | 384;
                    } else if ((i4 & 384) == 0) {
                        if (dVarF.x(mVar)) {
                            i27 = 256;
                        } else {
                            i27 = 128;
                        }
                        i26 = i24 | i27;
                    } else {
                        i26 = i24;
                    }
                    i28 = i5 & 8192;
                    if (i28 != 0) {
                        i30 = i26 | 3072;
                    } else {
                        i29 = i26;
                        if ((i4 & 3072) == 0) {
                            i30 = i29 | (dVarF.A(z2) ? 2048 : 1024);
                        } else {
                            i30 = i29;
                        }
                    }
                    i31 = i5 & 16384;
                    if (i31 != 0) {
                        i33 = i30 | 24576;
                    } else {
                        i32 = i30;
                        if ((i4 & 24576) == 0) {
                            i33 = i32 | (dVarF.A(z3) ? 16384 : 8192);
                        } else {
                            i33 = i32;
                        }
                    }
                    i34 = i5 & 32768;
                    if (i34 != 0) {
                        i33 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i35 = 131072;
                        } else {
                            i35 = 65536;
                        }
                        i33 |= i35;
                    }
                    i36 = i5 & 65536;
                    if (i36 != 0) {
                        i33 |= 1572864;
                    } else if ((i4 & 1572864) == 0) {
                        if (dVarF.x(uVar)) {
                            i37 = 1048576;
                        } else {
                            i37 = 524288;
                        }
                        i33 |= i37;
                    }
                    if ((i6 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (dVarF.g(z4, i6 & 1)) {
                        dVarF.U();
                        if ((i3 & 1) != 0) {
                            if (i49 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i7 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i9 != 0) {
                                nceVarC = nce.INSTANCE.c();
                            }
                            if (i11 != 0) {
                                objR = dVarF.R();
                                if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                    objR = new Function1() { // from class: com.google.android.m82
                                        public final Object invoke(Object obj) {
                                            return CoreTextFieldKt.x((TextLayoutResult) obj);
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function3 = (Function1) objR;
                            }
                            if (i13 != 0) {
                                r48Var2 = null;
                            }
                            if (i15 != 0) {
                                solidColor = new SolidColor(ei1.INSTANCE.i(), null);
                            }
                            if (i17 != 0) {
                                z8 = true;
                            } else {
                                z8 = z;
                            }
                            if (i19 != 0) {
                                i40 = Integer.MAX_VALUE;
                            } else {
                                i40 = i;
                            }
                            if (i21 != 0) {
                                i41 = 1;
                            } else {
                                i41 = i2;
                            }
                            if ((i5 & 2048) != 0) {
                                imeOptionsA = ImeOptions.INSTANCE.a();
                                i33 &= -113;
                            } else {
                                imeOptionsA = imeOptions;
                            }
                            if (i25 != 0) {
                                mVarA = m.INSTANCE.a();
                            } else {
                                mVarA = mVar;
                            }
                            if (i28 != 0) {
                                z9 = true;
                            } else {
                                z9 = z2;
                            }
                            if (i31 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if (i34 != 0) {
                                ps4VarB = zo1.a.b();
                            } else {
                                ps4VarB = ps4Var;
                            }
                            boolean z324 = z8;
                            textStyle2 = textStyleA;
                            bVar4 = bVar2;
                            z11 = z9;
                            function5 = function3;
                            z12 = z324;
                            nce nceVar15 = nceVarC;
                            imeOptions3 = imeOptionsA;
                            qu0Var2 = solidColor;
                            nceVar3 = nceVar15;
                            i42 = i33;
                            if (i36 != 0) {
                                uVar3 = null;
                            } else {
                                uVar3 = uVar;
                            }
                        } else {
                            if (i49 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i7 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i9 != 0) {
                                nceVarC = nce.INSTANCE.c();
                            }
                            if (i11 != 0) {
                                objR = dVarF.R();
                                if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                    objR = new Function1() { // from class: com.google.android.m82
                                        public final Object invoke(Object obj) {
                                            return CoreTextFieldKt.x((TextLayoutResult) obj);
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function3 = (Function1) objR;
                            }
                            if (i13 != 0) {
                                r48Var2 = null;
                            }
                            if (i15 != 0) {
                                solidColor = new SolidColor(ei1.INSTANCE.i(), null);
                            }
                            if (i17 != 0) {
                                z8 = true;
                            } else {
                                z8 = z;
                            }
                            if (i19 != 0) {
                                i40 = Integer.MAX_VALUE;
                            } else {
                                i40 = i;
                            }
                            if (i21 != 0) {
                                i41 = 1;
                            } else {
                                i41 = i2;
                            }
                            if ((i5 & 2048) != 0) {
                                imeOptionsA = ImeOptions.INSTANCE.a();
                                i33 &= -113;
                            } else {
                                imeOptionsA = imeOptions;
                            }
                            if (i25 != 0) {
                                mVarA = m.INSTANCE.a();
                            } else {
                                mVarA = mVar;
                            }
                            if (i28 != 0) {
                                z9 = true;
                            } else {
                                z9 = z2;
                            }
                            if (i31 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if (i34 != 0) {
                                ps4VarB = zo1.a.b();
                            } else {
                                ps4VarB = ps4Var;
                            }
                            boolean z325 = z8;
                            textStyle2 = textStyleA;
                            bVar4 = bVar2;
                            z11 = z9;
                            function5 = function3;
                            z12 = z325;
                            nce nceVar16 = nceVarC;
                            imeOptions3 = imeOptionsA;
                            qu0Var2 = solidColor;
                            nceVar3 = nceVar16;
                            i42 = i33;
                            if (i36 != 0) {
                                uVar3 = null;
                            } else {
                                uVar3 = uVar;
                            }
                        }
                        dVarF.M();
                        qu0Var3 = qu0Var2;
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(31062401, i6, i42, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                        }
                        objR2 = dVarF.R();
                        companion = androidx.compose.p004runtime.d.INSTANCE;
                        if (objR2 == companion.a()) {
                            objR2 = new androidx.compose.ui.focus.f();
                            dVarF.L(objR2);
                        }
                        fVar = (androidx.compose.ui.focus.f) objR2;
                        objR3 = dVarF.R();
                        i43 = i6;
                        if (objR3 == companion.a()) {
                            objR3 = LegacyPlatformTextInputServiceAdapter_androidKt.b();
                            dVarF.L(objR3);
                        }
                        bVar5 = (androidx.compose.p001foundation.text.input.internal.b) objR3;
                        objR4 = dVarF.R();
                        if (objR4 == companion.a()) {
                            objR4 = new dxc(bVar5);
                            dVarF.L(objR4);
                        }
                        dxcVar = (dxc) objR4;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        bVar6 = (l.b) dVarF.v(CompositionLocalsKt.i());
                        selectionBackgroundColor = ((SelectionColors) dVarF.v(jzc.c())).getSelectionBackgroundColor();
                        ok4Var = (ok4) dVarF.v(CompositionLocalsKt.h());
                        a0Var = (a0) dVarF.v(CompositionLocalsKt.v());
                        textStyle4 = textStyle2;
                        hybVar = (hyb) dVarF.v(CompositionLocalsKt.r());
                        z13 = z12;
                        if (i40 == 1) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Vertical;
                        }
                        if (uVar3 == null) {
                            dVarF.y(-213744626);
                            Object[] objArr5 = {orientation};
                            k0b<u, Object> k0bVarA5 = u.INSTANCE.a();
                            zC = dVarF.C(orientation.ordinal());
                            objR18 = dVarF.R();
                            if (zC) {
                                objR18 = new Function0() { // from class: com.google.android.d92
                                    public final Object invoke() {
                                        return CoreTextFieldKt.O(orientation);
                                    }
                                };
                                dVarF.L(objR18);
                            } else {
                                objR18 = new Function0() { // from class: com.google.android.d92
                                    public final Object invoke() {
                                        return CoreTextFieldKt.O(orientation);
                                    }
                                };
                                dVarF.L(objR18);
                            }
                            uVar4 = (u) dfa.k(objArr5, k0bVarA5, (Function0) objR18, dVarF, 0);
                            dVarF.u();
                        } else {
                            dVarF.y(-213745742);
                            dVarF.u();
                            uVar4 = uVar3;
                        }
                        if (uVar4.j() != orientation) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Mismatching scroller orientation; ");
                            if (orientation == Orientation.Vertical) {
                                str = "only single-line, non-wrap text fields can scroll horizontally";
                            } else {
                                str = "single-line, non-wrap text fields can only scroll horizontally";
                            }
                            sb5.append(str);
                            throw new IllegalArgumentException(sb5.toString());
                        }
                        i44 = i43 & 14;
                        if (i44 == 4) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i43 & 57344) == 16384) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objR5 = dVarF.R();
                        if (z16) {
                            transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                            composition = textFieldValue.getComposition();
                            if (composition != null) {
                                uVar5 = uVar4;
                                transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                if (transformedTextC2 != null) {
                                    objR5 = transformedTextC2;
                                }
                                dVarF.L(objR5);
                            } else {
                                uVar5 = uVar4;
                            }
                            objR5 = transformedTextC;
                            dVarF.L(objR5);
                        } else {
                            transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                            composition = textFieldValue.getComposition();
                            if (composition != null) {
                                uVar5 = uVar4;
                                transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                if (transformedTextC2 != null) {
                                    objR5 = transformedTextC2;
                                }
                                dVarF.L(objR5);
                            } else {
                                uVar5 = uVar4;
                            }
                            objR5 = transformedTextC;
                            dVarF.L(objR5);
                        }
                        TransformedText transformedText5 = (TransformedText) objR5;
                        text = transformedText5.getText();
                        offsetMapping = transformedText5.getOffsetMapping();
                        qaaVarC = pp1.c(dVarF, 0);
                        zX = dVarF.x(hybVar);
                        objR6 = dVarF.R();
                        if (zX) {
                            objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                            dVarF.L(objR6);
                        } else {
                            objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                            dVarF.L(objR6);
                        }
                        k07Var = (k07) objR6;
                        m mVar7 = mVarA;
                        k07Var.X(textFieldValue.getText(), text, textStyle4, z13, r54, bVar6, function1, mVar7, ok4Var, selectionBackgroundColor);
                        k07Var.getProcessor().e(textFieldValue, k07Var.getInputSession());
                        objR7 = dVarF.R();
                        if (objR7 == companion.a()) {
                            objR7 = new rsd(0, 1, null);
                            dVarF.L(objR7);
                        }
                        rsdVar = (rsd) objR7;
                        rsd.f(rsdVar, textFieldValue, 0L, 2, null);
                        objR8 = dVarF.R();
                        if (objR8 == companion.a()) {
                            objR8 = vn3.k(EmptyCoroutineContext.a, dVarF);
                            dVarF.L(objR8);
                        }
                        ta2Var = (ta2) objR8;
                        objR9 = dVarF.R();
                        if (objR9 == companion.a()) {
                            objR9 = androidx.compose.p001foundation.relocation.c.a();
                            dVarF.L(objR9);
                        }
                        cu0Var = (cu0) objR9;
                        objR10 = dVarF.R();
                        r48 r48Var7 = r48Var2;
                        if (objR10 == companion.a()) {
                            objR10 = new TextFieldSelectionManager(rsdVar);
                            dVarF.L(objR10);
                        }
                        textFieldSelectionManager = (TextFieldSelectionManager) objR10;
                        textFieldSelectionManager.L0(offsetMapping);
                        textFieldSelectionManager.U0(nceVar3);
                        textFieldSelectionManager.M0(k07Var.r());
                        textFieldSelectionManager.Q0(k07Var);
                        textFieldSelectionManager.T0(textFieldValue);
                        textFieldSelectionManager.z0((jf1) dVarF.v(CompositionLocalsKt.d()));
                        textFieldSelectionManager.A0(ta2Var);
                        textFieldSelectionManager.R0((yzc) dVarF.v(CompositionLocalsKt.s()));
                        textFieldSelectionManager.I0((c65) dVarF.v(CompositionLocalsKt.k()));
                        textFieldSelectionManager.G0(fVar);
                        textFieldSelectionManager.E0(!z10);
                        textFieldSelectionManager.F0(z11);
                        if (up1.isSmartSelectionEnabled) {
                            dVarF.y(1966756105);
                            textFieldSelectionManager.N0(androidx.compose.p001foundation.text.selection.c.h(SelectedTextType.EditableText, textStyle4.u(), dVarF, 6));
                            dVarF.u();
                        } else {
                            dVarF.y(1966902177);
                            dVarF.u();
                        }
                        k07Var.h();
                        new Function1() { // from class: com.google.android.e92
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.y(textFieldSelectionManager, (b) obj);
                            }
                        };
                        new Function0() { // from class: com.google.android.f92
                            public final Object invoke() {
                                return CoreTextFieldKt.z(textFieldSelectionManager);
                            }
                        };
                        new Function0() { // from class: com.google.android.g92
                            public final Object invoke() {
                                return CoreTextFieldKt.A(textFieldSelectionManager);
                            }
                        };
                        companion2 = androidx.compose.ui.b.INSTANCE;
                        boolean zT115 = dVarF.T(k07Var);
                        i45 = i42 & 7168;
                        i46 = i42;
                        if (i45 == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        boolean z31117 = z17 | zT115;
                        if ((i46 & 57344) == 16384) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        boolean zT116 = z31117 | z18 | dVarF.T(dxcVar);
                        if (i44 == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean z31118 = zT116 | z19;
                        i47 = (i46 & 112) ^ 48;
                        if (i47 > 32) {
                            dxcVar2 = dxcVar;
                            if ((i46 & 48) != 32) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                        } else {
                            dxcVar2 = dxcVar;
                            if ((i46 & 48) != 32) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                        }
                        zT = z31118 | z20 | dVarF.T(offsetMapping) | dVarF.T(ta2Var) | dVarF.T(cu0Var) | dVarF.T(textFieldSelectionManager);
                        objR11 = dVarF.R();
                        if (zT) {
                            zn8Var = offsetMapping;
                            final ImeOptions imeOptions118 = imeOptions3;
                            final boolean z31119 = z11;
                            final boolean z311110 = z10;
                            objR11 = new Function1() { // from class: com.google.android.h92
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.B(k07Var, z31119, z311110, dxcVar2, textFieldValue, imeOptions118, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                                }
                            };
                            k07Var2 = k07Var;
                            z21 = z31119;
                            textFieldValue2 = textFieldValue;
                            imeOptions4 = imeOptions118;
                            textFieldSelectionManager2 = textFieldSelectionManager;
                            ta2Var2 = ta2Var;
                            cu0Var2 = cu0Var;
                            dVarF.L(objR11);
                        } else {
                            zn8Var = offsetMapping;
                            final ImeOptions imeOptions119 = imeOptions3;
                            final boolean z311111 = z11;
                            final boolean z311112 = z10;
                            objR11 = new Function1() { // from class: com.google.android.h92
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.B(k07Var, z311111, z311112, dxcVar2, textFieldValue, imeOptions119, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                                }
                            };
                            k07Var2 = k07Var;
                            z21 = z311111;
                            textFieldValue2 = textFieldValue;
                            imeOptions4 = imeOptions119;
                            textFieldSelectionManager2 = textFieldSelectionManager;
                            ta2Var2 = ta2Var;
                            cu0Var2 = cu0Var;
                            dVarF.L(objR11);
                        }
                        final cu0 cu0Var8 = cu0Var2;
                        androidx.compose.ui.b bVarA118 = atc.a(companion2, z21, fVar, r48Var7, (Function1) objR11);
                        if (z21) {
                            z22 = false;
                        } else {
                            z22 = false;
                        }
                        q6cVarR = p0.r(Boolean.valueOf(z22), dVarF, 0);
                        Unit unit6 = Unit.a;
                        boolean zX13 = dVarF.x(q6cVarR) | dVarF.T(k07Var2) | dVarF.T(dxcVar2) | dVarF.T(textFieldSelectionManager2);
                        if (i47 > 32) {
                            imeOptions5 = imeOptions4;
                            if ((i46 & 48) != 32) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                        } else {
                            imeOptions5 = imeOptions4;
                            if ((i46 & 48) != 32) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                        }
                        z24 = zX13 | z23;
                        objR12 = dVarF.R();
                        if (z24) {
                            ImeOptions imeOptions1110 = imeOptions5;
                            dxc dxcVar14 = dxcVar2;
                            TextFieldSelectionManager textFieldSelectionManager18 = textFieldSelectionManager2;
                            k07 k07Var17 = k07Var2;
                            objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var17, q6cVarR, dxcVar14, textFieldSelectionManager18, imeOptions1110, null);
                            k07Var3 = k07Var17;
                            textFieldSelectionManager3 = textFieldSelectionManager18;
                            imeOptions6 = imeOptions1110;
                            dVarF.L(objR12);
                        } else {
                            ImeOptions imeOptions1111 = imeOptions5;
                            dxc dxcVar15 = dxcVar2;
                            TextFieldSelectionManager textFieldSelectionManager19 = textFieldSelectionManager2;
                            k07 k07Var18 = k07Var2;
                            objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var18, q6cVarR, dxcVar15, textFieldSelectionManager19, imeOptions1111, null);
                            k07Var3 = k07Var18;
                            textFieldSelectionManager3 = textFieldSelectionManager19;
                            imeOptions6 = imeOptions1111;
                            dVarF.L(objR12);
                        }
                        imeOptions7 = imeOptions6;
                        vn3.g(unit6, (Function2) objR12, dVarF, 6);
                        int i512 = i46 >> 3;
                        z25 = z21;
                        k07Var4 = k07Var3;
                        textFieldSelectionManager4 = textFieldSelectionManager3;
                        androidx.compose.ui.b bVarA119 = huc.a(companion2, textFieldSelectionManager4, z25, r48Var7, k07Var4, fVar, z10, zn8Var, dVarF, (i512 & 896) | 196614 | ((i43 >> 9) & 7168) | ((i46 << 6) & 3670016));
                        zn8Var2 = zn8Var;
                        final androidx.compose.ui.b bVarB19 = y92.b(companion2, k07Var4, textFieldValue2, zn8Var2);
                        boolean zT117 = dVarF.T(k07Var4);
                        if (i45 == 2048) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        boolean zX14 = zT117 | z26 | dVarF.x(a0Var) | dVarF.T(textFieldSelectionManager4);
                        if (i44 == 4) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        zT2 = zX14 | z27 | dVarF.T(zn8Var2);
                        objR13 = dVarF.R();
                        if (zT2) {
                            objR13 = new Function1() { // from class: com.google.android.n82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                                }
                            };
                            a0Var2 = a0Var;
                            textFieldSelectionManager5 = textFieldSelectionManager4;
                            dVarF.L(objR13);
                        } else {
                            objR13 = new Function1() { // from class: com.google.android.n82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                                }
                            };
                            a0Var2 = a0Var;
                            textFieldSelectionManager5 = textFieldSelectionManager4;
                            dVarF.L(objR13);
                        }
                        final androidx.compose.ui.b bVarA1110 = xq8.a(companion2, (Function1) objR13);
                        textFieldSelectionManager6 = textFieldSelectionManager5;
                        CoreTextFieldSemanticsModifier j92Var7 = new CoreTextFieldSemanticsModifier(transformedText5, textFieldValue, k07Var4, z10, z25, nceVar3 instanceof a39, zn8Var2, textFieldSelectionManager6, imeOptions7, fVar);
                        a0 a0Var9 = a0Var2;
                        if (z25 != 0) {
                            z28 = false;
                        } else {
                            z28 = false;
                        }
                        final androidx.compose.ui.b bVarA1111 = y92.a(companion2, k07Var4, textFieldValue, zn8Var2, qu0Var3, z28);
                        final nce nceVar17 = nceVar3;
                        zT3 = dVarF.T(textFieldSelectionManager6);
                        objR14 = dVarF.R();
                        if (zT3) {
                            objR14 = new Function1() { // from class: com.google.android.o82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                                }
                            };
                            dVarF.L(objR14);
                        } else {
                            objR14 = new Function1() { // from class: com.google.android.o82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                                }
                            };
                            dVarF.L(objR14);
                        }
                        vn3.c(textFieldSelectionManager6, (Function1) objR14, dVarF, 0);
                        boolean zT118 = dVarF.T(k07Var4) | dVarF.T(dxcVar2);
                        if (i44 == 4) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        z30 = z29 | zT118 | ((i47 <= 32 && dVarF.x(imeOptions7)) || (i46 & 48) == 32);
                        objR15 = dVarF.R();
                        if (z30) {
                            objR15 = new Function1() { // from class: com.google.android.p82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                                }
                            };
                            dVarF.L(objR15);
                        } else {
                            objR15 = new Function1() { // from class: com.google.android.p82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                                }
                            };
                            dVarF.L(objR15);
                        }
                        vn3.c(imeOptions7, (Function1) objR15, dVarF, i512 & 14);
                        Function1<TextFieldValue, Unit> function1R7 = k07Var4.r();
                        boolean z311113 = !z10;
                        i48 = i40;
                        if (i48 == 1) {
                            z31 = true;
                        } else {
                            z31 = false;
                        }
                        androidx.compose.ui.b bVarB110 = TextFieldKeyInputKt.b(companion2, k07Var4, textFieldSelectionManager6, textFieldValue, function1R7, z311113, z31, zn8Var2, rsdVar, imeOptions7.getImeAction());
                        keyboardType = imeOptions7.getKeyboardType();
                        companion3 = androidx.compose.ui.text.input.d.INSTANCE;
                        if (androidx.compose.ui.text.input.d.n(keyboardType, companion3.f())) {
                            z32 = false;
                        } else {
                            z32 = false;
                        }
                        boolean zC8 = C(q6cVarR);
                        zA = dVarF.A(z32) | dVarF.T(bVar5);
                        objR16 = dVarF.R();
                        if (zA) {
                            objR16 = new Function0() { // from class: com.google.android.q82
                                public final Object invoke() {
                                    return CoreTextFieldKt.G(z32, bVar5);
                                }
                            };
                            dVarF.L(objR16);
                        } else {
                            objR16 = new Function0() { // from class: com.google.android.q82
                                public final Object invoke() {
                                    return CoreTextFieldKt.G(z32, bVar5);
                                }
                            };
                            dVarF.L(objR16);
                        }
                        androidx.compose.ui.b bVarB111 = hcc.b(companion2, zC8, z32, (Function0) objR16);
                        ta2 ta2Var9 = ta2Var2;
                        qu0VarE = ma0.e((qu0) dVarF.v(ma0.c()), ((ei1) dVarF.v(ma0.d())).getValue(), na0.a());
                        zT4 = dVarF.T(k07Var4) | dVarF.x(qu0VarE);
                        objR17 = dVarF.R();
                        if (zT4) {
                            objR17 = new Function1() { // from class: com.google.android.x82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                                }
                            };
                            dVarF.L(objR17);
                        } else {
                            objR17 = new Function1() { // from class: com.google.android.x82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                                }
                            };
                            dVarF.L(objR17);
                        }
                        androidx.compose.ui.b bVarD7 = androidx.compose.ui.draw.c.d(companion2, (Function1) objR17);
                        zv8 zv8VarA7 = tuc.a(dVarF, 0);
                        androidx.compose.ui.b bVar19 = bVar4;
                        androidx.compose.ui.b bVarThen7 = g0(zsc.b(yz6.a(bVar19.then(bVarD7), bVar5, k07Var4, textFieldSelectionManager6).then(bVarB111).then(bVarA118), k07Var4, ok4Var), k07Var4, textFieldSelectionManager6).then(bVarB110);
                        final u uVar12 = uVar5;
                        androidx.compose.ui.b bVarA1112 = a0(xq8.a(TextFieldScrollKt.f(bVarThen7, uVar12, r48Var7, z25, zv8VarA7).then(bVarA119).then(j92Var7), new Function1() { // from class: com.google.android.a92
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.I(k07Var4, (kn6) obj);
                            }
                        }), textFieldSelectionManager6, ta2Var9);
                        if (!z25) {
                            z33 = false;
                        } else {
                            z33 = false;
                        }
                        if (z33) {
                            bVarZ = TextFieldSelectionManager_androidKt.z(companion2, textFieldSelectionManager6);
                        } else {
                            bVarZ = companion2;
                        }
                        final ps4 ps4Var9 = ps4VarB;
                        final androidx.compose.ui.b bVar110 = bVarZ;
                        final boolean z412 = z10;
                        final boolean z413 = z33;
                        final int i513 = i41;
                        P(bVarA1112, textFieldSelectionManager6, ko1.e(-814563849, true, new Function2() { // from class: com.google.android.b92
                            public final Object invoke(Object obj, Object obj2) {
                                return CoreTextFieldKt.J(ps4Var9, k07Var4, textStyle4, i513, i48, uVar12, textFieldValue, nceVar17, bVarA1111, bVarB19, bVarA1110, bVar110, cu0Var8, textFieldSelectionManager6, z413, z412, function5, zn8Var2, f43Var, (d) obj, ((Integer) obj2).intValue());
                            }
                        }, dVarF, 54), dVarF, 384);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        ps4Var2 = ps4Var9;
                        dVar2 = dVarF;
                        function4 = function5;
                        z7 = z412;
                        uVar2 = uVar3;
                        z6 = z25;
                        r48Var2 = r48Var7;
                        z5 = z13;
                        mVar2 = mVar7;
                        i39 = i41;
                        solidColor = qu0Var3;
                        bVar3 = bVar19;
                        i38 = i48;
                        nceVar2 = nceVar17;
                        textStyle3 = textStyle4;
                        imeOptions2 = imeOptions7;
                    } else {
                        dVarF.q();
                        z5 = z;
                        imeOptions2 = imeOptions;
                        mVar2 = mVar;
                        ps4Var2 = ps4Var;
                        uVar2 = uVar;
                        dVar2 = dVarF;
                        textStyle3 = textStyle2;
                        function4 = function3;
                        nceVar2 = nceVarC;
                        bVar3 = bVar2;
                        i38 = i;
                        i39 = i2;
                        z6 = z2;
                        z7 = z3;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.c92
                            public final Object invoke(Object obj, Object obj2) {
                                return CoreTextFieldKt.N(textFieldValue, function1, bVar3, textStyle3, nceVar2, function4, r48Var2, solidColor, z5, i38, i39, imeOptions2, mVar2, z6, z7, ps4Var2, uVar2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i6 |= 3072;
                textStyle2 = textStyle;
                i9 = i5 & 16;
                if (i9 != 0) {
                    if ((i3 & 24576) == 0) {
                        nceVarC = nceVar;
                        if (dVarF.x(nceVarC)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i6 |= i10;
                    }
                    i11 = i5 & 32;
                    if (i11 != 0) {
                        i6 |= 196608;
                        function3 = function2;
                    } else {
                        function3 = function2;
                        if ((i3 & 196608) == 0) {
                            if (dVarF.T(function3)) {
                                i12 = 131072;
                            } else {
                                i12 = 65536;
                            }
                            i6 |= i12;
                        }
                    }
                    i13 = i5 & 64;
                    if (i13 != 0) {
                        i6 |= 1572864;
                        r48Var2 = r48Var;
                    } else {
                        r48Var2 = r48Var;
                        if ((i3 & 1572864) == 0) {
                            if (dVarF.x(r48Var2)) {
                                i14 = 1048576;
                            } else {
                                i14 = 524288;
                            }
                            i6 |= i14;
                        }
                    }
                    i15 = i5 & 128;
                    if (i15 != 0) {
                        i6 |= 12582912;
                        solidColor = qu0Var;
                    } else {
                        solidColor = qu0Var;
                        if ((i3 & 12582912) == 0) {
                            if (dVarF.x(solidColor)) {
                                i16 = 8388608;
                            } else {
                                i16 = 4194304;
                            }
                            i6 |= i16;
                        }
                    }
                    i17 = i5 & 256;
                    if (i17 != 0) {
                        i6 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        if (dVarF.A(z)) {
                            i18 = 67108864;
                        } else {
                            i18 = 33554432;
                        }
                        i6 |= i18;
                    }
                    i19 = i5 & 512;
                    if (i19 != 0) {
                        if ((i3 & 805306368) == 0) {
                            if (dVarF.C(i)) {
                                i20 = 536870912;
                            } else {
                                i20 = 268435456;
                            }
                            i6 |= i20;
                        }
                        i21 = i5 & 1024;
                        if (i21 != 0) {
                            i22 = i4 | 6;
                        } else if ((i4 & 6) == 0) {
                            if (dVarF.C(i2)) {
                                i23 = 4;
                            } else {
                                i23 = 2;
                            }
                            i22 = i4 | i23;
                        } else {
                            i22 = i4;
                        }
                        if ((i4 & 48) != 0) {
                            i22 |= ((i5 & 2048) == 0 || !dVarF.x(imeOptions)) ? 16 : 32;
                        }
                        i24 = i22;
                        i25 = i5 & 4096;
                        if (i25 != 0) {
                            i26 = i24 | 384;
                        } else if ((i4 & 384) == 0) {
                            if (dVarF.x(mVar)) {
                                i27 = 256;
                            } else {
                                i27 = 128;
                            }
                            i26 = i24 | i27;
                        } else {
                            i26 = i24;
                        }
                        i28 = i5 & 8192;
                        if (i28 != 0) {
                            i30 = i26 | 3072;
                        } else {
                            i29 = i26;
                            if ((i4 & 3072) == 0) {
                                i30 = i29 | (dVarF.A(z2) ? 2048 : 1024);
                            } else {
                                i30 = i29;
                            }
                        }
                        i31 = i5 & 16384;
                        if (i31 != 0) {
                            i33 = i30 | 24576;
                        } else {
                            i32 = i30;
                            if ((i4 & 24576) == 0) {
                                i33 = i32 | (dVarF.A(z3) ? 16384 : 8192);
                            } else {
                                i33 = i32;
                            }
                        }
                        i34 = i5 & 32768;
                        if (i34 != 0) {
                            i33 |= 196608;
                        } else if ((i4 & 196608) == 0) {
                            if (dVarF.T(ps4Var)) {
                                i35 = 131072;
                            } else {
                                i35 = 65536;
                            }
                            i33 |= i35;
                        }
                        i36 = i5 & 65536;
                        if (i36 != 0) {
                            i33 |= 1572864;
                        } else if ((i4 & 1572864) == 0) {
                            if (dVarF.x(uVar)) {
                                i37 = 1048576;
                            } else {
                                i37 = 524288;
                            }
                            i33 |= i37;
                        }
                        if ((i6 & 306783379) == 306783378) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (dVarF.g(z4, i6 & 1)) {
                            dVarF.U();
                            if ((i3 & 1) != 0) {
                                if (i49 != 0) {
                                    bVar2 = androidx.compose.ui.b.INSTANCE;
                                }
                                if (i7 != 0) {
                                    textStyleA = TextStyle.INSTANCE.a();
                                } else {
                                    textStyleA = textStyle2;
                                }
                                if (i9 != 0) {
                                    nceVarC = nce.INSTANCE.c();
                                }
                                if (i11 != 0) {
                                    objR = dVarF.R();
                                    if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                        objR = new Function1() { // from class: com.google.android.m82
                                            public final Object invoke(Object obj) {
                                                return CoreTextFieldKt.x((TextLayoutResult) obj);
                                            }
                                        };
                                        dVarF.L(objR);
                                    }
                                    function3 = (Function1) objR;
                                }
                                if (i13 != 0) {
                                    r48Var2 = null;
                                }
                                if (i15 != 0) {
                                    solidColor = new SolidColor(ei1.INSTANCE.i(), null);
                                }
                                if (i17 != 0) {
                                    z8 = true;
                                } else {
                                    z8 = z;
                                }
                                if (i19 != 0) {
                                    i40 = Integer.MAX_VALUE;
                                } else {
                                    i40 = i;
                                }
                                if (i21 != 0) {
                                    i41 = 1;
                                } else {
                                    i41 = i2;
                                }
                                if ((i5 & 2048) != 0) {
                                    imeOptionsA = ImeOptions.INSTANCE.a();
                                    i33 &= -113;
                                } else {
                                    imeOptionsA = imeOptions;
                                }
                                if (i25 != 0) {
                                    mVarA = m.INSTANCE.a();
                                } else {
                                    mVarA = mVar;
                                }
                                if (i28 != 0) {
                                    z9 = true;
                                } else {
                                    z9 = z2;
                                }
                                if (i31 != 0) {
                                    z10 = false;
                                } else {
                                    z10 = z3;
                                }
                                if (i34 != 0) {
                                    ps4VarB = zo1.a.b();
                                } else {
                                    ps4VarB = ps4Var;
                                }
                                boolean z326 = z8;
                                textStyle2 = textStyleA;
                                bVar4 = bVar2;
                                z11 = z9;
                                function5 = function3;
                                z12 = z326;
                                nce nceVar18 = nceVarC;
                                imeOptions3 = imeOptionsA;
                                qu0Var2 = solidColor;
                                nceVar3 = nceVar18;
                                i42 = i33;
                                if (i36 != 0) {
                                    uVar3 = null;
                                } else {
                                    uVar3 = uVar;
                                }
                            } else {
                                if (i49 != 0) {
                                    bVar2 = androidx.compose.ui.b.INSTANCE;
                                }
                                if (i7 != 0) {
                                    textStyleA = TextStyle.INSTANCE.a();
                                } else {
                                    textStyleA = textStyle2;
                                }
                                if (i9 != 0) {
                                    nceVarC = nce.INSTANCE.c();
                                }
                                if (i11 != 0) {
                                    objR = dVarF.R();
                                    if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                        objR = new Function1() { // from class: com.google.android.m82
                                            public final Object invoke(Object obj) {
                                                return CoreTextFieldKt.x((TextLayoutResult) obj);
                                            }
                                        };
                                        dVarF.L(objR);
                                    }
                                    function3 = (Function1) objR;
                                }
                                if (i13 != 0) {
                                    r48Var2 = null;
                                }
                                if (i15 != 0) {
                                    solidColor = new SolidColor(ei1.INSTANCE.i(), null);
                                }
                                if (i17 != 0) {
                                    z8 = true;
                                } else {
                                    z8 = z;
                                }
                                if (i19 != 0) {
                                    i40 = Integer.MAX_VALUE;
                                } else {
                                    i40 = i;
                                }
                                if (i21 != 0) {
                                    i41 = 1;
                                } else {
                                    i41 = i2;
                                }
                                if ((i5 & 2048) != 0) {
                                    imeOptionsA = ImeOptions.INSTANCE.a();
                                    i33 &= -113;
                                } else {
                                    imeOptionsA = imeOptions;
                                }
                                if (i25 != 0) {
                                    mVarA = m.INSTANCE.a();
                                } else {
                                    mVarA = mVar;
                                }
                                if (i28 != 0) {
                                    z9 = true;
                                } else {
                                    z9 = z2;
                                }
                                if (i31 != 0) {
                                    z10 = false;
                                } else {
                                    z10 = z3;
                                }
                                if (i34 != 0) {
                                    ps4VarB = zo1.a.b();
                                } else {
                                    ps4VarB = ps4Var;
                                }
                                boolean z327 = z8;
                                textStyle2 = textStyleA;
                                bVar4 = bVar2;
                                z11 = z9;
                                function5 = function3;
                                z12 = z327;
                                nce nceVar19 = nceVarC;
                                imeOptions3 = imeOptionsA;
                                qu0Var2 = solidColor;
                                nceVar3 = nceVar19;
                                i42 = i33;
                                if (i36 != 0) {
                                    uVar3 = null;
                                } else {
                                    uVar3 = uVar;
                                }
                            }
                            dVarF.M();
                            qu0Var3 = qu0Var2;
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(31062401, i6, i42, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                            }
                            objR2 = dVarF.R();
                            companion = androidx.compose.p004runtime.d.INSTANCE;
                            if (objR2 == companion.a()) {
                                objR2 = new androidx.compose.ui.focus.f();
                                dVarF.L(objR2);
                            }
                            fVar = (androidx.compose.ui.focus.f) objR2;
                            objR3 = dVarF.R();
                            i43 = i6;
                            if (objR3 == companion.a()) {
                                objR3 = LegacyPlatformTextInputServiceAdapter_androidKt.b();
                                dVarF.L(objR3);
                            }
                            bVar5 = (androidx.compose.p001foundation.text.input.internal.b) objR3;
                            objR4 = dVarF.R();
                            if (objR4 == companion.a()) {
                                objR4 = new dxc(bVar5);
                                dVarF.L(objR4);
                            }
                            dxcVar = (dxc) objR4;
                            f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                            bVar6 = (l.b) dVarF.v(CompositionLocalsKt.i());
                            selectionBackgroundColor = ((SelectionColors) dVarF.v(jzc.c())).getSelectionBackgroundColor();
                            ok4Var = (ok4) dVarF.v(CompositionLocalsKt.h());
                            a0Var = (a0) dVarF.v(CompositionLocalsKt.v());
                            textStyle4 = textStyle2;
                            hybVar = (hyb) dVarF.v(CompositionLocalsKt.r());
                            z13 = z12;
                            if (i40 == 1) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Vertical;
                            }
                            if (uVar3 == null) {
                                dVarF.y(-213744626);
                                Object[] objArr6 = {orientation};
                                k0b<u, Object> k0bVarA6 = u.INSTANCE.a();
                                zC = dVarF.C(orientation.ordinal());
                                objR18 = dVarF.R();
                                if (zC) {
                                    objR18 = new Function0() { // from class: com.google.android.d92
                                        public final Object invoke() {
                                            return CoreTextFieldKt.O(orientation);
                                        }
                                    };
                                    dVarF.L(objR18);
                                } else {
                                    objR18 = new Function0() { // from class: com.google.android.d92
                                        public final Object invoke() {
                                            return CoreTextFieldKt.O(orientation);
                                        }
                                    };
                                    dVarF.L(objR18);
                                }
                                uVar4 = (u) dfa.k(objArr6, k0bVarA6, (Function0) objR18, dVarF, 0);
                                dVarF.u();
                            } else {
                                dVarF.y(-213745742);
                                dVarF.u();
                                uVar4 = uVar3;
                            }
                            if (uVar4.j() != orientation) {
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("Mismatching scroller orientation; ");
                                if (orientation == Orientation.Vertical) {
                                    str = "only single-line, non-wrap text fields can scroll horizontally";
                                } else {
                                    str = "single-line, non-wrap text fields can only scroll horizontally";
                                }
                                sb6.append(str);
                                throw new IllegalArgumentException(sb6.toString());
                            }
                            i44 = i43 & 14;
                            if (i44 == 4) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if ((i43 & 57344) == 16384) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z14 | z15;
                            objR5 = dVarF.R();
                            if (z16) {
                                transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                                composition = textFieldValue.getComposition();
                                if (composition != null) {
                                    uVar5 = uVar4;
                                    transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                    if (transformedTextC2 != null) {
                                        objR5 = transformedTextC2;
                                    }
                                    dVarF.L(objR5);
                                } else {
                                    uVar5 = uVar4;
                                }
                                objR5 = transformedTextC;
                                dVarF.L(objR5);
                            } else {
                                transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                                composition = textFieldValue.getComposition();
                                if (composition != null) {
                                    uVar5 = uVar4;
                                    transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                    if (transformedTextC2 != null) {
                                        objR5 = transformedTextC2;
                                    }
                                    dVarF.L(objR5);
                                } else {
                                    uVar5 = uVar4;
                                }
                                objR5 = transformedTextC;
                                dVarF.L(objR5);
                            }
                            TransformedText transformedText6 = (TransformedText) objR5;
                            text = transformedText6.getText();
                            offsetMapping = transformedText6.getOffsetMapping();
                            qaaVarC = pp1.c(dVarF, 0);
                            zX = dVarF.x(hybVar);
                            objR6 = dVarF.R();
                            if (zX) {
                                objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                                dVarF.L(objR6);
                            } else {
                                objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                                dVarF.L(objR6);
                            }
                            k07Var = (k07) objR6;
                            m mVar8 = mVarA;
                            k07Var.X(textFieldValue.getText(), text, textStyle4, z13, r54, bVar6, function1, mVar8, ok4Var, selectionBackgroundColor);
                            k07Var.getProcessor().e(textFieldValue, k07Var.getInputSession());
                            objR7 = dVarF.R();
                            if (objR7 == companion.a()) {
                                objR7 = new rsd(0, 1, null);
                                dVarF.L(objR7);
                            }
                            rsdVar = (rsd) objR7;
                            rsd.f(rsdVar, textFieldValue, 0L, 2, null);
                            objR8 = dVarF.R();
                            if (objR8 == companion.a()) {
                                objR8 = vn3.k(EmptyCoroutineContext.a, dVarF);
                                dVarF.L(objR8);
                            }
                            ta2Var = (ta2) objR8;
                            objR9 = dVarF.R();
                            if (objR9 == companion.a()) {
                                objR9 = androidx.compose.p001foundation.relocation.c.a();
                                dVarF.L(objR9);
                            }
                            cu0Var = (cu0) objR9;
                            objR10 = dVarF.R();
                            r48 r48Var8 = r48Var2;
                            if (objR10 == companion.a()) {
                                objR10 = new TextFieldSelectionManager(rsdVar);
                                dVarF.L(objR10);
                            }
                            textFieldSelectionManager = (TextFieldSelectionManager) objR10;
                            textFieldSelectionManager.L0(offsetMapping);
                            textFieldSelectionManager.U0(nceVar3);
                            textFieldSelectionManager.M0(k07Var.r());
                            textFieldSelectionManager.Q0(k07Var);
                            textFieldSelectionManager.T0(textFieldValue);
                            textFieldSelectionManager.z0((jf1) dVarF.v(CompositionLocalsKt.d()));
                            textFieldSelectionManager.A0(ta2Var);
                            textFieldSelectionManager.R0((yzc) dVarF.v(CompositionLocalsKt.s()));
                            textFieldSelectionManager.I0((c65) dVarF.v(CompositionLocalsKt.k()));
                            textFieldSelectionManager.G0(fVar);
                            textFieldSelectionManager.E0(!z10);
                            textFieldSelectionManager.F0(z11);
                            if (up1.isSmartSelectionEnabled) {
                                dVarF.y(1966756105);
                                textFieldSelectionManager.N0(androidx.compose.p001foundation.text.selection.c.h(SelectedTextType.EditableText, textStyle4.u(), dVarF, 6));
                                dVarF.u();
                            } else {
                                dVarF.y(1966902177);
                                dVarF.u();
                            }
                            k07Var.h();
                            new Function1() { // from class: com.google.android.e92
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.y(textFieldSelectionManager, (b) obj);
                                }
                            };
                            new Function0() { // from class: com.google.android.f92
                                public final Object invoke() {
                                    return CoreTextFieldKt.z(textFieldSelectionManager);
                                }
                            };
                            new Function0() { // from class: com.google.android.g92
                                public final Object invoke() {
                                    return CoreTextFieldKt.A(textFieldSelectionManager);
                                }
                            };
                            companion2 = androidx.compose.ui.b.INSTANCE;
                            boolean zT119 = dVarF.T(k07Var);
                            i45 = i42 & 7168;
                            i46 = i42;
                            if (i45 == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            boolean z311114 = z17 | zT119;
                            if ((i46 & 57344) == 16384) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            boolean zT1110 = z311114 | z18 | dVarF.T(dxcVar);
                            if (i44 == 4) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            boolean z311115 = zT1110 | z19;
                            i47 = (i46 & 112) ^ 48;
                            if (i47 > 32) {
                                dxcVar2 = dxcVar;
                                if ((i46 & 48) != 32) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                            } else {
                                dxcVar2 = dxcVar;
                                if ((i46 & 48) != 32) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                            }
                            zT = z311115 | z20 | dVarF.T(offsetMapping) | dVarF.T(ta2Var) | dVarF.T(cu0Var) | dVarF.T(textFieldSelectionManager);
                            objR11 = dVarF.R();
                            if (zT) {
                                zn8Var = offsetMapping;
                                final ImeOptions imeOptions1112 = imeOptions3;
                                final boolean z311116 = z11;
                                final boolean z311117 = z10;
                                objR11 = new Function1() { // from class: com.google.android.h92
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.B(k07Var, z311116, z311117, dxcVar2, textFieldValue, imeOptions1112, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                                    }
                                };
                                k07Var2 = k07Var;
                                z21 = z311116;
                                textFieldValue2 = textFieldValue;
                                imeOptions4 = imeOptions1112;
                                textFieldSelectionManager2 = textFieldSelectionManager;
                                ta2Var2 = ta2Var;
                                cu0Var2 = cu0Var;
                                dVarF.L(objR11);
                            } else {
                                zn8Var = offsetMapping;
                                final ImeOptions imeOptions1113 = imeOptions3;
                                final boolean z311118 = z11;
                                final boolean z311119 = z10;
                                objR11 = new Function1() { // from class: com.google.android.h92
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.B(k07Var, z311118, z311119, dxcVar2, textFieldValue, imeOptions1113, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                                    }
                                };
                                k07Var2 = k07Var;
                                z21 = z311118;
                                textFieldValue2 = textFieldValue;
                                imeOptions4 = imeOptions1113;
                                textFieldSelectionManager2 = textFieldSelectionManager;
                                ta2Var2 = ta2Var;
                                cu0Var2 = cu0Var;
                                dVarF.L(objR11);
                            }
                            final cu0 cu0Var9 = cu0Var2;
                            androidx.compose.ui.b bVarA1113 = atc.a(companion2, z21, fVar, r48Var8, (Function1) objR11);
                            if (z21) {
                                z22 = false;
                            } else {
                                z22 = false;
                            }
                            q6cVarR = p0.r(Boolean.valueOf(z22), dVarF, 0);
                            Unit unit7 = Unit.a;
                            boolean zX15 = dVarF.x(q6cVarR) | dVarF.T(k07Var2) | dVarF.T(dxcVar2) | dVarF.T(textFieldSelectionManager2);
                            if (i47 > 32) {
                                imeOptions5 = imeOptions4;
                                if ((i46 & 48) != 32) {
                                    z23 = true;
                                } else {
                                    z23 = false;
                                }
                            } else {
                                imeOptions5 = imeOptions4;
                                if ((i46 & 48) != 32) {
                                    z23 = true;
                                } else {
                                    z23 = false;
                                }
                            }
                            z24 = zX15 | z23;
                            objR12 = dVarF.R();
                            if (z24) {
                                ImeOptions imeOptions1114 = imeOptions5;
                                dxc dxcVar16 = dxcVar2;
                                TextFieldSelectionManager textFieldSelectionManager110 = textFieldSelectionManager2;
                                k07 k07Var19 = k07Var2;
                                objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var19, q6cVarR, dxcVar16, textFieldSelectionManager110, imeOptions1114, null);
                                k07Var3 = k07Var19;
                                textFieldSelectionManager3 = textFieldSelectionManager110;
                                imeOptions6 = imeOptions1114;
                                dVarF.L(objR12);
                            } else {
                                ImeOptions imeOptions1115 = imeOptions5;
                                dxc dxcVar17 = dxcVar2;
                                TextFieldSelectionManager textFieldSelectionManager111 = textFieldSelectionManager2;
                                k07 k07Var110 = k07Var2;
                                objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var110, q6cVarR, dxcVar17, textFieldSelectionManager111, imeOptions1115, null);
                                k07Var3 = k07Var110;
                                textFieldSelectionManager3 = textFieldSelectionManager111;
                                imeOptions6 = imeOptions1115;
                                dVarF.L(objR12);
                            }
                            imeOptions7 = imeOptions6;
                            vn3.g(unit7, (Function2) objR12, dVarF, 6);
                            int i514 = i46 >> 3;
                            z25 = z21;
                            k07Var4 = k07Var3;
                            textFieldSelectionManager4 = textFieldSelectionManager3;
                            androidx.compose.ui.b bVarA1114 = huc.a(companion2, textFieldSelectionManager4, z25, r48Var8, k07Var4, fVar, z10, zn8Var, dVarF, (i514 & 896) | 196614 | ((i43 >> 9) & 7168) | ((i46 << 6) & 3670016));
                            zn8Var2 = zn8Var;
                            final androidx.compose.ui.b bVarB112 = y92.b(companion2, k07Var4, textFieldValue2, zn8Var2);
                            boolean zT1111 = dVarF.T(k07Var4);
                            if (i45 == 2048) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            boolean zX16 = zT1111 | z26 | dVarF.x(a0Var) | dVarF.T(textFieldSelectionManager4);
                            if (i44 == 4) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            zT2 = zX16 | z27 | dVarF.T(zn8Var2);
                            objR13 = dVarF.R();
                            if (zT2) {
                                objR13 = new Function1() { // from class: com.google.android.n82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                                    }
                                };
                                a0Var2 = a0Var;
                                textFieldSelectionManager5 = textFieldSelectionManager4;
                                dVarF.L(objR13);
                            } else {
                                objR13 = new Function1() { // from class: com.google.android.n82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                                    }
                                };
                                a0Var2 = a0Var;
                                textFieldSelectionManager5 = textFieldSelectionManager4;
                                dVarF.L(objR13);
                            }
                            final androidx.compose.ui.b bVarA1115 = xq8.a(companion2, (Function1) objR13);
                            textFieldSelectionManager6 = textFieldSelectionManager5;
                            CoreTextFieldSemanticsModifier j92Var8 = new CoreTextFieldSemanticsModifier(transformedText6, textFieldValue, k07Var4, z10, z25, nceVar3 instanceof a39, zn8Var2, textFieldSelectionManager6, imeOptions7, fVar);
                            a0 a0Var10 = a0Var2;
                            if (z25 != 0) {
                                z28 = false;
                            } else {
                                z28 = false;
                            }
                            final androidx.compose.ui.b bVarA1116 = y92.a(companion2, k07Var4, textFieldValue, zn8Var2, qu0Var3, z28);
                            final nce nceVar110 = nceVar3;
                            zT3 = dVarF.T(textFieldSelectionManager6);
                            objR14 = dVarF.R();
                            if (zT3) {
                                objR14 = new Function1() { // from class: com.google.android.o82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                                    }
                                };
                                dVarF.L(objR14);
                            } else {
                                objR14 = new Function1() { // from class: com.google.android.o82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                                    }
                                };
                                dVarF.L(objR14);
                            }
                            vn3.c(textFieldSelectionManager6, (Function1) objR14, dVarF, 0);
                            boolean zT1112 = dVarF.T(k07Var4) | dVarF.T(dxcVar2);
                            if (i44 == 4) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            z30 = z29 | zT1112 | ((i47 <= 32 && dVarF.x(imeOptions7)) || (i46 & 48) == 32);
                            objR15 = dVarF.R();
                            if (z30) {
                                objR15 = new Function1() { // from class: com.google.android.p82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                                    }
                                };
                                dVarF.L(objR15);
                            } else {
                                objR15 = new Function1() { // from class: com.google.android.p82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                                    }
                                };
                                dVarF.L(objR15);
                            }
                            vn3.c(imeOptions7, (Function1) objR15, dVarF, i514 & 14);
                            Function1<TextFieldValue, Unit> function1R8 = k07Var4.r();
                            boolean z3111110 = !z10;
                            i48 = i40;
                            if (i48 == 1) {
                                z31 = true;
                            } else {
                                z31 = false;
                            }
                            androidx.compose.ui.b bVarB113 = TextFieldKeyInputKt.b(companion2, k07Var4, textFieldSelectionManager6, textFieldValue, function1R8, z3111110, z31, zn8Var2, rsdVar, imeOptions7.getImeAction());
                            keyboardType = imeOptions7.getKeyboardType();
                            companion3 = androidx.compose.ui.text.input.d.INSTANCE;
                            if (androidx.compose.ui.text.input.d.n(keyboardType, companion3.f())) {
                                z32 = false;
                            } else {
                                z32 = false;
                            }
                            boolean zC9 = C(q6cVarR);
                            zA = dVarF.A(z32) | dVarF.T(bVar5);
                            objR16 = dVarF.R();
                            if (zA) {
                                objR16 = new Function0() { // from class: com.google.android.q82
                                    public final Object invoke() {
                                        return CoreTextFieldKt.G(z32, bVar5);
                                    }
                                };
                                dVarF.L(objR16);
                            } else {
                                objR16 = new Function0() { // from class: com.google.android.q82
                                    public final Object invoke() {
                                        return CoreTextFieldKt.G(z32, bVar5);
                                    }
                                };
                                dVarF.L(objR16);
                            }
                            androidx.compose.ui.b bVarB114 = hcc.b(companion2, zC9, z32, (Function0) objR16);
                            ta2 ta2Var10 = ta2Var2;
                            qu0VarE = ma0.e((qu0) dVarF.v(ma0.c()), ((ei1) dVarF.v(ma0.d())).getValue(), na0.a());
                            zT4 = dVarF.T(k07Var4) | dVarF.x(qu0VarE);
                            objR17 = dVarF.R();
                            if (zT4) {
                                objR17 = new Function1() { // from class: com.google.android.x82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                                    }
                                };
                                dVarF.L(objR17);
                            } else {
                                objR17 = new Function1() { // from class: com.google.android.x82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                                    }
                                };
                                dVarF.L(objR17);
                            }
                            androidx.compose.ui.b bVarD8 = androidx.compose.ui.draw.c.d(companion2, (Function1) objR17);
                            zv8 zv8VarA8 = tuc.a(dVarF, 0);
                            androidx.compose.ui.b bVar111 = bVar4;
                            androidx.compose.ui.b bVarThen8 = g0(zsc.b(yz6.a(bVar111.then(bVarD8), bVar5, k07Var4, textFieldSelectionManager6).then(bVarB114).then(bVarA1113), k07Var4, ok4Var), k07Var4, textFieldSelectionManager6).then(bVarB113);
                            final u uVar13 = uVar5;
                            androidx.compose.ui.b bVarA1117 = a0(xq8.a(TextFieldScrollKt.f(bVarThen8, uVar13, r48Var8, z25, zv8VarA8).then(bVarA1114).then(j92Var8), new Function1() { // from class: com.google.android.a92
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.I(k07Var4, (kn6) obj);
                                }
                            }), textFieldSelectionManager6, ta2Var10);
                            if (!z25) {
                                z33 = false;
                            } else {
                                z33 = false;
                            }
                            if (z33) {
                                bVarZ = TextFieldSelectionManager_androidKt.z(companion2, textFieldSelectionManager6);
                            } else {
                                bVarZ = companion2;
                            }
                            final ps4 ps4Var10 = ps4VarB;
                            final androidx.compose.ui.b bVar112 = bVarZ;
                            final boolean z414 = z10;
                            final boolean z415 = z33;
                            final int i515 = i41;
                            P(bVarA1117, textFieldSelectionManager6, ko1.e(-814563849, true, new Function2() { // from class: com.google.android.b92
                                public final Object invoke(Object obj, Object obj2) {
                                    return CoreTextFieldKt.J(ps4Var10, k07Var4, textStyle4, i515, i48, uVar13, textFieldValue, nceVar110, bVarA1116, bVarB112, bVarA1115, bVar112, cu0Var9, textFieldSelectionManager6, z415, z414, function5, zn8Var2, f43Var, (d) obj, ((Integer) obj2).intValue());
                                }
                            }, dVarF, 54), dVarF, 384);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            ps4Var2 = ps4Var10;
                            dVar2 = dVarF;
                            function4 = function5;
                            z7 = z414;
                            uVar2 = uVar3;
                            z6 = z25;
                            r48Var2 = r48Var8;
                            z5 = z13;
                            mVar2 = mVar8;
                            i39 = i41;
                            solidColor = qu0Var3;
                            bVar3 = bVar111;
                            i38 = i48;
                            nceVar2 = nceVar110;
                            textStyle3 = textStyle4;
                            imeOptions2 = imeOptions7;
                        } else {
                            dVarF.q();
                            z5 = z;
                            imeOptions2 = imeOptions;
                            mVar2 = mVar;
                            ps4Var2 = ps4Var;
                            uVar2 = uVar;
                            dVar2 = dVarF;
                            textStyle3 = textStyle2;
                            function4 = function3;
                            nceVar2 = nceVarC;
                            bVar3 = bVar2;
                            i38 = i;
                            i39 = i2;
                            z6 = z2;
                            z7 = z3;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.c92
                                public final Object invoke(Object obj, Object obj2) {
                                    return CoreTextFieldKt.N(textFieldValue, function1, bVar3, textStyle3, nceVar2, function4, r48Var2, solidColor, z5, i38, i39, imeOptions2, mVar2, z6, z7, ps4Var2, uVar2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i6 |= 805306368;
                    i21 = i5 & 1024;
                    if (i21 != 0) {
                        i22 = i4 | 6;
                    } else if ((i4 & 6) == 0) {
                        if (dVarF.C(i2)) {
                            i23 = 4;
                        } else {
                            i23 = 2;
                        }
                        i22 = i4 | i23;
                    } else {
                        i22 = i4;
                    }
                    if ((i4 & 48) != 0) {
                        i22 |= ((i5 & 2048) == 0 || !dVarF.x(imeOptions)) ? 16 : 32;
                    }
                    i24 = i22;
                    i25 = i5 & 4096;
                    if (i25 != 0) {
                        i26 = i24 | 384;
                    } else if ((i4 & 384) == 0) {
                        if (dVarF.x(mVar)) {
                            i27 = 256;
                        } else {
                            i27 = 128;
                        }
                        i26 = i24 | i27;
                    } else {
                        i26 = i24;
                    }
                    i28 = i5 & 8192;
                    if (i28 != 0) {
                        i30 = i26 | 3072;
                    } else {
                        i29 = i26;
                        if ((i4 & 3072) == 0) {
                            i30 = i29 | (dVarF.A(z2) ? 2048 : 1024);
                        } else {
                            i30 = i29;
                        }
                    }
                    i31 = i5 & 16384;
                    if (i31 != 0) {
                        i33 = i30 | 24576;
                    } else {
                        i32 = i30;
                        if ((i4 & 24576) == 0) {
                            i33 = i32 | (dVarF.A(z3) ? 16384 : 8192);
                        } else {
                            i33 = i32;
                        }
                    }
                    i34 = i5 & 32768;
                    if (i34 != 0) {
                        i33 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i35 = 131072;
                        } else {
                            i35 = 65536;
                        }
                        i33 |= i35;
                    }
                    i36 = i5 & 65536;
                    if (i36 != 0) {
                        i33 |= 1572864;
                    } else if ((i4 & 1572864) == 0) {
                        if (dVarF.x(uVar)) {
                            i37 = 1048576;
                        } else {
                            i37 = 524288;
                        }
                        i33 |= i37;
                    }
                    if ((i6 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (dVarF.g(z4, i6 & 1)) {
                        dVarF.U();
                        if ((i3 & 1) != 0) {
                            if (i49 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i7 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i9 != 0) {
                                nceVarC = nce.INSTANCE.c();
                            }
                            if (i11 != 0) {
                                objR = dVarF.R();
                                if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                    objR = new Function1() { // from class: com.google.android.m82
                                        public final Object invoke(Object obj) {
                                            return CoreTextFieldKt.x((TextLayoutResult) obj);
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function3 = (Function1) objR;
                            }
                            if (i13 != 0) {
                                r48Var2 = null;
                            }
                            if (i15 != 0) {
                                solidColor = new SolidColor(ei1.INSTANCE.i(), null);
                            }
                            if (i17 != 0) {
                                z8 = true;
                            } else {
                                z8 = z;
                            }
                            if (i19 != 0) {
                                i40 = Integer.MAX_VALUE;
                            } else {
                                i40 = i;
                            }
                            if (i21 != 0) {
                                i41 = 1;
                            } else {
                                i41 = i2;
                            }
                            if ((i5 & 2048) != 0) {
                                imeOptionsA = ImeOptions.INSTANCE.a();
                                i33 &= -113;
                            } else {
                                imeOptionsA = imeOptions;
                            }
                            if (i25 != 0) {
                                mVarA = m.INSTANCE.a();
                            } else {
                                mVarA = mVar;
                            }
                            if (i28 != 0) {
                                z9 = true;
                            } else {
                                z9 = z2;
                            }
                            if (i31 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if (i34 != 0) {
                                ps4VarB = zo1.a.b();
                            } else {
                                ps4VarB = ps4Var;
                            }
                            boolean z328 = z8;
                            textStyle2 = textStyleA;
                            bVar4 = bVar2;
                            z11 = z9;
                            function5 = function3;
                            z12 = z328;
                            nce nceVar111 = nceVarC;
                            imeOptions3 = imeOptionsA;
                            qu0Var2 = solidColor;
                            nceVar3 = nceVar111;
                            i42 = i33;
                            if (i36 != 0) {
                                uVar3 = null;
                            } else {
                                uVar3 = uVar;
                            }
                        } else {
                            if (i49 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i7 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i9 != 0) {
                                nceVarC = nce.INSTANCE.c();
                            }
                            if (i11 != 0) {
                                objR = dVarF.R();
                                if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                    objR = new Function1() { // from class: com.google.android.m82
                                        public final Object invoke(Object obj) {
                                            return CoreTextFieldKt.x((TextLayoutResult) obj);
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function3 = (Function1) objR;
                            }
                            if (i13 != 0) {
                                r48Var2 = null;
                            }
                            if (i15 != 0) {
                                solidColor = new SolidColor(ei1.INSTANCE.i(), null);
                            }
                            if (i17 != 0) {
                                z8 = true;
                            } else {
                                z8 = z;
                            }
                            if (i19 != 0) {
                                i40 = Integer.MAX_VALUE;
                            } else {
                                i40 = i;
                            }
                            if (i21 != 0) {
                                i41 = 1;
                            } else {
                                i41 = i2;
                            }
                            if ((i5 & 2048) != 0) {
                                imeOptionsA = ImeOptions.INSTANCE.a();
                                i33 &= -113;
                            } else {
                                imeOptionsA = imeOptions;
                            }
                            if (i25 != 0) {
                                mVarA = m.INSTANCE.a();
                            } else {
                                mVarA = mVar;
                            }
                            if (i28 != 0) {
                                z9 = true;
                            } else {
                                z9 = z2;
                            }
                            if (i31 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if (i34 != 0) {
                                ps4VarB = zo1.a.b();
                            } else {
                                ps4VarB = ps4Var;
                            }
                            boolean z329 = z8;
                            textStyle2 = textStyleA;
                            bVar4 = bVar2;
                            z11 = z9;
                            function5 = function3;
                            z12 = z329;
                            nce nceVar112 = nceVarC;
                            imeOptions3 = imeOptionsA;
                            qu0Var2 = solidColor;
                            nceVar3 = nceVar112;
                            i42 = i33;
                            if (i36 != 0) {
                                uVar3 = null;
                            } else {
                                uVar3 = uVar;
                            }
                        }
                        dVarF.M();
                        qu0Var3 = qu0Var2;
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(31062401, i6, i42, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                        }
                        objR2 = dVarF.R();
                        companion = androidx.compose.p004runtime.d.INSTANCE;
                        if (objR2 == companion.a()) {
                            objR2 = new androidx.compose.ui.focus.f();
                            dVarF.L(objR2);
                        }
                        fVar = (androidx.compose.ui.focus.f) objR2;
                        objR3 = dVarF.R();
                        i43 = i6;
                        if (objR3 == companion.a()) {
                            objR3 = LegacyPlatformTextInputServiceAdapter_androidKt.b();
                            dVarF.L(objR3);
                        }
                        bVar5 = (androidx.compose.p001foundation.text.input.internal.b) objR3;
                        objR4 = dVarF.R();
                        if (objR4 == companion.a()) {
                            objR4 = new dxc(bVar5);
                            dVarF.L(objR4);
                        }
                        dxcVar = (dxc) objR4;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        bVar6 = (l.b) dVarF.v(CompositionLocalsKt.i());
                        selectionBackgroundColor = ((SelectionColors) dVarF.v(jzc.c())).getSelectionBackgroundColor();
                        ok4Var = (ok4) dVarF.v(CompositionLocalsKt.h());
                        a0Var = (a0) dVarF.v(CompositionLocalsKt.v());
                        textStyle4 = textStyle2;
                        hybVar = (hyb) dVarF.v(CompositionLocalsKt.r());
                        z13 = z12;
                        if (i40 == 1) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Vertical;
                        }
                        if (uVar3 == null) {
                            dVarF.y(-213744626);
                            Object[] objArr7 = {orientation};
                            k0b<u, Object> k0bVarA7 = u.INSTANCE.a();
                            zC = dVarF.C(orientation.ordinal());
                            objR18 = dVarF.R();
                            if (zC) {
                                objR18 = new Function0() { // from class: com.google.android.d92
                                    public final Object invoke() {
                                        return CoreTextFieldKt.O(orientation);
                                    }
                                };
                                dVarF.L(objR18);
                            } else {
                                objR18 = new Function0() { // from class: com.google.android.d92
                                    public final Object invoke() {
                                        return CoreTextFieldKt.O(orientation);
                                    }
                                };
                                dVarF.L(objR18);
                            }
                            uVar4 = (u) dfa.k(objArr7, k0bVarA7, (Function0) objR18, dVarF, 0);
                            dVarF.u();
                        } else {
                            dVarF.y(-213745742);
                            dVarF.u();
                            uVar4 = uVar3;
                        }
                        if (uVar4.j() != orientation) {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("Mismatching scroller orientation; ");
                            if (orientation == Orientation.Vertical) {
                                str = "only single-line, non-wrap text fields can scroll horizontally";
                            } else {
                                str = "single-line, non-wrap text fields can only scroll horizontally";
                            }
                            sb7.append(str);
                            throw new IllegalArgumentException(sb7.toString());
                        }
                        i44 = i43 & 14;
                        if (i44 == 4) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i43 & 57344) == 16384) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objR5 = dVarF.R();
                        if (z16) {
                            transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                            composition = textFieldValue.getComposition();
                            if (composition != null) {
                                uVar5 = uVar4;
                                transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                if (transformedTextC2 != null) {
                                    objR5 = transformedTextC2;
                                }
                                dVarF.L(objR5);
                            } else {
                                uVar5 = uVar4;
                            }
                            objR5 = transformedTextC;
                            dVarF.L(objR5);
                        } else {
                            transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                            composition = textFieldValue.getComposition();
                            if (composition != null) {
                                uVar5 = uVar4;
                                transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                if (transformedTextC2 != null) {
                                    objR5 = transformedTextC2;
                                }
                                dVarF.L(objR5);
                            } else {
                                uVar5 = uVar4;
                            }
                            objR5 = transformedTextC;
                            dVarF.L(objR5);
                        }
                        TransformedText transformedText7 = (TransformedText) objR5;
                        text = transformedText7.getText();
                        offsetMapping = transformedText7.getOffsetMapping();
                        qaaVarC = pp1.c(dVarF, 0);
                        zX = dVarF.x(hybVar);
                        objR6 = dVarF.R();
                        if (zX) {
                            objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                            dVarF.L(objR6);
                        } else {
                            objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                            dVarF.L(objR6);
                        }
                        k07Var = (k07) objR6;
                        m mVar9 = mVarA;
                        k07Var.X(textFieldValue.getText(), text, textStyle4, z13, r54, bVar6, function1, mVar9, ok4Var, selectionBackgroundColor);
                        k07Var.getProcessor().e(textFieldValue, k07Var.getInputSession());
                        objR7 = dVarF.R();
                        if (objR7 == companion.a()) {
                            objR7 = new rsd(0, 1, null);
                            dVarF.L(objR7);
                        }
                        rsdVar = (rsd) objR7;
                        rsd.f(rsdVar, textFieldValue, 0L, 2, null);
                        objR8 = dVarF.R();
                        if (objR8 == companion.a()) {
                            objR8 = vn3.k(EmptyCoroutineContext.a, dVarF);
                            dVarF.L(objR8);
                        }
                        ta2Var = (ta2) objR8;
                        objR9 = dVarF.R();
                        if (objR9 == companion.a()) {
                            objR9 = androidx.compose.p001foundation.relocation.c.a();
                            dVarF.L(objR9);
                        }
                        cu0Var = (cu0) objR9;
                        objR10 = dVarF.R();
                        r48 r48Var9 = r48Var2;
                        if (objR10 == companion.a()) {
                            objR10 = new TextFieldSelectionManager(rsdVar);
                            dVarF.L(objR10);
                        }
                        textFieldSelectionManager = (TextFieldSelectionManager) objR10;
                        textFieldSelectionManager.L0(offsetMapping);
                        textFieldSelectionManager.U0(nceVar3);
                        textFieldSelectionManager.M0(k07Var.r());
                        textFieldSelectionManager.Q0(k07Var);
                        textFieldSelectionManager.T0(textFieldValue);
                        textFieldSelectionManager.z0((jf1) dVarF.v(CompositionLocalsKt.d()));
                        textFieldSelectionManager.A0(ta2Var);
                        textFieldSelectionManager.R0((yzc) dVarF.v(CompositionLocalsKt.s()));
                        textFieldSelectionManager.I0((c65) dVarF.v(CompositionLocalsKt.k()));
                        textFieldSelectionManager.G0(fVar);
                        textFieldSelectionManager.E0(!z10);
                        textFieldSelectionManager.F0(z11);
                        if (up1.isSmartSelectionEnabled) {
                            dVarF.y(1966756105);
                            textFieldSelectionManager.N0(androidx.compose.p001foundation.text.selection.c.h(SelectedTextType.EditableText, textStyle4.u(), dVarF, 6));
                            dVarF.u();
                        } else {
                            dVarF.y(1966902177);
                            dVarF.u();
                        }
                        k07Var.h();
                        new Function1() { // from class: com.google.android.e92
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.y(textFieldSelectionManager, (b) obj);
                            }
                        };
                        new Function0() { // from class: com.google.android.f92
                            public final Object invoke() {
                                return CoreTextFieldKt.z(textFieldSelectionManager);
                            }
                        };
                        new Function0() { // from class: com.google.android.g92
                            public final Object invoke() {
                                return CoreTextFieldKt.A(textFieldSelectionManager);
                            }
                        };
                        companion2 = androidx.compose.ui.b.INSTANCE;
                        boolean zT1113 = dVarF.T(k07Var);
                        i45 = i42 & 7168;
                        i46 = i42;
                        if (i45 == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        boolean z3111111 = z17 | zT1113;
                        if ((i46 & 57344) == 16384) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        boolean zT1114 = z3111111 | z18 | dVarF.T(dxcVar);
                        if (i44 == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean z3111112 = zT1114 | z19;
                        i47 = (i46 & 112) ^ 48;
                        if (i47 > 32) {
                            dxcVar2 = dxcVar;
                            if ((i46 & 48) != 32) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                        } else {
                            dxcVar2 = dxcVar;
                            if ((i46 & 48) != 32) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                        }
                        zT = z3111112 | z20 | dVarF.T(offsetMapping) | dVarF.T(ta2Var) | dVarF.T(cu0Var) | dVarF.T(textFieldSelectionManager);
                        objR11 = dVarF.R();
                        if (zT) {
                            zn8Var = offsetMapping;
                            final ImeOptions imeOptions1116 = imeOptions3;
                            final boolean z3111113 = z11;
                            final boolean z3111114 = z10;
                            objR11 = new Function1() { // from class: com.google.android.h92
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.B(k07Var, z3111113, z3111114, dxcVar2, textFieldValue, imeOptions1116, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                                }
                            };
                            k07Var2 = k07Var;
                            z21 = z3111113;
                            textFieldValue2 = textFieldValue;
                            imeOptions4 = imeOptions1116;
                            textFieldSelectionManager2 = textFieldSelectionManager;
                            ta2Var2 = ta2Var;
                            cu0Var2 = cu0Var;
                            dVarF.L(objR11);
                        } else {
                            zn8Var = offsetMapping;
                            final ImeOptions imeOptions1117 = imeOptions3;
                            final boolean z3111115 = z11;
                            final boolean z3111116 = z10;
                            objR11 = new Function1() { // from class: com.google.android.h92
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.B(k07Var, z3111115, z3111116, dxcVar2, textFieldValue, imeOptions1117, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                                }
                            };
                            k07Var2 = k07Var;
                            z21 = z3111115;
                            textFieldValue2 = textFieldValue;
                            imeOptions4 = imeOptions1117;
                            textFieldSelectionManager2 = textFieldSelectionManager;
                            ta2Var2 = ta2Var;
                            cu0Var2 = cu0Var;
                            dVarF.L(objR11);
                        }
                        final cu0 cu0Var10 = cu0Var2;
                        androidx.compose.ui.b bVarA1118 = atc.a(companion2, z21, fVar, r48Var9, (Function1) objR11);
                        if (z21) {
                            z22 = false;
                        } else {
                            z22 = false;
                        }
                        q6cVarR = p0.r(Boolean.valueOf(z22), dVarF, 0);
                        Unit unit8 = Unit.a;
                        boolean zX17 = dVarF.x(q6cVarR) | dVarF.T(k07Var2) | dVarF.T(dxcVar2) | dVarF.T(textFieldSelectionManager2);
                        if (i47 > 32) {
                            imeOptions5 = imeOptions4;
                            if ((i46 & 48) != 32) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                        } else {
                            imeOptions5 = imeOptions4;
                            if ((i46 & 48) != 32) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                        }
                        z24 = zX17 | z23;
                        objR12 = dVarF.R();
                        if (z24) {
                            ImeOptions imeOptions1118 = imeOptions5;
                            dxc dxcVar18 = dxcVar2;
                            TextFieldSelectionManager textFieldSelectionManager112 = textFieldSelectionManager2;
                            k07 k07Var111 = k07Var2;
                            objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var111, q6cVarR, dxcVar18, textFieldSelectionManager112, imeOptions1118, null);
                            k07Var3 = k07Var111;
                            textFieldSelectionManager3 = textFieldSelectionManager112;
                            imeOptions6 = imeOptions1118;
                            dVarF.L(objR12);
                        } else {
                            ImeOptions imeOptions1119 = imeOptions5;
                            dxc dxcVar19 = dxcVar2;
                            TextFieldSelectionManager textFieldSelectionManager113 = textFieldSelectionManager2;
                            k07 k07Var112 = k07Var2;
                            objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var112, q6cVarR, dxcVar19, textFieldSelectionManager113, imeOptions1119, null);
                            k07Var3 = k07Var112;
                            textFieldSelectionManager3 = textFieldSelectionManager113;
                            imeOptions6 = imeOptions1119;
                            dVarF.L(objR12);
                        }
                        imeOptions7 = imeOptions6;
                        vn3.g(unit8, (Function2) objR12, dVarF, 6);
                        int i516 = i46 >> 3;
                        z25 = z21;
                        k07Var4 = k07Var3;
                        textFieldSelectionManager4 = textFieldSelectionManager3;
                        androidx.compose.ui.b bVarA1119 = huc.a(companion2, textFieldSelectionManager4, z25, r48Var9, k07Var4, fVar, z10, zn8Var, dVarF, (i516 & 896) | 196614 | ((i43 >> 9) & 7168) | ((i46 << 6) & 3670016));
                        zn8Var2 = zn8Var;
                        final androidx.compose.ui.b bVarB115 = y92.b(companion2, k07Var4, textFieldValue2, zn8Var2);
                        boolean zT1115 = dVarF.T(k07Var4);
                        if (i45 == 2048) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        boolean zX18 = zT1115 | z26 | dVarF.x(a0Var) | dVarF.T(textFieldSelectionManager4);
                        if (i44 == 4) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        zT2 = zX18 | z27 | dVarF.T(zn8Var2);
                        objR13 = dVarF.R();
                        if (zT2) {
                            objR13 = new Function1() { // from class: com.google.android.n82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                                }
                            };
                            a0Var2 = a0Var;
                            textFieldSelectionManager5 = textFieldSelectionManager4;
                            dVarF.L(objR13);
                        } else {
                            objR13 = new Function1() { // from class: com.google.android.n82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                                }
                            };
                            a0Var2 = a0Var;
                            textFieldSelectionManager5 = textFieldSelectionManager4;
                            dVarF.L(objR13);
                        }
                        final androidx.compose.ui.b bVarA11110 = xq8.a(companion2, (Function1) objR13);
                        textFieldSelectionManager6 = textFieldSelectionManager5;
                        CoreTextFieldSemanticsModifier j92Var9 = new CoreTextFieldSemanticsModifier(transformedText7, textFieldValue, k07Var4, z10, z25, nceVar3 instanceof a39, zn8Var2, textFieldSelectionManager6, imeOptions7, fVar);
                        a0 a0Var11 = a0Var2;
                        if (z25 != 0) {
                            z28 = false;
                        } else {
                            z28 = false;
                        }
                        final androidx.compose.ui.b bVarA11111 = y92.a(companion2, k07Var4, textFieldValue, zn8Var2, qu0Var3, z28);
                        final nce nceVar113 = nceVar3;
                        zT3 = dVarF.T(textFieldSelectionManager6);
                        objR14 = dVarF.R();
                        if (zT3) {
                            objR14 = new Function1() { // from class: com.google.android.o82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                                }
                            };
                            dVarF.L(objR14);
                        } else {
                            objR14 = new Function1() { // from class: com.google.android.o82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                                }
                            };
                            dVarF.L(objR14);
                        }
                        vn3.c(textFieldSelectionManager6, (Function1) objR14, dVarF, 0);
                        boolean zT1116 = dVarF.T(k07Var4) | dVarF.T(dxcVar2);
                        if (i44 == 4) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        z30 = z29 | zT1116 | ((i47 <= 32 && dVarF.x(imeOptions7)) || (i46 & 48) == 32);
                        objR15 = dVarF.R();
                        if (z30) {
                            objR15 = new Function1() { // from class: com.google.android.p82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                                }
                            };
                            dVarF.L(objR15);
                        } else {
                            objR15 = new Function1() { // from class: com.google.android.p82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                                }
                            };
                            dVarF.L(objR15);
                        }
                        vn3.c(imeOptions7, (Function1) objR15, dVarF, i516 & 14);
                        Function1<TextFieldValue, Unit> function1R9 = k07Var4.r();
                        boolean z3111117 = !z10;
                        i48 = i40;
                        if (i48 == 1) {
                            z31 = true;
                        } else {
                            z31 = false;
                        }
                        androidx.compose.ui.b bVarB116 = TextFieldKeyInputKt.b(companion2, k07Var4, textFieldSelectionManager6, textFieldValue, function1R9, z3111117, z31, zn8Var2, rsdVar, imeOptions7.getImeAction());
                        keyboardType = imeOptions7.getKeyboardType();
                        companion3 = androidx.compose.ui.text.input.d.INSTANCE;
                        if (androidx.compose.ui.text.input.d.n(keyboardType, companion3.f())) {
                            z32 = false;
                        } else {
                            z32 = false;
                        }
                        boolean zC10 = C(q6cVarR);
                        zA = dVarF.A(z32) | dVarF.T(bVar5);
                        objR16 = dVarF.R();
                        if (zA) {
                            objR16 = new Function0() { // from class: com.google.android.q82
                                public final Object invoke() {
                                    return CoreTextFieldKt.G(z32, bVar5);
                                }
                            };
                            dVarF.L(objR16);
                        } else {
                            objR16 = new Function0() { // from class: com.google.android.q82
                                public final Object invoke() {
                                    return CoreTextFieldKt.G(z32, bVar5);
                                }
                            };
                            dVarF.L(objR16);
                        }
                        androidx.compose.ui.b bVarB117 = hcc.b(companion2, zC10, z32, (Function0) objR16);
                        ta2 ta2Var11 = ta2Var2;
                        qu0VarE = ma0.e((qu0) dVarF.v(ma0.c()), ((ei1) dVarF.v(ma0.d())).getValue(), na0.a());
                        zT4 = dVarF.T(k07Var4) | dVarF.x(qu0VarE);
                        objR17 = dVarF.R();
                        if (zT4) {
                            objR17 = new Function1() { // from class: com.google.android.x82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                                }
                            };
                            dVarF.L(objR17);
                        } else {
                            objR17 = new Function1() { // from class: com.google.android.x82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                                }
                            };
                            dVarF.L(objR17);
                        }
                        androidx.compose.ui.b bVarD9 = androidx.compose.ui.draw.c.d(companion2, (Function1) objR17);
                        zv8 zv8VarA9 = tuc.a(dVarF, 0);
                        androidx.compose.ui.b bVar113 = bVar4;
                        androidx.compose.ui.b bVarThen9 = g0(zsc.b(yz6.a(bVar113.then(bVarD9), bVar5, k07Var4, textFieldSelectionManager6).then(bVarB117).then(bVarA1118), k07Var4, ok4Var), k07Var4, textFieldSelectionManager6).then(bVarB116);
                        final u uVar14 = uVar5;
                        androidx.compose.ui.b bVarA11112 = a0(xq8.a(TextFieldScrollKt.f(bVarThen9, uVar14, r48Var9, z25, zv8VarA9).then(bVarA1119).then(j92Var9), new Function1() { // from class: com.google.android.a92
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.I(k07Var4, (kn6) obj);
                            }
                        }), textFieldSelectionManager6, ta2Var11);
                        if (!z25) {
                            z33 = false;
                        } else {
                            z33 = false;
                        }
                        if (z33) {
                            bVarZ = TextFieldSelectionManager_androidKt.z(companion2, textFieldSelectionManager6);
                        } else {
                            bVarZ = companion2;
                        }
                        final ps4 ps4Var11 = ps4VarB;
                        final androidx.compose.ui.b bVar114 = bVarZ;
                        final boolean z416 = z10;
                        final boolean z417 = z33;
                        final int i517 = i41;
                        P(bVarA11112, textFieldSelectionManager6, ko1.e(-814563849, true, new Function2() { // from class: com.google.android.b92
                            public final Object invoke(Object obj, Object obj2) {
                                return CoreTextFieldKt.J(ps4Var11, k07Var4, textStyle4, i517, i48, uVar14, textFieldValue, nceVar113, bVarA11111, bVarB115, bVarA11110, bVar114, cu0Var10, textFieldSelectionManager6, z417, z416, function5, zn8Var2, f43Var, (d) obj, ((Integer) obj2).intValue());
                            }
                        }, dVarF, 54), dVarF, 384);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        ps4Var2 = ps4Var11;
                        dVar2 = dVarF;
                        function4 = function5;
                        z7 = z416;
                        uVar2 = uVar3;
                        z6 = z25;
                        r48Var2 = r48Var9;
                        z5 = z13;
                        mVar2 = mVar9;
                        i39 = i41;
                        solidColor = qu0Var3;
                        bVar3 = bVar113;
                        i38 = i48;
                        nceVar2 = nceVar113;
                        textStyle3 = textStyle4;
                        imeOptions2 = imeOptions7;
                    } else {
                        dVarF.q();
                        z5 = z;
                        imeOptions2 = imeOptions;
                        mVar2 = mVar;
                        ps4Var2 = ps4Var;
                        uVar2 = uVar;
                        dVar2 = dVarF;
                        textStyle3 = textStyle2;
                        function4 = function3;
                        nceVar2 = nceVarC;
                        bVar3 = bVar2;
                        i38 = i;
                        i39 = i2;
                        z6 = z2;
                        z7 = z3;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.c92
                            public final Object invoke(Object obj, Object obj2) {
                                return CoreTextFieldKt.N(textFieldValue, function1, bVar3, textStyle3, nceVar2, function4, r48Var2, solidColor, z5, i38, i39, imeOptions2, mVar2, z6, z7, ps4Var2, uVar2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i6 |= 24576;
                nceVarC = nceVar;
                i11 = i5 & 32;
                if (i11 != 0) {
                    i6 |= 196608;
                    function3 = function2;
                } else {
                    function3 = function2;
                    if ((i3 & 196608) == 0) {
                        if (dVarF.T(function3)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i6 |= i12;
                    }
                }
                i13 = i5 & 64;
                if (i13 != 0) {
                    i6 |= 1572864;
                    r48Var2 = r48Var;
                } else {
                    r48Var2 = r48Var;
                    if ((i3 & 1572864) == 0) {
                        if (dVarF.x(r48Var2)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i6 |= i14;
                    }
                }
                i15 = i5 & 128;
                if (i15 != 0) {
                    i6 |= 12582912;
                    solidColor = qu0Var;
                } else {
                    solidColor = qu0Var;
                    if ((i3 & 12582912) == 0) {
                        if (dVarF.x(solidColor)) {
                            i16 = 8388608;
                        } else {
                            i16 = 4194304;
                        }
                        i6 |= i16;
                    }
                }
                i17 = i5 & 256;
                if (i17 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 100663296) == 0) {
                    if (dVarF.A(z)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i6 |= i18;
                }
                i19 = i5 & 512;
                if (i19 != 0) {
                    if ((i3 & 805306368) == 0) {
                        if (dVarF.C(i)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i6 |= i20;
                    }
                    i21 = i5 & 1024;
                    if (i21 != 0) {
                        i22 = i4 | 6;
                    } else if ((i4 & 6) == 0) {
                        if (dVarF.C(i2)) {
                            i23 = 4;
                        } else {
                            i23 = 2;
                        }
                        i22 = i4 | i23;
                    } else {
                        i22 = i4;
                    }
                    if ((i4 & 48) != 0) {
                        i22 |= ((i5 & 2048) == 0 || !dVarF.x(imeOptions)) ? 16 : 32;
                    }
                    i24 = i22;
                    i25 = i5 & 4096;
                    if (i25 != 0) {
                        i26 = i24 | 384;
                    } else if ((i4 & 384) == 0) {
                        if (dVarF.x(mVar)) {
                            i27 = 256;
                        } else {
                            i27 = 128;
                        }
                        i26 = i24 | i27;
                    } else {
                        i26 = i24;
                    }
                    i28 = i5 & 8192;
                    if (i28 != 0) {
                        i30 = i26 | 3072;
                    } else {
                        i29 = i26;
                        if ((i4 & 3072) == 0) {
                            i30 = i29 | (dVarF.A(z2) ? 2048 : 1024);
                        } else {
                            i30 = i29;
                        }
                    }
                    i31 = i5 & 16384;
                    if (i31 != 0) {
                        i33 = i30 | 24576;
                    } else {
                        i32 = i30;
                        if ((i4 & 24576) == 0) {
                            i33 = i32 | (dVarF.A(z3) ? 16384 : 8192);
                        } else {
                            i33 = i32;
                        }
                    }
                    i34 = i5 & 32768;
                    if (i34 != 0) {
                        i33 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i35 = 131072;
                        } else {
                            i35 = 65536;
                        }
                        i33 |= i35;
                    }
                    i36 = i5 & 65536;
                    if (i36 != 0) {
                        i33 |= 1572864;
                    } else if ((i4 & 1572864) == 0) {
                        if (dVarF.x(uVar)) {
                            i37 = 1048576;
                        } else {
                            i37 = 524288;
                        }
                        i33 |= i37;
                    }
                    if ((i6 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (dVarF.g(z4, i6 & 1)) {
                        dVarF.U();
                        if ((i3 & 1) != 0) {
                            if (i49 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i7 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i9 != 0) {
                                nceVarC = nce.INSTANCE.c();
                            }
                            if (i11 != 0) {
                                objR = dVarF.R();
                                if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                    objR = new Function1() { // from class: com.google.android.m82
                                        public final Object invoke(Object obj) {
                                            return CoreTextFieldKt.x((TextLayoutResult) obj);
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function3 = (Function1) objR;
                            }
                            if (i13 != 0) {
                                r48Var2 = null;
                            }
                            if (i15 != 0) {
                                solidColor = new SolidColor(ei1.INSTANCE.i(), null);
                            }
                            if (i17 != 0) {
                                z8 = true;
                            } else {
                                z8 = z;
                            }
                            if (i19 != 0) {
                                i40 = Integer.MAX_VALUE;
                            } else {
                                i40 = i;
                            }
                            if (i21 != 0) {
                                i41 = 1;
                            } else {
                                i41 = i2;
                            }
                            if ((i5 & 2048) != 0) {
                                imeOptionsA = ImeOptions.INSTANCE.a();
                                i33 &= -113;
                            } else {
                                imeOptionsA = imeOptions;
                            }
                            if (i25 != 0) {
                                mVarA = m.INSTANCE.a();
                            } else {
                                mVarA = mVar;
                            }
                            if (i28 != 0) {
                                z9 = true;
                            } else {
                                z9 = z2;
                            }
                            if (i31 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if (i34 != 0) {
                                ps4VarB = zo1.a.b();
                            } else {
                                ps4VarB = ps4Var;
                            }
                            boolean z3210 = z8;
                            textStyle2 = textStyleA;
                            bVar4 = bVar2;
                            z11 = z9;
                            function5 = function3;
                            z12 = z3210;
                            nce nceVar114 = nceVarC;
                            imeOptions3 = imeOptionsA;
                            qu0Var2 = solidColor;
                            nceVar3 = nceVar114;
                            i42 = i33;
                            if (i36 != 0) {
                                uVar3 = null;
                            } else {
                                uVar3 = uVar;
                            }
                        } else {
                            if (i49 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i7 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i9 != 0) {
                                nceVarC = nce.INSTANCE.c();
                            }
                            if (i11 != 0) {
                                objR = dVarF.R();
                                if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                    objR = new Function1() { // from class: com.google.android.m82
                                        public final Object invoke(Object obj) {
                                            return CoreTextFieldKt.x((TextLayoutResult) obj);
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function3 = (Function1) objR;
                            }
                            if (i13 != 0) {
                                r48Var2 = null;
                            }
                            if (i15 != 0) {
                                solidColor = new SolidColor(ei1.INSTANCE.i(), null);
                            }
                            if (i17 != 0) {
                                z8 = true;
                            } else {
                                z8 = z;
                            }
                            if (i19 != 0) {
                                i40 = Integer.MAX_VALUE;
                            } else {
                                i40 = i;
                            }
                            if (i21 != 0) {
                                i41 = 1;
                            } else {
                                i41 = i2;
                            }
                            if ((i5 & 2048) != 0) {
                                imeOptionsA = ImeOptions.INSTANCE.a();
                                i33 &= -113;
                            } else {
                                imeOptionsA = imeOptions;
                            }
                            if (i25 != 0) {
                                mVarA = m.INSTANCE.a();
                            } else {
                                mVarA = mVar;
                            }
                            if (i28 != 0) {
                                z9 = true;
                            } else {
                                z9 = z2;
                            }
                            if (i31 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if (i34 != 0) {
                                ps4VarB = zo1.a.b();
                            } else {
                                ps4VarB = ps4Var;
                            }
                            boolean z3211 = z8;
                            textStyle2 = textStyleA;
                            bVar4 = bVar2;
                            z11 = z9;
                            function5 = function3;
                            z12 = z3211;
                            nce nceVar115 = nceVarC;
                            imeOptions3 = imeOptionsA;
                            qu0Var2 = solidColor;
                            nceVar3 = nceVar115;
                            i42 = i33;
                            if (i36 != 0) {
                                uVar3 = null;
                            } else {
                                uVar3 = uVar;
                            }
                        }
                        dVarF.M();
                        qu0Var3 = qu0Var2;
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(31062401, i6, i42, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                        }
                        objR2 = dVarF.R();
                        companion = androidx.compose.p004runtime.d.INSTANCE;
                        if (objR2 == companion.a()) {
                            objR2 = new androidx.compose.ui.focus.f();
                            dVarF.L(objR2);
                        }
                        fVar = (androidx.compose.ui.focus.f) objR2;
                        objR3 = dVarF.R();
                        i43 = i6;
                        if (objR3 == companion.a()) {
                            objR3 = LegacyPlatformTextInputServiceAdapter_androidKt.b();
                            dVarF.L(objR3);
                        }
                        bVar5 = (androidx.compose.p001foundation.text.input.internal.b) objR3;
                        objR4 = dVarF.R();
                        if (objR4 == companion.a()) {
                            objR4 = new dxc(bVar5);
                            dVarF.L(objR4);
                        }
                        dxcVar = (dxc) objR4;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        bVar6 = (l.b) dVarF.v(CompositionLocalsKt.i());
                        selectionBackgroundColor = ((SelectionColors) dVarF.v(jzc.c())).getSelectionBackgroundColor();
                        ok4Var = (ok4) dVarF.v(CompositionLocalsKt.h());
                        a0Var = (a0) dVarF.v(CompositionLocalsKt.v());
                        textStyle4 = textStyle2;
                        hybVar = (hyb) dVarF.v(CompositionLocalsKt.r());
                        z13 = z12;
                        if (i40 == 1) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Vertical;
                        }
                        if (uVar3 == null) {
                            dVarF.y(-213744626);
                            Object[] objArr8 = {orientation};
                            k0b<u, Object> k0bVarA8 = u.INSTANCE.a();
                            zC = dVarF.C(orientation.ordinal());
                            objR18 = dVarF.R();
                            if (zC) {
                                objR18 = new Function0() { // from class: com.google.android.d92
                                    public final Object invoke() {
                                        return CoreTextFieldKt.O(orientation);
                                    }
                                };
                                dVarF.L(objR18);
                            } else {
                                objR18 = new Function0() { // from class: com.google.android.d92
                                    public final Object invoke() {
                                        return CoreTextFieldKt.O(orientation);
                                    }
                                };
                                dVarF.L(objR18);
                            }
                            uVar4 = (u) dfa.k(objArr8, k0bVarA8, (Function0) objR18, dVarF, 0);
                            dVarF.u();
                        } else {
                            dVarF.y(-213745742);
                            dVarF.u();
                            uVar4 = uVar3;
                        }
                        if (uVar4.j() != orientation) {
                            StringBuilder sb8 = new StringBuilder();
                            sb8.append("Mismatching scroller orientation; ");
                            if (orientation == Orientation.Vertical) {
                                str = "only single-line, non-wrap text fields can scroll horizontally";
                            } else {
                                str = "single-line, non-wrap text fields can only scroll horizontally";
                            }
                            sb8.append(str);
                            throw new IllegalArgumentException(sb8.toString());
                        }
                        i44 = i43 & 14;
                        if (i44 == 4) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i43 & 57344) == 16384) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objR5 = dVarF.R();
                        if (z16) {
                            transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                            composition = textFieldValue.getComposition();
                            if (composition != null) {
                                uVar5 = uVar4;
                                transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                if (transformedTextC2 != null) {
                                    objR5 = transformedTextC2;
                                }
                                dVarF.L(objR5);
                            } else {
                                uVar5 = uVar4;
                            }
                            objR5 = transformedTextC;
                            dVarF.L(objR5);
                        } else {
                            transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                            composition = textFieldValue.getComposition();
                            if (composition != null) {
                                uVar5 = uVar4;
                                transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                if (transformedTextC2 != null) {
                                    objR5 = transformedTextC2;
                                }
                                dVarF.L(objR5);
                            } else {
                                uVar5 = uVar4;
                            }
                            objR5 = transformedTextC;
                            dVarF.L(objR5);
                        }
                        TransformedText transformedText8 = (TransformedText) objR5;
                        text = transformedText8.getText();
                        offsetMapping = transformedText8.getOffsetMapping();
                        qaaVarC = pp1.c(dVarF, 0);
                        zX = dVarF.x(hybVar);
                        objR6 = dVarF.R();
                        if (zX) {
                            objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                            dVarF.L(objR6);
                        } else {
                            objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                            dVarF.L(objR6);
                        }
                        k07Var = (k07) objR6;
                        m mVar10 = mVarA;
                        k07Var.X(textFieldValue.getText(), text, textStyle4, z13, r54, bVar6, function1, mVar10, ok4Var, selectionBackgroundColor);
                        k07Var.getProcessor().e(textFieldValue, k07Var.getInputSession());
                        objR7 = dVarF.R();
                        if (objR7 == companion.a()) {
                            objR7 = new rsd(0, 1, null);
                            dVarF.L(objR7);
                        }
                        rsdVar = (rsd) objR7;
                        rsd.f(rsdVar, textFieldValue, 0L, 2, null);
                        objR8 = dVarF.R();
                        if (objR8 == companion.a()) {
                            objR8 = vn3.k(EmptyCoroutineContext.a, dVarF);
                            dVarF.L(objR8);
                        }
                        ta2Var = (ta2) objR8;
                        objR9 = dVarF.R();
                        if (objR9 == companion.a()) {
                            objR9 = androidx.compose.p001foundation.relocation.c.a();
                            dVarF.L(objR9);
                        }
                        cu0Var = (cu0) objR9;
                        objR10 = dVarF.R();
                        r48 r48Var10 = r48Var2;
                        if (objR10 == companion.a()) {
                            objR10 = new TextFieldSelectionManager(rsdVar);
                            dVarF.L(objR10);
                        }
                        textFieldSelectionManager = (TextFieldSelectionManager) objR10;
                        textFieldSelectionManager.L0(offsetMapping);
                        textFieldSelectionManager.U0(nceVar3);
                        textFieldSelectionManager.M0(k07Var.r());
                        textFieldSelectionManager.Q0(k07Var);
                        textFieldSelectionManager.T0(textFieldValue);
                        textFieldSelectionManager.z0((jf1) dVarF.v(CompositionLocalsKt.d()));
                        textFieldSelectionManager.A0(ta2Var);
                        textFieldSelectionManager.R0((yzc) dVarF.v(CompositionLocalsKt.s()));
                        textFieldSelectionManager.I0((c65) dVarF.v(CompositionLocalsKt.k()));
                        textFieldSelectionManager.G0(fVar);
                        textFieldSelectionManager.E0(!z10);
                        textFieldSelectionManager.F0(z11);
                        if (up1.isSmartSelectionEnabled) {
                            dVarF.y(1966756105);
                            textFieldSelectionManager.N0(androidx.compose.p001foundation.text.selection.c.h(SelectedTextType.EditableText, textStyle4.u(), dVarF, 6));
                            dVarF.u();
                        } else {
                            dVarF.y(1966902177);
                            dVarF.u();
                        }
                        k07Var.h();
                        new Function1() { // from class: com.google.android.e92
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.y(textFieldSelectionManager, (b) obj);
                            }
                        };
                        new Function0() { // from class: com.google.android.f92
                            public final Object invoke() {
                                return CoreTextFieldKt.z(textFieldSelectionManager);
                            }
                        };
                        new Function0() { // from class: com.google.android.g92
                            public final Object invoke() {
                                return CoreTextFieldKt.A(textFieldSelectionManager);
                            }
                        };
                        companion2 = androidx.compose.ui.b.INSTANCE;
                        boolean zT1117 = dVarF.T(k07Var);
                        i45 = i42 & 7168;
                        i46 = i42;
                        if (i45 == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        boolean z3111118 = z17 | zT1117;
                        if ((i46 & 57344) == 16384) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        boolean zT1118 = z3111118 | z18 | dVarF.T(dxcVar);
                        if (i44 == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean z3111119 = zT1118 | z19;
                        i47 = (i46 & 112) ^ 48;
                        if (i47 > 32) {
                            dxcVar2 = dxcVar;
                            if ((i46 & 48) != 32) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                        } else {
                            dxcVar2 = dxcVar;
                            if ((i46 & 48) != 32) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                        }
                        zT = z3111119 | z20 | dVarF.T(offsetMapping) | dVarF.T(ta2Var) | dVarF.T(cu0Var) | dVarF.T(textFieldSelectionManager);
                        objR11 = dVarF.R();
                        if (zT) {
                            zn8Var = offsetMapping;
                            final ImeOptions imeOptions11110 = imeOptions3;
                            final boolean z31111110 = z11;
                            final boolean z31111111 = z10;
                            objR11 = new Function1() { // from class: com.google.android.h92
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.B(k07Var, z31111110, z31111111, dxcVar2, textFieldValue, imeOptions11110, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                                }
                            };
                            k07Var2 = k07Var;
                            z21 = z31111110;
                            textFieldValue2 = textFieldValue;
                            imeOptions4 = imeOptions11110;
                            textFieldSelectionManager2 = textFieldSelectionManager;
                            ta2Var2 = ta2Var;
                            cu0Var2 = cu0Var;
                            dVarF.L(objR11);
                        } else {
                            zn8Var = offsetMapping;
                            final ImeOptions imeOptions11111 = imeOptions3;
                            final boolean z31111112 = z11;
                            final boolean z31111113 = z10;
                            objR11 = new Function1() { // from class: com.google.android.h92
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.B(k07Var, z31111112, z31111113, dxcVar2, textFieldValue, imeOptions11111, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                                }
                            };
                            k07Var2 = k07Var;
                            z21 = z31111112;
                            textFieldValue2 = textFieldValue;
                            imeOptions4 = imeOptions11111;
                            textFieldSelectionManager2 = textFieldSelectionManager;
                            ta2Var2 = ta2Var;
                            cu0Var2 = cu0Var;
                            dVarF.L(objR11);
                        }
                        final cu0 cu0Var11 = cu0Var2;
                        androidx.compose.ui.b bVarA11113 = atc.a(companion2, z21, fVar, r48Var10, (Function1) objR11);
                        if (z21) {
                            z22 = false;
                        } else {
                            z22 = false;
                        }
                        q6cVarR = p0.r(Boolean.valueOf(z22), dVarF, 0);
                        Unit unit9 = Unit.a;
                        boolean zX19 = dVarF.x(q6cVarR) | dVarF.T(k07Var2) | dVarF.T(dxcVar2) | dVarF.T(textFieldSelectionManager2);
                        if (i47 > 32) {
                            imeOptions5 = imeOptions4;
                            if ((i46 & 48) != 32) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                        } else {
                            imeOptions5 = imeOptions4;
                            if ((i46 & 48) != 32) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                        }
                        z24 = zX19 | z23;
                        objR12 = dVarF.R();
                        if (z24) {
                            ImeOptions imeOptions11112 = imeOptions5;
                            dxc dxcVar110 = dxcVar2;
                            TextFieldSelectionManager textFieldSelectionManager114 = textFieldSelectionManager2;
                            k07 k07Var113 = k07Var2;
                            objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var113, q6cVarR, dxcVar110, textFieldSelectionManager114, imeOptions11112, null);
                            k07Var3 = k07Var113;
                            textFieldSelectionManager3 = textFieldSelectionManager114;
                            imeOptions6 = imeOptions11112;
                            dVarF.L(objR12);
                        } else {
                            ImeOptions imeOptions11113 = imeOptions5;
                            dxc dxcVar111 = dxcVar2;
                            TextFieldSelectionManager textFieldSelectionManager115 = textFieldSelectionManager2;
                            k07 k07Var114 = k07Var2;
                            objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var114, q6cVarR, dxcVar111, textFieldSelectionManager115, imeOptions11113, null);
                            k07Var3 = k07Var114;
                            textFieldSelectionManager3 = textFieldSelectionManager115;
                            imeOptions6 = imeOptions11113;
                            dVarF.L(objR12);
                        }
                        imeOptions7 = imeOptions6;
                        vn3.g(unit9, (Function2) objR12, dVarF, 6);
                        int i518 = i46 >> 3;
                        z25 = z21;
                        k07Var4 = k07Var3;
                        textFieldSelectionManager4 = textFieldSelectionManager3;
                        androidx.compose.ui.b bVarA11114 = huc.a(companion2, textFieldSelectionManager4, z25, r48Var10, k07Var4, fVar, z10, zn8Var, dVarF, (i518 & 896) | 196614 | ((i43 >> 9) & 7168) | ((i46 << 6) & 3670016));
                        zn8Var2 = zn8Var;
                        final androidx.compose.ui.b bVarB118 = y92.b(companion2, k07Var4, textFieldValue2, zn8Var2);
                        boolean zT1119 = dVarF.T(k07Var4);
                        if (i45 == 2048) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        boolean zX110 = zT1119 | z26 | dVarF.x(a0Var) | dVarF.T(textFieldSelectionManager4);
                        if (i44 == 4) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        zT2 = zX110 | z27 | dVarF.T(zn8Var2);
                        objR13 = dVarF.R();
                        if (zT2) {
                            objR13 = new Function1() { // from class: com.google.android.n82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                                }
                            };
                            a0Var2 = a0Var;
                            textFieldSelectionManager5 = textFieldSelectionManager4;
                            dVarF.L(objR13);
                        } else {
                            objR13 = new Function1() { // from class: com.google.android.n82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                                }
                            };
                            a0Var2 = a0Var;
                            textFieldSelectionManager5 = textFieldSelectionManager4;
                            dVarF.L(objR13);
                        }
                        final androidx.compose.ui.b bVarA11115 = xq8.a(companion2, (Function1) objR13);
                        textFieldSelectionManager6 = textFieldSelectionManager5;
                        CoreTextFieldSemanticsModifier j92Var10 = new CoreTextFieldSemanticsModifier(transformedText8, textFieldValue, k07Var4, z10, z25, nceVar3 instanceof a39, zn8Var2, textFieldSelectionManager6, imeOptions7, fVar);
                        a0 a0Var12 = a0Var2;
                        if (z25 != 0) {
                            z28 = false;
                        } else {
                            z28 = false;
                        }
                        final androidx.compose.ui.b bVarA11116 = y92.a(companion2, k07Var4, textFieldValue, zn8Var2, qu0Var3, z28);
                        final nce nceVar116 = nceVar3;
                        zT3 = dVarF.T(textFieldSelectionManager6);
                        objR14 = dVarF.R();
                        if (zT3) {
                            objR14 = new Function1() { // from class: com.google.android.o82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                                }
                            };
                            dVarF.L(objR14);
                        } else {
                            objR14 = new Function1() { // from class: com.google.android.o82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                                }
                            };
                            dVarF.L(objR14);
                        }
                        vn3.c(textFieldSelectionManager6, (Function1) objR14, dVarF, 0);
                        boolean zT11110 = dVarF.T(k07Var4) | dVarF.T(dxcVar2);
                        if (i44 == 4) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        z30 = z29 | zT11110 | ((i47 <= 32 && dVarF.x(imeOptions7)) || (i46 & 48) == 32);
                        objR15 = dVarF.R();
                        if (z30) {
                            objR15 = new Function1() { // from class: com.google.android.p82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                                }
                            };
                            dVarF.L(objR15);
                        } else {
                            objR15 = new Function1() { // from class: com.google.android.p82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                                }
                            };
                            dVarF.L(objR15);
                        }
                        vn3.c(imeOptions7, (Function1) objR15, dVarF, i518 & 14);
                        Function1<TextFieldValue, Unit> function1R10 = k07Var4.r();
                        boolean z31111114 = !z10;
                        i48 = i40;
                        if (i48 == 1) {
                            z31 = true;
                        } else {
                            z31 = false;
                        }
                        androidx.compose.ui.b bVarB119 = TextFieldKeyInputKt.b(companion2, k07Var4, textFieldSelectionManager6, textFieldValue, function1R10, z31111114, z31, zn8Var2, rsdVar, imeOptions7.getImeAction());
                        keyboardType = imeOptions7.getKeyboardType();
                        companion3 = androidx.compose.ui.text.input.d.INSTANCE;
                        if (androidx.compose.ui.text.input.d.n(keyboardType, companion3.f())) {
                            z32 = false;
                        } else {
                            z32 = false;
                        }
                        boolean zC11 = C(q6cVarR);
                        zA = dVarF.A(z32) | dVarF.T(bVar5);
                        objR16 = dVarF.R();
                        if (zA) {
                            objR16 = new Function0() { // from class: com.google.android.q82
                                public final Object invoke() {
                                    return CoreTextFieldKt.G(z32, bVar5);
                                }
                            };
                            dVarF.L(objR16);
                        } else {
                            objR16 = new Function0() { // from class: com.google.android.q82
                                public final Object invoke() {
                                    return CoreTextFieldKt.G(z32, bVar5);
                                }
                            };
                            dVarF.L(objR16);
                        }
                        androidx.compose.ui.b bVarB1110 = hcc.b(companion2, zC11, z32, (Function0) objR16);
                        ta2 ta2Var12 = ta2Var2;
                        qu0VarE = ma0.e((qu0) dVarF.v(ma0.c()), ((ei1) dVarF.v(ma0.d())).getValue(), na0.a());
                        zT4 = dVarF.T(k07Var4) | dVarF.x(qu0VarE);
                        objR17 = dVarF.R();
                        if (zT4) {
                            objR17 = new Function1() { // from class: com.google.android.x82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                                }
                            };
                            dVarF.L(objR17);
                        } else {
                            objR17 = new Function1() { // from class: com.google.android.x82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                                }
                            };
                            dVarF.L(objR17);
                        }
                        androidx.compose.ui.b bVarD10 = androidx.compose.ui.draw.c.d(companion2, (Function1) objR17);
                        zv8 zv8VarA10 = tuc.a(dVarF, 0);
                        androidx.compose.ui.b bVar115 = bVar4;
                        androidx.compose.ui.b bVarThen10 = g0(zsc.b(yz6.a(bVar115.then(bVarD10), bVar5, k07Var4, textFieldSelectionManager6).then(bVarB1110).then(bVarA11113), k07Var4, ok4Var), k07Var4, textFieldSelectionManager6).then(bVarB119);
                        final u uVar15 = uVar5;
                        androidx.compose.ui.b bVarA11117 = a0(xq8.a(TextFieldScrollKt.f(bVarThen10, uVar15, r48Var10, z25, zv8VarA10).then(bVarA11114).then(j92Var10), new Function1() { // from class: com.google.android.a92
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.I(k07Var4, (kn6) obj);
                            }
                        }), textFieldSelectionManager6, ta2Var12);
                        if (!z25) {
                            z33 = false;
                        } else {
                            z33 = false;
                        }
                        if (z33) {
                            bVarZ = TextFieldSelectionManager_androidKt.z(companion2, textFieldSelectionManager6);
                        } else {
                            bVarZ = companion2;
                        }
                        final ps4 ps4Var12 = ps4VarB;
                        final androidx.compose.ui.b bVar116 = bVarZ;
                        final boolean z418 = z10;
                        final boolean z419 = z33;
                        final int i519 = i41;
                        P(bVarA11117, textFieldSelectionManager6, ko1.e(-814563849, true, new Function2() { // from class: com.google.android.b92
                            public final Object invoke(Object obj, Object obj2) {
                                return CoreTextFieldKt.J(ps4Var12, k07Var4, textStyle4, i519, i48, uVar15, textFieldValue, nceVar116, bVarA11116, bVarB118, bVarA11115, bVar116, cu0Var11, textFieldSelectionManager6, z419, z418, function5, zn8Var2, f43Var, (d) obj, ((Integer) obj2).intValue());
                            }
                        }, dVarF, 54), dVarF, 384);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        ps4Var2 = ps4Var12;
                        dVar2 = dVarF;
                        function4 = function5;
                        z7 = z418;
                        uVar2 = uVar3;
                        z6 = z25;
                        r48Var2 = r48Var10;
                        z5 = z13;
                        mVar2 = mVar10;
                        i39 = i41;
                        solidColor = qu0Var3;
                        bVar3 = bVar115;
                        i38 = i48;
                        nceVar2 = nceVar116;
                        textStyle3 = textStyle4;
                        imeOptions2 = imeOptions7;
                    } else {
                        dVarF.q();
                        z5 = z;
                        imeOptions2 = imeOptions;
                        mVar2 = mVar;
                        ps4Var2 = ps4Var;
                        uVar2 = uVar;
                        dVar2 = dVarF;
                        textStyle3 = textStyle2;
                        function4 = function3;
                        nceVar2 = nceVarC;
                        bVar3 = bVar2;
                        i38 = i;
                        i39 = i2;
                        z6 = z2;
                        z7 = z3;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.c92
                            public final Object invoke(Object obj, Object obj2) {
                                return CoreTextFieldKt.N(textFieldValue, function1, bVar3, textStyle3, nceVar2, function4, r48Var2, solidColor, z5, i38, i39, imeOptions2, mVar2, z6, z7, ps4Var2, uVar2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i6 |= 805306368;
                i21 = i5 & 1024;
                if (i21 != 0) {
                    i22 = i4 | 6;
                } else if ((i4 & 6) == 0) {
                    if (dVarF.C(i2)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i4 | i23;
                } else {
                    i22 = i4;
                }
                if ((i4 & 48) != 0) {
                    i22 |= ((i5 & 2048) == 0 || !dVarF.x(imeOptions)) ? 16 : 32;
                }
                i24 = i22;
                i25 = i5 & 4096;
                if (i25 != 0) {
                    i26 = i24 | 384;
                } else if ((i4 & 384) == 0) {
                    if (dVarF.x(mVar)) {
                        i27 = 256;
                    } else {
                        i27 = 128;
                    }
                    i26 = i24 | i27;
                } else {
                    i26 = i24;
                }
                i28 = i5 & 8192;
                if (i28 != 0) {
                    i30 = i26 | 3072;
                } else {
                    i29 = i26;
                    if ((i4 & 3072) == 0) {
                        i30 = i29 | (dVarF.A(z2) ? 2048 : 1024);
                    } else {
                        i30 = i29;
                    }
                }
                i31 = i5 & 16384;
                if (i31 != 0) {
                    i33 = i30 | 24576;
                } else {
                    i32 = i30;
                    if ((i4 & 24576) == 0) {
                        i33 = i32 | (dVarF.A(z3) ? 16384 : 8192);
                    } else {
                        i33 = i32;
                    }
                }
                i34 = i5 & 32768;
                if (i34 != 0) {
                    i33 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i35 = 131072;
                    } else {
                        i35 = 65536;
                    }
                    i33 |= i35;
                }
                i36 = i5 & 65536;
                if (i36 != 0) {
                    i33 |= 1572864;
                } else if ((i4 & 1572864) == 0) {
                    if (dVarF.x(uVar)) {
                        i37 = 1048576;
                    } else {
                        i37 = 524288;
                    }
                    i33 |= i37;
                }
                if ((i6 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (dVarF.g(z4, i6 & 1)) {
                    dVarF.U();
                    if ((i3 & 1) != 0) {
                        if (i49 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i7 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i9 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        }
                        if (i11 != 0) {
                            objR = dVarF.R();
                            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.m82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.x((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function3 = (Function1) objR;
                        }
                        if (i13 != 0) {
                            r48Var2 = null;
                        }
                        if (i15 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.i(), null);
                        }
                        if (i17 != 0) {
                            z8 = true;
                        } else {
                            z8 = z;
                        }
                        if (i19 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i;
                        }
                        if (i21 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i2;
                        }
                        if ((i5 & 2048) != 0) {
                            imeOptionsA = ImeOptions.INSTANCE.a();
                            i33 &= -113;
                        } else {
                            imeOptionsA = imeOptions;
                        }
                        if (i25 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar;
                        }
                        if (i28 != 0) {
                            z9 = true;
                        } else {
                            z9 = z2;
                        }
                        if (i31 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if (i34 != 0) {
                            ps4VarB = zo1.a.b();
                        } else {
                            ps4VarB = ps4Var;
                        }
                        boolean z3212 = z8;
                        textStyle2 = textStyleA;
                        bVar4 = bVar2;
                        z11 = z9;
                        function5 = function3;
                        z12 = z3212;
                        nce nceVar117 = nceVarC;
                        imeOptions3 = imeOptionsA;
                        qu0Var2 = solidColor;
                        nceVar3 = nceVar117;
                        i42 = i33;
                        if (i36 != 0) {
                            uVar3 = null;
                        } else {
                            uVar3 = uVar;
                        }
                    } else {
                        if (i49 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i7 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i9 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        }
                        if (i11 != 0) {
                            objR = dVarF.R();
                            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.m82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.x((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function3 = (Function1) objR;
                        }
                        if (i13 != 0) {
                            r48Var2 = null;
                        }
                        if (i15 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.i(), null);
                        }
                        if (i17 != 0) {
                            z8 = true;
                        } else {
                            z8 = z;
                        }
                        if (i19 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i;
                        }
                        if (i21 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i2;
                        }
                        if ((i5 & 2048) != 0) {
                            imeOptionsA = ImeOptions.INSTANCE.a();
                            i33 &= -113;
                        } else {
                            imeOptionsA = imeOptions;
                        }
                        if (i25 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar;
                        }
                        if (i28 != 0) {
                            z9 = true;
                        } else {
                            z9 = z2;
                        }
                        if (i31 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if (i34 != 0) {
                            ps4VarB = zo1.a.b();
                        } else {
                            ps4VarB = ps4Var;
                        }
                        boolean z3213 = z8;
                        textStyle2 = textStyleA;
                        bVar4 = bVar2;
                        z11 = z9;
                        function5 = function3;
                        z12 = z3213;
                        nce nceVar118 = nceVarC;
                        imeOptions3 = imeOptionsA;
                        qu0Var2 = solidColor;
                        nceVar3 = nceVar118;
                        i42 = i33;
                        if (i36 != 0) {
                            uVar3 = null;
                        } else {
                            uVar3 = uVar;
                        }
                    }
                    dVarF.M();
                    qu0Var3 = qu0Var2;
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(31062401, i6, i42, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                    }
                    objR2 = dVarF.R();
                    companion = androidx.compose.p004runtime.d.INSTANCE;
                    if (objR2 == companion.a()) {
                        objR2 = new androidx.compose.ui.focus.f();
                        dVarF.L(objR2);
                    }
                    fVar = (androidx.compose.ui.focus.f) objR2;
                    objR3 = dVarF.R();
                    i43 = i6;
                    if (objR3 == companion.a()) {
                        objR3 = LegacyPlatformTextInputServiceAdapter_androidKt.b();
                        dVarF.L(objR3);
                    }
                    bVar5 = (androidx.compose.p001foundation.text.input.internal.b) objR3;
                    objR4 = dVarF.R();
                    if (objR4 == companion.a()) {
                        objR4 = new dxc(bVar5);
                        dVarF.L(objR4);
                    }
                    dxcVar = (dxc) objR4;
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    bVar6 = (l.b) dVarF.v(CompositionLocalsKt.i());
                    selectionBackgroundColor = ((SelectionColors) dVarF.v(jzc.c())).getSelectionBackgroundColor();
                    ok4Var = (ok4) dVarF.v(CompositionLocalsKt.h());
                    a0Var = (a0) dVarF.v(CompositionLocalsKt.v());
                    textStyle4 = textStyle2;
                    hybVar = (hyb) dVarF.v(CompositionLocalsKt.r());
                    z13 = z12;
                    if (i40 == 1) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Vertical;
                    }
                    if (uVar3 == null) {
                        dVarF.y(-213744626);
                        Object[] objArr9 = {orientation};
                        k0b<u, Object> k0bVarA9 = u.INSTANCE.a();
                        zC = dVarF.C(orientation.ordinal());
                        objR18 = dVarF.R();
                        if (zC) {
                            objR18 = new Function0() { // from class: com.google.android.d92
                                public final Object invoke() {
                                    return CoreTextFieldKt.O(orientation);
                                }
                            };
                            dVarF.L(objR18);
                        } else {
                            objR18 = new Function0() { // from class: com.google.android.d92
                                public final Object invoke() {
                                    return CoreTextFieldKt.O(orientation);
                                }
                            };
                            dVarF.L(objR18);
                        }
                        uVar4 = (u) dfa.k(objArr9, k0bVarA9, (Function0) objR18, dVarF, 0);
                        dVarF.u();
                    } else {
                        dVarF.y(-213745742);
                        dVarF.u();
                        uVar4 = uVar3;
                    }
                    if (uVar4.j() != orientation) {
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append("Mismatching scroller orientation; ");
                        if (orientation == Orientation.Vertical) {
                            str = "only single-line, non-wrap text fields can scroll horizontally";
                        } else {
                            str = "single-line, non-wrap text fields can only scroll horizontally";
                        }
                        sb9.append(str);
                        throw new IllegalArgumentException(sb9.toString());
                    }
                    i44 = i43 & 14;
                    if (i44 == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i43 & 57344) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z14 | z15;
                    objR5 = dVarF.R();
                    if (z16) {
                        transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                        composition = textFieldValue.getComposition();
                        if (composition != null) {
                            uVar5 = uVar4;
                            transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                            if (transformedTextC2 != null) {
                                objR5 = transformedTextC2;
                            }
                            dVarF.L(objR5);
                        } else {
                            uVar5 = uVar4;
                        }
                        objR5 = transformedTextC;
                        dVarF.L(objR5);
                    } else {
                        transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                        composition = textFieldValue.getComposition();
                        if (composition != null) {
                            uVar5 = uVar4;
                            transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                            if (transformedTextC2 != null) {
                                objR5 = transformedTextC2;
                            }
                            dVarF.L(objR5);
                        } else {
                            uVar5 = uVar4;
                        }
                        objR5 = transformedTextC;
                        dVarF.L(objR5);
                    }
                    TransformedText transformedText9 = (TransformedText) objR5;
                    text = transformedText9.getText();
                    offsetMapping = transformedText9.getOffsetMapping();
                    qaaVarC = pp1.c(dVarF, 0);
                    zX = dVarF.x(hybVar);
                    objR6 = dVarF.R();
                    if (zX) {
                        objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                        dVarF.L(objR6);
                    } else {
                        objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                        dVarF.L(objR6);
                    }
                    k07Var = (k07) objR6;
                    m mVar11 = mVarA;
                    k07Var.X(textFieldValue.getText(), text, textStyle4, z13, r54, bVar6, function1, mVar11, ok4Var, selectionBackgroundColor);
                    k07Var.getProcessor().e(textFieldValue, k07Var.getInputSession());
                    objR7 = dVarF.R();
                    if (objR7 == companion.a()) {
                        objR7 = new rsd(0, 1, null);
                        dVarF.L(objR7);
                    }
                    rsdVar = (rsd) objR7;
                    rsd.f(rsdVar, textFieldValue, 0L, 2, null);
                    objR8 = dVarF.R();
                    if (objR8 == companion.a()) {
                        objR8 = vn3.k(EmptyCoroutineContext.a, dVarF);
                        dVarF.L(objR8);
                    }
                    ta2Var = (ta2) objR8;
                    objR9 = dVarF.R();
                    if (objR9 == companion.a()) {
                        objR9 = androidx.compose.p001foundation.relocation.c.a();
                        dVarF.L(objR9);
                    }
                    cu0Var = (cu0) objR9;
                    objR10 = dVarF.R();
                    r48 r48Var11 = r48Var2;
                    if (objR10 == companion.a()) {
                        objR10 = new TextFieldSelectionManager(rsdVar);
                        dVarF.L(objR10);
                    }
                    textFieldSelectionManager = (TextFieldSelectionManager) objR10;
                    textFieldSelectionManager.L0(offsetMapping);
                    textFieldSelectionManager.U0(nceVar3);
                    textFieldSelectionManager.M0(k07Var.r());
                    textFieldSelectionManager.Q0(k07Var);
                    textFieldSelectionManager.T0(textFieldValue);
                    textFieldSelectionManager.z0((jf1) dVarF.v(CompositionLocalsKt.d()));
                    textFieldSelectionManager.A0(ta2Var);
                    textFieldSelectionManager.R0((yzc) dVarF.v(CompositionLocalsKt.s()));
                    textFieldSelectionManager.I0((c65) dVarF.v(CompositionLocalsKt.k()));
                    textFieldSelectionManager.G0(fVar);
                    textFieldSelectionManager.E0(!z10);
                    textFieldSelectionManager.F0(z11);
                    if (up1.isSmartSelectionEnabled) {
                        dVarF.y(1966756105);
                        textFieldSelectionManager.N0(androidx.compose.p001foundation.text.selection.c.h(SelectedTextType.EditableText, textStyle4.u(), dVarF, 6));
                        dVarF.u();
                    } else {
                        dVarF.y(1966902177);
                        dVarF.u();
                    }
                    k07Var.h();
                    new Function1() { // from class: com.google.android.e92
                        public final Object invoke(Object obj) {
                            return CoreTextFieldKt.y(textFieldSelectionManager, (b) obj);
                        }
                    };
                    new Function0() { // from class: com.google.android.f92
                        public final Object invoke() {
                            return CoreTextFieldKt.z(textFieldSelectionManager);
                        }
                    };
                    new Function0() { // from class: com.google.android.g92
                        public final Object invoke() {
                            return CoreTextFieldKt.A(textFieldSelectionManager);
                        }
                    };
                    companion2 = androidx.compose.ui.b.INSTANCE;
                    boolean zT11111 = dVarF.T(k07Var);
                    i45 = i42 & 7168;
                    i46 = i42;
                    if (i45 == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z31111115 = z17 | zT11111;
                    if ((i46 & 57344) == 16384) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean zT11112 = z31111115 | z18 | dVarF.T(dxcVar);
                    if (i44 == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z31111116 = zT11112 | z19;
                    i47 = (i46 & 112) ^ 48;
                    if (i47 > 32) {
                        dxcVar2 = dxcVar;
                        if ((i46 & 48) != 32) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                    } else {
                        dxcVar2 = dxcVar;
                        if ((i46 & 48) != 32) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                    }
                    zT = z31111116 | z20 | dVarF.T(offsetMapping) | dVarF.T(ta2Var) | dVarF.T(cu0Var) | dVarF.T(textFieldSelectionManager);
                    objR11 = dVarF.R();
                    if (zT) {
                        zn8Var = offsetMapping;
                        final ImeOptions imeOptions11114 = imeOptions3;
                        final boolean z31111117 = z11;
                        final boolean z31111118 = z10;
                        objR11 = new Function1() { // from class: com.google.android.h92
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.B(k07Var, z31111117, z31111118, dxcVar2, textFieldValue, imeOptions11114, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                            }
                        };
                        k07Var2 = k07Var;
                        z21 = z31111117;
                        textFieldValue2 = textFieldValue;
                        imeOptions4 = imeOptions11114;
                        textFieldSelectionManager2 = textFieldSelectionManager;
                        ta2Var2 = ta2Var;
                        cu0Var2 = cu0Var;
                        dVarF.L(objR11);
                    } else {
                        zn8Var = offsetMapping;
                        final ImeOptions imeOptions11115 = imeOptions3;
                        final boolean z31111119 = z11;
                        final boolean z311111110 = z10;
                        objR11 = new Function1() { // from class: com.google.android.h92
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.B(k07Var, z31111119, z311111110, dxcVar2, textFieldValue, imeOptions11115, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                            }
                        };
                        k07Var2 = k07Var;
                        z21 = z31111119;
                        textFieldValue2 = textFieldValue;
                        imeOptions4 = imeOptions11115;
                        textFieldSelectionManager2 = textFieldSelectionManager;
                        ta2Var2 = ta2Var;
                        cu0Var2 = cu0Var;
                        dVarF.L(objR11);
                    }
                    final cu0 cu0Var12 = cu0Var2;
                    androidx.compose.ui.b bVarA11118 = atc.a(companion2, z21, fVar, r48Var11, (Function1) objR11);
                    if (z21) {
                        z22 = false;
                    } else {
                        z22 = false;
                    }
                    q6cVarR = p0.r(Boolean.valueOf(z22), dVarF, 0);
                    Unit unit10 = Unit.a;
                    boolean zX111 = dVarF.x(q6cVarR) | dVarF.T(k07Var2) | dVarF.T(dxcVar2) | dVarF.T(textFieldSelectionManager2);
                    if (i47 > 32) {
                        imeOptions5 = imeOptions4;
                        if ((i46 & 48) != 32) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                    } else {
                        imeOptions5 = imeOptions4;
                        if ((i46 & 48) != 32) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                    }
                    z24 = zX111 | z23;
                    objR12 = dVarF.R();
                    if (z24) {
                        ImeOptions imeOptions11116 = imeOptions5;
                        dxc dxcVar112 = dxcVar2;
                        TextFieldSelectionManager textFieldSelectionManager116 = textFieldSelectionManager2;
                        k07 k07Var115 = k07Var2;
                        objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var115, q6cVarR, dxcVar112, textFieldSelectionManager116, imeOptions11116, null);
                        k07Var3 = k07Var115;
                        textFieldSelectionManager3 = textFieldSelectionManager116;
                        imeOptions6 = imeOptions11116;
                        dVarF.L(objR12);
                    } else {
                        ImeOptions imeOptions11117 = imeOptions5;
                        dxc dxcVar113 = dxcVar2;
                        TextFieldSelectionManager textFieldSelectionManager117 = textFieldSelectionManager2;
                        k07 k07Var116 = k07Var2;
                        objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var116, q6cVarR, dxcVar113, textFieldSelectionManager117, imeOptions11117, null);
                        k07Var3 = k07Var116;
                        textFieldSelectionManager3 = textFieldSelectionManager117;
                        imeOptions6 = imeOptions11117;
                        dVarF.L(objR12);
                    }
                    imeOptions7 = imeOptions6;
                    vn3.g(unit10, (Function2) objR12, dVarF, 6);
                    int i5110 = i46 >> 3;
                    z25 = z21;
                    k07Var4 = k07Var3;
                    textFieldSelectionManager4 = textFieldSelectionManager3;
                    androidx.compose.ui.b bVarA11119 = huc.a(companion2, textFieldSelectionManager4, z25, r48Var11, k07Var4, fVar, z10, zn8Var, dVarF, (i5110 & 896) | 196614 | ((i43 >> 9) & 7168) | ((i46 << 6) & 3670016));
                    zn8Var2 = zn8Var;
                    final androidx.compose.ui.b bVarB1111 = y92.b(companion2, k07Var4, textFieldValue2, zn8Var2);
                    boolean zT11113 = dVarF.T(k07Var4);
                    if (i45 == 2048) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    boolean zX112 = zT11113 | z26 | dVarF.x(a0Var) | dVarF.T(textFieldSelectionManager4);
                    if (i44 == 4) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    zT2 = zX112 | z27 | dVarF.T(zn8Var2);
                    objR13 = dVarF.R();
                    if (zT2) {
                        objR13 = new Function1() { // from class: com.google.android.n82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                            }
                        };
                        a0Var2 = a0Var;
                        textFieldSelectionManager5 = textFieldSelectionManager4;
                        dVarF.L(objR13);
                    } else {
                        objR13 = new Function1() { // from class: com.google.android.n82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                            }
                        };
                        a0Var2 = a0Var;
                        textFieldSelectionManager5 = textFieldSelectionManager4;
                        dVarF.L(objR13);
                    }
                    final androidx.compose.ui.b bVarA111110 = xq8.a(companion2, (Function1) objR13);
                    textFieldSelectionManager6 = textFieldSelectionManager5;
                    CoreTextFieldSemanticsModifier j92Var11 = new CoreTextFieldSemanticsModifier(transformedText9, textFieldValue, k07Var4, z10, z25, nceVar3 instanceof a39, zn8Var2, textFieldSelectionManager6, imeOptions7, fVar);
                    a0 a0Var13 = a0Var2;
                    if (z25 != 0) {
                        z28 = false;
                    } else {
                        z28 = false;
                    }
                    final androidx.compose.ui.b bVarA111111 = y92.a(companion2, k07Var4, textFieldValue, zn8Var2, qu0Var3, z28);
                    final nce nceVar119 = nceVar3;
                    zT3 = dVarF.T(textFieldSelectionManager6);
                    objR14 = dVarF.R();
                    if (zT3) {
                        objR14 = new Function1() { // from class: com.google.android.o82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                            }
                        };
                        dVarF.L(objR14);
                    } else {
                        objR14 = new Function1() { // from class: com.google.android.o82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                            }
                        };
                        dVarF.L(objR14);
                    }
                    vn3.c(textFieldSelectionManager6, (Function1) objR14, dVarF, 0);
                    boolean zT11114 = dVarF.T(k07Var4) | dVarF.T(dxcVar2);
                    if (i44 == 4) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    z30 = z29 | zT11114 | ((i47 <= 32 && dVarF.x(imeOptions7)) || (i46 & 48) == 32);
                    objR15 = dVarF.R();
                    if (z30) {
                        objR15 = new Function1() { // from class: com.google.android.p82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                            }
                        };
                        dVarF.L(objR15);
                    } else {
                        objR15 = new Function1() { // from class: com.google.android.p82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                            }
                        };
                        dVarF.L(objR15);
                    }
                    vn3.c(imeOptions7, (Function1) objR15, dVarF, i5110 & 14);
                    Function1<TextFieldValue, Unit> function1R11 = k07Var4.r();
                    boolean z311111111 = !z10;
                    i48 = i40;
                    if (i48 == 1) {
                        z31 = true;
                    } else {
                        z31 = false;
                    }
                    androidx.compose.ui.b bVarB1112 = TextFieldKeyInputKt.b(companion2, k07Var4, textFieldSelectionManager6, textFieldValue, function1R11, z311111111, z31, zn8Var2, rsdVar, imeOptions7.getImeAction());
                    keyboardType = imeOptions7.getKeyboardType();
                    companion3 = androidx.compose.ui.text.input.d.INSTANCE;
                    if (androidx.compose.ui.text.input.d.n(keyboardType, companion3.f())) {
                        z32 = false;
                    } else {
                        z32 = false;
                    }
                    boolean zC12 = C(q6cVarR);
                    zA = dVarF.A(z32) | dVarF.T(bVar5);
                    objR16 = dVarF.R();
                    if (zA) {
                        objR16 = new Function0() { // from class: com.google.android.q82
                            public final Object invoke() {
                                return CoreTextFieldKt.G(z32, bVar5);
                            }
                        };
                        dVarF.L(objR16);
                    } else {
                        objR16 = new Function0() { // from class: com.google.android.q82
                            public final Object invoke() {
                                return CoreTextFieldKt.G(z32, bVar5);
                            }
                        };
                        dVarF.L(objR16);
                    }
                    androidx.compose.ui.b bVarB1113 = hcc.b(companion2, zC12, z32, (Function0) objR16);
                    ta2 ta2Var13 = ta2Var2;
                    qu0VarE = ma0.e((qu0) dVarF.v(ma0.c()), ((ei1) dVarF.v(ma0.d())).getValue(), na0.a());
                    zT4 = dVarF.T(k07Var4) | dVarF.x(qu0VarE);
                    objR17 = dVarF.R();
                    if (zT4) {
                        objR17 = new Function1() { // from class: com.google.android.x82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                            }
                        };
                        dVarF.L(objR17);
                    } else {
                        objR17 = new Function1() { // from class: com.google.android.x82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                            }
                        };
                        dVarF.L(objR17);
                    }
                    androidx.compose.ui.b bVarD11 = androidx.compose.ui.draw.c.d(companion2, (Function1) objR17);
                    zv8 zv8VarA11 = tuc.a(dVarF, 0);
                    androidx.compose.ui.b bVar117 = bVar4;
                    androidx.compose.ui.b bVarThen11 = g0(zsc.b(yz6.a(bVar117.then(bVarD11), bVar5, k07Var4, textFieldSelectionManager6).then(bVarB1113).then(bVarA11118), k07Var4, ok4Var), k07Var4, textFieldSelectionManager6).then(bVarB1112);
                    final u uVar16 = uVar5;
                    androidx.compose.ui.b bVarA111112 = a0(xq8.a(TextFieldScrollKt.f(bVarThen11, uVar16, r48Var11, z25, zv8VarA11).then(bVarA11119).then(j92Var11), new Function1() { // from class: com.google.android.a92
                        public final Object invoke(Object obj) {
                            return CoreTextFieldKt.I(k07Var4, (kn6) obj);
                        }
                    }), textFieldSelectionManager6, ta2Var13);
                    if (!z25) {
                        z33 = false;
                    } else {
                        z33 = false;
                    }
                    if (z33) {
                        bVarZ = TextFieldSelectionManager_androidKt.z(companion2, textFieldSelectionManager6);
                    } else {
                        bVarZ = companion2;
                    }
                    final ps4 ps4Var13 = ps4VarB;
                    final androidx.compose.ui.b bVar118 = bVarZ;
                    final boolean z4110 = z10;
                    final boolean z4111 = z33;
                    final int i5111 = i41;
                    P(bVarA111112, textFieldSelectionManager6, ko1.e(-814563849, true, new Function2() { // from class: com.google.android.b92
                        public final Object invoke(Object obj, Object obj2) {
                            return CoreTextFieldKt.J(ps4Var13, k07Var4, textStyle4, i5111, i48, uVar16, textFieldValue, nceVar119, bVarA111111, bVarB1111, bVarA111110, bVar118, cu0Var12, textFieldSelectionManager6, z4111, z4110, function5, zn8Var2, f43Var, (d) obj, ((Integer) obj2).intValue());
                        }
                    }, dVarF, 54), dVarF, 384);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    ps4Var2 = ps4Var13;
                    dVar2 = dVarF;
                    function4 = function5;
                    z7 = z4110;
                    uVar2 = uVar3;
                    z6 = z25;
                    r48Var2 = r48Var11;
                    z5 = z13;
                    mVar2 = mVar11;
                    i39 = i41;
                    solidColor = qu0Var3;
                    bVar3 = bVar117;
                    i38 = i48;
                    nceVar2 = nceVar119;
                    textStyle3 = textStyle4;
                    imeOptions2 = imeOptions7;
                } else {
                    dVarF.q();
                    z5 = z;
                    imeOptions2 = imeOptions;
                    mVar2 = mVar;
                    ps4Var2 = ps4Var;
                    uVar2 = uVar;
                    dVar2 = dVarF;
                    textStyle3 = textStyle2;
                    function4 = function3;
                    nceVar2 = nceVarC;
                    bVar3 = bVar2;
                    i38 = i;
                    i39 = i2;
                    z6 = z2;
                    z7 = z3;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.c92
                        public final Object invoke(Object obj, Object obj2) {
                            return CoreTextFieldKt.N(textFieldValue, function1, bVar3, textStyle3, nceVar2, function4, r48Var2, solidColor, z5, i38, i39, imeOptions2, mVar2, z6, z7, ps4Var2, uVar2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i6 |= 384;
            bVar2 = bVar;
            i7 = i5 & 8;
            if (i7 != 0) {
                if ((i3 & 3072) == 0) {
                    textStyle2 = textStyle;
                    if (dVarF.x(textStyle2)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i6 |= i8;
                }
                i9 = i5 & 16;
                if (i9 != 0) {
                    if ((i3 & 24576) == 0) {
                        nceVarC = nceVar;
                        if (dVarF.x(nceVarC)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i6 |= i10;
                    }
                    i11 = i5 & 32;
                    if (i11 != 0) {
                        i6 |= 196608;
                        function3 = function2;
                    } else {
                        function3 = function2;
                        if ((i3 & 196608) == 0) {
                            if (dVarF.T(function3)) {
                                i12 = 131072;
                            } else {
                                i12 = 65536;
                            }
                            i6 |= i12;
                        }
                    }
                    i13 = i5 & 64;
                    if (i13 != 0) {
                        i6 |= 1572864;
                        r48Var2 = r48Var;
                    } else {
                        r48Var2 = r48Var;
                        if ((i3 & 1572864) == 0) {
                            if (dVarF.x(r48Var2)) {
                                i14 = 1048576;
                            } else {
                                i14 = 524288;
                            }
                            i6 |= i14;
                        }
                    }
                    i15 = i5 & 128;
                    if (i15 != 0) {
                        i6 |= 12582912;
                        solidColor = qu0Var;
                    } else {
                        solidColor = qu0Var;
                        if ((i3 & 12582912) == 0) {
                            if (dVarF.x(solidColor)) {
                                i16 = 8388608;
                            } else {
                                i16 = 4194304;
                            }
                            i6 |= i16;
                        }
                    }
                    i17 = i5 & 256;
                    if (i17 != 0) {
                        i6 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        if (dVarF.A(z)) {
                            i18 = 67108864;
                        } else {
                            i18 = 33554432;
                        }
                        i6 |= i18;
                    }
                    i19 = i5 & 512;
                    if (i19 != 0) {
                        if ((i3 & 805306368) == 0) {
                            if (dVarF.C(i)) {
                                i20 = 536870912;
                            } else {
                                i20 = 268435456;
                            }
                            i6 |= i20;
                        }
                        i21 = i5 & 1024;
                        if (i21 != 0) {
                            i22 = i4 | 6;
                        } else if ((i4 & 6) == 0) {
                            if (dVarF.C(i2)) {
                                i23 = 4;
                            } else {
                                i23 = 2;
                            }
                            i22 = i4 | i23;
                        } else {
                            i22 = i4;
                        }
                        if ((i4 & 48) != 0) {
                            i22 |= ((i5 & 2048) == 0 || !dVarF.x(imeOptions)) ? 16 : 32;
                        }
                        i24 = i22;
                        i25 = i5 & 4096;
                        if (i25 != 0) {
                            i26 = i24 | 384;
                        } else if ((i4 & 384) == 0) {
                            if (dVarF.x(mVar)) {
                                i27 = 256;
                            } else {
                                i27 = 128;
                            }
                            i26 = i24 | i27;
                        } else {
                            i26 = i24;
                        }
                        i28 = i5 & 8192;
                        if (i28 != 0) {
                            i30 = i26 | 3072;
                        } else {
                            i29 = i26;
                            if ((i4 & 3072) == 0) {
                                i30 = i29 | (dVarF.A(z2) ? 2048 : 1024);
                            } else {
                                i30 = i29;
                            }
                        }
                        i31 = i5 & 16384;
                        if (i31 != 0) {
                            i33 = i30 | 24576;
                        } else {
                            i32 = i30;
                            if ((i4 & 24576) == 0) {
                                i33 = i32 | (dVarF.A(z3) ? 16384 : 8192);
                            } else {
                                i33 = i32;
                            }
                        }
                        i34 = i5 & 32768;
                        if (i34 != 0) {
                            i33 |= 196608;
                        } else if ((i4 & 196608) == 0) {
                            if (dVarF.T(ps4Var)) {
                                i35 = 131072;
                            } else {
                                i35 = 65536;
                            }
                            i33 |= i35;
                        }
                        i36 = i5 & 65536;
                        if (i36 != 0) {
                            i33 |= 1572864;
                        } else if ((i4 & 1572864) == 0) {
                            if (dVarF.x(uVar)) {
                                i37 = 1048576;
                            } else {
                                i37 = 524288;
                            }
                            i33 |= i37;
                        }
                        if ((i6 & 306783379) == 306783378) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (dVarF.g(z4, i6 & 1)) {
                            dVarF.U();
                            if ((i3 & 1) != 0) {
                                if (i49 != 0) {
                                    bVar2 = androidx.compose.ui.b.INSTANCE;
                                }
                                if (i7 != 0) {
                                    textStyleA = TextStyle.INSTANCE.a();
                                } else {
                                    textStyleA = textStyle2;
                                }
                                if (i9 != 0) {
                                    nceVarC = nce.INSTANCE.c();
                                }
                                if (i11 != 0) {
                                    objR = dVarF.R();
                                    if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                        objR = new Function1() { // from class: com.google.android.m82
                                            public final Object invoke(Object obj) {
                                                return CoreTextFieldKt.x((TextLayoutResult) obj);
                                            }
                                        };
                                        dVarF.L(objR);
                                    }
                                    function3 = (Function1) objR;
                                }
                                if (i13 != 0) {
                                    r48Var2 = null;
                                }
                                if (i15 != 0) {
                                    solidColor = new SolidColor(ei1.INSTANCE.i(), null);
                                }
                                if (i17 != 0) {
                                    z8 = true;
                                } else {
                                    z8 = z;
                                }
                                if (i19 != 0) {
                                    i40 = Integer.MAX_VALUE;
                                } else {
                                    i40 = i;
                                }
                                if (i21 != 0) {
                                    i41 = 1;
                                } else {
                                    i41 = i2;
                                }
                                if ((i5 & 2048) != 0) {
                                    imeOptionsA = ImeOptions.INSTANCE.a();
                                    i33 &= -113;
                                } else {
                                    imeOptionsA = imeOptions;
                                }
                                if (i25 != 0) {
                                    mVarA = m.INSTANCE.a();
                                } else {
                                    mVarA = mVar;
                                }
                                if (i28 != 0) {
                                    z9 = true;
                                } else {
                                    z9 = z2;
                                }
                                if (i31 != 0) {
                                    z10 = false;
                                } else {
                                    z10 = z3;
                                }
                                if (i34 != 0) {
                                    ps4VarB = zo1.a.b();
                                } else {
                                    ps4VarB = ps4Var;
                                }
                                boolean z3214 = z8;
                                textStyle2 = textStyleA;
                                bVar4 = bVar2;
                                z11 = z9;
                                function5 = function3;
                                z12 = z3214;
                                nce nceVar1110 = nceVarC;
                                imeOptions3 = imeOptionsA;
                                qu0Var2 = solidColor;
                                nceVar3 = nceVar1110;
                                i42 = i33;
                                if (i36 != 0) {
                                    uVar3 = null;
                                } else {
                                    uVar3 = uVar;
                                }
                            } else {
                                if (i49 != 0) {
                                    bVar2 = androidx.compose.ui.b.INSTANCE;
                                }
                                if (i7 != 0) {
                                    textStyleA = TextStyle.INSTANCE.a();
                                } else {
                                    textStyleA = textStyle2;
                                }
                                if (i9 != 0) {
                                    nceVarC = nce.INSTANCE.c();
                                }
                                if (i11 != 0) {
                                    objR = dVarF.R();
                                    if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                        objR = new Function1() { // from class: com.google.android.m82
                                            public final Object invoke(Object obj) {
                                                return CoreTextFieldKt.x((TextLayoutResult) obj);
                                            }
                                        };
                                        dVarF.L(objR);
                                    }
                                    function3 = (Function1) objR;
                                }
                                if (i13 != 0) {
                                    r48Var2 = null;
                                }
                                if (i15 != 0) {
                                    solidColor = new SolidColor(ei1.INSTANCE.i(), null);
                                }
                                if (i17 != 0) {
                                    z8 = true;
                                } else {
                                    z8 = z;
                                }
                                if (i19 != 0) {
                                    i40 = Integer.MAX_VALUE;
                                } else {
                                    i40 = i;
                                }
                                if (i21 != 0) {
                                    i41 = 1;
                                } else {
                                    i41 = i2;
                                }
                                if ((i5 & 2048) != 0) {
                                    imeOptionsA = ImeOptions.INSTANCE.a();
                                    i33 &= -113;
                                } else {
                                    imeOptionsA = imeOptions;
                                }
                                if (i25 != 0) {
                                    mVarA = m.INSTANCE.a();
                                } else {
                                    mVarA = mVar;
                                }
                                if (i28 != 0) {
                                    z9 = true;
                                } else {
                                    z9 = z2;
                                }
                                if (i31 != 0) {
                                    z10 = false;
                                } else {
                                    z10 = z3;
                                }
                                if (i34 != 0) {
                                    ps4VarB = zo1.a.b();
                                } else {
                                    ps4VarB = ps4Var;
                                }
                                boolean z3215 = z8;
                                textStyle2 = textStyleA;
                                bVar4 = bVar2;
                                z11 = z9;
                                function5 = function3;
                                z12 = z3215;
                                nce nceVar1111 = nceVarC;
                                imeOptions3 = imeOptionsA;
                                qu0Var2 = solidColor;
                                nceVar3 = nceVar1111;
                                i42 = i33;
                                if (i36 != 0) {
                                    uVar3 = null;
                                } else {
                                    uVar3 = uVar;
                                }
                            }
                            dVarF.M();
                            qu0Var3 = qu0Var2;
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.o(31062401, i6, i42, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                            }
                            objR2 = dVarF.R();
                            companion = androidx.compose.p004runtime.d.INSTANCE;
                            if (objR2 == companion.a()) {
                                objR2 = new androidx.compose.ui.focus.f();
                                dVarF.L(objR2);
                            }
                            fVar = (androidx.compose.ui.focus.f) objR2;
                            objR3 = dVarF.R();
                            i43 = i6;
                            if (objR3 == companion.a()) {
                                objR3 = LegacyPlatformTextInputServiceAdapter_androidKt.b();
                                dVarF.L(objR3);
                            }
                            bVar5 = (androidx.compose.p001foundation.text.input.internal.b) objR3;
                            objR4 = dVarF.R();
                            if (objR4 == companion.a()) {
                                objR4 = new dxc(bVar5);
                                dVarF.L(objR4);
                            }
                            dxcVar = (dxc) objR4;
                            f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                            bVar6 = (l.b) dVarF.v(CompositionLocalsKt.i());
                            selectionBackgroundColor = ((SelectionColors) dVarF.v(jzc.c())).getSelectionBackgroundColor();
                            ok4Var = (ok4) dVarF.v(CompositionLocalsKt.h());
                            a0Var = (a0) dVarF.v(CompositionLocalsKt.v());
                            textStyle4 = textStyle2;
                            hybVar = (hyb) dVarF.v(CompositionLocalsKt.r());
                            z13 = z12;
                            if (i40 == 1) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Vertical;
                            }
                            if (uVar3 == null) {
                                dVarF.y(-213744626);
                                Object[] objArr10 = {orientation};
                                k0b<u, Object> k0bVarA10 = u.INSTANCE.a();
                                zC = dVarF.C(orientation.ordinal());
                                objR18 = dVarF.R();
                                if (zC) {
                                    objR18 = new Function0() { // from class: com.google.android.d92
                                        public final Object invoke() {
                                            return CoreTextFieldKt.O(orientation);
                                        }
                                    };
                                    dVarF.L(objR18);
                                } else {
                                    objR18 = new Function0() { // from class: com.google.android.d92
                                        public final Object invoke() {
                                            return CoreTextFieldKt.O(orientation);
                                        }
                                    };
                                    dVarF.L(objR18);
                                }
                                uVar4 = (u) dfa.k(objArr10, k0bVarA10, (Function0) objR18, dVarF, 0);
                                dVarF.u();
                            } else {
                                dVarF.y(-213745742);
                                dVarF.u();
                                uVar4 = uVar3;
                            }
                            if (uVar4.j() != orientation) {
                                StringBuilder sb10 = new StringBuilder();
                                sb10.append("Mismatching scroller orientation; ");
                                if (orientation == Orientation.Vertical) {
                                    str = "only single-line, non-wrap text fields can scroll horizontally";
                                } else {
                                    str = "single-line, non-wrap text fields can only scroll horizontally";
                                }
                                sb10.append(str);
                                throw new IllegalArgumentException(sb10.toString());
                            }
                            i44 = i43 & 14;
                            if (i44 == 4) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if ((i43 & 57344) == 16384) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z14 | z15;
                            objR5 = dVarF.R();
                            if (z16) {
                                transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                                composition = textFieldValue.getComposition();
                                if (composition != null) {
                                    uVar5 = uVar4;
                                    transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                    if (transformedTextC2 != null) {
                                        objR5 = transformedTextC2;
                                    }
                                    dVarF.L(objR5);
                                } else {
                                    uVar5 = uVar4;
                                }
                                objR5 = transformedTextC;
                                dVarF.L(objR5);
                            } else {
                                transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                                composition = textFieldValue.getComposition();
                                if (composition != null) {
                                    uVar5 = uVar4;
                                    transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                    if (transformedTextC2 != null) {
                                        objR5 = transformedTextC2;
                                    }
                                    dVarF.L(objR5);
                                } else {
                                    uVar5 = uVar4;
                                }
                                objR5 = transformedTextC;
                                dVarF.L(objR5);
                            }
                            TransformedText transformedText10 = (TransformedText) objR5;
                            text = transformedText10.getText();
                            offsetMapping = transformedText10.getOffsetMapping();
                            qaaVarC = pp1.c(dVarF, 0);
                            zX = dVarF.x(hybVar);
                            objR6 = dVarF.R();
                            if (zX) {
                                objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                                dVarF.L(objR6);
                            } else {
                                objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                                dVarF.L(objR6);
                            }
                            k07Var = (k07) objR6;
                            m mVar12 = mVarA;
                            k07Var.X(textFieldValue.getText(), text, textStyle4, z13, r54, bVar6, function1, mVar12, ok4Var, selectionBackgroundColor);
                            k07Var.getProcessor().e(textFieldValue, k07Var.getInputSession());
                            objR7 = dVarF.R();
                            if (objR7 == companion.a()) {
                                objR7 = new rsd(0, 1, null);
                                dVarF.L(objR7);
                            }
                            rsdVar = (rsd) objR7;
                            rsd.f(rsdVar, textFieldValue, 0L, 2, null);
                            objR8 = dVarF.R();
                            if (objR8 == companion.a()) {
                                objR8 = vn3.k(EmptyCoroutineContext.a, dVarF);
                                dVarF.L(objR8);
                            }
                            ta2Var = (ta2) objR8;
                            objR9 = dVarF.R();
                            if (objR9 == companion.a()) {
                                objR9 = androidx.compose.p001foundation.relocation.c.a();
                                dVarF.L(objR9);
                            }
                            cu0Var = (cu0) objR9;
                            objR10 = dVarF.R();
                            r48 r48Var12 = r48Var2;
                            if (objR10 == companion.a()) {
                                objR10 = new TextFieldSelectionManager(rsdVar);
                                dVarF.L(objR10);
                            }
                            textFieldSelectionManager = (TextFieldSelectionManager) objR10;
                            textFieldSelectionManager.L0(offsetMapping);
                            textFieldSelectionManager.U0(nceVar3);
                            textFieldSelectionManager.M0(k07Var.r());
                            textFieldSelectionManager.Q0(k07Var);
                            textFieldSelectionManager.T0(textFieldValue);
                            textFieldSelectionManager.z0((jf1) dVarF.v(CompositionLocalsKt.d()));
                            textFieldSelectionManager.A0(ta2Var);
                            textFieldSelectionManager.R0((yzc) dVarF.v(CompositionLocalsKt.s()));
                            textFieldSelectionManager.I0((c65) dVarF.v(CompositionLocalsKt.k()));
                            textFieldSelectionManager.G0(fVar);
                            textFieldSelectionManager.E0(!z10);
                            textFieldSelectionManager.F0(z11);
                            if (up1.isSmartSelectionEnabled) {
                                dVarF.y(1966756105);
                                textFieldSelectionManager.N0(androidx.compose.p001foundation.text.selection.c.h(SelectedTextType.EditableText, textStyle4.u(), dVarF, 6));
                                dVarF.u();
                            } else {
                                dVarF.y(1966902177);
                                dVarF.u();
                            }
                            k07Var.h();
                            new Function1() { // from class: com.google.android.e92
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.y(textFieldSelectionManager, (b) obj);
                                }
                            };
                            new Function0() { // from class: com.google.android.f92
                                public final Object invoke() {
                                    return CoreTextFieldKt.z(textFieldSelectionManager);
                                }
                            };
                            new Function0() { // from class: com.google.android.g92
                                public final Object invoke() {
                                    return CoreTextFieldKt.A(textFieldSelectionManager);
                                }
                            };
                            companion2 = androidx.compose.ui.b.INSTANCE;
                            boolean zT11115 = dVarF.T(k07Var);
                            i45 = i42 & 7168;
                            i46 = i42;
                            if (i45 == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            boolean z311111112 = z17 | zT11115;
                            if ((i46 & 57344) == 16384) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            boolean zT11116 = z311111112 | z18 | dVarF.T(dxcVar);
                            if (i44 == 4) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            boolean z311111113 = zT11116 | z19;
                            i47 = (i46 & 112) ^ 48;
                            if (i47 > 32) {
                                dxcVar2 = dxcVar;
                                if ((i46 & 48) != 32) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                            } else {
                                dxcVar2 = dxcVar;
                                if ((i46 & 48) != 32) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                            }
                            zT = z311111113 | z20 | dVarF.T(offsetMapping) | dVarF.T(ta2Var) | dVarF.T(cu0Var) | dVarF.T(textFieldSelectionManager);
                            objR11 = dVarF.R();
                            if (zT) {
                                zn8Var = offsetMapping;
                                final ImeOptions imeOptions11118 = imeOptions3;
                                final boolean z311111114 = z11;
                                final boolean z311111115 = z10;
                                objR11 = new Function1() { // from class: com.google.android.h92
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.B(k07Var, z311111114, z311111115, dxcVar2, textFieldValue, imeOptions11118, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                                    }
                                };
                                k07Var2 = k07Var;
                                z21 = z311111114;
                                textFieldValue2 = textFieldValue;
                                imeOptions4 = imeOptions11118;
                                textFieldSelectionManager2 = textFieldSelectionManager;
                                ta2Var2 = ta2Var;
                                cu0Var2 = cu0Var;
                                dVarF.L(objR11);
                            } else {
                                zn8Var = offsetMapping;
                                final ImeOptions imeOptions11119 = imeOptions3;
                                final boolean z311111116 = z11;
                                final boolean z311111117 = z10;
                                objR11 = new Function1() { // from class: com.google.android.h92
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.B(k07Var, z311111116, z311111117, dxcVar2, textFieldValue, imeOptions11119, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                                    }
                                };
                                k07Var2 = k07Var;
                                z21 = z311111116;
                                textFieldValue2 = textFieldValue;
                                imeOptions4 = imeOptions11119;
                                textFieldSelectionManager2 = textFieldSelectionManager;
                                ta2Var2 = ta2Var;
                                cu0Var2 = cu0Var;
                                dVarF.L(objR11);
                            }
                            final cu0 cu0Var13 = cu0Var2;
                            androidx.compose.ui.b bVarA111113 = atc.a(companion2, z21, fVar, r48Var12, (Function1) objR11);
                            if (z21) {
                                z22 = false;
                            } else {
                                z22 = false;
                            }
                            q6cVarR = p0.r(Boolean.valueOf(z22), dVarF, 0);
                            Unit unit11 = Unit.a;
                            boolean zX113 = dVarF.x(q6cVarR) | dVarF.T(k07Var2) | dVarF.T(dxcVar2) | dVarF.T(textFieldSelectionManager2);
                            if (i47 > 32) {
                                imeOptions5 = imeOptions4;
                                if ((i46 & 48) != 32) {
                                    z23 = true;
                                } else {
                                    z23 = false;
                                }
                            } else {
                                imeOptions5 = imeOptions4;
                                if ((i46 & 48) != 32) {
                                    z23 = true;
                                } else {
                                    z23 = false;
                                }
                            }
                            z24 = zX113 | z23;
                            objR12 = dVarF.R();
                            if (z24) {
                                ImeOptions imeOptions111110 = imeOptions5;
                                dxc dxcVar114 = dxcVar2;
                                TextFieldSelectionManager textFieldSelectionManager118 = textFieldSelectionManager2;
                                k07 k07Var117 = k07Var2;
                                objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var117, q6cVarR, dxcVar114, textFieldSelectionManager118, imeOptions111110, null);
                                k07Var3 = k07Var117;
                                textFieldSelectionManager3 = textFieldSelectionManager118;
                                imeOptions6 = imeOptions111110;
                                dVarF.L(objR12);
                            } else {
                                ImeOptions imeOptions111111 = imeOptions5;
                                dxc dxcVar115 = dxcVar2;
                                TextFieldSelectionManager textFieldSelectionManager119 = textFieldSelectionManager2;
                                k07 k07Var118 = k07Var2;
                                objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var118, q6cVarR, dxcVar115, textFieldSelectionManager119, imeOptions111111, null);
                                k07Var3 = k07Var118;
                                textFieldSelectionManager3 = textFieldSelectionManager119;
                                imeOptions6 = imeOptions111111;
                                dVarF.L(objR12);
                            }
                            imeOptions7 = imeOptions6;
                            vn3.g(unit11, (Function2) objR12, dVarF, 6);
                            int i5112 = i46 >> 3;
                            z25 = z21;
                            k07Var4 = k07Var3;
                            textFieldSelectionManager4 = textFieldSelectionManager3;
                            androidx.compose.ui.b bVarA111114 = huc.a(companion2, textFieldSelectionManager4, z25, r48Var12, k07Var4, fVar, z10, zn8Var, dVarF, (i5112 & 896) | 196614 | ((i43 >> 9) & 7168) | ((i46 << 6) & 3670016));
                            zn8Var2 = zn8Var;
                            final androidx.compose.ui.b bVarB1114 = y92.b(companion2, k07Var4, textFieldValue2, zn8Var2);
                            boolean zT11117 = dVarF.T(k07Var4);
                            if (i45 == 2048) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            boolean zX114 = zT11117 | z26 | dVarF.x(a0Var) | dVarF.T(textFieldSelectionManager4);
                            if (i44 == 4) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            zT2 = zX114 | z27 | dVarF.T(zn8Var2);
                            objR13 = dVarF.R();
                            if (zT2) {
                                objR13 = new Function1() { // from class: com.google.android.n82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                                    }
                                };
                                a0Var2 = a0Var;
                                textFieldSelectionManager5 = textFieldSelectionManager4;
                                dVarF.L(objR13);
                            } else {
                                objR13 = new Function1() { // from class: com.google.android.n82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                                    }
                                };
                                a0Var2 = a0Var;
                                textFieldSelectionManager5 = textFieldSelectionManager4;
                                dVarF.L(objR13);
                            }
                            final androidx.compose.ui.b bVarA111115 = xq8.a(companion2, (Function1) objR13);
                            textFieldSelectionManager6 = textFieldSelectionManager5;
                            CoreTextFieldSemanticsModifier j92Var12 = new CoreTextFieldSemanticsModifier(transformedText10, textFieldValue, k07Var4, z10, z25, nceVar3 instanceof a39, zn8Var2, textFieldSelectionManager6, imeOptions7, fVar);
                            a0 a0Var14 = a0Var2;
                            if (z25 != 0) {
                                z28 = false;
                            } else {
                                z28 = false;
                            }
                            final androidx.compose.ui.b bVarA111116 = y92.a(companion2, k07Var4, textFieldValue, zn8Var2, qu0Var3, z28);
                            final nce nceVar1112 = nceVar3;
                            zT3 = dVarF.T(textFieldSelectionManager6);
                            objR14 = dVarF.R();
                            if (zT3) {
                                objR14 = new Function1() { // from class: com.google.android.o82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                                    }
                                };
                                dVarF.L(objR14);
                            } else {
                                objR14 = new Function1() { // from class: com.google.android.o82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                                    }
                                };
                                dVarF.L(objR14);
                            }
                            vn3.c(textFieldSelectionManager6, (Function1) objR14, dVarF, 0);
                            boolean zT11118 = dVarF.T(k07Var4) | dVarF.T(dxcVar2);
                            if (i44 == 4) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            z30 = z29 | zT11118 | ((i47 <= 32 && dVarF.x(imeOptions7)) || (i46 & 48) == 32);
                            objR15 = dVarF.R();
                            if (z30) {
                                objR15 = new Function1() { // from class: com.google.android.p82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                                    }
                                };
                                dVarF.L(objR15);
                            } else {
                                objR15 = new Function1() { // from class: com.google.android.p82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                                    }
                                };
                                dVarF.L(objR15);
                            }
                            vn3.c(imeOptions7, (Function1) objR15, dVarF, i5112 & 14);
                            Function1<TextFieldValue, Unit> function1R12 = k07Var4.r();
                            boolean z311111118 = !z10;
                            i48 = i40;
                            if (i48 == 1) {
                                z31 = true;
                            } else {
                                z31 = false;
                            }
                            androidx.compose.ui.b bVarB1115 = TextFieldKeyInputKt.b(companion2, k07Var4, textFieldSelectionManager6, textFieldValue, function1R12, z311111118, z31, zn8Var2, rsdVar, imeOptions7.getImeAction());
                            keyboardType = imeOptions7.getKeyboardType();
                            companion3 = androidx.compose.ui.text.input.d.INSTANCE;
                            if (androidx.compose.ui.text.input.d.n(keyboardType, companion3.f())) {
                                z32 = false;
                            } else {
                                z32 = false;
                            }
                            boolean zC13 = C(q6cVarR);
                            zA = dVarF.A(z32) | dVarF.T(bVar5);
                            objR16 = dVarF.R();
                            if (zA) {
                                objR16 = new Function0() { // from class: com.google.android.q82
                                    public final Object invoke() {
                                        return CoreTextFieldKt.G(z32, bVar5);
                                    }
                                };
                                dVarF.L(objR16);
                            } else {
                                objR16 = new Function0() { // from class: com.google.android.q82
                                    public final Object invoke() {
                                        return CoreTextFieldKt.G(z32, bVar5);
                                    }
                                };
                                dVarF.L(objR16);
                            }
                            androidx.compose.ui.b bVarB1116 = hcc.b(companion2, zC13, z32, (Function0) objR16);
                            ta2 ta2Var14 = ta2Var2;
                            qu0VarE = ma0.e((qu0) dVarF.v(ma0.c()), ((ei1) dVarF.v(ma0.d())).getValue(), na0.a());
                            zT4 = dVarF.T(k07Var4) | dVarF.x(qu0VarE);
                            objR17 = dVarF.R();
                            if (zT4) {
                                objR17 = new Function1() { // from class: com.google.android.x82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                                    }
                                };
                                dVarF.L(objR17);
                            } else {
                                objR17 = new Function1() { // from class: com.google.android.x82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                                    }
                                };
                                dVarF.L(objR17);
                            }
                            androidx.compose.ui.b bVarD12 = androidx.compose.ui.draw.c.d(companion2, (Function1) objR17);
                            zv8 zv8VarA12 = tuc.a(dVarF, 0);
                            androidx.compose.ui.b bVar119 = bVar4;
                            androidx.compose.ui.b bVarThen12 = g0(zsc.b(yz6.a(bVar119.then(bVarD12), bVar5, k07Var4, textFieldSelectionManager6).then(bVarB1116).then(bVarA111113), k07Var4, ok4Var), k07Var4, textFieldSelectionManager6).then(bVarB1115);
                            final u uVar17 = uVar5;
                            androidx.compose.ui.b bVarA111117 = a0(xq8.a(TextFieldScrollKt.f(bVarThen12, uVar17, r48Var12, z25, zv8VarA12).then(bVarA111114).then(j92Var12), new Function1() { // from class: com.google.android.a92
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.I(k07Var4, (kn6) obj);
                                }
                            }), textFieldSelectionManager6, ta2Var14);
                            if (!z25) {
                                z33 = false;
                            } else {
                                z33 = false;
                            }
                            if (z33) {
                                bVarZ = TextFieldSelectionManager_androidKt.z(companion2, textFieldSelectionManager6);
                            } else {
                                bVarZ = companion2;
                            }
                            final ps4 ps4Var14 = ps4VarB;
                            final androidx.compose.ui.b bVar1110 = bVarZ;
                            final boolean z4112 = z10;
                            final boolean z4113 = z33;
                            final int i5113 = i41;
                            P(bVarA111117, textFieldSelectionManager6, ko1.e(-814563849, true, new Function2() { // from class: com.google.android.b92
                                public final Object invoke(Object obj, Object obj2) {
                                    return CoreTextFieldKt.J(ps4Var14, k07Var4, textStyle4, i5113, i48, uVar17, textFieldValue, nceVar1112, bVarA111116, bVarB1114, bVarA111115, bVar1110, cu0Var13, textFieldSelectionManager6, z4113, z4112, function5, zn8Var2, f43Var, (d) obj, ((Integer) obj2).intValue());
                                }
                            }, dVarF, 54), dVarF, 384);
                            if (androidx.compose.p004runtime.e.k()) {
                                androidx.compose.p004runtime.e.n();
                            }
                            ps4Var2 = ps4Var14;
                            dVar2 = dVarF;
                            function4 = function5;
                            z7 = z4112;
                            uVar2 = uVar3;
                            z6 = z25;
                            r48Var2 = r48Var12;
                            z5 = z13;
                            mVar2 = mVar12;
                            i39 = i41;
                            solidColor = qu0Var3;
                            bVar3 = bVar119;
                            i38 = i48;
                            nceVar2 = nceVar1112;
                            textStyle3 = textStyle4;
                            imeOptions2 = imeOptions7;
                        } else {
                            dVarF.q();
                            z5 = z;
                            imeOptions2 = imeOptions;
                            mVar2 = mVar;
                            ps4Var2 = ps4Var;
                            uVar2 = uVar;
                            dVar2 = dVarF;
                            textStyle3 = textStyle2;
                            function4 = function3;
                            nceVar2 = nceVarC;
                            bVar3 = bVar2;
                            i38 = i;
                            i39 = i2;
                            z6 = z2;
                            z7 = z3;
                        }
                        s6bVarH = dVar2.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2() { // from class: com.google.android.c92
                                public final Object invoke(Object obj, Object obj2) {
                                    return CoreTextFieldKt.N(textFieldValue, function1, bVar3, textStyle3, nceVar2, function4, r48Var2, solidColor, z5, i38, i39, imeOptions2, mVar2, z6, z7, ps4Var2, uVar2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i6 |= 805306368;
                    i21 = i5 & 1024;
                    if (i21 != 0) {
                        i22 = i4 | 6;
                    } else if ((i4 & 6) == 0) {
                        if (dVarF.C(i2)) {
                            i23 = 4;
                        } else {
                            i23 = 2;
                        }
                        i22 = i4 | i23;
                    } else {
                        i22 = i4;
                    }
                    if ((i4 & 48) != 0) {
                        i22 |= ((i5 & 2048) == 0 || !dVarF.x(imeOptions)) ? 16 : 32;
                    }
                    i24 = i22;
                    i25 = i5 & 4096;
                    if (i25 != 0) {
                        i26 = i24 | 384;
                    } else if ((i4 & 384) == 0) {
                        if (dVarF.x(mVar)) {
                            i27 = 256;
                        } else {
                            i27 = 128;
                        }
                        i26 = i24 | i27;
                    } else {
                        i26 = i24;
                    }
                    i28 = i5 & 8192;
                    if (i28 != 0) {
                        i30 = i26 | 3072;
                    } else {
                        i29 = i26;
                        if ((i4 & 3072) == 0) {
                            i30 = i29 | (dVarF.A(z2) ? 2048 : 1024);
                        } else {
                            i30 = i29;
                        }
                    }
                    i31 = i5 & 16384;
                    if (i31 != 0) {
                        i33 = i30 | 24576;
                    } else {
                        i32 = i30;
                        if ((i4 & 24576) == 0) {
                            i33 = i32 | (dVarF.A(z3) ? 16384 : 8192);
                        } else {
                            i33 = i32;
                        }
                    }
                    i34 = i5 & 32768;
                    if (i34 != 0) {
                        i33 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i35 = 131072;
                        } else {
                            i35 = 65536;
                        }
                        i33 |= i35;
                    }
                    i36 = i5 & 65536;
                    if (i36 != 0) {
                        i33 |= 1572864;
                    } else if ((i4 & 1572864) == 0) {
                        if (dVarF.x(uVar)) {
                            i37 = 1048576;
                        } else {
                            i37 = 524288;
                        }
                        i33 |= i37;
                    }
                    if ((i6 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (dVarF.g(z4, i6 & 1)) {
                        dVarF.U();
                        if ((i3 & 1) != 0) {
                            if (i49 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i7 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i9 != 0) {
                                nceVarC = nce.INSTANCE.c();
                            }
                            if (i11 != 0) {
                                objR = dVarF.R();
                                if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                    objR = new Function1() { // from class: com.google.android.m82
                                        public final Object invoke(Object obj) {
                                            return CoreTextFieldKt.x((TextLayoutResult) obj);
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function3 = (Function1) objR;
                            }
                            if (i13 != 0) {
                                r48Var2 = null;
                            }
                            if (i15 != 0) {
                                solidColor = new SolidColor(ei1.INSTANCE.i(), null);
                            }
                            if (i17 != 0) {
                                z8 = true;
                            } else {
                                z8 = z;
                            }
                            if (i19 != 0) {
                                i40 = Integer.MAX_VALUE;
                            } else {
                                i40 = i;
                            }
                            if (i21 != 0) {
                                i41 = 1;
                            } else {
                                i41 = i2;
                            }
                            if ((i5 & 2048) != 0) {
                                imeOptionsA = ImeOptions.INSTANCE.a();
                                i33 &= -113;
                            } else {
                                imeOptionsA = imeOptions;
                            }
                            if (i25 != 0) {
                                mVarA = m.INSTANCE.a();
                            } else {
                                mVarA = mVar;
                            }
                            if (i28 != 0) {
                                z9 = true;
                            } else {
                                z9 = z2;
                            }
                            if (i31 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if (i34 != 0) {
                                ps4VarB = zo1.a.b();
                            } else {
                                ps4VarB = ps4Var;
                            }
                            boolean z3216 = z8;
                            textStyle2 = textStyleA;
                            bVar4 = bVar2;
                            z11 = z9;
                            function5 = function3;
                            z12 = z3216;
                            nce nceVar1113 = nceVarC;
                            imeOptions3 = imeOptionsA;
                            qu0Var2 = solidColor;
                            nceVar3 = nceVar1113;
                            i42 = i33;
                            if (i36 != 0) {
                                uVar3 = null;
                            } else {
                                uVar3 = uVar;
                            }
                        } else {
                            if (i49 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i7 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i9 != 0) {
                                nceVarC = nce.INSTANCE.c();
                            }
                            if (i11 != 0) {
                                objR = dVarF.R();
                                if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                    objR = new Function1() { // from class: com.google.android.m82
                                        public final Object invoke(Object obj) {
                                            return CoreTextFieldKt.x((TextLayoutResult) obj);
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function3 = (Function1) objR;
                            }
                            if (i13 != 0) {
                                r48Var2 = null;
                            }
                            if (i15 != 0) {
                                solidColor = new SolidColor(ei1.INSTANCE.i(), null);
                            }
                            if (i17 != 0) {
                                z8 = true;
                            } else {
                                z8 = z;
                            }
                            if (i19 != 0) {
                                i40 = Integer.MAX_VALUE;
                            } else {
                                i40 = i;
                            }
                            if (i21 != 0) {
                                i41 = 1;
                            } else {
                                i41 = i2;
                            }
                            if ((i5 & 2048) != 0) {
                                imeOptionsA = ImeOptions.INSTANCE.a();
                                i33 &= -113;
                            } else {
                                imeOptionsA = imeOptions;
                            }
                            if (i25 != 0) {
                                mVarA = m.INSTANCE.a();
                            } else {
                                mVarA = mVar;
                            }
                            if (i28 != 0) {
                                z9 = true;
                            } else {
                                z9 = z2;
                            }
                            if (i31 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if (i34 != 0) {
                                ps4VarB = zo1.a.b();
                            } else {
                                ps4VarB = ps4Var;
                            }
                            boolean z3217 = z8;
                            textStyle2 = textStyleA;
                            bVar4 = bVar2;
                            z11 = z9;
                            function5 = function3;
                            z12 = z3217;
                            nce nceVar1114 = nceVarC;
                            imeOptions3 = imeOptionsA;
                            qu0Var2 = solidColor;
                            nceVar3 = nceVar1114;
                            i42 = i33;
                            if (i36 != 0) {
                                uVar3 = null;
                            } else {
                                uVar3 = uVar;
                            }
                        }
                        dVarF.M();
                        qu0Var3 = qu0Var2;
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(31062401, i6, i42, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                        }
                        objR2 = dVarF.R();
                        companion = androidx.compose.p004runtime.d.INSTANCE;
                        if (objR2 == companion.a()) {
                            objR2 = new androidx.compose.ui.focus.f();
                            dVarF.L(objR2);
                        }
                        fVar = (androidx.compose.ui.focus.f) objR2;
                        objR3 = dVarF.R();
                        i43 = i6;
                        if (objR3 == companion.a()) {
                            objR3 = LegacyPlatformTextInputServiceAdapter_androidKt.b();
                            dVarF.L(objR3);
                        }
                        bVar5 = (androidx.compose.p001foundation.text.input.internal.b) objR3;
                        objR4 = dVarF.R();
                        if (objR4 == companion.a()) {
                            objR4 = new dxc(bVar5);
                            dVarF.L(objR4);
                        }
                        dxcVar = (dxc) objR4;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        bVar6 = (l.b) dVarF.v(CompositionLocalsKt.i());
                        selectionBackgroundColor = ((SelectionColors) dVarF.v(jzc.c())).getSelectionBackgroundColor();
                        ok4Var = (ok4) dVarF.v(CompositionLocalsKt.h());
                        a0Var = (a0) dVarF.v(CompositionLocalsKt.v());
                        textStyle4 = textStyle2;
                        hybVar = (hyb) dVarF.v(CompositionLocalsKt.r());
                        z13 = z12;
                        if (i40 == 1) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Vertical;
                        }
                        if (uVar3 == null) {
                            dVarF.y(-213744626);
                            Object[] objArr11 = {orientation};
                            k0b<u, Object> k0bVarA11 = u.INSTANCE.a();
                            zC = dVarF.C(orientation.ordinal());
                            objR18 = dVarF.R();
                            if (zC) {
                                objR18 = new Function0() { // from class: com.google.android.d92
                                    public final Object invoke() {
                                        return CoreTextFieldKt.O(orientation);
                                    }
                                };
                                dVarF.L(objR18);
                            } else {
                                objR18 = new Function0() { // from class: com.google.android.d92
                                    public final Object invoke() {
                                        return CoreTextFieldKt.O(orientation);
                                    }
                                };
                                dVarF.L(objR18);
                            }
                            uVar4 = (u) dfa.k(objArr11, k0bVarA11, (Function0) objR18, dVarF, 0);
                            dVarF.u();
                        } else {
                            dVarF.y(-213745742);
                            dVarF.u();
                            uVar4 = uVar3;
                        }
                        if (uVar4.j() != orientation) {
                            StringBuilder sb11 = new StringBuilder();
                            sb11.append("Mismatching scroller orientation; ");
                            if (orientation == Orientation.Vertical) {
                                str = "only single-line, non-wrap text fields can scroll horizontally";
                            } else {
                                str = "single-line, non-wrap text fields can only scroll horizontally";
                            }
                            sb11.append(str);
                            throw new IllegalArgumentException(sb11.toString());
                        }
                        i44 = i43 & 14;
                        if (i44 == 4) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i43 & 57344) == 16384) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objR5 = dVarF.R();
                        if (z16) {
                            transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                            composition = textFieldValue.getComposition();
                            if (composition != null) {
                                uVar5 = uVar4;
                                transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                if (transformedTextC2 != null) {
                                    objR5 = transformedTextC2;
                                }
                                dVarF.L(objR5);
                            } else {
                                uVar5 = uVar4;
                            }
                            objR5 = transformedTextC;
                            dVarF.L(objR5);
                        } else {
                            transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                            composition = textFieldValue.getComposition();
                            if (composition != null) {
                                uVar5 = uVar4;
                                transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                if (transformedTextC2 != null) {
                                    objR5 = transformedTextC2;
                                }
                                dVarF.L(objR5);
                            } else {
                                uVar5 = uVar4;
                            }
                            objR5 = transformedTextC;
                            dVarF.L(objR5);
                        }
                        TransformedText transformedText11 = (TransformedText) objR5;
                        text = transformedText11.getText();
                        offsetMapping = transformedText11.getOffsetMapping();
                        qaaVarC = pp1.c(dVarF, 0);
                        zX = dVarF.x(hybVar);
                        objR6 = dVarF.R();
                        if (zX) {
                            objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                            dVarF.L(objR6);
                        } else {
                            objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                            dVarF.L(objR6);
                        }
                        k07Var = (k07) objR6;
                        m mVar13 = mVarA;
                        k07Var.X(textFieldValue.getText(), text, textStyle4, z13, r54, bVar6, function1, mVar13, ok4Var, selectionBackgroundColor);
                        k07Var.getProcessor().e(textFieldValue, k07Var.getInputSession());
                        objR7 = dVarF.R();
                        if (objR7 == companion.a()) {
                            objR7 = new rsd(0, 1, null);
                            dVarF.L(objR7);
                        }
                        rsdVar = (rsd) objR7;
                        rsd.f(rsdVar, textFieldValue, 0L, 2, null);
                        objR8 = dVarF.R();
                        if (objR8 == companion.a()) {
                            objR8 = vn3.k(EmptyCoroutineContext.a, dVarF);
                            dVarF.L(objR8);
                        }
                        ta2Var = (ta2) objR8;
                        objR9 = dVarF.R();
                        if (objR9 == companion.a()) {
                            objR9 = androidx.compose.p001foundation.relocation.c.a();
                            dVarF.L(objR9);
                        }
                        cu0Var = (cu0) objR9;
                        objR10 = dVarF.R();
                        r48 r48Var13 = r48Var2;
                        if (objR10 == companion.a()) {
                            objR10 = new TextFieldSelectionManager(rsdVar);
                            dVarF.L(objR10);
                        }
                        textFieldSelectionManager = (TextFieldSelectionManager) objR10;
                        textFieldSelectionManager.L0(offsetMapping);
                        textFieldSelectionManager.U0(nceVar3);
                        textFieldSelectionManager.M0(k07Var.r());
                        textFieldSelectionManager.Q0(k07Var);
                        textFieldSelectionManager.T0(textFieldValue);
                        textFieldSelectionManager.z0((jf1) dVarF.v(CompositionLocalsKt.d()));
                        textFieldSelectionManager.A0(ta2Var);
                        textFieldSelectionManager.R0((yzc) dVarF.v(CompositionLocalsKt.s()));
                        textFieldSelectionManager.I0((c65) dVarF.v(CompositionLocalsKt.k()));
                        textFieldSelectionManager.G0(fVar);
                        textFieldSelectionManager.E0(!z10);
                        textFieldSelectionManager.F0(z11);
                        if (up1.isSmartSelectionEnabled) {
                            dVarF.y(1966756105);
                            textFieldSelectionManager.N0(androidx.compose.p001foundation.text.selection.c.h(SelectedTextType.EditableText, textStyle4.u(), dVarF, 6));
                            dVarF.u();
                        } else {
                            dVarF.y(1966902177);
                            dVarF.u();
                        }
                        k07Var.h();
                        new Function1() { // from class: com.google.android.e92
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.y(textFieldSelectionManager, (b) obj);
                            }
                        };
                        new Function0() { // from class: com.google.android.f92
                            public final Object invoke() {
                                return CoreTextFieldKt.z(textFieldSelectionManager);
                            }
                        };
                        new Function0() { // from class: com.google.android.g92
                            public final Object invoke() {
                                return CoreTextFieldKt.A(textFieldSelectionManager);
                            }
                        };
                        companion2 = androidx.compose.ui.b.INSTANCE;
                        boolean zT11119 = dVarF.T(k07Var);
                        i45 = i42 & 7168;
                        i46 = i42;
                        if (i45 == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        boolean z311111119 = z17 | zT11119;
                        if ((i46 & 57344) == 16384) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        boolean zT111110 = z311111119 | z18 | dVarF.T(dxcVar);
                        if (i44 == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean z3111111110 = zT111110 | z19;
                        i47 = (i46 & 112) ^ 48;
                        if (i47 > 32) {
                            dxcVar2 = dxcVar;
                            if ((i46 & 48) != 32) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                        } else {
                            dxcVar2 = dxcVar;
                            if ((i46 & 48) != 32) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                        }
                        zT = z3111111110 | z20 | dVarF.T(offsetMapping) | dVarF.T(ta2Var) | dVarF.T(cu0Var) | dVarF.T(textFieldSelectionManager);
                        objR11 = dVarF.R();
                        if (zT) {
                            zn8Var = offsetMapping;
                            final ImeOptions imeOptions111112 = imeOptions3;
                            final boolean z3111111111 = z11;
                            final boolean z3111111112 = z10;
                            objR11 = new Function1() { // from class: com.google.android.h92
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.B(k07Var, z3111111111, z3111111112, dxcVar2, textFieldValue, imeOptions111112, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                                }
                            };
                            k07Var2 = k07Var;
                            z21 = z3111111111;
                            textFieldValue2 = textFieldValue;
                            imeOptions4 = imeOptions111112;
                            textFieldSelectionManager2 = textFieldSelectionManager;
                            ta2Var2 = ta2Var;
                            cu0Var2 = cu0Var;
                            dVarF.L(objR11);
                        } else {
                            zn8Var = offsetMapping;
                            final ImeOptions imeOptions111113 = imeOptions3;
                            final boolean z3111111113 = z11;
                            final boolean z3111111114 = z10;
                            objR11 = new Function1() { // from class: com.google.android.h92
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.B(k07Var, z3111111113, z3111111114, dxcVar2, textFieldValue, imeOptions111113, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                                }
                            };
                            k07Var2 = k07Var;
                            z21 = z3111111113;
                            textFieldValue2 = textFieldValue;
                            imeOptions4 = imeOptions111113;
                            textFieldSelectionManager2 = textFieldSelectionManager;
                            ta2Var2 = ta2Var;
                            cu0Var2 = cu0Var;
                            dVarF.L(objR11);
                        }
                        final cu0 cu0Var14 = cu0Var2;
                        androidx.compose.ui.b bVarA111118 = atc.a(companion2, z21, fVar, r48Var13, (Function1) objR11);
                        if (z21) {
                            z22 = false;
                        } else {
                            z22 = false;
                        }
                        q6cVarR = p0.r(Boolean.valueOf(z22), dVarF, 0);
                        Unit unit12 = Unit.a;
                        boolean zX115 = dVarF.x(q6cVarR) | dVarF.T(k07Var2) | dVarF.T(dxcVar2) | dVarF.T(textFieldSelectionManager2);
                        if (i47 > 32) {
                            imeOptions5 = imeOptions4;
                            if ((i46 & 48) != 32) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                        } else {
                            imeOptions5 = imeOptions4;
                            if ((i46 & 48) != 32) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                        }
                        z24 = zX115 | z23;
                        objR12 = dVarF.R();
                        if (z24) {
                            ImeOptions imeOptions111114 = imeOptions5;
                            dxc dxcVar116 = dxcVar2;
                            TextFieldSelectionManager textFieldSelectionManager1110 = textFieldSelectionManager2;
                            k07 k07Var119 = k07Var2;
                            objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var119, q6cVarR, dxcVar116, textFieldSelectionManager1110, imeOptions111114, null);
                            k07Var3 = k07Var119;
                            textFieldSelectionManager3 = textFieldSelectionManager1110;
                            imeOptions6 = imeOptions111114;
                            dVarF.L(objR12);
                        } else {
                            ImeOptions imeOptions111115 = imeOptions5;
                            dxc dxcVar117 = dxcVar2;
                            TextFieldSelectionManager textFieldSelectionManager1111 = textFieldSelectionManager2;
                            k07 k07Var1110 = k07Var2;
                            objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var1110, q6cVarR, dxcVar117, textFieldSelectionManager1111, imeOptions111115, null);
                            k07Var3 = k07Var1110;
                            textFieldSelectionManager3 = textFieldSelectionManager1111;
                            imeOptions6 = imeOptions111115;
                            dVarF.L(objR12);
                        }
                        imeOptions7 = imeOptions6;
                        vn3.g(unit12, (Function2) objR12, dVarF, 6);
                        int i5114 = i46 >> 3;
                        z25 = z21;
                        k07Var4 = k07Var3;
                        textFieldSelectionManager4 = textFieldSelectionManager3;
                        androidx.compose.ui.b bVarA111119 = huc.a(companion2, textFieldSelectionManager4, z25, r48Var13, k07Var4, fVar, z10, zn8Var, dVarF, (i5114 & 896) | 196614 | ((i43 >> 9) & 7168) | ((i46 << 6) & 3670016));
                        zn8Var2 = zn8Var;
                        final androidx.compose.ui.b bVarB1117 = y92.b(companion2, k07Var4, textFieldValue2, zn8Var2);
                        boolean zT111111 = dVarF.T(k07Var4);
                        if (i45 == 2048) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        boolean zX116 = zT111111 | z26 | dVarF.x(a0Var) | dVarF.T(textFieldSelectionManager4);
                        if (i44 == 4) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        zT2 = zX116 | z27 | dVarF.T(zn8Var2);
                        objR13 = dVarF.R();
                        if (zT2) {
                            objR13 = new Function1() { // from class: com.google.android.n82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                                }
                            };
                            a0Var2 = a0Var;
                            textFieldSelectionManager5 = textFieldSelectionManager4;
                            dVarF.L(objR13);
                        } else {
                            objR13 = new Function1() { // from class: com.google.android.n82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                                }
                            };
                            a0Var2 = a0Var;
                            textFieldSelectionManager5 = textFieldSelectionManager4;
                            dVarF.L(objR13);
                        }
                        final androidx.compose.ui.b bVarA1111110 = xq8.a(companion2, (Function1) objR13);
                        textFieldSelectionManager6 = textFieldSelectionManager5;
                        CoreTextFieldSemanticsModifier j92Var13 = new CoreTextFieldSemanticsModifier(transformedText11, textFieldValue, k07Var4, z10, z25, nceVar3 instanceof a39, zn8Var2, textFieldSelectionManager6, imeOptions7, fVar);
                        a0 a0Var15 = a0Var2;
                        if (z25 != 0) {
                            z28 = false;
                        } else {
                            z28 = false;
                        }
                        final androidx.compose.ui.b bVarA1111111 = y92.a(companion2, k07Var4, textFieldValue, zn8Var2, qu0Var3, z28);
                        final nce nceVar1115 = nceVar3;
                        zT3 = dVarF.T(textFieldSelectionManager6);
                        objR14 = dVarF.R();
                        if (zT3) {
                            objR14 = new Function1() { // from class: com.google.android.o82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                                }
                            };
                            dVarF.L(objR14);
                        } else {
                            objR14 = new Function1() { // from class: com.google.android.o82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                                }
                            };
                            dVarF.L(objR14);
                        }
                        vn3.c(textFieldSelectionManager6, (Function1) objR14, dVarF, 0);
                        boolean zT111112 = dVarF.T(k07Var4) | dVarF.T(dxcVar2);
                        if (i44 == 4) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        z30 = z29 | zT111112 | ((i47 <= 32 && dVarF.x(imeOptions7)) || (i46 & 48) == 32);
                        objR15 = dVarF.R();
                        if (z30) {
                            objR15 = new Function1() { // from class: com.google.android.p82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                                }
                            };
                            dVarF.L(objR15);
                        } else {
                            objR15 = new Function1() { // from class: com.google.android.p82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                                }
                            };
                            dVarF.L(objR15);
                        }
                        vn3.c(imeOptions7, (Function1) objR15, dVarF, i5114 & 14);
                        Function1<TextFieldValue, Unit> function1R13 = k07Var4.r();
                        boolean z3111111115 = !z10;
                        i48 = i40;
                        if (i48 == 1) {
                            z31 = true;
                        } else {
                            z31 = false;
                        }
                        androidx.compose.ui.b bVarB1118 = TextFieldKeyInputKt.b(companion2, k07Var4, textFieldSelectionManager6, textFieldValue, function1R13, z3111111115, z31, zn8Var2, rsdVar, imeOptions7.getImeAction());
                        keyboardType = imeOptions7.getKeyboardType();
                        companion3 = androidx.compose.ui.text.input.d.INSTANCE;
                        if (androidx.compose.ui.text.input.d.n(keyboardType, companion3.f())) {
                            z32 = false;
                        } else {
                            z32 = false;
                        }
                        boolean zC14 = C(q6cVarR);
                        zA = dVarF.A(z32) | dVarF.T(bVar5);
                        objR16 = dVarF.R();
                        if (zA) {
                            objR16 = new Function0() { // from class: com.google.android.q82
                                public final Object invoke() {
                                    return CoreTextFieldKt.G(z32, bVar5);
                                }
                            };
                            dVarF.L(objR16);
                        } else {
                            objR16 = new Function0() { // from class: com.google.android.q82
                                public final Object invoke() {
                                    return CoreTextFieldKt.G(z32, bVar5);
                                }
                            };
                            dVarF.L(objR16);
                        }
                        androidx.compose.ui.b bVarB1119 = hcc.b(companion2, zC14, z32, (Function0) objR16);
                        ta2 ta2Var15 = ta2Var2;
                        qu0VarE = ma0.e((qu0) dVarF.v(ma0.c()), ((ei1) dVarF.v(ma0.d())).getValue(), na0.a());
                        zT4 = dVarF.T(k07Var4) | dVarF.x(qu0VarE);
                        objR17 = dVarF.R();
                        if (zT4) {
                            objR17 = new Function1() { // from class: com.google.android.x82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                                }
                            };
                            dVarF.L(objR17);
                        } else {
                            objR17 = new Function1() { // from class: com.google.android.x82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                                }
                            };
                            dVarF.L(objR17);
                        }
                        androidx.compose.ui.b bVarD13 = androidx.compose.ui.draw.c.d(companion2, (Function1) objR17);
                        zv8 zv8VarA13 = tuc.a(dVarF, 0);
                        androidx.compose.ui.b bVar1111 = bVar4;
                        androidx.compose.ui.b bVarThen13 = g0(zsc.b(yz6.a(bVar1111.then(bVarD13), bVar5, k07Var4, textFieldSelectionManager6).then(bVarB1119).then(bVarA111118), k07Var4, ok4Var), k07Var4, textFieldSelectionManager6).then(bVarB1118);
                        final u uVar18 = uVar5;
                        androidx.compose.ui.b bVarA1111112 = a0(xq8.a(TextFieldScrollKt.f(bVarThen13, uVar18, r48Var13, z25, zv8VarA13).then(bVarA111119).then(j92Var13), new Function1() { // from class: com.google.android.a92
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.I(k07Var4, (kn6) obj);
                            }
                        }), textFieldSelectionManager6, ta2Var15);
                        if (!z25) {
                            z33 = false;
                        } else {
                            z33 = false;
                        }
                        if (z33) {
                            bVarZ = TextFieldSelectionManager_androidKt.z(companion2, textFieldSelectionManager6);
                        } else {
                            bVarZ = companion2;
                        }
                        final ps4 ps4Var15 = ps4VarB;
                        final androidx.compose.ui.b bVar1112 = bVarZ;
                        final boolean z4114 = z10;
                        final boolean z4115 = z33;
                        final int i5115 = i41;
                        P(bVarA1111112, textFieldSelectionManager6, ko1.e(-814563849, true, new Function2() { // from class: com.google.android.b92
                            public final Object invoke(Object obj, Object obj2) {
                                return CoreTextFieldKt.J(ps4Var15, k07Var4, textStyle4, i5115, i48, uVar18, textFieldValue, nceVar1115, bVarA1111111, bVarB1117, bVarA1111110, bVar1112, cu0Var14, textFieldSelectionManager6, z4115, z4114, function5, zn8Var2, f43Var, (d) obj, ((Integer) obj2).intValue());
                            }
                        }, dVarF, 54), dVarF, 384);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        ps4Var2 = ps4Var15;
                        dVar2 = dVarF;
                        function4 = function5;
                        z7 = z4114;
                        uVar2 = uVar3;
                        z6 = z25;
                        r48Var2 = r48Var13;
                        z5 = z13;
                        mVar2 = mVar13;
                        i39 = i41;
                        solidColor = qu0Var3;
                        bVar3 = bVar1111;
                        i38 = i48;
                        nceVar2 = nceVar1115;
                        textStyle3 = textStyle4;
                        imeOptions2 = imeOptions7;
                    } else {
                        dVarF.q();
                        z5 = z;
                        imeOptions2 = imeOptions;
                        mVar2 = mVar;
                        ps4Var2 = ps4Var;
                        uVar2 = uVar;
                        dVar2 = dVarF;
                        textStyle3 = textStyle2;
                        function4 = function3;
                        nceVar2 = nceVarC;
                        bVar3 = bVar2;
                        i38 = i;
                        i39 = i2;
                        z6 = z2;
                        z7 = z3;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.c92
                            public final Object invoke(Object obj, Object obj2) {
                                return CoreTextFieldKt.N(textFieldValue, function1, bVar3, textStyle3, nceVar2, function4, r48Var2, solidColor, z5, i38, i39, imeOptions2, mVar2, z6, z7, ps4Var2, uVar2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i6 |= 24576;
                nceVarC = nceVar;
                i11 = i5 & 32;
                if (i11 != 0) {
                    i6 |= 196608;
                    function3 = function2;
                } else {
                    function3 = function2;
                    if ((i3 & 196608) == 0) {
                        if (dVarF.T(function3)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i6 |= i12;
                    }
                }
                i13 = i5 & 64;
                if (i13 != 0) {
                    i6 |= 1572864;
                    r48Var2 = r48Var;
                } else {
                    r48Var2 = r48Var;
                    if ((i3 & 1572864) == 0) {
                        if (dVarF.x(r48Var2)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i6 |= i14;
                    }
                }
                i15 = i5 & 128;
                if (i15 != 0) {
                    i6 |= 12582912;
                    solidColor = qu0Var;
                } else {
                    solidColor = qu0Var;
                    if ((i3 & 12582912) == 0) {
                        if (dVarF.x(solidColor)) {
                            i16 = 8388608;
                        } else {
                            i16 = 4194304;
                        }
                        i6 |= i16;
                    }
                }
                i17 = i5 & 256;
                if (i17 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 100663296) == 0) {
                    if (dVarF.A(z)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i6 |= i18;
                }
                i19 = i5 & 512;
                if (i19 != 0) {
                    if ((i3 & 805306368) == 0) {
                        if (dVarF.C(i)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i6 |= i20;
                    }
                    i21 = i5 & 1024;
                    if (i21 != 0) {
                        i22 = i4 | 6;
                    } else if ((i4 & 6) == 0) {
                        if (dVarF.C(i2)) {
                            i23 = 4;
                        } else {
                            i23 = 2;
                        }
                        i22 = i4 | i23;
                    } else {
                        i22 = i4;
                    }
                    if ((i4 & 48) != 0) {
                        i22 |= ((i5 & 2048) == 0 || !dVarF.x(imeOptions)) ? 16 : 32;
                    }
                    i24 = i22;
                    i25 = i5 & 4096;
                    if (i25 != 0) {
                        i26 = i24 | 384;
                    } else if ((i4 & 384) == 0) {
                        if (dVarF.x(mVar)) {
                            i27 = 256;
                        } else {
                            i27 = 128;
                        }
                        i26 = i24 | i27;
                    } else {
                        i26 = i24;
                    }
                    i28 = i5 & 8192;
                    if (i28 != 0) {
                        i30 = i26 | 3072;
                    } else {
                        i29 = i26;
                        if ((i4 & 3072) == 0) {
                            i30 = i29 | (dVarF.A(z2) ? 2048 : 1024);
                        } else {
                            i30 = i29;
                        }
                    }
                    i31 = i5 & 16384;
                    if (i31 != 0) {
                        i33 = i30 | 24576;
                    } else {
                        i32 = i30;
                        if ((i4 & 24576) == 0) {
                            i33 = i32 | (dVarF.A(z3) ? 16384 : 8192);
                        } else {
                            i33 = i32;
                        }
                    }
                    i34 = i5 & 32768;
                    if (i34 != 0) {
                        i33 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i35 = 131072;
                        } else {
                            i35 = 65536;
                        }
                        i33 |= i35;
                    }
                    i36 = i5 & 65536;
                    if (i36 != 0) {
                        i33 |= 1572864;
                    } else if ((i4 & 1572864) == 0) {
                        if (dVarF.x(uVar)) {
                            i37 = 1048576;
                        } else {
                            i37 = 524288;
                        }
                        i33 |= i37;
                    }
                    if ((i6 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (dVarF.g(z4, i6 & 1)) {
                        dVarF.U();
                        if ((i3 & 1) != 0) {
                            if (i49 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i7 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i9 != 0) {
                                nceVarC = nce.INSTANCE.c();
                            }
                            if (i11 != 0) {
                                objR = dVarF.R();
                                if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                    objR = new Function1() { // from class: com.google.android.m82
                                        public final Object invoke(Object obj) {
                                            return CoreTextFieldKt.x((TextLayoutResult) obj);
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function3 = (Function1) objR;
                            }
                            if (i13 != 0) {
                                r48Var2 = null;
                            }
                            if (i15 != 0) {
                                solidColor = new SolidColor(ei1.INSTANCE.i(), null);
                            }
                            if (i17 != 0) {
                                z8 = true;
                            } else {
                                z8 = z;
                            }
                            if (i19 != 0) {
                                i40 = Integer.MAX_VALUE;
                            } else {
                                i40 = i;
                            }
                            if (i21 != 0) {
                                i41 = 1;
                            } else {
                                i41 = i2;
                            }
                            if ((i5 & 2048) != 0) {
                                imeOptionsA = ImeOptions.INSTANCE.a();
                                i33 &= -113;
                            } else {
                                imeOptionsA = imeOptions;
                            }
                            if (i25 != 0) {
                                mVarA = m.INSTANCE.a();
                            } else {
                                mVarA = mVar;
                            }
                            if (i28 != 0) {
                                z9 = true;
                            } else {
                                z9 = z2;
                            }
                            if (i31 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if (i34 != 0) {
                                ps4VarB = zo1.a.b();
                            } else {
                                ps4VarB = ps4Var;
                            }
                            boolean z3218 = z8;
                            textStyle2 = textStyleA;
                            bVar4 = bVar2;
                            z11 = z9;
                            function5 = function3;
                            z12 = z3218;
                            nce nceVar1116 = nceVarC;
                            imeOptions3 = imeOptionsA;
                            qu0Var2 = solidColor;
                            nceVar3 = nceVar1116;
                            i42 = i33;
                            if (i36 != 0) {
                                uVar3 = null;
                            } else {
                                uVar3 = uVar;
                            }
                        } else {
                            if (i49 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i7 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i9 != 0) {
                                nceVarC = nce.INSTANCE.c();
                            }
                            if (i11 != 0) {
                                objR = dVarF.R();
                                if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                    objR = new Function1() { // from class: com.google.android.m82
                                        public final Object invoke(Object obj) {
                                            return CoreTextFieldKt.x((TextLayoutResult) obj);
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function3 = (Function1) objR;
                            }
                            if (i13 != 0) {
                                r48Var2 = null;
                            }
                            if (i15 != 0) {
                                solidColor = new SolidColor(ei1.INSTANCE.i(), null);
                            }
                            if (i17 != 0) {
                                z8 = true;
                            } else {
                                z8 = z;
                            }
                            if (i19 != 0) {
                                i40 = Integer.MAX_VALUE;
                            } else {
                                i40 = i;
                            }
                            if (i21 != 0) {
                                i41 = 1;
                            } else {
                                i41 = i2;
                            }
                            if ((i5 & 2048) != 0) {
                                imeOptionsA = ImeOptions.INSTANCE.a();
                                i33 &= -113;
                            } else {
                                imeOptionsA = imeOptions;
                            }
                            if (i25 != 0) {
                                mVarA = m.INSTANCE.a();
                            } else {
                                mVarA = mVar;
                            }
                            if (i28 != 0) {
                                z9 = true;
                            } else {
                                z9 = z2;
                            }
                            if (i31 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if (i34 != 0) {
                                ps4VarB = zo1.a.b();
                            } else {
                                ps4VarB = ps4Var;
                            }
                            boolean z3219 = z8;
                            textStyle2 = textStyleA;
                            bVar4 = bVar2;
                            z11 = z9;
                            function5 = function3;
                            z12 = z3219;
                            nce nceVar1117 = nceVarC;
                            imeOptions3 = imeOptionsA;
                            qu0Var2 = solidColor;
                            nceVar3 = nceVar1117;
                            i42 = i33;
                            if (i36 != 0) {
                                uVar3 = null;
                            } else {
                                uVar3 = uVar;
                            }
                        }
                        dVarF.M();
                        qu0Var3 = qu0Var2;
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(31062401, i6, i42, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                        }
                        objR2 = dVarF.R();
                        companion = androidx.compose.p004runtime.d.INSTANCE;
                        if (objR2 == companion.a()) {
                            objR2 = new androidx.compose.ui.focus.f();
                            dVarF.L(objR2);
                        }
                        fVar = (androidx.compose.ui.focus.f) objR2;
                        objR3 = dVarF.R();
                        i43 = i6;
                        if (objR3 == companion.a()) {
                            objR3 = LegacyPlatformTextInputServiceAdapter_androidKt.b();
                            dVarF.L(objR3);
                        }
                        bVar5 = (androidx.compose.p001foundation.text.input.internal.b) objR3;
                        objR4 = dVarF.R();
                        if (objR4 == companion.a()) {
                            objR4 = new dxc(bVar5);
                            dVarF.L(objR4);
                        }
                        dxcVar = (dxc) objR4;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        bVar6 = (l.b) dVarF.v(CompositionLocalsKt.i());
                        selectionBackgroundColor = ((SelectionColors) dVarF.v(jzc.c())).getSelectionBackgroundColor();
                        ok4Var = (ok4) dVarF.v(CompositionLocalsKt.h());
                        a0Var = (a0) dVarF.v(CompositionLocalsKt.v());
                        textStyle4 = textStyle2;
                        hybVar = (hyb) dVarF.v(CompositionLocalsKt.r());
                        z13 = z12;
                        if (i40 == 1) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Vertical;
                        }
                        if (uVar3 == null) {
                            dVarF.y(-213744626);
                            Object[] objArr12 = {orientation};
                            k0b<u, Object> k0bVarA12 = u.INSTANCE.a();
                            zC = dVarF.C(orientation.ordinal());
                            objR18 = dVarF.R();
                            if (zC) {
                                objR18 = new Function0() { // from class: com.google.android.d92
                                    public final Object invoke() {
                                        return CoreTextFieldKt.O(orientation);
                                    }
                                };
                                dVarF.L(objR18);
                            } else {
                                objR18 = new Function0() { // from class: com.google.android.d92
                                    public final Object invoke() {
                                        return CoreTextFieldKt.O(orientation);
                                    }
                                };
                                dVarF.L(objR18);
                            }
                            uVar4 = (u) dfa.k(objArr12, k0bVarA12, (Function0) objR18, dVarF, 0);
                            dVarF.u();
                        } else {
                            dVarF.y(-213745742);
                            dVarF.u();
                            uVar4 = uVar3;
                        }
                        if (uVar4.j() != orientation) {
                            StringBuilder sb12 = new StringBuilder();
                            sb12.append("Mismatching scroller orientation; ");
                            if (orientation == Orientation.Vertical) {
                                str = "only single-line, non-wrap text fields can scroll horizontally";
                            } else {
                                str = "single-line, non-wrap text fields can only scroll horizontally";
                            }
                            sb12.append(str);
                            throw new IllegalArgumentException(sb12.toString());
                        }
                        i44 = i43 & 14;
                        if (i44 == 4) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i43 & 57344) == 16384) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objR5 = dVarF.R();
                        if (z16) {
                            transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                            composition = textFieldValue.getComposition();
                            if (composition != null) {
                                uVar5 = uVar4;
                                transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                if (transformedTextC2 != null) {
                                    objR5 = transformedTextC2;
                                }
                                dVarF.L(objR5);
                            } else {
                                uVar5 = uVar4;
                            }
                            objR5 = transformedTextC;
                            dVarF.L(objR5);
                        } else {
                            transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                            composition = textFieldValue.getComposition();
                            if (composition != null) {
                                uVar5 = uVar4;
                                transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                if (transformedTextC2 != null) {
                                    objR5 = transformedTextC2;
                                }
                                dVarF.L(objR5);
                            } else {
                                uVar5 = uVar4;
                            }
                            objR5 = transformedTextC;
                            dVarF.L(objR5);
                        }
                        TransformedText transformedText12 = (TransformedText) objR5;
                        text = transformedText12.getText();
                        offsetMapping = transformedText12.getOffsetMapping();
                        qaaVarC = pp1.c(dVarF, 0);
                        zX = dVarF.x(hybVar);
                        objR6 = dVarF.R();
                        if (zX) {
                            objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                            dVarF.L(objR6);
                        } else {
                            objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                            dVarF.L(objR6);
                        }
                        k07Var = (k07) objR6;
                        m mVar14 = mVarA;
                        k07Var.X(textFieldValue.getText(), text, textStyle4, z13, r54, bVar6, function1, mVar14, ok4Var, selectionBackgroundColor);
                        k07Var.getProcessor().e(textFieldValue, k07Var.getInputSession());
                        objR7 = dVarF.R();
                        if (objR7 == companion.a()) {
                            objR7 = new rsd(0, 1, null);
                            dVarF.L(objR7);
                        }
                        rsdVar = (rsd) objR7;
                        rsd.f(rsdVar, textFieldValue, 0L, 2, null);
                        objR8 = dVarF.R();
                        if (objR8 == companion.a()) {
                            objR8 = vn3.k(EmptyCoroutineContext.a, dVarF);
                            dVarF.L(objR8);
                        }
                        ta2Var = (ta2) objR8;
                        objR9 = dVarF.R();
                        if (objR9 == companion.a()) {
                            objR9 = androidx.compose.p001foundation.relocation.c.a();
                            dVarF.L(objR9);
                        }
                        cu0Var = (cu0) objR9;
                        objR10 = dVarF.R();
                        r48 r48Var14 = r48Var2;
                        if (objR10 == companion.a()) {
                            objR10 = new TextFieldSelectionManager(rsdVar);
                            dVarF.L(objR10);
                        }
                        textFieldSelectionManager = (TextFieldSelectionManager) objR10;
                        textFieldSelectionManager.L0(offsetMapping);
                        textFieldSelectionManager.U0(nceVar3);
                        textFieldSelectionManager.M0(k07Var.r());
                        textFieldSelectionManager.Q0(k07Var);
                        textFieldSelectionManager.T0(textFieldValue);
                        textFieldSelectionManager.z0((jf1) dVarF.v(CompositionLocalsKt.d()));
                        textFieldSelectionManager.A0(ta2Var);
                        textFieldSelectionManager.R0((yzc) dVarF.v(CompositionLocalsKt.s()));
                        textFieldSelectionManager.I0((c65) dVarF.v(CompositionLocalsKt.k()));
                        textFieldSelectionManager.G0(fVar);
                        textFieldSelectionManager.E0(!z10);
                        textFieldSelectionManager.F0(z11);
                        if (up1.isSmartSelectionEnabled) {
                            dVarF.y(1966756105);
                            textFieldSelectionManager.N0(androidx.compose.p001foundation.text.selection.c.h(SelectedTextType.EditableText, textStyle4.u(), dVarF, 6));
                            dVarF.u();
                        } else {
                            dVarF.y(1966902177);
                            dVarF.u();
                        }
                        k07Var.h();
                        new Function1() { // from class: com.google.android.e92
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.y(textFieldSelectionManager, (b) obj);
                            }
                        };
                        new Function0() { // from class: com.google.android.f92
                            public final Object invoke() {
                                return CoreTextFieldKt.z(textFieldSelectionManager);
                            }
                        };
                        new Function0() { // from class: com.google.android.g92
                            public final Object invoke() {
                                return CoreTextFieldKt.A(textFieldSelectionManager);
                            }
                        };
                        companion2 = androidx.compose.ui.b.INSTANCE;
                        boolean zT111113 = dVarF.T(k07Var);
                        i45 = i42 & 7168;
                        i46 = i42;
                        if (i45 == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        boolean z3111111116 = z17 | zT111113;
                        if ((i46 & 57344) == 16384) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        boolean zT111114 = z3111111116 | z18 | dVarF.T(dxcVar);
                        if (i44 == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean z3111111117 = zT111114 | z19;
                        i47 = (i46 & 112) ^ 48;
                        if (i47 > 32) {
                            dxcVar2 = dxcVar;
                            if ((i46 & 48) != 32) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                        } else {
                            dxcVar2 = dxcVar;
                            if ((i46 & 48) != 32) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                        }
                        zT = z3111111117 | z20 | dVarF.T(offsetMapping) | dVarF.T(ta2Var) | dVarF.T(cu0Var) | dVarF.T(textFieldSelectionManager);
                        objR11 = dVarF.R();
                        if (zT) {
                            zn8Var = offsetMapping;
                            final ImeOptions imeOptions111116 = imeOptions3;
                            final boolean z3111111118 = z11;
                            final boolean z3111111119 = z10;
                            objR11 = new Function1() { // from class: com.google.android.h92
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.B(k07Var, z3111111118, z3111111119, dxcVar2, textFieldValue, imeOptions111116, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                                }
                            };
                            k07Var2 = k07Var;
                            z21 = z3111111118;
                            textFieldValue2 = textFieldValue;
                            imeOptions4 = imeOptions111116;
                            textFieldSelectionManager2 = textFieldSelectionManager;
                            ta2Var2 = ta2Var;
                            cu0Var2 = cu0Var;
                            dVarF.L(objR11);
                        } else {
                            zn8Var = offsetMapping;
                            final ImeOptions imeOptions111117 = imeOptions3;
                            final boolean z31111111110 = z11;
                            final boolean z31111111111 = z10;
                            objR11 = new Function1() { // from class: com.google.android.h92
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.B(k07Var, z31111111110, z31111111111, dxcVar2, textFieldValue, imeOptions111117, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                                }
                            };
                            k07Var2 = k07Var;
                            z21 = z31111111110;
                            textFieldValue2 = textFieldValue;
                            imeOptions4 = imeOptions111117;
                            textFieldSelectionManager2 = textFieldSelectionManager;
                            ta2Var2 = ta2Var;
                            cu0Var2 = cu0Var;
                            dVarF.L(objR11);
                        }
                        final cu0 cu0Var15 = cu0Var2;
                        androidx.compose.ui.b bVarA1111113 = atc.a(companion2, z21, fVar, r48Var14, (Function1) objR11);
                        if (z21) {
                            z22 = false;
                        } else {
                            z22 = false;
                        }
                        q6cVarR = p0.r(Boolean.valueOf(z22), dVarF, 0);
                        Unit unit13 = Unit.a;
                        boolean zX117 = dVarF.x(q6cVarR) | dVarF.T(k07Var2) | dVarF.T(dxcVar2) | dVarF.T(textFieldSelectionManager2);
                        if (i47 > 32) {
                            imeOptions5 = imeOptions4;
                            if ((i46 & 48) != 32) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                        } else {
                            imeOptions5 = imeOptions4;
                            if ((i46 & 48) != 32) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                        }
                        z24 = zX117 | z23;
                        objR12 = dVarF.R();
                        if (z24) {
                            ImeOptions imeOptions111118 = imeOptions5;
                            dxc dxcVar118 = dxcVar2;
                            TextFieldSelectionManager textFieldSelectionManager1112 = textFieldSelectionManager2;
                            k07 k07Var1111 = k07Var2;
                            objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var1111, q6cVarR, dxcVar118, textFieldSelectionManager1112, imeOptions111118, null);
                            k07Var3 = k07Var1111;
                            textFieldSelectionManager3 = textFieldSelectionManager1112;
                            imeOptions6 = imeOptions111118;
                            dVarF.L(objR12);
                        } else {
                            ImeOptions imeOptions111119 = imeOptions5;
                            dxc dxcVar119 = dxcVar2;
                            TextFieldSelectionManager textFieldSelectionManager1113 = textFieldSelectionManager2;
                            k07 k07Var1112 = k07Var2;
                            objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var1112, q6cVarR, dxcVar119, textFieldSelectionManager1113, imeOptions111119, null);
                            k07Var3 = k07Var1112;
                            textFieldSelectionManager3 = textFieldSelectionManager1113;
                            imeOptions6 = imeOptions111119;
                            dVarF.L(objR12);
                        }
                        imeOptions7 = imeOptions6;
                        vn3.g(unit13, (Function2) objR12, dVarF, 6);
                        int i5116 = i46 >> 3;
                        z25 = z21;
                        k07Var4 = k07Var3;
                        textFieldSelectionManager4 = textFieldSelectionManager3;
                        androidx.compose.ui.b bVarA1111114 = huc.a(companion2, textFieldSelectionManager4, z25, r48Var14, k07Var4, fVar, z10, zn8Var, dVarF, (i5116 & 896) | 196614 | ((i43 >> 9) & 7168) | ((i46 << 6) & 3670016));
                        zn8Var2 = zn8Var;
                        final androidx.compose.ui.b bVarB11110 = y92.b(companion2, k07Var4, textFieldValue2, zn8Var2);
                        boolean zT111115 = dVarF.T(k07Var4);
                        if (i45 == 2048) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        boolean zX118 = zT111115 | z26 | dVarF.x(a0Var) | dVarF.T(textFieldSelectionManager4);
                        if (i44 == 4) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        zT2 = zX118 | z27 | dVarF.T(zn8Var2);
                        objR13 = dVarF.R();
                        if (zT2) {
                            objR13 = new Function1() { // from class: com.google.android.n82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                                }
                            };
                            a0Var2 = a0Var;
                            textFieldSelectionManager5 = textFieldSelectionManager4;
                            dVarF.L(objR13);
                        } else {
                            objR13 = new Function1() { // from class: com.google.android.n82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                                }
                            };
                            a0Var2 = a0Var;
                            textFieldSelectionManager5 = textFieldSelectionManager4;
                            dVarF.L(objR13);
                        }
                        final androidx.compose.ui.b bVarA1111115 = xq8.a(companion2, (Function1) objR13);
                        textFieldSelectionManager6 = textFieldSelectionManager5;
                        CoreTextFieldSemanticsModifier j92Var14 = new CoreTextFieldSemanticsModifier(transformedText12, textFieldValue, k07Var4, z10, z25, nceVar3 instanceof a39, zn8Var2, textFieldSelectionManager6, imeOptions7, fVar);
                        a0 a0Var16 = a0Var2;
                        if (z25 != 0) {
                            z28 = false;
                        } else {
                            z28 = false;
                        }
                        final androidx.compose.ui.b bVarA1111116 = y92.a(companion2, k07Var4, textFieldValue, zn8Var2, qu0Var3, z28);
                        final nce nceVar1118 = nceVar3;
                        zT3 = dVarF.T(textFieldSelectionManager6);
                        objR14 = dVarF.R();
                        if (zT3) {
                            objR14 = new Function1() { // from class: com.google.android.o82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                                }
                            };
                            dVarF.L(objR14);
                        } else {
                            objR14 = new Function1() { // from class: com.google.android.o82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                                }
                            };
                            dVarF.L(objR14);
                        }
                        vn3.c(textFieldSelectionManager6, (Function1) objR14, dVarF, 0);
                        boolean zT111116 = dVarF.T(k07Var4) | dVarF.T(dxcVar2);
                        if (i44 == 4) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        z30 = z29 | zT111116 | ((i47 <= 32 && dVarF.x(imeOptions7)) || (i46 & 48) == 32);
                        objR15 = dVarF.R();
                        if (z30) {
                            objR15 = new Function1() { // from class: com.google.android.p82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                                }
                            };
                            dVarF.L(objR15);
                        } else {
                            objR15 = new Function1() { // from class: com.google.android.p82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                                }
                            };
                            dVarF.L(objR15);
                        }
                        vn3.c(imeOptions7, (Function1) objR15, dVarF, i5116 & 14);
                        Function1<TextFieldValue, Unit> function1R14 = k07Var4.r();
                        boolean z31111111112 = !z10;
                        i48 = i40;
                        if (i48 == 1) {
                            z31 = true;
                        } else {
                            z31 = false;
                        }
                        androidx.compose.ui.b bVarB11111 = TextFieldKeyInputKt.b(companion2, k07Var4, textFieldSelectionManager6, textFieldValue, function1R14, z31111111112, z31, zn8Var2, rsdVar, imeOptions7.getImeAction());
                        keyboardType = imeOptions7.getKeyboardType();
                        companion3 = androidx.compose.ui.text.input.d.INSTANCE;
                        if (androidx.compose.ui.text.input.d.n(keyboardType, companion3.f())) {
                            z32 = false;
                        } else {
                            z32 = false;
                        }
                        boolean zC15 = C(q6cVarR);
                        zA = dVarF.A(z32) | dVarF.T(bVar5);
                        objR16 = dVarF.R();
                        if (zA) {
                            objR16 = new Function0() { // from class: com.google.android.q82
                                public final Object invoke() {
                                    return CoreTextFieldKt.G(z32, bVar5);
                                }
                            };
                            dVarF.L(objR16);
                        } else {
                            objR16 = new Function0() { // from class: com.google.android.q82
                                public final Object invoke() {
                                    return CoreTextFieldKt.G(z32, bVar5);
                                }
                            };
                            dVarF.L(objR16);
                        }
                        androidx.compose.ui.b bVarB11112 = hcc.b(companion2, zC15, z32, (Function0) objR16);
                        ta2 ta2Var16 = ta2Var2;
                        qu0VarE = ma0.e((qu0) dVarF.v(ma0.c()), ((ei1) dVarF.v(ma0.d())).getValue(), na0.a());
                        zT4 = dVarF.T(k07Var4) | dVarF.x(qu0VarE);
                        objR17 = dVarF.R();
                        if (zT4) {
                            objR17 = new Function1() { // from class: com.google.android.x82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                                }
                            };
                            dVarF.L(objR17);
                        } else {
                            objR17 = new Function1() { // from class: com.google.android.x82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                                }
                            };
                            dVarF.L(objR17);
                        }
                        androidx.compose.ui.b bVarD14 = androidx.compose.ui.draw.c.d(companion2, (Function1) objR17);
                        zv8 zv8VarA14 = tuc.a(dVarF, 0);
                        androidx.compose.ui.b bVar1113 = bVar4;
                        androidx.compose.ui.b bVarThen14 = g0(zsc.b(yz6.a(bVar1113.then(bVarD14), bVar5, k07Var4, textFieldSelectionManager6).then(bVarB11112).then(bVarA1111113), k07Var4, ok4Var), k07Var4, textFieldSelectionManager6).then(bVarB11111);
                        final u uVar19 = uVar5;
                        androidx.compose.ui.b bVarA1111117 = a0(xq8.a(TextFieldScrollKt.f(bVarThen14, uVar19, r48Var14, z25, zv8VarA14).then(bVarA1111114).then(j92Var14), new Function1() { // from class: com.google.android.a92
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.I(k07Var4, (kn6) obj);
                            }
                        }), textFieldSelectionManager6, ta2Var16);
                        if (!z25) {
                            z33 = false;
                        } else {
                            z33 = false;
                        }
                        if (z33) {
                            bVarZ = TextFieldSelectionManager_androidKt.z(companion2, textFieldSelectionManager6);
                        } else {
                            bVarZ = companion2;
                        }
                        final ps4 ps4Var16 = ps4VarB;
                        final androidx.compose.ui.b bVar1114 = bVarZ;
                        final boolean z4116 = z10;
                        final boolean z4117 = z33;
                        final int i5117 = i41;
                        P(bVarA1111117, textFieldSelectionManager6, ko1.e(-814563849, true, new Function2() { // from class: com.google.android.b92
                            public final Object invoke(Object obj, Object obj2) {
                                return CoreTextFieldKt.J(ps4Var16, k07Var4, textStyle4, i5117, i48, uVar19, textFieldValue, nceVar1118, bVarA1111116, bVarB11110, bVarA1111115, bVar1114, cu0Var15, textFieldSelectionManager6, z4117, z4116, function5, zn8Var2, f43Var, (d) obj, ((Integer) obj2).intValue());
                            }
                        }, dVarF, 54), dVarF, 384);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        ps4Var2 = ps4Var16;
                        dVar2 = dVarF;
                        function4 = function5;
                        z7 = z4116;
                        uVar2 = uVar3;
                        z6 = z25;
                        r48Var2 = r48Var14;
                        z5 = z13;
                        mVar2 = mVar14;
                        i39 = i41;
                        solidColor = qu0Var3;
                        bVar3 = bVar1113;
                        i38 = i48;
                        nceVar2 = nceVar1118;
                        textStyle3 = textStyle4;
                        imeOptions2 = imeOptions7;
                    } else {
                        dVarF.q();
                        z5 = z;
                        imeOptions2 = imeOptions;
                        mVar2 = mVar;
                        ps4Var2 = ps4Var;
                        uVar2 = uVar;
                        dVar2 = dVarF;
                        textStyle3 = textStyle2;
                        function4 = function3;
                        nceVar2 = nceVarC;
                        bVar3 = bVar2;
                        i38 = i;
                        i39 = i2;
                        z6 = z2;
                        z7 = z3;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.c92
                            public final Object invoke(Object obj, Object obj2) {
                                return CoreTextFieldKt.N(textFieldValue, function1, bVar3, textStyle3, nceVar2, function4, r48Var2, solidColor, z5, i38, i39, imeOptions2, mVar2, z6, z7, ps4Var2, uVar2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i6 |= 805306368;
                i21 = i5 & 1024;
                if (i21 != 0) {
                    i22 = i4 | 6;
                } else if ((i4 & 6) == 0) {
                    if (dVarF.C(i2)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i4 | i23;
                } else {
                    i22 = i4;
                }
                if ((i4 & 48) != 0) {
                    i22 |= ((i5 & 2048) == 0 || !dVarF.x(imeOptions)) ? 16 : 32;
                }
                i24 = i22;
                i25 = i5 & 4096;
                if (i25 != 0) {
                    i26 = i24 | 384;
                } else if ((i4 & 384) == 0) {
                    if (dVarF.x(mVar)) {
                        i27 = 256;
                    } else {
                        i27 = 128;
                    }
                    i26 = i24 | i27;
                } else {
                    i26 = i24;
                }
                i28 = i5 & 8192;
                if (i28 != 0) {
                    i30 = i26 | 3072;
                } else {
                    i29 = i26;
                    if ((i4 & 3072) == 0) {
                        i30 = i29 | (dVarF.A(z2) ? 2048 : 1024);
                    } else {
                        i30 = i29;
                    }
                }
                i31 = i5 & 16384;
                if (i31 != 0) {
                    i33 = i30 | 24576;
                } else {
                    i32 = i30;
                    if ((i4 & 24576) == 0) {
                        i33 = i32 | (dVarF.A(z3) ? 16384 : 8192);
                    } else {
                        i33 = i32;
                    }
                }
                i34 = i5 & 32768;
                if (i34 != 0) {
                    i33 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i35 = 131072;
                    } else {
                        i35 = 65536;
                    }
                    i33 |= i35;
                }
                i36 = i5 & 65536;
                if (i36 != 0) {
                    i33 |= 1572864;
                } else if ((i4 & 1572864) == 0) {
                    if (dVarF.x(uVar)) {
                        i37 = 1048576;
                    } else {
                        i37 = 524288;
                    }
                    i33 |= i37;
                }
                if ((i6 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (dVarF.g(z4, i6 & 1)) {
                    dVarF.U();
                    if ((i3 & 1) != 0) {
                        if (i49 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i7 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i9 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        }
                        if (i11 != 0) {
                            objR = dVarF.R();
                            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.m82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.x((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function3 = (Function1) objR;
                        }
                        if (i13 != 0) {
                            r48Var2 = null;
                        }
                        if (i15 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.i(), null);
                        }
                        if (i17 != 0) {
                            z8 = true;
                        } else {
                            z8 = z;
                        }
                        if (i19 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i;
                        }
                        if (i21 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i2;
                        }
                        if ((i5 & 2048) != 0) {
                            imeOptionsA = ImeOptions.INSTANCE.a();
                            i33 &= -113;
                        } else {
                            imeOptionsA = imeOptions;
                        }
                        if (i25 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar;
                        }
                        if (i28 != 0) {
                            z9 = true;
                        } else {
                            z9 = z2;
                        }
                        if (i31 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if (i34 != 0) {
                            ps4VarB = zo1.a.b();
                        } else {
                            ps4VarB = ps4Var;
                        }
                        boolean z32110 = z8;
                        textStyle2 = textStyleA;
                        bVar4 = bVar2;
                        z11 = z9;
                        function5 = function3;
                        z12 = z32110;
                        nce nceVar1119 = nceVarC;
                        imeOptions3 = imeOptionsA;
                        qu0Var2 = solidColor;
                        nceVar3 = nceVar1119;
                        i42 = i33;
                        if (i36 != 0) {
                            uVar3 = null;
                        } else {
                            uVar3 = uVar;
                        }
                    } else {
                        if (i49 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i7 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i9 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        }
                        if (i11 != 0) {
                            objR = dVarF.R();
                            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.m82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.x((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function3 = (Function1) objR;
                        }
                        if (i13 != 0) {
                            r48Var2 = null;
                        }
                        if (i15 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.i(), null);
                        }
                        if (i17 != 0) {
                            z8 = true;
                        } else {
                            z8 = z;
                        }
                        if (i19 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i;
                        }
                        if (i21 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i2;
                        }
                        if ((i5 & 2048) != 0) {
                            imeOptionsA = ImeOptions.INSTANCE.a();
                            i33 &= -113;
                        } else {
                            imeOptionsA = imeOptions;
                        }
                        if (i25 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar;
                        }
                        if (i28 != 0) {
                            z9 = true;
                        } else {
                            z9 = z2;
                        }
                        if (i31 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if (i34 != 0) {
                            ps4VarB = zo1.a.b();
                        } else {
                            ps4VarB = ps4Var;
                        }
                        boolean z32111 = z8;
                        textStyle2 = textStyleA;
                        bVar4 = bVar2;
                        z11 = z9;
                        function5 = function3;
                        z12 = z32111;
                        nce nceVar11110 = nceVarC;
                        imeOptions3 = imeOptionsA;
                        qu0Var2 = solidColor;
                        nceVar3 = nceVar11110;
                        i42 = i33;
                        if (i36 != 0) {
                            uVar3 = null;
                        } else {
                            uVar3 = uVar;
                        }
                    }
                    dVarF.M();
                    qu0Var3 = qu0Var2;
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(31062401, i6, i42, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                    }
                    objR2 = dVarF.R();
                    companion = androidx.compose.p004runtime.d.INSTANCE;
                    if (objR2 == companion.a()) {
                        objR2 = new androidx.compose.ui.focus.f();
                        dVarF.L(objR2);
                    }
                    fVar = (androidx.compose.ui.focus.f) objR2;
                    objR3 = dVarF.R();
                    i43 = i6;
                    if (objR3 == companion.a()) {
                        objR3 = LegacyPlatformTextInputServiceAdapter_androidKt.b();
                        dVarF.L(objR3);
                    }
                    bVar5 = (androidx.compose.p001foundation.text.input.internal.b) objR3;
                    objR4 = dVarF.R();
                    if (objR4 == companion.a()) {
                        objR4 = new dxc(bVar5);
                        dVarF.L(objR4);
                    }
                    dxcVar = (dxc) objR4;
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    bVar6 = (l.b) dVarF.v(CompositionLocalsKt.i());
                    selectionBackgroundColor = ((SelectionColors) dVarF.v(jzc.c())).getSelectionBackgroundColor();
                    ok4Var = (ok4) dVarF.v(CompositionLocalsKt.h());
                    a0Var = (a0) dVarF.v(CompositionLocalsKt.v());
                    textStyle4 = textStyle2;
                    hybVar = (hyb) dVarF.v(CompositionLocalsKt.r());
                    z13 = z12;
                    if (i40 == 1) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Vertical;
                    }
                    if (uVar3 == null) {
                        dVarF.y(-213744626);
                        Object[] objArr13 = {orientation};
                        k0b<u, Object> k0bVarA13 = u.INSTANCE.a();
                        zC = dVarF.C(orientation.ordinal());
                        objR18 = dVarF.R();
                        if (zC) {
                            objR18 = new Function0() { // from class: com.google.android.d92
                                public final Object invoke() {
                                    return CoreTextFieldKt.O(orientation);
                                }
                            };
                            dVarF.L(objR18);
                        } else {
                            objR18 = new Function0() { // from class: com.google.android.d92
                                public final Object invoke() {
                                    return CoreTextFieldKt.O(orientation);
                                }
                            };
                            dVarF.L(objR18);
                        }
                        uVar4 = (u) dfa.k(objArr13, k0bVarA13, (Function0) objR18, dVarF, 0);
                        dVarF.u();
                    } else {
                        dVarF.y(-213745742);
                        dVarF.u();
                        uVar4 = uVar3;
                    }
                    if (uVar4.j() != orientation) {
                        StringBuilder sb13 = new StringBuilder();
                        sb13.append("Mismatching scroller orientation; ");
                        if (orientation == Orientation.Vertical) {
                            str = "only single-line, non-wrap text fields can scroll horizontally";
                        } else {
                            str = "single-line, non-wrap text fields can only scroll horizontally";
                        }
                        sb13.append(str);
                        throw new IllegalArgumentException(sb13.toString());
                    }
                    i44 = i43 & 14;
                    if (i44 == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i43 & 57344) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z14 | z15;
                    objR5 = dVarF.R();
                    if (z16) {
                        transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                        composition = textFieldValue.getComposition();
                        if (composition != null) {
                            uVar5 = uVar4;
                            transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                            if (transformedTextC2 != null) {
                                objR5 = transformedTextC2;
                            }
                            dVarF.L(objR5);
                        } else {
                            uVar5 = uVar4;
                        }
                        objR5 = transformedTextC;
                        dVarF.L(objR5);
                    } else {
                        transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                        composition = textFieldValue.getComposition();
                        if (composition != null) {
                            uVar5 = uVar4;
                            transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                            if (transformedTextC2 != null) {
                                objR5 = transformedTextC2;
                            }
                            dVarF.L(objR5);
                        } else {
                            uVar5 = uVar4;
                        }
                        objR5 = transformedTextC;
                        dVarF.L(objR5);
                    }
                    TransformedText transformedText13 = (TransformedText) objR5;
                    text = transformedText13.getText();
                    offsetMapping = transformedText13.getOffsetMapping();
                    qaaVarC = pp1.c(dVarF, 0);
                    zX = dVarF.x(hybVar);
                    objR6 = dVarF.R();
                    if (zX) {
                        objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                        dVarF.L(objR6);
                    } else {
                        objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                        dVarF.L(objR6);
                    }
                    k07Var = (k07) objR6;
                    m mVar15 = mVarA;
                    k07Var.X(textFieldValue.getText(), text, textStyle4, z13, r54, bVar6, function1, mVar15, ok4Var, selectionBackgroundColor);
                    k07Var.getProcessor().e(textFieldValue, k07Var.getInputSession());
                    objR7 = dVarF.R();
                    if (objR7 == companion.a()) {
                        objR7 = new rsd(0, 1, null);
                        dVarF.L(objR7);
                    }
                    rsdVar = (rsd) objR7;
                    rsd.f(rsdVar, textFieldValue, 0L, 2, null);
                    objR8 = dVarF.R();
                    if (objR8 == companion.a()) {
                        objR8 = vn3.k(EmptyCoroutineContext.a, dVarF);
                        dVarF.L(objR8);
                    }
                    ta2Var = (ta2) objR8;
                    objR9 = dVarF.R();
                    if (objR9 == companion.a()) {
                        objR9 = androidx.compose.p001foundation.relocation.c.a();
                        dVarF.L(objR9);
                    }
                    cu0Var = (cu0) objR9;
                    objR10 = dVarF.R();
                    r48 r48Var15 = r48Var2;
                    if (objR10 == companion.a()) {
                        objR10 = new TextFieldSelectionManager(rsdVar);
                        dVarF.L(objR10);
                    }
                    textFieldSelectionManager = (TextFieldSelectionManager) objR10;
                    textFieldSelectionManager.L0(offsetMapping);
                    textFieldSelectionManager.U0(nceVar3);
                    textFieldSelectionManager.M0(k07Var.r());
                    textFieldSelectionManager.Q0(k07Var);
                    textFieldSelectionManager.T0(textFieldValue);
                    textFieldSelectionManager.z0((jf1) dVarF.v(CompositionLocalsKt.d()));
                    textFieldSelectionManager.A0(ta2Var);
                    textFieldSelectionManager.R0((yzc) dVarF.v(CompositionLocalsKt.s()));
                    textFieldSelectionManager.I0((c65) dVarF.v(CompositionLocalsKt.k()));
                    textFieldSelectionManager.G0(fVar);
                    textFieldSelectionManager.E0(!z10);
                    textFieldSelectionManager.F0(z11);
                    if (up1.isSmartSelectionEnabled) {
                        dVarF.y(1966756105);
                        textFieldSelectionManager.N0(androidx.compose.p001foundation.text.selection.c.h(SelectedTextType.EditableText, textStyle4.u(), dVarF, 6));
                        dVarF.u();
                    } else {
                        dVarF.y(1966902177);
                        dVarF.u();
                    }
                    k07Var.h();
                    new Function1() { // from class: com.google.android.e92
                        public final Object invoke(Object obj) {
                            return CoreTextFieldKt.y(textFieldSelectionManager, (b) obj);
                        }
                    };
                    new Function0() { // from class: com.google.android.f92
                        public final Object invoke() {
                            return CoreTextFieldKt.z(textFieldSelectionManager);
                        }
                    };
                    new Function0() { // from class: com.google.android.g92
                        public final Object invoke() {
                            return CoreTextFieldKt.A(textFieldSelectionManager);
                        }
                    };
                    companion2 = androidx.compose.ui.b.INSTANCE;
                    boolean zT111117 = dVarF.T(k07Var);
                    i45 = i42 & 7168;
                    i46 = i42;
                    if (i45 == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z31111111113 = z17 | zT111117;
                    if ((i46 & 57344) == 16384) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean zT111118 = z31111111113 | z18 | dVarF.T(dxcVar);
                    if (i44 == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z31111111114 = zT111118 | z19;
                    i47 = (i46 & 112) ^ 48;
                    if (i47 > 32) {
                        dxcVar2 = dxcVar;
                        if ((i46 & 48) != 32) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                    } else {
                        dxcVar2 = dxcVar;
                        if ((i46 & 48) != 32) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                    }
                    zT = z31111111114 | z20 | dVarF.T(offsetMapping) | dVarF.T(ta2Var) | dVarF.T(cu0Var) | dVarF.T(textFieldSelectionManager);
                    objR11 = dVarF.R();
                    if (zT) {
                        zn8Var = offsetMapping;
                        final ImeOptions imeOptions1111110 = imeOptions3;
                        final boolean z31111111115 = z11;
                        final boolean z31111111116 = z10;
                        objR11 = new Function1() { // from class: com.google.android.h92
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.B(k07Var, z31111111115, z31111111116, dxcVar2, textFieldValue, imeOptions1111110, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                            }
                        };
                        k07Var2 = k07Var;
                        z21 = z31111111115;
                        textFieldValue2 = textFieldValue;
                        imeOptions4 = imeOptions1111110;
                        textFieldSelectionManager2 = textFieldSelectionManager;
                        ta2Var2 = ta2Var;
                        cu0Var2 = cu0Var;
                        dVarF.L(objR11);
                    } else {
                        zn8Var = offsetMapping;
                        final ImeOptions imeOptions1111111 = imeOptions3;
                        final boolean z31111111117 = z11;
                        final boolean z31111111118 = z10;
                        objR11 = new Function1() { // from class: com.google.android.h92
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.B(k07Var, z31111111117, z31111111118, dxcVar2, textFieldValue, imeOptions1111111, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                            }
                        };
                        k07Var2 = k07Var;
                        z21 = z31111111117;
                        textFieldValue2 = textFieldValue;
                        imeOptions4 = imeOptions1111111;
                        textFieldSelectionManager2 = textFieldSelectionManager;
                        ta2Var2 = ta2Var;
                        cu0Var2 = cu0Var;
                        dVarF.L(objR11);
                    }
                    final cu0 cu0Var16 = cu0Var2;
                    androidx.compose.ui.b bVarA1111118 = atc.a(companion2, z21, fVar, r48Var15, (Function1) objR11);
                    if (z21) {
                        z22 = false;
                    } else {
                        z22 = false;
                    }
                    q6cVarR = p0.r(Boolean.valueOf(z22), dVarF, 0);
                    Unit unit14 = Unit.a;
                    boolean zX119 = dVarF.x(q6cVarR) | dVarF.T(k07Var2) | dVarF.T(dxcVar2) | dVarF.T(textFieldSelectionManager2);
                    if (i47 > 32) {
                        imeOptions5 = imeOptions4;
                        if ((i46 & 48) != 32) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                    } else {
                        imeOptions5 = imeOptions4;
                        if ((i46 & 48) != 32) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                    }
                    z24 = zX119 | z23;
                    objR12 = dVarF.R();
                    if (z24) {
                        ImeOptions imeOptions1111112 = imeOptions5;
                        dxc dxcVar1110 = dxcVar2;
                        TextFieldSelectionManager textFieldSelectionManager1114 = textFieldSelectionManager2;
                        k07 k07Var1113 = k07Var2;
                        objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var1113, q6cVarR, dxcVar1110, textFieldSelectionManager1114, imeOptions1111112, null);
                        k07Var3 = k07Var1113;
                        textFieldSelectionManager3 = textFieldSelectionManager1114;
                        imeOptions6 = imeOptions1111112;
                        dVarF.L(objR12);
                    } else {
                        ImeOptions imeOptions1111113 = imeOptions5;
                        dxc dxcVar1111 = dxcVar2;
                        TextFieldSelectionManager textFieldSelectionManager1115 = textFieldSelectionManager2;
                        k07 k07Var1114 = k07Var2;
                        objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var1114, q6cVarR, dxcVar1111, textFieldSelectionManager1115, imeOptions1111113, null);
                        k07Var3 = k07Var1114;
                        textFieldSelectionManager3 = textFieldSelectionManager1115;
                        imeOptions6 = imeOptions1111113;
                        dVarF.L(objR12);
                    }
                    imeOptions7 = imeOptions6;
                    vn3.g(unit14, (Function2) objR12, dVarF, 6);
                    int i5118 = i46 >> 3;
                    z25 = z21;
                    k07Var4 = k07Var3;
                    textFieldSelectionManager4 = textFieldSelectionManager3;
                    androidx.compose.ui.b bVarA1111119 = huc.a(companion2, textFieldSelectionManager4, z25, r48Var15, k07Var4, fVar, z10, zn8Var, dVarF, (i5118 & 896) | 196614 | ((i43 >> 9) & 7168) | ((i46 << 6) & 3670016));
                    zn8Var2 = zn8Var;
                    final androidx.compose.ui.b bVarB11113 = y92.b(companion2, k07Var4, textFieldValue2, zn8Var2);
                    boolean zT111119 = dVarF.T(k07Var4);
                    if (i45 == 2048) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    boolean zX1110 = zT111119 | z26 | dVarF.x(a0Var) | dVarF.T(textFieldSelectionManager4);
                    if (i44 == 4) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    zT2 = zX1110 | z27 | dVarF.T(zn8Var2);
                    objR13 = dVarF.R();
                    if (zT2) {
                        objR13 = new Function1() { // from class: com.google.android.n82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                            }
                        };
                        a0Var2 = a0Var;
                        textFieldSelectionManager5 = textFieldSelectionManager4;
                        dVarF.L(objR13);
                    } else {
                        objR13 = new Function1() { // from class: com.google.android.n82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                            }
                        };
                        a0Var2 = a0Var;
                        textFieldSelectionManager5 = textFieldSelectionManager4;
                        dVarF.L(objR13);
                    }
                    final androidx.compose.ui.b bVarA11111110 = xq8.a(companion2, (Function1) objR13);
                    textFieldSelectionManager6 = textFieldSelectionManager5;
                    CoreTextFieldSemanticsModifier j92Var15 = new CoreTextFieldSemanticsModifier(transformedText13, textFieldValue, k07Var4, z10, z25, nceVar3 instanceof a39, zn8Var2, textFieldSelectionManager6, imeOptions7, fVar);
                    a0 a0Var17 = a0Var2;
                    if (z25 != 0) {
                        z28 = false;
                    } else {
                        z28 = false;
                    }
                    final androidx.compose.ui.b bVarA11111111 = y92.a(companion2, k07Var4, textFieldValue, zn8Var2, qu0Var3, z28);
                    final nce nceVar11111 = nceVar3;
                    zT3 = dVarF.T(textFieldSelectionManager6);
                    objR14 = dVarF.R();
                    if (zT3) {
                        objR14 = new Function1() { // from class: com.google.android.o82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                            }
                        };
                        dVarF.L(objR14);
                    } else {
                        objR14 = new Function1() { // from class: com.google.android.o82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                            }
                        };
                        dVarF.L(objR14);
                    }
                    vn3.c(textFieldSelectionManager6, (Function1) objR14, dVarF, 0);
                    boolean zT1111110 = dVarF.T(k07Var4) | dVarF.T(dxcVar2);
                    if (i44 == 4) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    z30 = z29 | zT1111110 | ((i47 <= 32 && dVarF.x(imeOptions7)) || (i46 & 48) == 32);
                    objR15 = dVarF.R();
                    if (z30) {
                        objR15 = new Function1() { // from class: com.google.android.p82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                            }
                        };
                        dVarF.L(objR15);
                    } else {
                        objR15 = new Function1() { // from class: com.google.android.p82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                            }
                        };
                        dVarF.L(objR15);
                    }
                    vn3.c(imeOptions7, (Function1) objR15, dVarF, i5118 & 14);
                    Function1<TextFieldValue, Unit> function1R15 = k07Var4.r();
                    boolean z31111111119 = !z10;
                    i48 = i40;
                    if (i48 == 1) {
                        z31 = true;
                    } else {
                        z31 = false;
                    }
                    androidx.compose.ui.b bVarB11114 = TextFieldKeyInputKt.b(companion2, k07Var4, textFieldSelectionManager6, textFieldValue, function1R15, z31111111119, z31, zn8Var2, rsdVar, imeOptions7.getImeAction());
                    keyboardType = imeOptions7.getKeyboardType();
                    companion3 = androidx.compose.ui.text.input.d.INSTANCE;
                    if (androidx.compose.ui.text.input.d.n(keyboardType, companion3.f())) {
                        z32 = false;
                    } else {
                        z32 = false;
                    }
                    boolean zC16 = C(q6cVarR);
                    zA = dVarF.A(z32) | dVarF.T(bVar5);
                    objR16 = dVarF.R();
                    if (zA) {
                        objR16 = new Function0() { // from class: com.google.android.q82
                            public final Object invoke() {
                                return CoreTextFieldKt.G(z32, bVar5);
                            }
                        };
                        dVarF.L(objR16);
                    } else {
                        objR16 = new Function0() { // from class: com.google.android.q82
                            public final Object invoke() {
                                return CoreTextFieldKt.G(z32, bVar5);
                            }
                        };
                        dVarF.L(objR16);
                    }
                    androidx.compose.ui.b bVarB11115 = hcc.b(companion2, zC16, z32, (Function0) objR16);
                    ta2 ta2Var17 = ta2Var2;
                    qu0VarE = ma0.e((qu0) dVarF.v(ma0.c()), ((ei1) dVarF.v(ma0.d())).getValue(), na0.a());
                    zT4 = dVarF.T(k07Var4) | dVarF.x(qu0VarE);
                    objR17 = dVarF.R();
                    if (zT4) {
                        objR17 = new Function1() { // from class: com.google.android.x82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                            }
                        };
                        dVarF.L(objR17);
                    } else {
                        objR17 = new Function1() { // from class: com.google.android.x82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                            }
                        };
                        dVarF.L(objR17);
                    }
                    androidx.compose.ui.b bVarD15 = androidx.compose.ui.draw.c.d(companion2, (Function1) objR17);
                    zv8 zv8VarA15 = tuc.a(dVarF, 0);
                    androidx.compose.ui.b bVar1115 = bVar4;
                    androidx.compose.ui.b bVarThen15 = g0(zsc.b(yz6.a(bVar1115.then(bVarD15), bVar5, k07Var4, textFieldSelectionManager6).then(bVarB11115).then(bVarA1111118), k07Var4, ok4Var), k07Var4, textFieldSelectionManager6).then(bVarB11114);
                    final u uVar110 = uVar5;
                    androidx.compose.ui.b bVarA11111112 = a0(xq8.a(TextFieldScrollKt.f(bVarThen15, uVar110, r48Var15, z25, zv8VarA15).then(bVarA1111119).then(j92Var15), new Function1() { // from class: com.google.android.a92
                        public final Object invoke(Object obj) {
                            return CoreTextFieldKt.I(k07Var4, (kn6) obj);
                        }
                    }), textFieldSelectionManager6, ta2Var17);
                    if (!z25) {
                        z33 = false;
                    } else {
                        z33 = false;
                    }
                    if (z33) {
                        bVarZ = TextFieldSelectionManager_androidKt.z(companion2, textFieldSelectionManager6);
                    } else {
                        bVarZ = companion2;
                    }
                    final ps4 ps4Var17 = ps4VarB;
                    final androidx.compose.ui.b bVar1116 = bVarZ;
                    final boolean z4118 = z10;
                    final boolean z4119 = z33;
                    final int i5119 = i41;
                    P(bVarA11111112, textFieldSelectionManager6, ko1.e(-814563849, true, new Function2() { // from class: com.google.android.b92
                        public final Object invoke(Object obj, Object obj2) {
                            return CoreTextFieldKt.J(ps4Var17, k07Var4, textStyle4, i5119, i48, uVar110, textFieldValue, nceVar11111, bVarA11111111, bVarB11113, bVarA11111110, bVar1116, cu0Var16, textFieldSelectionManager6, z4119, z4118, function5, zn8Var2, f43Var, (d) obj, ((Integer) obj2).intValue());
                        }
                    }, dVarF, 54), dVarF, 384);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    ps4Var2 = ps4Var17;
                    dVar2 = dVarF;
                    function4 = function5;
                    z7 = z4118;
                    uVar2 = uVar3;
                    z6 = z25;
                    r48Var2 = r48Var15;
                    z5 = z13;
                    mVar2 = mVar15;
                    i39 = i41;
                    solidColor = qu0Var3;
                    bVar3 = bVar1115;
                    i38 = i48;
                    nceVar2 = nceVar11111;
                    textStyle3 = textStyle4;
                    imeOptions2 = imeOptions7;
                } else {
                    dVarF.q();
                    z5 = z;
                    imeOptions2 = imeOptions;
                    mVar2 = mVar;
                    ps4Var2 = ps4Var;
                    uVar2 = uVar;
                    dVar2 = dVarF;
                    textStyle3 = textStyle2;
                    function4 = function3;
                    nceVar2 = nceVarC;
                    bVar3 = bVar2;
                    i38 = i;
                    i39 = i2;
                    z6 = z2;
                    z7 = z3;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.c92
                        public final Object invoke(Object obj, Object obj2) {
                            return CoreTextFieldKt.N(textFieldValue, function1, bVar3, textStyle3, nceVar2, function4, r48Var2, solidColor, z5, i38, i39, imeOptions2, mVar2, z6, z7, ps4Var2, uVar2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i6 |= 3072;
            textStyle2 = textStyle;
            i9 = i5 & 16;
            if (i9 != 0) {
                if ((i3 & 24576) == 0) {
                    nceVarC = nceVar;
                    if (dVarF.x(nceVarC)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i6 |= i10;
                }
                i11 = i5 & 32;
                if (i11 != 0) {
                    i6 |= 196608;
                    function3 = function2;
                } else {
                    function3 = function2;
                    if ((i3 & 196608) == 0) {
                        if (dVarF.T(function3)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i6 |= i12;
                    }
                }
                i13 = i5 & 64;
                if (i13 != 0) {
                    i6 |= 1572864;
                    r48Var2 = r48Var;
                } else {
                    r48Var2 = r48Var;
                    if ((i3 & 1572864) == 0) {
                        if (dVarF.x(r48Var2)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i6 |= i14;
                    }
                }
                i15 = i5 & 128;
                if (i15 != 0) {
                    i6 |= 12582912;
                    solidColor = qu0Var;
                } else {
                    solidColor = qu0Var;
                    if ((i3 & 12582912) == 0) {
                        if (dVarF.x(solidColor)) {
                            i16 = 8388608;
                        } else {
                            i16 = 4194304;
                        }
                        i6 |= i16;
                    }
                }
                i17 = i5 & 256;
                if (i17 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 100663296) == 0) {
                    if (dVarF.A(z)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i6 |= i18;
                }
                i19 = i5 & 512;
                if (i19 != 0) {
                    if ((i3 & 805306368) == 0) {
                        if (dVarF.C(i)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i6 |= i20;
                    }
                    i21 = i5 & 1024;
                    if (i21 != 0) {
                        i22 = i4 | 6;
                    } else if ((i4 & 6) == 0) {
                        if (dVarF.C(i2)) {
                            i23 = 4;
                        } else {
                            i23 = 2;
                        }
                        i22 = i4 | i23;
                    } else {
                        i22 = i4;
                    }
                    if ((i4 & 48) != 0) {
                        i22 |= ((i5 & 2048) == 0 || !dVarF.x(imeOptions)) ? 16 : 32;
                    }
                    i24 = i22;
                    i25 = i5 & 4096;
                    if (i25 != 0) {
                        i26 = i24 | 384;
                    } else if ((i4 & 384) == 0) {
                        if (dVarF.x(mVar)) {
                            i27 = 256;
                        } else {
                            i27 = 128;
                        }
                        i26 = i24 | i27;
                    } else {
                        i26 = i24;
                    }
                    i28 = i5 & 8192;
                    if (i28 != 0) {
                        i30 = i26 | 3072;
                    } else {
                        i29 = i26;
                        if ((i4 & 3072) == 0) {
                            i30 = i29 | (dVarF.A(z2) ? 2048 : 1024);
                        } else {
                            i30 = i29;
                        }
                    }
                    i31 = i5 & 16384;
                    if (i31 != 0) {
                        i33 = i30 | 24576;
                    } else {
                        i32 = i30;
                        if ((i4 & 24576) == 0) {
                            i33 = i32 | (dVarF.A(z3) ? 16384 : 8192);
                        } else {
                            i33 = i32;
                        }
                    }
                    i34 = i5 & 32768;
                    if (i34 != 0) {
                        i33 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i35 = 131072;
                        } else {
                            i35 = 65536;
                        }
                        i33 |= i35;
                    }
                    i36 = i5 & 65536;
                    if (i36 != 0) {
                        i33 |= 1572864;
                    } else if ((i4 & 1572864) == 0) {
                        if (dVarF.x(uVar)) {
                            i37 = 1048576;
                        } else {
                            i37 = 524288;
                        }
                        i33 |= i37;
                    }
                    if ((i6 & 306783379) == 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (dVarF.g(z4, i6 & 1)) {
                        dVarF.U();
                        if ((i3 & 1) != 0) {
                            if (i49 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i7 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i9 != 0) {
                                nceVarC = nce.INSTANCE.c();
                            }
                            if (i11 != 0) {
                                objR = dVarF.R();
                                if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                    objR = new Function1() { // from class: com.google.android.m82
                                        public final Object invoke(Object obj) {
                                            return CoreTextFieldKt.x((TextLayoutResult) obj);
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function3 = (Function1) objR;
                            }
                            if (i13 != 0) {
                                r48Var2 = null;
                            }
                            if (i15 != 0) {
                                solidColor = new SolidColor(ei1.INSTANCE.i(), null);
                            }
                            if (i17 != 0) {
                                z8 = true;
                            } else {
                                z8 = z;
                            }
                            if (i19 != 0) {
                                i40 = Integer.MAX_VALUE;
                            } else {
                                i40 = i;
                            }
                            if (i21 != 0) {
                                i41 = 1;
                            } else {
                                i41 = i2;
                            }
                            if ((i5 & 2048) != 0) {
                                imeOptionsA = ImeOptions.INSTANCE.a();
                                i33 &= -113;
                            } else {
                                imeOptionsA = imeOptions;
                            }
                            if (i25 != 0) {
                                mVarA = m.INSTANCE.a();
                            } else {
                                mVarA = mVar;
                            }
                            if (i28 != 0) {
                                z9 = true;
                            } else {
                                z9 = z2;
                            }
                            if (i31 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if (i34 != 0) {
                                ps4VarB = zo1.a.b();
                            } else {
                                ps4VarB = ps4Var;
                            }
                            boolean z32112 = z8;
                            textStyle2 = textStyleA;
                            bVar4 = bVar2;
                            z11 = z9;
                            function5 = function3;
                            z12 = z32112;
                            nce nceVar11112 = nceVarC;
                            imeOptions3 = imeOptionsA;
                            qu0Var2 = solidColor;
                            nceVar3 = nceVar11112;
                            i42 = i33;
                            if (i36 != 0) {
                                uVar3 = null;
                            } else {
                                uVar3 = uVar;
                            }
                        } else {
                            if (i49 != 0) {
                                bVar2 = androidx.compose.ui.b.INSTANCE;
                            }
                            if (i7 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i9 != 0) {
                                nceVarC = nce.INSTANCE.c();
                            }
                            if (i11 != 0) {
                                objR = dVarF.R();
                                if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                    objR = new Function1() { // from class: com.google.android.m82
                                        public final Object invoke(Object obj) {
                                            return CoreTextFieldKt.x((TextLayoutResult) obj);
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function3 = (Function1) objR;
                            }
                            if (i13 != 0) {
                                r48Var2 = null;
                            }
                            if (i15 != 0) {
                                solidColor = new SolidColor(ei1.INSTANCE.i(), null);
                            }
                            if (i17 != 0) {
                                z8 = true;
                            } else {
                                z8 = z;
                            }
                            if (i19 != 0) {
                                i40 = Integer.MAX_VALUE;
                            } else {
                                i40 = i;
                            }
                            if (i21 != 0) {
                                i41 = 1;
                            } else {
                                i41 = i2;
                            }
                            if ((i5 & 2048) != 0) {
                                imeOptionsA = ImeOptions.INSTANCE.a();
                                i33 &= -113;
                            } else {
                                imeOptionsA = imeOptions;
                            }
                            if (i25 != 0) {
                                mVarA = m.INSTANCE.a();
                            } else {
                                mVarA = mVar;
                            }
                            if (i28 != 0) {
                                z9 = true;
                            } else {
                                z9 = z2;
                            }
                            if (i31 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if (i34 != 0) {
                                ps4VarB = zo1.a.b();
                            } else {
                                ps4VarB = ps4Var;
                            }
                            boolean z32113 = z8;
                            textStyle2 = textStyleA;
                            bVar4 = bVar2;
                            z11 = z9;
                            function5 = function3;
                            z12 = z32113;
                            nce nceVar11113 = nceVarC;
                            imeOptions3 = imeOptionsA;
                            qu0Var2 = solidColor;
                            nceVar3 = nceVar11113;
                            i42 = i33;
                            if (i36 != 0) {
                                uVar3 = null;
                            } else {
                                uVar3 = uVar;
                            }
                        }
                        dVarF.M();
                        qu0Var3 = qu0Var2;
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(31062401, i6, i42, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                        }
                        objR2 = dVarF.R();
                        companion = androidx.compose.p004runtime.d.INSTANCE;
                        if (objR2 == companion.a()) {
                            objR2 = new androidx.compose.ui.focus.f();
                            dVarF.L(objR2);
                        }
                        fVar = (androidx.compose.ui.focus.f) objR2;
                        objR3 = dVarF.R();
                        i43 = i6;
                        if (objR3 == companion.a()) {
                            objR3 = LegacyPlatformTextInputServiceAdapter_androidKt.b();
                            dVarF.L(objR3);
                        }
                        bVar5 = (androidx.compose.p001foundation.text.input.internal.b) objR3;
                        objR4 = dVarF.R();
                        if (objR4 == companion.a()) {
                            objR4 = new dxc(bVar5);
                            dVarF.L(objR4);
                        }
                        dxcVar = (dxc) objR4;
                        f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                        bVar6 = (l.b) dVarF.v(CompositionLocalsKt.i());
                        selectionBackgroundColor = ((SelectionColors) dVarF.v(jzc.c())).getSelectionBackgroundColor();
                        ok4Var = (ok4) dVarF.v(CompositionLocalsKt.h());
                        a0Var = (a0) dVarF.v(CompositionLocalsKt.v());
                        textStyle4 = textStyle2;
                        hybVar = (hyb) dVarF.v(CompositionLocalsKt.r());
                        z13 = z12;
                        if (i40 == 1) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Vertical;
                        }
                        if (uVar3 == null) {
                            dVarF.y(-213744626);
                            Object[] objArr14 = {orientation};
                            k0b<u, Object> k0bVarA14 = u.INSTANCE.a();
                            zC = dVarF.C(orientation.ordinal());
                            objR18 = dVarF.R();
                            if (zC) {
                                objR18 = new Function0() { // from class: com.google.android.d92
                                    public final Object invoke() {
                                        return CoreTextFieldKt.O(orientation);
                                    }
                                };
                                dVarF.L(objR18);
                            } else {
                                objR18 = new Function0() { // from class: com.google.android.d92
                                    public final Object invoke() {
                                        return CoreTextFieldKt.O(orientation);
                                    }
                                };
                                dVarF.L(objR18);
                            }
                            uVar4 = (u) dfa.k(objArr14, k0bVarA14, (Function0) objR18, dVarF, 0);
                            dVarF.u();
                        } else {
                            dVarF.y(-213745742);
                            dVarF.u();
                            uVar4 = uVar3;
                        }
                        if (uVar4.j() != orientation) {
                            StringBuilder sb14 = new StringBuilder();
                            sb14.append("Mismatching scroller orientation; ");
                            if (orientation == Orientation.Vertical) {
                                str = "only single-line, non-wrap text fields can scroll horizontally";
                            } else {
                                str = "single-line, non-wrap text fields can only scroll horizontally";
                            }
                            sb14.append(str);
                            throw new IllegalArgumentException(sb14.toString());
                        }
                        i44 = i43 & 14;
                        if (i44 == 4) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i43 & 57344) == 16384) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objR5 = dVarF.R();
                        if (z16) {
                            transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                            composition = textFieldValue.getComposition();
                            if (composition != null) {
                                uVar5 = uVar4;
                                transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                if (transformedTextC2 != null) {
                                    objR5 = transformedTextC2;
                                }
                                dVarF.L(objR5);
                            } else {
                                uVar5 = uVar4;
                            }
                            objR5 = transformedTextC;
                            dVarF.L(objR5);
                        } else {
                            transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                            composition = textFieldValue.getComposition();
                            if (composition != null) {
                                uVar5 = uVar4;
                                transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                if (transformedTextC2 != null) {
                                    objR5 = transformedTextC2;
                                }
                                dVarF.L(objR5);
                            } else {
                                uVar5 = uVar4;
                            }
                            objR5 = transformedTextC;
                            dVarF.L(objR5);
                        }
                        TransformedText transformedText14 = (TransformedText) objR5;
                        text = transformedText14.getText();
                        offsetMapping = transformedText14.getOffsetMapping();
                        qaaVarC = pp1.c(dVarF, 0);
                        zX = dVarF.x(hybVar);
                        objR6 = dVarF.R();
                        if (zX) {
                            objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                            dVarF.L(objR6);
                        } else {
                            objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                            dVarF.L(objR6);
                        }
                        k07Var = (k07) objR6;
                        m mVar16 = mVarA;
                        k07Var.X(textFieldValue.getText(), text, textStyle4, z13, r54, bVar6, function1, mVar16, ok4Var, selectionBackgroundColor);
                        k07Var.getProcessor().e(textFieldValue, k07Var.getInputSession());
                        objR7 = dVarF.R();
                        if (objR7 == companion.a()) {
                            objR7 = new rsd(0, 1, null);
                            dVarF.L(objR7);
                        }
                        rsdVar = (rsd) objR7;
                        rsd.f(rsdVar, textFieldValue, 0L, 2, null);
                        objR8 = dVarF.R();
                        if (objR8 == companion.a()) {
                            objR8 = vn3.k(EmptyCoroutineContext.a, dVarF);
                            dVarF.L(objR8);
                        }
                        ta2Var = (ta2) objR8;
                        objR9 = dVarF.R();
                        if (objR9 == companion.a()) {
                            objR9 = androidx.compose.p001foundation.relocation.c.a();
                            dVarF.L(objR9);
                        }
                        cu0Var = (cu0) objR9;
                        objR10 = dVarF.R();
                        r48 r48Var16 = r48Var2;
                        if (objR10 == companion.a()) {
                            objR10 = new TextFieldSelectionManager(rsdVar);
                            dVarF.L(objR10);
                        }
                        textFieldSelectionManager = (TextFieldSelectionManager) objR10;
                        textFieldSelectionManager.L0(offsetMapping);
                        textFieldSelectionManager.U0(nceVar3);
                        textFieldSelectionManager.M0(k07Var.r());
                        textFieldSelectionManager.Q0(k07Var);
                        textFieldSelectionManager.T0(textFieldValue);
                        textFieldSelectionManager.z0((jf1) dVarF.v(CompositionLocalsKt.d()));
                        textFieldSelectionManager.A0(ta2Var);
                        textFieldSelectionManager.R0((yzc) dVarF.v(CompositionLocalsKt.s()));
                        textFieldSelectionManager.I0((c65) dVarF.v(CompositionLocalsKt.k()));
                        textFieldSelectionManager.G0(fVar);
                        textFieldSelectionManager.E0(!z10);
                        textFieldSelectionManager.F0(z11);
                        if (up1.isSmartSelectionEnabled) {
                            dVarF.y(1966756105);
                            textFieldSelectionManager.N0(androidx.compose.p001foundation.text.selection.c.h(SelectedTextType.EditableText, textStyle4.u(), dVarF, 6));
                            dVarF.u();
                        } else {
                            dVarF.y(1966902177);
                            dVarF.u();
                        }
                        k07Var.h();
                        new Function1() { // from class: com.google.android.e92
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.y(textFieldSelectionManager, (b) obj);
                            }
                        };
                        new Function0() { // from class: com.google.android.f92
                            public final Object invoke() {
                                return CoreTextFieldKt.z(textFieldSelectionManager);
                            }
                        };
                        new Function0() { // from class: com.google.android.g92
                            public final Object invoke() {
                                return CoreTextFieldKt.A(textFieldSelectionManager);
                            }
                        };
                        companion2 = androidx.compose.ui.b.INSTANCE;
                        boolean zT1111111 = dVarF.T(k07Var);
                        i45 = i42 & 7168;
                        i46 = i42;
                        if (i45 == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        boolean z311111111110 = z17 | zT1111111;
                        if ((i46 & 57344) == 16384) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        boolean zT1111112 = z311111111110 | z18 | dVarF.T(dxcVar);
                        if (i44 == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean z311111111111 = zT1111112 | z19;
                        i47 = (i46 & 112) ^ 48;
                        if (i47 > 32) {
                            dxcVar2 = dxcVar;
                            if ((i46 & 48) != 32) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                        } else {
                            dxcVar2 = dxcVar;
                            if ((i46 & 48) != 32) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                        }
                        zT = z311111111111 | z20 | dVarF.T(offsetMapping) | dVarF.T(ta2Var) | dVarF.T(cu0Var) | dVarF.T(textFieldSelectionManager);
                        objR11 = dVarF.R();
                        if (zT) {
                            zn8Var = offsetMapping;
                            final ImeOptions imeOptions1111114 = imeOptions3;
                            final boolean z311111111112 = z11;
                            final boolean z311111111113 = z10;
                            objR11 = new Function1() { // from class: com.google.android.h92
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.B(k07Var, z311111111112, z311111111113, dxcVar2, textFieldValue, imeOptions1111114, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                                }
                            };
                            k07Var2 = k07Var;
                            z21 = z311111111112;
                            textFieldValue2 = textFieldValue;
                            imeOptions4 = imeOptions1111114;
                            textFieldSelectionManager2 = textFieldSelectionManager;
                            ta2Var2 = ta2Var;
                            cu0Var2 = cu0Var;
                            dVarF.L(objR11);
                        } else {
                            zn8Var = offsetMapping;
                            final ImeOptions imeOptions1111115 = imeOptions3;
                            final boolean z311111111114 = z11;
                            final boolean z311111111115 = z10;
                            objR11 = new Function1() { // from class: com.google.android.h92
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.B(k07Var, z311111111114, z311111111115, dxcVar2, textFieldValue, imeOptions1111115, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                                }
                            };
                            k07Var2 = k07Var;
                            z21 = z311111111114;
                            textFieldValue2 = textFieldValue;
                            imeOptions4 = imeOptions1111115;
                            textFieldSelectionManager2 = textFieldSelectionManager;
                            ta2Var2 = ta2Var;
                            cu0Var2 = cu0Var;
                            dVarF.L(objR11);
                        }
                        final cu0 cu0Var17 = cu0Var2;
                        androidx.compose.ui.b bVarA11111113 = atc.a(companion2, z21, fVar, r48Var16, (Function1) objR11);
                        if (z21) {
                            z22 = false;
                        } else {
                            z22 = false;
                        }
                        q6cVarR = p0.r(Boolean.valueOf(z22), dVarF, 0);
                        Unit unit15 = Unit.a;
                        boolean zX1111 = dVarF.x(q6cVarR) | dVarF.T(k07Var2) | dVarF.T(dxcVar2) | dVarF.T(textFieldSelectionManager2);
                        if (i47 > 32) {
                            imeOptions5 = imeOptions4;
                            if ((i46 & 48) != 32) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                        } else {
                            imeOptions5 = imeOptions4;
                            if ((i46 & 48) != 32) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                        }
                        z24 = zX1111 | z23;
                        objR12 = dVarF.R();
                        if (z24) {
                            ImeOptions imeOptions1111116 = imeOptions5;
                            dxc dxcVar1112 = dxcVar2;
                            TextFieldSelectionManager textFieldSelectionManager1116 = textFieldSelectionManager2;
                            k07 k07Var1115 = k07Var2;
                            objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var1115, q6cVarR, dxcVar1112, textFieldSelectionManager1116, imeOptions1111116, null);
                            k07Var3 = k07Var1115;
                            textFieldSelectionManager3 = textFieldSelectionManager1116;
                            imeOptions6 = imeOptions1111116;
                            dVarF.L(objR12);
                        } else {
                            ImeOptions imeOptions1111117 = imeOptions5;
                            dxc dxcVar1113 = dxcVar2;
                            TextFieldSelectionManager textFieldSelectionManager1117 = textFieldSelectionManager2;
                            k07 k07Var1116 = k07Var2;
                            objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var1116, q6cVarR, dxcVar1113, textFieldSelectionManager1117, imeOptions1111117, null);
                            k07Var3 = k07Var1116;
                            textFieldSelectionManager3 = textFieldSelectionManager1117;
                            imeOptions6 = imeOptions1111117;
                            dVarF.L(objR12);
                        }
                        imeOptions7 = imeOptions6;
                        vn3.g(unit15, (Function2) objR12, dVarF, 6);
                        int i51110 = i46 >> 3;
                        z25 = z21;
                        k07Var4 = k07Var3;
                        textFieldSelectionManager4 = textFieldSelectionManager3;
                        androidx.compose.ui.b bVarA11111114 = huc.a(companion2, textFieldSelectionManager4, z25, r48Var16, k07Var4, fVar, z10, zn8Var, dVarF, (i51110 & 896) | 196614 | ((i43 >> 9) & 7168) | ((i46 << 6) & 3670016));
                        zn8Var2 = zn8Var;
                        final androidx.compose.ui.b bVarB11116 = y92.b(companion2, k07Var4, textFieldValue2, zn8Var2);
                        boolean zT1111113 = dVarF.T(k07Var4);
                        if (i45 == 2048) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        boolean zX1112 = zT1111113 | z26 | dVarF.x(a0Var) | dVarF.T(textFieldSelectionManager4);
                        if (i44 == 4) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        zT2 = zX1112 | z27 | dVarF.T(zn8Var2);
                        objR13 = dVarF.R();
                        if (zT2) {
                            objR13 = new Function1() { // from class: com.google.android.n82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                                }
                            };
                            a0Var2 = a0Var;
                            textFieldSelectionManager5 = textFieldSelectionManager4;
                            dVarF.L(objR13);
                        } else {
                            objR13 = new Function1() { // from class: com.google.android.n82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                                }
                            };
                            a0Var2 = a0Var;
                            textFieldSelectionManager5 = textFieldSelectionManager4;
                            dVarF.L(objR13);
                        }
                        final androidx.compose.ui.b bVarA11111115 = xq8.a(companion2, (Function1) objR13);
                        textFieldSelectionManager6 = textFieldSelectionManager5;
                        CoreTextFieldSemanticsModifier j92Var16 = new CoreTextFieldSemanticsModifier(transformedText14, textFieldValue, k07Var4, z10, z25, nceVar3 instanceof a39, zn8Var2, textFieldSelectionManager6, imeOptions7, fVar);
                        a0 a0Var18 = a0Var2;
                        if (z25 != 0) {
                            z28 = false;
                        } else {
                            z28 = false;
                        }
                        final androidx.compose.ui.b bVarA11111116 = y92.a(companion2, k07Var4, textFieldValue, zn8Var2, qu0Var3, z28);
                        final nce nceVar11114 = nceVar3;
                        zT3 = dVarF.T(textFieldSelectionManager6);
                        objR14 = dVarF.R();
                        if (zT3) {
                            objR14 = new Function1() { // from class: com.google.android.o82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                                }
                            };
                            dVarF.L(objR14);
                        } else {
                            objR14 = new Function1() { // from class: com.google.android.o82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                                }
                            };
                            dVarF.L(objR14);
                        }
                        vn3.c(textFieldSelectionManager6, (Function1) objR14, dVarF, 0);
                        boolean zT1111114 = dVarF.T(k07Var4) | dVarF.T(dxcVar2);
                        if (i44 == 4) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        z30 = z29 | zT1111114 | ((i47 <= 32 && dVarF.x(imeOptions7)) || (i46 & 48) == 32);
                        objR15 = dVarF.R();
                        if (z30) {
                            objR15 = new Function1() { // from class: com.google.android.p82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                                }
                            };
                            dVarF.L(objR15);
                        } else {
                            objR15 = new Function1() { // from class: com.google.android.p82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                                }
                            };
                            dVarF.L(objR15);
                        }
                        vn3.c(imeOptions7, (Function1) objR15, dVarF, i51110 & 14);
                        Function1<TextFieldValue, Unit> function1R16 = k07Var4.r();
                        boolean z311111111116 = !z10;
                        i48 = i40;
                        if (i48 == 1) {
                            z31 = true;
                        } else {
                            z31 = false;
                        }
                        androidx.compose.ui.b bVarB11117 = TextFieldKeyInputKt.b(companion2, k07Var4, textFieldSelectionManager6, textFieldValue, function1R16, z311111111116, z31, zn8Var2, rsdVar, imeOptions7.getImeAction());
                        keyboardType = imeOptions7.getKeyboardType();
                        companion3 = androidx.compose.ui.text.input.d.INSTANCE;
                        if (androidx.compose.ui.text.input.d.n(keyboardType, companion3.f())) {
                            z32 = false;
                        } else {
                            z32 = false;
                        }
                        boolean zC17 = C(q6cVarR);
                        zA = dVarF.A(z32) | dVarF.T(bVar5);
                        objR16 = dVarF.R();
                        if (zA) {
                            objR16 = new Function0() { // from class: com.google.android.q82
                                public final Object invoke() {
                                    return CoreTextFieldKt.G(z32, bVar5);
                                }
                            };
                            dVarF.L(objR16);
                        } else {
                            objR16 = new Function0() { // from class: com.google.android.q82
                                public final Object invoke() {
                                    return CoreTextFieldKt.G(z32, bVar5);
                                }
                            };
                            dVarF.L(objR16);
                        }
                        androidx.compose.ui.b bVarB11118 = hcc.b(companion2, zC17, z32, (Function0) objR16);
                        ta2 ta2Var18 = ta2Var2;
                        qu0VarE = ma0.e((qu0) dVarF.v(ma0.c()), ((ei1) dVarF.v(ma0.d())).getValue(), na0.a());
                        zT4 = dVarF.T(k07Var4) | dVarF.x(qu0VarE);
                        objR17 = dVarF.R();
                        if (zT4) {
                            objR17 = new Function1() { // from class: com.google.android.x82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                                }
                            };
                            dVarF.L(objR17);
                        } else {
                            objR17 = new Function1() { // from class: com.google.android.x82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                                }
                            };
                            dVarF.L(objR17);
                        }
                        androidx.compose.ui.b bVarD16 = androidx.compose.ui.draw.c.d(companion2, (Function1) objR17);
                        zv8 zv8VarA16 = tuc.a(dVarF, 0);
                        androidx.compose.ui.b bVar1117 = bVar4;
                        androidx.compose.ui.b bVarThen16 = g0(zsc.b(yz6.a(bVar1117.then(bVarD16), bVar5, k07Var4, textFieldSelectionManager6).then(bVarB11118).then(bVarA11111113), k07Var4, ok4Var), k07Var4, textFieldSelectionManager6).then(bVarB11117);
                        final u uVar111 = uVar5;
                        androidx.compose.ui.b bVarA11111117 = a0(xq8.a(TextFieldScrollKt.f(bVarThen16, uVar111, r48Var16, z25, zv8VarA16).then(bVarA11111114).then(j92Var16), new Function1() { // from class: com.google.android.a92
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.I(k07Var4, (kn6) obj);
                            }
                        }), textFieldSelectionManager6, ta2Var18);
                        if (!z25) {
                            z33 = false;
                        } else {
                            z33 = false;
                        }
                        if (z33) {
                            bVarZ = TextFieldSelectionManager_androidKt.z(companion2, textFieldSelectionManager6);
                        } else {
                            bVarZ = companion2;
                        }
                        final ps4 ps4Var18 = ps4VarB;
                        final androidx.compose.ui.b bVar1118 = bVarZ;
                        final boolean z41110 = z10;
                        final boolean z41111 = z33;
                        final int i51111 = i41;
                        P(bVarA11111117, textFieldSelectionManager6, ko1.e(-814563849, true, new Function2() { // from class: com.google.android.b92
                            public final Object invoke(Object obj, Object obj2) {
                                return CoreTextFieldKt.J(ps4Var18, k07Var4, textStyle4, i51111, i48, uVar111, textFieldValue, nceVar11114, bVarA11111116, bVarB11116, bVarA11111115, bVar1118, cu0Var17, textFieldSelectionManager6, z41111, z41110, function5, zn8Var2, f43Var, (d) obj, ((Integer) obj2).intValue());
                            }
                        }, dVarF, 54), dVarF, 384);
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                        ps4Var2 = ps4Var18;
                        dVar2 = dVarF;
                        function4 = function5;
                        z7 = z41110;
                        uVar2 = uVar3;
                        z6 = z25;
                        r48Var2 = r48Var16;
                        z5 = z13;
                        mVar2 = mVar16;
                        i39 = i41;
                        solidColor = qu0Var3;
                        bVar3 = bVar1117;
                        i38 = i48;
                        nceVar2 = nceVar11114;
                        textStyle3 = textStyle4;
                        imeOptions2 = imeOptions7;
                    } else {
                        dVarF.q();
                        z5 = z;
                        imeOptions2 = imeOptions;
                        mVar2 = mVar;
                        ps4Var2 = ps4Var;
                        uVar2 = uVar;
                        dVar2 = dVarF;
                        textStyle3 = textStyle2;
                        function4 = function3;
                        nceVar2 = nceVarC;
                        bVar3 = bVar2;
                        i38 = i;
                        i39 = i2;
                        z6 = z2;
                        z7 = z3;
                    }
                    s6bVarH = dVar2.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2() { // from class: com.google.android.c92
                            public final Object invoke(Object obj, Object obj2) {
                                return CoreTextFieldKt.N(textFieldValue, function1, bVar3, textStyle3, nceVar2, function4, r48Var2, solidColor, z5, i38, i39, imeOptions2, mVar2, z6, z7, ps4Var2, uVar2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i6 |= 805306368;
                i21 = i5 & 1024;
                if (i21 != 0) {
                    i22 = i4 | 6;
                } else if ((i4 & 6) == 0) {
                    if (dVarF.C(i2)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i4 | i23;
                } else {
                    i22 = i4;
                }
                if ((i4 & 48) != 0) {
                    i22 |= ((i5 & 2048) == 0 || !dVarF.x(imeOptions)) ? 16 : 32;
                }
                i24 = i22;
                i25 = i5 & 4096;
                if (i25 != 0) {
                    i26 = i24 | 384;
                } else if ((i4 & 384) == 0) {
                    if (dVarF.x(mVar)) {
                        i27 = 256;
                    } else {
                        i27 = 128;
                    }
                    i26 = i24 | i27;
                } else {
                    i26 = i24;
                }
                i28 = i5 & 8192;
                if (i28 != 0) {
                    i30 = i26 | 3072;
                } else {
                    i29 = i26;
                    if ((i4 & 3072) == 0) {
                        i30 = i29 | (dVarF.A(z2) ? 2048 : 1024);
                    } else {
                        i30 = i29;
                    }
                }
                i31 = i5 & 16384;
                if (i31 != 0) {
                    i33 = i30 | 24576;
                } else {
                    i32 = i30;
                    if ((i4 & 24576) == 0) {
                        i33 = i32 | (dVarF.A(z3) ? 16384 : 8192);
                    } else {
                        i33 = i32;
                    }
                }
                i34 = i5 & 32768;
                if (i34 != 0) {
                    i33 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i35 = 131072;
                    } else {
                        i35 = 65536;
                    }
                    i33 |= i35;
                }
                i36 = i5 & 65536;
                if (i36 != 0) {
                    i33 |= 1572864;
                } else if ((i4 & 1572864) == 0) {
                    if (dVarF.x(uVar)) {
                        i37 = 1048576;
                    } else {
                        i37 = 524288;
                    }
                    i33 |= i37;
                }
                if ((i6 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (dVarF.g(z4, i6 & 1)) {
                    dVarF.U();
                    if ((i3 & 1) != 0) {
                        if (i49 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i7 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i9 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        }
                        if (i11 != 0) {
                            objR = dVarF.R();
                            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.m82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.x((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function3 = (Function1) objR;
                        }
                        if (i13 != 0) {
                            r48Var2 = null;
                        }
                        if (i15 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.i(), null);
                        }
                        if (i17 != 0) {
                            z8 = true;
                        } else {
                            z8 = z;
                        }
                        if (i19 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i;
                        }
                        if (i21 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i2;
                        }
                        if ((i5 & 2048) != 0) {
                            imeOptionsA = ImeOptions.INSTANCE.a();
                            i33 &= -113;
                        } else {
                            imeOptionsA = imeOptions;
                        }
                        if (i25 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar;
                        }
                        if (i28 != 0) {
                            z9 = true;
                        } else {
                            z9 = z2;
                        }
                        if (i31 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if (i34 != 0) {
                            ps4VarB = zo1.a.b();
                        } else {
                            ps4VarB = ps4Var;
                        }
                        boolean z32114 = z8;
                        textStyle2 = textStyleA;
                        bVar4 = bVar2;
                        z11 = z9;
                        function5 = function3;
                        z12 = z32114;
                        nce nceVar11115 = nceVarC;
                        imeOptions3 = imeOptionsA;
                        qu0Var2 = solidColor;
                        nceVar3 = nceVar11115;
                        i42 = i33;
                        if (i36 != 0) {
                            uVar3 = null;
                        } else {
                            uVar3 = uVar;
                        }
                    } else {
                        if (i49 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i7 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i9 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        }
                        if (i11 != 0) {
                            objR = dVarF.R();
                            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.m82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.x((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function3 = (Function1) objR;
                        }
                        if (i13 != 0) {
                            r48Var2 = null;
                        }
                        if (i15 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.i(), null);
                        }
                        if (i17 != 0) {
                            z8 = true;
                        } else {
                            z8 = z;
                        }
                        if (i19 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i;
                        }
                        if (i21 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i2;
                        }
                        if ((i5 & 2048) != 0) {
                            imeOptionsA = ImeOptions.INSTANCE.a();
                            i33 &= -113;
                        } else {
                            imeOptionsA = imeOptions;
                        }
                        if (i25 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar;
                        }
                        if (i28 != 0) {
                            z9 = true;
                        } else {
                            z9 = z2;
                        }
                        if (i31 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if (i34 != 0) {
                            ps4VarB = zo1.a.b();
                        } else {
                            ps4VarB = ps4Var;
                        }
                        boolean z32115 = z8;
                        textStyle2 = textStyleA;
                        bVar4 = bVar2;
                        z11 = z9;
                        function5 = function3;
                        z12 = z32115;
                        nce nceVar11116 = nceVarC;
                        imeOptions3 = imeOptionsA;
                        qu0Var2 = solidColor;
                        nceVar3 = nceVar11116;
                        i42 = i33;
                        if (i36 != 0) {
                            uVar3 = null;
                        } else {
                            uVar3 = uVar;
                        }
                    }
                    dVarF.M();
                    qu0Var3 = qu0Var2;
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(31062401, i6, i42, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                    }
                    objR2 = dVarF.R();
                    companion = androidx.compose.p004runtime.d.INSTANCE;
                    if (objR2 == companion.a()) {
                        objR2 = new androidx.compose.ui.focus.f();
                        dVarF.L(objR2);
                    }
                    fVar = (androidx.compose.ui.focus.f) objR2;
                    objR3 = dVarF.R();
                    i43 = i6;
                    if (objR3 == companion.a()) {
                        objR3 = LegacyPlatformTextInputServiceAdapter_androidKt.b();
                        dVarF.L(objR3);
                    }
                    bVar5 = (androidx.compose.p001foundation.text.input.internal.b) objR3;
                    objR4 = dVarF.R();
                    if (objR4 == companion.a()) {
                        objR4 = new dxc(bVar5);
                        dVarF.L(objR4);
                    }
                    dxcVar = (dxc) objR4;
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    bVar6 = (l.b) dVarF.v(CompositionLocalsKt.i());
                    selectionBackgroundColor = ((SelectionColors) dVarF.v(jzc.c())).getSelectionBackgroundColor();
                    ok4Var = (ok4) dVarF.v(CompositionLocalsKt.h());
                    a0Var = (a0) dVarF.v(CompositionLocalsKt.v());
                    textStyle4 = textStyle2;
                    hybVar = (hyb) dVarF.v(CompositionLocalsKt.r());
                    z13 = z12;
                    if (i40 == 1) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Vertical;
                    }
                    if (uVar3 == null) {
                        dVarF.y(-213744626);
                        Object[] objArr15 = {orientation};
                        k0b<u, Object> k0bVarA15 = u.INSTANCE.a();
                        zC = dVarF.C(orientation.ordinal());
                        objR18 = dVarF.R();
                        if (zC) {
                            objR18 = new Function0() { // from class: com.google.android.d92
                                public final Object invoke() {
                                    return CoreTextFieldKt.O(orientation);
                                }
                            };
                            dVarF.L(objR18);
                        } else {
                            objR18 = new Function0() { // from class: com.google.android.d92
                                public final Object invoke() {
                                    return CoreTextFieldKt.O(orientation);
                                }
                            };
                            dVarF.L(objR18);
                        }
                        uVar4 = (u) dfa.k(objArr15, k0bVarA15, (Function0) objR18, dVarF, 0);
                        dVarF.u();
                    } else {
                        dVarF.y(-213745742);
                        dVarF.u();
                        uVar4 = uVar3;
                    }
                    if (uVar4.j() != orientation) {
                        StringBuilder sb15 = new StringBuilder();
                        sb15.append("Mismatching scroller orientation; ");
                        if (orientation == Orientation.Vertical) {
                            str = "only single-line, non-wrap text fields can scroll horizontally";
                        } else {
                            str = "single-line, non-wrap text fields can only scroll horizontally";
                        }
                        sb15.append(str);
                        throw new IllegalArgumentException(sb15.toString());
                    }
                    i44 = i43 & 14;
                    if (i44 == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i43 & 57344) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z14 | z15;
                    objR5 = dVarF.R();
                    if (z16) {
                        transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                        composition = textFieldValue.getComposition();
                        if (composition != null) {
                            uVar5 = uVar4;
                            transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                            if (transformedTextC2 != null) {
                                objR5 = transformedTextC2;
                            }
                            dVarF.L(objR5);
                        } else {
                            uVar5 = uVar4;
                        }
                        objR5 = transformedTextC;
                        dVarF.L(objR5);
                    } else {
                        transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                        composition = textFieldValue.getComposition();
                        if (composition != null) {
                            uVar5 = uVar4;
                            transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                            if (transformedTextC2 != null) {
                                objR5 = transformedTextC2;
                            }
                            dVarF.L(objR5);
                        } else {
                            uVar5 = uVar4;
                        }
                        objR5 = transformedTextC;
                        dVarF.L(objR5);
                    }
                    TransformedText transformedText15 = (TransformedText) objR5;
                    text = transformedText15.getText();
                    offsetMapping = transformedText15.getOffsetMapping();
                    qaaVarC = pp1.c(dVarF, 0);
                    zX = dVarF.x(hybVar);
                    objR6 = dVarF.R();
                    if (zX) {
                        objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                        dVarF.L(objR6);
                    } else {
                        objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                        dVarF.L(objR6);
                    }
                    k07Var = (k07) objR6;
                    m mVar17 = mVarA;
                    k07Var.X(textFieldValue.getText(), text, textStyle4, z13, r54, bVar6, function1, mVar17, ok4Var, selectionBackgroundColor);
                    k07Var.getProcessor().e(textFieldValue, k07Var.getInputSession());
                    objR7 = dVarF.R();
                    if (objR7 == companion.a()) {
                        objR7 = new rsd(0, 1, null);
                        dVarF.L(objR7);
                    }
                    rsdVar = (rsd) objR7;
                    rsd.f(rsdVar, textFieldValue, 0L, 2, null);
                    objR8 = dVarF.R();
                    if (objR8 == companion.a()) {
                        objR8 = vn3.k(EmptyCoroutineContext.a, dVarF);
                        dVarF.L(objR8);
                    }
                    ta2Var = (ta2) objR8;
                    objR9 = dVarF.R();
                    if (objR9 == companion.a()) {
                        objR9 = androidx.compose.p001foundation.relocation.c.a();
                        dVarF.L(objR9);
                    }
                    cu0Var = (cu0) objR9;
                    objR10 = dVarF.R();
                    r48 r48Var17 = r48Var2;
                    if (objR10 == companion.a()) {
                        objR10 = new TextFieldSelectionManager(rsdVar);
                        dVarF.L(objR10);
                    }
                    textFieldSelectionManager = (TextFieldSelectionManager) objR10;
                    textFieldSelectionManager.L0(offsetMapping);
                    textFieldSelectionManager.U0(nceVar3);
                    textFieldSelectionManager.M0(k07Var.r());
                    textFieldSelectionManager.Q0(k07Var);
                    textFieldSelectionManager.T0(textFieldValue);
                    textFieldSelectionManager.z0((jf1) dVarF.v(CompositionLocalsKt.d()));
                    textFieldSelectionManager.A0(ta2Var);
                    textFieldSelectionManager.R0((yzc) dVarF.v(CompositionLocalsKt.s()));
                    textFieldSelectionManager.I0((c65) dVarF.v(CompositionLocalsKt.k()));
                    textFieldSelectionManager.G0(fVar);
                    textFieldSelectionManager.E0(!z10);
                    textFieldSelectionManager.F0(z11);
                    if (up1.isSmartSelectionEnabled) {
                        dVarF.y(1966756105);
                        textFieldSelectionManager.N0(androidx.compose.p001foundation.text.selection.c.h(SelectedTextType.EditableText, textStyle4.u(), dVarF, 6));
                        dVarF.u();
                    } else {
                        dVarF.y(1966902177);
                        dVarF.u();
                    }
                    k07Var.h();
                    new Function1() { // from class: com.google.android.e92
                        public final Object invoke(Object obj) {
                            return CoreTextFieldKt.y(textFieldSelectionManager, (b) obj);
                        }
                    };
                    new Function0() { // from class: com.google.android.f92
                        public final Object invoke() {
                            return CoreTextFieldKt.z(textFieldSelectionManager);
                        }
                    };
                    new Function0() { // from class: com.google.android.g92
                        public final Object invoke() {
                            return CoreTextFieldKt.A(textFieldSelectionManager);
                        }
                    };
                    companion2 = androidx.compose.ui.b.INSTANCE;
                    boolean zT1111115 = dVarF.T(k07Var);
                    i45 = i42 & 7168;
                    i46 = i42;
                    if (i45 == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z311111111117 = z17 | zT1111115;
                    if ((i46 & 57344) == 16384) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean zT1111116 = z311111111117 | z18 | dVarF.T(dxcVar);
                    if (i44 == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z311111111118 = zT1111116 | z19;
                    i47 = (i46 & 112) ^ 48;
                    if (i47 > 32) {
                        dxcVar2 = dxcVar;
                        if ((i46 & 48) != 32) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                    } else {
                        dxcVar2 = dxcVar;
                        if ((i46 & 48) != 32) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                    }
                    zT = z311111111118 | z20 | dVarF.T(offsetMapping) | dVarF.T(ta2Var) | dVarF.T(cu0Var) | dVarF.T(textFieldSelectionManager);
                    objR11 = dVarF.R();
                    if (zT) {
                        zn8Var = offsetMapping;
                        final ImeOptions imeOptions1111118 = imeOptions3;
                        final boolean z311111111119 = z11;
                        final boolean z3111111111110 = z10;
                        objR11 = new Function1() { // from class: com.google.android.h92
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.B(k07Var, z311111111119, z3111111111110, dxcVar2, textFieldValue, imeOptions1111118, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                            }
                        };
                        k07Var2 = k07Var;
                        z21 = z311111111119;
                        textFieldValue2 = textFieldValue;
                        imeOptions4 = imeOptions1111118;
                        textFieldSelectionManager2 = textFieldSelectionManager;
                        ta2Var2 = ta2Var;
                        cu0Var2 = cu0Var;
                        dVarF.L(objR11);
                    } else {
                        zn8Var = offsetMapping;
                        final ImeOptions imeOptions1111119 = imeOptions3;
                        final boolean z3111111111111 = z11;
                        final boolean z3111111111112 = z10;
                        objR11 = new Function1() { // from class: com.google.android.h92
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.B(k07Var, z3111111111111, z3111111111112, dxcVar2, textFieldValue, imeOptions1111119, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                            }
                        };
                        k07Var2 = k07Var;
                        z21 = z3111111111111;
                        textFieldValue2 = textFieldValue;
                        imeOptions4 = imeOptions1111119;
                        textFieldSelectionManager2 = textFieldSelectionManager;
                        ta2Var2 = ta2Var;
                        cu0Var2 = cu0Var;
                        dVarF.L(objR11);
                    }
                    final cu0 cu0Var18 = cu0Var2;
                    androidx.compose.ui.b bVarA11111118 = atc.a(companion2, z21, fVar, r48Var17, (Function1) objR11);
                    if (z21) {
                        z22 = false;
                    } else {
                        z22 = false;
                    }
                    q6cVarR = p0.r(Boolean.valueOf(z22), dVarF, 0);
                    Unit unit16 = Unit.a;
                    boolean zX1113 = dVarF.x(q6cVarR) | dVarF.T(k07Var2) | dVarF.T(dxcVar2) | dVarF.T(textFieldSelectionManager2);
                    if (i47 > 32) {
                        imeOptions5 = imeOptions4;
                        if ((i46 & 48) != 32) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                    } else {
                        imeOptions5 = imeOptions4;
                        if ((i46 & 48) != 32) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                    }
                    z24 = zX1113 | z23;
                    objR12 = dVarF.R();
                    if (z24) {
                        ImeOptions imeOptions11111110 = imeOptions5;
                        dxc dxcVar1114 = dxcVar2;
                        TextFieldSelectionManager textFieldSelectionManager1118 = textFieldSelectionManager2;
                        k07 k07Var1117 = k07Var2;
                        objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var1117, q6cVarR, dxcVar1114, textFieldSelectionManager1118, imeOptions11111110, null);
                        k07Var3 = k07Var1117;
                        textFieldSelectionManager3 = textFieldSelectionManager1118;
                        imeOptions6 = imeOptions11111110;
                        dVarF.L(objR12);
                    } else {
                        ImeOptions imeOptions11111111 = imeOptions5;
                        dxc dxcVar1115 = dxcVar2;
                        TextFieldSelectionManager textFieldSelectionManager1119 = textFieldSelectionManager2;
                        k07 k07Var1118 = k07Var2;
                        objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var1118, q6cVarR, dxcVar1115, textFieldSelectionManager1119, imeOptions11111111, null);
                        k07Var3 = k07Var1118;
                        textFieldSelectionManager3 = textFieldSelectionManager1119;
                        imeOptions6 = imeOptions11111111;
                        dVarF.L(objR12);
                    }
                    imeOptions7 = imeOptions6;
                    vn3.g(unit16, (Function2) objR12, dVarF, 6);
                    int i51112 = i46 >> 3;
                    z25 = z21;
                    k07Var4 = k07Var3;
                    textFieldSelectionManager4 = textFieldSelectionManager3;
                    androidx.compose.ui.b bVarA11111119 = huc.a(companion2, textFieldSelectionManager4, z25, r48Var17, k07Var4, fVar, z10, zn8Var, dVarF, (i51112 & 896) | 196614 | ((i43 >> 9) & 7168) | ((i46 << 6) & 3670016));
                    zn8Var2 = zn8Var;
                    final androidx.compose.ui.b bVarB11119 = y92.b(companion2, k07Var4, textFieldValue2, zn8Var2);
                    boolean zT1111117 = dVarF.T(k07Var4);
                    if (i45 == 2048) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    boolean zX1114 = zT1111117 | z26 | dVarF.x(a0Var) | dVarF.T(textFieldSelectionManager4);
                    if (i44 == 4) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    zT2 = zX1114 | z27 | dVarF.T(zn8Var2);
                    objR13 = dVarF.R();
                    if (zT2) {
                        objR13 = new Function1() { // from class: com.google.android.n82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                            }
                        };
                        a0Var2 = a0Var;
                        textFieldSelectionManager5 = textFieldSelectionManager4;
                        dVarF.L(objR13);
                    } else {
                        objR13 = new Function1() { // from class: com.google.android.n82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                            }
                        };
                        a0Var2 = a0Var;
                        textFieldSelectionManager5 = textFieldSelectionManager4;
                        dVarF.L(objR13);
                    }
                    final androidx.compose.ui.b bVarA111111110 = xq8.a(companion2, (Function1) objR13);
                    textFieldSelectionManager6 = textFieldSelectionManager5;
                    CoreTextFieldSemanticsModifier j92Var17 = new CoreTextFieldSemanticsModifier(transformedText15, textFieldValue, k07Var4, z10, z25, nceVar3 instanceof a39, zn8Var2, textFieldSelectionManager6, imeOptions7, fVar);
                    a0 a0Var19 = a0Var2;
                    if (z25 != 0) {
                        z28 = false;
                    } else {
                        z28 = false;
                    }
                    final androidx.compose.ui.b bVarA111111111 = y92.a(companion2, k07Var4, textFieldValue, zn8Var2, qu0Var3, z28);
                    final nce nceVar11117 = nceVar3;
                    zT3 = dVarF.T(textFieldSelectionManager6);
                    objR14 = dVarF.R();
                    if (zT3) {
                        objR14 = new Function1() { // from class: com.google.android.o82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                            }
                        };
                        dVarF.L(objR14);
                    } else {
                        objR14 = new Function1() { // from class: com.google.android.o82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                            }
                        };
                        dVarF.L(objR14);
                    }
                    vn3.c(textFieldSelectionManager6, (Function1) objR14, dVarF, 0);
                    boolean zT1111118 = dVarF.T(k07Var4) | dVarF.T(dxcVar2);
                    if (i44 == 4) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    z30 = z29 | zT1111118 | ((i47 <= 32 && dVarF.x(imeOptions7)) || (i46 & 48) == 32);
                    objR15 = dVarF.R();
                    if (z30) {
                        objR15 = new Function1() { // from class: com.google.android.p82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                            }
                        };
                        dVarF.L(objR15);
                    } else {
                        objR15 = new Function1() { // from class: com.google.android.p82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                            }
                        };
                        dVarF.L(objR15);
                    }
                    vn3.c(imeOptions7, (Function1) objR15, dVarF, i51112 & 14);
                    Function1<TextFieldValue, Unit> function1R17 = k07Var4.r();
                    boolean z3111111111113 = !z10;
                    i48 = i40;
                    if (i48 == 1) {
                        z31 = true;
                    } else {
                        z31 = false;
                    }
                    androidx.compose.ui.b bVarB111110 = TextFieldKeyInputKt.b(companion2, k07Var4, textFieldSelectionManager6, textFieldValue, function1R17, z3111111111113, z31, zn8Var2, rsdVar, imeOptions7.getImeAction());
                    keyboardType = imeOptions7.getKeyboardType();
                    companion3 = androidx.compose.ui.text.input.d.INSTANCE;
                    if (androidx.compose.ui.text.input.d.n(keyboardType, companion3.f())) {
                        z32 = false;
                    } else {
                        z32 = false;
                    }
                    boolean zC18 = C(q6cVarR);
                    zA = dVarF.A(z32) | dVarF.T(bVar5);
                    objR16 = dVarF.R();
                    if (zA) {
                        objR16 = new Function0() { // from class: com.google.android.q82
                            public final Object invoke() {
                                return CoreTextFieldKt.G(z32, bVar5);
                            }
                        };
                        dVarF.L(objR16);
                    } else {
                        objR16 = new Function0() { // from class: com.google.android.q82
                            public final Object invoke() {
                                return CoreTextFieldKt.G(z32, bVar5);
                            }
                        };
                        dVarF.L(objR16);
                    }
                    androidx.compose.ui.b bVarB111111 = hcc.b(companion2, zC18, z32, (Function0) objR16);
                    ta2 ta2Var19 = ta2Var2;
                    qu0VarE = ma0.e((qu0) dVarF.v(ma0.c()), ((ei1) dVarF.v(ma0.d())).getValue(), na0.a());
                    zT4 = dVarF.T(k07Var4) | dVarF.x(qu0VarE);
                    objR17 = dVarF.R();
                    if (zT4) {
                        objR17 = new Function1() { // from class: com.google.android.x82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                            }
                        };
                        dVarF.L(objR17);
                    } else {
                        objR17 = new Function1() { // from class: com.google.android.x82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                            }
                        };
                        dVarF.L(objR17);
                    }
                    androidx.compose.ui.b bVarD17 = androidx.compose.ui.draw.c.d(companion2, (Function1) objR17);
                    zv8 zv8VarA17 = tuc.a(dVarF, 0);
                    androidx.compose.ui.b bVar1119 = bVar4;
                    androidx.compose.ui.b bVarThen17 = g0(zsc.b(yz6.a(bVar1119.then(bVarD17), bVar5, k07Var4, textFieldSelectionManager6).then(bVarB111111).then(bVarA11111118), k07Var4, ok4Var), k07Var4, textFieldSelectionManager6).then(bVarB111110);
                    final u uVar112 = uVar5;
                    androidx.compose.ui.b bVarA111111112 = a0(xq8.a(TextFieldScrollKt.f(bVarThen17, uVar112, r48Var17, z25, zv8VarA17).then(bVarA11111119).then(j92Var17), new Function1() { // from class: com.google.android.a92
                        public final Object invoke(Object obj) {
                            return CoreTextFieldKt.I(k07Var4, (kn6) obj);
                        }
                    }), textFieldSelectionManager6, ta2Var19);
                    if (!z25) {
                        z33 = false;
                    } else {
                        z33 = false;
                    }
                    if (z33) {
                        bVarZ = TextFieldSelectionManager_androidKt.z(companion2, textFieldSelectionManager6);
                    } else {
                        bVarZ = companion2;
                    }
                    final ps4 ps4Var19 = ps4VarB;
                    final androidx.compose.ui.b bVar11110 = bVarZ;
                    final boolean z41112 = z10;
                    final boolean z41113 = z33;
                    final int i51113 = i41;
                    P(bVarA111111112, textFieldSelectionManager6, ko1.e(-814563849, true, new Function2() { // from class: com.google.android.b92
                        public final Object invoke(Object obj, Object obj2) {
                            return CoreTextFieldKt.J(ps4Var19, k07Var4, textStyle4, i51113, i48, uVar112, textFieldValue, nceVar11117, bVarA111111111, bVarB11119, bVarA111111110, bVar11110, cu0Var18, textFieldSelectionManager6, z41113, z41112, function5, zn8Var2, f43Var, (d) obj, ((Integer) obj2).intValue());
                        }
                    }, dVarF, 54), dVarF, 384);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    ps4Var2 = ps4Var19;
                    dVar2 = dVarF;
                    function4 = function5;
                    z7 = z41112;
                    uVar2 = uVar3;
                    z6 = z25;
                    r48Var2 = r48Var17;
                    z5 = z13;
                    mVar2 = mVar17;
                    i39 = i41;
                    solidColor = qu0Var3;
                    bVar3 = bVar1119;
                    i38 = i48;
                    nceVar2 = nceVar11117;
                    textStyle3 = textStyle4;
                    imeOptions2 = imeOptions7;
                } else {
                    dVarF.q();
                    z5 = z;
                    imeOptions2 = imeOptions;
                    mVar2 = mVar;
                    ps4Var2 = ps4Var;
                    uVar2 = uVar;
                    dVar2 = dVarF;
                    textStyle3 = textStyle2;
                    function4 = function3;
                    nceVar2 = nceVarC;
                    bVar3 = bVar2;
                    i38 = i;
                    i39 = i2;
                    z6 = z2;
                    z7 = z3;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.c92
                        public final Object invoke(Object obj, Object obj2) {
                            return CoreTextFieldKt.N(textFieldValue, function1, bVar3, textStyle3, nceVar2, function4, r48Var2, solidColor, z5, i38, i39, imeOptions2, mVar2, z6, z7, ps4Var2, uVar2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i6 |= 24576;
            nceVarC = nceVar;
            i11 = i5 & 32;
            if (i11 != 0) {
                i6 |= 196608;
                function3 = function2;
            } else {
                function3 = function2;
                if ((i3 & 196608) == 0) {
                    if (dVarF.T(function3)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i6 |= i12;
                }
            }
            i13 = i5 & 64;
            if (i13 != 0) {
                i6 |= 1572864;
                r48Var2 = r48Var;
            } else {
                r48Var2 = r48Var;
                if ((i3 & 1572864) == 0) {
                    if (dVarF.x(r48Var2)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i6 |= i14;
                }
            }
            i15 = i5 & 128;
            if (i15 != 0) {
                i6 |= 12582912;
                solidColor = qu0Var;
            } else {
                solidColor = qu0Var;
                if ((i3 & 12582912) == 0) {
                    if (dVarF.x(solidColor)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i6 |= i16;
                }
            }
            i17 = i5 & 256;
            if (i17 != 0) {
                i6 |= 100663296;
            } else if ((i3 & 100663296) == 0) {
                if (dVarF.A(z)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i6 |= i18;
            }
            i19 = i5 & 512;
            if (i19 != 0) {
                if ((i3 & 805306368) == 0) {
                    if (dVarF.C(i)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i6 |= i20;
                }
                i21 = i5 & 1024;
                if (i21 != 0) {
                    i22 = i4 | 6;
                } else if ((i4 & 6) == 0) {
                    if (dVarF.C(i2)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i4 | i23;
                } else {
                    i22 = i4;
                }
                if ((i4 & 48) != 0) {
                    i22 |= ((i5 & 2048) == 0 || !dVarF.x(imeOptions)) ? 16 : 32;
                }
                i24 = i22;
                i25 = i5 & 4096;
                if (i25 != 0) {
                    i26 = i24 | 384;
                } else if ((i4 & 384) == 0) {
                    if (dVarF.x(mVar)) {
                        i27 = 256;
                    } else {
                        i27 = 128;
                    }
                    i26 = i24 | i27;
                } else {
                    i26 = i24;
                }
                i28 = i5 & 8192;
                if (i28 != 0) {
                    i30 = i26 | 3072;
                } else {
                    i29 = i26;
                    if ((i4 & 3072) == 0) {
                        i30 = i29 | (dVarF.A(z2) ? 2048 : 1024);
                    } else {
                        i30 = i29;
                    }
                }
                i31 = i5 & 16384;
                if (i31 != 0) {
                    i33 = i30 | 24576;
                } else {
                    i32 = i30;
                    if ((i4 & 24576) == 0) {
                        i33 = i32 | (dVarF.A(z3) ? 16384 : 8192);
                    } else {
                        i33 = i32;
                    }
                }
                i34 = i5 & 32768;
                if (i34 != 0) {
                    i33 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i35 = 131072;
                    } else {
                        i35 = 65536;
                    }
                    i33 |= i35;
                }
                i36 = i5 & 65536;
                if (i36 != 0) {
                    i33 |= 1572864;
                } else if ((i4 & 1572864) == 0) {
                    if (dVarF.x(uVar)) {
                        i37 = 1048576;
                    } else {
                        i37 = 524288;
                    }
                    i33 |= i37;
                }
                if ((i6 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (dVarF.g(z4, i6 & 1)) {
                    dVarF.U();
                    if ((i3 & 1) != 0) {
                        if (i49 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i7 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i9 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        }
                        if (i11 != 0) {
                            objR = dVarF.R();
                            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.m82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.x((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function3 = (Function1) objR;
                        }
                        if (i13 != 0) {
                            r48Var2 = null;
                        }
                        if (i15 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.i(), null);
                        }
                        if (i17 != 0) {
                            z8 = true;
                        } else {
                            z8 = z;
                        }
                        if (i19 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i;
                        }
                        if (i21 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i2;
                        }
                        if ((i5 & 2048) != 0) {
                            imeOptionsA = ImeOptions.INSTANCE.a();
                            i33 &= -113;
                        } else {
                            imeOptionsA = imeOptions;
                        }
                        if (i25 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar;
                        }
                        if (i28 != 0) {
                            z9 = true;
                        } else {
                            z9 = z2;
                        }
                        if (i31 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if (i34 != 0) {
                            ps4VarB = zo1.a.b();
                        } else {
                            ps4VarB = ps4Var;
                        }
                        boolean z32116 = z8;
                        textStyle2 = textStyleA;
                        bVar4 = bVar2;
                        z11 = z9;
                        function5 = function3;
                        z12 = z32116;
                        nce nceVar11118 = nceVarC;
                        imeOptions3 = imeOptionsA;
                        qu0Var2 = solidColor;
                        nceVar3 = nceVar11118;
                        i42 = i33;
                        if (i36 != 0) {
                            uVar3 = null;
                        } else {
                            uVar3 = uVar;
                        }
                    } else {
                        if (i49 != 0) {
                            bVar2 = androidx.compose.ui.b.INSTANCE;
                        }
                        if (i7 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i9 != 0) {
                            nceVarC = nce.INSTANCE.c();
                        }
                        if (i11 != 0) {
                            objR = dVarF.R();
                            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR = new Function1() { // from class: com.google.android.m82
                                    public final Object invoke(Object obj) {
                                        return CoreTextFieldKt.x((TextLayoutResult) obj);
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function3 = (Function1) objR;
                        }
                        if (i13 != 0) {
                            r48Var2 = null;
                        }
                        if (i15 != 0) {
                            solidColor = new SolidColor(ei1.INSTANCE.i(), null);
                        }
                        if (i17 != 0) {
                            z8 = true;
                        } else {
                            z8 = z;
                        }
                        if (i19 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i;
                        }
                        if (i21 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i2;
                        }
                        if ((i5 & 2048) != 0) {
                            imeOptionsA = ImeOptions.INSTANCE.a();
                            i33 &= -113;
                        } else {
                            imeOptionsA = imeOptions;
                        }
                        if (i25 != 0) {
                            mVarA = m.INSTANCE.a();
                        } else {
                            mVarA = mVar;
                        }
                        if (i28 != 0) {
                            z9 = true;
                        } else {
                            z9 = z2;
                        }
                        if (i31 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if (i34 != 0) {
                            ps4VarB = zo1.a.b();
                        } else {
                            ps4VarB = ps4Var;
                        }
                        boolean z32117 = z8;
                        textStyle2 = textStyleA;
                        bVar4 = bVar2;
                        z11 = z9;
                        function5 = function3;
                        z12 = z32117;
                        nce nceVar11119 = nceVarC;
                        imeOptions3 = imeOptionsA;
                        qu0Var2 = solidColor;
                        nceVar3 = nceVar11119;
                        i42 = i33;
                        if (i36 != 0) {
                            uVar3 = null;
                        } else {
                            uVar3 = uVar;
                        }
                    }
                    dVarF.M();
                    qu0Var3 = qu0Var2;
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(31062401, i6, i42, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                    }
                    objR2 = dVarF.R();
                    companion = androidx.compose.p004runtime.d.INSTANCE;
                    if (objR2 == companion.a()) {
                        objR2 = new androidx.compose.ui.focus.f();
                        dVarF.L(objR2);
                    }
                    fVar = (androidx.compose.ui.focus.f) objR2;
                    objR3 = dVarF.R();
                    i43 = i6;
                    if (objR3 == companion.a()) {
                        objR3 = LegacyPlatformTextInputServiceAdapter_androidKt.b();
                        dVarF.L(objR3);
                    }
                    bVar5 = (androidx.compose.p001foundation.text.input.internal.b) objR3;
                    objR4 = dVarF.R();
                    if (objR4 == companion.a()) {
                        objR4 = new dxc(bVar5);
                        dVarF.L(objR4);
                    }
                    dxcVar = (dxc) objR4;
                    f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                    bVar6 = (l.b) dVarF.v(CompositionLocalsKt.i());
                    selectionBackgroundColor = ((SelectionColors) dVarF.v(jzc.c())).getSelectionBackgroundColor();
                    ok4Var = (ok4) dVarF.v(CompositionLocalsKt.h());
                    a0Var = (a0) dVarF.v(CompositionLocalsKt.v());
                    textStyle4 = textStyle2;
                    hybVar = (hyb) dVarF.v(CompositionLocalsKt.r());
                    z13 = z12;
                    if (i40 == 1) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Vertical;
                    }
                    if (uVar3 == null) {
                        dVarF.y(-213744626);
                        Object[] objArr16 = {orientation};
                        k0b<u, Object> k0bVarA16 = u.INSTANCE.a();
                        zC = dVarF.C(orientation.ordinal());
                        objR18 = dVarF.R();
                        if (zC) {
                            objR18 = new Function0() { // from class: com.google.android.d92
                                public final Object invoke() {
                                    return CoreTextFieldKt.O(orientation);
                                }
                            };
                            dVarF.L(objR18);
                        } else {
                            objR18 = new Function0() { // from class: com.google.android.d92
                                public final Object invoke() {
                                    return CoreTextFieldKt.O(orientation);
                                }
                            };
                            dVarF.L(objR18);
                        }
                        uVar4 = (u) dfa.k(objArr16, k0bVarA16, (Function0) objR18, dVarF, 0);
                        dVarF.u();
                    } else {
                        dVarF.y(-213745742);
                        dVarF.u();
                        uVar4 = uVar3;
                    }
                    if (uVar4.j() != orientation) {
                        StringBuilder sb16 = new StringBuilder();
                        sb16.append("Mismatching scroller orientation; ");
                        if (orientation == Orientation.Vertical) {
                            str = "only single-line, non-wrap text fields can scroll horizontally";
                        } else {
                            str = "single-line, non-wrap text fields can only scroll horizontally";
                        }
                        sb16.append(str);
                        throw new IllegalArgumentException(sb16.toString());
                    }
                    i44 = i43 & 14;
                    if (i44 == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i43 & 57344) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z14 | z15;
                    objR5 = dVarF.R();
                    if (z16) {
                        transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                        composition = textFieldValue.getComposition();
                        if (composition != null) {
                            uVar5 = uVar4;
                            transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                            if (transformedTextC2 != null) {
                                objR5 = transformedTextC2;
                            }
                            dVarF.L(objR5);
                        } else {
                            uVar5 = uVar4;
                        }
                        objR5 = transformedTextC;
                        dVarF.L(objR5);
                    } else {
                        transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                        composition = textFieldValue.getComposition();
                        if (composition != null) {
                            uVar5 = uVar4;
                            transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                            if (transformedTextC2 != null) {
                                objR5 = transformedTextC2;
                            }
                            dVarF.L(objR5);
                        } else {
                            uVar5 = uVar4;
                        }
                        objR5 = transformedTextC;
                        dVarF.L(objR5);
                    }
                    TransformedText transformedText16 = (TransformedText) objR5;
                    text = transformedText16.getText();
                    offsetMapping = transformedText16.getOffsetMapping();
                    qaaVarC = pp1.c(dVarF, 0);
                    zX = dVarF.x(hybVar);
                    objR6 = dVarF.R();
                    if (zX) {
                        objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                        dVarF.L(objR6);
                    } else {
                        objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                        dVarF.L(objR6);
                    }
                    k07Var = (k07) objR6;
                    m mVar18 = mVarA;
                    k07Var.X(textFieldValue.getText(), text, textStyle4, z13, r54, bVar6, function1, mVar18, ok4Var, selectionBackgroundColor);
                    k07Var.getProcessor().e(textFieldValue, k07Var.getInputSession());
                    objR7 = dVarF.R();
                    if (objR7 == companion.a()) {
                        objR7 = new rsd(0, 1, null);
                        dVarF.L(objR7);
                    }
                    rsdVar = (rsd) objR7;
                    rsd.f(rsdVar, textFieldValue, 0L, 2, null);
                    objR8 = dVarF.R();
                    if (objR8 == companion.a()) {
                        objR8 = vn3.k(EmptyCoroutineContext.a, dVarF);
                        dVarF.L(objR8);
                    }
                    ta2Var = (ta2) objR8;
                    objR9 = dVarF.R();
                    if (objR9 == companion.a()) {
                        objR9 = androidx.compose.p001foundation.relocation.c.a();
                        dVarF.L(objR9);
                    }
                    cu0Var = (cu0) objR9;
                    objR10 = dVarF.R();
                    r48 r48Var18 = r48Var2;
                    if (objR10 == companion.a()) {
                        objR10 = new TextFieldSelectionManager(rsdVar);
                        dVarF.L(objR10);
                    }
                    textFieldSelectionManager = (TextFieldSelectionManager) objR10;
                    textFieldSelectionManager.L0(offsetMapping);
                    textFieldSelectionManager.U0(nceVar3);
                    textFieldSelectionManager.M0(k07Var.r());
                    textFieldSelectionManager.Q0(k07Var);
                    textFieldSelectionManager.T0(textFieldValue);
                    textFieldSelectionManager.z0((jf1) dVarF.v(CompositionLocalsKt.d()));
                    textFieldSelectionManager.A0(ta2Var);
                    textFieldSelectionManager.R0((yzc) dVarF.v(CompositionLocalsKt.s()));
                    textFieldSelectionManager.I0((c65) dVarF.v(CompositionLocalsKt.k()));
                    textFieldSelectionManager.G0(fVar);
                    textFieldSelectionManager.E0(!z10);
                    textFieldSelectionManager.F0(z11);
                    if (up1.isSmartSelectionEnabled) {
                        dVarF.y(1966756105);
                        textFieldSelectionManager.N0(androidx.compose.p001foundation.text.selection.c.h(SelectedTextType.EditableText, textStyle4.u(), dVarF, 6));
                        dVarF.u();
                    } else {
                        dVarF.y(1966902177);
                        dVarF.u();
                    }
                    k07Var.h();
                    new Function1() { // from class: com.google.android.e92
                        public final Object invoke(Object obj) {
                            return CoreTextFieldKt.y(textFieldSelectionManager, (b) obj);
                        }
                    };
                    new Function0() { // from class: com.google.android.f92
                        public final Object invoke() {
                            return CoreTextFieldKt.z(textFieldSelectionManager);
                        }
                    };
                    new Function0() { // from class: com.google.android.g92
                        public final Object invoke() {
                            return CoreTextFieldKt.A(textFieldSelectionManager);
                        }
                    };
                    companion2 = androidx.compose.ui.b.INSTANCE;
                    boolean zT1111119 = dVarF.T(k07Var);
                    i45 = i42 & 7168;
                    i46 = i42;
                    if (i45 == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z3111111111114 = z17 | zT1111119;
                    if ((i46 & 57344) == 16384) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean zT11111110 = z3111111111114 | z18 | dVarF.T(dxcVar);
                    if (i44 == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z3111111111115 = zT11111110 | z19;
                    i47 = (i46 & 112) ^ 48;
                    if (i47 > 32) {
                        dxcVar2 = dxcVar;
                        if ((i46 & 48) != 32) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                    } else {
                        dxcVar2 = dxcVar;
                        if ((i46 & 48) != 32) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                    }
                    zT = z3111111111115 | z20 | dVarF.T(offsetMapping) | dVarF.T(ta2Var) | dVarF.T(cu0Var) | dVarF.T(textFieldSelectionManager);
                    objR11 = dVarF.R();
                    if (zT) {
                        zn8Var = offsetMapping;
                        final ImeOptions imeOptions11111112 = imeOptions3;
                        final boolean z3111111111116 = z11;
                        final boolean z3111111111117 = z10;
                        objR11 = new Function1() { // from class: com.google.android.h92
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.B(k07Var, z3111111111116, z3111111111117, dxcVar2, textFieldValue, imeOptions11111112, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                            }
                        };
                        k07Var2 = k07Var;
                        z21 = z3111111111116;
                        textFieldValue2 = textFieldValue;
                        imeOptions4 = imeOptions11111112;
                        textFieldSelectionManager2 = textFieldSelectionManager;
                        ta2Var2 = ta2Var;
                        cu0Var2 = cu0Var;
                        dVarF.L(objR11);
                    } else {
                        zn8Var = offsetMapping;
                        final ImeOptions imeOptions11111113 = imeOptions3;
                        final boolean z3111111111118 = z11;
                        final boolean z3111111111119 = z10;
                        objR11 = new Function1() { // from class: com.google.android.h92
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.B(k07Var, z3111111111118, z3111111111119, dxcVar2, textFieldValue, imeOptions11111113, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                            }
                        };
                        k07Var2 = k07Var;
                        z21 = z3111111111118;
                        textFieldValue2 = textFieldValue;
                        imeOptions4 = imeOptions11111113;
                        textFieldSelectionManager2 = textFieldSelectionManager;
                        ta2Var2 = ta2Var;
                        cu0Var2 = cu0Var;
                        dVarF.L(objR11);
                    }
                    final cu0 cu0Var19 = cu0Var2;
                    androidx.compose.ui.b bVarA111111113 = atc.a(companion2, z21, fVar, r48Var18, (Function1) objR11);
                    if (z21) {
                        z22 = false;
                    } else {
                        z22 = false;
                    }
                    q6cVarR = p0.r(Boolean.valueOf(z22), dVarF, 0);
                    Unit unit17 = Unit.a;
                    boolean zX1115 = dVarF.x(q6cVarR) | dVarF.T(k07Var2) | dVarF.T(dxcVar2) | dVarF.T(textFieldSelectionManager2);
                    if (i47 > 32) {
                        imeOptions5 = imeOptions4;
                        if ((i46 & 48) != 32) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                    } else {
                        imeOptions5 = imeOptions4;
                        if ((i46 & 48) != 32) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                    }
                    z24 = zX1115 | z23;
                    objR12 = dVarF.R();
                    if (z24) {
                        ImeOptions imeOptions11111114 = imeOptions5;
                        dxc dxcVar1116 = dxcVar2;
                        TextFieldSelectionManager textFieldSelectionManager11110 = textFieldSelectionManager2;
                        k07 k07Var1119 = k07Var2;
                        objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var1119, q6cVarR, dxcVar1116, textFieldSelectionManager11110, imeOptions11111114, null);
                        k07Var3 = k07Var1119;
                        textFieldSelectionManager3 = textFieldSelectionManager11110;
                        imeOptions6 = imeOptions11111114;
                        dVarF.L(objR12);
                    } else {
                        ImeOptions imeOptions11111115 = imeOptions5;
                        dxc dxcVar1117 = dxcVar2;
                        TextFieldSelectionManager textFieldSelectionManager11111 = textFieldSelectionManager2;
                        k07 k07Var11110 = k07Var2;
                        objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var11110, q6cVarR, dxcVar1117, textFieldSelectionManager11111, imeOptions11111115, null);
                        k07Var3 = k07Var11110;
                        textFieldSelectionManager3 = textFieldSelectionManager11111;
                        imeOptions6 = imeOptions11111115;
                        dVarF.L(objR12);
                    }
                    imeOptions7 = imeOptions6;
                    vn3.g(unit17, (Function2) objR12, dVarF, 6);
                    int i51114 = i46 >> 3;
                    z25 = z21;
                    k07Var4 = k07Var3;
                    textFieldSelectionManager4 = textFieldSelectionManager3;
                    androidx.compose.ui.b bVarA111111114 = huc.a(companion2, textFieldSelectionManager4, z25, r48Var18, k07Var4, fVar, z10, zn8Var, dVarF, (i51114 & 896) | 196614 | ((i43 >> 9) & 7168) | ((i46 << 6) & 3670016));
                    zn8Var2 = zn8Var;
                    final androidx.compose.ui.b bVarB111112 = y92.b(companion2, k07Var4, textFieldValue2, zn8Var2);
                    boolean zT11111111 = dVarF.T(k07Var4);
                    if (i45 == 2048) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    boolean zX1116 = zT11111111 | z26 | dVarF.x(a0Var) | dVarF.T(textFieldSelectionManager4);
                    if (i44 == 4) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    zT2 = zX1116 | z27 | dVarF.T(zn8Var2);
                    objR13 = dVarF.R();
                    if (zT2) {
                        objR13 = new Function1() { // from class: com.google.android.n82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                            }
                        };
                        a0Var2 = a0Var;
                        textFieldSelectionManager5 = textFieldSelectionManager4;
                        dVarF.L(objR13);
                    } else {
                        objR13 = new Function1() { // from class: com.google.android.n82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                            }
                        };
                        a0Var2 = a0Var;
                        textFieldSelectionManager5 = textFieldSelectionManager4;
                        dVarF.L(objR13);
                    }
                    final androidx.compose.ui.b bVarA111111115 = xq8.a(companion2, (Function1) objR13);
                    textFieldSelectionManager6 = textFieldSelectionManager5;
                    CoreTextFieldSemanticsModifier j92Var18 = new CoreTextFieldSemanticsModifier(transformedText16, textFieldValue, k07Var4, z10, z25, nceVar3 instanceof a39, zn8Var2, textFieldSelectionManager6, imeOptions7, fVar);
                    a0 a0Var110 = a0Var2;
                    if (z25 != 0) {
                        z28 = false;
                    } else {
                        z28 = false;
                    }
                    final androidx.compose.ui.b bVarA111111116 = y92.a(companion2, k07Var4, textFieldValue, zn8Var2, qu0Var3, z28);
                    final nce nceVar111110 = nceVar3;
                    zT3 = dVarF.T(textFieldSelectionManager6);
                    objR14 = dVarF.R();
                    if (zT3) {
                        objR14 = new Function1() { // from class: com.google.android.o82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                            }
                        };
                        dVarF.L(objR14);
                    } else {
                        objR14 = new Function1() { // from class: com.google.android.o82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                            }
                        };
                        dVarF.L(objR14);
                    }
                    vn3.c(textFieldSelectionManager6, (Function1) objR14, dVarF, 0);
                    boolean zT11111112 = dVarF.T(k07Var4) | dVarF.T(dxcVar2);
                    if (i44 == 4) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    z30 = z29 | zT11111112 | ((i47 <= 32 && dVarF.x(imeOptions7)) || (i46 & 48) == 32);
                    objR15 = dVarF.R();
                    if (z30) {
                        objR15 = new Function1() { // from class: com.google.android.p82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                            }
                        };
                        dVarF.L(objR15);
                    } else {
                        objR15 = new Function1() { // from class: com.google.android.p82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                            }
                        };
                        dVarF.L(objR15);
                    }
                    vn3.c(imeOptions7, (Function1) objR15, dVarF, i51114 & 14);
                    Function1<TextFieldValue, Unit> function1R18 = k07Var4.r();
                    boolean z31111111111110 = !z10;
                    i48 = i40;
                    if (i48 == 1) {
                        z31 = true;
                    } else {
                        z31 = false;
                    }
                    androidx.compose.ui.b bVarB111113 = TextFieldKeyInputKt.b(companion2, k07Var4, textFieldSelectionManager6, textFieldValue, function1R18, z31111111111110, z31, zn8Var2, rsdVar, imeOptions7.getImeAction());
                    keyboardType = imeOptions7.getKeyboardType();
                    companion3 = androidx.compose.ui.text.input.d.INSTANCE;
                    if (androidx.compose.ui.text.input.d.n(keyboardType, companion3.f())) {
                        z32 = false;
                    } else {
                        z32 = false;
                    }
                    boolean zC19 = C(q6cVarR);
                    zA = dVarF.A(z32) | dVarF.T(bVar5);
                    objR16 = dVarF.R();
                    if (zA) {
                        objR16 = new Function0() { // from class: com.google.android.q82
                            public final Object invoke() {
                                return CoreTextFieldKt.G(z32, bVar5);
                            }
                        };
                        dVarF.L(objR16);
                    } else {
                        objR16 = new Function0() { // from class: com.google.android.q82
                            public final Object invoke() {
                                return CoreTextFieldKt.G(z32, bVar5);
                            }
                        };
                        dVarF.L(objR16);
                    }
                    androidx.compose.ui.b bVarB111114 = hcc.b(companion2, zC19, z32, (Function0) objR16);
                    ta2 ta2Var110 = ta2Var2;
                    qu0VarE = ma0.e((qu0) dVarF.v(ma0.c()), ((ei1) dVarF.v(ma0.d())).getValue(), na0.a());
                    zT4 = dVarF.T(k07Var4) | dVarF.x(qu0VarE);
                    objR17 = dVarF.R();
                    if (zT4) {
                        objR17 = new Function1() { // from class: com.google.android.x82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                            }
                        };
                        dVarF.L(objR17);
                    } else {
                        objR17 = new Function1() { // from class: com.google.android.x82
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                            }
                        };
                        dVarF.L(objR17);
                    }
                    androidx.compose.ui.b bVarD18 = androidx.compose.ui.draw.c.d(companion2, (Function1) objR17);
                    zv8 zv8VarA18 = tuc.a(dVarF, 0);
                    androidx.compose.ui.b bVar11111 = bVar4;
                    androidx.compose.ui.b bVarThen18 = g0(zsc.b(yz6.a(bVar11111.then(bVarD18), bVar5, k07Var4, textFieldSelectionManager6).then(bVarB111114).then(bVarA111111113), k07Var4, ok4Var), k07Var4, textFieldSelectionManager6).then(bVarB111113);
                    final u uVar113 = uVar5;
                    androidx.compose.ui.b bVarA111111117 = a0(xq8.a(TextFieldScrollKt.f(bVarThen18, uVar113, r48Var18, z25, zv8VarA18).then(bVarA111111114).then(j92Var18), new Function1() { // from class: com.google.android.a92
                        public final Object invoke(Object obj) {
                            return CoreTextFieldKt.I(k07Var4, (kn6) obj);
                        }
                    }), textFieldSelectionManager6, ta2Var110);
                    if (!z25) {
                        z33 = false;
                    } else {
                        z33 = false;
                    }
                    if (z33) {
                        bVarZ = TextFieldSelectionManager_androidKt.z(companion2, textFieldSelectionManager6);
                    } else {
                        bVarZ = companion2;
                    }
                    final ps4 ps4Var110 = ps4VarB;
                    final androidx.compose.ui.b bVar11112 = bVarZ;
                    final boolean z41114 = z10;
                    final boolean z41115 = z33;
                    final int i51115 = i41;
                    P(bVarA111111117, textFieldSelectionManager6, ko1.e(-814563849, true, new Function2() { // from class: com.google.android.b92
                        public final Object invoke(Object obj, Object obj2) {
                            return CoreTextFieldKt.J(ps4Var110, k07Var4, textStyle4, i51115, i48, uVar113, textFieldValue, nceVar111110, bVarA111111116, bVarB111112, bVarA111111115, bVar11112, cu0Var19, textFieldSelectionManager6, z41115, z41114, function5, zn8Var2, f43Var, (d) obj, ((Integer) obj2).intValue());
                        }
                    }, dVarF, 54), dVarF, 384);
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    ps4Var2 = ps4Var110;
                    dVar2 = dVarF;
                    function4 = function5;
                    z7 = z41114;
                    uVar2 = uVar3;
                    z6 = z25;
                    r48Var2 = r48Var18;
                    z5 = z13;
                    mVar2 = mVar18;
                    i39 = i41;
                    solidColor = qu0Var3;
                    bVar3 = bVar11111;
                    i38 = i48;
                    nceVar2 = nceVar111110;
                    textStyle3 = textStyle4;
                    imeOptions2 = imeOptions7;
                } else {
                    dVarF.q();
                    z5 = z;
                    imeOptions2 = imeOptions;
                    mVar2 = mVar;
                    ps4Var2 = ps4Var;
                    uVar2 = uVar;
                    dVar2 = dVarF;
                    textStyle3 = textStyle2;
                    function4 = function3;
                    nceVar2 = nceVarC;
                    bVar3 = bVar2;
                    i38 = i;
                    i39 = i2;
                    z6 = z2;
                    z7 = z3;
                }
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.c92
                        public final Object invoke(Object obj, Object obj2) {
                            return CoreTextFieldKt.N(textFieldValue, function1, bVar3, textStyle3, nceVar2, function4, r48Var2, solidColor, z5, i38, i39, imeOptions2, mVar2, z6, z7, ps4Var2, uVar2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i6 |= 805306368;
            i21 = i5 & 1024;
            if (i21 != 0) {
                i22 = i4 | 6;
            } else if ((i4 & 6) == 0) {
                if (dVarF.C(i2)) {
                    i23 = 4;
                } else {
                    i23 = 2;
                }
                i22 = i4 | i23;
            } else {
                i22 = i4;
            }
            if ((i4 & 48) != 0) {
                i22 |= ((i5 & 2048) == 0 || !dVarF.x(imeOptions)) ? 16 : 32;
            }
            i24 = i22;
            i25 = i5 & 4096;
            if (i25 != 0) {
                i26 = i24 | 384;
            } else if ((i4 & 384) == 0) {
                if (dVarF.x(mVar)) {
                    i27 = 256;
                } else {
                    i27 = 128;
                }
                i26 = i24 | i27;
            } else {
                i26 = i24;
            }
            i28 = i5 & 8192;
            if (i28 != 0) {
                i30 = i26 | 3072;
            } else {
                i29 = i26;
                if ((i4 & 3072) == 0) {
                    i30 = i29 | (dVarF.A(z2) ? 2048 : 1024);
                } else {
                    i30 = i29;
                }
            }
            i31 = i5 & 16384;
            if (i31 != 0) {
                i33 = i30 | 24576;
            } else {
                i32 = i30;
                if ((i4 & 24576) == 0) {
                    i33 = i32 | (dVarF.A(z3) ? 16384 : 8192);
                } else {
                    i33 = i32;
                }
            }
            i34 = i5 & 32768;
            if (i34 != 0) {
                i33 |= 196608;
            } else if ((i4 & 196608) == 0) {
                if (dVarF.T(ps4Var)) {
                    i35 = 131072;
                } else {
                    i35 = 65536;
                }
                i33 |= i35;
            }
            i36 = i5 & 65536;
            if (i36 != 0) {
                i33 |= 1572864;
            } else if ((i4 & 1572864) == 0) {
                if (dVarF.x(uVar)) {
                    i37 = 1048576;
                } else {
                    i37 = 524288;
                }
                i33 |= i37;
            }
            if ((i6 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (dVarF.g(z4, i6 & 1)) {
                dVarF.U();
                if ((i3 & 1) != 0) {
                    if (i49 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i7 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i9 != 0) {
                        nceVarC = nce.INSTANCE.c();
                    }
                    if (i11 != 0) {
                        objR = dVarF.R();
                        if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                            objR = new Function1() { // from class: com.google.android.m82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.x((TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR);
                        }
                        function3 = (Function1) objR;
                    }
                    if (i13 != 0) {
                        r48Var2 = null;
                    }
                    if (i15 != 0) {
                        solidColor = new SolidColor(ei1.INSTANCE.i(), null);
                    }
                    if (i17 != 0) {
                        z8 = true;
                    } else {
                        z8 = z;
                    }
                    if (i19 != 0) {
                        i40 = Integer.MAX_VALUE;
                    } else {
                        i40 = i;
                    }
                    if (i21 != 0) {
                        i41 = 1;
                    } else {
                        i41 = i2;
                    }
                    if ((i5 & 2048) != 0) {
                        imeOptionsA = ImeOptions.INSTANCE.a();
                        i33 &= -113;
                    } else {
                        imeOptionsA = imeOptions;
                    }
                    if (i25 != 0) {
                        mVarA = m.INSTANCE.a();
                    } else {
                        mVarA = mVar;
                    }
                    if (i28 != 0) {
                        z9 = true;
                    } else {
                        z9 = z2;
                    }
                    if (i31 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if (i34 != 0) {
                        ps4VarB = zo1.a.b();
                    } else {
                        ps4VarB = ps4Var;
                    }
                    boolean z32118 = z8;
                    textStyle2 = textStyleA;
                    bVar4 = bVar2;
                    z11 = z9;
                    function5 = function3;
                    z12 = z32118;
                    nce nceVar111111 = nceVarC;
                    imeOptions3 = imeOptionsA;
                    qu0Var2 = solidColor;
                    nceVar3 = nceVar111111;
                    i42 = i33;
                    if (i36 != 0) {
                        uVar3 = null;
                    } else {
                        uVar3 = uVar;
                    }
                } else {
                    if (i49 != 0) {
                        bVar2 = androidx.compose.ui.b.INSTANCE;
                    }
                    if (i7 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i9 != 0) {
                        nceVarC = nce.INSTANCE.c();
                    }
                    if (i11 != 0) {
                        objR = dVarF.R();
                        if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                            objR = new Function1() { // from class: com.google.android.m82
                                public final Object invoke(Object obj) {
                                    return CoreTextFieldKt.x((TextLayoutResult) obj);
                                }
                            };
                            dVarF.L(objR);
                        }
                        function3 = (Function1) objR;
                    }
                    if (i13 != 0) {
                        r48Var2 = null;
                    }
                    if (i15 != 0) {
                        solidColor = new SolidColor(ei1.INSTANCE.i(), null);
                    }
                    if (i17 != 0) {
                        z8 = true;
                    } else {
                        z8 = z;
                    }
                    if (i19 != 0) {
                        i40 = Integer.MAX_VALUE;
                    } else {
                        i40 = i;
                    }
                    if (i21 != 0) {
                        i41 = 1;
                    } else {
                        i41 = i2;
                    }
                    if ((i5 & 2048) != 0) {
                        imeOptionsA = ImeOptions.INSTANCE.a();
                        i33 &= -113;
                    } else {
                        imeOptionsA = imeOptions;
                    }
                    if (i25 != 0) {
                        mVarA = m.INSTANCE.a();
                    } else {
                        mVarA = mVar;
                    }
                    if (i28 != 0) {
                        z9 = true;
                    } else {
                        z9 = z2;
                    }
                    if (i31 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if (i34 != 0) {
                        ps4VarB = zo1.a.b();
                    } else {
                        ps4VarB = ps4Var;
                    }
                    boolean z32119 = z8;
                    textStyle2 = textStyleA;
                    bVar4 = bVar2;
                    z11 = z9;
                    function5 = function3;
                    z12 = z32119;
                    nce nceVar111112 = nceVarC;
                    imeOptions3 = imeOptionsA;
                    qu0Var2 = solidColor;
                    nceVar3 = nceVar111112;
                    i42 = i33;
                    if (i36 != 0) {
                        uVar3 = null;
                    } else {
                        uVar3 = uVar;
                    }
                }
                dVarF.M();
                qu0Var3 = qu0Var2;
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(31062401, i6, i42, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                }
                objR2 = dVarF.R();
                companion = androidx.compose.p004runtime.d.INSTANCE;
                if (objR2 == companion.a()) {
                    objR2 = new androidx.compose.ui.focus.f();
                    dVarF.L(objR2);
                }
                fVar = (androidx.compose.ui.focus.f) objR2;
                objR3 = dVarF.R();
                i43 = i6;
                if (objR3 == companion.a()) {
                    objR3 = LegacyPlatformTextInputServiceAdapter_androidKt.b();
                    dVarF.L(objR3);
                }
                bVar5 = (androidx.compose.p001foundation.text.input.internal.b) objR3;
                objR4 = dVarF.R();
                if (objR4 == companion.a()) {
                    objR4 = new dxc(bVar5);
                    dVarF.L(objR4);
                }
                dxcVar = (dxc) objR4;
                f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
                bVar6 = (l.b) dVarF.v(CompositionLocalsKt.i());
                selectionBackgroundColor = ((SelectionColors) dVarF.v(jzc.c())).getSelectionBackgroundColor();
                ok4Var = (ok4) dVarF.v(CompositionLocalsKt.h());
                a0Var = (a0) dVarF.v(CompositionLocalsKt.v());
                textStyle4 = textStyle2;
                hybVar = (hyb) dVarF.v(CompositionLocalsKt.r());
                z13 = z12;
                if (i40 == 1) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Vertical;
                }
                if (uVar3 == null) {
                    dVarF.y(-213744626);
                    Object[] objArr17 = {orientation};
                    k0b<u, Object> k0bVarA17 = u.INSTANCE.a();
                    zC = dVarF.C(orientation.ordinal());
                    objR18 = dVarF.R();
                    if (zC) {
                        objR18 = new Function0() { // from class: com.google.android.d92
                            public final Object invoke() {
                                return CoreTextFieldKt.O(orientation);
                            }
                        };
                        dVarF.L(objR18);
                    } else {
                        objR18 = new Function0() { // from class: com.google.android.d92
                            public final Object invoke() {
                                return CoreTextFieldKt.O(orientation);
                            }
                        };
                        dVarF.L(objR18);
                    }
                    uVar4 = (u) dfa.k(objArr17, k0bVarA17, (Function0) objR18, dVarF, 0);
                    dVarF.u();
                } else {
                    dVarF.y(-213745742);
                    dVarF.u();
                    uVar4 = uVar3;
                }
                if (uVar4.j() != orientation) {
                    StringBuilder sb17 = new StringBuilder();
                    sb17.append("Mismatching scroller orientation; ");
                    if (orientation == Orientation.Vertical) {
                        str = "only single-line, non-wrap text fields can scroll horizontally";
                    } else {
                        str = "single-line, non-wrap text fields can only scroll horizontally";
                    }
                    sb17.append(str);
                    throw new IllegalArgumentException(sb17.toString());
                }
                i44 = i43 & 14;
                if (i44 == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i43 & 57344) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z14 | z15;
                objR5 = dVarF.R();
                if (z16) {
                    transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                    composition = textFieldValue.getComposition();
                    if (composition != null) {
                        uVar5 = uVar4;
                        transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                        if (transformedTextC2 != null) {
                            objR5 = transformedTextC2;
                        }
                        dVarF.L(objR5);
                    } else {
                        uVar5 = uVar4;
                    }
                    objR5 = transformedTextC;
                    dVarF.L(objR5);
                } else {
                    transformedTextC = o0e.c(nceVar3, textFieldValue.getText());
                    composition = textFieldValue.getComposition();
                    if (composition != null) {
                        uVar5 = uVar4;
                        transformedTextC2 = r.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                        if (transformedTextC2 != null) {
                            objR5 = transformedTextC2;
                        }
                        dVarF.L(objR5);
                    } else {
                        uVar5 = uVar4;
                    }
                    objR5 = transformedTextC;
                    dVarF.L(objR5);
                }
                TransformedText transformedText17 = (TransformedText) objR5;
                text = transformedText17.getText();
                offsetMapping = transformedText17.getOffsetMapping();
                qaaVarC = pp1.c(dVarF, 0);
                zX = dVarF.x(hybVar);
                objR6 = dVarF.R();
                if (zX) {
                    objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                    dVarF.L(objR6);
                } else {
                    objR6 = new k07(new asc(text, textStyle4, 0, 0, z13, 0, f43Var, bVar6, null, 300, null), qaaVarC, hybVar);
                    dVarF.L(objR6);
                }
                k07Var = (k07) objR6;
                m mVar19 = mVarA;
                k07Var.X(textFieldValue.getText(), text, textStyle4, z13, r54, bVar6, function1, mVar19, ok4Var, selectionBackgroundColor);
                k07Var.getProcessor().e(textFieldValue, k07Var.getInputSession());
                objR7 = dVarF.R();
                if (objR7 == companion.a()) {
                    objR7 = new rsd(0, 1, null);
                    dVarF.L(objR7);
                }
                rsdVar = (rsd) objR7;
                rsd.f(rsdVar, textFieldValue, 0L, 2, null);
                objR8 = dVarF.R();
                if (objR8 == companion.a()) {
                    objR8 = vn3.k(EmptyCoroutineContext.a, dVarF);
                    dVarF.L(objR8);
                }
                ta2Var = (ta2) objR8;
                objR9 = dVarF.R();
                if (objR9 == companion.a()) {
                    objR9 = androidx.compose.p001foundation.relocation.c.a();
                    dVarF.L(objR9);
                }
                cu0Var = (cu0) objR9;
                objR10 = dVarF.R();
                r48 r48Var19 = r48Var2;
                if (objR10 == companion.a()) {
                    objR10 = new TextFieldSelectionManager(rsdVar);
                    dVarF.L(objR10);
                }
                textFieldSelectionManager = (TextFieldSelectionManager) objR10;
                textFieldSelectionManager.L0(offsetMapping);
                textFieldSelectionManager.U0(nceVar3);
                textFieldSelectionManager.M0(k07Var.r());
                textFieldSelectionManager.Q0(k07Var);
                textFieldSelectionManager.T0(textFieldValue);
                textFieldSelectionManager.z0((jf1) dVarF.v(CompositionLocalsKt.d()));
                textFieldSelectionManager.A0(ta2Var);
                textFieldSelectionManager.R0((yzc) dVarF.v(CompositionLocalsKt.s()));
                textFieldSelectionManager.I0((c65) dVarF.v(CompositionLocalsKt.k()));
                textFieldSelectionManager.G0(fVar);
                textFieldSelectionManager.E0(!z10);
                textFieldSelectionManager.F0(z11);
                if (up1.isSmartSelectionEnabled) {
                    dVarF.y(1966756105);
                    textFieldSelectionManager.N0(androidx.compose.p001foundation.text.selection.c.h(SelectedTextType.EditableText, textStyle4.u(), dVarF, 6));
                    dVarF.u();
                } else {
                    dVarF.y(1966902177);
                    dVarF.u();
                }
                k07Var.h();
                new Function1() { // from class: com.google.android.e92
                    public final Object invoke(Object obj) {
                        return CoreTextFieldKt.y(textFieldSelectionManager, (b) obj);
                    }
                };
                new Function0() { // from class: com.google.android.f92
                    public final Object invoke() {
                        return CoreTextFieldKt.z(textFieldSelectionManager);
                    }
                };
                new Function0() { // from class: com.google.android.g92
                    public final Object invoke() {
                        return CoreTextFieldKt.A(textFieldSelectionManager);
                    }
                };
                companion2 = androidx.compose.ui.b.INSTANCE;
                boolean zT11111113 = dVarF.T(k07Var);
                i45 = i42 & 7168;
                i46 = i42;
                if (i45 == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z31111111111111 = z17 | zT11111113;
                if ((i46 & 57344) == 16384) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean zT11111114 = z31111111111111 | z18 | dVarF.T(dxcVar);
                if (i44 == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z31111111111112 = zT11111114 | z19;
                i47 = (i46 & 112) ^ 48;
                if (i47 > 32) {
                    dxcVar2 = dxcVar;
                    if ((i46 & 48) != 32) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                } else {
                    dxcVar2 = dxcVar;
                    if ((i46 & 48) != 32) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                }
                zT = z31111111111112 | z20 | dVarF.T(offsetMapping) | dVarF.T(ta2Var) | dVarF.T(cu0Var) | dVarF.T(textFieldSelectionManager);
                objR11 = dVarF.R();
                if (zT) {
                    zn8Var = offsetMapping;
                    final ImeOptions imeOptions11111116 = imeOptions3;
                    final boolean z31111111111113 = z11;
                    final boolean z31111111111114 = z10;
                    objR11 = new Function1() { // from class: com.google.android.h92
                        public final Object invoke(Object obj) {
                            return CoreTextFieldKt.B(k07Var, z31111111111113, z31111111111114, dxcVar2, textFieldValue, imeOptions11111116, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                        }
                    };
                    k07Var2 = k07Var;
                    z21 = z31111111111113;
                    textFieldValue2 = textFieldValue;
                    imeOptions4 = imeOptions11111116;
                    textFieldSelectionManager2 = textFieldSelectionManager;
                    ta2Var2 = ta2Var;
                    cu0Var2 = cu0Var;
                    dVarF.L(objR11);
                } else {
                    zn8Var = offsetMapping;
                    final ImeOptions imeOptions11111117 = imeOptions3;
                    final boolean z31111111111115 = z11;
                    final boolean z31111111111116 = z10;
                    objR11 = new Function1() { // from class: com.google.android.h92
                        public final Object invoke(Object obj) {
                            return CoreTextFieldKt.B(k07Var, z31111111111115, z31111111111116, dxcVar2, textFieldValue, imeOptions11111117, zn8Var, textFieldSelectionManager, ta2Var, cu0Var, (dl4) obj);
                        }
                    };
                    k07Var2 = k07Var;
                    z21 = z31111111111115;
                    textFieldValue2 = textFieldValue;
                    imeOptions4 = imeOptions11111117;
                    textFieldSelectionManager2 = textFieldSelectionManager;
                    ta2Var2 = ta2Var;
                    cu0Var2 = cu0Var;
                    dVarF.L(objR11);
                }
                final cu0 cu0Var110 = cu0Var2;
                androidx.compose.ui.b bVarA111111118 = atc.a(companion2, z21, fVar, r48Var19, (Function1) objR11);
                if (z21) {
                    z22 = false;
                } else {
                    z22 = false;
                }
                q6cVarR = p0.r(Boolean.valueOf(z22), dVarF, 0);
                Unit unit18 = Unit.a;
                boolean zX1117 = dVarF.x(q6cVarR) | dVarF.T(k07Var2) | dVarF.T(dxcVar2) | dVarF.T(textFieldSelectionManager2);
                if (i47 > 32) {
                    imeOptions5 = imeOptions4;
                    if ((i46 & 48) != 32) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                } else {
                    imeOptions5 = imeOptions4;
                    if ((i46 & 48) != 32) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                }
                z24 = zX1117 | z23;
                objR12 = dVarF.R();
                if (z24) {
                    ImeOptions imeOptions11111118 = imeOptions5;
                    dxc dxcVar1118 = dxcVar2;
                    TextFieldSelectionManager textFieldSelectionManager11112 = textFieldSelectionManager2;
                    k07 k07Var11111 = k07Var2;
                    objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var11111, q6cVarR, dxcVar1118, textFieldSelectionManager11112, imeOptions11111118, null);
                    k07Var3 = k07Var11111;
                    textFieldSelectionManager3 = textFieldSelectionManager11112;
                    imeOptions6 = imeOptions11111118;
                    dVarF.L(objR12);
                } else {
                    ImeOptions imeOptions11111119 = imeOptions5;
                    dxc dxcVar1119 = dxcVar2;
                    TextFieldSelectionManager textFieldSelectionManager11113 = textFieldSelectionManager2;
                    k07 k07Var11112 = k07Var2;
                    objR12 = new CoreTextFieldKt$CoreTextField$5$1(k07Var11112, q6cVarR, dxcVar1119, textFieldSelectionManager11113, imeOptions11111119, null);
                    k07Var3 = k07Var11112;
                    textFieldSelectionManager3 = textFieldSelectionManager11113;
                    imeOptions6 = imeOptions11111119;
                    dVarF.L(objR12);
                }
                imeOptions7 = imeOptions6;
                vn3.g(unit18, (Function2) objR12, dVarF, 6);
                int i51116 = i46 >> 3;
                z25 = z21;
                k07Var4 = k07Var3;
                textFieldSelectionManager4 = textFieldSelectionManager3;
                androidx.compose.ui.b bVarA111111119 = huc.a(companion2, textFieldSelectionManager4, z25, r48Var19, k07Var4, fVar, z10, zn8Var, dVarF, (i51116 & 896) | 196614 | ((i43 >> 9) & 7168) | ((i46 << 6) & 3670016));
                zn8Var2 = zn8Var;
                final androidx.compose.ui.b bVarB111115 = y92.b(companion2, k07Var4, textFieldValue2, zn8Var2);
                boolean zT11111115 = dVarF.T(k07Var4);
                if (i45 == 2048) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean zX1118 = zT11111115 | z26 | dVarF.x(a0Var) | dVarF.T(textFieldSelectionManager4);
                if (i44 == 4) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                zT2 = zX1118 | z27 | dVarF.T(zn8Var2);
                objR13 = dVarF.R();
                if (zT2) {
                    objR13 = new Function1() { // from class: com.google.android.n82
                        public final Object invoke(Object obj) {
                            return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                        }
                    };
                    a0Var2 = a0Var;
                    textFieldSelectionManager5 = textFieldSelectionManager4;
                    dVarF.L(objR13);
                } else {
                    objR13 = new Function1() { // from class: com.google.android.n82
                        public final Object invoke(Object obj) {
                            return CoreTextFieldKt.D(k07Var4, z25, a0Var, textFieldSelectionManager4, textFieldValue, zn8Var2, (kn6) obj);
                        }
                    };
                    a0Var2 = a0Var;
                    textFieldSelectionManager5 = textFieldSelectionManager4;
                    dVarF.L(objR13);
                }
                final androidx.compose.ui.b bVarA1111111110 = xq8.a(companion2, (Function1) objR13);
                textFieldSelectionManager6 = textFieldSelectionManager5;
                CoreTextFieldSemanticsModifier j92Var19 = new CoreTextFieldSemanticsModifier(transformedText17, textFieldValue, k07Var4, z10, z25, nceVar3 instanceof a39, zn8Var2, textFieldSelectionManager6, imeOptions7, fVar);
                a0 a0Var111 = a0Var2;
                if (z25 != 0) {
                    z28 = false;
                } else {
                    z28 = false;
                }
                final androidx.compose.ui.b bVarA1111111111 = y92.a(companion2, k07Var4, textFieldValue, zn8Var2, qu0Var3, z28);
                final nce nceVar111113 = nceVar3;
                zT3 = dVarF.T(textFieldSelectionManager6);
                objR14 = dVarF.R();
                if (zT3) {
                    objR14 = new Function1() { // from class: com.google.android.o82
                        public final Object invoke(Object obj) {
                            return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                        }
                    };
                    dVarF.L(objR14);
                } else {
                    objR14 = new Function1() { // from class: com.google.android.o82
                        public final Object invoke(Object obj) {
                            return CoreTextFieldKt.E(textFieldSelectionManager6, (kd3) obj);
                        }
                    };
                    dVarF.L(objR14);
                }
                vn3.c(textFieldSelectionManager6, (Function1) objR14, dVarF, 0);
                boolean zT11111116 = dVarF.T(k07Var4) | dVarF.T(dxcVar2);
                if (i44 == 4) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                z30 = z29 | zT11111116 | ((i47 <= 32 && dVarF.x(imeOptions7)) || (i46 & 48) == 32);
                objR15 = dVarF.R();
                if (z30) {
                    objR15 = new Function1() { // from class: com.google.android.p82
                        public final Object invoke(Object obj) {
                            return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                        }
                    };
                    dVarF.L(objR15);
                } else {
                    objR15 = new Function1() { // from class: com.google.android.p82
                        public final Object invoke(Object obj) {
                            return CoreTextFieldKt.F(k07Var4, dxcVar2, textFieldValue, imeOptions7, (kd3) obj);
                        }
                    };
                    dVarF.L(objR15);
                }
                vn3.c(imeOptions7, (Function1) objR15, dVarF, i51116 & 14);
                Function1<TextFieldValue, Unit> function1R19 = k07Var4.r();
                boolean z31111111111117 = !z10;
                i48 = i40;
                if (i48 == 1) {
                    z31 = true;
                } else {
                    z31 = false;
                }
                androidx.compose.ui.b bVarB111116 = TextFieldKeyInputKt.b(companion2, k07Var4, textFieldSelectionManager6, textFieldValue, function1R19, z31111111111117, z31, zn8Var2, rsdVar, imeOptions7.getImeAction());
                keyboardType = imeOptions7.getKeyboardType();
                companion3 = androidx.compose.ui.text.input.d.INSTANCE;
                if (androidx.compose.ui.text.input.d.n(keyboardType, companion3.f())) {
                    z32 = false;
                } else {
                    z32 = false;
                }
                boolean zC110 = C(q6cVarR);
                zA = dVarF.A(z32) | dVarF.T(bVar5);
                objR16 = dVarF.R();
                if (zA) {
                    objR16 = new Function0() { // from class: com.google.android.q82
                        public final Object invoke() {
                            return CoreTextFieldKt.G(z32, bVar5);
                        }
                    };
                    dVarF.L(objR16);
                } else {
                    objR16 = new Function0() { // from class: com.google.android.q82
                        public final Object invoke() {
                            return CoreTextFieldKt.G(z32, bVar5);
                        }
                    };
                    dVarF.L(objR16);
                }
                androidx.compose.ui.b bVarB111117 = hcc.b(companion2, zC110, z32, (Function0) objR16);
                ta2 ta2Var111 = ta2Var2;
                qu0VarE = ma0.e((qu0) dVarF.v(ma0.c()), ((ei1) dVarF.v(ma0.d())).getValue(), na0.a());
                zT4 = dVarF.T(k07Var4) | dVarF.x(qu0VarE);
                objR17 = dVarF.R();
                if (zT4) {
                    objR17 = new Function1() { // from class: com.google.android.x82
                        public final Object invoke(Object obj) {
                            return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                        }
                    };
                    dVarF.L(objR17);
                } else {
                    objR17 = new Function1() { // from class: com.google.android.x82
                        public final Object invoke(Object obj) {
                            return CoreTextFieldKt.H(k07Var4, qu0VarE, (fz1) obj);
                        }
                    };
                    dVarF.L(objR17);
                }
                androidx.compose.ui.b bVarD19 = androidx.compose.ui.draw.c.d(companion2, (Function1) objR17);
                zv8 zv8VarA19 = tuc.a(dVarF, 0);
                androidx.compose.ui.b bVar11113 = bVar4;
                androidx.compose.ui.b bVarThen19 = g0(zsc.b(yz6.a(bVar11113.then(bVarD19), bVar5, k07Var4, textFieldSelectionManager6).then(bVarB111117).then(bVarA111111118), k07Var4, ok4Var), k07Var4, textFieldSelectionManager6).then(bVarB111116);
                final u uVar114 = uVar5;
                androidx.compose.ui.b bVarA1111111112 = a0(xq8.a(TextFieldScrollKt.f(bVarThen19, uVar114, r48Var19, z25, zv8VarA19).then(bVarA111111119).then(j92Var19), new Function1() { // from class: com.google.android.a92
                    public final Object invoke(Object obj) {
                        return CoreTextFieldKt.I(k07Var4, (kn6) obj);
                    }
                }), textFieldSelectionManager6, ta2Var111);
                if (!z25) {
                    z33 = false;
                } else {
                    z33 = false;
                }
                if (z33) {
                    bVarZ = TextFieldSelectionManager_androidKt.z(companion2, textFieldSelectionManager6);
                } else {
                    bVarZ = companion2;
                }
                final ps4 ps4Var111 = ps4VarB;
                final androidx.compose.ui.b bVar11114 = bVarZ;
                final boolean z41116 = z10;
                final boolean z41117 = z33;
                final int i51117 = i41;
                P(bVarA1111111112, textFieldSelectionManager6, ko1.e(-814563849, true, new Function2() { // from class: com.google.android.b92
                    public final Object invoke(Object obj, Object obj2) {
                        return CoreTextFieldKt.J(ps4Var111, k07Var4, textStyle4, i51117, i48, uVar114, textFieldValue, nceVar111113, bVarA1111111111, bVarB111115, bVarA1111111110, bVar11114, cu0Var110, textFieldSelectionManager6, z41117, z41116, function5, zn8Var2, f43Var, (d) obj, ((Integer) obj2).intValue());
                    }
                }, dVarF, 54), dVarF, 384);
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                ps4Var2 = ps4Var111;
                dVar2 = dVarF;
                function4 = function5;
                z7 = z41116;
                uVar2 = uVar3;
                z6 = z25;
                r48Var2 = r48Var19;
                z5 = z13;
                mVar2 = mVar19;
                i39 = i41;
                solidColor = qu0Var3;
                bVar3 = bVar11113;
                i38 = i48;
                nceVar2 = nceVar111113;
                textStyle3 = textStyle4;
                imeOptions2 = imeOptions7;
            } else {
                dVarF.q();
                z5 = z;
                imeOptions2 = imeOptions;
                mVar2 = mVar;
                ps4Var2 = ps4Var;
                uVar2 = uVar;
                dVar2 = dVarF;
                textStyle3 = textStyle2;
                function4 = function3;
                nceVar2 = nceVarC;
                bVar3 = bVar2;
                i38 = i;
                i39 = i2;
                z6 = z2;
                z7 = z3;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.c92
                    public final Object invoke(Object obj, Object obj2) {
                        return CoreTextFieldKt.N(textFieldValue, function1, bVar3, textStyle3, nceVar2, function4, r48Var2, solidColor, z5, i38, i39, imeOptions2, mVar2, z6, z7, ps4Var2, uVar2, i3, i4, i5, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit x(TextLayoutResult textLayoutResult) {
            return Unit.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit y(TextFieldSelectionManager textFieldSelectionManager, androidx.compose.ui.text.b bVar) {
            textFieldSelectionManager.x0(bVar);
            return Unit.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.ui.text.b z(TextFieldSelectionManager textFieldSelectionManager) {
            return TextFieldSelectionManager.F(textFieldSelectionManager, false, 1, null);
        }
    }
