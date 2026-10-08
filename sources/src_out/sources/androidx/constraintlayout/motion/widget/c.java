package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.google.inputmethod.hq2;
import com.google.inputmethod.lo6;
import com.google.inputmethod.pae;
import com.google.inputmethod.v0a;
import com.google.inputmethod.y9e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class c extends androidx.constraintlayout.motion.widget.a {
    private String g = null;
    private int h = 0;
    private int i = -1;
    private String j = null;
    private float k = Float.NaN;
    private float l = 0.0f;
    private float m = 0.0f;
    private float n = Float.NaN;
    private int o = -1;
    private float p = Float.NaN;
    private float q = Float.NaN;
    private float r = Float.NaN;
    private float s = Float.NaN;
    private float t = Float.NaN;
    private float u = Float.NaN;
    private float v = Float.NaN;
    private float w = Float.NaN;
    private float x = Float.NaN;
    private float y = Float.NaN;
    private float z = Float.NaN;

    private static class a {
        private static SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(v0a.A5, 1);
            a.append(v0a.y5, 2);
            a.append(v0a.B5, 3);
            a.append(v0a.x5, 4);
            a.append(v0a.G5, 5);
            a.append(v0a.E5, 6);
            a.append(v0a.D5, 7);
            a.append(v0a.H5, 8);
            a.append(v0a.n5, 9);
            a.append(v0a.w5, 10);
            a.append(v0a.s5, 11);
            a.append(v0a.t5, 12);
            a.append(v0a.u5, 13);
            a.append(v0a.C5, 14);
            a.append(v0a.q5, 15);
            a.append(v0a.r5, 16);
            a.append(v0a.o5, 17);
            a.append(v0a.p5, 18);
            a.append(v0a.v5, 19);
            a.append(v0a.z5, 20);
            a.append(v0a.F5, 21);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(c cVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (a.get(index)) {
                    case 1:
                        if (MotionLayout.d1) {
                            int resourceId = typedArray.getResourceId(index, cVar.b);
                            cVar.b = resourceId;
                            if (resourceId == -1) {
                                cVar.c = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            cVar.c = typedArray.getString(index);
                        } else {
                            cVar.b = typedArray.getResourceId(index, cVar.b);
                        }
                        break;
                    case 2:
                        cVar.a = typedArray.getInt(index, cVar.a);
                        break;
                    case 3:
                        cVar.g = typedArray.getString(index);
                        break;
                    case 4:
                        cVar.h = typedArray.getInteger(index, cVar.h);
                        break;
                    case 5:
                        if (typedArray.peekValue(index).type == 3) {
                            cVar.j = typedArray.getString(index);
                            cVar.i = 7;
                        } else {
                            cVar.i = typedArray.getInt(index, cVar.i);
                        }
                        break;
                    case 6:
                        cVar.k = typedArray.getFloat(index, cVar.k);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type == 5) {
                            cVar.l = typedArray.getDimension(index, cVar.l);
                        } else {
                            cVar.l = typedArray.getFloat(index, cVar.l);
                        }
                        break;
                    case 8:
                        cVar.o = typedArray.getInt(index, cVar.o);
                        break;
                    case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                        cVar.p = typedArray.getFloat(index, cVar.p);
                        break;
                    case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                        cVar.q = typedArray.getDimension(index, cVar.q);
                        break;
                    case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                        cVar.r = typedArray.getFloat(index, cVar.r);
                        break;
                    case 12:
                        cVar.t = typedArray.getFloat(index, cVar.t);
                        break;
                    case 13:
                        cVar.u = typedArray.getFloat(index, cVar.u);
                        break;
                    case 14:
                        cVar.s = typedArray.getFloat(index, cVar.s);
                        break;
                    case 15:
                        cVar.v = typedArray.getFloat(index, cVar.v);
                        break;
                    case 16:
                        cVar.w = typedArray.getFloat(index, cVar.w);
                        break;
                    case 17:
                        cVar.x = typedArray.getDimension(index, cVar.x);
                        break;
                    case 18:
                        cVar.y = typedArray.getDimension(index, cVar.y);
                        break;
                    case 19:
                        cVar.z = typedArray.getDimension(index, cVar.z);
                        break;
                    case 20:
                        cVar.n = typedArray.getFloat(index, cVar.n);
                        break;
                    case 21:
                        cVar.m = typedArray.getFloat(index, cVar.m) / 360.0f;
                        break;
                    default:
                        Integer.toHexString(index);
                        a.get(index);
                        break;
                }
            }
        }
    }

    public c() {
        this.d = 4;
        this.e = new HashMap<>();
    }

    public void U(HashMap<String, y9e> map) {
        y9e y9eVar;
        y9e y9eVar2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                ConstraintAttribute constraintAttribute = this.e.get(str.substring(7));
                if (constraintAttribute != null && constraintAttribute.d() == ConstraintAttribute.AttributeType.FLOAT_TYPE && (y9eVar = map.get(str)) != null) {
                    y9eVar.d(this.a, this.i, this.j, this.o, this.k, this.l, this.m, constraintAttribute.e(), constraintAttribute);
                }
            } else {
                float fV = V(str);
                if (!Float.isNaN(fV) && (y9eVar2 = map.get(str)) != null) {
                    y9eVar2.c(this.a, this.i, this.j, this.o, this.k, this.l, this.m, fV);
                }
            }
        }
    }

    public float V(String str) {
        str.getClass();
        switch (str) {
            case "rotationX":
                return this.t;
            case "rotationY":
                return this.u;
            case "translationX":
                return this.x;
            case "translationY":
                return this.y;
            case "translationZ":
                return this.z;
            case "progress":
                return this.n;
            case "scaleX":
                return this.v;
            case "scaleY":
                return this.w;
            case "rotation":
                return this.r;
            case "elevation":
                return this.q;
            case "transitionPathRotate":
                return this.s;
            case "alpha":
                return this.p;
            case "waveOffset":
                return this.l;
            case "wavePhase":
                return this.m;
            default:
                str.startsWith("CUSTOM");
                return Float.NaN;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void a(HashMap<String, pae> map) {
        hq2.g("KeyCycle", "add " + map.size() + " values", 2);
        for (String str : map.keySet()) {
            pae paeVar = map.get(str);
            if (paeVar != null) {
                str.getClass();
                switch (str) {
                    case "rotationX":
                        paeVar.b(this.a, this.t);
                        break;
                    case "rotationY":
                        paeVar.b(this.a, this.u);
                        break;
                    case "translationX":
                        paeVar.b(this.a, this.x);
                        break;
                    case "translationY":
                        paeVar.b(this.a, this.y);
                        break;
                    case "translationZ":
                        paeVar.b(this.a, this.z);
                        break;
                    case "progress":
                        paeVar.b(this.a, this.n);
                        break;
                    case "scaleX":
                        paeVar.b(this.a, this.v);
                        break;
                    case "scaleY":
                        paeVar.b(this.a, this.w);
                        break;
                    case "rotation":
                        paeVar.b(this.a, this.r);
                        break;
                    case "elevation":
                        paeVar.b(this.a, this.q);
                        break;
                    case "transitionPathRotate":
                        paeVar.b(this.a, this.s);
                        break;
                    case "alpha":
                        paeVar.b(this.a, this.p);
                        break;
                    case "waveOffset":
                        paeVar.b(this.a, this.l);
                        break;
                    case "wavePhase":
                        paeVar.b(this.a, this.m);
                        break;
                    default:
                        str.startsWith("CUSTOM");
                        break;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.a
    /* JADX INFO: renamed from: b */
    public androidx.constraintlayout.motion.widget.a clone() {
        return new c().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public androidx.constraintlayout.motion.widget.a c(androidx.constraintlayout.motion.widget.a aVar) {
        super.c(aVar);
        c cVar = (c) aVar;
        this.g = cVar.g;
        this.h = cVar.h;
        this.i = cVar.i;
        this.j = cVar.j;
        this.k = cVar.k;
        this.l = cVar.l;
        this.m = cVar.m;
        this.n = cVar.n;
        this.o = cVar.o;
        this.p = cVar.p;
        this.q = cVar.q;
        this.r = cVar.r;
        this.s = cVar.s;
        this.t = cVar.t;
        this.u = cVar.u;
        this.v = cVar.v;
        this.w = cVar.w;
        this.x = cVar.x;
        this.y = cVar.y;
        this.z = cVar.z;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.p)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.u)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.v)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.w)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.x)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.y)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.z)) {
            hashSet.add("translationZ");
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
        a.b(this, context.obtainStyledAttributes(attributeSet, v0a.m5));
    }
}
