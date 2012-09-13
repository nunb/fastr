package r.data;

import r.data.internal.*;


public interface RLogical extends RArray {
    String TYPE_STRING = "logical";
    int TRUE = 1;
    int FALSE = 0;
    int NA = Integer.MIN_VALUE;
    RLogical BOXED_TRUE = RLogicalFactory.getArray(TRUE);
    RLogical BOXED_FALSE = RLogicalFactory.getArray(FALSE);
    RLogical BOXED_NA = RLogicalFactory.getArray(NA);
    RLogical EMPTY = RLogicalFactory.getUninitializedArray(0);

    int getLogical(int il);
    RLogical set(int i, int val);

    public class RLogicalFactory {
        public static RLogical getArray(int... values) {
            return new LogicalImpl(values);
        }

        public static RLogical getUninitializedArray(int size) {
            return new LogicalImpl(size);
        }

        public static RLogical getNAArray(int size) {
            RLogical l = getUninitializedArray(size);
            for(int i = 0; i < size ; i++) {
                l.set(i, NA);
            }
            return l;
        }

        public static RLogical copy(RLogical l) {
            return new LogicalImpl(l);
        }
    }
}
