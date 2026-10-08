package androidx.compose.p001foundation.text;

import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.a;
import androidx.compose.ui.text.input.c;
import androidx.compose.ui.text.input.d;
import com.google.android.r43;
import com.google.inputmethod.LocaleList;
import com.google.inputmethod.ab9;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.foundation.text.n, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0007\u0018\u0000 82\u00020\u0001:\u0001\"BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010BS\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J[\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0014\u00103\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u00102R\u0014\u00104\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u001eR\u0014\u00106\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u001eR\u0014\u00107\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u00101R\u0014\u00109\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u001e¨\u0006:"}, d2 = {"Landroidx/compose/foundation/text/n;", "", "Landroidx/compose/ui/text/input/c;", "capitalization", "", "autoCorrectEnabled", "Landroidx/compose/ui/text/input/d;", "keyboardType", "Landroidx/compose/ui/text/input/a;", "imeAction", "Lcom/google/android/ab9;", "platformImeOptions", "showKeyboardOnFocus", "Lcom/google/android/g77;", "hintLocales", "<init>", "(ILjava/lang/Boolean;IILcom/google/android/ab9;Ljava/lang/Boolean;Lcom/google/android/g77;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "autoCorrect", "(IZIILcom/google/android/ab9;Ljava/lang/Boolean;Lcom/google/android/g77;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "singleLine", "Landroidx/compose/ui/text/input/b;", "i", "(Z)Landroidx/compose/ui/text/input/b;", "b", "(ILjava/lang/Boolean;IILcom/google/android/ab9;Ljava/lang/Boolean;Lcom/google/android/g77;)Landroidx/compose/foundation/text/n;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "getCapitalization-IUNYP9k", "Ljava/lang/Boolean;", "getAutoCorrectEnabled", "()Ljava/lang/Boolean;", "c", "getKeyboardType-PjHm6EE", "d", "getImeAction-eUduSuo", "e", "getShowKeyboardOnFocus", "f", "Lcom/google/android/g77;", "getHintLocales", "()Lcom/google/android/g77;", "()Z", "autoCorrectOrDefault", "capitalizationOrDefault", "h", "keyboardTypeOrDefault", "hintLocalesOrDefault", "g", "imeActionOrDefault", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KeyboardOptions {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final KeyboardOptions h = new KeyboardOptions(0, (Boolean) null, 0, 0, (ab9) null, (Boolean) null, (LocaleList) null, 127, (DefaultConstructorMarker) null);
    private static final KeyboardOptions i = new KeyboardOptions(0, Boolean.FALSE, d.INSTANCE.f(), 0, (ab9) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (LocaleList) null, 121, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int capitalization;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final Boolean autoCorrectEnabled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int keyboardType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int imeAction;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final Boolean showKeyboardOnFocus;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final LocaleList hintLocales;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.n$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/n$a;", "", "<init>", "()V", "Landroidx/compose/foundation/text/n;", "Default", "Landroidx/compose/foundation/text/n;", "a", "()Landroidx/compose/foundation/text/n;", "getDefault$annotations", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KeyboardOptions a() {
            return KeyboardOptions.h;
        }

        private Companion() {
        }
    }

    public /* synthetic */ KeyboardOptions(int i2, Boolean bool, int i3, int i4, ab9 ab9Var, Boolean bool2, LocaleList localeList, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, bool, i3, i4, ab9Var, bool2, localeList);
    }

    public static /* synthetic */ KeyboardOptions c(KeyboardOptions keyboardOptions, int i2, Boolean bool, int i3, int i4, ab9 ab9Var, Boolean bool2, LocaleList localeList, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = keyboardOptions.capitalization;
        }
        if ((i5 & 2) != 0) {
            bool = keyboardOptions.autoCorrectEnabled;
        }
        if ((i5 & 4) != 0) {
            i3 = keyboardOptions.keyboardType;
        }
        if ((i5 & 8) != 0) {
            i4 = keyboardOptions.imeAction;
        }
        if ((i5 & 16) != 0) {
            keyboardOptions.getClass();
            ab9Var = null;
        }
        if ((i5 & 32) != 0) {
            bool2 = null;
        }
        return keyboardOptions.b(i2, bool, i3, i4, ab9Var, bool2, (i5 & 64) != 0 ? null : localeList);
    }

    private final boolean d() {
        Boolean bool = this.autoCorrectEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private final int e() {
        c cVarF = c.f(this.capitalization);
        int value = cVarF.getValue();
        c.Companion companion = c.INSTANCE;
        if (c.i(value, companion.d())) {
            cVarF = null;
        }
        return cVarF != null ? cVarF.getValue() : companion.b();
    }

    private final LocaleList f() {
        LocaleList localeList = this.hintLocales;
        return localeList == null ? LocaleList.INSTANCE.b() : localeList;
    }

    private final int h() {
        d dVarK = d.k(this.keyboardType);
        int value = dVarK.getValue();
        d.Companion companion = d.INSTANCE;
        if (d.n(value, companion.i())) {
            dVarK = null;
        }
        return dVarK != null ? dVarK.getValue() : companion.h();
    }

    public final KeyboardOptions b(int capitalization, Boolean autoCorrectEnabled, int keyboardType, int imeAction, ab9 platformImeOptions, Boolean showKeyboardOnFocus, LocaleList hintLocales) {
        return new KeyboardOptions(capitalization, autoCorrectEnabled, keyboardType, imeAction, platformImeOptions, showKeyboardOnFocus, hintLocales, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyboardOptions)) {
            return false;
        }
        KeyboardOptions keyboardOptions = (KeyboardOptions) other;
        return c.i(this.capitalization, keyboardOptions.capitalization) && Intrinsics.e(this.autoCorrectEnabled, keyboardOptions.autoCorrectEnabled) && d.n(this.keyboardType, keyboardOptions.keyboardType) && a.m(this.imeAction, keyboardOptions.imeAction) && Intrinsics.e((Object) null, (Object) null) && Intrinsics.e(this.showKeyboardOnFocus, keyboardOptions.showKeyboardOnFocus) && Intrinsics.e(this.hintLocales, keyboardOptions.hintLocales);
    }

    public final int g() {
        a aVarJ = a.j(this.imeAction);
        int value = aVarJ.getValue();
        a.Companion companion = a.INSTANCE;
        if (a.m(value, companion.i())) {
            aVarJ = null;
        }
        return aVarJ != null ? aVarJ.getValue() : companion.a();
    }

    public int hashCode() {
        int iJ = c.j(this.capitalization) * 31;
        Boolean bool = this.autoCorrectEnabled;
        int iHashCode = (((((iJ + (bool != null ? bool.hashCode() : 0)) * 31) + d.o(this.keyboardType)) * 31) + a.n(this.imeAction)) * 961;
        Boolean bool2 = this.showKeyboardOnFocus;
        int iHashCode2 = (iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        LocaleList localeList = this.hintLocales;
        return iHashCode2 + (localeList != null ? localeList.hashCode() : 0);
    }

    public final ImeOptions i(boolean singleLine) {
        return new ImeOptions(singleLine, e(), d(), h(), g(), null, f(), null);
    }

    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) c.k(this.capitalization)) + ", autoCorrectEnabled=" + this.autoCorrectEnabled + ", keyboardType=" + ((Object) d.p(this.keyboardType)) + ", imeAction=" + ((Object) a.o(this.imeAction)) + ", platformImeOptions=" + ((Object) null) + "showKeyboardOnFocus=" + this.showKeyboardOnFocus + ", hintLocales=" + this.hintLocales + ')';
    }

    @r43
    public /* synthetic */ KeyboardOptions(int i2, boolean z, int i3, int i4, ab9 ab9Var, Boolean bool, LocaleList localeList, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, z, i3, i4, ab9Var, bool, localeList);
    }

    private KeyboardOptions(int i2, Boolean bool, int i3, int i4, ab9 ab9Var, Boolean bool2, LocaleList localeList) {
        this.capitalization = i2;
        this.autoCorrectEnabled = bool;
        this.keyboardType = i3;
        this.imeAction = i4;
        this.showKeyboardOnFocus = bool2;
        this.hintLocales = localeList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ KeyboardOptions(int i2, Boolean bool, int i3, int i4, ab9 ab9Var, Boolean bool2, LocaleList localeList, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        int iD = (i5 & 1) != 0 ? c.INSTANCE.d() : i2;
        Boolean bool3 = (i5 & 2) != 0 ? null : bool;
        int i6 = (i5 & 4) != 0 ? d.INSTANCE.i() : i3;
        int i7 = (i5 & 8) != 0 ? a.INSTANCE.i() : i4;
        ab9 ab9Var2 = (i5 & 16) != 0 ? null : ab9Var;
        Boolean bool4 = (i5 & 32) != 0 ? null : bool2;
        this(iD, bool3, i6, i7, ab9Var2, bool4, (i5 & 64) == 0 ? localeList : null, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ KeyboardOptions(int i2, boolean z, int i3, int i4, ab9 ab9Var, Boolean bool, LocaleList localeList, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? c.INSTANCE.d() : i2, z, (i5 & 4) != 0 ? d.INSTANCE.i() : i3, (i5 & 8) != 0 ? a.INSTANCE.i() : i4, (i5 & 16) != 0 ? null : ab9Var, (i5 & 32) != 0 ? null : bool, (i5 & 64) != 0 ? null : localeList, (DefaultConstructorMarker) null);
    }

    private KeyboardOptions(int i2, boolean z, int i3, int i4, ab9 ab9Var, Boolean bool, LocaleList localeList) {
        this(i2, Boolean.valueOf(z), i3, i4, ab9Var, bool, localeList, (DefaultConstructorMarker) null);
    }
}
