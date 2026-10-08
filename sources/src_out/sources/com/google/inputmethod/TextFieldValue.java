package com.google.inputmethod;

import androidx.compose.ui.text.b;
import androidx.compose.ui.text.p;
import androidx.compose.ui.text.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.cwc, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001\u0019B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB)\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\u000bJ-\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0018¨\u0006'"}, d2 = {"Lcom/google/android/cwc;", "", "Landroidx/compose/ui/text/b;", "annotatedString", "Landroidx/compose/ui/text/x;", "selection", "composition", "<init>", "(Landroidx/compose/ui/text/b;JLandroidx/compose/ui/text/x;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "text", "(Ljava/lang/String;JLandroidx/compose/ui/text/x;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "f", "(Landroidx/compose/ui/text/b;JLandroidx/compose/ui/text/x;)Lcom/google/android/cwc;", "g", "(Ljava/lang/String;JLandroidx/compose/ui/text/x;)Lcom/google/android/cwc;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/text/b;", "j", "()Landroidx/compose/ui/text/b;", "b", "J", "l", "()J", "c", "Landroidx/compose/ui/text/x;", "k", "()Landroidx/compose/ui/text/x;", "m", "d", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextFieldValue {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final k0b<TextFieldValue, Object> e = n0b.e(new Function2() { // from class: com.google.android.awc
        public final Object invoke(Object obj, Object obj2) {
            return TextFieldValue.c((o0b) obj, (TextFieldValue) obj2);
        }
    }, new Function1() { // from class: com.google.android.bwc
        public final Object invoke(Object obj) {
            return TextFieldValue.d(obj);
        }
    });

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final b text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long selection;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final x composition;

    /* JADX INFO: renamed from: com.google.android.cwc$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/android/cwc$a;", "", "<init>", "()V", "Lcom/google/android/k0b;", "Lcom/google/android/cwc;", "Saver", "Lcom/google/android/k0b;", "a", "()Lcom/google/android/k0b;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k0b<TextFieldValue, Object> a() {
            return TextFieldValue.e;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextFieldValue(b bVar, long j, x xVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, j, xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(o0b o0bVar, TextFieldValue textFieldValue) {
        return m.i(new Object[]{p.T1(textFieldValue.text, p.v1(), o0bVar), p.T1(x.b(textFieldValue.selection), p.w1(x.INSTANCE), o0bVar)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue d(Object obj) {
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        k0b<b, Object> k0bVarV1 = p.v1();
        Boolean bool = Boolean.FALSE;
        x xVarB = null;
        b bVarB = ((!Intrinsics.e(obj2, bool) || (k0bVarV1 instanceof wi8)) && obj2 != null) ? k0bVarV1.b(obj2) : null;
        Intrinsics.g(bVarB);
        Object obj3 = list.get(1);
        k0b<x, Object> k0bVarW1 = p.w1(x.INSTANCE);
        if ((!Intrinsics.e(obj3, bool) || (k0bVarW1 instanceof wi8)) && obj3 != null) {
            xVarB = k0bVarW1.b(obj3);
        }
        Intrinsics.g(xVarB);
        return new TextFieldValue(bVarB, xVarB.getPackedValue(), (x) null, 4, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ TextFieldValue h(TextFieldValue textFieldValue, b bVar, long j, x xVar, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = textFieldValue.text;
        }
        if ((i & 2) != 0) {
            j = textFieldValue.selection;
        }
        if ((i & 4) != 0) {
            xVar = textFieldValue.composition;
        }
        return textFieldValue.f(bVar, j, xVar);
    }

    public static /* synthetic */ TextFieldValue i(TextFieldValue textFieldValue, String str, long j, x xVar, int i, Object obj) {
        if ((i & 2) != 0) {
            j = textFieldValue.selection;
        }
        if ((i & 4) != 0) {
            xVar = textFieldValue.composition;
        }
        return textFieldValue.g(str, j, xVar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) other;
        return x.g(this.selection, textFieldValue.selection) && Intrinsics.e(this.composition, textFieldValue.composition) && Intrinsics.e(this.text, textFieldValue.text);
    }

    public final TextFieldValue f(b annotatedString, long selection, x composition) {
        return new TextFieldValue(annotatedString, selection, composition, (DefaultConstructorMarker) null);
    }

    public final TextFieldValue g(String text, long selection, x composition) {
        List list = null;
        return new TextFieldValue(new b(text, list, 2, list), selection, composition, (DefaultConstructorMarker) null);
    }

    public int hashCode() {
        int iHashCode = ((this.text.hashCode() * 31) + x.o(this.selection)) * 31;
        x xVar = this.composition;
        return iHashCode + (xVar != null ? x.o(xVar.getPackedValue()) : 0);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final b getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final x getComposition() {
        return this.composition;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getSelection() {
        return this.selection;
    }

    public final String m() {
        return this.text.getText();
    }

    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.text) + "', selection=" + ((Object) x.q(this.selection)) + ", composition=" + this.composition + ')';
    }

    public /* synthetic */ TextFieldValue(String str, long j, x xVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, xVar);
    }

    private TextFieldValue(b bVar, long j, x xVar) {
        this.text = bVar;
        this.selection = zyc.c(j, 0, m().length());
        this.composition = xVar != null ? x.b(zyc.c(xVar.getPackedValue(), 0, m().length())) : null;
    }

    public /* synthetic */ TextFieldValue(b bVar, long j, x xVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i & 2) != 0 ? x.INSTANCE.a() : j, (i & 4) != 0 ? null : xVar, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ TextFieldValue(String str, long j, x xVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? x.INSTANCE.a() : j, (i & 4) != 0 ? null : xVar, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private TextFieldValue(String str, long j, x xVar) {
        List list = null;
        this(new b(str, list, 2, list), j, xVar, (DefaultConstructorMarker) null);
    }
}
