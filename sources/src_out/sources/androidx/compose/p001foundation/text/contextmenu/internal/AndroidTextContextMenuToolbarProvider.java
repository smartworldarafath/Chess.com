package androidx.compose.p001foundation.text.contextmenu.internal;

import android.R;
import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.p001foundation.MutatorMutex;
import androidx.compose.p001foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider;
import androidx.compose.p004runtime.snapshots.j;
import com.google.android.h81;
import com.google.android.p81;
import com.google.android.q22;
import com.google.inputmethod.TextContextMenuData;
import com.google.inputmethod.TextContextMenuItem;
import com.google.inputmethod.TextContextMenuRemoteActionItem;
import com.google.inputmethod.bpc;
import com.google.inputmethod.erc;
import com.google.inputmethod.gba;
import com.google.inputmethod.grc;
import com.google.inputmethod.irc;
import com.google.inputmethod.kn6;
import com.google.inputmethod.ln6;
import com.google.inputmethod.mrc;
import com.google.inputmethod.qrc;
import com.google.inputmethod.rrc;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0002!'B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017JM\u0010\u001f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0019*\u00020\u0018\"\b\b\u0001\u0010\u001a*\u00020\u00182\u0006\u0010\u001b\u001a\u00028\u00012\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u001c0\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u001c¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u001c¢\u0006\u0004\b%\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010&R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R \u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001c0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010(R \u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001c0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010(R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010@\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010=¨\u0006A"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider;", "Lcom/google/android/mrc;", "Landroid/view/View;", "view", "Lkotlin/Function1;", "Lcom/google/android/bpc;", "callbackInjector", "Lkotlin/Function0;", "Lcom/google/android/kn6;", "coordinatesProvider", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$b;", "session", "Lcom/google/android/grc;", "dataProvider", "t", "(Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$b;Lcom/google/android/grc;)Lcom/google/android/bpc;", "Lcom/google/android/frc;", "z", "(Lcom/google/android/grc;)Lcom/google/android/frc;", "Lcom/google/android/gba;", "x", "(Lcom/google/android/grc;)Lcom/google/android/gba;", "", "T", "S", "scope", "", "onValueChanged", "block", "B", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "a", "(Lcom/google/android/grc;Lcom/google/android/q22;)Ljava/lang/Object;", "H", "()V", "w", "Landroid/view/View;", "b", "Lkotlin/jvm/functions/Function1;", "c", "Lkotlin/jvm/functions/Function0;", "Landroidx/compose/foundation/MutatorMutex;", "d", "Landroidx/compose/foundation/MutatorMutex;", "mutatorMutex", "Landroidx/compose/runtime/snapshots/j;", "e", "Landroidx/compose/runtime/snapshots/j;", "snapshotStateObserver", "f", "onDataChange", "g", "onPositionChange", "Landroid/view/ActionMode;", "h", "Landroid/view/ActionMode;", "actionMode", "Ljava/lang/Runnable;", "i", "Ljava/lang/Runnable;", "startActionModeRunnable", "j", "finishActionModeRunnable", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidTextContextMenuToolbarProvider implements mrc {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function1<bpc, bpc> callbackInjector;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Function0<kn6> coordinatesProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final MutatorMutex mutatorMutex = new MutatorMutex();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final j snapshotStateObserver = new j(new Function1() { // from class: com.google.android.xn
        public final Object invoke(Object obj) {
            return AndroidTextContextMenuToolbarProvider.F(this.a, (Function0) obj);
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Function1<Object, Unit> onDataChange = new Function1() { // from class: com.google.android.yn
        public final Object invoke(Object obj) {
            return AndroidTextContextMenuToolbarProvider.D(this.a, obj);
        }
    };

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Function1<Object, Unit> onPositionChange = new Function1() { // from class: com.google.android.zn
        public final Object invoke(Object obj) {
            return AndroidTextContextMenuToolbarProvider.E(this.a, obj);
        }
    };

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private ActionMode actionMode;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private Runnable startActionModeRunnable;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private Runnable finishActionModeRunnable;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$a;", "Lcom/google/android/bpc;", "Lcom/google/android/rrc;", "session", "Lkotlin/Function0;", "Lcom/google/android/frc;", "dataBuilder", "Lcom/google/android/gba;", "positioner", "Landroid/view/View;", "view", "<init>", "(Lcom/google/android/rrc;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroid/view/View;)V", "Landroid/view/Menu;", "menu", "", "c", "(Landroid/view/Menu;)Z", "Landroid/view/ActionMode;", "mode", "a", "(Landroid/view/ActionMode;Landroid/view/View;)Lcom/google/android/gba;", "onCreateActionMode", "(Landroid/view/ActionMode;Landroid/view/Menu;)Z", "onPrepareActionMode", "Landroid/view/MenuItem;", "item", "onActionItemClicked", "(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z", "", "onDestroyActionMode", "(Landroid/view/ActionMode;)V", "Lcom/google/android/rrc;", "b", "Lkotlin/jvm/functions/Function0;", "d", "Landroid/view/View;", "e", "Lcom/google/android/frc;", "previousData", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class a implements bpc {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final rrc session;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Function0<TextContextMenuData> dataBuilder;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private Function0<gba> positioner;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final View view;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private TextContextMenuData previousData;

        public a(rrc rrcVar, Function0<TextContextMenuData> function0, Function0<gba> function1, View view) {
            this.session = rrcVar;
            this.dataBuilder = function0;
            this.positioner = function1;
            this.view = view;
        }

        private final boolean c(Menu menu) {
            int i;
            TextContextMenuData textContextMenuData = (TextContextMenuData) this.dataBuilder.invoke();
            if (Intrinsics.e(textContextMenuData, this.previousData)) {
                return false;
            }
            menu.clear();
            List<erc> listB = textContextMenuData.b();
            int size = listB.size();
            int i2 = 1;
            int i3 = 1;
            for (int i4 = 0; i4 < size; i4++) {
                final erc ercVar = listB.get(i4);
                if (ercVar instanceof TextContextMenuItem) {
                    int i5 = i2 + 1;
                    Object key = ercVar.getKey();
                    irc ircVar = irc.a;
                    if (Intrinsics.e(key, ircVar.c())) {
                        i = R.id.cut;
                    } else if (Intrinsics.e(key, ircVar.b())) {
                        i = R.id.copy;
                    } else if (Intrinsics.e(key, ircVar.d())) {
                        i = R.id.paste;
                    } else if (Intrinsics.e(key, ircVar.e())) {
                        i = R.id.selectAll;
                    } else {
                        i = Intrinsics.e(key, ircVar.a()) ? R.id.autofill : i2;
                    }
                    MenuItem menuItemAdd = menu.add(i3, i, i2, ((TextContextMenuItem) ercVar).getLabel());
                    menuItemAdd.setShowAsAction(2);
                    menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: androidx.compose.foundation.text.contextmenu.internal.a
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            return AndroidTextContextMenuToolbarProvider.a.d(ercVar, this, menuItem);
                        }
                    });
                    i2 = i5;
                } else if (ercVar instanceof TextContextMenuRemoteActionItem) {
                    TextContextMenuRemoteActionItem textContextMenuRemoteActionItem = (TextContextMenuRemoteActionItem) ercVar;
                    s.a.e(menu, i2, this.view.getContext(), textContextMenuRemoteActionItem.getTextClassification(), textContextMenuRemoteActionItem.getIndex());
                    i2++;
                } else if (ercVar instanceof qrc) {
                    i3++;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean d(erc ercVar, a aVar, MenuItem menuItem) {
            ((TextContextMenuItem) ercVar).d().invoke(aVar.session);
            return true;
        }

        @Override // com.google.inputmethod.bpc
        public gba a(ActionMode mode, View view) {
            return (gba) this.positioner.invoke();
        }

        @Override // com.google.inputmethod.bpc
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            return false;
        }

        @Override // com.google.inputmethod.bpc
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            c(menu);
            return menu.size() > 0;
        }

        @Override // com.google.inputmethod.bpc
        public void onDestroyActionMode(ActionMode mode) {
            this.session.close();
        }

        @Override // com.google.inputmethod.bpc
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return c(menu);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider$b;", "Lcom/google/android/rrc;", "<init>", "()V", "", "close", "a", "(Lcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/h81;", "Lcom/google/android/h81;", "channel", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class b implements rrc {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final h81<Unit> channel = p81.b(0, (BufferOverflow) null, (Function1) null, 7, (Object) null);

        public final Object a(q22<? super Unit> q22Var) {
            Object objC = this.channel.c(q22Var);
            return objC == kotlin.coroutines.intrinsics.a.g() ? objC : Unit.a;
        }

        @Override // com.google.inputmethod.rrc
        public void close() {
            this.channel.e(Unit.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidTextContextMenuToolbarProvider(View view, Function1<? super bpc, ? extends bpc> function1, Function0<? extends kn6> function0) {
        this.view = view;
        this.callbackInjector = function1;
        this.coordinatesProvider = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextContextMenuData A(grc grcVar) {
        return grcVar.a0();
    }

    private final <T, S> T B(S scope, Function1<? super S, Unit> onValueChanged, final Function0<? extends T> block) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        this.snapshotStateObserver.k(scope, onValueChanged, new Function0() { // from class: com.google.android.go
            public final Object invoke() {
                return AndroidTextContextMenuToolbarProvider.C(objectRef, block);
            }
        });
        T t = (T) objectRef.element;
        if (t != null) {
            return t;
        }
        Intrinsics.x("result");
        return (T) Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(Ref.ObjectRef objectRef, Function0 function0) {
        objectRef.element = function0.invoke();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, Object obj) {
        ActionMode actionMode = androidTextContextMenuToolbarProvider.actionMode;
        if (actionMode != null) {
            actionMode.invalidate();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, Object obj) {
        ActionMode actionMode = androidTextContextMenuToolbarProvider.actionMode;
        if (actionMode != null) {
            o.a.a(actionMode);
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, final Function0 function0) {
        Handler handler = androidTextContextMenuToolbarProvider.view.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            function0.invoke();
        } else {
            Handler handler2 = androidTextContextMenuToolbarProvider.view.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: com.google.android.co
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidTextContextMenuToolbarProvider.G(function0);
                    }
                });
            }
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bpc t(b session, final grc dataProvider) {
        bpc bpcVar;
        a aVar = new a(session, new Function0() { // from class: com.google.android.ao
            public final Object invoke() {
                return AndroidTextContextMenuToolbarProvider.u(this.a, dataProvider);
            }
        }, new Function0() { // from class: com.google.android.bo
            public final Object invoke() {
                return AndroidTextContextMenuToolbarProvider.v(this.a, dataProvider);
            }
        }, this.view);
        Function1<bpc, bpc> function1 = this.callbackInjector;
        return (function1 == null || (bpcVar = (bpc) function1.invoke(aVar)) == null) ? aVar : bpcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextContextMenuData u(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, grc grcVar) {
        return androidTextContextMenuToolbarProvider.z(grcVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gba v(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, grc grcVar) {
        return androidTextContextMenuToolbarProvider.x(grcVar);
    }

    private final gba x(final grc dataProvider) {
        return (gba) B("positioner", this.onPositionChange, new Function0() { // from class: com.google.android.fo
            public final Object invoke() {
                return AndroidTextContextMenuToolbarProvider.y(this.a, dataProvider);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gba y(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, grc grcVar) {
        Object objInvoke = androidTextContextMenuToolbarProvider.coordinatesProvider.invoke();
        if (!((kn6) objInvoke).b()) {
            objInvoke = null;
        }
        kn6 kn6Var = (kn6) objInvoke;
        return kn6Var == null ? gba.INSTANCE.a() : grcVar.P1(kn6Var).u(ln6.h(kn6Var));
    }

    private final TextContextMenuData z(final grc dataProvider) {
        return (TextContextMenuData) B("dataBuilder", this.onDataChange, new Function0() { // from class: com.google.android.eo
            public final Object invoke() {
                return AndroidTextContextMenuToolbarProvider.A(dataProvider);
            }
        });
    }

    public final void H() {
        this.snapshotStateObserver.q();
    }

    @Override // com.google.inputmethod.mrc
    public Object a(grc grcVar, q22<? super Unit> q22Var) {
        Object objE = MutatorMutex.e(this.mutatorMutex, null, new AndroidTextContextMenuToolbarProvider$showTextContextMenu$2(this, grcVar, null), q22Var, 1, null);
        return objE == kotlin.coroutines.intrinsics.a.g() ? objE : Unit.a;
    }

    public final void w() {
        this.snapshotStateObserver.r();
        this.snapshotStateObserver.f();
        ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.actionMode = null;
    }
}
