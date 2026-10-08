package com.google.inputmethod;

import android.content.Context;
import androidx.datastore.p007core.a;
import com.google.android.b39;
import com.google.android.ph6;
import com.google.android.t84;
import com.google.android.ta2;
import com.google.android.v8a;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002B_\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t\u0012\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0015\u001a\u00020\u00032\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0097\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR,\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/google/android/in2;", "T", "Lcom/google/android/v8a;", "Landroid/content/Context;", "Lcom/google/android/ym2;", "", "fileName", "Lcom/google/android/lp8;", "serializer", "Lcom/google/android/jia;", "corruptionHandler", "Lkotlin/Function1;", "", "Lcom/google/android/gm2;", "produceMigrations", "Lcom/google/android/ta2;", "scope", "", "createInDeviceProtectedStorage", "<init>", "(Ljava/lang/String;Lcom/google/android/lp8;Lcom/google/android/jia;Lkotlin/jvm/functions/Function1;Lcom/google/android/ta2;Z)V", "thisRef", "Lcom/google/android/ph6;", "property", "b", "(Landroid/content/Context;Lcom/google/android/ph6;)Lcom/google/android/ym2;", "a", "Ljava/lang/String;", "Lcom/google/android/lp8;", "c", "Lcom/google/android/jia;", "d", "Lkotlin/jvm/functions/Function1;", "e", "Lcom/google/android/ta2;", "f", "Z", "", "g", "Ljava/lang/Object;", "lock", "h", "Lcom/google/android/ym2;", "INSTANCE", "datastore"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class in2<T> implements v8a<Context, ym2<T>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String fileName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final lp8<T> serializer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final jia<T> corruptionHandler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function1<Context, List<gm2<T>>> produceMigrations;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final ta2 scope;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean createInDeviceProtectedStorage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Object lock;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private volatile ym2<T> INSTANCE;

    /* JADX WARN: Multi-variable type inference failed */
    public in2(String str, lp8<T> lp8Var, jia<T> jiaVar, Function1<? super Context, ? extends List<? extends gm2<T>>> function1, ta2 ta2Var, boolean z) {
        Intrinsics.checkNotNullParameter(str, "fileName");
        Intrinsics.checkNotNullParameter(lp8Var, "serializer");
        Intrinsics.checkNotNullParameter(function1, "produceMigrations");
        Intrinsics.checkNotNullParameter(ta2Var, "scope");
        this.fileName = str;
        this.serializer = lp8Var;
        this.corruptionHandler = jiaVar;
        this.produceMigrations = function1;
        this.scope = ta2Var;
        this.createInDeviceProtectedStorage = z;
        this.lock = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b39 c(in2 in2Var, Context context) {
        File fileA;
        b39.a aVar = b39.b;
        if (in2Var.createInDeviceProtectedStorage) {
            Intrinsics.g(context);
            fileA = o93.a(context, in2Var.fileName);
        } else {
            Intrinsics.g(context);
            fileA = bn2.a(context, in2Var.fileName);
        }
        String absolutePath = fileA.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        return b39.a.e(aVar, absolutePath, false, 1, (Object) null);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ym2<T> getValue(Context thisRef, ph6<?> property) {
        ym2<T> ym2Var;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        ym2<T> ym2Var2 = this.INSTANCE;
        if (ym2Var2 != null) {
            return ym2Var2;
        }
        synchronized (this.lock) {
            try {
                if (this.INSTANCE == null) {
                    final Context applicationContext = thisRef.getApplicationContext();
                    a aVar = a.a;
                    qp8 qp8Var = new qp8(t84.b, this.serializer, null, new Function0() { // from class: com.google.android.hn2
                        public final Object invoke() {
                            return in2.c(this.a, applicationContext);
                        }
                    }, 4, null);
                    jia<T> jiaVar = this.corruptionHandler;
                    Function1<Context, List<gm2<T>>> function1 = this.produceMigrations;
                    Intrinsics.g(applicationContext);
                    this.INSTANCE = aVar.b(qp8Var, jiaVar, (List) function1.invoke(applicationContext), this.scope);
                }
                ym2Var = this.INSTANCE;
                Intrinsics.g(ym2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return ym2Var;
    }
}
