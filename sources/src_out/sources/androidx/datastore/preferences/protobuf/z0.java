package androidx.datastore.preferences.protobuf;

import com.google.inputmethod.lo6;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
final class z0 {

    class a implements b {
        final /* synthetic */ ByteString a;

        a(ByteString byteString) {
            this.a = byteString;
        }

        @Override // androidx.datastore.preferences.protobuf.z0.b
        public byte a(int i) {
            return this.a.c(i);
        }

        @Override // androidx.datastore.preferences.protobuf.z0.b
        public int size() {
            return this.a.size();
        }
    }

    private interface b {
        byte a(int i);

        int size();
    }

    static String a(ByteString byteString) {
        return b(new a(byteString));
    }

    static String b(b bVar) {
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i = 0; i < bVar.size(); i++) {
            byte bA = bVar.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                        sb.append("\\t");
                        break;
                    case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                        sb.append("\\n");
                        break;
                    case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    static String c(String str) {
        return a(ByteString.j(str));
    }
}
