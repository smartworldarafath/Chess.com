package com.google.inputmethod;

import com.google.android.r43;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\"#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/google/android/ks9;", "Lcom/google/android/n17;", "a", "Lcom/google/android/ks9;", "c", "()Lcom/google/android/ks9;", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "lifecycle-runtime-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class h67 {
    private static final ks9<n17> a;

    static {
        Object objB;
        ks9 ks9Var;
        try {
            Result.a aVar = Result.a;
            ClassLoader classLoader = n17.class.getClassLoader();
            Intrinsics.g(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof ks9) {
                        ks9Var = (ks9) objInvoke;
                        break;
                    }
                } else if (!(annotations[i] instanceof r43)) {
                    i++;
                }
                ks9Var = null;
                break;
            }
            objB = Result.b(ks9Var);
        } catch (Throwable th) {
            Result.a aVar2 = Result.a;
            objB = Result.b(f.a(th));
        }
        ks9<n17> ks9VarJ = (ks9) (Result.g(objB) ? null : objB);
        if (ks9VarJ == null) {
            ks9VarJ = fs1.j(new Function0() { // from class: com.google.android.g67
                public final Object invoke() {
                    return h67.b();
                }
            });
        }
        a = ks9VarJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n17 b() {
        throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
    }

    public static final ks9<n17> c() {
        return a;
    }
}
