package com.google.inputmethod;

import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.a;
import com.google.android.r43;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@r43
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001JM\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0006H&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH&¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\tH&¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\tH&¢\u0006\u0004\b\u0013\u0010\u0010J!\u0010\u0016\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJK\u0010%\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u0018H\u0016¢\u0006\u0004\b%\u0010&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006'À\u0006\u0001"}, d2 = {"Lcom/google/android/zb9;", "", "Lcom/google/android/cwc;", "value", "Landroidx/compose/ui/text/input/b;", "imeOptions", "Lkotlin/Function1;", "", "Lcom/google/android/cn3;", "", "onEditCommand", "Landroidx/compose/ui/text/input/a;", "onImeActionPerformed", "e", "(Lcom/google/android/cwc;Landroidx/compose/ui/text/input/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "b", "()V", "a", "g", "c", "oldValue", "newValue", "h", "(Lcom/google/android/cwc;Lcom/google/android/cwc;)V", "Lcom/google/android/gba;", "rect", "f", "(Lcom/google/android/gba;)V", "textFieldValue", "Lcom/google/android/zn8;", "offsetMapping", "Lcom/google/android/vxc;", "textLayoutResult", "Lcom/google/android/zh7;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "d", "(Lcom/google/android/cwc;Lcom/google/android/zn8;Lcom/google/android/vxc;Lkotlin/jvm/functions/Function1;Lcom/google/android/gba;Lcom/google/android/gba;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface zb9 {
    void a();

    default void b() {
    }

    void c();

    default void d(TextFieldValue textFieldValue, zn8 offsetMapping, TextLayoutResult textLayoutResult, Function1<? super zh7, Unit> textFieldToRootTransform, gba innerTextFieldBounds, gba decorationBoxBounds) {
    }

    void e(TextFieldValue value, ImeOptions imeOptions, Function1<? super List<? extends cn3>, Unit> onEditCommand, Function1<? super a, Unit> onImeActionPerformed);

    default void f(gba rect) {
    }

    void g();

    void h(TextFieldValue oldValue, TextFieldValue newValue);
}
