package com.google.inputmethod;

import android.widget.ListView;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class q47 extends g80 {
    private final ListView s;

    public q47(ListView listView) {
        super(listView);
        this.s = listView;
    }

    @Override // com.google.inputmethod.g80
    public boolean a(int i) {
        return false;
    }

    @Override // com.google.inputmethod.g80
    public boolean b(int i) {
        ListView listView = this.s;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.inputmethod.g80
    public void j(int i, int i2) {
        this.s.scrollListBy(i2);
    }
}
