package com.google.inputmethod;

import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.p001foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.b;
import androidx.compose.ui.text.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0011\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0016\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0018\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010\u001b\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u001a2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u001a2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010 \u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b \u0010!J%\u0010\"\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u001f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\"\u0010#JA\u0010'\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020$2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010%2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b'\u0010(J9\u0010*\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020)2\b\u0010&\u001a\u0004\u0018\u00010%2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b*\u0010+JA\u0010-\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020,2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010%2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b-\u0010.J3\u00101\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\r2\u0006\u0010\u0015\u001a\u0002002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b1\u00102J5\u00105\u001a\u00020\u000b2\u0006\u00104\u001a\u0002032\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b5\u00106J;\u00109\u001a\u00020\u000b2\u0006\u00104\u001a\u0002032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u00108\u001a\u0002072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b9\u0010:J+\u0010<\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020;2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b<\u0010=J\u0013\u0010?\u001a\u00020>*\u00020\rH\u0002¢\u0006\u0004\b?\u0010@JC\u0010A\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020;2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010&\u001a\u0004\u0018\u00010%2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0000¢\u0006\u0004\bA\u0010BJ/\u0010F\u001a\u000207*\u00020\u00042\u0006\u0010\u0006\u001a\u00020C2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010E\u001a\u0004\u0018\u00010DH\u0000¢\u0006\u0004\bF\u0010G¨\u0006H"}, d2 = {"Lcom/google/android/a65;", "", "<init>", "()V", "Lcom/google/android/k07;", "Landroid/view/inputmethod/SelectGesture;", "gesture", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "textSelectionManager", "Lkotlin/Function1;", "Lcom/google/android/cn3;", "", "editCommandConsumer", "", "m", "(Lcom/google/android/k07;Landroid/view/inputmethod/SelectGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;)I", "textFieldSelectionManager", "t", "(Lcom/google/android/k07;Landroid/view/inputmethod/SelectGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "Landroid/view/inputmethod/DeleteGesture;", "Landroidx/compose/ui/text/b;", "text", "d", "(Lcom/google/android/k07;Landroid/view/inputmethod/DeleteGesture;Landroidx/compose/ui/text/b;Lkotlin/jvm/functions/Function1;)I", "p", "(Lcom/google/android/k07;Landroid/view/inputmethod/DeleteGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "Landroid/view/inputmethod/SelectRangeGesture;", "n", "(Lcom/google/android/k07;Landroid/view/inputmethod/SelectRangeGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;)I", "u", "(Lcom/google/android/k07;Landroid/view/inputmethod/SelectRangeGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "Landroid/view/inputmethod/DeleteRangeGesture;", "e", "(Lcom/google/android/k07;Landroid/view/inputmethod/DeleteRangeGesture;Landroidx/compose/ui/text/b;Lkotlin/jvm/functions/Function1;)I", "q", "(Lcom/google/android/k07;Landroid/view/inputmethod/DeleteRangeGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "Landroid/view/inputmethod/JoinOrSplitGesture;", "Lcom/google/android/p7e;", "viewConfiguration", "j", "(Lcom/google/android/k07;Landroid/view/inputmethod/JoinOrSplitGesture;Landroidx/compose/ui/text/b;Lcom/google/android/p7e;Lkotlin/jvm/functions/Function1;)I", "Landroid/view/inputmethod/InsertGesture;", "h", "(Lcom/google/android/k07;Landroid/view/inputmethod/InsertGesture;Lcom/google/android/p7e;Lkotlin/jvm/functions/Function1;)I", "Landroid/view/inputmethod/RemoveSpaceGesture;", "k", "(Lcom/google/android/k07;Landroid/view/inputmethod/RemoveSpaceGesture;Landroidx/compose/ui/text/b;Lcom/google/android/p7e;Lkotlin/jvm/functions/Function1;)I", "offset", "", "i", "(ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/text/x;", "range", "o", "(JLandroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;)V", "", "adjustRange", "f", "(JLandroidx/compose/ui/text/b;ZLkotlin/jvm/functions/Function1;)V", "Landroid/view/inputmethod/HandwritingGesture;", "c", "(Landroid/view/inputmethod/HandwritingGesture;Lkotlin/jvm/functions/Function1;)I", "Lcom/google/android/jwc;", "v", "(I)I", "g", "(Lcom/google/android/k07;Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lcom/google/android/p7e;Lkotlin/jvm/functions/Function1;)I", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "r", "(Lcom/google/android/k07;Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroid/os/CancellationSignal;)Z", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a65 {
    public static final a65 a = new a65();

    private a65() {
    }

    private final int c(HandwritingGesture gesture, Function1<? super cn3, Unit> editCommandConsumer) {
        String fallbackText = gesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        editCommandConsumer.invoke(new CommitTextCommand(fallbackText, 1));
        return 5;
    }

    private final int d(k07 k07Var, DeleteGesture deleteGesture, b bVar, Function1<? super cn3, Unit> function1) {
        int iV = v(deleteGesture.getGranularity());
        long jR = b65.r(k07Var, jba.f(deleteGesture.getDeletionArea()), iV, nwc.INSTANCE.h());
        if (x.h(jR)) {
            return a.c(k55.a(deleteGesture), function1);
        }
        f(jR, bVar, jwc.d(iV, jwc.INSTANCE.b()), function1);
        return 1;
    }

    private final int e(k07 k07Var, DeleteRangeGesture deleteRangeGesture, b bVar, Function1<? super cn3, Unit> function1) {
        int iV = v(deleteRangeGesture.getGranularity());
        long jS = b65.s(k07Var, jba.f(deleteRangeGesture.getDeletionStartArea()), jba.f(deleteRangeGesture.getDeletionEndArea()), iV, nwc.INSTANCE.h());
        if (x.h(jS)) {
            return a.c(k55.a(deleteRangeGesture), function1);
        }
        f(jS, bVar, jwc.d(iV, jwc.INSTANCE.b()), function1);
        return 1;
    }

    private final void f(long range, b text, boolean adjustRange, Function1<? super cn3, Unit> editCommandConsumer) {
        if (adjustRange) {
            range = b65.j(range, text);
        }
        editCommandConsumer.invoke(b65.k(new SetSelectionCommand(x.i(range), x.i(range)), new DeleteSurroundingTextCommand(x.j(range), 0)));
    }

    private final int h(k07 k07Var, InsertGesture insertGesture, p7e p7eVar, Function1<? super cn3, Unit> function1) {
        wxc wxcVarN;
        TextLayoutResult value;
        if (p7eVar == null) {
            return c(k55.a(insertGesture), function1);
        }
        int iN = b65.n(k07Var, b65.z(insertGesture.getInsertionPoint()), p7eVar);
        if (iN == -1 || !((wxcVarN = k07Var.n()) == null || (value = wxcVarN.getValue()) == null || !b65.t(value, iN))) {
            return c(k55.a(insertGesture), function1);
        }
        i(iN, insertGesture.getTextToInsert(), function1);
        return 1;
    }

    private final void i(int offset, String text, Function1<? super cn3, Unit> editCommandConsumer) {
        editCommandConsumer.invoke(b65.k(new SetSelectionCommand(offset, offset), new CommitTextCommand(text, 1)));
    }

    private final int j(k07 k07Var, JoinOrSplitGesture joinOrSplitGesture, b bVar, p7e p7eVar, Function1<? super cn3, Unit> function1) {
        wxc wxcVarN;
        TextLayoutResult value;
        if (p7eVar == null) {
            return c(k55.a(joinOrSplitGesture), function1);
        }
        int iN = b65.n(k07Var, b65.z(joinOrSplitGesture.getJoinOrSplitPoint()), p7eVar);
        if (iN == -1 || !((wxcVarN = k07Var.n()) == null || (value = wxcVarN.getValue()) == null || !b65.t(value, iN))) {
            return c(k55.a(joinOrSplitGesture), function1);
        }
        long jY = b65.y(bVar, iN);
        if (x.h(jY)) {
            i(x.n(jY), " ", function1);
        } else {
            f(jY, bVar, false, function1);
        }
        return 1;
    }

    private final int k(k07 k07Var, RemoveSpaceGesture removeSpaceGesture, b bVar, p7e p7eVar, Function1<? super cn3, Unit> function1) {
        wxc wxcVarN = k07Var.n();
        long jP = b65.p(wxcVarN != null ? wxcVarN.getValue() : null, b65.z(removeSpaceGesture.getStartPoint()), b65.z(removeSpaceGesture.getEndPoint()), k07Var.m(), p7eVar);
        if (x.h(jP)) {
            return a.c(k55.a(removeSpaceGesture), function1);
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        final Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = -1;
        String strK = new Regex("\\s+").k(zyc.e(bVar, jP), new Function1() { // from class: com.google.android.z55
            public final Object invoke(Object obj) {
                return a65.l(intRef, intRef2, (MatchResult) obj);
            }
        });
        if (intRef.element == -1 || intRef2.element == -1) {
            return c(k55.a(removeSpaceGesture), function1);
        }
        int iN = x.n(jP) + intRef.element;
        int iN2 = x.n(jP) + intRef2.element;
        String strSubstring = strK.substring(intRef.element, strK.length() - (x.j(jP) - intRef2.element));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        function1.invoke(b65.k(new SetSelectionCommand(iN, iN2), new CommitTextCommand(strSubstring, 1)));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence l(Ref.IntRef intRef, Ref.IntRef intRef2, MatchResult matchResult) {
        if (intRef.element == -1) {
            intRef.element = matchResult.d().f();
        }
        intRef2.element = matchResult.d().i() + 1;
        return "";
    }

    private final int m(k07 k07Var, SelectGesture selectGesture, TextFieldSelectionManager textFieldSelectionManager, Function1<? super cn3, Unit> function1) {
        long jR = b65.r(k07Var, jba.f(selectGesture.getSelectionArea()), v(selectGesture.getGranularity()), nwc.INSTANCE.h());
        if (x.h(jR)) {
            return a.c(k55.a(selectGesture), function1);
        }
        o(jR, textFieldSelectionManager, function1);
        return 1;
    }

    private final int n(k07 k07Var, SelectRangeGesture selectRangeGesture, TextFieldSelectionManager textFieldSelectionManager, Function1<? super cn3, Unit> function1) {
        long jS = b65.s(k07Var, jba.f(selectRangeGesture.getSelectionStartArea()), jba.f(selectRangeGesture.getSelectionEndArea()), v(selectRangeGesture.getGranularity()), nwc.INSTANCE.h());
        if (x.h(jS)) {
            return a.c(k55.a(selectRangeGesture), function1);
        }
        o(jS, textFieldSelectionManager, function1);
        return 1;
    }

    private final void o(long range, TextFieldSelectionManager textSelectionManager, Function1<? super cn3, Unit> editCommandConsumer) {
        editCommandConsumer.invoke(new SetSelectionCommand(x.n(range), x.i(range)));
        if (textSelectionManager != null) {
            textSelectionManager.M(true);
        }
    }

    private final void p(k07 k07Var, DeleteGesture deleteGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.C0(b65.r(k07Var, jba.f(deleteGesture.getDeletionArea()), v(deleteGesture.getGranularity()), nwc.INSTANCE.h()));
        }
    }

    private final void q(k07 k07Var, DeleteRangeGesture deleteRangeGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.C0(b65.s(k07Var, jba.f(deleteRangeGesture.getDeletionStartArea()), jba.f(deleteRangeGesture.getDeletionEndArea()), v(deleteRangeGesture.getGranularity()), nwc.INSTANCE.h()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.B();
        }
    }

    private final void t(k07 k07Var, SelectGesture selectGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.P0(b65.r(k07Var, jba.f(selectGesture.getSelectionArea()), v(selectGesture.getGranularity()), nwc.INSTANCE.h()));
        }
    }

    private final void u(k07 k07Var, SelectRangeGesture selectRangeGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.P0(b65.s(k07Var, jba.f(selectRangeGesture.getSelectionStartArea()), jba.f(selectRangeGesture.getSelectionEndArea()), v(selectRangeGesture.getGranularity()), nwc.INSTANCE.h()));
        }
    }

    private final int v(int i) {
        if (i != 1) {
            return i != 2 ? jwc.INSTANCE.a() : jwc.INSTANCE.a();
        }
        return jwc.INSTANCE.b();
    }

    public final int g(k07 k07Var, HandwritingGesture handwritingGesture, TextFieldSelectionManager textFieldSelectionManager, p7e p7eVar, Function1<? super cn3, Unit> function1) {
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        b untransformedText = k07Var.getUntransformedText();
        if (untransformedText == null) {
            return 3;
        }
        wxc wxcVarN = k07Var.n();
        if (!Intrinsics.e(untransformedText, (wxcVarN == null || (value = wxcVarN.getValue()) == null || (layoutInput = value.getLayoutInput()) == null) ? null : layoutInput.getText())) {
            return 3;
        }
        if (e55.a(handwritingGesture)) {
            return m(k07Var, p55.a(handwritingGesture), textFieldSelectionManager, function1);
        }
        if (r55.a(handwritingGesture)) {
            return d(k07Var, s55.a(handwritingGesture), untransformedText, function1);
        }
        if (t55.a(handwritingGesture)) {
            return n(k07Var, u55.a(handwritingGesture), textFieldSelectionManager, function1);
        }
        if (v55.a(handwritingGesture)) {
            return e(k07Var, w55.a(handwritingGesture), untransformedText, function1);
        }
        if (i55.a(handwritingGesture)) {
            return j(k07Var, j55.a(handwritingGesture), untransformedText, p7eVar, function1);
        }
        if (d55.a(handwritingGesture)) {
            return h(k07Var, f55.a(handwritingGesture), p7eVar, function1);
        }
        if (g55.a(handwritingGesture)) {
            return k(k07Var, h55.a(handwritingGesture), untransformedText, p7eVar, function1);
        }
        return 2;
    }

    public final boolean r(k07 k07Var, PreviewableHandwritingGesture previewableHandwritingGesture, final TextFieldSelectionManager textFieldSelectionManager, CancellationSignal cancellationSignal) {
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        b untransformedText = k07Var.getUntransformedText();
        if (untransformedText == null) {
            return false;
        }
        wxc wxcVarN = k07Var.n();
        if (!Intrinsics.e(untransformedText, (wxcVarN == null || (value = wxcVarN.getValue()) == null || (layoutInput = value.getLayoutInput()) == null) ? null : layoutInput.getText())) {
            return false;
        }
        if (e55.a(previewableHandwritingGesture)) {
            t(k07Var, p55.a(previewableHandwritingGesture), textFieldSelectionManager);
        } else if (r55.a(previewableHandwritingGesture)) {
            p(k07Var, s55.a(previewableHandwritingGesture), textFieldSelectionManager);
        } else if (t55.a(previewableHandwritingGesture)) {
            u(k07Var, u55.a(previewableHandwritingGesture), textFieldSelectionManager);
        } else {
            if (!v55.a(previewableHandwritingGesture)) {
                return false;
            }
            q(k07Var, w55.a(previewableHandwritingGesture), textFieldSelectionManager);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: com.google.android.y55
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                a65.s(textFieldSelectionManager);
            }
        });
        return true;
    }
}
