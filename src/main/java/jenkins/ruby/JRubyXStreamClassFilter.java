package jenkins.ruby;

import hudson.Extension;
import jenkins.security.CustomClassFilter;
import org.jenkinsci.jruby.JRubyMapper;
import org.jenkinsci.jruby.JRubyXStream;
import org.jenkinsci.jruby.JavaProxyConverter;
import org.jruby.RubyArray;
import org.jruby.RubyBignum;
import org.jruby.RubyBoolean;
import org.jruby.RubyFixnum;
import org.jruby.RubyHash;
import org.jruby.RubyNil;
import org.jruby.RubyObject;
import org.jruby.RubyString;
import org.jruby.RubySymbol;
import org.jruby.java.proxies.ConcreteJavaProxy;
import org.jruby.javasupport.proxy.InternalJavaProxy;
import org.jruby.runtime.builtin.IRubyObject;

/**
 * See JEP-200.
 * @see JRubyXStream
 * @see JavaProxyConverter
 */
@Extension
public class JRubyXStreamClassFilter implements CustomClassFilter {

    @Override
    public Boolean permits(Class<?> c) {
        return InternalJavaProxy.class.isAssignableFrom(c) ||
            c == RubyArray.class ||
            c == RubyBignum.class ||
            RubyBoolean.class.isAssignableFrom(c) ||
            c == RubyFixnum.class ||
            c == RubyHash.class ||
            c == RubyNil.class ||
            c == RubyObject.class ||
            c == RubyString.class ||
            c == RubySymbol.class ||
            c == IRubyObject.class ||
            c == JRubyMapper.DynamicProxy.class ||
            c == ConcreteJavaProxy.class ?
                true : null;
    }

}
