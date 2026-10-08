package com.google.inputmethod;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class aoc implements Iterable<Intent> {
    private final ArrayList<Intent> a = new ArrayList<>();
    private final Context b;

    public interface a {
        Intent getSupportParentActivityIntent();
    }

    private aoc(Context context) {
        this.b = context;
    }

    public static aoc f(Context context) {
        return new aoc(context);
    }

    public aoc b(Intent intent) {
        this.a.add(intent);
        return this;
    }

    public aoc c(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.b.getPackageManager());
        }
        if (component != null) {
            e(component);
        }
        b(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public aoc d(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = dd8.a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.b.getPackageManager());
            }
            e(component);
            b(supportParentActivityIntent);
        }
        return this;
    }

    public aoc e(ComponentName componentName) {
        int size = this.a.size();
        try {
            Intent intentB = dd8.b(this.b, componentName);
            while (intentB != null) {
                this.a.add(size, intentB);
                intentB = dd8.b(this.b, intentB.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Intent i(int i) {
        return this.a.get(i);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.a.iterator();
    }

    public int j() {
        return this.a.size();
    }

    public void n() {
        o(null);
    }

    public void o(Bundle bundle) {
        if (this.a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (s02.n(this.b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.b.startActivity(intent);
    }
}
