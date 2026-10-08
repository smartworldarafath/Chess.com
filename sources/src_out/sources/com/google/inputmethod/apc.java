package com.google.inputmethod;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.ui.platform.actionmodecallback.MenuItemOption;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0001\u0018\u00002\u00020\u0001B}\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001a\u0010\u0019J!\u0010\u001c\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\"\u0010#R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010$\u001a\u0004\b,\u0010&\"\u0004\b-\u0010.R*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010$\u001a\u0004\b/\u0010&\"\u0004\b0\u0010.R*\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010$\u001a\u0004\b1\u0010&\"\u0004\b2\u0010.R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010$\u001a\u0004\b3\u0010&\"\u0004\b4\u0010.R*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010$\u001a\u0004\b5\u0010&\"\u0004\b6\u0010.¨\u00067"}, d2 = {"Lcom/google/android/apc;", "", "Lkotlin/Function0;", "", "onActionModeDestroy", "Lcom/google/android/gba;", "rect", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "onAutofillRequested", "<init>", "(Lkotlin/jvm/functions/Function0;Lcom/google/android/gba;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/Menu;", "menu", "Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;", "item", "callback", "b", "(Landroid/view/Menu;Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/ActionMode;", "mode", "", "e", "(Landroid/view/ActionMode;Landroid/view/Menu;)Z", "g", "Landroid/view/MenuItem;", "d", "(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z", "f", "()V", "n", "(Landroid/view/Menu;)V", "a", "(Landroid/view/Menu;Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;)V", "Lkotlin/jvm/functions/Function0;", "getOnActionModeDestroy", "()Lkotlin/jvm/functions/Function0;", "Lcom/google/android/gba;", "c", "()Lcom/google/android/gba;", "m", "(Lcom/google/android/gba;)V", "getOnCopyRequested", "i", "(Lkotlin/jvm/functions/Function0;)V", "getOnPasteRequested", "k", "getOnCutRequested", "j", "getOnSelectAllRequested", "l", "getOnAutofillRequested", "h", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class apc {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function0<Unit> onActionModeDestroy;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private gba rect;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Function0<Unit> onCopyRequested;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Function0<Unit> onPasteRequested;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Function0<Unit> onCutRequested;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Function0<Unit> onSelectAllRequested;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Function0<Unit> onAutofillRequested;

    public apc(Function0<Unit> function0, gba gbaVar, Function0<Unit> function1, Function0<Unit> function2, Function0<Unit> function3, Function0<Unit> function4, Function0<Unit> function5) {
        this.onActionModeDestroy = function0;
        this.rect = gbaVar;
        this.onCopyRequested = function1;
        this.onPasteRequested = function2;
        this.onCutRequested = function3;
        this.onSelectAllRequested = function4;
        this.onAutofillRequested = function5;
    }

    private final void b(Menu menu, MenuItemOption item, Function0<Unit> callback) {
        if (callback != null && menu.findItem(item.getId()) == null) {
            a(menu, item);
        } else {
            if (callback != null || menu.findItem(item.getId()) == null) {
                return;
            }
            menu.removeItem(item.getId());
        }
    }

    public final void a(Menu menu, MenuItemOption item) {
        menu.add(0, item.getId(), item.getOrder(), item.e()).setShowAsAction(1);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final gba getRect() {
        return this.rect;
    }

    public final boolean d(ActionMode mode, MenuItem item) {
        Intrinsics.g(item);
        int itemId = item.getItemId();
        if (itemId == MenuItemOption.Copy.getId()) {
            Function0<Unit> function0 = this.onCopyRequested;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (itemId == MenuItemOption.Paste.getId()) {
            Function0<Unit> function1 = this.onPasteRequested;
            if (function1 != null) {
                function1.invoke();
            }
        } else if (itemId == MenuItemOption.Cut.getId()) {
            Function0<Unit> function2 = this.onCutRequested;
            if (function2 != null) {
                function2.invoke();
            }
        } else if (itemId == MenuItemOption.SelectAll.getId()) {
            Function0<Unit> function3 = this.onSelectAllRequested;
            if (function3 != null) {
                function3.invoke();
            }
        } else {
            if (itemId != MenuItemOption.Autofill.getId()) {
                return false;
            }
            Function0<Unit> function4 = this.onAutofillRequested;
            if (function4 != null) {
                function4.invoke();
            }
        }
        if (mode == null) {
            return true;
        }
        mode.finish();
        return true;
    }

    public final boolean e(ActionMode mode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (mode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (this.onCopyRequested != null) {
            a(menu, MenuItemOption.Copy);
        }
        if (this.onPasteRequested != null) {
            a(menu, MenuItemOption.Paste);
        }
        if (this.onCutRequested != null) {
            a(menu, MenuItemOption.Cut);
        }
        if (this.onSelectAllRequested != null) {
            a(menu, MenuItemOption.SelectAll);
        }
        if (this.onAutofillRequested == null) {
            return true;
        }
        a(menu, MenuItemOption.Autofill);
        return true;
    }

    public final void f() {
        Function0<Unit> function0 = this.onActionModeDestroy;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final boolean g(ActionMode mode, Menu menu) {
        if (mode == null || menu == null) {
            return false;
        }
        n(menu);
        return true;
    }

    public final void h(Function0<Unit> function0) {
        this.onAutofillRequested = function0;
    }

    public final void i(Function0<Unit> function0) {
        this.onCopyRequested = function0;
    }

    public final void j(Function0<Unit> function0) {
        this.onCutRequested = function0;
    }

    public final void k(Function0<Unit> function0) {
        this.onPasteRequested = function0;
    }

    public final void l(Function0<Unit> function0) {
        this.onSelectAllRequested = function0;
    }

    public final void m(gba gbaVar) {
        this.rect = gbaVar;
    }

    public final void n(Menu menu) {
        b(menu, MenuItemOption.Copy, this.onCopyRequested);
        b(menu, MenuItemOption.Paste, this.onPasteRequested);
        b(menu, MenuItemOption.Cut, this.onCutRequested);
        b(menu, MenuItemOption.SelectAll, this.onSelectAllRequested);
        b(menu, MenuItemOption.Autofill, this.onAutofillRequested);
    }

    public /* synthetic */ apc(Function0 function0, gba gbaVar, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function0 function5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0, (i & 2) != 0 ? gba.INSTANCE.a() : gbaVar, (i & 4) != 0 ? null : function1, (i & 8) != 0 ? null : function2, (i & 16) != 0 ? null : function3, (i & 32) != 0 ? null : function4, (i & 64) != 0 ? null : function5);
    }
}
