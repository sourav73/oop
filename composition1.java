//Main class
public class Composition1 {
    public static void main(String[] args) {
        Case theCase = new Case("Antech","Nx 200",
                new Dimension(20,30),"450 watt");
        Motherboard motherboard = new Motherboard("H67","Asus",4,2);
        Monitor monitor = new Monitor("Lg","22F",
                new Resolution(1920,1080),2);
        Processor processor = new Processor("Intel","i5 3470");
        PC pc = new PC(theCase,motherboard,monitor,processor);
        System.out.println("Your pc has:\n"+theCase.getManufacturer()+" "+theCase.getModel()+" casing\n"+
                theCase.getPowerSupply()+" power supply");
        System.out.println(motherboard.getManufacturer()+" "+motherboard.getModel()+" motherboard");
        System.out.println(processor.getManufacturer()+" "+processor.getModel()+" processor");
        System.out.println("8 gb ram\n1tb hdd");
        System.out.println(monitor.getManufacturer()+" "+monitor.getModel()+" monitor");
        System.out.println();
        pc.getTheCase().pressPowerButton(true);
        System.out.println("Your system is starting");
        pc.getMotherboard().loadingProgram("Windows 10");
    }
}

//Pc Class

class PC{
    private Case theCase;
    private Motherboard motherboard;
    private Monitor monitor;
    private Processor processor;

    public PC(Case theCase, Motherboard motherboard, Monitor monitor,Processor processor) {
        this.theCase = theCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
        this.processor = processor;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Processor getProcessor() {
        return processor;
    }
}

//Motherboard class

class Motherboard{
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int gpuSlots;

    public Motherboard(String model,String manufacturer,int ramSlots,int gpuSlots){
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.gpuSlots = gpuSlots;
    }

    public void loadingProgram(String program){
        System.out.println(program + " is loading");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getGpuSlots() {
        return gpuSlots;
    }
}

//Processor class

class Processor{
    private String manufacturer;
    private String model;

    public Processor(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }
}

//Monitor class

class Monitor{
    private String manufacturer;
    private String model;
    private Resolution resolution;
    private int displayPort;

    public Monitor(String manufacturer, String model, Resolution resolution, int displayPort) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.resolution = resolution;
        this.displayPort = displayPort;
    }

    public void drawPixelAt(int x,int y,String color){
        System.out.println("Pixel drawn at: "+x+","+y+" in"+color+" color");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public int getDisplayPort() {
        return displayPort;
    }
}

//Resolution class

class Resolution{
    private int height;
    private int width;

    public Resolution(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}

//Case class

class Case{
    private String manufacturer;
    private String model;
    private Dimension dimension;
    private String powerSupply;

    public Case(String manufacturer, String model, Dimension dimension, String powerSupply) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.dimension = dimension;
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton(boolean buttonPress){
        if(buttonPress==true)
        System.out.println("Power button pressed");
        else
            System.out.println("Power button not pressed");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public String getPowerSupply() {
        return powerSupply;
    }
}

//Dimension class

class Dimension{
    private int height;
    private int width;

    public Dimension(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
