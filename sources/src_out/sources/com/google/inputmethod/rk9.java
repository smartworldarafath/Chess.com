package com.google.inputmethod;

import android.content.Context;
import com.google.android.ph6;
import com.google.android.ta2;
import com.google.android.v8a;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001BI\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n0\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R,\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/google/android/rk9;", "Lcom/google/android/v8a;", "Landroid/content/Context;", "Lcom/google/android/ym2;", "Lcom/google/android/uk9;", "", "name", "Lcom/google/android/jia;", "corruptionHandler", "Lkotlin/Function1;", "", "Lcom/google/android/gm2;", "produceMigrations", "Lcom/google/android/ta2;", "scope", "<init>", "(Ljava/lang/String;Lcom/google/android/jia;Lkotlin/jvm/functions/Function1;Lcom/google/android/ta2;)V", "thisRef", "Lcom/google/android/ph6;", "property", "b", "(Landroid/content/Context;Lcom/google/android/ph6;)Lcom/google/android/ym2;", "a", "Ljava/lang/String;", "Lcom/google/android/jia;", "c", "Lkotlin/jvm/functions/Function1;", "d", "Lcom/google/android/ta2;", "", "e", "Ljava/lang/Object;", "lock", "f", "Lcom/google/android/ym2;", "INSTANCE", "datastore-preferences"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class rk9 implements v8a<Context, ym2<uk9>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final jia<uk9> corruptionHandler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Function1<Context, List<gm2<uk9>>> produceMigrations;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ta2 scope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Object lock;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private volatile ym2<uk9> INSTANCE;

    /* JADX WARN: Multi-variable type inference failed */
    public rk9(String str, jia<uk9> jiaVar, Function1<? super Context, ? extends List<? extends gm2<uk9>>> function1, ta2 ta2Var) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(function1, "produceMigrations");
        Intrinsics.checkNotNullParameter(ta2Var, "scope");
        this.name = str;
        this.corruptionHandler = jiaVar;
        this.produceMigrations = function1;
        this.scope = ta2Var;
        this.lock = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File c(Context context, rk9 rk9Var) {
        Intrinsics.g(context);
        return pk9.a(context, rk9Var.name);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ym2<uk9> getValue(Context thisRef, ph6<?> property) {
        ym2<uk9> ym2Var;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        ym2<uk9> ym2Var2 = this.INSTANCE;
        if (ym2Var2 != null) {
            return ym2Var2;
        }
        synchronized (this.lock) {
            try {
                if (this.INSTANCE == null) {
                    final Context applicationContext = thisRef.getApplicationContext();
                    ok9 ok9Var = ok9.a;
                    jia<uk9> jiaVar = this.corruptionHandler;
                    Function1<Context, List<gm2<uk9>>> function1 = this.produceMigrations;
                    Intrinsics.g(applicationContext);
                    this.INSTANCE = ok9Var.b(jiaVar, (List) function1.invoke(applicationContext), this.scope, new Function0() { // from class: com.google.android.qk9
                        public final Object invoke() {
                            return rk9.c(applicationContext, this);
                        }
                    });
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
