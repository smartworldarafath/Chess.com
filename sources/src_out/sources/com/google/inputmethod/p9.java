package com.google.inputmethod;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\b&\u0018\u0000 \u000e2\u00020\u0001:\u00037=:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JI\u0010\u001e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0018\u001a\u00020\u00072\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u001b\u001a\u00028\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH'¢\u0006\u0004\b\u001e\u0010\u001fJQ\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0004\b%\u0010&JI\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b)\u0010\u0011J\u0015\u0010,\u001a\u00020\r2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010*¢\u0006\u0004\b/\u0010-J)\u00101\u001a\u0002002\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b1\u00102J%\u00104\u001a\u000200\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u00103\u001a\u00028\u0000H\u0007¢\u0006\u0004\b4\u00105R \u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R \u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020<068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00108R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00050?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR$\u0010C\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00108R\"\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00108R\u0014\u0010F\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010E¨\u0006G"}, d2 = {"Lcom/google/android/p9;", "", "<init>", "()V", "O", "", "key", "", "resultCode", "Landroid/content/Intent;", "data", "Lcom/google/android/p9$a;", "callbackAndContract", "", "h", "(Ljava/lang/String;ILandroid/content/Intent;Lcom/google/android/p9$a;)V", "q", "(Ljava/lang/String;)V", "i", "()I", "rc", "e", "(ILjava/lang/String;)V", "I", "requestCode", "Lcom/google/android/z8;", "contract", "input", "Lcom/google/android/w8;", "options", "k", "(ILcom/google/android/z8;Ljava/lang/Object;Lcom/google/android/w8;)V", "Lcom/google/android/n17;", "lifecycleOwner", "Lcom/google/android/x8;", "callback", "Lcom/google/android/l9;", "o", "(Ljava/lang/String;Lcom/google/android/n17;Lcom/google/android/z8;Lcom/google/android/x8;)Lcom/google/android/l9;", "n", "(Ljava/lang/String;Lcom/google/android/z8;Lcom/google/android/x8;)Lcom/google/android/l9;", "r", "Landroid/os/Bundle;", "outState", "m", "(Landroid/os/Bundle;)V", "savedInstanceState", "l", "", "f", "(IILandroid/content/Intent;)Z", "result", "g", "(ILjava/lang/Object;)Z", "", "a", "Ljava/util/Map;", "rcToKey", "b", "keyToRc", "Lcom/google/android/p9$c;", "c", "keyToLifecycleContainers", "", "d", "Ljava/util/List;", "launchedKeys", "keyToCallback", "parsedPendingResults", "Landroid/os/Bundle;", "pendingResults", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class p9 {
    private static final b h = new b(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<Integer, String> rcToKey = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Map<String, Integer> keyToRc = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Map<String, c> keyToLifecycleContainers = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<String> launchedKeys = new ArrayList();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final transient Map<String, a<?>> keyToCallback = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Map<String, Object> parsedPendingResults = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Bundle pendingResults = new Bundle();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0010\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR!\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/google/android/p9$a;", "O", "", "Lcom/google/android/x8;", "callback", "Lcom/google/android/z8;", "contract", "<init>", "(Lcom/google/android/x8;Lcom/google/android/z8;)V", "a", "Lcom/google/android/x8;", "()Lcom/google/android/x8;", "b", "Lcom/google/android/z8;", "()Lcom/google/android/z8;", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a<O> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final x8<O> callback;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final z8<?, O> contract;

        public a(x8<O> x8Var, z8<?, O> z8Var) {
            Intrinsics.checkNotNullParameter(x8Var, "callback");
            Intrinsics.checkNotNullParameter(z8Var, "contract");
            this.callback = x8Var;
            this.contract = z8Var;
        }

        public final x8<O> a() {
            return this.callback;
        }

        public final z8<?, O> b() {
            return this.contract;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/google/android/p9$b;", "", "<init>", "()V", "", "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", "Ljava/lang/String;", "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", "KEY_COMPONENT_ACTIVITY_PENDING_RESULTS", "LOG_TAG", "", "INITIAL_REQUEST_CODE_VALUE", "I", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/google/android/p9$c;", "", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "<init>", "(Landroidx/lifecycle/Lifecycle;)V", "Landroidx/lifecycle/i;", "observer", "", "a", "(Landroidx/lifecycle/i;)V", "b", "()V", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "", "Ljava/util/List;", "observers", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Lifecycle lifecycle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<i> observers;

        public c(Lifecycle lifecycle) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            this.lifecycle = lifecycle;
            this.observers = new ArrayList();
        }

        public final void a(i observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            this.lifecycle.c(observer);
            this.observers.add(observer);
        }

        public final void b() {
            Iterator<T> it = this.observers.iterator();
            while (it.hasNext()) {
                this.lifecycle.g((i) it.next());
            }
            this.observers.clear();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/google/android/p9$d", "Lcom/google/android/l9;", "input", "Lcom/google/android/w8;", "options", "", "b", "(Ljava/lang/Object;Lcom/google/android/w8;)V", "c", "()V", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d<I> extends l9<I> {
        final /* synthetic */ String b;
        final /* synthetic */ z8<I, O> c;

        d(String str, z8<I, O> z8Var) {
            this.b = str;
            this.c = z8Var;
        }

        @Override // com.google.inputmethod.l9
        public void b(I input, w8 options) throws Exception {
            Object obj = p9.this.keyToRc.get(this.b);
            Object obj2 = this.c;
            if (obj != null) {
                int iIntValue = ((Number) obj).intValue();
                p9.this.launchedKeys.add(this.b);
                try {
                    p9.this.k(iIntValue, this.c, input, options);
                    return;
                } catch (Exception e) {
                    p9.this.launchedKeys.remove(this.b);
                    throw e;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + input + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // com.google.inputmethod.l9
        public void c() {
            p9.this.r(this.b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/google/android/p9$e", "Lcom/google/android/l9;", "input", "Lcom/google/android/w8;", "options", "", "b", "(Ljava/lang/Object;Lcom/google/android/w8;)V", "c", "()V", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e<I> extends l9<I> {
        final /* synthetic */ String b;
        final /* synthetic */ z8<I, O> c;

        e(String str, z8<I, O> z8Var) {
            this.b = str;
            this.c = z8Var;
        }

        @Override // com.google.inputmethod.l9
        public void b(I input, w8 options) throws Exception {
            Object obj = p9.this.keyToRc.get(this.b);
            Object obj2 = this.c;
            if (obj != null) {
                int iIntValue = ((Number) obj).intValue();
                p9.this.launchedKeys.add(this.b);
                try {
                    p9.this.k(iIntValue, this.c, input, options);
                    return;
                } catch (Exception e) {
                    p9.this.launchedKeys.remove(this.b);
                    throw e;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + input + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // com.google.inputmethod.l9
        public void c() {
            p9.this.r(this.b);
        }
    }

    private final void e(int rc, String key) {
        this.rcToKey.put(Integer.valueOf(rc), key);
        this.keyToRc.put(key, Integer.valueOf(rc));
    }

    private final <O> void h(String key, int resultCode, Intent data, a<O> callbackAndContract) {
        if ((callbackAndContract != null ? callbackAndContract.a() : null) == null || !this.launchedKeys.contains(key)) {
            this.parsedPendingResults.remove(key);
            this.pendingResults.putParcelable(key, new ActivityResult(resultCode, data));
        } else {
            callbackAndContract.a().a(callbackAndContract.b().parseResult(resultCode, data));
            this.launchedKeys.remove(key);
        }
    }

    private final int i() {
        for (Number number : kotlin.sequences.d.r(new Function0() { // from class: com.google.android.o9
            public final Object invoke() {
                return p9.j();
            }
        })) {
            if (!this.rcToKey.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer j() {
        return Integer.valueOf(Random.a.i(2147418112) + 65536);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(p9 p9Var, String str, x8 x8Var, z8 z8Var, n17 n17Var, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(n17Var, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (Lifecycle.Event.ON_START != event) {
            if (Lifecycle.Event.ON_STOP == event) {
                p9Var.keyToCallback.remove(str);
                return;
            } else {
                if (Lifecycle.Event.ON_DESTROY == event) {
                    p9Var.r(str);
                    return;
                }
                return;
            }
        }
        p9Var.keyToCallback.put(str, new a<>(x8Var, z8Var));
        if (p9Var.parsedPendingResults.containsKey(str)) {
            Object obj = p9Var.parsedPendingResults.get(str);
            p9Var.parsedPendingResults.remove(str);
            x8Var.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) lx0.a(p9Var.pendingResults, str, ActivityResult.class);
        if (activityResult != null) {
            p9Var.pendingResults.remove(str);
            x8Var.a(z8Var.parseResult(activityResult.getResultCode(), activityResult.getData()));
        }
    }

    private final void q(String key) {
        if (this.keyToRc.get(key) != null) {
            return;
        }
        e(i(), key);
    }

    public final boolean f(int requestCode, int resultCode, Intent data) {
        String str = this.rcToKey.get(Integer.valueOf(requestCode));
        if (str == null) {
            return false;
        }
        h(str, resultCode, data, this.keyToCallback.get(str));
        return true;
    }

    public final <O> boolean g(int requestCode, O result) {
        String str = this.rcToKey.get(Integer.valueOf(requestCode));
        if (str == null) {
            return false;
        }
        a<?> aVar = this.keyToCallback.get(str);
        if ((aVar != null ? aVar.a() : null) == null) {
            this.pendingResults.remove(str);
            this.parsedPendingResults.put(str, result);
            return true;
        }
        x8<?> x8VarA = aVar.a();
        Intrinsics.h(x8VarA, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.launchedKeys.remove(str)) {
            return true;
        }
        x8VarA.a(result);
        return true;
    }

    public abstract <I, O> void k(int requestCode, z8<I, O> contract, I input, w8 options);

    public final void l(Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = savedInstanceState.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = savedInstanceState.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = savedInstanceState.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.launchedKeys.addAll(stringArrayList2);
        }
        Bundle bundle = savedInstanceState.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle != null) {
            this.pendingResults.putAll(bundle);
        }
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            if (this.keyToRc.containsKey(str)) {
                Integer numRemove = this.keyToRc.remove(str);
                if (!this.pendingResults.containsKey(str)) {
                    kotlin.jvm.internal.a.d(this.rcToKey).remove(numRemove);
                }
            }
            Integer num = integerArrayList.get(i);
            Intrinsics.checkNotNullExpressionValue(num, "get(...)");
            int iIntValue = num.intValue();
            String str2 = stringArrayList.get(i);
            Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
            e(iIntValue, str2);
        }
    }

    public final void m(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.keyToRc.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.keyToRc.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.launchedKeys));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.pendingResults));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> l9<I> n(String key, z8<I, O> contract, x8<O> callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        q(key);
        this.keyToCallback.put(key, new a<>(callback, contract));
        if (this.parsedPendingResults.containsKey(key)) {
            Object obj = this.parsedPendingResults.get(key);
            this.parsedPendingResults.remove(key);
            callback.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) lx0.a(this.pendingResults, key, ActivityResult.class);
        if (activityResult != null) {
            this.pendingResults.remove(key);
            callback.a(contract.parseResult(activityResult.getResultCode(), activityResult.getData()));
        }
        return new e(key, contract);
    }

    public final <I, O> l9<I> o(final String key, n17 lifecycleOwner, final z8<I, O> contract, final x8<O> callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Lifecycle lifecycleRegistry = lifecycleOwner.getLifecycleRegistry();
        if (lifecycleRegistry.getState().c(Lifecycle.State.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycleRegistry.getState() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        q(key);
        c cVar = this.keyToLifecycleContainers.get(key);
        if (cVar == null) {
            cVar = new c(lifecycleRegistry);
        }
        cVar.a(new i() { // from class: com.google.android.n9
            @Override // androidx.lifecycle.i
            public final void d6(n17 n17Var, Lifecycle.Event event) {
                p9.p(this.a, key, callback, contract, n17Var, event);
            }
        });
        this.keyToLifecycleContainers.put(key, cVar);
        return new d(key, contract);
    }

    public final void r(String key) {
        Integer numRemove;
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.launchedKeys.contains(key) && (numRemove = this.keyToRc.remove(key)) != null) {
            this.rcToKey.remove(numRemove);
        }
        this.keyToCallback.remove(key);
        if (this.parsedPendingResults.containsKey(key)) {
            Objects.toString(this.parsedPendingResults.get(key));
            this.parsedPendingResults.remove(key);
        }
        if (this.pendingResults.containsKey(key)) {
            Objects.toString((ActivityResult) lx0.a(this.pendingResults, key, ActivityResult.class));
            this.pendingResults.remove(key);
        }
        c cVar = this.keyToLifecycleContainers.get(key);
        if (cVar != null) {
            cVar.b();
            this.keyToLifecycleContainers.remove(key);
        }
    }
}
