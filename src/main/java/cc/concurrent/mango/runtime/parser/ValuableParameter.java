package cc.concurrent.mango.runtime.parser;

import cc.concurrent.mango.runtime.RuntimeContext;

/**
 * @author ash
 */
public abstract class ValuableParameter extends ValuableNode {

    protected String parameterName;
    protected String propertyPath; // 为""的时候表示没有属性
    protected String fullName;

    public ValuableParameter(int i) {
        super(i);
    }

    public ValuableParameter(Parser p, int i) {
        super(p, i);
    }

    @Override
    public Object value(RuntimeContext context) {
        return context.getNullablePropertyValue(parameterName, propertyPath);
    }

    @Override
    Token getFirstToken() {
        return jjtGetFirstToken();
    }

    @Override
    Token getLastToken() {
        return jjtGetLastToken();
    }

}
