package com.google.inputmethod;

import android.view.Menu;
import android.view.MenuItem;
import com.google.android.fh6;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroid/view/Menu;", "", "Landroid/view/MenuItem;", "b", "(Landroid/view/Menu;)Ljava/util/Iterator;", "Lkotlin/sequences/Sequence;", "a", "(Landroid/view/Menu;)Lkotlin/sequences/Sequence;", "children", "core-ktx"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class rq7 {

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/google/android/rq7$a", "Lkotlin/sequences/Sequence;", "Landroid/view/MenuItem;", "", "iterator", "()Ljava/util/Iterator;", "core-ktx"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Sequence<MenuItem> {
        final /* synthetic */ Menu a;

        a(Menu menu) {
            this.a = menu;
        }

        public Iterator<MenuItem> iterator() {
            return rq7.b(this.a);
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u000e"}, d2 = {"com/google/android/rq7$b", "", "Landroid/view/MenuItem;", "", "hasNext", "()Z", "a", "()Landroid/view/MenuItem;", "", "remove", "()V", "", "I", "index", "core-ktx"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Iterator<MenuItem>, fh6 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private int index;
        final /* synthetic */ Menu b;

        b(Menu menu) {
            this.b = menu;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MenuItem next() {
            Menu menu = this.b;
            int i = this.index;
            this.index = i + 1;
            MenuItem item = menu.getItem(i);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.b.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            Menu menu = this.b;
            int i = this.index - 1;
            this.index = i;
            MenuItem item = menu.getItem(i);
            if (item == null) {
                throw new IndexOutOfBoundsException();
            }
            menu.removeItem(item.getItemId());
        }
    }

    public static final Sequence<MenuItem> a(Menu menu) {
        return new a(menu);
    }

    public static final Iterator<MenuItem> b(Menu menu) {
        return new b(menu);
    }
}
