package androidx.compose.p001foundation.text;

import androidx.compose.p001foundation.text.r;
import androidx.compose.p001foundation.text.selection.m;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.b;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.a;
import androidx.compose.ui.text.x;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.TextFieldValue;
import com.google.inputmethod.TextLayoutResult;
import com.google.inputmethod.TransformedText;
import com.google.inputmethod.asc;
import com.google.inputmethod.cn3;
import com.google.inputmethod.dxc;
import com.google.inputmethod.ei1;
import com.google.inputmethod.fn3;
import com.google.inputmethod.hxc;
import com.google.inputmethod.kn6;
import com.google.inputmethod.ln6;
import com.google.inputmethod.q09;
import com.google.inputmethod.q16;
import com.google.inputmethod.w41;
import com.google.inputmethod.wrc;
import com.google.inputmethod.wxc;
import com.google.inputmethod.wyc;
import com.google.inputmethod.ysc;
import com.google.inputmethod.zh7;
import com.google.inputmethod.zn8;
import com.google.inputmethod.zyc;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/r;", "", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: androidx.compose.foundation.text.r$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010JE\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\n0\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0004\b\u001a\u0010\u001bJO\u0010#\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010 \u001a\u00020\f2\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b#\u0010$JG\u0010+\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b+\u0010,J/\u0010/\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'2\u0006\u0010-\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020.H\u0001¢\u0006\u0004\b/\u00100JC\u00109\u001a\u00020\u000e2\f\u00103\u001a\b\u0012\u0004\u0012\u000202012\u0006\u00105\u001a\u0002042\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e062\b\u00108\u001a\u0004\u0018\u00010'H\u0001¢\u0006\u0004\b9\u0010:JC\u0010=\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020;2\u0006\u0010\u000b\u001a\u00020.2\u0006\u00105\u001a\u0002042\u0006\u0010\t\u001a\u00020\b2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e06H\u0001¢\u0006\u0004\b=\u0010>JW\u0010E\u001a\u00020'2\u0006\u0010@\u001a\u00020?2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00105\u001a\u0002042\u0006\u0010B\u001a\u00020A2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e062\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u000e06H\u0001¢\u0006\u0004\bE\u0010FJW\u0010G\u001a\u00020'2\u0006\u0010@\u001a\u00020?2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00105\u001a\u0002042\u0006\u0010B\u001a\u00020A2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e062\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u000e06H\u0001¢\u0006\u0004\bG\u0010FJ3\u0010H\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'2\u0006\u00105\u001a\u0002042\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e06H\u0001¢\u0006\u0004\bH\u0010IJ\u001d\u0010M\u001a\u00020K2\u0006\u0010J\u001a\u00020\u00062\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bM\u0010N¨\u0006O"}, d2 = {"Landroidx/compose/foundation/text/r$a;", "", "<init>", "()V", "Lcom/google/android/w41;", "canvas", "Landroidx/compose/ui/text/x;", "range", "Lcom/google/android/zn8;", "offsetMapping", "Lcom/google/android/vxc;", "textLayoutResult", "Lcom/google/android/q09;", "paint", "", "e", "(Lcom/google/android/w41;JLcom/google/android/zn8;Lcom/google/android/vxc;Lcom/google/android/q09;)V", "Lcom/google/android/asc;", "textDelegate", "Lcom/google/android/kx1;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "prevResultText", "Lkotlin/Triple;", "", "f", "(Lcom/google/android/asc;JLandroidx/compose/ui/unit/LayoutDirection;Lcom/google/android/vxc;)Lkotlin/Triple;", "Lcom/google/android/cwc;", "value", "selectionPreviewHighlightRange", "deletionPreviewHighlightRange", "highlightPaint", "Lcom/google/android/ei1;", "selectionBackgroundColor", "d", "(Lcom/google/android/w41;Lcom/google/android/cwc;JJLcom/google/android/zn8;Lcom/google/android/vxc;Lcom/google/android/q09;J)V", "Lcom/google/android/kn6;", "layoutCoordinates", "Lcom/google/android/hxc;", "textInputSession", "", "hasFocus", "g", "(Lcom/google/android/cwc;Lcom/google/android/asc;Lcom/google/android/vxc;Lcom/google/android/kn6;Lcom/google/android/hxc;ZLcom/google/android/zn8;)V", "textFieldValue", "Lcom/google/android/wxc;", "o", "(Lcom/google/android/hxc;Lcom/google/android/cwc;Lcom/google/android/zn8;Lcom/google/android/wxc;)V", "", "Lcom/google/android/cn3;", "ops", "Lcom/google/android/fn3;", "editProcessor", "Lkotlin/Function1;", "onValueChange", "session", "j", "(Ljava/util/List;Lcom/google/android/fn3;Lkotlin/jvm/functions/Function1;Lcom/google/android/hxc;)V", "Lcom/google/android/rn8;", "position", "n", "(JLcom/google/android/wxc;Lcom/google/android/fn3;Lcom/google/android/zn8;Lkotlin/jvm/functions/Function1;)V", "Lcom/google/android/dxc;", "textInputService", "Landroidx/compose/ui/text/input/b;", "imeOptions", "Landroidx/compose/ui/text/input/a;", "onImeActionPerformed", "l", "(Lcom/google/android/dxc;Lcom/google/android/cwc;Lcom/google/android/fn3;Landroidx/compose/ui/text/input/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/google/android/hxc;", "k", "i", "(Lcom/google/android/hxc;Lcom/google/android/fn3;Lkotlin/jvm/functions/Function1;)V", "compositionRange", "Lcom/google/android/jed;", "transformed", "c", "(JLcom/google/android/jed;)Lcom/google/android/jed;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: androidx.compose.foundation.text.r$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class C0029a implements Function1<zh7, Unit> {
            final /* synthetic */ kn6 a;

            C0029a(kn6 kn6Var) {
                this.a = kn6Var;
            }

            public final void a(float[] fArr) {
                if (this.a.b()) {
                    ln6.f(this.a).j0(this.a, fArr);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((zh7) obj).getValues());
                return Unit.a;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void e(w41 canvas, long range, zn8 offsetMapping, TextLayoutResult textLayoutResult, q09 paint) {
            int iB = offsetMapping.b(x.l(range));
            int iB2 = offsetMapping.b(x.k(range));
            if (iB != iB2) {
                canvas.y(textLayoutResult.z(iB, iB2), paint);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q16 h(asc ascVar) {
            return q16.b(ysc.b(ascVar.getStyle(), ascVar.getDensity(), ascVar.getFontFamilyResolver(), null, 0, 24, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(fn3 fn3Var, Function1 function1, Ref.ObjectRef objectRef, List list) {
            r.INSTANCE.j(list, fn3Var, function1, (hxc) objectRef.element);
            return Unit.a;
        }

        public final TransformedText c(long compositionRange, TransformedText transformed) {
            int iB = transformed.getOffsetMapping().b(x.n(compositionRange));
            int iB2 = transformed.getOffsetMapping().b(x.i(compositionRange));
            int iMin = Math.min(iB, iB2);
            int iMax = Math.max(iB, iB2);
            b.C0062b c0062b = new b.C0062b(transformed.getText());
            c0062b.d(new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, wrc.INSTANCE.d(), null, null, null, 61439, null), iMin, iMax);
            return new TransformedText(c0062b.t(), transformed.getOffsetMapping());
        }

        public final void d(w41 canvas, TextFieldValue value, long selectionPreviewHighlightRange, long deletionPreviewHighlightRange, zn8 offsetMapping, TextLayoutResult textLayoutResult, q09 highlightPaint, long selectionBackgroundColor) {
            if (!x.h(selectionPreviewHighlightRange)) {
                highlightPaint.n(selectionBackgroundColor);
                e(canvas, selectionPreviewHighlightRange, offsetMapping, textLayoutResult, highlightPaint);
            } else if (!x.h(deletionPreviewHighlightRange)) {
                ei1 ei1VarL = ei1.l(textLayoutResult.getLayoutInput().getStyle().h());
                if (ei1VarL.getValue() == 16) {
                    ei1VarL = null;
                }
                long value2 = ei1VarL != null ? ei1VarL.getValue() : ei1.INSTANCE.a();
                highlightPaint.n(ei1.p(value2, ei1.s(value2) * 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                e(canvas, deletionPreviewHighlightRange, offsetMapping, textLayoutResult, highlightPaint);
            } else if (!x.h(value.getSelection())) {
                highlightPaint.n(selectionBackgroundColor);
                e(canvas, value.getSelection(), offsetMapping, textLayoutResult, highlightPaint);
            }
            wyc.a.a(canvas, textLayoutResult);
        }

        public final Triple<Integer, Integer, TextLayoutResult> f(asc textDelegate, long constraints, LayoutDirection layoutDirection, TextLayoutResult prevResultText) {
            TextLayoutResult textLayoutResultL = textDelegate.l(constraints, layoutDirection, prevResultText);
            return new Triple<>(Integer.valueOf((int) (textLayoutResultL.getSize() >> 32)), Integer.valueOf((int) (textLayoutResultL.getSize() & 4294967295L)), textLayoutResultL);
        }

        public final void g(TextFieldValue value, final asc textDelegate, TextLayoutResult textLayoutResult, kn6 layoutCoordinates, hxc textInputSession, boolean hasFocus, zn8 offsetMapping) {
            if (hasFocus) {
                textInputSession.c(ysc.c(textLayoutResult, layoutCoordinates, offsetMapping.b(x.k(value.getSelection())), new Function0() { // from class: com.google.android.wsc
                    public final Object invoke() {
                        return r.Companion.h(textDelegate);
                    }
                }));
            }
        }

        public final void i(hxc textInputSession, fn3 editProcessor, Function1<? super TextFieldValue, Unit> onValueChange) {
            onValueChange.invoke(TextFieldValue.h(editProcessor.getMBufferState(), null, 0L, null, 3, null));
            textInputSession.a();
        }

        public final void j(List<? extends cn3> ops, fn3 editProcessor, Function1<? super TextFieldValue, Unit> onValueChange, hxc session) {
            TextFieldValue textFieldValueB = editProcessor.b(ops);
            if (session != null) {
                session.d(null, textFieldValueB);
            }
            onValueChange.invoke(textFieldValueB);
        }

        public final hxc k(dxc textInputService, TextFieldValue value, fn3 editProcessor, ImeOptions imeOptions, Function1<? super TextFieldValue, Unit> onValueChange, Function1<? super a, Unit> onImeActionPerformed) {
            return l(textInputService, value, editProcessor, imeOptions, onValueChange, onImeActionPerformed);
        }

        public final hxc l(dxc textInputService, TextFieldValue value, final fn3 editProcessor, ImeOptions imeOptions, final Function1<? super TextFieldValue, Unit> onValueChange, Function1<? super a, Unit> onImeActionPerformed) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            hxc hxcVarD = textInputService.d(value, imeOptions, new Function1() { // from class: com.google.android.xsc
                public final Object invoke(Object obj) {
                    return r.Companion.m(editProcessor, onValueChange, objectRef, (List) obj);
                }
            }, onImeActionPerformed);
            objectRef.element = hxcVarD;
            return hxcVarD;
        }

        public final void n(long position, wxc textLayoutResult, fn3 editProcessor, zn8 offsetMapping, Function1<? super TextFieldValue, Unit> onValueChange) {
            onValueChange.invoke(TextFieldValue.h(editProcessor.getMBufferState(), null, zyc.a(offsetMapping.a(wxc.e(textLayoutResult, position, false, 2, null))), null, 5, null));
        }

        public final void o(hxc textInputSession, TextFieldValue textFieldValue, zn8 offsetMapping, wxc textLayoutResult) {
            kn6 decorationBoxCoordinates;
            kn6 innerTextFieldCoordinates = textLayoutResult.getInnerTextFieldCoordinates();
            if (innerTextFieldCoordinates == null || !innerTextFieldCoordinates.b() || (decorationBoxCoordinates = textLayoutResult.getDecorationBoxCoordinates()) == null) {
                return;
            }
            textInputSession.e(textFieldValue, offsetMapping, textLayoutResult.getValue(), new C0029a(innerTextFieldCoordinates), m.b(innerTextFieldCoordinates), innerTextFieldCoordinates.R(decorationBoxCoordinates, false));
        }

        private Companion() {
        }
    }
}
