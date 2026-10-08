package com.google.inputmethod;

import androidx.compose.ui.text.b;
import androidx.compose.ui.text.c;
import androidx.compose.ui.text.x;
import com.google.android.oda;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017R$\u0010 \u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u001c8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/google/android/fn3;", "", "<init>", "()V", "", "Lcom/google/android/cn3;", "editCommands", "failedCommand", "", "c", "(Ljava/util/List;Lcom/google/android/cn3;)Ljava/lang/String;", "f", "(Lcom/google/android/cn3;)Ljava/lang/String;", "Lcom/google/android/cwc;", "value", "Lcom/google/android/hxc;", "textInputSession", "", "e", "(Lcom/google/android/cwc;Lcom/google/android/hxc;)V", "b", "(Ljava/util/List;)Lcom/google/android/cwc;", "g", "()Lcom/google/android/cwc;", "a", "Lcom/google/android/cwc;", "getMBufferState$ui_text", "mBufferState", "Lcom/google/android/gn3;", "Lcom/google/android/gn3;", "getMBuffer$ui_text", "()Lcom/google/android/gn3;", "mBuffer", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class fn3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private TextFieldValue mBufferState = new TextFieldValue(c.f(), x.INSTANCE.a(), (x) null, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private gn3 mBuffer = new gn3(this.mBufferState.getText(), this.mBufferState.getSelection(), null);

    private final String c(List<? extends cn3> editCommands, final cn3 failedCommand) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error while applying EditCommand batch to buffer (length=" + this.mBuffer.h() + ", composition=" + this.mBuffer.d() + ", selection=" + ((Object) x.q(this.mBuffer.i())) + "):");
        sb.append('\n');
        m.H0(editCommands, sb, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.google.android.en3
            public final Object invoke(Object obj) {
                return fn3.d(failedCommand, this, (cn3) obj);
            }
        }, 60, (Object) null);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence d(cn3 cn3Var, fn3 fn3Var, cn3 cn3Var2) {
        return (cn3Var == cn3Var2 ? " > " : "   ") + fn3Var.f(cn3Var2);
    }

    private final String f(cn3 cn3Var) {
        if (cn3Var instanceof CommitTextCommand) {
            StringBuilder sb = new StringBuilder();
            sb.append("CommitTextCommand(text.length=");
            CommitTextCommand commitTextCommand = (CommitTextCommand) cn3Var;
            sb.append(commitTextCommand.c().length());
            sb.append(", newCursorPosition=");
            sb.append(commitTextCommand.getNewCursorPosition());
            sb.append(')');
            return sb.toString();
        }
        if (cn3Var instanceof SetComposingTextCommand) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SetComposingTextCommand(text.length=");
            SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) cn3Var;
            sb2.append(setComposingTextCommand.c().length());
            sb2.append(", newCursorPosition=");
            sb2.append(setComposingTextCommand.getNewCursorPosition());
            sb2.append(')');
            return sb2.toString();
        }
        if (cn3Var instanceof SetComposingRegionCommand) {
            return ((SetComposingRegionCommand) cn3Var).toString();
        }
        if (cn3Var instanceof DeleteSurroundingTextCommand) {
            return ((DeleteSurroundingTextCommand) cn3Var).toString();
        }
        if (cn3Var instanceof DeleteSurroundingTextInCodePointsCommand) {
            return ((DeleteSurroundingTextInCodePointsCommand) cn3Var).toString();
        }
        if (cn3Var instanceof SetSelectionCommand) {
            return ((SetSelectionCommand) cn3Var).toString();
        }
        if (cn3Var instanceof wa4) {
            return ((wa4) cn3Var).toString();
        }
        if (cn3Var instanceof xd0) {
            return ((xd0) cn3Var).toString();
        }
        if (cn3Var instanceof s08) {
            return ((s08) cn3Var).toString();
        }
        if (cn3Var instanceof w33) {
            return ((w33) cn3Var).toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Unknown EditCommand: ");
        String strT = oda.b(cn3Var.getClass()).t();
        if (strT == null) {
            strT = "{anonymous EditCommand}";
        }
        sb3.append(strT);
        return sb3.toString();
    }

    public final TextFieldValue b(List<? extends cn3> editCommands) {
        cn3 cn3Var = null;
        try {
            int size = editCommands.size();
            int i = 0;
            cn3 cn3Var2 = null;
            while (i < size) {
                try {
                    cn3 cn3Var3 = editCommands.get(i);
                    try {
                        cn3Var3.a(this.mBuffer);
                        i++;
                        cn3Var2 = cn3Var3;
                    } catch (Exception e) {
                        e = e;
                        cn3Var = cn3Var3;
                        throw new RuntimeException(c(editCommands, cn3Var), e);
                    }
                } catch (Exception e2) {
                    e = e2;
                    cn3Var = cn3Var2;
                }
            }
            b bVarS = this.mBuffer.s();
            long jI = this.mBuffer.i();
            x xVarB = x.b(jI);
            xVarB.getPackedValue();
            x xVar = x.m(this.mBufferState.getSelection()) ? null : xVarB;
            TextFieldValue textFieldValue = new TextFieldValue(bVarS, xVar != null ? xVar.getPackedValue() : zyc.b(x.k(jI), x.l(jI)), this.mBuffer.d(), (DefaultConstructorMarker) null);
            this.mBufferState = textFieldValue;
            return textFieldValue;
        } catch (Exception e3) {
            e = e3;
        }
    }

    public final void e(TextFieldValue value, hxc textInputSession) {
        boolean zE = Intrinsics.e(value.getComposition(), this.mBuffer.d());
        boolean z = true;
        boolean z2 = false;
        if (!Intrinsics.e(this.mBufferState.getText().getText(), value.getText().getText())) {
            this.mBuffer = new gn3(value.getText(), value.getSelection(), null);
        } else if (x.g(this.mBufferState.getSelection(), value.getSelection())) {
            z = false;
        } else {
            this.mBuffer.p(x.l(value.getSelection()), x.k(value.getSelection()));
            z2 = true;
            z = false;
        }
        if (value.getComposition() == null) {
            this.mBuffer.a();
        } else if (!x.h(value.getComposition().getPackedValue())) {
            this.mBuffer.n(x.l(value.getComposition().getPackedValue()), x.k(value.getComposition().getPackedValue()));
        }
        if (z || (!z2 && !zE)) {
            this.mBuffer.a();
            value = TextFieldValue.h(value, null, 0L, null, 3, null);
        }
        TextFieldValue textFieldValue = this.mBufferState;
        this.mBufferState = value;
        if (textInputSession != null) {
            textInputSession.d(textFieldValue, value);
        }
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextFieldValue getMBufferState() {
        return this.mBufferState;
    }
}
