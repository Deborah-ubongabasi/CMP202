public class computer implements electronic {

    RAM ram;

    proccessor cpu;

    storage storage;

    public computer(RAM ram,proccessor cpu,storage storage){
        this.ram = ram;
        this.cpu = cpu;
        this.storage = storage;
    }

    @Override
    public boolean on() {
        return true;
    }

    @Override
    public boolean off() {
        return false;
    }
   //String dataStructure = "collection of data that follows a specific sets of rules";
}
