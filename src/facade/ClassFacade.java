package facade;


/**
 * Created by fengyuwusong on 2017/11/7 16:45.
 */
public class ClassFacade implements AbstractClassFacade {
    private Computer computer;
    private BlackboardLights lights;
    private Mike mike;
    private Projector projector;
    private Screen screen;

    public ClassFacade() {
        this.computer = new Computer();
        this.lights = new BlackboardLights();
        this.mike = new Mike();
        this.projector = new Projector();
        this.screen = new Screen();
    }

    @Override
    public void start() {
        computer.start();
        lights.start();
        mike.start();
        projector.start();
        screen.start();
    }

    @Override
    public void end() {
        computer.stop();
        lights.stop();
        mike.stop();
        projector.stop();
        screen.stop();
    }
}
