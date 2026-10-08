package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import com.google.inputmethod.as1;
import com.google.inputmethod.cla;
import com.google.inputmethod.fs1;
import com.google.inputmethod.h67;
import com.google.inputmethod.ks9;
import com.google.inputmethod.n17;
import com.google.inputmethod.qp5;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\r\u0010\n\"\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u0010\u0010\n\" \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0013\u0010\n\" \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0016\u0010\n\"\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u0019\u0010\n\" \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\n¨\u0006 "}, d2 = {"", "name", "", "h", "(Ljava/lang/String;)Ljava/lang/Void;", "Lcom/google/android/ks9;", "Landroid/content/res/Configuration;", "a", "Lcom/google/android/ks9;", "b", "()Lcom/google/android/ks9;", "LocalConfiguration", "Landroid/content/Context;", "c", "LocalContext", "Landroid/content/res/Resources;", "f", "LocalResources", "Lcom/google/android/qp5;", "d", "LocalImageVectorCache", "Lcom/google/android/cla;", "e", "LocalResourceIdCache", "Landroid/view/View;", "g", "LocalView", "Lcom/google/android/n17;", "getLocalLifecycleOwner", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AndroidCompositionLocals_androidKt {
    private static final ks9<Configuration> a = fs1.h(null, new Function0<Configuration>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalConfiguration$1
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Configuration invoke() throws KotlinNothingValueException {
            AndroidCompositionLocals_androidKt.h("LocalConfiguration");
            throw new KotlinNothingValueException();
        }
    }, 1, null);
    private static final ks9<Context> b = fs1.j(new Function0<Context>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalContext$1
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Context invoke() throws KotlinNothingValueException {
            AndroidCompositionLocals_androidKt.h("LocalContext");
            throw new KotlinNothingValueException();
        }
    });
    private static final ks9<Resources> c = fs1.i(new Function1<as1, Resources>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalResources$1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Resources invoke(as1 as1Var) {
            as1Var.L(AndroidCompositionLocals_androidKt.b());
            return ((Context) as1Var.L(AndroidCompositionLocals_androidKt.c())).getResources();
        }
    });
    private static final ks9<qp5> d = fs1.j(new Function0<qp5>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalImageVectorCache$1
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final qp5 invoke() throws KotlinNothingValueException {
            AndroidCompositionLocals_androidKt.h("LocalImageVectorCache");
            throw new KotlinNothingValueException();
        }
    });
    private static final ks9<cla> e = fs1.j(new Function0<cla>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalResourceIdCache$1
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final cla invoke() throws KotlinNothingValueException {
            AndroidCompositionLocals_androidKt.h("LocalResourceIdCache");
            throw new KotlinNothingValueException();
        }
    });
    private static final ks9<View> f = fs1.j(new Function0<View>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalView$1
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final View invoke() throws KotlinNothingValueException {
            AndroidCompositionLocals_androidKt.h("LocalView");
            throw new KotlinNothingValueException();
        }
    });

    public static final ks9<Configuration> b() {
        return a;
    }

    public static final ks9<Context> c() {
        return b;
    }

    public static final ks9<qp5> d() {
        return d;
    }

    public static final ks9<cla> e() {
        return e;
    }

    public static final ks9<Resources> f() {
        return c;
    }

    public static final ks9<View> g() {
        return f;
    }

    public static final ks9<n17> getLocalLifecycleOwner() {
        return h67.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void h(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
