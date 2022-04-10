package br.com.tony.designpattern.creational.factory;

public class IPhoneSimpleFactory implements IPhoneFactory {

    @Override
    public IPhone createIPhone(String iphoneModel) {
        switch (iphoneModel) {
            case "X":
                return new IPhone11("IPhone X");
            case "11":
                return new IPhone11("IPhone 11");
            default:
                throw new IllegalArgumentException("Model invalid");
        }
    }
}
