package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.google.inputmethod.lo6;
import com.google.inputmethod.pae;
import com.google.inputmethod.v0a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class b extends androidx.constraintlayout.motion.widget.a {
    private String g;
    private int h = -1;
    private boolean i = false;
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
    private float u = Float.NaN;
    private float v = Float.NaN;
    private float w = Float.NaN;

    private static class a {
        private static SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(v0a.U4, 1);
            a.append(v0a.f5, 2);
            a.append(v0a.b5, 4);
            a.append(v0a.c5, 5);
            a.append(v0a.d5, 6);
            a.append(v0a.V4, 19);
            a.append(v0a.W4, 20);
            a.append(v0a.Z4, 7);
            a.append(v0a.l5, 8);
            a.append(v0a.k5, 9);
            a.append(v0a.j5, 10);
            a.append(v0a.h5, 12);
            a.append(v0a.g5, 13);
            a.append(v0a.a5, 14);
            a.append(v0a.X4, 15);
            a.append(v0a.Y4, 16);
            a.append(v0a.e5, 17);
            a.append(v0a.i5, 18);
        }

        public static void a(b bVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (a.get(index)) {
                    case 1:
                        bVar.j = typedArray.getFloat(index, bVar.j);
                        break;
                    case 2:
                        bVar.k = typedArray.getDimension(index, bVar.k);
                        break;
                    case 3:
                    case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    default:
                        Integer.toHexString(index);
                        a.get(index);
                        break;
                    case 4:
                        bVar.l = typedArray.getFloat(index, bVar.l);
                        break;
                    case 5:
                        bVar.m = typedArray.getFloat(index, bVar.m);
                        break;
                    case 6:
                        bVar.n = typedArray.getFloat(index, bVar.n);
                        break;
                    case 7:
                        bVar.r = typedArray.getFloat(index, bVar.r);
                        break;
                    case 8:
                        bVar.q = typedArray.getFloat(index, bVar.q);
                        break;
                    case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                        bVar.g = typedArray.getString(index);
                        break;
                    case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                        if (MotionLayout.d1) {
                            int resourceId = typedArray.getResourceId(index, bVar.b);
                            bVar.b = resourceId;
                            if (resourceId == -1) {
                                bVar.c = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            bVar.c = typedArray.getString(index);
                        } else {
                            bVar.b = typedArray.getResourceId(index, bVar.b);
                        }
                        break;
                    case 12:
                        bVar.a = typedArray.getInt(index, bVar.a);
                        break;
                    case 13:
                        bVar.h = typedArray.getInteger(index, bVar.h);
                        break;
                    case 14:
                        bVar.s = typedArray.getFloat(index, bVar.s);
                        break;
                    case 15:
                        bVar.t = typedArray.getDimension(index, bVar.t);
                        break;
                    case 16:
                        bVar.u = typedArray.getDimension(index, bVar.u);
                        break;
                    case 17:
                        bVar.v = typedArray.getDimension(index, bVar.v);
                        break;
                    case 18:
                        bVar.w = typedArray.getFloat(index, bVar.w);
                        break;
                    case 19:
                        bVar.o = typedArray.getDimension(index, bVar.o);
                        break;
                    case 20:
                        bVar.p = typedArray.getDimension(index, bVar.p);
                        break;
                }
            }
        }
    }

    public b() {
        this.d = 1;
        this.e = new HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void a(HashMap<String, pae> map) {
        for (String str : map.keySet()) {
            pae paeVar = map.get(str);
            if (paeVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.m)) {
                                break;
                            } else {
                                paeVar.b(this.a, this.m);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.n)) {
                                break;
                            } else {
                                paeVar.b(this.a, this.n);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.t)) {
                                break;
                            } else {
                                paeVar.b(this.a, this.t);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.u)) {
                                break;
                            } else {
                                paeVar.b(this.a, this.u);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.v)) {
                                break;
                            } else {
                                paeVar.b(this.a, this.v);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.w)) {
                                break;
                            } else {
                                paeVar.b(this.a, this.w);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.r)) {
                                break;
                            } else {
                                paeVar.b(this.a, this.r);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.s)) {
                                break;
                            } else {
                                paeVar.b(this.a, this.s);
                                break;
                            }
                            break;
                        case "transformPivotX":
                            if (Float.isNaN(this.m)) {
                                break;
                            } else {
                                paeVar.b(this.a, this.o);
                                break;
                            }
                            break;
                        case "transformPivotY":
                            if (Float.isNaN(this.n)) {
                                break;
                            } else {
                                paeVar.b(this.a, this.p);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.l)) {
                                break;
                            } else {
                                paeVar.b(this.a, this.l);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.k)) {
                                break;
                            } else {
                                paeVar.b(this.a, this.k);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.q)) {
                                break;
                            } else {
                                paeVar.b(this.a, this.q);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.j)) {
                                break;
                            } else {
                                paeVar.b(this.a, this.j);
                                break;
                            }
                            break;
                    }
                } else {
                    ConstraintAttribute constraintAttribute = this.e.get(str.substring(7));
                    if (constraintAttribute != null) {
                        ((pae.b) paeVar).h(this.a, constraintAttribute);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.a
    /* JADX INFO: renamed from: b */
    public androidx.constraintlayout.motion.widget.a clone() {
        return new b().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public androidx.constraintlayout.motion.widget.a c(androidx.constraintlayout.motion.widget.a aVar) {
        super.c(aVar);
        b bVar = (b) aVar;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
        this.m = bVar.m;
        this.n = bVar.n;
        this.o = bVar.o;
        this.p = bVar.p;
        this.q = bVar.q;
        this.r = bVar.r;
        this.s = bVar.s;
        this.t = bVar.t;
        this.u = bVar.u;
        this.v = bVar.v;
        this.w = bVar.w;
        this.g = bVar.g;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.j)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.k)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.u)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.v)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.w)) {
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
        a.a(this, context.obtainStyledAttributes(attributeSet, v0a.T4));
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void g(HashMap<String, Integer> map) {
        if (this.h == -1) {
            return;
        }
        if (!Float.isNaN(this.j)) {
            map.put("alpha", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.k)) {
            map.put("elevation", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.l)) {
            map.put("rotation", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.m)) {
            map.put("rotationX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.n)) {
            map.put("rotationY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.o)) {
            map.put("transformPivotX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.p)) {
            map.put("transformPivotY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.t)) {
            map.put("translationX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.u)) {
            map.put("translationY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.v)) {
            map.put("translationZ", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.q)) {
            map.put("transitionPathRotate", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.r)) {
            map.put("scaleX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.s)) {
            map.put("scaleY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.w)) {
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
