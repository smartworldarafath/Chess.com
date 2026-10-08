package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import com.google.android.e0b;
import com.google.android.zza;
import com.google.inputmethod.BackEventCompat;
import com.google.inputmethod.ap4;
import com.google.inputmethod.eq8;
import com.google.inputmethod.er8;
import com.google.inputmethod.ey9;
import com.google.inputmethod.fq7;
import com.google.inputmethod.g9;
import com.google.inputmethod.gr8;
import com.google.inputmethod.i9;
import com.google.inputmethod.i99;
import com.google.inputmethod.jq8;
import com.google.inputmethod.k9e;
import com.google.inputmethod.l9;
import com.google.inputmethod.lq8;
import com.google.inputmethod.n17;
import com.google.inputmethod.oq8;
import com.google.inputmethod.oy1;
import com.google.inputmethod.p9;
import com.google.inputmethod.pp4;
import com.google.inputmethod.r38;
import com.google.inputmethod.u9;
import com.google.inputmethod.u9e;
import com.google.inputmethod.up4;
import com.google.inputmethod.uq7;
import com.google.inputmethod.x8;
import com.google.inputmethod.xr8;
import com.google.inputmethod.z8;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public abstract class FragmentManager {
    private static boolean U = false;
    static boolean V = true;
    Fragment A;
    private l9<Intent> F;
    private l9<IntentSenderRequest> G;
    private l9<String[]> H;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private ArrayList<androidx.fragment.app.a> O;
    private ArrayList<Boolean> P;
    private ArrayList<Fragment> Q;
    private s R;
    private FragmentStrictMode.b S;
    private boolean b;
    private ArrayList<Fragment> e;
    private jq8 g;
    private androidx.fragment.app.o<?> x;
    private ap4 y;
    private Fragment z;
    private final ArrayList<o> a = new ArrayList<>();
    private final u c = new u();
    ArrayList<androidx.fragment.app.a> d = new ArrayList<>();
    private final androidx.fragment.app.p f = new androidx.fragment.app.p(this);
    androidx.fragment.app.a h = null;
    boolean i = false;
    private final eq8 j = new b(false);
    private final AtomicInteger k = new AtomicInteger();
    private final Map<String, BackStackState> l = Collections.synchronizedMap(new HashMap());
    private final Map<String, Bundle> m = Collections.synchronizedMap(new HashMap());
    private final Map<String, m> n = Collections.synchronizedMap(new HashMap());
    ArrayList<n> o = new ArrayList<>();
    private final androidx.fragment.app.q p = new androidx.fragment.app.q(this);
    private final CopyOnWriteArrayList<pp4> q = new CopyOnWriteArrayList<>();
    private final oy1<Configuration> r = new oy1() { // from class: com.google.android.hp4
        @Override // com.google.inputmethod.oy1
        public final void accept(Object obj) {
            FragmentManager.f(this.a, (Configuration) obj);
        }
    };
    private final oy1<Integer> s = new oy1() { // from class: com.google.android.ip4
        @Override // com.google.inputmethod.oy1
        public final void accept(Object obj) {
            FragmentManager.a(this.a, (Integer) obj);
        }
    };
    private final oy1<r38> t = new oy1() { // from class: com.google.android.jp4
        @Override // com.google.inputmethod.oy1
        public final void accept(Object obj) {
            FragmentManager.e(this.a, (r38) obj);
        }
    };
    private final oy1<i99> u = new oy1() { // from class: com.google.android.kp4
        @Override // com.google.inputmethod.oy1
        public final void accept(Object obj) {
            FragmentManager.d(this.a, (i99) obj);
        }
    };
    private final uq7 v = new c();
    int w = -1;
    private androidx.fragment.app.n B = null;
    private androidx.fragment.app.n C = new d();
    private d0 D = null;
    private d0 E = new e();
    ArrayDeque<LaunchedFragmentInfo> I = new ArrayDeque<>();
    private Runnable T = new f();

    class a implements x8<Map<String, Boolean>> {
        a() {
        }

        @Override // com.google.inputmethod.x8
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.I.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                toString();
                return;
            }
            String str = launchedFragmentInfoPollFirst.a;
            int i2 = launchedFragmentInfoPollFirst.b;
            Fragment fragmentI = FragmentManager.this.c.i(str);
            if (fragmentI == null) {
                return;
            }
            fragmentI.onRequestPermissionsResult(i2, strArr, iArr);
        }
    }

    class b extends eq8 {
        b(boolean z) {
            super(z);
        }

        @Override // com.google.inputmethod.eq8
        public void handleOnBackCancelled() {
            if (FragmentManager.R0(3)) {
                boolean z = FragmentManager.V;
                Objects.toString(FragmentManager.this);
            }
            if (FragmentManager.V) {
                FragmentManager.this.t();
            }
        }

        @Override // com.google.inputmethod.eq8
        public void handleOnBackPressed() {
            if (FragmentManager.R0(3)) {
                boolean z = FragmentManager.V;
                Objects.toString(FragmentManager.this);
            }
            FragmentManager.this.N0();
        }

        @Override // com.google.inputmethod.eq8
        public void handleOnBackProgressed(BackEventCompat backEventCompat) {
            if (FragmentManager.R0(2)) {
                boolean z = FragmentManager.V;
                Objects.toString(FragmentManager.this);
            }
            FragmentManager fragmentManager = FragmentManager.this;
            if (fragmentManager.h != null) {
                Iterator<SpecialEffectsController> it = fragmentManager.B(new ArrayList<>(Collections.singletonList(FragmentManager.this.h)), 0, 1).iterator();
                while (it.hasNext()) {
                    it.next().A(backEventCompat);
                }
                Iterator<n> it2 = FragmentManager.this.o.iterator();
                while (it2.hasNext()) {
                    it2.next().d(backEventCompat);
                }
            }
        }

        @Override // com.google.inputmethod.eq8
        public void handleOnBackStarted(BackEventCompat backEventCompat) {
            if (FragmentManager.R0(3)) {
                boolean z = FragmentManager.V;
                Objects.toString(FragmentManager.this);
            }
            if (FragmentManager.V) {
                FragmentManager.this.e0();
                FragmentManager.this.o1();
            }
        }
    }

    class c implements uq7 {
        c() {
        }

        @Override // com.google.inputmethod.uq7
        public void a(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.J(menu, menuInflater);
        }

        @Override // com.google.inputmethod.uq7
        public void b(Menu menu) {
            FragmentManager.this.R(menu);
        }

        @Override // com.google.inputmethod.uq7
        public void c(Menu menu) {
            FragmentManager.this.V(menu);
        }

        @Override // com.google.inputmethod.uq7
        public boolean d(MenuItem menuItem) {
            return FragmentManager.this.Q(menuItem);
        }
    }

    class d extends androidx.fragment.app.n {
        d() {
        }

        @Override // androidx.fragment.app.n
        public Fragment a(ClassLoader classLoader, String str) {
            return FragmentManager.this.E0().b(FragmentManager.this.E0().getContext(), str, null);
        }
    }

    class e implements d0 {
        e() {
        }

        @Override // androidx.fragment.app.d0
        public SpecialEffectsController a(ViewGroup viewGroup) {
            return new DefaultSpecialEffectsController(viewGroup);
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.h0(true);
        }
    }

    class g implements androidx.lifecycle.i {
        final /* synthetic */ String a;
        final /* synthetic */ up4 b;
        final /* synthetic */ Lifecycle c;

        g(String str, up4 up4Var, Lifecycle lifecycle) {
            this.a = str;
            this.b = up4Var;
            this.c = lifecycle;
        }

        @Override // androidx.lifecycle.i
        public void d6(n17 n17Var, Lifecycle.Event event) {
            Bundle bundle;
            if (event == Lifecycle.Event.ON_START && (bundle = (Bundle) FragmentManager.this.m.get(this.a)) != null) {
                this.b.a(this.a, bundle);
                FragmentManager.this.y(this.a);
            }
            if (event == Lifecycle.Event.ON_DESTROY) {
                this.c.g(this);
                FragmentManager.this.n.remove(this.a);
            }
        }
    }

    class h implements pp4 {
        final /* synthetic */ Fragment a;

        h(Fragment fragment) {
            this.a = fragment;
        }

        @Override // com.google.inputmethod.pp4
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            this.a.onAttachFragment(fragment);
        }
    }

    class i implements x8<ActivityResult> {
        i() {
        }

        @Override // com.google.inputmethod.x8
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfoPollLast = FragmentManager.this.I.pollLast();
            if (launchedFragmentInfoPollLast == null) {
                toString();
                return;
            }
            String str = launchedFragmentInfoPollLast.a;
            int i = launchedFragmentInfoPollLast.b;
            Fragment fragmentI = FragmentManager.this.c.i(str);
            if (fragmentI == null) {
                return;
            }
            fragmentI.onActivityResult(i, activityResult.getResultCode(), activityResult.getData());
        }
    }

    class j implements x8<ActivityResult> {
        j() {
        }

        @Override // com.google.inputmethod.x8
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.I.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                toString();
                return;
            }
            String str = launchedFragmentInfoPollFirst.a;
            int i = launchedFragmentInfoPollFirst.b;
            Fragment fragmentI = FragmentManager.this.c.i(str);
            if (fragmentI == null) {
                return;
            }
            fragmentI.onActivityResult(i, activityResult.getResultCode(), activityResult.getData());
        }
    }

    static class k extends z8<IntentSenderRequest, ActivityResult> {
        k() {
        }

        @Override // com.google.inputmethod.z8
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent fillInIntent = intentSenderRequest.getFillInIntent();
            if (fillInIntent != null && (bundleExtra = fillInIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                fillInIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (fillInIntent.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.a(intentSenderRequest.getIntentSender()).b(null).c(intentSenderRequest.getFlagsValues(), intentSenderRequest.getFlagsMask()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.R0(2)) {
                intent.toString();
            }
            return intent;
        }

        @Override // com.google.inputmethod.z8
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ActivityResult parseResult(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    public static abstract class l {
        @Deprecated
        public void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentPreAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void onFragmentPreCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentSaveInstanceState(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        }

        public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        }
    }

    private static class m implements up4 {
        private final Lifecycle a;
        private final up4 b;
        private final androidx.lifecycle.i c;

        m(Lifecycle lifecycle, up4 up4Var, androidx.lifecycle.i iVar) {
            this.a = lifecycle;
            this.b = up4Var;
            this.c = iVar;
        }

        @Override // com.google.inputmethod.up4
        public void a(String str, Bundle bundle) {
            this.b.a(str, bundle);
        }

        public boolean b(Lifecycle.State state) {
            return this.a.getState().c(state);
        }

        public void c() {
            this.a.g(this.c);
        }
    }

    public interface n {
        default void a(Fragment fragment, boolean z) {
        }

        default void b() {
        }

        default void c(Fragment fragment, boolean z) {
        }

        default void d(BackEventCompat backEventCompat) {
        }

        void onBackStackChanged();
    }

    interface o {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    private class p implements o {
        final String a;
        final int b;
        final int c;

        p(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.o
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.A;
            if (fragment == null || this.b >= 0 || this.a != null || !fragment.getChildFragmentManager().j1()) {
                return FragmentManager.this.m1(arrayList, arrayList2, this.a, this.b, this.c);
            }
            return false;
        }
    }

    class q implements o {
        q() {
        }

        @Override // androidx.fragment.app.FragmentManager.o
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            boolean zN1 = FragmentManager.this.n1(arrayList, arrayList2);
            if (!FragmentManager.this.o.isEmpty() && arrayList.size() > 0) {
                boolean zBooleanValue = arrayList2.get(arrayList.size() - 1).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator<androidx.fragment.app.a> it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.addAll(FragmentManager.this.v0(it.next()));
                }
                for (n nVar : FragmentManager.this.o) {
                    Iterator it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                        nVar.a((Fragment) it2.next(), zBooleanValue);
                    }
                }
            }
            return zN1;
        }
    }

    private Set<SpecialEffectsController> A() {
        HashSet hashSet = new HashSet();
        Iterator<t> it = this.c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().k().mContainer;
            if (viewGroup != null) {
                hashSet.add(SpecialEffectsController.v(viewGroup, J0()));
            }
        }
        return hashSet;
    }

    private ViewGroup B0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.y.d()) {
            View viewC = this.y.c(fragment.mContainerId);
            if (viewC instanceof ViewGroup) {
                return (ViewGroup) viewC;
            }
        }
        return null;
    }

    private void G1(Fragment fragment) {
        ViewGroup viewGroupB0 = B0(fragment);
        if (viewGroupB0 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        if (viewGroupB0.getTag(ey9.c) == null) {
            viewGroupB0.setTag(ey9.c, fragment);
        }
        ((Fragment) viewGroupB0.getTag(ey9.c)).setPopDirection(fragment.getPopDirection());
    }

    private void I1() {
        Iterator<t> it = this.c.k().iterator();
        while (it.hasNext()) {
            f1(it.next());
        }
    }

    private void J1(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new a0("FragmentManager"));
        androidx.fragment.app.o<?> oVar = this.x;
        try {
            if (oVar != null) {
                oVar.i("  ", null, printWriter, new String[0]);
            } else {
                d0("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception unused) {
            throw runtimeException;
        }
    }

    static Fragment L0(View view) {
        Object tag = view.getTag(ey9.a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    private void L1() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    this.j.setEnabled(true);
                    if (R0(3)) {
                        toString();
                    }
                } else {
                    boolean z = x0() > 0 && W0(this.z);
                    if (R0(3)) {
                        toString();
                    }
                    this.j.setEnabled(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean R0(int i2) {
        return U || Log.isLoggable("FragmentManager", i2);
    }

    private void S(Fragment fragment) {
        if (fragment == null || !fragment.equals(m0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    private boolean S0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.u();
    }

    private boolean T0() {
        Fragment fragment = this.z;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.z.getParentFragmentManager().T0();
    }

    private void Z(int i2) {
        try {
            this.b = true;
            this.c.d(i2);
            c1(i2, false);
            Iterator<SpecialEffectsController> it = A().iterator();
            while (it.hasNext()) {
                it.next().q();
            }
            this.b = false;
            h0(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public static /* synthetic */ void a(FragmentManager fragmentManager, Integer num) {
        if (fragmentManager.T0() && num.intValue() == 80) {
            fragmentManager.M(false);
        }
    }

    public static /* synthetic */ void c(FragmentManager fragmentManager) {
        Iterator<n> it = fragmentManager.o.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    private void c0() {
        if (this.N) {
            this.N = false;
            I1();
        }
    }

    public static /* synthetic */ void d(FragmentManager fragmentManager, i99 i99Var) {
        if (fragmentManager.T0()) {
            fragmentManager.U(i99Var.getIsInPictureInPictureMode(), false);
        }
    }

    public static /* synthetic */ void e(FragmentManager fragmentManager, r38 r38Var) {
        if (fragmentManager.T0()) {
            fragmentManager.N(r38Var.getIsInMultiWindowMode(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0() {
        Iterator<SpecialEffectsController> it = A().iterator();
        while (it.hasNext()) {
            it.next().q();
        }
    }

    public static /* synthetic */ void f(FragmentManager fragmentManager, Configuration configuration) {
        if (fragmentManager.T0()) {
            fragmentManager.G(configuration, false);
        }
    }

    private void g0(boolean z) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.x == null) {
            if (!this.M) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.x.getHandler().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            v();
        }
        if (this.O == null) {
            this.O = new ArrayList<>();
            this.P = new ArrayList<>();
        }
    }

    private static void j0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            androidx.fragment.app.a aVar = arrayList.get(i2);
            if (arrayList2.get(i2).booleanValue()) {
                aVar.B(-1);
                aVar.H();
            } else {
                aVar.B(1);
                aVar.G();
            }
            i2++;
        }
    }

    private void k0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        boolean z = arrayList.get(i2).r;
        ArrayList<Fragment> arrayList3 = this.Q;
        if (arrayList3 == null) {
            this.Q = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.Q.addAll(this.c.o());
        Fragment fragmentI0 = I0();
        boolean z2 = false;
        for (int i4 = i2; i4 < i3; i4++) {
            androidx.fragment.app.a aVar = arrayList.get(i4);
            fragmentI0 = !arrayList2.get(i4).booleanValue() ? aVar.I(this.Q, fragmentI0) : aVar.L(this.Q, fragmentI0);
            z2 = z2 || aVar.i;
        }
        this.Q.clear();
        if (!z && this.w >= 1) {
            for (int i5 = i2; i5 < i3; i5++) {
                Iterator<v.a> it = arrayList.get(i5).c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().b;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.c.r(C(fragment));
                    }
                }
            }
        }
        j0(arrayList, arrayList2, i2, i3);
        boolean zBooleanValue = arrayList2.get(i3 - 1).booleanValue();
        if (z2 && !this.o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<androidx.fragment.app.a> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(v0(it2.next()));
            }
            if (this.h == null) {
                for (n nVar : this.o) {
                    Iterator it3 = linkedHashSet.iterator();
                    while (it3.hasNext()) {
                        nVar.a((Fragment) it3.next(), zBooleanValue);
                    }
                }
                for (n nVar2 : this.o) {
                    Iterator it4 = linkedHashSet.iterator();
                    while (it4.hasNext()) {
                        nVar2.c((Fragment) it4.next(), zBooleanValue);
                    }
                }
            }
        }
        for (int i6 = i2; i6 < i3; i6++) {
            androidx.fragment.app.a aVar2 = arrayList.get(i6);
            if (zBooleanValue) {
                for (int size = aVar2.c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = aVar2.c.get(size).b;
                    if (fragment2 != null) {
                        C(fragment2).m();
                    }
                }
            } else {
                Iterator<v.a> it5 = aVar2.c.iterator();
                while (it5.hasNext()) {
                    Fragment fragment3 = it5.next().b;
                    if (fragment3 != null) {
                        C(fragment3).m();
                    }
                }
            }
        }
        c1(this.w, true);
        for (SpecialEffectsController specialEffectsController : B(arrayList, i2, i3)) {
            specialEffectsController.D(zBooleanValue);
            specialEffectsController.z();
            specialEffectsController.n();
        }
        while (i2 < i3) {
            androidx.fragment.app.a aVar3 = arrayList.get(i2);
            if (arrayList2.get(i2).booleanValue() && aVar3.v >= 0) {
                aVar3.v = -1;
            }
            aVar3.K();
            i2++;
        }
        if (z2) {
            v1();
        }
    }

    private boolean l1(String str, int i2, int i3) {
        h0(false);
        g0(true);
        Fragment fragment = this.A;
        if (fragment != null && i2 < 0 && str == null && fragment.getChildFragmentManager().j1()) {
            return true;
        }
        boolean zM1 = m1(this.O, this.P, str, i2, i3);
        if (zM1) {
            this.b = true;
            try {
                t1(this.O, this.P);
                w();
            } catch (Throwable th) {
                w();
                throw th;
            }
        }
        L1();
        c0();
        this.c.b();
        return zM1;
    }

    private int n0(String str, int i2, boolean z) {
        if (this.d.isEmpty()) {
            return -1;
        }
        if (str == null && i2 < 0) {
            if (z) {
                return 0;
            }
            return this.d.size() - 1;
        }
        int size = this.d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.a aVar = this.d.get(size);
            if ((str != null && str.equals(aVar.J())) || (i2 >= 0 && i2 == aVar.v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.a aVar2 = this.d.get(size - 1);
            if ((str == null || !str.equals(aVar2.J())) && (i2 < 0 || i2 != aVar2.v)) {
                break;
            }
            size--;
        }
        return size;
    }

    public static <F extends Fragment> F o0(View view) {
        F f2 = (F) t0(view);
        if (f2 != null) {
            return f2;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    public static FragmentManager s0(View view) {
        FragmentActivity fragmentActivity;
        Fragment fragmentT0 = t0(view);
        if (fragmentT0 != null) {
            if (fragmentT0.isAdded()) {
                return fragmentT0.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + fragmentT0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                fragmentActivity = null;
                break;
            }
            if (context instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (fragmentActivity != null) {
            return fragmentActivity.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    static Fragment t0(View view) {
        while (view != null) {
            Fragment fragmentL0 = L0(view);
            if (fragmentL0 != null) {
                return fragmentL0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private void t1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).r) {
                if (i3 != i2) {
                    k0(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).r) {
                        i3++;
                    }
                }
                k0(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            k0(arrayList, arrayList2, i3, size);
        }
    }

    private void u0() {
        Iterator<SpecialEffectsController> it = A().iterator();
        while (it.hasNext()) {
            it.next().r();
        }
    }

    private void v() {
        if (Y0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void v1() {
        for (int i2 = 0; i2 < this.o.size(); i2++) {
            this.o.get(i2).onBackStackChanged();
        }
    }

    private void w() {
        this.b = false;
        this.P.clear();
        this.O.clear();
    }

    private boolean w0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return false;
            }
            try {
                int size = this.a.size();
                boolean zA = false;
                for (int i2 = 0; i2 < size; i2++) {
                    zA |= this.a.get(i2).a(arrayList, arrayList2);
                }
                this.a.clear();
                this.x.getHandler().removeCallbacks(this.T);
                return zA;
            } catch (Throwable th) {
                this.a.clear();
                this.x.getHandler().removeCallbacks(this.T);
                throw th;
            }
        }
    }

    private void x() {
        boolean zL6;
        androidx.fragment.app.o<?> oVar = this.x;
        if (oVar instanceof u9e) {
            zL6 = this.c.p().L6();
        } else {
            zL6 = oVar.getContext() instanceof Activity ? !((Activity) this.x.getContext()).isChangingConfigurations() : true;
        }
        if (zL6) {
            Iterator<BackStackState> it = this.l.values().iterator();
            while (it.hasNext()) {
                Iterator<String> it2 = it.next().a.iterator();
                while (it2.hasNext()) {
                    this.c.p().E6(it2.next(), false);
                }
            }
        }
    }

    static int x1(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 == 8194) {
            return 4097;
        }
        if (i2 == 8197) {
            return 4100;
        }
        if (i2 != 4099) {
            return i2 != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    private s y0(Fragment fragment) {
        return this.R.H6(fragment);
    }

    public Fragment A0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentM0 = m0(string);
        if (fragmentM0 == null) {
            J1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragmentM0;
    }

    void A1() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.x.getHandler().removeCallbacks(this.T);
                    this.x.getHandler().post(this.T);
                    L1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    Set<SpecialEffectsController> B(ArrayList<androidx.fragment.app.a> arrayList, int i2, int i3) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i2 < i3) {
            Iterator<v.a> it = arrayList.get(i2).c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(SpecialEffectsController.u(viewGroup, this));
                }
            }
            i2++;
        }
        return hashSet;
    }

    void B1(Fragment fragment, boolean z) {
        ViewGroup viewGroupB0 = B0(fragment);
        if (viewGroupB0 == null || !(viewGroupB0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupB0).setDrawDisappearingViewsLast(!z);
    }

    t C(Fragment fragment) {
        t tVarN = this.c.n(fragment.mWho);
        if (tVarN != null) {
            return tVarN;
        }
        t tVar = new t(this.p, this.c, fragment);
        tVar.o(this.x.getContext().getClassLoader());
        tVar.t(this.w);
        return tVar;
    }

    public androidx.fragment.app.n C0() {
        androidx.fragment.app.n nVar = this.B;
        if (nVar != null) {
            return nVar;
        }
        Fragment fragment = this.z;
        return fragment != null ? fragment.mFragmentManager.C0() : this.C;
    }

    public final void C1(String str, Bundle bundle) {
        m mVar = this.n.get(str);
        if (mVar == null || !mVar.b(Lifecycle.State.STARTED)) {
            this.m.put(str, bundle);
        } else {
            mVar.a(str, bundle);
        }
        if (R0(2)) {
            Objects.toString(bundle);
        }
    }

    void D(Fragment fragment) {
        if (R0(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (R0(2)) {
                fragment.toString();
            }
            this.c.u(fragment);
            if (S0(fragment)) {
                this.J = true;
            }
            G1(fragment);
        }
    }

    public List<Fragment> D0() {
        return this.c.o();
    }

    public final void D1(String str, n17 n17Var, up4 up4Var) {
        Lifecycle lifecycle = n17Var.getLifecycleRegistry();
        if (lifecycle.getState() == Lifecycle.State.DESTROYED) {
            return;
        }
        g gVar = new g(str, up4Var, lifecycle);
        m mVarPut = this.n.put(str, new m(lifecycle, up4Var, gVar));
        if (mVarPut != null) {
            mVarPut.c();
        }
        if (R0(2)) {
            lifecycle.toString();
            Objects.toString(up4Var);
        }
        lifecycle.c(gVar);
    }

    void E() {
        this.K = false;
        this.L = false;
        this.R.N6(false);
        Z(4);
    }

    public androidx.fragment.app.o<?> E0() {
        return this.x;
    }

    void E1(Fragment fragment, Lifecycle.State state) {
        if (fragment.equals(m0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void F() {
        this.K = false;
        this.L = false;
        this.R.N6(false);
        Z(0);
    }

    LayoutInflater.Factory2 F0() {
        return this.f;
    }

    void F1(Fragment fragment) {
        if (fragment == null || (fragment.equals(m0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.A;
            this.A = fragment;
            S(fragment2);
            S(this.A);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void G(Configuration configuration, boolean z) {
        if (z && (this.x instanceof oq8)) {
            J1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.G(configuration, true);
                }
            }
        }
    }

    androidx.fragment.app.q G0() {
        return this.p;
    }

    boolean H(MenuItem menuItem) {
        if (this.w < 1) {
            return false;
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    Fragment H0() {
        return this.z;
    }

    void H1(Fragment fragment) {
        if (R0(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    void I() {
        this.K = false;
        this.L = false;
        this.R.N6(false);
        Z(1);
    }

    public Fragment I0() {
        return this.A;
    }

    boolean J(Menu menu, MenuInflater menuInflater) {
        if (this.w < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.c.o()) {
            if (fragment != null && V0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.e != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                Fragment fragment2 = this.e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    d0 J0() {
        d0 d0Var = this.D;
        if (d0Var != null) {
            return d0Var;
        }
        Fragment fragment = this.z;
        return fragment != null ? fragment.mFragmentManager.J0() : this.E;
    }

    void K() {
        this.M = true;
        h0(true);
        e0();
        x();
        Z(-1);
        Object obj = this.x;
        if (obj instanceof xr8) {
            ((xr8) obj).removeOnTrimMemoryListener(this.s);
        }
        Object obj2 = this.x;
        if (obj2 instanceof oq8) {
            ((oq8) obj2).removeOnConfigurationChangedListener(this.r);
        }
        Object obj3 = this.x;
        if (obj3 instanceof er8) {
            ((er8) obj3).removeOnMultiWindowModeChangedListener(this.t);
        }
        Object obj4 = this.x;
        if (obj4 instanceof gr8) {
            ((gr8) obj4).removeOnPictureInPictureModeChangedListener(this.u);
        }
        Object obj5 = this.x;
        if ((obj5 instanceof fq7) && this.z == null) {
            ((fq7) obj5).removeMenuProvider(this.v);
        }
        this.x = null;
        this.y = null;
        this.z = null;
        if (this.g != null) {
            this.j.remove();
            this.g = null;
        }
        l9<Intent> l9Var = this.F;
        if (l9Var != null) {
            l9Var.c();
            this.G.c();
            this.H.c();
        }
    }

    public FragmentStrictMode.b K0() {
        return this.S;
    }

    public void K1(l lVar) {
        this.p.p(lVar);
    }

    void L() {
        Z(1);
    }

    void M(boolean z) {
        if (z && (this.x instanceof xr8)) {
            J1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.M(true);
                }
            }
        }
    }

    k9e M0(Fragment fragment) {
        return this.R.K6(fragment);
    }

    void N(boolean z, boolean z2) {
        if (z2 && (this.x instanceof er8)) {
            J1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.N(z, true);
                }
            }
        }
    }

    void N0() {
        this.i = true;
        h0(true);
        this.i = false;
        if (!V || this.h == null) {
            if (this.j.getIsEnabled()) {
                R0(3);
                j1();
                return;
            } else {
                R0(3);
                this.g.l();
                return;
            }
        }
        if (!this.o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(v0(this.h));
            for (n nVar : this.o) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    nVar.c((Fragment) it.next(), true);
                }
            }
        }
        Iterator<v.a> it2 = this.h.c.iterator();
        while (it2.hasNext()) {
            Fragment fragment = it2.next().b;
            if (fragment != null) {
                fragment.mTransitioning = false;
            }
        }
        Iterator<SpecialEffectsController> it3 = B(new ArrayList<>(Collections.singletonList(this.h)), 0, 1).iterator();
        while (it3.hasNext()) {
            it3.next().f();
        }
        Iterator<v.a> it4 = this.h.c.iterator();
        while (it4.hasNext()) {
            Fragment fragment2 = it4.next().b;
            if (fragment2 != null && fragment2.mContainer == null) {
                C(fragment2).m();
            }
        }
        this.h = null;
        L1();
        if (R0(3)) {
            this.j.getIsEnabled();
            toString();
        }
    }

    void O(Fragment fragment) {
        Iterator<pp4> it = this.q.iterator();
        while (it.hasNext()) {
            it.next().a(this, fragment);
        }
    }

    void O0(Fragment fragment) {
        if (R0(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        G1(fragment);
    }

    void P() {
        for (Fragment fragment : this.c.l()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.P();
            }
        }
    }

    void P0(Fragment fragment) {
        if (fragment.mAdded && S0(fragment)) {
            this.J = true;
        }
    }

    boolean Q(MenuItem menuItem) {
        if (this.w < 1) {
            return false;
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean Q0() {
        return this.M;
    }

    void R(Menu menu) {
        if (this.w < 1) {
            return;
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    void T() {
        Z(5);
    }

    void U(boolean z, boolean z2) {
        if (z2 && (this.x instanceof gr8)) {
            J1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.U(z, true);
                }
            }
        }
    }

    boolean U0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    boolean V(Menu menu) {
        boolean z = false;
        if (this.w < 1) {
            return false;
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null && V0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    boolean V0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    void W() {
        L1();
        S(this.A);
    }

    boolean W0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.I0()) && W0(fragmentManager.z);
    }

    void X() {
        this.K = false;
        this.L = false;
        this.R.N6(false);
        Z(7);
    }

    boolean X0(int i2) {
        return this.w >= i2;
    }

    void Y() {
        this.K = false;
        this.L = false;
        this.R.N6(false);
        Z(5);
    }

    public boolean Y0() {
        return this.K || this.L;
    }

    void Z0(Fragment fragment, String[] strArr, int i2) {
        if (this.H == null) {
            this.x.l(fragment, strArr, i2);
            return;
        }
        this.I.addLast(new LaunchedFragmentInfo(fragment.mWho, i2));
        this.H.a(strArr);
    }

    void a0() {
        this.L = true;
        this.R.N6(true);
        Z(4);
    }

    void a1(Fragment fragment, Intent intent, int i2, Bundle bundle) {
        if (this.F == null) {
            this.x.n(fragment, intent, i2, bundle);
            return;
        }
        this.I.addLast(new LaunchedFragmentInfo(fragment.mWho, i2));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.F.a(intent);
    }

    void b0() {
        Z(2);
    }

    void b1(Fragment fragment, IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.G == null) {
            this.x.o(fragment, intentSender, i2, intent, i3, i4, i5, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (R0(2)) {
                bundle.toString();
                intent.toString();
                Objects.toString(fragment);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        IntentSenderRequest intentSenderRequestA = new IntentSenderRequest.a(intentSender).b(intent).c(i4, i3).a();
        this.I.addLast(new LaunchedFragmentInfo(fragment.mWho, i2));
        if (R0(2)) {
            fragment.toString();
        }
        this.G.a(intentSenderRequestA);
    }

    void c1(int i2, boolean z) {
        androidx.fragment.app.o<?> oVar;
        if (this.x == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.w) {
            this.w = i2;
            this.c.t();
            I1();
            if (this.J && (oVar = this.x) != null && this.w == 7) {
                oVar.p();
                this.J = false;
            }
        }
    }

    public void d0(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2 = str + "    ";
        this.c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        int size2 = this.d.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size2; i3++) {
                androidx.fragment.app.a aVar = this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.E(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.k.get());
        synchronized (this.a) {
            try {
                int size3 = this.a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size3; i4++) {
                        o oVar = this.a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(oVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.y);
        if (this.z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.K);
        printWriter.print(" mStopped=");
        printWriter.print(this.L);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.M);
        if (this.J) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.J);
        }
    }

    void d1() {
        if (this.x == null) {
            return;
        }
        this.K = false;
        this.L = false;
        this.R.N6(false);
        for (Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final void e1(FragmentContainerView fragmentContainerView) {
        View view;
        for (t tVar : this.c.k()) {
            Fragment fragmentK = tVar.k();
            if (fragmentK.mContainerId == fragmentContainerView.getId() && (view = fragmentK.mView) != null && view.getParent() == null) {
                fragmentK.mContainer = fragmentContainerView;
                tVar.b();
                tVar.m();
            }
        }
    }

    void f0(o oVar, boolean z) {
        if (!z) {
            if (this.x == null) {
                if (!this.M) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            v();
        }
        synchronized (this.a) {
            try {
                if (this.x == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(oVar);
                    A1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void f1(t tVar) {
        Fragment fragmentK = tVar.k();
        if (fragmentK.mDeferStart) {
            if (this.b) {
                this.N = true;
            } else {
                fragmentK.mDeferStart = false;
                tVar.m();
            }
        }
    }

    public void g1() {
        f0(new p(null, -1, 0), false);
    }

    boolean h0(boolean z) {
        androidx.fragment.app.a aVar;
        g0(z);
        boolean z2 = false;
        if (!this.i && (aVar = this.h) != null) {
            aVar.u = false;
            aVar.C();
            if (R0(3)) {
                Objects.toString(this.h);
                Objects.toString(this.a);
            }
            this.h.D(false, false);
            this.a.add(0, this.h);
            Iterator<v.a> it = this.h.c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.h = null;
        }
        while (w0(this.O, this.P)) {
            z2 = true;
            this.b = true;
            try {
                t1(this.O, this.P);
                w();
            } catch (Throwable th) {
                w();
                throw th;
            }
        }
        L1();
        c0();
        this.c.b();
        return z2;
    }

    void h1(int i2, int i3, boolean z) {
        if (i2 >= 0) {
            f0(new p(null, i2, i3), z);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    void i0(o oVar, boolean z) {
        if (z && (this.x == null || this.M)) {
            return;
        }
        g0(z);
        androidx.fragment.app.a aVar = this.h;
        boolean z2 = false;
        if (aVar != null) {
            aVar.u = false;
            aVar.C();
            if (R0(3)) {
                Objects.toString(this.h);
                Objects.toString(oVar);
            }
            this.h.D(false, false);
            boolean zA = this.h.a(this.O, this.P);
            Iterator<v.a> it = this.h.c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.h = null;
            z2 = zA;
        }
        boolean zA2 = oVar.a(this.O, this.P);
        if (z2 || zA2) {
            this.b = true;
            try {
                t1(this.O, this.P);
                w();
            } catch (Throwable th) {
                w();
                throw th;
            }
        }
        L1();
        c0();
        this.c.b();
    }

    public void i1(String str, int i2) {
        f0(new p(str, -1, i2), false);
    }

    public boolean j1() {
        return l1(null, -1, 0);
    }

    void k(androidx.fragment.app.a aVar) {
        this.d.add(aVar);
    }

    public boolean k1(int i2, int i3) {
        if (i2 >= 0) {
            return l1(null, i2, i3);
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    t l(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            FragmentStrictMode.f(fragment, str);
        }
        if (R0(2)) {
            fragment.toString();
        }
        t tVarC = C(fragment);
        fragment.mFragmentManager = this;
        this.c.r(tVarC);
        if (!fragment.mDetached) {
            this.c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (S0(fragment)) {
                this.J = true;
            }
        }
        return tVarC;
    }

    public boolean l0() {
        boolean zH0 = h0(true);
        u0();
        return zH0;
    }

    public void m(pp4 pp4Var) {
        this.q.add(pp4Var);
    }

    Fragment m0(String str) {
        return this.c.f(str);
    }

    boolean m1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int iN0 = n0(str, i2, (i3 & 1) != 0);
        if (iN0 < 0) {
            return false;
        }
        for (int size = this.d.size() - 1; size >= iN0; size--) {
            arrayList.add(this.d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public void n(n nVar) {
        this.o.add(nVar);
    }

    boolean n1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (R0(2)) {
            Objects.toString(this.a);
        }
        if (this.d.isEmpty()) {
            return false;
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.d;
        androidx.fragment.app.a aVar = arrayList3.get(arrayList3.size() - 1);
        this.h = aVar;
        Iterator<v.a> it = aVar.c.iterator();
        while (it.hasNext()) {
            Fragment fragment = it.next().b;
            if (fragment != null) {
                fragment.mTransitioning = true;
            }
        }
        return m1(arrayList, arrayList2, null, -1, 0);
    }

    void o(Fragment fragment) {
        this.R.C6(fragment);
    }

    void o1() {
        f0(new q(), false);
    }

    int p() {
        return this.k.getAndIncrement();
    }

    public Fragment p0(int i2) {
        return this.c.g(i2);
    }

    public void p1(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            J1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void q(androidx.fragment.app.o<?> oVar, ap4 ap4Var, Fragment fragment) {
        String str;
        n17 n17Var;
        if (this.x != null) {
            throw new IllegalStateException("Already attached");
        }
        this.x = oVar;
        this.y = ap4Var;
        this.z = fragment;
        if (fragment != null) {
            m(new h(fragment));
        } else if (oVar instanceof pp4) {
            m((pp4) oVar);
        }
        if (this.z != null) {
            L1();
        }
        if (oVar instanceof lq8) {
            lq8 lq8Var = (lq8) oVar;
            jq8 onBackPressedDispatcher = lq8Var.getOnBackPressedDispatcher();
            this.g = onBackPressedDispatcher;
            if (fragment != null) {
                n17Var = lq8Var;
                n17Var = fragment;
            }
            n17Var = lq8Var;
            onBackPressedDispatcher.f(n17Var, this.j);
        }
        if (fragment != null) {
            this.R = fragment.mFragmentManager.y0(fragment);
        } else if (oVar instanceof u9e) {
            this.R = s.I6(((u9e) oVar).getViewModelStore());
        } else {
            this.R = new s(false);
        }
        this.R.N6(Y0());
        this.c.A(this.R);
        e0b e0bVar = this.x;
        if ((e0bVar instanceof e0b) && fragment == null) {
            zza savedStateRegistry = e0bVar.getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new zza.b() { // from class: com.google.android.lp4
                public final Bundle b() {
                    return this.a.y1();
                }
            });
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                w1(bundleA);
            }
        }
        Object obj = this.x;
        if (obj instanceof u9) {
            p9 activityResultRegistry = ((u9) obj).getActivityResultRegistry();
            if (fragment != null) {
                str = fragment.mWho + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.F = activityResultRegistry.n(str2 + "StartActivityForResult", new i9(), new i());
            this.G = activityResultRegistry.n(str2 + "StartIntentSenderForResult", new k(), new j());
            this.H = activityResultRegistry.n(str2 + "RequestPermissions", new g9(), new a());
        }
        Object obj2 = this.x;
        if (obj2 instanceof oq8) {
            ((oq8) obj2).addOnConfigurationChangedListener(this.r);
        }
        Object obj3 = this.x;
        if (obj3 instanceof xr8) {
            ((xr8) obj3).addOnTrimMemoryListener(this.s);
        }
        Object obj4 = this.x;
        if (obj4 instanceof er8) {
            ((er8) obj4).addOnMultiWindowModeChangedListener(this.t);
        }
        Object obj5 = this.x;
        if (obj5 instanceof gr8) {
            ((gr8) obj5).addOnPictureInPictureModeChangedListener(this.u);
        }
        Object obj6 = this.x;
        if ((obj6 instanceof fq7) && fragment == null) {
            ((fq7) obj6).addMenuProvider(this.v);
        }
    }

    public Fragment q0(String str) {
        return this.c.h(str);
    }

    public void q1(l lVar, boolean z) {
        this.p.o(lVar, z);
    }

    void r(Fragment fragment) {
        if (R0(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.c.a(fragment);
            if (R0(2)) {
                fragment.toString();
            }
            if (S0(fragment)) {
                this.J = true;
            }
        }
    }

    Fragment r0(String str) {
        return this.c.i(str);
    }

    void r1(Fragment fragment) {
        if (R0(2)) {
            Objects.toString(fragment);
            int i2 = fragment.mBackStackNesting;
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        this.c.u(fragment);
        if (S0(fragment)) {
            this.J = true;
        }
        fragment.mRemoving = true;
        G1(fragment);
    }

    public v s() {
        return new androidx.fragment.app.a(this);
    }

    public void s1(n nVar) {
        this.o.remove(nVar);
    }

    void t() {
        if (R0(3)) {
            Objects.toString(this.h);
        }
        androidx.fragment.app.a aVar = this.h;
        if (aVar != null) {
            aVar.u = false;
            aVar.C();
            this.h.u(true, new Runnable() { // from class: com.google.android.mp4
                @Override // java.lang.Runnable
                public final void run() {
                    FragmentManager.c(this.a);
                }
            });
            this.h.i();
            this.i = true;
            l0();
            this.i = false;
            this.h = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.z;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.z)));
            sb.append("}");
        } else {
            androidx.fragment.app.o<?> oVar = this.x;
            if (oVar != null) {
                sb.append(oVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.x)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    boolean u() {
        boolean zS0 = false;
        for (Fragment fragment : this.c.l()) {
            if (fragment != null) {
                zS0 = S0(fragment);
            }
            if (zS0) {
                return true;
            }
        }
        return false;
    }

    void u1(Fragment fragment) {
        this.R.M6(fragment);
    }

    Set<Fragment> v0(androidx.fragment.app.a aVar) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < aVar.c.size(); i2++) {
            Fragment fragment = aVar.c.get(i2).b;
            if (fragment != null && aVar.i) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    void w1(Parcelable parcelable) {
        t tVar;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.x.getContext().getClassLoader());
                this.m.put(str.substring(7), bundle2);
            }
        }
        HashMap<String, Bundle> map = new HashMap<>();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.x.getContext().getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        this.c.x(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        this.c.v();
        Iterator<String> it = fragmentManagerState.a.iterator();
        while (it.hasNext()) {
            Bundle bundleB = this.c.B(it.next(), null);
            if (bundleB != null) {
                Fragment fragmentG6 = this.R.G6(((FragmentState) bundleB.getParcelable("state")).b);
                if (fragmentG6 != null) {
                    if (R0(2)) {
                        fragmentG6.toString();
                    }
                    tVar = new t(this.p, this.c, fragmentG6, bundleB);
                } else {
                    tVar = new t(this.p, this.c, this.x.getContext().getClassLoader(), C0(), bundleB);
                }
                Fragment fragmentK = tVar.k();
                fragmentK.mSavedFragmentState = bundleB;
                fragmentK.mFragmentManager = this;
                if (R0(2)) {
                    fragmentK.toString();
                }
                tVar.o(this.x.getContext().getClassLoader());
                this.c.r(tVar);
                tVar.t(this.w);
            }
        }
        for (Fragment fragment : this.R.J6()) {
            if (!this.c.c(fragment.mWho)) {
                if (R0(2)) {
                    fragment.toString();
                    Objects.toString(fragmentManagerState.a);
                }
                this.R.M6(fragment);
                fragment.mFragmentManager = this;
                t tVar2 = new t(this.p, this.c, fragment);
                tVar2.t(1);
                tVar2.m();
                fragment.mRemoving = true;
                tVar2.m();
            }
        }
        this.c.w(fragmentManagerState.b);
        if (fragmentManagerState.c != null) {
            this.d = new ArrayList<>(fragmentManagerState.c.length);
            int i2 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.c;
                if (i2 >= backStackRecordStateArr.length) {
                    break;
                }
                androidx.fragment.app.a aVarB = backStackRecordStateArr[i2].b(this);
                if (R0(2)) {
                    int i3 = aVarB.v;
                    aVarB.toString();
                    PrintWriter printWriter = new PrintWriter(new a0("FragmentManager"));
                    aVarB.F("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(aVarB);
                i2++;
            }
        } else {
            this.d = new ArrayList<>();
        }
        this.k.set(fragmentManagerState.d);
        String str3 = fragmentManagerState.e;
        if (str3 != null) {
            Fragment fragmentM0 = m0(str3);
            this.A = fragmentM0;
            S(fragmentM0);
        }
        ArrayList<String> arrayList = fragmentManagerState.f;
        if (arrayList != null) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                this.l.put(arrayList.get(i4), fragmentManagerState.g.get(i4));
            }
        }
        this.I = new ArrayDeque<>(fragmentManagerState.h);
    }

    public int x0() {
        return this.d.size() + (this.h != null ? 1 : 0);
    }

    public final void y(String str) {
        this.m.remove(str);
        R0(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bundle y1() {
        BackStackRecordState[] backStackRecordStateArr;
        Bundle bundle = new Bundle();
        u0();
        e0();
        h0(true);
        this.K = true;
        this.R.N6(true);
        ArrayList<String> arrayListY = this.c.y();
        HashMap<String, Bundle> mapM = this.c.m();
        if (mapM.isEmpty()) {
            R0(2);
            return bundle;
        }
        ArrayList<String> arrayListZ = this.c.z();
        int size = this.d.size();
        if (size > 0) {
            backStackRecordStateArr = new BackStackRecordState[size];
            for (int i2 = 0; i2 < size; i2++) {
                backStackRecordStateArr[i2] = new BackStackRecordState(this.d.get(i2));
                if (R0(2)) {
                    Objects.toString(this.d.get(i2));
                }
            }
        } else {
            backStackRecordStateArr = null;
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.a = arrayListY;
        fragmentManagerState.b = arrayListZ;
        fragmentManagerState.c = backStackRecordStateArr;
        fragmentManagerState.d = this.k.get();
        Fragment fragment = this.A;
        if (fragment != null) {
            fragmentManagerState.e = fragment.mWho;
        }
        fragmentManagerState.f.addAll(this.l.keySet());
        fragmentManagerState.g.addAll(this.l.values());
        fragmentManagerState.h = new ArrayList<>(this.I);
        bundle.putParcelable("state", fragmentManagerState);
        for (String str : this.m.keySet()) {
            bundle.putBundle("result_" + str, this.m.get(str));
        }
        for (String str2 : mapM.keySet()) {
            bundle.putBundle("fragment_" + str2, mapM.get(str2));
        }
        return bundle;
    }

    public final void z(String str) {
        m mVarRemove = this.n.remove(str);
        if (mVarRemove != null) {
            mVarRemove.c();
        }
        R0(2);
    }

    ap4 z0() {
        return this.y;
    }

    public Fragment.SavedState z1(Fragment fragment) {
        t tVarN = this.c.n(fragment.mWho);
        if (tVarN == null || !tVarN.k().equals(fragment)) {
            J1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return tVarN.q();
    }

    static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();
        String a;
        int b;

        class a implements Parcelable.Creator<LaunchedFragmentInfo> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo[] newArray(int i) {
                return new LaunchedFragmentInfo[i];
            }
        }

        LaunchedFragmentInfo(String str, int i) {
            this.a = str;
            this.b = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeInt(this.b);
        }

        LaunchedFragmentInfo(Parcel parcel) {
            this.a = parcel.readString();
            this.b = parcel.readInt();
        }
    }
}
