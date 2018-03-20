package io.oisin.dublinguide;

/**
 * Created by Oisin Quinn (@oisin1001) on 20/03/2018.
 */

/* This could store: name, location, image, description
 */

public class Location {
    private String name;
    private String address;
    private int imageID;

    /* */
    Location(String name, String address, int image) {
        this.name = name;
        this.address = address;
        this.imageID = image;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getImageID() {
        return imageID;
    }
    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", imageID=" + imageID +
                '}';
    }
}
