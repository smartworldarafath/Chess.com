package com.google.inputmethod;

import com.google.android.r43;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@r43
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJI\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b0\u00162\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0011\u0010%\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\"\u0010$¨\u0006&"}, d2 = {"Lcom/google/android/hxc;", "", "Lcom/google/android/dxc;", "textInputService", "Lcom/google/android/zb9;", "platformTextInputService", "<init>", "(Lcom/google/android/dxc;Lcom/google/android/zb9;)V", "", "a", "()V", "Lcom/google/android/gba;", "rect", "", "c", "(Lcom/google/android/gba;)Z", "Lcom/google/android/cwc;", "textFieldValue", "Lcom/google/android/zn8;", "offsetMapping", "Lcom/google/android/vxc;", "textLayoutResult", "Lkotlin/Function1;", "Lcom/google/android/zh7;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "e", "(Lcom/google/android/cwc;Lcom/google/android/zn8;Lcom/google/android/vxc;Lkotlin/jvm/functions/Function1;Lcom/google/android/gba;Lcom/google/android/gba;)Z", "oldValue", "newValue", "d", "(Lcom/google/android/cwc;Lcom/google/android/cwc;)Z", "Lcom/google/android/dxc;", "b", "Lcom/google/android/zb9;", "()Z", "isOpen", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class hxc {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final dxc textInputService;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final zb9 platformTextInputService;

    public hxc(dxc dxcVar, zb9 zb9Var) {
        this.textInputService = dxcVar;
        this.platformTextInputService = zb9Var;
    }

    public final void a() {
        this.textInputService.g(this);
    }

    public final boolean b() {
        return Intrinsics.e(this.textInputService.a(), this);
    }

    public final boolean c(gba rect) {
        boolean zB = b();
        if (zB) {
            this.platformTextInputService.f(rect);
        }
        return zB;
    }

    public final boolean d(TextFieldValue oldValue, TextFieldValue newValue) {
        boolean zB = b();
        if (zB) {
            this.platformTextInputService.h(oldValue, newValue);
        }
        return zB;
    }

    public final boolean e(TextFieldValue textFieldValue, zn8 offsetMapping, TextLayoutResult textLayoutResult, Function1<? super zh7, Unit> textFieldToRootTransform, gba innerTextFieldBounds, gba decorationBoxBounds) {
        boolean zB = b();
        if (zB) {
            this.platformTextInputService.d(textFieldValue, offsetMapping, textLayoutResult, textFieldToRootTransform, innerTextFieldBounds, decorationBoxBounds);
        }
        return zB;
    }
}
