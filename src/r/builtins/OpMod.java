package r.builtins;

import r.data.*;
import r.nodes.*;
import r.nodes.truffle.*;

/**
 * "%%"
 *
 * <pre>
 * x, y -- numeric or complex vectors or objects which can be coerced to such, or other objects for which methods have been
 *         written.
 * </pre>
 */
final class OpMod extends OperationsBase {
    static final CallFactory _ = new OpMod("%%");

    private OpMod(String name) {
        super(name);
    }

    @Override public RNode create(ASTNode ast, RSymbol[] names, RNode[] exprs) {
        return new Arithmetic(ast, exprs[0], exprs[1], Arithmetic.MOD);
    }
}
