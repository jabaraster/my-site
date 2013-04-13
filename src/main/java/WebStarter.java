import jabara.jetty.ServerStarter;

/**
 * @author jabaraster
 */
public class WebStarter {

    /**
     * @param pArgs
     */
    public static void main(final String[] pArgs) {
        final ServerStarter starter = new ServerStarter();
        starter.setWebPort(8081);
        starter.start();
    }
}
