package com.google.inputmethod;

import androidx.compose.ui.text.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\f*\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00132\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0011\u0010\"\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b!\u0010\u001c¨\u0006#"}, d2 = {"Lcom/google/android/kuc;", "Lcom/google/android/ng0;", "Lcom/google/android/cwc;", "currentValue", "Lcom/google/android/zn8;", "offsetMapping", "Lcom/google/android/wxc;", "layoutResultProxy", "Lcom/google/android/yyc;", "state", "<init>", "(Lcom/google/android/cwc;Lcom/google/android/zn8;Lcom/google/android/wxc;Lcom/google/android/yyc;)V", "", "pagesAmount", "b0", "(Lcom/google/android/wxc;I)I", "Lkotlin/Function1;", "Lcom/google/android/cn3;", "or", "", "Z", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "d0", "()Lcom/google/android/kuc;", "c0", "j", "Lcom/google/android/cwc;", "getCurrentValue", "()Lcom/google/android/cwc;", "k", "Lcom/google/android/wxc;", "getLayoutResultProxy", "()Lcom/google/android/wxc;", "a0", "value", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class kuc extends ng0<kuc> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final TextFieldValue currentValue;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final wxc layoutResultProxy;

    public kuc(TextFieldValue textFieldValue, zn8 zn8Var, wxc wxcVar, yyc yycVar) {
        super(textFieldValue.getText(), textFieldValue.getSelection(), wxcVar != null ? wxcVar.getValue() : null, zn8Var, yycVar, null);
        this.currentValue = textFieldValue;
        this.layoutResultProxy = wxcVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    private final int b0(wxc wxcVar, int i) {
        gba gbaVarA;
        kn6 innerTextFieldCoordinates = wxcVar.getInnerTextFieldCoordinates();
        if (innerTextFieldCoordinates != null) {
            kn6 decorationBoxCoordinates = wxcVar.getDecorationBoxCoordinates();
            gbaVarA = decorationBoxCoordinates != null ? kn6.w(decorationBoxCoordinates, innerTextFieldCoordinates, false, 2, null) : null;
            if (gbaVarA == null) {
                gbaVarA = gba.INSTANCE.a();
            }
        } else {
            gbaVarA = gba.INSTANCE.a();
        }
        gba gbaVarE = wxcVar.getValue().e(getOffsetMapping().b(x.i(this.currentValue.getSelection())));
        return getOffsetMapping().a(wxcVar.getValue().x(rn8.e((((long) Float.floatToRawIntBits(gbaVarE.getLeft())) << 32) | (((long) Float.floatToRawIntBits(gbaVarE.getTop() + (Float.intBitsToFloat((int) (gbaVarA.k() & 4294967295L)) * i))) & 4294967295L))));
    }

    public final List<cn3> Z(Function1<? super kuc, ? extends cn3> or) {
        if (!x.h(getSelection())) {
            return m.s(new cn3[]{new CommitTextCommand("", 0), new SetSelectionCommand(x.l(getSelection()), x.l(getSelection()))});
        }
        cn3 cn3Var = (cn3) or.invoke(this);
        if (cn3Var != null) {
            return m.e(cn3Var);
        }
        return null;
    }

    public final TextFieldValue a0() {
        return TextFieldValue.h(this.currentValue, getAnnotatedString(), getSelection(), null, 4, null);
    }

    public final kuc c0() {
        wxc wxcVar;
        if (x().length() > 0 && (wxcVar = this.layoutResultProxy) != null) {
            U(b0(wxcVar, 1));
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final kuc d0() {
        wxc wxcVar;
        if (x().length() > 0 && (wxcVar = this.layoutResultProxy) != null) {
            U(b0(wxcVar, -1));
        }
        Intrinsics.h(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }
}
