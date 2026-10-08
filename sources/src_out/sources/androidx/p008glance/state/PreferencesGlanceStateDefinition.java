package androidx.p008glance.state;

import android.content.Context;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.ok9;
import com.google.inputmethod.pk9;
import com.google.inputmethod.ry4;
import com.google.inputmethod.uk9;
import com.google.inputmethod.ym2;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/glance/state/PreferencesGlanceStateDefinition;", "Lcom/google/android/ry4;", "Lcom/google/android/uk9;", "<init>", "()V", "Landroid/content/Context;", "context", "", "fileKey", "Ljava/io/File;", "b", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;", "Lcom/google/android/ym2;", "a", "(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/ta2;", "Lcom/google/android/ta2;", "coroutineScope", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PreferencesGlanceStateDefinition implements ry4<uk9> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static ta2 coroutineScope;
    public static final PreferencesGlanceStateDefinition a = new PreferencesGlanceStateDefinition();
    public static final int c = 8;

    private PreferencesGlanceStateDefinition() {
    }

    @Override // com.google.inputmethod.ry4
    public Object a(final Context context, final String str, q22<? super ym2<uk9>> q22Var) {
        ym2 ym2VarD;
        ta2 ta2Var = coroutineScope;
        return (ta2Var == null || (ym2VarD = ok9.d(ok9.a, null, null, ta2Var, new Function0<File>() { // from class: androidx.glance.state.PreferencesGlanceStateDefinition$getDataStore$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final File invoke() {
                return pk9.a(context, str);
            }
        }, 3, null)) == null) ? ok9.d(ok9.a, null, null, null, new Function0<File>() { // from class: androidx.glance.state.PreferencesGlanceStateDefinition$getDataStore$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final File invoke() {
                return pk9.a(context, str);
            }
        }, 7, null) : ym2VarD;
    }

    @Override // com.google.inputmethod.ry4
    public File b(Context context, String fileKey) {
        return pk9.a(context, fileKey);
    }
}
