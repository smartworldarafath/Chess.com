package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.google.inputmethod.abe;
import com.google.inputmethod.lo6;
import com.google.inputmethod.pae;
import com.google.inputmethod.v0a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class g extends androidx.constraintlayout.motion.widget.a {
    private String g;
    private int h = -1;
    private float i = Float.NaN;
    private float j = Float.NaN;
    private float k = Float.NaN;
    private float l = Float.NaN;
    private float m = Float.NaN;
    private float n = Float.NaN;
    private float o = Float.NaN;
    private float p = Float.NaN;
    private float q = Float.NaN;
    private float r = Float.NaN;
    private float s = Float.NaN;
    private float t = Float.NaN;
    private int u = 0;
    private String v = null;
    private float w = Float.NaN;
    private float x = 0.0f;

    private static class a {
        private static SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(v0a.Z5, 1);
            a.append(v0a.i6, 2);
            a.append(v0a.e6, 4);
            a.append(v0a.f6, 5);
            a.append(v0a.g6, 6);
            a.append(v0a.c6, 7);
            a.append(v0a.o6, 8);
            a.append(v0a.n6, 9);
            a.append(v0a.m6, 10);
            a.append(v0a.k6, 12);
            a.append(v0a.j6, 13);
            a.append(v0a.d6, 14);
            a.append(v0a.a6, 15);
            a.append(v0a.b6, 16);
            a.append(v0a.h6, 17);
            a.append(v0a.l6, 18);
            a.append(v0a.q6, 20);
            a.append(v0a.p6, 21);
            a.append(v0a.r6, 19);
        }

        public static void a(g gVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (a.get(index)) {
                    case 1:
                        gVar.i = typedArray.getFloat(index, gVar.i);
                        break;
                    case 2:
                        gVar.j = typedArray.getDimension(index, gVar.j);
                        break;
                    case 3:
                    case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    default:
                        Integer.toHexString(index);
                        a.get(index);
                        break;
                    case 4:
                        gVar.k = typedArray.getFloat(index, gVar.k);
                        break;
                    case 5:
                        gVar.l = typedArray.getFloat(index, gVar.l);
                        break;
                    case 6:
                        gVar.m = typedArray.getFloat(index, gVar.m);
                        break;
                    case 7:
                        gVar.o = typedArray.getFloat(index, gVar.o);
                        break;
                    case 8:
                        gVar.n = typedArray.getFloat(index, gVar.n);
                        break;
                    case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                        gVar.g = typedArray.getString(index);
                        break;
                    case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                        if (MotionLayout.d1) {
                            int resourceId = typedArray.getResourceId(index, gVar.b);
                            gVar.b = resourceId;
                            if (resourceId == -1) {
                                gVar.c = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            gVar.c = typedArray.getString(index);
                        } else {
                            gVar.b = typedArray.getResourceId(index, gVar.b);
                        }
                        break;
                    case 12:
                        gVar.a = typedArray.getInt(index, gVar.a);
                        break;
                    case 13:
                        gVar.h = typedArray.getInteger(index, gVar.h);
                        break;
                    case 14:
                        gVar.p = typedArray.getFloat(index, gVar.p);
                        break;
                    case 15:
                        gVar.q = typedArray.getDimension(index, gVar.q);
                        break;
                    case 16:
                        gVar.r = typedArray.getDimension(index, gVar.r);
                        break;
                    case 17:
                        gVar.s = typedArray.getDimension(index, gVar.s);
                        break;
                    case 18:
                        gVar.t = typedArray.getFloat(index, gVar.t);
                        break;
                    case 19:
                        if (typedArray.peekValue(index).type == 3) {
                            gVar.v = typedArray.getString(index);
                            gVar.u = 7;
                        } else {
                            gVar.u = typedArray.getInt(index, gVar.u);
                        }
                        break;
                    case 20:
                        gVar.w = typedArray.getFloat(index, gVar.w);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type == 5) {
                            gVar.x = typedArray.getDimension(index, gVar.x);
                        } else {
                            gVar.x = typedArray.getFloat(index, gVar.x);
                        }
                        break;
                }
            }
        }
    }

    public g() {
        this.d = 3;
        this.e = new HashMap<>();
    }

    public void Q(HashMap<String, abe> map) {
        for (String str : map.keySet()) {
            abe abeVar = map.get(str);
            if (abeVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.l)) {
                                break;
                            } else {
                                abeVar.b(this.a, this.l, this.w, this.u, this.x);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.m)) {
                                break;
                            } else {
                                abeVar.b(this.a, this.m, this.w, this.u, this.x);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.q)) {
                                break;
                            } else {
                                abeVar.b(this.a, this.q, this.w, this.u, this.x);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.r)) {
                                break;
                            } else {
                                abeVar.b(this.a, this.r, this.w, this.u, this.x);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.s)) {
                                break;
                            } else {
                                abeVar.b(this.a, this.s, this.w, this.u, this.x);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.t)) {
                                break;
                            } else {
                                abeVar.b(this.a, this.t, this.w, this.u, this.x);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.o)) {
                                break;
                            } else {
                                abeVar.b(this.a, this.o, this.w, this.u, this.x);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.p)) {
                                break;
                            } else {
                                abeVar.b(this.a, this.p, this.w, this.u, this.x);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.k)) {
                                break;
                            } else {
                                abeVar.b(this.a, this.k, this.w, this.u, this.x);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.j)) {
                                break;
                            } else {
                                abeVar.b(this.a, this.j, this.w, this.u, this.x);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.n)) {
                                break;
                            } else {
                                abeVar.b(this.a, this.n, this.w, this.u, this.x);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.i)) {
                                break;
                            } else {
                                abeVar.b(this.a, this.i, this.w, this.u, this.x);
                                break;
                            }
                            break;
                    }
                } else {
                    ConstraintAttribute constraintAttribute = this.e.get(str.substring(7));
                    if (constraintAttribute != null) {
                        ((abe.b) abeVar).j(this.a, constraintAttribute, this.w, this.u, this.x);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void a(HashMap<String, pae> map) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // androidx.constraintlayout.motion.widget.a
    /* JADX INFO: renamed from: b */
    public androidx.constraintlayout.motion.widget.a clone() {
        return new g().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public androidx.constraintlayout.motion.widget.a c(androidx.constraintlayout.motion.widget.a aVar) {
        super.c(aVar);
        g gVar = (g) aVar;
        this.g = gVar.g;
        this.h = gVar.h;
        this.u = gVar.u;
        this.w = gVar.w;
        this.x = gVar.x;
        this.t = gVar.t;
        this.i = gVar.i;
        this.j = gVar.j;
        this.k = gVar.k;
        this.n = gVar.n;
        this.l = gVar.l;
        this.m = gVar.m;
        this.o = gVar.o;
        this.p = gVar.p;
        this.q = gVar.q;
        this.r = gVar.r;
        this.s = gVar.s;
        this.v = gVar.v;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.i)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.j)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.k)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add("progress");
        }
        if (this.e.size() > 0) {
            Iterator<String> it = this.e.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void e(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, v0a.Y5));
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void g(HashMap<String, Integer> map) {
        if (this.h == -1) {
            return;
        }
        if (!Float.isNaN(this.i)) {
            map.put("alpha", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.j)) {
            map.put("elevation", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.k)) {
            map.put("rotation", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.l)) {
            map.put("rotationX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.m)) {
            map.put("rotationY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.q)) {
            map.put("translationX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.r)) {
            map.put("translationY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.s)) {
            map.put("translationZ", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.n)) {
            map.put("transitionPathRotate", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.o)) {
            map.put("scaleX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.o)) {
            map.put("scaleY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.t)) {
            map.put("progress", Integer.valueOf(this.h));
        }
        if (this.e.size() > 0) {
            Iterator<String> it = this.e.keySet().iterator();
            while (it.hasNext()) {
                map.put("CUSTOM," + it.next(), Integer.valueOf(this.h));
            }
        }
    }
}
