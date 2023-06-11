package facade;

public class Main {
    public static void main(String[] args) {
        Power power = new Power();
        DvdRom dvdRom = new DvdRom();
        DvdDecoder dvdDecoder = new DvdDecoder();

        power.on();
        dvdRom.open();
        dvdRom.close();
        dvdDecoder.copy();
        power.off();
ComputerFacade computerFacade=new ComputerFacade();
computerFacade.copyFromDVDtoComputer();

computerFacade.power.on();
    }
}
