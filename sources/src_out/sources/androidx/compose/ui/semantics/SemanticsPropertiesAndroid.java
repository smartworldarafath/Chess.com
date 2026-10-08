package androidx.compose.ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\b¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertiesAndroid;", "", "<init>", "()V", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "b", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "TestTagsAsResourceId", "", "c", "a", "AccessibilityClassName", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SemanticsPropertiesAndroid {
    public static final SemanticsPropertiesAndroid a = new SemanticsPropertiesAndroid();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<Boolean> TestTagsAsResourceId = new SemanticsPropertyKey<>("TestTagsAsResourceId", false, new Function2<Boolean, Boolean, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesAndroid$TestTagsAsResourceId$1
        public final Boolean a(Boolean bool, boolean z) {
            return bool;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Boolean) obj, ((Boolean) obj2).booleanValue());
        }
    }, null, 8, null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<String> AccessibilityClassName = new SemanticsPropertyKey<>("AccessibilityClassName", true, new Function2<String, String, String>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesAndroid$AccessibilityClassName$1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            return str;
        }
    }, null, 8, null);
    public static final int d = 8;

    private SemanticsPropertiesAndroid() {
    }

    public final SemanticsPropertyKey<String> a() {
        return AccessibilityClassName;
    }

    public final SemanticsPropertyKey<Boolean> b() {
        return TestTagsAsResourceId;
    }
}
