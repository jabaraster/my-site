import jabara.jetty_memcached.MemcachedSessionServerStarter;

/**
 * @author jabaraster
 */
public class WebStarter {

    /**
     * @param pArgs
     */
    public static void main(final String[] pArgs) {
        final MemcachedSessionServerStarter starter = new MemcachedSessionServerStarter();
        starter.setWebPort(8081);
        starter.start();
    }
}
