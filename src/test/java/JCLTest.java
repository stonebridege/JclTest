import com.stonebridge.jcl.JclTest;
import org.junit.Test;

public class JCLTest {
    @Test
    public void test01() {
        /*
        我们暂时没有导入第三方的日志框架，例如log4j
        默认的情况下，会使用JUL日志框架做日志的记录操作
        JCL使用原则：
            如果有log4j，优先使用log4j
            如果没有任何第三方日志框架的时候，我们使用的就是JUL
         */
        JclTest jclTest = new JclTest();
        jclTest.test01();
    }

    @Test
    public void test02() {
        /*
        我们暂时没有导入第三方的日志框架，例如log4j
        默认的情况下，会使用JUL日志框架做日志的记录操作
        JCL使用原则：
            如果有log4j，优先使用log4j
            如果没有任何第三方日志框架的时候，我们使用的就是JUL
         */
        JclTest jclTest = new JclTest();
        jclTest.test02();
    }
}
