package androidx.compose.p001foundation.text.contextmenu.modifier;

import com.google.android.q22;
import com.google.inputmethod.rn8;
import com.google.inputmethod.uy7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012$\u0010\b\u001a \b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R2\u0010\b\u001a \b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/d;", "Lcom/google/android/uy7;", "Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureNode;", "Lkotlin/Function2;", "Lcom/google/android/rn8;", "Lcom/google/android/q22;", "", "", "onPreShowContextMenu", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "d", "()Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureNode;", "node", "e", "(Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureNode;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlin/jvm/functions/Function2;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class d extends uy7<TextContextMenuGestureNode> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function2<rn8, q22<? super Unit>, Object> onPreShowContextMenu;

    /* JADX WARN: Multi-variable type inference failed */
    public d(Function2<? super rn8, ? super q22<? super Unit>, ? extends Object> function2) {
        this.onPreShowContextMenu = function2;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public TextContextMenuGestureNode a() {
        return new TextContextMenuGestureNode(this.onPreShowContextMenu);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(TextContextMenuGestureNode node) {
        node.y3(this.onPreShowContextMenu);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof d) && this.onPreShowContextMenu == ((d) other).onPreShowContextMenu;
    }

    public int hashCode() {
        Function2<rn8, q22<? super Unit>, Object> function2 = this.onPreShowContextMenu;
        if (function2 != null) {
            return function2.hashCode();
        }
        return 0;
    }
}
