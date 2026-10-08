package androidx.compose.p001foundation.text.contextmenu.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ut0;
import com.google.inputmethod.bpc;
import com.google.inputmethod.grc;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@lq2(c = "androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$showTextContextMenu$2", f = "AndroidTextContextMenuToolbarProvider.android.kt", l = {182}, m = "invokeSuspend", v = 1)
final class AndroidTextContextMenuToolbarProvider$showTextContextMenu$2 extends SuspendLambda implements Function1<q22<? super Unit>, Object> {
    final /* synthetic */ grc $dataProvider;
    int label;
    final /* synthetic */ AndroidTextContextMenuToolbarProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidTextContextMenuToolbarProvider$showTextContextMenu$2(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, grc grcVar, q22<? super AndroidTextContextMenuToolbarProvider$showTextContextMenu$2> q22Var) {
        super(1, q22Var);
        this.this$0 = androidTextContextMenuToolbarProvider;
        this.$dataProvider = grcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, bpc bpcVar, AndroidTextContextMenuToolbarProvider.b bVar) {
        ActionMode actionModeB = o.a.b(androidTextContextMenuToolbarProvider.view, bpcVar);
        Intrinsics.e(androidTextContextMenuToolbarProvider.actionMode, actionModeB);
        if (actionModeB == null) {
            bVar.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider) {
        ActionMode actionMode = androidTextContextMenuToolbarProvider.actionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
    }

    public final q22<Unit> create(q22<?> q22Var) {
        return new AndroidTextContextMenuToolbarProvider$showTextContextMenu$2(this.this$0, this.$dataProvider, q22Var);
    }

    public final Object invoke(q22<? super Unit> q22Var) {
        return create(q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                final AndroidTextContextMenuToolbarProvider.b bVar = new AndroidTextContextMenuToolbarProvider.b();
                final bpc bpcVarT = this.this$0.t(bVar, this.$dataProvider);
                Looper looperMyLooper = Looper.myLooper();
                Handler handler = this.this$0.view.getHandler();
                if (looperMyLooper != (handler != null ? handler.getLooper() : null)) {
                    Runnable runnable = this.this$0.startActionModeRunnable;
                    if (runnable == null) {
                        final AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider = this.this$0;
                        Runnable runnable2 = new Runnable() { // from class: androidx.compose.foundation.text.contextmenu.internal.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                AndroidTextContextMenuToolbarProvider$showTextContextMenu$2.m(androidTextContextMenuToolbarProvider, bpcVarT, bVar);
                            }
                        };
                        this.this$0.startActionModeRunnable = runnable2;
                        runnable = runnable2;
                    }
                    ut0.a(this.this$0.view.post(runnable));
                } else {
                    AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider2 = this.this$0;
                    ActionMode actionModeB = o.a.b(androidTextContextMenuToolbarProvider2.view, bpcVarT);
                    if (actionModeB == null) {
                        return Unit.a;
                    }
                    androidTextContextMenuToolbarProvider2.actionMode = actionModeB;
                }
                this.label = 1;
                if (bVar.a(this) == objG) {
                    return objG;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            this.this$0.snapshotStateObserver.f();
            Looper looperMyLooper2 = Looper.myLooper();
            Handler handler2 = this.this$0.view.getHandler();
            if (looperMyLooper2 != (handler2 != null ? handler2.getLooper() : null)) {
                Runnable runnable3 = this.this$0.finishActionModeRunnable;
                if (runnable3 == null) {
                    final AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider3 = this.this$0;
                    Runnable runnable4 = new Runnable() { // from class: androidx.compose.foundation.text.contextmenu.internal.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            AndroidTextContextMenuToolbarProvider$showTextContextMenu$2.o(androidTextContextMenuToolbarProvider3);
                        }
                    };
                    this.this$0.finishActionModeRunnable = runnable4;
                    runnable3 = runnable4;
                }
                ut0.a(this.this$0.view.post(runnable3));
            } else {
                ActionMode actionMode = this.this$0.actionMode;
                if (actionMode != null) {
                    actionMode.finish();
                }
            }
            Runnable runnable5 = this.this$0.startActionModeRunnable;
            if (runnable5 != null) {
                ut0.a(this.this$0.view.removeCallbacks(runnable5));
            }
            this.this$0.actionMode = null;
            return Unit.a;
        } catch (Throwable th) {
            this.this$0.snapshotStateObserver.f();
            Looper looperMyLooper3 = Looper.myLooper();
            Handler handler3 = this.this$0.view.getHandler();
            if (looperMyLooper3 != (handler3 != null ? handler3.getLooper() : null)) {
                Runnable runnable6 = this.this$0.finishActionModeRunnable;
                if (runnable6 == null) {
                    final AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider4 = this.this$0;
                    Runnable runnable7 = new Runnable() { // from class: androidx.compose.foundation.text.contextmenu.internal.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            AndroidTextContextMenuToolbarProvider$showTextContextMenu$2.o(androidTextContextMenuToolbarProvider4);
                        }
                    };
                    this.this$0.finishActionModeRunnable = runnable7;
                    runnable6 = runnable7;
                }
                ut0.a(this.this$0.view.post(runnable6));
            } else {
                ActionMode actionMode2 = this.this$0.actionMode;
                if (actionMode2 != null) {
                    actionMode2.finish();
                }
            }
            Runnable runnable8 = this.this$0.startActionModeRunnable;
            if (runnable8 != null) {
                ut0.a(this.this$0.view.removeCallbacks(runnable8));
            }
            this.this$0.actionMode = null;
            throw th;
        }
    }
}
