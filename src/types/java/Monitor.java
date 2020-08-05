package types.java;

/*
* This code was taken from twitter  java group
* posted by Oracle Developers
* */
public class Monitor {
    String model;
    double price;

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Monitor && model.equals(((Monitor) obj).model) &&
                price == ((Monitor) obj).price;
    }
}
