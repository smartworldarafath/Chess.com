package androidx.p008glance.state;

import android.content.Context;
import com.google.android.a68;
import com.google.android.ai4;
import com.google.android.q22;
import com.google.android.x58;
import com.google.inputmethod.ry4;
import com.google.inputmethod.su1;
import com.google.inputmethod.t04;
import com.google.inputmethod.ym2;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0082@¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000e\u0010\rJX\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000fH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0016\u0010\rR\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R$\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/glance/state/GlanceState;", "Lcom/google/android/su1;", "<init>", "()V", "T", "Landroid/content/Context;", "context", "Lcom/google/android/ry4;", "definition", "", "fileKey", "Lcom/google/android/ym2;", "d", "(Landroid/content/Context;Lcom/google/android/ry4;Ljava/lang/String;Lcom/google/android/q22;)Ljava/lang/Object;", "a", "Lkotlin/Function2;", "Lcom/google/android/q22;", "", "updateBlock", "e", "(Landroid/content/Context;Lcom/google/android/ry4;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "", "c", "Lcom/google/android/x58;", "b", "Lcom/google/android/x58;", "mutex", "", "Ljava/util/Map;", "dataStores", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GlanceState implements su1 {
    public static final GlanceState a = new GlanceState();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final x58 mutex = a68.b(false, 1, (Object) null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final Map<String, ym2<?>> dataStores = new LinkedHashMap();
    public static final int d = 8;

    private GlanceState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final <T> Object d(Context context, ry4<T> ry4Var, String str, q22<? super ym2<T>> q22Var) throws Throwable {
        GlanceState$getDataStore$1 glanceState$getDataStore$1;
        x58 x58Var;
        x58 x58Var2;
        ym2<?> ym2Var;
        Map<String, ym2<?>> map;
        if (q22Var instanceof GlanceState$getDataStore$1) {
            glanceState$getDataStore$1 = (GlanceState$getDataStore$1) q22Var;
            int i = glanceState$getDataStore$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                glanceState$getDataStore$1.label = i - t04.INVALID_ID;
            } else {
                glanceState$getDataStore$1 = new GlanceState$getDataStore$1(this, q22Var);
            }
        } else {
            glanceState$getDataStore$1 = new GlanceState$getDataStore$1(this, q22Var);
        }
        Object obj = glanceState$getDataStore$1.result;
        Object objG = a.g();
        int i2 = glanceState$getDataStore$1.label;
        try {
            if (i2 == 0) {
                f.b(obj);
                x58Var = mutex;
                glanceState$getDataStore$1.L$0 = context;
                glanceState$getDataStore$1.L$1 = ry4Var;
                glanceState$getDataStore$1.L$2 = str;
                glanceState$getDataStore$1.L$3 = x58Var;
                glanceState$getDataStore$1.label = 1;
                if (x58Var.g((Object) null, glanceState$getDataStore$1) != objG) {
                }
                return objG;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map = (Map) glanceState$getDataStore$1.L$2;
                x58Var2 = (x58) glanceState$getDataStore$1.L$1;
                str = (String) glanceState$getDataStore$1.L$0;
                try {
                    f.b(obj);
                    ym2Var = (ym2) obj;
                    map.put(str, ym2Var);
                    Intrinsics.h(ym2Var, "null cannot be cast to non-null type androidx.datastore.core.DataStore<T of androidx.glance.state.GlanceState.getDataStore$lambda$2>");
                    ym2<?> ym2Var2 = ym2Var;
                    x58Var2.h((Object) null);
                    return ym2Var2;
                } catch (Throwable th) {
                    th = th;
                    x58Var2.h((Object) null);
                    throw th;
                }
            }
            x58 x58Var3 = (x58) glanceState$getDataStore$1.L$3;
            str = (String) glanceState$getDataStore$1.L$2;
            ry4Var = (ry4) glanceState$getDataStore$1.L$1;
            Context context2 = (Context) glanceState$getDataStore$1.L$0;
            f.b(obj);
            x58Var = x58Var3;
            context = context2;
            Map<String, ym2<?>> map2 = dataStores;
            ym2Var = map2.get(str);
            if (ym2Var == null) {
                glanceState$getDataStore$1.L$0 = str;
                glanceState$getDataStore$1.L$1 = x58Var;
                glanceState$getDataStore$1.L$2 = map2;
                glanceState$getDataStore$1.L$3 = null;
                glanceState$getDataStore$1.label = 2;
                Object objA = ry4Var.a(context, str, glanceState$getDataStore$1);
                if (objA != objG) {
                    x58Var2 = x58Var;
                    obj = objA;
                    map = map2;
                    ym2Var = (ym2) obj;
                    map.put(str, ym2Var);
                }
                return objG;
            }
            x58Var2 = x58Var;
            Intrinsics.h(ym2Var, "null cannot be cast to non-null type androidx.datastore.core.DataStore<T of androidx.glance.state.GlanceState.getDataStore$lambda$2>");
            ym2<?> ym2Var3 = ym2Var;
            x58Var2.h((Object) null);
            return ym2Var3;
        } catch (Throwable th2) {
            th = th2;
            x58Var2 = x58Var;
            x58Var2.h((Object) null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.inputmethod.su1
    public <T> Object a(Context context, ry4<T> ry4Var, String str, q22<? super T> q22Var) {
        GlanceState$getValue$1 glanceState$getValue$1;
        if (q22Var instanceof GlanceState$getValue$1) {
            glanceState$getValue$1 = (GlanceState$getValue$1) q22Var;
            int i = glanceState$getValue$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                glanceState$getValue$1.label = i - t04.INVALID_ID;
            } else {
                glanceState$getValue$1 = new GlanceState$getValue$1(this, q22Var);
            }
        } else {
            glanceState$getValue$1 = new GlanceState$getValue$1(this, q22Var);
        }
        Object objD = glanceState$getValue$1.result;
        Object objG = a.g();
        int i2 = glanceState$getValue$1.label;
        if (i2 == 0) {
            f.b(objD);
            glanceState$getValue$1.label = 1;
            objD = d(context, ry4Var, str, glanceState$getValue$1);
            if (objD != objG) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(objD);
            return objD;
        }
        f.b(objD);
        ai4<T> data = ((ym2) objD).getData();
        glanceState$getValue$1.label = 2;
        Object objF = d.F(data, glanceState$getValue$1);
        return objF == objG ? objG : objF;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(Context context, ry4<?> ry4Var, String str, q22<? super Unit> q22Var) {
        GlanceState$deleteStore$1 glanceState$deleteStore$1;
        x58 x58Var;
        if (q22Var instanceof GlanceState$deleteStore$1) {
            glanceState$deleteStore$1 = (GlanceState$deleteStore$1) q22Var;
            int i = glanceState$deleteStore$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                glanceState$deleteStore$1.label = i - t04.INVALID_ID;
            } else {
                glanceState$deleteStore$1 = new GlanceState$deleteStore$1(this, q22Var);
            }
        } else {
            glanceState$deleteStore$1 = new GlanceState$deleteStore$1(this, q22Var);
        }
        Object obj = glanceState$deleteStore$1.result;
        Object objG = a.g();
        int i2 = glanceState$deleteStore$1.label;
        if (i2 == 0) {
            f.b(obj);
            x58Var = mutex;
            glanceState$deleteStore$1.L$0 = context;
            glanceState$deleteStore$1.L$1 = ry4Var;
            glanceState$deleteStore$1.L$2 = str;
            glanceState$deleteStore$1.L$3 = x58Var;
            glanceState$deleteStore$1.label = 1;
            if (x58Var.g((Object) null, glanceState$deleteStore$1) == objG) {
                return objG;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x58 x58Var2 = (x58) glanceState$deleteStore$1.L$3;
            str = (String) glanceState$deleteStore$1.L$2;
            ry4Var = (ry4) glanceState$deleteStore$1.L$1;
            Context context2 = (Context) glanceState$deleteStore$1.L$0;
            f.b(obj);
            x58Var = x58Var2;
            context = context2;
        }
        try {
            dataStores.remove(str);
            ry4Var.b(context, str).delete();
            return Unit.a;
        } finally {
            x58Var.h((Object) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public <T> Object e(Context context, ry4<T> ry4Var, String str, Function2<? super T, ? super q22<? super T>, ? extends Object> function2, q22<? super T> q22Var) {
        GlanceState$updateValue$1 glanceState$updateValue$1;
        if (q22Var instanceof GlanceState$updateValue$1) {
            glanceState$updateValue$1 = (GlanceState$updateValue$1) q22Var;
            int i = glanceState$updateValue$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                glanceState$updateValue$1.label = i - t04.INVALID_ID;
            } else {
                glanceState$updateValue$1 = new GlanceState$updateValue$1(this, q22Var);
            }
        } else {
            glanceState$updateValue$1 = new GlanceState$updateValue$1(this, q22Var);
        }
        Object objD = glanceState$updateValue$1.result;
        Object objG = a.g();
        int i2 = glanceState$updateValue$1.label;
        if (i2 == 0) {
            f.b(objD);
            glanceState$updateValue$1.L$0 = function2;
            glanceState$updateValue$1.label = 1;
            objD = d(context, ry4Var, str, glanceState$updateValue$1);
            if (objD != objG) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(objD);
            return objD;
        }
        function2 = (Function2) glanceState$updateValue$1.L$0;
        f.b(objD);
        glanceState$updateValue$1.L$0 = null;
        glanceState$updateValue$1.label = 2;
        Object objA = ((ym2) objD).a(function2, glanceState$updateValue$1);
        return objA == objG ? objG : objA;
    }
}
