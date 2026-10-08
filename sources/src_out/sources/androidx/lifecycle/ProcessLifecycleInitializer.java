package androidx.lifecycle;

import android.content.Context;
import com.google.android.mw5;
import com.google.inputmethod.n17;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lcom/google/android/mw5;", "Lcom/google/android/n17;", "<init>", "()V", "Landroid/content/Context;", "context", "a", "(Landroid/content/Context;)Lcom/google/android/n17;", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "lifecycle-process"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessLifecycleInitializer implements mw5<n17> {
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public n17 create(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        androidx.startup.a aVarE = androidx.startup.a.e(context);
        Intrinsics.checkNotNullExpressionValue(aVarE, "getInstance(...)");
        if (!aVarE.g(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        h.a(context);
        q.Companion companion = q.INSTANCE;
        companion.b(context);
        return companion.a();
    }

    public List<Class<? extends mw5<?>>> dependencies() {
        return kotlin.collections.m.p();
    }
}
