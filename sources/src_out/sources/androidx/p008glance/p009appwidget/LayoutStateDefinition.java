package androidx.p008glance.p009appwidget;

import android.content.Context;
import androidx.datastore.p007core.a;
import com.google.android.q22;
import com.google.inputmethod.bn2;
import com.google.inputmethod.jo6;
import com.google.inputmethod.mo6;
import com.google.inputmethod.ry4;
import com.google.inputmethod.ym2;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/glance/appwidget/LayoutStateDefinition;", "Lcom/google/android/ry4;", "Lcom/google/android/jo6;", "<init>", "()V", "Landroid/content/Context;", "context", "", "fileKey", "Ljava/io/File;", "b", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;", "Lcom/google/android/ym2;", "a", "(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/q22;)Ljava/lang/Object;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class LayoutStateDefinition implements ry4<jo6> {
    public static final LayoutStateDefinition a = new LayoutStateDefinition();

    private LayoutStateDefinition() {
    }

    @Override // com.google.inputmethod.ry4
    public Object a(final Context context, final String str, q22<? super ym2<jo6>> q22Var) {
        return a.c(a.a, mo6.a, null, null, null, new Function0<File>() { // from class: androidx.glance.appwidget.LayoutStateDefinition$getDataStore$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final File invoke() {
                return bn2.a(context, str);
            }
        }, 14, null);
    }

    @Override // com.google.inputmethod.ry4
    public File b(Context context, String fileKey) {
        return bn2.a(context, fileKey);
    }
}
