package com.mycompany.part05_04comparingapartments;

public class Apartments {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartments() {
    }

    public Apartments(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getSquares() {
        return squares;
    }

    public void setSquares(int squares) {
        this.squares = squares;
    }

    public int getPricePerSquare() {
        return pricePerSquare;
    }

    public void setPricePerSquare(int pricePerSquare) {
        this.pricePerSquare = pricePerSquare;
    }

    @Override
    public String toString() {
        return "Apartments{" + "rooms=" + rooms + ", squares=" + squares + ", pricePerSquare=" + pricePerSquare + '}';
    }

    public boolean largerThan(Apartments flat2) {
        if (this.squares > flat2.squares) {
            return true;

        } else {
            return false;
        }
    }

    public int priceDifference(Apartments flat2) {
        int priceDif = (this.pricePerSquare * this.squares) - (flat2.pricePerSquare * flat2.squares);
        return priceDif;
    }
}
