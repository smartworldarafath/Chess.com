package androidx.compose.p001foundation.text.input.internal;

import androidx.compose.p001foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter;
import androidx.compose.p001foundation.text.input.internal.c;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.a;
import com.google.android.l58;
import com.google.android.zlb;
import com.google.inputmethod.TextFieldValue;
import com.google.inputmethod.TextLayoutResult;
import com.google.inputmethod.cn3;
import com.google.inputmethod.gba;
import com.google.inputmethod.icc;
import com.google.inputmethod.kn6;
import com.google.inputmethod.zh7;
import com.google.inputmethod.zn8;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJM\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J!\u0010\u0019\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJK\u0010(\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u001bH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010\u0003R\u0018\u0010-\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u00102R\u001c\u00106\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Landroidx/compose/foundation/text/input/internal/AndroidLegacyPlatformTextInputServiceAdapter;", "Landroidx/compose/foundation/text/input/internal/b;", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/input/internal/c;", "", "initializeRequest", "r", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/google/android/cwc;", "value", "Landroidx/compose/ui/text/input/b;", "imeOptions", "", "Lcom/google/android/cn3;", "onEditCommand", "Landroidx/compose/ui/text/input/a;", "onImeActionPerformed", "e", "(Lcom/google/android/cwc;Landroidx/compose/ui/text/input/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "b", "a", "oldValue", "newValue", "h", "(Lcom/google/android/cwc;Lcom/google/android/cwc;)V", "Lcom/google/android/gba;", "rect", "f", "(Lcom/google/android/gba;)V", "textFieldValue", "Lcom/google/android/zn8;", "offsetMapping", "Lcom/google/android/vxc;", "textLayoutResult", "Lcom/google/android/zh7;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "d", "(Lcom/google/android/cwc;Lcom/google/android/zn8;Lcom/google/android/vxc;Lkotlin/jvm/functions/Function1;Lcom/google/android/gba;Lcom/google/android/gba;)V", "k", "Lkotlinx/coroutines/s;", "Lkotlinx/coroutines/s;", "job", "c", "Landroidx/compose/foundation/text/input/internal/c;", "currentRequest", "Lcom/google/android/l58;", "Lcom/google/android/l58;", "backingStylusHandwritingTrigger", "q", "()Lcom/google/android/l58;", "stylusHandwritingTrigger", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidLegacyPlatformTextInputServiceAdapter extends b {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private s job;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private c currentRequest;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private l58<Unit> backingStylusHandwritingTrigger;

    /* JADX INFO: Access modifiers changed from: private */
    public final l58<Unit> q() {
        l58<Unit> l58Var = this.backingStylusHandwritingTrigger;
        if (l58Var != null) {
            return l58Var;
        }
        if (!icc.a()) {
            return null;
        }
        l58<Unit> l58VarB = zlb.b(1, 0, BufferOverflow.c, 2, (Object) null);
        this.backingStylusHandwritingTrigger = l58VarB;
        return l58VarB;
    }

    private final void r(Function1<? super c, Unit> initializeRequest) {
        b.a textInputModifierNode = getTextInputModifierNode();
        if (textInputModifierNode == null) {
            return;
        }
        this.job = textInputModifierNode.i2(new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(initializeRequest, this, textInputModifierNode, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(TextFieldValue textFieldValue, AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, ImeOptions imeOptions, Function1 function1, Function1 function2, c cVar) {
        cVar.q(textFieldValue, androidLegacyPlatformTextInputServiceAdapter.getTextInputModifierNode(), imeOptions, function1, function2);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(b.a aVar, float[] fArr) {
        kn6 kn6VarH0 = aVar.h0();
        if (kn6VarH0 != null) {
            if (!kn6VarH0.b()) {
                kn6VarH0 = null;
            }
            if (kn6VarH0 == null) {
                return;
            }
            kn6VarH0.k0(fArr);
        }
    }

    @Override // com.google.inputmethod.zb9
    public void a() {
        s sVar = this.job;
        if (sVar != null) {
            s.a.a(sVar, (CancellationException) null, 1, (Object) null);
        }
        this.job = null;
        l58<Unit> l58VarQ = q();
        if (l58VarQ != null) {
            l58VarQ.d();
        }
    }

    @Override // com.google.inputmethod.zb9
    public void b() {
        r(null);
    }

    @Override // com.google.inputmethod.zb9
    public void d(TextFieldValue textFieldValue, zn8 offsetMapping, TextLayoutResult textLayoutResult, Function1<? super zh7, Unit> textFieldToRootTransform, gba innerTextFieldBounds, gba decorationBoxBounds) {
        c cVar = this.currentRequest;
        if (cVar != null) {
            cVar.s(textFieldValue, offsetMapping, textLayoutResult, innerTextFieldBounds, decorationBoxBounds);
        }
    }

    @Override // com.google.inputmethod.zb9
    public void e(final TextFieldValue value, final ImeOptions imeOptions, final Function1<? super List<? extends cn3>, Unit> onEditCommand, final Function1<? super a, Unit> onImeActionPerformed) {
        r(new Function1() { // from class: com.google.android.ol
            public final Object invoke(Object obj) {
                return AndroidLegacyPlatformTextInputServiceAdapter.s(value, this, imeOptions, onEditCommand, onImeActionPerformed, (c) obj);
            }
        });
    }

    @Override // com.google.inputmethod.zb9
    public void f(gba rect) {
        c cVar = this.currentRequest;
        if (cVar != null) {
            cVar.m(rect);
        }
    }

    @Override // com.google.inputmethod.zb9
    public void h(TextFieldValue oldValue, TextFieldValue newValue) {
        c cVar = this.currentRequest;
        if (cVar != null) {
            cVar.r(oldValue, newValue);
        }
    }

    @Override // androidx.compose.p001foundation.text.input.internal.b
    public void k() {
        l58<Unit> l58VarQ = q();
        if (l58VarQ != null) {
            l58VarQ.g(Unit.a);
        }
    }
}
