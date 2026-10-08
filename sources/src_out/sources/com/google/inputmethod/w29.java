package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011\"\u0004\b\u0014\u0010\u0005R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001d¨\u0006 "}, d2 = {"Lcom/google/android/w29;", "", "", "text", "<init>", "(Ljava/lang/String;)V", "", "start", "end", "", "c", "(IILjava/lang/String;)V", "index", "", "a", "(I)C", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getText", "setText", "Lcom/google/android/mu4;", "b", "Lcom/google/android/mu4;", "buffer", "I", "bufStart", "d", "bufEnd", "()I", "length", "e", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w29 {
    public static final int f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private String text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private mu4 buffer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int bufStart = -1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int bufEnd = -1;

    public w29(String str) {
        this.text = str;
    }

    public final char a(int index) {
        mu4 mu4Var = this.buffer;
        if (mu4Var != null && index >= this.bufStart) {
            int iE = mu4Var.e();
            int i = this.bufStart;
            return index < iE + i ? mu4Var.d(index - i) : this.text.charAt(index - ((iE - this.bufEnd) + i));
        }
        return this.text.charAt(index);
    }

    public final int b() {
        mu4 mu4Var = this.buffer;
        return mu4Var == null ? this.text.length() : (this.text.length() - (this.bufEnd - this.bufStart)) + mu4Var.e();
    }

    public final void c(int start, int end, String text) {
        if (!(start <= end)) {
            ax5.a("start index must be less than or equal to end index: " + start + " > " + end);
        }
        if (!(start >= 0)) {
            ax5.a("start must be non-negative, but was " + start);
        }
        mu4 mu4Var = this.buffer;
        if (mu4Var != null) {
            int i = this.bufStart;
            int i2 = start - i;
            int i3 = end - i;
            if (i2 >= 0 && i3 <= mu4Var.e()) {
                mu4Var.g(i2, i3, text);
                return;
            }
            this.text = toString();
            this.buffer = null;
            this.bufStart = -1;
            this.bufEnd = -1;
            c(start, end, text);
            return;
        }
        int iMax = Math.max(255, text.length() + 128);
        char[] cArr = new char[iMax];
        int iMin = Math.min(start, 64);
        int iMin2 = Math.min(this.text.length() - end, 64);
        int i4 = start - iMin;
        ou4.a(this.text, cArr, 0, i4, start);
        int i5 = iMax - iMin2;
        int i6 = iMin2 + end;
        ou4.a(this.text, cArr, i5, end, i6);
        nu4.b(text, cArr, iMin);
        this.buffer = new mu4(cArr, iMin + text.length(), i5);
        this.bufStart = i4;
        this.bufEnd = i6;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public String toString() {
        mu4 mu4Var = this.buffer;
        if (mu4Var == null) {
            return this.text;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.text, 0, this.bufStart);
        mu4Var.a(sb);
        String str = this.text;
        sb.append((CharSequence) str, this.bufEnd, str.length());
        return sb.toString();
    }
}
