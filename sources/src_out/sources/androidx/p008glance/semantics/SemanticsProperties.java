package androidx.p008glance.semantics;

import com.google.inputmethod.lfb;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n¨\u0006\u000f"}, d2 = {"Landroidx/glance/semantics/SemanticsProperties;", "", "<init>", "()V", "Lcom/google/android/lfb;", "", "", "b", "Lcom/google/android/lfb;", "a", "()Lcom/google/android/lfb;", "ContentDescription", "c", "getTestTag", "TestTag", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SemanticsProperties {
    public static final SemanticsProperties a = new SemanticsProperties();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final lfb<List<String>> ContentDescription = new lfb<>("ContentDescription", new Function2<List<? extends String>, List<? extends String>, List<? extends String>>() { // from class: androidx.glance.semantics.SemanticsProperties$ContentDescription$1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<String> invoke(List<String> list, List<String> list2) {
            List<String> listB1;
            if (list == null || (listB1 = m.B1(list)) == null) {
                return list2;
            }
            listB1.addAll(list2);
            return listB1;
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final lfb<String> TestTag = new lfb<>("TestTag", new Function2<String, String, String>() { // from class: androidx.glance.semantics.SemanticsProperties$TestTag$1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            return str;
        }
    });

    private SemanticsProperties() {
    }

    public final lfb<List<String>> a() {
        return ContentDescription;
    }
}
