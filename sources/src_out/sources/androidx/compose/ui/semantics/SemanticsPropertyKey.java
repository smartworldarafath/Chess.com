package androidx.compose.ui.semantics;

import com.google.android.ph6;
import com.google.inputmethod.nfb;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001e\b\u0002\u0010\u0006\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bBC\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\rJ!\u0010\u0010\u001a\u0004\u0018\u00018\u00002\b\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0016\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001bR0\u0010\u0006\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R$\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R$\u0010\f\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001c\u0010\u001b\"\u0004\b%\u0010&¨\u0006'"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "T", "", "", "name", "Lkotlin/Function2;", "mergePolicy", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "", "isImportantForAccessibility", "(Ljava/lang/String;Z)V", "accessibilityExtraKey", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function2;Ljava/lang/String;)V", "parentValue", "childValue", "d", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/google/android/nfb;", "thisRef", "Lcom/google/android/ph6;", "property", "value", "", "e", "(Lcom/google/android/nfb;Lcom/google/android/ph6;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "Lkotlin/jvm/functions/Function2;", "getMergePolicy$ui", "()Lkotlin/jvm/functions/Function2;", "c", "Z", "()Z", "setAccessibilityExtraKey$ui", "(Ljava/lang/String;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SemanticsPropertyKey<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function2<T, T, T> mergePolicy;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isImportantForAccessibility;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String accessibilityExtraKey;

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsPropertyKey(String str, Function2<? super T, ? super T, ? extends T> function2) {
        this.name = str;
        this.mergePolicy = function2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccessibilityExtraKey() {
        return this.accessibilityExtraKey;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsImportantForAccessibility() {
        return this.isImportantForAccessibility;
    }

    public final T d(T parentValue, T childValue) {
        return (T) this.mergePolicy.invoke(parentValue, childValue);
    }

    public final void e(nfb thisRef, ph6<?> property, T value) {
        thisRef.b(this, value);
    }

    public String toString() {
        return "AccessibilityKey: " + this.name;
    }

    public /* synthetic */ SemanticsPropertyKey(String str, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new Function2<T, T, T>() { // from class: androidx.compose.ui.semantics.SemanticsPropertyKey.1
            public final T invoke(T t, T t2) {
                return t == null ? t2 : t;
            }
        } : function2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SemanticsPropertyKey(String str, boolean z) {
        Function2 function2 = null;
        this(str, function2, 2, (DefaultConstructorMarker) function2);
        this.isImportantForAccessibility = z;
    }

    public /* synthetic */ SemanticsPropertyKey(String str, boolean z, Function2 function2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, function2, (i & 8) != 0 ? null : str2);
    }

    public SemanticsPropertyKey(String str, boolean z, Function2<? super T, ? super T, ? extends T> function2, String str2) {
        this(str, function2);
        this.isImportantForAccessibility = z;
        this.accessibilityExtraKey = str2;
    }
}
