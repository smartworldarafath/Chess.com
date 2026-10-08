package androidx.compose.ui.adaptive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.input.InputManager;
import android.os.Handler;
import android.os.Looper;
import android.view.InputDevice;
import android.view.View;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.platform.a0;
import com.google.android.kke;
import com.google.android.kl4;
import com.google.inputmethod.fsd;
import com.google.inputmethod.gsd;
import com.google.inputmethod.jd3;
import com.google.inputmethod.k7e;
import com.google.inputmethod.kd3;
import com.google.inputmethod.kie;
import com.google.inputmethod.s02;
import com.google.inputmethod.vn3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a%\u0010\u001a\u001a\u00020\u0010*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0019\u0010\u001e\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\"\u001a\u0010#\u001a\u00020\u0010*\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Landroid/content/Context;", "context", "Landroid/view/View;", "view", "Landroidx/compose/ui/platform/a0;", "windowInfo", "Lcom/google/android/fsd;", "k", "(Landroid/content/Context;Landroid/view/View;Landroidx/compose/ui/platform/a0;Landroidx/compose/runtime/d;I)Lcom/google/android/fsd;", "Lcom/google/android/kke;", "layoutInfo", "Lcom/google/android/fsd$b;", "m", "(Lcom/google/android/kke;)Ljava/lang/String;", "Landroid/hardware/input/InputManager;", "inputManager", "", "f", "(Landroid/hardware/input/InputManager;)Z", "Lcom/google/android/fsd$a;", "l", "(Landroid/hardware/input/InputManager;)Ljava/lang/String;", "Landroid/view/InputDevice;", "", "source", "axis", "g", "(Landroid/view/InputDevice;II)Z", "Landroid/content/Intent;", "intent", "i", "(Landroid/content/Intent;)Z", "Lcom/google/android/kie;", "j", "(Lcom/google/android/kie;)Z", "isImeVisible", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class MediaQuery_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(InputManager inputManager) {
        int[] inputDeviceIds;
        if (inputManager != null && (inputDeviceIds = inputManager.getInputDeviceIds()) != null) {
            for (int i : inputDeviceIds) {
                InputDevice inputDevice = inputManager.getInputDevice(i);
                if (inputDevice != null && inputDevice.getKeyboardType() == 2 && !inputDevice.isVirtual()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final boolean g(InputDevice inputDevice, int i, int i2) {
        return (inputDevice.getSources() & i) == i && inputDevice.getMotionRange(i2, i) != null;
    }

    static /* synthetic */ boolean h(InputDevice inputDevice, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return g(inputDevice, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(Intent intent) {
        return (intent == null || intent.getIntExtra("android.intent.extra.DOCK_STATE", 0) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(kie kieVar) {
        return kieVar != null && kieVar.u(kie.s.d());
    }

    public static final fsd k(final Context context, View view, a0 a0Var, d dVar, int i) {
        if (e.k()) {
            e.o(-590796729, i, -1, "androidx.compose.ui.adaptive.obtainUiMediaScope (MediaQuery.android.kt:121)");
        }
        Object objR = dVar.R();
        d.Companion companion = d.INSTANCE;
        if (objR == companion.a()) {
            Object systemService = context.getSystemService("input");
            Intrinsics.h(systemService, "null cannot be cast to non-null type android.hardware.input.InputManager");
            objR = (InputManager) systemService;
            dVar.L(objR);
        }
        final InputManager inputManager = (InputManager) objR;
        Object objR2 = dVar.R();
        if (objR2 == companion.a()) {
            objR2 = Boolean.valueOf(j(k7e.F(view)));
            dVar.L(objR2);
        }
        boolean zBooleanValue = ((Boolean) objR2).booleanValue();
        Object objR3 = dVar.R();
        if (objR3 == companion.a()) {
            objR3 = new gsd(context, inputManager, a0Var, zBooleanValue);
            dVar.L(objR3);
        }
        final gsd gsdVar = (gsd) objR3;
        gsdVar.e(a0Var);
        boolean zT = dVar.T(context);
        Object objR4 = dVar.R();
        if (zT || objR4 == companion.a()) {
            objR4 = new MediaQuery_androidKt$obtainUiMediaScope$1$1(context, gsdVar, null);
            dVar.L(objR4);
        }
        int i2 = i & 14;
        vn3.g(context, (Function2) objR4, dVar, i2);
        boolean zT2 = dVar.T(inputManager);
        Object objR5 = dVar.R();
        if (zT2 || objR5 == companion.a()) {
            objR5 = new Function1<kd3, jd3>() { // from class: androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$2$1

                @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/adaptive/MediaQuery_androidKt$obtainUiMediaScope$2$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class a implements jd3 {
                    final /* synthetic */ InputManager a;
                    final /* synthetic */ b b;

                    public a(InputManager inputManager, b bVar) {
                        this.a = inputManager;
                        this.b = bVar;
                    }

                    @Override // com.google.inputmethod.jd3
                    public void dispose() {
                        this.a.unregisterInputDeviceListener(this.b);
                    }
                }

                @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/compose/ui/adaptive/MediaQuery_androidKt$obtainUiMediaScope$2$1$b", "Landroid/hardware/input/InputManager$InputDeviceListener;", "", "id", "", "onInputDeviceAdded", "(I)V", "onInputDeviceRemoved", "onInputDeviceChanged", "a", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class b implements InputManager.InputDeviceListener {
                    final /* synthetic */ gsd a;
                    final /* synthetic */ InputManager b;

                    b(gsd gsdVar, InputManager inputManager) {
                        this.a = gsdVar;
                        this.b = inputManager;
                    }

                    public final void a() {
                        this.a.d(MediaQuery_androidKt.l(this.b));
                        this.a.b(MediaQuery_androidKt.f(this.b));
                    }

                    @Override // android.hardware.input.InputManager.InputDeviceListener
                    public void onInputDeviceAdded(int id) {
                        a();
                    }

                    @Override // android.hardware.input.InputManager.InputDeviceListener
                    public void onInputDeviceChanged(int id) {
                        a();
                    }

                    @Override // android.hardware.input.InputManager.InputDeviceListener
                    public void onInputDeviceRemoved(int id) {
                        a();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final jd3 invoke(kd3 kd3Var) {
                    b bVar = new b(gsdVar, inputManager);
                    inputManager.registerInputDeviceListener(bVar, new Handler(Looper.getMainLooper()));
                    bVar.a();
                    return new a(inputManager, bVar);
                }
            };
            dVar.L(objR5);
        }
        vn3.c(context, (Function1) objR5, dVar, i2);
        boolean zT3 = dVar.T(view);
        Object objR6 = dVar.R();
        if (zT3 || objR6 == companion.a()) {
            objR6 = new MediaQuery_androidKt$obtainUiMediaScope$3$1(view, gsdVar);
            dVar.L(objR6);
        }
        vn3.c(view, (Function1) objR6, dVar, (i >> 3) & 14);
        boolean zT4 = dVar.T(context);
        Object objR7 = dVar.R();
        if (zT4 || objR7 == companion.a()) {
            objR7 = new Function1<kd3, jd3>() { // from class: androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$4$1

                @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/adaptive/MediaQuery_androidKt$obtainUiMediaScope$4$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class a implements jd3 {
                    final /* synthetic */ Context a;
                    final /* synthetic */ MediaQuery_androidKt$obtainUiMediaScope$4$1$receiver$1 b;

                    public a(Context context, MediaQuery_androidKt$obtainUiMediaScope$4$1$receiver$1 mediaQuery_androidKt$obtainUiMediaScope$4$1$receiver$1) {
                        this.a = context;
                        this.b = mediaQuery_androidKt$obtainUiMediaScope$4$1$receiver$1;
                    }

                    @Override // com.google.inputmethod.jd3
                    public void dispose() {
                        this.a.unregisterReceiver(this.b);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [android.content.BroadcastReceiver, androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$4$1$receiver$1] */
                public final jd3 invoke(kd3 kd3Var) {
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.DOCK_EVENT");
                    final gsd gsdVar2 = gsdVar;
                    ?? r0 = new BroadcastReceiver() { // from class: androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$4$1$receiver$1
                        @Override // android.content.BroadcastReceiver
                        public void onReceive(Context context2, Intent intent) {
                            gsdVar2.a(MediaQuery_androidKt.i(intent));
                        }
                    };
                    gsdVar.a(MediaQuery_androidKt.i(s02.l(context, r0, intentFilter, 2)));
                    return new a(context, r0);
                }
            };
            dVar.L(objR7);
        }
        vn3.c(context, (Function1) objR7, dVar, i2);
        if (e.k()) {
            e.n();
        }
        return gsdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String l(InputManager inputManager) {
        if (inputManager == null) {
            return fsd.a.INSTANCE.d();
        }
        String strD = fsd.a.INSTANCE.d();
        for (int i : inputManager.getInputDeviceIds()) {
            InputDevice inputDevice = inputManager.getInputDevice(i);
            if (inputDevice != null) {
                if (h(inputDevice, 8194, 0, 2, null) || h(inputDevice, 16386, 0, 2, null) || h(inputDevice, 1048584, 0, 2, null)) {
                    return fsd.a.INSTANCE.c();
                }
                if (h(inputDevice, 4098, 0, 2, null)) {
                    strD = fsd.a.INSTANCE.b();
                } else {
                    fsd.a.Companion companion = fsd.a.INSTANCE;
                    if (fsd.a.h(strD, companion.d()) && (h(inputDevice, 16777232, 0, 2, null) || h(inputDevice, 1025, 0, 2, null))) {
                        strD = companion.a();
                    }
                }
            }
        }
        return strD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String m(kke kkeVar) {
        Object next;
        List listA = kkeVar.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (obj instanceof kl4) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.e(((kl4) next).getState(), kl4.b.d));
        kl4 kl4Var = (kl4) next;
        if (kl4Var == null) {
            return fsd.b.INSTANCE.b();
        }
        return Intrinsics.e(kl4Var.a(), kl4.a.d) ? fsd.b.INSTANCE.c() : fsd.b.INSTANCE.a();
    }
}
