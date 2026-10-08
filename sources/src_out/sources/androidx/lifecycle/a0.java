package androidx.lifecycle;

import androidx.lifecycle.a0;
import com.google.android.rg6;
import com.google.inputmethod.CreationExtras;
import com.google.inputmethod.k9e;
import com.google.inputmethod.w8e;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BC\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/lifecycle/a0;", "Lcom/google/android/w8e;", "VM", "Lkotlin/Lazy;", "Lcom/google/android/rg6;", "viewModelClass", "Lkotlin/Function0;", "Lcom/google/android/k9e;", "storeProducer", "Landroidx/lifecycle/b0$c;", "factoryProducer", "Lcom/google/android/oe2;", "extrasProducer", "<init>", "(Lcom/google/android/rg6;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "isInitialized", "()Z", "a", "Lcom/google/android/rg6;", "b", "Lkotlin/jvm/functions/Function0;", "c", "d", "e", "Lcom/google/android/w8e;", "cached", "()Lcom/google/android/w8e;", "value", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a0<VM extends w8e> implements Lazy<VM> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final rg6<VM> viewModelClass;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function0<k9e> storeProducer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Function0<b0.c> factoryProducer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function0<CreationExtras> extrasProducer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private VM cached;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(rg6<VM> rg6Var, Function0<? extends k9e> function0, Function0<? extends b0.c> function1, Function0<? extends CreationExtras> function2) {
        Intrinsics.checkNotNullParameter(rg6Var, "viewModelClass");
        Intrinsics.checkNotNullParameter(function0, "storeProducer");
        Intrinsics.checkNotNullParameter(function1, "factoryProducer");
        Intrinsics.checkNotNullParameter(function2, "extrasProducer");
        this.viewModelClass = rg6Var;
        this.storeProducer = function0;
        this.factoryProducer = function1;
        this.extrasProducer = function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreationExtras.b b() {
        return CreationExtras.b.c;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public VM getValue() {
        VM vm = this.cached;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) b0.INSTANCE.a((k9e) this.storeProducer.invoke(), (b0.c) this.factoryProducer.invoke(), (CreationExtras) this.extrasProducer.invoke()).a(this.viewModelClass);
        this.cached = vm2;
        return vm2;
    }

    public boolean isInitialized() {
        return this.cached != null;
    }

    public /* synthetic */ a0(rg6 rg6Var, Function0 function0, Function0 function1, Function0 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rg6Var, function0, function1, (i & 8) != 0 ? new Function0() { // from class: com.google.android.f9e
            public final Object invoke() {
                return a0.b();
            }
        } : function2);
    }
}
