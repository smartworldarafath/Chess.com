package androidx.compose.p001foundation.text.contextmenu.internal;

import android.R;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.textclassifier.TextClassification;
import com.google.inputmethod.yqc;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/internal/s;", "", "<init>", "()V", "Landroid/view/Menu;", "menu", "", "orderId", "Landroid/content/Context;", "context", "Landroid/view/textclassifier/TextClassification;", "textClassification", "index", "", "e", "(Landroid/view/Menu;ILandroid/content/Context;Landroid/view/textclassifier/TextClassification;I)V", "", "isPrimary", "Landroid/app/RemoteAction;", "remoteAction", "f", "(Landroid/view/Menu;ILandroid/content/Context;ZLandroid/app/RemoteAction;)V", "c", "(Landroid/view/Menu;ILandroid/content/Context;Landroid/view/textclassifier/TextClassification;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class s {
    public static final s a = new s();

    private s() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(Context context, TextClassification textClassification, MenuItem menuItem) throws PendingIntent.CanceledException {
        yqc.a.a(context, textClassification);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(RemoteAction remoteAction, MenuItem menuItem) throws PendingIntent.CanceledException {
        yqc.a.b(remoteAction.getActionIntent());
        return true;
    }

    public final void c(Menu menu, int orderId, final Context context, final TextClassification textClassification) {
        MenuItem menuItemAdd = menu.add(R.id.textAssist, R.id.textAssist, orderId, textClassification.getLabel());
        menuItemAdd.setShowAsAction(2);
        menuItemAdd.setIcon(textClassification.getIcon());
        menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: androidx.compose.foundation.text.contextmenu.internal.q
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return s.d(context, textClassification, menuItem);
            }
        });
    }

    public final void e(Menu menu, int orderId, Context context, TextClassification textClassification, int index) {
        if (index < 0) {
            c(menu, orderId, context, textClassification);
        } else {
            f(menu, orderId, context, index == 0, textClassification.getActions().get(index));
        }
    }

    public final void f(Menu menu, int orderId, Context context, boolean isPrimary, final RemoteAction remoteAction) {
        MenuItem menuItemAdd = menu.add(R.id.textAssist, isPrimary ? 16908353 : 0, orderId, remoteAction.getTitle());
        menuItemAdd.setShowAsAction(isPrimary ? 2 : 0);
        if (isPrimary || remoteAction.shouldShowIcon()) {
            menuItemAdd.setIcon(remoteAction.getIcon().loadDrawable(context));
        }
        menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: androidx.compose.foundation.text.contextmenu.internal.r
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return s.g(remoteAction, menuItem);
            }
        });
    }
}
