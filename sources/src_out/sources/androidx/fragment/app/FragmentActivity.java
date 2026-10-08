package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.google.android.e0b;
import com.google.android.k57;
import com.google.android.zza;
import com.google.inputmethod.a8;
import com.google.inputmethod.er8;
import com.google.inputmethod.fq7;
import com.google.inputmethod.gr8;
import com.google.inputmethod.i99;
import com.google.inputmethod.jq8;
import com.google.inputmethod.k9e;
import com.google.inputmethod.lq8;
import com.google.inputmethod.oq8;
import com.google.inputmethod.oy1;
import com.google.inputmethod.p9;
import com.google.inputmethod.pp4;
import com.google.inputmethod.qq8;
import com.google.inputmethod.r38;
import com.google.inputmethod.u9;
import com.google.inputmethod.u9e;
import com.google.inputmethod.uq7;
import com.google.inputmethod.xlb;
import com.google.inputmethod.xr8;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class FragmentActivity extends ComponentActivity implements a8.c {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    public static final /* synthetic */ int a = 0;
    boolean mCreated;
    final androidx.lifecycle.k mFragmentLifecycleRegistry;
    final m mFragments;
    boolean mResumed;
    boolean mStopped;

    class a extends o<FragmentActivity> implements oq8, xr8, er8, gr8, u9e, lq8, u9, e0b, pp4, fq7 {
        public a() {
            super(FragmentActivity.this);
        }

        @Override // com.google.inputmethod.pp4
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        @Override // com.google.inputmethod.fq7
        public void addMenuProvider(uq7 uq7Var) {
            FragmentActivity.this.addMenuProvider(uq7Var);
        }

        @Override // com.google.inputmethod.oq8
        public void addOnConfigurationChangedListener(oy1<Configuration> oy1Var) {
            FragmentActivity.this.addOnConfigurationChangedListener(oy1Var);
        }

        @Override // com.google.inputmethod.er8
        public void addOnMultiWindowModeChangedListener(oy1<r38> oy1Var) {
            FragmentActivity.this.addOnMultiWindowModeChangedListener(oy1Var);
        }

        @Override // com.google.inputmethod.gr8
        public void addOnPictureInPictureModeChangedListener(oy1<i99> oy1Var) {
            FragmentActivity.this.addOnPictureInPictureModeChangedListener(oy1Var);
        }

        @Override // com.google.inputmethod.xr8
        public void addOnTrimMemoryListener(oy1<Integer> oy1Var) {
            FragmentActivity.this.addOnTrimMemoryListener(oy1Var);
        }

        @Override // androidx.fragment.app.o, com.google.inputmethod.ap4
        public View c(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        @Override // androidx.fragment.app.o, com.google.inputmethod.ap4
        public boolean d() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // com.google.inputmethod.u9
        public p9 getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        @Override // com.google.inputmethod.n17
        public Lifecycle getLifecycle() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        @Override // com.google.inputmethod.lq8
        public jq8 getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        public zza getSavedStateRegistry() {
            return FragmentActivity.this.getSavedStateRegistry();
        }

        @Override // com.google.inputmethod.u9e
        public k9e getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.o
        public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.o
        public LayoutInflater k() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.o
        public boolean m(String str) {
            return a8.x(FragmentActivity.this, str);
        }

        @Override // androidx.fragment.app.o
        public void p() {
            q();
        }

        public void q() {
            FragmentActivity.this.invalidateMenu();
        }

        @Override // androidx.fragment.app.o
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public FragmentActivity j() {
            return FragmentActivity.this;
        }

        @Override // com.google.inputmethod.fq7
        public void removeMenuProvider(uq7 uq7Var) {
            FragmentActivity.this.removeMenuProvider(uq7Var);
        }

        @Override // com.google.inputmethod.oq8
        public void removeOnConfigurationChangedListener(oy1<Configuration> oy1Var) {
            FragmentActivity.this.removeOnConfigurationChangedListener(oy1Var);
        }

        @Override // com.google.inputmethod.er8
        public void removeOnMultiWindowModeChangedListener(oy1<r38> oy1Var) {
            FragmentActivity.this.removeOnMultiWindowModeChangedListener(oy1Var);
        }

        @Override // com.google.inputmethod.gr8
        public void removeOnPictureInPictureModeChangedListener(oy1<i99> oy1Var) {
            FragmentActivity.this.removeOnPictureInPictureModeChangedListener(oy1Var);
        }

        @Override // com.google.inputmethod.xr8
        public void removeOnTrimMemoryListener(oy1<Integer> oy1Var) {
            FragmentActivity.this.removeOnTrimMemoryListener(oy1Var);
        }
    }

    public FragmentActivity() {
        this.mFragments = m.b(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.k(this);
        this.mStopped = true;
        init();
    }

    public static /* synthetic */ Bundle D3(FragmentActivity fragmentActivity) {
        fragmentActivity.markFragmentsCreated();
        fragmentActivity.mFragmentLifecycleRegistry.l(Lifecycle.Event.ON_STOP);
        return new Bundle();
    }

    private void init() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new zza.b() { // from class: com.google.android.so4
            public final Bundle b() {
                return FragmentActivity.D3(this.a);
            }
        });
        addOnConfigurationChangedListener(new oy1() { // from class: com.google.android.to4
            @Override // com.google.inputmethod.oy1
            public final void accept(Object obj) {
                this.a.mFragments.m();
            }
        });
        addOnNewIntentListener(new oy1() { // from class: com.google.android.uo4
            @Override // com.google.inputmethod.oy1
            public final void accept(Object obj) {
                this.a.mFragments.m();
            }
        });
        addOnContextAvailableListener(new qq8() { // from class: com.google.android.vo4
            @Override // com.google.inputmethod.qq8
            public final void a(Context context) {
                this.a.mFragments.a(null);
            }
        });
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static boolean markState(FragmentManager fragmentManager, Lifecycle.State state) throws NoWhenBranchMatchedException {
        boolean zMarkState = false;
        for (Fragment fragment : fragmentManager.D0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zMarkState |= markState(fragment.getChildFragmentManager(), state);
                }
                z zVar = fragment.mViewLifecycleOwner;
                if (zVar != null && zVar.getLifecycle().getState().c(Lifecycle.State.STARTED)) {
                    fragment.mViewLifecycleOwner.f(state);
                    zMarkState = true;
                }
                if (fragment.mLifecycleRegistry.getState().c(Lifecycle.State.STARTED)) {
                    fragment.mLifecycleRegistry.q(state);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.n(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                k57.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.l().d0(str, fileDescriptor, printWriter, strArr);
        }
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.l();
    }

    @Deprecated
    public k57 getSupportLoaderManager() {
        return k57.b(this);
    }

    void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), Lifecycle.State.CREATED)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.m();
        super.onActivityResult(i, i2, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.l(Lifecycle.Event.ON_CREATE);
        this.mFragments.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.mFragments.f();
        this.mFragmentLifecycleRegistry.l(Lifecycle.Event.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.g();
        this.mFragmentLifecycleRegistry.l(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.m();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.mFragments.m();
        super.onResume();
        this.mResumed = true;
        this.mFragments.k();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.l(Lifecycle.Event.ON_RESUME);
        this.mFragments.h();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.mFragments.m();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.k();
        this.mFragmentLifecycleRegistry.l(Lifecycle.Event.ON_START);
        this.mFragments.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.j();
        this.mFragmentLifecycleRegistry.l(Lifecycle.Event.ON_STOP);
    }

    public void setEnterSharedElementCallback(xlb xlbVar) {
        a8.v(this, xlbVar);
    }

    public void setExitSharedElementCallback(xlb xlbVar) {
        a8.w(this, xlbVar);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            a8.z(this, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        a8.r(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        a8.s(this);
    }

    public void supportStartPostponedEnterTransition() {
        a8.A(this);
    }

    @Override // com.google.android.a8.c
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            a8.y(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public FragmentActivity(int i) {
        super(i);
        this.mFragments = m.b(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.k(this);
        this.mStopped = true;
        init();
    }
}
