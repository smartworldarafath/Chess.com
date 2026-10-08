package com.google.inputmethod;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import androidx.compose.p004runtime.s0;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.h;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\b\u0004\n\u0002\b\r*\u0002\u001e\"\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0012B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R+\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b\u001c\u0010\fR\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u0004\u0018\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010(\u001a\u00020\u0003*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0018\u0010*\u001a\u00020\u0003*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0014\u0010-\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/google/android/u47;", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "Lcom/google/android/q6c;", "", "listenToTouchExplorationState", "listenToSwitchAccessState", "listenToVoiceAccessState", "<init>", "(ZZZ)V", "enabled", "", "onAccessibilityStateChanged", "(Z)V", "Landroid/view/accessibility/AccessibilityManager;", "am", "w", "(Landroid/view/accessibility/AccessibilityManager;)V", "A", "a", "Z", "getListenToSwitchAccessState", "()Z", "b", "getListenToVoiceAccessState", "<set-?>", "c", "Lcom/google/android/o58;", "m", "x", "accessibilityEnabled", "com/google/android/u47$c", "d", "Lcom/google/android/u47$c;", "touchExplorationListener", "com/google/android/u47$b", "e", "Lcom/google/android/u47$b;", "otherA11yServicesListener", "q", "(Landroid/view/accessibility/AccessibilityManager;)Z", "switchAccessEnabled", "u", "voiceAccessEnabled", "t", "()Ljava/lang/Boolean;", "value", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class u47 implements AccessibilityManager.AccessibilityStateChangeListener, q6c<Boolean> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean listenToSwitchAccessState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean listenToVoiceAccessState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final o58 accessibilityEnabled = s0.e(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final c touchExplorationListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final b otherA11yServicesListener;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/google/android/u47$a;", "", "<init>", "()V", "Landroid/view/accessibility/AccessibilityManager;", "am", "Landroid/view/accessibility/AccessibilityManager$AccessibilityServicesStateChangeListener;", "listener", "", "a", "(Landroid/view/accessibility/AccessibilityManager;Landroid/view/accessibility/AccessibilityManager$AccessibilityServicesStateChangeListener;)V", "b", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a {
        public static final a a = new a();

        private a() {
        }

        public static final void a(AccessibilityManager am, AccessibilityManager$AccessibilityServicesStateChangeListener listener) {
            am.addAccessibilityServicesStateChangeListener(listener);
        }

        public static final void b(AccessibilityManager am, AccessibilityManager$AccessibilityServicesStateChangeListener listener) {
            am.removeAccessibilityServicesStateChangeListener(listener);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R+\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR+\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0012"}, d2 = {"com/google/android/u47$b", "Landroid/view/accessibility/AccessibilityManager$AccessibilityServicesStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager;", "am", "", "onAccessibilityServicesStateChanged", "(Landroid/view/accessibility/AccessibilityManager;)V", "", "<set-?>", "a", "Lcom/google/android/o58;", "()Z", "c", "(Z)V", "switchAccessEnabled", "b", "d", "voiceAccessEnabled", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements AccessibilityManager$AccessibilityServicesStateChangeListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final o58 switchAccessEnabled;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final o58 voiceAccessEnabled;

        b() {
            Boolean bool = Boolean.FALSE;
            this.switchAccessEnabled = s0.e(bool, null, 2, null);
            this.voiceAccessEnabled = s0.e(bool, null, 2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean a() {
            return ((Boolean) this.switchAccessEnabled.getValue()).booleanValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean b() {
            return ((Boolean) this.voiceAccessEnabled.getValue()).booleanValue();
        }

        public final void c(boolean z) {
            this.switchAccessEnabled.setValue(Boolean.valueOf(z));
        }

        public final void d(boolean z) {
            this.voiceAccessEnabled.setValue(Boolean.valueOf(z));
        }

        public void onAccessibilityServicesStateChanged(AccessibilityManager am) {
            c(u47.this.q(am));
            d(u47.this.u(am));
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R+\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"com/google/android/u47$c", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "", "enabled", "", "onTouchExplorationStateChanged", "(Z)V", "<set-?>", "a", "Lcom/google/android/o58;", "()Z", "b", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final o58 enabled = s0.e(Boolean.FALSE, null, 2, null);

        c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean a() {
            return ((Boolean) this.enabled.getValue()).booleanValue();
        }

        public final void b(boolean z) {
            this.enabled.setValue(Boolean.valueOf(z));
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean enabled) {
            b(enabled);
        }
    }

    public u47(boolean z, boolean z2, boolean z3) {
        this.listenToSwitchAccessState = z2;
        this.listenToVoiceAccessState = z3;
        b bVar = null;
        this.touchExplorationListener = z ? new c() : null;
        if ((z2 || z3) && Build.VERSION.SDK_INT >= 33) {
            bVar = new b();
        }
        this.otherA11yServicesListener = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean m() {
        return ((Boolean) this.accessibilityEnabled.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && h.e0(settingsActivityName, "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean u(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && h.e0(settingsActivityName, "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    private final void x(boolean z) {
        this.accessibilityEnabled.setValue(Boolean.valueOf(z));
    }

    public final void A(AccessibilityManager am) {
        b bVar;
        am.removeAccessibilityStateChangeListener(this);
        c cVar = this.touchExplorationListener;
        if (cVar != null) {
            am.removeTouchExplorationStateChangeListener(cVar);
        }
        if (Build.VERSION.SDK_INT < 33 || (bVar = this.otherA11yServicesListener) == null) {
            return;
        }
        a.b(am, t47.a(bVar));
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean enabled) {
        x(enabled);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0030  */
    @Override // com.google.inputmethod.q6c
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Boolean getValue() {
        boolean z;
        b bVar;
        b bVar2;
        if (m()) {
            c cVar = this.touchExplorationListener;
            z = true;
            if ((cVar == null || !cVar.a()) && ((!this.listenToSwitchAccessState || (bVar2 = this.otherA11yServicesListener) == null || !bVar2.a()) && (!this.listenToVoiceAccessState || (bVar = this.otherA11yServicesListener) == null || !bVar.b()))) {
                z = false;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final void w(AccessibilityManager am) {
        b bVar;
        x(am.isEnabled());
        am.addAccessibilityStateChangeListener(this);
        c cVar = this.touchExplorationListener;
        if (cVar != null) {
            cVar.b(am.isTouchExplorationEnabled());
            am.addTouchExplorationStateChangeListener(cVar);
        }
        if (Build.VERSION.SDK_INT < 33 || (bVar = this.otherA11yServicesListener) == null) {
            return;
        }
        bVar.c(q(am));
        bVar.d(u(am));
        a.a(am, t47.a(bVar));
    }
}
