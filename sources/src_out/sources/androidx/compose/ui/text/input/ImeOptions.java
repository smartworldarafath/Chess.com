package androidx.compose.ui.text.input;

import com.google.inputmethod.LocaleList;
import com.google.inputmethod.ab9;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.b, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001\u001aBO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b!\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Landroidx/compose/ui/text/input/b;", "", "", "singleLine", "Landroidx/compose/ui/text/input/c;", "capitalization", "autoCorrect", "Landroidx/compose/ui/text/input/d;", "keyboardType", "Landroidx/compose/ui/text/input/a;", "imeAction", "Lcom/google/android/ab9;", "platformImeOptions", "Lcom/google/android/g77;", "hintLocales", "<init>", "(ZIZIILcom/google/android/ab9;Lcom/google/android/g77;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Z", "h", "()Z", "b", "I", "c", "d", "f", "e", "Lcom/google/android/g77;", "()Lcom/google/android/g77;", "Lcom/google/android/ab9;", "g", "()Lcom/google/android/ab9;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImeOptions {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ImeOptions h = new ImeOptions(false, 0, false, 0, 0, null, null, 127, null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean singleLine;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int capitalization;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean autoCorrect;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int keyboardType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int imeAction;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final LocaleList hintLocales;

    /* JADX INFO: renamed from: androidx.compose.ui.text.input.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/input/b$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/input/b;", "Default", "Landroidx/compose/ui/text/input/b;", "a", "()Landroidx/compose/ui/text/input/b;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ImeOptions a() {
            return ImeOptions.h;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ImeOptions(boolean z, int i, boolean z2, int i2, int i3, ab9 ab9Var, LocaleList localeList, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, z2, i2, i3, ab9Var, localeList);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCapitalization() {
        return this.capitalization;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LocaleList getHintLocales() {
        return this.hintLocales;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getImeAction() {
        return this.imeAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImeOptions)) {
            return false;
        }
        ImeOptions imeOptions = (ImeOptions) other;
        return this.singleLine == imeOptions.singleLine && c.i(this.capitalization, imeOptions.capitalization) && this.autoCorrect == imeOptions.autoCorrect && d.n(this.keyboardType, imeOptions.keyboardType) && a.m(this.imeAction, imeOptions.imeAction) && Intrinsics.e((Object) null, (Object) null) && Intrinsics.e(this.hintLocales, imeOptions.hintLocales);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getKeyboardType() {
        return this.keyboardType;
    }

    public final ab9 g() {
        return null;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.singleLine) * 31) + c.j(this.capitalization)) * 31) + Boolean.hashCode(this.autoCorrect)) * 31) + d.o(this.keyboardType)) * 31) + a.n(this.imeAction)) * 961) + this.hintLocales.hashCode();
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.singleLine + ", capitalization=" + ((Object) c.k(this.capitalization)) + ", autoCorrect=" + this.autoCorrect + ", keyboardType=" + ((Object) d.p(this.keyboardType)) + ", imeAction=" + ((Object) a.o(this.imeAction)) + ", platformImeOptions=" + ((Object) null) + ", hintLocales=" + this.hintLocales + ')';
    }

    private ImeOptions(boolean z, int i, boolean z2, int i2, int i3, ab9 ab9Var, LocaleList localeList) {
        this.singleLine = z;
        this.capitalization = i;
        this.autoCorrect = z2;
        this.keyboardType = i2;
        this.imeAction = i3;
        this.hintLocales = localeList;
    }

    public /* synthetic */ ImeOptions(boolean z, int i, boolean z2, int i2, int i3, ab9 ab9Var, LocaleList localeList, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? c.INSTANCE.b() : i, (i4 & 4) != 0 ? true : z2, (i4 & 8) != 0 ? d.INSTANCE.h() : i2, (i4 & 16) != 0 ? a.INSTANCE.a() : i3, (i4 & 32) != 0 ? null : ab9Var, (i4 & 64) != 0 ? LocaleList.INSTANCE.b() : localeList, null);
    }
}
